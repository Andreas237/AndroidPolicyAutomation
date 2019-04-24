// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import android.util.Pair;

public class CellInfo
{

	public CellInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public CellInfo(String s, String s1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mcc = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String mcc>
		mnc = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field String mnc>
		networkType = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int networkType>
	//   11   19:return          
	}

	public String getMcc()
	{
		return mcc;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String mcc>
	//    2    4:areturn         
	}

	public String getMnc()
	{
		return mnc;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mnc>
	//    2    4:areturn         
	}

	public int getNetworkType()
	{
		return networkType;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int networkType>
	//    2    4:ireturn         
	}

	public void loadCellInfo(Pair pair)
	{
		if(pair == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(pair.first != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #35  <Field Object Pair.first>
	//*   5    9:ifnull          26
			networkType = ((Integer)pair.first).intValue();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #35  <Field Object Pair.first>
	//    9   17:checkcast       #37  <Class Integer>
	//   10   20:invokevirtual   #40  <Method int Integer.intValue()>
	//   11   23:putfield        #22  <Field int networkType>
		pair = (Pair)pair.second;
	//   12   26:aload_1         
	//   13   27:getfield        #43  <Field Object Pair.second>
	//   14   30:checkcast       #31  <Class Pair>
	//   15   33:astore_1        
		if(pair != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          60
		{
			mcc = (String)pair.first;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:getfield        #35  <Field Object Pair.first>
	//   21   43:checkcast       #45  <Class String>
	//   22   46:putfield        #18  <Field String mcc>
			mnc = (String)pair.second;
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:getfield        #43  <Field Object Pair.second>
	//   26   54:checkcast       #45  <Class String>
	//   27   57:putfield        #20  <Field String mnc>
		}
	//   28   60:return          
	}

	public void setMcc(String s)
	{
		mcc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String mcc>
	//    3    5:return          
	}

	public void setMnc(String s)
	{
		mnc = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String mnc>
	//    3    5:return          
	}

	public void setNetworkType(int i)
	{
		networkType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int networkType>
	//    3    5:return          
	}

	private String mcc;
	private String mnc;
	private int networkType;
}
