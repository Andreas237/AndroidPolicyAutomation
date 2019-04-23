// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.os.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

private static class AppCompatDelegateImpl$PanelFeatureState$SavedState
	implements Parcelable
{

	static AppCompatDelegateImpl$PanelFeatureState$SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
	{
		AppCompatDelegateImpl$PanelFeatureState$SavedState appcompatdelegateimpl$panelfeaturestate$savedstate = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
	//    0    0:new             #2   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState()>
	//    3    7:astore          4
		appcompatdelegateimpl$panelfeaturestate$savedstate.featureId = parcel.readInt();
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:invokevirtual   #41  <Method int Parcel.readInt()>
	//    7   15:putfield        #43  <Field int featureId>
		int i = parcel.readInt();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #41  <Method int Parcel.readInt()>
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
		appcompatdelegateimpl$panelfeaturestate$savedstate.isOpen = flag;
	//   19   35:aload           4
	//   20   37:iload_3         
	//   21   38:putfield        #45  <Field boolean isOpen>
		if(appcompatdelegateimpl$panelfeaturestate$savedstate.isOpen)
	//*  22   41:aload           4
	//*  23   43:getfield        #45  <Field boolean isOpen>
	//*  24   46:ifeq            59
			appcompatdelegateimpl$panelfeaturestate$savedstate.menuState = parcel.readBundle(classloader);
	//   25   49:aload           4
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
	//   29   56:putfield        #51  <Field Bundle menuState>
		return appcompatdelegateimpl$panelfeaturestate$savedstate;
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
	//    0    0:new             #56  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #63  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel)
		{
			return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public AppCompatDelegateImpl.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return AppCompatDelegateImpl.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (createFromParcel(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #32  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AppCompatDelegateImpl.PanelFeatureState.SavedState[] newArray(int i)
		{
			return new AppCompatDelegateImpl.PanelFeatureState.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AppCompatDelegateImpl.PanelFeatureState.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #37  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	int featureId;
	boolean isOpen;
	Bundle menuState;

	static 
	{
	//    0    0:new             #14  <Class AppCompatDelegateImpl$PanelFeatureState$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState$1()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	AppCompatDelegateImpl$PanelFeatureState$SavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}
}
