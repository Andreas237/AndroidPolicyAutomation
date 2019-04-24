// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.*;

// Referenced classes of package o:
//			aq, am, al

class ar
	implements aq
{

	ar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private static void a(LayoutTransition layouttransition)
	{
		if(!c)
	//*   0    0:getstatic       #34  <Field boolean c>
	//*   1    3:ifne            43
		{
			try
			{
				b = ((Class) (android/animation/LayoutTransition)).getDeclaredMethod("cancel", new Class[0]);
	//    2    6:ldc1            #36  <Class LayoutTransition>
	//    3    8:ldc1            #38  <String "cancel">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #44  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #46  <Field Method b>
				b.setAccessible(true);
	//    8   20:getstatic       #46  <Field Method b>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #52  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            39
			catch(NoSuchMethodException nosuchmethodexception)
	//*  12   30:astore_1        
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
	//   13   31:ldc1            #54  <String "ViewGroupUtilsApi14">
	//   14   33:ldc1            #56  <String "Failed to access cancel method by reflection">
	//   15   35:invokestatic    #62  <Method int Log.i(String, String)>
	//   16   38:pop             
			}
			c = true;
	//   17   39:iconst_1        
	//   18   40:putstatic       #34  <Field boolean c>
		}
		if(b != null)
	//*  19   43:getstatic       #46  <Field Method b>
	//*  20   46:ifnull          81
			try
			{
				b.invoke(((Object) (layouttransition)), new Object[0]);
	//   21   49:getstatic       #46  <Field Method b>
	//   22   52:aload_0         
	//   23   53:iconst_0        
	//   24   54:anewarray       Object[]
	//   25   57:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   26   60:pop             
				return;
	//   27   61:return          
			}
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
	//*  28   62:astore_0        
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
	//   29   63:ldc1            #54  <String "ViewGroupUtilsApi14">
	//   30   65:ldc1            #56  <String "Failed to access cancel method by reflection">
	//   31   67:invokestatic    #62  <Method int Log.i(String, String)>
	//   32   70:pop             
				return;
	//   33   71:return          
			}
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
	//*  34   72:astore_0        
			{
				Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
	//   35   73:ldc1            #54  <String "ViewGroupUtilsApi14">
	//   36   75:ldc1            #68  <String "Failed to invoke cancel method by reflection">
	//   37   77:invokestatic    #62  <Method int Log.i(String, String)>
	//   38   80:pop             
			}
	//   39   81:return          
	}

	public al d(ViewGroup viewgroup)
	{
		return ((al) (am.e(viewgroup)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method am am.e(ViewGroup)>
	//    2    4:areturn         
	}

	public void e(ViewGroup viewgroup, boolean flag)
	{
		if(a == null)
	//*   0    0:getstatic       #81  <Field LayoutTransition a>
	//*   1    3:ifnonnull       57
		{
			a = ((LayoutTransition) (new LayoutTransition() {

				public boolean isChangingLayout()
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final ar c;

			
			{
				c = ar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ar c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void LayoutTransition()>
			//    5    9:return          
			}
			}
));
	//    2    6:new             #8   <Class ar$4>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #84  <Method void ar$4(ar)>
	//    6   14:putstatic       #81  <Field LayoutTransition a>
			a.setAnimator(2, ((android.animation.Animator) (null)));
	//    7   17:getstatic       #81  <Field LayoutTransition a>
	//    8   20:iconst_2        
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #88  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			a.setAnimator(0, ((android.animation.Animator) (null)));
	//   11   25:getstatic       #81  <Field LayoutTransition a>
	//   12   28:iconst_0        
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #88  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			a.setAnimator(1, ((android.animation.Animator) (null)));
	//   15   33:getstatic       #81  <Field LayoutTransition a>
	//   16   36:iconst_1        
	//   17   37:aconst_null     
	//   18   38:invokevirtual   #88  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			a.setAnimator(3, ((android.animation.Animator) (null)));
	//   19   41:getstatic       #81  <Field LayoutTransition a>
	//   20   44:iconst_3        
	//   21   45:aconst_null     
	//   22   46:invokevirtual   #88  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			a.setAnimator(4, ((android.animation.Animator) (null)));
	//   23   49:getstatic       #81  <Field LayoutTransition a>
	//   24   52:iconst_4        
	//   25   53:aconst_null     
	//   26   54:invokevirtual   #88  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
		}
		if(flag)
	//*  27   57:iload_2         
	//*  28   58:ifeq            110
		{
			LayoutTransition layouttransition = viewgroup.getLayoutTransition();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #94  <Method LayoutTransition ViewGroup.getLayoutTransition()>
	//   31   65:astore          4
			if(layouttransition != null)
	//*  32   67:aload           4
	//*  33   69:ifnull          102
			{
				if(layouttransition.isRunning())
	//*  34   72:aload           4
	//*  35   74:invokevirtual   #98  <Method boolean LayoutTransition.isRunning()>
	//*  36   77:ifeq            85
					a(layouttransition);
	//   37   80:aload           4
	//   38   82:invokestatic    #100 <Method void a(LayoutTransition)>
				if(layouttransition != a)
	//*  39   85:aload           4
	//*  40   87:getstatic       #81  <Field LayoutTransition a>
	//*  41   90:if_acmpeq       102
					viewgroup.setTag(android.support.transition.R.id.transition_layout_save, ((Object) (layouttransition)));
	//   42   93:aload_1         
	//   43   94:getstatic       #106 <Field int android.support.transition.R$id.transition_layout_save>
	//   44   97:aload           4
	//   45   99:invokevirtual   #110 <Method void ViewGroup.setTag(int, Object)>
			}
			viewgroup.setLayoutTransition(a);
	//   46  102:aload_1         
	//   47  103:getstatic       #81  <Field LayoutTransition a>
	//   48  106:invokevirtual   #113 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
			return;
	//   49  109:return          
		}
		viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//   50  110:aload_1         
	//   51  111:aconst_null     
	//   52  112:invokevirtual   #113 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		if(!e)
	//*  53  115:getstatic       #115 <Field boolean e>
	//*  54  118:ifne            155
		{
			try
			{
				d = ((Class) (android/view/ViewGroup)).getDeclaredField("mLayoutSuppressed");
	//   55  121:ldc1            #90  <Class ViewGroup>
	//   56  123:ldc1            #117 <String "mLayoutSuppressed">
	//   57  125:invokevirtual   #121 <Method Field Class.getDeclaredField(String)>
	//   58  128:putstatic       #123 <Field Field d>
				d.setAccessible(true);
	//   59  131:getstatic       #123 <Field Field d>
	//   60  134:iconst_1        
	//   61  135:invokevirtual   #126 <Method void Field.setAccessible(boolean)>
			}
	//*  62  138:goto            151
			catch(NoSuchFieldException nosuchfieldexception)
	//*  63  141:astore          4
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
	//   64  143:ldc1            #54  <String "ViewGroupUtilsApi14">
	//   65  145:ldc1            #128 <String "Failed to access mLayoutSuppressed field by reflection">
	//   66  147:invokestatic    #62  <Method int Log.i(String, String)>
	//   67  150:pop             
			}
			e = true;
	//   68  151:iconst_1        
	//   69  152:putstatic       #115 <Field boolean e>
		}
		flag = false;
	//   70  155:iconst_0        
	//   71  156:istore_2        
		boolean flag1 = false;
	//   72  157:iconst_0        
	//   73  158:istore_3        
		if(d == null)
			break MISSING_BLOCK_LABEL_204;
	//   74  159:getstatic       #123 <Field Field d>
	//   75  162:ifnull          204
		flag = flag1;
	//   76  165:iload_3         
	//   77  166:istore_2        
		boolean flag2 = d.getBoolean(((Object) (viewgroup)));
	//   78  167:getstatic       #123 <Field Field d>
	//   79  170:aload_1         
	//   80  171:invokevirtual   #132 <Method boolean Field.getBoolean(Object)>
	//   81  174:istore_3        
		if(!flag2)
			break MISSING_BLOCK_LABEL_189;
	//   82  175:iload_3         
	//   83  176:ifeq            189
		flag = flag2;
	//   84  179:iload_3         
	//   85  180:istore_2        
		d.setBoolean(((Object) (viewgroup)), false);
	//   86  181:getstatic       #123 <Field Field d>
	//   87  184:aload_1         
	//   88  185:iconst_0        
	//   89  186:invokevirtual   #136 <Method void Field.setBoolean(Object, boolean)>
		flag = flag2;
	//   90  189:iload_3         
	//   91  190:istore_2        
		break MISSING_BLOCK_LABEL_204;
	//   92  191:goto            204
		IllegalAccessException illegalaccessexception;
		illegalaccessexception;
	//   93  194:astore          4
		Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
	//   94  196:ldc1            #54  <String "ViewGroupUtilsApi14">
	//   95  198:ldc1            #138 <String "Failed to get mLayoutSuppressed field by reflection">
	//   96  200:invokestatic    #62  <Method int Log.i(String, String)>
	//   97  203:pop             
		if(flag)
	//*  98  204:iload_2         
	//*  99  205:ifeq            212
			viewgroup.requestLayout();
	//  100  208:aload_1         
	//  101  209:invokevirtual   #141 <Method void ViewGroup.requestLayout()>
		LayoutTransition layouttransition1 = (LayoutTransition)viewgroup.getTag(android.support.transition.R.id.transition_layout_save);
	//  102  212:aload_1         
	//  103  213:getstatic       #106 <Field int android.support.transition.R$id.transition_layout_save>
	//  104  216:invokevirtual   #145 <Method Object ViewGroup.getTag(int)>
	//  105  219:checkcast       #36  <Class LayoutTransition>
	//  106  222:astore          4
		if(layouttransition1 != null)
	//* 107  224:aload           4
	//* 108  226:ifnull          243
		{
			viewgroup.setTag(android.support.transition.R.id.transition_layout_save, ((Object) (null)));
	//  109  229:aload_1         
	//  110  230:getstatic       #106 <Field int android.support.transition.R$id.transition_layout_save>
	//  111  233:aconst_null     
	//  112  234:invokevirtual   #110 <Method void ViewGroup.setTag(int, Object)>
			viewgroup.setLayoutTransition(layouttransition1);
	//  113  237:aload_1         
	//  114  238:aload           4
	//  115  240:invokevirtual   #113 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		}
		return;
	//  116  243:return          
	}

	private static LayoutTransition a;
	private static Method b;
	private static boolean c;
	private static Field d;
	private static boolean e;
}
