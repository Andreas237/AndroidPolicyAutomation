// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;


public final class CodecCounters
{

	public CodecCounters()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public void ensureUpdated()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	public String getDebugString()
	{
		ensureUpdated();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method void ensureUpdated()>
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #26  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #27  <Method void StringBuilder()>
	//    5   11:astore_1        
		stringbuilder.append("cic:");
	//    6   12:aload_1         
	//    7   13:ldc1            #29  <String "cic:">
	//    8   15:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(codecInitCount);
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #35  <Field int codecInitCount>
	//   13   24:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   14   27:pop             
		stringbuilder.append(" crc:");
	//   15   28:aload_1         
	//   16   29:ldc1            #40  <String " crc:">
	//   17   31:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(codecReleaseCount);
	//   19   35:aload_1         
	//   20   36:aload_0         
	//   21   37:getfield        #42  <Field int codecReleaseCount>
	//   22   40:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   23   43:pop             
		stringbuilder.append(" ibc:");
	//   24   44:aload_1         
	//   25   45:ldc1            #44  <String " ibc:">
	//   26   47:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(inputBufferCount);
	//   28   51:aload_1         
	//   29   52:aload_0         
	//   30   53:getfield        #46  <Field int inputBufferCount>
	//   31   56:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   32   59:pop             
		stringbuilder.append(" ofc:");
	//   33   60:aload_1         
	//   34   61:ldc1            #48  <String " ofc:">
	//   35   63:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   36   66:pop             
		stringbuilder.append(outputFormatChangedCount);
	//   37   67:aload_1         
	//   38   68:aload_0         
	//   39   69:getfield        #50  <Field int outputFormatChangedCount>
	//   40   72:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   41   75:pop             
		stringbuilder.append(" obc:");
	//   42   76:aload_1         
	//   43   77:ldc1            #52  <String " obc:">
	//   44   79:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   45   82:pop             
		stringbuilder.append(outputBuffersChangedCount);
	//   46   83:aload_1         
	//   47   84:aload_0         
	//   48   85:getfield        #54  <Field int outputBuffersChangedCount>
	//   49   88:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   50   91:pop             
		stringbuilder.append(" ren:");
	//   51   92:aload_1         
	//   52   93:ldc1            #56  <String " ren:">
	//   53   95:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
		stringbuilder.append(renderedOutputBufferCount);
	//   55   99:aload_1         
	//   56  100:aload_0         
	//   57  101:getfield        #58  <Field int renderedOutputBufferCount>
	//   58  104:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   59  107:pop             
		stringbuilder.append(" sob:");
	//   60  108:aload_1         
	//   61  109:ldc1            #60  <String " sob:">
	//   62  111:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   63  114:pop             
		stringbuilder.append(skippedOutputBufferCount);
	//   64  115:aload_1         
	//   65  116:aload_0         
	//   66  117:getfield        #62  <Field int skippedOutputBufferCount>
	//   67  120:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   68  123:pop             
		stringbuilder.append(" dob:");
	//   69  124:aload_1         
	//   70  125:ldc1            #64  <String " dob:">
	//   71  127:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   72  130:pop             
		stringbuilder.append(droppedOutputBufferCount);
	//   73  131:aload_1         
	//   74  132:aload_0         
	//   75  133:getfield        #66  <Field int droppedOutputBufferCount>
	//   76  136:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   77  139:pop             
		stringbuilder.append(" mcdob:");
	//   78  140:aload_1         
	//   79  141:ldc1            #68  <String " mcdob:">
	//   80  143:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   81  146:pop             
		stringbuilder.append(maxConsecutiveDroppedOutputBufferCount);
	//   82  147:aload_1         
	//   83  148:aload_0         
	//   84  149:getfield        #70  <Field int maxConsecutiveDroppedOutputBufferCount>
	//   85  152:invokevirtual   #38  <Method StringBuilder StringBuilder.append(int)>
	//   86  155:pop             
		return stringbuilder.toString();
	//   87  156:aload_1         
	//   88  157:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   89  160:areturn         
	}

	public int codecInitCount;
	public int codecReleaseCount;
	public int droppedOutputBufferCount;
	public int inputBufferCount;
	public int maxConsecutiveDroppedOutputBufferCount;
	public int outputBuffersChangedCount;
	public int outputFormatChangedCount;
	public int renderedOutputBufferCount;
	public int skippedOutputBufferCount;
}
