// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.location.Location;

// Referenced classes of package o:
//			jj, jg

public final class jh
{

	protected jh(jg jg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		d = new jj(((android.telephony.CellLocation) (null)));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class jj>
	//    4    8:dup             
	//    5    9:aconst_null     
	//    6   10:invokespecial   #18  <Method void jj(android.telephony.CellLocation)>
	//    7   13:putfield        #20  <Field jj d>
	//    8   16:return          
	}

	Location b;
	jj d;
}
