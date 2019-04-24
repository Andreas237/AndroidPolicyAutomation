// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.security;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text.pdf.security:
//			LtvVerification

private static class LtvVerification$ValidationData
{

	public List certs;
	public List crls;
	public List ocsps;

	private LtvVerification$ValidationData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		crls = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void ArrayList()>
	//    6   12:putfield        #21  <Field List crls>
		ocsps = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #18  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #19  <Method void ArrayList()>
	//   11   23:putfield        #23  <Field List ocsps>
		certs = ((List) (new ArrayList()));
	//   12   26:aload_0         
	//   13   27:new             #18  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #19  <Method void ArrayList()>
	//   16   34:putfield        #25  <Field List certs>
	//   17   37:return          
	}

	LtvVerification$ValidationData(LtvVerification._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void LtvVerification$ValidationData()>
	//    2    4:return          
	}
}
