// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.model;

import android.telephony.NeighboringCellInfo;

// Referenced classes of package com.startapp.android.publish.common.model:
//			GetAdRequest

static class GetAdRequest$CellScanResult
{

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_1        
		if(cellInfo != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//*   6   12:ifnull          95
		{
			stringbuilder.append(cellInfo.getCid()).append(',');
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//   10   20:invokevirtual   #31  <Method int NeighboringCellInfo.getCid()>
	//   11   23:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   12   26:bipush          44
	//   13   28:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
	//   14   31:pop             
			stringbuilder.append(cellInfo.getRssi()).append(',');
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//   18   37:invokevirtual   #41  <Method int NeighboringCellInfo.getRssi()>
	//   19   40:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   20   43:bipush          44
	//   21   45:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
	//   22   48:pop             
			stringbuilder.append(cellInfo.getPsc()).append(',');
	//   23   49:aload_1         
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//   26   54:invokevirtual   #44  <Method int NeighboringCellInfo.getPsc()>
	//   27   57:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   28   60:bipush          44
	//   29   62:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
	//   30   65:pop             
			stringbuilder.append(cellInfo.getNetworkType()).append(',');
	//   31   66:aload_1         
	//   32   67:aload_0         
	//   33   68:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//   34   71:invokevirtual   #47  <Method int NeighboringCellInfo.getNetworkType()>
	//   35   74:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   36   77:bipush          44
	//   37   79:invokevirtual   #38  <Method StringBuilder StringBuilder.append(char)>
	//   38   82:pop             
			stringbuilder.append(cellInfo.getLac());
	//   39   83:aload_1         
	//   40   84:aload_0         
	//   41   85:getfield        #19  <Field NeighboringCellInfo cellInfo>
	//   42   88:invokevirtual   #50  <Method int NeighboringCellInfo.getLac()>
	//   43   91:invokevirtual   #35  <Method StringBuilder StringBuilder.append(int)>
	//   44   94:pop             
		}
		return stringbuilder.toString();
	//   45   95:aload_1         
	//   46   96:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   47   99:areturn         
	}

	private static final char DELIMITER = 44;
	private NeighboringCellInfo cellInfo;

	public GetAdRequest$CellScanResult(NeighboringCellInfo neighboringcellinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		cellInfo = neighboringcellinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field NeighboringCellInfo cellInfo>
	//    5    9:return          
	}
}
