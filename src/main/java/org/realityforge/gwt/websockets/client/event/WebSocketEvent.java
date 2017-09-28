package org.realityforge.gwt.websockets.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import org.realityforge.gwt.websockets.client.WebSocket;

/**
 * Base class of all events originating from web socket.
 */
public abstract class WebSocketEvent<H extends EventHandler>
  extends GwtEvent<H>
{
  private final WebSocket _webSocket;

  protected WebSocketEvent( final WebSocket webSocket )
  {
    _webSocket = webSocket;
  }

  
  public final WebSocket getWebSocket()
  {
    return _webSocket;
  }
}
