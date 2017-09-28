package org.realityforge.gwt.websockets.client.event;

import com.google.gwt.event.shared.EventHandler;
import org.realityforge.gwt.websockets.client.WebSocket;

/**
 * Event fired when there is an error with the web socket.
 */
public class ErrorEvent
  extends WebSocketEvent<ErrorEvent.Handler>
{
  public interface Handler
    extends EventHandler
  {
    void onErrorEvent( ErrorEvent event );
  }

  private static final Type<Handler> TYPE = new Type<Handler>();

  public static Type<Handler> getType()
  {
    return TYPE;
  }

  public ErrorEvent( final WebSocket webSocket )
  {
    super( webSocket );
  }

  @Override
  public Type<Handler> getAssociatedType()
  {
    return ErrorEvent.getType();
  }

  @Override
  protected void dispatch( final Handler handler )
  {
    handler.onErrorEvent( this );
  }
}
