// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;


// Referenced classes of package co.touchlab.squeaky.dao:
//			Dao

public static class Dao$ForeignRefresh
{

	public final String field;
	public final Dao$ForeignRefresh refreshFields[];

	public Dao$ForeignRefresh(String s)
	{
		this(s, ((Dao$ForeignRefresh []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void Dao$ForeignRefresh(String, Dao$ForeignRefresh[])>
	//    4    6:return          
	}

	public Dao$ForeignRefresh(String s, Dao$ForeignRefresh adao$foreignrefresh[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		field = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field String field>
		refreshFields = adao$foreignrefresh;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Dao$ForeignRefresh[] refreshFields>
	//    8   14:return          
	}
}
