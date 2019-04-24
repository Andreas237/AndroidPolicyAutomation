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
	private static class DeclaredOnClickListener
		implements android.view.View.OnClickListener
	{

		private void resolveMethod(Context context, String s)
		{
_L2:
			if(context == null)
				break; /* Loop/switch isn't completed */
		//    0    0:aload_1         
		//    1    1:ifnull          71
			if(context.isRestricted())
				break MISSING_BLOCK_LABEL_48;
		//    2    4:aload_1         
		//    3    5:invokevirtual   #40  <Method boolean Context.isRestricted()>
		//    4    8:ifne            48
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
		//*  18   33:ifnull          48
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
				// Misplaced declaration of an exception variable
				catch(String s) { }
		//   26   47:astore_2        
			if(context instanceof ContextWrapper)
		//*  27   48:aload_1         
		//*  28   49:instanceof      #58  <Class ContextWrapper>
		//*  29   52:ifeq            66
				context = ((ContextWrapper)context).getBaseContext();
		//   30   55:aload_1         
		//   31   56:checkcast       #58  <Class ContextWrapper>
		//   32   59:invokevirtual   #62  <Method Context ContextWrapper.getBaseContext()>
		//   33   62:astore_1        
			else
		//*  34   63:goto            0
				context = null;
		//   35   66:aconst_null     
		//   36   67:astore_1        
			if(true) goto _L2; else goto _L1
		//   37   68:goto            0
_L1:
			int i = mHostView.getId();
		//   38   71:aload_0         
		//   39   72:getfield        #25  <Field View mHostView>
		//   40   75:invokevirtual   #66  <Method int View.getId()>
		//   41   78:istore_3        
			if(i == -1)
		//*  42   79:iload_3         
		//*  43   80:iconst_m1       
		//*  44   81:icmpne          141
				context = "";
		//   45   84:ldc1            #68  <String "">
		//   46   86:astore_1        
			else
		//*  47   87:new             #70  <Class IllegalStateException>
		//*  48   90:dup             
		//*  49   91:new             #72  <Class StringBuilder>
		//*  50   94:dup             
		//*  51   95:invokespecial   #73  <Method void StringBuilder()>
		//*  52   98:ldc1            #75  <String "Could not find method ">
		//*  53  100:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//*  54  103:aload_0         
		//*  55  104:getfield        #27  <Field String mMethodName>
		//*  56  107:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//*  57  110:ldc1            #81  <String "(View) in a parent or ancestor Context for android:onClick ">
		//*  58  112:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//*  59  115:ldc1            #83  <String "attribute defined on view ">
		//*  60  117:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//*  61  120:aload_0         
		//*  62  121:getfield        #25  <Field View mHostView>
		//*  63  124:invokevirtual   #44  <Method Class Object.getClass()>
		//*  64  127:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
		//*  65  130:aload_1         
		//*  66  131:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//*  67  134:invokevirtual   #90  <Method String StringBuilder.toString()>
		//*  68  137:invokespecial   #93  <Method void IllegalStateException(String)>
		//*  69  140:athrow          
				context = ((Context) ((new StringBuilder()).append(" with id '").append(mHostView.getContext().getResources().getResourceEntryName(i)).append("'").toString()));
		//   70  141:new             #72  <Class StringBuilder>
		//   71  144:dup             
		//   72  145:invokespecial   #73  <Method void StringBuilder()>
		//   73  148:ldc1            #95  <String " with id '">
		//   74  150:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   75  153:aload_0         
		//   76  154:getfield        #25  <Field View mHostView>
		//   77  157:invokevirtual   #98  <Method Context View.getContext()>
		//   78  160:invokevirtual   #102 <Method Resources Context.getResources()>
		//   79  163:iload_3         
		//   80  164:invokevirtual   #108 <Method String Resources.getResourceEntryName(int)>
		//   81  167:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   82  170:ldc1            #110 <String "'">
		//   83  172:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
		//   84  175:invokevirtual   #90  <Method String StringBuilder.toString()>
		//   85  178:astore_1        
			throw new IllegalStateException((new StringBuilder()).append("Could not find method ").append(mMethodName).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ").append(((Object) (((Object) (mHostView)).getClass()))).append(((String) (context))).toString());
		//*  86  179:goto            87
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
		//    6   12:invokevirtual   #98  <Method Context View.getContext()>
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
		//   24   44:new             #70  <Class IllegalStateException>
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
		//   31   56:new             #70  <Class IllegalStateException>
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
	//    8   20:ifnonnull       83
_L1:
		try
		{
			obj = ((Object) (context.getClassLoader()));
	//    9   23:aload_1         
	//   10   24:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//   11   27:astore          4
		}
	//*  12   29:aload_3         
	//*  13   30:ifnull          104
	//*  14   33:new             #121 <Class StringBuilder>
	//*  15   36:dup             
	//*  16   37:invokespecial   #122 <Method void StringBuilder()>
	//*  17   40:aload_3         
	//*  18   41:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  19   44:aload_2         
	//*  20   45:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  21   48:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  22   51:astore_1        
	//*  23   52:aload           4
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #136 <Method Class ClassLoader.loadClass(String)>
	//*  26   58:ldc1            #61  <Class View>
	//*  27   60:invokevirtual   #140 <Method Class Class.asSubclass(Class)>
	//*  28   63:getstatic       #33  <Field Class[] sConstructorSignature>
	//*  29   66:invokevirtual   #144 <Method Constructor Class.getConstructor(Class[])>
	//*  30   69:astore          4
	//*  31   71:getstatic       #53  <Field Map sConstructorMap>
	//*  32   74:aload_2         
	//*  33   75:aload           4
	//*  34   77:invokeinterface #148 <Method Object Map.put(Object, Object)>
	//*  35   82:pop             
	//*  36   83:aload           4
	//*  37   85:iconst_1        
	//*  38   86:invokevirtual   #152 <Method void Constructor.setAccessible(boolean)>
	//*  39   89:aload           4
	//*  40   91:aload_0         
	//*  41   92:getfield        #57  <Field Object[] mConstructorArgs>
	//*  42   95:invokevirtual   #156 <Method Object Constructor.newInstance(Object[])>
	//*  43   98:checkcast       #61  <Class View>
	//*  44  101:astore_1        
	//*  45  102:aload_1         
	//*  46  103:areturn         
	//*  47  104:aload_2         
	//*  48  105:astore_1        
	//*  49  106:goto            52
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50  109:astore_1        
		{
			return null;
	//   51  110:aconst_null     
	//   52  111:areturn         
		}
		if(s1 == null)
			break MISSING_BLOCK_LABEL_104;
		context = ((Context) ((new StringBuilder()).append(s1).append(s).toString()));
_L3:
		obj = ((Object) (((ClassLoader) (obj)).loadClass(((String) (context))).asSubclass(android/view/View).getConstructor(sConstructorSignature)));
		sConstructorMap.put(((Object) (s)), obj);
_L2:
		((Constructor) (obj)).setAccessible(true);
		context = ((Context) ((View)((Constructor) (obj)).newInstance(mConstructorArgs)));
		return ((View) (context));
		context = ((Context) (s));
		  goto _L3
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
		byte byte0;
		Object obj;
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
		obj = ((Object) (view));
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
		byte0 = -1;
	//   32   62:iconst_m1       
	//   33   63:istore          9
		s.hashCode();
	//   34   65:aload_2         
	//   35   66:invokevirtual   #227 <Method int String.hashCode()>
		JVM INSTR lookupswitch 13: default 184
	//	               -1946472170: 465
	//	               -1455429095: 417
	//	               -1346021293: 449
	//	               -938935918: 295
	//	               -937446323: 370
	//	               -658531749: 481
	//	               -339785223: 355
	//	               776382189: 401
	//	               1125864064: 310
	//	               1413872058: 433
	//	               1601505219: 385
	//	               1666676343: 340
	//	               2001146706: 325;
	//   36   69:lookupswitch    13: default 184
	//	               -1946472170: 465
	//	               -1455429095: 417
	//	               -1346021293: 449
	//	               -938935918: 295
	//	               -937446323: 370
	//	               -658531749: 481
	//	               -339785223: 355
	//	               776382189: 401
	//	               1125864064: 310
	//	               1413872058: 433
	//	               1601505219: 385
	//	               1666676343: 340
	//	               2001146706: 325
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
		byte0;
	//   37  184:iload           9
		JVM INSTR tableswitch 0 12: default 252
	//	               0 498
	//	               1 513
	//	               2 528
	//	               3 543
	//	               4 558
	//	               5 573
	//	               6 588
	//	               7 603
	//	               8 618
	//	               9 633
	//	               10 648
	//	               11 663
	//	               12 678;
	//   38  186:tableswitch     0 12: default 252
	//	               0 498
	//	               1 513
	//	               2 528
	//	               3 543
	//	               4 558
	//	               5 573
	//	               6 588
	//	               7 603
	//	               8 618
	//	               9 633
	//	               10 648
	//	               11 663
	//	               12 678
		   goto _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L15:
		View view1 = view;
	//   39  252:aload_1         
	//   40  253:astore          11
		if(view == null)
	//*  41  255:aload_1         
	//*  42  256:ifnonnull       279
		{
			view1 = view;
	//   43  259:aload_1         
	//   44  260:astore          11
			if(context != obj)
	//*  45  262:aload_3         
	//*  46  263:aload           10
	//*  47  265:if_acmpeq       279
				view1 = createViewFromTag(((Context) (obj)), s, attributeset);
	//   48  268:aload_0         
	//   49  269:aload           10
	//   50  271:aload_2         
	//   51  272:aload           4
	//   52  274:invokespecial   #229 <Method View createViewFromTag(Context, String, AttributeSet)>
	//   53  277:astore          11
		}
		if(view1 != null)
	//*  54  279:aload           11
	//*  55  281:ifnull          292
			checkOnClickListener(view1, attributeset);
	//   56  284:aload_0         
	//   57  285:aload           11
	//   58  287:aload           4
	//   59  289:invokespecial   #231 <Method void checkOnClickListener(View, AttributeSet)>
		return view1;
	//   60  292:aload           11
	//   61  294:areturn         
_L5:
		if(s.equals("TextView"))
	//*  62  295:aload_2         
	//*  63  296:ldc1            #233 <String "TextView">
	//*  64  298:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  65  301:ifeq            184
			byte0 = 0;
	//   66  304:iconst_0        
	//   67  305:istore          9
		  goto _L1
	//*  68  307:goto            184
_L10:
		if(s.equals("ImageView"))
	//*  69  310:aload_2         
	//*  70  311:ldc1            #235 <String "ImageView">
	//*  71  313:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  72  316:ifeq            184
			byte0 = 1;
	//   73  319:iconst_1        
	//   74  320:istore          9
		  goto _L1
	//*  75  322:goto            184
_L14:
		if(s.equals("Button"))
	//*  76  325:aload_2         
	//*  77  326:ldc1            #237 <String "Button">
	//*  78  328:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  79  331:ifeq            184
			byte0 = 2;
	//   80  334:iconst_2        
	//   81  335:istore          9
		  goto _L1
	//*  82  337:goto            184
_L13:
		if(s.equals("EditText"))
	//*  83  340:aload_2         
	//*  84  341:ldc1            #239 <String "EditText">
	//*  85  343:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  86  346:ifeq            184
			byte0 = 3;
	//   87  349:iconst_3        
	//   88  350:istore          9
		  goto _L1
	//*  89  352:goto            184
_L8:
		if(s.equals("Spinner"))
	//*  90  355:aload_2         
	//*  91  356:ldc1            #241 <String "Spinner">
	//*  92  358:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  93  361:ifeq            184
			byte0 = 4;
	//   94  364:iconst_4        
	//   95  365:istore          9
		  goto _L1
	//*  96  367:goto            184
_L6:
		if(s.equals("ImageButton"))
	//*  97  370:aload_2         
	//*  98  371:ldc1            #243 <String "ImageButton">
	//*  99  373:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 100  376:ifeq            184
			byte0 = 5;
	//  101  379:iconst_5        
	//  102  380:istore          9
		  goto _L1
	//* 103  382:goto            184
_L12:
		if(s.equals("CheckBox"))
	//* 104  385:aload_2         
	//* 105  386:ldc1            #245 <String "CheckBox">
	//* 106  388:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 107  391:ifeq            184
			byte0 = 6;
	//  108  394:bipush          6
	//  109  396:istore          9
		  goto _L1
	//* 110  398:goto            184
_L9:
		if(s.equals("RadioButton"))
	//* 111  401:aload_2         
	//* 112  402:ldc1            #247 <String "RadioButton">
	//* 113  404:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 114  407:ifeq            184
			byte0 = 7;
	//  115  410:bipush          7
	//  116  412:istore          9
		  goto _L1
	//* 117  414:goto            184
_L3:
		if(s.equals("CheckedTextView"))
	//* 118  417:aload_2         
	//* 119  418:ldc1            #249 <String "CheckedTextView">
	//* 120  420:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 121  423:ifeq            184
			byte0 = 8;
	//  122  426:bipush          8
	//  123  428:istore          9
		  goto _L1
	//* 124  430:goto            184
_L11:
		if(s.equals("AutoCompleteTextView"))
	//* 125  433:aload_2         
	//* 126  434:ldc1            #251 <String "AutoCompleteTextView">
	//* 127  436:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 128  439:ifeq            184
			byte0 = 9;
	//  129  442:bipush          9
	//  130  444:istore          9
		  goto _L1
	//* 131  446:goto            184
_L4:
		if(s.equals("MultiAutoCompleteTextView"))
	//* 132  449:aload_2         
	//* 133  450:ldc1            #253 <String "MultiAutoCompleteTextView">
	//* 134  452:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 135  455:ifeq            184
			byte0 = 10;
	//  136  458:bipush          10
	//  137  460:istore          9
		  goto _L1
	//* 138  462:goto            184
_L2:
		if(s.equals("RatingBar"))
	//* 139  465:aload_2         
	//* 140  466:ldc1            #255 <String "RatingBar">
	//* 141  468:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 142  471:ifeq            184
			byte0 = 11;
	//  143  474:bipush          11
	//  144  476:istore          9
		  goto _L1
	//* 145  478:goto            184
_L7:
		if(s.equals("SeekBar"))
	//* 146  481:aload_2         
	//* 147  482:ldc2            #257 <String "SeekBar">
	//* 148  485:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 149  488:ifeq            184
			byte0 = 12;
	//  150  491:bipush          12
	//  151  493:istore          9
		  goto _L1
	//* 152  495:goto            184
_L16:
		view = ((View) (new AppCompatTextView(((Context) (obj)), attributeset)));
	//  153  498:new             #259 <Class AppCompatTextView>
	//  154  501:dup             
	//  155  502:aload           10
	//  156  504:aload           4
	//  157  506:invokespecial   #262 <Method void AppCompatTextView(Context, AttributeSet)>
	//  158  509:astore_1        
		  goto _L15
	//* 159  510:goto            252
_L17:
		view = ((View) (new AppCompatImageView(((Context) (obj)), attributeset)));
	//  160  513:new             #264 <Class AppCompatImageView>
	//  161  516:dup             
	//  162  517:aload           10
	//  163  519:aload           4
	//  164  521:invokespecial   #265 <Method void AppCompatImageView(Context, AttributeSet)>
	//  165  524:astore_1        
		  goto _L15
	//* 166  525:goto            252
_L18:
		view = ((View) (new AppCompatButton(((Context) (obj)), attributeset)));
	//  167  528:new             #267 <Class AppCompatButton>
	//  168  531:dup             
	//  169  532:aload           10
	//  170  534:aload           4
	//  171  536:invokespecial   #268 <Method void AppCompatButton(Context, AttributeSet)>
	//  172  539:astore_1        
		  goto _L15
	//* 173  540:goto            252
_L19:
		view = ((View) (new AppCompatEditText(((Context) (obj)), attributeset)));
	//  174  543:new             #270 <Class AppCompatEditText>
	//  175  546:dup             
	//  176  547:aload           10
	//  177  549:aload           4
	//  178  551:invokespecial   #271 <Method void AppCompatEditText(Context, AttributeSet)>
	//  179  554:astore_1        
		  goto _L15
	//* 180  555:goto            252
_L20:
		view = ((View) (new AppCompatSpinner(((Context) (obj)), attributeset)));
	//  181  558:new             #273 <Class AppCompatSpinner>
	//  182  561:dup             
	//  183  562:aload           10
	//  184  564:aload           4
	//  185  566:invokespecial   #274 <Method void AppCompatSpinner(Context, AttributeSet)>
	//  186  569:astore_1        
		  goto _L15
	//* 187  570:goto            252
_L21:
		view = ((View) (new AppCompatImageButton(((Context) (obj)), attributeset)));
	//  188  573:new             #276 <Class AppCompatImageButton>
	//  189  576:dup             
	//  190  577:aload           10
	//  191  579:aload           4
	//  192  581:invokespecial   #277 <Method void AppCompatImageButton(Context, AttributeSet)>
	//  193  584:astore_1        
		  goto _L15
	//* 194  585:goto            252
_L22:
		view = ((View) (new AppCompatCheckBox(((Context) (obj)), attributeset)));
	//  195  588:new             #279 <Class AppCompatCheckBox>
	//  196  591:dup             
	//  197  592:aload           10
	//  198  594:aload           4
	//  199  596:invokespecial   #280 <Method void AppCompatCheckBox(Context, AttributeSet)>
	//  200  599:astore_1        
		  goto _L15
	//* 201  600:goto            252
_L23:
		view = ((View) (new AppCompatRadioButton(((Context) (obj)), attributeset)));
	//  202  603:new             #282 <Class AppCompatRadioButton>
	//  203  606:dup             
	//  204  607:aload           10
	//  205  609:aload           4
	//  206  611:invokespecial   #283 <Method void AppCompatRadioButton(Context, AttributeSet)>
	//  207  614:astore_1        
		  goto _L15
	//* 208  615:goto            252
_L24:
		view = ((View) (new AppCompatCheckedTextView(((Context) (obj)), attributeset)));
	//  209  618:new             #285 <Class AppCompatCheckedTextView>
	//  210  621:dup             
	//  211  622:aload           10
	//  212  624:aload           4
	//  213  626:invokespecial   #286 <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//  214  629:astore_1        
		  goto _L15
	//* 215  630:goto            252
_L25:
		view = ((View) (new AppCompatAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  216  633:new             #288 <Class AppCompatAutoCompleteTextView>
	//  217  636:dup             
	//  218  637:aload           10
	//  219  639:aload           4
	//  220  641:invokespecial   #289 <Method void AppCompatAutoCompleteTextView(Context, AttributeSet)>
	//  221  644:astore_1        
		  goto _L15
	//* 222  645:goto            252
_L26:
		view = ((View) (new AppCompatMultiAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  223  648:new             #291 <Class AppCompatMultiAutoCompleteTextView>
	//  224  651:dup             
	//  225  652:aload           10
	//  226  654:aload           4
	//  227  656:invokespecial   #292 <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet)>
	//  228  659:astore_1        
		  goto _L15
	//* 229  660:goto            252
_L27:
		view = ((View) (new AppCompatRatingBar(((Context) (obj)), attributeset)));
	//  230  663:new             #294 <Class AppCompatRatingBar>
	//  231  666:dup             
	//  232  667:aload           10
	//  233  669:aload           4
	//  234  671:invokespecial   #295 <Method void AppCompatRatingBar(Context, AttributeSet)>
	//  235  674:astore_1        
		  goto _L15
	//* 236  675:goto            252
_L28:
		view = ((View) (new AppCompatSeekBar(((Context) (obj)), attributeset)));
	//  237  678:new             #297 <Class AppCompatSeekBar>
	//  238  681:dup             
	//  239  682:aload           10
	//  240  684:aload           4
	//  241  686:invokespecial   #298 <Method void AppCompatSeekBar(Context, AttributeSet)>
	//  242  689:astore_1        
		  goto _L15
	//* 243  690:goto            252
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
