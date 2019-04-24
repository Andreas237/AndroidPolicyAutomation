// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.*;
import java.util.Map;
import java.util.regex.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfz, zzgj

final class zzel extends zzfz
{

	public zzel()
	{
		super(ID);
	//    0    0:aload_0         
	//    1    1:getstatic       #22  <Field String ID>
	//    2    4:invokespecial   #36  <Method void zzfz(String)>
	//    3    7:return          
	}

	protected final boolean zza(String s, String s1, Map map)
	{
		byte byte0;
		if(zzgj.zzg((zzp)map.get(((Object) (zzbeo)))).booleanValue())
	//*   0    0:aload_3         
	//*   1    1:getstatic       #31  <Field String zzbeo>
	//*   2    4:invokeinterface #46  <Method Object Map.get(Object)>
	//*   3    9:checkcast       #48  <Class zzp>
	//*   4   12:invokestatic    #54  <Method Boolean zzgj.zzg(zzp)>
	//*   5   15:invokevirtual   #60  <Method boolean Boolean.booleanValue()>
	//*   6   18:ifeq            28
			byte0 = 66;
	//    7   21:bipush          66
	//    8   23:istore          4
		else
	//*   9   25:goto            32
			byte0 = 64;
	//   10   28:bipush          64
	//   11   30:istore          4
		boolean flag;
		try
		{
			flag = Pattern.compile(s1, ((int) (byte0))).matcher(((CharSequence) (s))).find();
	//   12   32:aload_2         
	//   13   33:iload           4
	//   14   35:invokestatic    #66  <Method Pattern Pattern.compile(String, int)>
	//   15   38:aload_1         
	//   16   39:invokevirtual   #70  <Method Matcher Pattern.matcher(CharSequence)>
	//   17   42:invokevirtual   #75  <Method boolean Matcher.find()>
	//   18   45:istore          5
		}
	//*  19   47:iload           5
	//*  20   49:ireturn         
	//*  21   50:iconst_0        
	//*  22   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return false;
		}
		return flag;
	//*  23   52:astore_1        
	//*  24   53:goto            50
	}

	private static final String ID;
	private static final String zzbeo;

	static 
	{
		ID = zza.zzbj.toString();
	//    0    0:getstatic       #16  <Field zza zza.zzbj>
	//    1    3:invokevirtual   #20  <Method String zza.toString()>
	//    2    6:putstatic       #22  <Field String ID>
		zzbeo = zzb.zzii.toString();
	//    3    9:getstatic       #28  <Field zzb zzb.zzii>
	//    4   12:invokevirtual   #29  <Method String zzb.toString()>
	//    5   15:putstatic       #31  <Field String zzbeo>
	//*   6   18:return          
	}
}
