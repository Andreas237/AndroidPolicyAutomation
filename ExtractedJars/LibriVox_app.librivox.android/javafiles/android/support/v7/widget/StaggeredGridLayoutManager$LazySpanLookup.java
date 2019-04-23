// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.*;

class StaggeredGridLayoutManager$LazySpanLookup
{

	private int invalidateFullSpansAfter(int i)
	{
		class FullSpanItem
			implements Parcelable
		{

			public int describeContents()
			{
				return 0;
			//    0    0:iconst_0        
			//    1    1:ireturn         
			}

			int getGapForSpan(int l)
			{
				int ai[] = mGapPerSpan;
			//    0    0:aload_0         
			//    1    1:getfield        #41  <Field int[] mGapPerSpan>
			//    2    4:astore_2        
				if(ai == null)
			//*   3    5:aload_2         
			//*   4    6:ifnonnull       11
					return 0;
			//    5    9:iconst_0        
			//    6   10:ireturn         
				else
					return ai[l];
			//    7   11:aload_2         
			//    8   12:iload_1         
			//    9   13:iaload          
			//   10   14:ireturn         
			}

			public String toString()
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #52  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #53  <Method void StringBuilder()>
			//    3    7:astore_1        
				stringbuilder.append("FullSpanItem{mPosition=");
			//    4    8:aload_1         
			//    5    9:ldc1            #55  <String "FullSpanItem{mPosition=">
			//    6   11:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(mPosition);
			//    8   15:aload_1         
			//    9   16:aload_0         
			//   10   17:getfield        #35  <Field int mPosition>
			//   11   20:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
			//   12   23:pop             
				stringbuilder.append(", mGapDir=");
			//   13   24:aload_1         
			//   14   25:ldc1            #64  <String ", mGapDir=">
			//   15   27:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   16   30:pop             
				stringbuilder.append(mGapDir);
			//   17   31:aload_1         
			//   18   32:aload_0         
			//   19   33:getfield        #37  <Field int mGapDir>
			//   20   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
			//   21   39:pop             
				stringbuilder.append(", mHasUnwantedGapAfter=");
			//   22   40:aload_1         
			//   23   41:ldc1            #66  <String ", mHasUnwantedGapAfter=">
			//   24   43:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   25   46:pop             
				stringbuilder.append(mHasUnwantedGapAfter);
			//   26   47:aload_1         
			//   27   48:aload_0         
			//   28   49:getfield        #39  <Field boolean mHasUnwantedGapAfter>
			//   29   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(boolean)>
			//   30   55:pop             
				stringbuilder.append(", mGapPerSpan=");
			//   31   56:aload_1         
			//   32   57:ldc1            #71  <String ", mGapPerSpan=">
			//   33   59:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   34   62:pop             
				stringbuilder.append(Arrays.toString(mGapPerSpan));
			//   35   63:aload_1         
			//   36   64:aload_0         
			//   37   65:getfield        #41  <Field int[] mGapPerSpan>
			//   38   68:invokestatic    #76  <Method String Arrays.toString(int[])>
			//   39   71:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   40   74:pop             
				stringbuilder.append('}');
			//   41   75:aload_1         
			//   42   76:bipush          125
			//   43   78:invokevirtual   #79  <Method StringBuilder StringBuilder.append(char)>
			//   44   81:pop             
				return stringbuilder.toString();
			//   45   82:aload_1         
			//   46   83:invokevirtual   #81  <Method String StringBuilder.toString()>
			//   47   86:areturn         
			}

			public void writeToParcel(Parcel parcel, int l)
			{
				throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
			//    0    0:new             #85  <Class RuntimeException>
			//    1    3:dup             
			//    2    4:ldc1            #87  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
			//    3    6:invokespecial   #92  <Method void Runtime(String)>
			//    4    9:athrow          
			}

			public static final android.os.Parcelable.Creator CREATOR = new _cls1();
			int mGapDir;
			int mGapPerSpan[];
			boolean mHasUnwantedGapAfter;
			int mPosition;

			static 
			{
				class _cls1
					implements android.os.Parcelable.Creator
				{

					public FullSpanItem createFromParcel(Parcel parcel)
					{
						return new FullSpanItem(parcel);
					//    0    0:new             #15  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
					//    1    3:dup             
					//    2    4:aload_1         
					//    3    5:invokespecial   #18  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
					//    4    8:areturn         
					}

					public volatile Object createFromParcel(Parcel parcel)
					{
						return ((Object) (createFromParcel(parcel)));
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:invokevirtual   #21  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel)>
					//    3    5:areturn         
					}

					public FullSpanItem[] newArray(int l)
					{
						return new FullSpanItem[l];
					//    0    0:iload_1         
					//    1    1:anewarray       FullSpanItem[]
					//    2    4:areturn         
					}

					public volatile Object[] newArray(int l)
					{
						return ((Object []) (newArray(l)));
					//    0    0:aload_0         
					//    1    1:iload_1         
					//    2    2:invokevirtual   #26  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int)>
					//    3    5:areturn         
					}

						_cls1()
						{
						//    0    0:aload_0         
						//    1    1:invokespecial   #10  <Method void Object()>
						//    2    4:return          
						}
				}

			//    0    0:new             #19  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1>
			//    1    3:dup             
			//    2    4:invokespecial   #22  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1()>
			//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
			//*   4   10:return          
			}

			FullSpanItem()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #26  <Method void Object()>
			//    2    4:return          
			}

