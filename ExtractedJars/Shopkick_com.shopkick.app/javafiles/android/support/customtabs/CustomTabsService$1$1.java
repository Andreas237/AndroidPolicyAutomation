// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.*;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.customtabs:
//			CustomTabsService, CustomTabsSessionToken, ICustomTabsCallback

class CustomTabsService$1$1
	implements android.os.
{

	public void binderDied()
	{
		cleanUpSession(val$sessionToken);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CustomTabsService$1 this$1>
	//    2    4:getfield        #30  <Field CustomTabsService CustomTabsService$1.this$0>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field CustomTabsSessionToken val$sessionToken>
	//    5   11:invokevirtual   #36  <Method boolean CustomTabsService.cleanUpSession(CustomTabsSessionToken)>
	//    6   14:pop             
	//    7   15:return          
	}

	final CustomTabsService._cls1 this$1;
	final CustomTabsSessionToken val$sessionToken;

	CustomTabsService$1$1()
	{
		this$1 = final__pcls1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CustomTabsService$1 this$1>
		val$sessionToken = CustomTabsSessionToken.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field CustomTabsSessionToken val$sessionToken>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class android/support/customtabs/CustomTabsService$1

/* anonymous class */
	class CustomTabsService._cls1 extends ICustomTabsService.Stub
	{

		public Bundle extraCommand(String s, Bundle bundle)
		{
			return CustomTabsService.this.extraCommand(s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #22  <Method Bundle CustomTabsService.extraCommand(String, Bundle)>
		//    5    9:areturn         
		}

		public boolean mayLaunchUrl(ICustomTabsCallback icustomtabscallback, Uri uri, Bundle bundle, List list)
		{
			return CustomTabsService.this.mayLaunchUrl(new CustomTabsSessionToken(icustomtabscallback), uri, bundle, list);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:new             #26  <Class CustomTabsSessionToken>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    6   12:aload_2         
		//    7   13:aload_3         
		//    8   14:aload           4
		//    9   16:invokevirtual   #32  <Method boolean CustomTabsService.mayLaunchUrl(CustomTabsSessionToken, Uri, Bundle, List)>
		//   10   19:ireturn         
		}

		public boolean newSession(ICustomTabsCallback icustomtabscallback)
		{
			CustomTabsSessionToken customtabssessiontoken = new CustomTabsSessionToken(icustomtabscallback);
		//    0    0:new             #26  <Class CustomTabsSessionToken>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    4    8:astore          4
			CustomTabsService._cls1._cls1 _lcls1 = ((CustomTabsService._cls1._cls1) (customtabssessiontoken)). new CustomTabsService._cls1._cls1();
		//    5   10:new             #8   <Class CustomTabsService$1$1>
		//    6   13:dup             
		//    7   14:aload_0         
		//    8   15:aload           4
		//    9   17:invokespecial   #41  <Method void CustomTabsService$1$1(CustomTabsService$1, CustomTabsSessionToken)>
		//   10   20:astore          5
			synchronized(mDeathRecipientMap)
		//*  11   22:aload_0         
		//*  12   23:getfield        #14  <Field CustomTabsService this$0>
		//*  13   26:getfield        #45  <Field Map CustomTabsService.mDeathRecipientMap>
		//*  14   29:astore_3        
		//*  15   30:aload_3         
		//*  16   31:monitorenter    
			{
				icustomtabscallback.asBinder().linkToDeath(((android.os.IBinder.DeathRecipient) (_lcls1)), 0);
		//   17   32:aload_1         
		//   18   33:invokeinterface #51  <Method IBinder ICustomTabsCallback.asBinder()>
		//   19   38:aload           5
		//   20   40:iconst_0        
		//   21   41:invokeinterface #57  <Method void IBinder.linkToDeath(android.os.IBinder$DeathRecipient, int)>
				mDeathRecipientMap.put(((Object) (icustomtabscallback.asBinder())), ((Object) (_lcls1)));
		//   22   46:aload_0         
		//   23   47:getfield        #14  <Field CustomTabsService this$0>
		//   24   50:getfield        #45  <Field Map CustomTabsService.mDeathRecipientMap>
		//   25   53:aload_1         
		//   26   54:invokeinterface #51  <Method IBinder ICustomTabsCallback.asBinder()>
		//   27   59:aload           5
		//   28   61:invokeinterface #63  <Method Object Map.put(Object, Object)>
		//   29   66:pop             
			}
		//   30   67:aload_3         
		//   31   68:monitorexit     
			boolean flag;
			try
			{
				flag = CustomTabsService.this.newSession(customtabssessiontoken);
		//   32   69:aload_0         
		//   33   70:getfield        #14  <Field CustomTabsService this$0>
		//   34   73:aload           4
		//   35   75:invokevirtual   #66  <Method boolean CustomTabsService.newSession(CustomTabsSessionToken)>
		//   36   78:istore_2        
			}
		//*  37   79:iload_2         
		//*  38   80:ireturn         
		//*  39   81:astore_1        
		//*  40   82:aload_3         
		//*  41   83:monitorexit     
		//*  42   84:aload_1         
		//*  43   85:athrow          
			// Misplaced declaration of an exception variable
			catch(ICustomTabsCallback icustomtabscallback)
		//*  44   86:astore_1        
			{
				return false;
		//   45   87:iconst_0        
		//   46   88:ireturn         
			}
			return flag;
			icustomtabscallback;
			map;
			JVM INSTR monitorexit ;
			throw icustomtabscallback;
		}

		public int postMessage(ICustomTabsCallback icustomtabscallback, String s, Bundle bundle)
		{
			return CustomTabsService.this.postMessage(new CustomTabsSessionToken(icustomtabscallback), s, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:new             #26  <Class CustomTabsSessionToken>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    6   12:aload_2         
		//    7   13:aload_3         
		//    8   14:invokevirtual   #71  <Method int CustomTabsService.postMessage(CustomTabsSessionToken, String, Bundle)>
		//    9   17:ireturn         
		}

		public boolean requestPostMessageChannel(ICustomTabsCallback icustomtabscallback, Uri uri)
		{
			return CustomTabsService.this.requestPostMessageChannel(new CustomTabsSessionToken(icustomtabscallback), uri);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:new             #26  <Class CustomTabsSessionToken>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    6   12:aload_2         
		//    7   13:invokevirtual   #76  <Method boolean CustomTabsService.requestPostMessageChannel(CustomTabsSessionToken, Uri)>
		//    8   16:ireturn         
		}

		public boolean updateVisuals(ICustomTabsCallback icustomtabscallback, Bundle bundle)
		{
			return CustomTabsService.this.updateVisuals(new CustomTabsSessionToken(icustomtabscallback), bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:new             #26  <Class CustomTabsSessionToken>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    6   12:aload_2         
		//    7   13:invokevirtual   #81  <Method boolean CustomTabsService.updateVisuals(CustomTabsSessionToken, Bundle)>
		//    8   16:ireturn         
		}

		public boolean validateRelationship(ICustomTabsCallback icustomtabscallback, int i, Uri uri, Bundle bundle)
		{
			return CustomTabsService.this.validateRelationship(new CustomTabsSessionToken(icustomtabscallback), i, uri, bundle);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:new             #26  <Class CustomTabsSessionToken>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void CustomTabsSessionToken(ICustomTabsCallback)>
		//    6   12:iload_2         
		//    7   13:aload_3         
		//    8   14:aload           4
		//    9   16:invokevirtual   #86  <Method boolean CustomTabsService.validateRelationship(CustomTabsSessionToken, int, Uri, Bundle)>
		//   10   19:ireturn         
		}

		public boolean warmup(long l)
		{
			return CustomTabsService.this.warmup(l);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field CustomTabsService this$0>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #90  <Method boolean CustomTabsService.warmup(long)>
		//    4    8:ireturn         
		}

		final CustomTabsService this$0;

			
			{
				this$0 = CustomTabsService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field CustomTabsService this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ICustomTabsService$Stub()>
			//    5    9:return          
			}
	}

}
