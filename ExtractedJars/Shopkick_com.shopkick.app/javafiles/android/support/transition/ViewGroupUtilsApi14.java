// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.*;

class ViewGroupUtilsApi14
{

	private ViewGroupUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private static void cancelLayoutTransition(LayoutTransition layouttransition)
	{
		NoSuchMethodException nosuchmethodexception;
		if(!sCancelMethodFetched)
	//*   0    0:getstatic       #37  <Field boolean sCancelMethodFetched>
	//*   1    3:ifne            42
		{
			try
			{
				sCancelMethod = ((Class) (android/animation/LayoutTransition)).getDeclaredMethod("cancel", new Class[0]);
	//    2    6:ldc1            #39  <Class LayoutTransition>
	//    3    8:ldc1            #41  <String "cancel">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #47  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #49  <Field Method sCancelMethod>
				sCancelMethod.setAccessible(true);
	//    8   20:getstatic       #49  <Field Method sCancelMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #55  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            38
	//*  12   30:ldc1            #13  <String "ViewGroupUtilsApi14">
	//*  13   32:ldc1            #57  <String "Failed to access cancel method by reflection">
	//*  14   34:invokestatic    #63  <Method int Log.i(String, String)>
	//*  15   37:pop             
	//*  16   38:iconst_1        
	//*  17   39:putstatic       #37  <Field boolean sCancelMethodFetched>
	//*  18   42:getstatic       #49  <Field Method sCancelMethod>
	//*  19   45:astore_1        
	//*  20   46:aload_1         
	//*  21   47:ifnull          78
	//*  22   50:aload_1         
	//*  23   51:aload_0         
	//*  24   52:iconst_0        
	//*  25   53:anewarray       Object[]
	//*  26   56:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//*  27   59:pop             
	//*  28   60:return          
	//*  29   61:ldc1            #13  <String "ViewGroupUtilsApi14">
	//*  30   63:ldc1            #69  <String "Failed to invoke cancel method by reflection">
	//*  31   65:invokestatic    #63  <Method int Log.i(String, String)>
	//*  32   68:pop             
	//*  33   69:return          
	//*  34   70:ldc1            #13  <String "ViewGroupUtilsApi14">
	//*  35   72:ldc1            #57  <String "Failed to access cancel method by reflection">
	//*  36   74:invokestatic    #63  <Method int Log.i(String, String)>
	//*  37   77:pop             
	//*  38   78:return          
			// Misplaced declaration of an exception variable
			catch(NoSuchMethodException nosuchmethodexception)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
			}
			sCancelMethodFetched = true;
		}
		Method method = sCancelMethod;
		if(method != null)
			try
			{
				method.invoke(((Object) (layouttransition)), new Object[0]);
				return;
			}
	//*  39   79:astore_1        
	//*  40   80:goto            30
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
			}
	//*  41   83:astore_0        
	//*  42   84:goto            70
			// Misplaced declaration of an exception variable
			catch(LayoutTransition layouttransition)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
				return;
			}
	//*  43   87:astore_0        
	//*  44   88:goto            61
	}

	static void suppressLayout(ViewGroup viewgroup, boolean flag)
	{
		boolean flag1;
		Object obj;
		obj = ((Object) (sEmptyLayoutTransition));
	//    0    0:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//    1    3:astore          4
		boolean flag2 = false;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		flag1 = false;
	//    4    7:iconst_0        
	//    5    8:istore_2        
		if(obj == null)
	//*   6    9:aload           4
	//*   7   11:ifnonnull       64
		{
			sEmptyLayoutTransition = ((LayoutTransition) (new LayoutTransition() {

				public boolean isChangingLayout()
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

			}
));
	//    8   14:new             #6   <Class ViewGroupUtilsApi14$1>
	//    9   17:dup             
	//   10   18:invokespecial   #77  <Method void ViewGroupUtilsApi14$1()>
	//   11   21:putstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
			sEmptyLayoutTransition.setAnimator(2, ((android.animation.Animator) (null)));
	//   12   24:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   13   27:iconst_2        
	//   14   28:aconst_null     
	//   15   29:invokevirtual   #81  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(0, ((android.animation.Animator) (null)));
	//   16   32:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   17   35:iconst_0        
	//   18   36:aconst_null     
	//   19   37:invokevirtual   #81  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(1, ((android.animation.Animator) (null)));
	//   20   40:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   21   43:iconst_1        
	//   22   44:aconst_null     
	//   23   45:invokevirtual   #81  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(3, ((android.animation.Animator) (null)));
	//   24   48:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   25   51:iconst_3        
	//   26   52:aconst_null     
	//   27   53:invokevirtual   #81  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
			sEmptyLayoutTransition.setAnimator(4, ((android.animation.Animator) (null)));
	//   28   56:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   29   59:iconst_4        
	//   30   60:aconst_null     
	//   31   61:invokevirtual   #81  <Method void LayoutTransition.setAnimator(int, android.animation.Animator)>
		}
		if(flag)
	//*  32   64:iload_1         
	//*  33   65:ifeq            117
		{
			obj = ((Object) (viewgroup.getLayoutTransition()));
	//   34   68:aload_0         
	//   35   69:invokevirtual   #87  <Method LayoutTransition ViewGroup.getLayoutTransition()>
	//   36   72:astore          4
			if(obj != null)
	//*  37   74:aload           4
	//*  38   76:ifnull          109
			{
				if(((LayoutTransition) (obj)).isRunning())
	//*  39   79:aload           4
	//*  40   81:invokevirtual   #91  <Method boolean LayoutTransition.isRunning()>
	//*  41   84:ifeq            92
					cancelLayoutTransition(((LayoutTransition) (obj)));
	//   42   87:aload           4
	//   43   89:invokestatic    #93  <Method void cancelLayoutTransition(LayoutTransition)>
				if(obj != sEmptyLayoutTransition)
	//*  44   92:aload           4
	//*  45   94:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//*  46   97:if_acmpeq       109
					viewgroup.setTag(R.id.transition_layout_save, obj);
	//   47  100:aload_0         
	//   48  101:getstatic       #98  <Field int R$id.transition_layout_save>
	//   49  104:aload           4
	//   50  106:invokevirtual   #102 <Method void ViewGroup.setTag(int, Object)>
			}
			viewgroup.setLayoutTransition(sEmptyLayoutTransition);
	//   51  109:aload_0         
	//   52  110:getstatic       #76  <Field LayoutTransition sEmptyLayoutTransition>
	//   53  113:invokevirtual   #105 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
			return;
	//   54  116:return          
		}
		viewgroup.setLayoutTransition(((LayoutTransition) (null)));
	//   55  117:aload_0         
	//   56  118:aconst_null     
	//   57  119:invokevirtual   #105 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
		if(!sLayoutSuppressedFieldFetched)
	//*  58  122:getstatic       #107 <Field boolean sLayoutSuppressedFieldFetched>
	//*  59  125:ifne            160
		{
			try
			{
				sLayoutSuppressedField = ((Class) (android/view/ViewGroup)).getDeclaredField("mLayoutSuppressed");
	//   60  128:ldc1            #83  <Class ViewGroup>
	//   61  130:ldc1            #109 <String "mLayoutSuppressed">
	//   62  132:invokevirtual   #113 <Method Field Class.getDeclaredField(String)>
	//   63  135:putstatic       #115 <Field Field sLayoutSuppressedField>
				sLayoutSuppressedField.setAccessible(true);
	//   64  138:getstatic       #115 <Field Field sLayoutSuppressedField>
	//   65  141:iconst_1        
	//   66  142:invokevirtual   #118 <Method void Field.setAccessible(boolean)>
			}
	//*  67  145:goto            156
	//*  68  148:ldc1            #13  <String "ViewGroupUtilsApi14">
	//*  69  150:ldc1            #120 <String "Failed to access mLayoutSuppressed field by reflection">
	//*  70  152:invokestatic    #63  <Method int Log.i(String, String)>
	//*  71  155:pop             
	//*  72  156:iconst_1        
	//*  73  157:putstatic       #107 <Field boolean sLayoutSuppressedFieldFetched>
	//*  74  160:getstatic       #115 <Field Field sLayoutSuppressedField>
	//*  75  163:astore          4
	//*  76  165:iload_3         
	//*  77  166:istore_1        
	//*  78  167:aload           4
	//*  79  169:ifnull          208
	//*  80  172:aload           4
	//*  81  174:aload_0         
	//*  82  175:invokevirtual   #124 <Method boolean Field.getBoolean(Object)>
	//*  83  178:istore_1        
	//*  84  179:iload_1         
	//*  85  180:ifeq            197
	//*  86  183:getstatic       #115 <Field Field sLayoutSuppressedField>
	//*  87  186:aload_0         
	//*  88  187:iconst_0        
	//*  89  188:invokevirtual   #128 <Method void Field.setBoolean(Object, boolean)>
	//*  90  191:goto            197
	//*  91  194:goto            200
	//*  92  197:goto            208
	//*  93  200:ldc1            #13  <String "ViewGroupUtilsApi14">
	//*  94  202:ldc1            #130 <String "Failed to get mLayoutSuppressed field by reflection">
	//*  95  204:invokestatic    #63  <Method int Log.i(String, String)>
	//*  96  207:pop             
	//*  97  208:iload_1         
	//*  98  209:ifeq            216
	//*  99  212:aload_0         
	//* 100  213:invokevirtual   #133 <Method void ViewGroup.requestLayout()>
	//* 101  216:aload_0         
	//* 102  217:getstatic       #98  <Field int R$id.transition_layout_save>
	//* 103  220:invokevirtual   #137 <Method Object ViewGroup.getTag(int)>
	//* 104  223:checkcast       #39  <Class LayoutTransition>
	//* 105  226:astore          4
	//* 106  228:aload           4
	//* 107  230:ifnull          247
	//* 108  233:aload_0         
	//* 109  234:getstatic       #98  <Field int R$id.transition_layout_save>
	//* 110  237:aconst_null     
	//* 111  238:invokevirtual   #102 <Method void ViewGroup.setTag(int, Object)>
	//* 112  241:aload_0         
	//* 113  242:aload           4
	//* 114  244:invokevirtual   #105 <Method void ViewGroup.setLayoutTransition(LayoutTransition)>
	//* 115  247:return          
			// Misplaced declaration of an exception variable
			catch(Object obj1)
			{
				Log.i("ViewGroupUtilsApi14", "Failed to access mLayoutSuppressed field by reflection");
			}
			sLayoutSuppressedFieldFetched = true;
		}
		obj = ((Object) (sLayoutSuppressedField));
		flag = flag2;
		if(obj == null) goto _L2; else goto _L1
_L1:
		Object obj1;
		try
		{
			flag = ((Field) (obj)).getBoolean(((Object) (viewgroup)));
		}
	//* 116  248:astore          4
	//* 117  250:goto            148
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//* 118  253:astore          4
		{
			flag = flag1;
	//  119  255:iload_2         
	//  120  256:istore_1        
			continue; /* Loop/switch isn't completed */
	//  121  257:goto            200
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
		LayoutTransition layouttransition = (LayoutTransition)viewgroup.getTag(R.id.transition_layout_save);
		if(layouttransition != null)
		{
			viewgroup.setTag(R.id.transition_layout_save, ((Object) (null)));
			viewgroup.setLayoutTransition(layouttransition);
		}
		return;
		obj1;
	//  122  260:astore          4
		if(true) goto _L5; else goto _L4
	//  123  262:goto            194
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
