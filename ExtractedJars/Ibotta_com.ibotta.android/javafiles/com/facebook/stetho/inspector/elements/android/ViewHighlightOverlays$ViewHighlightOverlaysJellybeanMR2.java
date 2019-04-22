// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewOverlay;

// Referenced classes of package com.facebook.stetho.inspector.elements.android:
//			ViewHighlightOverlays

private static class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2 extends ViewHighlightOverlays
{
	static abstract class HighlightDrawable extends ColorDrawable
	{

		void highlightView(View view)
		{
			Object obj = ((Object) (view.getLayoutParams()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #36  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:astore_2        
			if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
		//*   3    5:aload_2         
		//*   4    6:instanceof      #38  <Class android.view.ViewGroup$MarginLayoutParams>
		//*   5    9:ifeq            64
			{
				obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
		//    6   12:aload_2         
		//    7   13:checkcast       #38  <Class android.view.ViewGroup$MarginLayoutParams>
		//    8   16:astore_2        
				mMargins.left = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
		//    9   17:aload_0         
		//   10   18:getfield        #22  <Field Rect mMargins>
		//   11   21:aload_2         
		//   12   22:getfield        #42  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//   13   25:putfield        #45  <Field int Rect.left>
				mMargins.top = ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin;
		//   14   28:aload_0         
		//   15   29:getfield        #22  <Field Rect mMargins>
		//   16   32:aload_2         
		//   17   33:getfield        #48  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
		//   18   36:putfield        #51  <Field int Rect.top>
				mMargins.right = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
		//   19   39:aload_0         
		//   20   40:getfield        #22  <Field Rect mMargins>
		//   21   43:aload_2         
		//   22   44:getfield        #54  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//   23   47:putfield        #57  <Field int Rect.right>
				mMargins.bottom = ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
		//   24   50:aload_0         
		//   25   51:getfield        #22  <Field Rect mMargins>
		//   26   54:aload_2         
		//   27   55:getfield        #60  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//   28   58:putfield        #63  <Field int Rect.bottom>
			} else
		//*  29   61:goto            89
			{
				Rect rect = mMargins;
		//   30   64:aload_0         
		//   31   65:getfield        #22  <Field Rect mMargins>
		//   32   68:astore_2        
				rect.left = 0;
		//   33   69:aload_2         
		//   34   70:iconst_0        
		//   35   71:putfield        #45  <Field int Rect.left>
				rect.top = 0;
		//   36   74:aload_2         
		//   37   75:iconst_0        
		//   38   76:putfield        #51  <Field int Rect.top>
				rect.right = 0;
		//   39   79:aload_2         
		//   40   80:iconst_0        
		//   41   81:putfield        #57  <Field int Rect.right>
				rect.bottom = 0;
		//   42   84:aload_2         
		//   43   85:iconst_0        
		//   44   86:putfield        #63  <Field int Rect.bottom>
			}
			mPaddings.left = view.getPaddingLeft();
		//   45   89:aload_0         
		//   46   90:getfield        #24  <Field Rect mPaddings>
		//   47   93:aload_1         
		//   48   94:invokevirtual   #67  <Method int View.getPaddingLeft()>
		//   49   97:putfield        #45  <Field int Rect.left>
			mPaddings.top = view.getPaddingTop();
		//   50  100:aload_0         
		//   51  101:getfield        #24  <Field Rect mPaddings>
		//   52  104:aload_1         
		//   53  105:invokevirtual   #70  <Method int View.getPaddingTop()>
		//   54  108:putfield        #51  <Field int Rect.top>
			mPaddings.right = view.getPaddingRight();
		//   55  111:aload_0         
		//   56  112:getfield        #24  <Field Rect mPaddings>
		//   57  115:aload_1         
		//   58  116:invokevirtual   #73  <Method int View.getPaddingRight()>
		//   59  119:putfield        #57  <Field int Rect.right>
			mPaddings.bottom = view.getPaddingBottom();
		//   60  122:aload_0         
		//   61  123:getfield        #24  <Field Rect mPaddings>
		//   62  126:aload_1         
		//   63  127:invokevirtual   #76  <Method int View.getPaddingBottom()>
		//   64  130:putfield        #63  <Field int Rect.bottom>
		//   65  133:return          
		}

		protected final Rect mMargins;
		protected final Rect mPaddings;

		public HighlightDrawable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void ColorDrawable()>
			mMargins = new Rect();
		//    2    4:aload_0         
		//    3    5:new             #19  <Class Rect>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void Rect()>
		//    6   12:putfield        #22  <Field Rect mMargins>
			mPaddings = new Rect();
		//    7   15:aload_0         
		//    8   16:new             #19  <Class Rect>
		//    9   19:dup             
		//   10   20:invokespecial   #20  <Method void Rect()>
		//   11   23:putfield        #24  <Field Rect mPaddings>
		//   12   26:return          
		}

		HighlightDrawable(int i)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #28  <Method void ColorDrawable(int)>
			mMargins = new Rect();
		//    3    5:aload_0         
		//    4    6:new             #19  <Class Rect>
		//    5    9:dup             
		//    6   10:invokespecial   #20  <Method void Rect()>
		//    7   13:putfield        #22  <Field Rect mMargins>
			mPaddings = new Rect();
		//    8   16:aload_0         
		//    9   17:new             #19  <Class Rect>
		//   10   20:dup             
		//   11   21:invokespecial   #20  <Method void Rect()>
		//   12   24:putfield        #24  <Field Rect mPaddings>
		//   13   27:return          
		}
	}

