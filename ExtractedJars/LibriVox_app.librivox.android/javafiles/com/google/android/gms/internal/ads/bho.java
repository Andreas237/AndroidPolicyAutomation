// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfs, bnw

public final class bho extends Exception
{

	public bho(zzfs zzfs1, Throwable throwable, boolean flag, int i)
	{
		String s = String.valueOf(((Object) (zzfs1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method String String.valueOf(Object)>
	//    2    4:astore          5
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 36);
	//    3    6:new             #20  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:aload           5
	//    6   12:invokestatic    #18  <Method String String.valueOf(Object)>
	//    7   15:invokevirtual   #24  <Method int String.length()>
	//    8   18:bipush          36
	//    9   20:iadd            
	//   10   21:invokespecial   #27  <Method void StringBuilder(int)>
	//   11   24:astore          6
		stringbuilder.append("Decoder init failed: [");
	//   12   26:aload           6
	//   13   28:ldc1            #29  <String "Decoder init failed: [">
	//   14   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		stringbuilder.append(i);
	//   16   34:aload           6
	//   17   36:iload           4
	//   18   38:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   19   41:pop             
		stringbuilder.append("], ");
	//   20   42:aload           6
	//   21   44:ldc1            #38  <String "], ">
	//   22   46:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
		stringbuilder.append(s);
	//   24   50:aload           6
	//   25   52:aload           5
	//   26   54:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		super(stringbuilder.toString(), throwable);
	//   28   58:aload_0         
	//   29   59:aload           6
	//   30   61:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   31   64:aload_2         
	//   32   65:invokespecial   #45  <Method void Exception(String, Throwable)>
		a = zzfs1.e;
	//   33   68:aload_0         
	//   34   69:aload_1         
	//   35   70:getfield        #50  <Field String zzfs.e>
	//   36   73:putfield        #52  <Field String a>
		b = false;
	//   37   76:aload_0         
	//   38   77:iconst_0        
	//   39   78:putfield        #54  <Field boolean b>
		c = null;
	//   40   81:aload_0         
	//   41   82:aconst_null     
	//   42   83:putfield        #56  <Field String c>
		if(i < 0)
	//*  43   86:iload           4
	//*  44   88:ifge            97
			zzfs1 = "neg_";
	//   45   91:ldc1            #58  <String "neg_">
	//   46   93:astore_1        
		else
	//*  47   94:goto            100
			zzfs1 = "";
	//   48   97:ldc1            #60  <String "">
	//   49   99:astore_1        
		i = Math.abs(i);
	//   50  100:iload           4
	//   51  102:invokestatic    #66  <Method int Math.abs(int)>
	//   52  105:istore          4
		throwable = ((Throwable) (new StringBuilder(String.valueOf(((Object) (zzfs1))).length() + 64)));
	//   53  107:new             #20  <Class StringBuilder>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:invokestatic    #18  <Method String String.valueOf(Object)>
	//   57  115:invokevirtual   #24  <Method int String.length()>
	//   58  118:bipush          64
	//   59  120:iadd            
	//   60  121:invokespecial   #27  <Method void StringBuilder(int)>
	//   61  124:astore_2        
		((StringBuilder) (throwable)).append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
	//   62  125:aload_2         
	//   63  126:ldc1            #68  <String "com.google.android.exoplayer.MediaCodecTrackRenderer_">
	//   64  128:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
		((StringBuilder) (throwable)).append(((String) (zzfs1)));
	//   66  132:aload_2         
	//   67  133:aload_1         
	//   68  134:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   69  137:pop             
		((StringBuilder) (throwable)).append(i);
	//   70  138:aload_2         
	//   71  139:iload           4
	//   72  141:invokevirtual   #36  <Method StringBuilder StringBuilder.append(int)>
	//   73  144:pop             
		d = ((StringBuilder) (throwable)).toString();
	//   74  145:aload_0         
	//   75  146:aload_2         
	//   76  147:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   77  150:putfield        #70  <Field String d>
	//   78  153:return          
	}

	public bho(zzfs zzfs1, Throwable throwable, boolean flag, String s)
	{
		String s1 = String.valueOf(((Object) (zzfs1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method String String.valueOf(Object)>
	//    2    4:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 23 + String.valueOf(((Object) (s1))).length());
	//    3    6:new             #20  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:aload           4
	//    6   12:invokestatic    #18  <Method String String.valueOf(Object)>
	//    7   15:invokevirtual   #24  <Method int String.length()>
	//    8   18:bipush          23
	//    9   20:iadd            
	//   10   21:aload           6
	//   11   23:invokestatic    #18  <Method String String.valueOf(Object)>
	//   12   26:invokevirtual   #24  <Method int String.length()>
	//   13   29:iadd            
	//   14   30:invokespecial   #27  <Method void StringBuilder(int)>
	//   15   33:astore          7
		stringbuilder.append("Decoder init failed: ");
	//   16   35:aload           7
	//   17   37:ldc1            #74  <String "Decoder init failed: ">
	//   18   39:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
		stringbuilder.append(s);
	//   20   43:aload           7
	//   21   45:aload           4
	//   22   47:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   50:pop             
		stringbuilder.append(", ");
	//   24   51:aload           7
	//   25   53:ldc1            #76  <String ", ">
	//   26   55:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:pop             
		stringbuilder.append(s1);
	//   28   59:aload           7
	//   29   61:aload           6
	//   30   63:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   31   66:pop             
		super(stringbuilder.toString(), throwable);
	//   32   67:aload_0         
	//   33   68:aload           7
	//   34   70:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   35   73:aload_2         
	//   36   74:invokespecial   #45  <Method void Exception(String, Throwable)>
		a = zzfs1.e;
	//   37   77:aload_0         
	//   38   78:aload_1         
	//   39   79:getfield        #50  <Field String zzfs.e>
	//   40   82:putfield        #52  <Field String a>
		b = false;
	//   41   85:aload_0         
	//   42   86:iconst_0        
	//   43   87:putfield        #54  <Field boolean b>
		c = s;
	//   44   90:aload_0         
	//   45   91:aload           4
	//   46   93:putfield        #56  <Field String c>
		int i = bnw.a;
	//   47   96:getstatic       #81  <Field int bnw.a>
	//   48   99:istore          5
		s = null;
	//   49  101:aconst_null     
	//   50  102:astore          4
		zzfs1 = ((zzfs) (s));
	//   51  104:aload           4
	//   52  106:astore_1        
		if(i >= 21)
	//*  53  107:iload           5
	//*  54  109:bipush          21
	//*  55  111:icmplt          132
		{
			zzfs1 = ((zzfs) (s));
	//   56  114:aload           4
	//   57  116:astore_1        
			if(throwable instanceof android.media.MediaCodec.CodecException)
	//*  58  117:aload_2         
	//*  59  118:instanceof      #83  <Class android.media.MediaCodec$CodecException>
	//*  60  121:ifeq            132
				zzfs1 = ((zzfs) (((android.media.MediaCodec.CodecException)throwable).getDiagnosticInfo()));
	//   61  124:aload_2         
	//   62  125:checkcast       #83  <Class android.media.MediaCodec$CodecException>
	//   63  128:invokevirtual   #86  <Method String android.media.MediaCodec$CodecException.getDiagnosticInfo()>
	//   64  131:astore_1        
		}
		d = ((String) (zzfs1));
	//   65  132:aload_0         
	//   66  133:aload_1         
	//   67  134:putfield        #70  <Field String d>
	//   68  137:return          
	}

	private final String a;
	private final boolean b;
	private final String c;
	private final String d;
}
