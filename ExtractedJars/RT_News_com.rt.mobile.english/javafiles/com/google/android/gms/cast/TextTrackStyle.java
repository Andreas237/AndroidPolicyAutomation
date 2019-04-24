// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzcu;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzbr

public final class TextTrackStyle extends AbstractSafeParcelable
{

	public TextTrackStyle()
	{
		this(1.0F, 0, 0, -1, 0, -1, 0, 0, ((String) (null)), -1, -1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_m1       
	//    5    5:iconst_0        
	//    6    6:iconst_m1       
	//    7    7:iconst_0        
	//    8    8:iconst_0        
	//    9    9:aconst_null     
	//   10   10:iconst_m1       
	//   11   11:iconst_m1       
	//   12   12:aconst_null     
	//   13   13:invokespecial   #97  <Method void TextTrackStyle(float, int, int, int, int, int, int, int, String, int, int, String)>
	//   14   16:return          
	}

	TextTrackStyle(float f, int i, int j, int k, int l, int i1, int j1, 
			int k1, String s, int l1, int i2, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void AbstractSafeParcelable()>
		fontScale = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #104 <Field float fontScale>
		foregroundColor = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #106 <Field int foregroundColor>
		backgroundColor = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #108 <Field int backgroundColor>
		edgeType = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #110 <Field int edgeType>
		edgeColor = l;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #112 <Field int edgeColor>
		zzgh = i1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #114 <Field int zzgh>
		windowColor = j1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #116 <Field int windowColor>
		zzgi = k1;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #118 <Field int zzgi>
		zzgj = s;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #120 <Field String zzgj>
		zzgk = l1;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #122 <Field int zzgk>
		fontStyle = i2;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #124 <Field int fontStyle>
		zzj = s1;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #126 <Field String zzj>
		if(zzj != null)
	//*  38   73:aload_0         
	//*  39   74:getfield        #126 <Field String zzj>
	//*  40   77:ifnull          107
		{
			try
			{
				zzp = new JSONObject(zzj);
	//   41   80:aload_0         
	//   42   81:new             #128 <Class JSONObject>
	//   43   84:dup             
	//   44   85:aload_0         
	//   45   86:getfield        #126 <Field String zzj>
	//   46   89:invokespecial   #131 <Method void JSONObject(String)>
	//   47   92:putfield        #133 <Field JSONObject zzp>
				return;
	//   48   95:return          
			}
	//*  49   96:aload_0         
	//*  50   97:aconst_null     
	//*  51   98:putfield        #133 <Field JSONObject zzp>
	//*  52  101:aload_0         
	//*  53  102:aconst_null     
	//*  54  103:putfield        #126 <Field String zzj>
	//*  55  106:return          
	//*  56  107:aload_0         
	//*  57  108:aconst_null     
	//*  58  109:putfield        #133 <Field JSONObject zzp>
	//*  59  112:return          
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				zzp = null;
			}
			zzj = null;
			return;
		} else
		{
			zzp = null;
			return;
		}
	//*  60  113:astore          9
	//*  61  115:goto            96
	}

