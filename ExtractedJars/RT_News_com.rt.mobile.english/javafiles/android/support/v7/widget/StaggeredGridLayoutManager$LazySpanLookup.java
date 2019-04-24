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
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #59  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #60  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("FullSpanItem{mPosition=");
		//    4    8:aload_1         
		//    5    9:ldc1            #62  <String "FullSpanItem{mPosition=">
		//    6   11:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(mPosition);
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:getfield        #42  <Field int mPosition>
		//   11   20:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   12   23:pop             
			stringbuilder.append(", mGapDir=");
		//   13   24:aload_1         
		//   14   25:ldc1            #71  <String ", mGapDir=">
		//   15   27:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   16   30:pop             
			stringbuilder.append(mGapDir);
		//   17   31:aload_1         
		//   18   32:aload_0         
		//   19   33:getfield        #44  <Field int mGapDir>
		//   20   36:invokevirtual   #69  <Method StringBuilder StringBuilder.append(int)>
		//   21   39:pop             
			stringbuilder.append(", mHasUnwantedGapAfter=");
		//   22   40:aload_1         
		//   23   41:ldc1            #73  <String ", mHasUnwantedGapAfter=">
		//   24   43:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   25   46:pop             
			stringbuilder.append(mHasUnwantedGapAfter);
		//   26   47:aload_1         
		//   27   48:aload_0         
		//   28   49:getfield        #46  <Field boolean mHasUnwantedGapAfter>
		//   29   52:invokevirtual   #76  <Method StringBuilder StringBuilder.append(boolean)>
		//   30   55:pop             
			stringbuilder.append(", mGapPerSpan=");
		//   31   56:aload_1         
		//   32   57:ldc1            #78  <String ", mGapPerSpan=">
		//   33   59:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   34   62:pop             
			stringbuilder.append(Arrays.toString(mGapPerSpan));
		//   35   63:aload_1         
		//   36   64:aload_0         
		//   37   65:getfield        #48  <Field int[] mGapPerSpan>
		//   38   68:invokestatic    #83  <Method String Arrays.toString(int[])>
		//   39   71:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
		//   40   74:pop             
			stringbuilder.append('}');
		//   41   75:aload_1         
		//   42   76:bipush          125
		//   43   78:invokevirtual   #86  <Method StringBuilder StringBuilder.append(char)>
		//   44   81:pop             
			return stringbuilder.toString();
		//   45   82:aload_1         
		//   46   83:invokevirtual   #88  <Method String StringBuilder.toString()>
		//   47   86:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #92  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #94  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #99  <Method void Runtime(String)>
		//    4    9:athrow          
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
			int i = parcel.readInt();
		//   10   20:aload_1         
		//   11   21:invokevirtual   #40  <Method int Parcel.readInt()>
		//   12   24:istore_2        
			boolean flag = true;
		//   13   25:iconst_1        
		//   14   26:istore_3        
			if(i != 1)
		//*  15   27:iload_2         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          35
		//*  18   32:goto            37
				flag = false;
		//   19   35:iconst_0        
		//   20   36:istore_3        
			mHasUnwantedGapAfter = flag;
		//   21   37:aload_0         
		//   22   38:iload_3         
		//   23   39:putfield        #46  <Field boolean mHasUnwantedGapAfter>
			i = parcel.readInt();
		//   24   42:aload_1         
		//   25   43:invokevirtual   #40  <Method int Parcel.readInt()>
		//   26   46:istore_2        
			if(i > 0)
		//*  27   47:iload_2         
		//*  28   48:ifle            66
			{
				mGapPerSpan = new int[i];
		//   29   51:aload_0         
		//   30   52:iload_2         
		//   31   53:newarray        int[]
		//   32   55:putfield        #48  <Field int[] mGapPerSpan>
				parcel.readIntArray(mGapPerSpan);
		//   33   58:aload_1         
		//   34   59:aload_0         
		//   35   60:getfield        #48  <Field int[] mGapPerSpan>
		//   36   63:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
			}
		//   37   66:return          
		}
	}


	private int invalidateFullSpansAfter(int i)
	{
		int j;
label0:
		{
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
			int k = mFullSpanItems.size();
	//   16   33:aload_0         
	//   17   34:getfield        #29  <Field List mFullSpanItems>
	//   18   37:invokeinterface #43  <Method int List.size()>
	//   19   42:istore_3        
			for(j = 0; j < k; j++)
	//*  20   43:iconst_0        
	//*  21   44:istore_2        
	//*  22   45:iload_2         
	//*  23   46:iload_3         
	//*  24   47:icmpge          80
				if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
	//*  25   50:aload_0         
	//*  26   51:getfield        #29  <Field List mFullSpanItems>
	//*  27   54:iload_2         
	//*  28   55:invokeinterface #47  <Method Object List.get(int)>
	//*  29   60:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//*  30   63:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  31   66:iload_1         
	//*  32   67:icmplt          73
					break label0;
	//   33   70:goto            82

	//   34   73:iload_2         
	//   35   74:iconst_1        
	//   36   75:iadd            
	//   37   76:istore_2        
	//*  38   77:goto            45
			j = -1;
	//   39   80:iconst_m1       
	//   40   81:istore_2        
		}
		if(j != -1)
	//*  41   82:iload_2         
	//*  42   83:iconst_m1       
	//*  43   84:icmpeq          119
		{
			FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
	//   44   87:aload_0         
	//   45   88:getfield        #29  <Field List mFullSpanItems>
	//   46   91:iload_2         
	//   47   92:invokeinterface #47  <Method Object List.get(int)>
	//   48   97:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   49  100:astore          4
			mFullSpanItems.remove(j);
	//   50  102:aload_0         
	//   51  103:getfield        #29  <Field List mFullSpanItems>
	//   52  106:iload_2         
	//   53  107:invokeinterface #52  <Method Object List.remove(int)>
	//   54  112:pop             
			return fullspanitem1.mPosition;
	//   55  113:aload           4
	//   56  115:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   57  118:ireturn         
		} else
		{
			return -1;
	//   58  119:iconst_m1       
	//   59  120:ireturn         
		}
	}

	private void offsetFullSpansForAddition(int i, int j)
	{
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int k = mFullSpanItems.size() - 1; k >= 0; k--)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field List mFullSpanItems>
	//*   6   12:invokeinterface #43  <Method int List.size()>
	//*   7   17:iconst_1        
	//*   8   18:isub            
	//*   9   19:istore_3        
	//*  10   20:iload_3         
	//*  11   21:iflt            70
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
	//*  21   45:icmpge          51
	//*  22   48:goto            63
				fullspanitem.mPosition = fullspanitem.mPosition + j;
	//   23   51:aload           4
	//   24   53:aload           4
	//   25   55:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   26   58:iload_2         
	//   27   59:iadd            
	//   28   60:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		}

	//   29   63:iload_3         
	//   30   64:iconst_1        
	//   31   65:isub            
	//   32   66:istore_3        
	//*  33   67:goto            20
	//   34   70:return          
	}

	private void offsetFullSpansForRemoval(int i, int j)
	{
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		for(int k = mFullSpanItems.size() - 1; k >= 0; k--)
	//*   4    8:aload_0         
	//*   5    9:getfield        #29  <Field List mFullSpanItems>
	//*   6   12:invokeinterface #43  <Method int List.size()>
	//*   7   17:iconst_1        
	//*   8   18:isub            
	//*   9   19:istore_3        
	//*  10   20:iload_3         
	//*  11   21:iflt            95
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field List mFullSpanItems>
	//   14   28:iload_3         
	//   15   29:invokeinterface #47  <Method Object List.get(int)>
	//   16   34:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   17   37:astore          4
			if(fullspanitem.mPosition < i)
	//*  18   39:aload           4
	//*  19   41:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  20   44:iload_1         
	//*  21   45:icmpge          51
				continue;
	//   22   48:goto            88
			if(fullspanitem.mPosition < i + j)
	//*  23   51:aload           4
	//*  24   53:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  25   56:iload_1         
	//*  26   57:iload_2         
	//*  27   58:iadd            
	//*  28   59:icmpge          76
				mFullSpanItems.remove(k);
	//   29   62:aload_0         
	//   30   63:getfield        #29  <Field List mFullSpanItems>
	//   31   66:iload_3         
	//   32   67:invokeinterface #52  <Method Object List.remove(int)>
	//   33   72:pop             
			else
	//*  34   73:goto            88
				fullspanitem.mPosition = fullspanitem.mPosition - j;
	//   35   76:aload           4
	//   36   78:aload           4
	//   37   80:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   38   83:iload_2         
	//   39   84:isub            
	//   40   85:putfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		}

	//   41   88:iload_3         
	//   42   89:iconst_1        
	//   43   90:isub            
	//   44   91:istore_3        
	//*  45   92:goto            20
	//   46   95:return          
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
			return;
	//   15   29:return          
		}
		if(i >= mData.length)
	//*  16   30:iload_1         
	//*  17   31:aload_0         
	//*  18   32:getfield        #69  <Field int[] mData>
	//*  19   35:arraylength     
	//*  20   36:icmplt          82
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
		}
	//   47   82:return          
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
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		int i1 = mFullSpanItems.size();
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field List mFullSpanItems>
	//    7   13:invokeinterface #43  <Method int List.size()>
	//    8   18:istore          6
		for(int l = 0; l < i1; l++)
	//*   9   20:iconst_0        
	//*  10   21:istore          5
	//*  11   23:iload           5
	//*  12   25:iload           6
	//*  13   27:icmpge          104
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(l);
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field List mFullSpanItems>
	//   16   34:iload           5
	//   17   36:invokeinterface #47  <Method Object List.get(int)>
	//   18   41:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   19   44:astore          7
			if(fullspanitem.mPosition >= j)
	//*  20   46:aload           7
	//*  21   48:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  22   51:iload_2         
	//*  23   52:icmplt          57
				return null;
	//   24   55:aconst_null     
	//   25   56:areturn         
			if(fullspanitem.mPosition >= i && (k == 0 || fullspanitem.mGapDir == k || flag && fullspanitem.mHasUnwantedGapAfter))
	//*  26   57:aload           7
	//*  27   59:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  28   62:iload_1         
	//*  29   63:icmplt          95
	//*  30   66:iload_3         
	//*  31   67:ifeq            92
	//*  32   70:aload           7
	//*  33   72:getfield        #104 <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  34   75:iload_3         
	//*  35   76:icmpeq          92
	//*  36   79:iload           4
	//*  37   81:ifeq            95
	//*  38   84:aload           7
	//*  39   86:getfield        #108 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
	//*  40   89:ifeq            95
				return fullspanitem;
	//   41   92:aload           7
	//   42   94:areturn         
		}

	//   43   95:iload           5
	//   44   97:iconst_1        
	//   45   98:iadd            
	//   46   99:istore          5
	//*  47  101:goto            23
		return null;
	//   48  104:aconst_null     
	//   49  105:areturn         
	}

	public FullSpanItem getFullSpanItem(int i)
	{
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		for(int j = mFullSpanItems.size() - 1; j >= 0; j--)
	//*   5    9:aload_0         
	//*   6   10:getfield        #29  <Field List mFullSpanItems>
	//*   7   13:invokeinterface #43  <Method int List.size()>
	//*   8   18:iconst_1        
	//*   9   19:isub            
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:iflt            56
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(j);
	//   13   25:aload_0         
	//   14   26:getfield        #29  <Field List mFullSpanItems>
	//   15   29:iload_2         
	//   16   30:invokeinterface #47  <Method Object List.get(int)>
	//   17   35:checkcast       #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   18   38:astore_3        
			if(fullspanitem.mPosition == i)
	//*  19   39:aload_3         
	//*  20   40:getfield        #50  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  21   43:iload_1         
	//*  22   44:icmpne          49
				return fullspanitem;
	//   23   47:aload_3         
	//   24   48:areturn         
		}

	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:isub            
	//   28   52:istore_2        
	//*  29   53:goto            21
		return null;
	//   30   56:aconst_null     
	//   31   57:areturn         
	}

	int getSpan(int i)
	{
		if(mData != null && i < mData.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          26
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #69  <Field int[] mData>
	//*   6   12:arraylength     
	//*   7   13:icmplt          19
	//*   8   16:goto            26
			return mData[i];
	//    9   19:aload_0         
	//   10   20:getfield        #69  <Field int[] mData>
	//   11   23:iload_1         
	//   12   24:iaload          
	//   13   25:ireturn         
		else
			return -1;
	//   14   26:iconst_m1       
	//   15   27:ireturn         
	}

	int invalidateAfter(int i)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		if(i >= mData.length)
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #69  <Field int[] mData>
	//*   8   14:arraylength     
	//*   9   15:icmplt          20
			return -1;
	//   10   18:iconst_m1       
	//   11   19:ireturn         
		int j = invalidateFullSpansAfter(i);
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:invokespecial   #111 <Method int invalidateFullSpansAfter(int)>
	//   15   25:istore_2        
		if(j == -1)
	//*  16   26:iload_2         
	//*  17   27:iconst_m1       
	//*  18   28:icmpne          51
		{
			Arrays.fill(mData, i, mData.length, -1);
	//   19   31:aload_0         
	//   20   32:getfield        #69  <Field int[] mData>
	//   21   35:iload_1         
	//   22   36:aload_0         
	//   23   37:getfield        #69  <Field int[] mData>
	//   24   40:arraylength     
	//   25   41:iconst_m1       
	//   26   42:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			return mData.length;
	//   27   45:aload_0         
	//   28   46:getfield        #69  <Field int[] mData>
	//   29   49:arraylength     
	//   30   50:ireturn         
		} else
		{
			int ai[] = mData;
	//   31   51:aload_0         
	//   32   52:getfield        #69  <Field int[] mData>
	//   33   55:astore_3        
			j++;
	//   34   56:iload_2         
	//   35   57:iconst_1        
	//   36   58:iadd            
	//   37   59:istore_2        
			Arrays.fill(ai, i, j, -1);
	//   38   60:aload_3         
	//   39   61:iload_1         
	//   40   62:iload_2         
	//   41   63:iconst_m1       
	//   42   64:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
			return j;
	//   43   67:iload_2         
	//   44   68:ireturn         
		}
	}

	void offsetForAddition(int i, int j)
	{
		if(mData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          65
		{
			if(i >= mData.length)
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
				int k = i + j;
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:istore_3        
				ensureSize(k);
	//   13   21:aload_0         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #114 <Method void ensureSize(int)>
				System.arraycopy(((Object) (mData)), i, ((Object) (mData)), k, mData.length - i - j);
	//   16   26:aload_0         
	//   17   27:getfield        #69  <Field int[] mData>
	//   18   30:iload_1         
	//   19   31:aload_0         
	//   20   32:getfield        #69  <Field int[] mData>
	//   21   35:iload_3         
	//   22   36:aload_0         
	//   23   37:getfield        #69  <Field int[] mData>
	//   24   40:arraylength     
	//   25   41:iload_1         
	//   26   42:isub            
	//   27   43:iload_2         
	//   28   44:isub            
	//   29   45:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(mData, i, k, -1);
	//   30   48:aload_0         
	//   31   49:getfield        #69  <Field int[] mData>
	//   32   52:iload_1         
	//   33   53:iload_3         
	//   34   54:iconst_m1       
	//   35   55:invokestatic    #95  <Method void Arrays.fill(int[], int, int, int)>
				offsetFullSpansForAddition(i, j);
	//   36   58:aload_0         
	//   37   59:iload_1         
	//   38   60:iload_2         
	//   39   61:invokespecial   #116 <Method void offsetFullSpansForAddition(int, int)>
				return;
	//   40   64:return          
			}
		} else
		{
			return;
	//   41   65:return          
		}
	}

	void offsetForRemoval(int i, int j)
	{
		if(mData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int[] mData>
	//*   2    4:ifnull          75
		{
			if(i >= mData.length)
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
				int k = i + j;
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:iadd            
	//   12   20:istore_3        
				ensureSize(k);
	//   13   21:aload_0         
	//   14   22:iload_3         
	//   15   23:invokevirtual   #114 <Method void ensureSize(int)>
				System.arraycopy(((Object) (mData)), k, ((Object) (mData)), i, mData.length - i - j);
	//   16   26:aload_0         
	//   17   27:getfield        #69  <Field int[] mData>
	//   18   30:iload_3         
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
		} else
		{
			return;
	//   47   75:return          
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
