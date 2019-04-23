// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			aj

public class zzbg
	implements Parcelable
{

	public zzbg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
	//    2    4:aload_0         
	//    3    5:getstatic       #28  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    4    8:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    5   11:invokevirtual   #38  <Method long TimeUnit.toMicros(long)>
	//    6   14:putfield        #40  <Field long a>
		b = System.nanoTime();
	//    7   17:aload_0         
	//    8   18:invokestatic    #43  <Method long System.nanoTime()>
	//    9   21:putfield        #45  <Field long b>
	//   10   24:return          
	}

	private zzbg(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = parcel.readLong();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #51  <Method long Parcel.readLong()>
	//    5    9:putfield        #40  <Field long a>
		b = parcel.readLong();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #51  <Method long Parcel.readLong()>
	//    9   17:putfield        #45  <Field long b>
	//   10   20:return          
	}

	zzbg(Parcel parcel, aj aj1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #54  <Method void zzbg(Parcel)>
	//    3    5:return          
	}

	public final long a(zzbg zzbg1)
	{
		return TimeUnit.NANOSECONDS.toMicros(zzbg1.b - b);
	//    0    0:getstatic       #58  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    1    3:aload_1         
	//    2    4:getfield        #45  <Field long b>
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field long b>
	//    5   11:lsub            
	//    6   12:invokevirtual   #38  <Method long TimeUnit.toMicros(long)>
	//    7   15:lreturn         
	}

	public final void a()
	{
		a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
	//    0    0:aload_0         
	//    1    1:getstatic       #28  <Field TimeUnit TimeUnit.MILLISECONDS>
	//    2    4:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    3    7:invokevirtual   #38  <Method long TimeUnit.toMicros(long)>
	//    4   10:putfield        #40  <Field long a>
		b = System.nanoTime();
	//    5   13:aload_0         
	//    6   14:invokestatic    #43  <Method long System.nanoTime()>
	//    7   17:putfield        #45  <Field long b>
	//    8   20:return          
	}

	public final long b()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field long a>
	//    2    4:lreturn         
	}

	public final long c()
	{
		return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - b);
	//    0    0:getstatic       #58  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    1    3:invokestatic    #43  <Method long System.nanoTime()>
	//    2    6:aload_0         
	//    3    7:getfield        #45  <Field long b>
	//    4   10:lsub            
	//    5   11:invokevirtual   #38  <Method long TimeUnit.toMicros(long)>
	//    6   14:lreturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeLong(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field long a>
	//    3    5:invokevirtual   #67  <Method void Parcel.writeLong(long)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field long b>
	//    7   13:invokevirtual   #67  <Method void Parcel.writeLong(long)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new aj();
	private long a;
	private long b;

	static 
	{
	//    0    0:new             #15  <Class aj>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void aj()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
