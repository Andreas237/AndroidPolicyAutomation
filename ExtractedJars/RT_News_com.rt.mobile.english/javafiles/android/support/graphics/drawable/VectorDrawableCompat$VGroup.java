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

private static class VectorDrawableCompat$VGroup
{

	private void updateLocalMatrix()
	{
		mLocalMatrix.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
	//    2    4:invokevirtual   #120 <Method void Matrix.reset()>
		mLocalMatrix.postTranslate(-mPivotX, -mPivotY);
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field Matrix mLocalMatrix>
	//    5   11:aload_0         
	//    6   12:getfield        #45  <Field float mPivotX>
	//    7   15:fneg            
	//    8   16:aload_0         
	//    9   17:getfield        #47  <Field float mPivotY>
	//   10   20:fneg            
	//   11   21:invokevirtual   #124 <Method boolean Matrix.postTranslate(float, float)>
	//   12   24:pop             
		mLocalMatrix.postScale(mScaleX, mScaleY);
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field Matrix mLocalMatrix>
	//   15   29:aload_0         
	//   16   30:getfield        #49  <Field float mScaleX>
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field float mScaleY>
	//   19   37:invokevirtual   #127 <Method boolean Matrix.postScale(float, float)>
	//   20   40:pop             
		mLocalMatrix.postRotate(mRotate, 0.0F, 0.0F);
	//   21   41:aload_0         
	//   22   42:getfield        #57  <Field Matrix mLocalMatrix>
	//   23   45:aload_0         
	//   24   46:getfield        #43  <Field float mRotate>
	//   25   49:fconst_0        
	//   26   50:fconst_0        
	//   27   51:invokevirtual   #131 <Method boolean Matrix.postRotate(float, float, float)>
	//   28   54:pop             
		mLocalMatrix.postTranslate(mTranslateX + mPivotX, mTranslateY + mPivotY);
	//   29   55:aload_0         
	//   30   56:getfield        #57  <Field Matrix mLocalMatrix>
	//   31   59:aload_0         
	//   32   60:getfield        #53  <Field float mTranslateX>
	//   33   63:aload_0         
	//   34   64:getfield        #45  <Field float mPivotX>
	//   35   67:fadd            
	//   36   68:aload_0         
	//   37   69:getfield        #55  <Field float mTranslateY>
	//   38   72:aload_0         
	//   39   73:getfield        #47  <Field float mPivotY>
	//   40   76:fadd            
	//   41   77:invokevirtual   #124 <Method boolean Matrix.postTranslate(float, float)>
	//   42   80:pop             
	//   43   81:return          
	}

