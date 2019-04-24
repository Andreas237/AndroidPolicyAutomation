// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.lang.reflect.Field;

class ActionBarViewWrapper
{

	public ActionBarViewWrapper(ViewParent viewparent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		ViewParent viewparent1 = viewparent;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(!((Object) (viewparent)).getClass().getName().contains("ActionBarView"))
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #18  <Method Class Object.getClass()>
	//*   6   10:invokevirtual   #24  <Method String Class.getName()>
	//*   7   13:ldc1            #26  <String "ActionBarView">
	//*   8   15:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*   9   18:ifne            109
		{
			String s = ((Object) (viewparent)).getClass().getName();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #18  <Method Class Object.getClass()>
	//   12   25:invokevirtual   #24  <Method String Class.getName()>
	//   13   28:astore_3        
			viewparent = viewparent.getParent();
	//   14   29:aload_1         
	//   15   30:invokeinterface #38  <Method ViewParent ViewParent.getParent()>
	//   16   35:astore_1        
			String s1 = ((Object) (viewparent)).getClass().getName();
	//   17   36:aload_1         
	//   18   37:invokevirtual   #18  <Method Class Object.getClass()>
	//   19   40:invokevirtual   #24  <Method String Class.getName()>
	//   20   43:astore          4
			viewparent1 = viewparent;
	//   21   45:aload_1         
	//   22   46:astore_2        
			if(!((Object) (viewparent)).getClass().getName().contains("ActionBarView"))
	//*  23   47:aload_1         
	//*  24   48:invokevirtual   #18  <Method Class Object.getClass()>
	//*  25   51:invokevirtual   #24  <Method String Class.getName()>
	//*  26   54:ldc1            #26  <String "ActionBarView">
	//*  27   56:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  28   59:ifne            109
			{
				viewparent = ((ViewParent) (new StringBuilder()));
	//   29   62:new             #40  <Class StringBuilder>
	//   30   65:dup             
	//   31   66:invokespecial   #41  <Method void StringBuilder()>
	//   32   69:astore_1        
				((StringBuilder) (viewparent)).append("Cannot find ActionBarView for Activity, instead found ");
	//   33   70:aload_1         
	//   34   71:ldc1            #43  <String "Cannot find ActionBarView for Activity, instead found ">
	//   35   73:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
				((StringBuilder) (viewparent)).append(s);
	//   37   77:aload_1         
	//   38   78:aload_3         
	//   39   79:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
				((StringBuilder) (viewparent)).append(" and ");
	//   41   83:aload_1         
	//   42   84:ldc1            #49  <String " and ">
	//   43   86:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   44   89:pop             
				((StringBuilder) (viewparent)).append(s1);
	//   45   90:aload_1         
	//   46   91:aload           4
	//   47   93:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48   96:pop             
				throw new IllegalStateException(((StringBuilder) (viewparent)).toString());
	//   49   97:new             #51  <Class IllegalStateException>
	//   50  100:dup             
	//   51  101:aload_1         
	//   52  102:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   53  105:invokespecial   #57  <Method void IllegalStateException(String)>
	//   54  108:athrow          
			}
		}
		mActionBarView = viewparent1;
	//   55  109:aload_0         
	//   56  110:aload_2         
	//   57  111:putfield        #59  <Field ViewParent mActionBarView>
		mActionBarViewClass = ((Object) (viewparent1)).getClass();
	//   58  114:aload_0         
	//   59  115:aload_2         
	//   60  116:invokevirtual   #18  <Method Class Object.getClass()>
	//   61  119:putfield        #61  <Field Class mActionBarViewClass>
		mAbsActionBarViewClass = ((Object) (viewparent1)).getClass().getSuperclass();
	//   62  122:aload_0         
	//   63  123:aload_2         
	//   64  124:invokevirtual   #18  <Method Class Object.getClass()>
	//   65  127:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   66  130:putfield        #66  <Field Class mAbsActionBarViewClass>
	//   67  133:return          
	}

