// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NotificationSettings
	implements Parcelable
{

	public NotificationSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		e = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #28  <Field boolean e>
	//    5    9:return          
	}

	public NotificationSettings(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		e = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #28  <Field boolean e>
		boolean flag;
		if(parcel.readInt() == 1)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #35  <Method int Parcel.readInt()>
	//*   9   15:iconst_1        
	//*  10   16:icmpne          24
			flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
		else
	//*  13   21:goto            26
			flag = false;
	//   14   24:iconst_0        
	//   15   25:istore_2        
		a = flag;
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:putfield        #37  <Field boolean a>
		if(parcel.readInt() == 1)
	//*  19   31:aload_1         
	//*  20   32:invokevirtual   #35  <Method int Parcel.readInt()>
	//*  21   35:iconst_1        
	//*  22   36:icmpne          44
			flag = true;
	//   23   39:iconst_1        
	//   24   40:istore_2        
		else
	//*  25   41:goto            46
			flag = false;
	//   26   44:iconst_0        
	//   27   45:istore_2        
		b = flag;
	//   28   46:aload_0         
	//   29   47:iload_2         
	//   30   48:putfield        #39  <Field boolean b>
		if(parcel.readInt() == 1)
	//*  31   51:aload_1         
	//*  32   52:invokevirtual   #35  <Method int Parcel.readInt()>
	//*  33   55:iconst_1        
	//*  34   56:icmpne          64
			flag = true;
	//   35   59:iconst_1        
	//   36   60:istore_2        
		else
	//*  37   61:goto            66
			flag = false;
	//   38   64:iconst_0        
	//   39   65:istore_2        
		c = flag;
	//   40   66:aload_0         
	//   41   67:iload_2         
	//   42   68:putfield        #41  <Field boolean c>
		if(parcel.readInt() == 1)
	//*  43   71:aload_1         
	//*  44   72:invokevirtual   #35  <Method int Parcel.readInt()>
	//*  45   75:iconst_1        
	//*  46   76:icmpne          84
			flag = true;
	//   47   79:iconst_1        
	//   48   80:istore_2        
		else
	//*  49   81:goto            86
			flag = false;
	//   50   84:iconst_0        
	//   51   85:istore_2        
		d = flag;
	//   52   86:aload_0         
	//   53   87:iload_2         
	//   54   88:putfield        #43  <Field boolean d>
		if(parcel.readInt() == 1)
	//*  55   91:aload_1         
	//*  56   92:invokevirtual   #35  <Method int Parcel.readInt()>
	//*  57   95:iconst_1        
	//*  58   96:icmpne          104
			flag = flag1;
	//   59   99:iload_3         
	//   60  100:istore_2        
		else
	//*  61  101:goto            106
			flag = false;
	//   62  104:iconst_0        
	//   63  105:istore_2        
		e = flag;
	//   64  106:aload_0         
	//   65  107:iload_2         
	//   66  108:putfield        #28  <Field boolean e>
	//   67  111:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #48  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #50  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #55  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public NotificationSettings a(Parcel parcel)
		{
			return new NotificationSettings(parcel);
		//    0    0:new             #9   <Class NotificationSettings>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void NotificationSettings(Parcel)>
		//    4    8:areturn         
		}

		public NotificationSettings[] a(int i)
		{
			return new NotificationSettings[i];
		//    0    0:iload_1         
		//    1    1:anewarray       NotificationSettings[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method NotificationSettings a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method NotificationSettings[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private boolean a;
	private boolean b;
	private boolean c;
	private boolean d;
	private boolean e;

	static 
	{
	//    0    0:new             #8   <Class NotificationSettings$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void NotificationSettings$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
