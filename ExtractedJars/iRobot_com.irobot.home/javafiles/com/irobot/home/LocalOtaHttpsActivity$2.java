// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			LocalOtaHttpsActivity

class LocalOtaHttpsActivity$2
	implements com.irobot.home.fragments.ca.a
{

	private void c()
	{
		a.B = null;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
	//    2    4:aconst_null     
	//    3    5:putfield        #26  <Field android.net.wifi.ScanResult LocalOtaHttpsActivity.B>
		a.E = false;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field LocalOtaHttpsActivity a>
	//    6   12:iconst_0        
	//    7   13:putfield        #30  <Field boolean LocalOtaHttpsActivity.E>
		a.F = false;
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   10   20:iconst_0        
	//   11   21:putfield        #33  <Field boolean LocalOtaHttpsActivity.F>
	//   12   24:return          
	}

	public void a()
	{
		if(!LocalOtaHttpsActivity.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
	//*   2    4:invokestatic    #37  <Method boolean LocalOtaHttpsActivity.b(LocalOtaHttpsActivity)>
	//*   3    7:ifne            18
			a.b(true);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field LocalOtaHttpsActivity a>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #40  <Method void LocalOtaHttpsActivity.b(boolean)>
	//    8   18:return          
	}

	public void a(com.irobot.home.fragments.ca.a.a a1)
	{
		int j = LocalOtaHttpsActivity$3.a[a1.ordinal()];
	//    0    0:getstatic       #46  <Field int[] LocalOtaHttpsActivity$3.a>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #52  <Method int com.irobot.home.fragments.ca$a$a.ordinal()>
	//    3    7:iaload          
	//    4    8:istore_3        
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		switch(j)
	//*   7   11:iload_3         
		{
	//*   8   12:tableswitch     1 4: default 44
	//	               1 69
	//	               2 61
	//	               3 61
	//	               4 45
		default:
			return;
	//    9   44:return          

		case 4: // '\004'
			a.x = 0;
	//   10   45:aload_0         
	//   11   46:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   12   49:iconst_0        
	//   13   50:putfield        #56  <Field int LocalOtaHttpsActivity.x>
			a.onBackPressed();
	//   14   53:aload_0         
	//   15   54:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   16   57:invokevirtual   #59  <Method void LocalOtaHttpsActivity.onBackPressed()>
			return;
	//   17   60:return          

		case 2: // '\002'
		case 3: // '\003'
			a1 = ((com.irobot.home.fragments.ca.a.a) (a));
	//   18   61:aload_0         
	//   19   62:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   20   65:astore_1        
			break;

	//*  21   66:goto            76
		case 1: // '\001'
			a1 = ((com.irobot.home.fragments.ca.a.a) (a));
	//   22   69:aload_0         
	//   23   70:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   24   73:astore_1        
			i = 2;
	//   25   74:iconst_2        
	//   26   75:istore_2        
			break;
		}
		a1.x = i;
	//   27   76:aload_1         
	//   28   77:iload_2         
	//   29   78:putfield        #56  <Field int LocalOtaHttpsActivity.x>
		c();
	//   30   81:aload_0         
	//   31   82:invokespecial   #61  <Method void c()>
		a.m();
	//   32   85:aload_0         
	//   33   86:getfield        #17  <Field LocalOtaHttpsActivity a>
	//   34   89:invokevirtual   #64  <Method void LocalOtaHttpsActivity.m()>
	//   35   92:return          
	}

	public void b()
	{
		if(LocalOtaHttpsActivity.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field LocalOtaHttpsActivity a>
	//*   2    4:invokestatic    #37  <Method boolean LocalOtaHttpsActivity.b(LocalOtaHttpsActivity)>
	//*   3    7:ifeq            17
			LocalOtaHttpsActivity.c(a);
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field LocalOtaHttpsActivity a>
	//    6   14:invokestatic    #66  <Method void LocalOtaHttpsActivity.c(LocalOtaHttpsActivity)>
	//    7   17:return          
	}

	final LocalOtaHttpsActivity a;

	LocalOtaHttpsActivity$2(LocalOtaHttpsActivity localotahttpsactivity)
	{
		a = localotahttpsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LocalOtaHttpsActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