	private void updateStateFromTypedArray(TypedArray typedarray, XmlPullParser xmlpullparser)
	{
		mThemeAttrs = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #63  <Field int[] mThemeAttrs>
		mRotate = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "rotation", 5, mRotate);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:ldc1            #135 <String "rotation">
	//    7   10:iconst_5        
	//    8   11:aload_0         
	//    9   12:getfield        #43  <Field float mRotate>
	//   10   15:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   11   18:putfield        #43  <Field float mRotate>
		mPivotX = typedarray.getFloat(1, mPivotX);
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:iconst_1        
	//   15   24:aload_0         
	//   16   25:getfield        #45  <Field float mPivotX>
	//   17   28:invokevirtual   #147 <Method float TypedArray.getFloat(int, float)>
	//   18   31:putfield        #45  <Field float mPivotX>
		mPivotY = typedarray.getFloat(2, mPivotY);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:iconst_2        
	//   22   37:aload_0         
	//   23   38:getfield        #47  <Field float mPivotY>
	//   24   41:invokevirtual   #147 <Method float TypedArray.getFloat(int, float)>
	//   25   44:putfield        #47  <Field float mPivotY>
		mScaleX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleX", 3, mScaleX);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aload_2         
	//   29   50:ldc1            #149 <String "scaleX">
	//   30   52:iconst_3        
	//   31   53:aload_0         
	//   32   54:getfield        #49  <Field float mScaleX>
	//   33   57:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   34   60:putfield        #49  <Field float mScaleX>
		mScaleY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "scaleY", 4, mScaleY);
	//   35   63:aload_0         
	//   36   64:aload_1         
	//   37   65:aload_2         
	//   38   66:ldc1            #151 <String "scaleY">
	//   39   68:iconst_4        
	//   40   69:aload_0         
	//   41   70:getfield        #51  <Field float mScaleY>
	//   42   73:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   43   76:putfield        #51  <Field float mScaleY>
		mTranslateX = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateX", 6, mTranslateX);
	//   44   79:aload_0         
	//   45   80:aload_1         
	//   46   81:aload_2         
	//   47   82:ldc1            #153 <String "translateX">
	//   48   84:bipush          6
	//   49   86:aload_0         
	//   50   87:getfield        #53  <Field float mTranslateX>
	//   51   90:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   52   93:putfield        #53  <Field float mTranslateX>
		mTranslateY = TypedArrayUtils.getNamedFloat(typedarray, xmlpullparser, "translateY", 7, mTranslateY);
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:aload_2         
	//   56   99:ldc1            #155 <String "translateY">
	//   57  101:bipush          7
	//   58  103:aload_0         
	//   59  104:getfield        #55  <Field float mTranslateY>
	//   60  107:invokestatic    #141 <Method float TypedArrayUtils.getNamedFloat(TypedArray, XmlPullParser, String, int, float)>
	//   61  110:putfield        #55  <Field float mTranslateY>
		typedarray = ((TypedArray) (typedarray.getString(0)));
	//   62  113:aload_1         
	//   63  114:iconst_0        
	//   64  115:invokevirtual   #159 <Method String TypedArray.getString(int)>
	//   65  118:astore_1        
		if(typedarray != null)
	//*  66  119:aload_1         
	//*  67  120:ifnull          128
			mGroupName = ((String) (typedarray));
	//   68  123:aload_0         
	//   69  124:aload_1         
	//   70  125:putfield        #59  <Field String mGroupName>
		updateLocalMatrix();
	//   71  128:aload_0         
	//   72  129:invokespecial   #161 <Method void updateLocalMatrix()>
	//   73  132:return          
	}

	public String getGroupName()
	{
		return mGroupName;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String mGroupName>
	//    2    4:areturn         
	}

	public Matrix getLocalMatrix()
	{
		return mLocalMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
	//    2    4:areturn         
	}

	public float getPivotX()
	{
		return mPivotX;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field float mPivotX>
	//    2    4:freturn         
	}

	public float getPivotY()
	{
		return mPivotY;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field float mPivotY>
	//    2    4:freturn         
	}

	public float getRotation()
	{
		return mRotate;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float mRotate>
	//    2    4:freturn         
	}

	public float getScaleX()
	{
		return mScaleX;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field float mScaleX>
	//    2    4:freturn         
	}

	public float getScaleY()
	{
		return mScaleY;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field float mScaleY>
	//    2    4:freturn         
	}

	public float getTranslateX()
	{
		return mTranslateX;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field float mTranslateX>
	//    2    4:freturn         
	}

	public float getTranslateY()
	{
		return mTranslateY;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field float mTranslateY>
	//    2    4:freturn         
	}

	public void inflate(Resources resources, AttributeSet attributeset, android.content.res.Resources.Theme theme, XmlPullParser xmlpullparser)
	{
		resources = ((Resources) (TypedArrayUtils.obtainAttributes(resources, theme, attributeset, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP)));
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:aload_2         
	//    3    3:getstatic       #180 <Field int[] AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP>
	//    4    6:invokestatic    #184 <Method TypedArray TypedArrayUtils.obtainAttributes(Resources, android.content.res.Resources$Theme, AttributeSet, int[])>
	//    5    9:astore_1        
		updateStateFromTypedArray(((TypedArray) (resources)), xmlpullparser);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload           4
	//    9   14:invokespecial   #186 <Method void updateStateFromTypedArray(TypedArray, XmlPullParser)>
		((TypedArray) (resources)).recycle();
	//   10   17:aload_1         
	//   11   18:invokevirtual   #189 <Method void TypedArray.recycle()>
	//   12   21:return          
	}

	public void setPivotX(float f)
	{
		if(f != mPivotX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #45  <Field float mPivotX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mPivotX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #45  <Field float mPivotX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setPivotY(float f)
	{
		if(f != mPivotY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field float mPivotY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mPivotY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #47  <Field float mPivotY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setRotation(float f)
	{
		if(f != mRotate)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #43  <Field float mRotate>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mRotate = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #43  <Field float mRotate>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setScaleX(float f)
	{
		if(f != mScaleX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #49  <Field float mScaleX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mScaleX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #49  <Field float mScaleX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setScaleY(float f)
	{
		if(f != mScaleY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #51  <Field float mScaleY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mScaleY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #51  <Field float mScaleY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setTranslateX(float f)
	{
		if(f != mTranslateX)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field float mTranslateX>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mTranslateX = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #53  <Field float mTranslateX>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	public void setTranslateY(float f)
	{
		if(f != mTranslateY)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #55  <Field float mTranslateY>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			mTranslateY = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #55  <Field float mTranslateY>
			updateLocalMatrix();
	//    8   14:aload_0         
	//    9   15:invokespecial   #161 <Method void updateLocalMatrix()>
		}
	//   10   18:return          
	}

	int mChangingConfigurations;
	final ArrayList mChildren;
	private String mGroupName;
	private final Matrix mLocalMatrix;
	private float mPivotX;
	private float mPivotY;
	float mRotate;
	private float mScaleX;
	private float mScaleY;
	private final Matrix mStackedMatrix;
	private int mThemeAttrs[];
	private float mTranslateX;
	private float mTranslateY;


/*
	static Matrix access$200(VectorDrawableCompat$VGroup vectordrawablecompat$vgroup)
	{
		return vectordrawablecompat$vgroup.mStackedMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Matrix mStackedMatrix>
	//    2    4:areturn         
	}

*/


/*
	static Matrix access$300(VectorDrawableCompat$VGroup vectordrawablecompat$vgroup)
	{
		return vectordrawablecompat$vgroup.mLocalMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Matrix mLocalMatrix>
	//    2    4:areturn         
	}

*/

	public VectorDrawableCompat$VGroup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		mStackedMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Matrix()>
	//    6   12:putfield        #36  <Field Matrix mStackedMatrix>
		mChildren = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #38  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void ArrayList()>
	//   11   23:putfield        #41  <Field ArrayList mChildren>
		mRotate = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #43  <Field float mRotate>
		mPivotX = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #45  <Field float mPivotX>
		mPivotY = 0.0F;
	//   18   36:aload_0         
	//   19   37:fconst_0        
	//   20   38:putfield        #47  <Field float mPivotY>
		mScaleX = 1.0F;
	//   21   41:aload_0         
	//   22   42:fconst_1        
	//   23   43:putfield        #49  <Field float mScaleX>
		mScaleY = 1.0F;
	//   24   46:aload_0         
	//   25   47:fconst_1        
	//   26   48:putfield        #51  <Field float mScaleY>
		mTranslateX = 0.0F;
	//   27   51:aload_0         
	//   28   52:fconst_0        
	//   29   53:putfield        #53  <Field float mTranslateX>
		mTranslateY = 0.0F;
	//   30   56:aload_0         
	//   31   57:fconst_0        
	//   32   58:putfield        #55  <Field float mTranslateY>
		mLocalMatrix = new Matrix();
	//   33   61:aload_0         
	//   34   62:new             #33  <Class Matrix>
	//   35   65:dup             
	//   36   66:invokespecial   #34  <Method void Matrix()>
	//   37   69:putfield        #57  <Field Matrix mLocalMatrix>
		mGroupName = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #59  <Field String mGroupName>
	//   41   77:return          
	}

	public VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup vectordrawablecompat$vgroup, ArrayMap arraymap)
	{
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
			mStackedMatrix = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void Matrix()>
	//    6   12:putfield        #36  <Field Matrix mStackedMatrix>
			mChildren = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #38  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #39  <Method void ArrayList()>
	//   11   23:putfield        #41  <Field ArrayList mChildren>
			mRotate = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #43  <Field float mRotate>
			mPivotX = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #45  <Field float mPivotX>
			mPivotY = 0.0F;
	//   18   36:aload_0         
	//   19   37:fconst_0        
	//   20   38:putfield        #47  <Field float mPivotY>
			mScaleX = 1.0F;
	//   21   41:aload_0         
	//   22   42:fconst_1        
	//   23   43:putfield        #49  <Field float mScaleX>
			mScaleY = 1.0F;
	//   24   46:aload_0         
	//   25   47:fconst_1        
	//   26   48:putfield        #51  <Field float mScaleY>
			mTranslateX = 0.0F;
	//   27   51:aload_0         
	//   28   52:fconst_0        
	//   29   53:putfield        #53  <Field float mTranslateX>
			mTranslateY = 0.0F;
	//   30   56:aload_0         
	//   31   57:fconst_0        
	//   32   58:putfield        #55  <Field float mTranslateY>
			mLocalMatrix = new Matrix();
	//   33   61:aload_0         
	//   34   62:new             #33  <Class Matrix>
	//   35   65:dup             
	//   36   66:invokespecial   #34  <Method void Matrix()>
	//   37   69:putfield        #57  <Field Matrix mLocalMatrix>
			mGroupName = null;
	//   38   72:aload_0         
	//   39   73:aconst_null     
	//   40   74:putfield        #59  <Field String mGroupName>
			mRotate = vectordrawablecompat$vgroup.mRotate;
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:getfield        #43  <Field float mRotate>
	//   44   82:putfield        #43  <Field float mRotate>
			mPivotX = vectordrawablecompat$vgroup.mPivotX;
	//   45   85:aload_0         
	//   46   86:aload_1         
	//   47   87:getfield        #45  <Field float mPivotX>
	//   48   90:putfield        #45  <Field float mPivotX>
			mPivotY = vectordrawablecompat$vgroup.mPivotY;
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #47  <Field float mPivotY>
	//   52   98:putfield        #47  <Field float mPivotY>
			mScaleX = vectordrawablecompat$vgroup.mScaleX;
	//   53  101:aload_0         
	//   54  102:aload_1         
	//   55  103:getfield        #49  <Field float mScaleX>
	//   56  106:putfield        #49  <Field float mScaleX>
			mScaleY = vectordrawablecompat$vgroup.mScaleY;
	//   57  109:aload_0         
	//   58  110:aload_1         
	//   59  111:getfield        #51  <Field float mScaleY>
	//   60  114:putfield        #51  <Field float mScaleY>
			mTranslateX = vectordrawablecompat$vgroup.mTranslateX;
	//   61  117:aload_0         
	//   62  118:aload_1         
	//   63  119:getfield        #53  <Field float mTranslateX>
	//   64  122:putfield        #53  <Field float mTranslateX>
			mTranslateY = vectordrawablecompat$vgroup.mTranslateY;
	//   65  125:aload_0         
	//   66  126:aload_1         
	//   67  127:getfield        #55  <Field float mTranslateY>
	//   68  130:putfield        #55  <Field float mTranslateY>
			mThemeAttrs = vectordrawablecompat$vgroup.mThemeAttrs;
	//   69  133:aload_0         
	//   70  134:aload_1         
	//   71  135:getfield        #63  <Field int[] mThemeAttrs>
	//   72  138:putfield        #63  <Field int[] mThemeAttrs>
			mGroupName = vectordrawablecompat$vgroup.mGroupName;
	//   73  141:aload_0         
	//   74  142:aload_1         
	//   75  143:getfield        #59  <Field String mGroupName>
	//   76  146:putfield        #59  <Field String mGroupName>
			mChangingConfigurations = vectordrawablecompat$vgroup.mChangingConfigurations;
	//   77  149:aload_0         
	//   78  150:aload_1         
	//   79  151:getfield        #65  <Field int mChangingConfigurations>
	//   80  154:putfield        #65  <Field int mChangingConfigurations>
			if(mGroupName != null)
	//*  81  157:aload_0         
	//*  82  158:getfield        #59  <Field String mGroupName>
	//*  83  161:ifnull          174
				arraymap.put(((Object) (mGroupName)), ((Object) (this)));
	//   84  164:aload_2         
	//   85  165:aload_0         
	//   86  166:getfield        #59  <Field String mGroupName>
	//   87  169:aload_0         
	//   88  170:invokevirtual   #71  <Method Object ArrayMap.put(Object, Object)>
	//   89  173:pop             
			mLocalMatrix.set(vectordrawablecompat$vgroup.mLocalMatrix);
	//   90  174:aload_0         
	//   91  175:getfield        #57  <Field Matrix mLocalMatrix>
	//   92  178:aload_1         
	//   93  179:getfield        #57  <Field Matrix mLocalMatrix>
	//   94  182:invokevirtual   #75  <Method void Matrix.set(Matrix)>
			ArrayList arraylist = vectordrawablecompat$vgroup.mChildren;
	//   95  185:aload_1         
	//   96  186:getfield        #41  <Field ArrayList mChildren>
	//   97  189:astore          4
			int i = 0;
	//   98  191:iconst_0        
	//   99  192:istore_3        
			do
			{
				if(i >= arraylist.size())
					break label0;
	//  100  193:iload_3         
	//  101  194:aload           4
	//  102  196:invokevirtual   #79  <Method int ArrayList.size()>
	//  103  199:icmpge          325
				vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (arraylist.get(i)));
	//  104  202:aload           4
	//  105  204:iload_3         
	//  106  205:invokevirtual   #83  <Method Object ArrayList.get(int)>
	//  107  208:astore_1        
				if(vectordrawablecompat$vgroup instanceof VectorDrawableCompat$VGroup)
	//* 108  209:aload_1         
	//* 109  210:instanceof      #2   <Class VectorDrawableCompat$VGroup>
	//* 110  213:ifeq            241
				{
					vectordrawablecompat$vgroup = (VectorDrawableCompat$VGroup)vectordrawablecompat$vgroup;
	//  111  216:aload_1         
	//  112  217:checkcast       #2   <Class VectorDrawableCompat$VGroup>
	//  113  220:astore_1        
					mChildren.add(((Object) (new VectorDrawableCompat$VGroup(vectordrawablecompat$vgroup, arraymap))));
	//  114  221:aload_0         
	//  115  222:getfield        #41  <Field ArrayList mChildren>
	//  116  225:new             #2   <Class VectorDrawableCompat$VGroup>
	//  117  228:dup             
	//  118  229:aload_1         
	//  119  230:aload_2         
	//  120  231:invokespecial   #85  <Method void VectorDrawableCompat$VGroup(VectorDrawableCompat$VGroup, ArrayMap)>
	//  121  234:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
	//  122  237:pop             
				} else
	//* 123  238:goto            308
				{
					if(vectordrawablecompat$vgroup instanceof th)
	//* 124  241:aload_1         
	//* 125  242:instanceof      #91  <Class VectorDrawableCompat$VFullPath>
	//* 126  245:ifeq            263
					{
						vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (new th((th)vectordrawablecompat$vgroup)));
	//  127  248:new             #91  <Class VectorDrawableCompat$VFullPath>
	//  128  251:dup             
	//  129  252:aload_1         
	//  130  253:checkcast       #91  <Class VectorDrawableCompat$VFullPath>
	//  131  256:invokespecial   #94  <Method void VectorDrawableCompat$VFullPath(VectorDrawableCompat$VFullPath)>
	//  132  259:astore_1        
					} else
	//* 133  260:goto            282
					{
						if(!(vectordrawablecompat$vgroup instanceof th))
							break;
	//  134  263:aload_1         
	//  135  264:instanceof      #96  <Class VectorDrawableCompat$VClipPath>
	//  136  267:ifeq            315
						vectordrawablecompat$vgroup = ((VectorDrawableCompat$VGroup) (new th((th)vectordrawablecompat$vgroup)));
	//  137  270:new             #96  <Class VectorDrawableCompat$VClipPath>
	//  138  273:dup             
	//  139  274:aload_1         
	//  140  275:checkcast       #96  <Class VectorDrawableCompat$VClipPath>
	//  141  278:invokespecial   #99  <Method void VectorDrawableCompat$VClipPath(VectorDrawableCompat$VClipPath)>
	//  142  281:astore_1        
					}
					mChildren.add(((Object) (vectordrawablecompat$vgroup)));
	//  143  282:aload_0         
	//  144  283:getfield        #41  <Field ArrayList mChildren>
	//  145  286:aload_1         
	//  146  287:invokevirtual   #89  <Method boolean ArrayList.add(Object)>
	//  147  290:pop             
					if(((VectorDrawableCompat.VPath) (vectordrawablecompat$vgroup)).mPathName != null)
	//* 148  291:aload_1         
	//* 149  292:getfield        #104 <Field String VectorDrawableCompat$VPath.mPathName>
	//* 150  295:ifnull          308
						arraymap.put(((Object) (((VectorDrawableCompat.VPath) (vectordrawablecompat$vgroup)).mPathName)), ((Object) (vectordrawablecompat$vgroup)));
	//  151  298:aload_2         
	//  152  299:aload_1         
	//  153  300:getfield        #104 <Field String VectorDrawableCompat$VPath.mPathName>
	//  154  303:aload_1         
	//  155  304:invokevirtual   #71  <Method Object ArrayMap.put(Object, Object)>
	//  156  307:pop             
				}
				i++;
	//  157  308:iload_3         
	//  158  309:iconst_1        
	//  159  310:iadd            
	//  160  311:istore_3        
			} while(true);
	//  161  312:goto            193
			throw new IllegalStateException("Unknown object in the tree!");
	//  162  315:new             #106 <Class IllegalStateException>
	//  163  318:dup             
	//  164  319:ldc1            #108 <String "Unknown object in the tree!">
	//  165  321:invokespecial   #111 <Method void IllegalStateException(String)>
	//  166  324:athrow          
		}
	//  167  325:return          
	}
}
