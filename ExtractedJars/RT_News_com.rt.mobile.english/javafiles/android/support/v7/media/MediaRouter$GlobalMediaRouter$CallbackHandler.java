// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, SystemMediaRouteProvider

private final class MediaRouter$GlobalMediaRouter$CallbackHandler extends Handler
{

	private void invokeCallback(MediaRouter.CallbackRecord callbackrecord, int i, Object obj, int j)
	{
		MediaRouter mediarouter = callbackrecord.mRouter;
	//    0    0:aload_1         
	//    1    1:getfield        #63  <Field MediaRouter MediaRouter$CallbackRecord.mRouter>
	//    2    4:astore          6
		MediaRouter.Callback callback = callbackrecord.mCallback;
	//    3    6:aload_1         
	//    4    7:getfield        #67  <Field MediaRouter$Callback MediaRouter$CallbackRecord.mCallback>
	//    5   10:astore          7
		int k = 0xff00 & i;
	//    6   12:ldc1            #33  <Int 65280>
	//    7   14:iload_2         
	//    8   15:iand            
	//    9   16:istore          5
		if(k != 256)
	//*  10   18:iload           5
	//*  11   20:sipush          256
	//*  12   23:icmpeq          96
		{
			if(k != 512)
	//*  13   26:iload           5
	//*  14   28:sipush          512
	//*  15   31:icmpeq          35
				return;
	//   16   34:return          
			callbackrecord = ((MediaRouter.CallbackRecord) ((MediaRouter.ProviderInfo)obj));
	//   17   35:aload_3         
	//   18   36:checkcast       #69  <Class MediaRouter$ProviderInfo>
	//   19   39:astore_1        
			switch(i)
	//*  20   40:iload_2         
			{
	//*  21   41:tableswitch     513 515: default 68
	//	               513 87
	//	               514 78
	//	               515 69
			default:
				return;
	//   22   68:return          

			case 515: 
				callback.onProviderChanged(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
	//   23   69:aload           7
	//   24   71:aload           6
	//   25   73:aload_1         
	//   26   74:invokevirtual   #75  <Method void MediaRouter$Callback.onProviderChanged(MediaRouter, MediaRouter$ProviderInfo)>
				return;
	//   27   77:return          

			case 514: 
				callback.onProviderRemoved(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
	//   28   78:aload           7
	//   29   80:aload           6
	//   30   82:aload_1         
	//   31   83:invokevirtual   #78  <Method void MediaRouter$Callback.onProviderRemoved(MediaRouter, MediaRouter$ProviderInfo)>
				return;
	//   32   86:return          

			case 513: 
				callback.onProviderAdded(mediarouter, ((MediaRouter.ProviderInfo) (callbackrecord)));
	//   33   87:aload           7
	//   34   89:aload           6
	//   35   91:aload_1         
	//   36   92:invokevirtual   #81  <Method void MediaRouter$Callback.onProviderAdded(MediaRouter, MediaRouter$ProviderInfo)>
				return;
	//   37   95:return          
			}
		}
		obj = ((Object) ((MediaRouter.RouteInfo)obj));
	//   38   96:aload_3         
	//   39   97:checkcast       #83  <Class MediaRouter$RouteInfo>
	//   40  100:astore_3        
		if(!callbackrecord.filterRouteEvent(((MediaRouter.RouteInfo) (obj))))
	//*  41  101:aload_1         
	//*  42  102:aload_3         
	//*  43  103:invokevirtual   #87  <Method boolean MediaRouter$CallbackRecord.filterRouteEvent(MediaRouter$RouteInfo)>
	//*  44  106:ifne            110
			return;
	//   45  109:return          
		switch(i)
	//*  46  110:iload_2         
		{
	//*  47  111:tableswitch     257 263: default 152
	//	               257 209
	//	               258 200
	//	               259 191
	//	               260 182
	//	               261 173
	//	               262 164
	//	               263 153
		default:
			return;
	//   48  152:return          

		case 263: 
			callback.onRouteUnselected(mediarouter, ((MediaRouter.RouteInfo) (obj)), j);
	//   49  153:aload           7
	//   50  155:aload           6
	//   51  157:aload_3         
	//   52  158:iload           4
	//   53  160:invokevirtual   #91  <Method void MediaRouter$Callback.onRouteUnselected(MediaRouter, MediaRouter$RouteInfo, int)>
			return;
	//   54  163:return          

		case 262: 
			callback.onRouteSelected(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   55  164:aload           7
	//   56  166:aload           6
	//   57  168:aload_3         
	//   58  169:invokevirtual   #95  <Method void MediaRouter$Callback.onRouteSelected(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   59  172:return          

		case 261: 
			callback.onRoutePresentationDisplayChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   60  173:aload           7
	//   61  175:aload           6
	//   62  177:aload_3         
	//   63  178:invokevirtual   #98  <Method void MediaRouter$Callback.onRoutePresentationDisplayChanged(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   64  181:return          

		case 260: 
			callback.onRouteVolumeChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   65  182:aload           7
	//   66  184:aload           6
	//   67  186:aload_3         
	//   68  187:invokevirtual   #101 <Method void MediaRouter$Callback.onRouteVolumeChanged(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   69  190:return          

		case 259: 
			callback.onRouteChanged(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   70  191:aload           7
	//   71  193:aload           6
	//   72  195:aload_3         
	//   73  196:invokevirtual   #104 <Method void MediaRouter$Callback.onRouteChanged(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   74  199:return          

		case 258: 
			callback.onRouteRemoved(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   75  200:aload           7
	//   76  202:aload           6
	//   77  204:aload_3         
	//   78  205:invokevirtual   #107 <Method void MediaRouter$Callback.onRouteRemoved(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   79  208:return          

		case 257: 
			callback.onRouteAdded(mediarouter, ((MediaRouter.RouteInfo) (obj)));
	//   80  209:aload           7
	//   81  211:aload           6
	//   82  213:aload_3         
	//   83  214:invokevirtual   #110 <Method void MediaRouter$Callback.onRouteAdded(MediaRouter, MediaRouter$RouteInfo)>
			return;
	//   84  217:return          
		}
	}

	private void syncWithSystemProvider(int i, Object obj)
	{
		if(i != 262)
	//*   0    0:iload_1         
	//*   1    1:sipush          262
	//*   2    4:icmpeq          82
		{
			switch(i)
	//*   3    7:iload_1         
			{
	//*   4    8:tableswitch     257 259: default 36
	//	               257 67
	//	               258 52
	//	               259 37
			default:
				return;
	//    5   36:return          

			case 259: 
				mSystemProvider.onSyncRouteChanged((MediaRouter.RouteInfo)obj);
	//    6   37:aload_0         
	//    7   38:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//    8   41:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
	//    9   44:aload_2         
	//   10   45:checkcast       #83  <Class MediaRouter$RouteInfo>
	//   11   48:invokevirtual   #122 <Method void SystemMediaRouteProvider.onSyncRouteChanged(MediaRouter$RouteInfo)>
				return;
	//   12   51:return          

			case 258: 
				mSystemProvider.onSyncRouteRemoved((MediaRouter.RouteInfo)obj);
	//   13   52:aload_0         
	//   14   53:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   15   56:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
	//   16   59:aload_2         
	//   17   60:checkcast       #83  <Class MediaRouter$RouteInfo>
	//   18   63:invokevirtual   #125 <Method void SystemMediaRouteProvider.onSyncRouteRemoved(MediaRouter$RouteInfo)>
				return;
	//   19   66:return          

			case 257: 
				mSystemProvider.onSyncRouteAdded((MediaRouter.RouteInfo)obj);
	//   20   67:aload_0         
	//   21   68:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   22   71:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
	//   23   74:aload_2         
	//   24   75:checkcast       #83  <Class MediaRouter$RouteInfo>
	//   25   78:invokevirtual   #128 <Method void SystemMediaRouteProvider.onSyncRouteAdded(MediaRouter$RouteInfo)>
				return;
	//   26   81:return          
			}
		} else
		{
			mSystemProvider.onSyncRouteSelected((MediaRouter.RouteInfo)obj);
	//   27   82:aload_0         
	//   28   83:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   29   86:getfield        #116 <Field SystemMediaRouteProvider MediaRouter$GlobalMediaRouter.mSystemProvider>
	//   30   89:aload_2         
	//   31   90:checkcast       #83  <Class MediaRouter$RouteInfo>
	//   32   93:invokevirtual   #131 <Method void SystemMediaRouteProvider.onSyncRouteSelected(MediaRouter$RouteInfo)>
			return;
	//   33   96:return          
		}
	}

	public void handleMessage(Message message)
	{
		int j;
		int k;
		Object obj;
		j = message.what;
	//    0    0:aload_1         
	//    1    1:getfield        #138 <Field int Message.what>
	//    2    4:istore_3        
		obj = message.obj;
	//    3    5:aload_1         
	//    4    6:getfield        #142 <Field Object Message.obj>
	//    5    9:astore          6
		k = message.arg1;
	//    6   11:aload_1         
	//    7   12:getfield        #145 <Field int Message.arg1>
	//    8   15:istore          4
		if(j == 259 && getSelectedRoute().getId().equals(((Object) (((MediaRouter.RouteInfo)obj).getId()))))
	//*   9   17:iload_3         
	//*  10   18:sipush          259
	//*  11   21:icmpne          56
	//*  12   24:aload_0         
	//*  13   25:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//*  14   28:invokevirtual   #149 <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getSelectedRoute()>
	//*  15   31:invokevirtual   #153 <Method String MediaRouter$RouteInfo.getId()>
	//*  16   34:aload           6
	//*  17   36:checkcast       #83  <Class MediaRouter$RouteInfo>
	//*  18   39:invokevirtual   #153 <Method String MediaRouter$RouteInfo.getId()>
	//*  19   42:invokevirtual   #159 <Method boolean String.equals(Object)>
	//*  20   45:ifeq            56
			MediaRouter.GlobalMediaRouter.access$700(MediaRouter.GlobalMediaRouter.this, true);
	//   21   48:aload_0         
	//   22   49:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   23   52:iconst_1        
	//   24   53:invokestatic    #163 <Method void MediaRouter$GlobalMediaRouter.access$700(MediaRouter$GlobalMediaRouter, boolean)>
		syncWithSystemProvider(j, obj);
	//   25   56:aload_0         
	//   26   57:iload_3         
	//   27   58:aload           6
	//   28   60:invokespecial   #165 <Method void syncWithSystemProvider(int, Object)>
		int i = mRouters.size();
	//   29   63:aload_0         
	//   30   64:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   31   67:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
	//   32   70:invokevirtual   #172 <Method int ArrayList.size()>
	//   33   73:istore_2        
_L1:
		i--;
	//   34   74:iload_2         
	//   35   75:iconst_1        
	//   36   76:isub            
	//   37   77:istore_2        
		if(i < 0)
			break MISSING_BLOCK_LABEL_137;
	//   38   78:iload_2         
	//   39   79:iflt            137
		message = ((Message) ((MediaRouter)((WeakReference)mRouters.get(i)).get()));
	//   40   82:aload_0         
	//   41   83:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   42   86:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
	//   43   89:iload_2         
	//   44   90:invokevirtual   #176 <Method Object ArrayList.get(int)>
	//   45   93:checkcast       #178 <Class WeakReference>
	//   46   96:invokevirtual   #181 <Method Object WeakReference.get()>
	//   47   99:checkcast       #8   <Class MediaRouter>
	//   48  102:astore_1        
		if(message != null)
			break MISSING_BLOCK_LABEL_122;
	//   49  103:aload_1         
	//   50  104:ifnonnull       122
		mRouters.remove(i);
	//   51  107:aload_0         
	//   52  108:getfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
	//   53  111:getfield        #168 <Field ArrayList MediaRouter$GlobalMediaRouter.mRouters>
	//   54  114:iload_2         
	//   55  115:invokevirtual   #184 <Method Object ArrayList.remove(int)>
	//   56  118:pop             
		  goto _L1
	//*  57  119:goto            74
		mTempCallbackRecords.addAll(((java.util.Collection) (((MediaRouter) (message)).mCallbackRecords)));
	//   58  122:aload_0         
	//   59  123:getfield        #54  <Field ArrayList mTempCallbackRecords>
	//   60  126:aload_1         
	//   61  127:getfield        #187 <Field ArrayList MediaRouter.mCallbackRecords>
	//   62  130:invokevirtual   #191 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   63  133:pop             
		  goto _L1
	//*  64  134:goto            74
		int l = mTempCallbackRecords.size();
	//   65  137:aload_0         
	//   66  138:getfield        #54  <Field ArrayList mTempCallbackRecords>
	//   67  141:invokevirtual   #172 <Method int ArrayList.size()>
	//   68  144:istore          5
		i = 0;
	//   69  146:iconst_0        
	//   70  147:istore_2        
_L3:
		if(i >= l)
			break; /* Loop/switch isn't completed */
	//   71  148:iload_2         
	//   72  149:iload           5
	//   73  151:icmpge          181
		invokeCallback((MediaRouter.CallbackRecord)mTempCallbackRecords.get(i), j, obj, k);
	//   74  154:aload_0         
	//   75  155:aload_0         
	//   76  156:getfield        #54  <Field ArrayList mTempCallbackRecords>
	//   77  159:iload_2         
	//   78  160:invokevirtual   #176 <Method Object ArrayList.get(int)>
	//   79  163:checkcast       #59  <Class MediaRouter$CallbackRecord>
	//   80  166:iload_3         
	//   81  167:aload           6
	//   82  169:iload           4
	//   83  171:invokespecial   #193 <Method void invokeCallback(MediaRouter$CallbackRecord, int, Object, int)>
		i++;
	//   84  174:iload_2         
	//   85  175:iconst_1        
	//   86  176:iadd            
	//   87  177:istore_2        
		if(true) goto _L3; else goto _L2
	//   88  178:goto            148
_L2:
		mTempCallbackRecords.clear();
	//   89  181:aload_0         
	//   90  182:getfield        #54  <Field ArrayList mTempCallbackRecords>
	//   91  185:invokevirtual   #196 <Method void ArrayList.clear()>
		return;
	//   92  188:return          
		message;
	//   93  189:astore_1        
		mTempCallbackRecords.clear();
	//   94  190:aload_0         
	//   95  191:getfield        #54  <Field ArrayList mTempCallbackRecords>
	//   96  194:invokevirtual   #196 <Method void ArrayList.clear()>
		throw message;
	//   97  197:aload_1         
	//   98  198:athrow          
	}

	public void post(int i, Object obj)
	{
		obtainMessage(i, obj).sendToTarget();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #201 <Method Message obtainMessage(int, Object)>
	//    4    6:invokevirtual   #204 <Method void Message.sendToTarget()>
	//    5    9:return          
	}

	public void post(int i, Object obj, int j)
	{
		obj = ((Object) (obtainMessage(i, obj)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #201 <Method Message obtainMessage(int, Object)>
	//    4    6:astore_2        
		obj.arg1 = j;
	//    5    7:aload_2         
	//    6    8:iload_3         
	//    7    9:putfield        #145 <Field int Message.arg1>
		((Message) (obj)).sendToTarget();
	//    8   12:aload_2         
	//    9   13:invokevirtual   #204 <Method void Message.sendToTarget()>
	//   10   16:return          
	}

	public static final int MSG_PROVIDER_ADDED = 513;
	public static final int MSG_PROVIDER_CHANGED = 515;
	public static final int MSG_PROVIDER_REMOVED = 514;
	public static final int MSG_ROUTE_ADDED = 257;
	public static final int MSG_ROUTE_CHANGED = 259;
	public static final int MSG_ROUTE_PRESENTATION_DISPLAY_CHANGED = 261;
	public static final int MSG_ROUTE_REMOVED = 258;
	public static final int MSG_ROUTE_SELECTED = 262;
	public static final int MSG_ROUTE_UNSELECTED = 263;
	public static final int MSG_ROUTE_VOLUME_CHANGED = 260;
	private static final int MSG_TYPE_MASK = 65280;
	private static final int MSG_TYPE_PROVIDER = 512;
	private static final int MSG_TYPE_ROUTE = 256;
	private final ArrayList mTempCallbackRecords = new ArrayList();
	final MediaRouter.GlobalMediaRouter this$0;

	MediaRouter$GlobalMediaRouter$CallbackHandler()
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #49  <Method void Handler()>
	//    5    9:aload_0         
	//    6   10:new             #51  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #52  <Method void ArrayList()>
	//    9   17:putfield        #54  <Field ArrayList mTempCallbackRecords>
	//   10   20:return          
	}
}
