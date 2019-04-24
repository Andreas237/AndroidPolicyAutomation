// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.customtabs;

import android.net.Uri;
import android.os.*;

// Referenced classes of package android.support.customtabs:
//			CustomTabsCallback, CustomTabsClient

class CustomTabsClient$2$3
	implements Runnable
{

	public void run()
	{
		val$callback.onMessageChannelReady(val$extras);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field CustomTabsClient$2 this$1>
	//    2    4:getfield        #30  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Bundle val$extras>
	//    5   11:invokevirtual   #33  <Method void CustomTabsCallback.onMessageChannelReady(Bundle)>
	//    6   14:return          
	}

	final CustomTabsClient._cls2 this$1;
	final Bundle val$extras;

	CustomTabsClient$2$3()
	{
		this$1 = final__pcls2;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field CustomTabsClient$2 this$1>
		val$extras = Bundle.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Bundle val$extras>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class android/support/customtabs/CustomTabsClient$2

/* anonymous class */
	class CustomTabsClient._cls2 extends ICustomTabsCallback.Stub
	{

		public void extraCallback(final String callbackName, final Bundle args)
			throws RemoteException
		{
			if(callback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				mHandler.post(new CustomTabsClient._cls2._cls2());
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Handler mHandler>
		//    6   12:new             #13  <Class CustomTabsClient$2$2>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokespecial   #55  <Method void CustomTabsClient$2$2(CustomTabsClient$2, String, Bundle)>
		//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   13   25:pop             
				return;
		//   14   26:return          
			}
		}

		public void onMessageChannelReady(Bundle bundle)
			throws RemoteException
		{
			if(callback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				mHandler.post(((Runnable) (((CustomTabsClient._cls2._cls3) (bundle)). new CustomTabsClient._cls2._cls3())));
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Handler mHandler>
		//    6   12:new             #15  <Class CustomTabsClient$2$3>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #65  <Method void CustomTabsClient$2$3(CustomTabsClient$2, Bundle)>
		//   11   21:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   12   24:pop             
				return;
		//   13   25:return          
			}
		}

		public void onNavigationEvent(final int navigationEvent, final Bundle extras)
		{
			if(callback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				mHandler.post(new CustomTabsClient._cls2._cls1());
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Handler mHandler>
		//    6   12:new             #11  <Class CustomTabsClient$2$1>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:aload_2         
		//   11   19:invokespecial   #70  <Method void CustomTabsClient$2$1(CustomTabsClient$2, int, Bundle)>
		//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   13   25:pop             
				return;
		//   14   26:return          
			}
		}

		public void onPostMessage(final String message, final Bundle extras)
			throws RemoteException
		{
			if(callback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				mHandler.post(new CustomTabsClient._cls2._cls4());
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Handler mHandler>
		//    6   12:new             #17  <Class CustomTabsClient$2$4>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:aload_2         
		//   11   19:invokespecial   #72  <Method void CustomTabsClient$2$4(CustomTabsClient$2, String, Bundle)>
		//   12   22:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   13   25:pop             
				return;
		//   14   26:return          
			}
		}

		public void onRelationshipValidationResult(final int relation, final Uri requestedOrigin, final boolean result, final Bundle extras)
			throws RemoteException
		{
			if(callback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field CustomTabsCallback val$callback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				mHandler.post(new CustomTabsClient._cls2._cls5());
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field Handler mHandler>
		//    6   12:new             #19  <Class CustomTabsClient$2$5>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:aload_2         
		//   11   19:iload_3         
		//   12   20:aload           4
		//   13   22:invokespecial   #78  <Method void CustomTabsClient$2$5(CustomTabsClient$2, int, Uri, boolean, Bundle)>
		//   14   25:invokevirtual   #59  <Method boolean Handler.post(Runnable)>
		//   15   28:pop             
				return;
		//   16   29:return          
			}
		}

		private Handler mHandler;
		final CustomTabsClient this$0;
		final CustomTabsCallback val$callback;

			
			{
				this$0 = final_customtabsclient;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field CustomTabsClient this$0>
				callback = CustomTabsCallback.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field CustomTabsCallback val$callback>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #34  <Method void ICustomTabsCallback$Stub()>
				mHandler = new Handler(Looper.getMainLooper());
			//    8   14:aload_0         
			//    9   15:new             #36  <Class Handler>
			//   10   18:dup             
			//   11   19:invokestatic    #42  <Method Looper Looper.getMainLooper()>
			//   12   22:invokespecial   #45  <Method void Handler(Looper)>
			//   13   25:putfield        #47  <Field Handler mHandler>
			//   14   28:return          
			}

		// Unreferenced inner class android/support/customtabs/CustomTabsClient$2$1

/* anonymous class */
		class CustomTabsClient._cls2._cls1
			implements Runnable
		{

			public void run()
			{
				callback.onNavigationEvent(navigationEvent, extras);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
			//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field int val$navigationEvent>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field Bundle val$extras>
			//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.onNavigationEvent(int, Bundle)>
			//    8   18:return          
			}

			final CustomTabsClient._cls2 this$1;
			final Bundle val$extras;
			final int val$navigationEvent;

					
					{
						this$1 = CustomTabsClient._cls2.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
						navigationEvent = i;
					//    3    5:aload_0         
					//    4    6:iload_2         
					//    5    7:putfield        #23  <Field int val$navigationEvent>
						extras = bundle;
					//    6   10:aload_0         
					//    7   11:aload_3         
					//    8   12:putfield        #25  <Field Bundle val$extras>
						super();
					//    9   15:aload_0         
					//   10   16:invokespecial   #28  <Method void Object()>
					//   11   19:return          
					}
		}


		// Unreferenced inner class android/support/customtabs/CustomTabsClient$2$2

/* anonymous class */
		class CustomTabsClient._cls2._cls2
			implements Runnable
		{

			public void run()
			{
				callback.extraCallback(callbackName, args);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
			//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field String val$callbackName>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field Bundle val$args>
			//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.extraCallback(String, Bundle)>
			//    8   18:return          
			}

			final CustomTabsClient._cls2 this$1;
			final Bundle val$args;
			final String val$callbackName;

					
					{
						this$1 = CustomTabsClient._cls2.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
						callbackName = s;
					//    3    5:aload_0         
					//    4    6:aload_2         
					//    5    7:putfield        #23  <Field String val$callbackName>
						args = bundle;
					//    6   10:aload_0         
					//    7   11:aload_3         
					//    8   12:putfield        #25  <Field Bundle val$args>
						super();
					//    9   15:aload_0         
					//   10   16:invokespecial   #28  <Method void Object()>
					//   11   19:return          
					}
		}


		// Unreferenced inner class android/support/customtabs/CustomTabsClient$2$4

/* anonymous class */
		class CustomTabsClient._cls2._cls4
			implements Runnable
		{

			public void run()
			{
				callback.onPostMessage(message, extras);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CustomTabsClient$2 this$1>
			//    2    4:getfield        #34  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field String val$message>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field Bundle val$extras>
			//    7   15:invokevirtual   #37  <Method void CustomTabsCallback.onPostMessage(String, Bundle)>
			//    8   18:return          
			}

			final CustomTabsClient._cls2 this$1;
			final Bundle val$extras;
			final String val$message;

					
					{
						this$1 = CustomTabsClient._cls2.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #21  <Field CustomTabsClient$2 this$1>
						message = s;
					//    3    5:aload_0         
					//    4    6:aload_2         
					//    5    7:putfield        #23  <Field String val$message>
						extras = bundle;
					//    6   10:aload_0         
					//    7   11:aload_3         
					//    8   12:putfield        #25  <Field Bundle val$extras>
						super();
					//    9   15:aload_0         
					//   10   16:invokespecial   #28  <Method void Object()>
					//   11   19:return          
					}
		}


		// Unreferenced inner class android/support/customtabs/CustomTabsClient$2$5

/* anonymous class */
		class CustomTabsClient._cls2._cls5
			implements Runnable
		{

			public void run()
			{
				callback.onRelationshipValidationResult(relation, requestedOrigin, result, extras);
			//    0    0:aload_0         
			//    1    1:getfield        #25  <Field CustomTabsClient$2 this$1>
			//    2    4:getfield        #42  <Field CustomTabsCallback CustomTabsClient$2.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #27  <Field int val$relation>
			//    5   11:aload_0         
			//    6   12:getfield        #29  <Field Uri val$requestedOrigin>
			//    7   15:aload_0         
			//    8   16:getfield        #31  <Field boolean val$result>
			//    9   19:aload_0         
			//   10   20:getfield        #33  <Field Bundle val$extras>
			//   11   23:invokevirtual   #45  <Method void CustomTabsCallback.onRelationshipValidationResult(int, Uri, boolean, Bundle)>
			//   12   26:return          
			}

			final CustomTabsClient._cls2 this$1;
			final Bundle val$extras;
			final int val$relation;
			final Uri val$requestedOrigin;
			final boolean val$result;

					
					{
						this$1 = CustomTabsClient._cls2.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #25  <Field CustomTabsClient$2 this$1>
						relation = i;
					//    3    5:aload_0         
					//    4    6:iload_2         
					//    5    7:putfield        #27  <Field int val$relation>
						requestedOrigin = uri;
					//    6   10:aload_0         
					//    7   11:aload_3         
					//    8   12:putfield        #29  <Field Uri val$requestedOrigin>
						result = flag;
					//    9   15:aload_0         
					//   10   16:iload           4
					//   11   18:putfield        #31  <Field boolean val$result>
						extras = bundle;
					//   12   21:aload_0         
					//   13   22:aload           5
					//   14   24:putfield        #33  <Field Bundle val$extras>
						super();
					//   15   27:aload_0         
					//   16   28:invokespecial   #36  <Method void Object()>
					//   17   31:return          
					}
		}

	}

}
