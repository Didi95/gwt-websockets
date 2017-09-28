package org.realityforge.gwt.websockets.client.event;

import com.google.gwt.typedarrays.shared.ArrayBuffer;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.SimpleEventBus;


import org.realityforge.gwt.websockets.client.WebSocket;
import org.realityforge.gwt.websockets.client.WebSocketListener;

/**
 * An event based web socket listener.
 */
public class EventBasedWebSocketListener
  implements WebSocketListener
{
  
  private final EventBus _eventBus;

  /**
   * Construct the listener using a SimpleEventBus.
   */
  public EventBasedWebSocketListener()
  {
    this( new SimpleEventBus() );
  }

  /**
   * Construct the listener using specified EventBus.
   *
   * @param eventBus the event bus.
   */
  public EventBasedWebSocketListener( final EventBus eventBus )
  {
    _eventBus = eventBus;
  }

  /**
   * Add listener for open events.
   *
   * @param handler the event handler.
   * @return the HandlerRegistration that manages the listener.
   */
  
  public final HandlerRegistration addOpenHandler( final OpenEvent.Handler handler )
  {
    return _eventBus.addHandler( OpenEvent.getType(), handler );
  }

  /**
   * Add listener for close events.
   *
   * @param handler the event handler.
   * @return the HandlerRegistration that manages the listener.
   */
  
  public final HandlerRegistration addCloseHandler( final CloseEvent.Handler handler )
  {
    return _eventBus.addHandler( CloseEvent.getType(), handler );
  }

  /**
   * Add listener for message events.
   *
   * @param handler the event handler.
   * @return the HandlerRegistration that manages the listener.
   */
  
  public final HandlerRegistration addMessageHandler( final MessageEvent.Handler handler )
  {
    return _eventBus.addHandler( MessageEvent.getType(), handler );
  }

  /**
   * Add listener for error events.
   *
   * @param handler the event handler.
   * @return the HandlerRegistration that manages the listener.
   */
  
  public final HandlerRegistration addErrorHandler( final ErrorEvent.Handler handler )
  {
    return _eventBus.addHandler( ErrorEvent.getType(), handler );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void onOpen( final WebSocket webSocket )
  {
    _eventBus.fireEventFromSource( new OpenEvent( webSocket ), webSocket );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void onClose( final WebSocket webSocket,
                             final boolean wasClean,
                             final int code,
                             final String reason )
  {
    _eventBus.fireEventFromSource( new CloseEvent( webSocket, wasClean, code, reason ), webSocket );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void onMessage( final WebSocket webSocket, final String data )
  {
    _eventBus.fireEventFromSource( new MessageEvent( webSocket, data ), webSocket );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void onMessage( final WebSocket webSocket, final ArrayBuffer data )
  {
    _eventBus.fireEventFromSource( new MessageEvent( webSocket, data ), webSocket );
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public final void onError( final WebSocket webSocket )
  {
    _eventBus.fireEventFromSource( new ErrorEvent( webSocket ), webSocket );
  }
}
