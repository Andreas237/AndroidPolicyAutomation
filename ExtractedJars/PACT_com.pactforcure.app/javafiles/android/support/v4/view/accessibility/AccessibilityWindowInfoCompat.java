// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityWindowInfo;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

public class AccessibilityWindowInfoCompat
{

	private AccessibilityWindowInfoCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mInfo = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Object mInfo>
	//    5    9:return          
	}

	public static AccessibilityWindowInfoCompat obtain()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return wrapNonNullInstance(((Object) (AccessibilityWindowInfo.obtain())));
	//    3    8:invokestatic    #39  <Method AccessibilityWindowInfo AccessibilityWindowInfo.obtain()>
	//    4   11:invokestatic    #43  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    5   14:areturn         
		else
			return null;
	//    6   15:aconst_null     
	//    7   16:areturn         
	}

	public static AccessibilityWindowInfoCompat obtain(AccessibilityWindowInfoCompat accessibilitywindowinfocompat)
	{
		if(android.os.Build.VERSION.SDK_INT < 21 || accessibilitywindowinfocompat == null)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          12
	//*   3    8:aload_0         
	//*   4    9:ifnonnull       14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		else
			return wrapNonNullInstance(((Object) (AccessibilityWindowInfo.obtain((AccessibilityWindowInfo)accessibilitywindowinfocompat.mInfo))));
	//    7   14:aload_0         
	//    8   15:getfield        #26  <Field Object mInfo>
	//    9   18:checkcast       #36  <Class AccessibilityWindowInfo>
	//   10   21:invokestatic    #47  <Method AccessibilityWindowInfo AccessibilityWindowInfo.obtain(AccessibilityWindowInfo)>
	//   11   24:invokestatic    #43  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//   12   27:areturn         
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
		default:
			return "<UNKNOWN>";
	//    2   32:ldc1            #51  <String "<UNKNOWN>">
	//    3   34:areturn         

		case 1: // '\001'
			return "TYPE_APPLICATION";
	//    4   35:ldc1            #52  <String "TYPE_APPLICATION">
	//    5   37:areturn         

		case 2: // '\002'
			return "TYPE_INPUT_METHOD";
	//    6   38:ldc1            #53  <String "TYPE_INPUT_METHOD">
	//    7   40:areturn         

		case 3: // '\003'
			return "TYPE_SYSTEM";
	//    8   41:ldc1            #54  <String "TYPE_SYSTEM">
	//    9   43:areturn         

		case 4: // '\004'
			return "TYPE_ACCESSIBILITY_OVERLAY";
	//   10   44:ldc1            #55  <String "TYPE_ACCESSIBILITY_OVERLAY">
	//   11   46:areturn         
		}
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
	//    5    9:invokespecial   #57  <Method void AccessibilityWindowInfoCompat(Object)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #63  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityWindowInfoCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityWindowInfoCompat>
	//   18   30:astore_1        
		if(mInfo != null)
			continue; /* Loop/switch isn't completed */
	//   19   31:aload_0         
	//   20   32:getfield        #26  <Field Object mInfo>
	//   21   35:ifnonnull       47
		if(((AccessibilityWindowInfoCompat) (obj)).mInfo == null) goto _L1; else goto _L3
	//   22   38:aload_1         
	//   23   39:getfield        #26  <Field Object mInfo>
	//   24   42:ifnull          5
_L3:
		return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		if(mInfo.equals(((AccessibilityWindowInfoCompat) (obj)).mInfo)) goto _L1; else goto _L4
	//   27   47:aload_0         
	//   28   48:getfield        #26  <Field Object mInfo>
	//   29   51:aload_1         
	//   30   52:getfield        #26  <Field Object mInfo>
	//   31   55:invokevirtual   #65  <Method boolean Object.equals(Object)>
	//   32   58:ifne            5
