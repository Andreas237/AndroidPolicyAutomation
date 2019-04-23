// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bfs, zzki, zzkm, bic

public final class bfr
{

	public bfr()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		a = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #34  <Field int a>
		b = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #36  <Field int b>
	//    8   14:return          
	}

	private final boolean a(String s, String s1)
	{
		if(!"iTunSMPB".equals(((Object) (s))))
	//*   0    0:ldc1            #41  <String "iTunSMPB">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #47  <Method boolean String.equals(Object)>
	//*   3    6:ifne            11
			return false;
	//    4    9:iconst_0        
	//    5   10:ireturn         
		s = ((String) (d.matcher(((CharSequence) (s1)))));
	//    6   11:getstatic       #30  <Field Pattern d>
	//    7   14:aload_2         
	//    8   15:invokevirtual   #51  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   18:astore_1        
		if(!((Matcher) (s)).find())
			break MISSING_BLOCK_LABEL_71;
	//   10   19:aload_1         
	//   11   20:invokevirtual   #57  <Method boolean Matcher.find()>
	//   12   23:ifeq            71
		int i;
		int j;
		try
		{
			i = Integer.parseInt(((Matcher) (s)).group(1), 16);
	//   13   26:aload_1         
	//   14   27:iconst_1        
	//   15   28:invokevirtual   #61  <Method String Matcher.group(int)>
	//   16   31:bipush          16
	//   17   33:invokestatic    #67  <Method int Integer.parseInt(String, int)>
	//   18   36:istore_3        
			j = Integer.parseInt(((Matcher) (s)).group(2), 16);
	//   19   37:aload_1         
	//   20   38:iconst_2        
	//   21   39:invokevirtual   #61  <Method String Matcher.group(int)>
	//   22   42:bipush          16
	//   23   44:invokestatic    #67  <Method int Integer.parseInt(String, int)>
	//   24   47:istore          4
		}
	//*  25   49:iload_3         
	//*  26   50:ifgt            58
	//*  27   53:iload           4
	//*  28   55:ifle            71
	//*  29   58:aload_0         
	//*  30   59:iload_3         
	//*  31   60:putfield        #34  <Field int a>
	//*  32   63:aload_0         
	//*  33   64:iload           4
	//*  34   66:putfield        #36  <Field int b>
	//*  35   69:iconst_1        
	//*  36   70:ireturn         
	//*  37   71:iconst_0        
	//*  38   72:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  39   73:astore_1        
		{
			return false;
	//   40   74:iconst_0        
	//   41   75:ireturn         
		}
		if(i <= 0 && j <= 0)
			break MISSING_BLOCK_LABEL_71;
		a = i;
		b = j;
		return true;
		return false;
	}

	public final boolean a()
	{
		return a != -1 && b != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int a>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:getfield        #36  <Field int b>
	//    6   12:iconst_m1       
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public final boolean a(zzki zzki1)
	{
		for(int i = 0; i < zzki1.a(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokevirtual   #73  <Method int zzki.a()>
	//*   5    7:icmpge          52
		{
			Object obj = ((Object) (zzki1.a(i)));
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #76  <Method zzki$zza zzki.a(int)>
	//    9   15:astore_3        
			if(!(obj instanceof zzkm))
				continue;
	//   10   16:aload_3         
	//   11   17:instanceof      #78  <Class zzkm>
	//   12   20:ifeq            45
			obj = ((Object) ((zzkm)obj));
	//   13   23:aload_3         
	//   14   24:checkcast       #78  <Class zzkm>
	//   15   27:astore_3        
			if(a(((zzkm) (obj)).a, ((zzkm) (obj)).b))
	//*  16   28:aload_0         
	//*  17   29:aload_3         
	//*  18   30:getfield        #81  <Field String zzkm.a>
	//*  19   33:aload_3         
	//*  20   34:getfield        #83  <Field String zzkm.b>
	//*  21   37:invokespecial   #85  <Method boolean a(String, String)>
	//*  22   40:ifeq            45
				return true;
	//   23   43:iconst_1        
	//   24   44:ireturn         
		}

	//   25   45:iload_2         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_2        
	//*  29   49:goto            2
		return false;
	//   30   52:iconst_0        
	//   31   53:ireturn         
	}

	private static final bic c = new bfs();
	private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
	public int a;
	public int b;

	static 
	{
	//    0    0:new             #15  <Class bfs>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void bfs()>
	//    3    7:putstatic       #20  <Field bic c>
	//    4   10:ldc1            #22  <String "^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})">
	//    5   12:invokestatic    #28  <Method Pattern Pattern.compile(String)>
	//    6   15:putstatic       #30  <Field Pattern d>
	//*   7   18:return          
	}
}