			FullSpanItem(Parcel parcel)
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #26  <Method void Object()>
				mPosition = parcel.readInt();
			//    2    4:aload_0         
			//    3    5:aload_1         
			//    4    6:invokevirtual   #33  <Method int Parcel.readInt()>
			//    5    9:putfield        #35  <Field int mPosition>
				mGapDir = parcel.readInt();
			//    6   12:aload_0         
			//    7   13:aload_1         
			//    8   14:invokevirtual   #33  <Method int Parcel.readInt()>
			//    9   17:putfield        #37  <Field int mGapDir>
				int i = parcel.readInt();
			//   10   20:aload_1         
			//   11   21:invokevirtual   #33  <Method int Parcel.readInt()>
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
			//   23   39:putfield        #39  <Field boolean mHasUnwantedGapAfter>
				i = parcel.readInt();
			//   24   42:aload_1         
			//   25   43:invokevirtual   #33  <Method int Parcel.readInt()>
			//   26   46:istore_2        
				if(i > 0)
			//*  27   47:iload_2         
			//*  28   48:ifle            66
				{
					mGapPerSpan = new int[i];
			//   29   51:aload_0         
			//   30   52:iload_2         
			//   31   53:newarray        int[]
			//   32   55:putfield        #41  <Field int[] mGapPerSpan>
					parcel.readIntArray(mGapPerSpan);
			//   33   58:aload_1         
			//   34   59:aload_0         
			//   35   60:getfield        #41  <Field int[] mGapPerSpan>
			//   36   63:invokevirtual   #45  <Method void Parcel.readIntArray(int[])>
				}
			//   37   66:return          
			}
		}

		int j;
