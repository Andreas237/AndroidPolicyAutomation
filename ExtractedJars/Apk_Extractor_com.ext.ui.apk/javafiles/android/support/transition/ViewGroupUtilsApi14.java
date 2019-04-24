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
		if(!sCancelMethodFetched)
	//*   0    0:getstatic       #42  <Field boolean sCancelMethodFetched>
	//*   1    3:ifne            31
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
	//*  11   27:iconst_1        
	//*  12   28:putstatic       #42  <Field boolean sCancelMethodFetched>
	//*  13   31:getstatic       #54  <Field Method sCancelMethod>
	//*  14   34:ifnull          49
	//*  15   37:getstatic       #54  <Field Method sCancelMethod>
	//*  16   40:aload_0         
	//*  17   41:iconst_0        
	//*  18   42:anewarray       Object[]
	//*  19   45:invokevirtual   #64  <Method Object Method.invoke(Object, Object[])>
	//*  20   48:pop             
	//*  21   49:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  22   50:astore_1        
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
	//   23   51:ldc1            #18  <String "ViewGroupUtilsApi14">
	//   24   53:ldc1            #66  <String "Failed to access cancel method by reflection">
	//   25   55:invokestatic    #72  <Method int Log.i(String, String)>
	//   26   58:pop             
			}
			sCancelMethodFetched = true;
		}
		if(sCancelMethod == null)
			break MISSING_BLOCK_LABEL_49;
		sCancelMethod.invoke(((Object) (layouttransition)), new Object[0]);
		return;
	//*  27   59:goto            27
		layouttransition;
	//   28   62:astore_0        
		Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
	//   29   63:ldc1            #18  <String "ViewGroupUtilsApi14">
	//   30   65:ldc1            #66  <String "Failed to access cancel method by reflection">
	//   31   67:invokestatic    #72  <Method int Log.i(String, String)>
	//   32   70:pop             
		return;
	//   33   71:return          
		layouttransition;
	//   34   72:astore_0        
		Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
	//   35   73:ldc1            #18  <String "ViewGroupUtilsApi14">
	//   36   75:ldc1            #74  <String "Failed to invoke cancel method by reflection">
	//   37   77:invokestatic    #72  <Method int Log.i(String, String)>
	//   38   80:pop             
		return;
	//   39   81:return          
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
		boolean flag2;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		flag2 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		if(sEmptyLayoutTransition == null)
	//*   4    5:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//*   5    8:ifnonnull       62
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
	//    6   11:new             #8   <Class ViewGroupUtilsApi14$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #93  <Method void ViewGroupUtilsApi14$1(ViewGroupUtilsApi14)>
	//   10   19:putstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
			sEmptyLayoutTransition.setAnimator(2, ((android.animation.Animator) (null)));
	//   11   22:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   12   25:iconst_2        
	//   13   26:aconst_null     
	//   14   27:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(0, ((android.animation.Animator) (null)));
	//   15   30:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   16   33:iconst_0        
	//   17   34:aconst_null     
	//   18   35:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(1, ((android.animation.Animator) (null)));
	//   19   38:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   20   41:iconst_1        
	//   21   42:aconst_null     
	//   22   43:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(3, ((android.animation.Animator) (null)));
	//   23   46:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   24   49:iconst_3        
	//   25   50:aconst_null     
	//   26   51:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(4, ((android.animation.Animator) (null)));
	//   27   54:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   28   57:iconst_4        
	//   29   58:aconst_null     
	//   30   59:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
		}
		if(!flag) goto _L2; else goto _L1
	//   31   62:iload_2         
	//   32   63:ifeq            115
_L1:
		LayoutTransition layouttransition = viewgroup.getLayoutTransition();
	//   33   66:aload_1         
	//   34   67:invokevirtual   #103 <Method LayoutTransition ViewGroup.getLayoutTransition()>
	//   35   70:astore          5
		if(layouttransition != null)
	//*  36   72:aload           5
	//*  37   74:ifnull          107
		{
			if(layouttransition.isRunning())
	//*  38   77:aload           5
	//*  39   79:invokevirtual   #107 <Method boolean LayoutTransition.isRunning()>
	//*  40   82:ifeq            90
				cancelLayoutTransition(layouttransition);
	//   41   85:aload           5
	//   42   87:invokestatic    #109 <Method void cancelLayoutTransition(LayoutTransition)>
			if(layouttransition != sEmptyLayoutTransition)
	//*  43   90:aload           5
	//*  44   92:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//*  45   95:if_acmpeq       107
				viewgroup.setTag(R.id.transition_layout_save, ((Object) (layouttransition)));
	//   46   98:aload_1         
	//   47   99:getstatic       #114 <Field int R$id.transition_layout_save>
	//   48  102:aload           5
	//   49  104:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
		}
		viewgroup.setLayoutTransition(sEmptyLayoutTransition);
	//   50  107:aload_1         
	//   51  108:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   52  111:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
_L4:
		return;
	//   53  114:return          
