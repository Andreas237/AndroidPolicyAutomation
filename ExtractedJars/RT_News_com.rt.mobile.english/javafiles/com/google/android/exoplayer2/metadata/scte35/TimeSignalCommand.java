// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceCommand

public final class TimeSignalCommand extends SpliceCommand
{

	private TimeSignalCommand(long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void SpliceCommand()>
		ptsTime = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #24  <Field long ptsTime>
		playbackPositionUs = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #26  <Field long playbackPositionUs>
	//    8   14:return          
	}

	TimeSignalCommand(long l, long l1, _cls1 _pcls1)
	{
		this(l, l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_3         
	//    3    3:invokespecial   #29  <Method void TimeSignalCommand(long, long)>
	//    4    6:return          
	}

	static TimeSignalCommand parseFromSection(ParsableByteArray parsablebytearray, long l, TimestampAdjuster timestampadjuster)
	{
		l = parseSpliceTime(parsablebytearray, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #35  <Method long parseSpliceTime(ParsableByteArray, long)>
	//    3    5:lstore_1        
		return new TimeSignalCommand(l, timestampadjuster.adjustTsTimestamp(l));
	//    4    6:new             #2   <Class TimeSignalCommand>
	//    5    9:dup             
	//    6   10:lload_1         
	//    7   11:aload_3         
	//    8   12:lload_1         
	//    9   13:invokevirtual   #41  <Method long TimestampAdjuster.adjustTsTimestamp(long)>
	//   10   16:invokespecial   #29  <Method void TimeSignalCommand(long, long)>
	//   11   19:areturn         
	}

	static long parseSpliceTime(ParsableByteArray parsablebytearray, long l)
	{
		long l1 = parsablebytearray.readUnsignedByte();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method int ParsableByteArray.readUnsignedByte()>
	//    2    4:i2l             
	//    3    5:lstore_3        
		if((l1 & 128L) != 0L)
	//*   4    6:lload_3         
	//*   5    7:ldc2w           #48  <Long 128L>
	//*   6   10:land            
	//*   7   11:lconst_0        
	//*   8   12:lcmp            
	//*   9   13:ifeq            34
			return ((l1 & 1L) << 32 | parsablebytearray.readUnsignedInt()) + l & 0xffffffffL;
	//   10   16:lload_3         
	//   11   17:lconst_1        
	//   12   18:land            
	//   13   19:bipush          32
	//   14   21:lshl            
	//   15   22:aload_0         
	//   16   23:invokevirtual   #53  <Method long ParsableByteArray.readUnsignedInt()>
	//   17   26:lor             
	//   18   27:lload_1         
	//   19   28:ladd            
	//   20   29:ldc2w           #54  <Long 0xffffffffL>
	//   21   32:land            
	//   22   33:lreturn         
		else
			return 0x1L;
	//   23   34:ldc2w           #56  <Long 0x1L>
	//   24   37:lreturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(ptsTime);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field long ptsTime>
	//    3    5:invokevirtual   #65  <Method void Parcel.writeLong(long)>
		parcel.writeLong(playbackPositionUs);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field long playbackPositionUs>
	//    7   13:invokevirtual   #65  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TimeSignalCommand createFromParcel(Parcel parcel)
		{
			return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
		//    0    0:new             #9   <Class TimeSignalCommand>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method long Parcel.readLong()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #22  <Method long Parcel.readLong()>
		//    6   12:aconst_null     
		//    7   13:invokespecial   #25  <Method void TimeSignalCommand(long, long, TimeSignalCommand$1)>
		//    8   16:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method TimeSignalCommand createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TimeSignalCommand[] newArray(int i)
		{
			return new TimeSignalCommand[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TimeSignalCommand[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method TimeSignalCommand[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final long playbackPositionUs;
	public final long ptsTime;

	static 
	{
	//    0    0:new             #6   <Class TimeSignalCommand$1>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void TimeSignalCommand$1()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
