// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream

private static final class NativeCrashWriter$DeviceMessage extends e
{

	public int getPropertiesSize()
	{
		return CodedOutputStream.computeFloatSize(1, batteryLevel) + 0 + CodedOutputStream.computeSInt32Size(2, batteryVelocity) + CodedOutputStream.computeBoolSize(3, proximityOn) + CodedOutputStream.computeUInt32Size(4, orientation) + CodedOutputStream.computeUInt64Size(5, ramUsed) + CodedOutputStream.computeUInt64Size(6, diskUsed);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field float batteryLevel>
	//    3    5:invokestatic    #43  <Method int CodedOutputStream.computeFloatSize(int, float)>
	//    4    8:iconst_0        
	//    5    9:iadd            
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field int batteryVelocity>
	//    9   15:invokestatic    #47  <Method int CodedOutputStream.computeSInt32Size(int, int)>
	//   10   18:iadd            
	//   11   19:iconst_3        
	//   12   20:aload_0         
	//   13   21:getfield        #28  <Field boolean proximityOn>
	//   14   24:invokestatic    #51  <Method int CodedOutputStream.computeBoolSize(int, boolean)>
	//   15   27:iadd            
	//   16   28:iconst_4        
	//   17   29:aload_0         
	//   18   30:getfield        #30  <Field int orientation>
	//   19   33:invokestatic    #54  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   20   36:iadd            
	//   21   37:iconst_5        
	//   22   38:aload_0         
	//   23   39:getfield        #32  <Field long ramUsed>
	//   24   42:invokestatic    #58  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   25   45:iadd            
	//   26   46:bipush          6
	//   27   48:aload_0         
	//   28   49:getfield        #34  <Field long diskUsed>
	//   29   52:invokestatic    #58  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   30   55:iadd            
	//   31   56:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeFloat(1, batteryLevel);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #24  <Field float batteryLevel>
	//    4    6:invokevirtual   #66  <Method void CodedOutputStream.writeFloat(int, float)>
		codedoutputstream.writeSInt32(2, batteryVelocity);
	//    5    9:aload_1         
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field int batteryVelocity>
	//    9   15:invokevirtual   #70  <Method void CodedOutputStream.writeSInt32(int, int)>
		codedoutputstream.writeBool(3, proximityOn);
	//   10   18:aload_1         
	//   11   19:iconst_3        
	//   12   20:aload_0         
	//   13   21:getfield        #28  <Field boolean proximityOn>
	//   14   24:invokevirtual   #74  <Method void CodedOutputStream.writeBool(int, boolean)>
		codedoutputstream.writeUInt32(4, orientation);
	//   15   27:aload_1         
	//   16   28:iconst_4        
	//   17   29:aload_0         
	//   18   30:getfield        #30  <Field int orientation>
	//   19   33:invokevirtual   #77  <Method void CodedOutputStream.writeUInt32(int, int)>
		codedoutputstream.writeUInt64(5, ramUsed);
	//   20   36:aload_1         
	//   21   37:iconst_5        
	//   22   38:aload_0         
	//   23   39:getfield        #32  <Field long ramUsed>
	//   24   42:invokevirtual   #81  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(6, diskUsed);
	//   25   45:aload_1         
	//   26   46:bipush          6
	//   27   48:aload_0         
	//   28   49:getfield        #34  <Field long diskUsed>
	//   29   52:invokevirtual   #81  <Method void CodedOutputStream.writeUInt64(int, long)>
	//   30   55:return          
	}

	private final float batteryLevel;
	private final int batteryVelocity;
	private final long diskUsed;
	private final int orientation;
	private final boolean proximityOn;
	private final long ramUsed;

	public NativeCrashWriter$DeviceMessage(float f, int i, boolean flag, int j, long l, long l1)
	{
		super(5, new e[0]);
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:iconst_0        
	//    3    3:anewarray       e[]
	//    4    6:invokespecial   #22  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		batteryLevel = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #24  <Field float batteryLevel>
		batteryVelocity = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #26  <Field int batteryVelocity>
		proximityOn = flag;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #28  <Field boolean proximityOn>
		orientation = j;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #30  <Field int orientation>
		ramUsed = l;
	//   17   30:aload_0         
	//   18   31:lload           5
	//   19   33:putfield        #32  <Field long ramUsed>
		diskUsed = l1;
	//   20   36:aload_0         
	//   21   37:lload           7
	//   22   39:putfield        #34  <Field long diskUsed>
	//   23   42:return          
	}
}
