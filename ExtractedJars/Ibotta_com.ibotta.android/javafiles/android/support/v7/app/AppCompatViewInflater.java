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

public class AppCompatViewInflater
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
		//    1    1:ifnull          70
			if(context.isRestricted())
				break MISSING_BLOCK_LABEL_47;
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
		//*  26   47:aload_1         
		//*  27   48:instanceof      #58  <Class ContextWrapper>
		//*  28   51:ifeq            65
		//*  29   54:aload_1         
		//*  30   55:checkcast       #58  <Class ContextWrapper>
		//*  31   58:invokevirtual   #62  <Method Context ContextWrapper.getBaseContext()>
		//*  32   61:astore_1        
		//*  33   62:goto            0
		//*  34   65:aconst_null     
		//*  35   66:astore_1        
		//*  36   67:goto            0
		//*  37   70:aload_0         
		//*  38   71:getfield        #25  <Field View mHostView>
		//*  39   74:invokevirtual   #66  <Method int View.getId()>
		//*  40   77:istore_3        
		//*  41   78:iload_3         
		//*  42   79:iconst_m1       
		//*  43   80:icmpne          89
		//*  44   83:ldc1            #68  <String "">
		//*  45   85:astore_1        
		//*  46   86:goto            135
		//*  47   89:new             #70  <Class StringBuilder>
		//*  48   92:dup             
		//*  49   93:invokespecial   #71  <Method void StringBuilder()>
		//*  50   96:astore_1        
		//*  51   97:aload_1         
		//*  52   98:ldc1            #73  <String " with id '">
		//*  53  100:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  54  103:pop             
		//*  55  104:aload_1         
		//*  56  105:aload_0         
		//*  57  106:getfield        #25  <Field View mHostView>
		//*  58  109:invokevirtual   #80  <Method Context View.getContext()>
		//*  59  112:invokevirtual   #84  <Method Resources Context.getResources()>
		//*  60  115:iload_3         
		//*  61  116:invokevirtual   #90  <Method String Resources.getResourceEntryName(int)>
		//*  62  119:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  63  122:pop             
		//*  64  123:aload_1         
		//*  65  124:ldc1            #92  <String "'">
		//*  66  126:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  67  129:pop             
		//*  68  130:aload_1         
		//*  69  131:invokevirtual   #96  <Method String StringBuilder.toString()>
		//*  70  134:astore_1        
		//*  71  135:new             #70  <Class StringBuilder>
		//*  72  138:dup             
		//*  73  139:invokespecial   #71  <Method void StringBuilder()>
		//*  74  142:astore_2        
		//*  75  143:aload_2         
		//*  76  144:ldc1            #98  <String "Could not find method ">
		//*  77  146:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  78  149:pop             
		//*  79  150:aload_2         
		//*  80  151:aload_0         
		//*  81  152:getfield        #27  <Field String mMethodName>
		//*  82  155:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  83  158:pop             
		//*  84  159:aload_2         
		//*  85  160:ldc1            #100 <String "(View) in a parent or ancestor Context for android:onClick ">
		//*  86  162:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  87  165:pop             
		//*  88  166:aload_2         
		//*  89  167:ldc1            #102 <String "attribute defined on view ">
		//*  90  169:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//*  91  172:pop             
		//*  92  173:aload_2         
		//*  93  174:aload_0         
		//*  94  175:getfield        #25  <Field View mHostView>
		//*  95  178:invokevirtual   #44  <Method Class Object.getClass()>
		//*  96  181:invokevirtual   #105 <Method StringBuilder StringBuilder.append(Object)>
		//*  97  184:pop             
		//*  98  185:aload_2         
		//*  99  186:aload_1         
		//* 100  187:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//* 101  190:pop             
		//* 102  191:new             #107 <Class IllegalStateException>
		//* 103  194:dup             
		//* 104  195:aload_2         
		//* 105  196:invokevirtual   #96  <Method String StringBuilder.toString()>
		//* 106  199:invokespecial   #110 <Method void IllegalStateException(String)>
		//* 107  202:athrow          
				// Misplaced declaration of an exception variable
				catch(String s) { }
		//  108  203:astore_2        
			if(context instanceof ContextWrapper)
				context = ((ContextWrapper)context).getBaseContext();
			else
				context = null;
			if(true) goto _L2; else goto _L1
