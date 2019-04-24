// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


// Referenced classes of package o:
//			ebe, dho, ebm

class ebf
	implements ebe
{

	public ebf(eap.e e)
	{
		this(e, ((ebe) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void ebf(eap$e, ebe)>
	//    4    6:return          
	}

	public ebf(eap.e e, ebe ebe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		d = e;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field eap$e d>
		a = ebe1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field ebe a>
	//    8   14:return          
	}

	public void a(int i, int j)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ebe a>
	//*   2    4:ifnull          19
		{
			a.a(i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ebe a>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #26  <Method void ebe.a(int, int)>
			return;
	//    8   18:return          
		} else
		{
			dho.b("Login_DownloadPluginCallback", new Object[] {
				"stopDownloadProgress taskNo=", Integer.valueOf(i), ", reason=", Integer.valueOf(j)
			});
	//    9   19:ldc1            #28  <String "Login_DownloadPluginCallback">
	//   10   21:iconst_4        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:ldc1            #30  <String "stopDownloadProgress taskNo=">
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_1        
	//   18   32:iload_1         
	//   19   33:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_2        
	//   23   39:ldc1            #38  <String ", reason=">
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_3        
	//   27   44:iload_2         
	//   28   45:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   29   48:aastore         
	//   30   49:invokestatic    #44  <Method void dho.b(String, Object[])>
			return;
	//   31   52:return          
		}
	}

	public void b(int i, int j)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ebe a>
	//*   2    4:ifnull          19
		{
			a.b(i, j);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ebe a>
	//    5   11:iload_1         
	//    6   12:iload_2         
	//    7   13:invokeinterface #46  <Method void ebe.b(int, int)>
			return;
	//    8   18:return          
		} else
		{
			dho.b("Login_DownloadPluginCallback", new Object[] {
				"showDownloadProgress taskNo=", Integer.valueOf(i), ", progress=", Integer.valueOf(j)
			});
	//    9   19:ldc1            #28  <String "Login_DownloadPluginCallback">
	//   10   21:iconst_4        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:ldc1            #48  <String "showDownloadProgress taskNo=">
	//   15   29:aastore         
	//   16   30:dup             
	//   17   31:iconst_1        
	//   18   32:iload_1         
	//   19   33:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   20   36:aastore         
	//   21   37:dup             
	//   22   38:iconst_2        
	//   23   39:ldc1            #50  <String ", progress=">
	//   24   41:aastore         
	//   25   42:dup             
	//   26   43:iconst_3        
	//   27   44:iload_2         
	//   28   45:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   29   48:aastore         
	//   30   49:invokestatic    #44  <Method void dho.b(String, Object[])>
			return;
	//   31   52:return          
		}
	}

	public void c(int i)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ebe a>
	//*   2    4:ifnull          18
		{
			a.c(i);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ebe a>
	//    5   11:iload_1         
	//    6   12:invokeinterface #54  <Method void ebe.c(int)>
			return;
	//    7   17:return          
		} else
		{
			dho.b("Login_DownloadPluginCallback", new Object[] {
				"startDownloadProgress taskNo=", Integer.valueOf(i)
			});
	//    8   18:ldc1            #28  <String "Login_DownloadPluginCallback">
	//    9   20:iconst_2        
	//   10   21:anewarray       Object[]
	//   11   24:dup             
	//   12   25:iconst_0        
	//   13   26:ldc1            #56  <String "startDownloadProgress taskNo=">
	//   14   28:aastore         
	//   15   29:dup             
	//   16   30:iconst_1        
	//   17   31:iload_1         
	//   18   32:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   19   35:aastore         
	//   20   36:invokestatic    #44  <Method void dho.b(String, Object[])>
			return;
	//   21   39:return          
		}
	}

	public void c(int i, String s, int j)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field ebe a>
	//*   2    4:ifnull          20
		{
			a.c(i, s, j);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field ebe a>
	//    5   11:iload_1         
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #59  <Method void ebe.c(int, String, int)>
			return;
	//    9   19:return          
		}
		dho.b("Login_DownloadPluginCallback", new Object[] {
			"onDownloadPluginResult taskNo=", Integer.valueOf(i), ", uuid=", s, ", result=", Integer.valueOf(j)
		});
	//   10   20:ldc1            #28  <String "Login_DownloadPluginCallback">
	//   11   22:bipush          6
	//   12   24:anewarray       Object[]
	//   13   27:dup             
	//   14   28:iconst_0        
	//   15   29:ldc1            #61  <String "onDownloadPluginResult taskNo=">
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:iload_1         
	//   20   35:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   21   38:aastore         
	//   22   39:dup             
	//   23   40:iconst_2        
	//   24   41:ldc1            #63  <String ", uuid=">
	//   25   43:aastore         
	//   26   44:dup             
	//   27   45:iconst_3        
	//   28   46:aload_2         
	//   29   47:aastore         
	//   30   48:dup             
	//   31   49:iconst_4        
	//   32   50:ldc1            #65  <String ", result=">
	//   33   52:aastore         
	//   34   53:dup             
	//   35   54:iconst_5        
	//   36   55:iload_3         
	//   37   56:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   38   59:aastore         
	//   39   60:invokestatic    #44  <Method void dho.b(String, Object[])>
		switch(_cls4.a[d.ordinal()])
	//*  40   63:getstatic       #70  <Field int[] ebf$4.a>
	//*  41   66:aload_0         
	//*  42   67:getfield        #21  <Field eap$e d>
	//*  43   70:invokevirtual   #76  <Method int eap$e.ordinal()>
	//*  44   73:iaload          
		{
	//*  45   74:tableswitch     1 3: default 100
	//	               1 101
	//	               2 109
	//	               3 109
		default:
			return;
	//   46  100:return          

		case 1: // '\001'
			ebm.a().d(s);
	//   47  101:invokestatic    #81  <Method ebm ebm.a()>
	//   48  104:aload_2         
	//   49  105:invokevirtual   #84  <Method void ebm.d(String)>
			return;
	//   50  108:return          

		case 2: // '\002'
		case 3: // '\003'
			return;
	//   51  109:return          
		}
	}

	private final ebe a;
	private final eap.e d;

	/* member class not found */
	class _cls4 {}

}
