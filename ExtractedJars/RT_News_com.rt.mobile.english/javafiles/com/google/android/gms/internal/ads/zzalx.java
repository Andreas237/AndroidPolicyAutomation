// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzy, zzae, zzakb, zzama, 
//			zzalt

final class zzalx
	implements zzy
{

	zzalx(zzalt zzalt, String s, zzama zzama1)
	{
		zzcce = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field String zzcce>
		zzctj = zzama1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field zzama zzctj>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zzd(zzae zzae1)
	{
		String s = zzcce;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String zzcce>
	//    2    4:astore_2        
		zzae1 = ((zzae) (zzae1.toString()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method String zzae.toString()>
	//    5    9:astore_1        
		StringBuilder stringbuilder = new StringBuilder(21 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (zzae1))).length());
	//    6   10:new             #30  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:bipush          21
	//    9   16:aload_2         
	//   10   17:invokestatic    #36  <Method String String.valueOf(Object)>
	//   11   20:invokevirtual   #40  <Method int String.length()>
	//   12   23:iadd            
	//   13   24:aload_1         
	//   14   25:invokestatic    #36  <Method String String.valueOf(Object)>
	//   15   28:invokevirtual   #40  <Method int String.length()>
	//   16   31:iadd            
	//   17   32:invokespecial   #43  <Method void StringBuilder(int)>
	//   18   35:astore_3        
		stringbuilder.append("Failed to load URL: ");
	//   19   36:aload_3         
	//   20   37:ldc1            #45  <String "Failed to load URL: ">
	//   21   39:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(s);
	//   23   43:aload_3         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append("\n");
	//   27   49:aload_3         
	//   28   50:ldc1            #51  <String "\n">
	//   29   52:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(((String) (zzae1)));
	//   31   56:aload_3         
	//   32   57:aload_1         
	//   33   58:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
		zzakb.zzdk(stringbuilder.toString());
	//   35   62:aload_3         
	//   36   63:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   37   66:invokestatic    #58  <Method void zzakb.zzdk(String)>
		zzctj.zzb(((Object) (null)));
	//   38   69:aload_0         
	//   39   70:getfield        #16  <Field zzama zzctj>
	//   40   73:aconst_null     
	//   41   74:invokevirtual   #64  <Method void zzama.zzb(Object)>
	//   42   77:return          
	}

	private final String zzcce;
	private final zzama zzctj;
}
