// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			TrackSelection

public final class TrackSelectionArray
{

	public transient TrackSelectionArray(TrackSelection atrackselection[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		trackSelections = atrackselection;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field TrackSelection[] trackSelections>
		length = atrackselection.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #18  <Field int length>
	//    9   15:return          
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          42
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #26  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #26  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            42
		{
			obj = ((Object) ((TrackSelectionArray)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class TrackSelectionArray>
	//   15   29:astore_1        
			return Arrays.equals(((Object []) (trackSelections)), ((Object []) (((TrackSelectionArray) (obj)).trackSelections)));
	//   16   30:aload_0         
	//   17   31:getfield        #16  <Field TrackSelection[] trackSelections>
	//   18   34:aload_1         
	//   19   35:getfield        #16  <Field TrackSelection[] trackSelections>
	//   20   38:invokestatic    #31  <Method boolean Arrays.equals(Object[], Object[])>
	//   21   41:ireturn         
		} else
		{
			return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
		}
	}

	public TrackSelection get(int i)
	{
		return trackSelections[i];
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TrackSelection[] trackSelections>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public TrackSelection[] getAll()
	{
		return (TrackSelection[])((TrackSelection []) (trackSelections)).clone();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TrackSelection[] trackSelections>
	//    2    4:invokevirtual   #42  <Method Object _5B_Lcom.google.android.exoplayer2.trackselection.TrackSelection_3B_.clone()>
	//    3    7:checkcast       #38  <Class TrackSelection[]>
	//    4   10:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field int hashCode>
	//*   2    4:ifne            22
			hashCode = 527 + Arrays.hashCode(((Object []) (trackSelections)));
	//    3    7:aload_0         
	//    4    8:sipush          527
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field TrackSelection[] trackSelections>
	//    7   15:invokestatic    #48  <Method int Arrays.hashCode(Object[])>
	//    8   18:iadd            
	//    9   19:putfield        #45  <Field int hashCode>
		return hashCode;
	//   10   22:aload_0         
	//   11   23:getfield        #45  <Field int hashCode>
	//   12   26:ireturn         
	}

	private int hashCode;
	public final int length;
	private final TrackSelection trackSelections[];
}
