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
		if(sEmptyLayoutTransition == null)
	//*   0    0:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//*   1    3:ifnonnull       57
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
	//    2    6:new             #8   <Class ViewGroupUtilsApi14$1>
	//    3    9:dup             
	//    4   10:aload_0         
	//    5   11:invokespecial   #93  <Method void ViewGroupUtilsApi14$1(ViewGroupUtilsApi14)>
	//    6   14:putstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
			sEmptyLayoutTransition.setAnimator(2, ((android.animation.Animator) (null)));
	//    7   17:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//    8   20:iconst_2        
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(0, ((android.animation.Animator) (null)));
	//   11   25:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   12   28:iconst_0        
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(1, ((android.animation.Animator) (null)));
	//   15   33:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   16   36:iconst_1        
	//   17   37:aconst_null     
	//   18   38:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(3, ((android.animation.Animator) (null)));
	//   19   41:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   20   44:iconst_3        
	//   21   45:aconst_null     
	//   22   46:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(4, ((android.animation.Animator) (null)));
	//   23   49:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   24   52:iconst_4        
	//   25   53:aconst_null     
	//   26   54:invokevirtual   #97  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
		}
		if(!flag) goto _L2; else goto _L1
	//   27   57:iload_2         
	//   28   58:ifeq            110
_L1:
		LayoutTransition layouttransition = viewgroup.getLayoutTransition();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #103 <Method LayoutTransition ViewGroup.getLayoutTransition()>
	//   31   65:astore          4
		if(layouttransition != null)
	//*  32   67:aload           4
	//*  33   69:ifnull          102
		{
			if(layouttransition.isRunning())
	//*  34   72:aload           4
	//*  35   74:invokevirtual   #107 <Method boolean LayoutTransition.isRunning()>
	//*  36   77:ifeq            85
				cancelLayoutTransition(layouttransition);
	//   37   80:aload           4
	//   38   82:invokestatic    #109 <Method void cancelLayoutTransition(LayoutTransition)>
			if(layouttransition != sEmptyLayoutTransition)
	//*  39   85:aload           4
	//*  40   87:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//*  41   90:if_acmpeq       102
				viewgroup.setTag(R.id.transition_layout_save, ((Object) (layouttransition)));
	//   42   93:aload_1         
	//   43   94:getstatic       #114 <Field int R$id.transition_layout_save>
	//   44   97:aload           4
	//   45   99:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
		}
		viewgroup.setLayoutTransition(sEmptyLayoutTransition);
	//   46  102:aload_1         
	//   47  103:getstatic       #90  <Field LayoutTransition sEmptyLayoutTransition>
	//   48  106:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
_L4:
		return;
	//   49  109:return          
_L2:
		viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//   50  110:aload_1         
	//   51  111:aconst_null     
	//   52  112:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		if(!sLayoutSuppressedFieldFetched)
	//*  53  115:getstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  54  118:ifne            142
		{
			boolean flag1;
			LayoutTransition layouttransition1;
			try
			{
				sLayoutSuppressedField = ((Class) (android/view/ViewGroup)).getDeclaredField("mLayoutSuppressed");
	//   55  121:ldc1            #99  <Class ViewGroup>
	//   56  123:ldc1            #125 <String "mLayoutSuppressed">
	//   57  125:invokevirtual   #129 <Method Field Class.getDeclaredField(String)>
	//   58  128:putstatic       #131 <Field Field sLayoutSuppressedField>
				sLayoutSuppressedField.setAccessible(true);
	//   59  131:getstatic       #131 <Field Field sLayoutSuppressedField>
	//   60  134:iconst_1        
	//   61  135:invokevirtual   #134 <Method void Field.setAccessible(boolean)>
			}
	//*  62  138:iconst_1        
	//*  63  139:putstatic       #123 <Field boolean sLayoutSuppressedFieldFetched>
	//*  64  142:iconst_0        
	//*  65  143:istore_3        
	//*  66  144:iconst_0        
	//*  67  145:istore_2        
	//*  68  146:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  69  149:ifnull          180
	//*  70  152:iload_3         
	//*  71  153:istore_2        
	//*  72  154:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  73  157:aload_1         
	//*  74  158:invokevirtual   #138 <Method boolean Field.getBoolean(Object)>
	//*  75  161:istore_3        
	//*  76  162:iload_3         
	//*  77  163:istore_2        
	//*  78  164:iload_3         
	//*  79  165:ifeq            180
	//*  80  168:iload_3         
	//*  81  169:istore_2        
	//*  82  170:getstatic       #131 <Field Field sLayoutSuppressedField>
	//*  83  173:aload_1         
	//*  84  174:iconst_0        
	//*  85  175:invokevirtual   #142 <Method void Field.setBoolean(Object, boolean)>
	//*  86  178:iload_3         
	//*  87  179:istore_2        
	//*  88  180:iload_2         
	//*  89  181:ifeq            188
	//*  90  184:aload_1         
	//*  91  185:invokevirtual   #145 <Method void ViewGroup.requestLayout()>
	//*  92  188:aload_1         
	//*  93  189:getstatic       #114 <Field int R$id.transition_layout_save>
	//*  94  192:invokevirtual   #149 <Method Object ViewGroup.getTag(int)>
	//*  95  195:checkcast       #44  <Class LayoutTransition>
	//*  96  198:astore          4
	//*  97  200:aload           4
	//*  98  202:ifnull          109
	//*  99  205:aload_1         
	//* 100  206:getstatic       #114 <Field int R$id.transition_layout_save>
	//* 101  209:aconst_null     
	//* 102  210:invokevirtual   #118 <Method void ViewGroup.setTag(int, Object)>
	//* 103  213:aload_1         
	//* 104  214:aload           4
	//* 105  216:invokevirtual   #121 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
	//* 106  219:return          
			catch(NoSuchFieldException nosuchfieldexception)
	//* 107  220:astore          4
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
	//  108  222:ldc1            #18  <String "ViewGroupUtilsApi14">
	//  109  224:ldc1            #151 <String "Failed to access mLayoutSuppressed field by reflection">
	//  110  226:invokestatic    #72  <Method int Log.i(String, String)>
	//  111  229:pop             
			}
			sLayoutSuppressedFieldFetched = true;
		}
		flag1 = false;
		flag = false;
		if(sLayoutSuppressedField == null)
			break MISSING_BLOCK_LABEL_180;
		flag = flag1;
		flag1 = sLayoutSuppressedField.getBoolean(((Object) (viewgroup)));
		flag = flag1;
		if(!flag1)
			break MISSING_BLOCK_LABEL_180;
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
	//* 112  230:goto            138
		IllegalAccessException illegalaccessexception;
		illegalaccessexception;
	//  113  233:astore          4
		Log.i("ViewGroupUtilsApi14", "Failed to get mLayoutSuppressed field by reflection");
	//  114  235:ldc1            #18  <String "ViewGroupUtilsApi14">
	//  115  237:ldc1            #153 <String "Failed to get mLayoutSuppressed field by reflection">
	//  116  239:invokestatic    #72  <Method int Log.i(String, String)>
	//  117  242:pop             
		  goto _L5
	//* 118  243:goto            180
	}

	private static final int LAYOUT_TRANSITION_CHANGING = 4;
	private static final String TAG = "ViewGroupUtilsApi14";
	private static Method sCancelMethod;
	private static boolean sCancelMethodFetched;
	private static LayoutTransition sEmptyLayoutTransition;
	private static Field sLayoutSuppressedField;
	private static boolean sLayoutSuppressedFieldFetched;
}
