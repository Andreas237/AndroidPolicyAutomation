// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.amap.api.mapcore.util:
//			kb, gz

public class ka extends kb
{

	public ka()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void kb()>
	//    2    4:return          
	}

	public ka(kb kb1)
	{
		super(kb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void kb(kb)>
	//    3    5:return          
	}

	protected byte[] a(byte abyte0[])
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #16  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void StringBuffer()>
	//    3    7:astore_2        
		stringbuffer.append((new SimpleDateFormat("yyyyMMdd HHmmss")).format(new Date()));
	//    4    8:aload_2         
	//    5    9:new             #19  <Class SimpleDateFormat>
	//    6   12:dup             
	//    7   13:ldc1            #21  <String "yyyyMMdd HHmmss">
	//    8   15:invokespecial   #24  <Method void SimpleDateFormat(String)>
	//    9   18:new             #26  <Class Date>
	//   10   21:dup             
	//   11   22:invokespecial   #27  <Method void Date()>
	//   12   25:invokevirtual   #31  <Method String SimpleDateFormat.format(Date)>
	//   13   28:invokevirtual   #35  <Method StringBuffer StringBuffer.append(String)>
	//   14   31:pop             
		stringbuffer.append(" ");
	//   15   32:aload_2         
	//   16   33:ldc1            #37  <String " ">
	//   17   35:invokevirtual   #35  <Method StringBuffer StringBuffer.append(String)>
	//   18   38:pop             
		stringbuffer.append(UUID.randomUUID().toString());
	//   19   39:aload_2         
	//   20   40:invokestatic    #43  <Method UUID UUID.randomUUID()>
	//   21   43:invokevirtual   #47  <Method String UUID.toString()>
	//   22   46:invokevirtual   #35  <Method StringBuffer StringBuffer.append(String)>
	//   23   49:pop             
		stringbuffer.append(" ");
	//   24   50:aload_2         
	//   25   51:ldc1            #37  <String " ">
	//   26   53:invokevirtual   #35  <Method StringBuffer StringBuffer.append(String)>
	//   27   56:pop             
		if(stringbuffer.length() != 53)
	//*  28   57:aload_2         
	//*  29   58:invokevirtual   #51  <Method int StringBuffer.length()>
	//*  30   61:bipush          53
	//*  31   63:icmpeq          70
		{
			return new byte[0];
	//   32   66:iconst_0        
	//   33   67:newarray        byte[]
	//   34   69:areturn         
		} else
		{
			byte abyte1[] = gz.a(stringbuffer.toString());
	//   35   70:aload_2         
	//   36   71:invokevirtual   #52  <Method String StringBuffer.toString()>
	//   37   74:invokestatic    #57  <Method byte[] gz.a(String)>
	//   38   77:astore_2        
			byte abyte2[] = new byte[abyte1.length + abyte0.length];
	//   39   78:aload_2         
	//   40   79:arraylength     
	//   41   80:aload_1         
	//   42   81:arraylength     
	//   43   82:iadd            
	//   44   83:newarray        byte[]
	//   45   85:astore_3        
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte2)), 0, abyte1.length);
	//   46   86:aload_2         
	//   47   87:iconst_0        
	//   48   88:aload_3         
	//   49   89:iconst_0        
	//   50   90:aload_2         
	//   51   91:arraylength     
	//   52   92:invokestatic    #63  <Method void System.arraycopy(Object, int, Object, int, int)>
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte2)), abyte1.length, abyte0.length);
	//   53   95:aload_1         
	//   54   96:iconst_0        
	//   55   97:aload_3         
	//   56   98:aload_2         
	//   57   99:arraylength     
	//   58  100:aload_1         
	//   59  101:arraylength     
	//   60  102:invokestatic    #63  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte2;
	//   61  105:aload_3         
	//   62  106:areturn         
		}
	}
}
