// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzzd, zzjj

public final class zzzc
{

	public static int zza(com.google.ads.AdRequest.ErrorCode errorcode)
	{
		switch(zzzd.zzbvg[errorcode.ordinal()])
	//*   0    0:getstatic       #13  <Field int[] zzzd.zzbvg>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #19  <Method int com.google.ads.AdRequest$ErrorCode.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     2 4: default 36
	//	               2 42
	//	               3 40
	//	               4 38
		default:
			return 0;
	//    5   36:iconst_0        
	//    6   37:ireturn         

		case 4: // '\004'
			return 3;
	//    7   38:iconst_3        
	//    8   39:ireturn         

		case 3: // '\003'
			return 2;
	//    9   40:iconst_2        
	//   10   41:ireturn         

		case 2: // '\002'
			return 1;
	//   11   42:iconst_1        
	//   12   43:ireturn         
		}
	}

	public static MediationAdRequest zza(zzjj zzjj1, boolean flag)
	{
		HashSet hashset;
		if(zzjj1.zzapy != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field java.util.List zzjj.zzapy>
	//*   2    4:ifnull          22
			hashset = new HashSet(((java.util.Collection) (zzjj1.zzapy)));
	//    3    7:new             #29  <Class HashSet>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field java.util.List zzjj.zzapy>
	//    7   15:invokespecial   #33  <Method void HashSet(java.util.Collection)>
	//    8   18:astore_3        
		else
	//*   9   19:goto            27
			hashset = null;
	//   10   22:aconst_null     
	//   11   23:astore_3        
	//*  12   24:goto            19
		Date date = new Date(zzjj1.zzapw);
	//   13   27:new             #35  <Class Date>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:getfield        #39  <Field long zzjj.zzapw>
	//   17   35:invokespecial   #42  <Method void Date(long)>
	//   18   38:astore          4
		com.google.ads.AdRequest.Gender gender;
		switch(zzjj1.zzapx)
	//*  19   40:aload_0         
	//*  20   41:getfield        #46  <Field int zzjj.zzapx>
		{
	//*  21   44:tableswitch     1 2: default 68
	//	               1 82
	//	               2 75
		default:
			gender = com.google.ads.AdRequest.Gender.UNKNOWN;
	//   22   68:getstatic       #52  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.UNKNOWN>
	//   23   71:astore_2        
			break;

	//*  24   72:goto            89
		case 2: // '\002'
			gender = com.google.ads.AdRequest.Gender.FEMALE;
	//   25   75:getstatic       #55  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.FEMALE>
	//   26   78:astore_2        
			break;

	//*  27   79:goto            72
		case 1: // '\001'
			gender = com.google.ads.AdRequest.Gender.MALE;
	//   28   82:getstatic       #58  <Field com.google.ads.AdRequest$Gender com.google.ads.AdRequest$Gender.MALE>
	//   29   85:astore_2        
			break;
		}
	//*  30   86:goto            72
		return new MediationAdRequest(date, gender, ((java.util.Set) (hashset)), flag, zzjj1.zzaqe);
	//   31   89:new             #60  <Class MediationAdRequest>
	//   32   92:dup             
	//   33   93:aload           4
	//   34   95:aload_2         
	//   35   96:aload_3         
	//   36   97:iload_1         
	//   37   98:aload_0         
	//   38   99:getfield        #64  <Field android.location.Location zzjj.zzaqe>
	//   39  102:invokespecial   #67  <Method void MediationAdRequest(Date, com.google.ads.AdRequest$Gender, java.util.Set, boolean, android.location.Location)>
	//   40  105:areturn         
	}
}
