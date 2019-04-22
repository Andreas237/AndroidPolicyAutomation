// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.Context;

// Referenced classes of package com.google.android.gms.common.data:
//			zzc, zzd, zze

public interface TextFilterable
{
	public static interface StringFilter
	{

		public abstract boolean matches(String s, String s1);
	}


	public abstract void setFilterTerm(Context context, StringFilter stringfilter, String s);

	public abstract void setFilterTerm(Context context, String s);

	public static final StringFilter CONTAINS = new zzc();
	public static final StringFilter STARTS_WITH = new zzd();
	public static final StringFilter WORD_STARTS_WITH = new zze();

	/* static  */
	/* { */
	//    0    0:new             #15  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzc()>
	//    3    7:putstatic       #20  <Field TextFilterable$StringFilter CONTAINS>
	//    4   10:new             #22  <Class zzd>
	//    5   13:dup             
	//    6   14:invokespecial   #23  <Method void zzd()>
	//    7   17:putstatic       #25  <Field TextFilterable$StringFilter STARTS_WITH>
	//    8   20:new             #27  <Class zze>
	//    9   23:dup             
	//   10   24:invokespecial   #28  <Method void zze()>
	//   11   27:putstatic       #30  <Field TextFilterable$StringFilter WORD_STARTS_WITH>
	//*  12   30:return          
	/* } */
}
