// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.os.Process;
import b.a.a.a.a.b.i;
import b.a.a.a.a.b.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class CLSUUID
{

	public CLSUUID(p p1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		byte abyte0[] = new byte[10];
	//    2    4:bipush          10
	//    3    6:newarray        byte[]
	//    4    8:astore_2        
		populateTime(abyte0);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #26  <Method void populateTime(byte[])>
		populateSequenceNumber(abyte0);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokespecial   #29  <Method void populateSequenceNumber(byte[])>
		populatePID(abyte0);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokespecial   #32  <Method void populatePID(byte[])>
		p1 = ((p) (i.a(p1.b())));
	//   14   24:aload_1         
	//   15   25:invokevirtual   #38  <Method String p.b()>
	//   16   28:invokestatic    #44  <Method String i.a(String)>
	//   17   31:astore_1        
		String s = i.a(abyte0);
	//   18   32:aload_2         
	//   19   33:invokestatic    #47  <Method String i.a(byte[])>
	//   20   36:astore_2        
		_clsId = String.format(Locale.US, "%s-%s-%s-%s", new Object[] {
			s.substring(0, 12), s.substring(12, 16), s.subSequence(16, 20), ((String) (p1)).substring(0, 12)
		}).toUpperCase(Locale.US);
	//   21   37:getstatic       #53  <Field Locale Locale.US>
	//   22   40:ldc1            #55  <String "%s-%s-%s-%s">
	//   23   42:iconst_4        
	//   24   43:anewarray       Object[]
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:aload_2         
	//   28   49:iconst_0        
	//   29   50:bipush          12
	//   30   52:invokevirtual   #61  <Method String String.substring(int, int)>
	//   31   55:aastore         
	//   32   56:dup             
	//   33   57:iconst_1        
	//   34   58:aload_2         
	//   35   59:bipush          12
	//   36   61:bipush          16
	//   37   63:invokevirtual   #61  <Method String String.substring(int, int)>
	//   38   66:aastore         
	//   39   67:dup             
	//   40   68:iconst_2        
	//   41   69:aload_2         
	//   42   70:bipush          16
	//   43   72:bipush          20
	//   44   74:invokevirtual   #65  <Method CharSequence String.subSequence(int, int)>
	//   45   77:aastore         
	//   46   78:dup             
	//   47   79:iconst_3        
	//   48   80:aload_1         
	//   49   81:iconst_0        
	//   50   82:bipush          12
	//   51   84:invokevirtual   #61  <Method String String.substring(int, int)>
	//   52   87:aastore         
	//   53   88:invokestatic    #69  <Method String String.format(Locale, String, Object[])>
	//   54   91:getstatic       #53  <Field Locale Locale.US>
	//   55   94:invokevirtual   #73  <Method String String.toUpperCase(Locale)>
	//   56   97:putstatic       #75  <Field String _clsId>
	//   57  100:return          
	}

	private static byte[] convertLongToFourByteBuffer(long l)
	{
		ByteBuffer bytebuffer = ByteBuffer.allocate(4);
	//    0    0:iconst_4        
	//    1    1:invokestatic    #83  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    4:astore_2        
		bytebuffer.putInt((int)l);
	//    3    5:aload_2         
	//    4    6:lload_0         
	//    5    7:l2i             
	//    6    8:invokevirtual   #86  <Method ByteBuffer ByteBuffer.putInt(int)>
	//    7   11:pop             
		bytebuffer.order(ByteOrder.BIG_ENDIAN);
	//    8   12:aload_2         
	//    9   13:getstatic       #92  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   10   16:invokevirtual   #96  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   19:pop             
		bytebuffer.position(0);
	//   12   20:aload_2         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #100 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   15   25:pop             
		return bytebuffer.array();
	//   16   26:aload_2         
	//   17   27:invokevirtual   #104 <Method byte[] ByteBuffer.array()>
	//   18   30:areturn         
	}

	private static byte[] convertLongToTwoByteBuffer(long l)
	{
		ByteBuffer bytebuffer = ByteBuffer.allocate(2);
	//    0    0:iconst_2        
	//    1    1:invokestatic    #83  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    2    4:astore_2        
		bytebuffer.putShort((short)(int)l);
	//    3    5:aload_2         
	//    4    6:lload_0         
	//    5    7:l2i             
	//    6    8:int2short       
	//    7    9:invokevirtual   #109 <Method ByteBuffer ByteBuffer.putShort(short)>
	//    8   12:pop             
		bytebuffer.order(ByteOrder.BIG_ENDIAN);
	//    9   13:aload_2         
	//   10   14:getstatic       #92  <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//   11   17:invokevirtual   #96  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   12   20:pop             
		bytebuffer.position(0);
	//   13   21:aload_2         
	//   14   22:iconst_0        
	//   15   23:invokevirtual   #100 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   16   26:pop             
		return bytebuffer.array();
	//   17   27:aload_2         
	//   18   28:invokevirtual   #104 <Method byte[] ByteBuffer.array()>
	//   19   31:areturn         
	}

	private void populatePID(byte abyte0[])
	{
		byte abyte1[] = convertLongToTwoByteBuffer(Integer.valueOf(Process.myPid()).shortValue());
	//    0    0:invokestatic    #115 <Method int Process.myPid()>
	//    1    3:invokestatic    #121 <Method Integer Integer.valueOf(int)>
	//    2    6:invokevirtual   #125 <Method short Integer.shortValue()>
	//    3    9:i2l             
	//    4   10:invokestatic    #127 <Method byte[] convertLongToTwoByteBuffer(long)>
	//    5   13:astore_2        
		abyte0[8] = abyte1[0];
	//    6   14:aload_1         
	//    7   15:bipush          8
	//    8   17:aload_2         
	//    9   18:iconst_0        
	//   10   19:baload          
	//   11   20:bastore         
		abyte0[9] = abyte1[1];
	//   12   21:aload_1         
	//   13   22:bipush          9
	//   14   24:aload_2         
	//   15   25:iconst_1        
	//   16   26:baload          
	//   17   27:bastore         
	//   18   28:return          
	}

	private void populateSequenceNumber(byte abyte0[])
	{
		byte abyte1[] = convertLongToTwoByteBuffer(_sequenceNumber.incrementAndGet());
	//    0    0:getstatic       #18  <Field AtomicLong _sequenceNumber>
	//    1    3:invokevirtual   #131 <Method long AtomicLong.incrementAndGet()>
	//    2    6:invokestatic    #127 <Method byte[] convertLongToTwoByteBuffer(long)>
	//    3    9:astore_2        
		abyte0[6] = abyte1[0];
	//    4   10:aload_1         
	//    5   11:bipush          6
	//    6   13:aload_2         
	//    7   14:iconst_0        
	//    8   15:baload          
	//    9   16:bastore         
		abyte0[7] = abyte1[1];
	//   10   17:aload_1         
	//   11   18:bipush          7
	//   12   20:aload_2         
	//   13   21:iconst_1        
	//   14   22:baload          
	//   15   23:bastore         
	//   16   24:return          
	}

	private void populateTime(byte abyte0[])
	{
		long l = (new Date()).getTime();
	//    0    0:new             #133 <Class Date>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void Date()>
	//    3    7:invokevirtual   #137 <Method long Date.getTime()>
	//    4   10:lstore_2        
		byte abyte1[] = convertLongToFourByteBuffer(l / 1000L);
	//    5   11:lload_2         
	//    6   12:ldc2w           #138 <Long 1000L>
	//    7   15:ldiv            
	//    8   16:invokestatic    #141 <Method byte[] convertLongToFourByteBuffer(long)>
	//    9   19:astore          4
		abyte0[0] = abyte1[0];
	//   10   21:aload_1         
	//   11   22:iconst_0        
	//   12   23:aload           4
	//   13   25:iconst_0        
	//   14   26:baload          
	//   15   27:bastore         
		abyte0[1] = abyte1[1];
	//   16   28:aload_1         
	//   17   29:iconst_1        
	//   18   30:aload           4
	//   19   32:iconst_1        
	//   20   33:baload          
	//   21   34:bastore         
		abyte0[2] = abyte1[2];
	//   22   35:aload_1         
	//   23   36:iconst_2        
	//   24   37:aload           4
	//   25   39:iconst_2        
	//   26   40:baload          
	//   27   41:bastore         
		abyte0[3] = abyte1[3];
	//   28   42:aload_1         
	//   29   43:iconst_3        
	//   30   44:aload           4
	//   31   46:iconst_3        
	//   32   47:baload          
	//   33   48:bastore         
		abyte1 = convertLongToTwoByteBuffer(l % 1000L);
	//   34   49:lload_2         
	//   35   50:ldc2w           #138 <Long 1000L>
	//   36   53:lrem            
	//   37   54:invokestatic    #127 <Method byte[] convertLongToTwoByteBuffer(long)>
	//   38   57:astore          4
		abyte0[4] = abyte1[0];
	//   39   59:aload_1         
	//   40   60:iconst_4        
	//   41   61:aload           4
	//   42   63:iconst_0        
	//   43   64:baload          
	//   44   65:bastore         
		abyte0[5] = abyte1[1];
	//   45   66:aload_1         
	//   46   67:iconst_5        
	//   47   68:aload           4
	//   48   70:iconst_1        
	//   49   71:baload          
	//   50   72:bastore         
	//   51   73:return          
	}

	public String toString()
	{
		return _clsId;
	//    0    0:getstatic       #75  <Field String _clsId>
	//    1    3:areturn         
	}

	private static String _clsId;
	private static final AtomicLong _sequenceNumber = new AtomicLong(0L);

	static 
	{
	//    0    0:new             #12  <Class AtomicLong>
	//    1    3:dup             
	//    2    4:lconst_0        
	//    3    5:invokespecial   #16  <Method void AtomicLong(long)>
	//    4    8:putstatic       #18  <Field AtomicLong _sequenceNumber>
	//*   5   11:return          
	}
}