_L1:
			int i = mHostView.getId();
			if(i == -1)
			{
				context = "";
			} else
			{
				context = ((Context) (new StringBuilder()));
				((StringBuilder) (context)).append(" with id '");
				((StringBuilder) (context)).append(mHostView.getContext().getResources().getResourceEntryName(i));
				((StringBuilder) (context)).append("'");
				context = ((Context) (((StringBuilder) (context)).toString()));
			}
			s = ((String) (new StringBuilder()));
			((StringBuilder) (s)).append("Could not find method ");
			((StringBuilder) (s)).append(mMethodName);
			((StringBuilder) (s)).append("(View) in a parent or ancestor Context for android:onClick ");
			((StringBuilder) (s)).append("attribute defined on view ");
			((StringBuilder) (s)).append(((Object) (((Object) (mHostView)).getClass())));
			((StringBuilder) (s)).append(((String) (context)));
			throw new IllegalStateException(((StringBuilder) (s)).toString());
		//* 109  204:goto            47
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
		//*  23   43:astore_1        
		//*  24   44:new             #107 <Class IllegalStateException>
		//*  25   47:dup             
		//*  26   48:ldc1            #127 <String "Could not execute method for android:onClick">
		//*  27   50:aload_1         
		//*  28   51:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
		//*  29   54:athrow          
			// Misplaced declaration of an exception variable
			catch(View view)
		//*  30   55:astore_1        
			{
				throw new IllegalStateException("Could not execute non-public method for android:onClick", ((Throwable) (view)));
		//   31   56:new             #107 <Class IllegalStateException>
		//   32   59:dup             
		//   33   60:ldc1            #132 <String "Could not execute non-public method for android:onClick">
		//   34   62:aload_1         
		//   35   63:invokespecial   #130 <Method void IllegalStateException(String, Throwable)>
		//   36   66:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new IllegalStateException("Could not execute method for android:onClick", ((Throwable) (view)));
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


	public AppCompatViewInflater()
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
		if(obj instanceof ContextWrapper)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #67  <Class ContextWrapper>
	//*   5    9:ifeq            65
		{
			if(android.os.Build.VERSION.SDK_INT >= 15 && !ViewCompat.hasOnClickListeners(view))
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
			return;
	//   33   64:return          
		} else
		{
			return;
	//   34   65:return          
		}
	}

	private View createViewByPrefix(Context context, String s, String s1)
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
	//    8   20:ifnonnull       92
_L1:
		try
		{
			obj = ((Object) (context.getClassLoader()));
	//    9   23:aload_1         
	//   10   24:invokevirtual   #119 <Method ClassLoader Context.getClassLoader()>
	//   11   27:astore          4
		}
	//*  12   29:aload_3         
	//*  13   30:ifnull          119
	//*  14   33:new             #121 <Class StringBuilder>
	//*  15   36:dup             
	//*  16   37:invokespecial   #122 <Method void StringBuilder()>
	//*  17   40:astore_1        
	//*  18   41:aload_1         
	//*  19   42:aload_3         
	//*  20   43:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  21   46:pop             
	//*  22   47:aload_1         
	//*  23   48:aload_2         
	//*  24   49:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//*  25   52:pop             
	//*  26   53:aload_1         
	//*  27   54:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  28   57:astore_1        
	//*  29   58:goto            61
	//*  30   61:aload           4
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #136 <Method Class ClassLoader.loadClass(String)>
	//*  33   67:ldc1            #61  <Class View>
	//*  34   69:invokevirtual   #140 <Method Class Class.asSubclass(Class)>
	//*  35   72:getstatic       #33  <Field Class[] sConstructorSignature>
	//*  36   75:invokevirtual   #144 <Method Constructor Class.getConstructor(Class[])>
	//*  37   78:astore          4
	//*  38   80:getstatic       #53  <Field Map sConstructorMap>
	//*  39   83:aload_2         
	//*  40   84:aload           4
	//*  41   86:invokeinterface #148 <Method Object Map.put(Object, Object)>
	//*  42   91:pop             
	//*  43   92:aload           4
	//*  44   94:iconst_1        
	//*  45   95:invokevirtual   #152 <Method void Constructor.setAccessible(boolean)>
	//*  46   98:aload           4
	//*  47  100:aload_0         
	//*  48  101:getfield        #57  <Field Object[] mConstructorArgs>
	//*  49  104:invokevirtual   #156 <Method Object Constructor.newInstance(Object[])>
	//*  50  107:checkcast       #61  <Class View>
	//*  51  110:astore_1        
	//*  52  111:aload_1         
	//*  53  112:areturn         
	//*  54  113:aconst_null     
	//*  55  114:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return null;
		}
		if(s1 == null) goto _L4; else goto _L3
_L3:
		context = ((Context) (new StringBuilder()));
		((StringBuilder) (context)).append(s1);
		((StringBuilder) (context)).append(s);
		context = ((Context) (((StringBuilder) (context)).toString()));
_L6:
		obj = ((Object) (((ClassLoader) (obj)).loadClass(((String) (context))).asSubclass(android/view/View).getConstructor(sConstructorSignature)));
		sConstructorMap.put(((Object) (s)), obj);
