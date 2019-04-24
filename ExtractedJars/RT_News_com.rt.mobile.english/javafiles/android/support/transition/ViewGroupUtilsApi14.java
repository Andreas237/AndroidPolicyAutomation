// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.*;

// Referenced classes of package android.support.transition:
//			ViewGroupUtilsImpl, ViewGroupOverlayApi14, ViewGroupOverlayImpl

class ViewGroupUtilsApi14
	implements ViewGroupUtilsImpl
{

	ViewGroupUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	private static void cancelLayoutTransition(LayoutTransition layouttransition)
	{
		NoSuchMethodException nosuchmethodexception;
		if(!sCancelMethodFetched)
	//*   0    0:getstatic       #42  <Field boolean sCancelMethodFetched>
	//*   1    3:ifne            42
		{
			try
			{
				sCancelMethod = ((Class) (android/animation/LayoutTransition)).getDeclaredMethod("cancel", new Class[0]);
	//    2    6:ldc1            #44  <Class LayoutTransition>
	//    3    8:ldc1            #46  <String "cancel">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #52  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #54  <Field Method sCancelMethod>
				sCancelMethod.setAccessible(true);
	//    8   20:getstatic       #54  <Field Method sCancelMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #60  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            38
	//*  12   30:ldc1            #18  <String "ViewGroupUtilsApi14">
	//*  13   32:ldc1            #62  <String "Failed to access cancel method by reflection">
	//*  14   34:invokestatic    #68  <Method int Log.i(String, String)>
	//*  15   37:pop             
	//*  16   38:iconst_1        
	//*  17   39:putstatic       #42  <Field boolean sCancelMethodFetched>
	//*  18   42:getstatic       #54  <Field Method sCancelMethod>
	//*  19   45:ifnull          78
	//*  20   48:getstatic       #54  <Field Method sCancelMethod>
	//*  21   51:aload_0         
	//*  22   52:iconst_0        
	//*  23   53:anewarray       Object[]
	//*  24   56:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//*  25   59:pop             
	//*  26   60:return          
	//*  27   61:ldc1            #18  <String "ViewGroupUtilsApi14">
	//*  28   63:ldc1            #74  <String "Failed to invoke cancel method by reflection">
	//*  29   65:invokestatic    #68  <Method int Log.i(String, String)>
	//*  30   68:pop             
	//*  31   69:return          
	//*  32   70:ldc1            #18  <String "ViewGroupUtilsApi14">
	//*  33   72:ldc1            #62  <String "Failed to access cancel method by reflection">
	//*  34   74:invokestatic    #68  <Method int Log.i(String, String)>
	//*  35   77:pop             
	//*  36   78:return          
			// Misplaced declaration of an exception variable
			catch(NoSuchMethodException nosuchmethodexception)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
			}
			sCancelMethodFetched = true;
		}
		if(sCancelMethod != null)
			try
			{
				sCancelMethod.invoke(((Object) (layouttransition)), new Object[0]);
				return;
			}
	//*  37   79:astore_1        
	//*  38   80:goto            30
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
			}
	//*  39   83:astore_0        
	//*  40   84:goto            70
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
				return;
			}
	//*  41   87:astore_0        
	//*  42   88:goto            61
	}

	public ViewGroupOverlayImpl getOverlay(ViewGroup viewgroup)
	{
		return ((ViewGroupOverlayImpl) (ViewGroupOverlayApi14.createFrom(viewgroup)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #83  <Method ViewGroupOverlayApi14 ViewGroupOverlayApi14.createFrom(ViewGroup)>
	//    2    4:areturn         
	}

	public void suppressLayout(ViewGroup viewgroup, boolean flag)
	{
		boolean flag1;
		LayoutTransition layouttransition = sEmptyLayoutTransition;
	//    0    0:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//    1    3:astore          5
		boolean flag2 = false;
	//    2    5:iconst_0        
	//    3    6:istore          4
		flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_3        
		if(layouttransition == null)
	//*   6   10:aload           5
	//*   7   12:ifnonnull       66
		{
			sEmptyLayoutTransition = ((LayoutTransition) (new LayoutTransition() {

				public boolean isChangingLayout()
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final ViewGroupUtilsApi14 this$0;

			
			{
				this$0 = ViewGroupUtilsApi14.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ViewGroupUtilsApi14 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void LayoutTransition()>
			//    5    9:return          
			}
			}
));
	//    8   15:new             #8   <Class ViewGroupUtilsApi14$1>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:invokespecial   #93  <Method void ViewGroupUtilsApi14$1(ViewGroupUtilsApi14)>
	//   12   23:putstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
			sEmptyLayoutTransition.setAnimator(2, ((android.animation.Animator) (null)));
	//   13   26:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   14   29:iconst_2        
	//   15   30:aconst_null     
	//   16   31:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(0, ((android.animation.Animator) (null)));
	//   17   34:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   18   37:iconst_0        
	//   19   38:aconst_null     
	//   20   39:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(1, ((android.animation.Animator) (null)));
	//   21   42:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   22   45:iconst_1        
	//   23   46:aconst_null     
	//   24   47:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(3, ((android.animation.Animator) (null)));
	//   25   50:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   26   53:iconst_3        
	//   27   54:aconst_null     
	//   28   55:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(4, ((android.animation.Animator) (null)));
	//   29   58:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   30   61:iconst_4        
	//   31   62:aconst_null     
	//   32   63:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
		}
		if(flag)
	//*  33   66:iload_2         
	//*  34   67:ifeq            119
		{
			LayoutTransition layouttransition1 = viewgroup.getLayoutTransition();
	//   35   70:aload_1         
	//   36   71:invokevirtual   #103 <Method LayoutTransition ViewGroup.getLayoutTransition()>
	//   37   74:astore          5
			if(layouttransition1 != null)
	//*  38   76:aload           5
	//*  39   78:ifnull          111
			{
				if(layouttransition1.isRunning())
	//*  40   81:aload           5
	//*  41   83:invokevirtual   #107 <Method boolean LayoutTransition.isRunning()>
	//*  42   86:ifeq            94
					cancelLayoutTransition(layouttransition1);
	//   43   89:aload           5
	//   44   91:invokestatic    #109 <Method void cancelLayoutTransition(LayoutTransition)>
				if(layouttransition1 != sEmptyLayoutTransition)
	//*  45   94:aload           5
	//*  46   96:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//*  47   99:if_acmpeq       111
					viewgroup.setTag(R.id.transition_layout_save, ((Object) (layouttransition1)));
	//   48  102:aload_1         
	//   49  103:getstatic       #114 <Field int R$id.transition_layout_save>
	//   50  106:aload           5
	//   51  108:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
			}
			viewgroup.setLayoutTransition(sEmptyLayoutTransition);
	//   52  111:aload_1         
	//   53  112:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   54  115:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
			return;
	//   55  118:return          
		}
		viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//   56  119:aload_1         
	//   57  120:aconst_null     
	//   58  121:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		if(!sLayoutSuppressedFieldFetched)
	//*  59  124:getstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  60  127:ifne            162
		{
			try
			{
				sLayoutSuppressedField = ((Class) (android/view/ViewGroup)).getDeclaredField("mLayoutSuppressed");
	//   61  130:ldc1            #99  <Class ViewGroup>
	//   62  132:ldc1            #125 <String "mLayoutSuppressed">
	//   63  134:invokevirtual   #129 <Method Field Class.getDeclaredField(String)>
	//   64  137:putstatic       #131 <Field Field sLayoutSuppressedField>
				sLayoutSuppressedField.setAccessible(true);
	//   65  140:getstatic       #131 <Field Field sLayoutSuppressedField>
	//   66  143:iconst_1        
	//   67  144:invokevirtual   #134 <Method void Field.setAccessible(boolean)>
			}
	//*  68  147:goto            158
	//*  69  150:ldc1            #18  <String "ViewGroupUtilsApi14">
	//*  70  152:ldc1            #136 <String "Failed to access mLayoutSuppressed field by reflection">
	//*  71  154:invokestatic    #68  <Method int Log.i(String, String)>
	//*  72  157:pop             
	//*  73  158:iconst_1        
	//*  74  159:putstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  75  162:iload           4
	//*  76  164:istore_2        
	//*  77  165:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  78  168:ifnull          208
	//*  79  171:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  80  174:aload_1         
	//*  81  175:invokevirtual   #140 <Method boolean Field.getBoolean(Object)>
	//*  82  178:istore_2        
	//*  83  179:iload_2         
	//*  84  180:ifeq            197
	//*  85  183:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  86  186:aload_1         
	//*  87  187:iconst_0        
	//*  88  188:invokevirtual   #144 <Method void Field.setBoolean(Object, boolean)>
	//*  89  191:goto            197
	//*  90  194:goto            200
	//*  91  197:goto            208
	//*  92  200:ldc1            #18  <String "ViewGroupUtilsApi14">
	//*  93  202:ldc1            #146 <String "Failed to get mLayoutSuppressed field by reflection">
	//*  94  204:invokestatic    #68  <Method int Log.i(String, String)>
	//*  95  207:pop             
	//*  96  208:iload_2         
	//*  97  209:ifeq            216
	//*  98  212:aload_1         
	//*  99  213:invokevirtual   #149 <Method void ViewGroup.requestLayout()>
	//* 100  216:aload_1         
	//* 101  217:getstatic       #114 <Field int R$id.transition_layout_save>
	//* 102  220:invokevirtual   #153 <Method Object ViewGroup.getTag(int)>
	//* 103  223:checkcast       #44  <Class LayoutTransition>
	//* 104  226:astore          5
	//* 105  228:aload           5
	//* 106  230:ifnull          247
	//* 107  233:aload_1         
	//* 108  234:getstatic       #114 <Field int R$id.transition_layout_save>
	//* 109  237:aconst_null     
	//* 110  238:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
	//* 111  241:aload_1         
	//* 112  242:aload           5
	//* 113  244:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
	//* 114  247:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
			}
			sLayoutSuppressedFieldFetched = true;
		}
		flag = flag2;
		if(sLayoutSuppressedField == null) goto _L2; else goto _L1
_L1:
		Object obj;
		try
		{
			flag = sLayoutSuppressedField.getBoolean(((Object) (viewgroup)));
		}
	//* 115  248:astore          5
	//* 116  250:goto            150
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 117  253:astore          5
		{
			flag = flag1;
	//  118  255:iload_3         
	//  119  256:istore_2        
			continue; /* Loop/switch isn't completed */
	//  120  257:goto            200
		}
		if(!flag) goto _L2; else goto _L3
_L3:
		sLayoutSuppressedField.setBoolean(((Object) (viewgroup)), false);
		  goto _L2
_L5:
		Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
_L2:
		if(flag)
			viewgroup.requestLayout();
		LayoutTransition layouttransition2 = (LayoutTransition)viewgroup.getTag(R.id.transition_layout_save);
		if(layouttransition2 != null)
		{
			viewgroup.setTag(R.id.transition_layout_save, ((Object) (null)));
			viewgroup.setLayoutTransition(layouttransition2);
		}
		return;
		obj;
	//  121  260:astore          5
		if(true) goto _L5; else goto _L4
	//  122  262:goto            194
_L4:
	}

	private static final int LAYOUT_TRANSITION_CHANGING = 4;
	private static final String TAG = "ViewGroupUtilsApi14";
	private static Method sCancelMethod;
	private static boolean sCancelMethodFetched;
	private static LayoutTransition sEmptyLayoutTransition;
	private static Field sLayoutSuppressedField;
	private static boolean sLayoutSuppressedFieldFetched;
}
