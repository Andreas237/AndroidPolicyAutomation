// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.OverScroller;

// Referenced classes of package com.github.chrisbanes.photoview:
//			PhotoViewAttacher, Compat

private class PhotoViewAttacher$FlingRunnable
	implements Runnable
{

	public void cancelFling()
	{
		mScroller.forceFinished(true);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field OverScroller mScroller>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #36  <Method void OverScroller.forceFinished(boolean)>
	//    4    8:return          
	}

	public void fling(int i, int j, int k, int l)
	{
		RectF rectf = getDisplayRect();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field PhotoViewAttacher this$0>
	//    2    4:invokevirtual   #42  <Method RectF PhotoViewAttacher.getDisplayRect()>
	//    3    7:astore          10
		if(rectf == null)
	//*   4    9:aload           10
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		int k1 = Math.round(-rectf.left);
	//    7   15:aload           10
	//    8   17:getfield        #48  <Field float RectF.left>
	//    9   20:fneg            
	//   10   21:invokestatic    #54  <Method int Math.round(float)>
	//   11   24:istore          8
		float f = i;
	//   12   26:iload_1         
	//   13   27:i2f             
	//   14   28:fstore          5
		int i1;
		int j1;
		if(f < rectf.width())
	//*  15   30:fload           5
	//*  16   32:aload           10
	//*  17   34:invokevirtual   #58  <Method float RectF.width()>
	//*  18   37:fcmpg           
	//*  19   38:ifge            60
		{
			j1 = Math.round(rectf.width() - f);
	//   20   41:aload           10
	//   21   43:invokevirtual   #58  <Method float RectF.width()>
	//   22   46:fload           5
	//   23   48:fsub            
	//   24   49:invokestatic    #54  <Method int Math.round(float)>
	//   25   52:istore          7
			i1 = 0;
	//   26   54:iconst_0        
	//   27   55:istore          6
		} else
	//*  28   57:goto            69
		{
			i = k1;
	//   29   60:iload           8
	//   30   62:istore_1        
			j1 = i;
	//   31   63:iload_1         
	//   32   64:istore          7
			i1 = i;
	//   33   66:iload_1         
	//   34   67:istore          6
		}
		int l1 = Math.round(-rectf.top);
	//   35   69:aload           10
	//   36   71:getfield        #61  <Field float RectF.top>
	//   37   74:fneg            
	//   38   75:invokestatic    #54  <Method int Math.round(float)>
	//   39   78:istore          9
		f = j;
	//   40   80:iload_2         
	//   41   81:i2f             
	//   42   82:fstore          5
		if(f < rectf.height())
	//*  43   84:fload           5
	//*  44   86:aload           10
	//*  45   88:invokevirtual   #64  <Method float RectF.height()>
	//*  46   91:fcmpg           
	//*  47   92:ifge            112
		{
			j = Math.round(rectf.height() - f);
	//   48   95:aload           10
	//   49   97:invokevirtual   #64  <Method float RectF.height()>
	//   50  100:fload           5
	//   51  102:fsub            
	//   52  103:invokestatic    #54  <Method int Math.round(float)>
	//   53  106:istore_2        
			i = 0;
	//   54  107:iconst_0        
	//   55  108:istore_1        
		} else
	//*  56  109:goto            117
		{
			i = l1;
	//   57  112:iload           9
	//   58  114:istore_1        
			j = i;
	//   59  115:iload_1         
	//   60  116:istore_2        
		}
		mCurrentX = k1;
	//   61  117:aload_0         
	//   62  118:iload           8
	//   63  120:putfield        #66  <Field int mCurrentX>
		mCurrentY = l1;
	//   64  123:aload_0         
	//   65  124:iload           9
	//   66  126:putfield        #68  <Field int mCurrentY>
		if(k1 != j1 || l1 != j)
	//*  67  129:iload           8
	//*  68  131:iload           7
	//*  69  133:icmpne          142
	//*  70  136:iload           9
	//*  71  138:iload_2         
	//*  72  139:icmpeq          164
			mScroller.fling(k1, l1, k, l, i1, j1, i, j, 0, 0);
	//   73  142:aload_0         
	//   74  143:getfield        #30  <Field OverScroller mScroller>
	//   75  146:iload           8
	//   76  148:iload           9
	//   77  150:iload_3         
	//   78  151:iload           4
	//   79  153:iload           6
	//   80  155:iload           7
	//   81  157:iload_1         
	//   82  158:iload_2         
	//   83  159:iconst_0        
	//   84  160:iconst_0        
	//   85  161:invokevirtual   #71  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
	//   86  164:return          
	}

	public void run()
	{
		if(mScroller.isFinished())
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field OverScroller mScroller>
	//*   2    4:invokevirtual   #76  <Method boolean OverScroller.isFinished()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(mScroller.computeScrollOffset())
	//*   5   11:aload_0         
	//*   6   12:getfield        #30  <Field OverScroller mScroller>
	//*   7   15:invokevirtual   #79  <Method boolean OverScroller.computeScrollOffset()>
	//*   8   18:ifeq            96
		{
			int i = mScroller.getCurrX();
	//    9   21:aload_0         
	//   10   22:getfield        #30  <Field OverScroller mScroller>
	//   11   25:invokevirtual   #83  <Method int OverScroller.getCurrX()>
	//   12   28:istore_1        
			int j = mScroller.getCurrY();
	//   13   29:aload_0         
	//   14   30:getfield        #30  <Field OverScroller mScroller>
	//   15   33:invokevirtual   #86  <Method int OverScroller.getCurrY()>
	//   16   36:istore_2        
			PhotoViewAttacher.access$1000(PhotoViewAttacher.this).postTranslate(mCurrentX - i, mCurrentY - j);
	//   17   37:aload_0         
	//   18   38:getfield        #20  <Field PhotoViewAttacher this$0>
	//   19   41:invokestatic    #90  <Method Matrix PhotoViewAttacher.access$1000(PhotoViewAttacher)>
	//   20   44:aload_0         
	//   21   45:getfield        #66  <Field int mCurrentX>
	//   22   48:iload_1         
	//   23   49:isub            
	//   24   50:i2f             
	//   25   51:aload_0         
	//   26   52:getfield        #68  <Field int mCurrentY>
	//   27   55:iload_2         
	//   28   56:isub            
	//   29   57:i2f             
	//   30   58:invokevirtual   #96  <Method boolean Matrix.postTranslate(float, float)>
	//   31   61:pop             
			PhotoViewAttacher photoviewattacher = PhotoViewAttacher.this;
	//   32   62:aload_0         
	//   33   63:getfield        #20  <Field PhotoViewAttacher this$0>
	//   34   66:astore_3        
			PhotoViewAttacher.access$1200(photoviewattacher, PhotoViewAttacher.access$1100(photoviewattacher));
	//   35   67:aload_3         
	//   36   68:aload_3         
	//   37   69:invokestatic    #99  <Method Matrix PhotoViewAttacher.access$1100(PhotoViewAttacher)>
	//   38   72:invokestatic    #103 <Method void PhotoViewAttacher.access$1200(PhotoViewAttacher, Matrix)>
			mCurrentX = i;
	//   39   75:aload_0         
	//   40   76:iload_1         
	//   41   77:putfield        #66  <Field int mCurrentX>
			mCurrentY = j;
	//   42   80:aload_0         
	//   43   81:iload_2         
	//   44   82:putfield        #68  <Field int mCurrentY>
			Compat.postOnAnimation(((android.view.View) (PhotoViewAttacher.access$100(PhotoViewAttacher.this))), ((Runnable) (this)));
	//   45   85:aload_0         
	//   46   86:getfield        #20  <Field PhotoViewAttacher this$0>
	//   47   89:invokestatic    #107 <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   48   92:aload_0         
	//   49   93:invokestatic    #113 <Method void Compat.postOnAnimation(android.view.View, Runnable)>
		}
	//   50   96:return          
	}

	private int mCurrentX;
	private int mCurrentY;
	private final OverScroller mScroller;
	final PhotoViewAttacher this$0;

	public PhotoViewAttacher$FlingRunnable(Context context)
	{
		this$0 = PhotoViewAttacher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field PhotoViewAttacher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void Object()>
		mScroller = new OverScroller(context);
	//    5    9:aload_0         
	//    6   10:new             #25  <Class OverScroller>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #28  <Method void OverScroller(Context)>
	//   10   18:putfield        #30  <Field OverScroller mScroller>
	//   11   21:return          
	}
}
