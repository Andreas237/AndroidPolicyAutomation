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
	//*  10   20:ifeq            28
			i = 1;
	//   11   23:iconst_1        
	//   12   24:istore_2        
		else
	//*  13   25:goto            30
			i = 0;
	//   14   28:iconst_0        
	//   15   29:istore_2        
		parcel.writeInt(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #94  <Method void Parcel.writeInt(int)>
		if(mGapPerSpan != null && mGapPerSpan.length > 0)
	//*  19   35:aload_0         
	//*  20   36:getfield        #48  <Field int[] mGapPerSpan>
	//*  21   39:ifnull          68
	//*  22   42:aload_0         
	//*  23   43:getfield        #48  <Field int[] mGapPerSpan>
	//*  24   46:arraylength     
	//*  25   47:ifle            68
		{
			parcel.writeInt(mGapPerSpan.length);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #48  <Field int[] mGapPerSpan>
	//   29   55:arraylength     
	//   30   56:invokevirtual   #94  <Method void Parcel.writeInt(int)>
			parcel.writeIntArray(mGapPerSpan);
	//   31   59:aload_1         
	//   32   60:aload_0         
	//   33   61:getfield        #48  <Field int[] mGapPerSpan>
	//   34   64:invokevirtual   #97  <Method void Parcel.writeIntArray(int[])>
			return;
	//   35   67:return          
		} else
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
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		mPosition = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method int Parcel.readInt()>
	//    5    9:putfield        #42  <Field int mPosition>
		mGapDir = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #40  <Method int Parcel.readInt()>
	//    9   17:putfield        #44  <Field int mGapDir>
		boolean flag;
		if(parcel.readInt() == 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #40  <Method int Parcel.readInt()>
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_3        
		else
	//*  16   30:goto            35
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
		mHasUnwantedGapAfter = flag;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #46  <Field boolean mHasUnwantedGapAfter>
		int i = parcel.readInt();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #40  <Method int Parcel.readInt()>
	//   24   44:istore_2        
		if(i > 0)
	//*  25   45:iload_2         
	//*  26   46:ifle            64
		{
			mGapPerSpan = new int[i];
	//   27   49:aload_0         
	//   28   50:iload_2         
	//   29   51:newarray        int[]
	//   30   53:putfield        #48  <Field int[] mGapPerSpan>
			parcel.readIntArray(mGapPerSpan);
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:getfield        #48  <Field int[] mGapPerSpan>
	//   34   61:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
		}
	//   35   64:return          
	}
}
