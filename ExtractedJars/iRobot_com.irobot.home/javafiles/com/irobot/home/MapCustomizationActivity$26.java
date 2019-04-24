// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.support.v7.app.a;
import android.text.*;
import android.widget.Button;

// Referenced classes of package com.irobot.home:
//			MapCustomizationActivity

class MapCustomizationActivity$26
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
		boolean flag;
		if(TextUtils.isEmpty(((CharSequence) (editable))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #32  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            24
		{
			editable = ((Editable) (a.a(-1)));
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field a a>
	//    5   11:iconst_m1       
	//    6   12:invokevirtual   #37  <Method Button a.a(int)>
	//    7   15:astore_1        
			flag = false;
	//    8   16:iconst_0        
	//    9   17:istore_2        
		} else
	//*  10   18:aload_1         
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #43  <Method void Button.setEnabled(boolean)>
	//*  13   23:return          
		{
			editable = ((Editable) (a.a(-1)));
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field a a>
	//   16   28:iconst_m1       
	//   17   29:invokevirtual   #37  <Method Button a.a(int)>
	//   18   32:astore_1        
			flag = true;
	//   19   33:iconst_1        
	//   20   34:istore_2        
		}
		((Button) (editable)).setEnabled(flag);
	//*  21   35:goto            18
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	final a a;
	final MapCustomizationActivity b;

	MapCustomizationActivity$26(MapCustomizationActivity mapcustomizationactivity, a a1)
	{
		b = mapcustomizationactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field MapCustomizationActivity b>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
