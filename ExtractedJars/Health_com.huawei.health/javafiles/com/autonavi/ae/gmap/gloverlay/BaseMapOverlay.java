// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import android.content.Context;
import android.graphics.Bitmap;
import com.amap.api.mapcore.util.s;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLOverlay

public abstract class BaseMapOverlay
	implements Serializable
{

	public BaseMapOverlay(int i, Context context, s s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mItemList = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field Vector mItemList>
		mEngineID = 1;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #33  <Field int mEngineID>
		mEngineID = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #33  <Field int mEngineID>
		mContext = context;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #35  <Field Context mContext>
		mMapView = s1;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #37  <Field s mMapView>
		mItemList = new Vector();
	//   17   29:aload_0         
	//   18   30:new             #39  <Class Vector>
	//   19   33:dup             
	//   20   34:invokespecial   #40  <Method void Vector()>
	//   21   37:putfield        #31  <Field Vector mItemList>
		iniGLOverlay();
	//   22   40:aload_0         
	//   23   41:invokevirtual   #43  <Method void iniGLOverlay()>
	//   24   44:return          
	}

	public abstract void addItem(Object obj);

	public boolean clear()
	{
		try
		{
			mItemList.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Vector mItemList>
	//    2    4:invokevirtual   #52  <Method void Vector.clear()>
			clearFocus();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #55  <Method void clearFocus()>
			if(mGLOverlay != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #57  <Field GLOverlay mGLOverlay>
	//*   7   15:ifnull          25
				mGLOverlay.removeAll();
	//    8   18:aload_0         
	//    9   19:getfield        #57  <Field GLOverlay mGLOverlay>
	//   10   22:invokevirtual   #62  <Method void GLOverlay.removeAll()>
		}
	//*  11   25:iconst_1        
	//*  12   26:ireturn         
		catch(Exception exception)
	//*  13   27:astore_1        
		{
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		}
		return true;
	}

	public void clearFocus()
	{
		mLastFocusedIndex = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #64  <Field int mLastFocusedIndex>
		mGLOverlay.clearFocus();
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field GLOverlay mGLOverlay>
	//    5    9:invokevirtual   #65  <Method void GLOverlay.clearFocus()>
	//    6   12:return          
	}

	public GLOverlay getGLOverlay()
	{
		return mGLOverlay;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field GLOverlay mGLOverlay>
	//    2    4:areturn         
	}

	public final Object getItem(int i)
	{
		Vector vector = mItemList;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Vector mItemList>
	//    2    4:astore_3        
		vector;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(i < 0)
			break MISSING_BLOCK_LABEL_26;
	//    5    7:iload_1         
	//    6    8:iflt            26
		int j = mItemList.size();
	//    7   11:aload_0         
	//    8   12:getfield        #31  <Field Vector mItemList>
	//    9   15:invokevirtual   #77  <Method int Vector.size()>
	//   10   18:istore_2        
		if(i <= j - 1)
			break MISSING_BLOCK_LABEL_30;
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:isub            
	//   15   23:icmple          30
		vector;
	//   16   26:aload_3         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		return ((Object) (null));
	//   18   28:aconst_null     
	//   19   29:areturn         
		Object obj = mItemList.get(i);
	//   20   30:aload_0         
	//   21   31:getfield        #31  <Field Vector mItemList>
	//   22   34:iload_1         
	//   23   35:invokevirtual   #80  <Method Object Vector.get(int)>
	//   24   38:astore          4
		vector;
	//   25   40:aload_3         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		return obj;
	//   27   42:aload           4
	//   28   44:areturn         
		Exception exception;
		exception;
	//   29   45:astore          4
	//*  30   47:aload_3         
		try
	//*  31   48:monitorexit     
		{
			throw exception;
	//   32   49:aload           4
	//   33   51:athrow          
		}
		catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  34   52:astore_3        
		{
			return ((Object) (null));
	//   35   53:aconst_null     
	//   36   54:areturn         
		}
	}

	public List getItems()
	{
		return ((List) (mItemList));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Vector mItemList>
	//    2    4:areturn         
	}

	public int getSize()
	{
		return mItemList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Vector mItemList>
	//    2    4:invokevirtual   #77  <Method int Vector.size()>
	//    3    7:ireturn         
	}

	protected abstract void iniGLOverlay();

	public boolean isClickable()
	{
		if(mGLOverlay != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field GLOverlay mGLOverlay>
	//*   2    4:ifnull          15
			return mGLOverlay.isClickable();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GLOverlay mGLOverlay>
	//    5   11:invokevirtual   #88  <Method boolean GLOverlay.isClickable()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isVisible()
	{
		if(mGLOverlay != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field GLOverlay mGLOverlay>
	//*   2    4:ifnull          15
			return mGLOverlay.isVisible();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GLOverlay mGLOverlay>
	//    5   11:invokevirtual   #91  <Method boolean GLOverlay.isVisible()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void releaseInstance()
	{
		if(getGLOverlay() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #94  <Method GLOverlay getGLOverlay()>
	//*   2    4:ifnull          48
		{
			if(mMapView != null && mMapView.isMaploaded())
	//*   3    7:aload_0         
	//*   4    8:getfield        #37  <Field s mMapView>
	//*   5   11:ifnull          36
	//*   6   14:aload_0         
	//*   7   15:getfield        #37  <Field s mMapView>
	//*   8   18:invokeinterface #99  <Method boolean s.isMaploaded()>
	//*   9   23:ifeq            36
				mMapView.removeGLOverlay(this);
	//   10   26:aload_0         
	//   11   27:getfield        #37  <Field s mMapView>
	//   12   30:aload_0         
	//   13   31:invokeinterface #103 <Method void s.removeGLOverlay(BaseMapOverlay)>
			getGLOverlay().releaseInstance();
	//   14   36:aload_0         
	//   15   37:invokevirtual   #94  <Method GLOverlay getGLOverlay()>
	//   16   40:invokevirtual   #105 <Method void GLOverlay.releaseInstance()>
			mGLOverlay = null;
	//   17   43:aload_0         
	//   18   44:aconst_null     
	//   19   45:putfield        #57  <Field GLOverlay mGLOverlay>
		}
	//   20   48:return          
	}

	public boolean removeAll()
	{
		return clear();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method boolean clear()>
	//    2    4:ireturn         
	}

	public void removeItem(int i)
	{
label0:
		{
			if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            19
			{
				int j;
				try
				{
					j = mItemList.size();
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Vector mItemList>
	//    4    8:invokevirtual   #77  <Method int Vector.size()>
	//    5   11:istore_2        
				}
	//*   6   12:iload_1         
	//*   7   13:iload_2         
	//*   8   14:iconst_1        
	//*   9   15:isub            
	//*  10   16:icmple          20
	//*  11   19:return          
	//*  12   20:iload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #64  <Field int mLastFocusedIndex>
	//*  15   25:icmpne          37
	//*  16   28:aload_0         
	//*  17   29:iconst_m1       
	//*  18   30:putfield        #64  <Field int mLastFocusedIndex>
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #55  <Method void clearFocus()>
	//*  21   37:aload_0         
	//*  22   38:getfield        #31  <Field Vector mItemList>
	//*  23   41:iload_1         
	//*  24   42:invokevirtual   #112 <Method Object Vector.remove(int)>
	//*  25   45:pop             
	//*  26   46:aload_0         
	//*  27   47:getfield        #57  <Field GLOverlay mGLOverlay>
	//*  28   50:ifnull          61
	//*  29   53:aload_0         
	//*  30   54:getfield        #57  <Field GLOverlay mGLOverlay>
	//*  31   57:iload_1         
	//*  32   58:invokevirtual   #114 <Method void GLOverlay.removeItem(int)>
	//*  33   61:return          
				catch(IndexOutOfBoundsException indexoutofboundsexception)
	//*  34   62:astore_3        
				{
					return;
	//   35   63:return          
				}
				if(i <= j - 1)
					break label0;
			}
			return;
		}
		if(i == mLastFocusedIndex)
		{
			mLastFocusedIndex = -1;
			clearFocus();
		}
		mItemList.remove(i);
		if(mGLOverlay != null)
			mGLOverlay.removeItem(i);
		return;
	}

	public void removeItem(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Vector vector = mItemList;
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Vector mItemList>
	//    5    9:astore_2        
		vector;
	//    6   10:aload_2         
		JVM INSTR monitorenter ;
	//    7   11:monitorenter    
		removeItem(mItemList.indexOf(obj));
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #31  <Field Vector mItemList>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #118 <Method int Vector.indexOf(Object)>
	//   13   21:invokevirtual   #119 <Method void removeItem(int)>
		vector;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		  goto _L1
	//*  16   26:goto            34
		obj;
	//   17   29:astore_1        
	//*  18   30:aload_2         
		throw obj;
	//   19   31:monitorexit     
	//   20   32:aload_1         
	//   21   33:athrow          
_L1:
		return;
	//   22   34:return          
		obj;
	//   23   35:astore_1        
	//   24   36:return          
	}

	public abstract void resumeMarker(Bitmap bitmap);

	public void setClickable(boolean flag)
	{
		if(mGLOverlay != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field GLOverlay mGLOverlay>
	//*   2    4:ifnull          15
			mGLOverlay.setClickable(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GLOverlay mGLOverlay>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #126 <Method void GLOverlay.setClickable(boolean)>
	//    7   15:return          
	}

	public void setVisible(boolean flag)
	{
		if(mGLOverlay != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field GLOverlay mGLOverlay>
	//*   2    4:ifnull          15
			mGLOverlay.setVisible(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field GLOverlay mGLOverlay>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #129 <Method void GLOverlay.setVisible(boolean)>
	//    7   15:return          
	}

	private static final long serialVersionUID = 1L;
	protected Context mContext;
	protected int mEngineID;
	protected GLOverlay mGLOverlay;
	protected Vector mItemList;
	protected int mLastFocusedIndex;
	protected s mMapView;
}
