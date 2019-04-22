// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.*;
import android.view.*;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ViewUtils

class TransitionUtils
{

	static View copyViewImage(ViewGroup viewgroup, View view, View view1)
	{
		Matrix matrix = new Matrix();
	//    0    0:new             #27  <Class Matrix>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void Matrix()>
	//    3    7:astore          7
		matrix.setTranslate(-view1.getScrollX(), -view1.getScrollY());
	//    4    9:aload           7
	//    5   11:aload_2         
	//    6   12:invokevirtual   #36  <Method int View.getScrollX()>
	//    7   15:ineg            
	//    8   16:i2f             
	//    9   17:aload_2         
	//   10   18:invokevirtual   #39  <Method int View.getScrollY()>
	//   11   21:ineg            
	//   12   22:i2f             
	//   13   23:invokevirtual   #43  <Method void Matrix.setTranslate(float, float)>
		ViewUtils.transformMatrixToGlobal(view, matrix);
	//   14   26:aload_1         
	//   15   27:aload           7
	//   16   29:invokestatic    #49  <Method void ViewUtils.transformMatrixToGlobal(View, Matrix)>
		ViewUtils.transformMatrixToLocal(((View) (viewgroup)), matrix);
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:invokestatic    #52  <Method void ViewUtils.transformMatrixToLocal(View, Matrix)>
		RectF rectf = new RectF(0.0F, 0.0F, view.getWidth(), view.getHeight());
	//   20   38:new             #54  <Class RectF>
	//   21   41:dup             
	//   22   42:fconst_0        
	//   23   43:fconst_0        
	//   24   44:aload_1         
	//   25   45:invokevirtual   #57  <Method int View.getWidth()>
	//   26   48:i2f             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #60  <Method int View.getHeight()>
	//   29   53:i2f             
	//   30   54:invokespecial   #63  <Method void RectF(float, float, float, float)>
	//   31   57:astore          8
		matrix.mapRect(rectf);
	//   32   59:aload           7
	//   33   61:aload           8
	//   34   63:invokevirtual   #67  <Method boolean Matrix.mapRect(RectF)>
	//   35   66:pop             
		int i = Math.round(rectf.left);
	//   36   67:aload           8
	//   37   69:getfield        #71  <Field float RectF.left>
	//   38   72:invokestatic    #77  <Method int Math.round(float)>
	//   39   75:istore_3        
		int j = Math.round(rectf.top);
	//   40   76:aload           8
	//   41   78:getfield        #80  <Field float RectF.top>
	//   42   81:invokestatic    #77  <Method int Math.round(float)>
	//   43   84:istore          4
		int k = Math.round(rectf.right);
	//   44   86:aload           8
	//   45   88:getfield        #83  <Field float RectF.right>
	//   46   91:invokestatic    #77  <Method int Math.round(float)>
	//   47   94:istore          5
		int l = Math.round(rectf.bottom);
	//   48   96:aload           8
	//   49   98:getfield        #86  <Field float RectF.bottom>
	//   50  101:invokestatic    #77  <Method int Math.round(float)>
	//   51  104:istore          6
		view1 = ((View) (new ImageView(view.getContext())));
	//   52  106:new             #88  <Class ImageView>
	//   53  109:dup             
	//   54  110:aload_1         
	//   55  111:invokevirtual   #92  <Method android.content.Context View.getContext()>
	//   56  114:invokespecial   #95  <Method void ImageView(android.content.Context)>
	//   57  117:astore_2        
		((ImageView) (view1)).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
	//   58  118:aload_2         
	//   59  119:getstatic       #101 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//   60  122:invokevirtual   #105 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		viewgroup = ((ViewGroup) (createViewBitmap(view, matrix, rectf, viewgroup)));
	//   61  125:aload_1         
	//   62  126:aload           7
	//   63  128:aload           8
	//   64  130:aload_0         
	//   65  131:invokestatic    #109 <Method Bitmap createViewBitmap(View, Matrix, RectF, ViewGroup)>
	//   66  134:astore_0        
		if(viewgroup != null)
	//*  67  135:aload_0         
	//*  68  136:ifnull          144
			((ImageView) (view1)).setImageBitmap(((Bitmap) (viewgroup)));
	//   69  139:aload_2         
	//   70  140:aload_0         
	//   71  141:invokevirtual   #113 <Method void ImageView.setImageBitmap(Bitmap)>
		((ImageView) (view1)).measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l - j, 0x40000000));
	//   72  144:aload_2         
	//   73  145:iload           5
	//   74  147:iload_3         
	//   75  148:isub            
	//   76  149:ldc1            #114 <Int 0x40000000>
	//   77  151:invokestatic    #120 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   78  154:iload           6
	//   79  156:iload           4
	//   80  158:isub            
	//   81  159:ldc1            #114 <Int 0x40000000>
	//   82  161:invokestatic    #120 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   83  164:invokevirtual   #124 <Method void ImageView.measure(int, int)>
		((ImageView) (view1)).layout(i, j, k, l);
	//   84  167:aload_2         
	//   85  168:iload_3         
	//   86  169:iload           4
	//   87  171:iload           5
	//   88  173:iload           6
	//   89  175:invokevirtual   #128 <Method void ImageView.layout(int, int, int, int)>
		return view1;
	//   90  178:aload_2         
	//   91  179:areturn         
	}

	private static Bitmap createViewBitmap(View view, Matrix matrix, RectF rectf, ViewGroup viewgroup)
	{
		boolean flag1 = HAS_IS_ATTACHED_TO_WINDOW;
	//    0    0:getstatic       #18  <Field boolean HAS_IS_ATTACHED_TO_WINDOW>
	//    1    3:istore          9
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore          6
		boolean flag;
		if(flag1)
	//*   4    8:iload           9
	//*   5   10:ifeq            40
		{
			flag = view.isAttachedToWindow() ^ true;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #132 <Method boolean View.isAttachedToWindow()>
	//    8   17:iconst_1        
	//    9   18:ixor            
	//   10   19:istore          5
			if(viewgroup == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       31
				flag1 = false;
	//   13   25:iconst_0        
	//   14   26:istore          9
			else
	//*  15   28:goto            46
				flag1 = viewgroup.isAttachedToWindow();
	//   16   31:aload_3         
	//   17   32:invokevirtual   #135 <Method boolean ViewGroup.isAttachedToWindow()>
	//   18   35:istore          9
		} else
	//*  19   37:goto            46
		{
			flag = false;
	//   20   40:iconst_0        
	//   21   41:istore          5
			flag1 = false;
	//   22   43:iconst_0        
	//   23   44:istore          9
		}
		boolean flag2 = HAS_OVERLAY;
	//   24   46:getstatic       #20  <Field boolean HAS_OVERLAY>
	//   25   49:istore          10
		Object obj1 = null;
	//   26   51:aconst_null     
	//   27   52:astore          13
		ViewGroup viewgroup1;
		if(flag2 && flag)
	//*  28   54:iload           10
	//*  29   56:ifeq            99
	//*  30   59:iload           5
	//*  31   61:ifeq            99
		{
			if(!flag1)
	//*  32   64:iload           9
	//*  33   66:ifne            71
				return null;
	//   34   69:aconst_null     
	//   35   70:areturn         
			viewgroup1 = (ViewGroup)view.getParent();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #139 <Method android.view.ViewParent View.getParent()>
	//   38   75:checkcast       #134 <Class ViewGroup>
	//   39   78:astore          12
			i = viewgroup1.indexOfChild(view);
	//   40   80:aload           12
	//   41   82:aload_0         
	//   42   83:invokevirtual   #143 <Method int ViewGroup.indexOfChild(View)>
	//   43   86:istore          6
			viewgroup.getOverlay().add(view);
	//   44   88:aload_3         
	//   45   89:invokevirtual   #147 <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//   46   92:aload_0         
	//   47   93:invokevirtual   #153 <Method void ViewGroupOverlay.add(View)>
		} else
	//*  48   96:goto            102
		{
			viewgroup1 = null;
	//   49   99:aconst_null     
	//   50  100:astore          12
		}
		int k = Math.round(rectf.width());
	//   51  102:aload_2         
	//   52  103:invokevirtual   #157 <Method float RectF.width()>
	//   53  106:invokestatic    #77  <Method int Math.round(float)>
	//   54  109:istore          8
		int j = Math.round(rectf.height());
	//   55  111:aload_2         
	//   56  112:invokevirtual   #160 <Method float RectF.height()>
	//   57  115:invokestatic    #77  <Method int Math.round(float)>
	//   58  118:istore          7
		Object obj = ((Object) (obj1));
	//   59  120:aload           13
	//   60  122:astore          11
		if(k > 0)
	//*  61  124:iload           8
	//*  62  126:ifle            280
		{
			obj = ((Object) (obj1));
	//   63  129:aload           13
	//   64  131:astore          11
			if(j > 0)
	//*  65  133:iload           7
	//*  66  135:ifle            280
			{
				float f = Math.min(1.0F, 1048576F / (float)(k * j));
	//   67  138:fconst_1        
	//   68  139:ldc1            #161 <Float 1048576F>
	//   69  141:iload           8
	//   70  143:iload           7
	//   71  145:imul            
	//   72  146:i2f             
	//   73  147:fdiv            
	//   74  148:invokestatic    #165 <Method float Math.min(float, float)>
	//   75  151:fstore          4
				k = Math.round((float)k * f);
	//   76  153:iload           8
	//   77  155:i2f             
	//   78  156:fload           4
	//   79  158:fmul            
	//   80  159:invokestatic    #77  <Method int Math.round(float)>
	//   81  162:istore          8
				j = Math.round((float)j * f);
	//   82  164:iload           7
	//   83  166:i2f             
	//   84  167:fload           4
	//   85  169:fmul            
	//   86  170:invokestatic    #77  <Method int Math.round(float)>
	//   87  173:istore          7
				matrix.postTranslate(-rectf.left, -rectf.top);
	//   88  175:aload_1         
	//   89  176:aload_2         
	//   90  177:getfield        #71  <Field float RectF.left>
	//   91  180:fneg            
	//   92  181:aload_2         
	//   93  182:getfield        #80  <Field float RectF.top>
	//   94  185:fneg            
	//   95  186:invokevirtual   #169 <Method boolean Matrix.postTranslate(float, float)>
	//   96  189:pop             
				matrix.postScale(f, f);
	//   97  190:aload_1         
	//   98  191:fload           4
	//   99  193:fload           4
	//  100  195:invokevirtual   #172 <Method boolean Matrix.postScale(float, float)>
	//  101  198:pop             
				if(HAS_PICTURE_BITMAP)
	//* 102  199:getstatic       #22  <Field boolean HAS_PICTURE_BITMAP>
	//* 103  202:ifeq            248
				{
					rectf = ((RectF) (new Picture()));
	//  104  205:new             #174 <Class Picture>
	//  105  208:dup             
	//  106  209:invokespecial   #175 <Method void Picture()>
	//  107  212:astore_2        
					obj = ((Object) (((Picture) (rectf)).beginRecording(k, j)));
	//  108  213:aload_2         
	//  109  214:iload           8
	//  110  216:iload           7
	//  111  218:invokevirtual   #179 <Method Canvas Picture.beginRecording(int, int)>
	//  112  221:astore          11
					((Canvas) (obj)).concat(matrix);
	//  113  223:aload           11
	//  114  225:aload_1         
	//  115  226:invokevirtual   #185 <Method void Canvas.concat(Matrix)>
					view.draw(((Canvas) (obj)));
	//  116  229:aload_0         
	//  117  230:aload           11
	//  118  232:invokevirtual   #189 <Method void View.draw(Canvas)>
					((Picture) (rectf)).endRecording();
	//  119  235:aload_2         
	//  120  236:invokevirtual   #192 <Method void Picture.endRecording()>
					obj = ((Object) (Bitmap.createBitmap(((Picture) (rectf)))));
	//  121  239:aload_2         
	//  122  240:invokestatic    #198 <Method Bitmap Bitmap.createBitmap(Picture)>
	//  123  243:astore          11
				} else
	//* 124  245:goto            280
				{
					obj = ((Object) (Bitmap.createBitmap(k, j, android.graphics.Bitmap.Config.ARGB_8888)));
	//  125  248:iload           8
	//  126  250:iload           7
	//  127  252:getstatic       #204 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//  128  255:invokestatic    #207 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//  129  258:astore          11
					rectf = ((RectF) (new Canvas(((Bitmap) (obj)))));
	//  130  260:new             #181 <Class Canvas>
	//  131  263:dup             
	//  132  264:aload           11
	//  133  266:invokespecial   #209 <Method void Canvas(Bitmap)>
	//  134  269:astore_2        
					((Canvas) (rectf)).concat(matrix);
	//  135  270:aload_2         
	//  136  271:aload_1         
	//  137  272:invokevirtual   #185 <Method void Canvas.concat(Matrix)>
					view.draw(((Canvas) (rectf)));
	//  138  275:aload_0         
	//  139  276:aload_2         
	//  140  277:invokevirtual   #189 <Method void View.draw(Canvas)>
				}
			}
		}
		if(HAS_OVERLAY && flag)
	//* 141  280:getstatic       #20  <Field boolean HAS_OVERLAY>
	//* 142  283:ifeq            307
	//* 143  286:iload           5
	//* 144  288:ifeq            307
		{
			viewgroup.getOverlay().remove(view);
	//  145  291:aload_3         
	//  146  292:invokevirtual   #147 <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//  147  295:aload_0         
	//  148  296:invokevirtual   #212 <Method void ViewGroupOverlay.remove(View)>
			viewgroup1.addView(view, i);
	//  149  299:aload           12
	//  150  301:aload_0         
	//  151  302:iload           6
	//  152  304:invokevirtual   #216 <Method void ViewGroup.addView(View, int)>
		}
		return ((Bitmap) (obj));
	//  153  307:aload           11
	//  154  309:areturn         
	}

	static Animator mergeAnimators(Animator animator, Animator animator1)
	{
		if(animator == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return animator1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(animator1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
		{
			return animator;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			AnimatorSet animatorset = new AnimatorSet();
	//    8   12:new             #220 <Class AnimatorSet>
	//    9   15:dup             
	//   10   16:invokespecial   #221 <Method void AnimatorSet()>
	//   11   19:astore_2        
			animatorset.playTogether(new Animator[] {
				animator, animator1
			});
	//   12   20:aload_2         
	//   13   21:iconst_2        
	//   14   22:anewarray       Animator[]
	//   15   25:dup             
	//   16   26:iconst_0        
	//   17   27:aload_0         
	//   18   28:aastore         
	//   19   29:dup             
	//   20   30:iconst_1        
	//   21   31:aload_1         
	//   22   32:aastore         
	//   23   33:invokevirtual   #227 <Method void AnimatorSet.playTogether(Animator[])>
			return ((Animator) (animatorset));
	//   24   36:aload_2         
	//   25   37:areturn         
		}
	}

	private static final boolean HAS_IS_ATTACHED_TO_WINDOW;
	private static final boolean HAS_OVERLAY;
	private static final boolean HAS_PICTURE_BITMAP;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		boolean flag;
		if(i >= 19)
	//*   4    6:iload_0         
	//*   5    7:bipush          19
	//*   6    9:icmplt          17
			flag = true;
	//    7   12:iconst_1        
	//    8   13:istore_1        
		else
	//*   9   14:goto            19
			flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_1        
		HAS_IS_ATTACHED_TO_WINDOW = flag;
	//   12   19:iload_1         
	//   13   20:putstatic       #18  <Field boolean HAS_IS_ATTACHED_TO_WINDOW>
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  14   23:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   26:bipush          18
	//*  16   28:icmplt          36
			flag = true;
	//   17   31:iconst_1        
	//   18   32:istore_1        
		else
	//*  19   33:goto            38
			flag = false;
	//   20   36:iconst_0        
	//   21   37:istore_1        
		HAS_OVERLAY = flag;
	//   22   38:iload_1         
	//   23   39:putstatic       #20  <Field boolean HAS_OVERLAY>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*  24   42:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   45:bipush          28
	//*  26   47:icmplt          55
			flag = flag1;
	//   27   50:iload_2         
	//   28   51:istore_1        
		else
	//*  29   52:goto            57
			flag = false;
	//   30   55:iconst_0        
	//   31   56:istore_1        
		HAS_PICTURE_BITMAP = flag;
	//   32   57:iload_1         
	//   33   58:putstatic       #22  <Field boolean HAS_PICTURE_BITMAP>
	//*  34   61:return          
	}
}
