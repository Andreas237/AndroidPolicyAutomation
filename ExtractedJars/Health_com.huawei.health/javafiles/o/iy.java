// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			iq

final class iy
	implements android.location.GpsStatus.NmeaListener
{

	private iy(iq iq1)
	{
		b = iq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field iq b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	iy(iq iq1, byte byte0)
	{
		this(iq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void iy(iq)>
	//    3    5:return          
	}

	public final void onNmeaReceived(long l, String s)
	{
		try
		{
			iq.a(b, l);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field iq b>
	//    2    4:lload_1         
	//    3    5:invokestatic    #29  <Method long iq.a(iq, long)>
	//    4    8:pop2            
			iq.a(b, s);
	//    5    9:aload_0         
	//    6   10:getfield        #12  <Field iq b>
	//    7   13:aload_3         
	//    8   14:invokestatic    #32  <Method String iq.a(iq, String)>
	//    9   17:pop             
			return;
	//   10   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   19:astore_3        
		{
			return;
	//   12   20:return          
		}
	}

	private iq b;
}
