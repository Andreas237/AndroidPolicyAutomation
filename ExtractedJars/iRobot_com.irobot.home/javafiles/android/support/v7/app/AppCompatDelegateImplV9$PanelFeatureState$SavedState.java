// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private static class AppCompatDelegateImplV9$PanelFeatureState$SavedState
	implements Parcelable
{

	static AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel parcel, ClassLoader classloader)
	{
		AppCompatDelegateImplV9$PanelFeatureState$SavedState appcompatdelegateimplv9$panelfeaturestate$savedstate = new AppCompatDelegateImplV9$PanelFeatureState$SavedState();
	//    0    0:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
	//    3    7:astore          4
		appcompatdelegateimplv9$panelfeaturestate$savedstate.a = parcel.readInt();
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #40  <Method int Parcel.readInt()>
	//    7   15:putfield        #42  <Field int a>
		int i = parcel.readInt();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #40  <Method int Parcel.readInt()>
	//   10   22:istore_2        
		boolean flag = true;
	//   11   23:iconst_1        
	//   12   24:istore_3        
		if(i != 1)
	//*  13   25:iload_2         
	//*  14   26:iconst_1        
	//*  15   27:icmpne          33
	//*  16   30:goto            35
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_3        
		appcompatdelegateimplv9$panelfeaturestate$savedstate.b = flag;
	//   19   35:aload           4
	//   20   37:iload_3         
	//   21   38:putfield        #44  <Field boolean b>
		if(appcompatdelegateimplv9$panelfeaturestate$savedstate.b)
	//*  22   41:aload           4
	//*  23   43:getfield        #44  <Field boolean b>
	//*  24   46:ifeq            59
			appcompatdelegateimplv9$panelfeaturestate$savedstate.c = parcel.readBundle(classloader);
	//   25   49:aload           4
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #48  <Method Bundle Parcel.readBundle(ClassLoader)>
	//   29   56:putfield        #50  <Field Bundle c>
		return appcompatdelegateimplv9$panelfeaturestate$savedstate;
	//   30   59:aload           4
	//   31   61:areturn         
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
	//    0    0:new             #55  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #62  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel parcel)
		{
			return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(parcel, ((ClassLoader) (null)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState a(Parcel parcel, ClassLoader classloader)
		{
			return AppCompatDelegateImplV9.PanelFeatureState.SavedState.a(parcel, classloader);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.a(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public AppCompatDelegateImplV9.PanelFeatureState.SavedState[] a(int i)
		{
			return new AppCompatDelegateImplV9.PanelFeatureState.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppCompatDelegateImplV9.PanelFeatureState.SavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #30  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #36  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	int a;
	boolean b;
	Bundle c;

	static 
	{
	//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	AppCompatDelegateImplV9$PanelFeatureState$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
