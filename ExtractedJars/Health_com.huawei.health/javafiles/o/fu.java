// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package o:
//			hc, hu

final class fu
	implements Runnable
{

	fu(Context context, String s)
	{
		b = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Context b>
		c = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field String c>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		hc hc1 = new hc();
	//    0    0:new             #27  <Class hc>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void hc()>
	//    3    7:astore_1        
		try
		{
			String s = hu.a(b, "alipay_cashier_statistic_record", ((String) (null)));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field Context b>
	//    6   12:ldc1            #30  <String "alipay_cashier_statistic_record">
	//    7   14:aconst_null     
	//    8   15:invokestatic    #36  <Method String hu.a(Context, String, String)>
	//    9   18:astore_2        
			if(!TextUtils.isEmpty(((CharSequence) (s))) && hc1.c(b, s) != null)
	//*  10   19:aload_2         
	//*  11   20:invokestatic    #42  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   23:ifne            47
	//*  13   26:aload_1         
	//*  14   27:aload_0         
	//*  15   28:getfield        #14  <Field Context b>
	//*  16   31:aload_2         
	//*  17   32:invokevirtual   #45  <Method hb hc.c(Context, String)>
	//*  18   35:ifnull          47
				hu.b(b, "alipay_cashier_statistic_record");
	//   19   38:aload_0         
	//   20   39:getfield        #14  <Field Context b>
	//   21   42:ldc1            #30  <String "alipay_cashier_statistic_record">
	//   22   44:invokestatic    #47  <Method void hu.b(Context, String)>
		}
	//*  23   47:aload_0         
	//*  24   48:getfield        #16  <Field String c>
	//*  25   51:invokestatic    #42  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   54:ifne            70
	//*  27   57:aload_1         
	//*  28   58:aload_0         
	//*  29   59:getfield        #14  <Field Context b>
	//*  30   62:aload_0         
	//*  31   63:getfield        #16  <Field String c>
	//*  32   66:invokevirtual   #45  <Method hb hc.c(Context, String)>
	//*  33   69:pop             
	//*  34   70:return          
	//*  35   71:aload_0         
	//*  36   72:getfield        #14  <Field Context b>
	//*  37   75:ldc1            #30  <String "alipay_cashier_statistic_record">
	//*  38   77:aload_0         
	//*  39   78:getfield        #16  <Field String c>
	//*  40   81:invokestatic    #50  <Method void hu.b(Context, String, String)>
	//*  41   84:return          
		catch(Throwable throwable1) { }
	//   42   85:astore_2        
		IOException ioexception;
		try
		{
			if(!TextUtils.isEmpty(((CharSequence) (c))))
				hc1.c(b, c);
			return;
		}
	//*  43   86:goto            47
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			hu.b(b, "alipay_cashier_statistic_record", c);
		}
	//*  44   89:astore_1        
	//*  45   90:goto            71
		catch(Throwable throwable)
	//*  46   93:astore_1        
		{
			return;
	//   47   94:return          
		}
	}

	final Context b;
	final String c;
}
