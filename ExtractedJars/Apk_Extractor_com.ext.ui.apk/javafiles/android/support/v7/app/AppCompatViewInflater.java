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
			int i;
			int j;
			if(flag)
	//*   7   11:iload_2         
	//*   8   12:ifeq            118
				i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_android_theme, 0);
	//    9   15:aload_1         
	//   10   16:getstatic       #190 <Field int android.support.v7.appcompat.R$styleable.View_android_theme>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//   13   23:istore          4
			else
	//*  14   25:iload           4
	//*  15   27:istore          5
	//*  16   29:iload_3         
	//*  17   30:ifeq            73
	//*  18   33:iload           4
	//*  19   35:istore          5
	//*  20   37:iload           4
	//*  21   39:ifne            73
	//*  22   42:aload_1         
	//*  23   43:getstatic       #197 <Field int android.support.v7.appcompat.R$styleable.View_theme>
	//*  24   46:iconst_0        
	//*  25   47:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//*  26   50:istore          4
	//*  27   52:iload           4
	//*  28   54:istore          5
	//*  29   56:iload           4
	//*  30   58:ifeq            73
	//*  31   61:ldc1            #11  <String "AppCompatViewInflater">
	//*  32   63:ldc1            #199 <String "app:theme is now deprecated. Please move to using android:theme instead.">
	//*  33   65:invokestatic    #205 <Method int Log.i(String, String)>
	//*  34   68:pop             
	//*  35   69:iload           4
	//*  36   71:istore          5
	//*  37   73:aload_1         
	//*  38   74:invokevirtual   #99  <Method void TypedArray.recycle()>
	//*  39   77:aload_0         
	//*  40   78:astore_1        
	//*  41   79:iload           5
	//*  42   81:ifeq            116
	//*  43   84:aload_0         
	//*  44   85:instanceof      #207 <Class ContextThemeWrapper>
	//*  45   88:ifeq            105
	//*  46   91:aload_0         
	//*  47   92:astore_1        
	//*  48   93:aload_0         
	//*  49   94:checkcast       #207 <Class ContextThemeWrapper>
	//*  50   97:invokevirtual   #211 <Method int ContextThemeWrapper.getThemeResId()>
	//*  51  100:iload           5
	//*  52  102:icmpeq          116
	//*  53  105:new             #207 <Class ContextThemeWrapper>
	//*  54  108:dup             
	//*  55  109:aload_0         
	//*  56  110:iload           5
	//*  57  112:invokespecial   #214 <Method void ContextThemeWrapper(Context, int)>
	//*  58  115:astore_1        
	//*  59  116:aload_1         
	//*  60  117:areturn         
				i = 0;
	//   61  118:iconst_0        
	//   62  119:istore          4
			j = i;
			if(flag1)
			{
				j = i;
				if(i == 0)
				{
					i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_theme, 0);
					j = i;
					if(i != 0)
					{
						Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
						j = i;
					}
				}
			}
			((TypedArray) (attributeset)).recycle();
			attributeset = ((AttributeSet) (context));
			if(j == 0)
				break label0;
			if(context instanceof ContextThemeWrapper)
			{
				attributeset = ((AttributeSet) (context));
				if(((ContextThemeWrapper)context).getThemeResId() == j)
					break label0;
			}
			attributeset = ((AttributeSet) (new ContextThemeWrapper(context, j)));
		}
		return ((Context) (attributeset));
	//*  63  121:goto            25
	}

	public final View createView(View view, String s, Context context, AttributeSet attributeset, boolean flag, boolean flag1, boolean flag2, 
			boolean flag3)
	{
label0:
		{
			byte byte0;
			Object obj;
			if(flag && view != null)
	//*   0    0:iload           5
	//*   1    2:ifeq            678
	//*   2    5:aload_1         
	//*   3    6:ifnull          678
				obj = ((Object) (view.getContext()));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #65  <Method Context View.getContext()>
	//    6   13:astore          10
			else
	//*   7   15:iload           6
	//*   8   17:ifne            28
	//*   9   20:aload           10
	//*  10   22:astore_1        
	//*  11   23:iload           7
	//*  12   25:ifeq            40
	//*  13   28:aload           10
	//*  14   30:aload           4
	//*  15   32:iload           6
	//*  16   34:iload           7
	//*  17   36:invokestatic    #218 <Method Context themifyContext(Context, AttributeSet, boolean, boolean)>
	//*  18   39:astore_1        
	//*  19   40:aload_1         
	//*  20   41:astore          10
	//*  21   43:iload           8
	//*  22   45:ifeq            54
	//*  23   48:aload_1         
	//*  24   49:invokestatic    #224 <Method Context TintContextWrapper.wrap(Context)>
	//*  25   52:astore          10
	//*  26   54:aconst_null     
	//*  27   55:astore_1        
	//*  28   56:iconst_m1       
	//*  29   57:istore          9
	//*  30   59:aload_2         
	//*  31   60:invokevirtual   #227 <Method int String.hashCode()>
	//*  32   63:lookupswitch    13: default 176
	//	               -1946472170: 447
	//	               -1455429095: 399
	//	               -1346021293: 431
	//	               -938935918: 277
	//	               -937446323: 352
	//	               -658531749: 463
	//	               -339785223: 337
	//	               776382189: 383
	//	               1125864064: 292
	//	               1413872058: 415
	//	               1601505219: 367
	//	               1666676343: 322
	//	               2001146706: 307
	//*  33  176:iload           9
	//*  34  178:tableswitch     0 12: default 244
	//	               0 480
	//	               1 495
	//	               2 510
	//	               3 525
	//	               4 540
	//	               5 555
	//	               6 570
	//	               7 585
	//	               8 600
	//	               9 615
	//	               10 630
	//	               11 645
	//	               12 660
	//*  35  244:aload_1         
	//*  36  245:ifnonnull       675
	//*  37  248:aload_3         
	//*  38  249:aload           10
	//*  39  251:if_acmpeq       675
	//*  40  254:aload_0         
	//*  41  255:aload           10
	//*  42  257:aload_2         
	//*  43  258:aload           4
	//*  44  260:invokespecial   #229 <Method View createViewFromTag(Context, String, AttributeSet)>
	//*  45  263:astore_1        
	//*  46  264:aload_1         
	//*  47  265:ifnull          275
	//*  48  268:aload_0         
	//*  49  269:aload_1         
	//*  50  270:aload           4
	//*  51  272:invokespecial   #231 <Method void checkOnClickListener(View, AttributeSet)>
	//*  52  275:aload_1         
	//*  53  276:areturn         
	//*  54  277:aload_2         
	//*  55  278:ldc1            #233 <String "TextView">
	//*  56  280:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  57  283:ifeq            176
	//*  58  286:iconst_0        
	//*  59  287:istore          9
	//*  60  289:goto            176
	//*  61  292:aload_2         
	//*  62  293:ldc1            #235 <String "ImageView">
	//*  63  295:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  64  298:ifeq            176
	//*  65  301:iconst_1        
	//*  66  302:istore          9
	//*  67  304:goto            176
	//*  68  307:aload_2         
	//*  69  308:ldc1            #237 <String "Button">
	//*  70  310:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  71  313:ifeq            176
	//*  72  316:iconst_2        
	//*  73  317:istore          9
	//*  74  319:goto            176
	//*  75  322:aload_2         
	//*  76  323:ldc1            #239 <String "EditText">
	//*  77  325:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  78  328:ifeq            176
	//*  79  331:iconst_3        
	//*  80  332:istore          9
	//*  81  334:goto            176
	//*  82  337:aload_2         
	//*  83  338:ldc1            #241 <String "Spinner">
	//*  84  340:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  85  343:ifeq            176
	//*  86  346:iconst_4        
	//*  87  347:istore          9
	//*  88  349:goto            176
	//*  89  352:aload_2         
	//*  90  353:ldc1            #243 <String "ImageButton">
	//*  91  355:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  92  358:ifeq            176
	//*  93  361:iconst_5        
	//*  94  362:istore          9
	//*  95  364:goto            176
	//*  96  367:aload_2         
	//*  97  368:ldc1            #245 <String "CheckBox">
	//*  98  370:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  99  373:ifeq            176
	//* 100  376:bipush          6
	//* 101  378:istore          9
	//* 102  380:goto            176
	//* 103  383:aload_2         
	//* 104  384:ldc1            #247 <String "RadioButton">
	//* 105  386:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 106  389:ifeq            176
	//* 107  392:bipush          7
	//* 108  394:istore          9
	//* 109  396:goto            176
	//* 110  399:aload_2         
	//* 111  400:ldc1            #249 <String "CheckedTextView">
	//* 112  402:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 113  405:ifeq            176
	//* 114  408:bipush          8
	//* 115  410:istore          9
	//* 116  412:goto            176
	//* 117  415:aload_2         
	//* 118  416:ldc1            #251 <String "AutoCompleteTextView">
	//* 119  418:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 120  421:ifeq            176
	//* 121  424:bipush          9
	//* 122  426:istore          9
	//* 123  428:goto            176
	//* 124  431:aload_2         
	//* 125  432:ldc1            #253 <String "MultiAutoCompleteTextView">
	//* 126  434:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 127  437:ifeq            176
	//* 128  440:bipush          10
	//* 129  442:istore          9
	//* 130  444:goto            176
	//* 131  447:aload_2         
	//* 132  448:ldc1            #255 <String "RatingBar">
	//* 133  450:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 134  453:ifeq            176
	//* 135  456:bipush          11
	//* 136  458:istore          9
	//* 137  460:goto            176
	//* 138  463:aload_2         
	//* 139  464:ldc2            #257 <String "SeekBar">
	//* 140  467:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 141  470:ifeq            176
	//* 142  473:bipush          12
	//* 143  475:istore          9
	//* 144  477:goto            176
	//* 145  480:new             #259 <Class AppCompatTextView>
	//* 146  483:dup             
	//* 147  484:aload           10
	//* 148  486:aload           4
	//* 149  488:invokespecial   #262 <Method void AppCompatTextView(Context, AttributeSet)>
	//* 150  491:astore_1        
	//* 151  492:goto            244
	//* 152  495:new             #264 <Class AppCompatImageView>
	//* 153  498:dup             
	//* 154  499:aload           10
	//* 155  501:aload           4
	//* 156  503:invokespecial   #265 <Method void AppCompatImageView(Context, AttributeSet)>
	//* 157  506:astore_1        
	//* 158  507:goto            244
	//* 159  510:new             #267 <Class AppCompatButton>
	//* 160  513:dup             
	//* 161  514:aload           10
	//* 162  516:aload           4
	//* 163  518:invokespecial   #268 <Method void AppCompatButton(Context, AttributeSet)>
	//* 164  521:astore_1        
	//* 165  522:goto            244
	//* 166  525:new             #270 <Class AppCompatEditText>
	//* 167  528:dup             
	//* 168  529:aload           10
	//* 169  531:aload           4
	//* 170  533:invokespecial   #271 <Method void AppCompatEditText(Context, AttributeSet)>
	//* 171  536:astore_1        
	//* 172  537:goto            244
	//* 173  540:new             #273 <Class AppCompatSpinner>
	//* 174  543:dup             
	//* 175  544:aload           10
	//* 176  546:aload           4
	//* 177  548:invokespecial   #274 <Method void AppCompatSpinner(Context, AttributeSet)>
	//* 178  551:astore_1        
	//* 179  552:goto            244
	//* 180  555:new             #276 <Class AppCompatImageButton>
	//* 181  558:dup             
	//* 182  559:aload           10
	//* 183  561:aload           4
	//* 184  563:invokespecial   #277 <Method void AppCompatImageButton(Context, AttributeSet)>
	//* 185  566:astore_1        
	//* 186  567:goto            244
	//* 187  570:new             #279 <Class AppCompatCheckBox>
	//* 188  573:dup             
	//* 189  574:aload           10
	//* 190  576:aload           4
	//* 191  578:invokespecial   #280 <Method void AppCompatCheckBox(Context, AttributeSet)>
	//* 192  581:astore_1        
	//* 193  582:goto            244
	//* 194  585:new             #282 <Class AppCompatRadioButton>
	//* 195  588:dup             
	//* 196  589:aload           10
	//* 197  591:aload           4
	//* 198  593:invokespecial   #283 <Method void AppCompatRadioButton(Context, AttributeSet)>
	//* 199  596:astore_1        
	//* 200  597:goto            244
	//* 201  600:new             #285 <Class AppCompatCheckedTextView>
	//* 202  603:dup             
	//* 203  604:aload           10
	//* 204  606:aload           4
	//* 205  608:invokespecial   #286 <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//* 206  611:astore_1        
	//* 207  612:goto            244
	//* 208  615:new             #288 <Class AppCompatAutoCompleteTextView>
	//* 209  618:dup             
	//* 210  619:aload           10
	//* 211  621:aload           4
	//* 212  623:invokespecial   #289 <Method void AppCompatAutoCompleteTextView(Context, AttributeSet)>
	//* 213  626:astore_1        
	//* 214  627:goto            244
	//* 215  630:new             #291 <Class AppCompatMultiAutoCompleteTextView>
	//* 216  633:dup             
	//* 217  634:aload           10
	//* 218  636:aload           4
	//* 219  638:invokespecial   #292 <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet)>
	//* 220  641:astore_1        
	//* 221  642:goto            244
	//* 222  645:new             #294 <Class AppCompatRatingBar>
	//* 223  648:dup             
	//* 224  649:aload           10
	//* 225  651:aload           4
	//* 226  653:invokespecial   #295 <Method void AppCompatRatingBar(Context, AttributeSet)>
	//* 227  656:astore_1        
	//* 228  657:goto            244
	//* 229  660:new             #297 <Class AppCompatSeekBar>
	//* 230  663:dup             
	//* 231  664:aload           10
	//* 232  666:aload           4
	//* 233  668:invokespecial   #298 <Method void AppCompatSeekBar(Context, AttributeSet)>
	//* 234  671:astore_1        
	//* 235  672:goto            244
	//* 236  675:goto            264
				obj = ((Object) (context));
	//  237  678:aload_3         
	//  238  679:astore          10
			if(!flag1)
			{
				view = ((View) (obj));
				if(!flag2)
					break label0;
			}
			view = ((View) (themifyContext(((Context) (obj)), attributeset, flag1, flag2)));
		}
		obj = ((Object) (view));
		if(flag3)
			obj = ((Object) (TintContextWrapper.wrap(((Context) (view)))));
		view = null;
		byte0 = -1;
		s.hashCode();
		JVM INSTR lookupswitch 13: default 176
	//	               -1946472170: 447
	//	               -1455429095: 399
	//	               -1346021293: 431
	//	               -938935918: 277
	//	               -937446323: 352
	//	               -658531749: 463
	//	               -339785223: 337
	//	               776382189: 383
	//	               1125864064: 292
	//	               1413872058: 415
	//	               1601505219: 367
	//	               1666676343: 322
	//	               2001146706: 307;
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
		byte0;
		JVM INSTR tableswitch 0 12: default 244
	//	               0 480
	//	               1 495
	//	               2 510
	//	               3 525
	//	               4 540
	//	               5 555
	//	               6 570
	//	               7 585
	//	               8 600
	//	               9 615
	//	               10 630
	//	               11 645
	//	               12 660;
		   goto _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L15:
		if(view == null && context != obj)
			view = createViewFromTag(((Context) (obj)), s, attributeset);
		if(view != null)
			checkOnClickListener(view, attributeset);
		return view;
_L5:
		if(s.equals("TextView"))
			byte0 = 0;
		  goto _L1
_L10:
		if(s.equals("ImageView"))
			byte0 = 1;
		  goto _L1
_L14:
		if(s.equals("Button"))
			byte0 = 2;
		  goto _L1
_L13:
		if(s.equals("EditText"))
			byte0 = 3;
		  goto _L1
_L8:
		if(s.equals("Spinner"))
			byte0 = 4;
		  goto _L1
_L6:
		if(s.equals("ImageButton"))
			byte0 = 5;
		  goto _L1
_L12:
		if(s.equals("CheckBox"))
			byte0 = 6;
		  goto _L1
_L9:
		if(s.equals("RadioButton"))
			byte0 = 7;
		  goto _L1
_L3:
		if(s.equals("CheckedTextView"))
			byte0 = 8;
		  goto _L1
_L11:
		if(s.equals("AutoCompleteTextView"))
			byte0 = 9;
		  goto _L1
_L4:
		if(s.equals("MultiAutoCompleteTextView"))
			byte0 = 10;
		  goto _L1
_L2:
		if(s.equals("RatingBar"))
			byte0 = 11;
		  goto _L1
_L7:
		if(s.equals("SeekBar"))
			byte0 = 12;
		  goto _L1
_L16:
		view = ((View) (new AppCompatTextView(((Context) (obj)), attributeset)));
		  goto _L15
_L17:
		view = ((View) (new AppCompatImageView(((Context) (obj)), attributeset)));
		  goto _L15
_L18:
		view = ((View) (new AppCompatButton(((Context) (obj)), attributeset)));
		  goto _L15
_L19:
		view = ((View) (new AppCompatEditText(((Context) (obj)), attributeset)));
		  goto _L15
_L20:
		view = ((View) (new AppCompatSpinner(((Context) (obj)), attributeset)));
		  goto _L15
_L21:
		view = ((View) (new AppCompatImageButton(((Context) (obj)), attributeset)));
		  goto _L15
_L22:
		view = ((View) (new AppCompatCheckBox(((Context) (obj)), attributeset)));
		  goto _L15
_L23:
		view = ((View) (new AppCompatRadioButton(((Context) (obj)), attributeset)));
		  goto _L15
_L24:
		view = ((View) (new AppCompatCheckedTextView(((Context) (obj)), attributeset)));
		  goto _L15
_L25:
		view = ((View) (new AppCompatAutoCompleteTextView(((Context) (obj)), attributeset)));
		  goto _L15
_L26:
		view = ((View) (new AppCompatMultiAutoCompleteTextView(((Context) (obj)), attributeset)));
		  goto _L15
_L27:
		view = ((View) (new AppCompatRatingBar(((Context) (obj)), attributeset)));
		  goto _L15
_L28:
		view = ((View) (new AppCompatSeekBar(((Context) (obj)), attributeset)));
		  goto _L15
	//* 239  681:goto            15
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
