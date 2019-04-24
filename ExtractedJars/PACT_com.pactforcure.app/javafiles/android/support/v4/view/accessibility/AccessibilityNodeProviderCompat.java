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

	private static class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl
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
						return ((Object) (accessibilitynodeinfocompat.unwrap()));
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
				//   11   19:areturn         
				}

				public List findAccessibilityNodeInfosByText(String s, int i)
				{
					List list = compat.findAccessibilityNodeInfosByText(s, i);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokevirtual   #43  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
				//    5    9:astore          5
					if(list != null) goto _L2; else goto _L1
				//    6   11:aload           5
				//    7   13:ifnonnull       20
_L1:
					s = null;
				//    8   16:aconst_null     
				//    9   17:astore_1        
_L4:
					return ((List) (s));
				//   10   18:aload_1         
				//   11   19:areturn         
_L2:
					ArrayList arraylist = new ArrayList();
				//   12   20:new             #45  <Class ArrayList>
				//   13   23:dup             
				//   14   24:invokespecial   #46  <Method void ArrayList()>
				//   15   27:astore          4
					int j = list.size();
				//   16   29:aload           5
				//   17   31:invokeinterface #52  <Method int List.size()>
				//   18   36:istore_3        
					i = 0;
				//   19   37:iconst_0        
				//   20   38:istore_2        
					do
					{
						s = ((String) (arraylist));
				//   21   39:aload           4
				//   22   41:astore_1        
						if(i >= j)
							continue;
				//   23   42:iload_2         
				//   24   43:iload_3         
				//   25   44:icmpge          18
						((List) (arraylist)).add(((Object) (((AccessibilityNodeInfoCompat)list.get(i)).unwrap())));
				//   26   47:aload           4
				//   27   49:aload           5
				//   28   51:iload_2         
				//   29   52:invokeinterface #55  <Method Object List.get(int)>
				//   30   57:checkcast       #35  <Class AccessibilityNodeInfoCompat>
				//   31   60:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
				//   32   63:invokeinterface #59  <Method boolean List.add(Object)>
				//   33   68:pop             
						i++;
				//   34   69:iload_2         
				//   35   70:iconst_1        
				//   36   71:iadd            
				//   37   72:istore_2        
					} while(true);
				//   38   73:goto            39
					if(true) goto _L4; else goto _L3
_L3:
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
		//    4    6:invokespecial   #22  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat)>
		//    5    9:invokestatic    #27  <Method Object AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatJellyBean$AccessibilityNodeInfoBridge)>
		//    6   12:areturn         
		}

		AccessibilityNodeProviderJellyBeanImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
		//    2    4:return          
		}
	}

	private static class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl
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
						return ((Object) (accessibilitynodeinfocompat.unwrap()));
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
				//   11   19:areturn         
				}

				public List findAccessibilityNodeInfosByText(String s, int i)
				{
					List list = compat.findAccessibilityNodeInfosByText(s, i);
				//    0    0:aload_0         
				//    1    1:getfield        #24  <Field AccessibilityNodeProviderCompat val$compat>
				//    2    4:aload_1         
				//    3    5:iload_2         
				//    4    6:invokevirtual   #43  <Method List AccessibilityNodeProviderCompat.findAccessibilityNodeInfosByText(String, int)>
				//    5    9:astore          5
					if(list != null) goto _L2; else goto _L1
				//    6   11:aload           5
				//    7   13:ifnonnull       20
_L1:
					s = null;
				//    8   16:aconst_null     
				//    9   17:astore_1        
_L4:
					return ((List) (s));
				//   10   18:aload_1         
				//   11   19:areturn         
_L2:
					ArrayList arraylist = new ArrayList();
				//   12   20:new             #45  <Class ArrayList>
				//   13   23:dup             
				//   14   24:invokespecial   #46  <Method void ArrayList()>
				//   15   27:astore          4
					int j = list.size();
				//   16   29:aload           5
				//   17   31:invokeinterface #52  <Method int List.size()>
				//   18   36:istore_3        
					i = 0;
				//   19   37:iconst_0        
				//   20   38:istore_2        
					do
					{
						s = ((String) (arraylist));
				//   21   39:aload           4
				//   22   41:astore_1        
						if(i >= j)
							continue;
				//   23   42:iload_2         
				//   24   43:iload_3         
				//   25   44:icmpge          18
						((List) (arraylist)).add(((Object) (((AccessibilityNodeInfoCompat)list.get(i)).unwrap())));
				//   26   47:aload           4
				//   27   49:aload           5
				//   28   51:iload_2         
				//   29   52:invokeinterface #55  <Method Object List.get(int)>
				//   30   57:checkcast       #35  <Class AccessibilityNodeInfoCompat>
				//   31   60:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
				//   32   63:invokeinterface #59  <Method boolean List.add(Object)>
				//   33   68:pop             
						i++;
				//   34   69:iload_2         
				//   35   70:iconst_1        
				//   36   71:iadd            
				//   37   72:istore_2        
					} while(true);
				//   38   73:goto            39
					if(true) goto _L4; else goto _L3
_L3:
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
						return ((Object) (accessibilitynodeinfocompat.unwrap()));
				//    9   15:aload_2         
				//   10   16:invokevirtual   #39  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityNodeInfoCompat.unwrap()>
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
		//    4    6:invokespecial   #22  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl$1(AccessibilityNodeProviderCompat$AccessibilityNodeProviderKitKatImpl, AccessibilityNodeProviderCompat)>
		//    5    9:invokestatic    #27  <Method Object AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompatKitKat$AccessibilityNodeInfoBridge)>
		//    6   12:areturn         
		}

		AccessibilityNodeProviderKitKatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void AccessibilityNodeProviderCompat$AccessibilityNodeProviderStubImpl()>
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
