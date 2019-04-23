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
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          28
		{
			if(accessibilitywindowinfocompat == null)
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
		} else
		{
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
		}
	}

	private static String typeToString(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 44
	//	               2 41
	//	               3 38
	//	               4 35
		default:
			return "<UNKNOWN>";
	//    2   32:ldc1            #51  <String "<UNKNOWN>">
	//    3   34:areturn         

		case 4: // '\004'
			return "TYPE_ACCESSIBILITY_OVERLAY";
	//    4   35:ldc1            #52  <String "TYPE_ACCESSIBILITY_OVERLAY">
	//    5   37:areturn         

		case 3: // '\003'
			return "TYPE_SYSTEM";
	//    6   38:ldc1            #53  <String "TYPE_SYSTEM">
	//    7   40:areturn         

		case 2: // '\002'
			return "TYPE_INPUT_METHOD";
	//    8   41:ldc1            #54  <String "TYPE_INPUT_METHOD">
	//    9   43:areturn         

		case 1: // '\001'
			return "TYPE_APPLICATION";
	//   10   44:ldc1            #55  <String "TYPE_APPLICATION">
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
		Object obj1 = mInfo;
	//   19   31:aload_0         
	//   20   32:getfield        #26  <Field Object mInfo>
	//   21   35:astore_2        
		if(obj1 == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       49
		{
			if(((AccessibilityWindowInfoCompat) (obj)).mInfo != null)
	//*  24   40:aload_1         
	//*  25   41:getfield        #26  <Field Object mInfo>
	//*  26   44:ifnull          62
				return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		} else
		if(!obj1.equals(((AccessibilityWindowInfoCompat) (obj)).mInfo))
	//*  29   49:aload_2         
	//*  30   50:aload_1         
	//*  31   51:getfield        #26  <Field Object mInfo>
	//*  32   54:invokevirtual   #65  <Method boolean Object.equals(Object)>
	//*  33   57:ifne            62
			return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         
		return true;
	//   36   62:iconst_1        
	//   37   63:ireturn         
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
		Object obj = mInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object mInfo>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return obj.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #110 <Method int Object.hashCode()>
	//    9   15:ireturn         
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
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #127 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #128 <Method void StringBuilder()>
	//    3    7:astore_3        
		Object obj = ((Object) (new Rect()));
	//    4    8:new             #130 <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #131 <Method void Rect()>
	//    7   15:astore          4
		getBoundsInScreen(((Rect) (obj)));
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:invokevirtual   #132 <Method void getBoundsInScreen(Rect)>
		stringbuilder.append("AccessibilityWindowInfo[");
	//   11   23:aload_3         
	//   12   24:ldc1            #134 <String "AccessibilityWindowInfo[">
	//   13   26:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append("id=");
	//   15   30:aload_3         
	//   16   31:ldc1            #140 <String "id=">
	//   17   33:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		stringbuilder.append(getId());
	//   19   37:aload_3         
	//   20   38:aload_0         
	//   21   39:invokevirtual   #141 <Method int getId()>
	//   22   42:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   23   45:pop             
		stringbuilder.append(", type=");
	//   24   46:aload_3         
	//   25   47:ldc1            #146 <String ", type=">
	//   26   49:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(typeToString(getType()));
	//   28   53:aload_3         
	//   29   54:aload_0         
	//   30   55:invokevirtual   #147 <Method int getType()>
	//   31   58:invokestatic    #149 <Method String typeToString(int)>
	//   32   61:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(", layer=");
	//   34   65:aload_3         
	//   35   66:ldc1            #151 <String ", layer=">
	//   36   68:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(getLayer());
	//   38   72:aload_3         
	//   39   73:aload_0         
	//   40   74:invokevirtual   #152 <Method int getLayer()>
	//   41   77:invokevirtual   #144 <Method StringBuilder StringBuilder.append(int)>
	//   42   80:pop             
		stringbuilder.append(", bounds=");
	//   43   81:aload_3         
	//   44   82:ldc1            #154 <String ", bounds=">
	//   45   84:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   46   87:pop             
		stringbuilder.append(obj);
	//   47   88:aload_3         
	//   48   89:aload           4
	//   49   91:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   50   94:pop             
		stringbuilder.append(", focused=");
	//   51   95:aload_3         
	//   52   96:ldc1            #159 <String ", focused=">
	//   53   98:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   54  101:pop             
		stringbuilder.append(isFocused());
	//   55  102:aload_3         
	//   56  103:aload_0         
	//   57  104:invokevirtual   #160 <Method boolean isFocused()>
	//   58  107:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//   59  110:pop             
		stringbuilder.append(", active=");
	//   60  111:aload_3         
	//   61  112:ldc1            #165 <String ", active=">
	//   62  114:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   63  117:pop             
		stringbuilder.append(isActive());
	//   64  118:aload_3         
	//   65  119:aload_0         
	//   66  120:invokevirtual   #166 <Method boolean isActive()>
	//   67  123:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//   68  126:pop             
		stringbuilder.append(", hasParent=");
	//   69  127:aload_3         
	//   70  128:ldc1            #168 <String ", hasParent=">
	//   71  130:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   72  133:pop             
		obj = ((Object) (getParent()));
	//   73  134:aload_0         
	//   74  135:invokevirtual   #170 <Method AccessibilityWindowInfoCompat getParent()>
	//   75  138:astore          4
		boolean flag1 = true;
	//   76  140:iconst_1        
	//   77  141:istore_2        
		boolean flag;
		if(obj != null)
	//*  78  142:aload           4
	//*  79  144:ifnull          152
			flag = true;
	//   80  147:iconst_1        
	//   81  148:istore_1        
		else
	//*  82  149:goto            154
			flag = false;
	//   83  152:iconst_0        
	//   84  153:istore_1        
		stringbuilder.append(flag);
	//   85  154:aload_3         
	//   86  155:iload_1         
	//   87  156:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//   88  159:pop             
		stringbuilder.append(", hasChildren=");
	//   89  160:aload_3         
	//   90  161:ldc1            #172 <String ", hasChildren=">
	//   91  163:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   92  166:pop             
		if(getChildCount() > 0)
	//*  93  167:aload_0         
	//*  94  168:invokevirtual   #173 <Method int getChildCount()>
	//*  95  171:ifle            179
			flag = flag1;
	//   96  174:iload_2         
	//   97  175:istore_1        
		else
	//*  98  176:goto            181
			flag = false;
	//   99  179:iconst_0        
	//  100  180:istore_1        
		stringbuilder.append(flag);
	//  101  181:aload_3         
	//  102  182:iload_1         
	//  103  183:invokevirtual   #163 <Method StringBuilder StringBuilder.append(boolean)>
	//  104  186:pop             
		stringbuilder.append(']');
	//  105  187:aload_3         
	//  106  188:bipush          93
	//  107  190:invokevirtual   #176 <Method StringBuilder StringBuilder.append(char)>
	//  108  193:pop             
		return stringbuilder.toString();
	//  109  194:aload_3         
	//  110  195:invokevirtual   #178 <Method String StringBuilder.toString()>
	//  111  198:areturn         
	}

	public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
	public static final int TYPE_APPLICATION = 1;
	public static final int TYPE_INPUT_METHOD = 2;
	public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
	public static final int TYPE_SYSTEM = 3;
	private static final int UNDEFINED = -1;
	private Object mInfo;
}