label0:
		{
			if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       9
				return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
			FullSpanItem fullspanitem = getFullSpanItem(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #24  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem getFullSpanItem(int)>
	//    8   14:astore          4
			if(fullspanitem != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          33
				mFullSpanItems.remove(((Object) (fullspanitem)));
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field List mFullSpanItems>
	//   13   25:aload           4
	//   14   27:invokeinterface #30  <Method boolean List.remove(Object)>
	//   15   32:pop             
			int k = mFullSpanItems.size();
	//   16   33:aload_0         
	//   17   34:getfield        #20  <Field List mFullSpanItems>
	//   18   37:invokeinterface #34  <Method int List.size()>
	//   19   42:istore_3        
			for(j = 0; j < k; j++)
	//*  20   43:iconst_0        
	//*  21   44:istore_2        
	//*  22   45:iload_2         
	//*  23   46:iload_3         
	//*  24   47:icmpge          80
				if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
	//*  25   50:aload_0         
	//*  26   51:getfield        #20  <Field List mFullSpanItems>
	//*  27   54:iload_2         
	//*  28   55:invokeinterface #38  <Method Object List.get(int)>
	//*  29   60:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//*  30   63:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
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
	//   45   88:getfield        #20  <Field List mFullSpanItems>
	//   46   91:iload_2         
	//   47   92:invokeinterface #38  <Method Object List.get(int)>
	//   48   97:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   49  100:astore          4
			mFullSpanItems.remove(j);
	//   50  102:aload_0         
	//   51  103:getfield        #20  <Field List mFullSpanItems>
	//   52  106:iload_2         
	//   53  107:invokeinterface #45  <Method Object List.remove(int)>
	//   54  112:pop             
			return fullspanitem1.mPosition;
	//   55  113:aload           4
	//   56  115:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
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
		List list = mFullSpanItems;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List mFullSpanItems>
	//    2    4:astore          4
		if(list == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		for(int k = list.size() - 1; k >= 0; k--)
	//*   6   12:aload           4
	//*   7   14:invokeinterface #34  <Method int List.size()>
	//*   8   19:iconst_1        
	//*   9   20:isub            
	//*  10   21:istore_3        
	//*  11   22:iload_3         
	//*  12   23:iflt            72
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
	//   13   26:aload_0         
	//   14   27:getfield        #20  <Field List mFullSpanItems>
	//   15   30:iload_3         
	//   16   31:invokeinterface #38  <Method Object List.get(int)>
	//   17   36:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   18   39:astore          4
			if(fullspanitem.mPosition >= i)
	//*  19   41:aload           4
	//*  20   43:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  21   46:iload_1         
	//*  22   47:icmpge          53
	//*  23   50:goto            65
				fullspanitem.mPosition = fullspanitem.mPosition + j;
	//   24   53:aload           4
	//   25   55:aload           4
	//   26   57:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   27   60:iload_2         
	//   28   61:iadd            
	//   29   62:putfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		}

	//   30   65:iload_3         
	//   31   66:iconst_1        
	//   32   67:isub            
	//   33   68:istore_3        
	//*  34   69:goto            22
	//   35   72:return          
	}

	private void offsetFullSpansForRemoval(int i, int j)
	{
		List list = mFullSpanItems;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List mFullSpanItems>
	//    2    4:astore          4
		if(list == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		for(int k = list.size() - 1; k >= 0; k--)
	//*   6   12:aload           4
	//*   7   14:invokeinterface #34  <Method int List.size()>
	//*   8   19:iconst_1        
	//*   9   20:isub            
	//*  10   21:istore_3        
	//*  11   22:iload_3         
	//*  12   23:iflt            97
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
	//   13   26:aload_0         
	//   14   27:getfield        #20  <Field List mFullSpanItems>
	//   15   30:iload_3         
	//   16   31:invokeinterface #38  <Method Object List.get(int)>
	//   17   36:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   18   39:astore          4
			if(fullspanitem.mPosition < i)
	//*  19   41:aload           4
	//*  20   43:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  21   46:iload_1         
	//*  22   47:icmpge          53
				continue;
	//   23   50:goto            90
			if(fullspanitem.mPosition < i + j)
	//*  24   53:aload           4
	//*  25   55:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  26   58:iload_1         
	//*  27   59:iload_2         
	//*  28   60:iadd            
	//*  29   61:icmpge          78
				mFullSpanItems.remove(k);
	//   30   64:aload_0         
	//   31   65:getfield        #20  <Field List mFullSpanItems>
	//   32   68:iload_3         
	//   33   69:invokeinterface #45  <Method Object List.remove(int)>
	//   34   74:pop             
			else
	//*  35   75:goto            90
				fullspanitem.mPosition = fullspanitem.mPosition - j;
	//   36   78:aload           4
	//   37   80:aload           4
	//   38   82:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//   39   85:iload_2         
	//   40   86:isub            
	//   41   87:putfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
		}

	//   42   90:iload_3         
	//   43   91:iconst_1        
	//   44   92:isub            
	//   45   93:istore_3        
	//*  46   94:goto            22
	//   47   97:return          
	}

	public void addFullSpanItem(FullSpanItem fullspanitem)
	{
		if(mFullSpanItems == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field List mFullSpanItems>
	//*   2    4:ifnonnull       18
			mFullSpanItems = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #52  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #53  <Method void ArrayList()>
	//    7   15:putfield        #20  <Field List mFullSpanItems>
		int j = mFullSpanItems.size();
	//    8   18:aload_0         
	//    9   19:getfield        #20  <Field List mFullSpanItems>
	//   10   22:invokeinterface #34  <Method int List.size()>
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
	//   18   36:getfield        #20  <Field List mFullSpanItems>
	//   19   39:iload_2         
	//   20   40:invokeinterface #38  <Method Object List.get(int)>
	//   21   45:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   22   48:astore          4
			if(fullspanitem1.mPosition == fullspanitem.mPosition)
	//*  23   50:aload           4
	//*  24   52:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  25   55:aload_1         
	//*  26   56:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  27   59:icmpne          73
				mFullSpanItems.remove(i);
	//   28   62:aload_0         
	//   29   63:getfield        #20  <Field List mFullSpanItems>
	//   30   66:iload_2         
	//   31   67:invokeinterface #45  <Method Object List.remove(int)>
	//   32   72:pop             
			if(fullspanitem1.mPosition >= fullspanitem.mPosition)
	//*  33   73:aload           4
	//*  34   75:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  35   78:aload_1         
	//*  36   79:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  37   82:icmplt          97
			{
				mFullSpanItems.add(i, ((Object) (fullspanitem)));
	//   38   85:aload_0         
	//   39   86:getfield        #20  <Field List mFullSpanItems>
	//   40   89:iload_2         
	//   41   90:aload_1         
	//   42   91:invokeinterface #57  <Method void List.add(int, Object)>
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
	//   50  105:getfield        #20  <Field List mFullSpanItems>
	//   51  108:aload_1         
	//   52  109:invokeinterface #59  <Method boolean List.add(Object)>
	//   53  114:pop             
	//   54  115:return          
	}

	void clear()
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore_1        
		if(ai != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			Arrays.fill(ai, -1);
	//    5    9:aload_1         
	//    6   10:iconst_m1       
	//    7   11:invokestatic    #68  <Method void Arrays.fill(int[], int)>
		mFullSpanItems = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #20  <Field List mFullSpanItems>
	//   11   19:return          
	}

	void ensureSize(int i)
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore_2        
		if(ai == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       32
		{
			mData = new int[Math.max(i, 10) + 1];
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:bipush          10
	//    8   13:invokestatic    #76  <Method int Math.max(int, int)>
	//    9   16:iconst_1        
	//   10   17:iadd            
	//   11   18:newarray        int[]
	//   12   20:putfield        #62  <Field int[] mData>
			Arrays.fill(mData, -1);
	//   13   23:aload_0         
	//   14   24:getfield        #62  <Field int[] mData>
	//   15   27:iconst_m1       
	//   16   28:invokestatic    #68  <Method void Arrays.fill(int[], int)>
			return;
	//   17   31:return          
		}
		if(i >= ai.length)
	//*  18   32:iload_1         
	//*  19   33:aload_2         
	//*  20   34:arraylength     
	//*  21   35:icmplt          75
		{
			mData = new int[sizeForPosition(i)];
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:iload_1         
	//   25   41:invokevirtual   #79  <Method int sizeForPosition(int)>
	//   26   44:newarray        int[]
	//   27   46:putfield        #62  <Field int[] mData>
			System.arraycopy(((Object) (ai)), 0, ((Object) (mData)), 0, ai.length);
	//   28   49:aload_2         
	//   29   50:iconst_0        
	//   30   51:aload_0         
	//   31   52:getfield        #62  <Field int[] mData>
	//   32   55:iconst_0        
	//   33   56:aload_2         
	//   34   57:arraylength     
	//   35   58:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
			int ai1[] = mData;
	//   36   61:aload_0         
	//   37   62:getfield        #62  <Field int[] mData>
	//   38   65:astore_3        
			Arrays.fill(ai1, ai.length, ai1.length, -1);
	//   39   66:aload_3         
	//   40   67:aload_2         
	//   41   68:arraylength     
	//   42   69:aload_3         
	//   43   70:arraylength     
	//   44   71:iconst_m1       
	//   45   72:invokestatic    #88  <Method void Arrays.fill(int[], int, int, int)>
		}
	//   46   75:return          
	}

	int forceInvalidateAfter(int i)
	{
		List list = mFullSpanItems;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List mFullSpanItems>
	//    2    4:astore_3        
		if(list != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          60
		{
			for(int j = list.size() - 1; j >= 0; j--)
	//*   5    9:aload_3         
	//*   6   10:invokeinterface #34  <Method int List.size()>
	//*   7   15:iconst_1        
	//*   8   16:isub            
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iflt            60
				if(((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
	//*  12   22:aload_0         
	//*  13   23:getfield        #20  <Field List mFullSpanItems>
	//*  14   26:iload_2         
	//*  15   27:invokeinterface #38  <Method Object List.get(int)>
	//*  16   32:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//*  17   35:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  18   38:iload_1         
	//*  19   39:icmplt          53
					mFullSpanItems.remove(j);
	//   20   42:aload_0         
	//   21   43:getfield        #20  <Field List mFullSpanItems>
	//   22   46:iload_2         
	//   23   47:invokeinterface #45  <Method Object List.remove(int)>
	//   24   52:pop             

	//   25   53:iload_2         
	//   26   54:iconst_1        
	//   27   55:isub            
	//   28   56:istore_2        
		}
	//*  29   57:goto            18
		return invalidateAfter(i);
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:invokevirtual   #92  <Method int invalidateAfter(int)>
	//   33   65:ireturn         
	}

	public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
	{
		List list = mFullSpanItems;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List mFullSpanItems>
	//    2    4:astore          7
		if(list == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		int i1 = list.size();
	//    7   13:aload           7
	//    8   15:invokeinterface #34  <Method int List.size()>
	//    9   20:istore          6
		for(int l = 0; l < i1; l++)
	//*  10   22:iconst_0        
	//*  11   23:istore          5
	//*  12   25:iload           5
	//*  13   27:iload           6
	//*  14   29:icmpge          106
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(l);
	//   15   32:aload_0         
	//   16   33:getfield        #20  <Field List mFullSpanItems>
	//   17   36:iload           5
	//   18   38:invokeinterface #38  <Method Object List.get(int)>
	//   19   43:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   20   46:astore          7
			if(fullspanitem.mPosition >= j)
	//*  21   48:aload           7
	//*  22   50:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  23   53:iload_2         
	//*  24   54:icmplt          59
				return null;
	//   25   57:aconst_null     
	//   26   58:areturn         
			if(fullspanitem.mPosition >= i && (k == 0 || fullspanitem.mGapDir == k || flag && fullspanitem.mHasUnwantedGapAfter))
	//*  27   59:aload           7
	//*  28   61:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  29   64:iload_1         
	//*  30   65:icmplt          97
	//*  31   68:iload_3         
	//*  32   69:ifeq            94
	//*  33   72:aload           7
	//*  34   74:getfield        #97  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir>
	//*  35   77:iload_3         
	//*  36   78:icmpeq          94
	//*  37   81:iload           4
	//*  38   83:ifeq            97
	//*  39   86:aload           7
	//*  40   88:getfield        #101 <Field boolean StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter>
	//*  41   91:ifeq            97
				return fullspanitem;
	//   42   94:aload           7
	//   43   96:areturn         
		}

	//   44   97:iload           5
	//   45   99:iconst_1        
	//   46  100:iadd            
	//   47  101:istore          5
	//*  48  103:goto            25
		return null;
	//   49  106:aconst_null     
	//   50  107:areturn         
	}

	public FullSpanItem getFullSpanItem(int i)
	{
		List list = mFullSpanItems;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List mFullSpanItems>
	//    2    4:astore_3        
		if(list == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		for(int j = list.size() - 1; j >= 0; j--)
	//*   7   11:aload_3         
	//*   8   12:invokeinterface #34  <Method int List.size()>
	//*   9   17:iconst_1        
	//*  10   18:isub            
	//*  11   19:istore_2        
	//*  12   20:iload_2         
	//*  13   21:iflt            55
		{
			FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(j);
	//   14   24:aload_0         
	//   15   25:getfield        #20  <Field List mFullSpanItems>
	//   16   28:iload_2         
	//   17   29:invokeinterface #38  <Method Object List.get(int)>
	//   18   34:checkcast       #40  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   19   37:astore_3        
			if(fullspanitem.mPosition == i)
	//*  20   38:aload_3         
	//*  21   39:getfield        #43  <Field int StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition>
	//*  22   42:iload_1         
	//*  23   43:icmpne          48
				return fullspanitem;
	//   24   46:aload_3         
	//   25   47:areturn         
		}

	//   26   48:iload_2         
	//   27   49:iconst_1        
	//   28   50:isub            
	//   29   51:istore_2        
	//*  30   52:goto            20
		return null;
	//   31   55:aconst_null     
	//   32   56:areturn         
	}

	int getSpan(int i)
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore_2        
		if(ai != null && i < ai.length)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
	//*   5    9:iload_1         
	//*   6   10:aload_2         
	//*   7   11:arraylength     
	//*   8   12:icmplt          18
	//*   9   15:goto            22
			return ai[i];
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:iaload          
	//   13   21:ireturn         
		else
			return -1;
	//   14   22:iconst_m1       
	//   15   23:ireturn         
	}

	int invalidateAfter(int i)
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore_3        
		if(ai == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return -1;
	//    5    9:iconst_m1       
	//    6   10:ireturn         
		if(i >= ai.length)
	//*   7   11:iload_1         
	//*   8   12:aload_3         
	//*   9   13:arraylength     
	//*  10   14:icmplt          19
			return -1;
	//   11   17:iconst_m1       
	//   12   18:ireturn         
		int j = invalidateFullSpansAfter(i);
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:invokespecial   #104 <Method int invalidateFullSpansAfter(int)>
	//   16   24:istore_2        
		if(j == -1)
	//*  17   25:iload_2         
	//*  18   26:iconst_m1       
	//*  19   27:icmpne          49
		{
			int ai1[] = mData;
	//   20   30:aload_0         
	//   21   31:getfield        #62  <Field int[] mData>
	//   22   34:astore_3        
			Arrays.fill(ai1, i, ai1.length, -1);
	//   23   35:aload_3         
	//   24   36:iload_1         
	//   25   37:aload_3         
	//   26   38:arraylength     
	//   27   39:iconst_m1       
	//   28   40:invokestatic    #88  <Method void Arrays.fill(int[], int, int, int)>
			return mData.length;
	//   29   43:aload_0         
	//   30   44:getfield        #62  <Field int[] mData>
	//   31   47:arraylength     
	//   32   48:ireturn         
		} else
		{
			int ai2[] = mData;
	//   33   49:aload_0         
	//   34   50:getfield        #62  <Field int[] mData>
	//   35   53:astore_3        
			j++;
	//   36   54:iload_2         
	//   37   55:iconst_1        
	//   38   56:iadd            
	//   39   57:istore_2        
			Arrays.fill(ai2, i, j, -1);
	//   40   58:aload_3         
	//   41   59:iload_1         
	//   42   60:iload_2         
	//   43   61:iconst_m1       
	//   44   62:invokestatic    #88  <Method void Arrays.fill(int[], int, int, int)>
			return j;
	//   45   65:iload_2         
	//   46   66:ireturn         
		}
	}

	void offsetForAddition(int i, int j)
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore          4
		if(ai != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          67
		{
			if(i >= ai.length)
	//*   5   11:iload_1         
	//*   6   12:aload           4
	//*   7   14:arraylength     
	//*   8   15:icmplt          19
			{
				return;
	//    9   18:return          
			} else
			{
				int k = i + j;
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iadd            
	//   13   22:istore_3        
				ensureSize(k);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #107 <Method void ensureSize(int)>
				int ai1[] = mData;
	//   17   28:aload_0         
	//   18   29:getfield        #62  <Field int[] mData>
	//   19   32:astore          4
				System.arraycopy(((Object) (ai1)), i, ((Object) (ai1)), k, ai1.length - i - j);
	//   20   34:aload           4
	//   21   36:iload_1         
	//   22   37:aload           4
	//   23   39:iload_3         
	//   24   40:aload           4
	//   25   42:arraylength     
	//   26   43:iload_1         
	//   27   44:isub            
	//   28   45:iload_2         
	//   29   46:isub            
	//   30   47:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
				Arrays.fill(mData, i, k, -1);
	//   31   50:aload_0         
	//   32   51:getfield        #62  <Field int[] mData>
	//   33   54:iload_1         
	//   34   55:iload_3         
	//   35   56:iconst_m1       
	//   36   57:invokestatic    #88  <Method void Arrays.fill(int[], int, int, int)>
				offsetFullSpansForAddition(i, j);
	//   37   60:aload_0         
	//   38   61:iload_1         
	//   39   62:iload_2         
	//   40   63:invokespecial   #109 <Method void offsetFullSpansForAddition(int, int)>
				return;
	//   41   66:return          
			}
		} else
		{
			return;
	//   42   67:return          
		}
	}

	void offsetForRemoval(int i, int j)
	{
		int ai[] = mData;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
	//    2    4:astore          4
		if(ai != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          77
		{
			if(i >= ai.length)
	//*   5   11:iload_1         
	//*   6   12:aload           4
	//*   7   14:arraylength     
	//*   8   15:icmplt          19
			{
				return;
	//    9   18:return          
			} else
			{
				int k = i + j;
	//   10   19:iload_1         
	//   11   20:iload_2         
	//   12   21:iadd            
	//   13   22:istore_3        
				ensureSize(k);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #107 <Method void ensureSize(int)>
				int ai1[] = mData;
	//   17   28:aload_0         
	//   18   29:getfield        #62  <Field int[] mData>
	//   19   32:astore          4
				System.arraycopy(((Object) (ai1)), k, ((Object) (ai1)), i, ai1.length - i - j);
	//   20   34:aload           4
	//   21   36:iload_3         
	//   22   37:aload           4
	//   23   39:iload_1         
	//   24   40:aload           4
	//   25   42:arraylength     
	//   26   43:iload_1         
	//   27   44:isub            
	//   28   45:iload_2         
	//   29   46:isub            
	//   30   47:invokestatic    #85  <Method void System.arraycopy(Object, int, Object, int, int)>
				ai1 = mData;
	//   31   50:aload_0         
	//   32   51:getfield        #62  <Field int[] mData>
	//   33   54:astore          4
				Arrays.fill(ai1, ai1.length - j, ai1.length, -1);
	//   34   56:aload           4
	//   35   58:aload           4
	//   36   60:arraylength     
	//   37   61:iload_2         
	//   38   62:isub            
	//   39   63:aload           4
	//   40   65:arraylength     
	//   41   66:iconst_m1       
	//   42   67:invokestatic    #88  <Method void Arrays.fill(int[], int, int, int)>
				offsetFullSpansForRemoval(i, j);
	//   43   70:aload_0         
	//   44   71:iload_1         
	//   45   72:iload_2         
	//   46   73:invokespecial   #112 <Method void offsetFullSpansForRemoval(int, int)>
				return;
	//   47   76:return          
			}
		} else
		{
			return;
	//   48   77:return          
		}
	}

	void setSpan(int i, StaggeredGridLayoutManager.Span span)
	{
		ensureSize(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #107 <Method void ensureSize(int)>
		mData[i] = span.mIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field int[] mData>
	//    5    9:iload_1         
	//    6   10:aload_2         
	//    7   11:getfield        #119 <Field int StaggeredGridLayoutManager$Span.mIndex>
	//    8   14:iastore         
	//    9   15:return          
	}

	int sizeForPosition(int i)
	{
		int j;
		for(j = mData.length; j <= i; j *= 2);
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int[] mData>
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
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
