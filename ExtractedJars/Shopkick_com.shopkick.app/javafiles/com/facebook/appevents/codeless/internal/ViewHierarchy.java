// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless.internal;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.NestedScrollingChild;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.facebook.internal.Utility;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
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
	//    1    1:invokespecial   #145 <Method void Object()>
	//    2    4:return          
	}

	public static View findRCTRootView(View view)
	{
		do
		{
			if(view == null)
				break;
	//    0    0:aload_0         
	//    1    1:ifnull          37
			if(isRCTRootView(view))
	//*   2    4:aload_0         
	//*   3    5:invokestatic    #151 <Method boolean isRCTRootView(View)>
	//*   4    8:ifeq            13
				return view;
	//    5   11:aload_0         
	//    6   12:areturn         
			view = ((View) (view.getParent()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #157 <Method android.view.ViewParent View.getParent()>
	//    9   17:astore_0        
			if(view == null || !(view instanceof View))
				break;
	//   10   18:aload_0         
	//   11   19:ifnull          37
	//   12   22:aload_0         
	//   13   23:instanceof      #153 <Class View>
	//   14   26:ifeq            37
			view = (View)view;
	//   15   29:aload_0         
	//   16   30:checkcast       #153 <Class View>
	//   17   33:astore_0        
		} while(true);
	//   18   34:goto            0
		return null;
	//   19   37:aconst_null     
	//   20   38:areturn         
	}

	public static List getChildrenOfView(View view)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #162 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void ArrayList()>
	//    3    7:astore_3        
		if(view != null && (view instanceof ViewGroup))
	//*   4    8:aload_0         
	//*   5    9:ifnull          53
	//*   6   12:aload_0         
	//*   7   13:instanceof      #165 <Class ViewGroup>
	//*   8   16:ifeq            53
		{
			view = ((View) ((ViewGroup)view));
	//    9   19:aload_0         
	//   10   20:checkcast       #165 <Class ViewGroup>
	//   11   23:astore_0        
			int j = ((ViewGroup) (view)).getChildCount();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #169 <Method int ViewGroup.getChildCount()>
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
	//   23   39:invokevirtual   #173 <Method View ViewGroup.getChildAt(int)>
	//   24   42:invokevirtual   #177 <Method boolean ArrayList.add(Object)>
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
	//*   1    1:instanceof      #183 <Class ImageView>
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
	//*  11   17:invokestatic    #186 <Method boolean isClickableView(View)>
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
	//*  20   31:invokestatic    #189 <Method boolean isAdapterViewItem(View)>
	//*  21   34:ifeq            43
			k = i | 0x200;
	//   22   37:iload_1         
	//   23   38:sipush          512
	//   24   41:ior             
	//   25   42:istore_2        
		int l;
		if(view instanceof TextView)
	//*  26   43:aload_0         
	//*  27   44:instanceof      #191 <Class TextView>
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
	//*  38   61:instanceof      #193 <Class Button>
	//*  39   64:ifeq            101
			{
				k |= 4;
	//   40   67:iload_2         
	//   41   68:iconst_4        
	//   42   69:ior             
	//   43   70:istore_2        
				if(view instanceof Switch)
	//*  44   71:aload_0         
	//*  45   72:instanceof      #195 <Class Switch>
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
	//*  55   90:instanceof      #197 <Class CheckBox>
	//*  56   93:ifeq            101
						j = k | 0x8000;
	//   57   96:iload_2         
	//   58   97:ldc1            #198 <Int 32768>
	//   59   99:ior             
	//   60  100:istore_1        
				}
			}
			l = j;
	//   61  101:iload_1         
	//   62  102:istore_3        
			if(view instanceof EditText)
	//*  63  103:aload_0         
	//*  64  104:instanceof      #200 <Class EditText>
	//*  65  107:ifeq            196
				return j | 0x800;
	//   66  110:iload_1         
	//   67  111:sipush          2048
	//   68  114:ior             
	//   69  115:ireturn         
		} else
		if(!(view instanceof Spinner) && !(view instanceof DatePicker))
	//*  70  116:aload_0         
	//*  71  117:instanceof      #202 <Class Spinner>
	//*  72  120:ifne            190
	//*  73  123:aload_0         
	//*  74  124:instanceof      #204 <Class DatePicker>
	//*  75  127:ifeq            133
	//*  76  130:goto            190
		{
			if(view instanceof RatingBar)
	//*  77  133:aload_0         
	//*  78  134:instanceof      #206 <Class RatingBar>
	//*  79  137:ifeq            145
				return k | 0x10000;
	//   80  140:iload_2         
	//   81  141:ldc1            #207 <Int 0x10000>
	//   82  143:ior             
	//   83  144:ireturn         
			if(view instanceof RadioGroup)
	//*  84  145:aload_0         
	//*  85  146:instanceof      #209 <Class RadioGroup>
	//*  86  149:ifeq            158
				return k | 0x4000;
	//   87  152:iload_2         
	//   88  153:sipush          16384
	//   89  156:ior             
	//   90  157:ireturn         
			l = k;
	//   91  158:iload_2         
	//   92  159:istore_3        
			if(view instanceof ViewGroup)
	//*  93  160:aload_0         
	//*  94  161:instanceof      #165 <Class ViewGroup>
	//*  95  164:ifeq            196
			{
				l = k;
	//   96  167:iload_2         
	//   97  168:istore_3        
				if(isRCTButton(view, (View)RCTRootViewReference.get()))
	//*  98  169:aload_0         
	//*  99  170:getstatic       #140 <Field WeakReference RCTRootViewReference>
	//* 100  173:invokevirtual   #213 <Method Object WeakReference.get()>
	//* 101  176:checkcast       #153 <Class View>
	//* 102  179:invokestatic    #217 <Method boolean isRCTButton(View, View)>
	//* 103  182:ifeq            196
					return k | 0x40;
	//  104  185:iload_2         
	//  105  186:bipush          64
	//  106  188:ior             
	//  107  189:ireturn         
			}
		} else
		{
			l = k | 0x1000;
	//  108  190:iload_2         
	//  109  191:sipush          4096
	//  110  194:ior             
	//  111  195:istore_3        
		}
		return l;
	//  112  196:iload_3         
	//  113  197:ireturn         
	}

	public static JSONObject getDictionaryOfView(View view)
	{
		if(((Object) (view)).getClass().getName().equals("com.facebook.react.ReactRootView"))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//*   2    4:invokevirtual   #228 <Method String Class.getName()>
	//*   3    7:ldc1            #21  <String "com.facebook.react.ReactRootView">
	//*   4    9:invokevirtual   #233 <Method boolean String.equals(Object)>
	//*   5   12:ifeq            26
			RCTRootViewReference = new WeakReference(((Object) (view)));
	//    6   15:new             #134 <Class WeakReference>
	//    7   18:dup             
	//    8   19:aload_0         
	//    9   20:invokespecial   #138 <Method void WeakReference(Object)>
	//   10   23:putstatic       #140 <Field WeakReference RCTRootViewReference>
		JSONObject jsonobject1 = new JSONObject();
	//   11   26:new             #235 <Class JSONObject>
	//   12   29:dup             
	//   13   30:invokespecial   #236 <Method void JSONObject()>
	//   14   33:astore_3        
		JSONObject jsonobject = jsonobject1;
	//   15   34:aload_3         
	//   16   35:astore_2        
		int i;
		JSONArray jsonarray;
		try
		{
			jsonobject1 = setBasicInfoOfView(view, jsonobject1);
	//   17   36:aload_0         
	//   18   37:aload_3         
	//   19   38:invokestatic    #240 <Method JSONObject setBasicInfoOfView(View, JSONObject)>
	//   20   41:astore_3        
		}
	//*  21   42:aload_3         
	//*  22   43:astore_2        
	//*  23   44:new             #242 <Class JSONArray>
	//*  24   47:dup             
	//*  25   48:invokespecial   #243 <Method void JSONArray()>
	//*  26   51:astore          4
	//*  27   53:aload_3         
	//*  28   54:astore_2        
	//*  29   55:aload_0         
	//*  30   56:invokestatic    #245 <Method List getChildrenOfView(View)>
	//*  31   59:astore_0        
	//*  32   60:iconst_0        
	//*  33   61:istore_1        
	//*  34   62:aload_3         
	//*  35   63:astore_2        
	//*  36   64:iload_1         
	//*  37   65:aload_0         
	//*  38   66:invokeinterface #250 <Method int List.size()>
	//*  39   71:icmpge          102
	//*  40   74:aload_3         
	//*  41   75:astore_2        
	//*  42   76:aload           4
	//*  43   78:aload_0         
	//*  44   79:iload_1         
	//*  45   80:invokeinterface #253 <Method Object List.get(int)>
	//*  46   85:checkcast       #153 <Class View>
	//*  47   88:invokestatic    #255 <Method JSONObject getDictionaryOfView(View)>
	//*  48   91:invokevirtual   #259 <Method JSONArray JSONArray.put(Object)>
	//*  49   94:pop             
	//*  50   95:iload_1         
	//*  51   96:iconst_1        
	//*  52   97:iadd            
	//*  53   98:istore_1        
	//*  54   99:goto            62
	//*  55  102:aload_3         
	//*  56  103:astore_2        
	//*  57  104:aload_3         
	//*  58  105:ldc1            #15  <String "childviews">
	//*  59  107:aload           4
	//*  60  109:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//*  61  112:pop             
	//*  62  113:aload_3         
	//*  63  114:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  64  115:astore_0        
		{
			Log.e(TAG, "Failed to create JSONObject for view.", ((Throwable) (view)));
	//   65  116:getstatic       #132 <Field String TAG>
	//   66  119:ldc2            #264 <String "Failed to create JSONObject for view.">
	//   67  122:aload_0         
	//   68  123:invokestatic    #270 <Method int Log.e(String, String, Throwable)>
	//   69  126:pop             
			return jsonobject;
	//   70  127:aload_2         
	//   71  128:areturn         
		}
		jsonobject = jsonobject1;
		jsonarray = new JSONArray();
		jsonobject = jsonobject1;
		view = ((View) (getChildrenOfView(view)));
		i = 0;
_L2:
		jsonobject = jsonobject1;
		if(i >= ((List) (view)).size())
			break; /* Loop/switch isn't completed */
		jsonobject = jsonobject1;
		jsonarray.put(((Object) (getDictionaryOfView((View)((List) (view)).get(i)))));
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		jsonobject = jsonobject1;
		jsonobject1.put("childviews", ((Object) (jsonarray)));
		return jsonobject1;
	}

	private static JSONObject getDimensionOfView(View view)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #235 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #236 <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("top", view.getTop());
	//    4    8:aload_1         
	//    5    9:ldc1            #56  <String "top">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #274 <Method int View.getTop()>
	//    8   15:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
			jsonobject.put("left", view.getLeft());
	//   10   19:aload_1         
	//   11   20:ldc1            #47  <String "left">
	//   12   22:aload_0         
	//   13   23:invokevirtual   #280 <Method int View.getLeft()>
	//   14   26:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   15   29:pop             
			jsonobject.put("width", view.getWidth());
	//   16   30:aload_1         
	//   17   31:ldc1            #62  <String "width">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #283 <Method int View.getWidth()>
	//   20   37:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   21   40:pop             
			jsonobject.put("height", view.getHeight());
	//   22   41:aload_1         
	//   23   42:ldc1            #41  <String "height">
	//   24   44:aload_0         
	//   25   45:invokevirtual   #286 <Method int View.getHeight()>
	//   26   48:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   27   51:pop             
			jsonobject.put("scrollx", view.getScrollX());
	//   28   52:aload_1         
	//   29   53:ldc1            #50  <String "scrollx">
	//   30   55:aload_0         
	//   31   56:invokevirtual   #289 <Method int View.getScrollX()>
	//   32   59:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   33   62:pop             
			jsonobject.put("scrolly", view.getScrollY());
	//   34   63:aload_1         
	//   35   64:ldc1            #53  <String "scrolly">
	//   36   66:aload_0         
	//   37   67:invokevirtual   #292 <Method int View.getScrollY()>
	//   38   70:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   39   73:pop             
			jsonobject.put("visibility", view.getVisibility());
	//   40   74:aload_1         
	//   41   75:ldc1            #59  <String "visibility">
	//   42   77:aload_0         
	//   43   78:invokevirtual   #295 <Method int View.getVisibility()>
	//   44   81:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   45   84:pop             
		}
	//*  46   85:aload_1         
	//*  47   86:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  48   87:astore_0        
		{
			Log.e(TAG, "Failed to create JSONObject for dimension.", ((Throwable) (view)));
	//   49   88:getstatic       #132 <Field String TAG>
	//   50   91:ldc2            #297 <String "Failed to create JSONObject for dimension.">
	//   51   94:aload_0         
	//   52   95:invokestatic    #270 <Method int Log.e(String, String, Throwable)>
	//   53   98:pop             
			return jsonobject;
	//   54   99:aload_1         
	//   55  100:areturn         
		}
		return jsonobject;
	}

	public static android.view.View.AccessibilityDelegate getExistingDelegate(View view)
	{
		try
		{
			view = ((View) ((android.view.View.AccessibilityDelegate)((Object) (view)).getClass().getMethod("getAccessibilityDelegate", new Class[0]).invoke(((Object) (view)), new Object[0])));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//    2    4:ldc1            #65  <String "getAccessibilityDelegate">
	//    3    6:iconst_0        
	//    4    7:anewarray       Class[]
	//    5   10:invokevirtual   #313 <Method Method Class.getMethod(String, Class[])>
	//    6   13:aload_0         
	//    7   14:iconst_0        
	//    8   15:anewarray       Object[]
	//    9   18:invokevirtual   #319 <Method Object Method.invoke(Object, Object[])>
	//   10   21:checkcast       #321 <Class android.view.View$AccessibilityDelegate>
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

	public static android.view.View.OnTouchListener getExistingOnTouchListener(View view)
	{
		Field field;
		try
		{
			field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
	//    0    0:ldc2            #329 <String "android.view.View">
	//    1    3:invokestatic    #333 <Method Class Class.forName(String)>
	//    2    6:ldc2            #335 <String "mListenerInfo">
	//    3    9:invokevirtual   #339 <Method Field Class.getDeclaredField(String)>
	//    4   12:astore_1        
		}
	//*   5   13:aload_1         
	//*   6   14:ifnull          22
	//*   7   17:aload_1         
	//*   8   18:iconst_1        
	//*   9   19:invokevirtual   #345 <Method void Field.setAccessible(boolean)>
	//*  10   22:aload_1         
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #348 <Method Object Field.get(Object)>
	//*  13   27:astore_0        
	//*  14   28:aload_0         
	//*  15   29:ifnonnull       34
	//*  16   32:aconst_null     
	//*  17   33:areturn         
	//*  18   34:ldc2            #350 <String "android.view.View$ListenerInfo">
	//*  19   37:invokestatic    #333 <Method Class Class.forName(String)>
	//*  20   40:ldc2            #352 <String "mOnTouchListener">
	//*  21   43:invokevirtual   #339 <Method Field Class.getDeclaredField(String)>
	//*  22   46:astore_1        
	//*  23   47:aload_1         
	//*  24   48:ifnull          67
	//*  25   51:aload_1         
	//*  26   52:iconst_1        
	//*  27   53:invokevirtual   #345 <Method void Field.setAccessible(boolean)>
	//*  28   56:aload_1         
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #348 <Method Object Field.get(Object)>
	//*  31   61:checkcast       #354 <Class android.view.View$OnTouchListener>
	//*  32   64:astore_0        
	//*  33   65:aload_0         
	//*  34   66:areturn         
	//*  35   67:aconst_null     
	//*  36   68:areturn         
	//*  37   69:astore_0        
	//*  38   70:getstatic       #132 <Field String TAG>
	//*  39   73:aload_0         
	//*  40   74:invokestatic    #360 <Method void Utility.logd(String, Exception)>
	//*  41   77:aconst_null     
	//*  42   78:areturn         
	//*  43   79:astore_0        
	//*  44   80:getstatic       #132 <Field String TAG>
	//*  45   83:aload_0         
	//*  46   84:invokestatic    #360 <Method void Utility.logd(String, Exception)>
	//*  47   87:aconst_null     
	//*  48   88:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  49   89:astore_0        
		{
			Utility.logd(TAG, ((Exception) (view)));
	//   50   90:getstatic       #132 <Field String TAG>
	//   51   93:aload_0         
	//   52   94:invokestatic    #360 <Method void Utility.logd(String, Exception)>
			return null;
	//   53   97:aconst_null     
	//   54   98:areturn         
		}
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			Utility.logd(TAG, ((Exception) (view)));
			return null;
		}
		// Misplaced declaration of an exception variable
		catch(View view)
		{
			Utility.logd(TAG, ((Exception) (view)));
			return null;
		}
		if(field == null)
			break MISSING_BLOCK_LABEL_22;
		field.setAccessible(true);
		view = ((View) (field.get(((Object) (view)))));
		if(view == null)
			return null;
		field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
		if(field == null)
			break MISSING_BLOCK_LABEL_67;
		field.setAccessible(true);
		view = ((View) ((android.view.View.OnTouchListener)field.get(((Object) (view)))));
		return ((android.view.View.OnTouchListener) (view));
		return null;
	}

	public static String getHintOfView(View view)
	{
		if(view instanceof TextView)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #191 <Class TextView>
	//*   2    4:ifeq            18
			view = ((View) (((TextView)view).getHint()));
	//    3    7:aload_0         
	//    4    8:checkcast       #191 <Class TextView>
	//    5   11:invokevirtual   #366 <Method CharSequence TextView.getHint()>
	//    6   14:astore_0        
		else
	//*   7   15:goto            38
		if(view instanceof EditText)
	//*   8   18:aload_0         
	//*   9   19:instanceof      #200 <Class EditText>
	//*  10   22:ifeq            36
			view = ((View) (((EditText)view).getHint()));
	//   11   25:aload_0         
	//   12   26:checkcast       #200 <Class EditText>
	//   13   29:invokevirtual   #367 <Method CharSequence EditText.getHint()>
	//   14   32:astore_0        
		else
	//*  15   33:goto            38
			view = null;
	//   16   36:aconst_null     
	//   17   37:astore_0        
		if(view == null)
	//*  18   38:aload_0         
	//*  19   39:ifnonnull       46
			return "";
	//   20   42:ldc2            #369 <String "">
	//   21   45:areturn         
		else
			return ((Object) (view)).toString();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #372 <Method String Object.toString()>
	//   24   50:areturn         
	}

	public static ViewGroup getParentOfView(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		view = ((View) (view.getParent()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #157 <Method android.view.ViewParent View.getParent()>
	//    6   10:astore_0        
		if(view != null && (view instanceof ViewGroup))
	//*   7   11:aload_0         
	//*   8   12:ifnull          27
	//*   9   15:aload_0         
	//*  10   16:instanceof      #165 <Class ViewGroup>
	//*  11   19:ifeq            27
			return (ViewGroup)view;
	//   12   22:aload_0         
	//   13   23:checkcast       #165 <Class ViewGroup>
	//   14   26:areturn         
		else
			return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
	}

	public static String getTextOfView(View view)
	{
		boolean flag = view instanceof TextView;
	//    0    0:aload_0         
	//    1    1:instanceof      #191 <Class TextView>
	//    2    4:istore          4
		Object obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
		Object obj;
		if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            57
		{
			obj = ((Object) (((TextView)view).getText()));
	//    7   14:aload_0         
	//    8   15:checkcast       #191 <Class TextView>
	//    9   18:invokevirtual   #378 <Method CharSequence TextView.getText()>
	//   10   21:astore          5
			if(view instanceof Switch)
	//*  11   23:aload_0         
	//*  12   24:instanceof      #195 <Class Switch>
	//*  13   27:ifeq            303
			{
				if(((Switch)view).isChecked())
	//*  14   30:aload_0         
	//*  15   31:checkcast       #195 <Class Switch>
	//*  16   34:invokevirtual   #382 <Method boolean Switch.isChecked()>
	//*  17   37:ifeq            47
					view = "1";
	//   18   40:ldc2            #384 <String "1">
	//   19   43:astore_0        
				else
	//*  20   44:goto            51
					view = "0";
	//   21   47:ldc2            #386 <String "0">
	//   22   50:astore_0        
				obj = ((Object) (view));
	//   23   51:aload_0         
	//   24   52:astore          5
			}
		} else
	//*  25   54:goto            303
		if(view instanceof Spinner)
	//*  26   57:aload_0         
	//*  27   58:instanceof      #202 <Class Spinner>
	//*  28   61:ifeq            89
		{
			view = ((View) (((Spinner)view).getSelectedItem()));
	//   29   64:aload_0         
	//   30   65:checkcast       #202 <Class Spinner>
	//   31   68:invokevirtual   #389 <Method Object Spinner.getSelectedItem()>
	//   32   71:astore_0        
			obj = ((Object) (obj1));
	//   33   72:aload           6
	//   34   74:astore          5
			if(view != null)
	//*  35   76:aload_0         
	//*  36   77:ifnull          303
				obj = ((Object) (((Object) (view)).toString()));
	//   37   80:aload_0         
	//   38   81:invokevirtual   #372 <Method String Object.toString()>
	//   39   84:astore          5
		} else
	//*  40   86:goto            303
		{
			boolean flag1 = view instanceof DatePicker;
	//   41   89:aload_0         
	//   42   90:instanceof      #204 <Class DatePicker>
	//   43   93:istore          4
			int i = 0;
	//   44   95:iconst_0        
	//   45   96:istore_1        
			if(flag1)
	//*  46   97:iload           4
	//*  47   99:ifeq            152
			{
				view = ((View) ((DatePicker)view));
	//   48  102:aload_0         
	//   49  103:checkcast       #204 <Class DatePicker>
	//   50  106:astore_0        
				obj = ((Object) (String.format("%04d-%02d-%02d", new Object[] {
					Integer.valueOf(((DatePicker) (view)).getYear()), Integer.valueOf(((DatePicker) (view)).getMonth()), Integer.valueOf(((DatePicker) (view)).getDayOfMonth())
				})));
	//   51  107:ldc2            #391 <String "%04d-%02d-%02d">
	//   52  110:iconst_3        
	//   53  111:anewarray       Object[]
	//   54  114:dup             
	//   55  115:iconst_0        
	//   56  116:aload_0         
	//   57  117:invokevirtual   #394 <Method int DatePicker.getYear()>
	//   58  120:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//   59  123:aastore         
	//   60  124:dup             
	//   61  125:iconst_1        
	//   62  126:aload_0         
	//   63  127:invokevirtual   #403 <Method int DatePicker.getMonth()>
	//   64  130:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//   65  133:aastore         
	//   66  134:dup             
	//   67  135:iconst_2        
	//   68  136:aload_0         
	//   69  137:invokevirtual   #406 <Method int DatePicker.getDayOfMonth()>
	//   70  140:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//   71  143:aastore         
	//   72  144:invokestatic    #410 <Method String String.format(String, Object[])>
	//   73  147:astore          5
			} else
	//*  74  149:goto            303
			if(view instanceof TimePicker)
	//*  75  152:aload_0         
	//*  76  153:instanceof      #412 <Class TimePicker>
	//*  77  156:ifeq            205
			{
				view = ((View) ((TimePicker)view));
	//   78  159:aload_0         
	//   79  160:checkcast       #412 <Class TimePicker>
	//   80  163:astore_0        
				obj = ((Object) (String.format("%02d:%02d", new Object[] {
					Integer.valueOf(((TimePicker) (view)).getCurrentHour().intValue()), Integer.valueOf(((TimePicker) (view)).getCurrentMinute().intValue())
				})));
	//   81  164:ldc2            #414 <String "%02d:%02d">
	//   82  167:iconst_2        
	//   83  168:anewarray       Object[]
	//   84  171:dup             
	//   85  172:iconst_0        
	//   86  173:aload_0         
	//   87  174:invokevirtual   #418 <Method Integer TimePicker.getCurrentHour()>
	//   88  177:invokevirtual   #421 <Method int Integer.intValue()>
	//   89  180:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//   90  183:aastore         
	//   91  184:dup             
	//   92  185:iconst_1        
	//   93  186:aload_0         
	//   94  187:invokevirtual   #424 <Method Integer TimePicker.getCurrentMinute()>
	//   95  190:invokevirtual   #421 <Method int Integer.intValue()>
	//   96  193:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//   97  196:aastore         
	//   98  197:invokestatic    #410 <Method String String.format(String, Object[])>
	//   99  200:astore          5
			} else
	//* 100  202:goto            303
			if(view instanceof RadioGroup)
	//* 101  205:aload_0         
	//* 102  206:instanceof      #209 <Class RadioGroup>
	//* 103  209:ifeq            280
			{
				view = ((View) ((RadioGroup)view));
	//  104  212:aload_0         
	//  105  213:checkcast       #209 <Class RadioGroup>
	//  106  216:astore_0        
				int j = ((RadioGroup) (view)).getCheckedRadioButtonId();
	//  107  217:aload_0         
	//  108  218:invokevirtual   #427 <Method int RadioGroup.getCheckedRadioButtonId()>
	//  109  221:istore_2        
				int k = ((RadioGroup) (view)).getChildCount();
	//  110  222:aload_0         
	//  111  223:invokevirtual   #428 <Method int RadioGroup.getChildCount()>
	//  112  226:istore_3        
				do
				{
					obj = ((Object) (obj1));
	//  113  227:aload           6
	//  114  229:astore          5
					if(i >= k)
						break;
	//  115  231:iload_1         
	//  116  232:iload_3         
	//  117  233:icmpge          303
					obj = ((Object) (((RadioGroup) (view)).getChildAt(i)));
	//  118  236:aload_0         
	//  119  237:iload_1         
	//  120  238:invokevirtual   #429 <Method View RadioGroup.getChildAt(int)>
	//  121  241:astore          5
					if(((View) (obj)).getId() == j && (obj instanceof RadioButton))
	//* 122  243:aload           5
	//* 123  245:invokevirtual   #432 <Method int View.getId()>
	//* 124  248:iload_2         
	//* 125  249:icmpne          273
	//* 126  252:aload           5
	//* 127  254:instanceof      #434 <Class RadioButton>
	//* 128  257:ifeq            273
					{
						obj = ((Object) (((RadioButton)obj).getText()));
	//  129  260:aload           5
	//  130  262:checkcast       #434 <Class RadioButton>
	//  131  265:invokevirtual   #435 <Method CharSequence RadioButton.getText()>
	//  132  268:astore          5
						break;
	//  133  270:goto            303
					}
					i++;
	//  134  273:iload_1         
	//  135  274:iconst_1        
	//  136  275:iadd            
	//  137  276:istore_1        
				} while(true);
	//  138  277:goto            227
			} else
			{
				obj = ((Object) (obj1));
	//  139  280:aload           6
	//  140  282:astore          5
				if(view instanceof RatingBar)
	//* 141  284:aload_0         
	//* 142  285:instanceof      #206 <Class RatingBar>
	//* 143  288:ifeq            303
					obj = ((Object) (String.valueOf(((RatingBar)view).getRating())));
	//  144  291:aload_0         
	//  145  292:checkcast       #206 <Class RatingBar>
	//  146  295:invokevirtual   #439 <Method float RatingBar.getRating()>
	//  147  298:invokestatic    #442 <Method String String.valueOf(float)>
	//  148  301:astore          5
			}
		}
		if(obj == null)
	//* 149  303:aload           5
	//* 150  305:ifnonnull       312
			return "";
	//  151  308:ldc2            #369 <String "">
	//  152  311:areturn         
		else
			return obj.toString();
	//  153  312:aload           5
	//  154  314:invokevirtual   #372 <Method String Object.toString()>
	//  155  317:areturn         
	}

	public static View getTouchReactView(float af[], View view)
	{
		Method method;
		initTouchTargetHelperMethods();
	//    0    0:invokestatic    #447 <Method void initTouchTargetHelperMethods()>
		method = methodFindTouchTargetView;
	//    1    3:getstatic       #142 <Field Method methodFindTouchTargetView>
	//    2    6:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_83;
	//    3    7:aload_2         
	//    4    8:ifnull          83
		if(view == null)
	//*   5   11:aload_1         
	//*   6   12:ifnonnull       17
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
		af = ((float []) ((View)method.invoke(((Object) (null)), new Object[] {
			af, view
		})));
	//    9   17:aload_2         
	//   10   18:aconst_null     
	//   11   19:iconst_2        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:aload_0         
	//   16   26:aastore         
	//   17   27:dup             
	//   18   28:iconst_1        
	//   19   29:aload_1         
	//   20   30:aastore         
	//   21   31:invokevirtual   #319 <Method Object Method.invoke(Object, Object[])>
	//   22   34:checkcast       #153 <Class View>
	//   23   37:astore_0        
		if(af == null)
			break MISSING_BLOCK_LABEL_81;
	//   24   38:aload_0         
	//   25   39:ifnull          81
		if(((View) (af)).getId() <= 0)
			break MISSING_BLOCK_LABEL_81;
	//   26   42:aload_0         
	//   27   43:invokevirtual   #432 <Method int View.getId()>
	//   28   46:ifle            81
		af = ((float []) ((View)((View) (af)).getParent()));
	//   29   49:aload_0         
	//   30   50:invokevirtual   #157 <Method android.view.ViewParent View.getParent()>
	//   31   53:checkcast       #153 <Class View>
	//   32   56:astore_0        
		if(af != null)
	//*  33   57:aload_0         
	//*  34   58:ifnull          81
			return ((View) (af));
	//   35   61:aload_0         
	//   36   62:areturn         
		break MISSING_BLOCK_LABEL_81;
		af;
	//   37   63:astore_0        
		Utility.logd(TAG, ((Exception) (af)));
	//   38   64:getstatic       #132 <Field String TAG>
	//   39   67:aload_0         
	//   40   68:invokestatic    #360 <Method void Utility.logd(String, Exception)>
		return null;
	//   41   71:aconst_null     
	//   42   72:areturn         
		af;
	//   43   73:astore_0        
		Utility.logd(TAG, ((Exception) (af)));
	//   44   74:getstatic       #132 <Field String TAG>
	//   45   77:aload_0         
	//   46   78:invokestatic    #360 <Method void Utility.logd(String, Exception)>
		return null;
	//   47   81:aconst_null     
	//   48   82:areturn         
		return null;
	//   49   83:aconst_null     
	//   50   84:areturn         
	}

	private static float[] getViewLocationOnScreen(View view)
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		view.getLocationOnScreen(ai);
	//    3    4:aload_0         
	//    4    5:aload_1         
	//    5    6:invokevirtual   #454 <Method void View.getLocationOnScreen(int[])>
		return (new float[] {
			(float)ai[0], (float)ai[1]
		});
	//    6    9:iconst_2        
	//    7   10:newarray        float[]
	//    8   12:dup             
	//    9   13:iconst_0        
	//   10   14:aload_1         
	//   11   15:iconst_0        
	//   12   16:iaload          
	//   13   17:i2f             
	//   14   18:fastore         
	//   15   19:dup             
	//   16   20:iconst_1        
	//   17   21:aload_1         
	//   18   22:iconst_1        
	//   19   23:iaload          
	//   20   24:i2f             
	//   21   25:fastore         
	//   22   26:areturn         
	}

	private static void initTouchTargetHelperMethods()
	{
		if(methodFindTouchTargetView != null)
	//*   0    0:getstatic       #142 <Field Method methodFindTouchTargetView>
	//*   1    3:ifnull          7
			return;
	//    2    6:return          
		try
		{
			methodFindTouchTargetView = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[] {
				[F, android/view/ViewGroup
			});
	//    3    7:ldc1            #30  <String "com.facebook.react.uimanager.TouchTargetHelper">
	//    4    9:invokestatic    #333 <Method Class Class.forName(String)>
	//    5   12:ldc1            #85  <String "findTouchTargetView">
	//    6   14:iconst_2        
	//    7   15:anewarray       Class[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:ldc2            #456 <Class float[]>
	//   11   23:aastore         
	//   12   24:dup             
	//   13   25:iconst_1        
	//   14   26:ldc1            #165 <Class ViewGroup>
	//   15   28:aastore         
	//   16   29:invokevirtual   #459 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   17   32:putstatic       #142 <Field Method methodFindTouchTargetView>
			methodFindTouchTargetView.setAccessible(true);
	//   18   35:getstatic       #142 <Field Method methodFindTouchTargetView>
	//   19   38:iconst_1        
	//   20   39:invokevirtual   #460 <Method void Method.setAccessible(boolean)>
			return;
	//   21   42:return          
		}
	//*  22   43:astore_0        
	//*  23   44:getstatic       #132 <Field String TAG>
	//*  24   47:aload_0         
	//*  25   48:invokestatic    #360 <Method void Utility.logd(String, Exception)>
	//*  26   51:return          
		catch(ClassNotFoundException classnotfoundexception)
	//*  27   52:astore_0        
		{
			Utility.logd(TAG, ((Exception) (classnotfoundexception)));
	//   28   53:getstatic       #132 <Field String TAG>
	//   29   56:aload_0         
	//   30   57:invokestatic    #360 <Method void Utility.logd(String, Exception)>
		}
		catch(NoSuchMethodException nosuchmethodexception)
		{
			Utility.logd(TAG, ((Exception) (nosuchmethodexception)));
			return;
		}
	//   31   60:return          
	}

	private static boolean isAdapterViewItem(View view)
	{
		view = ((View) (view.getParent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #157 <Method android.view.ViewParent View.getParent()>
	//    2    4:astore_0        
		return view != null && ((view instanceof AdapterView) || (view instanceof NestedScrollingChild));
	//    3    5:aload_0         
	//    4    6:ifnull          25
	//    5    9:aload_0         
	//    6   10:instanceof      #462 <Class AdapterView>
	//    7   13:ifne            23
	//    8   16:aload_0         
	//    9   17:instanceof      #464 <Class NestedScrollingChild>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public static boolean isClickableView(View view)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		Object obj;
		Field field;
		try
		{
			obj = ((Object) (Class.forName("android.view.View").getDeclaredField("mListenerInfo")));
	//    2    2:ldc2            #329 <String "android.view.View">
	//    3    5:invokestatic    #333 <Method Class Class.forName(String)>
	//    4    8:ldc2            #335 <String "mListenerInfo">
	//    5   11:invokevirtual   #339 <Method Field Class.getDeclaredField(String)>
	//    6   14:astore_2        
		}
	//*   7   15:aload_2         
	//*   8   16:ifnull          24
	//*   9   19:aload_2         
	//*  10   20:iconst_1        
	//*  11   21:invokevirtual   #345 <Method void Field.setAccessible(boolean)>
	//*  12   24:aload_2         
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #348 <Method Object Field.get(Object)>
	//*  15   29:astore_2        
	//*  16   30:aload_2         
	//*  17   31:ifnonnull       36
	//*  18   34:iconst_0        
	//*  19   35:ireturn         
	//*  20   36:aconst_null     
	//*  21   37:astore_0        
	//*  22   38:ldc2            #350 <String "android.view.View$ListenerInfo">
	//*  23   41:invokestatic    #333 <Method Class Class.forName(String)>
	//*  24   44:ldc2            #468 <String "mOnClickListener">
	//*  25   47:invokevirtual   #339 <Method Field Class.getDeclaredField(String)>
	//*  26   50:astore_3        
	//*  27   51:aload_3         
	//*  28   52:ifnull          64
	//*  29   55:aload_3         
	//*  30   56:aload_2         
	//*  31   57:invokevirtual   #348 <Method Object Field.get(Object)>
	//*  32   60:checkcast       #470 <Class android.view.View$OnClickListener>
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
	//   41   73:getstatic       #132 <Field String TAG>
	//   42   76:ldc2            #472 <String "Failed to check if the view is clickable.">
	//   43   79:aload_0         
	//   44   80:invokestatic    #270 <Method int Log.e(String, String, Throwable)>
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

	public static boolean isRCTButton(View view, View view1)
	{
		boolean flag = ((Object) (view)).getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #228 <Method String Class.getName()>
	//    3    7:ldc1            #27  <String "com.facebook.react.views.view.ReactViewGroup">
	//    4    9:invokevirtual   #233 <Method boolean String.equals(Object)>
	//    5   12:istore_2        
		boolean flag2 = false;
	//    6   13:iconst_0        
	//    7   14:istore_3        
		if(flag)
	//*   8   15:iload_2         
	//*   9   16:ifeq            51
		{
			view1 = getTouchReactView(getViewLocationOnScreen(view), view1);
	//   10   19:aload_0         
	//   11   20:invokestatic    #474 <Method float[] getViewLocationOnScreen(View)>
	//   12   23:aload_1         
	//   13   24:invokestatic    #476 <Method View getTouchReactView(float[], View)>
	//   14   27:astore_1        
			boolean flag1 = flag2;
	//   15   28:iload_3         
	//   16   29:istore_2        
			if(view1 != null)
	//*  17   30:aload_1         
	//*  18   31:ifnull          49
			{
				flag1 = flag2;
	//   19   34:iload_3         
	//   20   35:istore_2        
				if(view1.getId() == view.getId())
	//*  21   36:aload_1         
	//*  22   37:invokevirtual   #432 <Method int View.getId()>
	//*  23   40:aload_0         
	//*  24   41:invokevirtual   #432 <Method int View.getId()>
	//*  25   44:icmpne          49
					flag1 = true;
	//   26   47:iconst_1        
	//   27   48:istore_2        
			}
			return flag1;
	//   28   49:iload_2         
	//   29   50:ireturn         
		} else
		{
			return false;
	//   30   51:iconst_0        
	//   31   52:ireturn         
		}
	}

	public static boolean isRCTRootView(View view)
	{
		return ((Object) (view)).getClass().getName().equals("com.facebook.react.ReactRootView");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #228 <Method String Class.getName()>
	//    3    7:ldc1            #21  <String "com.facebook.react.ReactRootView">
	//    4    9:invokevirtual   #233 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	public static boolean isRCTTextView(View view)
	{
		return ((Object) (view)).getClass().getName().equals("com.facebook.react.views.view.ReactTextView");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #228 <Method String Class.getName()>
	//    3    7:ldc1            #24  <String "com.facebook.react.views.view.ReactTextView">
	//    4    9:invokevirtual   #233 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	public static boolean isRCTViewGroup(View view)
	{
		return ((Object) (view)).getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #228 <Method String Class.getName()>
	//    3    7:ldc1            #27  <String "com.facebook.react.views.view.ReactViewGroup">
	//    4    9:invokevirtual   #233 <Method boolean String.equals(Object)>
	//    5   12:ireturn         
	}

	public static JSONObject setAppearanceOfView(View view, JSONObject jsonobject, float f)
	{
		JSONObject jsonobject1;
		TextView textview;
		Typeface typeface;
		jsonobject1 = new JSONObject();
	//    0    0:new             #235 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #236 <Method void JSONObject()>
	//    3    7:astore_3        
		if(!(view instanceof TextView))
			break MISSING_BLOCK_LABEL_78;
	//    4    8:aload_0         
	//    5    9:instanceof      #191 <Class TextView>
	//    6   12:ifeq            78
		textview = (TextView)view;
	//    7   15:aload_0         
	//    8   16:checkcast       #191 <Class TextView>
	//    9   19:astore          4
		typeface = textview.getTypeface();
	//   10   21:aload           4
	//   11   23:invokevirtual   #484 <Method Typeface TextView.getTypeface()>
	//   12   26:astore          5
		if(typeface == null)
			break MISSING_BLOCK_LABEL_78;
	//   13   28:aload           5
	//   14   30:ifnull          78
		jsonobject1.put("font_size", textview.getTextSize());
	//   15   33:aload_3         
	//   16   34:ldc1            #116 <String "font_size">
	//   17   36:aload           4
	//   18   38:invokevirtual   #487 <Method float TextView.getTextSize()>
	//   19   41:f2d             
	//   20   42:invokevirtual   #490 <Method JSONObject JSONObject.put(String, double)>
	//   21   45:pop             
		jsonobject1.put("is_bold", typeface.isBold());
	//   22   46:aload_3         
	//   23   47:ldc1            #107 <String "is_bold">
	//   24   49:aload           5
	//   25   51:invokevirtual   #495 <Method boolean Typeface.isBold()>
	//   26   54:invokevirtual   #498 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   57:pop             
		jsonobject1.put("is_italic", typeface.isItalic());
	//   28   58:aload_3         
	//   29   59:ldc1            #110 <String "is_italic">
	//   30   61:aload           5
	//   31   63:invokevirtual   #501 <Method boolean Typeface.isItalic()>
	//   32   66:invokevirtual   #498 <Method JSONObject JSONObject.put(String, boolean)>
	//   33   69:pop             
		jsonobject.put("text_style", ((Object) (jsonobject1)));
	//   34   70:aload_1         
	//   35   71:ldc1            #119 <String "text_style">
	//   36   73:aload_3         
	//   37   74:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   38   77:pop             
		if(!(view instanceof ImageView))
			break MISSING_BLOCK_LABEL_180;
	//   39   78:aload_0         
	//   40   79:instanceof      #183 <Class ImageView>
	//   41   82:ifeq            180
		Object obj = ((Object) (((ImageView)view).getDrawable()));
	//   42   85:aload_0         
	//   43   86:checkcast       #183 <Class ImageView>
	//   44   89:invokevirtual   #505 <Method android.graphics.drawable.Drawable ImageView.getDrawable()>
	//   45   92:astore_3        
		if(!(obj instanceof BitmapDrawable) || (float)view.getHeight() / f > 44F || (float)view.getWidth() / f > 44F)
			break MISSING_BLOCK_LABEL_180;
	//   46   93:aload_3         
	//   47   94:instanceof      #507 <Class BitmapDrawable>
	//   48   97:ifeq            180
	//   49  100:aload_0         
	//   50  101:invokevirtual   #286 <Method int View.getHeight()>
	//   51  104:i2f             
	//   52  105:fload_2         
	//   53  106:fdiv            
	//   54  107:ldc2            #508 <Float 44F>
	//   55  110:fcmpg           
	//   56  111:ifgt            180
	//   57  114:aload_0         
	//   58  115:invokevirtual   #283 <Method int View.getWidth()>
	//   59  118:i2f             
	//   60  119:fload_2         
	//   61  120:fdiv            
	//   62  121:ldc2            #508 <Float 44F>
	//   63  124:fcmpg           
	//   64  125:ifgt            180
		view = ((View) (((BitmapDrawable)obj).getBitmap()));
	//   65  128:aload_3         
	//   66  129:checkcast       #507 <Class BitmapDrawable>
	//   67  132:invokevirtual   #512 <Method Bitmap BitmapDrawable.getBitmap()>
	//   68  135:astore_0        
		obj = ((Object) (new ByteArrayOutputStream()));
	//   69  136:new             #514 <Class ByteArrayOutputStream>
	//   70  139:dup             
	//   71  140:invokespecial   #515 <Method void ByteArrayOutputStream()>
	//   72  143:astore_3        
		((Bitmap) (view)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((java.io.OutputStream) (obj)));
	//   73  144:aload_0         
	//   74  145:getstatic       #521 <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.PNG>
	//   75  148:bipush          100
	//   76  150:aload_3         
	//   77  151:invokevirtual   #527 <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   78  154:pop             
		jsonobject.put("icon_image", ((Object) (Base64.encodeToString(((ByteArrayOutputStream) (obj)).toByteArray(), 0))));
	//   79  155:aload_1         
	//   80  156:ldc1            #71  <String "icon_image">
	//   81  158:aload_3         
	//   82  159:invokevirtual   #531 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   83  162:iconst_0        
	//   84  163:invokestatic    #537 <Method String Base64.encodeToString(byte[], int)>
	//   85  166:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   86  169:pop             
		return jsonobject;
	//   87  170:aload_1         
	//   88  171:areturn         
		view;
	//   89  172:astore_0        
		Utility.logd(TAG, ((Exception) (view)));
	//   90  173:getstatic       #132 <Field String TAG>
	//   91  176:aload_0         
	//   92  177:invokestatic    #360 <Method void Utility.logd(String, Exception)>
		return jsonobject;
	//   93  180:aload_1         
	//   94  181:areturn         
	}

	public static JSONObject setBasicInfoOfView(View view, JSONObject jsonobject)
	{
		String s1;
		Object obj;
		CharSequence charsequence;
		String s = getTextOfView(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #539 <Method String getTextOfView(View)>
	//    2    4:astore_2        
		s1 = getHintOfView(view);
	//    3    5:aload_0         
	//    4    6:invokestatic    #541 <Method String getHintOfView(View)>
	//    5    9:astore_3        
		obj = view.getTag();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #544 <Method Object View.getTag()>
	//    8   14:astore          4
		charsequence = view.getContentDescription();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #547 <Method CharSequence View.getContentDescription()>
	//   11   20:astore          5
		jsonobject.put("classname", ((Object) (((Object) (view)).getClass().getCanonicalName())));
	//   12   22:aload_1         
	//   13   23:ldc1            #18  <String "classname">
	//   14   25:aload_0         
	//   15   26:invokevirtual   #225 <Method Class Object.getClass()>
	//   16   29:invokevirtual   #130 <Method String Class.getCanonicalName()>
	//   17   32:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   18   35:pop             
		jsonobject.put("classtypebitmask", getClassTypeBitmask(view));
	//   19   36:aload_1         
	//   20   37:ldc1            #33  <String "classtypebitmask">
	//   21   39:aload_0         
	//   22   40:invokestatic    #549 <Method int getClassTypeBitmask(View)>
	//   23   43:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   24   46:pop             
		jsonobject.put("id", view.getId());
	//   25   47:aload_1         
	//   26   48:ldc1            #76  <String "id">
	//   27   50:aload_0         
	//   28   51:invokevirtual   #432 <Method int View.getId()>
	//   29   54:invokevirtual   #277 <Method JSONObject JSONObject.put(String, int)>
	//   30   57:pop             
		if(!SensitiveUserDataUtils.isSensitiveUserData(view))
	//*  31   58:aload_0         
	//*  32   59:invokestatic    #554 <Method boolean SensitiveUserDataUtils.isSensitiveUserData(View)>
	//*  33   62:ifne            76
		{
			jsonobject.put("text", ((Object) (s)));
	//   34   65:aload_1         
	//   35   66:ldc1            #113 <String "text">
	//   36   68:aload_2         
	//   37   69:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   38   72:pop             
			break MISSING_BLOCK_LABEL_86;
	//   39   73:goto            86
		}
		jsonobject.put("text", "");
	//   40   76:aload_1         
	//   41   77:ldc1            #113 <String "text">
	//   42   79:ldc2            #369 <String "">
	//   43   82:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   44   85:pop             
		jsonobject.put("hint", ((Object) (s1)));
	//   45   86:aload_1         
	//   46   87:ldc1            #68  <String "hint">
	//   47   89:aload_3         
	//   48   90:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   49   93:pop             
		if(obj != null)
	//*  50   94:aload           4
	//*  51   96:ifnull          111
			try
			{
				jsonobject.put("tag", ((Object) (obj.toString())));
	//   52   99:aload_1         
	//   53  100:ldc1            #102 <String "tag">
	//   54  102:aload           4
	//   55  104:invokevirtual   #372 <Method String Object.toString()>
	//   56  107:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//   57  110:pop             
			}
	//*  58  111:aload           5
	//*  59  113:ifnull          130
	//*  60  116:aload_1         
	//*  61  117:ldc1            #38  <String "description">
	//*  62  119:aload           5
	//*  63  121:invokeinterface #557 <Method String CharSequence.toString()>
	//*  64  126:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//*  65  129:pop             
	//*  66  130:aload_1         
	//*  67  131:ldc1            #44  <String "dimension">
	//*  68  133:aload_0         
	//*  69  134:invokestatic    #559 <Method JSONObject getDimensionOfView(View)>
	//*  70  137:invokevirtual   #262 <Method JSONObject JSONObject.put(String, Object)>
	//*  71  140:pop             
	//*  72  141:aload_1         
	//*  73  142:areturn         
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  74  143:astore_0        
			{
				Utility.logd(TAG, ((Exception) (view)));
	//   75  144:getstatic       #132 <Field String TAG>
	//   76  147:aload_0         
	//   77  148:invokestatic    #360 <Method void Utility.logd(String, Exception)>
				return jsonobject;
	//   78  151:aload_1         
	//   79  152:areturn         
			}
		if(charsequence == null)
			break MISSING_BLOCK_LABEL_130;
		jsonobject.put("description", ((Object) (charsequence.toString())));
		jsonobject.put("dimension", ((Object) (getDimensionOfView(view))));
		return jsonobject;
	}

	private static final int ADAPTER_VIEW_ITEM_BITMASK = 9;
	private static final int BUTTON_BITMASK = 2;
	private static final int CHECKBOX_BITMASK = 15;
	private static final String CHILDREN_VIEW_KEY = "childviews";
	private static final String CLASS_NAME_KEY = "classname";
	private static final String CLASS_RCTROOTVIEW = "com.facebook.react.ReactRootView";
	private static final String CLASS_RCTTEXTVIEW = "com.facebook.react.views.view.ReactTextView";
	private static final String CLASS_RCTVIEWGROUP = "com.facebook.react.views.view.ReactViewGroup";
	private static final String CLASS_TOUCHTARGETHELPER = "com.facebook.react.uimanager.TouchTargetHelper";
	private static final String CLASS_TYPE_BITMASK_KEY = "classtypebitmask";
	private static final int CLICKABLE_VIEW_BITMASK = 5;
	private static final String DESC_KEY = "description";
	private static final String DIMENSION_HEIGHT_KEY = "height";
	private static final String DIMENSION_KEY = "dimension";
	private static final String DIMENSION_LEFT_KEY = "left";
	private static final String DIMENSION_SCROLL_X_KEY = "scrollx";
	private static final String DIMENSION_SCROLL_Y_KEY = "scrolly";
	private static final String DIMENSION_TOP_KEY = "top";
	private static final String DIMENSION_VISIBILITY_KEY = "visibility";
	private static final String DIMENSION_WIDTH_KEY = "width";
	private static final String GET_ACCESSIBILITY_METHOD = "getAccessibilityDelegate";
	private static final String HINT_KEY = "hint";
	private static final String ICON_BITMAP = "icon_image";
	private static final int ICON_MAX_EDGE_LENGTH = 44;
	private static final String ID_KEY = "id";
	private static final int IMAGEVIEW_BITMASK = 1;
	private static final int INPUT_BITMASK = 11;
	private static final int LABEL_BITMASK = 10;
	private static final String METHOD_FIND_TOUCHTARGET_VIEW = "findTouchTargetView";
	private static final int PICKER_BITMASK = 12;
	private static final int RADIO_GROUP_BITMASK = 14;
	private static final int RATINGBAR_BITMASK = 16;
	private static WeakReference RCTRootViewReference = new WeakReference(((Object) (null)));
	private static final int REACT_NATIVE_BUTTON_BITMASK = 6;
	private static final int SWITCH_BITMASK = 13;
	private static final String TAG = ((Class) (com/facebook/appevents/codeless/internal/ViewHierarchy)).getCanonicalName();
	private static final String TAG_KEY = "tag";
	private static final int TEXTVIEW_BITMASK = 0;
	private static final String TEXT_IS_BOLD = "is_bold";
	private static final String TEXT_IS_ITALIC = "is_italic";
	private static final String TEXT_KEY = "text";
	private static final String TEXT_SIZE = "font_size";
	private static final String TEXT_STYLE = "text_style";
	private static Method methodFindTouchTargetView = null;

	static 
	{
	//    0    0:ldc1            #2   <Class ViewHierarchy>
	//    1    2:invokevirtual   #130 <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #132 <Field String TAG>
	//    3    8:new             #134 <Class WeakReference>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:invokespecial   #138 <Method void WeakReference(Object)>
	//    7   16:putstatic       #140 <Field WeakReference RCTRootViewReference>
	//    8   19:aconst_null     
	//    9   20:putstatic       #142 <Field Method methodFindTouchTargetView>
	//*  10   23:return          
	}
}
