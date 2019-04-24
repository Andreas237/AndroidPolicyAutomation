// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.widget.ProgressBar;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray

class AppCompatProgressBarHelper
{

	AppCompatProgressBarHelper(ProgressBar progressbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mView = progressbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field ProgressBar mView>
	//    5    9:return          
	}

	private Shape getDrawableShape()
	{
		return ((Shape) (new RoundRectShape(new float[] {
			5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
		}, ((android.graphics.RectF) (null)), ((float []) (null)))));
	//    0    0:new             #27  <Class RoundRectShape>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:newarray        float[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #28  <Float 5F>
	//    7   12:fastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #28  <Float 5F>
	//   11   17:fastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #28  <Float 5F>
	//   15   22:fastore         
	//   16   23:dup             
	//   17   24:iconst_3        
	//   18   25:ldc1            #28  <Float 5F>
	//   19   27:fastore         
	//   20   28:dup             
	//   21   29:iconst_4        
	//   22   30:ldc1            #28  <Float 5F>
	//   23   32:fastore         
	//   24   33:dup             
	//   25   34:iconst_5        
	//   26   35:ldc1            #28  <Float 5F>
	//   27   37:fastore         
	//   28   38:dup             
	//   29   39:bipush          6
	//   30   41:ldc1            #28  <Float 5F>
	//   31   43:fastore         
	//   32   44:dup             
	//   33   45:bipush          7
	//   34   47:ldc1            #28  <Float 5F>
	//   35   49:fastore         
	//   36   50:aconst_null     
	//   37   51:aconst_null     
	//   38   52:invokespecial   #31  <Method void RoundRectShape(float[], android.graphics.RectF, float[])>
	//   39   55:areturn         
	}

