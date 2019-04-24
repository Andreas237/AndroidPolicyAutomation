// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaiy, zznk, zzkb, zzni, 
//			zzakk

public final class zzajb
{

	public static Uri zzb(Uri uri, Context context)
	{
		Uri uri1 = uri;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(zzbv.zzfh().zzx(context))
	//*   2    2:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #19  <Method boolean zzaiy.zzx(Context)>
	//*   5    9:ifeq            53
		{
			uri1 = uri;
	//    6   12:aload_0         
	//    7   13:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (uri.getQueryParameter("fbs_aeid")))))
	//*   8   14:aload_0         
	//*   9   15:ldc1            #21  <String "fbs_aeid">
	//*  10   17:invokevirtual   #27  <Method String Uri.getQueryParameter(String)>
	//*  11   20:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   23:ifeq            53
			{
				String s = zzbv.zzfh().zzab(context);
	//   13   26:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   14   29:aload_1         
	//   15   30:invokevirtual   #37  <Method String zzaiy.zzab(Context)>
	//   16   33:astore_3        
				uri1 = zzb(uri.toString(), "fbs_aeid", s);
	//   17   34:aload_0         
	//   18   35:invokevirtual   #41  <Method String Uri.toString()>
	//   19   38:ldc1            #21  <String "fbs_aeid">
	//   20   40:aload_3         
	//   21   41:invokestatic    #44  <Method Uri zzb(String, String, String)>
	//   22   44:astore_2        
				zzbv.zzfh().zze(context, s);
	//   23   45:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   24   48:aload_1         
	//   25   49:aload_3         
	//   26   50:invokevirtual   #48  <Method void zzaiy.zze(Context, String)>
			}
		}
		return uri1;
	//   27   53:aload_2         
	//   28   54:areturn         
	}

	private static Uri zzb(String s, String s1, String s2)
	{
		int j = s.indexOf("&adurl");
	//    0    0:aload_0         
	//    1    1:ldc1            #52  <String "&adurl">
	//    2    3:invokevirtual   #58  <Method int String.indexOf(String)>
	//    3    6:istore          4
		int i = j;
	//    4    8:iload           4
	//    5   10:istore_3        
		if(j == -1)
	//*   6   11:iload           4
	//*   7   13:iconst_m1       
	//*   8   14:icmpne          24
			i = s.indexOf("?adurl");
	//    9   17:aload_0         
	//   10   18:ldc1            #60  <String "?adurl">
	//   11   20:invokevirtual   #58  <Method int String.indexOf(String)>
	//   12   23:istore_3        
		if(i != -1)
	//*  13   24:iload_3         
	//*  14   25:iconst_m1       
	//*  15   26:icmpeq          98
		{
			i++;
	//   16   29:iload_3         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:istore_3        
			StringBuilder stringbuilder = new StringBuilder(s.substring(0, i));
	//   20   33:new             #62  <Class StringBuilder>
	//   21   36:dup             
	//   22   37:aload_0         
	//   23   38:iconst_0        
	//   24   39:iload_3         
	//   25   40:invokevirtual   #66  <Method String String.substring(int, int)>
	//   26   43:invokespecial   #70  <Method void StringBuilder(String)>
	//   27   46:astore          5
			stringbuilder.append(s1);
	//   28   48:aload           5
	//   29   50:aload_1         
	//   30   51:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   31   54:pop             
			stringbuilder.append("=");
	//   32   55:aload           5
	//   33   57:ldc1            #76  <String "=">
	//   34   59:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   35   62:pop             
			stringbuilder.append(s2);
	//   36   63:aload           5
	//   37   65:aload_2         
	//   38   66:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   39   69:pop             
			stringbuilder.append("&");
	//   40   70:aload           5
	//   41   72:ldc1            #78  <String "&">
	//   42   74:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			stringbuilder.append(s.substring(i));
	//   44   78:aload           5
	//   45   80:aload_0         
	//   46   81:iload_3         
	//   47   82:invokevirtual   #81  <Method String String.substring(int)>
	//   48   85:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   49   88:pop             
			return Uri.parse(stringbuilder.toString());
	//   50   89:aload           5
	//   51   91:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   52   94:invokestatic    #86  <Method Uri Uri.parse(String)>
	//   53   97:areturn         
		} else
		{
			return Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build();
	//   54   98:aload_0         
	//   55   99:invokestatic    #86  <Method Uri Uri.parse(String)>
	//   56  102:invokevirtual   #90  <Method android.net.Uri$Builder Uri.buildUpon()>
	//   57  105:aload_1         
	//   58  106:aload_2         
	//   59  107:invokevirtual   #96  <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   60  110:invokevirtual   #100 <Method Uri android.net.Uri$Builder.build()>
	//   61  113:areturn         
		}
	}

