// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Intent;
import android.os.*;
import android.util.Log;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderService, MediaRouteDiscoveryRequest, MediaRouteProviderProtocol

final class MediaRouteProviderService$ReceiveHandler extends Handler
{

	private boolean processMessage(int i, Messenger messenger, int j, int k, Object obj, Bundle bundle)
	{
		MediaRouteProviderService mediarouteproviderservice = (MediaRouteProviderService)mServiceRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field WeakReference mServiceRef>
	//    2    4:invokevirtual   #25  <Method Object WeakReference.get()>
	//    3    7:checkcast       #27  <Class MediaRouteProviderService>
	//    4   10:astore          8
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore          7
		if(mediarouteproviderservice != null)
	//*   7   15:aload           8
	//*   8   17:ifnull          307
			switch(i)
	//*   9   20:iload_1         
			{
	//*  10   21:tableswitch     1 10: default 76
	//	               1 297
	//	               2 289
	//	               3 252
	//	               4 242
	//	               5 232
	//	               6 201
	//	               7 177
	//	               8 153
	//	               9 130
	//	               10 78
			default:
				return false;
	//   11   76:iconst_0        
	//   12   77:ireturn         

			case 10: // '\n'
				if(obj == null || (obj instanceof Bundle))
	//*  13   78:aload           5
	//*  14   80:ifnull          91
	//*  15   83:aload           5
	//*  16   85:instanceof      #29  <Class Bundle>
	//*  17   88:ifeq            307
				{
					obj = ((Object) (MediaRouteDiscoveryRequest.fromBundle((Bundle)obj)));
	//   18   91:aload           5
	//   19   93:checkcast       #29  <Class Bundle>
	//   20   96:invokestatic    #35  <Method MediaRouteDiscoveryRequest MediaRouteDiscoveryRequest.fromBundle(Bundle)>
	//   21   99:astore          5
					if(obj == null || !((MediaRouteDiscoveryRequest) (obj)).isValid())
	//*  22  101:aload           5
	//*  23  103:ifnull          117
	//*  24  106:aload           5
	//*  25  108:invokevirtual   #39  <Method boolean MediaRouteDiscoveryRequest.isValid()>
	//*  26  111:ifeq            117
	//*  27  114:goto            120
						obj = null;
	//   28  117:aconst_null     
	//   29  118:astore          5
					return mediarouteproviderservice.onSetDiscoveryRequest(messenger, j, ((MediaRouteDiscoveryRequest) (obj)));
	//   30  120:aload           8
	//   31  122:aload_2         
	//   32  123:iload_3         
	//   33  124:aload           5
	//   34  126:invokevirtual   #43  <Method boolean MediaRouteProviderService.onSetDiscoveryRequest(Messenger, int, MediaRouteDiscoveryRequest)>
	//   35  129:ireturn         
				}
				break;

			case 9: // '\t'
				if(obj instanceof Intent)
	//*  36  130:aload           5
	//*  37  132:instanceof      #45  <Class Intent>
	//*  38  135:ifeq            307
					return mediarouteproviderservice.onRouteControlRequest(messenger, j, k, (Intent)obj);
	//   39  138:aload           8
	//   40  140:aload_2         
	//   41  141:iload_3         
	//   42  142:iload           4
	//   43  144:aload           5
	//   44  146:checkcast       #45  <Class Intent>
	//   45  149:invokevirtual   #49  <Method boolean MediaRouteProviderService.onRouteControlRequest(Messenger, int, int, Intent)>
	//   46  152:ireturn         
				break;

			case 8: // '\b'
				i = bundle.getInt("volume", 0);
	//   47  153:aload           6
	//   48  155:ldc1            #51  <String "volume">
	//   49  157:iconst_0        
	//   50  158:invokevirtual   #55  <Method int Bundle.getInt(String, int)>
	//   51  161:istore_1        
				if(i != 0)
	//*  52  162:iload_1         
	//*  53  163:ifeq            307
					return mediarouteproviderservice.onUpdateRouteVolume(messenger, j, k, i);
	//   54  166:aload           8
	//   55  168:aload_2         
	//   56  169:iload_3         
	//   57  170:iload           4
	//   58  172:iload_1         
	//   59  173:invokevirtual   #59  <Method boolean MediaRouteProviderService.onUpdateRouteVolume(Messenger, int, int, int)>
	//   60  176:ireturn         
				break;

			case 7: // '\007'
				i = bundle.getInt("volume", -1);
	//   61  177:aload           6
	//   62  179:ldc1            #51  <String "volume">
	//   63  181:iconst_m1       
	//   64  182:invokevirtual   #55  <Method int Bundle.getInt(String, int)>
	//   65  185:istore_1        
				if(i >= 0)
	//*  66  186:iload_1         
	//*  67  187:iflt            307
					return mediarouteproviderservice.onSetRouteVolume(messenger, j, k, i);
	//   68  190:aload           8
	//   69  192:aload_2         
	//   70  193:iload_3         
	//   71  194:iload           4
	//   72  196:iload_1         
	//   73  197:invokevirtual   #62  <Method boolean MediaRouteProviderService.onSetRouteVolume(Messenger, int, int, int)>
	//   74  200:ireturn         
				break;

			case 6: // '\006'
				if(bundle == null)
	//*  75  201:aload           6
	//*  76  203:ifnonnull       212
					i = ((int) (flag));
	//   77  206:iload           7
	//   78  208:istore_1        
				else
	//*  79  209:goto            221
					i = bundle.getInt("unselectReason", 0);
	//   80  212:aload           6
	//   81  214:ldc1            #64  <String "unselectReason">
	//   82  216:iconst_0        
	//   83  217:invokevirtual   #55  <Method int Bundle.getInt(String, int)>
	//   84  220:istore_1        
				return mediarouteproviderservice.onUnselectRoute(messenger, j, k, i);
	//   85  221:aload           8
	//   86  223:aload_2         
	//   87  224:iload_3         
	//   88  225:iload           4
	//   89  227:iload_1         
	//   90  228:invokevirtual   #67  <Method boolean MediaRouteProviderService.onUnselectRoute(Messenger, int, int, int)>
	//   91  231:ireturn         

			case 5: // '\005'
				return mediarouteproviderservice.onSelectRoute(messenger, j, k);
	//   92  232:aload           8
	//   93  234:aload_2         
	//   94  235:iload_3         
	//   95  236:iload           4
	//   96  238:invokevirtual   #71  <Method boolean MediaRouteProviderService.onSelectRoute(Messenger, int, int)>
	//   97  241:ireturn         

			case 4: // '\004'
				return mediarouteproviderservice.onReleaseRouteController(messenger, j, k);
	//   98  242:aload           8
	//   99  244:aload_2         
	//  100  245:iload_3         
	//  101  246:iload           4
	//  102  248:invokevirtual   #74  <Method boolean MediaRouteProviderService.onReleaseRouteController(Messenger, int, int)>
	//  103  251:ireturn         

			case 3: // '\003'
				obj = ((Object) (bundle.getString("routeId")));
	//  104  252:aload           6
	//  105  254:ldc1            #76  <String "routeId">
	//  106  256:invokevirtual   #80  <Method String Bundle.getString(String)>
	//  107  259:astore          5
				bundle = ((Bundle) (bundle.getString("routeGroupId")));
	//  108  261:aload           6
	//  109  263:ldc1            #82  <String "routeGroupId">
	//  110  265:invokevirtual   #80  <Method String Bundle.getString(String)>
	//  111  268:astore          6
				if(obj != null)
	//* 112  270:aload           5
	//* 113  272:ifnull          307
					return mediarouteproviderservice.onCreateRouteController(messenger, j, k, ((String) (obj)), ((String) (bundle)));
	//  114  275:aload           8
	//  115  277:aload_2         
	//  116  278:iload_3         
	//  117  279:iload           4
	//  118  281:aload           5
	//  119  283:aload           6
	//  120  285:invokevirtual   #86  <Method boolean MediaRouteProviderService.onCreateRouteController(Messenger, int, int, String, String)>
	//  121  288:ireturn         
				break;

			case 2: // '\002'
				return mediarouteproviderservice.onUnregisterClient(messenger, j);
	//  122  289:aload           8
	//  123  291:aload_2         
	//  124  292:iload_3         
	//  125  293:invokevirtual   #90  <Method boolean MediaRouteProviderService.onUnregisterClient(Messenger, int)>
	//  126  296:ireturn         

			case 1: // '\001'
				return mediarouteproviderservice.onRegisterClient(messenger, j, k);
	//  127  297:aload           8
	//  128  299:aload_2         
	//  129  300:iload_3         
	//  130  301:iload           4
	//  131  303:invokevirtual   #93  <Method boolean MediaRouteProviderService.onRegisterClient(Messenger, int, int)>
	//  132  306:ireturn         
			}
		return false;
	//  133  307:iconst_0        
	//  134  308:ireturn         
	}

