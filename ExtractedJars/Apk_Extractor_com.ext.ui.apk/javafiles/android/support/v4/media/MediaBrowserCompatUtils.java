// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

public class MediaBrowserCompatUtils
{

	public MediaBrowserCompatUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static boolean areSameOptions(Bundle bundle, Bundle bundle1)
	{
		if(bundle != bundle1) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpne       7
_L1:
		return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
_L2:
		if(bundle != null)
			break; /* Loop/switch isn't completed */
	//    5    7:aload_0         
	//    6    8:ifnonnull       35
		if(bundle1.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)
	//*   7   11:aload_1         
	//*   8   12:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//*   9   14:iconst_m1       
	//*  10   15:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//*  11   18:iconst_m1       
	//*  12   19:icmpne          33
	//*  13   22:aload_1         
	//*  14   23:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//*  15   25:iconst_m1       
	//*  16   26:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//*  17   29:iconst_m1       
	//*  18   30:icmpeq          5
			return false;
	//   19   33:iconst_0        
	//   20   34:ireturn         
		if(true) goto _L1; else goto _L3
_L3:
		if(bundle1 != null)
			continue; /* Loop/switch isn't completed */
	//   21   35:aload_1         
	//   22   36:ifnonnull       63
		if(bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) goto _L1; else goto _L4
	//   23   39:aload_0         
	//   24   40:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   25   42:iconst_m1       
	//   26   43:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   27   46:iconst_m1       
	//   28   47:icmpne          61
	//   29   50:aload_0         
	//   30   51:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   31   53:iconst_m1       
	//   32   54:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   33   57:iconst_m1       
	//   34   58:icmpeq          5
_L4:
		return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		if(bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle1.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1)) goto _L1; else goto _L5
	//   37   63:aload_0         
	//   38   64:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   39   66:iconst_m1       
	//   40   67:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   41   70:aload_1         
	//   42   71:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   43   73:iconst_m1       
	//   44   74:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   45   77:icmpne          97
	//   46   80:aload_0         
	//   47   81:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   48   83:iconst_m1       
	//   49   84:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   50   87:aload_1         
	//   51   88:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   52   90:iconst_m1       
	//   53   91:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   54   94:icmpeq          5
_L5:
		return false;
	//   55   97:iconst_0        
	//   56   98:ireturn         
	}

	public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle1)
	{
		int k1 = 0x7fffffff;
	//    0    0:ldc1            #27  <Int 0x7fffffff>
	//    1    2:istore          7
		int i;
		int j;
		int k;
		int l;
		if(bundle == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       78
			k = -1;
	//    4    8:iconst_m1       
	//    5    9:istore          4
		else
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       90
	//*   8   15:iconst_m1       
	//*   9   16:istore_2        
	//*  10   17:aload_0         
	//*  11   18:ifnonnull       101
	//*  12   21:iconst_m1       
	//*  13   22:istore          5
	//*  14   24:aload_1         
	//*  15   25:ifnonnull       113
	//*  16   28:iconst_m1       
	//*  17   29:istore_3        
	//*  18   30:iload           4
	//*  19   32:iconst_m1       
	//*  20   33:icmpeq          42
	//*  21   36:iload           5
	//*  22   38:iconst_m1       
	//*  23   39:icmpne          124
	//*  24   42:ldc1            #27  <Int 0x7fffffff>
	//*  25   44:istore          4
	//*  26   46:iconst_0        
	//*  27   47:istore          5
	//*  28   49:iload_2         
	//*  29   50:iconst_m1       
	//*  30   51:icmpeq          59
	//*  31   54:iload_3         
	//*  32   55:iconst_m1       
	//*  33   56:icmpne          151
	//*  34   59:iconst_0        
	//*  35   60:istore_3        
	//*  36   61:iload           7
	//*  37   63:istore_2        
	//*  38   64:iload           5
	//*  39   66:iload_3         
	//*  40   67:icmpgt          169
	//*  41   70:iload_3         
	//*  42   71:iload           4
	//*  43   73:icmpgt          169
	//*  44   76:iconst_1        
	//*  45   77:ireturn         
			k = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//   46   78:aload_0         
	//   47   79:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   48   81:iconst_m1       
	//   49   82:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   50   85:istore          4
		if(bundle1 == null)
			i = -1;
		else
	//*  51   87:goto            11
			i = bundle1.getInt("android.media.browse.extra.PAGE", -1);
	//   52   90:aload_1         
	//   53   91:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   54   93:iconst_m1       
	//   55   94:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   56   97:istore_2        
		if(bundle == null)
			l = -1;
		else
	//*  57   98:goto            17
			l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   58  101:aload_0         
	//   59  102:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   60  104:iconst_m1       
	//   61  105:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   62  108:istore          5
		if(bundle1 == null)
			j = -1;
		else
	//*  63  110:goto            24
			j = bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   64  113:aload_1         
	//   65  114:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   66  116:iconst_m1       
	//   67  117:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   68  120:istore_3        
		if(k == -1 || l == -1)
		{
			k = 0x7fffffff;
			l = 0;
		} else
	//*  69  121:goto            30
		{
			k *= l;
	//   70  124:iload           4
	//   71  126:iload           5
	//   72  128:imul            
	//   73  129:istore          4
			int i1 = k;
	//   74  131:iload           4
	//   75  133:istore          6
			k = (k + l) - 1;
	//   76  135:iload           4
	//   77  137:iload           5
	//   78  139:iadd            
	//   79  140:iconst_1        
	//   80  141:isub            
	//   81  142:istore          4
			l = i1;
	//   82  144:iload           6
	//   83  146:istore          5
		}
		if(i == -1 || j == -1)
		{
			j = 0;
			i = k1;
		} else
	//*  84  148:goto            49
		{
			int j1 = j * i;
	//   85  151:iload_3         
	//   86  152:iload_2         
	//   87  153:imul            
	//   88  154:istore          6
			i = (j1 + j) - 1;
	//   89  156:iload           6
	//   90  158:iload_3         
	//   91  159:iadd            
	//   92  160:iconst_1        
	//   93  161:isub            
	//   94  162:istore_2        
			j = j1;
	//   95  163:iload           6
	//   96  165:istore_3        
		}
		while(l <= j && j <= k || l <= i && i <= k) 
			return true;
	//   97  166:goto            64
	//   98  169:iload           5
	//   99  171:iload_2         
	//  100  172:icmpgt          181
	//  101  175:iload_2         
	//  102  176:iload           4
	//  103  178:icmple          76
		return false;
	//  104  181:iconst_0        
	//  105  182:ireturn         
	}
}
