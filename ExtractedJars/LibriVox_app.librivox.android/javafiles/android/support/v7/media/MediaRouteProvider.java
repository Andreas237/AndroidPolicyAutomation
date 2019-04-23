// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.support.v4.g.p;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteProviderDescriptor, MediaRouteDiscoveryRequest

public abstract class MediaRouteProvider
{

	public MediaRouteProvider(Context context)
	{
		this(context, ((ProviderMetadata) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #29  <Method void MediaRouteProvider(Context, MediaRouteProvider$ProviderMetadata)>
	//    4    6:return          
	}

	MediaRouteProvider(Context context, ProviderMetadata providermetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mHandler = new ProviderHandler();
	//    2    4:aload_0         
	//    3    5:new             #35  <Class MediaRouteProvider$ProviderHandler>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #38  <Method void MediaRouteProvider$ProviderHandler(MediaRouteProvider)>
	//    7   13:putfield        #40  <Field MediaRouteProvider$ProviderHandler mHandler>
		if(context != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          59
		{
			mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #42  <Field Context mContext>
			if(providermetadata == null)
	//*  13   25:aload_2         
	//*  14   26:ifnonnull       53
			{
				mMetadata = new ProviderMetadata(new ComponentName(context, ((Object)this).getClass()));
	//   15   29:aload_0         
	//   16   30:new             #44  <Class MediaRouteProvider$ProviderMetadata>
	//   17   33:dup             
	//   18   34:new             #46  <Class ComponentName>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:invokevirtual   #50  <Method Class Object.getClass()>
	//   23   43:invokespecial   #53  <Method void ComponentName(Context, Class)>
	//   24   46:invokespecial   #56  <Method void MediaRouteProvider$ProviderMetadata(ComponentName)>
	//   25   49:putfield        #58  <Field MediaRouteProvider$ProviderMetadata mMetadata>
				return;
	//   26   52:return          
			} else
			{
				mMetadata = providermetadata;
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:putfield        #58  <Field MediaRouteProvider$ProviderMetadata mMetadata>
				return;
	//   30   58:return          
			}
		} else
		{
			throw new IllegalArgumentException("context must not be null");
	//   31   59:new             #60  <Class IllegalArgumentException>
	//   32   62:dup             
	//   33   63:ldc1            #62  <String "context must not be null">
	//   34   65:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
		}
	}

	void deliverDescriptorChanged()
	{
		mPendingDescriptorChange = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #68  <Field boolean mPendingDescriptorChange>
		Callback callback = mCallback;
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field MediaRouteProvider$Callback mCallback>
	//    5    9:astore_1        
		if(callback != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          23
			callback.onDescriptorChanged(this, mDescriptor);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #72  <Field MediaRouteProviderDescriptor mDescriptor>
	//   12   20:invokevirtual   #78  <Method void MediaRouteProvider$Callback.onDescriptorChanged(MediaRouteProvider, MediaRouteProviderDescriptor)>
	//   13   23:return          
	}

	void deliverDiscoveryRequestChanged()
	{
		mPendingDiscoveryRequestChange = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #81  <Field boolean mPendingDiscoveryRequestChange>
		onDiscoveryRequestChanged(mDiscoveryRequest);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #83  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//    6   10:invokevirtual   #87  <Method void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest)>
	//    7   13:return          
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Context mContext>
	//    2    4:areturn         
	}

	public final MediaRouteProviderDescriptor getDescriptor()
	{
		return mDescriptor;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field MediaRouteProviderDescriptor mDescriptor>
	//    2    4:areturn         
	}

	public final MediaRouteDiscoveryRequest getDiscoveryRequest()
	{
		return mDiscoveryRequest;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//    2    4:areturn         
	}

	public final Handler getHandler()
	{
		return ((Handler) (mHandler));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field MediaRouteProvider$ProviderHandler mHandler>
	//    2    4:areturn         
	}

	public final ProviderMetadata getMetadata()
	{
		return mMetadata;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field MediaRouteProvider$ProviderMetadata mMetadata>
	//    2    4:areturn         
	}

	public RouteController onCreateRouteController(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			throw new IllegalArgumentException("routeId cannot be null");
	//    4    6:new             #60  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:ldc1            #101 <String "routeId cannot be null">
	//    7   12:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    8   15:athrow          
	}

	public RouteController onCreateRouteController(String s, String s1)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			if(s1 != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          14
				return onCreateRouteController(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #104 <Method MediaRouteProvider$RouteController onCreateRouteController(String)>
	//    7   13:areturn         
			else
				throw new IllegalArgumentException("routeGroupId cannot be null");
	//    8   14:new             #60  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #106 <String "routeGroupId cannot be null">
	//   11   20:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		} else
		{
			throw new IllegalArgumentException("routeId cannot be null");
	//   13   24:new             #60  <Class IllegalArgumentException>
	//   14   27:dup             
	//   15   28:ldc1            #101 <String "routeId cannot be null">
	//   16   30:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//   17   33:athrow          
		}
	}

	public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
	//    0    0:return          
	}

	public final void setCallback(Callback callback)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #113 <Method void MediaRouter.checkCallingThread()>
		mCallback = callback;
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:putfield        #70  <Field MediaRouteProvider$Callback mCallback>
	//    4    8:return          
	}

	public final void setDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #113 <Method void MediaRouter.checkCallingThread()>
		if(mDescriptor != mediarouteproviderdescriptor)
	//*   1    3:aload_0         
	//*   2    4:getfield        #72  <Field MediaRouteProviderDescriptor mDescriptor>
	//*   3    7:aload_1         
	//*   4    8:if_acmpeq       37
		{
			mDescriptor = mediarouteproviderdescriptor;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #72  <Field MediaRouteProviderDescriptor mDescriptor>
			if(!mPendingDescriptorChange)
	//*   8   16:aload_0         
	//*   9   17:getfield        #68  <Field boolean mPendingDescriptorChange>
	//*  10   20:ifne            37
			{
				mPendingDescriptorChange = true;
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:putfield        #68  <Field boolean mPendingDescriptorChange>
				mHandler.sendEmptyMessage(1);
	//   14   28:aload_0         
	//   15   29:getfield        #40  <Field MediaRouteProvider$ProviderHandler mHandler>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #119 <Method boolean MediaRouteProvider$ProviderHandler.sendEmptyMessage(int)>
	//   18   36:pop             
			}
		}
	//   19   37:return          
	}

	public final void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
	{
		MediaRouter.checkCallingThread();
	//    0    0:invokestatic    #113 <Method void MediaRouter.checkCallingThread()>
		if(p.a(((Object) (mDiscoveryRequest)), ((Object) (mediaroutediscoveryrequest))))
	//*   1    3:aload_0         
	//*   2    4:getfield        #83  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
	//*   3    7:aload_1         
	//*   4    8:invokestatic    #126 <Method boolean p.a(Object, Object)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		mDiscoveryRequest = mediaroutediscoveryrequest;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #83  <Field MediaRouteDiscoveryRequest mDiscoveryRequest>
		if(!mPendingDiscoveryRequestChange)
	//*  10   20:aload_0         
	//*  11   21:getfield        #81  <Field boolean mPendingDiscoveryRequestChange>
	//*  12   24:ifne            41
		{
			mPendingDiscoveryRequestChange = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #81  <Field boolean mPendingDiscoveryRequestChange>
			mHandler.sendEmptyMessage(2);
	//   16   32:aload_0         
	//   17   33:getfield        #40  <Field MediaRouteProvider$ProviderHandler mHandler>
	//   18   36:iconst_2        
	//   19   37:invokevirtual   #119 <Method boolean MediaRouteProvider$ProviderHandler.sendEmptyMessage(int)>
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

	private class ProviderHandler extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field int Message.what>
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
		//    5   30:getfield        #10  <Field MediaRouteProvider this$0>
		//    6   33:invokevirtual   #27  <Method void MediaRouteProvider.deliverDiscoveryRequestChanged()>
				return;
		//    7   36:return          

			case 1: // '\001'
				deliverDescriptorChanged();
		//    8   37:aload_0         
		//    9   38:getfield        #10  <Field MediaRouteProvider this$0>
		//   10   41:invokevirtual   #30  <Method void MediaRouteProvider.deliverDescriptorChanged()>
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
		//    2    2:putfield        #10  <Field MediaRouteProvider this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #13  <Method void Handler()>
		//    5    9:return          
		}
	}


	private class ProviderMetadata
	{

		public ComponentName getComponentName()
		{
			return mComponentName;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ComponentName mComponentName>
		//    2    4:areturn         
		}

		public String getPackageName()
		{
			return mComponentName.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ComponentName mComponentName>
		//    2    4:invokevirtual   #29  <Method String ComponentName.getPackageName()>
		//    3    7:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #32  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #33  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("ProviderMetadata{ componentName=");
		//    4    8:aload_1         
		//    5    9:ldc1            #35  <String "ProviderMetadata{ componentName=">
		//    6   11:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mComponentName.flattenToShortString());
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #13  <Field ComponentName mComponentName>
		//   11   20:invokevirtual   #42  <Method String ComponentName.flattenToShortString()>
		//   12   23:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(" }");
		//   14   27:aload_1         
		//   15   28:ldc1            #44  <String " }">
		//   16   30:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			return stringbuilder.toString();
		//   18   34:aload_1         
		//   19   35:invokevirtual   #46  <Method String StringBuilder.toString()>
		//   20   38:areturn         
		}

		private final ComponentName mComponentName;

		ProviderMetadata(ComponentName componentname)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
			if(componentname != null)
		//*   2    4:aload_1         
		//*   3    5:ifnull          14
			{
				mComponentName = componentname;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #13  <Field ComponentName mComponentName>
				return;
		//    7   13:return          
			} else
			{
				throw new IllegalArgumentException("componentName must not be null");
		//    8   14:new             #15  <Class IllegalArgumentException>
		//    9   17:dup             
		//   10   18:ldc1            #17  <String "componentName must not be null">
		//   11   20:invokespecial   #20  <Method void IllegalArgumentException(String)>
		//   12   23:athrow          
			}
		}
	}


	private class Callback
	{

		public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
		{
		//    0    0:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #8   <Method void Object()>
		//    2    4:return          
		}
	}

}
