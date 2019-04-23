// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//			MediaRouteProvider, MediaRouteProviderDescriptor, MediaRouteDescriptor, MediaRouteProviderProtocol, 
//			MediaRouteDiscoveryRequest

final class RegisteredMediaRouteProvider extends MediaRouteProvider
	implements ServiceConnection
{

	public RegisteredMediaRouteProvider(Context context, ComponentName componentname)
	{
		super(context, new MediaRouteProvider.ProviderMetadata(componentname));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #38  <Class MediaRouteProvider$ProviderMetadata>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #41  <Method void MediaRouteProvider$ProviderMetadata(ComponentName)>
	//    6   10:invokespecial   #44  <Method void MediaRouteProvider(Context, MediaRouteProvider$ProviderMetadata)>
	//    7   13:aload_0         
	//    8   14:new             #46  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #48  <Method void ArrayList()>
	//   11   21:putfield        #50  <Field ArrayList mControllers>
		mComponentName = componentname;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #52  <Field ComponentName mComponentName>
	//   15   29:aload_0         
	//   16   30:new             #54  <Class RegisteredMediaRouteProvider$PrivateHandler>
	//   17   33:dup             
	//   18   34:invokespecial   #55  <Method void RegisteredMediaRouteProvider$PrivateHandler()>
	//   19   37:putfield        #57  <Field RegisteredMediaRouteProvider$PrivateHandler mPrivateHandler>
	//   20   40:return          
	}

	private void attachControllersToConnection()
	{
		int j = mControllers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ArrayList mControllers>
	//    2    4:invokevirtual   #62  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          40
			((Controller)mControllers.get(i)).attachConnection(mActiveConnection);
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field ArrayList mControllers>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #66  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #68  <Class RegisteredMediaRouteProvider$Controller>
	//   14   26:aload_0         
	//   15   27:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//   16   30:invokevirtual   #74  <Method void RegisteredMediaRouteProvider$Controller.attachConnection(RegisteredMediaRouteProvider$Connection)>

	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:iadd            
	//   20   36:istore_1        
	//*  21   37:goto            10
	//   22   40:return          
	}

	private void bind()
	{
		if(!mBound)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mBound>
	//*   2    4:ifne            161
		{
			if(DEBUG)
	//*   3    7:getstatic       #33  <Field boolean DEBUG>
	//*   4   10:ifeq            44
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #81  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #82  <Method void StringBuilder()>
	//    8   20:astore_1        
				stringbuilder.append(((Object) (this)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:pop             
				stringbuilder.append(": Binding");
	//   13   27:aload_1         
	//   14   28:ldc1            #88  <String ": Binding">
	//   15   30:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
				Log.d("MediaRouteProviderProxy", stringbuilder.toString());
	//   17   34:ldc1            #12  <String "MediaRouteProviderProxy">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #99  <Method int Log.d(String, String)>
	//   21   43:pop             
			}
			Intent intent = new Intent("android.media.MediaRouteProviderService");
	//   22   44:new             #101 <Class Intent>
	//   23   47:dup             
	//   24   48:ldc1            #103 <String "android.media.MediaRouteProviderService">
	//   25   50:invokespecial   #106 <Method void Intent(String)>
	//   26   53:astore_1        
			intent.setComponent(mComponentName);
	//   27   54:aload_1         
	//   28   55:aload_0         
	//   29   56:getfield        #52  <Field ComponentName mComponentName>
	//   30   59:invokevirtual   #110 <Method Intent Intent.setComponent(ComponentName)>
	//   31   62:pop             
			try
			{
				mBound = getContext().bindService(intent, ((ServiceConnection) (this)), 1);
	//   32   63:aload_0         
	//   33   64:aload_0         
	//   34   65:invokevirtual   #114 <Method Context getContext()>
	//   35   68:aload_1         
	//   36   69:aload_0         
	//   37   70:iconst_1        
	//   38   71:invokevirtual   #120 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//   39   74:putfield        #79  <Field boolean mBound>
				if(!mBound && DEBUG)
	//*  40   77:aload_0         
	//*  41   78:getfield        #79  <Field boolean mBound>
	//*  42   81:ifne            161
	//*  43   84:getstatic       #33  <Field boolean DEBUG>
	//*  44   87:ifeq            161
				{
					StringBuilder stringbuilder1 = new StringBuilder();
	//   45   90:new             #81  <Class StringBuilder>
	//   46   93:dup             
	//   47   94:invokespecial   #82  <Method void StringBuilder()>
	//   48   97:astore_1        
					stringbuilder1.append(((Object) (this)));
	//   49   98:aload_1         
	//   50   99:aload_0         
	//   51  100:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   52  103:pop             
					stringbuilder1.append(": Bind failed");
	//   53  104:aload_1         
	//   54  105:ldc1            #122 <String ": Bind failed">
	//   55  107:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
					Log.d("MediaRouteProviderProxy", stringbuilder1.toString());
	//   57  111:ldc1            #12  <String "MediaRouteProviderProxy">
	//   58  113:aload_1         
	//   59  114:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   60  117:invokestatic    #99  <Method int Log.d(String, String)>
	//   61  120:pop             
					return;
	//   62  121:return          
				}
			}
			catch(SecurityException securityexception)
	//*  63  122:astore_1        
			{
				if(DEBUG)
	//*  64  123:getstatic       #33  <Field boolean DEBUG>
	//*  65  126:ifeq            161
				{
					StringBuilder stringbuilder2 = new StringBuilder();
	//   66  129:new             #81  <Class StringBuilder>
	//   67  132:dup             
	//   68  133:invokespecial   #82  <Method void StringBuilder()>
	//   69  136:astore_2        
					stringbuilder2.append(((Object) (this)));
	//   70  137:aload_2         
	//   71  138:aload_0         
	//   72  139:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   73  142:pop             
					stringbuilder2.append(": Bind failed");
	//   74  143:aload_2         
	//   75  144:ldc1            #122 <String ": Bind failed">
	//   76  146:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   77  149:pop             
					Log.d("MediaRouteProviderProxy", stringbuilder2.toString(), ((Throwable) (securityexception)));
	//   78  150:ldc1            #12  <String "MediaRouteProviderProxy">
	//   79  152:aload_2         
	//   80  153:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   81  156:aload_1         
	//   82  157:invokestatic    #125 <Method int Log.d(String, String, Throwable)>
	//   83  160:pop             
				}
			}
		}
	//   84  161:return          
	}

	private MediaRouteProvider.RouteController createRouteController(String s, String s1)
	{
		Object obj = ((Object) (getDescriptor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method MediaRouteProviderDescriptor getDescriptor()>
	//    2    4:astore          5
		if(obj != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          104
		{
			obj = ((Object) (((MediaRouteProviderDescriptor) (obj)).getRoutes()));
	//    5   11:aload           5
	//    6   13:invokevirtual   #137 <Method List MediaRouteProviderDescriptor.getRoutes()>
	//    7   16:astore          5
			int j = ((List) (obj)).size();
	//    8   18:aload           5
	//    9   20:invokeinterface #140 <Method int List.size()>
	//   10   25:istore          4
			for(int i = 0; i < j; i++)
	//*  11   27:iconst_0        
	//*  12   28:istore_3        
	//*  13   29:iload_3         
	//*  14   30:iload           4
	//*  15   32:icmpge          104
				if(((MediaRouteDescriptor)((List) (obj)).get(i)).getId().equals(((Object) (s))))
	//*  16   35:aload           5
	//*  17   37:iload_3         
	//*  18   38:invokeinterface #141 <Method Object List.get(int)>
	//*  19   43:checkcast       #143 <Class MediaRouteDescriptor>
	//*  20   46:invokevirtual   #146 <Method String MediaRouteDescriptor.getId()>
	//*  21   49:aload_1         
	//*  22   50:invokevirtual   #152 <Method boolean String.equals(Object)>
	//*  23   53:ifeq            97
				{
					s = ((String) (new Controller(s, s1)));
	//   24   56:new             #68  <Class RegisteredMediaRouteProvider$Controller>
	//   25   59:dup             
	//   26   60:aload_0         
	//   27   61:aload_1         
	//   28   62:aload_2         
	//   29   63:invokespecial   #155 <Method void RegisteredMediaRouteProvider$Controller(RegisteredMediaRouteProvider, String, String)>
	//   30   66:astore_1        
					mControllers.add(((Object) (s)));
	//   31   67:aload_0         
	//   32   68:getfield        #50  <Field ArrayList mControllers>
	//   33   71:aload_1         
	//   34   72:invokevirtual   #158 <Method boolean ArrayList.add(Object)>
	//   35   75:pop             
					if(mConnectionReady)
	//*  36   76:aload_0         
	//*  37   77:getfield        #160 <Field boolean mConnectionReady>
	//*  38   80:ifeq            91
						((Controller) (s)).attachConnection(mActiveConnection);
	//   39   83:aload_1         
	//   40   84:aload_0         
	//   41   85:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//   42   88:invokevirtual   #74  <Method void RegisteredMediaRouteProvider$Controller.attachConnection(RegisteredMediaRouteProvider$Connection)>
					updateBinding();
	//   43   91:aload_0         
	//   44   92:invokespecial   #163 <Method void updateBinding()>
					return ((MediaRouteProvider.RouteController) (s));
	//   45   95:aload_1         
	//   46   96:areturn         
				}

	//   47   97:iload_3         
	//   48   98:iconst_1        
	//   49   99:iadd            
	//   50  100:istore_3        
		}
	//*  51  101:goto            29
		return null;
	//   52  104:aconst_null     
	//   53  105:areturn         
	}

	private void detachControllersFromConnection()
	{
		int j = mControllers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ArrayList mControllers>
	//    2    4:invokevirtual   #62  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((Controller)mControllers.get(i)).detachConnection();
	//    9   15:aload_0         
	//   10   16:getfield        #50  <Field ArrayList mControllers>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #66  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #68  <Class RegisteredMediaRouteProvider$Controller>
	//   14   26:invokevirtual   #167 <Method void RegisteredMediaRouteProvider$Controller.detachConnection()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private void disconnect()
	{
		if(mActiveConnection != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:ifnull          33
		{
			setDescriptor(((MediaRouteProviderDescriptor) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #172 <Method void setDescriptor(MediaRouteProviderDescriptor)>
			mConnectionReady = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #160 <Field boolean mConnectionReady>
			detachControllersFromConnection();
	//    9   17:aload_0         
	//   10   18:invokespecial   #174 <Method void detachControllersFromConnection()>
			mActiveConnection.dispose();
	//   11   21:aload_0         
	//   12   22:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//   13   25:invokevirtual   #179 <Method void RegisteredMediaRouteProvider$Connection.dispose()>
			mActiveConnection = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
		}
	//   17   33:return          
	}

	private boolean shouldBind()
	{
		if(mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field boolean mStarted>
	//*   2    4:ifeq            28
		{
			if(getDiscoveryRequest() != null)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #187 <Method MediaRouteDiscoveryRequest getDiscoveryRequest()>
	//*   5   11:ifnull          16
				return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
			if(!mControllers.isEmpty())
	//*   8   16:aload_0         
	//*   9   17:getfield        #50  <Field ArrayList mControllers>
	//*  10   20:invokevirtual   #190 <Method boolean ArrayList.isEmpty()>
	//*  11   23:ifne            28
				return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private void unbind()
	{
		if(mBound)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean mBound>
	//*   2    4:ifeq            61
		{
			if(DEBUG)
	//*   3    7:getstatic       #33  <Field boolean DEBUG>
	//*   4   10:ifeq            44
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #81  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #82  <Method void StringBuilder()>
	//    8   20:astore_1        
				stringbuilder.append(((Object) (this)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:pop             
				stringbuilder.append(": Unbinding");
	//   13   27:aload_1         
	//   14   28:ldc1            #193 <String ": Unbinding">
	//   15   30:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
				Log.d("MediaRouteProviderProxy", stringbuilder.toString());
	//   17   34:ldc1            #12  <String "MediaRouteProviderProxy">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   20   40:invokestatic    #99  <Method int Log.d(String, String)>
	//   21   43:pop             
			}
			mBound = false;
	//   22   44:aload_0         
	//   23   45:iconst_0        
	//   24   46:putfield        #79  <Field boolean mBound>
			disconnect();
	//   25   49:aload_0         
	//   26   50:invokespecial   #195 <Method void disconnect()>
			getContext().unbindService(((ServiceConnection) (this)));
	//   27   53:aload_0         
	//   28   54:invokevirtual   #114 <Method Context getContext()>
	//   29   57:aload_0         
	//   30   58:invokevirtual   #199 <Method void Context.unbindService(ServiceConnection)>
		}
	//   31   61:return          
	}

	private void updateBinding()
	{
		if(shouldBind())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #201 <Method boolean shouldBind()>
	//*   2    4:ifeq            12
		{
			bind();
	//    3    7:aload_0         
	//    4    8:invokespecial   #203 <Method void bind()>
			return;
	//    5   11:return          
		} else
		{
			unbind();
	//    6   12:aload_0         
	//    7   13:invokespecial   #205 <Method void unbind()>
			return;
	//    8   16:return          
		}
	}

	public boolean hasComponentName(String s, String s1)
	{
		return mComponentName.getPackageName().equals(((Object) (s))) && mComponentName.getClassName().equals(((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field ComponentName mComponentName>
	//    2    4:invokevirtual   #212 <Method String ComponentName.getPackageName()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #152 <Method boolean String.equals(Object)>
	//    5   11:ifeq            30
	//    6   14:aload_0         
	//    7   15:getfield        #52  <Field ComponentName mComponentName>
	//    8   18:invokevirtual   #215 <Method String ComponentName.getClassName()>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #152 <Method boolean String.equals(Object)>
	//   11   25:ifeq            30
	//   12   28:iconst_1        
	//   13   29:ireturn         
	//   14   30:iconst_0        
	//   15   31:ireturn         
	}

	void onConnectionDescriptorChanged(Connection connection, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		if(mActiveConnection == connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       56
		{
			if(DEBUG)
	//*   4    8:getstatic       #33  <Field boolean DEBUG>
	//*   5   11:ifeq            51
			{
				connection = ((Connection) (new StringBuilder()));
	//    6   14:new             #81  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #82  <Method void StringBuilder()>
	//    9   21:astore_1        
				((StringBuilder) (connection)).append(((Object) (this)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
				((StringBuilder) (connection)).append(": Descriptor changed, descriptor=");
	//   14   28:aload_1         
	//   15   29:ldc1            #219 <String ": Descriptor changed, descriptor=">
	//   16   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
				((StringBuilder) (connection)).append(((Object) (mediarouteproviderdescriptor)));
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   21   40:pop             
				Log.d("MediaRouteProviderProxy", ((StringBuilder) (connection)).toString());
	//   22   41:ldc1            #12  <String "MediaRouteProviderProxy">
	//   23   43:aload_1         
	//   24   44:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #99  <Method int Log.d(String, String)>
	//   26   50:pop             
			}
			setDescriptor(mediarouteproviderdescriptor);
	//   27   51:aload_0         
	//   28   52:aload_2         
	//   29   53:invokevirtual   #172 <Method void setDescriptor(MediaRouteProviderDescriptor)>
		}
	//   30   56:return          
	}

	void onConnectionDied(Connection connection)
	{
		if(mActiveConnection == connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       49
		{
			if(DEBUG)
	//*   4    8:getstatic       #33  <Field boolean DEBUG>
	//*   5   11:ifeq            45
			{
				connection = ((Connection) (new StringBuilder()));
	//    6   14:new             #81  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #82  <Method void StringBuilder()>
	//    9   21:astore_1        
				((StringBuilder) (connection)).append(((Object) (this)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
				((StringBuilder) (connection)).append(": Service connection died");
	//   14   28:aload_1         
	//   15   29:ldc1            #222 <String ": Service connection died">
	//   16   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
				Log.d("MediaRouteProviderProxy", ((StringBuilder) (connection)).toString());
	//   18   35:ldc1            #12  <String "MediaRouteProviderProxy">
	//   19   37:aload_1         
	//   20   38:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #99  <Method int Log.d(String, String)>
	//   22   44:pop             
			}
			disconnect();
	//   23   45:aload_0         
	//   24   46:invokespecial   #195 <Method void disconnect()>
		}
	//   25   49:return          
	}

	void onConnectionError(Connection connection, String s)
	{
		if(mActiveConnection == connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       55
		{
			if(DEBUG)
	//*   4    8:getstatic       #33  <Field boolean DEBUG>
	//*   5   11:ifeq            51
			{
				connection = ((Connection) (new StringBuilder()));
	//    6   14:new             #81  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #82  <Method void StringBuilder()>
	//    9   21:astore_1        
				((StringBuilder) (connection)).append(((Object) (this)));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
				((StringBuilder) (connection)).append(": Service connection error - ");
	//   14   28:aload_1         
	//   15   29:ldc1            #226 <String ": Service connection error - ">
	//   16   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
				((StringBuilder) (connection)).append(s);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
				Log.d("MediaRouteProviderProxy", ((StringBuilder) (connection)).toString());
	//   22   41:ldc1            #12  <String "MediaRouteProviderProxy">
	//   23   43:aload_1         
	//   24   44:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   25   47:invokestatic    #99  <Method int Log.d(String, String)>
	//   26   50:pop             
			}
			unbind();
	//   27   51:aload_0         
	//   28   52:invokespecial   #205 <Method void unbind()>
		}
	//   29   55:return          
	}

	void onConnectionReady(Connection connection)
	{
		if(mActiveConnection == connection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       34
		{
			mConnectionReady = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #160 <Field boolean mConnectionReady>
			attachControllersToConnection();
	//    7   13:aload_0         
	//    8   14:invokespecial   #229 <Method void attachControllersToConnection()>
			connection = ((Connection) (getDiscoveryRequest()));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #187 <Method MediaRouteDiscoveryRequest getDiscoveryRequest()>
	//   11   21:astore_1        
			if(connection != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          34
				mActiveConnection.setDiscoveryRequest(((MediaRouteDiscoveryRequest) (connection)));
	//   14   26:aload_0         
	//   15   27:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #233 <Method void RegisteredMediaRouteProvider$Connection.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
		}
	//   18   34:return          
	}

	void onControllerReleased(Controller controller)
	{
		mControllers.remove(((Object) (controller)));
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ArrayList mControllers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #238 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
		controller.detachConnection();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #167 <Method void RegisteredMediaRouteProvider$Controller.detachConnection()>
		updateBinding();
	//    7   13:aload_0         
	//    8   14:invokespecial   #163 <Method void updateBinding()>
	//    9   17:return          
	}

	public MediaRouteProvider.RouteController onCreateRouteController(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
			return createRouteController(s, ((String) (null)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #242 <Method MediaRouteProvider$RouteController createRouteController(String, String)>
	//    6   10:areturn         
		else
			throw new IllegalArgumentException("routeId cannot be null");
	//    7   11:new             #244 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc1            #246 <String "routeId cannot be null">
	//   10   17:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   11   20:athrow          
	}

	public MediaRouteProvider.RouteController onCreateRouteController(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          25
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          15
				return createRouteController(s, s1);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #242 <Method MediaRouteProvider$RouteController createRouteController(String, String)>
	//    8   14:areturn         
			else
				throw new IllegalArgumentException("routeGroupId cannot be null");
	//    9   15:new             #244 <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:ldc1            #249 <String "routeGroupId cannot be null">
	//   12   21:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   13   24:athrow          
		} else
		{
			throw new IllegalArgumentException("routeId cannot be null");
	//   14   25:new             #244 <Class IllegalArgumentException>
	//   15   28:dup             
	//   16   29:ldc1            #246 <String "routeId cannot be null">
	//   17   31:invokespecial   #247 <Method void IllegalArgumentException(String)>
	//   18   34:athrow          
		}
	}

	public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		if(mConnectionReady)
	//*   0    0:aload_0         
	//*   1    1:getfield        #160 <Field boolean mConnectionReady>
	//*   2    4:ifeq            15
			mActiveConnection.setDiscoveryRequest(mediaroutediscoveryrequest);
	//    3    7:aload_0         
	//    4    8:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #233 <Method void RegisteredMediaRouteProvider$Connection.setDiscoveryRequest(MediaRouteDiscoveryRequest)>
		updateBinding();
	//    7   15:aload_0         
	//    8   16:invokespecial   #163 <Method void updateBinding()>
	//    9   19:return          
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		if(DEBUG)
	//*   0    0:getstatic       #33  <Field boolean DEBUG>
	//*   1    3:ifeq            37
		{
			componentname = ((ComponentName) (new StringBuilder()));
	//    2    6:new             #81  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #82  <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (componentname)).append(((Object) (this)));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//    9   19:pop             
			((StringBuilder) (componentname)).append(": Connected");
	//   10   20:aload_1         
	//   11   21:ldc1            #254 <String ": Connected">
	//   12   23:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			Log.d("MediaRouteProviderProxy", ((StringBuilder) (componentname)).toString());
	//   14   27:ldc1            #12  <String "MediaRouteProviderProxy">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #99  <Method int Log.d(String, String)>
	//   18   36:pop             
		}
		if(mBound)
	//*  19   37:aload_0         
	//*  20   38:getfield        #79  <Field boolean mBound>
	//*  21   41:ifeq            167
		{
			disconnect();
	//   22   44:aload_0         
	//   23   45:invokespecial   #195 <Method void disconnect()>
			if(ibinder != null)
	//*  24   48:aload_2         
	//*  25   49:ifnull          64
				componentname = ((ComponentName) (new Messenger(ibinder)));
	//   26   52:new             #256 <Class Messenger>
	//   27   55:dup             
	//   28   56:aload_2         
	//   29   57:invokespecial   #259 <Method void Messenger(IBinder)>
	//   30   60:astore_1        
			else
	//*  31   61:goto            66
				componentname = null;
	//   32   64:aconst_null     
	//   33   65:astore_1        
			if(MediaRouteProviderProtocol.isValidRemoteMessenger(((Messenger) (componentname))))
	//*  34   66:aload_1         
	//*  35   67:invokestatic    #265 <Method boolean MediaRouteProviderProtocol.isValidRemoteMessenger(Messenger)>
	//*  36   70:ifeq            135
			{
				componentname = ((ComponentName) (new Connection(((Messenger) (componentname)))));
	//   37   73:new             #176 <Class RegisteredMediaRouteProvider$Connection>
	//   38   76:dup             
	//   39   77:aload_0         
	//   40   78:aload_1         
	//   41   79:invokespecial   #268 <Method void RegisteredMediaRouteProvider$Connection(RegisteredMediaRouteProvider, Messenger)>
	//   42   82:astore_1        
				if(((Connection) (componentname)).register())
	//*  43   83:aload_1         
	//*  44   84:invokevirtual   #271 <Method boolean RegisteredMediaRouteProvider$Connection.register()>
	//*  45   87:ifeq            96
				{
					mActiveConnection = ((Connection) (componentname));
	//   46   90:aload_0         
	//   47   91:aload_1         
	//   48   92:putfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
					return;
	//   49   95:return          
				}
				if(DEBUG)
	//*  50   96:getstatic       #33  <Field boolean DEBUG>
	//*  51   99:ifeq            167
				{
					componentname = ((ComponentName) (new StringBuilder()));
	//   52  102:new             #81  <Class StringBuilder>
	//   53  105:dup             
	//   54  106:invokespecial   #82  <Method void StringBuilder()>
	//   55  109:astore_1        
					((StringBuilder) (componentname)).append(((Object) (this)));
	//   56  110:aload_1         
	//   57  111:aload_0         
	//   58  112:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   59  115:pop             
					((StringBuilder) (componentname)).append(": Registration failed");
	//   60  116:aload_1         
	//   61  117:ldc2            #273 <String ": Registration failed">
	//   62  120:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   63  123:pop             
					Log.d("MediaRouteProviderProxy", ((StringBuilder) (componentname)).toString());
	//   64  124:ldc1            #12  <String "MediaRouteProviderProxy">
	//   65  126:aload_1         
	//   66  127:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   67  130:invokestatic    #99  <Method int Log.d(String, String)>
	//   68  133:pop             
					return;
	//   69  134:return          
				}
			} else
			{
				componentname = ((ComponentName) (new StringBuilder()));
	//   70  135:new             #81  <Class StringBuilder>
	//   71  138:dup             
	//   72  139:invokespecial   #82  <Method void StringBuilder()>
	//   73  142:astore_1        
				((StringBuilder) (componentname)).append(((Object) (this)));
	//   74  143:aload_1         
	//   75  144:aload_0         
	//   76  145:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   77  148:pop             
				((StringBuilder) (componentname)).append(": Service returned invalid messenger binder");
	//   78  149:aload_1         
	//   79  150:ldc2            #275 <String ": Service returned invalid messenger binder">
	//   80  153:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   81  156:pop             
				Log.e("MediaRouteProviderProxy", ((StringBuilder) (componentname)).toString());
	//   82  157:ldc1            #12  <String "MediaRouteProviderProxy">
	//   83  159:aload_1         
	//   84  160:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   85  163:invokestatic    #278 <Method int Log.e(String, String)>
	//   86  166:pop             
			}
		}
	//   87  167:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		if(DEBUG)
	//*   0    0:getstatic       #33  <Field boolean DEBUG>
	//*   1    3:ifeq            38
		{
			componentname = ((ComponentName) (new StringBuilder()));
	//    2    6:new             #81  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #82  <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (componentname)).append(((Object) (this)));
	//    6   14:aload_1         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//    9   19:pop             
			((StringBuilder) (componentname)).append(": Service disconnected");
	//   10   20:aload_1         
	//   11   21:ldc2            #281 <String ": Service disconnected">
	//   12   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			Log.d("MediaRouteProviderProxy", ((StringBuilder) (componentname)).toString());
	//   14   28:ldc1            #12  <String "MediaRouteProviderProxy">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #99  <Method int Log.d(String, String)>
	//   18   37:pop             
		}
		disconnect();
	//   19   38:aload_0         
	//   20   39:invokespecial   #195 <Method void disconnect()>
	//   21   42:return          
	}

	public void rebindIfDisconnected()
	{
		if(mActiveConnection == null && shouldBind())
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field RegisteredMediaRouteProvider$Connection mActiveConnection>
	//*   2    4:ifnonnull       22
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #201 <Method boolean shouldBind()>
	//*   5   11:ifeq            22
		{
			unbind();
	//    6   14:aload_0         
	//    7   15:invokespecial   #205 <Method void unbind()>
			bind();
	//    8   18:aload_0         
	//    9   19:invokespecial   #203 <Method void bind()>
		}
	//   10   22:return          
	}

	public void start()
	{
		if(!mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field boolean mStarted>
	//*   2    4:ifne            54
		{
			if(DEBUG)
	//*   3    7:getstatic       #33  <Field boolean DEBUG>
	//*   4   10:ifeq            45
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #81  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #82  <Method void StringBuilder()>
	//    8   20:astore_1        
				stringbuilder.append(((Object) (this)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:pop             
				stringbuilder.append(": Starting");
	//   13   27:aload_1         
	//   14   28:ldc2            #285 <String ": Starting">
	//   15   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
				Log.d("MediaRouteProviderProxy", stringbuilder.toString());
	//   17   35:ldc1            #12  <String "MediaRouteProviderProxy">
	//   18   37:aload_1         
	//   19   38:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #99  <Method int Log.d(String, String)>
	//   21   44:pop             
			}
			mStarted = true;
	//   22   45:aload_0         
	//   23   46:iconst_1        
	//   24   47:putfield        #183 <Field boolean mStarted>
			updateBinding();
	//   25   50:aload_0         
	//   26   51:invokespecial   #163 <Method void updateBinding()>
		}
	//   27   54:return          
	}

	public void stop()
	{
		if(mStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field boolean mStarted>
	//*   2    4:ifeq            54
		{
			if(DEBUG)
	//*   3    7:getstatic       #33  <Field boolean DEBUG>
	//*   4   10:ifeq            45
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   13:new             #81  <Class StringBuilder>
	//    6   16:dup             
	//    7   17:invokespecial   #82  <Method void StringBuilder()>
	//    8   20:astore_1        
				stringbuilder.append(((Object) (this)));
	//    9   21:aload_1         
	//   10   22:aload_0         
	//   11   23:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   12   26:pop             
				stringbuilder.append(": Stopping");
	//   13   27:aload_1         
	//   14   28:ldc2            #288 <String ": Stopping">
	//   15   31:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
				Log.d("MediaRouteProviderProxy", stringbuilder.toString());
	//   17   35:ldc1            #12  <String "MediaRouteProviderProxy">
	//   18   37:aload_1         
	//   19   38:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   20   41:invokestatic    #99  <Method int Log.d(String, String)>
	//   21   44:pop             
			}
			mStarted = false;
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:putfield        #183 <Field boolean mStarted>
			updateBinding();
	//   25   50:aload_0         
	//   26   51:invokespecial   #163 <Method void updateBinding()>
		}
	//   27   54:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Service connection ");
	//    4    8:aload_1         
	//    5    9:ldc2            #290 <String "Service connection ">
	//    6   12:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mComponentName.flattenToShortString());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #52  <Field ComponentName mComponentName>
	//   11   21:invokevirtual   #293 <Method String ComponentName.flattenToShortString()>
	//   12   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		return stringbuilder.toString();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   16   32:areturn         
	}

	static final boolean DEBUG = Log.isLoggable("MediaRouteProviderProxy", 3);
	static final String TAG = "MediaRouteProviderProxy";
	private Connection mActiveConnection;
	private boolean mBound;
	private final ComponentName mComponentName;
	private boolean mConnectionReady;
	private final ArrayList mControllers = new ArrayList();
	final PrivateHandler mPrivateHandler = new PrivateHandler();
	private boolean mStarted;

	static 
	{
	//    0    0:ldc1            #12  <String "MediaRouteProviderProxy">
	//    1    2:iconst_3        
	//    2    3:invokestatic    #31  <Method boolean Log.isLoggable(String, int)>
	//    3    6:putstatic       #33  <Field boolean DEBUG>
	//*   4    9:return          
	}

	private class PrivateHandler extends Handler
	{

		PrivateHandler()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #8   <Method void Handler()>
		//    2    4:return          
		}
	}


	private class Controller extends MediaRouteProvider.RouteController
	{

		public void attachConnection(Connection connection)
		{
			mConnection = connection;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
			mControllerId = connection.createRouteController(mRouteId, mRouteGroupId);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #28  <Field String mRouteId>
		//    7   11:aload_0         
		//    8   12:getfield        #30  <Field String mRouteGroupId>
		//    9   15:invokevirtual   #41  <Method int RegisteredMediaRouteProvider$Connection.createRouteController(String, String)>
		//   10   18:putfield        #43  <Field int mControllerId>
			if(mSelected)
		//*  11   21:aload_0         
		//*  12   22:getfield        #45  <Field boolean mSelected>
		//*  13   25:ifeq            82
			{
				connection.selectRoute(mControllerId);
		//   14   28:aload_1         
		//   15   29:aload_0         
		//   16   30:getfield        #43  <Field int mControllerId>
		//   17   33:invokevirtual   #49  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
				int i = mPendingSetVolume;
		//   18   36:aload_0         
		//   19   37:getfield        #26  <Field int mPendingSetVolume>
		//   20   40:istore_2        
				if(i >= 0)
		//*  21   41:iload_2         
		//*  22   42:iflt            59
				{
					connection.setVolume(mControllerId, i);
		//   23   45:aload_1         
		//   24   46:aload_0         
		//   25   47:getfield        #43  <Field int mControllerId>
		//   26   50:iload_2         
		//   27   51:invokevirtual   #53  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
					mPendingSetVolume = -1;
		//   28   54:aload_0         
		//   29   55:iconst_m1       
		//   30   56:putfield        #26  <Field int mPendingSetVolume>
				}
				i = mPendingUpdateVolumeDelta;
		//   31   59:aload_0         
		//   32   60:getfield        #55  <Field int mPendingUpdateVolumeDelta>
		//   33   63:istore_2        
				if(i != 0)
		//*  34   64:iload_2         
		//*  35   65:ifeq            82
				{
					connection.updateVolume(mControllerId, i);
		//   36   68:aload_1         
		//   37   69:aload_0         
		//   38   70:getfield        #43  <Field int mControllerId>
		//   39   73:iload_2         
		//   40   74:invokevirtual   #58  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
					mPendingUpdateVolumeDelta = 0;
		//   41   77:aload_0         
		//   42   78:iconst_0        
		//   43   79:putfield        #55  <Field int mPendingUpdateVolumeDelta>
				}
			}
		//   44   82:return          
		}

		public void detachConnection()
		{
			Connection connection = mConnection;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    2    4:astore_1        
			if(connection != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          27
			{
				connection.releaseRouteController(mControllerId);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #43  <Field int mControllerId>
		//    8   14:invokevirtual   #62  <Method void RegisteredMediaRouteProvider$Connection.releaseRouteController(int)>
				mConnection = null;
		//    9   17:aload_0         
		//   10   18:aconst_null     
		//   11   19:putfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
				mControllerId = 0;
		//   12   22:aload_0         
		//   13   23:iconst_0        
		//   14   24:putfield        #43  <Field int mControllerId>
			}
		//   15   27:return          
		}

		public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
		{
			Connection connection = mConnection;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    2    4:astore_3        
			if(connection != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          20
				return connection.sendControlRequest(mControllerId, intent, controlrequestcallback);
		//    5    9:aload_3         
		//    6   10:aload_0         
		//    7   11:getfield        #43  <Field int mControllerId>
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #68  <Method boolean RegisteredMediaRouteProvider$Connection.sendControlRequest(int, Intent, MediaRouter$ControlRequestCallback)>
		//   11   19:ireturn         
			else
				return false;
		//   12   20:iconst_0        
		//   13   21:ireturn         
		}

		public void onRelease()
		{
			onControllerReleased(this);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field RegisteredMediaRouteProvider this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #75  <Method void RegisteredMediaRouteProvider.onControllerReleased(RegisteredMediaRouteProvider$Controller)>
		//    4    8:return          
		}

		public void onSelect()
		{
			mSelected = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #45  <Field boolean mSelected>
			Connection connection = mConnection;
		//    3    5:aload_0         
		//    4    6:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    5    9:astore_1        
			if(connection != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          22
				connection.selectRoute(mControllerId);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #43  <Field int mControllerId>
		//   11   19:invokevirtual   #49  <Method void RegisteredMediaRouteProvider$Connection.selectRoute(int)>
		//   12   22:return          
		}

		public void onSetVolume(int i)
		{
			Connection connection = mConnection;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    2    4:astore_2        
			if(connection != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          19
			{
				connection.setVolume(mControllerId, i);
		//    5    9:aload_2         
		//    6   10:aload_0         
		//    7   11:getfield        #43  <Field int mControllerId>
		//    8   14:iload_1         
		//    9   15:invokevirtual   #53  <Method void RegisteredMediaRouteProvider$Connection.setVolume(int, int)>
				return;
		//   10   18:return          
			} else
			{
				mPendingSetVolume = i;
		//   11   19:aload_0         
		//   12   20:iload_1         
		//   13   21:putfield        #26  <Field int mPendingSetVolume>
				mPendingUpdateVolumeDelta = 0;
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:putfield        #55  <Field int mPendingUpdateVolumeDelta>
				return;
		//   17   29:return          
			}
		}

		public void onUnselect()
		{
			onUnselect(0);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokevirtual   #80  <Method void onUnselect(int)>
		//    3    5:return          
		}

		public void onUnselect(int i)
		{
			mSelected = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #45  <Field boolean mSelected>
			Connection connection = mConnection;
		//    3    5:aload_0         
		//    4    6:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    5    9:astore_2        
			if(connection != null)
		//*   6   10:aload_2         
		//*   7   11:ifnull          23
				connection.unselectRoute(mControllerId, i);
		//    8   14:aload_2         
		//    9   15:aload_0         
		//   10   16:getfield        #43  <Field int mControllerId>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #83  <Method void RegisteredMediaRouteProvider$Connection.unselectRoute(int, int)>
		//   13   23:return          
		}

		public void onUpdateVolume(int i)
		{
			Connection connection = mConnection;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field RegisteredMediaRouteProvider$Connection mConnection>
		//    2    4:astore_2        
			if(connection != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          19
			{
				connection.updateVolume(mControllerId, i);
		//    5    9:aload_2         
		//    6   10:aload_0         
		//    7   11:getfield        #43  <Field int mControllerId>
		//    8   14:iload_1         
		//    9   15:invokevirtual   #58  <Method void RegisteredMediaRouteProvider$Connection.updateVolume(int, int)>
				return;
		//   10   18:return          
			} else
			{
				mPendingUpdateVolumeDelta = mPendingUpdateVolumeDelta + i;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #55  <Field int mPendingUpdateVolumeDelta>
		//   14   24:iload_1         
		//   15   25:iadd            
		//   16   26:putfield        #55  <Field int mPendingUpdateVolumeDelta>
				return;
		//   17   29:return          
			}
		}

		private Connection mConnection;
		private int mControllerId;
		private int mPendingSetVolume;
		private int mPendingUpdateVolumeDelta;
		private final String mRouteGroupId;
		private final String mRouteId;
		private boolean mSelected;
		final RegisteredMediaRouteProvider this$0;

		public Controller(String s, String s1)
		{
			this$0 = RegisteredMediaRouteProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field RegisteredMediaRouteProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void MediaRouteProvider$RouteController()>
			mPendingSetVolume = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #26  <Field int mPendingSetVolume>
			mRouteId = s;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #28  <Field String mRouteId>
			mRouteGroupId = s1;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #30  <Field String mRouteGroupId>
		//   14   24:return          
		}
	}


	private class Connection
		implements android.os.IBinder.DeathRecipient
	{
		private class ReceiveHandler extends Handler
		{

			private boolean processMessage(Connection connection, int i, int j, int k, Object obj, Bundle bundle)
			{
				switch(i)
			//*   0    0:iload_2         
				{
				default:
					break;

			//*   1    1:tableswitch     0 5: default 40
			//			               0 170
			//			               1 162
			//			               2 136
			//			               3 112
			//			               4 66
			//			               5 43
			//*   2   40:goto            178
				case 5: // '\005'
					if(obj == null || (obj instanceof Bundle))
			//*   3   43:aload           5
			//*   4   45:ifnull          56
			//*   5   48:aload           5
			//*   6   50:instanceof      #23  <Class Bundle>
			//*   7   53:ifeq            178
						return connection.onDescriptorChanged((Bundle)obj);
			//    8   56:aload_1         
			//    9   57:aload           5
			//   10   59:checkcast       #23  <Class Bundle>
			//   11   62:invokevirtual   #29  <Method boolean RegisteredMediaRouteProvider$Connection.onDescriptorChanged(Bundle)>
			//   12   65:ireturn         
					break;

				case 4: // '\004'
					if(obj != null && !(obj instanceof Bundle))
						break;
			//   13   66:aload           5
			//   14   68:ifnull          79
			//   15   71:aload           5
			//   16   73:instanceof      #23  <Class Bundle>
			//   17   76:ifeq            178
					if(bundle == null)
			//*  18   79:aload           6
			//*  19   81:ifnonnull       90
						bundle = null;
			//   20   84:aconst_null     
			//   21   85:astore          6
					else
			//*  22   87:goto            99
						bundle = ((Bundle) (bundle.getString("error")));
			//   23   90:aload           6
			//   24   92:ldc1            #31  <String "error">
			//   25   94:invokevirtual   #35  <Method String Bundle.getString(String)>
			//   26   97:astore          6
					return connection.onControlRequestFailed(j, ((String) (bundle)), (Bundle)obj);
			//   27   99:aload_1         
			//   28  100:iload_3         
			//   29  101:aload           6
			//   30  103:aload           5
			//   31  105:checkcast       #23  <Class Bundle>
			//   32  108:invokevirtual   #39  <Method boolean RegisteredMediaRouteProvider$Connection.onControlRequestFailed(int, String, Bundle)>
			//   33  111:ireturn         

				case 3: // '\003'
					if(obj == null || (obj instanceof Bundle))
			//*  34  112:aload           5
			//*  35  114:ifnull          125
			//*  36  117:aload           5
			//*  37  119:instanceof      #23  <Class Bundle>
			//*  38  122:ifeq            178
						return connection.onControlRequestSucceeded(j, (Bundle)obj);
			//   39  125:aload_1         
			//   40  126:iload_3         
			//   41  127:aload           5
			//   42  129:checkcast       #23  <Class Bundle>
			//   43  132:invokevirtual   #43  <Method boolean RegisteredMediaRouteProvider$Connection.onControlRequestSucceeded(int, Bundle)>
			//   44  135:ireturn         
					break;

				case 2: // '\002'
					if(obj == null || (obj instanceof Bundle))
			//*  45  136:aload           5
			//*  46  138:ifnull          149
			//*  47  141:aload           5
			//*  48  143:instanceof      #23  <Class Bundle>
			//*  49  146:ifeq            178
						return connection.onRegistered(j, k, (Bundle)obj);
			//   50  149:aload_1         
			//   51  150:iload_3         
			//   52  151:iload           4
			//   53  153:aload           5
			//   54  155:checkcast       #23  <Class Bundle>
			//   55  158:invokevirtual   #47  <Method boolean RegisteredMediaRouteProvider$Connection.onRegistered(int, int, Bundle)>
			//   56  161:ireturn         
					break;

				case 1: // '\001'
					connection.onGenericSuccess(j);
			//   57  162:aload_1         
			//   58  163:iload_3         
			//   59  164:invokevirtual   #51  <Method boolean RegisteredMediaRouteProvider$Connection.onGenericSuccess(int)>
			//   60  167:pop             
					return true;
			//   61  168:iconst_1        
			//   62  169:ireturn         

				case 0: // '\0'
					connection.onGenericFailure(j);
			//   63  170:aload_1         
			//   64  171:iload_3         
			//   65  172:invokevirtual   #54  <Method boolean RegisteredMediaRouteProvider$Connection.onGenericFailure(int)>
			//   66  175:pop             
					return true;
			//   67  176:iconst_1        
			//   68  177:ireturn         
				}
				return false;
			//   69  178:iconst_0        
			//   70  179:ireturn         
			}

			public void dispose()
			{
				mConnectionRef.clear();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field WeakReference mConnectionRef>
			//    2    4:invokevirtual   #58  <Method void WeakReference.clear()>
			//    3    7:return          
			}

			public void handleMessage(Message message)
			{
				Connection connection = (Connection)mConnectionRef.get();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field WeakReference mConnectionRef>
			//    2    4:invokevirtual   #64  <Method Object WeakReference.get()>
			//    3    7:checkcast       #25  <Class RegisteredMediaRouteProvider$Connection>
			//    4   10:astore_2        
				if(connection != null && !processMessage(connection, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && RegisteredMediaRouteProvider.DEBUG)
			//*   5   11:aload_2         
			//*   6   12:ifnull          80
			//*   7   15:aload_0         
			//*   8   16:aload_2         
			//*   9   17:aload_1         
			//*  10   18:getfield        #70  <Field int Message.what>
			//*  11   21:aload_1         
			//*  12   22:getfield        #73  <Field int Message.arg1>
			//*  13   25:aload_1         
			//*  14   26:getfield        #76  <Field int Message.arg2>
			//*  15   29:aload_1         
			//*  16   30:getfield        #80  <Field Object Message.obj>
			//*  17   33:aload_1         
			//*  18   34:invokevirtual   #84  <Method Bundle Message.peekData()>
			//*  19   37:invokespecial   #86  <Method boolean processMessage(RegisteredMediaRouteProvider$Connection, int, int, int, Object, Bundle)>
			//*  20   40:ifne            80
			//*  21   43:getstatic       #92  <Field boolean RegisteredMediaRouteProvider.DEBUG>
			//*  22   46:ifeq            80
				{
					StringBuilder stringbuilder = new StringBuilder();
			//   23   49:new             #94  <Class StringBuilder>
			//   24   52:dup             
			//   25   53:invokespecial   #95  <Method void StringBuilder()>
			//   26   56:astore_2        
					stringbuilder.append("Unhandled message from server: ");
			//   27   57:aload_2         
			//   28   58:ldc1            #97  <String "Unhandled message from server: ">
			//   29   60:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
			//   30   63:pop             
					stringbuilder.append(((Object) (message)));
			//   31   64:aload_2         
			//   32   65:aload_1         
			//   33   66:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
			//   34   69:pop             
					Log.d("MediaRouteProviderProxy", stringbuilder.toString());
			//   35   70:ldc1            #106 <String "MediaRouteProviderProxy">
			//   36   72:aload_2         
			//   37   73:invokevirtual   #110 <Method String StringBuilder.toString()>
			//   38   76:invokestatic    #116 <Method int Log.d(String, String)>
			//   39   79:pop             
				}
			//   40   80:return          
			}

			private final WeakReference mConnectionRef;

			public ReceiveHandler()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #11  <Method void Handler()>
				mConnectionRef = new WeakReference(((Object) (Connection.this)));
			//    2    4:aload_0         
			//    3    5:new             #13  <Class WeakReference>
			//    4    8:dup             
			//    5    9:aload_1         
			//    6   10:invokespecial   #16  <Method void WeakReference(Object)>
			//    7   13:putfield        #18  <Field WeakReference mConnectionRef>
			//    8   16:return          
			}
		}


		private boolean sendRequest(int i, int j, int k, Object obj, Bundle bundle)
		{
			Message message;
			message = Message.obtain();
		//    0    0:invokestatic    #65  <Method Message Message.obtain()>
		//    1    3:astore          6
			message.what = i;
		//    2    5:aload           6
		//    3    7:iload_1         
		//    4    8:putfield        #68  <Field int Message.what>
			message.arg1 = j;
		//    5   11:aload           6
		//    6   13:iload_2         
		//    7   14:putfield        #71  <Field int Message.arg1>
			message.arg2 = k;
		//    8   17:aload           6
		//    9   19:iload_3         
		//   10   20:putfield        #74  <Field int Message.arg2>
			message.obj = obj;
		//   11   23:aload           6
		//   12   25:aload           4
		//   13   27:putfield        #78  <Field Object Message.obj>
			message.setData(bundle);
		//   14   30:aload           6
		//   15   32:aload           5
		//   16   34:invokevirtual   #82  <Method void Message.setData(Bundle)>
			message.replyTo = mReceiveMessenger;
		//   17   37:aload           6
		//   18   39:aload_0         
		//   19   40:getfield        #52  <Field Messenger mReceiveMessenger>
		//   20   43:putfield        #85  <Field Messenger Message.replyTo>
			mServiceMessenger.send(message);
		//   21   46:aload_0         
		//   22   47:getfield        #38  <Field Messenger mServiceMessenger>
		//   23   50:aload           6
		//   24   52:invokevirtual   #89  <Method void Messenger.send(Message)>
			return true;
		//   25   55:iconst_1        
		//   26   56:ireturn         
			obj;
		//   27   57:astore          4
			if(i != 2)
		//*  28   59:iload_1         
		//*  29   60:iconst_2        
		//*  30   61:icmpeq          74
				Log.e("MediaRouteProviderProxy", "Could not send message to service.", ((Throwable) (obj)));
		//   31   64:ldc1            #91  <String "MediaRouteProviderProxy">
		//   32   66:ldc1            #93  <String "Could not send message to service.">
		//   33   68:aload           4
		//   34   70:invokestatic    #99  <Method int Log.e(String, String, Throwable)>
		//   35   73:pop             
_L2:
			return false;
		//   36   74:iconst_0        
		//   37   75:ireturn         
			obj;
		//   38   76:astore          4
			if(true) goto _L2; else goto _L1
		//   39   78:goto            74
_L1:
		}

		public void binderDied()
		{
			class _cls2
				implements Runnable
			{

				public void run()
				{
					onConnectionDied(Connection.this);
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field RegisteredMediaRouteProvider$Connection this$1>
				//    2    4:getfield        #23  <Field RegisteredMediaRouteProvider RegisteredMediaRouteProvider$Connection.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #12  <Field RegisteredMediaRouteProvider$Connection this$1>
				//    5   11:invokevirtual   #28  <Method void RegisteredMediaRouteProvider.onConnectionDied(RegisteredMediaRouteProvider$Connection)>
				//    6   14:return          
				}

				final Connection this$1;

				_cls2()
				{
					this$1 = Connection.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field RegisteredMediaRouteProvider$Connection this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}
			}

			mPrivateHandler.post(((Runnable) (new _cls2())));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//    2    4:getfield        #106 <Field RegisteredMediaRouteProvider$PrivateHandler RegisteredMediaRouteProvider.mPrivateHandler>
		//    3    7:new             #108 <Class RegisteredMediaRouteProvider$Connection$2>
		//    4   10:dup             
		//    5   11:aload_0         
		//    6   12:invokespecial   #109 <Method void RegisteredMediaRouteProvider$Connection$2(RegisteredMediaRouteProvider$Connection)>
		//    7   15:invokevirtual   #115 <Method boolean RegisteredMediaRouteProvider$PrivateHandler.post(Runnable)>
		//    8   18:pop             
		//    9   19:return          
		}

		public int createRouteController(String s, String s1)
		{
			int i = mNextControllerId;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field int mNextControllerId>
		//    2    4:istore_3        
			mNextControllerId = i + 1;
		//    3    5:aload_0         
		//    4    6:iload_3         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #31  <Field int mNextControllerId>
			Bundle bundle = new Bundle();
		//    8   12:new             #119 <Class Bundle>
		//    9   15:dup             
		//   10   16:invokespecial   #120 <Method void Bundle()>
		//   11   19:astore          5
			bundle.putString("routeId", s);
		//   12   21:aload           5
		//   13   23:ldc1            #122 <String "routeId">
		//   14   25:aload_1         
		//   15   26:invokevirtual   #126 <Method void Bundle.putString(String, String)>
			bundle.putString("routeGroupId", s1);
		//   16   29:aload           5
		//   17   31:ldc1            #128 <String "routeGroupId">
		//   18   33:aload_2         
		//   19   34:invokevirtual   #126 <Method void Bundle.putString(String, String)>
			int j = mNextRequestId;
		//   20   37:aload_0         
		//   21   38:getfield        #29  <Field int mNextRequestId>
		//   22   41:istore          4
			mNextRequestId = j + 1;
		//   23   43:aload_0         
		//   24   44:iload           4
		//   25   46:iconst_1        
		//   26   47:iadd            
		//   27   48:putfield        #29  <Field int mNextRequestId>
			sendRequest(3, j, i, ((Object) (null)), bundle);
		//   28   51:aload_0         
		//   29   52:iconst_3        
		//   30   53:iload           4
		//   31   55:iload_3         
		//   32   56:aconst_null     
		//   33   57:aload           5
		//   34   59:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   35   62:pop             
			return i;
		//   36   63:iload_3         
		//   37   64:ireturn         
		}

		public void dispose()
		{
			sendRequest(2, 0, 0, ((Object) (null)), ((Bundle) (null)));
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iconst_0        
		//    3    3:iconst_0        
		//    4    4:aconst_null     
		//    5    5:aconst_null     
		//    6    6:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//    7    9:pop             
			mReceiveHandler.dispose();
		//    8   10:aload_0         
		//    9   11:getfield        #45  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
		//   10   14:invokevirtual   #133 <Method void RegisteredMediaRouteProvider$ReceiveHandler.dispose()>
			mServiceMessenger.getBinder().unlinkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
		//   11   17:aload_0         
		//   12   18:getfield        #38  <Field Messenger mServiceMessenger>
		//   13   21:invokevirtual   #137 <Method IBinder Messenger.getBinder()>
		//   14   24:aload_0         
		//   15   25:iconst_0        
		//   16   26:invokeinterface #143 <Method boolean IBinder.unlinkToDeath(android.os.IBinder$DeathRecipient, int)>
		//   17   31:pop             
			class _cls1
				implements Runnable
			{

				public void run()
				{
					failPendingCallbacks();
				//    0    0:aload_0         
				//    1    1:getfield        #12  <Field RegisteredMediaRouteProvider$Connection this$1>
				//    2    4:invokevirtual   #22  <Method void RegisteredMediaRouteProvider$Connection.failPendingCallbacks()>
				//    3    7:return          
				}

				final Connection this$1;

				_cls1()
				{
					this$1 = Connection.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #12  <Field RegisteredMediaRouteProvider$Connection this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #15  <Method void Object()>
				//    5    9:return          
				}
			}

			mPrivateHandler.post(((Runnable) (new _cls1())));
		//   18   32:aload_0         
		//   19   33:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//   20   36:getfield        #106 <Field RegisteredMediaRouteProvider$PrivateHandler RegisteredMediaRouteProvider.mPrivateHandler>
		//   21   39:new             #145 <Class RegisteredMediaRouteProvider$Connection$1>
		//   22   42:dup             
		//   23   43:aload_0         
		//   24   44:invokespecial   #146 <Method void RegisteredMediaRouteProvider$Connection$1(RegisteredMediaRouteProvider$Connection)>
		//   25   47:invokevirtual   #115 <Method boolean RegisteredMediaRouteProvider$PrivateHandler.post(Runnable)>
		//   26   50:pop             
		//   27   51:return          
		}

		void failPendingCallbacks()
		{
			for(int i = 0; i < mPendingCallbacks.size(); i++)
		//*   0    0:iconst_0        
		//*   1    1:istore_1        
		//*   2    2:iload_1         
		//*   3    3:aload_0         
		//*   4    4:getfield        #36  <Field SparseArray mPendingCallbacks>
		//*   5    7:invokevirtual   #151 <Method int SparseArray.size()>
		//*   6   10:icmpge          36
				((MediaRouter.ControlRequestCallback)mPendingCallbacks.valueAt(i)).onError(((String) (null)), ((Bundle) (null)));
		//    7   13:aload_0         
		//    8   14:getfield        #36  <Field SparseArray mPendingCallbacks>
		//    9   17:iload_1         
		//   10   18:invokevirtual   #155 <Method Object SparseArray.valueAt(int)>
		//   11   21:checkcast       #157 <Class MediaRouter$ControlRequestCallback>
		//   12   24:aconst_null     
		//   13   25:aconst_null     
		//   14   26:invokevirtual   #161 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>

		//   15   29:iload_1         
		//   16   30:iconst_1        
		//   17   31:iadd            
		//   18   32:istore_1        
		//*  19   33:goto            2
			mPendingCallbacks.clear();
		//   20   36:aload_0         
		//   21   37:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   22   40:invokevirtual   #164 <Method void SparseArray.clear()>
		//   23   43:return          
		}

		public boolean onControlRequestFailed(int i, String s, Bundle bundle)
		{
			MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field SparseArray mPendingCallbacks>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #169 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #157 <Class MediaRouter$ControlRequestCallback>
		//    5   11:astore          4
			if(controlrequestcallback != null)
		//*   6   13:aload           4
		//*   7   15:ifnull          35
			{
				mPendingCallbacks.remove(i);
		//    8   18:aload_0         
		//    9   19:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   10   22:iload_1         
		//   11   23:invokevirtual   #173 <Method void SparseArray.remove(int)>
				controlrequestcallback.onError(s, bundle);
		//   12   26:aload           4
		//   13   28:aload_2         
		//   14   29:aload_3         
		//   15   30:invokevirtual   #161 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>
				return true;
		//   16   33:iconst_1        
		//   17   34:ireturn         
			} else
			{
				return false;
		//   18   35:iconst_0        
		//   19   36:ireturn         
			}
		}

		public boolean onControlRequestSucceeded(int i, Bundle bundle)
		{
			MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field SparseArray mPendingCallbacks>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #169 <Method Object SparseArray.get(int)>
		//    4    8:checkcast       #157 <Class MediaRouter$ControlRequestCallback>
		//    5   11:astore_3        
			if(controlrequestcallback != null)
		//*   6   12:aload_3         
		//*   7   13:ifnull          31
			{
				mPendingCallbacks.remove(i);
		//    8   16:aload_0         
		//    9   17:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   10   20:iload_1         
		//   11   21:invokevirtual   #173 <Method void SparseArray.remove(int)>
				controlrequestcallback.onResult(bundle);
		//   12   24:aload_3         
		//   13   25:aload_2         
		//   14   26:invokevirtual   #178 <Method void MediaRouter$ControlRequestCallback.onResult(Bundle)>
				return true;
		//   15   29:iconst_1        
		//   16   30:ireturn         
			} else
			{
				return false;
		//   17   31:iconst_0        
		//   18   32:ireturn         
			}
		}

		public boolean onDescriptorChanged(Bundle bundle)
		{
			if(mServiceVersion != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #182 <Field int mServiceVersion>
		//*   2    4:ifeq            21
			{
				onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
		//    3    7:aload_0         
		//    4    8:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokestatic    #188 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor.fromBundle(Bundle)>
		//    8   16:invokevirtual   #192 <Method void RegisteredMediaRouteProvider.onConnectionDescriptorChanged(RegisteredMediaRouteProvider$Connection, MediaRouteProviderDescriptor)>
				return true;
		//    9   19:iconst_1        
		//   10   20:ireturn         
			} else
			{
				return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         
			}
		}

		public boolean onGenericFailure(int i)
		{
			if(i == mPendingRegisterRequestId)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #196 <Field int mPendingRegisterRequestId>
		//*   3    5:icmpne          23
			{
				mPendingRegisterRequestId = 0;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #196 <Field int mPendingRegisterRequestId>
				onConnectionError(this, "Registration failed");
		//    7   13:aload_0         
		//    8   14:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//    9   17:aload_0         
		//   10   18:ldc1            #198 <String "Registration failed">
		//   11   20:invokevirtual   #202 <Method void RegisteredMediaRouteProvider.onConnectionError(RegisteredMediaRouteProvider$Connection, String)>
			}
			MediaRouter.ControlRequestCallback controlrequestcallback = (MediaRouter.ControlRequestCallback)mPendingCallbacks.get(i);
		//   12   23:aload_0         
		//   13   24:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   14   27:iload_1         
		//   15   28:invokevirtual   #169 <Method Object SparseArray.get(int)>
		//   16   31:checkcast       #157 <Class MediaRouter$ControlRequestCallback>
		//   17   34:astore_2        
			if(controlrequestcallback != null)
		//*  18   35:aload_2         
		//*  19   36:ifnull          53
			{
				mPendingCallbacks.remove(i);
		//   20   39:aload_0         
		//   21   40:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   22   43:iload_1         
		//   23   44:invokevirtual   #173 <Method void SparseArray.remove(int)>
				controlrequestcallback.onError(((String) (null)), ((Bundle) (null)));
		//   24   47:aload_2         
		//   25   48:aconst_null     
		//   26   49:aconst_null     
		//   27   50:invokevirtual   #161 <Method void MediaRouter$ControlRequestCallback.onError(String, Bundle)>
			}
			return true;
		//   28   53:iconst_1        
		//   29   54:ireturn         
		}

		public boolean onGenericSuccess(int i)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean onRegistered(int i, int j, Bundle bundle)
		{
			if(mServiceVersion == 0 && i == mPendingRegisterRequestId && j >= 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #182 <Field int mServiceVersion>
		//*   2    4:ifne            52
		//*   3    7:iload_1         
		//*   4    8:aload_0         
		//*   5    9:getfield        #196 <Field int mPendingRegisterRequestId>
		//*   6   12:icmpne          52
		//*   7   15:iload_2         
		//*   8   16:iconst_1        
		//*   9   17:icmplt          52
			{
				mPendingRegisterRequestId = 0;
		//   10   20:aload_0         
		//   11   21:iconst_0        
		//   12   22:putfield        #196 <Field int mPendingRegisterRequestId>
				mServiceVersion = j;
		//   13   25:aload_0         
		//   14   26:iload_2         
		//   15   27:putfield        #182 <Field int mServiceVersion>
				onConnectionDescriptorChanged(this, MediaRouteProviderDescriptor.fromBundle(bundle));
		//   16   30:aload_0         
		//   17   31:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//   18   34:aload_0         
		//   19   35:aload_3         
		//   20   36:invokestatic    #188 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor.fromBundle(Bundle)>
		//   21   39:invokevirtual   #192 <Method void RegisteredMediaRouteProvider.onConnectionDescriptorChanged(RegisteredMediaRouteProvider$Connection, MediaRouteProviderDescriptor)>
				onConnectionReady(this);
		//   22   42:aload_0         
		//   23   43:getfield        #24  <Field RegisteredMediaRouteProvider this$0>
		//   24   46:aload_0         
		//   25   47:invokevirtual   #208 <Method void RegisteredMediaRouteProvider.onConnectionReady(RegisteredMediaRouteProvider$Connection)>
				return true;
		//   26   50:iconst_1        
		//   27   51:ireturn         
			} else
			{
				return false;
		//   28   52:iconst_0        
		//   29   53:ireturn         
			}
		}

		public boolean register()
		{
			RemoteException remoteexception;
			int i = mNextRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mNextRequestId>
		//    2    4:istore_1        
			mNextRequestId = i + 1;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #29  <Field int mNextRequestId>
			mPendingRegisterRequestId = i;
		//    8   12:aload_0         
		//    9   13:iload_1         
		//   10   14:putfield        #196 <Field int mPendingRegisterRequestId>
			if(!sendRequest(1, mPendingRegisterRequestId, 2, ((Object) (null)), ((Bundle) (null))))
		//*  11   17:aload_0         
		//*  12   18:iconst_1        
		//*  13   19:aload_0         
		//*  14   20:getfield        #196 <Field int mPendingRegisterRequestId>
		//*  15   23:iconst_2        
		//*  16   24:aconst_null     
		//*  17   25:aconst_null     
		//*  18   26:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//*  19   29:ifne            34
				return false;
		//   20   32:iconst_0        
		//   21   33:ireturn         
			try
			{
				mServiceMessenger.getBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (this)), 0);
		//   22   34:aload_0         
		//   23   35:getfield        #38  <Field Messenger mServiceMessenger>
		//   24   38:invokevirtual   #137 <Method IBinder Messenger.getBinder()>
		//   25   41:aload_0         
		//   26   42:iconst_0        
		//   27   43:invokeinterface #214 <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
			}
		//*  28   48:iconst_1        
		//*  29   49:ireturn         
		//*  30   50:aload_0         
		//*  31   51:invokevirtual   #216 <Method void binderDied()>
		//*  32   54:iconst_0        
		//*  33   55:ireturn         
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				binderDied();
				return false;
			}
			return true;
		//*  34   56:astore_2        
		//*  35   57:goto            50
		}

		public void releaseRouteController(int i)
		{
			int j = mNextRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mNextRequestId>
		//    2    4:istore_2        
			mNextRequestId = j + 1;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #29  <Field int mNextRequestId>
			sendRequest(4, j, i, ((Object) (null)), ((Bundle) (null)));
		//    8   12:aload_0         
		//    9   13:iconst_4        
		//   10   14:iload_2         
		//   11   15:iload_1         
		//   12   16:aconst_null     
		//   13   17:aconst_null     
		//   14   18:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   15   21:pop             
		//   16   22:return          
		}

		public void selectRoute(int i)
		{
			int j = mNextRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mNextRequestId>
		//    2    4:istore_2        
			mNextRequestId = j + 1;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #29  <Field int mNextRequestId>
			sendRequest(5, j, i, ((Object) (null)), ((Bundle) (null)));
		//    8   12:aload_0         
		//    9   13:iconst_5        
		//   10   14:iload_2         
		//   11   15:iload_1         
		//   12   16:aconst_null     
		//   13   17:aconst_null     
		//   14   18:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   15   21:pop             
		//   16   22:return          
		}

		public boolean sendControlRequest(int i, Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
		{
			int j = mNextRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mNextRequestId>
		//    2    4:istore          4
			mNextRequestId = j + 1;
		//    3    6:aload_0         
		//    4    7:iload           4
		//    5    9:iconst_1        
		//    6   10:iadd            
		//    7   11:putfield        #29  <Field int mNextRequestId>
			if(sendRequest(9, j, i, ((Object) (intent)), ((Bundle) (null))))
		//*   8   14:aload_0         
		//*   9   15:bipush          9
		//*  10   17:iload           4
		//*  11   19:iload_1         
		//*  12   20:aload_2         
		//*  13   21:aconst_null     
		//*  14   22:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//*  15   25:ifeq            44
			{
				if(controlrequestcallback != null)
		//*  16   28:aload_3         
		//*  17   29:ifnull          42
					mPendingCallbacks.put(j, ((Object) (controlrequestcallback)));
		//   18   32:aload_0         
		//   19   33:getfield        #36  <Field SparseArray mPendingCallbacks>
		//   20   36:iload           4
		//   21   38:aload_3         
		//   22   39:invokevirtual   #224 <Method void SparseArray.put(int, Object)>
				return true;
		//   23   42:iconst_1        
		//   24   43:ireturn         
			} else
			{
				return false;
		//   25   44:iconst_0        
		//   26   45:ireturn         
			}
		}

		public void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
		{
			int i = mNextRequestId;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mNextRequestId>
		//    2    4:istore_2        
			mNextRequestId = i + 1;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:iconst_1        
		//    6    8:iadd            
		//    7    9:putfield        #29  <Field int mNextRequestId>
			if(mediaroutediscoveryrequest != null)
		//*   8   12:aload_1         
		//*   9   13:ifnull          24
				mediaroutediscoveryrequest = ((MediaRouteDiscoveryRequest) (mediaroutediscoveryrequest.asBundle()));
		//   10   16:aload_1         
		//   11   17:invokevirtual   #232 <Method Bundle MediaRouteDiscoveryRequest.asBundle()>
		//   12   20:astore_1        
			else
		//*  13   21:goto            26
				mediaroutediscoveryrequest = null;
		//   14   24:aconst_null     
		//   15   25:astore_1        
			sendRequest(10, i, 0, ((Object) (mediaroutediscoveryrequest)), ((Bundle) (null)));
		//   16   26:aload_0         
		//   17   27:bipush          10
		//   18   29:iload_2         
		//   19   30:iconst_0        
		//   20   31:aload_1         
		//   21   32:aconst_null     
		//   22   33:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   23   36:pop             
		//   24   37:return          
		}

		public void setVolume(int i, int j)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #119 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #120 <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putInt("volume", j);
		//    4    8:aload_3         
		//    5    9:ldc1            #236 <String "volume">
		//    6   11:iload_2         
		//    7   12:invokevirtual   #240 <Method void Bundle.putInt(String, int)>
			j = mNextRequestId;
		//    8   15:aload_0         
		//    9   16:getfield        #29  <Field int mNextRequestId>
		//   10   19:istore_2        
			mNextRequestId = j + 1;
		//   11   20:aload_0         
		//   12   21:iload_2         
		//   13   22:iconst_1        
		//   14   23:iadd            
		//   15   24:putfield        #29  <Field int mNextRequestId>
			sendRequest(7, j, i, ((Object) (null)), bundle);
		//   16   27:aload_0         
		//   17   28:bipush          7
		//   18   30:iload_2         
		//   19   31:iload_1         
		//   20   32:aconst_null     
		//   21   33:aload_3         
		//   22   34:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   23   37:pop             
		//   24   38:return          
		}

		public void unselectRoute(int i, int j)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #119 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #120 <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putInt("unselectReason", j);
		//    4    8:aload_3         
		//    5    9:ldc1            #243 <String "unselectReason">
		//    6   11:iload_2         
		//    7   12:invokevirtual   #240 <Method void Bundle.putInt(String, int)>
			j = mNextRequestId;
		//    8   15:aload_0         
		//    9   16:getfield        #29  <Field int mNextRequestId>
		//   10   19:istore_2        
			mNextRequestId = j + 1;
		//   11   20:aload_0         
		//   12   21:iload_2         
		//   13   22:iconst_1        
		//   14   23:iadd            
		//   15   24:putfield        #29  <Field int mNextRequestId>
			sendRequest(6, j, i, ((Object) (null)), bundle);
		//   16   27:aload_0         
		//   17   28:bipush          6
		//   18   30:iload_2         
		//   19   31:iload_1         
		//   20   32:aconst_null     
		//   21   33:aload_3         
		//   22   34:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   23   37:pop             
		//   24   38:return          
		}

		public void updateVolume(int i, int j)
		{
			Bundle bundle = new Bundle();
		//    0    0:new             #119 <Class Bundle>
		//    1    3:dup             
		//    2    4:invokespecial   #120 <Method void Bundle()>
		//    3    7:astore_3        
			bundle.putInt("volume", j);
		//    4    8:aload_3         
		//    5    9:ldc1            #236 <String "volume">
		//    6   11:iload_2         
		//    7   12:invokevirtual   #240 <Method void Bundle.putInt(String, int)>
			j = mNextRequestId;
		//    8   15:aload_0         
		//    9   16:getfield        #29  <Field int mNextRequestId>
		//   10   19:istore_2        
			mNextRequestId = j + 1;
		//   11   20:aload_0         
		//   12   21:iload_2         
		//   13   22:iconst_1        
		//   14   23:iadd            
		//   15   24:putfield        #29  <Field int mNextRequestId>
			sendRequest(8, j, i, ((Object) (null)), bundle);
		//   16   27:aload_0         
		//   17   28:bipush          8
		//   18   30:iload_2         
		//   19   31:iload_1         
		//   20   32:aconst_null     
		//   21   33:aload_3         
		//   22   34:invokespecial   #130 <Method boolean sendRequest(int, int, int, Object, Bundle)>
		//   23   37:pop             
		//   24   38:return          
		}

		private int mNextControllerId;
		private int mNextRequestId;
		private final SparseArray mPendingCallbacks = new SparseArray();
		private int mPendingRegisterRequestId;
		private final ReceiveHandler mReceiveHandler = new ReceiveHandler();
		private final Messenger mReceiveMessenger;
		private final Messenger mServiceMessenger;
		private int mServiceVersion;
		final RegisteredMediaRouteProvider this$0;

		public Connection(Messenger messenger)
		{
			this$0 = RegisteredMediaRouteProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field RegisteredMediaRouteProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #27  <Method void Object()>
			mNextRequestId = 1;
		//    5    9:aload_0         
		//    6   10:iconst_1        
		//    7   11:putfield        #29  <Field int mNextRequestId>
			mNextControllerId = 1;
		//    8   14:aload_0         
		//    9   15:iconst_1        
		//   10   16:putfield        #31  <Field int mNextControllerId>
		//   11   19:aload_0         
		//   12   20:new             #33  <Class SparseArray>
		//   13   23:dup             
		//   14   24:invokespecial   #34  <Method void SparseArray()>
		//   15   27:putfield        #36  <Field SparseArray mPendingCallbacks>
			mServiceMessenger = messenger;
		//   16   30:aload_0         
		//   17   31:aload_2         
		//   18   32:putfield        #38  <Field Messenger mServiceMessenger>
		//   19   35:aload_0         
		//   20   36:new             #40  <Class RegisteredMediaRouteProvider$ReceiveHandler>
		//   21   39:dup             
		//   22   40:aload_0         
		//   23   41:invokespecial   #43  <Method void RegisteredMediaRouteProvider$ReceiveHandler(RegisteredMediaRouteProvider$Connection)>
		//   24   44:putfield        #45  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
			mReceiveMessenger = new Messenger(((Handler) (mReceiveHandler)));
		//   25   47:aload_0         
		//   26   48:new             #47  <Class Messenger>
		//   27   51:dup             
		//   28   52:aload_0         
		//   29   53:getfield        #45  <Field RegisteredMediaRouteProvider$ReceiveHandler mReceiveHandler>
		//   30   56:invokespecial   #50  <Method void Messenger(Handler)>
		//   31   59:putfield        #52  <Field Messenger mReceiveMessenger>
		//   32   62:return          
		}
	}

}