_L4:
		return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
	}

	public AccessibilityNodeInfoCompat getAnchor()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          22
			return AccessibilityNodeInfoCompat.wrapNonNullInstance(((Object) (((AccessibilityWindowInfo)mInfo).getAnchor())));
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #70  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityWindowInfo.getAnchor()>
	//    7   18:invokestatic    #75  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    8   21:areturn         
		else
			return null;
	//    9   22:aconst_null     
	//   10   23:areturn         
	}

	public void getBoundsInScreen(Rect rect)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			((AccessibilityWindowInfo)mInfo).getBoundsInScreen(rect);
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:aload_1         
	//    7   16:invokevirtual   #79  <Method void AccessibilityWindowInfo.getBoundsInScreen(Rect)>
	//    8   19:return          
	}

	public AccessibilityWindowInfoCompat getChild(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          23
			return wrapNonNullInstance(((Object) (((AccessibilityWindowInfo)mInfo).getChild(i))));
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:iload_1         
	//    7   16:invokevirtual   #84  <Method AccessibilityWindowInfo AccessibilityWindowInfo.getChild(int)>
	//    8   19:invokestatic    #43  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    9   22:areturn         
		else
			return null;
	//   10   23:aconst_null     
	//   11   24:areturn         
	}

	public int getChildCount()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).getChildCount();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #88  <Method int AccessibilityWindowInfo.getChildCount()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getId()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).getId();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #91  <Method int AccessibilityWindowInfo.getId()>
	//    7   18:ireturn         
		else
			return -1;
	//    8   19:iconst_m1       
	//    9   20:ireturn         
	}

	public int getLayer()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).getLayer();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #94  <Method int AccessibilityWindowInfo.getLayer()>
	//    7   18:ireturn         
		else
			return -1;
	//    8   19:iconst_m1       
	//    9   20:ireturn         
	}

	public AccessibilityWindowInfoCompat getParent()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			return wrapNonNullInstance(((Object) (((AccessibilityWindowInfo)mInfo).getParent())));
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #97  <Method AccessibilityWindowInfo AccessibilityWindowInfo.getParent()>
	//    7   18:invokestatic    #43  <Method AccessibilityWindowInfoCompat wrapNonNullInstance(Object)>
	//    8   21:areturn         
		else
			return null;
	//    9   22:aconst_null     
	//   10   23:areturn         
	}

	public AccessibilityNodeInfoCompat getRoot()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			return AccessibilityNodeInfoCompat.wrapNonNullInstance(((Object) (((AccessibilityWindowInfo)mInfo).getRoot())));
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #100 <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityWindowInfo.getRoot()>
	//    7   18:invokestatic    #75  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    8   21:areturn         
		else
			return null;
	//    9   22:aconst_null     
	//   10   23:areturn         
	}

	public CharSequence getTitle()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).getTitle();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #104 <Method CharSequence AccessibilityWindowInfo.getTitle()>
	//    7   18:areturn         
		else
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
	}

	public int getType()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).getType();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #107 <Method int AccessibilityWindowInfo.getType()>
	//    7   18:ireturn         
		else
			return -1;
	//    8   19:iconst_m1       
	//    9   20:ireturn         
	}

	public int hashCode()
	{
		if(mInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Object mInfo>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInfo.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field Object mInfo>
	//    7   13:invokevirtual   #110 <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isAccessibilityFocused()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).isAccessibilityFocused();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #114 <Method boolean AccessibilityWindowInfo.isAccessibilityFocused()>
	//    7   18:ireturn         
		else
			return true;
	//    8   19:iconst_1        
	//    9   20:ireturn         
	}

	public boolean isActive()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).isActive();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #117 <Method boolean AccessibilityWindowInfo.isActive()>
	//    7   18:ireturn         
		else
			return true;
	//    8   19:iconst_1        
	//    9   20:ireturn         
	}

	public boolean isFocused()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((AccessibilityWindowInfo)mInfo).isFocused();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #120 <Method boolean AccessibilityWindowInfo.isFocused()>
	//    7   18:ireturn         
		else
			return true;
	//    8   19:iconst_1        
	//    9   20:ireturn         
	}

	public void recycle()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			((AccessibilityWindowInfo)mInfo).recycle();
	//    3    8:aload_0         
	//    4    9:getfield        #26  <Field Object mInfo>
	//    5   12:checkcast       #36  <Class AccessibilityWindowInfo>
	//    6   15:invokevirtual   #123 <Method void AccessibilityWindowInfo.recycle()>
	//    7   18:return          
	}

	public String toString()
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    2:new             #127 <Class StringBuilder>
	//    3    5:dup             
	//    4    6:invokespecial   #128 <Method void StringBuilder()>
	//    5    9:astore_3        
		Object obj = ((Object) (new Rect()));
	//    6   10:new             #130 <Class Rect>
	//    7   13:dup             
	//    8   14:invokespecial   #131 <Method void Rect()>
	//    9   17:astore          4
		getBoundsInScreen(((Rect) (obj)));
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:invokevirtual   #132 <Method void getBoundsInScreen(Rect)>
		stringbuilder.append("AccessibilityWindowInfo[");
	//   13   25:aload_3         
	//   14   26:ldc1            #134 <String "AccessibilityWindowInfo[">
	//   15   28:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append("id=").append(getId());
	//   17   32:aload_3         
	//   18   33:ldc1            #140 <String "id=">
	//   19   35:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:aload_0         
	//   21   39:invokevirtual   #141 <Method int getId()>
	//   22   42:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
		stringbuilder.append(", type=").append(typeToString(getType()));
	//   24   46:aload_3         
	//   25   47:ldc1            #146 <String ", type=">
	//   26   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:aload_0         
	//   28   53:invokevirtual   #147 <Method int getType()>
	//   29   56:invokestatic    #149 <Method String typeToString(int)>
	//   30   59:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		stringbuilder.append(", layer=").append(getLayer());
	//   32   63:aload_3         
	//   33   64:ldc1            #151 <String ", layer=">
	//   34   66:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:aload_0         
	//   36   70:invokevirtual   #152 <Method int getLayer()>
	//   37   73:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   38   76:pop             
		stringbuilder.append(", bounds=").append(obj);
	//   39   77:aload_3         
	//   40   78:ldc1            #154 <String ", bounds=">
	//   41   80:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   42   83:aload           4
	//   43   85:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   44   88:pop             
		stringbuilder.append(", focused=").append(isFocused());
	//   45   89:aload_3         
	//   46   90:ldc1            #159 <String ", focused=">
	//   47   92:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   48   95:aload_0         
	//   49   96:invokevirtual   #160 <Method boolean isFocused()>
	//   50   99:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//   51  102:pop             
		stringbuilder.append(", active=").append(isActive());
	//   52  103:aload_3         
	//   53  104:ldc1            #165 <String ", active=">
	//   54  106:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:aload_0         
	//   56  110:invokevirtual   #166 <Method boolean isActive()>
	//   57  113:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//   58  116:pop             
		obj = ((Object) (stringbuilder.append(", hasParent=")));
	//   59  117:aload_3         
	//   60  118:ldc1            #168 <String ", hasParent=">
	//   61  120:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   62  123:astore          4
		boolean flag;
		if(getParent() != null)
	//*  63  125:aload_0         
	//*  64  126:invokevirtual   #170 <Method AccessibilityWindowInfoCompat getParent()>
	//*  65  129:ifnull          177
			flag = true;
	//   66  132:iconst_1        
	//   67  133:istore_1        
		else
	//*  68  134:aload           4
	//*  69  136:iload_1         
	//*  70  137:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//*  71  140:pop             
	//*  72  141:aload_3         
	//*  73  142:ldc1            #172 <String ", hasChildren=">
	//*  74  144:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//*  75  147:astore          4
	//*  76  149:aload_0         
	//*  77  150:invokevirtual   #173 <Method int getChildCount()>
	//*  78  153:ifle            182
	//*  79  156:iload_2         
	//*  80  157:istore_1        
	//*  81  158:aload           4
	//*  82  160:iload_1         
	//*  83  161:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//*  84  164:pop             
	//*  85  165:aload_3         
	//*  86  166:bipush          93
	//*  87  168:invokevirtual   #176 <Method StringBuilder StringBuilder.append(char)>
	//*  88  171:pop             
	//*  89  172:aload_3         
	//*  90  173:invokevirtual   #178 <Method String StringBuilder.toString()>
	//*  91  176:areturn         
			flag = false;
	//   92  177:iconst_0        
	//   93  178:istore_1        
		((StringBuilder) (obj)).append(flag);
		obj = ((Object) (stringbuilder.append(", hasChildren=")));
		if(getChildCount() > 0)
			flag = flag1;
		else
	//*  94  179:goto            134
			flag = false;
	//   95  182:iconst_0        
	//   96  183:istore_1        
		((StringBuilder) (obj)).append(flag);
		stringbuilder.append(']');
		return stringbuilder.toString();
	//*  97  184:goto            158
	}

	public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
	public static final int TYPE_APPLICATION = 1;
	public static final int TYPE_INPUT_METHOD = 2;
	public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
	public static final int TYPE_SYSTEM = 3;
	private static final int UNDEFINED = -1;
	private Object mInfo;
}
