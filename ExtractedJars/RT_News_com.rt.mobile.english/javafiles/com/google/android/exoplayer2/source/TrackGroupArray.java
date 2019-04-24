// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.source:
//			TrackGroup

public final class TrackGroupArray
	implements Parcelable
{

	TrackGroupArray(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		length = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method int Parcel.readInt()>
	//    5    9:putfield        #43  <Field int length>
		trackGroups = new TrackGroup[length];
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #43  <Field int length>
	//    9   17:anewarray       TrackGroup[]
	//   10   20:putfield        #45  <Field TrackGroup[] trackGroups>
		for(int i = 0; i < length; i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_2        
	//*  13   25:iload_2         
	//*  14   26:aload_0         
	//*  15   27:getfield        #43  <Field int length>
	//*  16   30:icmpge          58
			trackGroups[i] = (TrackGroup)parcel.readParcelable(((Class) (com/google/android/exoplayer2/source/TrackGroup)).getClassLoader());
	//   17   33:aload_0         
	//   18   34:getfield        #45  <Field TrackGroup[] trackGroups>
	//   19   37:iload_2         
	//   20   38:aload_1         
	//   21   39:ldc1            #22  <Class TrackGroup>
	//   22   41:invokevirtual   #51  <Method ClassLoader Class.getClassLoader()>
	//   23   44:invokevirtual   #55  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   24   47:checkcast       #22  <Class TrackGroup>
	//   25   50:aastore         

	//   26   51:iload_2         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_2        
	//*  30   55:goto            25
	//   31   58:return          
	}

	public transient TrackGroupArray(TrackGroup atrackgroup[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		trackGroups = atrackgroup;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field TrackGroup[] trackGroups>
		length = atrackgroup.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #43  <Field int length>
	//    9   15:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #63  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TrackGroupArray)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TrackGroupArray>
	//   16   28:astore_1        
			return length == ((TrackGroupArray) (obj)).length && Arrays.equals(((Object []) (trackGroups)), ((Object []) (((TrackGroupArray) (obj)).trackGroups)));
	//   17   29:aload_0         
	//   18   30:getfield        #43  <Field int length>
	//   19   33:aload_1         
	//   20   34:getfield        #43  <Field int length>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #45  <Field TrackGroup[] trackGroups>
	//   24   44:aload_1         
	//   25   45:getfield        #45  <Field TrackGroup[] trackGroups>
	//   26   48:invokestatic    #68  <Method boolean Arrays.equals(Object[], Object[])>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public TrackGroup get(int i)
	{
		return trackGroups[i];
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field TrackGroup[] trackGroups>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int hashCode>
	//*   2    4:ifne            18
			hashCode = Arrays.hashCode(((Object []) (trackGroups)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #45  <Field TrackGroup[] trackGroups>
	//    6   12:invokestatic    #76  <Method int Arrays.hashCode(Object[])>
	//    7   15:putfield        #73  <Field int hashCode>
		return hashCode;
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field int hashCode>
	//   10   22:ireturn         
	}

	public int indexOf(TrackGroup trackgroup)
	{
		for(int i = 0; i < length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #43  <Field int length>
	//*   5    7:icmpge          29
			if(trackGroups[i] == trackgroup)
	//*   6   10:aload_0         
	//*   7   11:getfield        #45  <Field TrackGroup[] trackGroups>
	//*   8   14:iload_2         
	//*   9   15:aaload          
	//*  10   16:aload_1         
	//*  11   17:if_acmpne       22
				return i;
	//   12   20:iload_2         
	//   13   21:ireturn         

	//   14   22:iload_2         
	//   15   23:iconst_1        
	//   16   24:iadd            
	//   17   25:istore_2        
	//*  18   26:goto            2
		return -1;
	//   19   29:iconst_m1       
	//   20   30:ireturn         
	}

	public boolean isEmpty()
	{
		return length == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int length>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(length);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field int length>
	//    3    5:invokevirtual   #86  <Method void Parcel.writeInt(int)>
		for(i = 0; i < length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #43  <Field int length>
	//*   9   15:icmpge          36
			parcel.writeParcelable(((Parcelable) (trackGroups[i])), 0);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #45  <Field TrackGroup[] trackGroups>
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #90  <Method void Parcel.writeParcelable(Parcelable, int)>

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            10
	//   22   36:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TrackGroupArray createFromParcel(Parcel parcel)
		{
			return new TrackGroupArray(parcel);
		//    0    0:new             #9   <Class TrackGroupArray>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TrackGroupArray(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method TrackGroupArray createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TrackGroupArray[] newArray(int i)
		{
			return new TrackGroupArray[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TrackGroupArray[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method TrackGroupArray[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
	private int hashCode;
	public final int length;
	private final TrackGroup trackGroups[];

	static 
	{
	//    0    0:new             #2   <Class TrackGroupArray>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:anewarray       TrackGroup[]
	//    4    8:invokespecial   #26  <Method void TrackGroupArray(TrackGroup[])>
	//    5   11:putstatic       #28  <Field TrackGroupArray EMPTY>
	//    6   14:new             #8   <Class TrackGroupArray$1>
	//    7   17:dup             
	//    8   18:invokespecial   #30  <Method void TrackGroupArray$1()>
	//    9   21:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*  10   24:return          
	}
}
