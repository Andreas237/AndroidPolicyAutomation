// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.graphics.Rect;
import android.util.Log;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseDrawer

class ShowcaseAreaCalculator
{

	ShowcaseAreaCalculator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void Rect()>
	//    6   12:putfield        #15  <Field Rect mShowcaseRect>
	//    7   15:return          
	}

	public boolean calculateShowcaseRect(float f, float f1, ShowcaseDrawer showcasedrawer)
	{
		int i = (int)f;
	//    0    0:fload_1         
	//    1    1:f2i             
	//    2    2:istore          4
		int j = (int)f1;
	//    3    4:fload_2         
	//    4    5:f2i             
	//    5    6:istore          5
		int i1 = showcasedrawer.getShowcaseWidth();
	//    6    8:aload_3         
	//    7    9:invokeinterface #24  <Method int ShowcaseDrawer.getShowcaseWidth()>
	//    8   14:istore          8
		int k = showcasedrawer.getShowcaseHeight();
	//    9   16:aload_3         
	//   10   17:invokeinterface #27  <Method int ShowcaseDrawer.getShowcaseHeight()>
	//   11   22:istore          6
		int l = mShowcaseRect.left;
	//   12   24:aload_0         
	//   13   25:getfield        #15  <Field Rect mShowcaseRect>
	//   14   28:getfield        #31  <Field int Rect.left>
	//   15   31:istore          7
		i1 /= 2;
	//   16   33:iload           8
	//   17   35:iconst_2        
	//   18   36:idiv            
	//   19   37:istore          8
		int j1 = i - i1;
	//   20   39:iload           4
	//   21   41:iload           8
	//   22   43:isub            
	//   23   44:istore          9
		if(l == j1 && mShowcaseRect.top == j - k / 2)
	//*  24   46:iload           7
	//*  25   48:iload           9
	//*  26   50:icmpne          72
	//*  27   53:aload_0         
	//*  28   54:getfield        #15  <Field Rect mShowcaseRect>
	//*  29   57:getfield        #34  <Field int Rect.top>
	//*  30   60:iload           5
	//*  31   62:iload           6
	//*  32   64:iconst_2        
	//*  33   65:idiv            
	//*  34   66:isub            
	//*  35   67:icmpne          72
		{
			return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
		} else
		{
			Log.d("ShowcaseView", "Recalculated");
	//   38   72:ldc1            #36  <String "ShowcaseView">
	//   39   74:ldc1            #38  <String "Recalculated">
	//   40   76:invokestatic    #44  <Method int Log.d(String, String)>
	//   41   79:pop             
			mShowcaseRect.left = j1;
	//   42   80:aload_0         
	//   43   81:getfield        #15  <Field Rect mShowcaseRect>
	//   44   84:iload           9
	//   45   86:putfield        #31  <Field int Rect.left>
			showcasedrawer = ((ShowcaseDrawer) (mShowcaseRect));
	//   46   89:aload_0         
	//   47   90:getfield        #15  <Field Rect mShowcaseRect>
	//   48   93:astore_3        
			k /= 2;
	//   49   94:iload           6
	//   50   96:iconst_2        
	//   51   97:idiv            
	//   52   98:istore          6
			showcasedrawer.top = j - k;
	//   53  100:aload_3         
	//   54  101:iload           5
	//   55  103:iload           6
	//   56  105:isub            
	//   57  106:putfield        #34  <Field int Rect.top>
			mShowcaseRect.right = i + i1;
	//   58  109:aload_0         
	//   59  110:getfield        #15  <Field Rect mShowcaseRect>
	//   60  113:iload           4
	//   61  115:iload           8
	//   62  117:iadd            
	//   63  118:putfield        #47  <Field int Rect.right>
			mShowcaseRect.bottom = j + k;
	//   64  121:aload_0         
	//   65  122:getfield        #15  <Field Rect mShowcaseRect>
	//   66  125:iload           5
	//   67  127:iload           6
	//   68  129:iadd            
	//   69  130:putfield        #50  <Field int Rect.bottom>
			return true;
	//   70  133:iconst_1        
	//   71  134:ireturn         
		}
	}

	public Rect getShowcaseRect()
	{
		return mShowcaseRect;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Rect mShowcaseRect>
	//    2    4:areturn         
	}

	private final Rect mShowcaseRect = new Rect();
}
