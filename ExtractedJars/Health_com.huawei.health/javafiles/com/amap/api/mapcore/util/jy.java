// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			kb, gz

public class jy extends kb
{

	public jy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void kb()>
		a = new StringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void StringBuilder()>
	//    6   12:putfield        #17  <Field StringBuilder a>
		b = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #19  <Field boolean b>
	//   10   20:return          
	}

	public jy(kb kb1)
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void kb(kb)>
		a = new StringBuilder();
	//    3    5:aload_0         
	//    4    6:new             #14  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #15  <Method void StringBuilder()>
	//    7   13:putfield        #17  <Field StringBuilder a>
		b = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #19  <Field boolean b>
	//   11   21:return          
	}

	protected byte[] a(byte abyte0[])
	{
		abyte0 = gz.a(a.toString());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field StringBuilder a>
	//    2    4:invokevirtual   #28  <Method String StringBuilder.toString()>
	//    3    7:invokestatic    #33  <Method byte[] gz.a(String)>
	//    4   10:astore_1        
		c(abyte0);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #37  <Method void c(byte[])>
		b = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #19  <Field boolean b>
		a.delete(0, a.length());
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field StringBuilder a>
	//   13   25:iconst_0        
	//   14   26:aload_0         
	//   15   27:getfield        #17  <Field StringBuilder a>
	//   16   30:invokevirtual   #41  <Method int StringBuilder.length()>
	//   17   33:invokevirtual   #45  <Method StringBuilder StringBuilder.delete(int, int)>
	//   18   36:pop             
		return abyte0;
	//   19   37:aload_1         
	//   20   38:areturn         
	}

	public void b(byte abyte0[])
	{
		abyte0 = ((byte []) (gz.a(abyte0)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method String gz.a(byte[])>
	//    2    4:astore_1        
		if(b)
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field boolean b>
	//*   5    9:ifeq            20
			b = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #19  <Field boolean b>
		else
	//*   9   17:goto            30
			a.append(",");
	//   10   20:aload_0         
	//   11   21:getfield        #17  <Field StringBuilder a>
	//   12   24:ldc1            #50  <String ",">
	//   13   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		a.append("{\"log\":\"").append(((String) (abyte0))).append("\"}");
	//   15   30:aload_0         
	//   16   31:getfield        #17  <Field StringBuilder a>
	//   17   34:ldc1            #56  <String "{\"log\":\"">
	//   18   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:ldc1            #58  <String "\"}">
	//   22   45:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
	//   24   49:return          
	}

	private StringBuilder a;
	private boolean b;
}
