// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.*;

final class OverlayListView extends ListView
{
	public static class OverlayObject
	{

		public BitmapDrawable getBitmapDrawable()
		{
			return mBitmap;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field BitmapDrawable mBitmap>
		//    2    4:areturn         
		}

		public boolean isAnimationStarted()
		{
			return mIsAnimationStarted;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field boolean mIsAnimationStarted>
		//    2    4:ireturn         
		}

		public OverlayObject setAlphaAnimation(float f, float f1)
		{
			mStartAlpha = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #40  <Field float mStartAlpha>
			mEndAlpha = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #42  <Field float mEndAlpha>
			return this;
		//    6   10:aload_0         
		//    7   11:areturn         
		}

		public OverlayObject setAnimationEndListener(OnAnimationEndListener onanimationendlistener)
		{
			mListener = onanimationendlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public OverlayObject setDuration(long l)
		{
			mDuration = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #80  <Field long mDuration>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public OverlayObject setInterpolator(Interpolator interpolator)
		{
			mInterpolator = interpolator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #84  <Field Interpolator mInterpolator>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public OverlayObject setTranslateYAnimation(int i)
		{
			mDeltaY = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #88  <Field int mDeltaY>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public void startAnimation(long l)
		{
			mStartTime = l;
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:putfield        #92  <Field long mStartTime>
			mIsAnimationStarted = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #70  <Field boolean mIsAnimationStarted>
		//    6   10:return          
		}

		public void stopAnimation()
		{
			mIsAnimationStarted = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #70  <Field boolean mIsAnimationStarted>
			mIsAnimationEnded = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #95  <Field boolean mIsAnimationEnded>
			if(mListener != null)
		//*   6   10:aload_0         
		//*   7   11:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		//*   8   14:ifnull          26
				mListener.onAnimationEnd();
		//    9   17:aload_0         
		//   10   18:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		//   11   21:invokeinterface #98  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
		//   12   26:return          
		}

		public boolean update(long l)
		{
			if(mIsAnimationEnded)
		//*   0    0:aload_0         
		//*   1    1:getfield        #95  <Field boolean mIsAnimationEnded>
		//*   2    4:ifeq            9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			float f = Math.max(0.0F, Math.min(1.0F, (float)(l - mStartTime) / (float)mDuration));
		//    5    9:fconst_0        
		//    6   10:fconst_1        
		//    7   11:lload_1         
		//    8   12:aload_0         
		//    9   13:getfield        #92  <Field long mStartTime>
		//   10   16:lsub            
		//   11   17:l2f             
		//   12   18:aload_0         
		//   13   19:getfield        #80  <Field long mDuration>
		//   14   22:l2f             
		//   15   23:fdiv            
		//   16   24:invokestatic    #106 <Method float Math.min(float, float)>
		//   17   27:invokestatic    #109 <Method float Math.max(float, float)>
		//   18   30:fstore_3        
			if(!mIsAnimationStarted)
		//*  19   31:aload_0         
		//*  20   32:getfield        #70  <Field boolean mIsAnimationStarted>
		//*  21   35:ifne            40
				f = 0.0F;
		//   22   38:fconst_0        
		//   23   39:fstore_3        
			float f1;
			if(mInterpolator == null)
		//*  24   40:aload_0         
		//*  25   41:getfield        #84  <Field Interpolator mInterpolator>
		//*  26   44:ifnonnull       53
				f1 = f;
		//   27   47:fload_3         
		//   28   48:fstore          4
			else
		//*  29   50:goto            65
				f1 = mInterpolator.getInterpolation(f);
		//   30   53:aload_0         
		//   31   54:getfield        #84  <Field Interpolator mInterpolator>
		//   32   57:fload_3         
		//   33   58:invokeinterface #115 <Method float Interpolator.getInterpolation(float)>
		//   34   63:fstore          4
			int i = (int)((float)mDeltaY * f1);
		//   35   65:aload_0         
		//   36   66:getfield        #88  <Field int mDeltaY>
		//   37   69:i2f             
		//   38   70:fload           4
		//   39   72:fmul            
		//   40   73:f2i             
		//   41   74:istore          5
			mCurrentBounds.top = mStartRect.top + i;
		//   42   76:aload_0         
		//   43   77:getfield        #53  <Field Rect mCurrentBounds>
		//   44   80:aload_0         
		//   45   81:getfield        #46  <Field Rect mStartRect>
		//   46   84:getfield        #118 <Field int Rect.top>
		//   47   87:iload           5
		//   48   89:iadd            
		//   49   90:putfield        #118 <Field int Rect.top>
			mCurrentBounds.bottom = mStartRect.bottom + i;
		//   50   93:aload_0         
		//   51   94:getfield        #53  <Field Rect mCurrentBounds>
		//   52   97:aload_0         
		//   53   98:getfield        #46  <Field Rect mStartRect>
		//   54  101:getfield        #121 <Field int Rect.bottom>
		//   55  104:iload           5
		//   56  106:iadd            
		//   57  107:putfield        #121 <Field int Rect.bottom>
			mCurrentAlpha = mStartAlpha + (mEndAlpha - mStartAlpha) * f1;
		//   58  110:aload_0         
		//   59  111:aload_0         
		//   60  112:getfield        #40  <Field float mStartAlpha>
		//   61  115:aload_0         
		//   62  116:getfield        #42  <Field float mEndAlpha>
		//   63  119:aload_0         
		//   64  120:getfield        #40  <Field float mStartAlpha>
		//   65  123:fsub            
		//   66  124:fload           4
		//   67  126:fmul            
		//   68  127:fadd            
		//   69  128:putfield        #38  <Field float mCurrentAlpha>
			if(mBitmap != null && mCurrentBounds != null)
		//*  70  131:aload_0         
		//*  71  132:getfield        #44  <Field BitmapDrawable mBitmap>
		//*  72  135:ifnull          171
		//*  73  138:aload_0         
		//*  74  139:getfield        #53  <Field Rect mCurrentBounds>
		//*  75  142:ifnull          171
			{
				mBitmap.setAlpha((int)(mCurrentAlpha * 255F));
		//   76  145:aload_0         
		//   77  146:getfield        #44  <Field BitmapDrawable mBitmap>
		//   78  149:aload_0         
		//   79  150:getfield        #38  <Field float mCurrentAlpha>
		//   80  153:ldc1            #54  <Float 255F>
		//   81  155:fmul            
		//   82  156:f2i             
		//   83  157:invokevirtual   #60  <Method void BitmapDrawable.setAlpha(int)>
				mBitmap.setBounds(mCurrentBounds);
		//   84  160:aload_0         
		//   85  161:getfield        #44  <Field BitmapDrawable mBitmap>
		//   86  164:aload_0         
		//   87  165:getfield        #53  <Field Rect mCurrentBounds>
		//   88  168:invokevirtual   #63  <Method void BitmapDrawable.setBounds(Rect)>
			}
			if(mIsAnimationStarted && f >= 1.0F)
		//*  89  171:aload_0         
		//*  90  172:getfield        #70  <Field boolean mIsAnimationStarted>
		//*  91  175:ifeq            205
		//*  92  178:fload_3         
		//*  93  179:fconst_1        
		//*  94  180:fcmpl           
		//*  95  181:iflt            205
			{
				mIsAnimationEnded = true;
		//   96  184:aload_0         
		//   97  185:iconst_1        
		//   98  186:putfield        #95  <Field boolean mIsAnimationEnded>
				if(mListener != null)
		//*  99  189:aload_0         
		//* 100  190:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		//* 101  193:ifnull          205
					mListener.onAnimationEnd();
		//  102  196:aload_0         
		//  103  197:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		//  104  200:invokeinterface #98  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
			}
			return mIsAnimationEnded ^ true;
		//  105  205:aload_0         
		//  106  206:getfield        #95  <Field boolean mIsAnimationEnded>
		//  107  209:iconst_1        
		//  108  210:ixor            
		//  109  211:ireturn         
		}

		private BitmapDrawable mBitmap;
		private float mCurrentAlpha;
		private Rect mCurrentBounds;
		private int mDeltaY;
		private long mDuration;
		private float mEndAlpha;
		private Interpolator mInterpolator;
		private boolean mIsAnimationEnded;
		private boolean mIsAnimationStarted;
		private OnAnimationEndListener mListener;
		private float mStartAlpha;
		private Rect mStartRect;
		private long mStartTime;

		public OverlayObject(BitmapDrawable bitmapdrawable, Rect rect)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void Object()>
			mCurrentAlpha = 1.0F;
		//    2    4:aload_0         
		//    3    5:fconst_1        
		//    4    6:putfield        #38  <Field float mCurrentAlpha>
			mStartAlpha = 1.0F;
		//    5    9:aload_0         
		//    6   10:fconst_1        
		//    7   11:putfield        #40  <Field float mStartAlpha>
			mEndAlpha = 1.0F;
		//    8   14:aload_0         
		//    9   15:fconst_1        
		//   10   16:putfield        #42  <Field float mEndAlpha>
			mBitmap = bitmapdrawable;
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:putfield        #44  <Field BitmapDrawable mBitmap>
			mStartRect = rect;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #46  <Field Rect mStartRect>
			mCurrentBounds = new Rect(rect);
		//   17   29:aload_0         
		//   18   30:new             #48  <Class Rect>
		//   19   33:dup             
		//   20   34:aload_2         
		//   21   35:invokespecial   #51  <Method void Rect(Rect)>
		//   22   38:putfield        #53  <Field Rect mCurrentBounds>
			if(mBitmap != null && mCurrentBounds != null)
		//*  23   41:aload_0         
		//*  24   42:getfield        #44  <Field BitmapDrawable mBitmap>
		//*  25   45:ifnull          81
		//*  26   48:aload_0         
		//*  27   49:getfield        #53  <Field Rect mCurrentBounds>
		//*  28   52:ifnull          81
			{
				mBitmap.setAlpha((int)(mCurrentAlpha * 255F));
		//   29   55:aload_0         
		//   30   56:getfield        #44  <Field BitmapDrawable mBitmap>
		//   31   59:aload_0         
		//   32   60:getfield        #38  <Field float mCurrentAlpha>
		//   33   63:ldc1            #54  <Float 255F>
		//   34   65:fmul            
		//   35   66:f2i             
		//   36   67:invokevirtual   #60  <Method void BitmapDrawable.setAlpha(int)>
				mBitmap.setBounds(mCurrentBounds);
		//   37   70:aload_0         
		//   38   71:getfield        #44  <Field BitmapDrawable mBitmap>
		//   39   74:aload_0         
		//   40   75:getfield        #53  <Field Rect mCurrentBounds>
		//   41   78:invokevirtual   #63  <Method void BitmapDrawable.setBounds(Rect)>
			}
		//   42   81:return          
		}
	}

	public static interface OverlayObject.OnAnimationEndListener
	{

		public abstract void onAnimationEnd();
	}


	public OverlayListView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void ListView(Context)>
		mOverlayObjects = ((List) (new ArrayList()));
	//    3    5:aload_0         
	//    4    6:new             #19  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void ArrayList()>
	//    7   13:putfield        #24  <Field List mOverlayObjects>
	//    8   16:return          
	}

	public OverlayListView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void ListView(Context, AttributeSet)>
		mOverlayObjects = ((List) (new ArrayList()));
	//    4    6:aload_0         
	//    5    7:new             #19  <Class ArrayList>
	//    6   10:dup             
	//    7   11:invokespecial   #22  <Method void ArrayList()>
	//    8   14:putfield        #24  <Field List mOverlayObjects>
	//    9   17:return          
	}

