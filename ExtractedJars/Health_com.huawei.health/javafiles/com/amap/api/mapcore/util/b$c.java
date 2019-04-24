// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.os.RemoteException;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, au

class b$c
	implements 
{

	public void a(int i)
	{
		if(a.d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field b a>
	//*   2    4:getfield        #29  <Field au b.d>
	//*   3    7:ifnull          74
		{
			a.d.activeFloorIndex = a.d.floor_indexs[i];
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field b a>
	//    6   14:getfield        #29  <Field au b.d>
	//    7   17:aload_0         
	//    8   18:getfield        #15  <Field b a>
	//    9   21:getfield        #29  <Field au b.d>
	//   10   24:getfield        #35  <Field int[] au.floor_indexs>
	//   11   27:iload_1         
	//   12   28:iaload          
	//   13   29:putfield        #39  <Field int au.activeFloorIndex>
			a.d.activeFloorName = a.d.floor_names[i];
	//   14   32:aload_0         
	//   15   33:getfield        #15  <Field b a>
	//   16   36:getfield        #29  <Field au b.d>
	//   17   39:aload_0         
	//   18   40:getfield        #15  <Field b a>
	//   19   43:getfield        #29  <Field au b.d>
	//   20   46:getfield        #43  <Field String[] au.floor_names>
	//   21   49:iload_1         
	//   22   50:aaload          
	//   23   51:putfield        #47  <Field String au.activeFloorName>
			try
			{
				a.setIndoorBuildingInfo(((com.amap.api.maps.model.IndoorBuildingInfo) (a.d)));
	//   24   54:aload_0         
	//   25   55:getfield        #15  <Field b a>
	//   26   58:aload_0         
	//   27   59:getfield        #15  <Field b a>
	//   28   62:getfield        #29  <Field au b.d>
	//   29   65:invokevirtual   #51  <Method void b.setIndoorBuildingInfo(com.amap.api.maps.model.IndoorBuildingInfo)>
				return;
	//   30   68:return          
			}
			catch(RemoteException remoteexception)
	//*  31   69:astore_2        
			{
				remoteexception.printStackTrace();
	//   32   70:aload_2         
	//   33   71:invokevirtual   #54  <Method void RemoteException.printStackTrace()>
			}
		}
	//   34   74:return          
	}

	final b a;

	private b$c(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	b$c(b b1, b$1 b$1)
	{
		this(b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void b$c(b)>
	//    3    5:return          
	}
}
