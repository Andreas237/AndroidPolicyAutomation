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
		int i;
		int j;
		int k;
		int l;
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       74
			k = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          4
		else
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       86
	//*   6   11:iconst_m1       
	//*   7   12:istore_2        
	//*   8   13:aload_0         
	//*   9   14:ifnonnull       97
	//*  10   17:iconst_m1       
	//*  11   18:istore          5
	//*  12   20:aload_1         
	//*  13   21:ifnonnull       109
	//*  14   24:iconst_m1       
	//*  15   25:istore_3        
	//*  16   26:iload           4
	//*  17   28:iconst_m1       
	//*  18   29:icmpeq          38
	//*  19   32:iload           5
	//*  20   34:iconst_m1       
	//*  21   35:icmpne          120
	//*  22   38:iconst_0        
	//*  23   39:istore          5
	//*  24   41:ldc1            #27  <Int 0x7fffffff>
	//*  25   43:istore          4
	//*  26   45:iload_2         
	//*  27   46:iconst_m1       
	//*  28   47:icmpeq          55
	//*  29   50:iload_3         
	//*  30   51:iconst_m1       
	//*  31   52:icmpne          143
	//*  32   55:iconst_0        
	//*  33   56:istore_3        
	//*  34   57:ldc1            #27  <Int 0x7fffffff>
	//*  35   59:istore_2        
	//*  36   60:iload           5
	//*  37   62:iload_3         
	//*  38   63:icmpgt          161
	//*  39   66:iload_3         
	//*  40   67:iload           4
	//*  41   69:icmpgt          161
	//*  42   72:iconst_1        
	//*  43   73:ireturn         
			k = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//   44   74:aload_0         
	//   45   75:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   46   77:iconst_m1       
	//   47   78:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   48   81:istore          4
		if(bundle1 == null)
			i = -1;
		else
	//*  49   83:goto            7
			i = bundle1.getInt("android.media.browse.extra.PAGE", -1);
	//   50   86:aload_1         
	//   51   87:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   52   89:iconst_m1       
	//   53   90:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   54   93:istore_2        
		if(bundle == null)
			l = -1;
		else
	//*  55   94:goto            13
			l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   56   97:aload_0         
	//   57   98:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   58  100:iconst_m1       
	//   59  101:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   60  104:istore          5
		if(bundle1 == null)
			j = -1;
		else
	//*  61  106:goto            20
			j = bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   62  109:aload_1         
	//   63  110:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   64  112:iconst_m1       
	//   65  113:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   66  116:istore_3        
		if(k == -1 || l == -1)
		{
			l = 0;
			k = 0x7fffffff;
		} else
	//*  67  117:goto            26
		{
			int i1 = l * k;
	//   68  120:iload           5
	//   69  122:iload           4
	//   70  124:imul            
	//   71  125:istore          6
			k = (i1 + l) - 1;
	//   72  127:iload           6
	//   73  129:iload           5
	//   74  131:iadd            
	//   75  132:iconst_1        
	//   76  133:isub            
	//   77  134:istore          4
			l = i1;
	//   78  136:iload           6
	//   79  138:istore          5
		}
		if(i == -1 || j == -1)
		{
			j = 0;
			i = 0x7fffffff;
		} else
	//*  80  140:goto            45
		{
			int j1 = j * i;
	//   81  143:iload_3         
	//   82  144:iload_2         
	//   83  145:imul            
	//   84  146:istore          6
			i = (j1 + j) - 1;
	//   85  148:iload           6
	//   86  150:iload_3         
	//   87  151:iadd            
	//   88  152:iconst_1        
	//   89  153:isub            
	//   90  154:istore_2        
			j = j1;
	//   91  155:iload           6
	//   92  157:istore_3        
		}
		while(l <= j && j <= k || l <= i && i <= k) 
			return true;
	//   93  158:goto            60
	//   94  161:iload           5
	//   95  163:iload_2         
	//   96  164:icmpgt          173
	//   97  167:iload_2         
	//   98  168:iload           4
	//   99  170:icmple          72
		return false;
	//  100  173:iconst_0        
	//  101  174:ireturn         
	}
}