	private Drawable tileify(Drawable drawable, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(!(drawable instanceof DrawableWrapper)) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:instanceof      #35  <Class DrawableWrapper>
	//    4    7:ifeq            48
_L1:
		Drawable drawable1 = ((DrawableWrapper)drawable).getWrappedDrawable();
	//    5   10:aload_1         
	//    6   11:checkcast       #35  <Class DrawableWrapper>
	//    7   14:invokeinterface #39  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//    8   19:astore          7
		if(drawable1 != null)
	//*   9   21:aload           7
	//*  10   23:ifnull          46
		{
			drawable1 = tileify(drawable1, flag);
	//   11   26:aload_0         
	//   12   27:aload           7
	//   13   29:iload_2         
	//   14   30:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   15   33:astore          7
			((DrawableWrapper)drawable).setWrappedDrawable(drawable1);
	//   16   35:aload_1         
	//   17   36:checkcast       #35  <Class DrawableWrapper>
	//   18   39:aload           7
	//   19   41:invokeinterface #45  <Method void DrawableWrapper.setWrappedDrawable(Drawable)>
		}
_L4:
		return drawable;
	//   20   46:aload_1         
	//   21   47:areturn         
_L2:
		int i;
		int j;
		LayerDrawable layerdrawable;
		LayerDrawable layerdrawable1;
		if(!(drawable instanceof LayerDrawable))
			continue; /* Loop/switch isn't completed */
	//   22   48:aload_1         
	//   23   49:instanceof      #47  <Class LayerDrawable>
	//   24   52:ifeq            177
		layerdrawable1 = (LayerDrawable)drawable;
	//   25   55:aload_1         
	//   26   56:checkcast       #47  <Class LayerDrawable>
	//   27   59:astore          8
		j = layerdrawable1.getNumberOfLayers();
	//   28   61:aload           8
	//   29   63:invokevirtual   #51  <Method int LayerDrawable.getNumberOfLayers()>
	//   30   66:istore          5
		drawable = ((Drawable) (new Drawable[j]));
	//   31   68:iload           5
	//   32   70:anewarray       Drawable[]
	//   33   73:astore_1        
		i = 0;
	//   34   74:iconst_0        
	//   35   75:istore_3        
		while(i < j) 
	//*  36   76:iload_3         
	//*  37   77:iload           5
	//*  38   79:icmpge          136
		{
			int k = layerdrawable1.getId(i);
	//   39   82:aload           8
	//   40   84:iload_3         
	//   41   85:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   42   88:istore          6
			Drawable drawable2 = layerdrawable1.getDrawable(i);
	//   43   90:aload           8
	//   44   92:iload_3         
	//   45   93:invokevirtual   #61  <Method Drawable LayerDrawable.getDrawable(int)>
	//   46   96:astore          7
			if(k == 0x102000d || k == 0x102000f)
	//*  47   98:iload           6
	//*  48  100:ldc1            #62  <Int 0x102000d>
	//*  49  102:icmpeq          112
	//*  50  105:iload           6
	//*  51  107:ldc1            #63  <Int 0x102000f>
	//*  52  109:icmpne          131
				flag = true;
	//   53  112:iconst_1        
	//   54  113:istore_2        
			else
	//*  55  114:aload_1         
	//*  56  115:iload_3         
	//*  57  116:aload_0         
	//*  58  117:aload           7
	//*  59  119:iload_2         
	//*  60  120:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//*  61  123:aastore         
	//*  62  124:iload_3         
	//*  63  125:iconst_1        
	//*  64  126:iadd            
	//*  65  127:istore_3        
	//*  66  128:goto            76
				flag = false;
	//   67  131:iconst_0        
	//   68  132:istore_2        
			drawable[i] = ((/*<invalid signature>*/java.lang.Object) (tileify(drawable2, flag)));
			i++;
		}
	//*  69  133:goto            114
		layerdrawable = new LayerDrawable(((Drawable []) (drawable)));
	//   70  136:new             #47  <Class LayerDrawable>
	//   71  139:dup             
	//   72  140:aload_1         
	//   73  141:invokespecial   #66  <Method void LayerDrawable(Drawable[])>
	//   74  144:astore          7
		i = ((int) (flag1));
	//   75  146:iload           4
	//   76  148:istore_3        
_L5:
		drawable = ((Drawable) (layerdrawable));
	//   77  149:aload           7
	//   78  151:astore_1        
		if(i >= j) goto _L4; else goto _L3
	//   79  152:iload_3         
	//   80  153:iload           5
	//   81  155:icmpge          46
_L3:
		layerdrawable.setId(i, layerdrawable1.getId(i));
	//   82  158:aload           7
	//   83  160:iload_3         
	//   84  161:aload           8
	//   85  163:iload_3         
	//   86  164:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   87  167:invokevirtual   #70  <Method void LayerDrawable.setId(int, int)>
		i++;
	//   88  170:iload_3         
	//   89  171:iconst_1        
	//   90  172:iadd            
	//   91  173:istore_3        
		  goto _L5
	//*  92  174:goto            149
		if(!(drawable instanceof BitmapDrawable)) goto _L4; else goto _L6
	//   93  177:aload_1         
	//   94  178:instanceof      #72  <Class BitmapDrawable>
	//   95  181:ifeq            46
_L6:
		drawable = ((Drawable) ((BitmapDrawable)drawable));
	//   96  184:aload_1         
	//   97  185:checkcast       #72  <Class BitmapDrawable>
	//   98  188:astore_1        
		Object obj = ((Object) (((BitmapDrawable) (drawable)).getBitmap()));
	//   99  189:aload_1         
	//  100  190:invokevirtual   #76  <Method Bitmap BitmapDrawable.getBitmap()>
	//  101  193:astore          8
		if(mSampleTile == null)
	//* 102  195:aload_0         
	//* 103  196:getfield        #78  <Field Bitmap mSampleTile>
	//* 104  199:ifnonnull       208
			mSampleTile = ((Bitmap) (obj));
	//  105  202:aload_0         
	//  106  203:aload           8
	//  107  205:putfield        #78  <Field Bitmap mSampleTile>
		ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
	//  108  208:new             #80  <Class ShapeDrawable>
	//  109  211:dup             
	//  110  212:aload_0         
	//  111  213:invokespecial   #82  <Method Shape getDrawableShape()>
	//  112  216:invokespecial   #85  <Method void ShapeDrawable(Shape)>
	//  113  219:astore          7
		obj = ((Object) (new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP)));
	//  114  221:new             #87  <Class BitmapShader>
	//  115  224:dup             
	//  116  225:aload           8
	//  117  227:getstatic       #93  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//  118  230:getstatic       #96  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  119  233:invokespecial   #99  <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//  120  236:astore          8
		shapedrawable.getPaint().setShader(((android.graphics.Shader) (obj)));
	//  121  238:aload           7
	//  122  240:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  123  243:aload           8
	//  124  245:invokevirtual   #109 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  125  248:pop             
		shapedrawable.getPaint().setColorFilter(((BitmapDrawable) (drawable)).getPaint().getColorFilter());
	//  126  249:aload           7
	//  127  251:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  128  254:aload_1         
	//  129  255:invokevirtual   #110 <Method Paint BitmapDrawable.getPaint()>
	//  130  258:invokevirtual   #114 <Method android.graphics.ColorFilter Paint.getColorFilter()>
	//  131  261:invokevirtual   #118 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//  132  264:pop             
		if(flag)
	//* 133  265:iload_2         
	//* 134  266:ifeq            281
			return ((Drawable) (new ClipDrawable(((Drawable) (shapedrawable)), 3, 1)));
	//  135  269:new             #120 <Class ClipDrawable>
	//  136  272:dup             
	//  137  273:aload           7
	//  138  275:iconst_3        
	//  139  276:iconst_1        
	//  140  277:invokespecial   #123 <Method void ClipDrawable(Drawable, int, int)>
	//  141  280:areturn         
		else
			return ((Drawable) (shapedrawable));
	//  142  281:aload           7
	//  143  283:areturn         
	}

	private Drawable tileifyIndeterminate(Drawable drawable)
	{
		Object obj = ((Object) (drawable));
	//    0    0:aload_1         
	//    1    1:astore          4
		if(drawable instanceof AnimationDrawable)
	//*   2    3:aload_1         
	//*   3    4:instanceof      #127 <Class AnimationDrawable>
	//*   4    7:ifeq            94
		{
			drawable = ((Drawable) ((AnimationDrawable)drawable));
	//    5   10:aload_1         
	//    6   11:checkcast       #127 <Class AnimationDrawable>
	//    7   14:astore_1        
			int j = ((AnimationDrawable) (drawable)).getNumberOfFrames();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #130 <Method int AnimationDrawable.getNumberOfFrames()>
	//   10   19:istore_3        
			obj = ((Object) (new AnimationDrawable()));
	//   11   20:new             #127 <Class AnimationDrawable>
	//   12   23:dup             
	//   13   24:invokespecial   #131 <Method void AnimationDrawable()>
	//   14   27:astore          4
			((AnimationDrawable) (obj)).setOneShot(((AnimationDrawable) (drawable)).isOneShot());
	//   15   29:aload           4
	//   16   31:aload_1         
	//   17   32:invokevirtual   #135 <Method boolean AnimationDrawable.isOneShot()>
	//   18   35:invokevirtual   #139 <Method void AnimationDrawable.setOneShot(boolean)>
			for(int i = 0; i < j; i++)
	//*  19   38:iconst_0        
	//*  20   39:istore_2        
	//*  21   40:iload_2         
	//*  22   41:iload_3         
	//*  23   42:icmpge          85
			{
				Drawable drawable1 = tileify(((AnimationDrawable) (drawable)).getFrame(i), true);
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:iload_2         
	//   27   48:invokevirtual   #142 <Method Drawable AnimationDrawable.getFrame(int)>
	//   28   51:iconst_1        
	//   29   52:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   30   55:astore          5
				drawable1.setLevel(10000);
	//   31   57:aload           5
	//   32   59:sipush          10000
	//   33   62:invokevirtual   #146 <Method boolean Drawable.setLevel(int)>
	//   34   65:pop             
				((AnimationDrawable) (obj)).addFrame(drawable1, ((AnimationDrawable) (drawable)).getDuration(i));
	//   35   66:aload           4
	//   36   68:aload           5
	//   37   70:aload_1         
	//   38   71:iload_2         
	//   39   72:invokevirtual   #149 <Method int AnimationDrawable.getDuration(int)>
	//   40   75:invokevirtual   #153 <Method void AnimationDrawable.addFrame(Drawable, int)>
			}

	//   41   78:iload_2         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_2        
	//*  45   82:goto            40
			((AnimationDrawable) (obj)).setLevel(10000);
	//   46   85:aload           4
	//   47   87:sipush          10000
	//   48   90:invokevirtual   #154 <Method boolean AnimationDrawable.setLevel(int)>
	//   49   93:pop             
		}
		return ((Drawable) (obj));
	//   50   94:aload           4
	//   51   96:areturn         
	}

	Bitmap getSampleTime()
	{
		return mSampleTile;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Bitmap mSampleTile>
	//    2    4:areturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, TINT_ATTRS, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ProgressBar mView>
	//    2    4:invokevirtual   #163 <Method android.content.Context ProgressBar.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #16  <Field int[] TINT_ATTRS>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #169 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		Drawable drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(0);
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #172 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   12   22:astore_3        
		if(drawable != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          39
			mView.setIndeterminateDrawable(tileifyIndeterminate(drawable));
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field ProgressBar mView>
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:invokespecial   #174 <Method Drawable tileifyIndeterminate(Drawable)>
	//   20   36:invokevirtual   #177 <Method void ProgressBar.setIndeterminateDrawable(Drawable)>
		drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(1);
	//   21   39:aload_1         
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #172 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   24   44:astore_3        
		if(drawable != null)
	//*  25   45:aload_3         
	//*  26   46:ifnull          62
			mView.setProgressDrawable(tileify(drawable, false));
	//   27   49:aload_0         
	//   28   50:getfield        #23  <Field ProgressBar mView>
	//   29   53:aload_0         
	//   30   54:aload_3         
	//   31   55:iconst_0        
	//   32   56:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   33   59:invokevirtual   #180 <Method void ProgressBar.setProgressDrawable(Drawable)>
		((TintTypedArray) (attributeset)).recycle();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #183 <Method void TintTypedArray.recycle()>
	//   36   66:return          
	}

	private static final int TINT_ATTRS[] = {
		0x101013b, 0x101013c
	};
	private Bitmap mSampleTile;
	private final ProgressBar mView;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #13  <Int 0x101013b>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #14  <Int 0x101013c>
	//    9   12:iastore         
	//   10   13:putstatic       #16  <Field int[] TINT_ATTRS>
	//*  11   16:return          
	}
}
