// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server;


// Referenced classes of package com.google.android.gms.common.server:
//			BaseApi

public final class BaseApi$BaseApiaryOptions$Collector
{

	private final void append(String s)
	{
		if(!zzvx) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzvx>
	//    2    4:ifeq            29
_L1:
		StringBuilder stringbuilder;
		String s1;
		zzvx = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #36  <Field boolean zzvx>
		stringbuilder = zzwa;
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field StringBuilder zzwa>
	//    8   16:astore_2        
		s1 = ",";
	//    9   17:ldc1            #38  <String ",">
	//   10   19:astore_3        
_L4:
		stringbuilder.append(s1);
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		break; /* Loop/switch isn't completed */
	//   15   26:goto            52
_L2:
		if(!zzvy)
			break; /* Loop/switch isn't completed */
	//   16   29:aload_0         
	//   17   30:getfield        #43  <Field boolean zzvy>
	//   18   33:ifeq            52
		zzvy = false;
	//   19   36:aload_0         
	//   20   37:iconst_0        
	//   21   38:putfield        #43  <Field boolean zzvy>
		stringbuilder = zzwa;
	//   22   41:aload_0         
	//   23   42:getfield        #31  <Field StringBuilder zzwa>
	//   24   45:astore_2        
		s1 = "/";
	//   25   46:ldc1            #45  <String "/">
	//   26   48:astore_3        
		if(true) goto _L4; else goto _L3
	//   27   49:goto            20
_L3:
		zzwa.append(s);
	//   28   52:aload_0         
	//   29   53:getfield        #31  <Field StringBuilder zzwa>
	//   30   56:aload_1         
	//   31   57:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
		return;
	//   33   61:return          
	}

	public final void addPiece(String s)
	{
		append(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void append(String)>
		zzvy = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #43  <Field boolean zzvy>
	//    6   10:return          
	}

	public final void beginSubCollection(String s)
	{
		append(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void append(String)>
		zzwa.append("(");
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field StringBuilder zzwa>
	//    5    9:ldc1            #51  <String "(">
	//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		zzvz = zzvz + 1;
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #53  <Field int zzvz>
	//   11   20:iconst_1        
	//   12   21:iadd            
	//   13   22:putfield        #53  <Field int zzvz>
	//   14   25:return          
	}

	public final void endSubCollection()
	{
		zzwa.append(")");
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field StringBuilder zzwa>
	//    2    4:ldc1            #56  <String ")">
	//    3    6:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//    4    9:pop             
		zzvz = zzvz - 1;
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #53  <Field int zzvz>
	//    8   15:iconst_1        
	//    9   16:isub            
	//   10   17:putfield        #53  <Field int zzvz>
		if(zzvz == 0)
	//*  11   20:aload_0         
	//*  12   21:getfield        #53  <Field int zzvz>
	//*  13   24:ifne            61
		{
			zzwb.addField(zzwa.toString());
	//   14   27:aload_0         
	//   15   28:getfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
	//   16   31:aload_0         
	//   17   32:getfield        #31  <Field StringBuilder zzwa>
	//   18   35:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   19   38:invokevirtual   #64  <Method BaseApi$BaseApiaryOptions BaseApi$BaseApiaryOptions.addField(String)>
	//   20   41:pop             
			zzwa.setLength(0);
	//   21   42:aload_0         
	//   22   43:getfield        #31  <Field StringBuilder zzwa>
	//   23   46:iconst_0        
	//   24   47:invokevirtual   #68  <Method void StringBuilder.setLength(int)>
			zzvx = false;
	//   25   50:aload_0         
	//   26   51:iconst_0        
	//   27   52:putfield        #36  <Field boolean zzvx>
			zzvy = false;
	//   28   55:aload_0         
	//   29   56:iconst_0        
	//   30   57:putfield        #43  <Field boolean zzvy>
			return;
	//   31   60:return          
		} else
		{
			zzvx = true;
	//   32   61:aload_0         
	//   33   62:iconst_1        
	//   34   63:putfield        #36  <Field boolean zzvx>
			return;
	//   35   66:return          
		}
	}

	public final void finishPiece(String s)
	{
		append(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void append(String)>
		if(zzvz == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #53  <Field int zzvz>
	//*   5    9:ifne            36
		{
			zzwb.addField(zzwa.toString());
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field StringBuilder zzwa>
	//   10   20:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   11   23:invokevirtual   #64  <Method BaseApi$BaseApiaryOptions BaseApi$BaseApiaryOptions.addField(String)>
	//   12   26:pop             
			zzwa.setLength(0);
	//   13   27:aload_0         
	//   14   28:getfield        #31  <Field StringBuilder zzwa>
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #68  <Method void StringBuilder.setLength(int)>
			return;
	//   17   35:return          
		} else
		{
			zzvx = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #36  <Field boolean zzvx>
			return;
	//   21   41:return          
		}
	}

	private boolean zzvx;
	private boolean zzvy;
	private int zzvz;
	private StringBuilder zzwa;
	private final BaseApi.BaseApiaryOptions zzwb;

	public BaseApi$BaseApiaryOptions$Collector(BaseApi.BaseApiaryOptions baseapiaryoptions)
	{
		zzwb = baseapiaryoptions;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void Object()>
		zzwa = new StringBuilder();
	//    5    9:aload_0         
	//    6   10:new             #28  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #29  <Method void StringBuilder()>
	//    9   17:putfield        #31  <Field StringBuilder zzwa>
	//   10   20:return          
	}
}