	static class MainHighlightDrawable extends HighlightDrawable
	{

		public void draw(Canvas canvas)
		{
			Rect rect = canvas.getClipBounds();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #23  <Method Rect Canvas.getClipBounds()>
		//    2    4:astore_2        
			rect.inset(-(mMargins.right + mMargins.left), -(mMargins.top + mMargins.bottom));
		//    3    5:aload_2         
		//    4    6:aload_0         
		//    5    7:getfield        #27  <Field Rect mMargins>
		//    6   10:getfield        #33  <Field int Rect.right>
		//    7   13:aload_0         
		//    8   14:getfield        #27  <Field Rect mMargins>
		//    9   17:getfield        #36  <Field int Rect.left>
		//   10   20:iadd            
		//   11   21:ineg            
		//   12   22:aload_0         
		//   13   23:getfield        #27  <Field Rect mMargins>
		//   14   26:getfield        #39  <Field int Rect.top>
		//   15   29:aload_0         
		//   16   30:getfield        #27  <Field Rect mMargins>
		//   17   33:getfield        #42  <Field int Rect.bottom>
		//   18   36:iadd            
		//   19   37:ineg            
		//   20   38:invokevirtual   #46  <Method void Rect.inset(int, int)>
			canvas.clipRect(rect, android.graphics.Region.Op.REPLACE);
		//   21   41:aload_1         
		//   22   42:aload_2         
		//   23   43:getstatic       #52  <Field android.graphics.Region$Op android.graphics.Region$Op.REPLACE>
		//   24   46:invokevirtual   #56  <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
		//   25   49:pop             
			super.draw(canvas);
		//   26   50:aload_0         
		//   27   51:aload_1         
		//   28   52:invokespecial   #58  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
		//   29   55:return          
		}

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #62  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(0, 0, view.getWidth(), view.getHeight());
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:iconst_0        
		//    6    8:aload_1         
		//    7    9:invokevirtual   #68  <Method int View.getWidth()>
		//    8   12:aload_1         
		//    9   13:invokevirtual   #71  <Method int View.getHeight()>
		//   10   16:invokevirtual   #75  <Method void setBounds(int, int, int, int)>
		//   11   19:return          
		}

