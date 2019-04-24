// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			hw

final class hz
	implements Runnable
{

	hz(hw hw1)
	{
		b = hw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field hw b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(hw.c(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field hw b>
	//*   2    4:invokestatic    #25  <Method hw$a hw.c(hw)>
	//*   3    7:ifnull          21
			try
			{
				hw.c(b).dismiss();
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field hw b>
	//    6   14:invokestatic    #25  <Method hw$a hw.c(hw)>
	//    7   17:invokevirtual   #30  <Method void hw$a.dismiss()>
				return;
	//    8   20:return          
			}
	//*   9   21:return          
			catch(Exception exception)
	//*  10   22:astore_1        
			{
				return;
	//   11   23:return          
			}
		else
			return;
	}

	final hw b;
}