_L2:
		viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//   54  115:aload_1         
	//   55  116:aconst_null     
	//   56  117:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		if(!sLayoutSuppressedFieldFetched)
	//*  57  120:getstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  58  123:ifne            147
		{
			LayoutTransition layouttransition1;
			try
			{
				sLayoutSuppressedField = ((Class) (android/view/ViewGroup)).getDeclaredField("mLayoutSuppressed");
	//   59  126:ldc1            #99  <Class ViewGroup>
	//   60  128:ldc1            #125 <String "mLayoutSuppressed">
	//   61  130:invokevirtual   #129 <Method Field Class.getDeclaredField(String)>
	//   62  133:putstatic       #131 <Field Field sLayoutSuppressedField>
				sLayoutSuppressedField.setAccessible(true);
	//   63  136:getstatic       #131 <Field Field sLayoutSuppressedField>
	//   64  139:iconst_1        
	//   65  140:invokevirtual   #134 <Method void Field.setAccessible(boolean)>
			}
	//*  66  143:iconst_1        
	//*  67  144:putstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  68  147:iload           4
	//*  69  149:istore_2        
	//*  70  150:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  71  153:ifnull          184
	//*  72  156:iload_3         
	//*  73  157:istore_2        
	//*  74  158:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  75  161:aload_1         
	//*  76  162:invokevirtual   #138 <Method boolean Field.getBoolean(Object)>
	//*  77  165:istore_3        
	//*  78  166:iload_3         
	//*  79  167:istore_2        
	//*  80  168:iload_3         
	//*  81  169:ifeq            184
	//*  82  172:iload_3         
	//*  83  173:istore_2        
	//*  84  174:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  85  177:aload_1         
	//*  86  178:iconst_0        
	//*  87  179:invokevirtual   #142 <Method void Field.setBoolean(Object, boolean)>
	//*  88  182:iload_3         
	//*  89  183:istore_2        
	//*  90  184:iload_2         
	//*  91  185:ifeq            192
	//*  92  188:aload_1         
	//*  93  189:invokevirtual   #145 <Method void ViewGroup.requestLayout()>
	//*  94  192:aload_1         
	//*  95  193:getstatic       #114 <Field int R$id.transition_layout_save>
	//*  96  196:invokevirtual   #149 <Method Object ViewGroup.getTag(int)>
	//*  97  199:checkcast       #44  <Class LayoutTransition>
	//*  98  202:astore          5
	//*  99  204:aload           5
	//* 100  206:ifnull          114
	//* 101  209:aload_1         
	//* 102  210:getstatic       #114 <Field int R$id.transition_layout_save>
	//* 103  213:aconst_null     
	//* 104  214:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
	//* 105  217:aload_1         
	//* 106  218:aload           5
	//* 107  220:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
	//* 108  223:return          
			catch(NoSuchFieldException nosuchfieldexception)
	//* 109  224:astore          5
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
	//  110  226:ldc1            #18  <String "ViewGroupUtilsApi14">
	//  111  228:ldc1            #151 <String "Failed to access mLayoutSuppressed field by reflection">
	//  112  230:invokestatic    #72  <Method int Log.i(String, String)>
	//  113  233:pop             
			}
			sLayoutSuppressedFieldFetched = true;
		}
		flag = flag2;
		if(sLayoutSuppressedField == null)
			break MISSING_BLOCK_LABEL_184;
		flag = flag1;
		flag1 = sLayoutSuppressedField.getBoolean(((Object) (viewgroup)));
		flag = flag1;
		if(!flag1)
			break MISSING_BLOCK_LABEL_184;
		flag = flag1;
		sLayoutSuppressedField.setBoolean(((Object) (viewgroup)), false);
		flag = flag1;
_L5:
		if(flag)
			viewgroup.requestLayout();
		layouttransition1 = (LayoutTransition)viewgroup.getTag(R.id.transition_layout_save);
		if(layouttransition1 != null)
		{
			viewgroup.setTag(R.id.transition_layout_save, ((Object) (null)));
			viewgroup.setLayoutTransition(layouttransition1);
			return;
		}
		if(true) goto _L4; else goto _L3
_L3:
	//* 114  234:goto            143
		IllegalAccessException illegalaccessexception;
		illegalaccessexception;
	//  115  237:astore          5
		Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
	//  116  239:ldc1            #18  <String "ViewGroupUtilsApi14">
	//  117  241:ldc1            #153 <String "Failed to get mLayoutSuppressed field by reflection">
	//  118  243:invokestatic    #72  <Method int Log.i(String, String)>
	//  119  246:pop             
		  goto _L5
	//* 120  247:goto            184
	}

	private static final int LAYOUT_TRANSITION_CHANGING = 4;
	private static final String TAG = "ViewGroupUtilsApi14";
	private static Method sCancelMethod;
	private static boolean sCancelMethodFetched;
	private static LayoutTransition sEmptyLayoutTransition;
	private static Field sLayoutSuppressedField;
	private static boolean sLayoutSuppressedFieldFetched;
}
