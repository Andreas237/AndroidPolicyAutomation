// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeProviderCompatJellyBean, AccessibilityNodeProviderCompatKitKat

public class AccessibilityNodeProviderCompat
{
	static interface AccessibilityNodeProviderImpl
	{

		public abstract Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat);
	}

	static class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
	{

		public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
		{
			return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(((_cls1) (accessibilitynodeprovidercompat)). new AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge() {

				public Object createAccessibilityNodeInfo(int i)
				{
					AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:iload_1         
				//    3    5:invokevirtual   #33  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
				//    4    8:astore_2        
					if(accessibilitynodeinfocompat == null)
				//*   5    9:aload_2         
				//*   6   10:ifnonnull       15
						return ((Object) (null));
				//    7   13:aconst_null     
				//    8   14:areturn         
					else
						return accessibilitynodeinfocompat.getInfo();
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method Object AccessibilityNodeInfoCompat.getInfo()>
				//   11   19:areturn         
				}

				public List findAccessibilityNodeInfosByText(String s, int i)
				{
					s = ((String) (compat.findAccessibilityNodeInfosByText(s, i)));
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokevirtual   #43  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
				//    5    9:astore_1        
					if(s == null)
				//*   6   10:aload_1         
				//*   7   11:ifnonnull       16
						return null;
				//    8   14:aconst_null     
				//    9   15:areturn         
					ArrayList arraylist = new ArrayList();
				//   10   16:new             #45  <Class ArrayList>
				//   11   19:dup             
				//   12   20:invokespecial   #46  <Method void ArrayList()>
				//   13   23:astore          4
					int j = ((List) (s)).size();
				//   14   25:aload_1         
				//   15   26:invokeinterface #52  <Method int List.size()>
				//   16   31:istore_3        
					for(i = 0; i < j; i++)
				//*  17   32:iconst_0        
				//*  18   33:istore_2        
				//*  19   34:iload_2         
				//*  20   35:iload_3         
				//*  21   36:icmpge          67
						((List) (arraylist)).add(((AccessibilityNodeInfoCompat)((List) (s)).get(i)).getInfo());
				//   22   39:aload           4
				//   23   41:aload_1         
				//   24   42:iload_2         
				//   25   43:invokeinterface #55  <Method Object List.get(int)>
				//   26   48:checkcast       #35  <Class AccessibilityNodeInfoCompat>
				//   27   51:invokevirtual   #39  <Method Object AccessibilityNodeInfoCompat.getInfo()>
				//   28   54:invokeinterface #59  <Method boolean List.add(Object)>
				//   29   59:pop             

				//   30   60:iload_2         
				//   31   61:iconst_1        
				//   32   62:iadd            
				//   33   63:istore_2        
				//*  34   64:goto            34
					return ((List) (arraylist));
				//   35   67:aload           4
				//   36   69:areturn         
				}

				public boolean performAction(int i, int j, Bundle bundle)
				{
					return compat.performAction(i, j, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:iload_1         
				//    3    5:iload_2         
				//    4    6:aload_3         
				//    5    7:invokevirtual   #65  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
				//    6   10:ireturn         
				}

				final AccessibilityNodeProviderJellyBeanImpl this$0;
				final AccessibilityNodeProviderCompat val$compat;

			
			{
				this$0 = final_accessibilitynodeproviderjellybeanimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl this$0>
				compat = AccessibilityNodeProviderCompat.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:new             #9   <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #19  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat)>
		//    5    9:invokestatic    #24  <Method Object AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge)>
		//    6   12:areturn         
		}

		AccessibilityNodeProviderJellyBeanImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
	{

		public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
		{
			return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(((_cls1) (accessibilitynodeprovidercompat)). new AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge() {

				public Object createAccessibilityNodeInfo(int i)
				{
					AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:iload_1         
				//    3    5:invokevirtual   #33  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.createAccessibilityNodeInfo(int)>
				//    4    8:astore_2        
					if(accessibilitynodeinfocompat == null)
				//*   5    9:aload_2         
				//*   6   10:ifnonnull       15
						return ((Object) (null));
				//    7   13:aconst_null     
				//    8   14:areturn         
					else
						return accessibilitynodeinfocompat.getInfo();
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method Object AccessibilityNodeInfoCompat.getInfo()>
				//   11   19:areturn         
				}

				public List findAccessibilityNodeInfosByText(String s, int i)
				{
					s = ((String) (compat.findAccessibilityNodeInfosByText(s, i)));
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokevirtual   #43  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
				//    5    9:astore_1        
					if(s == null)
				//*   6   10:aload_1         
				//*   7   11:ifnonnull       16
						return null;
				//    8   14:aconst_null     
				//    9   15:areturn         
					ArrayList arraylist = new ArrayList();
				//   10   16:new             #45  <Class ArrayList>
				//   11   19:dup             
				//   12   20:invokespecial   #46  <Method void ArrayList()>
				//   13   23:astore          4
					int j = ((List) (s)).size();
				//   14   25:aload_1         
				//   15   26:invokeinterface #52  <Method int List.size()>
				//   16   31:istore_3        
					for(i = 0; i < j; i++)
				//*  17   32:iconst_0        
				//*  18   33:istore_2        
				//*  19   34:iload_2         
				//*  20   35:iload_3         
				//*  21   36:icmpge          67
						((List) (arraylist)).add(((AccessibilityNodeInfoCompat)((List) (s)).get(i)).getInfo());
				//   22   39:aload           4
				//   23   41:aload_1         
				//   24   42:iload_2         
				//   25   43:invokeinterface #55  <Method Object List.get(int)>
				//   26   48:checkcast       #35  <Class AccessibilityNodeInfoCompat>
				//   27   51:invokevirtual   #39  <Method Object AccessibilityNodeInfoCompat.getInfo()>
				//   28   54:invokeinterface #59  <Method boolean List.add(Object)>
				//   29   59:pop             

				//   30   60:iload_2         
				//   31   61:iconst_1        
				//   32   62:iadd            
				//   33   63:istore_2        
				//*  34   64:goto            34
					return ((List) (arraylist));
				//   35   67:aload           4
				//   36   69:areturn         
				}

				public Object findFocus(int i)
				{
					AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.findFocus(i);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:iload_1         
				//    3    5:invokevirtual   #64  <Method AccessibilityNodeInfoCompat AccessibilityNodeProviderCompat.findFocus(int)>
				//    4    8:astore_2        
					if(accessibilitynodeinfocompat == null)
				//*   5    9:aload_2         
				//*   6   10:ifnonnull       15
						return ((Object) (null));
				//    7   13:aconst_null     
				//    8   14:areturn         
					else
						return accessibilitynodeinfocompat.getInfo();
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method Object AccessibilityNodeInfoCompat.getInfo()>
				//   11   19:areturn         
				}

				public boolean performAction(int i, int j, Bundle bundle)
				{
					return compat.performAction(i, j, bundle);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:iload_1         
				//    3    5:iload_2         
				//    4    6:aload_3         
				//    5    7:invokevirtual   #68  <Method boolean AccessibilityNodeProviderCompat.performAction(int, int, Bundle)>
				//    6   10:ireturn         
				}

				final AccessibilityNodeProviderKitKatImpl this$0;
				final AccessibilityNodeProviderCompat val$compat;

			
			{
				this$0 = final_accessibilitynodeproviderkitkatimpl;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl this$0>
				compat = AccessibilityNodeProviderCompat.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:new             #9   <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #19  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl, AccessibilityNodeProviderCompat)>
		//    5    9:invokestatic    #24  <Method Object AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge)>
		//    6   12:areturn         
		}

		AccessibilityNodeProviderKitKatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityNodeProviderStubImpl
		implements AccessibilityNodeProviderImpl
	{

		public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilitynodeprovidercompat)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		AccessibilityNodeProviderStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public AccessibilityNodeProviderCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
	//    2    4:aload_0         
	//    3    5:getstatic       #39  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
	//    4    8:aload_0         
	//    5    9:invokeinterface #47  <Method Object AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat)>
	//    6   14:putfield        #49  <Field Object mProvider>
	//    7   17:return          
	}

	public AccessibilityNodeProviderCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mProvider = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field Object mProvider>
	//    5    9:return          
	}

	public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public List findAccessibilityNodeInfosByText(String s, int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public AccessibilityNodeInfoCompat findFocus(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getProvider()
	{
		return mProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object mProvider>
	//    2    4:areturn         
	}

	public boolean performAction(int i, int j, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public static final int HOST_VIEW_ID = -1;
	private static final AccessibilityNodeProviderImpl IMPL;
	private final Object mProvider;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityNodeProviderImpl) (new AccessibilityNodeProviderKitKatImpl()));
	//    3    8:new             #14  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #37  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl()>
	//    6   15:putstatic       #39  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   8   19:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          16
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityNodeProviderImpl) (new AccessibilityNodeProviderJellyBeanImpl()));
	//   11   27:new             #9   <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl>
	//   12   30:dup             
	//   13   31:invokespecial   #40  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl()>
	//   14   34:putstatic       #39  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((AccessibilityNodeProviderImpl) (new AccessibilityNodeProviderStubImpl()));
	//   16   38:new             #19  <Class AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #41  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
	//   19   45:putstatic       #39  <Field AccessibilityNodeProviderCompat$AccessibilityNodeProviderImpl IMPL>
	//*  20   48:return          
	}
}
