// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzyj
	implements MediationAdRequest
{

	public zzyj(Date date, int i, Set set, Location location, boolean flag, int j, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzhl = date;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field Date zzhl>
		zzaqn = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #30  <Field int zzaqn>
		zzhn = set;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #32  <Field Set zzhn>
		zzhp = location;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #34  <Field Location zzhp>
		zzho = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #36  <Field boolean zzho>
		zzbur = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #38  <Field int zzbur>
		zzaqz = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #40  <Field boolean zzaqz>
	//   23   43:return          
	}

	public final Date getBirthday()
	{
		return zzhl;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Date zzhl>
	//    2    4:areturn         
	}

	public final int getGender()
	{
		return zzaqn;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzaqn>
	//    2    4:ireturn         
	}

	public final Set getKeywords()
	{
		return zzhn;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Set zzhn>
	//    2    4:areturn         
	}

	public final Location getLocation()
	{
		return zzhp;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Location zzhp>
	//    2    4:areturn         
	}

	public final boolean isDesignedForFamilies()
	{
		return zzaqz;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzaqz>
	//    2    4:ireturn         
	}

	public final boolean isTesting()
	{
		return zzho;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean zzho>
	//    2    4:ireturn         
	}

	public final int taggedForChildDirectedTreatment()
	{
		return zzbur;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int zzbur>
	//    2    4:ireturn         
	}

	private final int zzaqn;
	private final boolean zzaqz;
	private final int zzbur;
	private final Date zzhl;
	private final Set zzhn;
	private final boolean zzho;
	private final Location zzhp;
}
