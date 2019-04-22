// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.search;


// Referenced classes of package com.ibotta.android.mvp.base.search:
//			AbstractSearchMvpPresenter

protected static final class AbstractSearchMvpPresenter$SearchState extends Enum
{

	public static AbstractSearchMvpPresenter$SearchState valueOf(String s)
	{
		return (AbstractSearchMvpPresenter$SearchState)Enum.valueOf(com/ibotta/android/mvp/base/search/AbstractSearchMvpPresenter$SearchState, s);
	//    0    0:ldc1            #2   <Class AbstractSearchMvpPresenter$SearchState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AbstractSearchMvpPresenter$SearchState>
	//    4    9:areturn         
	}

	public static AbstractSearchMvpPresenter$SearchState[] values()
	{
		return (AbstractSearchMvpPresenter$SearchState[])((AbstractSearchMvpPresenter$SearchState []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field AbstractSearchMvpPresenter$SearchState[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.ibotta.android.mvp.base.search.AbstractSearchMvpPresenter$SearchState_3B_.clone()>
	//    2    6:checkcast       #42  <Class AbstractSearchMvpPresenter$SearchState[]>
	//    3    9:areturn         
	}

	private static final AbstractSearchMvpPresenter$SearchState $VALUES[];
	public static final AbstractSearchMvpPresenter$SearchState NOT_SEARCHING;
	public static final AbstractSearchMvpPresenter$SearchState QUERYING;
	public static final AbstractSearchMvpPresenter$SearchState VIEWING_RESULTS;

	static 
	{
		NOT_SEARCHING = new AbstractSearchMvpPresenter$SearchState("NOT_SEARCHING", 0);
	//    0    0:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NOT_SEARCHING">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
	//    5   10:putstatic       #23  <Field AbstractSearchMvpPresenter$SearchState NOT_SEARCHING>
		QUERYING = new AbstractSearchMvpPresenter$SearchState("QUERYING", 1);
	//    6   13:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "QUERYING">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
	//   11   23:putstatic       #26  <Field AbstractSearchMvpPresenter$SearchState QUERYING>
		VIEWING_RESULTS = new AbstractSearchMvpPresenter$SearchState("VIEWING_RESULTS", 2);
	//   12   26:new             #2   <Class AbstractSearchMvpPresenter$SearchState>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "VIEWING_RESULTS">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void AbstractSearchMvpPresenter$SearchState(String, int)>
	//   17   36:putstatic       #29  <Field AbstractSearchMvpPresenter$SearchState VIEWING_RESULTS>
		$VALUES = (new AbstractSearchMvpPresenter$SearchState[] {
			NOT_SEARCHING, QUERYING, VIEWING_RESULTS
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       AbstractSearchMvpPresenter$SearchState[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field AbstractSearchMvpPresenter$SearchState NOT_SEARCHING>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field AbstractSearchMvpPresenter$SearchState QUERYING>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field AbstractSearchMvpPresenter$SearchState VIEWING_RESULTS>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field AbstractSearchMvpPresenter$SearchState[] $VALUES>
	//*  33   64:return          
	}

	private AbstractSearchMvpPresenter$SearchState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
