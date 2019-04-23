// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.graphics.RectF;
import android.view.MotionEvent;

// Referenced classes of package com.github.chrisbanes.photoview:
//			PhotoViewAttacher, OnPhotoTapListener, OnOutsidePhotoTapListener

class PhotoViewAttacher$2
	implements android.view.ubleTapListener
{

	public boolean onDoubleTap(MotionEvent motionevent)
	{
		float f;
		float f1;
		float f2;
		f = getScale();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field PhotoViewAttacher this$0>
	//    2    4:invokevirtual   #28  <Method float PhotoViewAttacher.getScale()>
	//    3    7:fstore_2        
		f1 = motionevent.getX();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #33  <Method float MotionEvent.getX()>
	//    6   12:fstore_3        
		f2 = motionevent.getY();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #36  <Method float MotionEvent.getY()>
	//    9   17:fstore          4
		if(f >= getMediumScale())
			break MISSING_BLOCK_LABEL_51;
	//   10   19:fload_2         
	//   11   20:aload_0         
	//   12   21:getfield        #16  <Field PhotoViewAttacher this$0>
	//   13   24:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
	//   14   27:fcmpg           
	//   15   28:ifge            51
		setScale(getMediumScale(), f1, f2, true);
	//   16   31:aload_0         
	//   17   32:getfield        #16  <Field PhotoViewAttacher this$0>
	//   18   35:aload_0         
	//   19   36:getfield        #16  <Field PhotoViewAttacher this$0>
	//   20   39:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
	//   21   42:fload_3         
	//   22   43:fload           4
	//   23   45:iconst_1        
	//   24   46:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
		return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
		if(f < getMediumScale() || f >= getMaximumScale())
			break MISSING_BLOCK_LABEL_95;
	//   27   51:fload_2         
	//   28   52:aload_0         
	//   29   53:getfield        #16  <Field PhotoViewAttacher this$0>
	//   30   56:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
	//   31   59:fcmpl           
	//   32   60:iflt            95
	//   33   63:fload_2         
	//   34   64:aload_0         
	//   35   65:getfield        #16  <Field PhotoViewAttacher this$0>
	//   36   68:invokevirtual   #46  <Method float PhotoViewAttacher.getMaximumScale()>
	//   37   71:fcmpg           
	//   38   72:ifge            95
		setScale(getMaximumScale(), f1, f2, true);
	//   39   75:aload_0         
	//   40   76:getfield        #16  <Field PhotoViewAttacher this$0>
	//   41   79:aload_0         
	//   42   80:getfield        #16  <Field PhotoViewAttacher this$0>
	//   43   83:invokevirtual   #46  <Method float PhotoViewAttacher.getMaximumScale()>
	//   44   86:fload_3         
	//   45   87:fload           4
	//   46   89:iconst_1        
	//   47   90:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
		return true;
	//   48   93:iconst_1        
	//   49   94:ireturn         
		try
		{
			setScale(getMinimumScale(), f1, f2, true);
	//   50   95:aload_0         
	//   51   96:getfield        #16  <Field PhotoViewAttacher this$0>
	//   52   99:aload_0         
	//   53  100:getfield        #16  <Field PhotoViewAttacher this$0>
	//   54  103:invokevirtual   #49  <Method float PhotoViewAttacher.getMinimumScale()>
	//   55  106:fload_3         
	//   56  107:fload           4
	//   57  109:iconst_1        
	//   58  110:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
		}
	//*  59  113:iconst_1        
	//*  60  114:ireturn         
		// Misplaced declaration of an exception variable
		catch(MotionEvent motionevent)
	//*  61  115:astore_1        
		{
			return true;
	//   62  116:iconst_1        
	//   63  117:ireturn         
		}
		return true;
	}

	public boolean onDoubleTapEvent(MotionEvent motionevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onSingleTapConfirmed(MotionEvent motionevent)
	{
		if(PhotoViewAttacher.access$500(PhotoViewAttacher.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field PhotoViewAttacher this$0>
	//*   2    4:invokestatic    #55  <Method android.view.View$OnClickListener PhotoViewAttacher.access$500(PhotoViewAttacher)>
	//*   3    7:ifnull          29
			PhotoViewAttacher.access$500(PhotoViewAttacher.this).onClick(((android.view.View) (PhotoViewAttacher.access$100(PhotoViewAttacher.this))));
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field PhotoViewAttacher this$0>
	//    6   14:invokestatic    #55  <Method android.view.View$OnClickListener PhotoViewAttacher.access$500(PhotoViewAttacher)>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field PhotoViewAttacher this$0>
	//    9   21:invokestatic    #59  <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   10   24:invokeinterface #65  <Method void android.view.View$OnClickListener.onClick(android.view.View)>
		RectF rectf = getDisplayRect();
	//   11   29:aload_0         
	//   12   30:getfield        #16  <Field PhotoViewAttacher this$0>
	//   13   33:invokevirtual   #69  <Method RectF PhotoViewAttacher.getDisplayRect()>
	//   14   36:astore          4
		if(rectf != null)
	//*  15   38:aload           4
	//*  16   40:ifnull          153
		{
			float f1 = motionevent.getX();
	//   17   43:aload_1         
	//   18   44:invokevirtual   #33  <Method float MotionEvent.getX()>
	//   19   47:fstore_3        
			float f = motionevent.getY();
	//   20   48:aload_1         
	//   21   49:invokevirtual   #36  <Method float MotionEvent.getY()>
	//   22   52:fstore_2        
			if(rectf.contains(f1, f))
	//*  23   53:aload           4
	//*  24   55:fload_3         
	//*  25   56:fload_2         
	//*  26   57:invokevirtual   #75  <Method boolean RectF.contains(float, float)>
	//*  27   60:ifeq            124
			{
				f1 = (f1 - rectf.left) / rectf.width();
	//   28   63:fload_3         
	//   29   64:aload           4
	//   30   66:getfield        #79  <Field float RectF.left>
	//   31   69:fsub            
	//   32   70:aload           4
	//   33   72:invokevirtual   #82  <Method float RectF.width()>
	//   34   75:fdiv            
	//   35   76:fstore_3        
				f = (f - rectf.top) / rectf.height();
	//   36   77:fload_2         
	//   37   78:aload           4
	//   38   80:getfield        #85  <Field float RectF.top>
	//   39   83:fsub            
	//   40   84:aload           4
	//   41   86:invokevirtual   #88  <Method float RectF.height()>
	//   42   89:fdiv            
	//   43   90:fstore_2        
				if(PhotoViewAttacher.access$600(PhotoViewAttacher.this) != null)
	//*  44   91:aload_0         
	//*  45   92:getfield        #16  <Field PhotoViewAttacher this$0>
	//*  46   95:invokestatic    #92  <Method OnPhotoTapListener PhotoViewAttacher.access$600(PhotoViewAttacher)>
	//*  47   98:ifnull          122
					PhotoViewAttacher.access$600(PhotoViewAttacher.this).onPhotoTap(PhotoViewAttacher.access$100(PhotoViewAttacher.this), f1, f);
	//   48  101:aload_0         
	//   49  102:getfield        #16  <Field PhotoViewAttacher this$0>
	//   50  105:invokestatic    #92  <Method OnPhotoTapListener PhotoViewAttacher.access$600(PhotoViewAttacher)>
	//   51  108:aload_0         
	//   52  109:getfield        #16  <Field PhotoViewAttacher this$0>
	//   53  112:invokestatic    #59  <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   54  115:fload_3         
	//   55  116:fload_2         
	//   56  117:invokeinterface #98  <Method void OnPhotoTapListener.onPhotoTap(android.widget.ImageView, float, float)>
				return true;
	//   57  122:iconst_1        
	//   58  123:ireturn         
			}
			if(PhotoViewAttacher.access$700(PhotoViewAttacher.this) != null)
	//*  59  124:aload_0         
	//*  60  125:getfield        #16  <Field PhotoViewAttacher this$0>
	//*  61  128:invokestatic    #102 <Method OnOutsidePhotoTapListener PhotoViewAttacher.access$700(PhotoViewAttacher)>
	//*  62  131:ifnull          153
				PhotoViewAttacher.access$700(PhotoViewAttacher.this).onOutsidePhotoTap(PhotoViewAttacher.access$100(PhotoViewAttacher.this));
	//   63  134:aload_0         
	//   64  135:getfield        #16  <Field PhotoViewAttacher this$0>
	//   65  138:invokestatic    #102 <Method OnOutsidePhotoTapListener PhotoViewAttacher.access$700(PhotoViewAttacher)>
	//   66  141:aload_0         
	//   67  142:getfield        #16  <Field PhotoViewAttacher this$0>
	//   68  145:invokestatic    #59  <Method android.widget.ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
	//   69  148:invokeinterface #107 <Method void OnOutsidePhotoTapListener.onOutsidePhotoTap(android.widget.ImageView)>
		}
		return false;
	//   70  153:iconst_0        
	//   71  154:ireturn         
	}

	final PhotoViewAttacher this$0;

	PhotoViewAttacher$2()
	{
		this$0 = PhotoViewAttacher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field PhotoViewAttacher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
