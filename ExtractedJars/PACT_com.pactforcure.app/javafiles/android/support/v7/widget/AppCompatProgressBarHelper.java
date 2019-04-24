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
		if(!(drawable instanceof DrawableWrapper)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:instanceof      #35  <Class DrawableWrapper>
	//    2    4:ifeq            45
_L1:
		Drawable drawable1 = ((DrawableWrapper)drawable).getWrappedDrawable();
	//    3    7:aload_1         
	//    4    8:checkcast       #35  <Class DrawableWrapper>
	//    5   11:invokeinterface #39  <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//    6   16:astore          6
		if(drawable1 != null)
	//*   7   18:aload           6
	//*   8   20:ifnull          43
		{
			drawable1 = tileify(drawable1, flag);
	//    9   23:aload_0         
	//   10   24:aload           6
	//   11   26:iload_2         
	//   12   27:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   13   30:astore          6
			((DrawableWrapper)drawable).setWrappedDrawable(drawable1);
	//   14   32:aload_1         
	//   15   33:checkcast       #35  <Class DrawableWrapper>
	//   16   36:aload           6
	//   17   38:invokeinterface #45  <Method void DrawableWrapper.setWrappedDrawable(Drawable)>
		}
_L4:
		return drawable;
	//   18   43:aload_1         
	//   19   44:areturn         
_L2:
		int i;
		int j;
		LayerDrawable layerdrawable;
		LayerDrawable layerdrawable1;
		if(!(drawable instanceof LayerDrawable))
			continue; /* Loop/switch isn't completed */
	//   20   45:aload_1         
	//   21   46:instanceof      #47  <Class LayerDrawable>
	//   22   49:ifeq            173
		layerdrawable1 = (LayerDrawable)drawable;
	//   23   52:aload_1         
	//   24   53:checkcast       #47  <Class LayerDrawable>
	//   25   56:astore          7
		j = layerdrawable1.getNumberOfLayers();
	//   26   58:aload           7
	//   27   60:invokevirtual   #51  <Method int LayerDrawable.getNumberOfLayers()>
	//   28   63:istore          4
		drawable = ((Drawable) (new Drawable[j]));
	//   29   65:iload           4
	//   30   67:anewarray       Drawable[]
	//   31   70:astore_1        
		i = 0;
	//   32   71:iconst_0        
	//   33   72:istore_3        
		while(i < j) 
	//*  34   73:iload_3         
	//*  35   74:iload           4
	//*  36   76:icmpge          133
		{
			int k = layerdrawable1.getId(i);
	//   37   79:aload           7
	//   38   81:iload_3         
	//   39   82:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   40   85:istore          5
			Drawable drawable2 = layerdrawable1.getDrawable(i);
	//   41   87:aload           7
	//   42   89:iload_3         
	//   43   90:invokevirtual   #61  <Method Drawable LayerDrawable.getDrawable(int)>
	//   44   93:astore          6
			if(k == 0x102000d || k == 0x102000f)
	//*  45   95:iload           5
	//*  46   97:ldc1            #62  <Int 0x102000d>
	//*  47   99:icmpeq          109
	//*  48  102:iload           5
	//*  49  104:ldc1            #63  <Int 0x102000f>
	//*  50  106:icmpne          128
				flag = true;
	//   51  109:iconst_1        
	//   52  110:istore_2        
			else
	//*  53  111:aload_1         
	//*  54  112:iload_3         
	//*  55  113:aload_0         
	//*  56  114:aload           6
	//*  57  116:iload_2         
	//*  58  117:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//*  59  120:aastore         
	//*  60  121:iload_3         
	//*  61  122:iconst_1        
	//*  62  123:iadd            
	//*  63  124:istore_3        
	//*  64  125:goto            73
				flag = false;
	//   65  128:iconst_0        
	//   66  129:istore_2        
			drawable[i] = ((/*<invalid signature>*/java.lang.Object) (tileify(drawable2, flag)));
			i++;
		}
	//*  67  130:goto            111
		layerdrawable = new LayerDrawable(((Drawable []) (drawable)));
	//   68  133:new             #47  <Class LayerDrawable>
	//   69  136:dup             
	//   70  137:aload_1         
	//   71  138:invokespecial   #66  <Method void LayerDrawable(Drawable[])>
	//   72  141:astore          6
		i = 0;
	//   73  143:iconst_0        
	//   74  144:istore_3        
_L5:
		drawable = ((Drawable) (layerdrawable));
	//   75  145:aload           6
	//   76  147:astore_1        
		if(i >= j) goto _L4; else goto _L3
	//   77  148:iload_3         
	//   78  149:iload           4
	//   79  151:icmpge          43
_L3:
		layerdrawable.setId(i, layerdrawable1.getId(i));
	//   80  154:aload           6
	//   81  156:iload_3         
	//   82  157:aload           7
	//   83  159:iload_3         
	//   84  160:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   85  163:invokevirtual   #70  <Method void LayerDrawable.setId(int, int)>
		i++;
	//   86  166:iload_3         
	//   87  167:iconst_1        
	//   88  168:iadd            
	//   89  169:istore_3        
		  goto _L5
	//*  90  170:goto            145
		if(!(drawable instanceof BitmapDrawable)) goto _L4; else goto _L6
	//   91  173:aload_1         
	//   92  174:instanceof      #72  <Class BitmapDrawable>
	//   93  177:ifeq            43
_L6:
		drawable = ((Drawable) ((BitmapDrawable)drawable));
	//   94  180:aload_1         
	//   95  181:checkcast       #72  <Class BitmapDrawable>
	//   96  184:astore_1        
		Object obj = ((Object) (((BitmapDrawable) (drawable)).getBitmap()));
	//   97  185:aload_1         
	//   98  186:invokevirtual   #76  <Method Bitmap BitmapDrawable.getBitmap()>
	//   99  189:astore          7
		if(mSampleTile == null)
	//* 100  191:aload_0         
	//* 101  192:getfield        #78  <Field Bitmap mSampleTile>
	//* 102  195:ifnonnull       204
			mSampleTile = ((Bitmap) (obj));
	//  103  198:aload_0         
	//  104  199:aload           7
	//  105  201:putfield        #78  <Field Bitmap mSampleTile>
		ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
	//  106  204:new             #80  <Class ShapeDrawable>
	//  107  207:dup             
	//  108  208:aload_0         
	//  109  209:invokespecial   #82  <Method Shape getDrawableShape()>
	//  110  212:invokespecial   #85  <Method void ShapeDrawable(Shape)>
	//  111  215:astore          6
		obj = ((Object) (new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP)));
	//  112  217:new             #87  <Class BitmapShader>
	//  113  220:dup             
	//  114  221:aload           7
	//  115  223:getstatic       #93  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//  116  226:getstatic       #96  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  117  229:invokespecial   #99  <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//  118  232:astore          7
		shapedrawable.getPaint().setShader(((android.graphics.Shader) (obj)));
	//  119  234:aload           6
	//  120  236:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  121  239:aload           7
	//  122  241:invokevirtual   #109 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  123  244:pop             
		shapedrawable.getPaint().setColorFilter(((BitmapDrawable) (drawable)).getPaint().getColorFilter());
	//  124  245:aload           6
	//  125  247:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  126  250:aload_1         
	//  127  251:invokevirtual   #110 <Method Paint BitmapDrawable.getPaint()>
	//  128  254:invokevirtual   #114 <Method android.graphics.ColorFilter Paint.getColorFilter()>
	//  129  257:invokevirtual   #118 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//  130  260:pop             
		drawable = ((Drawable) (shapedrawable));
	//  131  261:aload           6
	//  132  263:astore_1        
		if(flag)
	//* 133  264:iload_2         
	//* 134  265:ifeq            280
			drawable = ((Drawable) (new ClipDrawable(((Drawable) (shapedrawable)), 3, 1)));
	//  135  268:new             #120 <Class ClipDrawable>
	//  136  271:dup             
	//  137  272:aload           6
	//  138  274:iconst_3        
	//  139  275:iconst_1        
	//  140  276:invokespecial   #123 <Method void ClipDrawable(Drawable, int, int)>
	//  141  279:astore_1        
		return drawable;
	//  142  280:aload_1         
	//  143  281:areturn         
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
