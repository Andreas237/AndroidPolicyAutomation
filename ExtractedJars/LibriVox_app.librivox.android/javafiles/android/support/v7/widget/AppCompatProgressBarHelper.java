// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.*;
import android.graphics.drawable.*;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.graphics.drawable.c;
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
		if(drawable instanceof c)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #35  <Class c>
	//*   2    4:ifeq            43
		{
			c c1 = (c)drawable;
	//    3    7:aload_1         
	//    4    8:checkcast       #35  <Class c>
	//    5   11:astore          7
			Drawable drawable1 = c1.a();
	//    6   13:aload           7
	//    7   15:invokeinterface #39  <Method Drawable c.a()>
	//    8   20:astore          8
			if(drawable1 != null)
	//*   9   22:aload           8
	//*  10   24:ifnull          283
			{
				c1.a(tileify(drawable1, flag));
	//   11   27:aload           7
	//   12   29:aload_0         
	//   13   30:aload           8
	//   14   32:iload_2         
	//   15   33:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   16   36:invokeinterface #44  <Method void c.a(Drawable)>
				return drawable;
	//   17   41:aload_1         
	//   18   42:areturn         
			}
		} else
		{
			if(drawable instanceof LayerDrawable)
	//*  19   43:aload_1         
	//*  20   44:instanceof      #46  <Class LayerDrawable>
	//*  21   47:ifeq            176
			{
				drawable = ((Drawable) ((LayerDrawable)drawable));
	//   22   50:aload_1         
	//   23   51:checkcast       #46  <Class LayerDrawable>
	//   24   54:astore_1        
				int k = ((LayerDrawable) (drawable)).getNumberOfLayers();
	//   25   55:aload_1         
	//   26   56:invokevirtual   #50  <Method int LayerDrawable.getNumberOfLayers()>
	//   27   59:istore          5
				Drawable adrawable[] = new Drawable[k];
	//   28   61:iload           5
	//   29   63:anewarray       Drawable[]
	//   30   66:astore          7
				boolean flag1 = false;
	//   31   68:iconst_0        
	//   32   69:istore          4
				for(int i = 0; i < k; i++)
	//*  33   71:iconst_0        
	//*  34   72:istore_3        
	//*  35   73:iload_3         
	//*  36   74:iload           5
	//*  37   76:icmpge          135
				{
					int l = ((LayerDrawable) (drawable)).getId(i);
	//   38   79:aload_1         
	//   39   80:iload_3         
	//   40   81:invokevirtual   #56  <Method int LayerDrawable.getId(int)>
	//   41   84:istore          6
					Drawable drawable2 = ((LayerDrawable) (drawable)).getDrawable(i);
	//   42   86:aload_1         
	//   43   87:iload_3         
	//   44   88:invokevirtual   #60  <Method Drawable LayerDrawable.getDrawable(int)>
	//   45   91:astore          8
					if(l != 0x102000d && l != 0x102000f)
	//*  46   93:iload           6
	//*  47   95:ldc1            #61  <Int 0x102000d>
	//*  48   97:icmpeq          115
	//*  49  100:iload           6
	//*  50  102:ldc1            #62  <Int 0x102000f>
	//*  51  104:icmpne          110
	//*  52  107:goto            115
						flag = false;
	//   53  110:iconst_0        
	//   54  111:istore_2        
					else
	//*  55  112:goto            117
						flag = true;
	//   56  115:iconst_1        
	//   57  116:istore_2        
					adrawable[i] = tileify(drawable2, flag);
	//   58  117:aload           7
	//   59  119:iload_3         
	//   60  120:aload_0         
	//   61  121:aload           8
	//   62  123:iload_2         
	//   63  124:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   64  127:aastore         
				}

	//   65  128:iload_3         
	//   66  129:iconst_1        
	//   67  130:iadd            
	//   68  131:istore_3        
	//*  69  132:goto            73
				LayerDrawable layerdrawable = new LayerDrawable(adrawable);
	//   70  135:new             #46  <Class LayerDrawable>
	//   71  138:dup             
	//   72  139:aload           7
	//   73  141:invokespecial   #65  <Method void LayerDrawable(Drawable[])>
	//   74  144:astore          7
				for(int j = ((int) (flag1)); j < k; j++)
	//*  75  146:iload           4
	//*  76  148:istore_3        
	//*  77  149:iload_3         
	//*  78  150:iload           5
	//*  79  152:icmpge          173
					layerdrawable.setId(j, ((LayerDrawable) (drawable)).getId(j));
	//   80  155:aload           7
	//   81  157:iload_3         
	//   82  158:aload_1         
	//   83  159:iload_3         
	//   84  160:invokevirtual   #56  <Method int LayerDrawable.getId(int)>
	//   85  163:invokevirtual   #69  <Method void LayerDrawable.setId(int, int)>

	//   86  166:iload_3         
	//   87  167:iconst_1        
	//   88  168:iadd            
	//   89  169:istore_3        
	//*  90  170:goto            149
				return ((Drawable) (layerdrawable));
	//   91  173:aload           7
	//   92  175:areturn         
			}
			if(drawable instanceof BitmapDrawable)
	//*  93  176:aload_1         
	//*  94  177:instanceof      #71  <Class BitmapDrawable>
	//*  95  180:ifeq            283
			{
				drawable = ((Drawable) ((BitmapDrawable)drawable));
	//   96  183:aload_1         
	//   97  184:checkcast       #71  <Class BitmapDrawable>
	//   98  187:astore_1        
				Object obj = ((Object) (((BitmapDrawable) (drawable)).getBitmap()));
	//   99  188:aload_1         
	//  100  189:invokevirtual   #75  <Method Bitmap BitmapDrawable.getBitmap()>
	//  101  192:astore          8
				if(mSampleTile == null)
	//* 102  194:aload_0         
	//* 103  195:getfield        #77  <Field Bitmap mSampleTile>
	//* 104  198:ifnonnull       207
					mSampleTile = ((Bitmap) (obj));
	//  105  201:aload_0         
	//  106  202:aload           8
	//  107  204:putfield        #77  <Field Bitmap mSampleTile>
				ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
	//  108  207:new             #79  <Class ShapeDrawable>
	//  109  210:dup             
	//  110  211:aload_0         
	//  111  212:invokespecial   #81  <Method Shape getDrawableShape()>
	//  112  215:invokespecial   #84  <Method void ShapeDrawable(Shape)>
	//  113  218:astore          7
				obj = ((Object) (new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP)));
	//  114  220:new             #86  <Class BitmapShader>
	//  115  223:dup             
	//  116  224:aload           8
	//  117  226:getstatic       #92  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//  118  229:getstatic       #95  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  119  232:invokespecial   #98  <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//  120  235:astore          8
				shapedrawable.getPaint().setShader(((android.graphics.Shader) (obj)));
	//  121  237:aload           7
	//  122  239:invokevirtual   #102 <Method Paint ShapeDrawable.getPaint()>
	//  123  242:aload           8
	//  124  244:invokevirtual   #108 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  125  247:pop             
				shapedrawable.getPaint().setColorFilter(((BitmapDrawable) (drawable)).getPaint().getColorFilter());
	//  126  248:aload           7
	//  127  250:invokevirtual   #102 <Method Paint ShapeDrawable.getPaint()>
	//  128  253:aload_1         
	//  129  254:invokevirtual   #109 <Method Paint BitmapDrawable.getPaint()>
	//  130  257:invokevirtual   #113 <Method android.graphics.ColorFilter Paint.getColorFilter()>
	//  131  260:invokevirtual   #117 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//  132  263:pop             
				if(flag)
	//* 133  264:iload_2         
	//* 134  265:ifeq            280
					return ((Drawable) (new ClipDrawable(((Drawable) (shapedrawable)), 3, 1)));
	//  135  268:new             #119 <Class ClipDrawable>
	//  136  271:dup             
	//  137  272:aload           7
	//  138  274:iconst_3        
	//  139  275:iconst_1        
	//  140  276:invokespecial   #122 <Method void ClipDrawable(Drawable, int, int)>
	//  141  279:areturn         
				else
					return ((Drawable) (shapedrawable));
	//  142  280:aload           7
	//  143  282:areturn         
			}
		}
		return drawable;
	//  144  283:aload_1         
	//  145  284:areturn         
	}

	private Drawable tileifyIndeterminate(Drawable drawable)
	{
		Object obj = ((Object) (drawable));
	//    0    0:aload_1         
	//    1    1:astore          4
		if(drawable instanceof AnimationDrawable)
	//*   2    3:aload_1         
	//*   3    4:instanceof      #126 <Class AnimationDrawable>
	//*   4    7:ifeq            94
		{
			drawable = ((Drawable) ((AnimationDrawable)drawable));
	//    5   10:aload_1         
	//    6   11:checkcast       #126 <Class AnimationDrawable>
	//    7   14:astore_1        
			int j = ((AnimationDrawable) (drawable)).getNumberOfFrames();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #129 <Method int AnimationDrawable.getNumberOfFrames()>
	//   10   19:istore_3        
			obj = ((Object) (new AnimationDrawable()));
	//   11   20:new             #126 <Class AnimationDrawable>
	//   12   23:dup             
	//   13   24:invokespecial   #130 <Method void AnimationDrawable()>
	//   14   27:astore          4
			((AnimationDrawable) (obj)).setOneShot(((AnimationDrawable) (drawable)).isOneShot());
	//   15   29:aload           4
	//   16   31:aload_1         
	//   17   32:invokevirtual   #134 <Method boolean AnimationDrawable.isOneShot()>
	//   18   35:invokevirtual   #138 <Method void AnimationDrawable.setOneShot(boolean)>
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
	//   27   48:invokevirtual   #141 <Method Drawable AnimationDrawable.getFrame(int)>
	//   28   51:iconst_1        
	//   29   52:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   30   55:astore          5
				drawable1.setLevel(10000);
	//   31   57:aload           5
	//   32   59:sipush          10000
	//   33   62:invokevirtual   #145 <Method boolean Drawable.setLevel(int)>
	//   34   65:pop             
				((AnimationDrawable) (obj)).addFrame(drawable1, ((AnimationDrawable) (drawable)).getDuration(i));
	//   35   66:aload           4
	//   36   68:aload           5
	//   37   70:aload_1         
	//   38   71:iload_2         
	//   39   72:invokevirtual   #148 <Method int AnimationDrawable.getDuration(int)>
	//   40   75:invokevirtual   #152 <Method void AnimationDrawable.addFrame(Drawable, int)>
			}

	//   41   78:iload_2         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_2        
	//*  45   82:goto            40
			((AnimationDrawable) (obj)).setLevel(10000);
	//   46   85:aload           4
	//   47   87:sipush          10000
	//   48   90:invokevirtual   #153 <Method boolean AnimationDrawable.setLevel(int)>
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
	//    1    1:getfield        #77  <Field Bitmap mSampleTile>
	//    2    4:areturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, TINT_ATTRS, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ProgressBar mView>
	//    2    4:invokevirtual   #162 <Method android.content.Context ProgressBar.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #16  <Field int[] TINT_ATTRS>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #168 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		Drawable drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(0);
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #171 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   12   22:astore_3        
		if(drawable != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          39
			mView.setIndeterminateDrawable(tileifyIndeterminate(drawable));
	//   15   27:aload_0         
	//   16   28:getfield        #23  <Field ProgressBar mView>
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:invokespecial   #173 <Method Drawable tileifyIndeterminate(Drawable)>
	//   20   36:invokevirtual   #176 <Method void ProgressBar.setIndeterminateDrawable(Drawable)>
		drawable = ((TintTypedArray) (attributeset)).getDrawableIfKnown(1);
	//   21   39:aload_1         
	//   22   40:iconst_1        
	//   23   41:invokevirtual   #171 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
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
	//   33   59:invokevirtual   #179 <Method void ProgressBar.setProgressDrawable(Drawable)>
		((TintTypedArray) (attributeset)).recycle();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #182 <Method void TintTypedArray.recycle()>
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
