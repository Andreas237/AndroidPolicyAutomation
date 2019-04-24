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
		if(drawable instanceof DrawableWrapper)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #35  <Class DrawableWrapper>
	//*   2    4:ifeq            45
		{
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
			return drawable;
	//   18   43:aload_1         
	//   19   44:areturn         
		}
		if(drawable instanceof LayerDrawable)
	//*  20   45:aload_1         
	//*  21   46:instanceof      #47  <Class LayerDrawable>
	//*  22   49:ifeq            171
		{
			drawable = ((Drawable) ((LayerDrawable)drawable));
	//   23   52:aload_1         
	//   24   53:checkcast       #47  <Class LayerDrawable>
	//   25   56:astore_1        
			int k = ((LayerDrawable) (drawable)).getNumberOfLayers();
	//   26   57:aload_1         
	//   27   58:invokevirtual   #51  <Method int LayerDrawable.getNumberOfLayers()>
	//   28   61:istore          4
			Drawable adrawable[] = new Drawable[k];
	//   29   63:iload           4
	//   30   65:anewarray       Drawable[]
	//   31   68:astore          6
			for(int i = 0; i < k; i++)
	//*  32   70:iconst_0        
	//*  33   71:istore_3        
	//*  34   72:iload_3         
	//*  35   73:iload           4
	//*  36   75:icmpge          131
			{
				int l = ((LayerDrawable) (drawable)).getId(i);
	//   37   78:aload_1         
	//   38   79:iload_3         
	//   39   80:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   40   83:istore          5
				Drawable drawable2 = ((LayerDrawable) (drawable)).getDrawable(i);
	//   41   85:aload_1         
	//   42   86:iload_3         
	//   43   87:invokevirtual   #61  <Method Drawable LayerDrawable.getDrawable(int)>
	//   44   90:astore          7
				if(l == 0x102000d || l == 0x102000f)
	//*  45   92:iload           5
	//*  46   94:ldc1            #62  <Int 0x102000d>
	//*  47   96:icmpeq          106
	//*  48   99:iload           5
	//*  49  101:ldc1            #63  <Int 0x102000f>
	//*  50  103:icmpne          111
					flag = true;
	//   51  106:iconst_1        
	//   52  107:istore_2        
				else
	//*  53  108:goto            113
					flag = false;
	//   54  111:iconst_0        
	//   55  112:istore_2        
				adrawable[i] = tileify(drawable2, flag);
	//   56  113:aload           6
	//   57  115:iload_3         
	//   58  116:aload_0         
	//   59  117:aload           7
	//   60  119:iload_2         
	//   61  120:invokespecial   #41  <Method Drawable tileify(Drawable, boolean)>
	//   62  123:aastore         
			}

	//   63  124:iload_3         
	//   64  125:iconst_1        
	//   65  126:iadd            
	//   66  127:istore_3        
	//*  67  128:goto            72
			LayerDrawable layerdrawable = new LayerDrawable(adrawable);
	//   68  131:new             #47  <Class LayerDrawable>
	//   69  134:dup             
	//   70  135:aload           6
	//   71  137:invokespecial   #66  <Method void LayerDrawable(Drawable[])>
	//   72  140:astore          6
			for(int j = 0; j < k; j++)
	//*  73  142:iconst_0        
	//*  74  143:istore_3        
	//*  75  144:iload_3         
	//*  76  145:iload           4
	//*  77  147:icmpge          168
				layerdrawable.setId(j, ((LayerDrawable) (drawable)).getId(j));
	//   78  150:aload           6
	//   79  152:iload_3         
	//   80  153:aload_1         
	//   81  154:iload_3         
	//   82  155:invokevirtual   #57  <Method int LayerDrawable.getId(int)>
	//   83  158:invokevirtual   #70  <Method void LayerDrawable.setId(int, int)>

	//   84  161:iload_3         
	//   85  162:iconst_1        
	//   86  163:iadd            
	//   87  164:istore_3        
	//*  88  165:goto            144
			return ((Drawable) (layerdrawable));
	//   89  168:aload           6
	//   90  170:areturn         
		}
		if(drawable instanceof BitmapDrawable)
	//*  91  171:aload_1         
	//*  92  172:instanceof      #72  <Class BitmapDrawable>
	//*  93  175:ifeq            278
		{
			drawable = ((Drawable) ((BitmapDrawable)drawable));
	//   94  178:aload_1         
	//   95  179:checkcast       #72  <Class BitmapDrawable>
	//   96  182:astore_1        
			Object obj = ((Object) (((BitmapDrawable) (drawable)).getBitmap()));
	//   97  183:aload_1         
	//   98  184:invokevirtual   #76  <Method Bitmap BitmapDrawable.getBitmap()>
	//   99  187:astore          7
			if(mSampleTile == null)
	//* 100  189:aload_0         
	//* 101  190:getfield        #78  <Field Bitmap mSampleTile>
	//* 102  193:ifnonnull       202
				mSampleTile = ((Bitmap) (obj));
	//  103  196:aload_0         
	//  104  197:aload           7
	//  105  199:putfield        #78  <Field Bitmap mSampleTile>
			ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
	//  106  202:new             #80  <Class ShapeDrawable>
	//  107  205:dup             
	//  108  206:aload_0         
	//  109  207:invokespecial   #82  <Method Shape getDrawableShape()>
	//  110  210:invokespecial   #85  <Method void ShapeDrawable(Shape)>
	//  111  213:astore          6
			obj = ((Object) (new BitmapShader(((Bitmap) (obj)), android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP)));
	//  112  215:new             #87  <Class BitmapShader>
	//  113  218:dup             
	//  114  219:aload           7
	//  115  221:getstatic       #93  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.REPEAT>
	//  116  224:getstatic       #96  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  117  227:invokespecial   #99  <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//  118  230:astore          7
			shapedrawable.getPaint().setShader(((android.graphics.Shader) (obj)));
	//  119  232:aload           6
	//  120  234:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  121  237:aload           7
	//  122  239:invokevirtual   #109 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  123  242:pop             
			shapedrawable.getPaint().setColorFilter(((BitmapDrawable) (drawable)).getPaint().getColorFilter());
	//  124  243:aload           6
	//  125  245:invokevirtual   #103 <Method Paint ShapeDrawable.getPaint()>
	//  126  248:aload_1         
	//  127  249:invokevirtual   #110 <Method Paint BitmapDrawable.getPaint()>
	//  128  252:invokevirtual   #114 <Method android.graphics.ColorFilter Paint.getColorFilter()>
	//  129  255:invokevirtual   #118 <Method android.graphics.ColorFilter Paint.setColorFilter(android.graphics.ColorFilter)>
	//  130  258:pop             
			if(flag)
	//* 131  259:iload_2         
	//* 132  260:ifeq            275
				return ((Drawable) (new ClipDrawable(((Drawable) (shapedrawable)), 3, 1)));
	//  133  263:new             #120 <Class ClipDrawable>
	//  134  266:dup             
	//  135  267:aload           6
	//  136  269:iconst_3        
	//  137  270:iconst_1        
	//  138  271:invokespecial   #123 <Method void ClipDrawable(Drawable, int, int)>
	//  139  274:areturn         
			else
				return ((Drawable) (shapedrawable));
	//  140  275:aload           6
	//  141  277:areturn         
		} else
		{
			return drawable;
	//  142  278:aload_1         
	//  143  279:areturn         
		}
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
