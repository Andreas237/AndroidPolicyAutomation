// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.graphics.drawable.a;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			AppCompatImageView, TooltipCompat, ActionMenuPresenter, ForwardingListener

class ActionMenuPresenter$OverflowMenuButton extends AppCompatImageView
	implements ActionMenuView.ActionMenuChildView
{

	public boolean needsDividerAfter()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean needsDividerBefore()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean performClick()
	{
		if(super.performClick())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #65  <Method boolean AppCompatImageView.performClick()>
	//*   2    4:ifeq            9
		{
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		} else
		{
			playSoundEffect(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #68  <Method void playSoundEffect(int)>
			showOverflowMenu();
	//    8   14:aload_0         
	//    9   15:getfield        #14  <Field ActionMenuPresenter this$0>
	//   10   18:invokevirtual   #73  <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//   11   21:pop             
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		}
	}

	protected boolean setFrame(int i, int j, int k, int l)
	{
		boolean flag = super.setFrame(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #77  <Method boolean AppCompatImageView.setFrame(int, int, int, int)>
	//    6    9:istore          8
		android.graphics.drawable.Drawable drawable = getDrawable();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #81  <Method android.graphics.drawable.Drawable getDrawable()>
	//    9   15:astore          9
		android.graphics.drawable.Drawable drawable1 = getBackground();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #84  <Method android.graphics.drawable.Drawable getBackground()>
	//   12   21:astore          10
		if(drawable != null && drawable1 != null)
	//*  13   23:aload           9
	//*  14   25:ifnull          116
	//*  15   28:aload           10
	//*  16   30:ifnull          116
		{
			int i1 = getWidth();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #88  <Method int getWidth()>
	//   19   37:istore          5
			j = getHeight();
	//   20   39:aload_0         
	//   21   40:invokevirtual   #91  <Method int getHeight()>
	//   22   43:istore_2        
			i = Math.max(i1, j) / 2;
	//   23   44:iload           5
	//   24   46:iload_2         
	//   25   47:invokestatic    #97  <Method int Math.max(int, int)>
	//   26   50:iconst_2        
	//   27   51:idiv            
	//   28   52:istore_1        
			int j1 = getPaddingLeft();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #100 <Method int getPaddingLeft()>
	//   31   57:istore          6
			int k1 = getPaddingRight();
	//   32   59:aload_0         
	//   33   60:invokevirtual   #103 <Method int getPaddingRight()>
	//   34   63:istore          7
			k = getPaddingTop();
	//   35   65:aload_0         
	//   36   66:invokevirtual   #106 <Method int getPaddingTop()>
	//   37   69:istore_3        
			l = getPaddingBottom();
	//   38   70:aload_0         
	//   39   71:invokevirtual   #109 <Method int getPaddingBottom()>
	//   40   74:istore          4
			i1 = (i1 + (j1 - k1)) / 2;
	//   41   76:iload           5
	//   42   78:iload           6
	//   43   80:iload           7
	//   44   82:isub            
	//   45   83:iadd            
	//   46   84:iconst_2        
	//   47   85:idiv            
	//   48   86:istore          5
			j = (j + (k - l)) / 2;
	//   49   88:iload_2         
	//   50   89:iload_3         
	//   51   90:iload           4
	//   52   92:isub            
	//   53   93:iadd            
	//   54   94:iconst_2        
	//   55   95:idiv            
	//   56   96:istore_2        
			a.a(drawable1, i1 - i, j - i, i1 + i, j + i);
	//   57   97:aload           10
	//   58   99:iload           5
	//   59  101:iload_1         
	//   60  102:isub            
	//   61  103:iload_2         
	//   62  104:iload_1         
	//   63  105:isub            
	//   64  106:iload           5
	//   65  108:iload_1         
	//   66  109:iadd            
	//   67  110:iload_2         
	//   68  111:iload_1         
	//   69  112:iadd            
	//   70  113:invokestatic    #115 <Method void a.a(android.graphics.drawable.Drawable, int, int, int, int)>
		}
		return flag;
	//   71  116:iload           8
	//   72  118:ireturn         
	}

	private final float mTempPts[] = new float[2];
	final ActionMenuPresenter this$0;

	public ActionMenuPresenter$OverflowMenuButton(Context context)
	{
		this$0 = ActionMenuPresenter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActionMenuPresenter this$0>
		super(context, ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionOverflowButtonStyle);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:getstatic       #20  <Field int android.support.v7.appcompat.R$attr.actionOverflowButtonStyle>
	//    7   11:invokespecial   #23  <Method void AppCompatImageView(Context, android.util.AttributeSet, int)>
	//    8   14:aload_0         
	//    9   15:iconst_2        
	//   10   16:newarray        float[]
	//   11   18:putfield        #25  <Field float[] mTempPts>
		setClickable(true);
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #29  <Method void setClickable(boolean)>
		setFocusable(true);
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:invokevirtual   #32  <Method void setFocusable(boolean)>
		setVisibility(0);
	//   18   31:aload_0         
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #36  <Method void setVisibility(int)>
		setEnabled(true);
	//   21   36:aload_0         
	//   22   37:iconst_1        
	//   23   38:invokevirtual   #39  <Method void setEnabled(boolean)>
		TooltipCompat.setTooltipText(((View) (this)), getContentDescription());
	//   24   41:aload_0         
	//   25   42:aload_0         
	//   26   43:invokevirtual   #43  <Method CharSequence getContentDescription()>
	//   27   46:invokestatic    #49  <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		class _cls1 extends ForwardingListener
		{

			public ShowableListMenu getPopup()
			{
				if(mOverflowPopup == null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
			//*   2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
			//*   3    7:getfield        #31  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
			//*   4   10:ifnonnull       15
					return null;
			//    5   13:aconst_null     
			//    6   14:areturn         
				else
					return ((ShowableListMenu) (mOverflowPopup.getPopup()));
			//    7   15:aload_0         
			//    8   16:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
			//    9   19:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
			//   10   22:getfield        #31  <Field ActionMenuPresenter$OverflowPopup ActionMenuPresenter.mOverflowPopup>
			//   11   25:invokevirtual   #36  <Method android.support.v7.view.menu.MenuPopup ActionMenuPresenter$OverflowPopup.getPopup()>
			//   12   28:areturn         
			}

			public boolean onForwardingStarted()
			{
				showOverflowMenu();
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
			//    2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
			//    3    7:invokevirtual   #41  <Method boolean ActionMenuPresenter.showOverflowMenu()>
			//    4   10:pop             
				return true;
			//    5   11:iconst_1        
			//    6   12:ireturn         
			}

			public boolean onForwardingStopped()
			{
				if(mPostedOpenRunnable != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
			//*   2    4:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
			//*   3    7:getfield        #46  <Field ActionMenuPresenter$OpenOverflowRunnable ActionMenuPresenter.mPostedOpenRunnable>
			//*   4   10:ifnull          15
				{
					return false;
			//    5   13:iconst_0        
			//    6   14:ireturn         
				} else
				{
					hideOverflowMenu();
			//    7   15:aload_0         
			//    8   16:getfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
			//    9   19:getfield        #25  <Field ActionMenuPresenter ActionMenuPresenter$OverflowMenuButton.this$0>
			//   10   22:invokevirtual   #49  <Method boolean ActionMenuPresenter.hideOverflowMenu()>
			//   11   25:pop             
					return true;
			//   12   26:iconst_1        
			//   13   27:ireturn         
				}
			}

			final ActionMenuPresenter.OverflowMenuButton this$1;
			final ActionMenuPresenter val$this$0;

			_cls1(ActionMenuPresenter actionmenupresenter)
			{
				this$1 = ActionMenuPresenter.OverflowMenuButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ActionMenuPresenter$OverflowMenuButton this$1>
				this$0 = actionmenupresenter;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #14  <Field ActionMenuPresenter val$this$0>
				super(final_view);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #17  <Method void ForwardingListener(View)>
			//    9   15:return          
			}
		}

		setOnTouchListener(((android.view.View.OnTouchListener) (new _cls1(ActionMenuPresenter.this))));
	//   28   49:aload_0         
	//   29   50:new             #51  <Class ActionMenuPresenter$OverflowMenuButton$1>
	//   30   53:dup             
	//   31   54:aload_0         
	//   32   55:aload_0         
	//   33   56:aload_1         
	//   34   57:invokespecial   #54  <Method void ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter$OverflowMenuButton, View, ActionMenuPresenter)>
	//   35   60:invokevirtual   #58  <Method void setOnTouchListener(android.view.View$OnTouchListener)>
	//   36   63:return          
	}
}
