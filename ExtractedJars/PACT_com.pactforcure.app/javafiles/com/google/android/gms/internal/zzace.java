// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzq;

public class zzace
{

	private zzace(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzaEV = s1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #18  <Field String zzaEV>
		mTag = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field String mTag>
		zzaFr = new zzq(s);
	//    8   14:aload_0         
	//    9   15:new             #22  <Class zzq>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokespecial   #25  <Method void zzq(String)>
	//   13   23:putfield        #27  <Field zzq zzaFr>
		zzaeb = getLogLevel();
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:invokespecial   #31  <Method int getLogLevel()>
	//   17   31:putfield        #33  <Field int zzaeb>
	//   18   34:return          
	}

	public transient zzace(String s, String as[])
	{
		this(s, zzd(as));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #39  <Method String zzd(String[])>
	//    4    6:invokespecial   #41  <Method void zzace(String, String)>
	//    5    9:return          
	}

	private int getLogLevel()
	{
		int i;
		for(i = 2; 7 >= i && !Log.isLoggable(mTag, i); i++);
	//    0    0:iconst_2        
	//    1    1:istore_1        
	//    2    2:bipush          7
	//    3    4:iload_1         
	//    4    5:icmplt          26
	//    5    8:aload_0         
	//    6    9:getfield        #20  <Field String mTag>
	//    7   12:iload_1         
	//    8   13:invokestatic    #47  <Method boolean Log.isLoggable(String, int)>
	//    9   16:ifne            26
	//   10   19:iload_1         
	//   11   20:iconst_1        
	//   12   21:iadd            
	//   13   22:istore_1        
	//*  14   23:goto            2
		return i;
	//   15   26:iload_1         
	//   16   27:ireturn         
	}

	private static transient String zzd(String as[])
	{
		if(as.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            8
			return "";
	//    3    5:ldc1            #49  <String "">
	//    4    7:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    5    8:new             #51  <Class StringBuilder>
	//    6   11:dup             
	//    7   12:invokespecial   #52  <Method void StringBuilder()>
	//    8   15:astore_3        
		stringbuilder.append('[');
	//    9   16:aload_3         
	//   10   17:bipush          91
	//   11   19:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   12   22:pop             
		int j = as.length;
	//   13   23:aload_0         
	//   14   24:arraylength     
	//   15   25:istore_2        
		for(int i = 0; i < j; i++)
	//*  16   26:iconst_0        
	//*  17   27:istore_1        
	//*  18   28:iload_1         
	//*  19   29:iload_2         
	//*  20   30:icmpge          67
		{
			String s = as[i];
	//   21   33:aload_0         
	//   22   34:iload_1         
	//   23   35:aaload          
	//   24   36:astore          4
			if(stringbuilder.length() > 1)
	//*  25   38:aload_3         
	//*  26   39:invokevirtual   #59  <Method int StringBuilder.length()>
	//*  27   42:iconst_1        
	//*  28   43:icmple          53
				stringbuilder.append(",");
	//   29   46:aload_3         
	//   30   47:ldc1            #61  <String ",">
	//   31   49:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   32   52:pop             
			stringbuilder.append(s);
	//   33   53:aload_3         
	//   34   54:aload           4
	//   35   56:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   36   59:pop             
		}

	//   37   60:iload_1         
	//   38   61:iconst_1        
	//   39   62:iadd            
	//   40   63:istore_1        
	//*  41   64:goto            28
		stringbuilder.append(']').append(' ');
	//   42   67:aload_3         
	//   43   68:bipush          93
	//   44   70:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   45   73:bipush          32
	//   46   75:invokevirtual   #56  <Method StringBuilder StringBuilder.append(char)>
	//   47   78:pop             
		return stringbuilder.toString();
	//   48   79:aload_3         
	//   49   80:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   50   83:areturn         
	}

	protected transient String format(String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(aobj != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          19
		{
			s1 = s;
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(aobj.length > 0)
	//*   6    8:aload_2         
	//*   7    9:arraylength     
	//*   8   10:ifle            19
				s1 = String.format(s, aobj);
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokestatic    #74  <Method String String.format(String, Object[])>
	//   12   18:astore_3        
		}
		return zzaEV.concat(s1);
	//   13   19:aload_0         
	//   14   20:getfield        #18  <Field String zzaEV>
	//   15   23:aload_3         
	//   16   24:invokevirtual   #78  <Method String String.concat(String)>
	//   17   27:areturn         
	}

	public transient void zza(String s, Object aobj[])
	{
		if(zzai(2))
	//*   0    0:aload_0         
	//*   1    1:iconst_2        
	//*   2    2:invokevirtual   #84  <Method boolean zzai(int)>
	//*   3    5:ifeq            22
			Log.v(mTag, format(s, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #85  <Method String format(String, Object[])>
	//   10   18:invokestatic    #89  <Method int Log.v(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public boolean zzai(int i)
	{
		return zzaeb <= i;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzaeb>
	//    2    4:iload_1         
	//    3    5:icmpgt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public transient void zzb(String s, Object aobj[])
	{
		if(zzai(3))
	//*   0    0:aload_0         
	//*   1    1:iconst_3        
	//*   2    2:invokevirtual   #84  <Method boolean zzai(int)>
	//*   3    5:ifeq            22
			Log.d(mTag, format(s, aobj));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #85  <Method String format(String, Object[])>
	//   10   18:invokestatic    #93  <Method int Log.d(String, String)>
	//   11   21:pop             
	//   12   22:return          
	}

	public transient void zze(String s, Object aobj[])
	{
		Log.i(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #85  <Method String format(String, Object[])>
	//    6   10:invokestatic    #97  <Method int Log.i(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	public transient void zzf(String s, Object aobj[])
	{
		Log.w(mTag, format(s, aobj));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String mTag>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #85  <Method String format(String, Object[])>
	//    6   10:invokestatic    #101 <Method int Log.w(String, String)>
	//    7   13:pop             
	//    8   14:return          
	}

	private final String mTag;
	private final String zzaEV;
	private final zzq zzaFr;
	private final int zzaeb;
}
