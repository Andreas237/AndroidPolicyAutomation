// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.base;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet;
import com.github.mikephil.charting.utils.Utils;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data.realm.base:
//			RealmLineScatterCandleRadarDataSet

public abstract class RealmLineRadarDataSet extends RealmLineScatterCandleRadarDataSet
	implements ILineRadarDataSet
{

	public RealmLineRadarDataSet(RealmResults realmresults, String s)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String)>
		mFillColor = Color.rgb(140, 234, 255);
	//    4    6:aload_0         
	//    5    7:sipush          140
	//    6   10:sipush          234
	//    7   13:sipush          255
	//    8   16:invokestatic    #26  <Method int Color.rgb(int, int, int)>
	//    9   19:putfield        #28  <Field int mFillColor>
		mFillAlpha = 85;
	//   10   22:aload_0         
	//   11   23:bipush          85
	//   12   25:putfield        #30  <Field int mFillAlpha>
		mLineWidth = 2.5F;
	//   13   28:aload_0         
	//   14   29:ldc1            #31  <Float 2.5F>
	//   15   31:putfield        #33  <Field float mLineWidth>
		mDrawFilled = false;
	//   16   34:aload_0         
	//   17   35:iconst_0        
	//   18   36:putfield        #35  <Field boolean mDrawFilled>
	//   19   39:return          
	}

	public RealmLineRadarDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #41  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String, String)>
		mFillColor = Color.rgb(140, 234, 255);
	//    5    7:aload_0         
	//    6    8:sipush          140
	//    7   11:sipush          234
	//    8   14:sipush          255
	//    9   17:invokestatic    #26  <Method int Color.rgb(int, int, int)>
	//   10   20:putfield        #28  <Field int mFillColor>
		mFillAlpha = 85;
	//   11   23:aload_0         
	//   12   24:bipush          85
	//   13   26:putfield        #30  <Field int mFillAlpha>
		mLineWidth = 2.5F;
	//   14   29:aload_0         
	//   15   30:ldc1            #31  <Float 2.5F>
	//   16   32:putfield        #33  <Field float mLineWidth>
		mDrawFilled = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #35  <Field boolean mDrawFilled>
	//   20   40:return          
	}

	public void build(RealmResults realmresults)
	{
		if(mIndexField == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field String mIndexField>
	//*   2    4:ifnonnull       73
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #54  <Method Iterator RealmResults.iterator()>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            140
			{
				DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   11   23:new             #62  <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #66  <Method Object Iterator.next()>
	//   15   33:checkcast       #68  <Class RealmObject>
	//   16   36:invokespecial   #71  <Method void DynamicRealmObject(RealmObject)>
	//   17   39:astore_3        
				mValues.add(((Object) (new Entry(dynamicrealmobject.getFloat(mValuesField), i))));
	//   18   40:aload_0         
	//   19   41:getfield        #75  <Field List mValues>
	//   20   44:new             #77  <Class Entry>
	//   21   47:dup             
	//   22   48:aload_3         
	//   23   49:aload_0         
	//   24   50:getfield        #80  <Field String mValuesField>
	//   25   53:invokevirtual   #84  <Method float DynamicRealmObject.getFloat(String)>
	//   26   56:iload_2         
	//   27   57:invokespecial   #87  <Method void Entry(float, int)>
	//   28   60:invokeinterface #93  <Method boolean List.add(Object)>
	//   29   65:pop             
				i++;
	//   30   66:iload_2         
	//   31   67:iconst_1        
	//   32   68:iadd            
	//   33   69:istore_2        
			}

		} else
	//*  34   70:goto            14
		{
			DynamicRealmObject dynamicrealmobject1;
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext(); mValues.add(((Object) (new Entry(dynamicrealmobject1.getFloat(mValuesField), dynamicrealmobject1.getInt(mIndexField))))))
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #54  <Method Iterator RealmResults.iterator()>
	//*  37   77:astore_1        
	//*  38   78:aload_1         
	//*  39   79:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  40   84:ifeq            140
				dynamicrealmobject1 = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   41   87:new             #62  <Class DynamicRealmObject>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokeinterface #66  <Method Object Iterator.next()>
	//   45   97:checkcast       #68  <Class RealmObject>
	//   46  100:invokespecial   #71  <Method void DynamicRealmObject(RealmObject)>
	//   47  103:astore_3        

	//   48  104:aload_0         
	//   49  105:getfield        #75  <Field List mValues>
	//   50  108:new             #77  <Class Entry>
	//   51  111:dup             
	//   52  112:aload_3         
	//   53  113:aload_0         
	//   54  114:getfield        #80  <Field String mValuesField>
	//   55  117:invokevirtual   #84  <Method float DynamicRealmObject.getFloat(String)>
	//   56  120:aload_3         
	//   57  121:aload_0         
	//   58  122:getfield        #48  <Field String mIndexField>
	//   59  125:invokevirtual   #97  <Method int DynamicRealmObject.getInt(String)>
	//   60  128:invokespecial   #87  <Method void Entry(float, int)>
	//   61  131:invokeinterface #93  <Method boolean List.add(Object)>
	//   62  136:pop             
		}
	//*  63  137:goto            78
	//   64  140:return          
	}

	public int getFillAlpha()
	{
		return mFillAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mFillAlpha>
	//    2    4:ireturn         
	}

	public int getFillColor()
	{
		return mFillColor;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mFillColor>
	//    2    4:ireturn         
	}

	public Drawable getFillDrawable()
	{
		return mFillDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Drawable mFillDrawable>
	//    2    4:areturn         
	}

	public float getLineWidth()
	{
		return mLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mLineWidth>
	//    2    4:freturn         
	}

	public boolean isDrawFilledEnabled()
	{
		return mDrawFilled;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean mDrawFilled>
	//    2    4:ireturn         
	}

	public void setDrawFilled(boolean flag)
	{
		mDrawFilled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean mDrawFilled>
	//    3    5:return          
	}

	public void setFillAlpha(int i)
	{
		mFillAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mFillAlpha>
	//    3    5:return          
	}

	public void setFillColor(int i)
	{
		mFillColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field int mFillColor>
		mFillDrawable = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #105 <Field Drawable mFillDrawable>
	//    6   10:return          
	}

	public void setFillDrawable(Drawable drawable)
	{
		mFillDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field Drawable mFillDrawable>
	//    3    5:return          
	}

	public void setLineWidth(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.2F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #118 <Float 0.2F>
	//*   4    5:fcmpg           
	//*   5    6:ifge            12
			f1 = 0.2F;
	//    6    9:ldc1            #118 <Float 0.2F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 > 10F)
	//*  10   14:fload_2         
	//*  11   15:ldc1            #119 <Float 10F>
	//*  12   17:fcmpl           
	//*  13   18:ifle            24
			f = 10F;
	//   14   21:ldc1            #119 <Float 10F>
	//   15   23:fstore_1        
		mLineWidth = Utils.convertDpToPixel(f);
	//   16   24:aload_0         
	//   17   25:fload_1         
	//   18   26:invokestatic    #125 <Method float Utils.convertDpToPixel(float)>
	//   19   29:putfield        #33  <Field float mLineWidth>
	//   20   32:return          
	}

	private boolean mDrawFilled;
	private int mFillAlpha;
	private int mFillColor;
	protected Drawable mFillDrawable;
	private float mLineWidth;
}
