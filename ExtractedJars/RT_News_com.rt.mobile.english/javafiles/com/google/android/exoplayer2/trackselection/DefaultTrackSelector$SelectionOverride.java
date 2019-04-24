// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			DefaultTrackSelector

public static final class DefaultTrackSelector$SelectionOverride
	implements Parcelable
{

	public boolean containsTrack(int i)
	{
		int ai[] = tracks;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int[] tracks>
	//    2    4:astore          4
		int k = ai.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          34
			if(ai[j] == i)
	//*  11   17:aload           4
	//*  12   19:iload_2         
	//*  13   20:iaload          
	//*  14   21:iload_1         
	//*  15   22:icmpne          27
				return true;
	//   16   25:iconst_1        
	//   17   26:ireturn         

	//   18   27:iload_2         
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:istore_2        
	//*  22   31:goto            12
		return false;
	//   23   34:iconst_0        
	//   24   35:ireturn         
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
	//*   8   12:invokevirtual   #69  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #69  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((DefaultTrackSelector$SelectionOverride)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class DefaultTrackSelector$SelectionOverride>
	//   16   28:astore_1        
			return groupIndex == ((DefaultTrackSelector$SelectionOverride) (obj)).groupIndex && Arrays.equals(tracks, ((DefaultTrackSelector$SelectionOverride) (obj)).tracks);
	//   17   29:aload_0         
	//   18   30:getfield        #31  <Field int groupIndex>
	//   19   33:aload_1         
	//   20   34:getfield        #31  <Field int groupIndex>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #39  <Field int[] tracks>
	//   24   44:aload_1         
	//   25   45:getfield        #39  <Field int[] tracks>
	//   26   48:invokestatic    #72  <Method boolean Arrays.equals(int[], int[])>
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

	public int hashCode()
	{
		return 31 * groupIndex + Arrays.hashCode(tracks);
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:getfield        #31  <Field int groupIndex>
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #39  <Field int[] tracks>
	//    6   11:invokestatic    #77  <Method int Arrays.hashCode(int[])>
	//    7   14:iadd            
	//    8   15:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(groupIndex);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int groupIndex>
	//    3    5:invokevirtual   #83  <Method void Parcel.writeInt(int)>
		parcel.writeInt(tracks.length);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field int[] tracks>
	//    7   13:arraylength     
	//    8   14:invokevirtual   #83  <Method void Parcel.writeInt(int)>
		parcel.writeIntArray(tracks);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field int[] tracks>
	//   12   22:invokevirtual   #86  <Method void Parcel.writeIntArray(int[])>
	//   13   25:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public DefaultTrackSelector.SelectionOverride createFromParcel(Parcel parcel)
		{
			return new DefaultTrackSelector.SelectionOverride(parcel);
		//    0    0:new             #9   <Class DefaultTrackSelector$SelectionOverride>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void DefaultTrackSelector$SelectionOverride(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method DefaultTrackSelector$SelectionOverride createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public DefaultTrackSelector.SelectionOverride[] newArray(int i)
		{
			return new DefaultTrackSelector.SelectionOverride[i];
		//    0    0:iload_1         
		//    1    1:anewarray       DefaultTrackSelector.SelectionOverride[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method DefaultTrackSelector$SelectionOverride[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final int groupIndex;
	public final int length;
	public final int tracks[];

	static 
	{
	//    0    0:new             #11  <Class DefaultTrackSelector$SelectionOverride$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void DefaultTrackSelector$SelectionOverride$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public transient DefaultTrackSelector$SelectionOverride(int i, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		groupIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field int groupIndex>
		tracks = Arrays.copyOf(ai, ai.length);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:aload_2         
	//    8   12:arraylength     
	//    9   13:invokestatic    #37  <Method int[] Arrays.copyOf(int[], int)>
	//   10   16:putfield        #39  <Field int[] tracks>
		length = ai.length;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:arraylength     
	//   14   22:putfield        #41  <Field int length>
		Arrays.sort(tracks);
	//   15   25:aload_0         
	//   16   26:getfield        #39  <Field int[] tracks>
	//   17   29:invokestatic    #45  <Method void Arrays.sort(int[])>
	//   18   32:return          
	}

	DefaultTrackSelector$SelectionOverride(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		groupIndex = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #52  <Method int Parcel.readInt()>
	//    5    9:putfield        #31  <Field int groupIndex>
		length = ((int) (parcel.readByte()));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #56  <Method byte Parcel.readByte()>
	//    9   17:putfield        #41  <Field int length>
		tracks = new int[length];
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #41  <Field int length>
	//   13   25:newarray        int[]
	//   14   27:putfield        #39  <Field int[] tracks>
		parcel.readIntArray(tracks);
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:getfield        #39  <Field int[] tracks>
	//   18   35:invokevirtual   #59  <Method void Parcel.readIntArray(int[])>
	//   19   38:return          
	}
}
