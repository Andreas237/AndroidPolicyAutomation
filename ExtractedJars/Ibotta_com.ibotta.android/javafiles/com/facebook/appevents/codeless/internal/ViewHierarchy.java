// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import android.support.v4.view.NestedScrollingChild;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import org.json.*;

// Referenced classes of package com.facebook.appevents.codeless.internal:
//			SensitiveUserDataUtils

public class ViewHierarchy
{

	public ViewHierarchy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static List getChildrenOfView(View view)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #24  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void ArrayList()>
	//    3    7:astore_3        
		if(view != null && (view instanceof ViewGroup))
	//*   4    8:aload_0         
	//*   5    9:ifnull          53
	//*   6   12:aload_0         
	//*   7   13:instanceof      #27  <Class ViewGroup>
	//*   8   16:ifeq            53
		{
			view = ((View) ((ViewGroup)view));
	//    9   19:aload_0         
	//   10   20:checkcast       #27  <Class ViewGroup>
	//   11   23:astore_0        
			int j = ((ViewGroup) (view)).getChildCount();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #31  <Method int ViewGroup.getChildCount()>
	//   14   28:istore_2        
			for(int i = 0; i < j; i++)
	//*  15   29:iconst_0        
	//*  16   30:istore_1        
	//*  17   31:iload_1         
	//*  18   32:iload_2         
	//*  19   33:icmpge          53
				arraylist.add(((Object) (((ViewGroup) (view)).getChildAt(i))));
	//   20   36:aload_3         
	//   21   37:aload_0         
	//   22   38:iload_1         
	//   23   39:invokevirtual   #35  <Method View ViewGroup.getChildAt(int)>
	//   24   42:invokevirtual   #39  <Method boolean ArrayList.add(Object)>
	//   25   45:pop             

	//   26   46:iload_1         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_1        
		}
	//*  30   50:goto            31
		return ((List) (arraylist));
	//   31   53:aload_3         
	//   32   54:areturn         
	}

	private static int getClassTypeBitmask(View view)
	{
		int k;
		if(view instanceof ImageView)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #45  <Class ImageView>
	//*   2    4:ifeq            12
			k = 2;
	//    3    7:iconst_2        
	//    4    8:istore_2        
		else
	//*   5    9:goto            14
			k = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		int i = k;
	//    8   14:iload_2         
	//    9   15:istore_1        
		if(isClickableView(view))
	//*  10   16:aload_0         
	//*  11   17:invokestatic    #49  <Method boolean isClickableView(View)>
	//*  12   20:ifeq            28
			i = k | 0x20;
	//   13   23:iload_2         
	//   14   24:bipush          32
	//   15   26:ior             
	//   16   27:istore_1        
		k = i;
	//   17   28:iload_1         
	//   18   29:istore_2        
		if(isAdapterViewItem(view))
	//*  19   30:aload_0         
	//*  20   31:invokestatic    #52  <Method boolean isAdapterViewItem(View)>
	//*  21   34:ifeq            43
			k = i | 0x200;
	//   22   37:iload_1         
	//   23   38:sipush          512
	//   24   41:ior             
	//   25   42:istore_2        
		int l;
		if(view instanceof TextView)
	//*  26   43:aload_0         
	//*  27   44:instanceof      #54  <Class TextView>
	//*  28   47:ifeq            116
		{
			k = k | 0x400 | 1;
	//   29   50:iload_2         
	//   30   51:sipush          1024
	//   31   54:ior             
	//   32   55:iconst_1        
	//   33   56:ior             
	//   34   57:istore_2        
			int j = k;
	//   35   58:iload_2         
	//   36   59:istore_1        
			if(view instanceof Button)
	//*  37   60:aload_0         
	//*  38   61:instanceof      #56  <Class Button>
	//*  39   64:ifeq            101
			{
				k |= 4;
	//   40   67:iload_2         
	//   41   68:iconst_4        
	//   42   69:ior             
	//   43   70:istore_2        
				if(view instanceof Switch)
	//*  44   71:aload_0         
	//*  45   72:instanceof      #58  <Class Switch>
	//*  46   75:ifeq            87
				{
					j = k | 0x2000;
	//   47   78:iload_2         
	//   48   79:sipush          8192
	//   49   82:ior             
	//   50   83:istore_1        
				} else
	//*  51   84:goto            101
				{
					j = k;
	//   52   87:iload_2         
	//   53   88:istore_1        
					if(view instanceof CheckBox)
	//*  54   89:aload_0         
	//*  55   90:instanceof      #60  <Class CheckBox>
	//*  56   93:ifeq            101
						j = k | 0x8000;
	//   57   96:iload_2         
	//   58   97:ldc1            #61  <Int 32768>
	//   59   99:ior             
	//   60  100:istore_1        
				}
			}
			l = j;
	//   61  101:iload_1         
	//   62  102:istore_3        
			if(view instanceof EditText)
	//*  63  103:aload_0         
	//*  64  104:instanceof      #63  <Class EditText>
	//*  65  107:ifeq            166
				return j | 0x800;
	//   66  110:iload_1         
	//   67  111:sipush          2048
	//   68  114:ior             
	//   69  115:ireturn         
		} else
		if(!(view instanceof Spinner) && !(view instanceof DatePicker))
	//*  70  116:aload_0         
	//*  71  117:instanceof      #65  <Class Spinner>
	//*  72  120:ifne            160
	//*  73  123:aload_0         
	//*  74  124:instanceof      #67  <Class DatePicker>
	//*  75  127:ifeq            133
	//*  76  130:goto            160
		{
			if(view instanceof RatingBar)
	//*  77  133:aload_0         
	//*  78  134:instanceof      #69  <Class RatingBar>
	//*  79  137:ifeq            145
				return k | 0x10000;
	//   80  140:iload_2         
	//   81  141:ldc1            #70  <Int 0x10000>
	//   82  143:ior             
	//   83  144:ireturn         
			l = k;
	//   84  145:iload_2         
	//   85  146:istore_3        
			if(view instanceof RadioGroup)
	//*  86  147:aload_0         
	//*  87  148:instanceof      #72  <Class RadioGroup>
	//*  88  151:ifeq            166
				return k | 0x4000;
	//   89  154:iload_2         
	//   90  155:sipush          16384
	//   91  158:ior             
	//   92  159:ireturn         
		} else
		{
			l = k | 0x1000;
	//   93  160:iload_2         
	//   94  161:sipush          4096
	//   95  164:ior             
	//   96  165:istore_3        
		}
		return l;
	//   97  166:iload_3         
	//   98  167:ireturn         
	}

	public static JSONObject getDictionaryOfView(View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_2        
		String s1;
		Object obj;
		CharSequence charsequence;
		String s = getTextOfView(view);
	//    4    8:aload_0         
	//    5    9:invokestatic    #83  <Method String getTextOfView(View)>
	//    6   12:astore_3        
		s1 = getHintOfView(view);
	//    7   13:aload_0         
	//    8   14:invokestatic    #86  <Method String getHintOfView(View)>
	//    9   17:astore          4
		obj = view.getTag();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #92  <Method Object View.getTag()>
	//   12   23:astore          5
		charsequence = view.getContentDescription();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #96  <Method CharSequence View.getContentDescription()>
	//   15   29:astore          6
		jsonobject.put("classname", ((Object) (((Object) (view)).getClass().getCanonicalName())));
	//   16   31:aload_2         
	//   17   32:ldc1            #98  <String "classname">
	//   18   34:aload_0         
	//   19   35:invokevirtual   #102 <Method Class Object.getClass()>
	//   20   38:invokevirtual   #14  <Method String Class.getCanonicalName()>
	//   21   41:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//   22   44:pop             
		jsonobject.put("classtypebitmask", getClassTypeBitmask(view));
	//   23   45:aload_2         
	//   24   46:ldc1            #108 <String "classtypebitmask">
	//   25   48:aload_0         
	//   26   49:invokestatic    #110 <Method int getClassTypeBitmask(View)>
	//   27   52:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   28   55:pop             
		jsonobject.put("id", view.getId());
	//   29   56:aload_2         
	//   30   57:ldc1            #115 <String "id">
	//   31   59:aload_0         
	//   32   60:invokevirtual   #118 <Method int View.getId()>
	//   33   63:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   34   66:pop             
		if(!SensitiveUserDataUtils.isSensitiveUserData(view))
	//*  35   67:aload_0         
	//*  36   68:invokestatic    #123 <Method boolean SensitiveUserDataUtils.isSensitiveUserData(View)>
	//*  37   71:ifne            85
		{
			jsonobject.put("text", ((Object) (s)));
	//   38   74:aload_2         
	//   39   75:ldc1            #125 <String "text">
	//   40   77:aload_3         
	//   41   78:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//   42   81:pop             
			break MISSING_BLOCK_LABEL_94;
	//   43   82:goto            94
		}
		jsonobject.put("text", "");
	//   44   85:aload_2         
	//   45   86:ldc1            #125 <String "text">
	//   46   88:ldc1            #127 <String "">
	//   47   90:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//   48   93:pop             
		jsonobject.put("hint", ((Object) (s1)));
	//   49   94:aload_2         
	//   50   95:ldc1            #129 <String "hint">
	//   51   97:aload           4
	//   52   99:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//   53  102:pop             
		int i;
		JSONArray jsonarray;
		if(obj != null)
	//*  54  103:aload           5
	//*  55  105:ifnull          120
			try
			{
				jsonobject.put("tag", ((Object) (obj.toString())));
	//   56  108:aload_2         
	//   57  109:ldc1            #131 <String "tag">
	//   58  111:aload           5
	//   59  113:invokevirtual   #134 <Method String Object.toString()>
	//   60  116:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//   61  119:pop             
			}
	//*  62  120:aload           6
	//*  63  122:ifnull          139
	//*  64  125:aload_2         
	//*  65  126:ldc1            #136 <String "description">
	//*  66  128:aload           6
	//*  67  130:invokeinterface #139 <Method String CharSequence.toString()>
	//*  68  135:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//*  69  138:pop             
	//*  70  139:aload_2         
	//*  71  140:ldc1            #141 <String "dimension">
	//*  72  142:aload_0         
	//*  73  143:invokestatic    #144 <Method JSONObject getDimensionOfView(View)>
	//*  74  146:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//*  75  149:pop             
	//*  76  150:new             #146 <Class JSONArray>
	//*  77  153:dup             
	//*  78  154:invokespecial   #147 <Method void JSONArray()>
	//*  79  157:astore_3        
	//*  80  158:aload_0         
	//*  81  159:invokestatic    #149 <Method List getChildrenOfView(View)>
	//*  82  162:astore_0        
	//*  83  163:iconst_0        
	//*  84  164:istore_1        
	//*  85  165:iload_1         
	//*  86  166:aload_0         
	//*  87  167:invokeinterface #154 <Method int List.size()>
	//*  88  172:icmpge          200
	//*  89  175:aload_3         
	//*  90  176:aload_0         
	//*  91  177:iload_1         
	//*  92  178:invokeinterface #158 <Method Object List.get(int)>
	//*  93  183:checkcast       #88  <Class View>
	//*  94  186:invokestatic    #160 <Method JSONObject getDictionaryOfView(View)>
	//*  95  189:invokevirtual   #163 <Method JSONArray JSONArray.put(Object)>
	//*  96  192:pop             
	//*  97  193:iload_1         
	//*  98  194:iconst_1        
	//*  99  195:iadd            
	//* 100  196:istore_1        
	//* 101  197:goto            165
	//* 102  200:aload_2         
	//* 103  201:ldc1            #165 <String "childviews">
	//* 104  203:aload_3         
	//* 105  204:invokevirtual   #106 <Method JSONObject JSONObject.put(String, Object)>
	//* 106  207:pop             
	//* 107  208:aload_2         
	//* 108  209:areturn         
			// Misplaced declaration of an exception variable
			catch(View view)
	//* 109  210:astore_0        
			{
				Log.e(TAG, "Failed to create JSONObject for view.", ((Throwable) (view)));
	//  110  211:getstatic       #16  <Field String TAG>
	//  111  214:ldc1            #167 <String "Failed to create JSONObject for view.">
	//  112  216:aload_0         
	//  113  217:invokestatic    #173 <Method int Log.e(String, String, Throwable)>
	//  114  220:pop             
				return jsonobject;
	//  115  221:aload_2         
	//  116  222:areturn         
			}
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_139;
		jsonobject.put("description", ((Object) (charsequence.toString())));
		jsonobject.put("dimension", ((Object) (getDimensionOfView(view))));
		jsonarray = new JSONArray();
		view = ((View) (getChildrenOfView(view)));
		i = 0;
_L2:
		if(i >= ((List) (view)).size())
			break; /* Loop/switch isn't completed */
		jsonarray.put(((Object) (getDictionaryOfView((View)((List) (view)).get(i)))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		jsonobject.put("childviews", ((Object) (jsonarray)));
		return jsonobject;
	}

	private static JSONObject getDimensionOfView(View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #78  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("top", view.getTop());
	//    4    8:aload_1         
	//    5    9:ldc1            #175 <String "top">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #178 <Method int View.getTop()>
	//    8   15:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
			jsonobject.put("left", view.getLeft());
	//   10   19:aload_1         
	//   11   20:ldc1            #180 <String "left">
	//   12   22:aload_0         
	//   13   23:invokevirtual   #183 <Method int View.getLeft()>
	//   14   26:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   15   29:pop             
			jsonobject.put("width", view.getWidth());
	//   16   30:aload_1         
	//   17   31:ldc1            #185 <String "width">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #188 <Method int View.getWidth()>
	//   20   37:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   21   40:pop             
			jsonobject.put("height", view.getHeight());
	//   22   41:aload_1         
	//   23   42:ldc1            #190 <String "height">
	//   24   44:aload_0         
	//   25   45:invokevirtual   #193 <Method int View.getHeight()>
	//   26   48:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   27   51:pop             
			jsonobject.put("scrollx", view.getScrollX());
	//   28   52:aload_1         
	//   29   53:ldc1            #195 <String "scrollx">
	//   30   55:aload_0         
	//   31   56:invokevirtual   #198 <Method int View.getScrollX()>
	//   32   59:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   33   62:pop             
			jsonobject.put("scrolly", view.getScrollY());
	//   34   63:aload_1         
	//   35   64:ldc1            #200 <String "scrolly">
	//   36   66:aload_0         
	//   37   67:invokevirtual   #203 <Method int View.getScrollY()>
	//   38   70:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   39   73:pop             
			jsonobject.put("visibility", view.getVisibility());
	//   40   74:aload_1         
	//   41   75:ldc1            #205 <String "visibility">
	//   42   77:aload_0         
	//   43   78:invokevirtual   #208 <Method int View.getVisibility()>
	//   44   81:invokevirtual   #113 <Method JSONObject JSONObject.put(String, int)>
	//   45   84:pop             
		}
	//*  46   85:aload_1         
	//*  47   86:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  48   87:astore_0        
		{
			Log.e(TAG, "Failed to create JSONObject for dimension.", ((Throwable) (view)));
	//   49   88:getstatic       #16  <Field String TAG>
	//   50   91:ldc1            #210 <String "Failed to create JSONObject for dimension.">
	//   51   93:aload_0         
	//   52   94:invokestatic    #173 <Method int Log.e(String, String, Throwable)>
	//   53   97:pop             
			return jsonobject;
	//   54   98:aload_1         
	//   55   99:areturn         
		}
		return jsonobject;
	}

	public static android.view.View.AccessibilityDelegate getExistingDelegate(View view)
	{
		try
		{
			view = ((View) ((android.view.View.AccessibilityDelegate)((Object) (view)).getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(((Object) (view)), new Object[0])));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method Class Object.getClass()>
	//    2    4:ldc1            #225 <String "getAccessibilityDelegate">
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokevirtual   #229 <Method Method Class.getMethod(String, Class[])>
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokevirtual   #235 <Method Object Method.invoke(Object, Object[])>
	//   10   21:checkcast       #237 <Class android.view.View$AccessibilityDelegate>
	//   11   24:astore_0        
		}
	//*  12   25:aload_0         
	//*  13   26:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  14   27:astore_0        
		{
			return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  17   30:astore_0        
		{
			return null;
	//   18   31:aconst_null     
	//   19   32:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  20   33:astore_0        
		{
			return null;
	//   21   34:aconst_null     
	//   22   35:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  23   36:astore_0        
		{
			return null;
	//   24   37:aconst_null     
	//   25   38:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  26   39:astore_0        
		{
			return null;
	//   27   40:aconst_null     
	//   28   41:areturn         
		}
		return ((android.view.View.AccessibilityDelegate) (view));
	}

	public static String getHintOfView(View view)
	{
		if(view instanceof TextView)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #54  <Class TextView>
	//*   2    4:ifeq            18
			view = ((View) (((TextView)view).getHint()));
	//    3    7:aload_0         
	//    4    8:checkcast       #54  <Class TextView>
	//    5   11:invokevirtual   #241 <Method CharSequence TextView.getHint()>
	//    6   14:astore_0        
		else
	//*   7   15:goto            38
		if(view instanceof EditText)
	//*   8   18:aload_0         
	//*   9   19:instanceof      #63  <Class EditText>
	//*  10   22:ifeq            36
			view = ((View) (((EditText)view).getHint()));
	//   11   25:aload_0         
	//   12   26:checkcast       #63  <Class EditText>
	//   13   29:invokevirtual   #242 <Method CharSequence EditText.getHint()>
	//   14   32:astore_0        
		else
	//*  15   33:goto            38
			view = null;
	//   16   36:aconst_null     
	//   17   37:astore_0        
		if(view == null)
	//*  18   38:aload_0         
	//*  19   39:ifnonnull       45
			return "";
	//   20   42:ldc1            #127 <String "">
	//   21   44:areturn         
		else
			return ((Object) (view)).toString();
	//   22   45:aload_0         
	//   23   46:invokevirtual   #134 <Method String Object.toString()>
	//   24   49:areturn         
	}

	public static String getTextOfView(View view)
	{
		boolean flag = view instanceof TextView;
	//    0    0:aload_0         
	//    1    1:instanceof      #54  <Class TextView>
	//    2    4:istore          4
		Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		Object obj;
		if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            55
		{
			obj = ((Object) (((TextView)view).getText()));
	//    7   14:aload_0         
	//    8   15:checkcast       #54  <Class TextView>
	//    9   18:invokevirtual   #245 <Method CharSequence TextView.getText()>
	//   10   21:astore          5
			if(view instanceof Switch)
	//*  11   23:aload_0         
	//*  12   24:instanceof      #58  <Class Switch>
	//*  13   27:ifeq            301
			{
				if(((Switch)view).isChecked())
	//*  14   30:aload_0         
	//*  15   31:checkcast       #58  <Class Switch>
	//*  16   34:invokevirtual   #249 <Method boolean Switch.isChecked()>
	//*  17   37:ifeq            46
					view = "1";
	//   18   40:ldc1            #251 <String "1">
	//   19   42:astore_0        
				else
	//*  20   43:goto            49
					view = "0";
	//   21   46:ldc1            #253 <String "0">
	//   22   48:astore_0        
				obj = ((Object) (view));
	//   23   49:aload_0         
	//   24   50:astore          5
			}
		} else
	//*  25   52:goto            301
		if(view instanceof Spinner)
	//*  26   55:aload_0         
	//*  27   56:instanceof      #65  <Class Spinner>
	//*  28   59:ifeq            87
		{
			view = ((View) (((Spinner)view).getSelectedItem()));
	//   29   62:aload_0         
	//   30   63:checkcast       #65  <Class Spinner>
	//   31   66:invokevirtual   #256 <Method Object Spinner.getSelectedItem()>
	//   32   69:astore_0        
			obj = ((Object) (obj1));
	//   33   70:aload           6
	//   34   72:astore          5
			if(view != null)
	//*  35   74:aload_0         
	//*  36   75:ifnull          301
				obj = ((Object) (((Object) (view)).toString()));
	//   37   78:aload_0         
	//   38   79:invokevirtual   #134 <Method String Object.toString()>
	//   39   82:astore          5
		} else
	//*  40   84:goto            301
		{
			boolean flag1 = view instanceof DatePicker;
	//   41   87:aload_0         
	//   42   88:instanceof      #67  <Class DatePicker>
	//   43   91:istore          4
			int i = 0;
	//   44   93:iconst_0        
	//   45   94:istore_1        
			if(flag1)
	//*  46   95:iload           4
	//*  47   97:ifeq            150
			{
				view = ((View) ((DatePicker)view));
	//   48  100:aload_0         
	//   49  101:checkcast       #67  <Class DatePicker>
	//   50  104:astore_0        
				obj = ((Object) (String.format("%04d-%02d-%02d", new Object[] {
					Integer.valueOf(((DatePicker) (view)).getYear()), Integer.valueOf(((DatePicker) (view)).getMonth()), Integer.valueOf(((DatePicker) (view)).getDayOfMonth())
				})));
	//   51  105:ldc2            #258 <String "%04d-%02d-%02d">
	//   52  108:iconst_3        
	//   53  109:anewarray       Object[]
	//   54  112:dup             
	//   55  113:iconst_0        
	//   56  114:aload_0         
	//   57  115:invokevirtual   #261 <Method int DatePicker.getYear()>
	//   58  118:invokestatic    #267 <Method Integer Integer.valueOf(int)>
	//   59  121:aastore         
	//   60  122:dup             
	//   61  123:iconst_1        
	//   62  124:aload_0         
	//   63  125:invokevirtual   #270 <Method int DatePicker.getMonth()>
	//   64  128:invokestatic    #267 <Method Integer Integer.valueOf(int)>
	//   65  131:aastore         
	//   66  132:dup             
	//   67  133:iconst_2        
	//   68  134:aload_0         
	//   69  135:invokevirtual   #273 <Method int DatePicker.getDayOfMonth()>
	//   70  138:invokestatic    #267 <Method Integer Integer.valueOf(int)>
	//   71  141:aastore         
	//   72  142:invokestatic    #279 <Method String String.format(String, Object[])>
	//   73  145:astore          5
			} else
	//*  74  147:goto            301
			if(view instanceof TimePicker)
	//*  75  150:aload_0         
	//*  76  151:instanceof      #281 <Class TimePicker>
	//*  77  154:ifeq            203
			{
				view = ((View) ((TimePicker)view));
	//   78  157:aload_0         
	//   79  158:checkcast       #281 <Class TimePicker>
	//   80  161:astore_0        
				obj = ((Object) (String.format("%02d:%02d", new Object[] {
					Integer.valueOf(((TimePicker) (view)).getCurrentHour().intValue()), Integer.valueOf(((TimePicker) (view)).getCurrentMinute().intValue())
				})));
	//   81  162:ldc2            #283 <String "%02d:%02d">
	//   82  165:iconst_2        
	//   83  166:anewarray       Object[]
	//   84  169:dup             
	//   85  170:iconst_0        
	//   86  171:aload_0         
	//   87  172:invokevirtual   #287 <Method Integer TimePicker.getCurrentHour()>
	//   88  175:invokevirtual   #290 <Method int Integer.intValue()>
	//   89  178:invokestatic    #267 <Method Integer Integer.valueOf(int)>
	//   90  181:aastore         
	//   91  182:dup             
	//   92  183:iconst_1        
	//   93  184:aload_0         
	//   94  185:invokevirtual   #293 <Method Integer TimePicker.getCurrentMinute()>
	//   95  188:invokevirtual   #290 <Method int Integer.intValue()>
	//   96  191:invokestatic    #267 <Method Integer Integer.valueOf(int)>
	//   97  194:aastore         
	//   98  195:invokestatic    #279 <Method String String.format(String, Object[])>
	//   99  198:astore          5
			} else
	//* 100  200:goto            301
			if(view instanceof RadioGroup)
	//* 101  203:aload_0         
	//* 102  204:instanceof      #72  <Class RadioGroup>
	//* 103  207:ifeq            278
			{
				view = ((View) ((RadioGroup)view));
	//  104  210:aload_0         
	//  105  211:checkcast       #72  <Class RadioGroup>
	//  106  214:astore_0        
				int j = ((RadioGroup) (view)).getCheckedRadioButtonId();
	//  107  215:aload_0         
	//  108  216:invokevirtual   #296 <Method int RadioGroup.getCheckedRadioButtonId()>
	//  109  219:istore_2        
				int k = ((RadioGroup) (view)).getChildCount();
	//  110  220:aload_0         
	//  111  221:invokevirtual   #297 <Method int RadioGroup.getChildCount()>
	//  112  224:istore_3        
				do
				{
					obj = ((Object) (obj1));
	//  113  225:aload           6
	//  114  227:astore          5
					if(i >= k)
						break;
	//  115  229:iload_1         
	//  116  230:iload_3         
	//  117  231:icmpge          301
					obj = ((Object) (((RadioGroup) (view)).getChildAt(i)));
	//  118  234:aload_0         
	//  119  235:iload_1         
	//  120  236:invokevirtual   #298 <Method View RadioGroup.getChildAt(int)>
	//  121  239:astore          5
					if(((View) (obj)).getId() == j && (obj instanceof RadioButton))
	//* 122  241:aload           5
	//* 123  243:invokevirtual   #118 <Method int View.getId()>
	//* 124  246:iload_2         
	//* 125  247:icmpne          271
	//* 126  250:aload           5
	//* 127  252:instanceof      #300 <Class RadioButton>
	//* 128  255:ifeq            271
					{
						obj = ((Object) (((RadioButton)obj).getText()));
	//  129  258:aload           5
	//  130  260:checkcast       #300 <Class RadioButton>
	//  131  263:invokevirtual   #301 <Method CharSequence RadioButton.getText()>
	//  132  266:astore          5
						break;
	//  133  268:goto            301
					}
					i++;
	//  134  271:iload_1         
	//  135  272:iconst_1        
	//  136  273:iadd            
	//  137  274:istore_1        
				} while(true);
	//  138  275:goto            225
			} else
			{
				obj = ((Object) (obj1));
	//  139  278:aload           6
	//  140  280:astore          5
				if(view instanceof RatingBar)
	//* 141  282:aload_0         
	//* 142  283:instanceof      #69  <Class RatingBar>
	//* 143  286:ifeq            301
					obj = ((Object) (String.valueOf(((RatingBar)view).getRating())));
	//  144  289:aload_0         
	//  145  290:checkcast       #69  <Class RatingBar>
	//  146  293:invokevirtual   #305 <Method float RatingBar.getRating()>
	//  147  296:invokestatic    #308 <Method String String.valueOf(float)>
	//  148  299:astore          5
			}
		}
		if(obj == null)
	//* 149  301:aload           5
	//* 150  303:ifnonnull       309
			return "";
	//  151  306:ldc1            #127 <String "">
	//  152  308:areturn         
		else
			return obj.toString();
	//  153  309:aload           5
	//  154  311:invokevirtual   #134 <Method String Object.toString()>
	//  155  314:areturn         
	}

	private static boolean isAdapterViewItem(View view)
	{
		view = ((View) (view.getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #312 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_0        
		return view != null && ((view instanceof AdapterView) || (view instanceof NestedScrollingChild));
	//    3    5:aload_0         
	//    4    6:ifnull          25
	//    5    9:aload_0         
	//    6   10:instanceof      #314 <Class AdapterView>
	//    7   13:ifne            23
	//    8   16:aload_0         
	//    9   17:instanceof      #316 <Class NestedScrollingChild>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private static boolean isClickableView(View view)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Object obj;
		Field field;
		try
		{
			obj = ((Object) (Class.forName("android.view.View").getDeclaredField("mListenerInfo")));
	//    2    2:ldc2            #320 <String "android.view.View">
	//    3    5:invokestatic    #324 <Method Class Class.forName(String)>
	//    4    8:ldc2            #326 <String "mListenerInfo">
	//    5   11:invokevirtual   #330 <Method Field Class.getDeclaredField(String)>
	//    6   14:astore_2        
		}
	//*   7   15:aload_2         
	//*   8   16:ifnull          24
	//*   9   19:aload_2         
	//*  10   20:iconst_1        
	//*  11   21:invokevirtual   #336 <Method void Field.setAccessible(boolean)>
	//*  12   24:aload_2         
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #339 <Method Object Field.get(Object)>
	//*  15   29:astore_2        
	//*  16   30:aload_2         
	//*  17   31:ifnonnull       36
	//*  18   34:iconst_0        
	//*  19   35:ireturn         
	//*  20   36:aconst_null     
	//*  21   37:astore_0        
	//*  22   38:ldc2            #341 <String "android.view.View$ListenerInfo">
	//*  23   41:invokestatic    #324 <Method Class Class.forName(String)>
	//*  24   44:ldc2            #343 <String "mOnClickListener">
	//*  25   47:invokevirtual   #330 <Method Field Class.getDeclaredField(String)>
	//*  26   50:astore_3        
	//*  27   51:aload_3         
	//*  28   52:ifnull          64
	//*  29   55:aload_3         
	//*  30   56:aload_2         
	//*  31   57:invokevirtual   #339 <Method Object Field.get(Object)>
	//*  32   60:checkcast       #345 <Class android.view.View$OnClickListener>
	//*  33   63:astore_0        
	//*  34   64:aload_0         
	//*  35   65:ifnull          70
	//*  36   68:iconst_1        
	//*  37   69:istore_1        
	//*  38   70:iload_1         
	//*  39   71:ireturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  40   72:astore_0        
		{
			Log.e(TAG, "Failed to check if the view is clickable.", ((Throwable) (view)));
	//   41   73:getstatic       #16  <Field String TAG>
	//   42   76:ldc2            #347 <String "Failed to check if the view is clickable.">
	//   43   79:aload_0         
	//   44   80:invokestatic    #173 <Method int Log.e(String, String, Throwable)>
	//   45   83:pop             
			return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_24;
		((Field) (obj)).setAccessible(true);
		obj = ((Field) (obj)).get(((Object) (view)));
		if(obj == null)
			return false;
		view = null;
		field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
		if(field == null)
			break MISSING_BLOCK_LABEL_64;
		view = ((View) ((android.view.View.OnClickListener)field.get(obj)));
		if(view != null)
			flag = true;
		return flag;
	}

	private static final String TAG = ((Class) (com/facebook/appevents/codeless/internal/ViewHierarchy)).getCanonicalName();

	static 
	{
	//    0    0:ldc1            #2   <Class ViewHierarchy>
	//    1    2:invokevirtual   #14  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
