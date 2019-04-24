// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityWindowInfoCompatApi21, AccessibilityWindowInfoCompatApi24

public class AccessibilityWindowInfoCompat
{
	static class AccessibilityWindowInfoApi21Impl extends AccessibilityWindowInfoStubImpl
	{

		public void getBoundsInScreen(Object obj, Rect rect)
		{
			AccessibilityWindowInfoCompatApi21.getBoundsInScreen(obj, rect);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #18  <Method void AccessibilityWindowInfoCompatApi21.getBoundsInScreen(Object, Rect)>
		//    3    5:return          
		}

		public Object getChild(Object obj, int i)
		{
			return AccessibilityWindowInfoCompatApi21.getChild(obj, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #22  <Method Object AccessibilityWindowInfoCompatApi21.getChild(Object, int)>
		//    3    5:areturn         
		}

		public int getChildCount(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getChildCount(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int AccessibilityWindowInfoCompatApi21.getChildCount(Object)>
		//    2    4:ireturn         
		}

		public int getId(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getId(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #29  <Method int AccessibilityWindowInfoCompatApi21.getId(Object)>
		//    2    4:ireturn         
		}

		public int getLayer(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getLayer(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #32  <Method int AccessibilityWindowInfoCompatApi21.getLayer(Object)>
		//    2    4:ireturn         
		}

		public Object getParent(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getParent(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #36  <Method Object AccessibilityWindowInfoCompatApi21.getParent(Object)>
		//    2    4:areturn         
		}

		public Object getRoot(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getRoot(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #39  <Method Object AccessibilityWindowInfoCompatApi21.getRoot(Object)>
		//    2    4:areturn         
		}

		public int getType(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.getType(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #42  <Method int AccessibilityWindowInfoCompatApi21.getType(Object)>
		//    2    4:ireturn         
		}

		public boolean isAccessibilityFocused(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.isAccessibilityFocused(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #46  <Method boolean AccessibilityWindowInfoCompatApi21.isAccessibilityFocused(Object)>
		//    2    4:ireturn         
		}

		public boolean isActive(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.isActive(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #49  <Method boolean AccessibilityWindowInfoCompatApi21.isActive(Object)>
		//    2    4:ireturn         
		}

		public boolean isFocused(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.isFocused(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #52  <Method boolean AccessibilityWindowInfoCompatApi21.isFocused(Object)>
		//    2    4:ireturn         
		}

		public Object obtain()
		{
			return AccessibilityWindowInfoCompatApi21.obtain();
		//    0    0:invokestatic    #56  <Method Object AccessibilityWindowInfoCompatApi21.obtain()>
		//    1    3:areturn         
		}

		public Object obtain(Object obj)
		{
			return AccessibilityWindowInfoCompatApi21.obtain(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #58  <Method Object AccessibilityWindowInfoCompatApi21.obtain(Object)>
		//    2    4:areturn         
		}

		public void recycle(Object obj)
		{
			AccessibilityWindowInfoCompatApi21.recycle(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #62  <Method void AccessibilityWindowInfoCompatApi21.recycle(Object)>
		//    2    4:return          
		}

		AccessibilityWindowInfoApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityWindowInfoApi24Impl extends AccessibilityWindowInfoApi21Impl
	{

		public Object getAnchor(Object obj)
		{
			return AccessibilityWindowInfoCompatApi24.getAnchor(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method Object AccessibilityWindowInfoCompatApi24.getAnchor(Object)>
		//    2    4:areturn         
		}

		public CharSequence getTitle(Object obj)
		{
			return AccessibilityWindowInfoCompatApi24.getTitle(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method CharSequence AccessibilityWindowInfoCompatApi24.getTitle(Object)>
		//    2    4:areturn         
		}

		AccessibilityWindowInfoApi24Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi21Impl()>
		//    2    4:return          
		}
	}

	static interface AccessibilityWindowInfoImpl
	{

		public abstract Object getAnchor(Object obj);

		public abstract void getBoundsInScreen(Object obj, Rect rect);

		public abstract Object getChild(Object obj, int i);

		public abstract int getChildCount(Object obj);

		public abstract int getId(Object obj);

		public abstract int getLayer(Object obj);

		public abstract Object getParent(Object obj);

		public abstract Object getRoot(Object obj);

		public abstract CharSequence getTitle(Object obj);

		public abstract int getType(Object obj);

		public abstract boolean isAccessibilityFocused(Object obj);

		public abstract boolean isActive(Object obj);

		public abstract boolean isFocused(Object obj);

		public abstract Object obtain();

		public abstract Object obtain(Object obj);

		public abstract void recycle(Object obj);
	}

	static class AccessibilityWindowInfoStubImpl
		implements AccessibilityWindowInfoImpl
	{

		public Object getAnchor(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void getBoundsInScreen(Object obj, Rect rect)
		{
		//    0    0:return          
		}

		public Object getChild(Object obj, int i)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getChildCount(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getId(Object obj)
		{
			return -1;
		//    0    0:iconst_m1       
		//    1    1:ireturn         
		}

		public int getLayer(Object obj)
		{
			return -1;
		//    0    0:iconst_m1       
		//    1    1:ireturn         
		}

		public Object getParent(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object getRoot(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getTitle(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getType(Object obj)
		{
			return -1;
		//    0    0:iconst_m1       
		//    1    1:ireturn         
		}

		public boolean isAccessibilityFocused(Object obj)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isActive(Object obj)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public boolean isFocused(Object obj)
		{
			return true;
		//    0    0:iconst_1        
		//    1    1:ireturn         
		}

		public Object obtain()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object obtain(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void recycle(Object obj)
		{
		//    0    0:return          
		}

		AccessibilityWindowInfoStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	private AccessibilityWindowInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		mInfo = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #52  <Field Object mInfo>
	//    5    9:return          
	}

	public static AccessibilityWindowInfoCompat obtain()
	{
		return wrapNonNullInstance(IMPL.obtain());
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:invokeinterface #57  <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.obtain()>
	//    2    8:invokestatic    #61  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    3   11:areturn         
	}

	public static AccessibilityWindowInfoCompat obtain(AccessibilityWindowInfoCompat accessibilitywindowinfocompat)
	{
		if(accessibilitywindowinfocompat == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return wrapNonNullInstance(IMPL.obtain(accessibilitywindowinfocompat.mInfo));
	//    4    6:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field Object mInfo>
	//    7   13:invokeinterface #65  <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.obtain(Object)>
	//    8   18:invokestatic    #61  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    9   21:areturn         
	}

	private static String typeToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 35
	//	               2 38
	//	               3 41
	//	               4 44
	//*   2   32:goto            47
		case 1: // '\001'
			return "TYPE_APPLICATION";
	//    3   35:ldc1            #68  <String "TYPE_APPLICATION">
	//    4   37:areturn         

		case 2: // '\002'
			return "TYPE_INPUT_METHOD";
	//    5   38:ldc1            #69  <String "TYPE_INPUT_METHOD">
	//    6   40:areturn         

		case 3: // '\003'
			return "TYPE_SYSTEM";
	//    7   41:ldc1            #70  <String "TYPE_SYSTEM">
	//    8   43:areturn         

		case 4: // '\004'
			return "TYPE_ACCESSIBILITY_OVERLAY";
	//    9   44:ldc1            #71  <String "TYPE_ACCESSIBILITY_OVERLAY">
	//   10   46:areturn         
		}
		return "<UNKNOWN>";
	//   11   47:ldc1            #73  <String "<UNKNOWN>">
	//   12   49:areturn         
	}

	static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new AccessibilityWindowInfoCompat(obj);
	//    2    4:new             #2   <Class AccessibilityWindowInfoCompat>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #75  <Method void AccessibilityWindowInfoCompat(Object)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #81  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #81  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityWindowInfoCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityWindowInfoCompat>
	//   18   30:astore_1        
		if(mInfo == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #52  <Field Object mInfo>
	//*  21   35:ifnonnull       47
		{
			if(((AccessibilityWindowInfoCompat) (obj)).mInfo != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #52  <Field Object mInfo>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!mInfo.equals(((AccessibilityWindowInfoCompat) (obj)).mInfo))
	//*  27   47:aload_0         
	//*  28   48:getfield        #52  <Field Object mInfo>
	//*  29   51:aload_1         
	//*  30   52:getfield        #52  <Field Object mInfo>
	//*  31   55:invokevirtual   #83  <Method boolean Object.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		return true;
	//   35   63:iconst_1        
	//   36   64:ireturn         
	}

	public AccessibilityNodeInfoCompat getAnchor()
	{
		return AccessibilityNodeInfoCompat.wrapNonNullInstance(IMPL.getAnchor(mInfo));
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #87  <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getAnchor(Object)>
	//    4   12:invokestatic    #92  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    5   15:areturn         
	}

	public void getBoundsInScreen(Rect rect)
	{
		IMPL.getBoundsInScreen(mInfo, rect);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:aload_1         
	//    4    8:invokeinterface #97  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getBoundsInScreen(Object, Rect)>
	//    5   13:return          
	}

	public AccessibilityWindowInfoCompat getChild(int i)
	{
		return wrapNonNullInstance(IMPL.getChild(mInfo, i));
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:iload_1         
	//    4    8:invokeinterface #102 <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getChild(Object, int)>
	//    5   13:invokestatic    #61  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    6   16:areturn         
	}

	public int getChildCount()
	{
		return IMPL.getChildCount(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #107 <Method int AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getChildCount(Object)>
	//    4   12:ireturn         
	}

	public int getId()
	{
		return IMPL.getId(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #110 <Method int AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getId(Object)>
	//    4   12:ireturn         
	}

	public int getLayer()
	{
		return IMPL.getLayer(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #113 <Method int AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getLayer(Object)>
	//    4   12:ireturn         
	}

	public AccessibilityWindowInfoCompat getParent()
	{
		return wrapNonNullInstance(IMPL.getParent(mInfo));
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #116 <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getParent(Object)>
	//    4   12:invokestatic    #61  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    5   15:areturn         
	}

	public AccessibilityNodeInfoCompat getRoot()
	{
		return AccessibilityNodeInfoCompat.wrapNonNullInstance(IMPL.getRoot(mInfo));
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #119 <Method Object AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getRoot(Object)>
	//    4   12:invokestatic    #92  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    5   15:areturn         
	}

	public CharSequence getTitle()
	{
		return IMPL.getTitle(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #124 <Method CharSequence AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getTitle(Object)>
	//    4   12:areturn         
	}

	public int getType()
	{
		return IMPL.getType(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #127 <Method int AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.getType(Object)>
	//    4   12:ireturn         
	}

	public int hashCode()
	{
		if(mInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field Object mInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInfo.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #52  <Field Object mInfo>
	//    7   13:invokevirtual   #130 <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isAccessibilityFocused()
	{
		return IMPL.isAccessibilityFocused(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #134 <Method boolean AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.isAccessibilityFocused(Object)>
	//    4   12:ireturn         
	}

	public boolean isActive()
	{
		return IMPL.isActive(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #137 <Method boolean AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.isActive(Object)>
	//    4   12:ireturn         
	}

	public boolean isFocused()
	{
		return IMPL.isFocused(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #140 <Method boolean AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.isFocused(Object)>
	//    4   12:ireturn         
	}

	public void recycle()
	{
		IMPL.recycle(mInfo);
	//    0    0:getstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #52  <Field Object mInfo>
	//    3    7:invokeinterface #143 <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl.recycle(Object)>
	//    4   12:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #147 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #148 <Method void StringBuilder()>
	//    3    7:astore_2        
		Object obj = ((Object) (new Rect()));
	//    4    8:new             #150 <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #151 <Method void Rect()>
	//    7   15:astore_3        
		getBoundsInScreen(((Rect) (obj)));
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #153 <Method void getBoundsInScreen(Rect)>
		stringbuilder.append("AccessibilityWindowInfo[");
	//   11   21:aload_2         
	//   12   22:ldc1            #155 <String "AccessibilityWindowInfo[">
	//   13   24:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
		stringbuilder.append("id=").append(getId());
	//   15   28:aload_2         
	//   16   29:ldc1            #161 <String "id=">
	//   17   31:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #163 <Method int getId()>
	//   20   38:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   21   41:pop             
		stringbuilder.append(", type=").append(typeToString(getType()));
	//   22   42:aload_2         
	//   23   43:ldc1            #168 <String ", type=">
	//   24   45:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   25   48:aload_0         
	//   26   49:invokevirtual   #170 <Method int getType()>
	//   27   52:invokestatic    #172 <Method String typeToString(int)>
	//   28   55:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
		stringbuilder.append(", layer=").append(getLayer());
	//   30   59:aload_2         
	//   31   60:ldc1            #174 <String ", layer=">
	//   32   62:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:aload_0         
	//   34   66:invokevirtual   #176 <Method int getLayer()>
	//   35   69:invokevirtual   #166 <Method StringBuilder StringBuilder.append(int)>
	//   36   72:pop             
		stringbuilder.append(", bounds=").append(obj);
	//   37   73:aload_2         
	//   38   74:ldc1            #178 <String ", bounds=">
	//   39   76:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   40   79:aload_3         
	//   41   80:invokevirtual   #181 <Method StringBuilder StringBuilder.append(Object)>
	//   42   83:pop             
		stringbuilder.append(", focused=").append(isFocused());
	//   43   84:aload_2         
	//   44   85:ldc1            #183 <String ", focused=">
	//   45   87:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   46   90:aload_0         
	//   47   91:invokevirtual   #185 <Method boolean isFocused()>
	//   48   94:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//   49   97:pop             
		stringbuilder.append(", active=").append(isActive());
	//   50   98:aload_2         
	//   51   99:ldc1            #190 <String ", active=">
	//   52  101:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   53  104:aload_0         
	//   54  105:invokevirtual   #192 <Method boolean isActive()>
	//   55  108:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//   56  111:pop             
		obj = ((Object) (stringbuilder.append(", hasParent=")));
	//   57  112:aload_2         
	//   58  113:ldc1            #194 <String ", hasParent=">
	//   59  115:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   60  118:astore_3        
		boolean flag;
		if(getParent() != null)
	//*  61  119:aload_0         
	//*  62  120:invokevirtual   #196 <Method AccessibilityWindowInfoCompat getParent()>
	//*  63  123:ifnull          131
			flag = true;
	//   64  126:iconst_1        
	//   65  127:istore_1        
		else
	//*  66  128:goto            133
			flag = false;
	//   67  131:iconst_0        
	//   68  132:istore_1        
		((StringBuilder) (obj)).append(flag);
	//   69  133:aload_3         
	//   70  134:iload_1         
	//   71  135:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//   72  138:pop             
		obj = ((Object) (stringbuilder.append(", hasChildren=")));
	//   73  139:aload_2         
	//   74  140:ldc1            #198 <String ", hasChildren=">
	//   75  142:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   76  145:astore_3        
		if(getChildCount() > 0)
	//*  77  146:aload_0         
	//*  78  147:invokevirtual   #200 <Method int getChildCount()>
	//*  79  150:ifle            158
			flag = true;
	//   80  153:iconst_1        
	//   81  154:istore_1        
		else
	//*  82  155:goto            160
			flag = false;
	//   83  158:iconst_0        
	//   84  159:istore_1        
		((StringBuilder) (obj)).append(flag);
	//   85  160:aload_3         
	//   86  161:iload_1         
	//   87  162:invokevirtual   #188 <Method StringBuilder StringBuilder.append(boolean)>
	//   88  165:pop             
		stringbuilder.append(']');
	//   89  166:aload_2         
	//   90  167:bipush          93
	//   91  169:invokevirtual   #203 <Method StringBuilder StringBuilder.append(char)>
	//   92  172:pop             
		return stringbuilder.toString();
	//   93  173:aload_2         
	//   94  174:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   95  177:areturn         
	}

	private static final AccessibilityWindowInfoImpl IMPL;
	public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
	public static final int TYPE_APPLICATION = 1;
	public static final int TYPE_INPUT_METHOD = 2;
	public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
	public static final int TYPE_SYSTEM = 3;
	private static final int UNDEFINED = -1;
	private Object mInfo;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityWindowInfoImpl) (new AccessibilityWindowInfoApi24Impl()));
	//    3    8:new             #9   <Class AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi24Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #43  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi24Impl()>
	//    6   15:putstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   19:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          21
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityWindowInfoImpl) (new AccessibilityWindowInfoApi21Impl()));
	//   11   27:new             #6   <Class AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi21Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #46  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoApi21Impl()>
	//   14   34:putstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//   15   37:return          
		else
			IMPL = ((AccessibilityWindowInfoImpl) (new AccessibilityWindowInfoStubImpl()));
	//   16   38:new             #15  <Class AccessibilityWindowInfoCompat$AccessibilityWindowInfoStubImpl>
	//   17   41:dup             
	//   18   42:invokespecial   #47  <Method void AccessibilityWindowInfoCompat$AccessibilityWindowInfoStubImpl()>
	//   19   45:putstatic       #45  <Field AccessibilityWindowInfoCompat$AccessibilityWindowInfoImpl IMPL>
	//*  20   48:return          
	}
}