	public static TextTrackStyle fromSystemSettings(Context context)
	{
		TextTrackStyle texttrackstyle = new TextTrackStyle();
	//    0    0:new             #2   <Class TextTrackStyle>
	//    1    3:dup             
	//    2    4:invokespecial   #140 <Method void TextTrackStyle()>
	//    3    7:astore_3        
		if(!PlatformVersion.isAtLeastKitKat())
	//*   4    8:invokestatic    #146 <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*   5   11:ifne            16
			return texttrackstyle;
	//    6   14:aload_3         
	//    7   15:areturn         
		context = ((Context) ((CaptioningManager)context.getSystemService("captioning")));
	//    8   16:aload_0         
	//    9   17:ldc1            #148 <String "captioning">
	//   10   19:invokevirtual   #154 <Method Object Context.getSystemService(String)>
	//   11   22:checkcast       #156 <Class CaptioningManager>
	//   12   25:astore_0        
		texttrackstyle.setFontScale(((CaptioningManager) (context)).getFontScale());
	//   13   26:aload_3         
	//   14   27:aload_0         
	//   15   28:invokevirtual   #159 <Method float CaptioningManager.getFontScale()>
	//   16   31:invokevirtual   #163 <Method void setFontScale(float)>
		context = ((Context) (((CaptioningManager) (context)).getUserStyle()));
	//   17   34:aload_0         
	//   18   35:invokevirtual   #167 <Method android.view.accessibility.CaptioningManager$CaptionStyle CaptioningManager.getUserStyle()>
	//   19   38:astore_0        
		texttrackstyle.setBackgroundColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).backgroundColor);
	//   20   39:aload_3         
	//   21   40:aload_0         
	//   22   41:getfield        #170 <Field int android.view.accessibility.CaptioningManager$CaptionStyle.backgroundColor>
	//   23   44:invokevirtual   #174 <Method void setBackgroundColor(int)>
		texttrackstyle.setForegroundColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).foregroundColor);
	//   24   47:aload_3         
	//   25   48:aload_0         
	//   26   49:getfield        #175 <Field int android.view.accessibility.CaptioningManager$CaptionStyle.foregroundColor>
	//   27   52:invokevirtual   #178 <Method void setForegroundColor(int)>
		switch(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).edgeType)
	//*  28   55:aload_0         
	//*  29   56:getfield        #179 <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeType>
		{
	//*  30   59:tableswitch     1 2: default 80
	//	               1 96
	//	               2 88
		default:
			texttrackstyle.setEdgeType(0);
	//   31   80:aload_3         
	//   32   81:iconst_0        
	//   33   82:invokevirtual   #182 <Method void setEdgeType(int)>
			break;

	//*  34   85:goto            101
		case 2: // '\002'
			texttrackstyle.setEdgeType(2);
	//   35   88:aload_3         
	//   36   89:iconst_2        
	//   37   90:invokevirtual   #182 <Method void setEdgeType(int)>
			break;

	//*  38   93:goto            101
		case 1: // '\001'
			texttrackstyle.setEdgeType(1);
	//   39   96:aload_3         
	//   40   97:iconst_1        
	//   41   98:invokevirtual   #182 <Method void setEdgeType(int)>
			break;
		}
		texttrackstyle.setEdgeColor(((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).edgeColor);
	//   42  101:aload_3         
	//   43  102:aload_0         
	//   44  103:getfield        #183 <Field int android.view.accessibility.CaptioningManager$CaptionStyle.edgeColor>
	//   45  106:invokevirtual   #186 <Method void setEdgeColor(int)>
		context = ((Context) (((android.view.accessibility.CaptioningManager.CaptionStyle) (context)).getTypeface()));
	//   46  109:aload_0         
	//   47  110:invokevirtual   #190 <Method Typeface android.view.accessibility.CaptioningManager$CaptionStyle.getTypeface()>
	//   48  113:astore_0        
		if(context != null)
	//*  49  114:aload_0         
	//*  50  115:ifnull          221
		{
			if(Typeface.MONOSPACE.equals(((Object) (context))))
	//*  51  118:getstatic       #196 <Field Typeface Typeface.MONOSPACE>
	//*  52  121:aload_0         
	//*  53  122:invokevirtual   #200 <Method boolean Typeface.equals(Object)>
	//*  54  125:ifeq            136
				texttrackstyle.setFontGenericFamily(1);
	//   55  128:aload_3         
	//   56  129:iconst_1        
	//   57  130:invokevirtual   #203 <Method void setFontGenericFamily(int)>
			else
	//*  58  133:goto            169
			if(!Typeface.SANS_SERIF.equals(((Object) (context))) && Typeface.SERIF.equals(((Object) (context))))
	//*  59  136:getstatic       #206 <Field Typeface Typeface.SANS_SERIF>
	//*  60  139:aload_0         
	//*  61  140:invokevirtual   #200 <Method boolean Typeface.equals(Object)>
	//*  62  143:ifne            164
	//*  63  146:getstatic       #209 <Field Typeface Typeface.SERIF>
	//*  64  149:aload_0         
	//*  65  150:invokevirtual   #200 <Method boolean Typeface.equals(Object)>
	//*  66  153:ifeq            164
				texttrackstyle.setFontGenericFamily(2);
	//   67  156:aload_3         
	//   68  157:iconst_2        
	//   69  158:invokevirtual   #203 <Method void setFontGenericFamily(int)>
			else
	//*  70  161:goto            169
				texttrackstyle.setFontGenericFamily(0);
	//   71  164:aload_3         
	//   72  165:iconst_0        
	//   73  166:invokevirtual   #203 <Method void setFontGenericFamily(int)>
			boolean flag = ((Typeface) (context)).isBold();
	//   74  169:aload_0         
	//   75  170:invokevirtual   #212 <Method boolean Typeface.isBold()>
	//   76  173:istore_1        
			boolean flag1 = ((Typeface) (context)).isItalic();
	//   77  174:aload_0         
	//   78  175:invokevirtual   #215 <Method boolean Typeface.isItalic()>
	//   79  178:istore_2        
			if(flag && flag1)
	//*  80  179:iload_1         
	//*  81  180:ifeq            194
	//*  82  183:iload_2         
	//*  83  184:ifeq            194
			{
				texttrackstyle.setFontStyle(3);
	//   84  187:aload_3         
	//   85  188:iconst_3        
	//   86  189:invokevirtual   #218 <Method void setFontStyle(int)>
				return texttrackstyle;
	//   87  192:aload_3         
	//   88  193:areturn         
			}
			if(flag)
	//*  89  194:iload_1         
	//*  90  195:ifeq            205
			{
				texttrackstyle.setFontStyle(1);
	//   91  198:aload_3         
	//   92  199:iconst_1        
	//   93  200:invokevirtual   #218 <Method void setFontStyle(int)>
				return texttrackstyle;
	//   94  203:aload_3         
	//   95  204:areturn         
			}
			if(flag1)
	//*  96  205:iload_2         
	//*  97  206:ifeq            216
			{
				texttrackstyle.setFontStyle(2);
	//   98  209:aload_3         
	//   99  210:iconst_2        
	//  100  211:invokevirtual   #218 <Method void setFontStyle(int)>
				return texttrackstyle;
	//  101  214:aload_3         
	//  102  215:areturn         
			}
			texttrackstyle.setFontStyle(0);
	//  103  216:aload_3         
	//  104  217:iconst_0        
	//  105  218:invokevirtual   #218 <Method void setFontStyle(int)>
		}
		return texttrackstyle;
	//  106  221:aload_3         
	//  107  222:areturn         
	}

	private static String zzd(int i)
	{
		return String.format("#%02X%02X%02X%02X", new Object[] {
			Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i))
		});
	//    0    0:ldc1            #222 <String "#%02X%02X%02X%02X">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:iload_0         
	//    6    9:invokestatic    #230 <Method int Color.red(int)>
	//    7   12:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:iload_0         
	//   12   19:invokestatic    #239 <Method int Color.green(int)>
	//   13   22:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:iload_0         
	//   18   29:invokestatic    #242 <Method int Color.blue(int)>
	//   19   32:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:iload_0         
	//   24   39:invokestatic    #245 <Method int Color.alpha(int)>
	//   25   42:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   26   45:aastore         
	//   27   46:invokestatic    #251 <Method String String.format(String, Object[])>
	//   28   49:areturn         
	}

	private static int zzh(String s)
	{
		if(s != null && s.length() == 9 && s.charAt(0) == '#')
	//*   0    0:aload_0         
	//*   1    1:ifnull          82
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #259 <Method int String.length()>
	//*   4    8:bipush          9
	//*   5   10:icmpne          82
	//*   6   13:aload_0         
	//*   7   14:iconst_0        
	//*   8   15:invokevirtual   #263 <Method char String.charAt(int)>
	//*   9   18:bipush          35
	//*  10   20:icmpne          82
		{
			int i;
			try
			{
				i = Integer.parseInt(s.substring(1, 3), 16);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:iconst_3        
	//   14   26:invokevirtual   #267 <Method String String.substring(int, int)>
	//   15   29:bipush          16
	//   16   31:invokestatic    #271 <Method int Integer.parseInt(String, int)>
	//   17   34:istore_1        
				int j = Integer.parseInt(s.substring(3, 5), 16);
	//   18   35:aload_0         
	//   19   36:iconst_3        
	//   20   37:iconst_5        
	//   21   38:invokevirtual   #267 <Method String String.substring(int, int)>
	//   22   41:bipush          16
	//   23   43:invokestatic    #271 <Method int Integer.parseInt(String, int)>
	//   24   46:istore_2        
				int k = Integer.parseInt(s.substring(5, 7), 16);
	//   25   47:aload_0         
	//   26   48:iconst_5        
	//   27   49:bipush          7
	//   28   51:invokevirtual   #267 <Method String String.substring(int, int)>
	//   29   54:bipush          16
	//   30   56:invokestatic    #271 <Method int Integer.parseInt(String, int)>
	//   31   59:istore_3        
				i = Color.argb(Integer.parseInt(s.substring(7, 9), 16), i, j, k);
	//   32   60:aload_0         
	//   33   61:bipush          7
	//   34   63:bipush          9
	//   35   65:invokevirtual   #267 <Method String String.substring(int, int)>
	//   36   68:bipush          16
	//   37   70:invokestatic    #271 <Method int Integer.parseInt(String, int)>
	//   38   73:iload_1         
	//   39   74:iload_2         
	//   40   75:iload_3         
	//   41   76:invokestatic    #275 <Method int Color.argb(int, int, int, int)>
	//   42   79:istore_1        
			}
	//*  43   80:iload_1         
	//*  44   81:ireturn         
	//*  45   82:iconst_0        
	//*  46   83:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  47   84:astore_0        
			{
				return 0;
	//   48   85:iconst_0        
	//   49   86:ireturn         
			}
			return i;
		} else
		{
			return 0;
		}
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof TextTrackStyle))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class TextTrackStyle>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((TextTrackStyle)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class TextTrackStyle>
	//   12   20:astore_1        
		boolean flag;
		if(zzp == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #133 <Field JSONObject zzp>
	//*  15   25:ifnonnull       33
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore_2        
		else
	//*  18   30:goto            35
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		boolean flag1;
		if(((TextTrackStyle) (obj)).zzp == null)
	//*  21   35:aload_1         
	//*  22   36:getfield        #133 <Field JSONObject zzp>
	//*  23   39:ifnonnull       47
			flag1 = true;
	//   24   42:iconst_1        
	//   25   43:istore_3        
		else
	//*  26   44:goto            49
			flag1 = false;
	//   27   47:iconst_0        
	//   28   48:istore_3        
		if(flag != flag1)
	//*  29   49:iload_2         
	//*  30   50:iload_3         
	//*  31   51:icmpeq          56
			return false;
	//   32   54:iconst_0        
	//   33   55:ireturn         
		if(zzp != null && ((TextTrackStyle) (obj)).zzp != null && !JsonUtils.areJsonValuesEquivalent(((Object) (zzp)), ((Object) (((TextTrackStyle) (obj)).zzp))))
	//*  34   56:aload_0         
	//*  35   57:getfield        #133 <Field JSONObject zzp>
	//*  36   60:ifnull          86
	//*  37   63:aload_1         
	//*  38   64:getfield        #133 <Field JSONObject zzp>
	//*  39   67:ifnull          86
	//*  40   70:aload_0         
	//*  41   71:getfield        #133 <Field JSONObject zzp>
	//*  42   74:aload_1         
	//*  43   75:getfield        #133 <Field JSONObject zzp>
	//*  44   78:invokestatic    #281 <Method boolean JsonUtils.areJsonValuesEquivalent(Object, Object)>
	//*  45   81:ifne            86
			return false;
	//   46   84:iconst_0        
	//   47   85:ireturn         
		return fontScale == ((TextTrackStyle) (obj)).fontScale && foregroundColor == ((TextTrackStyle) (obj)).foregroundColor && backgroundColor == ((TextTrackStyle) (obj)).backgroundColor && edgeType == ((TextTrackStyle) (obj)).edgeType && edgeColor == ((TextTrackStyle) (obj)).edgeColor && zzgh == ((TextTrackStyle) (obj)).zzgh && zzgi == ((TextTrackStyle) (obj)).zzgi && zzcu.zza(((Object) (zzgj)), ((Object) (((TextTrackStyle) (obj)).zzgj))) && zzgk == ((TextTrackStyle) (obj)).zzgk && fontStyle == ((TextTrackStyle) (obj)).fontStyle;
	//   48   86:aload_0         
	//   49   87:getfield        #104 <Field float fontScale>
	//   50   90:aload_1         
	//   51   91:getfield        #104 <Field float fontScale>
	//   52   94:fcmpl           
	//   53   95:ifne            202
	//   54   98:aload_0         
	//   55   99:getfield        #106 <Field int foregroundColor>
	//   56  102:aload_1         
	//   57  103:getfield        #106 <Field int foregroundColor>
	//   58  106:icmpne          202
	//   59  109:aload_0         
	//   60  110:getfield        #108 <Field int backgroundColor>
	//   61  113:aload_1         
	//   62  114:getfield        #108 <Field int backgroundColor>
	//   63  117:icmpne          202
	//   64  120:aload_0         
	//   65  121:getfield        #110 <Field int edgeType>
	//   66  124:aload_1         
	//   67  125:getfield        #110 <Field int edgeType>
	//   68  128:icmpne          202
	//   69  131:aload_0         
	//   70  132:getfield        #112 <Field int edgeColor>
	//   71  135:aload_1         
	//   72  136:getfield        #112 <Field int edgeColor>
	//   73  139:icmpne          202
	//   74  142:aload_0         
	//   75  143:getfield        #114 <Field int zzgh>
	//   76  146:aload_1         
	//   77  147:getfield        #114 <Field int zzgh>
	//   78  150:icmpne          202
	//   79  153:aload_0         
	//   80  154:getfield        #118 <Field int zzgi>
	//   81  157:aload_1         
	//   82  158:getfield        #118 <Field int zzgi>
	//   83  161:icmpne          202
	//   84  164:aload_0         
	//   85  165:getfield        #120 <Field String zzgj>
	//   86  168:aload_1         
	//   87  169:getfield        #120 <Field String zzgj>
	//   88  172:invokestatic    #286 <Method boolean zzcu.zza(Object, Object)>
	//   89  175:ifeq            202
	//   90  178:aload_0         
	//   91  179:getfield        #122 <Field int zzgk>
	//   92  182:aload_1         
	//   93  183:getfield        #122 <Field int zzgk>
	//   94  186:icmpne          202
	//   95  189:aload_0         
	//   96  190:getfield        #124 <Field int fontStyle>
	//   97  193:aload_1         
	//   98  194:getfield        #124 <Field int fontStyle>
	//   99  197:icmpne          202
	//  100  200:iconst_1        
	//  101  201:ireturn         
	//  102  202:iconst_0        
	//  103  203:ireturn         
	}

	public final int getBackgroundColor()
	{
		return backgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field int backgroundColor>
	//    2    4:ireturn         
	}

	public final JSONObject getCustomData()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field JSONObject zzp>
	//    2    4:areturn         
	}

	public final int getEdgeColor()
	{
		return edgeColor;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int edgeColor>
	//    2    4:ireturn         
	}

	public final int getEdgeType()
	{
		return edgeType;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field int edgeType>
	//    2    4:ireturn         
	}

	public final String getFontFamily()
	{
		return zzgj;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field String zzgj>
	//    2    4:areturn         
	}

	public final int getFontGenericFamily()
	{
		return zzgk;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field int zzgk>
	//    2    4:ireturn         
	}

	public final float getFontScale()
	{
		return fontScale;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field float fontScale>
	//    2    4:freturn         
	}

	public final int getFontStyle()
	{
		return fontStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int fontStyle>
	//    2    4:ireturn         
	}

	public final int getForegroundColor()
	{
		return foregroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int foregroundColor>
	//    2    4:ireturn         
	}

	public final int getWindowColor()
	{
		return windowColor;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int windowColor>
	//    2    4:ireturn         
	}

	public final int getWindowCornerRadius()
	{
		return zzgi;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int zzgi>
	//    2    4:ireturn         
	}

	public final int getWindowType()
	{
		return zzgh;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field int zzgh>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Float.valueOf(fontScale), Integer.valueOf(foregroundColor), Integer.valueOf(backgroundColor), Integer.valueOf(edgeType), Integer.valueOf(edgeColor), Integer.valueOf(zzgh), Integer.valueOf(windowColor), Integer.valueOf(zzgi), zzgj, Integer.valueOf(zzgk), 
			Integer.valueOf(fontStyle), String.valueOf(((Object) (zzp)))
		});
	//    0    0:bipush          12
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #104 <Field float fontScale>
	//    6   11:invokestatic    #295 <Method Float Float.valueOf(float)>
	//    7   14:aastore         
	//    8   15:dup             
	//    9   16:iconst_1        
	//   10   17:aload_0         
	//   11   18:getfield        #106 <Field int foregroundColor>
	//   12   21:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   13   24:aastore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:aload_0         
	//   17   28:getfield        #108 <Field int backgroundColor>
	//   18   31:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_3        
	//   22   37:aload_0         
	//   23   38:getfield        #110 <Field int edgeType>
	//   24   41:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   25   44:aastore         
	//   26   45:dup             
	//   27   46:iconst_4        
	//   28   47:aload_0         
	//   29   48:getfield        #112 <Field int edgeColor>
	//   30   51:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_5        
	//   34   57:aload_0         
	//   35   58:getfield        #114 <Field int zzgh>
	//   36   61:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   37   64:aastore         
	//   38   65:dup             
	//   39   66:bipush          6
	//   40   68:aload_0         
	//   41   69:getfield        #116 <Field int windowColor>
	//   42   72:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   43   75:aastore         
	//   44   76:dup             
	//   45   77:bipush          7
	//   46   79:aload_0         
	//   47   80:getfield        #118 <Field int zzgi>
	//   48   83:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   49   86:aastore         
	//   50   87:dup             
	//   51   88:bipush          8
	//   52   90:aload_0         
	//   53   91:getfield        #120 <Field String zzgj>
	//   54   94:aastore         
	//   55   95:dup             
	//   56   96:bipush          9
	//   57   98:aload_0         
	//   58   99:getfield        #122 <Field int zzgk>
	//   59  102:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   60  105:aastore         
	//   61  106:dup             
	//   62  107:bipush          10
	//   63  109:aload_0         
	//   64  110:getfield        #124 <Field int fontStyle>
	//   65  113:invokestatic    #236 <Method Integer Integer.valueOf(int)>
	//   66  116:aastore         
	//   67  117:dup             
	//   68  118:bipush          11
	//   69  120:aload_0         
	//   70  121:getfield        #133 <Field JSONObject zzp>
	//   71  124:invokestatic    #298 <Method String String.valueOf(Object)>
	//   72  127:aastore         
	//   73  128:invokestatic    #303 <Method int Objects.hashCode(Object[])>
	//   74  131:ireturn         
	}

	public final void setBackgroundColor(int i)
	{
		backgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #108 <Field int backgroundColor>
	//    3    5:return          
	}

	public final void setCustomData(JSONObject jsonobject)
	{
		zzp = jsonobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field JSONObject zzp>
	//    3    5:return          
	}

	public final void setEdgeColor(int i)
	{
		edgeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #112 <Field int edgeColor>
	//    3    5:return          
	}

	public final void setEdgeType(int i)
	{
		if(i >= 0 && i <= 4)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:iconst_4        
	//*   4    6:icmple          12
	//*   5    9:goto            18
		{
			edgeType = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #110 <Field int edgeType>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalArgumentException("invalid edgeType");
	//   10   18:new             #307 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #309 <String "invalid edgeType">
	//   13   25:invokespecial   #310 <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		}
	}

	public final void setFontFamily(String s)
	{
		zzgj = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field String zzgj>
	//    3    5:return          
	}

	public final void setFontGenericFamily(int i)
	{
		if(i >= 0 && i <= 6)
	//*   0    0:iload_1         
	//*   1    1:iflt            19
	//*   2    4:iload_1         
	//*   3    5:bipush          6
	//*   4    7:icmple          13
	//*   5   10:goto            19
		{
			zzgk = i;
	//    6   13:aload_0         
	//    7   14:iload_1         
	//    8   15:putfield        #122 <Field int zzgk>
			return;
	//    9   18:return          
		} else
		{
			throw new IllegalArgumentException("invalid fontGenericFamily");
	//   10   19:new             #307 <Class IllegalArgumentException>
	//   11   22:dup             
	//   12   23:ldc2            #313 <String "invalid fontGenericFamily">
	//   13   26:invokespecial   #310 <Method void IllegalArgumentException(String)>
	//   14   29:athrow          
		}
	}

	public final void setFontScale(float f)
	{
		fontScale = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #104 <Field float fontScale>
	//    3    5:return          
	}

	public final void setFontStyle(int i)
	{
		if(i >= 0 && i <= 3)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:iconst_3        
	//*   4    6:icmple          12
	//*   5    9:goto            18
		{
			fontStyle = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #124 <Field int fontStyle>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalArgumentException("invalid fontStyle");
	//   10   18:new             #307 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #315 <String "invalid fontStyle">
	//   13   25:invokespecial   #310 <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		}
	}

	public final void setForegroundColor(int i)
	{
		foregroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #106 <Field int foregroundColor>
	//    3    5:return          
	}

	public final void setWindowColor(int i)
	{
		windowColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field int windowColor>
	//    3    5:return          
	}

	public final void setWindowCornerRadius(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            15
		{
			throw new IllegalArgumentException("invalid windowCornerRadius");
	//    2    4:new             #307 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #319 <String "invalid windowCornerRadius">
	//    5   11:invokespecial   #310 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			zzgi = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #118 <Field int zzgi>
			return;
	//   10   20:return          
		}
	}

	public final void setWindowType(int i)
	{
		if(i >= 0 && i <= 2)
	//*   0    0:iload_1         
	//*   1    1:iflt            18
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmple          12
	//*   5    9:goto            18
		{
			zzgh = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #114 <Field int zzgh>
			return;
	//    9   17:return          
		} else
		{
			throw new IllegalArgumentException("invalid windowType");
	//   10   18:new             #307 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #322 <String "invalid windowType">
	//   13   25:invokespecial   #310 <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		}
	}

	public final JSONObject toJson()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #128 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #324 <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("fontScale", fontScale);
	//    4    8:aload_2         
	//    5    9:ldc2            #325 <String "fontScale">
	//    6   12:aload_0         
	//    7   13:getfield        #104 <Field float fontScale>
	//    8   16:f2d             
	//    9   17:invokevirtual   #329 <Method JSONObject JSONObject.put(String, double)>
	//   10   20:pop             
		if(foregroundColor != 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #106 <Field int foregroundColor>
	//*  13   25:ifeq            43
			jsonobject.put("foregroundColor", ((Object) (zzd(foregroundColor))));
	//   14   28:aload_2         
	//   15   29:ldc2            #330 <String "foregroundColor">
	//   16   32:aload_0         
	//   17   33:getfield        #106 <Field int foregroundColor>
	//   18   36:invokestatic    #332 <Method String zzd(int)>
	//   19   39:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   20   42:pop             
		if(backgroundColor != 0)
	//*  21   43:aload_0         
	//*  22   44:getfield        #108 <Field int backgroundColor>
	//*  23   47:ifeq            65
			jsonobject.put("backgroundColor", ((Object) (zzd(backgroundColor))));
	//   24   50:aload_2         
	//   25   51:ldc2            #336 <String "backgroundColor">
	//   26   54:aload_0         
	//   27   55:getfield        #108 <Field int backgroundColor>
	//   28   58:invokestatic    #332 <Method String zzd(int)>
	//   29   61:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   30   64:pop             
		edgeType;
	//   31   65:aload_0         
	//   32   66:getfield        #110 <Field int edgeType>
		JVM INSTR tableswitch 0 4: default 372
	//	               0 403
	//	               1 396
	//	               2 389
	//	               3 382
	//	               4 375;
	//   33   69:tableswitch     0 4: default 372
	//	               0 403
	//	               1 396
	//	               2 389
	//	               3 382
	//	               4 375
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L24:
		Object obj;
		jsonobject.put("edgeType", obj);
	//   34  104:aload_2         
	//   35  105:ldc2            #337 <String "edgeType">
	//   36  108:aload_1         
	//   37  109:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   38  112:pop             
	//*  39  113:goto            116
_L1:
		if(edgeColor != 0)
	//*  40  116:aload_0         
	//*  41  117:getfield        #112 <Field int edgeColor>
	//*  42  120:ifeq            138
			jsonobject.put("edgeColor", ((Object) (zzd(edgeColor))));
	//   43  123:aload_2         
	//   44  124:ldc2            #338 <String "edgeColor">
	//   45  127:aload_0         
	//   46  128:getfield        #112 <Field int edgeColor>
	//   47  131:invokestatic    #332 <Method String zzd(int)>
	//   48  134:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   49  137:pop             
		zzgh;
	//   50  138:aload_0         
	//   51  139:getfield        #114 <Field int zzgh>
		JVM INSTR tableswitch 0 2: default 410
	//	               0 427
	//	               1 420
	//	               2 413;
	//   52  142:tableswitch     0 2: default 410
	//	               0 427
	//	               1 420
	//	               2 413
		   goto _L7 _L8 _L9 _L10
_L25:
		jsonobject.put("windowType", obj);
	//   53  168:aload_2         
	//   54  169:ldc2            #340 <String "windowType">
	//   55  172:aload_1         
	//   56  173:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   57  176:pop             
	//*  58  177:goto            180
_L7:
		if(windowColor != 0)
	//*  59  180:aload_0         
	//*  60  181:getfield        #116 <Field int windowColor>
	//*  61  184:ifeq            202
			jsonobject.put("windowColor", ((Object) (zzd(windowColor))));
	//   62  187:aload_2         
	//   63  188:ldc2            #341 <String "windowColor">
	//   64  191:aload_0         
	//   65  192:getfield        #116 <Field int windowColor>
	//   66  195:invokestatic    #332 <Method String zzd(int)>
	//   67  198:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   68  201:pop             
		if(zzgh == 2)
	//*  69  202:aload_0         
	//*  70  203:getfield        #114 <Field int zzgh>
	//*  71  206:iconst_2        
	//*  72  207:icmpne          222
			jsonobject.put("windowRoundedCornerRadius", zzgi);
	//   73  210:aload_2         
	//   74  211:ldc2            #343 <String "windowRoundedCornerRadius">
	//   75  214:aload_0         
	//   76  215:getfield        #118 <Field int zzgi>
	//   77  218:invokevirtual   #346 <Method JSONObject JSONObject.put(String, int)>
	//   78  221:pop             
		if(zzgj != null)
	//*  79  222:aload_0         
	//*  80  223:getfield        #120 <Field String zzgj>
	//*  81  226:ifnull          241
			jsonobject.put("fontFamily", ((Object) (zzgj)));
	//   82  229:aload_2         
	//   83  230:ldc2            #348 <String "fontFamily">
	//   84  233:aload_0         
	//   85  234:getfield        #120 <Field String zzgj>
	//   86  237:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   87  240:pop             
		zzgk;
	//   88  241:aload_0         
	//   89  242:getfield        #122 <Field int zzgk>
		JVM INSTR tableswitch 0 6: default 434
	//	               0 479
	//	               1 472
	//	               2 465
	//	               3 458
	//	               4 451
	//	               5 444
	//	               6 437;
	//   90  245:tableswitch     0 6: default 434
	//	               0 479
	//	               1 472
	//	               2 465
	//	               3 458
	//	               4 451
	//	               5 444
	//	               6 437
		   goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L26:
		jsonobject.put("fontGenericFamily", obj);
	//   91  288:aload_2         
	//   92  289:ldc2            #350 <String "fontGenericFamily">
	//   93  292:aload_1         
	//   94  293:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//   95  296:pop             
	//*  96  297:goto            300
_L11:
		fontStyle;
	//   97  300:aload_0         
	//   98  301:getfield        #124 <Field int fontStyle>
		JVM INSTR tableswitch 0 3: default 486
	//	               0 510
	//	               1 503
	//	               2 496
	//	               3 489;
	//   99  304:tableswitch     0 3: default 486
	//	               0 510
	//	               1 503
	//	               2 496
	//	               3 489
		   goto _L19 _L20 _L21 _L22 _L23
_L20:
		break MISSING_BLOCK_LABEL_510;
_L27:
		jsonobject.put("fontStyle", obj);
	//  100  336:aload_2         
	//  101  337:ldc2            #351 <String "fontStyle">
	//  102  340:aload_1         
	//  103  341:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//  104  344:pop             
	//* 105  345:goto            348
_L19:
		try
		{
			if(zzp != null)
	//* 106  348:aload_0         
	//* 107  349:getfield        #133 <Field JSONObject zzp>
	//* 108  352:ifnull          367
				jsonobject.put("customData", ((Object) (zzp)));
	//  109  355:aload_2         
	//  110  356:ldc2            #353 <String "customData">
	//  111  359:aload_0         
	//  112  360:getfield        #133 <Field JSONObject zzp>
	//  113  363:invokevirtual   #335 <Method JSONObject JSONObject.put(String, Object)>
	//  114  366:pop             
		}
	//* 115  367:aload_2         
	//* 116  368:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 117  369:astore_1        
		{
			return jsonobject;
	//  118  370:aload_2         
	//  119  371:areturn         
		}
		return jsonobject;
	//* 120  372:goto            116
_L6:
		obj = "DEPRESSED";
	//  121  375:ldc2            #355 <String "DEPRESSED">
	//  122  378:astore_1        
		  goto _L24
	//* 123  379:goto            104
_L5:
		obj = "RAISED";
	//  124  382:ldc2            #357 <String "RAISED">
	//  125  385:astore_1        
		  goto _L24
	//* 126  386:goto            104
_L4:
		obj = "DROP_SHADOW";
	//  127  389:ldc2            #359 <String "DROP_SHADOW">
	//  128  392:astore_1        
		  goto _L24
	//* 129  393:goto            104
_L3:
		obj = "OUTLINE";
	//  130  396:ldc2            #361 <String "OUTLINE">
	//  131  399:astore_1        
		  goto _L24
	//* 132  400:goto            104
_L2:
		obj = "NONE";
	//  133  403:ldc2            #363 <String "NONE">
	//  134  406:astore_1        
		  goto _L24
	//* 135  407:goto            104
	//* 136  410:goto            180
_L10:
		obj = "ROUNDED_CORNERS";
	//  137  413:ldc2            #365 <String "ROUNDED_CORNERS">
	//  138  416:astore_1        
		  goto _L25
	//* 139  417:goto            168
_L9:
		obj = "NORMAL";
	//  140  420:ldc2            #367 <String "NORMAL">
	//  141  423:astore_1        
		  goto _L25
	//* 142  424:goto            168
_L8:
		obj = "NONE";
	//  143  427:ldc2            #363 <String "NONE">
	//  144  430:astore_1        
		  goto _L25
	//* 145  431:goto            168
	//* 146  434:goto            300
_L18:
		obj = "SMALL_CAPITALS";
	//  147  437:ldc2            #369 <String "SMALL_CAPITALS">
	//  148  440:astore_1        
		  goto _L26
	//* 149  441:goto            288
_L17:
		obj = "CURSIVE";
	//  150  444:ldc2            #371 <String "CURSIVE">
	//  151  447:astore_1        
		  goto _L26
	//* 152  448:goto            288
_L16:
		obj = "CASUAL";
	//  153  451:ldc2            #373 <String "CASUAL">
	//  154  454:astore_1        
		  goto _L26
	//* 155  455:goto            288
_L15:
		obj = "MONOSPACED_SERIF";
	//  156  458:ldc2            #375 <String "MONOSPACED_SERIF">
	//  157  461:astore_1        
		  goto _L26
	//* 158  462:goto            288
_L14:
		obj = "SERIF";
	//  159  465:ldc2            #376 <String "SERIF">
	//  160  468:astore_1        
		  goto _L26
	//* 161  469:goto            288
_L13:
		obj = "MONOSPACED_SANS_SERIF";
	//  162  472:ldc2            #378 <String "MONOSPACED_SANS_SERIF">
	//  163  475:astore_1        
		  goto _L26
	//* 164  476:goto            288
_L12:
		obj = "SANS_SERIF";
	//  165  479:ldc2            #379 <String "SANS_SERIF">
	//  166  482:astore_1        
		  goto _L26
	//* 167  483:goto            288
	//* 168  486:goto            348
_L23:
		obj = "BOLD_ITALIC";
	//  169  489:ldc2            #381 <String "BOLD_ITALIC">
	//  170  492:astore_1        
		  goto _L27
	//* 171  493:goto            336
_L22:
		obj = "ITALIC";
	//  172  496:ldc2            #383 <String "ITALIC">
	//  173  499:astore_1        
		  goto _L27
	//* 174  500:goto            336
_L21:
		obj = "BOLD";
	//  175  503:ldc2            #385 <String "BOLD">
	//  176  506:astore_1        
		  goto _L27
	//* 177  507:goto            336
		obj = "NORMAL";
	//  178  510:ldc2            #367 <String "NORMAL">
	//  179  513:astore_1        
		  goto _L27
	//* 180  514:goto            336
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		String s;
		if(zzp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field JSONObject zzp>
	//*   2    4:ifnonnull       12
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		else
	//*   5    9:goto            20
			s = zzp.toString();
	//    6   12:aload_0         
	//    7   13:getfield        #133 <Field JSONObject zzp>
	//    8   16:invokevirtual   #390 <Method String JSONObject.toString()>
	//    9   19:astore_3        
		zzj = s;
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:putfield        #126 <Field String zzj>
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//   13   25:aload_1         
	//   14   26:invokestatic    #396 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   15   29:istore_2        
		SafeParcelWriter.writeFloat(parcel, 2, getFontScale());
	//   16   30:aload_1         
	//   17   31:iconst_2        
	//   18   32:aload_0         
	//   19   33:invokevirtual   #397 <Method float getFontScale()>
	//   20   36:invokestatic    #401 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 3, getForegroundColor());
	//   21   39:aload_1         
	//   22   40:iconst_3        
	//   23   41:aload_0         
	//   24   42:invokevirtual   #403 <Method int getForegroundColor()>
	//   25   45:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 4, getBackgroundColor());
	//   26   48:aload_1         
	//   27   49:iconst_4        
	//   28   50:aload_0         
	//   29   51:invokevirtual   #409 <Method int getBackgroundColor()>
	//   30   54:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 5, getEdgeType());
	//   31   57:aload_1         
	//   32   58:iconst_5        
	//   33   59:aload_0         
	//   34   60:invokevirtual   #411 <Method int getEdgeType()>
	//   35   63:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 6, getEdgeColor());
	//   36   66:aload_1         
	//   37   67:bipush          6
	//   38   69:aload_0         
	//   39   70:invokevirtual   #413 <Method int getEdgeColor()>
	//   40   73:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 7, getWindowType());
	//   41   76:aload_1         
	//   42   77:bipush          7
	//   43   79:aload_0         
	//   44   80:invokevirtual   #415 <Method int getWindowType()>
	//   45   83:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 8, getWindowColor());
	//   46   86:aload_1         
	//   47   87:bipush          8
	//   48   89:aload_0         
	//   49   90:invokevirtual   #417 <Method int getWindowColor()>
	//   50   93:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 9, getWindowCornerRadius());
	//   51   96:aload_1         
	//   52   97:bipush          9
	//   53   99:aload_0         
	//   54  100:invokevirtual   #419 <Method int getWindowCornerRadius()>
	//   55  103:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 10, getFontFamily(), false);
	//   56  106:aload_1         
	//   57  107:bipush          10
	//   58  109:aload_0         
	//   59  110:invokevirtual   #421 <Method String getFontFamily()>
	//   60  113:iconst_0        
	//   61  114:invokestatic    #425 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 11, getFontGenericFamily());
	//   62  117:aload_1         
	//   63  118:bipush          11
	//   64  120:aload_0         
	//   65  121:invokevirtual   #427 <Method int getFontGenericFamily()>
	//   66  124:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 12, getFontStyle());
	//   67  127:aload_1         
	//   68  128:bipush          12
	//   69  130:aload_0         
	//   70  131:invokevirtual   #429 <Method int getFontStyle()>
	//   71  134:invokestatic    #407 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 13, zzj, false);
	//   72  137:aload_1         
	//   73  138:bipush          13
	//   74  140:aload_0         
	//   75  141:getfield        #126 <Field String zzj>
	//   76  144:iconst_0        
	//   77  145:invokestatic    #425 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   78  148:aload_1         
	//   79  149:iload_2         
	//   80  150:invokestatic    #432 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   81  153:return          
	}

	public final void zze(JSONObject jsonobject)
		throws JSONException
	{
		fontScale = (float)jsonobject.optDouble("fontScale", 1.0D);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #325 <String "fontScale">
	//    3    5:dconst_1        
	//    4    6:invokevirtual   #437 <Method double JSONObject.optDouble(String, double)>
	//    5    9:d2f             
	//    6   10:putfield        #104 <Field float fontScale>
		foregroundColor = zzh(jsonobject.optString("foregroundColor"));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:ldc2            #330 <String "foregroundColor">
	//   10   18:invokevirtual   #441 <Method String JSONObject.optString(String)>
	//   11   21:invokestatic    #443 <Method int zzh(String)>
	//   12   24:putfield        #106 <Field int foregroundColor>
		backgroundColor = zzh(jsonobject.optString("backgroundColor"));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:ldc2            #336 <String "backgroundColor">
	//   16   32:invokevirtual   #441 <Method String JSONObject.optString(String)>
	//   17   35:invokestatic    #443 <Method int zzh(String)>
	//   18   38:putfield        #108 <Field int backgroundColor>
		if(jsonobject.has("edgeType"))
	//*  19   41:aload_1         
	//*  20   42:ldc2            #337 <String "edgeType">
	//*  21   45:invokevirtual   #447 <Method boolean JSONObject.has(String)>
	//*  22   48:ifeq            146
		{
			String s = jsonobject.getString("edgeType");
	//   23   51:aload_1         
	//   24   52:ldc2            #337 <String "edgeType">
	//   25   55:invokevirtual   #450 <Method String JSONObject.getString(String)>
	//   26   58:astore_3        
			if("NONE".equals(((Object) (s))))
	//*  27   59:ldc2            #363 <String "NONE">
	//*  28   62:aload_3         
	//*  29   63:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  30   66:ifeq            77
				edgeType = 0;
	//   31   69:aload_0         
	//   32   70:iconst_0        
	//   33   71:putfield        #110 <Field int edgeType>
			else
	//*  34   74:goto            146
			if("OUTLINE".equals(((Object) (s))))
	//*  35   77:ldc2            #361 <String "OUTLINE">
	//*  36   80:aload_3         
	//*  37   81:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  38   84:ifeq            95
				edgeType = 1;
	//   39   87:aload_0         
	//   40   88:iconst_1        
	//   41   89:putfield        #110 <Field int edgeType>
			else
	//*  42   92:goto            146
			if("DROP_SHADOW".equals(((Object) (s))))
	//*  43   95:ldc2            #359 <String "DROP_SHADOW">
	//*  44   98:aload_3         
	//*  45   99:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  46  102:ifeq            113
				edgeType = 2;
	//   47  105:aload_0         
	//   48  106:iconst_2        
	//   49  107:putfield        #110 <Field int edgeType>
			else
	//*  50  110:goto            146
			if("RAISED".equals(((Object) (s))))
	//*  51  113:ldc2            #357 <String "RAISED">
	//*  52  116:aload_3         
	//*  53  117:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  54  120:ifeq            131
				edgeType = 3;
	//   55  123:aload_0         
	//   56  124:iconst_3        
	//   57  125:putfield        #110 <Field int edgeType>
			else
	//*  58  128:goto            146
			if("DEPRESSED".equals(((Object) (s))))
	//*  59  131:ldc2            #355 <String "DEPRESSED">
	//*  60  134:aload_3         
	//*  61  135:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  62  138:ifeq            146
				edgeType = 4;
	//   63  141:aload_0         
	//   64  142:iconst_4        
	//   65  143:putfield        #110 <Field int edgeType>
		}
		edgeColor = zzh(jsonobject.optString("edgeColor"));
	//   66  146:aload_0         
	//   67  147:aload_1         
	//   68  148:ldc2            #338 <String "edgeColor">
	//   69  151:invokevirtual   #441 <Method String JSONObject.optString(String)>
	//   70  154:invokestatic    #443 <Method int zzh(String)>
	//   71  157:putfield        #112 <Field int edgeColor>
		if(jsonobject.has("windowType"))
	//*  72  160:aload_1         
	//*  73  161:ldc2            #340 <String "windowType">
	//*  74  164:invokevirtual   #447 <Method boolean JSONObject.has(String)>
	//*  75  167:ifeq            229
		{
			String s1 = jsonobject.getString("windowType");
	//   76  170:aload_1         
	//   77  171:ldc2            #340 <String "windowType">
	//   78  174:invokevirtual   #450 <Method String JSONObject.getString(String)>
	//   79  177:astore_3        
			if("NONE".equals(((Object) (s1))))
	//*  80  178:ldc2            #363 <String "NONE">
	//*  81  181:aload_3         
	//*  82  182:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  83  185:ifeq            196
				zzgh = 0;
	//   84  188:aload_0         
	//   85  189:iconst_0        
	//   86  190:putfield        #114 <Field int zzgh>
			else
	//*  87  193:goto            229
			if("NORMAL".equals(((Object) (s1))))
	//*  88  196:ldc2            #367 <String "NORMAL">
	//*  89  199:aload_3         
	//*  90  200:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  91  203:ifeq            214
				zzgh = 1;
	//   92  206:aload_0         
	//   93  207:iconst_1        
	//   94  208:putfield        #114 <Field int zzgh>
			else
	//*  95  211:goto            229
			if("ROUNDED_CORNERS".equals(((Object) (s1))))
	//*  96  214:ldc2            #365 <String "ROUNDED_CORNERS">
	//*  97  217:aload_3         
	//*  98  218:invokevirtual   #451 <Method boolean String.equals(Object)>
	//*  99  221:ifeq            229
				zzgh = 2;
	//  100  224:aload_0         
	//  101  225:iconst_2        
	//  102  226:putfield        #114 <Field int zzgh>
		}
		windowColor = zzh(jsonobject.optString("windowColor"));
	//  103  229:aload_0         
	//  104  230:aload_1         
	//  105  231:ldc2            #341 <String "windowColor">
	//  106  234:invokevirtual   #441 <Method String JSONObject.optString(String)>
	//  107  237:invokestatic    #443 <Method int zzh(String)>
	//  108  240:putfield        #116 <Field int windowColor>
		if(zzgh == 2)
	//* 109  243:aload_0         
	//* 110  244:getfield        #114 <Field int zzgh>
	//* 111  247:iconst_2        
	//* 112  248:icmpne          263
			zzgi = jsonobject.optInt("windowRoundedCornerRadius", 0);
	//  113  251:aload_0         
	//  114  252:aload_1         
	//  115  253:ldc2            #343 <String "windowRoundedCornerRadius">
	//  116  256:iconst_0        
	//  117  257:invokevirtual   #454 <Method int JSONObject.optInt(String, int)>
	//  118  260:putfield        #118 <Field int zzgi>
		zzgj = jsonobject.optString("fontFamily", ((String) (null)));
	//  119  263:aload_0         
	//  120  264:aload_1         
	//  121  265:ldc2            #348 <String "fontFamily">
	//  122  268:aconst_null     
	//  123  269:invokevirtual   #457 <Method String JSONObject.optString(String, String)>
	//  124  272:putfield        #120 <Field String zzgj>
		if(!jsonobject.has("fontGenericFamily")) goto _L2; else goto _L1
	//  125  275:aload_1         
	//  126  276:ldc2            #350 <String "fontGenericFamily">
	//  127  279:invokevirtual   #447 <Method boolean JSONObject.has(String)>
	//  128  282:ifeq            419
_L1:
		String s2 = jsonobject.getString("fontGenericFamily");
	//  129  285:aload_1         
	//  130  286:ldc2            #350 <String "fontGenericFamily">
	//  131  289:invokevirtual   #450 <Method String JSONObject.getString(String)>
	//  132  292:astore_3        
		if(!"SANS_SERIF".equals(((Object) (s2)))) goto _L4; else goto _L3
	//  133  293:ldc2            #379 <String "SANS_SERIF">
	//  134  296:aload_3         
	//  135  297:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  136  300:ifeq            311
_L3:
		zzgk = 0;
	//  137  303:aload_0         
	//  138  304:iconst_0        
	//  139  305:putfield        #122 <Field int zzgk>
		  goto _L2
	//* 140  308:goto            419
_L4:
		if(!"MONOSPACED_SANS_SERIF".equals(((Object) (s2)))) goto _L6; else goto _L5
	//  141  311:ldc2            #378 <String "MONOSPACED_SANS_SERIF">
	//  142  314:aload_3         
	//  143  315:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  144  318:ifeq            329
_L5:
		zzgk = 1;
	//  145  321:aload_0         
	//  146  322:iconst_1        
	//  147  323:putfield        #122 <Field int zzgk>
		  goto _L2
	//* 148  326:goto            419
_L6:
		if(!"SERIF".equals(((Object) (s2)))) goto _L8; else goto _L7
	//  149  329:ldc2            #376 <String "SERIF">
	//  150  332:aload_3         
	//  151  333:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  152  336:ifeq            347
_L7:
		zzgk = 2;
	//  153  339:aload_0         
	//  154  340:iconst_2        
	//  155  341:putfield        #122 <Field int zzgk>
		  goto _L2
	//* 156  344:goto            419
_L8:
		if(!"MONOSPACED_SERIF".equals(((Object) (s2)))) goto _L10; else goto _L9
	//  157  347:ldc2            #375 <String "MONOSPACED_SERIF">
	//  158  350:aload_3         
	//  159  351:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  160  354:ifeq            365
_L9:
		zzgk = 3;
	//  161  357:aload_0         
	//  162  358:iconst_3        
	//  163  359:putfield        #122 <Field int zzgk>
		  goto _L2
	//* 164  362:goto            419
_L10:
		if(!"CASUAL".equals(((Object) (s2)))) goto _L12; else goto _L11
	//  165  365:ldc2            #373 <String "CASUAL">
	//  166  368:aload_3         
	//  167  369:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  168  372:ifeq            383
_L11:
		zzgk = 4;
	//  169  375:aload_0         
	//  170  376:iconst_4        
	//  171  377:putfield        #122 <Field int zzgk>
		  goto _L2
	//* 172  380:goto            419
_L12:
		if(!"CURSIVE".equals(((Object) (s2)))) goto _L14; else goto _L13
	//  173  383:ldc2            #371 <String "CURSIVE">
	//  174  386:aload_3         
	//  175  387:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  176  390:ifeq            403
_L13:
		int i = 5;
	//  177  393:iconst_5        
	//  178  394:istore_2        
_L15:
		zzgk = i;
	//  179  395:aload_0         
	//  180  396:iload_2         
	//  181  397:putfield        #122 <Field int zzgk>
		break; /* Loop/switch isn't completed */
	//  182  400:goto            419
_L14:
		if(!"SMALL_CAPITALS".equals(((Object) (s2))))
			break; /* Loop/switch isn't completed */
	//  183  403:ldc2            #369 <String "SMALL_CAPITALS">
	//  184  406:aload_3         
	//  185  407:invokevirtual   #451 <Method boolean String.equals(Object)>
	//  186  410:ifeq            419
		i = 6;
	//  187  413:bipush          6
	//  188  415:istore_2        
		if(true) goto _L15; else goto _L2
	//  189  416:goto            395
_L2:
		if(jsonobject.has("fontStyle"))
	//* 190  419:aload_1         
	//* 191  420:ldc2            #351 <String "fontStyle">
	//* 192  423:invokevirtual   #447 <Method boolean JSONObject.has(String)>
	//* 193  426:ifeq            506
		{
			String s3 = jsonobject.getString("fontStyle");
	//  194  429:aload_1         
	//  195  430:ldc2            #351 <String "fontStyle">
	//  196  433:invokevirtual   #450 <Method String JSONObject.getString(String)>
	//  197  436:astore_3        
			if("NORMAL".equals(((Object) (s3))))
	//* 198  437:ldc2            #367 <String "NORMAL">
	//* 199  440:aload_3         
	//* 200  441:invokevirtual   #451 <Method boolean String.equals(Object)>
	//* 201  444:ifeq            455
				fontStyle = 0;
	//  202  447:aload_0         
	//  203  448:iconst_0        
	//  204  449:putfield        #124 <Field int fontStyle>
			else
	//* 205  452:goto            506
			if("BOLD".equals(((Object) (s3))))
	//* 206  455:ldc2            #385 <String "BOLD">
	//* 207  458:aload_3         
	//* 208  459:invokevirtual   #451 <Method boolean String.equals(Object)>
	//* 209  462:ifeq            473
				fontStyle = 1;
	//  210  465:aload_0         
	//  211  466:iconst_1        
	//  212  467:putfield        #124 <Field int fontStyle>
			else
	//* 213  470:goto            506
			if("ITALIC".equals(((Object) (s3))))
	//* 214  473:ldc2            #383 <String "ITALIC">
	//* 215  476:aload_3         
	//* 216  477:invokevirtual   #451 <Method boolean String.equals(Object)>
	//* 217  480:ifeq            491
				fontStyle = 2;
	//  218  483:aload_0         
	//  219  484:iconst_2        
	//  220  485:putfield        #124 <Field int fontStyle>
			else
	//* 221  488:goto            506
			if("BOLD_ITALIC".equals(((Object) (s3))))
	//* 222  491:ldc2            #381 <String "BOLD_ITALIC">
	//* 223  494:aload_3         
	//* 224  495:invokevirtual   #451 <Method boolean String.equals(Object)>
	//* 225  498:ifeq            506
				fontStyle = 3;
	//  226  501:aload_0         
	//  227  502:iconst_3        
	//  228  503:putfield        #124 <Field int fontStyle>
		}
		zzp = jsonobject.optJSONObject("customData");
	//  229  506:aload_0         
	//  230  507:aload_1         
	//  231  508:ldc2            #353 <String "customData">
	//  232  511:invokevirtual   #461 <Method JSONObject JSONObject.optJSONObject(String)>
	//  233  514:putfield        #133 <Field JSONObject zzp>
		return;
	//  234  517:return          
	}

	public static final int COLOR_UNSPECIFIED = 0;
	public static final android.os.Parcelable.Creator CREATOR = new zzbr();
	public static final float DEFAULT_FONT_SCALE = 1F;
	public static final int EDGE_TYPE_DEPRESSED = 4;
	public static final int EDGE_TYPE_DROP_SHADOW = 2;
	public static final int EDGE_TYPE_NONE = 0;
	public static final int EDGE_TYPE_OUTLINE = 1;
	public static final int EDGE_TYPE_RAISED = 3;
	public static final int EDGE_TYPE_UNSPECIFIED = -1;
	public static final int FONT_FAMILY_CASUAL = 4;
	public static final int FONT_FAMILY_CURSIVE = 5;
	public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
	public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
	public static final int FONT_FAMILY_SANS_SERIF = 0;
	public static final int FONT_FAMILY_SERIF = 2;
	public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
	public static final int FONT_FAMILY_UNSPECIFIED = -1;
	public static final int FONT_STYLE_BOLD = 1;
	public static final int FONT_STYLE_BOLD_ITALIC = 3;
	public static final int FONT_STYLE_ITALIC = 2;
	public static final int FONT_STYLE_NORMAL = 0;
	public static final int FONT_STYLE_UNSPECIFIED = -1;
	public static final int WINDOW_TYPE_NONE = 0;
	public static final int WINDOW_TYPE_NORMAL = 1;
	public static final int WINDOW_TYPE_ROUNDED = 2;
	public static final int WINDOW_TYPE_UNSPECIFIED = -1;
	private int backgroundColor;
	private int edgeColor;
	private int edgeType;
	private float fontScale;
	private int fontStyle;
	private int foregroundColor;
	private int windowColor;
	private int zzgh;
	private int zzgi;
	private String zzgj;
	private int zzgk;
	private String zzj;
	private JSONObject zzp;

	static 
	{
	//    0    0:new             #88  <Class zzbr>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void zzbr()>
	//    3    7:putstatic       #93  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
