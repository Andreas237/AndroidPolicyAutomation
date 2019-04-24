// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.location;

import java.util.List;

// Referenced classes of package com.amap.api.location:
//			b, AMapLocalWeatherListener, AMapLocation

class b$a$1 extends Thread
{

	public void run()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
_L2:
		if(i < a.d.size())
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #23  <Field b a>
	//*   5    7:getfield        #36  <Field List b.d>
	//*   6   10:invokeinterface #42  <Method int List.size()>
	//*   7   15:icmpge          125
		{
			if(((Integer)a.d.get(i)).intValue() == 1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field b a>
	//*  10   22:getfield        #36  <Field List b.d>
	//*  11   25:iload_1         
	//*  12   26:invokeinterface #46  <Method Object List.get(int)>
	//*  13   31:checkcast       #48  <Class Integer>
	//*  14   34:invokevirtual   #51  <Method int Integer.intValue()>
	//*  15   37:iconst_1        
	//*  16   38:icmpne          70
				a.a(b, "base", (AMapLocalWeatherListener)a.e.get(i));
	//   17   41:aload_0         
	//   18   42:getfield        #23  <Field b a>
	//   19   45:aload_0         
	//   20   46:getfield        #25  <Field AMapLocation b>
	//   21   49:ldc1            #53  <String "base">
	//   22   51:aload_0         
	//   23   52:getfield        #23  <Field b a>
	//   24   55:getfield        #56  <Field List b.e>
	//   25   58:iload_1         
	//   26   59:invokeinterface #46  <Method Object List.get(int)>
	//   27   64:checkcast       #58  <Class AMapLocalWeatherListener>
	//   28   67:invokevirtual   #61  <Method void b.a(AMapLocation, String, AMapLocalWeatherListener)>
			if(((Integer)a.d.get(i)).intValue() == 2)
	//*  29   70:aload_0         
	//*  30   71:getfield        #23  <Field b a>
	//*  31   74:getfield        #36  <Field List b.d>
	//*  32   77:iload_1         
	//*  33   78:invokeinterface #46  <Method Object List.get(int)>
	//*  34   83:checkcast       #48  <Class Integer>
	//*  35   86:invokevirtual   #51  <Method int Integer.intValue()>
	//*  36   89:iconst_2        
	//*  37   90:icmpne          156
				a.a(b, "all", (AMapLocalWeatherListener)a.e.get(i));
	//   38   93:aload_0         
	//   39   94:getfield        #23  <Field b a>
	//   40   97:aload_0         
	//   41   98:getfield        #25  <Field AMapLocation b>
	//   42  101:ldc1            #63  <String "all">
	//   43  103:aload_0         
	//   44  104:getfield        #23  <Field b a>
	//   45  107:getfield        #56  <Field List b.e>
	//   46  110:iload_1         
	//   47  111:invokeinterface #46  <Method Object List.get(int)>
	//   48  116:checkcast       #58  <Class AMapLocalWeatherListener>
	//   49  119:invokevirtual   #61  <Method void b.a(AMapLocation, String, AMapLocalWeatherListener)>
			break MISSING_BLOCK_LABEL_156;
	//   50  122:goto            156
		} else
		{
			try
			{
				a.d.clear();
	//   51  125:aload_0         
	//   52  126:getfield        #23  <Field b a>
	//   53  129:getfield        #36  <Field List b.d>
	//   54  132:invokeinterface #66  <Method void List.clear()>
				a.e.clear();
	//   55  137:aload_0         
	//   56  138:getfield        #23  <Field b a>
	//   57  141:getfield        #56  <Field List b.e>
	//   58  144:invokeinterface #66  <Method void List.clear()>
				return;
	//   59  149:return          
			}
			catch(Throwable throwable)
	//*  60  150:astore_2        
			{
				throwable.printStackTrace();
	//   61  151:aload_2         
	//   62  152:invokevirtual   #69  <Method void Throwable.printStackTrace()>
			}
			return;
	//   63  155:return          
		}
		i++;
	//   64  156:iload_1         
	//   65  157:iconst_1        
	//   66  158:iadd            
	//   67  159:istore_1        
		if(true) goto _L2; else goto _L1
	//   68  160:goto            2
_L1:
	}

	final b a;
	final AMapLocation b;
	final b.a c;

	b$a$1(b.a a1, b b1, AMapLocation amaplocation)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field b$a c>
		a = b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field b a>
		b = amaplocation;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field AMapLocation b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Thread()>
	//   11   19:return          
	}
}
