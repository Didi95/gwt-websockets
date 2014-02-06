package org.realityforge.gwt.websockets.client;

import com.google.gwt.typedarrays.shared.ArrayBuffer;
import com.google.gwt.typedarrays.shared.ArrayBufferView;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

final class TestWebSocket
  extends WebSocket
{
  static class Factory
    implements WebSocket.Factory
  {
    @Override
    public WebSocket newWebSocket()
    {
      return new TestWebSocket( new SimpleEventBus() );
    }
  }

  TestWebSocket( final EventBus eventBus )
  {
    super( eventBus );
  }

  @Override
  public void connect( @Nonnull final String server, @Nonnull final String... protocols )
  {
  }

  @Override
  public void close()
  {
  }

  @Override
  public void send( @Nonnull final String data )
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
  public void close( final short code, @Nullable final String reason )
  {

  }

  @Override
  public void send( @Nonnull final ArrayBuffer data )
  {

  }

  @Override
  public void send( @Nonnull final ArrayBufferView data )
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
  public void setBinaryType( @Nonnull final BinaryType binaryType )
  {

  }

  @Override
  public BinaryType getBinaryType()
  {
    return null;
  }
}