	public void handleMessage(Message message)
	{
		Messenger messenger = message.replyTo;
	//    0    0:aload_1         
	//    1    1:getfield        #101 <Field Messenger Message.replyTo>
	//    2    4:astore          5
		if(MediaRouteProviderProtocol.isValidRemoteMessenger(messenger))
	//*   3    6:aload           5
	//*   4    8:invokestatic    #107 <Method boolean MediaRouteProviderProtocol.isValidRemoteMessenger(Messenger)>
	//*   5   11:ifeq            178
		{
			int i = message.what;
	//    6   14:aload_1         
	//    7   15:getfield        #111 <Field int Message.what>
	//    8   18:istore_2        
			int j = message.arg1;
	//    9   19:aload_1         
	//   10   20:getfield        #114 <Field int Message.arg1>
	//   11   23:istore_3        
			int k = message.arg2;
	//   12   24:aload_1         
	//   13   25:getfield        #117 <Field int Message.arg2>
	//   14   28:istore          4
			Object obj = message.obj;
	//   15   30:aload_1         
	//   16   31:getfield        #121 <Field Object Message.obj>
	//   17   34:astore          6
			message = ((Message) (message.peekData()));
	//   18   36:aload_1         
	//   19   37:invokevirtual   #125 <Method Bundle Message.peekData()>
	//   20   40:astore_1        
			if(!processMessage(i, messenger, j, k, obj, ((Bundle) (message))))
	//*  21   41:aload_0         
	//*  22   42:iload_2         
	//*  23   43:aload           5
	//*  24   45:iload_3         
	//*  25   46:iload           4
	//*  26   48:aload           6
	//*  27   50:aload_1         
	//*  28   51:invokespecial   #127 <Method boolean processMessage(int, Messenger, int, int, Object, Bundle)>
	//*  29   54:ifne            192
			{
				if(MediaRouteProviderService.DEBUG)
	//*  30   57:getstatic       #131 <Field boolean MediaRouteProviderService.DEBUG>
	//*  31   60:ifeq            171
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   32   63:new             #133 <Class StringBuilder>
	//   33   66:dup             
	//   34   67:invokespecial   #134 <Method void StringBuilder()>
	//   35   70:astore          7
					stringbuilder.append(MediaRouteProviderService.getClientId(messenger));
	//   36   72:aload           7
	//   37   74:aload           5
	//   38   76:invokestatic    #138 <Method String MediaRouteProviderService.getClientId(Messenger)>
	//   39   79:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
					stringbuilder.append(": Message failed, what=");
	//   41   83:aload           7
	//   42   85:ldc1            #144 <String ": Message failed, what=">
	//   43   87:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
					stringbuilder.append(i);
	//   45   91:aload           7
	//   46   93:iload_2         
	//   47   94:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   48   97:pop             
					stringbuilder.append(", requestId=");
	//   49   98:aload           7
	//   50  100:ldc1            #149 <String ", requestId=">
	//   51  102:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   52  105:pop             
					stringbuilder.append(j);
	//   53  106:aload           7
	//   54  108:iload_3         
	//   55  109:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   56  112:pop             
					stringbuilder.append(", arg=");
	//   57  113:aload           7
	//   58  115:ldc1            #151 <String ", arg=">
	//   59  117:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
					stringbuilder.append(k);
	//   61  121:aload           7
	//   62  123:iload           4
	//   63  125:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   64  128:pop             
					stringbuilder.append(", obj=");
	//   65  129:aload           7
	//   66  131:ldc1            #153 <String ", obj=">
	//   67  133:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:pop             
					stringbuilder.append(obj);
	//   69  137:aload           7
	//   70  139:aload           6
	//   71  141:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   72  144:pop             
					stringbuilder.append(", data=");
	//   73  145:aload           7
	//   74  147:ldc1            #158 <String ", data=">
	//   75  149:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   76  152:pop             
					stringbuilder.append(((Object) (message)));
	//   77  153:aload           7
	//   78  155:aload_1         
	//   79  156:invokevirtual   #156 <Method StringBuilder StringBuilder.append(Object)>
	//   80  159:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   81  160:ldc1            #160 <String "MediaRouteProviderSrv">
	//   82  162:aload           7
	//   83  164:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   84  167:invokestatic    #170 <Method int Log.d(String, String)>
	//   85  170:pop             
				}
				MediaRouteProviderService.sendGenericFailure(messenger, j);
	//   86  171:aload           5
	//   87  173:iload_3         
	//   88  174:invokestatic    #174 <Method void MediaRouteProviderService.sendGenericFailure(Messenger, int)>
				return;
	//   89  177:return          
			}
		} else
		if(MediaRouteProviderService.DEBUG)
	//*  90  178:getstatic       #131 <Field boolean MediaRouteProviderService.DEBUG>
	//*  91  181:ifeq            192
			Log.d("MediaRouteProviderSrv", "Ignoring message without valid reply messenger.");
	//   92  184:ldc1            #160 <String "MediaRouteProviderSrv">
	//   93  186:ldc1            #176 <String "Ignoring message without valid reply messenger.">
	//   94  188:invokestatic    #170 <Method int Log.d(String, String)>
	//   95  191:pop             
	//   96  192:return          
	}

	private final WeakReference mServiceRef;

	public MediaRouteProviderService$ReceiveHandler(MediaRouteProviderService mediarouteproviderservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Handler()>
		mServiceRef = new WeakReference(((Object) (mediarouteproviderservice)));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
	//    7   13:putfield        #18  <Field WeakReference mServiceRef>
	//    8   16:return          
	}
}
