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
	//    3    3:invokespecial   #27  <Method void ContentLoadingProgressBar(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentLoadingProgressBar(Context context, AttributeSet attributeset)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #33  <Method void ProgressBar(Context, AttributeSet, int)>
		mStartTime = -1L;
	//    5    7:aload_0         
	//    6    8:ldc2w           #34  <Long -1L>
	//    7   11:putfield        #37  <Field long mStartTime>
		mPostedHide = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #39  <Field boolean mPostedHide>
		mPostedShow = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field boolean mPostedShow>
		mDismissed = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #43  <Field boolean mDismissed>
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
	//   21   35:invokespecial   #46  <Method void ContentLoadingProgressBar$1(ContentLoadingProgressBar)>
	//   22   38:putfield        #48  <Field Runnable mDelayedHide>
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
	//   27   47:invokespecial   #49  <Method void ContentLoadingProgressBar$2(ContentLoadingProgressBar)>
	//   28   50:putfield        #51  <Field Runnable mDelayedShow>
	//   29   53:return          
	}

	private void removeCallbacks()
	{
		removeCallbacks(mDelayedHide);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #48  <Field Runnable mDelayedHide>
	//    3    5:invokevirtual   #56  <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(mDelayedShow);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field Runnable mDelayedShow>
	//    8   14:invokevirtual   #56  <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	public void hide()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l;
		mDismissed = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #43  <Field boolean mDismissed>
		removeCallbacks(mDelayedShow);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #51  <Field Runnable mDelayedShow>
	//    8   12:invokevirtual   #56  <Method boolean removeCallbacks(Runnable)>
	//    9   15:pop             
		mPostedShow = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #41  <Field boolean mPostedShow>
		l = System.currentTimeMillis() - mStartTime;
	//   13   21:invokestatic    #63  <Method long System.currentTimeMillis()>
	//   14   24:aload_0         
	//   15   25:getfield        #37  <Field long mStartTime>
	//   16   28:lsub            
	//   17   29:lstore_1        
		if(l >= 500L)
			break MISSING_BLOCK_LABEL_81;
	//   18   30:lload_1         
	//   19   31:ldc2w           #64  <Long 500L>
	//   20   34:lcmp            
	//   21   35:ifge            81
		if(mStartTime == -1L)
	//*  22   38:aload_0         
	//*  23   39:getfield        #37  <Field long mStartTime>
	//*  24   42:ldc2w           #34  <Long -1L>
	//*  25   45:lcmp            
	//*  26   46:ifne            52
			break MISSING_BLOCK_LABEL_81;
	//   27   49:goto            81
		if(!mPostedHide)
	//*  28   52:aload_0         
	//*  29   53:getfield        #39  <Field boolean mPostedHide>
	//*  30   56:ifne            87
		{
			postDelayed(mDelayedHide, 500L - l);
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #48  <Field Runnable mDelayedHide>
	//   34   64:ldc2w           #64  <Long 500L>
	//   35   67:lload_1         
	//   36   68:lsub            
	//   37   69:invokevirtual   #69  <Method boolean postDelayed(Runnable, long)>
	//   38   72:pop             
			mPostedHide = true;
	//   39   73:aload_0         
	//   40   74:iconst_1        
	//   41   75:putfield        #39  <Field boolean mPostedHide>
		}
		break MISSING_BLOCK_LABEL_87;
	//   42   78:goto            87
		setVisibility(8);
	//   43   81:aload_0         
	//   44   82:bipush          8
	//   45   84:invokevirtual   #73  <Method void setVisibility(int)>
		this;
	//   46   87:aload_0         
		JVM INSTR monitorexit ;
	//   47   88:monitorexit     
		return;
	//   48   89:return          
		Exception exception;
		exception;
	//   49   90:astore_3        
	//*  50   91:aload_0         
		throw exception;
	//   51   92:monitorexit     
	//   52   93:aload_3         
	//   53   94:athrow          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void ProgressBar.onAttachedToWindow()>
		removeCallbacks();
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void removeCallbacks()>
	//    4    8:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void ProgressBar.onDetachedFromWindow()>
		removeCallbacks();
	//    2    4:aload_0         
	//    3    5:invokespecial   #78  <Method void removeCallbacks()>
	//    4    8:return          
	}

	public void show()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mStartTime = -1L;
	//    2    2:aload_0         
	//    3    3:ldc2w           #34  <Long -1L>
	//    4    6:putfield        #37  <Field long mStartTime>
		mDismissed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #43  <Field boolean mDismissed>
		removeCallbacks(mDelayedHide);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #48  <Field Runnable mDelayedHide>
	//   11   19:invokevirtual   #56  <Method boolean removeCallbacks(Runnable)>
	//   12   22:pop             
		mPostedHide = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #39  <Field boolean mPostedHide>
		if(!mPostedShow)
	//*  16   28:aload_0         
	//*  17   29:getfield        #41  <Field boolean mPostedShow>
	//*  18   32:ifne            52
		{
			postDelayed(mDelayedShow, 500L);
	//   19   35:aload_0         
	//   20   36:aload_0         
	//   21   37:getfield        #51  <Field Runnable mDelayedShow>
	//   22   40:ldc2w           #64  <Long 500L>
	//   23   43:invokevirtual   #69  <Method boolean postDelayed(Runnable, long)>
	//   24   46:pop             
			mPostedShow = true;
	//   25   47:aload_0         
	//   26   48:iconst_1        
	//   27   49:putfield        #41  <Field boolean mPostedShow>
		}
		this;
	//   28   52:aload_0         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		return;
	//   30   54:return          
		Exception exception;
		exception;
	//   31   55:astore_1        
	//*  32   56:aload_0         
		throw exception;
	//   33   57:monitorexit     
	//   34   58:aload_1         
	//   35   59:athrow          
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
