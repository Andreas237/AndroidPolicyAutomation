// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

static class StaggeredGridLayoutManager$LazySpanLookup
{
	static class FullSpanItem
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

			public FullSpanItem createFromParcel(Parcel parcel)
			{
				return new FullSpanItem(parcel);
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

			public FullSpanItem[] newArray(int i)
			{
				return new FullSpanItem[i];
			//    0    0:iload_1         
			//    1    1:anewarray       FullSpanItem[]
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

		FullSpanItem()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #33  <Method void Object()>
		//    2    4:return          
		}

		FullSpanItem(Parcel parcel)
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


	private int invalidateFullSpansAfter(int i)
	{
		int j;
		int k;
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		FullSpanItem fullspanitem = getFullSpanItem(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #33  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int)>
	//    8   14:astore          4
		if(fullspanitem != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          33
			mFullSpanItems.remove(((Object) (fullspanitem)));
	//   11   21:aload_0         
	//   12   22:getfield        #29  <Field List mFullSpanItems>
	//   13   25:aload           4
	//   14   27:invokeinterface #39  <Method boolean List.remove(Object)>
	//   15   32:pop             
		k = mFullSpanItems.size();
	//   16   33:aload_0         
	//   17   34:getfield        #29  <Field List mFullSpanItems>
	//   18   37:invokeinterface #43  <Method int List.size()>
	//   19   42:istore_3        
		j = 0;
	//   20   43:iconst_0        
	//   21   44:istore_2        
_L3:
		if(j >= k)
			break MISSING_BLOCK_LABEL_116;
	//   22   45:iload_2         
	//   23   46:iload_3         
	//   24   47:icmpge          116
		if(((FullSpanItem)mFullSpanItems.get(j)).mPosition < i) goto _L2; else goto _L1
	//   25   50:aload_0         
	//   26   51:getfield        #29  <Field List mFullSpanItems>
	//   27   54:iload_2         
	//   28   55:invokeinterface #47  <Method Object List.get(int)>
	//   29   60:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   30   63:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   31   66:iload_1         
	//   32   67:icmplt          107
_L1:
		if(j != -1)
	//*  33   70:iload_2         
	//*  34   71:iconst_m1       
	//*  35   72:icmpeq          114
		{
			FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
	//   36   75:aload_0         
	//   37   76:getfield        #29  <Field List mFullSpanItems>
	//   38   79:iload_2         
	//   39   80:invokeinterface #47  <Method Object List.get(int)>
	//   40   85:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   41   88:astore          4
			mFullSpanItems.remove(j);
	//   42   90:aload_0         
	//   43   91:getfield        #29  <Field List mFullSpanItems>
	//   44   94:iload_2         
	//   45   95:invokeinterface #52  <Method Object List.remove(int)>
	//   46  100:pop             
			return fullspanitem1.mPosition;
	//   47  101:aload           4
	//   48  103:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   49  106:ireturn         
		} else
	//*  50  107:iload_2         
	//*  51  108:iconst_1        
	//*  52  109:iadd            
	//*  53  110:istore_2        
	//*  54  111:goto            45
		{
			return -1;
	//   55  114:iconst_m1       
	//   56  115:ireturn         
		}
_L2:
		j++;
		  goto _L3
		j = -1;
	//   57  116:iconst_m1       
	//   58  117:istore_2        
		  goto _L1
	//*  59  118:goto            70
	}

	private void offsetFullSpansForAddition(int i, int j)
	{
		if(mFullSpanItems != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int k = mFullSpanItems.size() - 1;
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field List mFullSpanItems>
	//    6   12:invokeinterface #43  <Method int List.size()>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:istore_3        
			while(k >= 0) 
	//*  10   20:iload_3         
	//*  11   21:iflt            7
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field List mFullSpanItems>
	//   14   28:iload_3         
	//   15   29:invokeinterface #47  <Method Object List.get(int)>
	//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   17   37:astore          4
				if(fullspanitem.mPosition >= i)
	//*  18   39:aload           4
	//*  19   41:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  20   44:iload_1         
	//*  21   45:icmpge          55
	//*  22   48:iload_3         
	//*  23   49:iconst_1        
	//*  24   50:isub            
	//*  25   51:istore_3        
	//*  26   52:goto            20
					fullspanitem.mPosition = fullspanitem.mPosition + j;
	//   27   55:aload           4
	//   28   57:aload           4
	//   29   59:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   30   62:iload_2         
	//   31   63:iadd            
	//   32   64:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
				k--;
			}
		}
	//*  33   67:goto            48
	}

	private void offsetFullSpansForRemoval(int i, int j)
	{
		if(mFullSpanItems != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int k = mFullSpanItems.size() - 1;
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field List mFullSpanItems>
	//    6   12:invokeinterface #43  <Method int List.size()>
	//    7   17:iconst_1        
	//    8   18:isub            
	//    9   19:istore_3        
			while(k >= 0) 
	//*  10   20:iload_3         
	//*  11   21:iflt            7
			{
				FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field List mFullSpanItems>
	//   14   28:iload_3         
	//   15   29:invokeinterface #47  <Method Object List.get(int)>
	//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   17   37:astore          4
				if(fullspanitem.mPosition >= i)
	//*  18   39:aload           4
	//*  19   41:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  20   44:iload_1         
	//*  21   45:icmpge          55
	//*  22   48:iload_3         
	//*  23   49:iconst_1        
	//*  24   50:isub            
	//*  25   51:istore_3        
	//*  26   52:goto            20
					if(fullspanitem.mPosition < i + j)
	//*  27   55:aload           4
	//*  28   57:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  29   60:iload_1         
	//*  30   61:iload_2         
	//*  31   62:iadd            
	//*  32   63:icmpge          80
						mFullSpanItems.remove(k);
	//   33   66:aload_0         
	//   34   67:getfield        #29  <Field List mFullSpanItems>
	//   35   70:iload_3         
	//   36   71:invokeinterface #52  <Method Object List.remove(int)>
	//   37   76:pop             
					else
	//*  38   77:goto            48
						fullspanitem.mPosition = fullspanitem.mPosition - j;
	//   39   80:aload           4
	//   40   82:aload           4
	//   41   84:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   42   87:iload_2         
	//   43   88:isub            
	//   44   89:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
				k--;
			}
		}
	//*  45   92:goto            48
	}

	public void addFullSpanItem(FullSpanItem fullspanitem)
	{
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       18
			mFullSpanItems = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #59  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #60  <Method void ArrayList()>
	//    7   15:putfield        #29  <Field List mFullSpanItems>
		int j = mFullSpanItems.size();
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field List mFullSpanItems>
	//   10   22:invokeinterface #43  <Method int List.size()>
	//   11   27:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   28:iconst_0        
	//*  13   29:istore_2        
	//*  14   30:iload_2         
	//*  15   31:iload_3         
	//*  16   32:icmpge          104
		{
			FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(i);
	//   17   35:aload_0         
	//   18   36:getfield        #29  <Field List mFullSpanItems>
	//   19   39:iload_2         
	//   20   40:invokeinterface #47  <Method Object List.get(int)>
	//   21   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   22   48:astore          4
			if(fullspanitem1.mPosition == fullspanitem.mPosition)
	//*  23   50:aload           4
	//*  24   52:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  25   55:aload_1         
	//*  26   56:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  27   59:icmpne          73
				mFullSpanItems.remove(i);
	//   28   62:aload_0         
	//   29   63:getfield        #29  <Field List mFullSpanItems>
	//   30   66:iload_2         
	//   31   67:invokeinterface #52  <Method Object List.remove(int)>
	//   32   72:pop             
			if(fullspanitem1.mPosition >= fullspanitem.mPosition)
	//*  33   73:aload           4
	//*  34   75:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  35   78:aload_1         
	//*  36   79:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  37   82:icmplt          97
			{
				mFullSpanItems.add(i, ((Object) (fullspanitem)));
	//   38   85:aload_0         
	//   39   86:getfield        #29  <Field List mFullSpanItems>
	//   40   89:iload_2         
	//   41   90:aload_1         
	//   42   91:invokeinterface #64  <Method void List.add(int, Object)>
				return;
	//   43   96:return          
			}
		}

	//   44   97:iload_2         
	//   45   98:iconst_1        
	//   46   99:iadd            
	//   47  100:istore_2        
	//*  48  101:goto            30
		mFullSpanItems.add(((Object) (fullspanitem)));
	//   49  104:aload_0         
	//   50  105:getfield        #29  <Field List mFullSpanItems>
	//   51  108:aload_1         
	//   52  109:invokeinterface #66  <Method boolean List.add(Object)>
	//   53  114:pop             
	//   54  115:return          
	}

	void clear()
	{
		if(mData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          15
			Arrays.fill(mData, -1);
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field int[] mData>
	//    5   11:iconst_m1       
	//    6   12:invokestatic    #75  <Method void Arrays.fill(int[], int)>
		mFullSpanItems = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #29  <Field List mFullSpanItems>
	//   10   20:return          
	}

	void ensureSize(int i)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnonnull       30
		{
			mData = new int[Math.max(i, 10) + 1];
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:bipush          10
	//    6   11:invokestatic    #83  <Method int Math.max(int, int)>
	//    7   14:iconst_1        
	//    8   15:iadd            
	//    9   16:newarray        int[]
	//   10   18:putfield        #69  <Field int[] mData>
			Arrays.fill(mData, -1);
	//   11   21:aload_0         
	//   12   22:getfield        #69  <Field int[] mData>
	//   13   25:iconst_m1       
	//   14   26:invokestatic    #75  <Method void Arrays.fill(int[], int)>
		} else
	//*  15   29:return          
		if(i >= mData.length)
	//*  16   30:iload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #69  <Field int[] mData>
	//*  19   35:arraylength     
	//*  20   36:icmplt          29
		{
			int ai[] = mData;
	//   21   39:aload_0         
	//   22   40:getfield        #69  <Field int[] mData>
	//   23   43:astore_2        
			mData = new int[sizeForPosition(i)];
	//   24   44:aload_0         
	//   25   45:aload_0         
	//   26   46:iload_1         
	//   27   47:invokevirtual   #86  <Method int sizeForPosition(int)>
	//   28   50:newarray        int[]
	//   29   52:putfield        #69  <Field int[] mData>
			System.arraycopy(((Object) (ai)), 0, ((Object) (mData)), 0, ai.length);
	//   30   55:aload_2         
	//   31   56:iconst_0        
	//   32   57:aload_0         
	//   33   58:getfield        #69  <Field int[] mData>
	//   34   61:iconst_0        
	//   35   62:aload_2         
	//   36   63:arraylength     
	//   37   64:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
			Arrays.fill(mData, ai.length, mData.length, -1);
	//   38   67:aload_0         
	//   39   68:getfield        #69  <Field int[] mData>
	//   40   71:aload_2         
	//   41   72:arraylength     
	//   42   73:aload_0         
	//   43   74:getfield        #69  <Field int[] mData>
	//   44   77:arraylength     
	//   45   78:iconst_m1       
	//   46   79:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			return;
	//   47   82:return          
		}
	}

	int forceInvalidateAfter(int i)
	{
		if(mFullSpanItems != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnull          61
		{
			for(int j = mFullSpanItems.size() - 1; j >= 0; j--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field List mFullSpanItems>
	//*   5   11:invokeinterface #43  <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:iflt            61
				if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
	//*  11   23:aload_0         
	//*  12   24:getfield        #29  <Field List mFullSpanItems>
	//*  13   27:iload_2         
	//*  14   28:invokeinterface #47  <Method Object List.get(int)>
	//*  15   33:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//*  16   36:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  17   39:iload_1         
	//*  18   40:icmplt          54
					mFullSpanItems.remove(j);
	//   19   43:aload_0         
	//   20   44:getfield        #29  <Field List mFullSpanItems>
	//   21   47:iload_2         
	//   22   48:invokeinterface #52  <Method Object List.remove(int)>
	//   23   53:pop             

	//   24   54:iload_2         
	//   25   55:iconst_1        
	//   26   56:isub            
	//   27   57:istore_2        
		}
	//*  28   58:goto            19
		return invalidateAfter(i);
	//   29   61:aload_0         
	//   30   62:iload_1         
	//   31   63:invokevirtual   #99  <Method int invalidateAfter(int)>
	//   32   66:ireturn         
	}

	public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
	{
		if(mFullSpanItems != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List mFullSpanItems>
	//    2    4:ifnonnull       13
_L1:
		FullSpanItem fullspanitem = null;
	//    3    7:aconst_null     
	//    4    8:astore          7
_L6:
		return fullspanitem;
	//    5   10:aload           7
	//    6   12:areturn         
_L2:
		int l;
		int i1;
		i1 = mFullSpanItems.size();
	//    7   13:aload_0         
	//    8   14:getfield        #29  <Field List mFullSpanItems>
	//    9   17:invokeinterface #43  <Method int List.size()>
	//   10   22:istore          6
		l = 0;
	//   11   24:iconst_0        
	//   12   25:istore          5
_L9:
		if(l >= i1) goto _L4; else goto _L3
	//   13   27:iload           5
	//   14   29:iload           6
	//   15   31:icmpge          117
_L3:
		FullSpanItem fullspanitem1;
		fullspanitem1 = (FullSpanItem)mFullSpanItems.get(l);
	//   16   34:aload_0         
	//   17   35:getfield        #29  <Field List mFullSpanItems>
	//   18   38:iload           5
	//   19   40:invokeinterface #47  <Method Object List.get(int)>
	//   20   45:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   21   48:astore          8
		if(fullspanitem1.mPosition >= j)
	//*  22   50:aload           8
	//*  23   52:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  24   55:iload_2         
	//*  25   56:icmplt          61
			return null;
	//   26   59:aconst_null     
	//   27   60:areturn         
		if(fullspanitem1.mPosition < i)
			continue; /* Loop/switch isn't completed */
	//   28   61:aload           8
	//   29   63:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   30   66:iload_1         
	//   31   67:icmplt          108
		fullspanitem = fullspanitem1;
	//   32   70:aload           8
	//   33   72:astore          7
		if(k == 0) goto _L6; else goto _L5
	//   34   74:iload_3         
	//   35   75:ifeq            10
_L5:
		fullspanitem = fullspanitem1;
	//   36   78:aload           8
	//   37   80:astore          7
		if(fullspanitem1.mGapDir == k) goto _L6; else goto _L7
	//   38   82:aload           8
	//   39   84:getfield        #104 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//   40   87:iload_3         
	//   41   88:icmpeq          10
_L7:
		if(!flag)
			continue; /* Loop/switch isn't completed */
	//   42   91:iload           4
	//   43   93:ifeq            108
		fullspanitem = fullspanitem1;
	//   44   96:aload           8
	//   45   98:astore          7
		if(fullspanitem1.mHasUnwantedGapAfter) goto _L6; else goto _L8
	//   46  100:aload           8
	//   47  102:getfield        #108 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
	//   48  105:ifne            10
_L8:
		l++;
	//   49  108:iload           5
	//   50  110:iconst_1        
	//   51  111:iadd            
	//   52  112:istore          5
		  goto _L9
	//*  53  114:goto            27
_L4:
		return null;
	//   54  117:aconst_null     
	//   55  118:areturn         
	}

	public FullSpanItem getFullSpanItem(int i)
	{
		if(mFullSpanItems != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List mFullSpanItems>
	//    2    4:ifnonnull       11
_L1:
		FullSpanItem fullspanitem = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
_L4:
		return fullspanitem;
	//    5    9:aload_3         
	//    6   10:areturn         
_L2:
		int j = mFullSpanItems.size() - 1;
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field List mFullSpanItems>
	//    9   15:invokeinterface #43  <Method int List.size()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:istore_2        
label0:
		do
		{
label1:
			{
				if(j < 0)
					break label1;
	//   13   23:iload_2         
	//   14   24:iflt            61
				FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
	//   15   27:aload_0         
	//   16   28:getfield        #29  <Field List mFullSpanItems>
	//   17   31:iload_2         
	//   18   32:invokeinterface #47  <Method Object List.get(int)>
	//   19   37:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   20   40:astore          4
				fullspanitem = fullspanitem1;
	//   21   42:aload           4
	//   22   44:astore_3        
				if(fullspanitem1.mPosition == i)
					break label0;
	//   23   45:aload           4
	//   24   47:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   25   50:iload_1         
	//   26   51:icmpeq          9
				j--;
	//   27   54:iload_2         
	//   28   55:iconst_1        
	//   29   56:isub            
	//   30   57:istore_2        
			}
		} while(true);
	//   31   58:goto            23
		if(true) goto _L4; else goto _L3
_L3:
		return null;
	//   32   61:aconst_null     
	//   33   62:areturn         
	}

	int getSpan(int i)
	{
		if(mData == null || i >= mData.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          16
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field int[] mData>
	//*   6   12:arraylength     
	//*   7   13:icmplt          18
			return -1;
	//    8   16:iconst_m1       
	//    9   17:ireturn         
		else
			return mData[i];
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field int[] mData>
	//   12   22:iload_1         
	//   13   23:iaload          
	//   14   24:ireturn         
	}

	int invalidateAfter(int i)
	{
		while(mData == null || i >= mData.length) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #69  <Field int[] mData>
	//    8   14:arraylength     
	//    9   15:icmpge          7
		int j = invalidateFullSpansAfter(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokespecial   #111 <Method int invalidateFullSpansAfter(int)>
	//   13   23:istore_2        
		if(j == -1)
	//*  14   24:iload_2         
	//*  15   25:iconst_m1       
	//*  16   26:icmpne          49
		{
			Arrays.fill(mData, i, mData.length, -1);
	//   17   29:aload_0         
	//   18   30:getfield        #69  <Field int[] mData>
	//   19   33:iload_1         
	//   20   34:aload_0         
	//   21   35:getfield        #69  <Field int[] mData>
	//   22   38:arraylength     
	//   23   39:iconst_m1       
	//   24   40:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			return mData.length;
	//   25   43:aload_0         
	//   26   44:getfield        #69  <Field int[] mData>
	//   27   47:arraylength     
	//   28   48:ireturn         
		} else
		{
			Arrays.fill(mData, i, j + 1, -1);
	//   29   49:aload_0         
	//   30   50:getfield        #69  <Field int[] mData>
	//   31   53:iload_1         
	//   32   54:iload_2         
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:iconst_m1       
	//   36   58:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			return j + 1;
	//   37   61:iload_2         
	//   38   62:iconst_1        
	//   39   63:iadd            
	//   40   64:ireturn         
		}
	}

	void offsetForAddition(int i, int j)
	{
		if(mData == null || i >= mData.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          16
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field int[] mData>
	//*   6   12:arraylength     
	//*   7   13:icmplt          17
		{
			return;
	//    8   16:return          
		} else
		{
			ensureSize(i + j);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:iadd            
	//   13   21:invokevirtual   #114 <Method void ensureSize(int)>
			System.arraycopy(((Object) (mData)), i, ((Object) (mData)), i + j, mData.length - i - j);
	//   14   24:aload_0         
	//   15   25:getfield        #69  <Field int[] mData>
	//   16   28:iload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #69  <Field int[] mData>
	//   19   33:iload_1         
	//   20   34:iload_2         
	//   21   35:iadd            
	//   22   36:aload_0         
	//   23   37:getfield        #69  <Field int[] mData>
	//   24   40:arraylength     
	//   25   41:iload_1         
	//   26   42:isub            
	//   27   43:iload_2         
	//   28   44:isub            
	//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
			Arrays.fill(mData, i, i + j, -1);
	//   30   48:aload_0         
	//   31   49:getfield        #69  <Field int[] mData>
	//   32   52:iload_1         
	//   33   53:iload_1         
	//   34   54:iload_2         
	//   35   55:iadd            
	//   36   56:iconst_m1       
	//   37   57:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			offsetFullSpansForAddition(i, j);
	//   38   60:aload_0         
	//   39   61:iload_1         
	//   40   62:iload_2         
	//   41   63:invokespecial   #116 <Method void offsetFullSpansForAddition(int, int)>
			return;
	//   42   66:return          
		}
	}

	void offsetForRemoval(int i, int j)
	{
		if(mData == null || i >= mData.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          16
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field int[] mData>
	//*   6   12:arraylength     
	//*   7   13:icmplt          17
		{
			return;
	//    8   16:return          
		} else
		{
			ensureSize(i + j);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:iload_2         
	//   12   20:iadd            
	//   13   21:invokevirtual   #114 <Method void ensureSize(int)>
			System.arraycopy(((Object) (mData)), i + j, ((Object) (mData)), i, mData.length - i - j);
	//   14   24:aload_0         
	//   15   25:getfield        #69  <Field int[] mData>
	//   16   28:iload_1         
	//   17   29:iload_2         
	//   18   30:iadd            
	//   19   31:aload_0         
	//   20   32:getfield        #69  <Field int[] mData>
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:getfield        #69  <Field int[] mData>
	//   24   40:arraylength     
	//   25   41:iload_1         
	//   26   42:isub            
	//   27   43:iload_2         
	//   28   44:isub            
	//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
			Arrays.fill(mData, mData.length - j, mData.length, -1);
	//   30   48:aload_0         
	//   31   49:getfield        #69  <Field int[] mData>
	//   32   52:aload_0         
	//   33   53:getfield        #69  <Field int[] mData>
	//   34   56:arraylength     
	//   35   57:iload_2         
	//   36   58:isub            
	//   37   59:aload_0         
	//   38   60:getfield        #69  <Field int[] mData>
	//   39   63:arraylength     
	//   40   64:iconst_m1       
	//   41   65:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			offsetFullSpansForRemoval(i, j);
	//   42   68:aload_0         
	//   43   69:iload_1         
	//   44   70:iload_2         
	//   45   71:invokespecial   #119 <Method void offsetFullSpansForRemoval(int, int)>
			return;
	//   46   74:return          
		}
	}

	void setSpan(int i, StaggeredGridLayoutManager.Span span)
	{
		ensureSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #114 <Method void ensureSize(int)>
		mData[i] = span.mIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field int[] mData>
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:getfield        #126 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//    8   14:iastore         
	//    9   15:return          
	}

	int sizeForPosition(int i)
	{
		int j;
		for(j = mData.length; j <= i; j *= 2);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int[] mData>
	//    2    4:arraylength     
	//    3    5:istore_2        
	//    4    6:iload_2         
	//    5    7:iload_1         
	//    6    8:icmpgt          18
	//    7   11:iload_2         
	//    8   12:iconst_2        
	//    9   13:imul            
	//   10   14:istore_2        
	//*  11   15:goto            6
		return j;
	//   12   18:iload_2         
	//   13   19:ireturn         
	}

	private static final int MIN_SIZE = 10;
	int mData[];
	List mFullSpanItems;

	StaggeredGridLayoutManager$LazySpanLookup()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}
}
