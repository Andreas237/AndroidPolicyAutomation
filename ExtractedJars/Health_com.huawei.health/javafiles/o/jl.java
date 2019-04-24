// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			jg

public final class jl
{

	protected jl(jg jg)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		e = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field List e>
	//    7   15:return          
	}

	Location a;
	List e;
}
