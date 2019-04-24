// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

static class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	int getGapForSpan(int i)
	{
		if(mGapPerSpan == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int[] mGapPerSpan>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mGapPerSpan[i];
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int[] mGapPerSpan>
	//    7   13:iload_1         
	//    8   14:iaload          
	//    9   15:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:ldc1            #62  <String "FullSpanItem{mPosition=">
	//    4    9:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #42  <Field int mPosition>
	//    7   16:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:ldc1            #71  <String ", mGapDir=">
	//    9   21:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #44  <Field int mGapDir>
	//   12   28:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #73  <String ", mHasUnwantedGapAfter=">
	//   14   33:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #46  <Field boolean mHasUnwantedGapAfter>
	//   17   40:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:ldc1            #78  <String ", mGapPerSpan=">
	//   19   45:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #48  <Field int[] mGapPerSpan>
	//   22   52:invokestatic    #83  <Method String Arrays.toString(int[])>
	//   23   55:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:bipush          125
	//   25   60:invokevirtual   #86  <Method StringBuilder StringBuilder.append(char)>
	//   26   63:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   27   66:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(mPosition);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field int mPosition>
	//    3    5:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		parcel.writeInt(mGapDir);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field int mGapDir>
	//    7   13:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		if(mHasUnwantedGapAfter)
	//*   8   16:aload_0         
	//*   9   17:getfield        #46  <Field boolean mHasUnwantedGapAfter>
	//*  10   20:ifeq            63
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:aload_1         
	//*  14   26:iload_2         
	//*  15   27:invokevirtual   #94  <Method void Parcel.writeInt(int)>
	//*  16   30:aload_0         
	//*  17   31:getfield        #48  <Field int[] mGapPerSpan>
	//*  18   34:ifnull          68
	//*  19   37:aload_0         
	//*  20   38:getfield        #48  <Field int[] mGapPerSpan>
	//*  21   41:arraylength     
	//*  22   42:ifle            68
	//*  23   45:aload_1         
	//*  24   46:aload_0         
	//*  25   47:getfield        #48  <Field int[] mGapPerSpan>
	//*  26   50:arraylength     
	//*  27   51:invokevirtual   #94  <Method void Parcel.writeInt(int)>
	//*  28   54:aload_1         
	//*  29   55:aload_0         
	//*  30   56:getfield        #48  <Field int[] mGapPerSpan>
	//*  31   59:invokevirtual   #97  <Method void Parcel.writeIntArray(int[])>
	//*  32   62:return          
			i = 0;
	//   33   63:iconst_0        
	//   34   64:istore_2        
		parcel.writeInt(i);
		if(mGapPerSpan != null && mGapPerSpan.length > 0)
		{
			parcel.writeInt(mGapPerSpan.length);
			parcel.writeIntArray(mGapPerSpan);
			return;
		} else
	//*  35   65:goto            25
		{
			parcel.writeInt(0);
	//   36   68:aload_1         
	//   37   69:iconst_0        
	//   38   70:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			return;
	//   39   73:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
		{
			return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
		//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #28  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i)
		{
			return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int mGapDir;
	int mGapPerSpan[];
	boolean mHasUnwantedGapAfter;
	int mPosition;

	static 
	{
	//    0    0:new             #14  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #33  <Method void Object()>
		mPosition = parcel.readInt();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #40  <Method int Parcel.readInt()>
	//    7   11:putfield        #42  <Field int mPosition>
		mGapDir = parcel.readInt();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #40  <Method int Parcel.readInt()>
	//   11   19:putfield        #44  <Field int mGapDir>
		int i;
		if(parcel.readInt() != 1)
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #40  <Method int Parcel.readInt()>
	//*  14   26:iconst_1        
	//*  15   27:icmpne          60
	//*  16   30:aload_0         
	//*  17   31:iload_3         
	//*  18   32:putfield        #46  <Field boolean mHasUnwantedGapAfter>
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #40  <Method int Parcel.readInt()>
	//*  21   39:istore_2        
	//*  22   40:iload_2         
	//*  23   41:ifle            59
	//*  24   44:aload_0         
	//*  25   45:iload_2         
	//*  26   46:newarray        int[]
	//*  27   48:putfield        #48  <Field int[] mGapPerSpan>
	//*  28   51:aload_1         
	//*  29   52:aload_0         
	//*  30   53:getfield        #48  <Field int[] mGapPerSpan>
	//*  31   56:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
	//*  32   59:return          
			flag = false;
	//   33   60:iconst_0        
	//   34   61:istore_3        
		mHasUnwantedGapAfter = flag;
		i = parcel.readInt();
		if(i > 0)
		{
			mGapPerSpan = new int[i];
			parcel.readIntArray(mGapPerSpan);
		}
	//*  35   62:goto            30
	}
}
