// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			lj, oc, nz

public class ll extends lj
{

	public ll()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void lj()>
		d = "Description Label";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "Description Label">
	//    4    7:putfield        #18  <Field String d>
		e = android.graphics.Paint.Align.RIGHT;
	//    5   10:aload_0         
	//    6   11:getstatic       #23  <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//    7   14:putfield        #25  <Field android.graphics.Paint$Align e>
		D = oc.b(8F);
	//    8   17:aload_0         
	//    9   18:ldc1            #26  <Float 8F>
	//   10   20:invokestatic    #31  <Method float oc.b(float)>
	//   11   23:putfield        #35  <Field float D>
	//   12   26:return          
	}

	public android.graphics.Paint.Align a()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field android.graphics.Paint$Align e>
	//    2    4:areturn         
	}

	public String b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String d>
	//    2    4:areturn         
	}

	public void b(android.graphics.Paint.Align align)
	{
		e = align;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field android.graphics.Paint$Align e>
	//    3    5:return          
	}

	public nz d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field nz b>
	//    2    4:areturn         
	}

	public void d(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String d>
	//    3    5:return          
	}

	private nz b;
	private String d;
	private android.graphics.Paint.Align e;
}
