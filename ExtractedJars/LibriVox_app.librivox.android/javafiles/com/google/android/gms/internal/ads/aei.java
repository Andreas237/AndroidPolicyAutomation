// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zb, aeh, aek, ayr, 
//			abc, ade, aef

public final class aei
{

	public aei()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final long a(ByteBuffer bytebuffer)
	{
		long l = a;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field long a>
	//    2    4:lstore_2        
		if(l > 0L)
	//*   3    5:lload_2         
	//*   4    6:lconst_0        
	//*   5    7:lcmp            
	//*   6    8:ifle            13
			return l;
	//    7   11:lload_2         
	//    8   12:lreturn         
		bytebuffer = bytebuffer.duplicate();
	//    9   13:aload_1         
	//   10   14:invokevirtual   #25  <Method ByteBuffer ByteBuffer.duplicate()>
	//   11   17:astore_1        
		bytebuffer.flip();
	//   12   18:aload_1         
	//   13   19:invokevirtual   #29  <Method java.nio.Buffer ByteBuffer.flip()>
	//   14   22:pop             
		bytebuffer = ((ByteBuffer) (((ayr) (new zb(((ayu) (new aeh(bytebuffer))), ((xz) (aek.a))))).b().iterator()));
	//   15   23:new             #31  <Class zb>
	//   16   26:dup             
	//   17   27:new             #33  <Class aeh>
	//   18   30:dup             
	//   19   31:aload_1         
	//   20   32:invokespecial   #36  <Method void aeh(ByteBuffer)>
	//   21   35:getstatic       #41  <Field aek aek.a>
	//   22   38:invokespecial   #44  <Method void zb(ayu, xz)>
	//   23   41:invokevirtual   #50  <Method List ayr.b()>
	//   24   44:invokeinterface #56  <Method Iterator List.iterator()>
	//   25   49:astore_1        
_L4:
		boolean flag = ((Iterator) (bytebuffer)).hasNext();
	//   26   50:aload_1         
	//   27   51:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//   28   56:istore          4
		Object obj = null;
	//   29   58:aconst_null     
	//   30   59:astore          5
		if(!flag) goto _L2; else goto _L1
	//   31   61:iload           4
	//   32   63:ifeq            168
_L1:
		Object obj1 = ((Object) ((abc)((Iterator) (bytebuffer)).next()));
	//   33   66:aload_1         
	//   34   67:invokeinterface #66  <Method Object Iterator.next()>
	//   35   72:checkcast       #68  <Class abc>
	//   36   75:astore          6
		if(!(obj1 instanceof ade)) goto _L4; else goto _L3
	//   37   77:aload           6
	//   38   79:instanceof      #70  <Class ade>
	//   39   82:ifeq            50
_L3:
		bytebuffer = ((ByteBuffer) ((ade)obj1));
	//   40   85:aload           6
	//   41   87:checkcast       #70  <Class ade>
	//   42   90:astore_1        
	//*  43   91:goto            94
_L8:
		long l1;
		try
		{
			obj1 = ((Object) (((ayr) (bytebuffer)).b().iterator()));
	//   44   94:aload_1         
	//   45   95:invokevirtual   #50  <Method List ayr.b()>
	//   46   98:invokeinterface #56  <Method Iterator List.iterator()>
	//   47  103:astore          6
		}
	//*  48  105:aload           5
	//*  49  107:astore_1        
	//*  50  108:aload           6
	//*  51  110:invokeinterface #62  <Method boolean Iterator.hasNext()>
	//*  52  115:ifeq            141
	//*  53  118:aload           6
	//*  54  120:invokeinterface #66  <Method Object Iterator.next()>
	//*  55  125:checkcast       #68  <Class abc>
	//*  56  128:astore_1        
	//*  57  129:aload_1         
	//*  58  130:instanceof      #72  <Class aef>
	//*  59  133:ifeq            105
	//*  60  136:aload_1         
	//*  61  137:checkcast       #72  <Class aef>
	//*  62  140:astore_1        
	//*  63  141:aload_0         
	//*  64  142:aload_1         
	//*  65  143:invokevirtual   #76  <Method long aef.c()>
	//*  66  146:ldc2w           #77  <Long 1000L>
	//*  67  149:lmul            
	//*  68  150:aload_1         
	//*  69  151:invokevirtual   #80  <Method long aef.b()>
	//*  70  154:ldiv            
	//*  71  155:putfield        #19  <Field long a>
	//*  72  158:aload_0         
	//*  73  159:getfield        #19  <Field long a>
	//*  74  162:lstore_2        
	//*  75  163:lload_2         
	//*  76  164:lreturn         
		// Misplaced declaration of an exception variable
		catch(ByteBuffer bytebuffer)
	//*  77  165:astore_1        
		{
			return 0L;
	//   78  166:lconst_0        
	//   79  167:lreturn         
		}
_L6:
		bytebuffer = ((ByteBuffer) (obj));
		if(!((Iterator) (obj1)).hasNext())
			break; /* Loop/switch isn't completed */
		bytebuffer = ((ByteBuffer) ((abc)((Iterator) (obj1)).next()));
		if(!(bytebuffer instanceof aef))
			continue; /* Loop/switch isn't completed */
		bytebuffer = ((ByteBuffer) ((aef)bytebuffer));
		break; /* Loop/switch isn't completed */
		if(true) goto _L6; else goto _L5
_L5:
		a = (((aef) (bytebuffer)).c() * 1000L) / ((aef) (bytebuffer)).b();
		l1 = a;
		return l1;
_L2:
		bytebuffer = null;
	//   80  168:aconst_null     
	//   81  169:astore_1        
		if(true) goto _L8; else goto _L7
	//   82  170:goto            94
_L7:
	}

	private long a;
}
