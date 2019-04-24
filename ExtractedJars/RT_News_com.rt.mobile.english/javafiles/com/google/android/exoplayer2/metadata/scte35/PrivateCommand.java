// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import com.google.android.exoplayer2.util.ParsableByteArray;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceCommand

public final class PrivateCommand extends SpliceCommand
{

	private PrivateCommand(long l, byte abyte0[], long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void SpliceCommand()>
		ptsAdjustment = l1;
	//    2    4:aload_0         
	//    3    5:lload           4
	//    4    7:putfield        #26  <Field long ptsAdjustment>
		identifier = l;
	//    5   10:aload_0         
	//    6   11:lload_1         
	//    7   12:putfield        #28  <Field long identifier>
		commandBytes = abyte0;
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:putfield        #30  <Field byte[] commandBytes>
	//   11   20:return          
	}

	private PrivateCommand(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void SpliceCommand()>
		ptsAdjustment = parcel.readLong();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method long Parcel.readLong()>
	//    5    9:putfield        #26  <Field long ptsAdjustment>
		identifier = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #37  <Method long Parcel.readLong()>
	//    9   17:putfield        #28  <Field long identifier>
		commandBytes = new byte[parcel.readInt()];
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #41  <Method int Parcel.readInt()>
	//   13   25:newarray        byte[]
	//   14   27:putfield        #30  <Field byte[] commandBytes>
		parcel.readByteArray(commandBytes);
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #30  <Field byte[] commandBytes>
	//   18   35:invokevirtual   #45  <Method void Parcel.readByteArray(byte[])>
	//   19   38:return          
	}


	static PrivateCommand parseFromSection(ParsableByteArray parsablebytearray, int i, long l)
	{
		long l1 = parsablebytearray.readUnsignedInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method long ParsableByteArray.readUnsignedInt()>
	//    2    4:lstore          4
		byte abyte0[] = new byte[i - 4];
	//    3    6:iload_1         
	//    4    7:iconst_4        
	//    5    8:isub            
	//    6    9:newarray        byte[]
	//    7   11:astore          6
		parsablebytearray.readBytes(abyte0, 0, abyte0.length);
	//    8   13:aload_0         
	//    9   14:aload           6
	//   10   16:iconst_0        
	//   11   17:aload           6
	//   12   19:arraylength     
	//   13   20:invokevirtual   #59  <Method void ParsableByteArray.readBytes(byte[], int, int)>
		return new PrivateCommand(l1, abyte0, l);
	//   14   23:new             #2   <Class PrivateCommand>
	//   15   26:dup             
	//   16   27:lload           4
	//   17   29:aload           6
	//   18   31:lload_2         
	//   19   32:invokespecial   #61  <Method void PrivateCommand(long, byte[], long)>
	//   20   35:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(ptsAdjustment);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field long ptsAdjustment>
	//    3    5:invokevirtual   #67  <Method void Parcel.writeLong(long)>
		parcel.writeLong(identifier);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field long identifier>
	//    7   13:invokevirtual   #67  <Method void Parcel.writeLong(long)>
		parcel.writeInt(commandBytes.length);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field byte[] commandBytes>
	//   11   21:arraylength     
	//   12   22:invokevirtual   #71  <Method void Parcel.writeInt(int)>
		parcel.writeByteArray(commandBytes);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #30  <Field byte[] commandBytes>
	//   16   30:invokevirtual   #74  <Method void Parcel.writeByteArray(byte[])>
	//   17   33:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PrivateCommand createFromParcel(Parcel parcel)
		{
			return new PrivateCommand(parcel);
		//    0    0:new             #9   <Class PrivateCommand>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void PrivateCommand(Parcel, PrivateCommand$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method PrivateCommand createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public PrivateCommand[] newArray(int i)
		{
			return new PrivateCommand[i];
		//    0    0:iload_1         
		//    1    1:anewarray       PrivateCommand[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method PrivateCommand[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final byte commandBytes[];
	public final long identifier;
	public final long ptsAdjustment;

	static 
	{
	//    0    0:new             #6   <Class PrivateCommand$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void PrivateCommand$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