		MainHighlightDrawable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable()>
		//    2    4:return          
		}
	}

	static class MarginBottomHighlightDrawable extends HighlightDrawable
	{

		public void draw(Canvas canvas)
		{
			canvas.translate(0.0F, mMargins.bottom + mMargins.top);
		//    0    0:aload_1         
		//    1    1:fconst_0        
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field Rect mMargins>
		//    4    6:getfield        #29  <Field int Rect.bottom>
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field Rect mMargins>
		//    7   13:getfield        #32  <Field int Rect.top>
		//    8   16:iadd            
		//    9   17:i2f             
		//   10   18:invokevirtual   #38  <Method void Canvas.translate(float, float)>
			super.draw(canvas);
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokespecial   #40  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
		//   14   26:return          
		}

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(0, view.getHeight() - mMargins.bottom, view.getWidth(), view.getHeight());
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:aload_1         
		//    6    8:invokevirtual   #50  <Method int View.getHeight()>
		//    7   11:aload_0         
		//    8   12:getfield        #23  <Field Rect mMargins>
		//    9   15:getfield        #29  <Field int Rect.bottom>
		//   10   18:isub            
		//   11   19:aload_1         
		//   12   20:invokevirtual   #53  <Method int View.getWidth()>
		//   13   23:aload_1         
		//   14   24:invokevirtual   #50  <Method int View.getHeight()>
		//   15   27:invokevirtual   #57  <Method void setBounds(int, int, int, int)>
		//   16   30:return          
		}

		MarginBottomHighlightDrawable()
		{
			super(0xaaf4ca9e);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class MarginLeftHighlightDrawable extends HighlightDrawable
	{

		public void draw(Canvas canvas)
		{
			canvas.translate(-(mMargins.left + mMargins.right), 0.0F);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field Rect mMargins>
		//    3    5:getfield        #29  <Field int Rect.left>
		//    4    8:aload_0         
		//    5    9:getfield        #23  <Field Rect mMargins>
		//    6   12:getfield        #32  <Field int Rect.right>
		//    7   15:iadd            
		//    8   16:ineg            
		//    9   17:i2f             
		//   10   18:fconst_0        
		//   11   19:invokevirtual   #38  <Method void Canvas.translate(float, float)>
			super.draw(canvas);
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:invokespecial   #40  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
		//   15   27:return          
		}

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #44  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(0, 0, mMargins.left, view.getHeight() + mMargins.top + mMargins.bottom);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:iconst_0        
		//    6    8:aload_0         
		//    7    9:getfield        #23  <Field Rect mMargins>
		//    8   12:getfield        #29  <Field int Rect.left>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #50  <Method int View.getHeight()>
		//   11   19:aload_0         
		//   12   20:getfield        #23  <Field Rect mMargins>
		//   13   23:getfield        #53  <Field int Rect.top>
		//   14   26:iadd            
		//   15   27:aload_0         
		//   16   28:getfield        #23  <Field Rect mMargins>
		//   17   31:getfield        #56  <Field int Rect.bottom>
		//   18   34:iadd            
		//   19   35:invokevirtual   #60  <Method void setBounds(int, int, int, int)>
		//   20   38:return          
		}

		MarginLeftHighlightDrawable()
		{
			super(0xaaf4ca9e);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class MarginRightHighlightDrawable extends HighlightDrawable
	{

		public void draw(Canvas canvas)
		{
			canvas.translate(mMargins.right, -(mMargins.top + mMargins.bottom));
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #23  <Field Rect mMargins>
		//    3    5:getfield        #29  <Field int Rect.right>
		//    4    8:i2f             
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field Rect mMargins>
		//    7   13:getfield        #32  <Field int Rect.top>
		//    8   16:aload_0         
		//    9   17:getfield        #23  <Field Rect mMargins>
		//   10   20:getfield        #35  <Field int Rect.bottom>
		//   11   23:iadd            
		//   12   24:ineg            
		//   13   25:i2f             
		//   14   26:invokevirtual   #41  <Method void Canvas.translate(float, float)>
			super.draw(canvas);
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokespecial   #43  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
		//   18   34:return          
		}

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #47  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(view.getWidth() - mMargins.right, 0, view.getWidth(), view.getHeight() + mMargins.top + mMargins.bottom);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #53  <Method int View.getWidth()>
		//    6   10:aload_0         
		//    7   11:getfield        #23  <Field Rect mMargins>
		//    8   14:getfield        #29  <Field int Rect.right>
		//    9   17:isub            
		//   10   18:iconst_0        
		//   11   19:aload_1         
		//   12   20:invokevirtual   #53  <Method int View.getWidth()>
		//   13   23:aload_1         
		//   14   24:invokevirtual   #56  <Method int View.getHeight()>
		//   15   27:aload_0         
		//   16   28:getfield        #23  <Field Rect mMargins>
		//   17   31:getfield        #32  <Field int Rect.top>
		//   18   34:iadd            
		//   19   35:aload_0         
		//   20   36:getfield        #23  <Field Rect mMargins>
		//   21   39:getfield        #35  <Field int Rect.bottom>
		//   22   42:iadd            
		//   23   43:invokevirtual   #60  <Method void setBounds(int, int, int, int)>
		//   24   46:return          
		}

		MarginRightHighlightDrawable()
		{
			super(0xaaf4ca9e);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class MarginTopHighlightDrawable extends HighlightDrawable
	{

		public void draw(Canvas canvas)
		{
			canvas.translate(0.0F, -mMargins.top);
		//    0    0:aload_1         
		//    1    1:fconst_0        
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field Rect mMargins>
		//    4    6:getfield        #29  <Field int Rect.top>
		//    5    9:ineg            
		//    6   10:i2f             
		//    7   11:invokevirtual   #35  <Method void Canvas.translate(float, float)>
			super.draw(canvas);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokespecial   #37  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.draw(Canvas)>
		//   11   19:return          
		}

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #41  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(0, 0, view.getWidth(), mMargins.top);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:iconst_0        
		//    6    8:aload_1         
		//    7    9:invokevirtual   #47  <Method int View.getWidth()>
		//    8   12:aload_0         
		//    9   13:getfield        #23  <Field Rect mMargins>
		//   10   16:getfield        #29  <Field int Rect.top>
		//   11   19:invokevirtual   #51  <Method void setBounds(int, int, int, int)>
		//   12   22:return          
		}

		MarginTopHighlightDrawable()
		{
			super(0xaaf4ca9e);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaaf4ca9e>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class PaddingBottomHighlightDrawable extends HighlightDrawable
	{

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(mPaddings.left, view.getHeight() - mPaddings.bottom, view.getWidth() - mPaddings.right, view.getHeight());
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field Rect mPaddings>
		//    6   10:getfield        #31  <Field int Rect.left>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #37  <Method int View.getHeight()>
		//    9   17:aload_0         
		//   10   18:getfield        #25  <Field Rect mPaddings>
		//   11   21:getfield        #40  <Field int Rect.bottom>
		//   12   24:isub            
		//   13   25:aload_1         
		//   14   26:invokevirtual   #43  <Method int View.getWidth()>
		//   15   29:aload_0         
		//   16   30:getfield        #25  <Field Rect mPaddings>
		//   17   33:getfield        #46  <Field int Rect.right>
		//   18   36:isub            
		//   19   37:aload_1         
		//   20   38:invokevirtual   #37  <Method int View.getHeight()>
		//   21   41:invokevirtual   #50  <Method void setBounds(int, int, int, int)>
		//   22   44:return          
		}

		PaddingBottomHighlightDrawable()
		{
			super(0xaabedab6);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaabedab6>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class PaddingLeftHighlightDrawable extends HighlightDrawable
	{

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(0, 0, mPaddings.left, view.getHeight());
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:iconst_0        
		//    6    8:aload_0         
		//    7    9:getfield        #25  <Field Rect mPaddings>
		//    8   12:getfield        #31  <Field int Rect.left>
		//    9   15:aload_1         
		//   10   16:invokevirtual   #37  <Method int View.getHeight()>
		//   11   19:invokevirtual   #41  <Method void setBounds(int, int, int, int)>
		//   12   22:return          
		}

		PaddingLeftHighlightDrawable()
		{
			super(0xaabedab6);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaabedab6>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class PaddingRightHighlightDrawable extends HighlightDrawable
	{

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(view.getWidth() - mPaddings.right, 0, view.getWidth(), view.getHeight());
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #27  <Method int View.getWidth()>
		//    6   10:aload_0         
		//    7   11:getfield        #31  <Field Rect mPaddings>
		//    8   14:getfield        #37  <Field int Rect.right>
		//    9   17:isub            
		//   10   18:iconst_0        
		//   11   19:aload_1         
		//   12   20:invokevirtual   #27  <Method int View.getWidth()>
		//   13   23:aload_1         
		//   14   24:invokevirtual   #40  <Method int View.getHeight()>
		//   15   27:invokevirtual   #44  <Method void setBounds(int, int, int, int)>
		//   16   30:return          
		}

		PaddingRightHighlightDrawable()
		{
			super(0xaabedab6);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaabedab6>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}

	static class PaddingTopHighlightDrawable extends HighlightDrawable
	{

		void highlightView(View view)
		{
			super.highlightView(view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			setBounds(mPaddings.left, 0, view.getWidth() - mPaddings.right, mPaddings.top);
		//    3    5:aload_0         
		//    4    6:aload_0         
		//    5    7:getfield        #25  <Field Rect mPaddings>
		//    6   10:getfield        #31  <Field int Rect.left>
		//    7   13:iconst_0        
		//    8   14:aload_1         
		//    9   15:invokevirtual   #37  <Method int View.getWidth()>
		//   10   18:aload_0         
		//   11   19:getfield        #25  <Field Rect mPaddings>
		//   12   22:getfield        #40  <Field int Rect.right>
		//   13   25:isub            
		//   14   26:aload_0         
		//   15   27:getfield        #25  <Field Rect mPaddings>
		//   16   30:getfield        #43  <Field int Rect.top>
		//   17   33:invokevirtual   #47  <Method void setBounds(int, int, int, int)>
		//   18   36:return          
		}

		PaddingTopHighlightDrawable()
		{
			super(0xaabedab6);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Int 0xaabedab6>
		//    2    3:invokespecial   #16  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable(int)>
		//    3    6:return          
		}
	}


	void highlightView(View view, int i)
	{
		mMainHighlightDrawable.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable mMainHighlightDrawable>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #71  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable.setColor(int)>
		int j = mHighlightDrawables.length;
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable[] mHighlightDrawables>
	//    6   12:arraylength     
	//    7   13:istore_3        
		for(i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          51
		{
			HighlightDrawable highlightdrawable = mHighlightDrawables[i];
	//   13   21:aload_0         
	//   14   22:getfield        #64  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable[] mHighlightDrawables>
	//   15   25:iload_2         
	//   16   26:aaload          
	//   17   27:astore          4
			highlightdrawable.highlightView(view);
	//   18   29:aload           4
	//   19   31:aload_1         
	//   20   32:invokevirtual   #74  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable.highlightView(View)>
			view.getOverlay().add(((android.graphics.drawable.Drawable) (highlightdrawable)));
	//   21   35:aload_1         
	//   22   36:invokevirtual   #80  <Method ViewOverlay View.getOverlay()>
	//   23   39:aload           4
	//   24   41:invokevirtual   #86  <Method void ViewOverlay.add(android.graphics.drawable.Drawable)>
		}

	//   25   44:iload_2         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore_2        
	//*  29   48:goto            16
	//   30   51:return          
	}

	void removeHighlight(View view)
	{
		HighlightDrawable ahighlightdrawable[] = mHighlightDrawables;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable[] mHighlightDrawables>
	//    2    4:astore          4
		int j = ahighlightdrawable.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          39
		{
			HighlightDrawable highlightdrawable = ahighlightdrawable[i];
	//   11   17:aload           4
	//   12   19:iload_2         
	//   13   20:aaload          
	//   14   21:astore          5
			view.getOverlay().remove(((android.graphics.drawable.Drawable) (highlightdrawable)));
	//   15   23:aload_1         
	//   16   24:invokevirtual   #80  <Method ViewOverlay View.getOverlay()>
	//   17   27:aload           5
	//   18   29:invokevirtual   #90  <Method void ViewOverlay.remove(android.graphics.drawable.Drawable)>
		}

	//   19   32:iload_2         
	//   20   33:iconst_1        
	//   21   34:iadd            
	//   22   35:istore_2        
	//*  23   36:goto            12
	//   24   39:return          
	}

	private static final int MARGIN_OVERLAY_COLOR = 0xaaf4ca9e;
	private static final int PADDING_OVERLAY_COLOR = 0xaabedab6;
	private final HighlightDrawable mHighlightDrawables[];
	private final MainHighlightDrawable mMainHighlightDrawable = new MainHighlightDrawable();

	ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void ViewHighlightOverlays()>
	//    2    4:aload_0         
	//    3    5:new             #10  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable()>
	//    6   12:putfield        #54  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable mMainHighlightDrawable>
		mHighlightDrawables = (new HighlightDrawable[] {
			mMainHighlightDrawable, new PaddingTopHighlightDrawable(), new PaddingBottomHighlightDrawable(), new PaddingRightHighlightDrawable(), new PaddingLeftHighlightDrawable(), new MarginTopHighlightDrawable(), new MarginBottomHighlightDrawable(), new MarginRightHighlightDrawable(), new MarginLeftHighlightDrawable()
		});
	//    7   15:aload_0         
	//    8   16:bipush          9
	//    9   18:anewarray       HighlightDrawable[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:aload_0         
	//   13   24:getfield        #54  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MainHighlightDrawable mMainHighlightDrawable>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_1        
	//   17   30:new             #34  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingTopHighlightDrawable>
	//   18   33:dup             
	//   19   34:invokespecial   #55  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingTopHighlightDrawable()>
	//   20   37:aastore         
	//   21   38:dup             
	//   22   39:iconst_2        
	//   23   40:new             #25  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingBottomHighlightDrawable>
	//   24   43:dup             
	//   25   44:invokespecial   #56  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingBottomHighlightDrawable()>
	//   26   47:aastore         
	//   27   48:dup             
	//   28   49:iconst_3        
	//   29   50:new             #31  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingRightHighlightDrawable>
	//   30   53:dup             
	//   31   54:invokespecial   #57  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingRightHighlightDrawable()>
	//   32   57:aastore         
	//   33   58:dup             
	//   34   59:iconst_4        
	//   35   60:new             #28  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingLeftHighlightDrawable>
	//   36   63:dup             
	//   37   64:invokespecial   #58  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$PaddingLeftHighlightDrawable()>
	//   38   67:aastore         
	//   39   68:dup             
	//   40   69:iconst_5        
	//   41   70:new             #22  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginTopHighlightDrawable>
	//   42   73:dup             
	//   43   74:invokespecial   #59  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginTopHighlightDrawable()>
	//   44   77:aastore         
	//   45   78:dup             
	//   46   79:bipush          6
	//   47   81:new             #13  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginBottomHighlightDrawable>
	//   48   84:dup             
	//   49   85:invokespecial   #60  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginBottomHighlightDrawable()>
	//   50   88:aastore         
	//   51   89:dup             
	//   52   90:bipush          7
	//   53   92:new             #19  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginRightHighlightDrawable>
	//   54   95:dup             
	//   55   96:invokespecial   #61  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginRightHighlightDrawable()>
	//   56   99:aastore         
	//   57  100:dup             
	//   58  101:bipush          8
	//   59  103:new             #16  <Class ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginLeftHighlightDrawable>
	//   60  106:dup             
	//   61  107:invokespecial   #62  <Method void ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$MarginLeftHighlightDrawable()>
	//   62  110:aastore         
	//   63  111:putfield        #64  <Field ViewHighlightOverlays$ViewHighlightOverlaysJellybeanMR2$HighlightDrawable[] mHighlightDrawables>
	//   64  114:return          
	}
}
