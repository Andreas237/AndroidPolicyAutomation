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

	int a(int i)
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field int[] c>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return c[i];
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int[] c>
	//    7   13:iload_1         
	//    8   14:iaload          
	//    9   15:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FullSpanItem{mPosition=");
	//    4    8:aload_1         
	//    5    9:ldc1            #61  <String "FullSpanItem{mPosition=">
	//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #42  <Field int a>
	//   11   20:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", mGapDir=");
	//   13   24:aload_1         
	//   14   25:ldc1            #70  <String ", mGapDir=">
	//   15   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(b);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #44  <Field int b>
	//   20   36:invokevirtual   #68  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", mHasUnwantedGapAfter=");
	//   22   40:aload_1         
	//   23   41:ldc1            #72  <String ", mHasUnwantedGapAfter=">
	//   24   43:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(d);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #46  <Field boolean d>
	//   29   52:invokevirtual   #75  <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(", mGapPerSpan=");
	//   31   56:aload_1         
	//   32   57:ldc1            #77  <String ", mGapPerSpan=">
	//   33   59:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(Arrays.toString(c));
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #48  <Field int[] c>
	//   38   68:invokestatic    #82  <Method String Arrays.toString(int[])>
	//   39   71:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
		stringbuilder.append('}');
	//   41   75:aload_1         
	//   42   76:bipush          125
	//   43   78:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   44   81:pop             
		return stringbuilder.toString();
	//   45   82:aload_1         
	//   46   83:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47   86:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #91  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #93  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #98  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel parcel)
		{
			return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
		//    0    0:new             #9   <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #25  <Method void StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel)>
		//    4    8:areturn         
		}

		public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] a(int i)
		{
			return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
		//    0    0:iload_1         
		//    1    1:anewarray       StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #30  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	int b;
	int c[];
	boolean d;

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
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #40  <Method int Parcel.readInt()>
	//    5    9:putfield        #42  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #40  <Method int Parcel.readInt()>
	//    9   17:putfield        #44  <Field int b>
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
		d = flag;
	//   21   37:aload_0         
	//   22   38:iload_3         
	//   23   39:putfield        #46  <Field boolean d>
		i = parcel.readInt();
	//   24   42:aload_1         
	//   25   43:invokevirtual   #40  <Method int Parcel.readInt()>
	//   26   46:istore_2        
		if(i > 0)
	//*  27   47:iload_2         
	//*  28   48:ifle            66
		{
			c = new int[i];
	//   29   51:aload_0         
	//   30   52:iload_2         
	//   31   53:newarray        int[]
	//   32   55:putfield        #48  <Field int[] c>
			parcel.readIntArray(c);
	//   33   58:aload_1         
	//   34   59:aload_0         
	//   35   60:getfield        #48  <Field int[] c>
	//   36   63:invokevirtual   #52  <Method void Parcel.readIntArray(int[])>
		}
	//   37   66:return          
	}
}