_L2:
		((Constructor) (obj)).setAccessible(true);
		context = ((Context) ((View)((Constructor) (obj)).newInstance(mConstructorArgs)));
		return ((View) (context));
	//*  56  115:astore_1        
	//*  57  116:goto            113
_L4:
		context = ((Context) (s));
	//   58  119:aload_2         
	//   59  120:astore_1        
		if(true) goto _L6; else goto _L5
	//   60  121:goto            61
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
			break MISSING_BLOCK_LABEL_117;
	//   21   37:iconst_m1       
	//   22   38:aload           5
	//   23   40:bipush          46
	//   24   42:invokevirtual   #175 <Method int String.indexOf(int)>
	//   25   45:icmpne          117
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
	//   31   57:icmpge          102
				s = ((String) (createViewByPrefix(context, s1, sClassPrefixList[i])));
	//   32   60:aload_0         
	//   33   61:aload_1         
	//   34   62:aload           5
	//   35   64:getstatic       #46  <Field String[] sClassPrefixList>
	//   36   67:iload           4
	//   37   69:aaload          
	//   38   70:invokespecial   #177 <Method View createViewByPrefix(Context, String, String)>
	//   39   73:astore_2        
			}
	//*  40   74:aload_2         
	//*  41   75:ifnull          93
	//*  42   78:aload_0         
	//*  43   79:getfield        #57  <Field Object[] mConstructorArgs>
	//*  44   82:astore_1        
	//*  45   83:aload_1         
	//*  46   84:iconst_0        
	//*  47   85:aconst_null     
	//*  48   86:aastore         
	//*  49   87:aload_1         
	//*  50   88:iconst_1        
	//*  51   89:aconst_null     
	//*  52   90:aastore         
	//*  53   91:aload_2         
	//*  54   92:areturn         
	//*  55   93:iload           4
	//*  56   95:iconst_1        
	//*  57   96:iadd            
	//*  58   97:istore          4
	//*  59   99:goto            51
	//*  60  102:aload_0         
	//*  61  103:getfield        #57  <Field Object[] mConstructorArgs>
	//*  62  106:astore_1        
	//*  63  107:aload_1         
	//*  64  108:iconst_0        
	//*  65  109:aconst_null     
	//*  66  110:aastore         
	//*  67  111:aload_1         
	//*  68  112:iconst_1        
	//*  69  113:aconst_null     
	//*  70  114:aastore         
	//*  71  115:aconst_null     
	//*  72  116:areturn         
	//*  73  117:aload_0         
	//*  74  118:aload_1         
	//*  75  119:aload           5
	//*  76  121:aconst_null     
	//*  77  122:invokespecial   #177 <Method View createViewByPrefix(Context, String, String)>
	//*  78  125:astore_1        
	//*  79  126:aload_0         
	//*  80  127:getfield        #57  <Field Object[] mConstructorArgs>
	//*  81  130:astore_2        
	//*  82  131:aload_2         
	//*  83  132:iconst_0        
	//*  84  133:aconst_null     
	//*  85  134:aastore         
	//*  86  135:aload_2         
	//*  87  136:iconst_1        
	//*  88  137:aconst_null     
	//*  89  138:aastore         
	//*  90  139:aload_1         
	//*  91  140:areturn         
	//*  92  141:astore_1        
	//*  93  142:aload_0         
	//*  94  143:getfield        #57  <Field Object[] mConstructorArgs>
	//*  95  146:astore_2        
	//*  96  147:aload_2         
	//*  97  148:iconst_0        
	//*  98  149:aconst_null     
	//*  99  150:aastore         
	//* 100  151:aload_2         
	//* 101  152:iconst_1        
	//* 102  153:aconst_null     
	//* 103  154:aastore         
	//* 104  155:aload_1         
	//* 105  156:athrow          
	//* 106  157:aload_0         
	//* 107  158:getfield        #57  <Field Object[] mConstructorArgs>
	//* 108  161:astore_1        
	//* 109  162:aload_1         
	//* 110  163:iconst_0        
	//* 111  164:aconst_null     
	//* 112  165:aastore         
	//* 113  166:aload_1         
	//* 114  167:iconst_1        
	//* 115  168:aconst_null     
	//* 116  169:aastore         
	//* 117  170:aconst_null     
	//* 118  171:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				context = ((Context) (mConstructorArgs));
				context[0] = null;
				context[1] = null;
				return null;
			}
			if(s != null)
			{
				context = ((Context) (mConstructorArgs));
				context[0] = null;
				context[1] = null;
				return ((View) (s));
			}
			i++;
		} while(true);
		context = ((Context) (mConstructorArgs));
		context[0] = null;
		context[1] = null;
		return null;
		context = ((Context) (createViewByPrefix(context, s1, ((String) (null)))));
		s = ((String) (mConstructorArgs));
		s[0] = null;
		s[1] = null;
		return ((View) (context));
		context;
		s = ((String) (mConstructorArgs));
		s[0] = null;
		s[1] = null;
		throw context;
	//* 119  172:astore_1        
	//* 120  173:goto            157
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
			if(flag)
	//*   7   11:iload_2         
	//*   8   12:ifeq            28
				i = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_android_theme, 0);
	//    9   15:aload_1         
	//   10   16:getstatic       #190 <Field int android.support.v7.appcompat.R$styleable.View_android_theme>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//   13   23:istore          4
			else
	//*  14   25:goto            31
				i = 0;
	//   15   28:iconst_0        
	//   16   29:istore          4
			int k = i;
	//   17   31:iload           4
	//   18   33:istore          5
			if(flag1)
	//*  19   35:iload_3         
	//*  20   36:ifeq            79
			{
				k = i;
	//   21   39:iload           4
	//   22   41:istore          5
				if(i == 0)
	//*  23   43:iload           4
	//*  24   45:ifne            79
				{
					int j = ((TypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.View_theme, 0);
	//   25   48:aload_1         
	//   26   49:getstatic       #197 <Field int android.support.v7.appcompat.R$styleable.View_theme>
	//   27   52:iconst_0        
	//   28   53:invokevirtual   #194 <Method int TypedArray.getResourceId(int, int)>
	//   29   56:istore          4
					k = j;
	//   30   58:iload           4
	//   31   60:istore          5
					if(j != 0)
	//*  32   62:iload           4
	//*  33   64:ifeq            79
					{
						Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
	//   34   67:ldc1            #11  <String "AppCompatViewInflater">
	//   35   69:ldc1            #199 <String "app:theme is now deprecated. Please move to using android:theme instead.">
	//   36   71:invokestatic    #205 <Method int Log.i(String, String)>
	//   37   74:pop             
						k = j;
	//   38   75:iload           4
	//   39   77:istore          5
					}
				}
			}
			((TypedArray) (attributeset)).recycle();
	//   40   79:aload_1         
	//   41   80:invokevirtual   #99  <Method void TypedArray.recycle()>
			attributeset = ((AttributeSet) (context));
	//   42   83:aload_0         
	//   43   84:astore_1        
			if(k == 0)
				break label0;
	//   44   85:iload           5
	//   45   87:ifeq            122
			if(context instanceof ContextThemeWrapper)
	//*  46   90:aload_0         
	//*  47   91:instanceof      #207 <Class ContextThemeWrapper>
	//*  48   94:ifeq            111
			{
				attributeset = ((AttributeSet) (context));
	//   49   97:aload_0         
	//   50   98:astore_1        
				if(((ContextThemeWrapper)context).getThemeResId() == k)
					break label0;
	//   51   99:aload_0         
	//   52  100:checkcast       #207 <Class ContextThemeWrapper>
	//   53  103:invokevirtual   #211 <Method int ContextThemeWrapper.getThemeResId()>
	//   54  106:iload           5
	//   55  108:icmpeq          122
			}
			attributeset = ((AttributeSet) (new ContextThemeWrapper(context, k)));
	//   56  111:new             #207 <Class ContextThemeWrapper>
	//   57  114:dup             
	//   58  115:aload_0         
	//   59  116:iload           5
	//   60  118:invokespecial   #214 <Method void ContextThemeWrapper(Context, int)>
	//   61  121:astore_1        
		}
		return ((Context) (attributeset));
	//   62  122:aload_1         
	//   63  123:areturn         
	}

	private void verifyNotNull(View view, String s)
	{
		if(view != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          5
		{
			return;
	//    2    4:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//    3    5:new             #121 <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #122 <Method void StringBuilder()>
	//    6   12:astore_1        
			((StringBuilder) (view)).append(((Object)this).getClass().getName());
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #219 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #222 <Method String Class.getName()>
	//   11   21:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			((StringBuilder) (view)).append(" asked to inflate view for <");
	//   13   25:aload_1         
	//   14   26:ldc1            #224 <String " asked to inflate view for <">
	//   15   28:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			((StringBuilder) (view)).append(s);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			((StringBuilder) (view)).append(">, but returned null");
	//   21   38:aload_1         
	//   22   39:ldc1            #226 <String ">, but returned null">
	//   23   41:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//   25   45:new             #228 <Class IllegalStateException>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #231 <Method void IllegalStateException(String)>
	//   30   56:athrow          
		}
	}

	protected AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeset)
	{
		return new AppCompatAutoCompleteTextView(context, attributeset);
	//    0    0:new             #236 <Class AppCompatAutoCompleteTextView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #239 <Method void AppCompatAutoCompleteTextView(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatButton createButton(Context context, AttributeSet attributeset)
	{
		return new AppCompatButton(context, attributeset);
	//    0    0:new             #244 <Class AppCompatButton>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #245 <Method void AppCompatButton(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeset)
	{
		return new AppCompatCheckBox(context, attributeset);
	//    0    0:new             #249 <Class AppCompatCheckBox>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #250 <Method void AppCompatCheckBox(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeset)
	{
		return new AppCompatCheckedTextView(context, attributeset);
	//    0    0:new             #254 <Class AppCompatCheckedTextView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #255 <Method void AppCompatCheckedTextView(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatEditText createEditText(Context context, AttributeSet attributeset)
	{
		return new AppCompatEditText(context, attributeset);
	//    0    0:new             #259 <Class AppCompatEditText>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #260 <Method void AppCompatEditText(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatImageButton createImageButton(Context context, AttributeSet attributeset)
	{
		return new AppCompatImageButton(context, attributeset);
	//    0    0:new             #264 <Class AppCompatImageButton>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #265 <Method void AppCompatImageButton(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatImageView createImageView(Context context, AttributeSet attributeset)
	{
		return new AppCompatImageView(context, attributeset);
	//    0    0:new             #269 <Class AppCompatImageView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #270 <Method void AppCompatImageView(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeset)
	{
		return new AppCompatMultiAutoCompleteTextView(context, attributeset);
	//    0    0:new             #274 <Class AppCompatMultiAutoCompleteTextView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #275 <Method void AppCompatMultiAutoCompleteTextView(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeset)
	{
		return new AppCompatRadioButton(context, attributeset);
	//    0    0:new             #279 <Class AppCompatRadioButton>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #280 <Method void AppCompatRadioButton(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeset)
	{
		return new AppCompatRatingBar(context, attributeset);
	//    0    0:new             #284 <Class AppCompatRatingBar>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #285 <Method void AppCompatRatingBar(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeset)
	{
		return new AppCompatSeekBar(context, attributeset);
	//    0    0:new             #289 <Class AppCompatSeekBar>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #290 <Method void AppCompatSeekBar(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatSpinner createSpinner(Context context, AttributeSet attributeset)
	{
		return new AppCompatSpinner(context, attributeset);
	//    0    0:new             #294 <Class AppCompatSpinner>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #295 <Method void AppCompatSpinner(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected AppCompatTextView createTextView(Context context, AttributeSet attributeset)
	{
		return new AppCompatTextView(context, attributeset);
	//    0    0:new             #299 <Class AppCompatTextView>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #300 <Method void AppCompatTextView(Context, AttributeSet)>
	//    5    9:areturn         
	}

	protected View createView(Context context, String s, AttributeSet attributeset)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final View createView(View view, String s, Context context, AttributeSet attributeset, boolean flag, boolean flag1, boolean flag2, 
			boolean flag3)
	{
label0:
		{
			Context context1;
			if(flag && view != null)
	//*   0    0:iload           5
	//*   1    2:ifeq            18
	//*   2    5:aload_1         
	//*   3    6:ifnull          18
				context1 = view.getContext();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #65  <Method Context View.getContext()>
	//    6   13:astore          10
			else
	//*   7   15:goto            21
				context1 = context;
	//    8   18:aload_3         
	//    9   19:astore          10
			if(!flag1)
	//*  10   21:iload           6
	//*  11   23:ifne            34
			{
				view = ((View) (context1));
	//   12   26:aload           10
	//   13   28:astore_1        
				if(!flag2)
					break label0;
	//   14   29:iload           7
	//   15   31:ifeq            46
			}
			view = ((View) (themifyContext(context1, attributeset, flag1, flag2)));
	//   16   34:aload           10
	//   17   36:aload           4
	//   18   38:iload           6
	//   19   40:iload           7
	//   20   42:invokestatic    #305 <Method Context themifyContext(Context, AttributeSet, boolean, boolean)>
	//   21   45:astore_1        
		}
		Object obj = ((Object) (view));
	//   22   46:aload_1         
	//   23   47:astore          10
		if(flag3)
	//*  24   49:iload           8
	//*  25   51:ifeq            60
			obj = ((Object) (TintContextWrapper.wrap(((Context) (view)))));
	//   26   54:aload_1         
	//   27   55:invokestatic    #311 <Method Context TintContextWrapper.wrap(Context)>
	//   28   58:astore          10
		byte byte0 = -1;
	//   29   60:iconst_m1       
	//   30   61:istore          9
		switch(s.hashCode())
	//*  31   63:aload_2         
	//*  32   64:invokevirtual   #314 <Method int String.hashCode()>
		{
	//*  33   67:lookupswitch    13: default 180
	//	               -1946472170: 381
	//	               -1455429095: 364
	//	               -1346021293: 347
	//	               -938935918: 331
	//	               -937446323: 315
	//	               -658531749: 298
	//	               -339785223: 282
	//	               776382189: 265
	//	               1125864064: 249
	//	               1413872058: 232
	//	               1601505219: 215
	//	               1666676343: 199
	//	               2001146706: 183
	//*  34  180:goto            395
		case 2001146706: 
			if(s.equals("Button"))
	//*  35  183:aload_2         
	//*  36  184:ldc2            #316 <String "Button">
	//*  37  187:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  38  190:ifeq            395
				byte0 = 2;
	//   39  193:iconst_2        
	//   40  194:istore          9
			break;

	//*  41  196:goto            395
		case 1666676343: 
			if(s.equals("EditText"))
	//*  42  199:aload_2         
	//*  43  200:ldc2            #318 <String "EditText">
	//*  44  203:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  45  206:ifeq            395
				byte0 = 3;
	//   46  209:iconst_3        
	//   47  210:istore          9
			break;

	//*  48  212:goto            395
		case 1601505219: 
			if(s.equals("CheckBox"))
	//*  49  215:aload_2         
	//*  50  216:ldc2            #320 <String "CheckBox">
	//*  51  219:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  52  222:ifeq            395
				byte0 = 6;
	//   53  225:bipush          6
	//   54  227:istore          9
			break;

	//*  55  229:goto            395
		case 1413872058: 
			if(s.equals("AutoCompleteTextView"))
	//*  56  232:aload_2         
	//*  57  233:ldc2            #322 <String "AutoCompleteTextView">
	//*  58  236:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  59  239:ifeq            395
				byte0 = 9;
	//   60  242:bipush          9
	//   61  244:istore          9
			break;

	//*  62  246:goto            395
		case 1125864064: 
			if(s.equals("ImageView"))
	//*  63  249:aload_2         
	//*  64  250:ldc2            #324 <String "ImageView">
	//*  65  253:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  66  256:ifeq            395
				byte0 = 1;
	//   67  259:iconst_1        
	//   68  260:istore          9
			break;

	//*  69  262:goto            395
		case 776382189: 
			if(s.equals("RadioButton"))
	//*  70  265:aload_2         
	//*  71  266:ldc2            #326 <String "RadioButton">
	//*  72  269:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  73  272:ifeq            395
				byte0 = 7;
	//   74  275:bipush          7
	//   75  277:istore          9
			break;

	//*  76  279:goto            395
		case -339785223: 
			if(s.equals("Spinner"))
	//*  77  282:aload_2         
	//*  78  283:ldc2            #328 <String "Spinner">
	//*  79  286:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  80  289:ifeq            395
				byte0 = 4;
	//   81  292:iconst_4        
	//   82  293:istore          9
			break;

	//*  83  295:goto            395
		case -658531749: 
			if(s.equals("SeekBar"))
	//*  84  298:aload_2         
	//*  85  299:ldc2            #330 <String "SeekBar">
	//*  86  302:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  87  305:ifeq            395
				byte0 = 12;
	//   88  308:bipush          12
	//   89  310:istore          9
			break;

	//*  90  312:goto            395
		case -937446323: 
			if(s.equals("ImageButton"))
	//*  91  315:aload_2         
	//*  92  316:ldc2            #332 <String "ImageButton">
	//*  93  319:invokevirtual   #165 <Method boolean String.equals(Object)>
	//*  94  322:ifeq            395
				byte0 = 5;
	//   95  325:iconst_5        
	//   96  326:istore          9
			break;

	//*  97  328:goto            395
		case -938935918: 
			if(s.equals("TextView"))
	//*  98  331:aload_2         
	//*  99  332:ldc2            #334 <String "TextView">
	//* 100  335:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 101  338:ifeq            395
				byte0 = 0;
	//  102  341:iconst_0        
	//  103  342:istore          9
			break;

	//* 104  344:goto            395
		case -1346021293: 
			if(s.equals("MultiAutoCompleteTextView"))
	//* 105  347:aload_2         
	//* 106  348:ldc2            #336 <String "MultiAutoCompleteTextView">
	//* 107  351:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 108  354:ifeq            395
				byte0 = 10;
	//  109  357:bipush          10
	//  110  359:istore          9
			break;

	//* 111  361:goto            395
		case -1455429095: 
			if(s.equals("CheckedTextView"))
	//* 112  364:aload_2         
	//* 113  365:ldc2            #338 <String "CheckedTextView">
	//* 114  368:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 115  371:ifeq            395
				byte0 = 8;
	//  116  374:bipush          8
	//  117  376:istore          9
			break;

	//* 118  378:goto            395
		case -1946472170: 
			if(s.equals("RatingBar"))
	//* 119  381:aload_2         
	//* 120  382:ldc2            #340 <String "RatingBar">
	//* 121  385:invokevirtual   #165 <Method boolean String.equals(Object)>
	//* 122  388:ifeq            395
				byte0 = 11;
	//  123  391:bipush          11
	//  124  393:istore          9
			break;
		}
		switch(byte0)
	//* 125  395:iload           9
		{
	//* 126  397:tableswitch     0 12: default 464
	//	               0 693
	//	               1 675
	//	               2 657
	//	               3 639
	//	               4 621
	//	               5 603
	//	               6 585
	//	               7 567
	//	               8 549
	//	               9 531
	//	               10 513
	//	               11 495
	//	               12 477
		default:
			view = createView(((Context) (obj)), s, attributeset);
	//  127  464:aload_0         
	//  128  465:aload           10
	//  129  467:aload_2         
	//  130  468:aload           4
	//  131  470:invokevirtual   #342 <Method View createView(Context, String, AttributeSet)>
	//  132  473:astore_1        
			break;

	//* 133  474:goto            708
		case 12: // '\f'
			view = ((View) (createSeekBar(((Context) (obj)), attributeset)));
	//  134  477:aload_0         
	//  135  478:aload           10
	//  136  480:aload           4
	//  137  482:invokevirtual   #344 <Method AppCompatSeekBar createSeekBar(Context, AttributeSet)>
	//  138  485:astore_1        
			verifyNotNull(view, s);
	//  139  486:aload_0         
	//  140  487:aload_1         
	//  141  488:aload_2         
	//  142  489:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 143  492:goto            708
		case 11: // '\013'
			view = ((View) (createRatingBar(((Context) (obj)), attributeset)));
	//  144  495:aload_0         
	//  145  496:aload           10
	//  146  498:aload           4
	//  147  500:invokevirtual   #348 <Method AppCompatRatingBar createRatingBar(Context, AttributeSet)>
	//  148  503:astore_1        
			verifyNotNull(view, s);
	//  149  504:aload_0         
	//  150  505:aload_1         
	//  151  506:aload_2         
	//  152  507:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 153  510:goto            708
		case 10: // '\n'
			view = ((View) (createMultiAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  154  513:aload_0         
	//  155  514:aload           10
	//  156  516:aload           4
	//  157  518:invokevirtual   #350 <Method AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context, AttributeSet)>
	//  158  521:astore_1        
			verifyNotNull(view, s);
	//  159  522:aload_0         
	//  160  523:aload_1         
	//  161  524:aload_2         
	//  162  525:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 163  528:goto            708
		case 9: // '\t'
			view = ((View) (createAutoCompleteTextView(((Context) (obj)), attributeset)));
	//  164  531:aload_0         
	//  165  532:aload           10
	//  166  534:aload           4
	//  167  536:invokevirtual   #352 <Method AppCompatAutoCompleteTextView createAutoCompleteTextView(Context, AttributeSet)>
	//  168  539:astore_1        
			verifyNotNull(view, s);
	//  169  540:aload_0         
	//  170  541:aload_1         
	//  171  542:aload_2         
	//  172  543:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 173  546:goto            708
		case 8: // '\b'
			view = ((View) (createCheckedTextView(((Context) (obj)), attributeset)));
	//  174  549:aload_0         
	//  175  550:aload           10
	//  176  552:aload           4
	//  177  554:invokevirtual   #354 <Method AppCompatCheckedTextView createCheckedTextView(Context, AttributeSet)>
	//  178  557:astore_1        
			verifyNotNull(view, s);
	//  179  558:aload_0         
	//  180  559:aload_1         
	//  181  560:aload_2         
	//  182  561:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 183  564:goto            708
		case 7: // '\007'
			view = ((View) (createRadioButton(((Context) (obj)), attributeset)));
	//  184  567:aload_0         
	//  185  568:aload           10
	//  186  570:aload           4
	//  187  572:invokevirtual   #356 <Method AppCompatRadioButton createRadioButton(Context, AttributeSet)>
	//  188  575:astore_1        
			verifyNotNull(view, s);
	//  189  576:aload_0         
	//  190  577:aload_1         
	//  191  578:aload_2         
	//  192  579:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 193  582:goto            708
		case 6: // '\006'
			view = ((View) (createCheckBox(((Context) (obj)), attributeset)));
	//  194  585:aload_0         
	//  195  586:aload           10
	//  196  588:aload           4
	//  197  590:invokevirtual   #358 <Method AppCompatCheckBox createCheckBox(Context, AttributeSet)>
	//  198  593:astore_1        
			verifyNotNull(view, s);
	//  199  594:aload_0         
	//  200  595:aload_1         
	//  201  596:aload_2         
	//  202  597:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 203  600:goto            708
		case 5: // '\005'
			view = ((View) (createImageButton(((Context) (obj)), attributeset)));
	//  204  603:aload_0         
	//  205  604:aload           10
	//  206  606:aload           4
	//  207  608:invokevirtual   #360 <Method AppCompatImageButton createImageButton(Context, AttributeSet)>
	//  208  611:astore_1        
			verifyNotNull(view, s);
	//  209  612:aload_0         
	//  210  613:aload_1         
	//  211  614:aload_2         
	//  212  615:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 213  618:goto            708
		case 4: // '\004'
			view = ((View) (createSpinner(((Context) (obj)), attributeset)));
	//  214  621:aload_0         
	//  215  622:aload           10
	//  216  624:aload           4
	//  217  626:invokevirtual   #362 <Method AppCompatSpinner createSpinner(Context, AttributeSet)>
	//  218  629:astore_1        
			verifyNotNull(view, s);
	//  219  630:aload_0         
	//  220  631:aload_1         
	//  221  632:aload_2         
	//  222  633:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 223  636:goto            708
		case 3: // '\003'
			view = ((View) (createEditText(((Context) (obj)), attributeset)));
	//  224  639:aload_0         
	//  225  640:aload           10
	//  226  642:aload           4
	//  227  644:invokevirtual   #364 <Method AppCompatEditText createEditText(Context, AttributeSet)>
	//  228  647:astore_1        
			verifyNotNull(view, s);
	//  229  648:aload_0         
	//  230  649:aload_1         
	//  231  650:aload_2         
	//  232  651:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 233  654:goto            708
		case 2: // '\002'
			view = ((View) (createButton(((Context) (obj)), attributeset)));
	//  234  657:aload_0         
	//  235  658:aload           10
	//  236  660:aload           4
	//  237  662:invokevirtual   #366 <Method AppCompatButton createButton(Context, AttributeSet)>
	//  238  665:astore_1        
			verifyNotNull(view, s);
	//  239  666:aload_0         
	//  240  667:aload_1         
	//  241  668:aload_2         
	//  242  669:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 243  672:goto            708
		case 1: // '\001'
			view = ((View) (createImageView(((Context) (obj)), attributeset)));
	//  244  675:aload_0         
	//  245  676:aload           10
	//  246  678:aload           4
	//  247  680:invokevirtual   #368 <Method AppCompatImageView createImageView(Context, AttributeSet)>
	//  248  683:astore_1        
			verifyNotNull(view, s);
	//  249  684:aload_0         
	//  250  685:aload_1         
	//  251  686:aload_2         
	//  252  687:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;

	//* 253  690:goto            708
		case 0: // '\0'
			view = ((View) (createTextView(((Context) (obj)), attributeset)));
	//  254  693:aload_0         
	//  255  694:aload           10
	//  256  696:aload           4
	//  257  698:invokevirtual   #370 <Method AppCompatTextView createTextView(Context, AttributeSet)>
	//  258  701:astore_1        
			verifyNotNull(view, s);
	//  259  702:aload_0         
	//  260  703:aload_1         
	//  261  704:aload_2         
	//  262  705:invokespecial   #346 <Method void verifyNotNull(View, String)>
			break;
		}
		View view1 = view;
	//  263  708:aload_1         
	//  264  709:astore          11
		if(view == null)
	//* 265  711:aload_1         
	//* 266  712:ifnonnull       735
		{
			view1 = view;
	//  267  715:aload_1         
	//  268  716:astore          11
			if(context != obj)
	//* 269  718:aload_3         
	//* 270  719:aload           10
	//* 271  721:if_acmpeq       735
				view1 = createViewFromTag(((Context) (obj)), s, attributeset);
	//  272  724:aload_0         
	//  273  725:aload           10
	//  274  727:aload_2         
	//  275  728:aload           4
	//  276  730:invokespecial   #372 <Method View createViewFromTag(Context, String, AttributeSet)>
	//  277  733:astore          11
		}
		if(view1 != null)
	//* 278  735:aload           11
	//* 279  737:ifnull          748
			checkOnClickListener(view1, attributeset);
	//  280  740:aload_0         
	//  281  741:aload           11
	//  282  743:aload           4
	//  283  745:invokespecial   #374 <Method void checkOnClickListener(View, AttributeSet)>
		return view1;
	//  284  748:aload           11
	//  285  750:areturn         
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
