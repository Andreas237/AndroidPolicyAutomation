// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.*;
import java.util.Locale;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			TrackNameProvider

public class DefaultTrackNameProvider
	implements TrackNameProvider
{

	public DefaultTrackNameProvider(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		resources = (Resources)Assertions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #19  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #21  <Class Resources>
	//    6   12:putfield        #23  <Field Resources resources>
	//    7   15:return          
	}

	private String buildAudioChannelString(Format format)
	{
		int i = format.channelCount;
	//    0    0:aload_1         
	//    1    1:getfield        #32  <Field int Format.channelCount>
	//    2    4:istore_2        
		if(i != -1 && i >= 1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          119
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:icmpge          18
	//*   9   15:goto            119
			switch(i)
	//*  10   18:iload_2         
			{
	//*  11   19:tableswitch     1 8: default 64
	//	               1 108
	//	               2 97
	//	               3 64
	//	               4 64
	//	               5 64
	//	               6 86
	//	               7 86
	//	               8 75
			case 3: // '\003'
			case 4: // '\004'
			case 5: // '\005'
			default:
				return resources.getString(R.string.exo_track_surround);
	//   12   64:aload_0         
	//   13   65:getfield        #23  <Field Resources resources>
	//   14   68:getstatic       #37  <Field int R$string.exo_track_surround>
	//   15   71:invokevirtual   #41  <Method String Resources.getString(int)>
	//   16   74:areturn         

			case 8: // '\b'
				return resources.getString(R.string.exo_track_surround_7_point_1);
	//   17   75:aload_0         
	//   18   76:getfield        #23  <Field Resources resources>
	//   19   79:getstatic       #44  <Field int R$string.exo_track_surround_7_point_1>
	//   20   82:invokevirtual   #41  <Method String Resources.getString(int)>
	//   21   85:areturn         

			case 6: // '\006'
			case 7: // '\007'
				return resources.getString(R.string.exo_track_surround_5_point_1);
	//   22   86:aload_0         
	//   23   87:getfield        #23  <Field Resources resources>
	//   24   90:getstatic       #47  <Field int R$string.exo_track_surround_5_point_1>
	//   25   93:invokevirtual   #41  <Method String Resources.getString(int)>
	//   26   96:areturn         

			case 2: // '\002'
				return resources.getString(R.string.exo_track_stereo);
	//   27   97:aload_0         
	//   28   98:getfield        #23  <Field Resources resources>
	//   29  101:getstatic       #50  <Field int R$string.exo_track_stereo>
	//   30  104:invokevirtual   #41  <Method String Resources.getString(int)>
	//   31  107:areturn         

			case 1: // '\001'
				return resources.getString(R.string.exo_track_mono);
	//   32  108:aload_0         
	//   33  109:getfield        #23  <Field Resources resources>
	//   34  112:getstatic       #53  <Field int R$string.exo_track_mono>
	//   35  115:invokevirtual   #41  <Method String Resources.getString(int)>
	//   36  118:areturn         
			}
		else
			return "";
	//   37  119:ldc1            #55  <String "">
	//   38  121:areturn         
	}

	private String buildBitrateString(Format format)
	{
		int i = format.bitrate;
	//    0    0:aload_1         
	//    1    1:getfield        #59  <Field int Format.bitrate>
	//    2    4:istore_2        
		if(i == -1)
	//*   3    5:iload_2         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          13
			return "";
	//    6   10:ldc1            #55  <String "">
	//    7   12:areturn         
		else
			return resources.getString(R.string.exo_track_bitrate, new Object[] {
				Float.valueOf((float)i / 1000000F)
			});
	//    8   13:aload_0         
	//    9   14:getfield        #23  <Field Resources resources>
	//   10   17:getstatic       #62  <Field int R$string.exo_track_bitrate>
	//   11   20:iconst_1        
	//   12   21:anewarray       Object[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:iload_2         
	//   16   27:i2f             
	//   17   28:ldc1            #63  <Float 1000000F>
	//   18   30:fdiv            
	//   19   31:invokestatic    #69  <Method Float Float.valueOf(float)>
	//   20   34:aastore         
	//   21   35:invokevirtual   #72  <Method String Resources.getString(int, Object[])>
	//   22   38:areturn         
	}

	private String buildLanguageString(Format format)
	{
		format = ((Format) (format.language));
	//    0    0:aload_1         
	//    1    1:getfield        #77  <Field String Format.language>
	//    2    4:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (format))) && !"und".equals(((Object) (format))))
	//*   3    5:aload_1         
	//*   4    6:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5    9:ifne            30
	//*   6   12:ldc1            #85  <String "und">
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            24
	//*  10   21:goto            30
			return buildLanguageString(((String) (format)));
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #94  <Method String buildLanguageString(String)>
	//   14   29:areturn         
		else
			return "";
	//   15   30:ldc1            #55  <String "">
	//   16   32:areturn         
	}

	private String buildLanguageString(String s)
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #99  <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          16
			s = ((String) (Locale.forLanguageTag(s)));
	//    3    8:aload_1         
	//    4    9:invokestatic    #105 <Method Locale Locale.forLanguageTag(String)>
	//    5   12:astore_1        
		else
	//*   6   13:goto            25
			s = ((String) (new Locale(s)));
	//    7   16:new             #101 <Class Locale>
	//    8   19:dup             
	//    9   20:aload_1         
	//   10   21:invokespecial   #108 <Method void Locale(String)>
	//   11   24:astore_1        
		return ((Locale) (s)).getDisplayLanguage();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #112 <Method String Locale.getDisplayLanguage()>
	//   14   29:areturn         
	}

	private String buildResolutionString(Format format)
	{
		int i = format.width;
	//    0    0:aload_1         
	//    1    1:getfield        #116 <Field int Format.width>
	//    2    4:istore_2        
		int j = format.height;
	//    3    5:aload_1         
	//    4    6:getfield        #119 <Field int Format.height>
	//    5    9:istore_3        
		if(i != -1 && j != -1)
	//*   6   10:iload_2         
	//*   7   11:iconst_m1       
	//*   8   12:icmpeq          52
	//*   9   15:iload_3         
	//*  10   16:iconst_m1       
	//*  11   17:icmpne          23
	//*  12   20:goto            52
			return resources.getString(R.string.exo_track_resolution, new Object[] {
				Integer.valueOf(i), Integer.valueOf(j)
			});
	//   13   23:aload_0         
	//   14   24:getfield        #23  <Field Resources resources>
	//   15   27:getstatic       #122 <Field int R$string.exo_track_resolution>
	//   16   30:iconst_2        
	//   17   31:anewarray       Object[]
	//   18   34:dup             
	//   19   35:iconst_0        
	//   20   36:iload_2         
	//   21   37:invokestatic    #127 <Method Integer Integer.valueOf(int)>
	//   22   40:aastore         
	//   23   41:dup             
	//   24   42:iconst_1        
	//   25   43:iload_3         
	//   26   44:invokestatic    #127 <Method Integer Integer.valueOf(int)>
	//   27   47:aastore         
	//   28   48:invokevirtual   #72  <Method String Resources.getString(int, Object[])>
	//   29   51:areturn         
		else
			return "";
	//   30   52:ldc1            #55  <String "">
	//   31   54:areturn         
	}

	private static int inferPrimaryTrackType(Format format)
	{
		int i = MimeTypes.getTrackType(format.sampleMimeType);
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field String Format.sampleMimeType>
	//    2    4:invokestatic    #138 <Method int MimeTypes.getTrackType(String)>
	//    3    7:istore_1        
		if(i != -1)
	//*   4    8:iload_1         
	//*   5    9:iconst_m1       
	//*   6   10:icmpeq          15
			return i;
	//    7   13:iload_1         
	//    8   14:ireturn         
		if(MimeTypes.getVideoMediaMimeType(format.codecs) != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #141 <Field String Format.codecs>
	//*  11   19:invokestatic    #144 <Method String MimeTypes.getVideoMediaMimeType(String)>
	//*  12   22:ifnull          27
			return 2;
	//   13   25:iconst_2        
	//   14   26:ireturn         
		if(MimeTypes.getAudioMediaMimeType(format.codecs) != null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #141 <Field String Format.codecs>
	//*  17   31:invokestatic    #147 <Method String MimeTypes.getAudioMediaMimeType(String)>
	//*  18   34:ifnull          39
			return 1;
	//   19   37:iconst_1        
	//   20   38:ireturn         
		if(format.width == -1)
	//*  21   39:aload_0         
	//*  22   40:getfield        #116 <Field int Format.width>
	//*  23   43:iconst_m1       
	//*  24   44:icmpne          79
		{
			if(format.height != -1)
	//*  25   47:aload_0         
	//*  26   48:getfield        #119 <Field int Format.height>
	//*  27   51:iconst_m1       
	//*  28   52:icmpeq          57
				return 2;
	//   29   55:iconst_2        
	//   30   56:ireturn         
			if(format.channelCount == -1)
	//*  31   57:aload_0         
	//*  32   58:getfield        #32  <Field int Format.channelCount>
	//*  33   61:iconst_m1       
	//*  34   62:icmpne          77
				return format.sampleRate == -1 ? -1 : 1;
	//   35   65:aload_0         
	//   36   66:getfield        #150 <Field int Format.sampleRate>
	//   37   69:iconst_m1       
	//   38   70:icmpeq          75
	//   39   73:iconst_1        
	//   40   74:ireturn         
	//   41   75:iconst_m1       
	//   42   76:ireturn         
			else
				return 1;
	//   43   77:iconst_1        
	//   44   78:ireturn         
		} else
		{
			return 2;
	//   45   79:iconst_2        
	//   46   80:ireturn         
		}
	}

	private transient String joinWithSeparator(String as[])
	{
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		String s1 = "";
	//    3    3:ldc1            #55  <String "">
	//    4    5:astore          5
		for(int i = 0; i < j;)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          83
		{
			String s2 = as[i];
	//   10   14:aload_1         
	//   11   15:iload_2         
	//   12   16:aaload          
	//   13   17:astore          6
			String s = s1;
	//   14   19:aload           5
	//   15   21:astore          4
			if(s2.length() > 0)
	//*  16   23:aload           6
	//*  17   25:invokevirtual   #156 <Method int String.length()>
	//*  18   28:ifle            72
				if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  19   31:aload           5
	//*  20   33:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   36:ifeq            46
					s = s2;
	//   22   39:aload           6
	//   23   41:astore          4
				else
	//*  24   43:goto            72
					s = resources.getString(R.string.exo_item_list, new Object[] {
						s1, s2
					});
	//   25   46:aload_0         
	//   26   47:getfield        #23  <Field Resources resources>
	//   27   50:getstatic       #159 <Field int R$string.exo_item_list>
	//   28   53:iconst_2        
	//   29   54:anewarray       Object[]
	//   30   57:dup             
	//   31   58:iconst_0        
	//   32   59:aload           5
	//   33   61:aastore         
	//   34   62:dup             
	//   35   63:iconst_1        
	//   36   64:aload           6
	//   37   66:aastore         
	//   38   67:invokevirtual   #72  <Method String Resources.getString(int, Object[])>
	//   39   70:astore          4
			i++;
	//   40   72:iload_2         
	//   41   73:iconst_1        
	//   42   74:iadd            
	//   43   75:istore_2        
			s1 = s;
	//   44   76:aload           4
	//   45   78:astore          5
		}

	//*  46   80:goto            9
		return s1;
	//   47   83:aload           5
	//   48   85:areturn         
	}

	public String getTrackName(Format format)
	{
		int i = inferPrimaryTrackType(format);
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method int inferPrimaryTrackType(Format)>
	//    2    4:istore_2        
		if(i == 2)
	//*   3    5:iload_2         
	//*   4    6:iconst_2        
	//*   5    7:icmpne          38
			format = ((Format) (joinWithSeparator(new String[] {
				buildResolutionString(format), buildBitrateString(format)
			})));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:anewarray       String[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:invokespecial   #164 <Method String buildResolutionString(Format)>
	//   14   22:aastore         
	//   15   23:dup             
	//   16   24:iconst_1        
	//   17   25:aload_0         
	//   18   26:aload_1         
	//   19   27:invokespecial   #166 <Method String buildBitrateString(Format)>
	//   20   30:aastore         
	//   21   31:invokespecial   #168 <Method String joinWithSeparator(String[])>
	//   22   34:astore_1        
		else
	//*  23   35:goto            85
		if(i == 1)
	//*  24   38:iload_2         
	//*  25   39:iconst_1        
	//*  26   40:icmpne          79
			format = ((Format) (joinWithSeparator(new String[] {
				buildLanguageString(format), buildAudioChannelString(format), buildBitrateString(format)
			})));
	//   27   43:aload_0         
	//   28   44:iconst_3        
	//   29   45:anewarray       String[]
	//   30   48:dup             
	//   31   49:iconst_0        
	//   32   50:aload_0         
	//   33   51:aload_1         
	//   34   52:invokespecial   #170 <Method String buildLanguageString(Format)>
	//   35   55:aastore         
	//   36   56:dup             
	//   37   57:iconst_1        
	//   38   58:aload_0         
	//   39   59:aload_1         
	//   40   60:invokespecial   #172 <Method String buildAudioChannelString(Format)>
	//   41   63:aastore         
	//   42   64:dup             
	//   43   65:iconst_2        
	//   44   66:aload_0         
	//   45   67:aload_1         
	//   46   68:invokespecial   #166 <Method String buildBitrateString(Format)>
	//   47   71:aastore         
	//   48   72:invokespecial   #168 <Method String joinWithSeparator(String[])>
	//   49   75:astore_1        
		else
	//*  50   76:goto            85
			format = ((Format) (buildLanguageString(format)));
	//   51   79:aload_0         
	//   52   80:aload_1         
	//   53   81:invokespecial   #170 <Method String buildLanguageString(Format)>
	//   54   84:astore_1        
		Object obj = ((Object) (format));
	//   55   85:aload_1         
	//   56   86:astore_3        
		if(((String) (format)).length() == 0)
	//*  57   87:aload_1         
	//*  58   88:invokevirtual   #156 <Method int String.length()>
	//*  59   91:ifne            105
			obj = ((Object) (resources.getString(R.string.exo_track_unknown)));
	//   60   94:aload_0         
	//   61   95:getfield        #23  <Field Resources resources>
	//   62   98:getstatic       #175 <Field int R$string.exo_track_unknown>
	//   63  101:invokevirtual   #41  <Method String Resources.getString(int)>
	//   64  104:astore_3        
		return ((String) (obj));
	//   65  105:aload_3         
	//   66  106:areturn         
	}

	private final Resources resources;
}