	public View getActionItem(int i)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (mAbsActionBarViewClass.getDeclaredField("mActionMenuPresenter")));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Class mAbsActionBarViewClass>
	//    2    4:ldc1            #75  <String "mActionMenuPresenter">
	//    3    6:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//    4    9:astore          5
		((Field) (obj)).setAccessible(true);
	//    5   11:aload           5
	//    6   13:iconst_1        
	//    7   14:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj = ((Field) (obj)).get(((Object) (mActionBarView)));
	//    8   17:aload           5
	//    9   19:aload_0         
	//   10   20:getfield        #59  <Field ViewParent mActionBarView>
	//   11   23:invokevirtual   #89  <Method Object Field.get(Object)>
	//   12   26:astore          5
		obj2 = ((Object) (obj.getClass().getSuperclass().getDeclaredField("mMenuView")));
	//   13   28:aload           5
	//   14   30:invokevirtual   #18  <Method Class Object.getClass()>
	//   15   33:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   16   36:ldc1            #91  <String "mMenuView">
	//   17   38:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   18   41:astore          6
		((Field) (obj2)).setAccessible(true);
	//   19   43:aload           6
	//   20   45:iconst_1        
	//   21   46:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj2 = ((Field) (obj2)).get(obj);
	//   22   49:aload           6
	//   23   51:aload           5
	//   24   53:invokevirtual   #89  <Method Object Field.get(Object)>
	//   25   56:astore          6
		if(obj2.getClass().toString().contains("com.actionbarsherlock"))
	//*  26   58:aload           6
	//*  27   60:invokevirtual   #18  <Method Class Object.getClass()>
	//*  28   63:invokevirtual   #92  <Method String Class.toString()>
	//*  29   66:ldc1            #94  <String "com.actionbarsherlock">
	//*  30   68:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  31   71:ifeq            101
		{
			obj = ((Object) (obj2.getClass().getSuperclass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mChildren")));
	//   32   74:aload           6
	//   33   76:invokevirtual   #18  <Method Class Object.getClass()>
	//   34   79:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   35   82:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   36   85:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   37   88:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   38   91:ldc1            #96  <String "mChildren">
	//   39   93:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   40   96:astore          5
			break MISSING_BLOCK_LABEL_159;
	//   41   98:goto            159
		}
		if(obj2.getClass().toString().contains("android.support.v7"))
	//*  42  101:aload           6
	//*  43  103:invokevirtual   #18  <Method Class Object.getClass()>
	//*  44  106:invokevirtual   #92  <Method String Class.toString()>
	//*  45  109:ldc1            #98  <String "android.support.v7">
	//*  46  111:invokevirtual   #32  <Method boolean String.contains(CharSequence)>
	//*  47  114:ifeq            141
		{
			obj = ((Object) (obj2.getClass().getSuperclass().getSuperclass().getSuperclass().getDeclaredField("mChildren")));
	//   48  117:aload           6
	//   49  119:invokevirtual   #18  <Method Class Object.getClass()>
	//   50  122:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   51  125:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   52  128:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   53  131:ldc1            #96  <String "mChildren">
	//   54  133:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   55  136:astore          5
			break MISSING_BLOCK_LABEL_159;
	//   56  138:goto            159
		}
		obj = ((Object) (obj2.getClass().getSuperclass().getSuperclass().getDeclaredField("mChildren")));
	//   57  141:aload           6
	//   58  143:invokevirtual   #18  <Method Class Object.getClass()>
	//   59  146:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   60  149:invokevirtual   #64  <Method Class Class.getSuperclass()>
	//   61  152:ldc1            #96  <String "mChildren">
	//   62  154:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   63  157:astore          5
		int k;
		Object aobj[];
		((Field) (obj)).setAccessible(true);
	//   64  159:aload           5
	//   65  161:iconst_1        
	//   66  162:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		aobj = (Object[])((Field) (obj)).get(obj2);
	//   67  165:aload           5
	//   68  167:aload           6
	//   69  169:invokevirtual   #89  <Method Object Field.get(Object)>
	//   70  172:checkcast       #100 <Class Object[]>
	//   71  175:astore          5
		k = aobj.length;
	//   72  177:aload           5
	//   73  179:arraylength     
	//   74  180:istore_3        
		int j = 0;
	//   75  181:iconst_0        
	//   76  182:istore_2        
_L2:
		if(j >= k)
			break; /* Loop/switch isn't completed */
	//   77  183:iload_2         
	//   78  184:iload_3         
	//   79  185:icmpge          246
		obj2 = aobj[j];
	//   80  188:aload           5
	//   81  190:iload_2         
	//   82  191:aaload          
	//   83  192:astore          6
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_222;
	//   84  194:aload           6
	//   85  196:ifnull          222
		int l;
		obj2 = ((Object) ((View)obj2));
	//   86  199:aload           6
	//   87  201:checkcast       #102 <Class View>
	//   88  204:astore          6
		l = ((View) (obj2)).getId();
	//   89  206:aload           6
	//   90  208:invokevirtual   #106 <Method int View.getId()>
	//   91  211:istore          4
		if(l == i)
	//*  92  213:iload           4
	//*  93  215:iload_1         
	//*  94  216:icmpne          222
			return ((View) (obj2));
	//   95  219:aload           6
	//   96  221:areturn         
		j++;
	//   97  222:iload_2         
	//   98  223:iconst_1        
	//   99  224:iadd            
	//  100  225:istore_2        
		if(true) goto _L2; else goto _L1
	//  101  226:goto            183
		Object obj1;
		obj1;
	//  102  229:astore          5
		ThrowableExtension.printStackTrace(((Throwable) (obj1)));
	//  103  231:aload           5
	//  104  233:invokestatic    #112 <Method void ThrowableExtension.printStackTrace(Throwable)>
		  goto _L1
	//* 105  236:goto            246
		obj1;
	//  106  239:astore          5
		ThrowableExtension.printStackTrace(((Throwable) (obj1)));
	//  107  241:aload           5
	//  108  243:invokestatic    #112 <Method void ThrowableExtension.printStackTrace(Throwable)>
_L1:
		return null;
	//  109  246:aconst_null     
	//  110  247:areturn         
	}

	public View getOverflowView()
	{
		Object obj;
		obj = ((Object) (mAbsActionBarViewClass.getDeclaredField("mActionMenuPresenter")));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Class mAbsActionBarViewClass>
	//    2    4:ldc1            #75  <String "mActionMenuPresenter">
	//    3    6:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//    4    9:astore_1        
		((Field) (obj)).setAccessible(true);
	//    5   10:aload_1         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj = ((Field) (obj)).get(((Object) (mActionBarView)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field ViewParent mActionBarView>
	//   11   20:invokevirtual   #89  <Method Object Field.get(Object)>
	//   12   23:astore_1        
		Field field = obj.getClass().getDeclaredField("mOverflowButton");
	//   13   24:aload_1         
	//   14   25:invokevirtual   #18  <Method Class Object.getClass()>
	//   15   28:ldc1            #116 <String "mOverflowButton">
	//   16   30:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//   17   33:astore_2        
		field.setAccessible(true);
	//   18   34:aload_2         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj = ((Object) ((View)field.get(obj)));
	//   21   39:aload_2         
	//   22   40:aload_1         
	//   23   41:invokevirtual   #89  <Method Object Field.get(Object)>
	//   24   44:checkcast       #102 <Class View>
	//   25   47:astore_1        
		return ((View) (obj));
	//   26   48:aload_1         
	//   27   49:areturn         
		Object obj1;
		obj1;
	//   28   50:astore_1        
		ThrowableExtension.printStackTrace(((Throwable) (obj1)));
	//   29   51:aload_1         
	//   30   52:invokestatic    #112 <Method void ThrowableExtension.printStackTrace(Throwable)>
		break MISSING_BLOCK_LABEL_63;
	//   31   55:goto            63
		obj1;
	//   32   58:astore_1        
		ThrowableExtension.printStackTrace(((Throwable) (obj1)));
	//   33   59:aload_1         
	//   34   60:invokestatic    #112 <Method void ThrowableExtension.printStackTrace(Throwable)>
		return null;
	//   35   63:aconst_null     
	//   36   64:areturn         
	}

	public View getSpinnerView()
	{
		Object obj;
		obj = ((Object) (mActionBarViewClass.getDeclaredField("mSpinner")));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Class mActionBarViewClass>
	//    2    4:ldc1            #119 <String "mSpinner">
	//    3    6:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//    4    9:astore_1        
		((Field) (obj)).setAccessible(true);
	//    5   10:aload_1         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj = ((Object) ((View)((Field) (obj)).get(((Object) (mActionBarView)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field ViewParent mActionBarView>
	//   11   20:invokevirtual   #89  <Method Object Field.get(Object)>
	//   12   23:checkcast       #102 <Class View>
	//   13   26:astore_1        
		return ((View) (obj));
	//   14   27:aload_1         
	//   15   28:areturn         
		Object obj1;
		obj1;
	//   16   29:astore_1        
		Log.e("TAG", "Failed to access actionbar spinner", ((Throwable) (obj1)));
	//   17   30:ldc1            #121 <String "TAG">
	//   18   32:ldc1            #123 <String "Failed to access actionbar spinner">
	//   19   34:aload_1         
	//   20   35:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   21   38:pop             
		break MISSING_BLOCK_LABEL_52;
	//   22   39:goto            52
		obj1;
	//   23   42:astore_1        
		Log.e("TAG", "Failed to find actionbar spinner", ((Throwable) (obj1)));
	//   24   43:ldc1            #121 <String "TAG">
	//   25   45:ldc1            #131 <String "Failed to find actionbar spinner">
	//   26   47:aload_1         
	//   27   48:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   28   51:pop             
		return null;
	//   29   52:aconst_null     
	//   30   53:areturn         
	}

	public View getTitleView()
	{
		Object obj;
		obj = ((Object) (mActionBarViewClass.getDeclaredField("mTitleView")));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Class mActionBarViewClass>
	//    2    4:ldc1            #134 <String "mTitleView">
	//    3    6:invokevirtual   #79  <Method Field Class.getDeclaredField(String)>
	//    4    9:astore_1        
		((Field) (obj)).setAccessible(true);
	//    5   10:aload_1         
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #85  <Method void Field.setAccessible(boolean)>
		obj = ((Object) ((View)((Field) (obj)).get(((Object) (mActionBarView)))));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #59  <Field ViewParent mActionBarView>
	//   11   20:invokevirtual   #89  <Method Object Field.get(Object)>
	//   12   23:checkcast       #102 <Class View>
	//   13   26:astore_1        
		return ((View) (obj));
	//   14   27:aload_1         
	//   15   28:areturn         
		Object obj1;
		obj1;
	//   16   29:astore_1        
		Log.e("TAG", "Failed to access actionbar title", ((Throwable) (obj1)));
	//   17   30:ldc1            #121 <String "TAG">
	//   18   32:ldc1            #136 <String "Failed to access actionbar title">
	//   19   34:aload_1         
	//   20   35:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   21   38:pop             
		break MISSING_BLOCK_LABEL_52;
	//   22   39:goto            52
		obj1;
	//   23   42:astore_1        
		Log.e("TAG", "Failed to find actionbar title", ((Throwable) (obj1)));
	//   24   43:ldc1            #121 <String "TAG">
	//   25   45:ldc1            #138 <String "Failed to find actionbar title">
	//   26   47:aload_1         
	//   27   48:invokestatic    #129 <Method int Log.e(String, String, Throwable)>
	//   28   51:pop             
		return null;
	//   29   52:aconst_null     
	//   30   53:areturn         
	}

	private Class mAbsActionBarViewClass;
	private ViewParent mActionBarView;
	private Class mActionBarViewClass;
}