	public static String zzb(String s, Context context)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(zzbv.zzfh().zzs(context))
	//*   2    2:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #105 <Method boolean zzaiy.zzs(Context)>
	//*   5    9:ifeq            207
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   6   12:aload_0         
	//*   7   13:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            21
				return s;
	//    9   19:aload_0         
	//   10   20:areturn         
			String s1 = zzbv.zzfh().zzab(context);
	//   11   21:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #37  <Method String zzaiy.zzab(Context)>
	//   14   28:astore_3        
			if(s1 == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       35
				return s;
	//   17   33:aload_0         
	//   18   34:areturn         
			obj = ((Object) (zznk.zzaxr));
	//   19   35:getstatic       #111 <Field zzna zznk.zzaxr>
	//   20   38:astore_2        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  21   39:invokestatic    #117 <Method zzni zzkb.zzik()>
	//*  22   42:aload_2         
	//*  23   43:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//*  24   46:checkcast       #125 <Class Boolean>
	//*  25   49:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//*  26   52:ifeq            136
			{
				obj = ((Object) (zznk.zzaxs));
	//   27   55:getstatic       #132 <Field zzna zznk.zzaxs>
	//   28   58:astore_2        
				String s2 = (String)zzkb.zzik().zzd(((zzna) (obj)));
	//   29   59:invokestatic    #117 <Method zzni zzkb.zzik()>
	//   30   62:aload_2         
	//   31   63:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//   32   66:checkcast       #54  <Class String>
	//   33   69:astore          4
				obj = ((Object) (s));
	//   34   71:aload_0         
	//   35   72:astore_2        
				if(s.contains(((CharSequence) (s2))))
	//*  36   73:aload_0         
	//*  37   74:aload           4
	//*  38   76:invokevirtual   #135 <Method boolean String.contains(CharSequence)>
	//*  39   79:ifeq            207
				{
					if(zzbv.zzek().zzcx(s))
	//*  40   82:invokestatic    #139 <Method zzakk zzbv.zzek()>
	//*  41   85:aload_0         
	//*  42   86:invokevirtual   #145 <Method boolean zzakk.zzcx(String)>
	//*  43   89:ifeq            108
					{
						zzbv.zzfh().zze(context, s1);
	//   44   92:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   45   95:aload_1         
	//   46   96:aload_3         
	//   47   97:invokevirtual   #48  <Method void zzaiy.zze(Context, String)>
						return s.replace(((CharSequence) (s2)), ((CharSequence) (s1)));
	//   48  100:aload_0         
	//   49  101:aload           4
	//   50  103:aload_3         
	//   51  104:invokevirtual   #149 <Method String String.replace(CharSequence, CharSequence)>
	//   52  107:areturn         
					}
					obj = ((Object) (s));
	//   53  108:aload_0         
	//   54  109:astore_2        
					if(zzbv.zzek().zzcy(s))
	//*  55  110:invokestatic    #139 <Method zzakk zzbv.zzek()>
	//*  56  113:aload_0         
	//*  57  114:invokevirtual   #152 <Method boolean zzakk.zzcy(String)>
	//*  58  117:ifeq            207
					{
						zzbv.zzfh().zzf(context, s1);
	//   59  120:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   60  123:aload_1         
	//   61  124:aload_3         
	//   62  125:invokevirtual   #155 <Method void zzaiy.zzf(Context, String)>
						return s.replace(((CharSequence) (s2)), ((CharSequence) (s1)));
	//   63  128:aload_0         
	//   64  129:aload           4
	//   65  131:aload_3         
	//   66  132:invokevirtual   #149 <Method String String.replace(CharSequence, CharSequence)>
	//   67  135:areturn         
					}
				}
			} else
			{
				obj = ((Object) (s));
	//   68  136:aload_0         
	//   69  137:astore_2        
				if(!s.contains("fbs_aeid"))
	//*  70  138:aload_0         
	//*  71  139:ldc1            #21  <String "fbs_aeid">
	//*  72  141:invokevirtual   #135 <Method boolean String.contains(CharSequence)>
	//*  73  144:ifne            207
				{
					if(zzbv.zzek().zzcx(s))
	//*  74  147:invokestatic    #139 <Method zzakk zzbv.zzek()>
	//*  75  150:aload_0         
	//*  76  151:invokevirtual   #145 <Method boolean zzakk.zzcx(String)>
	//*  77  154:ifeq            176
					{
						zzbv.zzfh().zze(context, s1);
	//   78  157:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   79  160:aload_1         
	//   80  161:aload_3         
	//   81  162:invokevirtual   #48  <Method void zzaiy.zze(Context, String)>
						return zzb(s, "fbs_aeid", s1).toString();
	//   82  165:aload_0         
	//   83  166:ldc1            #21  <String "fbs_aeid">
	//   84  168:aload_3         
	//   85  169:invokestatic    #44  <Method Uri zzb(String, String, String)>
	//   86  172:invokevirtual   #41  <Method String Uri.toString()>
	//   87  175:areturn         
					}
					obj = ((Object) (s));
	//   88  176:aload_0         
	//   89  177:astore_2        
					if(zzbv.zzek().zzcy(s))
	//*  90  178:invokestatic    #139 <Method zzakk zzbv.zzek()>
	//*  91  181:aload_0         
	//*  92  182:invokevirtual   #152 <Method boolean zzakk.zzcy(String)>
	//*  93  185:ifeq            207
					{
						zzbv.zzfh().zzf(context, s1);
	//   94  188:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   95  191:aload_1         
	//   96  192:aload_3         
	//   97  193:invokevirtual   #155 <Method void zzaiy.zzf(Context, String)>
						obj = ((Object) (zzb(s, "fbs_aeid", s1).toString()));
	//   98  196:aload_0         
	//   99  197:ldc1            #21  <String "fbs_aeid">
	//  100  199:aload_3         
	//  101  200:invokestatic    #44  <Method Uri zzb(String, String, String)>
	//  102  203:invokevirtual   #41  <Method String Uri.toString()>
	//  103  206:astore_2        
					}
				}
			}
		}
		return ((String) (obj));
	//  104  207:aload_2         
	//  105  208:areturn         
	}

	public static String zzc(String s, Context context)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(zzbv.zzfh().zzs(context))
	//*   2    2:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #105 <Method boolean zzaiy.zzs(Context)>
	//*   5    9:ifeq            121
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   6   12:aload_0         
	//*   7   13:invokestatic    #33  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            21
				return s;
	//    9   19:aload_0         
	//   10   20:areturn         
			context = ((Context) (zzbv.zzfh().zzab(context)));
	//   11   21:invokestatic    #13  <Method zzaiy zzbv.zzfh()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #37  <Method String zzaiy.zzab(Context)>
	//   14   28:astore_1        
			if(context == null)
	//*  15   29:aload_1         
	//*  16   30:ifnonnull       35
				return s;
	//   17   33:aload_0         
	//   18   34:areturn         
			if(!zzbv.zzek().zzcy(s))
	//*  19   35:invokestatic    #139 <Method zzakk zzbv.zzek()>
	//*  20   38:aload_0         
	//*  21   39:invokevirtual   #152 <Method boolean zzakk.zzcy(String)>
	//*  22   42:ifne            47
				return s;
	//   23   45:aload_0         
	//   24   46:areturn         
			obj = ((Object) (zznk.zzaxr));
	//   25   47:getstatic       #111 <Field zzna zznk.zzaxr>
	//   26   50:astore_2        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  27   51:invokestatic    #117 <Method zzni zzkb.zzik()>
	//*  28   54:aload_2         
	//*  29   55:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//*  30   58:checkcast       #125 <Class Boolean>
	//*  31   61:invokevirtual   #129 <Method boolean Boolean.booleanValue()>
	//*  32   64:ifeq            99
			{
				obj = ((Object) (zznk.zzaxs));
	//   33   67:getstatic       #132 <Field zzna zznk.zzaxs>
	//   34   70:astore_2        
				String s1 = (String)zzkb.zzik().zzd(((zzna) (obj)));
	//   35   71:invokestatic    #117 <Method zzni zzkb.zzik()>
	//   36   74:aload_2         
	//   37   75:invokevirtual   #123 <Method Object zzni.zzd(zzna)>
	//   38   78:checkcast       #54  <Class String>
	//   39   81:astore_3        
				obj = ((Object) (s));
	//   40   82:aload_0         
	//   41   83:astore_2        
				if(s.contains(((CharSequence) (s1))))
	//*  42   84:aload_0         
	//*  43   85:aload_3         
	//*  44   86:invokevirtual   #135 <Method boolean String.contains(CharSequence)>
	//*  45   89:ifeq            121
					return s.replace(((CharSequence) (s1)), ((CharSequence) (context)));
	//   46   92:aload_0         
	//   47   93:aload_3         
	//   48   94:aload_1         
	//   49   95:invokevirtual   #149 <Method String String.replace(CharSequence, CharSequence)>
	//   50   98:areturn         
			} else
			{
				obj = ((Object) (s));
	//   51   99:aload_0         
	//   52  100:astore_2        
				if(!s.contains("fbs_aeid"))
	//*  53  101:aload_0         
	//*  54  102:ldc1            #21  <String "fbs_aeid">
	//*  55  104:invokevirtual   #135 <Method boolean String.contains(CharSequence)>
	//*  56  107:ifne            121
					obj = ((Object) (zzb(s, "fbs_aeid", ((String) (context))).toString()));
	//   57  110:aload_0         
	//   58  111:ldc1            #21  <String "fbs_aeid">
	//   59  113:aload_1         
	//   60  114:invokestatic    #44  <Method Uri zzb(String, String, String)>
	//   61  117:invokevirtual   #41  <Method String Uri.toString()>
	//   62  120:astore_2        
			}
		}
		return ((String) (obj));
	//   63  121:aload_2         
	//   64  122:areturn         
	}
}
