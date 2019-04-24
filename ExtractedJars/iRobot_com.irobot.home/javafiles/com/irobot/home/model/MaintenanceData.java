// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MaintenanceData
	implements Parcelable
{

	public MaintenanceData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}

	public MaintenanceData(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #37  <Method String Parcel.readString()>
	//    5    9:putfield        #39  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #37  <Method String Parcel.readString()>
	//    9   17:putfield        #41  <Field String b>
		c = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #45  <Method int Parcel.readInt()>
	//   13   25:putfield        #47  <Field int c>
		d = parcel.readInt();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #45  <Method int Parcel.readInt()>
	//   17   33:putfield        #49  <Field int d>
		e = parcel.readInt();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #45  <Method int Parcel.readInt()>
	//   21   41:putfield        #51  <Field int e>
		int i = parcel.readInt();
	//   22   44:aload_1         
	//   23   45:invokevirtual   #45  <Method int Parcel.readInt()>
	//   24   48:istore_2        
		boolean flag = true;
	//   25   49:iconst_1        
	//   26   50:istore_3        
		if(i != 1)
	//*  27   51:iload_2         
	//*  28   52:iconst_1        
	//*  29   53:icmpne          59
	//*  30   56:goto            61
			flag = false;
	//   31   59:iconst_0        
	//   32   60:istore_3        
		f = flag;
	//   33   61:aload_0         
	//   34   62:iload_3         
	//   35   63:putfield        #53  <Field boolean f>
	//   36   66:return          
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
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #58  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("part: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #60  <String "part: ">
	//    6   11:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field String a>
	//   11   20:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(" lastReset: ");
	//   13   24:aload_1         
	//   14   25:ldc1            #66  <String " lastReset: ">
	//   15   27:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(b);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #41  <Field String b>
	//   20   36:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(" distance: ");
	//   22   40:aload_1         
	//   23   41:ldc1            #68  <String " distance: ">
	//   24   43:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(c);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #47  <Field int c>
	//   29   52:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(" runtime: ");
	//   31   56:aload_1         
	//   32   57:ldc1            #73  <String " runtime: ">
	//   33   59:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(d);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #49  <Field int d>
	//   38   68:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   39   71:pop             
		stringbuilder.append(" months: ");
	//   40   72:aload_1         
	//   41   73:ldc1            #75  <String " months: ">
	//   42   75:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		stringbuilder.append(e);
	//   44   79:aload_1         
	//   45   80:aload_0         
	//   46   81:getfield        #51  <Field int e>
	//   47   84:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   48   87:pop             
		stringbuilder.append(" notified: ");
	//   49   88:aload_1         
	//   50   89:ldc1            #77  <String " notified: ">
	//   51   91:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   52   94:pop             
		stringbuilder.append(f);
	//   53   95:aload_1         
	//   54   96:aload_0         
	//   55   97:getfield        #53  <Field boolean f>
	//   56  100:invokevirtual   #80  <Method StringBuilder StringBuilder.append(boolean)>
	//   57  103:pop             
		return stringbuilder.toString();
	//   58  104:aload_1         
	//   59  105:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   60  108:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #86  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #88  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #93  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MaintenanceData a(Parcel parcel)
		{
			return new MaintenanceData(parcel);
		//    0    0:new             #9   <Class MaintenanceData>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MaintenanceData(Parcel)>
		//    4    8:areturn         
		}

		public MaintenanceData[] a(int i)
		{
			return new MaintenanceData[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MaintenanceData[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MaintenanceData a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MaintenanceData[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private int c;
	private int d;
	private int e;
	private boolean f;

	static 
	{
	//    0    0:new             #8   <Class MaintenanceData$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void MaintenanceData$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
