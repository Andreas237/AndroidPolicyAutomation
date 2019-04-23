// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat, AndroidResources

private static class VectorDrawableCompat$VGroup extends 
{

	private void updateLocalMatrix()
	{
		mLocalMatrix.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Matrix mLocalMatrix>
	//    2    4:invokevirtual   #119 <Method void Matrix.reset()>
		mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
	//    3    7:aload_0         
	//    4    8:getfield        #59  <Field Matrix mLocalMatrix>
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field float mPivotX>
	//    7   15:fneg            
	//    8   16:aload_0         
	//    9   17:getfield        #49  <Field float mPivotY>
	//   10   20:fneg            
	//   11   21:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
	//   12   24:pop             
		mLocalMatrix.postScale(mScaleX, mScaleY);
	//   13   25:aload_0         
	//   14   26:getfield        #59  <Field Matrix mLocalMatrix>
	//   15   29:aload_0         
	//   16   30:getfield        #51  <Field float mScaleX>
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field float mScaleY>
	//   19   37:invokevirtual   #126 <Method boolean Matrix.postScale(float, float)>
	//   20   40:pop             
		mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
	//   21   41:aload_0         
	//   22   42:getfield        #59  <Field Matrix mLocalMatrix>
	//   23   45:aload_0         
	//   24   46:getfield        #45  <Field float mRotate>
	//   25   49:fconst_0        
	//   26   50:fconst_0        
	//   27   51:invokevirtual   #130 <Method boolean Matrix.postRotate(float, float, float)>
	//   28   54:pop             
		mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
	//   29   55:aload_0         
	//   30   56:getfield        #59  <Field Matrix mLocalMatrix>
	//   31   59:aload_0         
	//   32   60:getfield        #55  <Field float mTranslateX>
	//   33   63:aload_0         
	//   34   64:getfield        #47  <Field float mPivotX>
	//   35   67:fadd            
	//   36   68:aload_0         
	//   37   69:getfield        #57  <Field float mTranslateY>
	//   38   72:aload_0         
	//   39   73:getfield        #49  <Field float mPivotY>
	//   40   76:fadd            
	//   41   77:invokevirtual   #123 <Method boolean Matrix.postTranslate(float, float)>
	//   42   80:pop             
	//   43   81:return          
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		mThemeAttrs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #65  <Field int[] mThemeAttrs>
		mRotate = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, mRotate);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:ldc1            #134 <String "rotation">
	//    7   10:iconst_5        
	//    8   11:aload_0         
	//    9   12:getfield        #45  <Field float mRotate>
	//   10   15:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   11   18:putfield        #45  <Field float mRotate>
		mPivotX = typedarray.getFloat(1, mPivotX);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:iconst_1        
	//   15   24:aload_0         
	//   16   25:getfield        #47  <Field float mPivotX>
	//   17   28:invokevirtual   #146 <Method float TypedArray.getFloat(int, float)>
	//   18   31:putfield        #47  <Field float mPivotX>
		mPivotY = typedarray.getFloat(2, mPivotY);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:iconst_2        
	//   22   37:aload_0         
	//   23   38:getfield        #49  <Field float mPivotY>
	//   24   41:invokevirtual   #146 <Method float TypedArray.getFloat(int, float)>
	//   25   44:putfield        #49  <Field float mPivotY>
		mScaleX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, mScaleX);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aload_2         
	//   29   50:ldc1            #148 <String "scaleX">
	//   30   52:iconst_3        
	//   31   53:aload_0         
	//   32   54:getfield        #51  <Field float mScaleX>
	//   33   57:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   34   60:putfield        #51  <Field float mScaleX>
		mScaleY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, mScaleY);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:aload_2         
	//   38   66:ldc1            #150 <String "scaleY">
	//   39   68:iconst_4        
	//   40   69:aload_0         
	//   41   70:getfield        #53  <Field float mScaleY>
	//   42   73:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   43   76:putfield        #53  <Field float mScaleY>
		mTranslateX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, mTranslateX);
	//   44   79:aload_0         
	//   45   80:aload_1         
	//   46   81:aload_2         
	//   47   82:ldc1            #152 <String "translateX">
	//   48   84:bipush          6
	//   49   86:aload_0         
	//   50   87:getfield        #55  <Field float mTranslateX>
	//   51   90:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   52   93:putfield        #55  <Field float mTranslateX>
		mTranslateY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, mTranslateY);
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:aload_2         
	//   56   99:ldc1            #154 <String "translateY">
	//   57  101:bipush          7
	//   58  103:aload_0         
	//   59  104:getfield        #57  <Field float mTranslateY>
	//   60  107:invokestatic    #140 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   61  110:putfield        #57  <Field float mTranslateY>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//   62  113:aload_1         
	//   63  114:iconst_0        
	//   64  115:invokevirtual   #158 <Method String TypedArray.getString(int)>
	//   65  118:astore_1        
		if(typedarray != null)
	//*  66  119:aload_1         
	//*  67  120:ifnull          128
			mGroupName = ((String) (typedarray));
	//   68  123:aload_0         
	//   69  124:aload_1         
	//   70  125:putfield        #61  <Field String mGroupName>
		updateLocalMatrix();
	//   71  128:aload_0         
	//   72  129:invokespecial   #160 <Method void updateLocalMatrix()>
	//   73  132:return          
	}

	public String getGroupName()
	{
		return mGroupName;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String mGroupName>
	//    2    4:areturn         
	}

	public Matrix getLocalMatrix()
	{
		return mLocalMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Matrix mLocalMatrix>
	//    2    4:areturn         
	}

	public float getPivotX()
	{
		return mPivotX;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float mPivotX>
	//    2    4:freturn         
	}

	public float getPivotY()
	{
		return mPivotY;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float mPivotY>
	//    2    4:freturn         
	}

	public float getRotation()
	{
		return mRotate;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float mRotate>
	//    2    4:freturn         
	}

	public float getScaleX()
	{
		return mScaleX;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float mScaleX>
	//    2    4:freturn         
	}

	public float getScaleY()
	{
		return mScaleY;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field float mScaleY>
	//    2    4:freturn         
	}

	public float getTranslateX()
	{
		return mTranslateX;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float mTranslateX>
	//    2    4:freturn         
	}

	public float getTranslateY()
	{
		return mTranslateY;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field float mTranslateY>
	//    2    4:freturn         
	}

	public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #179 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP>
	//    4    6:invokestatic    #183 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #185 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #188 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	public boolean isStateful()
	{
		for(int i = 0; i < mChildren.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field ArrayList mChildren>
	//*   5    7:invokevirtual   #81  <Method int ArrayList.size()>
	//*   6   10:icmpge          39
			if((()mChildren.get(i)).isStateful())
	//*   7   13:aload_0         
	//*   8   14:getfield        #43  <Field ArrayList mChildren>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #85  <Method Object ArrayList.get(int)>
	//*  11   21:checkcast       #4   <Class VectorDrawableCompat$VObject>
	//*  12   24:invokevirtual   #192 <Method boolean VectorDrawableCompat$VObject.isStateful()>
	//*  13   27:ifeq            32
				return true;
	//   14   30:iconst_1        
	//   15   31:ireturn         

	//   16   32:iload_1         
	//   17   33:iconst_1        
	//   18   34:iadd            
	//   19   35:istore_1        
	//*  20   36:goto            2
		return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
	}

	public boolean onStateChanged(int ai[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore_3        
		for(; i < mChildren.size(); i++)
	//*   4    4:iload_2         
	//*   5    5:aload_0         
	//*   6    6:getfield        #43  <Field ArrayList mChildren>
	//*   7    9:invokevirtual   #81  <Method int ArrayList.size()>
	//*   8   12:icmpge          40
			flag |= (()mChildren.get(i)).onStateChanged(ai);
	//    9   15:iload_3         
	//   10   16:aload_0         
	//   11   17:getfield        #43  <Field ArrayList mChildren>
	//   12   20:iload_2         
	//   13   21:invokevirtual   #85  <Method Object ArrayList.get(int)>
	//   14   24:checkcast       #4   <Class VectorDrawableCompat$VObject>
	//   15   27:aload_1         
	//   16   28:invokevirtual   #196 <Method boolean VectorDrawableCompat$VObject.onStateChanged(int[])>
	//   17   31:ior             
	//   18   32:istore_3        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            4
		return flag;
	//   24   40:iload_3         
	//   25   41:ireturn         
	}

	public void setPivotX(float f)
	{
		if(f != mPivotX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field float mPivotX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mPivotX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #47  <Field float mPivotX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setPivotY(float f)
	{
		if(f != mPivotY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #49  <Field float mPivotY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mPivotY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #49  <Field float mPivotY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setRotation(float f)
	{
		if(f != mRotate)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #45  <Field float mRotate>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mRotate = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #45  <Field float mRotate>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setScaleX(float f)
	{
		if(f != mScaleX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #51  <Field float mScaleX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mScaleX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #51  <Field float mScaleX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setScaleY(float f)
	{
		if(f != mScaleY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field float mScaleY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mScaleY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #53  <Field float mScaleY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setTranslateX(float f)
	{
		if(f != mTranslateX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field float mTranslateX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mTranslateX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #55  <Field float mTranslateX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setTranslateY(float f)
	{
		if(f != mTranslateY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #57  <Field float mTranslateY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mTranslateY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #57  <Field float mTranslateY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #160 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	int mChangingConfigurations;
	final ArrayList mChildren;
	private String mGroupName;
	final Matrix mLocalMatrix;
	private float mPivotX;
	private float mPivotY;
	float mRotate;
	private float mScaleX;
	private float mScaleY;
	final Matrix mStackedMatrix;
	private int mThemeAttrs[];
	private float mTranslateX;
	private float mTranslateY;

	public VectorDrawableCompat$VGroup()
	{
		super(((VectorDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #32  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
		mStackedMatrix = new Matrix();
	//    3    5:aload_0         
	//    4    6:new             #34  <Class Matrix>
	//    5    9:dup             
	//    6   10:invokespecial   #36  <Method void Matrix()>
	//    7   13:putfield        #38  <Field Matrix mStackedMatrix>
		mChildren = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #40  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #41  <Method void ArrayList()>
	//   12   24:putfield        #43  <Field ArrayList mChildren>
		mRotate = 0.0F;
	//   13   27:aload_0         
	//   14   28:fconst_0        
	//   15   29:putfield        #45  <Field float mRotate>
		mPivotX = 0.0F;
	//   16   32:aload_0         
	//   17   33:fconst_0        
	//   18   34:putfield        #47  <Field float mPivotX>
		mPivotY = 0.0F;
	//   19   37:aload_0         
	//   20   38:fconst_0        
	//   21   39:putfield        #49  <Field float mPivotY>
		mScaleX = 1.0F;
	//   22   42:aload_0         
	//   23   43:fconst_1        
	//   24   44:putfield        #51  <Field float mScaleX>
		mScaleY = 1.0F;
	//   25   47:aload_0         
	//   26   48:fconst_1        
	//   27   49:putfield        #53  <Field float mScaleY>
		mTranslateX = 0.0F;
	//   28   52:aload_0         
	//   29   53:fconst_0        
	//   30   54:putfield        #55  <Field float mTranslateX>
		mTranslateY = 0.0F;
	//   31   57:aload_0         
	//   32   58:fconst_0        
	//   33   59:putfield        #57  <Field float mTranslateY>
		mLocalMatrix = new Matrix();
	//   34   62:aload_0         
	//   35   63:new             #34  <Class Matrix>
	//   36   66:dup             
	//   37   67:invokespecial   #36  <Method void Matrix()>
	//   38   70:putfield        #59  <Field Matrix mLocalMatrix>
		mGroupName = null;
	//   39   73:aload_0         
	//   40   74:aconst_null     
	//   41   75:putfield        #61  <Field String mGroupName>
	//   42   78:return          
	}

	public VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup vectordrawablecompat$vgroup, ArrayMap arraymap)
	{
label0:
		{
			super(((VectorDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #32  <Method void VectorDrawableCompat$VObject(VectorDrawableCompat$1)>
			mStackedMatrix = new Matrix();
	//    3    5:aload_0         
	//    4    6:new             #34  <Class Matrix>
	//    5    9:dup             
	//    6   10:invokespecial   #36  <Method void Matrix()>
	//    7   13:putfield        #38  <Field Matrix mStackedMatrix>
			mChildren = new ArrayList();
	//    8   16:aload_0         
	//    9   17:new             #40  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #41  <Method void ArrayList()>
	//   12   24:putfield        #43  <Field ArrayList mChildren>
			mRotate = 0.0F;
	//   13   27:aload_0         
	//   14   28:fconst_0        
	//   15   29:putfield        #45  <Field float mRotate>
			mPivotX = 0.0F;
	//   16   32:aload_0         
	//   17   33:fconst_0        
	//   18   34:putfield        #47  <Field float mPivotX>
			mPivotY = 0.0F;
	//   19   37:aload_0         
	//   20   38:fconst_0        
	//   21   39:putfield        #49  <Field float mPivotY>
			mScaleX = 1.0F;
	//   22   42:aload_0         
	//   23   43:fconst_1        
	//   24   44:putfield        #51  <Field float mScaleX>
			mScaleY = 1.0F;
	//   25   47:aload_0         
	//   26   48:fconst_1        
	//   27   49:putfield        #53  <Field float mScaleY>
			mTranslateX = 0.0F;
	//   28   52:aload_0         
	//   29   53:fconst_0        
	//   30   54:putfield        #55  <Field float mTranslateX>
			mTranslateY = 0.0F;
	//   31   57:aload_0         
	//   32   58:fconst_0        
	//   33   59:putfield        #57  <Field float mTranslateY>
			mLocalMatrix = new Matrix();
	//   34   62:aload_0         
	//   35   63:new             #34  <Class Matrix>
	//   36   66:dup             
	//   37   67:invokespecial   #36  <Method void Matrix()>
	//   38   70:putfield        #59  <Field Matrix mLocalMatrix>
			mGroupName = null;
	//   39   73:aload_0         
	//   40   74:aconst_null     
	//   41   75:putfield        #61  <Field String mGroupName>
			mRotate = vectordrawablecompat$vgroup.mRotate;
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:getfield        #45  <Field float mRotate>
	//   45   83:putfield        #45  <Field float mRotate>
			mPivotX = vectordrawablecompat$vgroup.mPivotX;
	//   46   86:aload_0         
	//   47   87:aload_1         
	//   48   88:getfield        #47  <Field float mPivotX>
	//   49   91:putfield        #47  <Field float mPivotX>
			mPivotY = vectordrawablecompat$vgroup.mPivotY;
	//   50   94:aload_0         
	//   51   95:aload_1         
	//   52   96:getfield        #49  <Field float mPivotY>
	//   53   99:putfield        #49  <Field float mPivotY>
			mScaleX = vectordrawablecompat$vgroup.mScaleX;
	//   54  102:aload_0         
	//   55  103:aload_1         
	//   56  104:getfield        #51  <Field float mScaleX>
	//   57  107:putfield        #51  <Field float mScaleX>
			mScaleY = vectordrawablecompat$vgroup.mScaleY;
	//   58  110:aload_0         
	//   59  111:aload_1         
	//   60  112:getfield        #53  <Field float mScaleY>
	//   61  115:putfield        #53  <Field float mScaleY>
			mTranslateX = vectordrawablecompat$vgroup.mTranslateX;
	//   62  118:aload_0         
	//   63  119:aload_1         
	//   64  120:getfield        #55  <Field float mTranslateX>
	//   65  123:putfield        #55  <Field float mTranslateX>
			mTranslateY = vectordrawablecompat$vgroup.mTranslateY;
	//   66  126:aload_0         
	//   67  127:aload_1         
	//   68  128:getfield        #57  <Field float mTranslateY>
	//   69  131:putfield        #57  <Field float mTranslateY>
			mThemeAttrs = vectordrawablecompat$vgroup.mThemeAttrs;
	//   70  134:aload_0         
	//   71  135:aload_1         
	//   72  136:getfield        #65  <Field int[] mThemeAttrs>
	//   73  139:putfield        #65  <Field int[] mThemeAttrs>
			mGroupName = vectordrawablecompat$vgroup.mGroupName;
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:getfield        #61  <Field String mGroupName>
	//   77  147:putfield        #61  <Field String mGroupName>
			mChangingConfigurations = vectordrawablecompat$vgroup.mChangingConfigurations;
	//   78  150:aload_0         
	//   79  151:aload_1         
	//   80  152:getfield        #67  <Field int mChangingConfigurations>
	//   81  155:putfield        #67  <Field int mChangingConfigurations>
			Object obj = ((Object) (mGroupName));
	//   82  158:aload_0         
	//   83  159:getfield        #61  <Field String mGroupName>
	//   84  162:astore          4
			if(obj != null)
	//*  85  164:aload           4
	//*  86  166:ifnull          177
				arraymap.put(obj, ((Object) (this)));
	//   87  169:aload_2         
	//   88  170:aload           4
	//   89  172:aload_0         
	//   90  173:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
	//   91  176:pop             
			mLocalMatrix.set(vectordrawablecompat$vgroup.mLocalMatrix);
	//   92  177:aload_0         
	//   93  178:getfield        #59  <Field Matrix mLocalMatrix>
	//   94  181:aload_1         
	//   95  182:getfield        #59  <Field Matrix mLocalMatrix>
	//   96  185:invokevirtual   #77  <Method void Matrix.set(Matrix)>
			obj = ((Object) (vectordrawablecompat$vgroup.mChildren));
	//   97  188:aload_1         
	//   98  189:getfield        #43  <Field ArrayList mChildren>
	//   99  192:astore          4
			int i = 0;
	//  100  194:iconst_0        
	//  101  195:istore_3        
			do
			{
				if(i >= ((ArrayList) (obj)).size())
					break label0;
	//  102  196:iload_3         
	//  103  197:aload           4
	//  104  199:invokevirtual   #81  <Method int ArrayList.size()>
	//  105  202:icmpge          328
				vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (((ArrayList) (obj)).get(i)));
	//  106  205:aload           4
	//  107  207:iload_3         
	//  108  208:invokevirtual   #85  <Method Object ArrayList.get(int)>
	//  109  211:astore_1        
				if(vectordrawablecompat$vgroup instanceof VectorDrawableCompat$VGroup)
	//* 110  212:aload_1         
	//* 111  213:instanceof      #2   <Class VectorDrawableCompat$VGroup>
	//* 112  216:ifeq            244
				{
					vectordrawablecompat$vgroup = (VectorDrawableCompat$VGroup)vectordrawablecompat$vgroup;
	//  113  219:aload_1         
	//  114  220:checkcast       #2   <Class VectorDrawableCompat$VGroup>
	//  115  223:astore_1        
					mChildren.add(((Object) (new VectorDrawableCompat$VGroup(vectordrawablecompat$vgroup, arraymap))));
	//  116  224:aload_0         
	//  117  225:getfield        #43  <Field ArrayList mChildren>
	//  118  228:new             #2   <Class VectorDrawableCompat$VGroup>
	//  119  231:dup             
	//  120  232:aload_1         
	//  121  233:aload_2         
	//  122  234:invokespecial   #87  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
	//  123  237:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//  124  240:pop             
				} else
	//* 125  241:goto            311
				{
					if(vectordrawablecompat$vgroup instanceof th)
	//* 126  244:aload_1         
	//* 127  245:instanceof      #93  <Class VectorDrawableCompat$VFullPath>
	//* 128  248:ifeq            266
					{
						vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (new th((th)vectordrawablecompat$vgroup)));
	//  129  251:new             #93  <Class VectorDrawableCompat$VFullPath>
	//  130  254:dup             
	//  131  255:aload_1         
	//  132  256:checkcast       #93  <Class VectorDrawableCompat$VFullPath>
	//  133  259:invokespecial   #96  <Method void VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath)>
	//  134  262:astore_1        
					} else
	//* 135  263:goto            285
					{
						if(!(vectordrawablecompat$vgroup instanceof th))
							break;
	//  136  266:aload_1         
	//  137  267:instanceof      #98  <Class VectorDrawableCompat$VClipPath>
	//  138  270:ifeq            318
						vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (new th((th)vectordrawablecompat$vgroup)));
	//  139  273:new             #98  <Class VectorDrawableCompat$VClipPath>
	//  140  276:dup             
	//  141  277:aload_1         
	//  142  278:checkcast       #98  <Class VectorDrawableCompat$VClipPath>
	//  143  281:invokespecial   #101 <Method void VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath)>
	//  144  284:astore_1        
					}
					mChildren.add(((Object) (vectordrawablecompat$vgroup)));
	//  145  285:aload_0         
	//  146  286:getfield        #43  <Field ArrayList mChildren>
	//  147  289:aload_1         
	//  148  290:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//  149  293:pop             
					if(((VectorDrawableCompat.VPath) (vectordrawablecompat$vgroup)).mPathName != null)
	//* 150  294:aload_1         
	//* 151  295:getfield        #106 <Field String VectorDrawableCompat$VPath.mPathName>
	//* 152  298:ifnull          311
						arraymap.put(((Object) (((VectorDrawableCompat.VPath) (vectordrawablecompat$vgroup)).mPathName)), ((Object) (vectordrawablecompat$vgroup)));
	//  153  301:aload_2         
	//  154  302:aload_1         
	//  155  303:getfield        #106 <Field String VectorDrawableCompat$VPath.mPathName>
	//  156  306:aload_1         
	//  157  307:invokevirtual   #73  <Method Object ArrayMap.put(Object, Object)>
	//  158  310:pop             
				}
				i++;
	//  159  311:iload_3         
	//  160  312:iconst_1        
	//  161  313:iadd            
	//  162  314:istore_3        
			} while(true);
	//  163  315:goto            196
			throw new IllegalStateException("Unknown object in the tree!");
	//  164  318:new             #108 <Class IllegalStateException>
	//  165  321:dup             
	//  166  322:ldc1            #110 <String "Unknown object in the tree!">
	//  167  324:invokespecial   #113 <Method void IllegalStateException(String)>
	//  168  327:athrow          
		}
	//  169  328:return          
	}
}
