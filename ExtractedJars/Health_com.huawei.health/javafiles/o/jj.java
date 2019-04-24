// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;

public final class jj
{

	jj(CellLocation celllocation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		d = 0x7fffffff;
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <Int 0x7fffffff>
	//    4    7:putfield        #18  <Field int d>
		b = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #16  <Int 0x7fffffff>
	//    7   13:putfield        #20  <Field int b>
		c = 0x7fffffff;
	//    8   16:aload_0         
	//    9   17:ldc1            #16  <Int 0x7fffffff>
	//   10   19:putfield        #22  <Field int c>
		e = 0x7fffffff;
	//   11   22:aload_0         
	//   12   23:ldc1            #16  <Int 0x7fffffff>
	//   13   25:putfield        #24  <Field int e>
		a = 0x7fffffff;
	//   14   28:aload_0         
	//   15   29:ldc1            #16  <Int 0x7fffffff>
	//   16   31:putfield        #26  <Field int a>
		if(celllocation != null)
	//*  17   34:aload_1         
	//*  18   35:ifnull          103
		{
			if(celllocation instanceof GsmCellLocation)
	//*  19   38:aload_1         
	//*  20   39:instanceof      #28  <Class GsmCellLocation>
	//*  21   42:ifeq            67
			{
				celllocation = ((CellLocation) ((GsmCellLocation)celllocation));
	//   22   45:aload_1         
	//   23   46:checkcast       #28  <Class GsmCellLocation>
	//   24   49:astore_1        
				a = ((GsmCellLocation) (celllocation)).getCid();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #32  <Method int GsmCellLocation.getCid()>
	//   28   55:putfield        #26  <Field int a>
				e = ((GsmCellLocation) (celllocation)).getLac();
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #35  <Method int GsmCellLocation.getLac()>
	//   32   63:putfield        #24  <Field int e>
				return;
	//   33   66:return          
			}
			if(celllocation instanceof CdmaCellLocation)
	//*  34   67:aload_1         
	//*  35   68:instanceof      #37  <Class CdmaCellLocation>
	//*  36   71:ifeq            103
			{
				celllocation = ((CellLocation) ((CdmaCellLocation)celllocation));
	//   37   74:aload_1         
	//   38   75:checkcast       #37  <Class CdmaCellLocation>
	//   39   78:astore_1        
				c = ((CdmaCellLocation) (celllocation)).getBaseStationId();
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:invokevirtual   #40  <Method int CdmaCellLocation.getBaseStationId()>
	//   43   84:putfield        #22  <Field int c>
				b = ((CdmaCellLocation) (celllocation)).getNetworkId();
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:invokevirtual   #43  <Method int CdmaCellLocation.getNetworkId()>
	//   47   92:putfield        #20  <Field int b>
				d = ((CdmaCellLocation) (celllocation)).getSystemId();
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:invokevirtual   #46  <Method int CdmaCellLocation.getSystemId()>
	//   51  100:putfield        #18  <Field int d>
			}
		}
	//   52  103:return          
	}

	int a;
	int b;
	int c;
	int d;
	int e;
}