	public OverlayListView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void ListView(Context, AttributeSet, int)>
		mOverlayObjects = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #19  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #22  <Method void ArrayList()>
	//    9   15:putfield        #24  <Field List mOverlayObjects>
	//   10   18:return          
	}

	public void addOverlayObject(OverlayObject overlayobject)
	{
		mOverlayObjects.add(((Object) (overlayobject)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List mOverlayObjects>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #43  <Method void ListView.onDraw(Canvas)>
		if(mOverlayObjects.size() > 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field List mOverlayObjects>
	//*   5    9:invokeinterface #47  <Method int List.size()>
	//*   6   14:ifle            83
		{
			Iterator iterator = mOverlayObjects.iterator();
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field List mOverlayObjects>
	//    9   21:invokeinterface #51  <Method Iterator List.iterator()>
	//   10   26:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   11   27:aload_2         
	//   12   28:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//   13   33:ifeq            83
				OverlayObject overlayobject = (OverlayObject)iterator.next();
	//   14   36:aload_2         
	//   15   37:invokeinterface #61  <Method Object Iterator.next()>
	//   16   42:checkcast       #6   <Class OverlayListView$OverlayObject>
	//   17   45:astore_3        
				BitmapDrawable bitmapdrawable = overlayobject.getBitmapDrawable();
	//   18   46:aload_3         
	//   19   47:invokevirtual   #65  <Method BitmapDrawable OverlayListView$OverlayObject.getBitmapDrawable()>
	//   20   50:astore          4
				if(bitmapdrawable != null)
	//*  21   52:aload           4
	//*  22   54:ifnull          63
					bitmapdrawable.draw(canvas);
	//   23   57:aload           4
	//   24   59:aload_1         
	//   25   60:invokevirtual   #70  <Method void BitmapDrawable.draw(Canvas)>
				if(!overlayobject.update(getDrawingTime()))
	//*  26   63:aload_3         
	//*  27   64:aload_0         
	//*  28   65:invokevirtual   #74  <Method long getDrawingTime()>
	//*  29   68:invokevirtual   #78  <Method boolean OverlayListView$OverlayObject.update(long)>
	//*  30   71:ifne            27
					iterator.remove();
	//   31   74:aload_2         
	//   32   75:invokeinterface #81  <Method void Iterator.remove()>
			} while(true);
	//   33   80:goto            27
		}
	//   34   83:return          
	}

	public void startAnimationAll()
	{
		Iterator iterator = mOverlayObjects.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List mOverlayObjects>
	//    2    4:invokeinterface #51  <Method Iterator List.iterator()>
	//    3    9:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   10:aload_1         
	//    5   11:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            47
			OverlayObject overlayobject = (OverlayObject)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #61  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class OverlayListView$OverlayObject>
	//   10   28:astore_2        
			if(!overlayobject.isAnimationStarted())
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #85  <Method boolean OverlayListView$OverlayObject.isAnimationStarted()>
	//*  13   33:ifne            10
				overlayobject.startAnimation(getDrawingTime());
	//   14   36:aload_2         
	//   15   37:aload_0         
	//   16   38:invokevirtual   #74  <Method long getDrawingTime()>
	//   17   41:invokevirtual   #89  <Method void OverlayListView$OverlayObject.startAnimation(long)>
		} while(true);
	//   18   44:goto            10
	//   19   47:return          
	}

	public void stopAnimationAll()
	{
		for(Iterator iterator = mOverlayObjects.iterator(); iterator.hasNext(); ((OverlayObject)iterator.next()).stopAnimation());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field List mOverlayObjects>
	//    2    4:invokeinterface #51  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #57  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #61  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class OverlayListView$OverlayObject>
	//   10   28:invokevirtual   #93  <Method void OverlayListView$OverlayObject.stopAnimation()>
	//*  11   31:goto            10
	//   12   34:return          
	}

	private final List mOverlayObjects;
}
