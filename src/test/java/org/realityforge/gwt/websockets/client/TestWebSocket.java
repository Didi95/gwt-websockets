package org.realityforge.gwt.websockets.client;

import com.google.gwt.typedarrays.shared.ArrayBuffer;
import com.google.gwt.typedarrays.shared.ArrayBufferView;



public final class TestWebSocket
  extends WebSocket
{
  public static class Factory
    implements WebSocket.Factory
  {
    @Override
    public WebSocket newWebSocket()
    {
      return new TestWebSocket();
    }
  }

  @Override
  public void connect( final String server, final String... protocols )
  {
  }

  @Override
  public void close()
  {
  }

  @Override
  public boolean isConnected()
  {
    return false;
  }

  @Override
  public void send( final String data )
  {
  }

  @Override
  public int getBufferedAmount()
  {
    return 0;
  }

  @Override
  public ReadyState getReadyState()
  {
    return null;
  }

  @Override
  public void close( final short code, final String reason )
  {
  }

  @Override
  public void send( final ArrayBuffer data )
  {
  }

  @Override
  public void send( final ArrayBufferView data )
  {
  }

  @Override
  public String getProtocol()
  {
    return null;
  }

  @Override
  public String getURL()
  {
    return null;
  }

  @Override
  public String getExtensions()
  {
    return null;
  }

  @Override
  public void setBinaryType( final BinaryType binaryType )
  {
  }

  @Override
  public BinaryType getBinaryType()
  {
    return null;
  }
}
