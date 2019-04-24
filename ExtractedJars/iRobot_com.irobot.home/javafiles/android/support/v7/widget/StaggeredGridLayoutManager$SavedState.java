// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager

public static class StaggeredGridLayoutManager$SavedState
	implements Parcelable
{

	void a()
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #53  <Field int[] d>
		c = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #51  <Field int c>
		e = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #59  <Field int e>
		f = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #61  <Field int[] f>
		g = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #81  <Field List g>
	//   15   25:return          
	}

	void b()
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #53  <Field int[] d>
		c = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #51  <Field int c>
		a = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #47  <Field int a>
		b = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #49  <Field int b>
	//   12   20:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int k)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #87  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #89  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #94  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public StaggeredGridLayoutManager.SavedState a(Parcel parcel)
		{
			return new StaggeredGridLayoutManager.SavedState(parcel);
		//    0    0:new             #9   <Class StaggeredGridLayoutManager$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void StaggeredGridLayoutManager$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public StaggeredGridLayoutManager.SavedState[] a(int k)
		{
			return new StaggeredGridLayoutManager.SavedState[k];
		//    0    0:iload_1         
		//    1    1:anewarray       StaggeredGridLayoutManager.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #27  <Method StaggeredGridLayoutManager$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int k)
		{
			return ((Object []) (a(k)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #31  <Method StaggeredGridLayoutManager$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	int b;
	int c;
	int d[];
	int e;
	int f[];
	List g;
	boolean h;
	boolean i;
	boolean j;

	static 
	{
	//    0    0:new             #11  <Class StaggeredGridLayoutManager$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void StaggeredGridLayoutManager$SavedState$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public StaggeredGridLayoutManager$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	StaggeredGridLayoutManager$SavedState(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #45  <Method int Parcel.readInt()>
	//    5    9:putfield        #47  <Field int a>
		b = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #45  <Method int Parcel.readInt()>
	//    9   17:putfield        #49  <Field int b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #45  <Method int Parcel.readInt()>
	//   13   25:putfield        #51  <Field int c>
		if(c > 0)
	//*  14   28:aload_0         
	//*  15   29:getfield        #51  <Field int c>
	//*  16   32:ifle            53
		{
			d = new int[c];
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #51  <Field int c>
	//   20   40:newarray        int[]
	//   21   42:putfield        #53  <Field int[] d>
			parcel.readIntArray(d);
	//   22   45:aload_1         
	//   23   46:aload_0         
	//   24   47:getfield        #53  <Field int[] d>
	//   25   50:invokevirtual   #57  <Method void Parcel.readIntArray(int[])>
		}
		e = parcel.readInt();
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #45  <Method int Parcel.readInt()>
	//   29   58:putfield        #59  <Field int e>
		if(e > 0)
	//*  30   61:aload_0         
	//*  31   62:getfield        #59  <Field int e>
	//*  32   65:ifle            86
		{
			f = new int[e];
	//   33   68:aload_0         
	//   34   69:aload_0         
	//   35   70:getfield        #59  <Field int e>
	//   36   73:newarray        int[]
	//   37   75:putfield        #61  <Field int[] f>
			parcel.readIntArray(f);
	//   38   78:aload_1         
	//   39   79:aload_0         
	//   40   80:getfield        #61  <Field int[] f>
	//   41   83:invokevirtual   #57  <Method void Parcel.readIntArray(int[])>
		}
		int k = parcel.readInt();
	//   42   86:aload_1         
	//   43   87:invokevirtual   #45  <Method int Parcel.readInt()>
	//   44   90:istore_2        
		boolean flag1 = false;
	//   45   91:iconst_0        
	//   46   92:istore          4
		boolean flag;
		if(k == 1)
	//*  47   94:iload_2         
	//*  48   95:iconst_1        
	//*  49   96:icmpne          104
			flag = true;
	//   50   99:iconst_1        
	//   51  100:istore_3        
		else
	//*  52  101:goto            106
			flag = false;
	//   53  104:iconst_0        
	//   54  105:istore_3        
		h = flag;
	//   55  106:aload_0         
	//   56  107:iload_3         
	//   57  108:putfield        #63  <Field boolean h>
		if(parcel.readInt() == 1)
	//*  58  111:aload_1         
	//*  59  112:invokevirtual   #45  <Method int Parcel.readInt()>
	//*  60  115:iconst_1        
	//*  61  116:icmpne          124
			flag = true;
	//   62  119:iconst_1        
	//   63  120:istore_3        
		else
	//*  64  121:goto            126
			flag = false;
	//   65  124:iconst_0        
	//   66  125:istore_3        
		i = flag;
	//   67  126:aload_0         
	//   68  127:iload_3         
	//   69  128:putfield        #65  <Field boolean i>
		flag = flag1;
	//   70  131:iload           4
	//   71  133:istore_3        
		if(parcel.readInt() == 1)
	//*  72  134:aload_1         
	//*  73  135:invokevirtual   #45  <Method int Parcel.readInt()>
	//*  74  138:iconst_1        
	//*  75  139:icmpne          144
			flag = true;
	//   76  142:iconst_1        
	//   77  143:istore_3        
		j = flag;
	//   78  144:aload_0         
	//   79  145:iload_3         
	//   80  146:putfield        #67  <Field boolean j>
		g = ((List) (parcel.readArrayList(((Class) (android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)).getClassLoader())));
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:ldc1            #69  <Class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>
	//   84  153:invokevirtual   #75  <Method ClassLoader Class.getClassLoader()>
	//   85  156:invokevirtual   #79  <Method java.util.ArrayList Parcel.readArrayList(ClassLoader)>
	//   86  159:putfield        #81  <Field List g>
	//   87  162:return          
	}

	public StaggeredGridLayoutManager$SavedState(StaggeredGridLayoutManager$SavedState staggeredgridlayoutmanager$savedstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		c = staggeredgridlayoutmanager$savedstate.c;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #51  <Field int c>
	//    5    9:putfield        #51  <Field int c>
		a = staggeredgridlayoutmanager$savedstate.a;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #47  <Field int a>
	//    9   17:putfield        #47  <Field int a>
		b = staggeredgridlayoutmanager$savedstate.b;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #49  <Field int b>
	//   13   25:putfield        #49  <Field int b>
		d = staggeredgridlayoutmanager$savedstate.d;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #53  <Field int[] d>
	//   17   33:putfield        #53  <Field int[] d>
		e = staggeredgridlayoutmanager$savedstate.e;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:getfield        #59  <Field int e>
	//   21   41:putfield        #59  <Field int e>
		f = staggeredgridlayoutmanager$savedstate.f;
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getfield        #61  <Field int[] f>
	//   25   49:putfield        #61  <Field int[] f>
		h = staggeredgridlayoutmanager$savedstate.h;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getfield        #63  <Field boolean h>
	//   29   57:putfield        #63  <Field boolean h>
		i = staggeredgridlayoutmanager$savedstate.i;
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getfield        #65  <Field boolean i>
	//   33   65:putfield        #65  <Field boolean i>
		j = staggeredgridlayoutmanager$savedstate.j;
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:getfield        #67  <Field boolean j>
	//   37   73:putfield        #67  <Field boolean j>
		g = staggeredgridlayoutmanager$savedstate.g;
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getfield        #81  <Field List g>
	//   41   81:putfield        #81  <Field List g>
	//   42   84:return          
	}
}
