package org.realityforge.gwt.websockets.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.typedarrays.shared.ArrayBuffer;

import org.realityforge.gwt.websockets.client.WebSocket;

public class MessageEvent
  extends WebSocketEvent<MessageEvent.Handler>
{
  public interface Handler
    extends EventHandler
  {
    void onMessageEvent( MessageEvent event );
  }

  public enum DataType
  {
    TEXT, ARRAY_BUFFER
  }

  private static final Type<Handler> TYPE = new Type<Handler>();

  public static Type<Handler> getType()
  {
    return TYPE;
  }

  private final DataType _dataType;
  private final String _data;
  private final ArrayBuffer _arrayBuffer;

  public MessageEvent( final WebSocket webSocket, final String data )
  {
    super( webSocket );
    _dataType = DataType.TEXT;
    _data = data;
    _arrayBuffer = null;
  }

  public MessageEvent( final WebSocket webSocket, final ArrayBuffer arrayBuffer )
  {
    super( webSocket );
    _dataType = DataType.ARRAY_BUFFER;
    _data = null;
    _arrayBuffer = arrayBuffer;
  }

  public DataType getDataType()
  {
    return _dataType;
  }

  /**
   * @deprecated Use getTextData() instead.
   */
  
  @Deprecated
  public String getData()
  {
    return getTextData();
  }

  
  public String getTextData()
  {
    if( DataType.TEXT != _dataType )
    {
      throw new IllegalStateException( "Invoked getTextData() when data type is " + _dataType.name() );
    }
    return _data;
  }

  
  public ArrayBuffer getArrayBufferData()
  {
    if( DataType.ARRAY_BUFFER != _dataType )
    {
      throw new IllegalStateException( "Invoked getArrayBufferData() when data type is " + _dataType.name() );
    }
    return _arrayBuffer;
  }

  @Override
  public Type<Handler> getAssociatedType()
  {
    return MessageEvent.getType();
  }

  @Override
  protected void dispatch( final Handler handler )
  {
    handler.onMessageEvent( this );
  }
}
