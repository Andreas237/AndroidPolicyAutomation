// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar
{

	public ContentLoadingProgressBar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void ContentLoadingProgressBar(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #30  <Method void ProgressBar(Context, AttributeSet, int)>
		mStartTime = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #31  <Long -1L>
	//    7   11:putfield        #34  <Field long mStartTime>
		mPostedHide = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #36  <Field boolean mPostedHide>
		mPostedShow = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #38  <Field boolean mPostedShow>
		mDismissed = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #40  <Field boolean mDismissed>
		mDelayedHide = new Runnable() {

			public void run()
			{
				mPostedHide = false;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//    2    4:iconst_0        
			//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedHide>
				mStartTime = -1L;
			//    4    8:aload_0         
			//    5    9:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//    6   12:ldc2w           #24  <Long -1L>
			//    7   15:putfield        #29  <Field long ContentLoadingProgressBar.mStartTime>
				setVisibility(8);
			//    8   18:aload_0         
			//    9   19:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//   10   22:bipush          8
			//   11   24:invokevirtual   #33  <Method void ContentLoadingProgressBar.setVisibility(int)>
			//   12   27:return          
			}

			final ContentLoadingProgressBar this$0;

			
			{
				this$0 = ContentLoadingProgressBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ContentLoadingProgressBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   17   29:aload_0         
	//   18   30:new             #6   <Class ContentLoadingProgressBar$1>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #43  <Method void ContentLoadingProgressBar$1(ContentLoadingProgressBar)>
	//   22   38:putfield        #45  <Field Runnable mDelayedHide>
		mDelayedShow = new Runnable() {

			public void run()
			{
				mPostedShow = false;
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//    2    4:iconst_0        
			//    3    5:putfield        #23  <Field boolean ContentLoadingProgressBar.mPostedShow>
				if(!mDismissed)
			//*   4    8:aload_0         
			//*   5    9:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//*   6   12:getfield        #26  <Field boolean ContentLoadingProgressBar.mDismissed>
			//*   7   15:ifne            36
				{
					mStartTime = System.currentTimeMillis();
			//    8   18:aload_0         
			//    9   19:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//   10   22:invokestatic    #32  <Method long System.currentTimeMillis()>
			//   11   25:putfield        #36  <Field long ContentLoadingProgressBar.mStartTime>
					setVisibility(0);
			//   12   28:aload_0         
			//   13   29:getfield        #14  <Field ContentLoadingProgressBar this$0>
			//   14   32:iconst_0        
			//   15   33:invokevirtual   #40  <Method void ContentLoadingProgressBar.setVisibility(int)>
				}
			//   16   36:return          
			}

			final ContentLoadingProgressBar this$0;

			
			{
				this$0 = ContentLoadingProgressBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ContentLoadingProgressBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   23   41:aload_0         
	//   24   42:new             #8   <Class ContentLoadingProgressBar$2>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #46  <Method void ContentLoadingProgressBar$2(ContentLoadingProgressBar)>
	//   28   50:putfield        #48  <Field Runnable mDelayedShow>
	//   29   53:return          
	}

	private void removeCallbacks()
	{
		removeCallbacks(mDelayedHide);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field Runnable mDelayedHide>
	//    3    5:invokevirtual   #53  <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(mDelayedShow);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #48  <Field Runnable mDelayedShow>
	//    8   14:invokevirtual   #53  <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void hide()
	{
		mDismissed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #40  <Field boolean mDismissed>
		removeCallbacks(mDelayedShow);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field Runnable mDelayedShow>
	//    6   10:invokevirtual   #53  <Method boolean removeCallbacks(Runnable)>
	//    7   13:pop             
		long l = System.currentTimeMillis() - mStartTime;
	//    8   14:invokestatic    #60  <Method long System.currentTimeMillis()>
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field long mStartTime>
	//   11   21:lsub            
	//   12   22:lstore_1        
		if(l >= 500L || mStartTime == -1L)
	//*  13   23:lload_1         
	//*  14   24:ldc2w           #61  <Long 500L>
	//*  15   27:lcmp            
	//*  16   28:ifge            42
	//*  17   31:aload_0         
	//*  18   32:getfield        #34  <Field long mStartTime>
	//*  19   35:ldc2w           #31  <Long -1L>
	//*  20   38:lcmp            
	//*  21   39:ifne            49
			setVisibility(8);
	//   22   42:aload_0         
	//   23   43:bipush          8
	//   24   45:invokevirtual   #66  <Method void setVisibility(int)>
		else
	//*  25   48:return          
		if(!mPostedHide)
	//*  26   49:aload_0         
	//*  27   50:getfield        #36  <Field boolean mPostedHide>
	//*  28   53:ifne            48
		{
			postDelayed(mDelayedHide, 500L - l);
	//   29   56:aload_0         
	//   30   57:aload_0         
	//   31   58:getfield        #45  <Field Runnable mDelayedHide>
	//   32   61:ldc2w           #61  <Long 500L>
	//   33   64:lload_1         
	//   34   65:lsub            
	//   35   66:invokevirtual   #70  <Method boolean postDelayed(Runnable, long)>
	//   36   69:pop             
			mPostedHide = true;
	//   37   70:aload_0         
	//   38   71:iconst_1        
	//   39   72:putfield        #36  <Field boolean mPostedHide>
			return;
	//   40   75:return          
		}
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void ProgressBar.onAttachedToWindow()>
		removeCallbacks();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void removeCallbacks()>
	//    4    8:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void ProgressBar.onDetachedFromWindow()>
		removeCallbacks();
	//    2    4:aload_0         
	//    3    5:invokespecial   #75  <Method void removeCallbacks()>
	//    4    8:return          
	}

	public void show()
	{
		mStartTime = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #31  <Long -1L>
	//    2    4:putfield        #34  <Field long mStartTime>
		mDismissed = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #40  <Field boolean mDismissed>
		removeCallbacks(mDelayedHide);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Runnable mDelayedHide>
	//    9   17:invokevirtual   #53  <Method boolean removeCallbacks(Runnable)>
	//   10   20:pop             
		if(!mPostedShow)
	//*  11   21:aload_0         
	//*  12   22:getfield        #38  <Field boolean mPostedShow>
	//*  13   25:ifne            45
		{
			postDelayed(mDelayedShow, 500L);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #48  <Field Runnable mDelayedShow>
	//   17   33:ldc2w           #61  <Long 500L>
	//   18   36:invokevirtual   #70  <Method boolean postDelayed(Runnable, long)>
	//   19   39:pop             
			mPostedShow = true;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #38  <Field boolean mPostedShow>
		}
	//   23   45:return          
	}

	private static final int MIN_DELAY = 500;
	private static final int MIN_SHOW_TIME = 500;
	private final Runnable mDelayedHide;
	private final Runnable mDelayedShow;
	boolean mDismissed;
	boolean mPostedHide;
	boolean mPostedShow;
	long mStartTime;
}
