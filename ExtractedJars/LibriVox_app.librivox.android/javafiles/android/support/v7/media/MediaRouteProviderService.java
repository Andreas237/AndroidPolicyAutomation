// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.support.v4.g.p;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderDescriptor, MediaRouteDescriptor, MediaRouteProvider, MediaRouteDiscoveryRequest, 
//			MediaRouteSelector

public abstract class MediaRouteProviderService extends Service
{

	public MediaRouteProviderService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #47  <Method void ArrayList()>
	//    6   12:putfield        #49  <Field ArrayList mClients>
	//    7   15:aload_0         
	//    8   16:new             #51  <Class MediaRouteProviderService$ReceiveHandler>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #54  <Method void MediaRouteProviderService$ReceiveHandler(MediaRouteProviderService)>
	//   12   24:putfield        #56  <Field MediaRouteProviderService$ReceiveHandler mReceiveHandler>
		mReceiveMessenger = new Messenger(((Handler) (mReceiveHandler)));
	//   13   27:aload_0         
	//   14   28:new             #58  <Class Messenger>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:getfield        #56  <Field MediaRouteProviderService$ReceiveHandler mReceiveHandler>
	//   18   36:invokespecial   #61  <Method void Messenger(Handler)>
	//   19   39:putfield        #63  <Field Messenger mReceiveMessenger>
	//   20   42:aload_0         
	//   21   43:new             #65  <Class MediaRouteProviderService$PrivateHandler>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #66  <Method void MediaRouteProviderService$PrivateHandler(MediaRouteProviderService)>
	//   25   51:putfield        #68  <Field MediaRouteProviderService$PrivateHandler mPrivateHandler>
	//   26   54:aload_0         
	//   27   55:new             #70  <Class MediaRouteProviderService$ProviderCallback>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:invokespecial   #71  <Method void MediaRouteProviderService$ProviderCallback(MediaRouteProviderService)>
	//   31   63:putfield        #73  <Field MediaRouteProviderService$ProviderCallback mProviderCallback>
	//   32   66:return          
	}

	static Bundle createDescriptorBundleForClientVersion(MediaRouteProviderDescriptor mediarouteproviderdescriptor, int i)
	{
		if(mediarouteproviderdescriptor == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		MediaRouteProviderDescriptor.Builder builder = new MediaRouteProviderDescriptor.Builder(mediarouteproviderdescriptor);
	//    4    6:new             #77  <Class MediaRouteProviderDescriptor$Builder>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #80  <Method void MediaRouteProviderDescriptor$Builder(MediaRouteProviderDescriptor)>
	//    8   14:astore_2        
		builder.setRoutes(((java.util.Collection) (null)));
	//    9   15:aload_2         
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #84  <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.setRoutes(java.util.Collection)>
	//   12   20:pop             
		mediarouteproviderdescriptor = ((MediaRouteProviderDescriptor) (mediarouteproviderdescriptor.getRoutes().iterator()));
	//   13   21:aload_0         
	//   14   22:invokevirtual   #90  <Method List MediaRouteProviderDescriptor.getRoutes()>
	//   15   25:invokeinterface #96  <Method Iterator List.iterator()>
	//   16   30:astore_0        
		do
		{
			if(!((Iterator) (mediarouteproviderdescriptor)).hasNext())
				break;
	//   17   31:aload_0         
	//   18   32:invokeinterface #102 <Method boolean Iterator.hasNext()>
	//   19   37:ifeq            75
			MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)((Iterator) (mediarouteproviderdescriptor)).next();
	//   20   40:aload_0         
	//   21   41:invokeinterface #106 <Method Object Iterator.next()>
	//   22   46:checkcast       #108 <Class MediaRouteDescriptor>
	//   23   49:astore_3        
			if(i >= mediaroutedescriptor.getMinClientVersion() && i <= mediaroutedescriptor.getMaxClientVersion())
	//*  24   50:iload_1         
	//*  25   51:aload_3         
	//*  26   52:invokevirtual   #112 <Method int MediaRouteDescriptor.getMinClientVersion()>
	//*  27   55:icmplt          31
	//*  28   58:iload_1         
	//*  29   59:aload_3         
	//*  30   60:invokevirtual   #115 <Method int MediaRouteDescriptor.getMaxClientVersion()>
	//*  31   63:icmpgt          31
				builder.addRoute(mediaroutedescriptor);
	//   32   66:aload_2         
	//   33   67:aload_3         
	//   34   68:invokevirtual   #119 <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.addRoute(MediaRouteDescriptor)>
	//   35   71:pop             
		} while(true);
	//   36   72:goto            31
		return builder.build().asBundle();
	//   37   75:aload_2         
	//   38   76:invokevirtual   #123 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor$Builder.build()>
	//   39   79:invokevirtual   #127 <Method Bundle MediaRouteProviderDescriptor.asBundle()>
	//   40   82:areturn         
	}

	private ClientRecord getClient(Messenger messenger)
	{
		int i = findClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method int findClient(Messenger)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            22
			return (ClientRecord)mClients.get(i);
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field ArrayList mClients>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #137 <Method Object ArrayList.get(int)>
	//   10   18:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//   11   21:areturn         
		else
			return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
	}

	static String getClientId(Messenger messenger)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #143 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Client connection ");
	//    4    8:aload_1         
	//    5    9:ldc1            #146 <String "Client connection ">
	//    6   11:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (messenger.getBinder())).toString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #154 <Method IBinder Messenger.getBinder()>
	//   11   20:invokevirtual   #160 <Method String Object.toString()>
	//   12   23:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	static void sendGenericFailure(Messenger messenger, int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			sendReply(messenger, 0, i, 0, ((Object) (null)), ((Bundle) (null)));
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:invokestatic    #167 <Method void sendReply(Messenger, int, int, int, Object, Bundle)>
	//    9   13:return          
	}

	private static void sendGenericSuccess(Messenger messenger, int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			sendReply(messenger, 1, i, 0, ((Object) (null)), ((Bundle) (null)));
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:iload_1         
	//    5    7:iconst_0        
	//    6    8:aconst_null     
	//    7    9:aconst_null     
	//    8   10:invokestatic    #167 <Method void sendReply(Messenger, int, int, int, Object, Bundle)>
	//    9   13:return          
	}

	static void sendReply(Messenger messenger, int i, int j, int k, Object obj, Bundle bundle)
	{
		Message message = Message.obtain();
	//    0    0:invokestatic    #178 <Method Message Message.obtain()>
	//    1    3:astore          6
		message.what = i;
	//    2    5:aload           6
	//    3    7:iload_1         
	//    4    8:putfield        #181 <Field int Message.what>
		message.arg1 = j;
	//    5   11:aload           6
	//    6   13:iload_2         
	//    7   14:putfield        #184 <Field int Message.arg1>
		message.arg2 = k;
	//    8   17:aload           6
	//    9   19:iload_3         
	//   10   20:putfield        #187 <Field int Message.arg2>
		message.obj = obj;
	//   11   23:aload           6
	//   12   25:aload           4
	//   13   27:putfield        #191 <Field Object Message.obj>
		message.setData(bundle);
	//   14   30:aload           6
	//   15   32:aload           5
	//   16   34:invokevirtual   #195 <Method void Message.setData(Bundle)>
		try
		{
			messenger.send(message);
	//   17   37:aload_0         
	//   18   38:aload           6
	//   19   40:invokevirtual   #199 <Method void Messenger.send(Message)>
			return;
	//   20   43:return          
		}
	//*  21   44:astore          4
	//*  22   46:new             #143 <Class StringBuilder>
	//*  23   49:dup             
	//*  24   50:invokespecial   #144 <Method void StringBuilder()>
	//*  25   53:astore          5
	//*  26   55:aload           5
	//*  27   57:ldc1            #201 <String "Could not send message to ">
	//*  28   59:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  29   62:pop             
	//*  30   63:aload           5
	//*  31   65:aload_0         
	//*  32   66:invokestatic    #203 <Method String getClientId(Messenger)>
	//*  33   69:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//*  34   72:pop             
	//*  35   73:ldc1            #16  <String "MediaRouteProviderSrv">
	//*  36   75:aload           5
	//*  37   77:invokevirtual   #161 <Method String StringBuilder.toString()>
	//*  38   80:aload           4
	//*  39   82:invokestatic    #207 <Method int Log.e(String, String, Throwable)>
	//*  40   85:pop             
	//*  41   86:return          
		// Misplaced declaration of an exception variable
		catch(Messenger messenger)
	//*  42   87:astore_0        
		{
			return;
	//   43   88:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			bundle = ((Bundle) (new StringBuilder()));
		}
		((StringBuilder) (bundle)).append("Could not send message to ");
		((StringBuilder) (bundle)).append(getClientId(messenger));
		Log.e("MediaRouteProviderSrv", ((StringBuilder) (bundle)).toString(), ((Throwable) (obj)));
	}

	int findClient(Messenger messenger)
	{
		int j = mClients.size();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mClients>
	//    2    4:invokevirtual   #210 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          42
			if(((ClientRecord)mClients.get(i)).hasMessenger(messenger))
	//*   9   15:aload_0         
	//*  10   16:getfield        #49  <Field ArrayList mClients>
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #137 <Method Object ArrayList.get(int)>
	//*  13   23:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #214 <Method boolean MediaRouteProviderService$ClientRecord.hasMessenger(Messenger)>
	//*  16   30:ifeq            35
				return i;
	//   17   33:iload_2         
	//   18   34:ireturn         

	//   19   35:iload_2         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_2        
	//*  23   39:goto            10
		return -1;
	//   24   42:iconst_m1       
	//   25   43:ireturn         
	}

	public MediaRouteProvider getMediaRouteProvider()
	{
		return mProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field MediaRouteProvider mProvider>
	//    2    4:areturn         
	}

	public IBinder onBind(Intent intent)
	{
		if(intent.getAction().equals("android.media.MediaRouteProviderService"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #225 <Method String Intent.getAction()>
	//*   2    4:ldc1            #13  <String "android.media.MediaRouteProviderService">
	//*   3    6:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*   4    9:ifeq            138
		{
			if(mProvider == null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #218 <Field MediaRouteProvider mProvider>
	//*   7   16:ifnonnull       123
			{
				MediaRouteProvider mediarouteprovider = onCreateMediaRouteProvider();
	//    8   19:aload_0         
	//    9   20:invokevirtual   #234 <Method MediaRouteProvider onCreateMediaRouteProvider()>
	//   10   23:astore_2        
				if(mediarouteprovider != null)
	//*  11   24:aload_2         
	//*  12   25:ifnull          123
				{
					intent = ((Intent) (mediarouteprovider.getMetadata().getPackageName()));
	//   13   28:aload_2         
	//   14   29:invokevirtual   #240 <Method MediaRouteProvider$ProviderMetadata MediaRouteProvider.getMetadata()>
	//   15   32:invokevirtual   #245 <Method String MediaRouteProvider$ProviderMetadata.getPackageName()>
	//   16   35:astore_1        
					if(((String) (intent)).equals(((Object) (getPackageName()))))
	//*  17   36:aload_1         
	//*  18   37:aload_0         
	//*  19   38:invokevirtual   #246 <Method String getPackageName()>
	//*  20   41:invokevirtual   #231 <Method boolean String.equals(Object)>
	//*  21   44:ifeq            66
					{
						mProvider = mediarouteprovider;
	//   22   47:aload_0         
	//   23   48:aload_2         
	//   24   49:putfield        #218 <Field MediaRouteProvider mProvider>
						mProvider.setCallback(((MediaRouteProvider.Callback) (mProviderCallback)));
	//   25   52:aload_0         
	//   26   53:getfield        #218 <Field MediaRouteProvider mProvider>
	//   27   56:aload_0         
	//   28   57:getfield        #73  <Field MediaRouteProviderService$ProviderCallback mProviderCallback>
	//   29   60:invokevirtual   #250 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
					} else
	//*  30   63:goto            123
					{
						StringBuilder stringbuilder = new StringBuilder();
	//   31   66:new             #143 <Class StringBuilder>
	//   32   69:dup             
	//   33   70:invokespecial   #144 <Method void StringBuilder()>
	//   34   73:astore_2        
						stringbuilder.append("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ");
	//   35   74:aload_2         
	//   36   75:ldc1            #252 <String "onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ">
	//   37   77:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   38   80:pop             
						stringbuilder.append(((String) (intent)));
	//   39   81:aload_2         
	//   40   82:aload_1         
	//   41   83:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
						stringbuilder.append(".  Service package name: ");
	//   43   87:aload_2         
	//   44   88:ldc1            #254 <String ".  Service package name: ">
	//   45   90:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   46   93:pop             
						stringbuilder.append(getPackageName());
	//   47   94:aload_2         
	//   48   95:aload_0         
	//   49   96:invokevirtual   #246 <Method String getPackageName()>
	//   50   99:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
						stringbuilder.append(".");
	//   52  103:aload_2         
	//   53  104:ldc2            #256 <String ".">
	//   54  107:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
						throw new IllegalStateException(stringbuilder.toString());
	//   56  111:new             #258 <Class IllegalStateException>
	//   57  114:dup             
	//   58  115:aload_2         
	//   59  116:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   60  119:invokespecial   #261 <Method void IllegalStateException(String)>
	//   61  122:athrow          
					}
				}
			}
			if(mProvider != null)
	//*  62  123:aload_0         
	//*  63  124:getfield        #218 <Field MediaRouteProvider mProvider>
	//*  64  127:ifnull          138
				return mReceiveMessenger.getBinder();
	//   65  130:aload_0         
	//   66  131:getfield        #63  <Field Messenger mReceiveMessenger>
	//   67  134:invokevirtual   #154 <Method IBinder Messenger.getBinder()>
	//   68  137:areturn         
		}
		return null;
	//   69  138:aconst_null     
	//   70  139:areturn         
	}

	void onBinderDied(Messenger messenger)
	{
		int i = findClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method int findClient(Messenger)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            64
		{
			messenger = ((Messenger) ((ClientRecord)mClients.remove(i)));
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field ArrayList mClients>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #266 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//   11   21:astore_1        
			if(DEBUG)
	//*  12   22:getstatic       #40  <Field boolean DEBUG>
	//*  13   25:ifeq            60
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #143 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #144 <Method void StringBuilder()>
	//   17   35:astore_3        
				stringbuilder.append(((Object) (messenger)));
	//   18   36:aload_3         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   21   41:pop             
				stringbuilder.append(": Binder died");
	//   22   42:aload_3         
	//   23   43:ldc2            #271 <String ": Binder died">
	//   24   46:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   26   50:ldc1            #16  <String "MediaRouteProviderSrv">
	//   27   52:aload_3         
	//   28   53:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   29   56:invokestatic    #275 <Method int Log.d(String, String)>
	//   30   59:pop             
			}
			((ClientRecord) (messenger)).dispose();
	//   31   60:aload_1         
	//   32   61:invokevirtual   #278 <Method void MediaRouteProviderService$ClientRecord.dispose()>
		}
	//   33   64:return          
	}

	public abstract MediaRouteProvider onCreateMediaRouteProvider();

	boolean onCreateRouteController(Messenger messenger, int i, int j, String s, String s1)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          6
		if(clientrecord != null && clientrecord.createRouteController(s, s1, j))
	//*   4    7:aload           6
	//*   5    9:ifnull          116
	//*   6   12:aload           6
	//*   7   14:aload           4
	//*   8   16:aload           5
	//*   9   18:iload_3         
	//*  10   19:invokevirtual   #286 <Method boolean MediaRouteProviderService$ClientRecord.createRouteController(String, String, int)>
	//*  11   22:ifeq            116
		{
			if(DEBUG)
	//*  12   25:getstatic       #40  <Field boolean DEBUG>
	//*  13   28:ifeq            109
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   31:new             #143 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:invokespecial   #144 <Method void StringBuilder()>
	//   17   38:astore          7
				stringbuilder.append(((Object) (clientrecord)));
	//   18   40:aload           7
	//   19   42:aload           6
	//   20   44:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   21   47:pop             
				stringbuilder.append(": Route controller created, controllerId=");
	//   22   48:aload           7
	//   23   50:ldc2            #288 <String ": Route controller created, controllerId=">
	//   24   53:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
				stringbuilder.append(j);
	//   26   57:aload           7
	//   27   59:iload_3         
	//   28   60:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   29   63:pop             
				stringbuilder.append(", routeId=");
	//   30   64:aload           7
	//   31   66:ldc2            #293 <String ", routeId=">
	//   32   69:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   33   72:pop             
				stringbuilder.append(s);
	//   34   73:aload           7
	//   35   75:aload           4
	//   36   77:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
				stringbuilder.append(", routeGroupId=");
	//   38   81:aload           7
	//   39   83:ldc2            #295 <String ", routeGroupId=">
	//   40   86:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   41   89:pop             
				stringbuilder.append(s1);
	//   42   90:aload           7
	//   43   92:aload           5
	//   44   94:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   45   97:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   46   98:ldc1            #16  <String "MediaRouteProviderSrv">
	//   47  100:aload           7
	//   48  102:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   49  105:invokestatic    #275 <Method int Log.d(String, String)>
	//   50  108:pop             
			}
			sendGenericSuccess(messenger, i);
	//   51  109:aload_1         
	//   52  110:iload_2         
	//   53  111:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
			return true;
	//   54  114:iconst_1        
	//   55  115:ireturn         
		} else
		{
			return false;
	//   56  116:iconst_0        
	//   57  117:ireturn         
		}
	}

	boolean onRegisterClient(Messenger messenger, int i, int j)
	{
		if(j >= 1 && findClient(messenger) < 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:icmplt          122
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #133 <Method int findClient(Messenger)>
	//*   6   10:ifge            122
		{
			ClientRecord clientrecord = new ClientRecord(messenger, j);
	//    7   13:new             #139 <Class MediaRouteProviderService$ClientRecord>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:iload_3         
	//   12   20:invokespecial   #302 <Method void MediaRouteProviderService$ClientRecord(MediaRouteProviderService, Messenger, int)>
	//   13   23:astore          4
			if(clientrecord.register())
	//*  14   25:aload           4
	//*  15   27:invokevirtual   #305 <Method boolean MediaRouteProviderService$ClientRecord.register()>
	//*  16   30:ifeq            122
			{
				mClients.add(((Object) (clientrecord)));
	//   17   33:aload_0         
	//   18   34:getfield        #49  <Field ArrayList mClients>
	//   19   37:aload           4
	//   20   39:invokevirtual   #308 <Method boolean ArrayList.add(Object)>
	//   21   42:pop             
				if(DEBUG)
	//*  22   43:getstatic       #40  <Field boolean DEBUG>
	//*  23   46:ifeq            93
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   24   49:new             #143 <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #144 <Method void StringBuilder()>
	//   27   56:astore          5
					stringbuilder.append(((Object) (clientrecord)));
	//   28   58:aload           5
	//   29   60:aload           4
	//   30   62:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   31   65:pop             
					stringbuilder.append(": Registered, version=");
	//   32   66:aload           5
	//   33   68:ldc2            #310 <String ": Registered, version=">
	//   34   71:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   35   74:pop             
					stringbuilder.append(j);
	//   36   75:aload           5
	//   37   77:iload_3         
	//   38   78:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   39   81:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   40   82:ldc1            #16  <String "MediaRouteProviderSrv">
	//   41   84:aload           5
	//   42   86:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   43   89:invokestatic    #275 <Method int Log.d(String, String)>
	//   44   92:pop             
				}
				if(i != 0)
	//*  45   93:iload_2         
	//*  46   94:ifeq            120
					sendReply(messenger, 2, i, 1, ((Object) (createDescriptorBundleForClientVersion(mProvider.getDescriptor(), clientrecord.mVersion))), ((Bundle) (null)));
	//   47   97:aload_1         
	//   48   98:iconst_2        
	//   49   99:iload_2         
	//   50  100:iconst_1        
	//   51  101:aload_0         
	//   52  102:getfield        #218 <Field MediaRouteProvider mProvider>
	//   53  105:invokevirtual   #313 <Method MediaRouteProviderDescriptor MediaRouteProvider.getDescriptor()>
	//   54  108:aload           4
	//   55  110:getfield        #316 <Field int MediaRouteProviderService$ClientRecord.mVersion>
	//   56  113:invokestatic    #318 <Method Bundle createDescriptorBundleForClientVersion(MediaRouteProviderDescriptor, int)>
	//   57  116:aconst_null     
	//   58  117:invokestatic    #167 <Method void sendReply(Messenger, int, int, int, Object, Bundle)>
				return true;
	//   59  120:iconst_1        
	//   60  121:ireturn         
			}
		}
		return false;
	//   61  122:iconst_0        
	//   62  123:ireturn         
	}

	boolean onReleaseRouteController(Messenger messenger, int i, int j)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          4
		if(clientrecord != null && clientrecord.releaseRouteController(j))
	//*   4    7:aload           4
	//*   5    9:ifnull          87
	//*   6   12:aload           4
	//*   7   14:iload_3         
	//*   8   15:invokevirtual   #323 <Method boolean MediaRouteProviderService$ClientRecord.releaseRouteController(int)>
	//*   9   18:ifeq            87
		{
			if(DEBUG)
	//*  10   21:getstatic       #40  <Field boolean DEBUG>
	//*  11   24:ifeq            80
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   12   27:new             #143 <Class StringBuilder>
	//   13   30:dup             
	//   14   31:invokespecial   #144 <Method void StringBuilder()>
	//   15   34:astore          5
				stringbuilder.append(((Object) (clientrecord)));
	//   16   36:aload           5
	//   17   38:aload           4
	//   18   40:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   19   43:pop             
				stringbuilder.append(": Route controller released");
	//   20   44:aload           5
	//   21   46:ldc2            #325 <String ": Route controller released">
	//   22   49:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
				stringbuilder.append(", controllerId=");
	//   24   53:aload           5
	//   25   55:ldc2            #327 <String ", controllerId=">
	//   26   58:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
				stringbuilder.append(j);
	//   28   62:aload           5
	//   29   64:iload_3         
	//   30   65:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   31   68:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   32   69:ldc1            #16  <String "MediaRouteProviderSrv">
	//   33   71:aload           5
	//   34   73:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   35   76:invokestatic    #275 <Method int Log.d(String, String)>
	//   36   79:pop             
			}
			sendGenericSuccess(messenger, i);
	//   37   80:aload_1         
	//   38   81:iload_2         
	//   39   82:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
			return true;
	//   40   85:iconst_1        
	//   41   86:ireturn         
		} else
		{
			return false;
	//   42   87:iconst_0        
	//   43   88:ireturn         
		}
	}

	boolean onRouteControlRequest(final Messenger messenger, final int requestId, final int controllerId, final Intent intent)
	{
		final ClientRecord client = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          6
		if(client != null)
	//*   4    7:aload           6
	//*   5    9:ifnull          131
		{
			MediaRouteProvider.RouteController routecontroller = client.getRouteController(controllerId);
	//    6   12:aload           6
	//    7   14:iload_3         
	//    8   15:invokevirtual   #333 <Method MediaRouteProvider$RouteController MediaRouteProviderService$ClientRecord.getRouteController(int)>
	//    9   18:astore          7
			if(routecontroller != null)
	//*  10   20:aload           7
	//*  11   22:ifnull          131
			{
				_cls1 _lcls1 = null;
	//   12   25:aconst_null     
	//   13   26:astore          5
				if(requestId != 0)
	//*  14   28:iload_2         
	//*  15   29:ifeq            49
					_lcls1 = new _cls1();
	//   16   32:new             #335 <Class MediaRouteProviderService$1>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:aload           6
	//   20   39:iload_3         
	//   21   40:aload           4
	//   22   42:aload_1         
	//   23   43:iload_2         
	//   24   44:invokespecial   #338 <Method void MediaRouteProviderService$1(MediaRouteProviderService, MediaRouteProviderService$ClientRecord, int, Intent, Messenger, int)>
	//   25   47:astore          5
				if(routecontroller.onControlRequest(intent, ((MediaRouter.ControlRequestCallback) (_lcls1))))
	//*  26   49:aload           7
	//*  27   51:aload           4
	//*  28   53:aload           5
	//*  29   55:invokevirtual   #344 <Method boolean MediaRouteProvider$RouteController.onControlRequest(Intent, MediaRouter$ControlRequestCallback)>
	//*  30   58:ifeq            131
				{
					if(DEBUG)
	//*  31   61:getstatic       #40  <Field boolean DEBUG>
	//*  32   64:ifeq            129
					{
						messenger = ((Messenger) (new StringBuilder()));
	//   33   67:new             #143 <Class StringBuilder>
	//   34   70:dup             
	//   35   71:invokespecial   #144 <Method void StringBuilder()>
	//   36   74:astore_1        
						((StringBuilder) (messenger)).append(((Object) (client)));
	//   37   75:aload_1         
	//   38   76:aload           6
	//   39   78:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   40   81:pop             
						((StringBuilder) (messenger)).append(": Route control request delivered");
	//   41   82:aload_1         
	//   42   83:ldc2            #346 <String ": Route control request delivered">
	//   43   86:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
						((StringBuilder) (messenger)).append(", controllerId=");
	//   45   90:aload_1         
	//   46   91:ldc2            #327 <String ", controllerId=">
	//   47   94:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
						((StringBuilder) (messenger)).append(controllerId);
	//   49   98:aload_1         
	//   50   99:iload_3         
	//   51  100:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   52  103:pop             
						((StringBuilder) (messenger)).append(", intent=");
	//   53  104:aload_1         
	//   54  105:ldc2            #348 <String ", intent=">
	//   55  108:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
						((StringBuilder) (messenger)).append(((Object) (intent)));
	//   57  112:aload_1         
	//   58  113:aload           4
	//   59  115:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   60  118:pop             
						Log.d("MediaRouteProviderSrv", ((StringBuilder) (messenger)).toString());
	//   61  119:ldc1            #16  <String "MediaRouteProviderSrv">
	//   62  121:aload_1         
	//   63  122:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   64  125:invokestatic    #275 <Method int Log.d(String, String)>
	//   65  128:pop             
					}
					return true;
	//   66  129:iconst_1        
	//   67  130:ireturn         
				}
			}
		}
		return false;
	//   68  131:iconst_0        
	//   69  132:ireturn         
	}

	boolean onSelectRoute(Messenger messenger, int i, int j)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          4
		if(clientrecord != null)
	//*   4    7:aload           4
	//*   5    9:ifnull          96
		{
			MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
	//    6   12:aload           4
	//    7   14:iload_3         
	//    8   15:invokevirtual   #333 <Method MediaRouteProvider$RouteController MediaRouteProviderService$ClientRecord.getRouteController(int)>
	//    9   18:astore          5
			if(routecontroller != null)
	//*  10   20:aload           5
	//*  11   22:ifnull          96
			{
				routecontroller.onSelect();
	//   12   25:aload           5
	//   13   27:invokevirtual   #352 <Method void MediaRouteProvider$RouteController.onSelect()>
				if(DEBUG)
	//*  14   30:getstatic       #40  <Field boolean DEBUG>
	//*  15   33:ifeq            89
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   16   36:new             #143 <Class StringBuilder>
	//   17   39:dup             
	//   18   40:invokespecial   #144 <Method void StringBuilder()>
	//   19   43:astore          5
					stringbuilder.append(((Object) (clientrecord)));
	//   20   45:aload           5
	//   21   47:aload           4
	//   22   49:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   23   52:pop             
					stringbuilder.append(": Route selected");
	//   24   53:aload           5
	//   25   55:ldc2            #354 <String ": Route selected">
	//   26   58:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   27   61:pop             
					stringbuilder.append(", controllerId=");
	//   28   62:aload           5
	//   29   64:ldc2            #327 <String ", controllerId=">
	//   30   67:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   31   70:pop             
					stringbuilder.append(j);
	//   32   71:aload           5
	//   33   73:iload_3         
	//   34   74:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   35   77:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   36   78:ldc1            #16  <String "MediaRouteProviderSrv">
	//   37   80:aload           5
	//   38   82:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   39   85:invokestatic    #275 <Method int Log.d(String, String)>
	//   40   88:pop             
				}
				sendGenericSuccess(messenger, i);
	//   41   89:aload_1         
	//   42   90:iload_2         
	//   43   91:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
				return true;
	//   44   94:iconst_1        
	//   45   95:ireturn         
			}
		}
		return false;
	//   46   96:iconst_0        
	//   47   97:ireturn         
	}

	boolean onSetDiscoveryRequest(Messenger messenger, int i, MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          5
		if(clientrecord != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          113
		{
			boolean flag = clientrecord.setDiscoveryRequest(mediaroutediscoveryrequest);
	//    6   12:aload           5
	//    7   14:aload_3         
	//    8   15:invokevirtual   #360 <Method boolean MediaRouteProviderService$ClientRecord.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
	//    9   18:istore          4
			if(DEBUG)
	//*  10   20:getstatic       #40  <Field boolean DEBUG>
	//*  11   23:ifeq            106
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   12   26:new             #143 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #144 <Method void StringBuilder()>
	//   15   33:astore          6
				stringbuilder.append(((Object) (clientrecord)));
	//   16   35:aload           6
	//   17   37:aload           5
	//   18   39:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   19   42:pop             
				stringbuilder.append(": Set discovery request, request=");
	//   20   43:aload           6
	//   21   45:ldc2            #362 <String ": Set discovery request, request=">
	//   22   48:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
				stringbuilder.append(((Object) (mediaroutediscoveryrequest)));
	//   24   52:aload           6
	//   25   54:aload_3         
	//   26   55:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   27   58:pop             
				stringbuilder.append(", actuallyChanged=");
	//   28   59:aload           6
	//   29   61:ldc2            #364 <String ", actuallyChanged=">
	//   30   64:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
				stringbuilder.append(flag);
	//   32   68:aload           6
	//   33   70:iload           4
	//   34   72:invokevirtual   #367 <Method StringBuilder StringBuilder.append(boolean)>
	//   35   75:pop             
				stringbuilder.append(", compositeDiscoveryRequest=");
	//   36   76:aload           6
	//   37   78:ldc2            #369 <String ", compositeDiscoveryRequest=">
	//   38   81:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   39   84:pop             
				stringbuilder.append(((Object) (mCompositeDiscoveryRequest)));
	//   40   85:aload           6
	//   41   87:aload_0         
	//   42   88:getfield        #371 <Field MediaRouteDiscoveryRequest mCompositeDiscoveryRequest>
	//   43   91:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   44   94:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   45   95:ldc1            #16  <String "MediaRouteProviderSrv">
	//   46   97:aload           6
	//   47   99:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   48  102:invokestatic    #275 <Method int Log.d(String, String)>
	//   49  105:pop             
			}
			sendGenericSuccess(messenger, i);
	//   50  106:aload_1         
	//   51  107:iload_2         
	//   52  108:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
			return true;
	//   53  111:iconst_1        
	//   54  112:ireturn         
		} else
		{
			return false;
	//   55  113:iconst_0        
	//   56  114:ireturn         
		}
	}

	boolean onSetRouteVolume(Messenger messenger, int i, int j, int k)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          5
		if(clientrecord != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          115
		{
			MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
	//    6   12:aload           5
	//    7   14:iload_3         
	//    8   15:invokevirtual   #333 <Method MediaRouteProvider$RouteController MediaRouteProviderService$ClientRecord.getRouteController(int)>
	//    9   18:astore          6
			if(routecontroller != null)
	//*  10   20:aload           6
	//*  11   22:ifnull          115
			{
				routecontroller.onSetVolume(k);
	//   12   25:aload           6
	//   13   27:iload           4
	//   14   29:invokevirtual   #377 <Method void MediaRouteProvider$RouteController.onSetVolume(int)>
				if(DEBUG)
	//*  15   32:getstatic       #40  <Field boolean DEBUG>
	//*  16   35:ifeq            108
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   17   38:new             #143 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #144 <Method void StringBuilder()>
	//   20   45:astore          6
					stringbuilder.append(((Object) (clientrecord)));
	//   21   47:aload           6
	//   22   49:aload           5
	//   23   51:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:pop             
					stringbuilder.append(": Route volume changed");
	//   25   55:aload           6
	//   26   57:ldc2            #379 <String ": Route volume changed">
	//   27   60:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
					stringbuilder.append(", controllerId=");
	//   29   64:aload           6
	//   30   66:ldc2            #327 <String ", controllerId=">
	//   31   69:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
					stringbuilder.append(j);
	//   33   73:aload           6
	//   34   75:iload_3         
	//   35   76:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   36   79:pop             
					stringbuilder.append(", volume=");
	//   37   80:aload           6
	//   38   82:ldc2            #381 <String ", volume=">
	//   39   85:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:pop             
					stringbuilder.append(k);
	//   41   89:aload           6
	//   42   91:iload           4
	//   43   93:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   44   96:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   45   97:ldc1            #16  <String "MediaRouteProviderSrv">
	//   46   99:aload           6
	//   47  101:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   48  104:invokestatic    #275 <Method int Log.d(String, String)>
	//   49  107:pop             
				}
				sendGenericSuccess(messenger, i);
	//   50  108:aload_1         
	//   51  109:iload_2         
	//   52  110:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
				return true;
	//   53  113:iconst_1        
	//   54  114:ireturn         
			}
		}
		return false;
	//   55  115:iconst_0        
	//   56  116:ireturn         
	}

	public boolean onUnbind(Intent intent)
	{
		MediaRouteProvider mediarouteprovider = mProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field MediaRouteProvider mProvider>
	//    2    4:astore_2        
		if(mediarouteprovider != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			mediarouteprovider.setCallback(((MediaRouteProvider.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #250 <Method void MediaRouteProvider.setCallback(MediaRouteProvider$Callback)>
		return super.onUnbind(intent);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #385 <Method boolean Service.onUnbind(Intent)>
	//   11   19:ireturn         
	}

	boolean onUnregisterClient(Messenger messenger, int i)
	{
		int j = findClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #133 <Method int findClient(Messenger)>
	//    3    5:istore_3        
		if(j >= 0)
	//*   4    6:iload_3         
	//*   5    7:iflt            78
		{
			ClientRecord clientrecord = (ClientRecord)mClients.remove(j);
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field ArrayList mClients>
	//    8   14:iload_3         
	//    9   15:invokevirtual   #266 <Method Object ArrayList.remove(int)>
	//   10   18:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//   11   21:astore          4
			if(DEBUG)
	//*  12   23:getstatic       #40  <Field boolean DEBUG>
	//*  13   26:ifeq            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   29:new             #143 <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #144 <Method void StringBuilder()>
	//   17   36:astore          5
				stringbuilder.append(((Object) (clientrecord)));
	//   18   38:aload           5
	//   19   40:aload           4
	//   20   42:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   21   45:pop             
				stringbuilder.append(": Unregistered");
	//   22   46:aload           5
	//   23   48:ldc2            #389 <String ": Unregistered">
	//   24   51:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   25   54:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   26   55:ldc1            #16  <String "MediaRouteProviderSrv">
	//   27   57:aload           5
	//   28   59:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #275 <Method int Log.d(String, String)>
	//   30   65:pop             
			}
			clientrecord.dispose();
	//   31   66:aload           4
	//   32   68:invokevirtual   #278 <Method void MediaRouteProviderService$ClientRecord.dispose()>
			sendGenericSuccess(messenger, i);
	//   33   71:aload_1         
	//   34   72:iload_2         
	//   35   73:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
			return true;
	//   36   76:iconst_1        
	//   37   77:ireturn         
		} else
		{
			return false;
	//   38   78:iconst_0        
	//   39   79:ireturn         
		}
	}

	boolean onUnselectRoute(Messenger messenger, int i, int j, int k)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          5
		if(clientrecord != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          98
		{
			MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
	//    6   12:aload           5
	//    7   14:iload_3         
	//    8   15:invokevirtual   #333 <Method MediaRouteProvider$RouteController MediaRouteProviderService$ClientRecord.getRouteController(int)>
	//    9   18:astore          6
			if(routecontroller != null)
	//*  10   20:aload           6
	//*  11   22:ifnull          98
			{
				routecontroller.onUnselect(k);
	//   12   25:aload           6
	//   13   27:iload           4
	//   14   29:invokevirtual   #393 <Method void MediaRouteProvider$RouteController.onUnselect(int)>
				if(DEBUG)
	//*  15   32:getstatic       #40  <Field boolean DEBUG>
	//*  16   35:ifeq            91
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   17   38:new             #143 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #144 <Method void StringBuilder()>
	//   20   45:astore          6
					stringbuilder.append(((Object) (clientrecord)));
	//   21   47:aload           6
	//   22   49:aload           5
	//   23   51:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:pop             
					stringbuilder.append(": Route unselected");
	//   25   55:aload           6
	//   26   57:ldc2            #395 <String ": Route unselected">
	//   27   60:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
					stringbuilder.append(", controllerId=");
	//   29   64:aload           6
	//   30   66:ldc2            #327 <String ", controllerId=">
	//   31   69:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
					stringbuilder.append(j);
	//   33   73:aload           6
	//   34   75:iload_3         
	//   35   76:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   36   79:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   37   80:ldc1            #16  <String "MediaRouteProviderSrv">
	//   38   82:aload           6
	//   39   84:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   40   87:invokestatic    #275 <Method int Log.d(String, String)>
	//   41   90:pop             
				}
				sendGenericSuccess(messenger, i);
	//   42   91:aload_1         
	//   43   92:iload_2         
	//   44   93:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
				return true;
	//   45   96:iconst_1        
	//   46   97:ireturn         
			}
		}
		return false;
	//   47   98:iconst_0        
	//   48   99:ireturn         
	}

	boolean onUpdateRouteVolume(Messenger messenger, int i, int j, int k)
	{
		ClientRecord clientrecord = getClient(messenger);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #282 <Method MediaRouteProviderService$ClientRecord getClient(Messenger)>
	//    3    5:astore          5
		if(clientrecord != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          115
		{
			MediaRouteProvider.RouteController routecontroller = clientrecord.getRouteController(j);
	//    6   12:aload           5
	//    7   14:iload_3         
	//    8   15:invokevirtual   #333 <Method MediaRouteProvider$RouteController MediaRouteProviderService$ClientRecord.getRouteController(int)>
	//    9   18:astore          6
			if(routecontroller != null)
	//*  10   20:aload           6
	//*  11   22:ifnull          115
			{
				routecontroller.onUpdateVolume(k);
	//   12   25:aload           6
	//   13   27:iload           4
	//   14   29:invokevirtual   #399 <Method void MediaRouteProvider$RouteController.onUpdateVolume(int)>
				if(DEBUG)
	//*  15   32:getstatic       #40  <Field boolean DEBUG>
	//*  16   35:ifeq            108
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   17   38:new             #143 <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #144 <Method void StringBuilder()>
	//   20   45:astore          6
					stringbuilder.append(((Object) (clientrecord)));
	//   21   47:aload           6
	//   22   49:aload           5
	//   23   51:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:pop             
					stringbuilder.append(": Route volume updated");
	//   25   55:aload           6
	//   26   57:ldc2            #401 <String ": Route volume updated">
	//   27   60:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   28   63:pop             
					stringbuilder.append(", controllerId=");
	//   29   64:aload           6
	//   30   66:ldc2            #327 <String ", controllerId=">
	//   31   69:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   32   72:pop             
					stringbuilder.append(j);
	//   33   73:aload           6
	//   34   75:iload_3         
	//   35   76:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   36   79:pop             
					stringbuilder.append(", delta=");
	//   37   80:aload           6
	//   38   82:ldc2            #403 <String ", delta=">
	//   39   85:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:pop             
					stringbuilder.append(k);
	//   41   89:aload           6
	//   42   91:iload           4
	//   43   93:invokevirtual   #291 <Method StringBuilder StringBuilder.append(int)>
	//   44   96:pop             
					Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   45   97:ldc1            #16  <String "MediaRouteProviderSrv">
	//   46   99:aload           6
	//   47  101:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   48  104:invokestatic    #275 <Method int Log.d(String, String)>
	//   49  107:pop             
				}
				sendGenericSuccess(messenger, i);
	//   50  108:aload_1         
	//   51  109:iload_2         
	//   52  110:invokestatic    #297 <Method void sendGenericSuccess(Messenger, int)>
				return true;
	//   53  113:iconst_1        
	//   54  114:ireturn         
			}
		}
		return false;
	//   55  115:iconst_0        
	//   56  116:ireturn         
	}

	void sendDescriptorChanged(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		int j = mClients.size();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mClients>
	//    2    4:invokevirtual   #210 <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          106
		{
			ClientRecord clientrecord = (ClientRecord)mClients.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #49  <Field ArrayList mClients>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #137 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//   14   26:astore          4
			sendReply(clientrecord.mMessenger, 5, 0, 0, ((Object) (createDescriptorBundleForClientVersion(mediarouteproviderdescriptor, clientrecord.mVersion))), ((Bundle) (null)));
	//   15   28:aload           4
	//   16   30:getfield        #407 <Field Messenger MediaRouteProviderService$ClientRecord.mMessenger>
	//   17   33:iconst_5        
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:aload_1         
	//   21   37:aload           4
	//   22   39:getfield        #316 <Field int MediaRouteProviderService$ClientRecord.mVersion>
	//   23   42:invokestatic    #318 <Method Bundle createDescriptorBundleForClientVersion(MediaRouteProviderDescriptor, int)>
	//   24   45:aconst_null     
	//   25   46:invokestatic    #167 <Method void sendReply(Messenger, int, int, int, Object, Bundle)>
			if(DEBUG)
	//*  26   49:getstatic       #40  <Field boolean DEBUG>
	//*  27   52:ifeq            99
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   28   55:new             #143 <Class StringBuilder>
	//   29   58:dup             
	//   30   59:invokespecial   #144 <Method void StringBuilder()>
	//   31   62:astore          5
				stringbuilder.append(((Object) (clientrecord)));
	//   32   64:aload           5
	//   33   66:aload           4
	//   34   68:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   35   71:pop             
				stringbuilder.append(": Sent descriptor change event, descriptor=");
	//   36   72:aload           5
	//   37   74:ldc2            #409 <String ": Sent descriptor change event, descriptor=">
	//   38   77:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
				stringbuilder.append(((Object) (mediarouteproviderdescriptor)));
	//   40   81:aload           5
	//   41   83:aload_1         
	//   42   84:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   43   87:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
	//   44   88:ldc1            #16  <String "MediaRouteProviderSrv">
	//   45   90:aload           5
	//   46   92:invokevirtual   #161 <Method String StringBuilder.toString()>
	//   47   95:invokestatic    #275 <Method int Log.d(String, String)>
	//   48   98:pop             
			}
		}

	//   49   99:iload_2         
	//   50  100:iconst_1        
	//   51  101:iadd            
	//   52  102:istore_2        
	//*  53  103:goto            10
	//   54  106:return          
	}

	boolean updateCompositeDiscoveryRequest()
	{
		int j = mClients.size();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field ArrayList mClients>
	//    2    4:invokevirtual   #210 <Method int ArrayList.size()>
	//    3    7:istore_2        
		MediaRouteSelector.Builder builder = null;
	//    4    8:aconst_null     
	//    5    9:astore          5
		Object obj = ((Object) (builder));
	//    6   11:aload           5
	//    7   13:astore          6
		int i = 0;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		boolean flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		while(i < j) 
	//*  12   19:iload_1         
	//*  13   20:iload_2         
	//*  14   21:icmpge          167
		{
			boolean flag1;
			MediaRouteSelector.Builder builder1;
			Object obj1;
label0:
			{
				MediaRouteDiscoveryRequest mediaroutediscoveryrequest = ((ClientRecord)mClients.get(i)).mDiscoveryRequest;
	//   15   24:aload_0         
	//   16   25:getfield        #49  <Field ArrayList mClients>
	//   17   28:iload_1         
	//   18   29:invokevirtual   #137 <Method Object ArrayList.get(int)>
	//   19   32:checkcast       #139 <Class MediaRouteProviderService$ClientRecord>
	//   20   35:getfield        #413 <Field MediaRouteDiscoveryRequest MediaRouteProviderService$ClientRecord.mDiscoveryRequest>
	//   21   38:astore          9
				builder1 = builder;
	//   22   40:aload           5
	//   23   42:astore          7
				flag1 = flag;
	//   24   44:iload_3         
	//   25   45:istore          4
				obj1 = obj;
	//   26   47:aload           6
	//   27   49:astore          8
				if(mediaroutediscoveryrequest == null)
					break label0;
	//   28   51:aload           9
	//   29   53:ifnull          149
				if(mediaroutediscoveryrequest.getSelector().isEmpty())
	//*  30   56:aload           9
	//*  31   58:invokevirtual   #419 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//*  32   61:invokevirtual   #424 <Method boolean MediaRouteSelector.isEmpty()>
	//*  33   64:ifeq            86
				{
					builder1 = builder;
	//   34   67:aload           5
	//   35   69:astore          7
					flag1 = flag;
	//   36   71:iload_3         
	//   37   72:istore          4
					obj1 = obj;
	//   38   74:aload           6
	//   39   76:astore          8
					if(!mediaroutediscoveryrequest.isActiveScan())
						break label0;
	//   40   78:aload           9
	//   41   80:invokevirtual   #427 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
	//   42   83:ifeq            149
				}
				flag1 = flag | mediaroutediscoveryrequest.isActiveScan();
	//   43   86:iload_3         
	//   44   87:aload           9
	//   45   89:invokevirtual   #427 <Method boolean MediaRouteDiscoveryRequest.isActiveScan()>
	//   46   92:ior             
	//   47   93:istore          4
				if(obj == null)
	//*  48   95:aload           6
	//*  49   97:ifnonnull       111
				{
					obj1 = ((Object) (mediaroutediscoveryrequest));
	//   50  100:aload           9
	//   51  102:astore          8
					builder1 = builder;
	//   52  104:aload           5
	//   53  106:astore          7
				} else
	//*  54  108:goto            149
				{
					builder1 = builder;
	//   55  111:aload           5
	//   56  113:astore          7
					if(builder == null)
	//*  57  115:aload           5
	//*  58  117:ifnonnull       134
						builder1 = new MediaRouteSelector.Builder(((MediaRouteDiscoveryRequest) (obj)).getSelector());
	//   59  120:new             #429 <Class MediaRouteSelector$Builder>
	//   60  123:dup             
	//   61  124:aload           6
	//   62  126:invokevirtual   #419 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//   63  129:invokespecial   #432 <Method void MediaRouteSelector$Builder(MediaRouteSelector)>
	//   64  132:astore          7
					builder1.addSelector(mediaroutediscoveryrequest.getSelector());
	//   65  134:aload           7
	//   66  136:aload           9
	//   67  138:invokevirtual   #419 <Method MediaRouteSelector MediaRouteDiscoveryRequest.getSelector()>
	//   68  141:invokevirtual   #436 <Method MediaRouteSelector$Builder MediaRouteSelector$Builder.addSelector(MediaRouteSelector)>
	//   69  144:pop             
					obj1 = obj;
	//   70  145:aload           6
	//   71  147:astore          8
				}
			}
			i++;
	//   72  149:iload_1         
	//   73  150:iconst_1        
	//   74  151:iadd            
	//   75  152:istore_1        
			builder = builder1;
	//   76  153:aload           7
	//   77  155:astore          5
			flag = flag1;
	//   78  157:iload           4
	//   79  159:istore_3        
			obj = obj1;
	//   80  160:aload           8
	//   81  162:astore          6
		}
	//*  82  164:goto            19
		if(builder != null)
	//*  83  167:aload           5
	//*  84  169:ifnull          187
			obj = ((Object) (new MediaRouteDiscoveryRequest(builder.build(), flag)));
	//   85  172:new             #415 <Class MediaRouteDiscoveryRequest>
	//   86  175:dup             
	//   87  176:aload           5
	//   88  178:invokevirtual   #438 <Method MediaRouteSelector MediaRouteSelector$Builder.build()>
	//   89  181:iload_3         
	//   90  182:invokespecial   #441 <Method void MediaRouteDiscoveryRequest(MediaRouteSelector, boolean)>
	//   91  185:astore          6
		if(!p.a(((Object) (mCompositeDiscoveryRequest)), obj))
	//*  92  187:aload_0         
	//*  93  188:getfield        #371 <Field MediaRouteDiscoveryRequest mCompositeDiscoveryRequest>
	//*  94  191:aload           6
	//*  95  193:invokestatic    #447 <Method boolean p.a(Object, Object)>
	//*  96  196:ifne            216
		{
			mCompositeDiscoveryRequest = ((MediaRouteDiscoveryRequest) (obj));
	//   97  199:aload_0         
	//   98  200:aload           6
	//   99  202:putfield        #371 <Field MediaRouteDiscoveryRequest mCompositeDiscoveryRequest>
			mProvider.setDiscoveryRequest(((MediaRouteDiscoveryRequest) (obj)));
	//  100  205:aload_0         
	//  101  206:getfield        #218 <Field MediaRouteProvider mProvider>
	//  102  209:aload           6
	//  103  211:invokevirtual   #450 <Method void MediaRouteProvider.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
			return true;
	//  104  214:iconst_1        
	//  105  215:ireturn         
		} else
		{
			return false;
	//  106  216:iconst_0        
	//  107  217:ireturn         
		}
	}

	static final boolean DEBUG = Log.isLoggable("MediaRouteProviderSrv", 3);
	static final int PRIVATE_MSG_CLIENT_DIED = 1;
	public static final String SERVICE_INTERFACE = "android.media.MediaRouteProviderService";
	static final String TAG = "MediaRouteProviderSrv";
	private final ArrayList mClients = new ArrayList();
	private MediaRouteDiscoveryRequest mCompositeDiscoveryRequest;
	final PrivateHandler mPrivateHandler = new PrivateHandler();
	MediaRouteProvider mProvider;
	private final ProviderCallback mProviderCallback = new ProviderCallback();
	private final ReceiveHandler mReceiveHandler = new ReceiveHandler();
	private final Messenger mReceiveMessenger;

	static 
	{
	//    0    0:ldc1            #16  <String "MediaRouteProviderSrv">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #38  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #40  <Field boolean DEBUG>
	//*   4    9:return          
	}

	private class ReceiveHandler extends Handler
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
		//		               1 297
		//		               2 289
		//		               3 252
		//		               4 242
		//		               5 232
		//		               6 201
		//		               7 177
		//		               8 153
		//		               9 130
		//		               10 78
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

		public ReceiveHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Handler()>
			mServiceRef = new WeakReference(((Object) (MediaRouteProviderService.this)));
		//    2    4:aload_0         
		//    3    5:new             #13  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
		//    7   13:putfield        #18  <Field WeakReference mServiceRef>
		//    8   16:return          
		}
	}


	private class PrivateHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			if(message.what != 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpeq          9
			{
				return;
		//    4    8:return          
			} else
			{
				onBinderDied((Messenger)message.obj);
		//    5    9:aload_0         
		//    6   10:getfield        #10  <Field MediaRouteProviderService this$0>
		//    7   13:aload_1         
		//    8   14:getfield        #26  <Field Object Message.obj>
		//    9   17:checkcast       #28  <Class Messenger>
		//   10   20:invokevirtual   #34  <Method void MediaRouteProviderService.onBinderDied(Messenger)>
				return;
		//   11   23:return          
			}
		}

		final MediaRouteProviderService this$0;

		PrivateHandler()
		{
			this$0 = MediaRouteProviderService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteProviderService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void Handler()>
		//    5    9:return          
		}
	}


	private class ProviderCallback extends MediaRouteProvider.Callback
	{

		public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
		{
			sendDescriptorChanged(mediarouteproviderdescriptor);
		//    0    0:aload_0         
		//    1    1:getfield        #10  <Field MediaRouteProviderService this$0>
		//    2    4:aload_2         
		//    3    5:invokevirtual   #22  <Method void MediaRouteProviderService.sendDescriptorChanged(MediaRouteProviderDescriptor)>
		//    4    8:return          
		}

		final MediaRouteProviderService this$0;

		ProviderCallback()
		{
			this$0 = MediaRouteProviderService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #10  <Field MediaRouteProviderService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void MediaRouteProvider$Callback()>
		//    5    9:return          
		}
	}


	private class ClientRecord
		implements android.os.IBinder.DeathRecipient
	{

		public void binderDied()
		{
			mPrivateHandler.obtainMessage(1, ((Object) (mMessenger))).sendToTarget();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field MediaRouteProviderService this$0>
		//    2    4:getfield        #40  <Field MediaRouteProviderService$PrivateHandler MediaRouteProviderService.mPrivateHandler>
		//    3    7:iconst_1        
		//    4    8:aload_0         
		//    5    9:getfield        #30  <Field Messenger mMessenger>
		//    6   12:invokevirtual   #46  <Method Message MediaRouteProviderService$PrivateHandler.obtainMessage(int, Object)>
		//    7   15:invokevirtual   #51  <Method void Message.sendToTarget()>
		//    8   18:return          
		}

		public boolean createRouteController(String s, String s1, int i)
		{
			if(mControllers.indexOfKey(i) < 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field SparseArray mControllers>
		//*   2    4:iload_3         
		//*   3    5:invokevirtual   #57  <Method int SparseArray.indexOfKey(int)>
		//*   4    8:ifge            58
			{
				if(s1 == null)
		//*   5   11:aload_2         
		//*   6   12:ifnonnull       30
					s = ((String) (mProvider.onCreateRouteController(s)));
		//    7   15:aload_0         
		//    8   16:getfield        #20  <Field MediaRouteProviderService this$0>
		//    9   19:getfield        #61  <Field MediaRouteProvider MediaRouteProviderService.mProvider>
		//   10   22:aload_1         
		//   11   23:invokevirtual   #67  <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String)>
		//   12   26:astore_1        
				else
		//*  13   27:goto            43
					s = ((String) (mProvider.onCreateRouteController(s, s1)));
		//   14   30:aload_0         
		//   15   31:getfield        #20  <Field MediaRouteProviderService this$0>
		//   16   34:getfield        #61  <Field MediaRouteProvider MediaRouteProviderService.mProvider>
		//   17   37:aload_1         
		//   18   38:aload_2         
		//   19   39:invokevirtual   #70  <Method MediaRouteProvider$RouteController MediaRouteProvider.onCreateRouteController(String, String)>
		//   20   42:astore_1        
				if(s != null)
		//*  21   43:aload_1         
		//*  22   44:ifnull          58
				{
					mControllers.put(i, ((Object) (s)));
		//   23   47:aload_0         
		//   24   48:getfield        #28  <Field SparseArray mControllers>
		//   25   51:iload_3         
		//   26   52:aload_1         
		//   27   53:invokevirtual   #74  <Method void SparseArray.put(int, Object)>
					return true;
		//   28   56:iconst_1        
		//   29   57:ireturn         
				}
			}
			return false;
		//   30   58:iconst_0        
		//   31   59:ireturn         
		}

		public void dispose()
		{
			int j = mControllers.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArray mControllers>
		//    2    4:invokevirtual   #79  <Method int SparseArray.size()>
		//    3    7:istore_2        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          36
				((MediaRouteProvider.RouteController)mControllers.valueAt(i)).onRelease();
		//    9   15:aload_0         
		//   10   16:getfield        #28  <Field SparseArray mControllers>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #83  <Method Object SparseArray.valueAt(int)>
		//   13   23:checkcast       #85  <Class MediaRouteProvider$RouteController>
		//   14   26:invokevirtual   #88  <Method void MediaRouteProvider$RouteController.onRelease()>

		//   15   29:iload_1         
		//   16   30:iconst_1        
		//   17   31:iadd            
		//   18   32:istore_1        
		//*  19   33:goto            10
			mControllers.clear();
		//   20   36:aload_0         
		//   21   37:getfield        #28  <Field SparseArray mControllers>
		//   22   40:invokevirtual   #91  <Method void SparseArray.clear()>
			mMessenger.getBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
		//   23   43:aload_0         
		//   24   44:getfield        #30  <Field Messenger mMessenger>
		//   25   47:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
		//   26   50:aload_0         
		//   27   51:iconst_0        
		//   28   52:invokeinterface #103 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   29   57:pop             
			setDiscoveryRequest(((MediaRouteDiscoveryRequest) (null)));
		//   30   58:aload_0         
		//   31   59:aconst_null     
		//   32   60:invokevirtual   #107 <Method boolean setDiscoveryRequest(MediaRouteDiscoveryRequest)>
		//   33   63:pop             
		//   34   64:return          
		}

		public MediaRouteProvider.RouteController getRouteController(int i)
		{
			return (MediaRouteProvider.RouteController)mControllers.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArray mControllers>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #112 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #85  <Class MediaRouteProvider$RouteController>
		//    5   11:areturn         
		}

		public boolean hasMessenger(Messenger messenger)
		{
			return mMessenger.getBinder() == messenger.getBinder();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Messenger mMessenger>
		//    2    4:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
		//    5   11:if_acmpne       16
		//    6   14:iconst_1        
		//    7   15:ireturn         
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public boolean register()
		{
			RemoteException remoteexception;
			try
			{
				mMessenger.getBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Messenger mMessenger>
		//    2    4:invokevirtual   #97  <Method IBinder Messenger.getBinder()>
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:invokeinterface #122 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			}
		//*   6   14:iconst_1        
		//*   7   15:ireturn         
		//*   8   16:aload_0         
		//*   9   17:invokevirtual   #124 <Method void binderDied()>
		//*  10   20:iconst_0        
		//*  11   21:ireturn         
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				binderDied();
				return false;
			}
			return true;
		//*  12   22:astore_1        
		//*  13   23:goto            16
		}

		public boolean releaseRouteController(int i)
		{
			MediaRouteProvider.RouteController routecontroller = (MediaRouteProvider.RouteController)mControllers.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArray mControllers>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #112 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #85  <Class MediaRouteProvider$RouteController>
		//    5   11:astore_2        
			if(routecontroller != null)
		//*   6   12:aload_2         
		//*   7   13:ifnull          30
			{
				mControllers.remove(i);
		//    8   16:aload_0         
		//    9   17:getfield        #28  <Field SparseArray mControllers>
		//   10   20:iload_1         
		//   11   21:invokevirtual   #130 <Method void SparseArray.remove(int)>
				routecontroller.onRelease();
		//   12   24:aload_2         
		//   13   25:invokevirtual   #88  <Method void MediaRouteProvider$RouteController.onRelease()>
				return true;
		//   14   28:iconst_1        
		//   15   29:ireturn         
			} else
			{
				return false;
		//   16   30:iconst_0        
		//   17   31:ireturn         
			}
		}

		public boolean setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
		{
			if(!p.a(((Object) (mDiscoveryRequest)), ((Object) (mediaroutediscoveryrequest))))
		//*   0    0:aload_0         
		//*   1    1:getfield        #132 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		//*   2    4:aload_1         
		//*   3    5:invokestatic    #138 <Method boolean p.a(Object, Object)>
		//*   4    8:ifne            24
			{
				mDiscoveryRequest = mediaroutediscoveryrequest;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #132 <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
				return updateCompositeDiscoveryRequest();
		//    8   16:aload_0         
		//    9   17:getfield        #20  <Field MediaRouteProviderService this$0>
		//   10   20:invokevirtual   #141 <Method boolean MediaRouteProviderService.updateCompositeDiscoveryRequest()>
		//   11   23:ireturn         
			} else
			{
				return false;
		//   12   24:iconst_0        
		//   13   25:ireturn         
			}
		}

		public String toString()
		{
			return MediaRouteProviderService.getClientId(mMessenger);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field Messenger mMessenger>
		//    2    4:invokestatic    #147 <Method String MediaRouteProviderService.getClientId(Messenger)>
		//    3    7:areturn         
		}

		private final SparseArray mControllers = new SparseArray();
		public MediaRouteDiscoveryRequest mDiscoveryRequest;
		public final Messenger mMessenger;
		public final int mVersion;
		final MediaRouteProviderService this$0;

		public ClientRecord(Messenger messenger, int i)
		{
			this$0 = MediaRouteProviderService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field MediaRouteProviderService this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #25  <Class SparseArray>
		//    7   13:dup             
		//    8   14:invokespecial   #26  <Method void SparseArray()>
		//    9   17:putfield        #28  <Field SparseArray mControllers>
			mMessenger = messenger;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #30  <Field Messenger mMessenger>
			mVersion = i;
		//   13   25:aload_0         
		//   14   26:iload_3         
		//   15   27:putfield        #32  <Field int mVersion>
		//   16   30:return          
		}
	}


	private class _cls1 extends MediaRouter.ControlRequestCallback
	{

		public void onError(String s, Bundle bundle)
		{
			if(MediaRouteProviderService.DEBUG)
		//*   0    0:getstatic       #41  <Field boolean MediaRouteProviderService.DEBUG>
		//*   1    3:ifeq            98
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #43  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #44  <Method void StringBuilder()>
		//    5   13:astore_3        
				stringbuilder.append(((Object) (client)));
		//    6   14:aload_3         
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
		//    9   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   10   22:pop             
				stringbuilder.append(": Route control request failed");
		//   11   23:aload_3         
		//   12   24:ldc1            #50  <String ": Route control request failed">
		//   13   26:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   14   29:pop             
				stringbuilder.append(", controllerId=");
		//   15   30:aload_3         
		//   16   31:ldc1            #55  <String ", controllerId=">
		//   17   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
				stringbuilder.append(controllerId);
		//   19   37:aload_3         
		//   20   38:aload_0         
		//   21   39:getfield        #23  <Field int val$controllerId>
		//   22   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   23   45:pop             
				stringbuilder.append(", intent=");
		//   24   46:aload_3         
		//   25   47:ldc1            #60  <String ", intent=">
		//   26   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   27   52:pop             
				stringbuilder.append(((Object) (intent)));
		//   28   53:aload_3         
		//   29   54:aload_0         
		//   30   55:getfield        #25  <Field Intent val$intent>
		//   31   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   32   61:pop             
				stringbuilder.append(", error=");
		//   33   62:aload_3         
		//   34   63:ldc1            #62  <String ", error=">
		//   35   65:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   36   68:pop             
				stringbuilder.append(s);
		//   37   69:aload_3         
		//   38   70:aload_1         
		//   39   71:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
				stringbuilder.append(", data=");
		//   41   75:aload_3         
		//   42   76:ldc1            #64  <String ", data=">
		//   43   78:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   44   81:pop             
				stringbuilder.append(((Object) (bundle)));
		//   45   82:aload_3         
		//   46   83:aload_2         
		//   47   84:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   48   87:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
		//   49   88:ldc1            #66  <String "MediaRouteProviderSrv">
		//   50   90:aload_3         
		//   51   91:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   52   94:invokestatic    #76  <Method int Log.d(String, String)>
		//   53   97:pop             
			}
			if(findClient(messenger) >= 0)
		//*  54   98:aload_0         
		//*  55   99:getfield        #19  <Field MediaRouteProviderService this$0>
		//*  56  102:aload_0         
		//*  57  103:getfield        #27  <Field Messenger val$messenger>
		//*  58  106:invokevirtual   #80  <Method int MediaRouteProviderService.findClient(Messenger)>
		//*  59  109:iflt            162
			{
				if(s != null)
		//*  60  112:aload_1         
		//*  61  113:ifnull          147
				{
					Bundle bundle1 = new Bundle();
		//   62  116:new             #82  <Class Bundle>
		//   63  119:dup             
		//   64  120:invokespecial   #83  <Method void Bundle()>
		//   65  123:astore_3        
					bundle1.putString("error", s);
		//   66  124:aload_3         
		//   67  125:ldc1            #85  <String "error">
		//   68  127:aload_1         
		//   69  128:invokevirtual   #89  <Method void Bundle.putString(String, String)>
					MediaRouteProviderService.sendReply(messenger, 4, requestId, 0, ((Object) (bundle)), bundle1);
		//   70  131:aload_0         
		//   71  132:getfield        #27  <Field Messenger val$messenger>
		//   72  135:iconst_4        
		//   73  136:aload_0         
		//   74  137:getfield        #29  <Field int val$requestId>
		//   75  140:iconst_0        
		//   76  141:aload_2         
		//   77  142:aload_3         
		//   78  143:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
					return;
		//   79  146:return          
				}
				MediaRouteProviderService.sendReply(messenger, 4, requestId, 0, ((Object) (bundle)), ((Bundle) (null)));
		//   80  147:aload_0         
		//   81  148:getfield        #27  <Field Messenger val$messenger>
		//   82  151:iconst_4        
		//   83  152:aload_0         
		//   84  153:getfield        #29  <Field int val$requestId>
		//   85  156:iconst_0        
		//   86  157:aload_2         
		//   87  158:aconst_null     
		//   88  159:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
			}
		//   89  162:return          
		}

		public void onResult(Bundle bundle)
		{
			if(MediaRouteProviderService.DEBUG)
		//*   0    0:getstatic       #41  <Field boolean MediaRouteProviderService.DEBUG>
		//*   1    3:ifeq            85
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #43  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #44  <Method void StringBuilder()>
		//    5   13:astore_2        
				stringbuilder.append(((Object) (client)));
		//    6   14:aload_2         
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
		//    9   19:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   10   22:pop             
				stringbuilder.append(": Route control request succeeded");
		//   11   23:aload_2         
		//   12   24:ldc1            #97  <String ": Route control request succeeded">
		//   13   26:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   14   29:pop             
				stringbuilder.append(", controllerId=");
		//   15   30:aload_2         
		//   16   31:ldc1            #55  <String ", controllerId=">
		//   17   33:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
				stringbuilder.append(controllerId);
		//   19   37:aload_2         
		//   20   38:aload_0         
		//   21   39:getfield        #23  <Field int val$controllerId>
		//   22   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(int)>
		//   23   45:pop             
				stringbuilder.append(", intent=");
		//   24   46:aload_2         
		//   25   47:ldc1            #60  <String ", intent=">
		//   26   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   27   52:pop             
				stringbuilder.append(((Object) (intent)));
		//   28   53:aload_2         
		//   29   54:aload_0         
		//   30   55:getfield        #25  <Field Intent val$intent>
		//   31   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   32   61:pop             
				stringbuilder.append(", data=");
		//   33   62:aload_2         
		//   34   63:ldc1            #64  <String ", data=">
		//   35   65:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
		//   36   68:pop             
				stringbuilder.append(((Object) (bundle)));
		//   37   69:aload_2         
		//   38   70:aload_1         
		//   39   71:invokevirtual   #48  <Method StringBuilder StringBuilder.append(Object)>
		//   40   74:pop             
				Log.d("MediaRouteProviderSrv", stringbuilder.toString());
		//   41   75:ldc1            #66  <String "MediaRouteProviderSrv">
		//   42   77:aload_2         
		//   43   78:invokevirtual   #70  <Method String StringBuilder.toString()>
		//   44   81:invokestatic    #76  <Method int Log.d(String, String)>
		//   45   84:pop             
			}
			if(findClient(messenger) >= 0)
		//*  46   85:aload_0         
		//*  47   86:getfield        #19  <Field MediaRouteProviderService this$0>
		//*  48   89:aload_0         
		//*  49   90:getfield        #27  <Field Messenger val$messenger>
		//*  50   93:invokevirtual   #80  <Method int MediaRouteProviderService.findClient(Messenger)>
		//*  51   96:iflt            114
				MediaRouteProviderService.sendReply(messenger, 3, requestId, 0, ((Object) (bundle)), ((Bundle) (null)));
		//   52   99:aload_0         
		//   53  100:getfield        #27  <Field Messenger val$messenger>
		//   54  103:iconst_3        
		//   55  104:aload_0         
		//   56  105:getfield        #29  <Field int val$requestId>
		//   57  108:iconst_0        
		//   58  109:aload_1         
		//   59  110:aconst_null     
		//   60  111:invokestatic    #93  <Method void MediaRouteProviderService.sendReply(Messenger, int, int, int, Object, Bundle)>
		//   61  114:return          
		}

		final MediaRouteProviderService this$0;
		final ClientRecord val$client;
		final int val$controllerId;
		final Intent val$intent;
		final Messenger val$messenger;
		final int val$requestId;

		_cls1()
		{
			this$0 = MediaRouteProviderService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field MediaRouteProviderService this$0>
			client = clientrecord;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #21  <Field MediaRouteProviderService$ClientRecord val$client>
			controllerId = i;
		//    6   10:aload_0         
		//    7   11:iload_3         
		//    8   12:putfield        #23  <Field int val$controllerId>
			intent = intent1;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #25  <Field Intent val$intent>
			messenger = messenger1;
		//   12   21:aload_0         
		//   13   22:aload           5
		//   14   24:putfield        #27  <Field Messenger val$messenger>
			requestId = j;
		//   15   27:aload_0         
		//   16   28:iload           6
		//   17   30:putfield        #29  <Field int val$requestId>
			super();
		//   18   33:aload_0         
		//   19   34:invokespecial   #32  <Method void MediaRouter$ControlRequestCallback()>
		//   20   37:return          
		}
	}

}
