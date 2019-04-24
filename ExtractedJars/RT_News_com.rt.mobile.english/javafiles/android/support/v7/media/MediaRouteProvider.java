// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.ObjectsCompat;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteProviderDescriptor, MediaRouteDiscoveryRequest

public abstract class MediaRouteProvider
{
	public static abstract class Callback
	{

		public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
		{
		//    0    0:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class ProviderHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #25  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 37
		//		               2 29
			default:
				return;
		//    3   28:return          

			case 2: // '\002'
				deliverDiscoveryRequestChanged();
		//    4   29:aload_0         
		//    5   30:getfield        #13  <Field MediaRouteProvider this$0>
		//    6   33:invokevirtual   #28  <Method void MediaRouteProvider.deliverDiscoveryRequestChanged()>
				return;
		//    7   36:return          

			case 1: // '\001'
				deliverDescriptorChanged();
		//    8   37:aload_0         
		//    9   38:getfield        #13  <Field MediaRouteProvider this$0>
		//   10   41:invokevirtual   #31  <Method void MediaRouteProvider.deliverDescriptorChanged()>
				return;
		//   11   44:return          
			}
		}

		final MediaRouteProvider this$0;

		ProviderHandler()
		{
			this$0 = MediaRouteProvider.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field MediaRouteProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void Handler()>
		//    5    9:return          
		}
	}

	public static final class ProviderMetadata
	{

		public ComponentName getComponentName()
		{
			return mComponentName;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ComponentName mComponentName>
		//    2    4:areturn         
		}

		public String getPackageName()
		{
			return mComponentName.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field ComponentName mComponentName>
		//    2    4:invokevirtual   #32  <Method String ComponentName.getPackageName()>
		//    3    7:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #35  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #36  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("ProviderMetadata{ componentName=");
		//    4    8:aload_1         
		//    5    9:ldc1            #38  <String "ProviderMetadata{ componentName=">
		//    6   11:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mComponentName.flattenToShortString());
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #23  <Field ComponentName mComponentName>
		//   11   20:invokevirtual   #45  <Method String ComponentName.flattenToShortString()>
		//   12   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" }");
		//   14   27:aload_1         
		//   15   28:ldc1            #47  <String " }">
		//   16   30:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			return stringbuilder.toString();
		//   18   34:aload_1         
		//   19   35:invokevirtual   #49  <Method String StringBuilder.toString()>
		//   20   38:areturn         
		}

		private final ComponentName mComponentName;

		ProviderMetadata(ComponentName componentname)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			if(componentname == null)
		//*   2    4:aload_1         
		//*   3    5:ifnonnull       18
			{
				throw new IllegalArgumentException("componentName must not be null");
		//    4    8:new             #16  <Class IllegalArgumentException>
		//    5   11:dup             
		//    6   12:ldc1            #18  <String "componentName must not be null">
		//    7   14:invokespecial   #21  <Method void IllegalArgumentException(String)>
		//    8   17:athrow          
			} else
			{
				mComponentName = componentname;
		//    9   18:aload_0         
		//   10   19:aload_1         
		//   11   20:putfield        #23  <Field ComponentName mComponentName>
				return;
		//   12   23:return          
			}
		}
	}

	public static abstract class RouteController
	{

		public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onRelease()
		{
		//    0    0:return          
		}

		public void onSelect()
		{
		//    0    0:return          
		}

		public void onSetVolume(int i)
		{
		//    0    0:return          
		}

		public void onUnselect()
		{
		//    0    0:return          
		}

		public void onUnselect(int i)
		{
			onUnselect();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #23  <Method void onUnselect()>
		//    2    4:return          
		}

		public void onUpdateVolume(int i)
		{
		//    0    0:return          
		}

		public RouteController()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public MediaRouteProvider(Context context)
	{
		this(context, ((ProviderMetadata) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #42  <Method void MediaRouteProvider(Context, MediaRouteProvider$ProviderMetadata)>
	//    4    6:return          
	}

	MediaRouteProvider(Context context, ProviderMetadata providermetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		mHandler = new ProviderHandler();
	//    2    4:aload_0         
	//    3    5:new             #9   <Class MediaRouteProvider$ProviderHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #50  <Method void MediaRouteProvider$ProviderHandler(MediaRouteProvider)>
	//    7   13:putfield        #52  <Field MediaRouteProvider$ProviderHandler mHandler>
		if(context == null)
	//*   8   16:aload_1         
	//*   9   17:ifnonnull       30
			throw new IllegalArgumentException("context must not be null");
	//   10   20:new             #54  <Class IllegalArgumentException>
	//   11   23:dup             
	//   12   24:ldc1            #56  <String "context must not be null">
	//   13   26:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   14   29:athrow          
		mContext = context;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:putfield        #61  <Field Context mContext>
		if(providermetadata == null)
	//*  18   35:aload_2         
	//*  19   36:ifnonnull       63
		{
			mMetadata = new ProviderMetadata(new ComponentName(context, ((Object)this).getClass()));
	//   20   39:aload_0         
	//   21   40:new             #12  <Class MediaRouteProvider$ProviderMetadata>
	//   22   43:dup             
	//   23   44:new             #63  <Class ComponentName>
	//   24   47:dup             
	//   25   48:aload_1         
	//   26   49:aload_0         
	//   27   50:invokevirtual   #67  <Method Class Object.getClass()>
	//   28   53:invokespecial   #70  <Method void ComponentName(Context, Class)>
	//   29   56:invokespecial   #73  <Method void MediaRouteProvider$ProviderMetadata(ComponentName)>
	//   30   59:putfield        #75  <Field MediaRouteProvider$ProviderMetadata mMetadata>
			return;
	//   31   62:return          
		} else
		{
			mMetadata = providermetadata;
	//   32   63:aload_0         
	//   33   64:aload_2         
	//   34   65:putfield        #75  <Field MediaRouteProvider$ProviderMetadata mMetadata>
			return;
	//   35   68:return          
		}
	}

	void deliverDescriptorChanged()
	{
		mPendingDescriptorChange = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #78  <Field boolean mPendingDescriptorChange>
		if(mCallback != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field MediaRouteProvider$Callback mCallback>
	//*   5    9:ifnull          24
			mCallback.onDescriptorChanged(this, mDescriptor);
	//    6   12:aload_0         
	//    7   13:getfield        #80  <Field MediaRouteProvider$Callback mCallback>
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #82  <Field MediaRouteProviderDescriptor mDescriptor>
	//   11   21:invokevirtual   #86  <Method void MediaRouteProvider$Callback.onDescriptorChanged(MediaRouteProvider, MediaRouteProviderDescriptor)>
	//   12   24:return          
	}

	void deliverDiscoveryRequestChanged()
	{
		mPendingDiscoveryRequestChange = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #89  <Field boolean mPendingDiscoveryRequestChange>
		onDiscoveryRequestChanged(mDiscoveryRequest);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #91  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//    6   10:invokevirtual   #95  <Method void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest)>
	//    7   13:return          
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Context mContext>
	//    2    4:areturn         
	}

	public final MediaRouteProviderDescriptor getDescriptor()
	{
		return mDescriptor;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field MediaRouteProviderDescriptor mDescriptor>
	//    2    4:areturn         
	}

	public final MediaRouteDiscoveryRequest getDiscoveryRequest()
	{
		return mDiscoveryRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//    2    4:areturn         
	}

	public final Handler getHandler()
	{
		return ((Handler) (mHandler));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field MediaRouteProvider$ProviderHandler mHandler>
	//    2    4:areturn         
	}

	public final ProviderMetadata getMetadata()
	{
		return mMetadata;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field MediaRouteProvider$ProviderMetadata mMetadata>
	//    2    4:areturn         
	}

	public RouteController onCreateRouteController(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("routeId cannot be null");
	//    2    4:new             #54  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #111 <String "routeId cannot be null">
	//    5   10:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return null;
	//    7   14:aconst_null     
	//    8   15:areturn         
	}

	public RouteController onCreateRouteController(String s, String s1)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("routeId cannot be null");
	//    2    4:new             #54  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #111 <String "routeId cannot be null">
	//    5   10:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(s1 == null)
	//*   7   14:aload_2         
	//*   8   15:ifnonnull       28
			throw new IllegalArgumentException("routeGroupId cannot be null");
	//    9   18:new             #54  <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #118 <String "routeGroupId cannot be null">
	//   12   24:invokespecial   #59  <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		else
			return onCreateRouteController(s);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #120 <Method MediaRouteProvider$RouteController onCreateRouteController(String)>
	//   17   33:areturn         
	}

	public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
	//    0    0:return          
	}

	public final void setCallback(Callback callback)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #127 <Method void MediaRouter.checkCallingThread()>
		mCallback = callback;
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:putfield        #80  <Field MediaRouteProvider$Callback mCallback>
	//    4    8:return          
	}

	public final void setDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #127 <Method void MediaRouter.checkCallingThread()>
		if(mDescriptor != mediarouteproviderdescriptor)
	//*   1    3:aload_0         
	//*   2    4:getfield        #82  <Field MediaRouteProviderDescriptor mDescriptor>
	//*   3    7:aload_1         
	//*   4    8:if_acmpeq       37
		{
			mDescriptor = mediarouteproviderdescriptor;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #82  <Field MediaRouteProviderDescriptor mDescriptor>
			if(!mPendingDescriptorChange)
	//*   8   16:aload_0         
	//*   9   17:getfield        #78  <Field boolean mPendingDescriptorChange>
	//*  10   20:ifne            37
			{
				mPendingDescriptorChange = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #78  <Field boolean mPendingDescriptorChange>
				mHandler.sendEmptyMessage(1);
	//   14   28:aload_0         
	//   15   29:getfield        #52  <Field MediaRouteProvider$ProviderHandler mHandler>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #133 <Method boolean MediaRouteProvider$ProviderHandler.sendEmptyMessage(int)>
	//   18   36:pop             
			}
		}
	//   19   37:return          
	}

	public final void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #127 <Method void MediaRouter.checkCallingThread()>
		if(ObjectsCompat.equals(((Object) (mDiscoveryRequest)), ((Object) (mediaroutediscoveryrequest))))
	//*   1    3:aload_0         
	//*   2    4:getfield        #91  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #140 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		mDiscoveryRequest = mediaroutediscoveryrequest;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #91  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		if(!mPendingDiscoveryRequestChange)
	//*  10   20:aload_0         
	//*  11   21:getfield        #89  <Field boolean mPendingDiscoveryRequestChange>
	//*  12   24:ifne            41
		{
			mPendingDiscoveryRequestChange = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #89  <Field boolean mPendingDiscoveryRequestChange>
			mHandler.sendEmptyMessage(2);
	//   16   32:aload_0         
	//   17   33:getfield        #52  <Field MediaRouteProvider$ProviderHandler mHandler>
	//   18   36:iconst_2        
	//   19   37:invokevirtual   #133 <Method boolean MediaRouteProvider$ProviderHandler.sendEmptyMessage(int)>
	//   20   40:pop             
		}
	//   21   41:return          
	}

	static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
	static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
	private Callback mCallback;
	private final Context mContext;
	private MediaRouteProviderDescriptor mDescriptor;
	private MediaRouteDiscoveryRequest mDiscoveryRequest;
	private final ProviderHandler mHandler;
	private final ProviderMetadata mMetadata;
	private boolean mPendingDescriptorChange;
	private boolean mPendingDiscoveryRequestChange;
}
