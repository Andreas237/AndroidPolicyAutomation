// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.games;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.*;
import com.google.android.gms.internal.cast.zzbl;
import com.google.android.gms.internal.cast.zzcm;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//			GameManagerState

public final class GameManagerClient
{
	public static interface GameManagerInstanceResult
		extends Result
	{

		public abstract GameManagerClient getGameManagerClient();
	}

	public static interface GameManagerResult
		extends Result
	{

		public abstract JSONObject getExtraMessageData();

		public abstract String getPlayerId();

		public abstract long getRequestId();
	}

	public static interface Listener
	{

		public abstract void onGameMessageReceived(String s, JSONObject jsonobject);

		public abstract void onStateChanged(GameManagerState gamemanagerstate, GameManagerState gamemanagerstate1);
	}


	private GameManagerClient(zzbl zzbl1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		zzst = zzbl1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field zzbl zzst>
	//    5    9:return          
	}

	public static PendingResult getInstanceFor(GoogleApiClient googleapiclient, String s)
		throws IllegalArgumentException
	{
		googleapiclient = ((GoogleApiClient) (new zzbl(googleapiclient, s, Cast.CastApi)));
	//    0    0:new             #59  <Class zzbl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #65  <Field com.google.android.gms.cast.Cast$CastApi Cast.CastApi>
	//    5    9:invokespecial   #68  <Method void zzbl(GoogleApiClient, String, com.google.android.gms.cast.Cast$CastApi)>
	//    6   12:astore_0        
		return ((zzbl) (googleapiclient)).zza(new GameManagerClient(((zzbl) (googleapiclient))));
	//    7   13:aload_0         
	//    8   14:new             #2   <Class GameManagerClient>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #70  <Method void GameManagerClient(zzbl)>
	//   12   22:invokevirtual   #74  <Method PendingResult zzbl.zza(GameManagerClient)>
	//   13   25:areturn         
	}

	private final PendingResult zza(String s, int i, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zzst.zza(s, i, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #82  <Method PendingResult zzbl.zza(String, int, JSONObject)>
	//    6   10:areturn         
	}

	public final void dispose()
	{
		zzst.dispose();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:invokevirtual   #86  <Method void zzbl.dispose()>
	//    3    7:return          
	}

	public final GameManagerState getCurrentState()
		throws IllegalStateException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		GameManagerState gamemanagerstate = zzst.getCurrentState();
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field zzbl zzst>
	//    4    6:invokevirtual   #90  <Method GameManagerState zzbl.getCurrentState()>
	//    5    9:astore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return gamemanagerstate;
	//    8   12:aload_1         
	//    9   13:areturn         
		Exception exception;
		exception;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public final String getLastUsedPlayerId()
		throws IllegalStateException
	{
		return zzst.getLastUsedPlayerId();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:invokevirtual   #94  <Method String zzbl.getLastUsedPlayerId()>
	//    3    7:areturn         
	}

	public final boolean isDisposed()
	{
		return zzst.isDisposed();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:invokevirtual   #98  <Method boolean zzbl.isDisposed()>
	//    3    7:ireturn         
	}

	public final void sendGameMessage(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		zzst.sendGameMessage(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #102 <Method void zzbl.sendGameMessage(String, JSONObject)>
	//    5    9:return          
	}

	public final void sendGameMessage(JSONObject jsonobject)
		throws IllegalStateException
	{
		sendGameMessage(getLastUsedPlayerId(), jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #105 <Method void sendGameMessage(String, JSONObject)>
	//    5    9:return          
	}

	public final PendingResult sendGameRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zzst.sendGameRequest(s, jsonobject);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #109 <Method PendingResult zzbl.sendGameRequest(String, JSONObject)>
	//    5    9:areturn         
	}

	public final PendingResult sendGameRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return sendGameRequest(getLastUsedPlayerId(), jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #112 <Method PendingResult sendGameRequest(String, JSONObject)>
	//    5    9:areturn         
	}

	public final PendingResult sendPlayerAvailableRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(s, 3, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_3        
	//    3    3:aload_2         
	//    4    4:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    5    7:areturn         
	}

	public final PendingResult sendPlayerAvailableRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(getLastUsedPlayerId(), 3, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:iconst_3        
	//    4    6:aload_1         
	//    5    7:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    6   10:areturn         
	}

	public final PendingResult sendPlayerIdleRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(s, 5, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_5        
	//    3    3:aload_2         
	//    4    4:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    5    7:areturn         
	}

	public final PendingResult sendPlayerIdleRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(getLastUsedPlayerId(), 5, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:iconst_5        
	//    4    6:aload_1         
	//    5    7:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    6   10:areturn         
	}

	public final PendingResult sendPlayerPlayingRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(s, 6, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:bipush          6
	//    3    4:aload_2         
	//    4    5:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    5    8:areturn         
	}

	public final PendingResult sendPlayerPlayingRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(getLastUsedPlayerId(), 6, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:bipush          6
	//    4    7:aload_1         
	//    5    8:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    6   11:areturn         
	}

	public final PendingResult sendPlayerQuitRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(s, 2, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:aload_2         
	//    4    4:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    5    7:areturn         
	}

	public final PendingResult sendPlayerQuitRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(getLastUsedPlayerId(), 2, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:iconst_2        
	//    4    6:aload_1         
	//    5    7:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    6   10:areturn         
	}

	public final PendingResult sendPlayerReadyRequest(String s, JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(s, 4, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:aload_2         
	//    4    4:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    5    7:areturn         
	}

	public final PendingResult sendPlayerReadyRequest(JSONObject jsonobject)
		throws IllegalStateException
	{
		return zza(getLastUsedPlayerId(), 4, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #104 <Method String getLastUsedPlayerId()>
	//    3    5:iconst_4        
	//    4    6:aload_1         
	//    5    7:invokespecial   #115 <Method PendingResult zza(String, int, JSONObject)>
	//    6   10:areturn         
	}

	public final void setListener(Listener listener)
	{
		zzst.setListener(listener);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method void zzbl.setListener(GameManagerClient$Listener)>
	//    4    8:return          
	}

	public final void setSessionLabel(String s)
	{
		((zzcm) (zzst)).setSessionLabel(s);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field zzbl zzst>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method void zzcm.setSessionLabel(String)>
	//    4    8:return          
	}

	public static final int GAMEPLAY_STATE_LOADING = 1;
	public static final int GAMEPLAY_STATE_PAUSED = 3;
	public static final int GAMEPLAY_STATE_RUNNING = 2;
	public static final int GAMEPLAY_STATE_SHOWING_INFO_SCREEN = 4;
	public static final int GAMEPLAY_STATE_UNKNOWN = 0;
	public static final int LOBBY_STATE_CLOSED = 2;
	public static final int LOBBY_STATE_OPEN = 1;
	public static final int LOBBY_STATE_UNKNOWN = 0;
	public static final int PLAYER_STATE_AVAILABLE = 3;
	public static final int PLAYER_STATE_DROPPED = 1;
	public static final int PLAYER_STATE_IDLE = 5;
	public static final int PLAYER_STATE_PLAYING = 6;
	public static final int PLAYER_STATE_QUIT = 2;
	public static final int PLAYER_STATE_READY = 4;
	public static final int PLAYER_STATE_UNKNOWN = 0;
	public static final int STATUS_INCORRECT_VERSION = 2150;
	public static final int STATUS_TOO_MANY_PLAYERS = 2151;
	private final zzbl zzst;
}
