// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.*;
import java.util.Map;

class AppCompatViewInflater
{
	static class DeclaredOnClickListener
		implements android.view.View.OnClickListener
	{

		private void resolveMethod(Context context, String s)
		{
_L2:
			if(context == null)
				break; /* Loop/switch isn't completed */
		//    0    0:aload_1         
		//    1    1:ifnull          74
			if(context.isRestricted())
				break MISSING_BLOCK_LABEL_51;
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method boolean Context.isRestricted()>
		//    4    8:ifne            47
			s = ((String) (((Object) (context)).getClass().getMethod(mMethodName, new Class[] {
				android/view/View
			})));
		//    5   11:aload_1         
		//    6   12:invokevirtual   #44  <Method Class Object.getClass()>
		//    7   15:aload_0         
		//    8   16:getfield        #27  <Field String mMethodName>
		//    9   19:iconst_1        
		//   10   20:anewarray       Class[]
		//   11   23:dup             
		//   12   24:iconst_0        
		//   13   25:ldc1            #48  <Class View>
		//   14   27:aastore         
		//   15   28:invokevirtual   #52  <Method Method Class.getMethod(String, Class[])>
		//   16   31:astore_2        
			if(s != null)
		//*  17   32:aload_2         
		//*  18   33:ifnull          47
				try
				{
					mResolvedMethod = ((Method) (s));
		//   19   36:aload_0         
		//   20   37:aload_2         
		//   21   38:putfield        #54  <Field Method mResolvedMethod>
					mResolvedContext = context;
		//   22   41:aload_0         
		//   23   42:aload_1         
		//   24   43:putfield        #56  <Field Context mResolvedContext>
					return;
		//   25   46:return          
				}
		//*  26   47:goto            51
				// Misplaced declaration of an exception variable
				catch(String s) { }
		//   27   50:astore_2        
			if(context instanceof ContextWrapper)
		//*  28   51:aload_1         
		//*  29   52:instanceof      #58  <Class ContextWrapper>
		//*  30   55:ifeq            69
				context = ((ContextWrapper)context).getBaseContext();
		//   31   58:aload_1         
		//   32   59:checkcast       #58  <Class ContextWrapper>
		//   33   62:invokevirtual   #62  <Method Context ContextWrapper.getBaseContext()>
		//   34   65:astore_1        
			else
		//*  35   66:goto            0
				context = null;
		//   36   69:aconst_null     
		//   37   70:astore_1        
			if(true) goto _L2; else goto _L1
		//   38   71:goto            0
_L1:
			int i = mHostView.getId();
		//   39   74:aload_0         
		//   40   75:getfield        #25  <Field View mHostView>
		//   41   78:invokevirtual   #66  <Method int View.getId()>
		//   42   81:istore_3        
			if(i == -1)
		//*  43   82:iload_3         
		//*  44   83:iconst_m1       
		//*  45   84:icmpne          93
				context = "";
		//   46   87:ldc1            #68  <String "">
		//   47   89:astore_1        
			else
		//*  48   90:goto            131
				context = ((Context) ((new StringBuilder()).append(" with id '").append(mHostView.getContext().getResources().getResourceEntryName(i)).append("'").toString()));
		//   49   93:new             #70  <Class StringBuilder>
		//   50   96:dup             
		//   51   97:invokespecial   #71  <Method void StringBuilder()>
		//   52  100:ldc1            #73  <String " with id '">
		//   53  102:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   54  105:aload_0         
		//   55  106:getfield        #25  <Field View mHostView>
		//   56  109:invokevirtual   #80  <Method Context View.getContext()>
		//   57  112:invokevirtual   #84  <Method Resources Context.getResources()>
		//   58  115:iload_3         
		//   59  116:invokevirtual   #90  <Method String Resources.getResourceEntryName(int)>
		//   60  119:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   61  122:ldc1            #92  <String "'">
		//   62  124:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   63  127:invokevirtual   #96  <Method String StringBuilder.toString()>
		//   64  130:astore_1        
			throw new IllegalStateException((new StringBuilder()).append("Could not find method ").append(mMethodName).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ").append(((Object) (((Object) (mHostView)).getClass()))).append(((String) (context))).toString());
		//   65  131:new             #98  <Class IllegalStateException>
		//   66  134:dup             
		//   67  135:new             #70  <Class StringBuilder>
		//   68  138:dup             
		//   69  139:invokespecial   #71  <Method void StringBuilder()>
		//   70  142:ldc1            #100 <String "Could not find method ">
		//   71  144:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   72  147:aload_0         
		//   73  148:getfield        #27  <Field String mMethodName>
		//   74  151:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   75  154:ldc1            #102 <String "(View) in a parent or ancestor Context for android:onClick ">
		//   76  156:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   77  159:ldc1            #104 <String "attribute defined on view ">
		//   78  161:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   79  164:aload_0         
		//   80  165:getfield        #25  <Field View mHostView>
		//   81  168:invokevirtual   #44  <Method Class Object.getClass()>
		//   82  171:invokevirtual   #107 <Method StringBuilder StringBuilder.append(Object)>
		//   83  174:aload_1         
		//   84  175:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   85  178:invokevirtual   #96  <Method String StringBuilder.toString()>
		//   86  181:invokespecial   #110 <Method void IllegalStateException(String)>
		//   87  184:athrow          
		}

		public void onClick(View view)
		{
			if(mResolvedMethod == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field Method mResolvedMethod>
		//*   2    4:ifnonnull       22
				resolveMethod(mHostView.getContext(), mMethodName);
		//    3    7:aload_0         
		//    4    8:aload_0         
		//    5    9:getfield        #25  <Field View mHostView>
		//    6   12:invokevirtual   #80  <Method Context View.getContext()>
		//    7   15:aload_0         
		//    8   16:getfield        #27  <Field String mMethodName>
		//    9   19:invokespecial   #119 <Method void resolveMethod(Context, String)>
			try
			{
				mResolvedMethod.invoke(((Object) (mResolvedContext)), new Object[] {
					view
				});
		//   10   22:aload_0         
		//   11   23:getfield        #54  <Field Method mResolvedMethod>
		//   12   26:aload_0         
		//   13   27:getfield        #56  <Field Context mResolvedContext>
		//   14   30:iconst_1        
		//   15   31:anewarray       Object[]
		//   16   34:dup             
		//   17   35:iconst_0        
		//   18   36:aload_1         
		//   19   37:aastore         
		//   20   38:invokevirtual   #125 <Method Object Method.invoke(Object, Object[])>
		//   21   41:pop             
				return;
		//   22   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
		//*  23   43:astore_1        
			{
				throw new IllegalStateException("Could not execute non-public method for android:onClick", ((Throwable) (view)));
		//   24   44:new             #98  <Class IllegalStateException>
		//   25   47:dup             
		//   26   48:ldc1            #127 <String "Could not execute non-public method for android:onClick">
		//   27   50:aload_1         
		//   28   51:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
		//   29   54:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
		//*  30   55:astore_1        
			{
				throw new IllegalStateException("Could not execute method for android:onClick", ((Throwable) (view)));
		//   31   56:new             #98  <Class IllegalStateException>
		//   32   59:dup             
		//   33   60:ldc1            #132 <String "Could not execute method for android:onClick">
		//   34   62:aload_1         
		//   35   63:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
		//   36   66:athrow          
			}
		}

		private final View mHostView;
		private final String mMethodName;
		private Context mResolvedContext;
		private Method mResolvedMethod;

		public DeclaredOnClickListener(View view, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
			mHostView = view;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #25  <Field View mHostView>
			mMethodName = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field String mMethodName>
		//    8   14:return          
		}
	}


	AppCompatViewInflater()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:putfield        #57  <Field Object[] mConstructorArgs>
	//    6   12:return          
	}

	private void checkOnClickListener(View view, AttributeSet attributeset)
	{
		Object obj = ((Object) (view.getContext()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #65  <Method Context View.getContext()>
	//    2    4:astore_3        
		if(!(obj instanceof ContextWrapper) || android.os.Build.VERSION.SDK_INT >= 15 && !ViewCompat.hasOnClickListeners(view))
	//*   3    5:aload_3         
	//*   4    6:instanceof      #67  <Class ContextWrapper>
	//*   5    9:ifeq            27
	//*   6   12:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          15
	//*   8   17:icmplt          28
	//*   9   20:aload_1         
	//*  10   21:invokestatic    #79  <Method boolean ViewCompat.hasOnClickListeners(View)>
	//*  11   24:ifne            28
			return;
	//   12   27:return          
		attributeset = ((AttributeSet) (((Context) (obj)).obtainStyledAttributes(attributeset, sOnClickAttrs)));
	//   13   28:aload_3         
	//   14   29:aload_2         
	//   15   30:getstatic       #36  <Field int[] sOnClickAttrs>
	//   16   33:invokevirtual   #83  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   17   36:astore_2        
		obj = ((Object) (((TypedArray) (attributeset)).getString(0)));
	//   18   37:aload_2         
	//   19   38:iconst_0        
	//   20   39:invokevirtual   #89  <Method String TypedArray.getString(int)>
	//   21   42:astore_3        
		if(obj != null)
	//*  22   43:aload_3         
	//*  23   44:ifnull          60
			view.setOnClickListener(((android.view.View.OnClickListener) (new DeclaredOnClickListener(view, ((String) (obj))))));
	//   24   47:aload_1         
	//   25   48:new             #6   <Class AppCompatViewInflater$DeclaredOnClickListener>
	//   26   51:dup             
	//   27   52:aload_1         
	//   28   53:aload_3         
	//   29   54:invokespecial   #92  <Method void AppCompatViewInflater$DeclaredOnClickListener(View, String)>
	//   30   57:invokevirtual   #96  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		((TypedArray) (attributeset)).recycle();
	//   31   60:aload_2         
	//   32   61:invokevirtual   #99  <Method void TypedArray.recycle()>
	//   33   64:return          
	}

	private View createView(Context context, String s, String s1)
		throws ClassNotFoundException, InflateException
	{
		Object obj;
		Constructor constructor;
		constructor = (Constructor)sConstructorMap.get(((Object) (s)));
	//    0    0:getstatic       #53  <Field Map sConstructorMap>
	//    1    3:aload_2         
	//    2    4:invokeinterface #113 <Method Object Map.get(Object)>
	//    3    9:checkcast       #115 <Class Constructor>
	//    4   12:astore          5
		obj = ((Object) (constructor));
	//    5   14:aload           5
	//    6   16:astore          4
		if(constructor != null) goto _L2; else goto _L1
	//    7   18:aload           5
	//    8   20:ifnonnull       86
_L1:
		try
		{
			obj = ((Object) (context.getClassLoader()));
	//    9   23:aload_1         
	//   10   24:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//   11   27:astore          4
		}
	//*  12   29:aload_3         
	//*  13   30:ifnull          110
	//*  14   33:new             #121 <Class StringBuilder>
	//*  15   36:dup             
	//*  16   37:invokespecial   #122 <Method void StringBuilder()>
	//*  17   40:aload_3         
	//*  18   41:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  19   44:aload_2         
	//*  20   45:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  21   48:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  22   51:astore_1        
	//*  23   52:goto            55
	//*  24   55:aload           4
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #136 <Method Class ClassLoader.loadClass(String)>
	//*  27   61:ldc1            #61  <Class View>
	//*  28   63:invokevirtual   #140 <Method Class Class.asSubclass(Class)>
	//*  29   66:getstatic       #33  <Field Class[] sConstructorSignature>
	//*  30   69:invokevirtual   #144 <Method Constructor Class.getConstructor(Class[])>
	//*  31   72:astore          4
	//*  32   74:getstatic       #53  <Field Map sConstructorMap>
	//*  33   77:aload_2         
	//*  34   78:aload           4
	//*  35   80:invokeinterface #148 <Method Object Map.put(Object, Object)>
	//*  36   85:pop             
	//*  37   86:aload           4
	//*  38   88:iconst_1        
	//*  39   89:invokevirtual   #152 <Method void Constructor.setAccessible(boolean)>
	//*  40   92:aload           4
	//*  41   94:aload_0         
	//*  42   95:getfield        #57  <Field Object[] mConstructorArgs>
	//*  43   98:invokevirtual   #156 <Method Object Constructor.newInstance(Object[])>
	//*  44  101:checkcast       #61  <Class View>
	//*  45  104:astore_1        
	//*  46  105:aload_1         
	//*  47  106:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  48  107:astore_1        
		{
			return null;
	//   49  108:aconst_null     
	//   50  109:areturn         
		}
		if(s1 == null) goto _L4; else goto _L3
_L3:
		context = ((Context) ((new StringBuilder()).append(s1).append(s).toString()));
_L6:
		obj = ((Object) (((ClassLoader) (obj)).loadClass(((String) (context))).asSubclass(android/view/View).getConstructor(sConstructorSignature)));
		sConstructorMap.put(((Object) (s)), obj);
_L2:
		((Constructor) (obj)).setAccessible(true);
		context = ((Context) ((View)((Constructor) (obj)).newInstance(mConstructorArgs)));
		return ((View) (context));
_L4:
		context = ((Context) (s));
	//   51  110:aload_2         
	//   52  111:astore_1        
		if(true) goto _L6; else goto _L5
	//   53  112:goto            55
_L5:
	}

	private View createViewFromTag(Context context, String s, AttributeSet attributeset)
	{
		String s1;
		s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          5
		if(s.equals("view"))
	//*   2    3:aload_2         
	//*   3    4:ldc1            #161 <String "view">
	//*   4    6:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*   5    9:ifeq            23
			s1 = attributeset.getAttributeValue(((String) (null)), "class");
	//    6   12:aload_3         
	//    7   13:aconst_null     
	//    8   14:ldc1            #167 <String "class">
	//    9   16:invokeinterface #171 <Method String AttributeSet.getAttributeValue(String, String)>
	//   10   21:astore          5
		mConstructorArgs[0] = ((Object) (context));
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field Object[] mConstructorArgs>
	//   13   27:iconst_0        
	//   14   28:aload_1         
	//   15   29:aastore         
		mConstructorArgs[1] = ((Object) (attributeset));
	//   16   30:aload_0         
	//   17   31:getfield        #57  <Field Object[] mConstructorArgs>
	//   18   34:iconst_1        
	//   19   35:aload_3         
	//   20   36:aastore         
		if(-1 != s1.indexOf('.'))
			break MISSING_BLOCK_LABEL_119;
	//   21   37:iconst_m1       
	//   22   38:aload           5
	//   23   40:bipush          46
	//   24   42:invokevirtual   #175 <Method int String.indexOf(int)>
	//   25   45:icmpne          119
		int i = 0;
	//   26   48:iconst_0        
	//   27   49:istore          4
		do
		{
			try
			{
				if(i >= sClassPrefixList.length)
					break;
	//   28   51:iload           4
	//   29   53:getstatic       #46  <Field String[] sClassPrefixList>
	//   30   56:arraylength     
	//   31   57:icmpge          103
				s = ((String) (createView(context, s1, sClassPrefixList[i])));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:aload           5
	//   35   64:getstatic       #46  <Field String[] sClassPrefixList>
	//   36   67:iload           4
	//   37   69:aaload          
	//   38   70:invokespecial   #177 <Method View createView(Context, String, String)>
	//   39   73:astore_2        
			}
	//*  40   74:aload_2         
	//*  41   75:ifnull          94
	//*  42   78:aload_0         
	//*  43   79:getfield        #57  <Field Object[] mConstructorArgs>
	//*  44   82:iconst_0        
	//*  45   83:aconst_null     
	//*  46   84:aastore         
	//*  47   85:aload_0         
	//*  48   86:getfield        #57  <Field Object[] mConstructorArgs>
	//*  49   89:iconst_1        
	//*  50   90:aconst_null     
	//*  51   91:aastore         
	//*  52   92:aload_2         
	//*  53   93:areturn         
	//*  54   94:iload           4
	//*  55   96:iconst_1        
	//*  56   97:iadd            
	//*  57   98:istore          4
	//*  58  100:goto            51
	//*  59  103:aload_0         
	//*  60  104:getfield        #57  <Field Object[] mConstructorArgs>
	//*  61  107:iconst_0        
	//*  62  108:aconst_null     
	//*  63  109:aastore         
	//*  64  110:aload_0         
	//*  65  111:getfield        #57  <Field Object[] mConstructorArgs>
	//*  66  114:iconst_1        
	//*  67  115:aconst_null     
	//*  68  116:aastore         
	//*  69  117:aconst_null     
	//*  70  118:areturn         
	//*  71  119:aload_0         
	//*  72  120:aload_1         
	//*  73  121:aload           5
	//*  74  123:aconst_null     
	//*  75  124:invokespecial   #177 <Method View createView(Context, String, String)>
	//*  76  127:astore_1        
	//*  77  128:aload_0         
	//*  78  129:getfield        #57  <Field Object[] mConstructorArgs>
	//*  79  132:iconst_0        
	//*  80  133:aconst_null     
	//*  81  134:aastore         
	//*  82  135:aload_0         
	//*  83  136:getfield        #57  <Field Object[] mConstructorArgs>
	//*  84  139:iconst_1        
	//*  85  140:aconst_null     
	//*  86  141:aastore         
	//*  87  142:aload_1         
	//*  88  143:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  89  144:astore_1        
			{
				mConstructorArgs[0] = null;
	//   90  145:aload_0         
	//   91  146:getfield        #57  <Field Object[] mConstructorArgs>
	//   92  149:iconst_0        
	//   93  150:aconst_null     
	//   94  151:aastore         
				mConstructorArgs[1] = null;
	//   95  152:aload_0         
	//   96  153:getfield        #57  <Field Object[] mConstructorArgs>
	//   97  156:iconst_1        
	//   98  157:aconst_null     
	//   99  158:aastore         
				return null;
	//  100  159:aconst_null     
	//  101  160:areturn         
			}
			if(s != null)
			{
				mConstructorArgs[0] = null;
				mConstructorArgs[1] = null;
				return ((View) (s));
			}
			i++;
		} while(true);
		mConstructorArgs[0] = null;
		mConstructorArgs[1] = null;
		return null;
		context = ((Context) (createView(context, s1, ((String) (null)))));
		mConstructorArgs[0] = null;
		mConstructorArgs[1] = null;
		return ((View) (context));
		context;
	//  102  161:astore_1        
		mConstructorArgs[0] = null;
	//  103  162:aload_0         
	//  104  163:getfield        #57  <Field Object[] mConstructorArgs>
	//  105  166:iconst_0        
	//  106  167:aconst_null     
	//  107  168:aastore         
		mConstructorArgs[1] = null;
	//  108  169:aload_0         
	//  109  170:getfield        #57  <Field Object[] mConstructorArgs>
	//  110  173:iconst_1        
	//  111  174:aconst_null     
	//  112  175:aastore         
		throw context;
	//  113  176:aload_1         
	//  114  177:athrow          
	}

	private static Context themifyContext(Context context, AttributeSet attributeset, boolean flag, boolean flag1)
	{
label0:
		{
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.View, 0, 0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #184 <Field int[] android.support.v7.appcompat.R$styleable.View>
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #187 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    6   10:astore_1        
			int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore          4
			if(flag)
	//*   9   14:iload_2         
	//*  10   15:ifeq            28
				i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_android_theme, 0);
	//   11   18:aload_1         
	//   12   19:getstatic       #190 <Field int android.support.v7.appcompat.R$styleable.View_android_theme>
	//   13   22:iconst_0        
	//   14   23:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//   15   26:istore          4
			int k = i;
	//   16   28:iload           4
	//   17   30:istore          5
			if(flag1)
	//*  18   32:iload_3         
	//*  19   33:ifeq            76
			{
				k = i;
	//   20   36:iload           4
	//   21   38:istore          5
				if(i == 0)
	//*  22   40:iload           4
	//*  23   42:ifne            76
				{
					int j = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_theme, 0);
	//   24   45:aload_1         
	//   25   46:getstatic       #197 <Field int android.support.v7.appcompat.R$styleable.View_theme>
	//   26   49:iconst_0        
	//   27   50:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//   28   53:istore          4
					k = j;
	//   29   55:iload           4
	//   30   57:istore          5
					if(j != 0)
	//*  31   59:iload           4
	//*  32   61:ifeq            76
					{
						Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
	//   33   64:ldc1            #11  <String "AppCompatViewInflater">
	//   34   66:ldc1            #199 <String "app:theme is now deprecated. Please move to using android:theme instead.">
	//   35   68:invokestatic    #205 <Method int Log.i(String, String)>
	//   36   71:pop             
						k = j;
	//   37   72:iload           4
	//   38   74:istore          5
					}
				}
			}
			((TypedArray) (attributeset)).recycle();
	//   39   76:aload_1         
	//   40   77:invokevirtual   #99  <Method void TypedArray.recycle()>
			attributeset = ((AttributeSet) (context));
	//   41   80:aload_0         
	//   42   81:astore_1        
			if(k == 0)
				break label0;
	//   43   82:iload           5
	//   44   84:ifeq            119
			if(context instanceof ContextThemeWrapper)
	//*  45   87:aload_0         
	//*  46   88:instanceof      #207 <Class ContextThemeWrapper>
	//*  47   91:ifeq            108
			{
				attributeset = ((AttributeSet) (context));
	//   48   94:aload_0         
	//   49   95:astore_1        
				if(((ContextThemeWrapper)context).getThemeResId() == k)
					break label0;
	//   50   96:aload_0         
	//   51   97:checkcast       #207 <Class ContextThemeWrapper>
	//   52  100:invokevirtual   #211 <Method int ContextThemeWrapper.getThemeResId()>
	//   53  103:iload           5
	//   54  105:icmpeq          119
			}
			attributeset = ((AttributeSet) (new ContextThemeWrapper(context, k)));
	//   55  108:new             #207 <Class ContextThemeWrapper>
	//   56  111:dup             
	//   57  112:aload_0         
	//   58  113:iload           5
	//   59  115:invokespecial   #214 <Method void ContextThemeWrapper(Context, int)>
	//   60  118:astore_1        
		}
		return ((Context) (attributeset));
	//   61  119:aload_1         
	//   62  120:areturn         
	}

	public final View createView(View view, String s, Context context, AttributeSet attributeset, boolean flag, boolean flag1, boolean flag2, 
			boolean flag3)
	{
label0:
		{
			Context context1 = context;
	//    0    0:aload_3         
	//    1    1:astore          10
			if(flag)
	//*   2    3:iload           5
	//*   3    5:ifeq            21
			{
				context1 = context;
	//    4    8:aload_3         
	//    5    9:astore          10
				if(view != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          21
					context1 = view.getContext();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #65  <Method Context View.getContext()>
	//   10   19:astore          10
			}
			if(!flag1)
	//*  11   21:iload           6
	//*  12   23:ifne            34
			{
				view = ((View) (context1));
	//   13   26:aload           10
	//   14   28:astore_1        
				if(!flag2)
					break label0;
	//   15   29:iload           7
	//   16   31:ifeq            46
			}
			view = ((View) (themifyContext(context1, attributeset, flag1, flag2)));
	//   17   34:aload           10
	//   18   36:aload           4
	//   19   38:iload           6
	//   20   40:iload           7
	//   21   42:invokestatic    #218 <Method Context themifyContext(Context, AttributeSet, boolean, boolean)>
	//   22   45:astore_1        
		}
		Object obj = ((Object) (view));
	//   23   46:aload_1         
	//   24   47:astore          10
		if(flag3)
	//*  25   49:iload           8
	//*  26   51:ifeq            60
			obj = ((Object) (TintContextWrapper.wrap(((Context) (view)))));
	//   27   54:aload_1         
	//   28   55:invokestatic    #224 <Method Context TintContextWrapper.wrap(Context)>
	//   29   58:astore          10
		view = null;
	//   30   60:aconst_null     
	//   31   61:astore_1        
		byte byte0 = -1;
	//   32   62:iconst_m1       
	//   33   63:istore          9
		switch(s.hashCode())
	//*  34   65:aload_2         
	//*  35   66:invokevirtual   #227 <Method int String.hashCode()>
		{
	//*  36   69:lookupswitch    13: default 184
	//	               -1946472170: 357
	//	               -1455429095: 309
	//	               -1346021293: 341
	//	               -938935918: 187
	//	               -937446323: 262
	//	               -658531749: 373
	//	               -339785223: 247
	//	               776382189: 293
	//	               1125864064: 202
	//	               1413872058: 325
	//	               1601505219: 277
	//	               1666676343: 232
	//	               2001146706: 217
	//*  37  184:goto            386
		case -938935918: 
			if(s.equals("TextView"))
	//*  38  187:aload_2         
	//*  39  188:ldc1            #229 <String "TextView">
	//*  40  190:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  41  193:ifeq            386
				byte0 = 0;
	//   42  196:iconst_0        
	//   43  197:istore          9
			break;

	//*  44  199:goto            386
		case 1125864064: 
			if(s.equals("ImageView"))
	//*  45  202:aload_2         
	//*  46  203:ldc1            #231 <String "ImageView">
	//*  47  205:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  48  208:ifeq            386
				byte0 = 1;
	//   49  211:iconst_1        
	//   50  212:istore          9
			break;

	//*  51  214:goto            386
		case 2001146706: 
			if(s.equals("Button"))
	//*  52  217:aload_2         
	//*  53  218:ldc1            #233 <String "Button">
	//*  54  220:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  55  223:ifeq            386
				byte0 = 2;
	//   56  226:iconst_2        
	//   57  227:istore          9
			break;

	//*  58  229:goto            386
		case 1666676343: 
			if(s.equals("EditText"))
	//*  59  232:aload_2         
	//*  60  233:ldc1            #235 <String "EditText">
	//*  61  235:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  62  238:ifeq            386
				byte0 = 3;
	//   63  241:iconst_3        
	//   64  242:istore          9
			break;

	//*  65  244:goto            386
		case -339785223: 
			if(s.equals("Spinner"))
	//*  66  247:aload_2         
	//*  67  248:ldc1            #237 <String "Spinner">
	//*  68  250:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  69  253:ifeq            386
				byte0 = 4;
	//   70  256:iconst_4        
	//   71  257:istore          9
			break;

	//*  72  259:goto            386
		case -937446323: 
			if(s.equals("ImageButton"))
	//*  73  262:aload_2         
	//*  74  263:ldc1            #239 <String "ImageButton">
	//*  75  265:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  76  268:ifeq            386
				byte0 = 5;
	//   77  271:iconst_5        
	//   78  272:istore          9
			break;

	//*  79  274:goto            386
		case 1601505219: 
			if(s.equals("CheckBox"))
	//*  80  277:aload_2         
	//*  81  278:ldc1            #241 <String "CheckBox">
	//*  82  280:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  83  283:ifeq            386
				byte0 = 6;
	//   84  286:bipush          6
	//   85  288:istore          9
			break;

	//*  86  290:goto            386
		case 776382189: 
			if(s.equals("RadioButton"))
	//*  87  293:aload_2         
	//*  88  294:ldc1            #243 <String "RadioButton">
	//*  89  296:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  90  299:ifeq            386
				byte0 = 7;
	//   91  302:bipush          7
	//   92  304:istore          9
			break;

	//*  93  306:goto            386
		case -1455429095: 
			if(s.equals("CheckedTextView"))
	//*  94  309:aload_2         
	//*  95  310:ldc1            #245 <String "CheckedTextView">
	//*  96  312:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  97  315:ifeq            386
				byte0 = 8;
	//   98  318:bipush          8
	//   99  320:istore          9
			break;

	//* 100  322:goto            386
		case 1413872058: 
			if(s.equals("AutoCompleteTextView"))
	//* 101  325:aload_2         
	//* 102  326:ldc1            #247 <String "AutoCompleteTextView">
	//* 103  328:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 104  331:ifeq            386
				byte0 = 9;
	//  105  334:bipush          9
	//  106  336:istore          9
			break;

	//* 107  338:goto            386
		case -1346021293: 
			if(s.equals("MultiAutoCompleteTextView"))
	//* 108  341:aload_2         
	//* 109  342:ldc1            #249 <String "MultiAutoCompleteTextView">
	//* 110  344:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 111  347:ifeq            386
				byte0 = 10;
	//  112  350:bipush          10
	//  113  352:istore          9
			break;

	//* 114  354:goto            386
		case -1946472170: 
			if(s.equals("RatingBar"))
	//* 115  357:aload_2         
	//* 116  358:ldc1            #251 <String "RatingBar">
	//* 117  360:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 118  363:ifeq            386
				byte0 = 11;
	//  119  366:bipush          11
	//  120  368:istore          9
			break;

	//* 121  370:goto            386
		case -658531749: 
			if(s.equals("SeekBar"))
	//* 122  373:aload_2         
	//* 123  374:ldc1            #253 <String "SeekBar">
	//* 124  376:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 125  379:ifeq            386
				byte0 = 12;
	//  126  382:bipush          12
	//  127  384:istore          9
			break;
		}
		switch(byte0)
	//* 128  386:iload           9
		{
	//* 129  388:tableswitch     0 12: default 456
	//	               0 459
	//	               1 474
	//	               2 489
	//	               3 504
	//	               4 519
	//	               5 534
	//	               6 549
	//	               7 564
	//	               8 579
	//	               9 594
	//	               10 609
	//	               11 624
	//	               12 639
	//* 130  456:goto            651
		case 0: // '\0'
			view = ((View) (new AppCompatTextView(((Context) (obj)), attributeset)));
	//  131  459:new             #255 <Class AppCompatTextView>
	//  132  462:dup             
	//  133  463:aload           10
	//  134  465:aload           4
	//  135  467:invokespecial   #258 <Method void AppCompatTextView(Context, AttributeSet)>
	//  136  470:astore_1        
			break;

	//* 137  471:goto            651
		case 1: // '\001'
			view = ((View) (new AppCompatImageView(((Context) (obj)), attributeset)));
	//  138  474:new             #260 <Class AppCompatImageView>
	//  139  477:dup             
	//  140  478:aload           10
	//  141  480:aload           4
	//  142  482:invokespecial   #261 <Method void AppCompatImageView(Context, AttributeSet)>
	//  143  485:astore_1        
			break;

	//* 144  486:goto            651
		case 2: // '\002'
			view = ((View) (new AppCompatButton(((Context) (obj)), attributeset)));
	//  145  489:new             #263 <Class AppCompatButton>
	//  146  492:dup             
	//  147  493:aload           10
	//  148  495:aload           4
	//  149  497:invokespecial   #264 <Method void AppCompatButton(Context, AttributeSet)>
	//  150  500:astore_1        
			break;

	//* 151  501:goto            651
		case 3: // '\003'
			view = ((View) (new AppCompatEditText(((Context) (obj)), attributeset)));
	//  152  504:new             #266 <Class AppCompatEditText>
	//  153  507:dup             
	//  154  508:aload           10
	//  155  510:aload           4
	//  156  512:invokespecial   #267 <Method void AppCompatEditText(Context, AttributeSet)>
	//  157  515:astore_1        
			break;

	//* 158  516:goto            651
		case 4: // '\004'
			view = ((View) (new AppCompatSpinner(((Context) (obj)), attributeset)));
	//  159  519:new             #269 <Class AppCompatSpinner>
	//  160  522:dup             
	//  161  523:aload           10
	//  162  525:aload           4
	//  163  527:invokespecial   #270 <Method void AppCompatSpinner(Context, AttributeSet)>
	//  164  530:astore_1        
			break;

	//* 165  531:goto            651
		case 5: // '\005'
			view = ((View) (new AppCompatImageButton(((Context) (obj)), attributeset)));
	//  166  534:new             #272 <Class AppCompatImageButton>
	//  167  537:dup             
	//  168  538:aload           10
	//  169  540:aload           4
	//  170  542:invokespecial   #273 <Method void AppCompatImageButton(Context, AttributeSet)>
	//  171  545:astore_1        
			break;

	//* 172  546:goto            651
		case 6: // '\006'
			view = ((View) (new AppCompatCheckBox(((Context) (obj)), attributeset)));
	//  173  549:new             #275 <Class AppCompatCheckBox>
	//  174  552:dup             
	//  175  553:aload           10
	//  176  555:aload           4
	//  177  557:invokespecial   #276 <Method void AppCompatCheckBox(Context, AttributeSet)>
	//  178  560:astore_1        
			break;

	//* 179  561:goto            651
		case 7: // '\007'
			view = ((View) (new AppCompatRadioButton(((Context) (obj)), attributeset)));
	//  180  564:new             #278 <Class AppCompatRadioButton>
	//  181  567:dup             
	//  182  568:aload           10
	//  183  570:aload           4
	//  184  572:invokespecial   #279 <Method void AppCompatRadioButton(Context, AttributeSet)>
	//  185  575:astore_1        
			break;

	//* 186  576:goto            651
		case 8: // '\b'
			view = ((View) (new AppCompatCheckedTextView(((Context) (obj)), attributeset)));
	//  187  579:new             #281 <Class AppCompatCheckedTextView>
	//  188  582:dup             
	//  189  583:aload           10
	//  190  585:aload           4
	//  191  587:invokespecial   #282 <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//  192  590:astore_1        
			break;

	//* 193  591:goto            651
		case 9: // '\t'
			view = ((View) (new AppCompatAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  194  594:new             #284 <Class AppCompatAutoCompleteTextView>
	//  195  597:dup             
	//  196  598:aload           10
	//  197  600:aload           4
	//  198  602:invokespecial   #285 <Method void AppCompatAutoCompleteTextView(Context, AttributeSet)>
	//  199  605:astore_1        
			break;

	//* 200  606:goto            651
		case 10: // '\n'
			view = ((View) (new AppCompatMultiAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  201  609:new             #287 <Class AppCompatMultiAutoCompleteTextView>
	//  202  612:dup             
	//  203  613:aload           10
	//  204  615:aload           4
	//  205  617:invokespecial   #288 <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet)>
	//  206  620:astore_1        
			break;

	//* 207  621:goto            651
		case 11: // '\013'
			view = ((View) (new AppCompatRatingBar(((Context) (obj)), attributeset)));
	//  208  624:new             #290 <Class AppCompatRatingBar>
	//  209  627:dup             
	//  210  628:aload           10
	//  211  630:aload           4
	//  212  632:invokespecial   #291 <Method void AppCompatRatingBar(Context, AttributeSet)>
	//  213  635:astore_1        
			break;

	//* 214  636:goto            651
		case 12: // '\f'
			view = ((View) (new AppCompatSeekBar(((Context) (obj)), attributeset)));
	//  215  639:new             #293 <Class AppCompatSeekBar>
	//  216  642:dup             
	//  217  643:aload           10
	//  218  645:aload           4
	//  219  647:invokespecial   #294 <Method void AppCompatSeekBar(Context, AttributeSet)>
	//  220  650:astore_1        
			break;
		}
		View view1 = view;
	//  221  651:aload_1         
	//  222  652:astore          11
		if(view == null)
	//* 223  654:aload_1         
	//* 224  655:ifnonnull       678
		{
			view1 = view;
	//  225  658:aload_1         
	//  226  659:astore          11
			if(context != obj)
	//* 227  661:aload_3         
	//* 228  662:aload           10
	//* 229  664:if_acmpeq       678
				view1 = createViewFromTag(((Context) (obj)), s, attributeset);
	//  230  667:aload_0         
	//  231  668:aload           10
	//  232  670:aload_2         
	//  233  671:aload           4
	//  234  673:invokespecial   #296 <Method View createViewFromTag(Context, String, AttributeSet)>
	//  235  676:astore          11
		}
		if(view1 != null)
	//* 236  678:aload           11
	//* 237  680:ifnull          691
			checkOnClickListener(view1, attributeset);
	//  238  683:aload_0         
	//  239  684:aload           11
	//  240  686:aload           4
	//  241  688:invokespecial   #298 <Method void checkOnClickListener(View, AttributeSet)>
		return view1;
	//  242  691:aload           11
	//  243  693:areturn         
	}

	private static final String LOG_TAG = "AppCompatViewInflater";
	private static final String sClassPrefixList[] = {
		"android.widget.", "android.view.", "android.webkit."
	};
	private static final Map sConstructorMap = new ArrayMap();
	private static final Class sConstructorSignature[] = {
		android/content/Context, android/util/AttributeSet
	};
	private static final int sOnClickAttrs[] = {
		0x101026f
	};
	private final Object mConstructorArgs[] = new Object[2];

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       Class[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #29  <Class Context>
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #31  <Class AttributeSet>
	//    9   13:aastore         
	//   10   14:putstatic       #33  <Field Class[] sConstructorSignature>
	//   11   17:iconst_1        
	//   12   18:newarray        int[]
	//   13   20:dup             
	//   14   21:iconst_0        
	//   15   22:ldc1            #34  <Int 0x101026f>
	//   16   24:iastore         
	//   17   25:putstatic       #36  <Field int[] sOnClickAttrs>
	//   18   28:iconst_3        
	//   19   29:anewarray       String[]
	//   20   32:dup             
	//   21   33:iconst_0        
	//   22   34:ldc1            #40  <String "android.widget.">
	//   23   36:aastore         
	//   24   37:dup             
	//   25   38:iconst_1        
	//   26   39:ldc1            #42  <String "android.view.">
	//   27   41:aastore         
	//   28   42:dup             
	//   29   43:iconst_2        
	//   30   44:ldc1            #44  <String "android.webkit.">
	//   31   46:aastore         
	//   32   47:putstatic       #46  <Field String[] sClassPrefixList>
	//   33   50:new             #48  <Class ArrayMap>
	//   34   53:dup             
	//   35   54:invokespecial   #51  <Method void ArrayMap()>
	//   36   57:putstatic       #53  <Field Map sConstructorMap>
	//*  37   60:return          
	}
}
