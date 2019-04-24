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
		if(bundle == bundle1)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(bundle == null)
	//*   5    7:aload_0         
	//*   6    8:ifnonnull       37
			return bundle1.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
	//    7   11:aload_1         
	//    8   12:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//    9   14:iconst_m1       
	//   10   15:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   11   18:iconst_m1       
	//   12   19:icmpne          35
	//   13   22:aload_1         
	//   14   23:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   15   25:iconst_m1       
	//   16   26:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   17   29:iconst_m1       
	//   18   30:icmpne          35
	//   19   33:iconst_1        
	//   20   34:ireturn         
	//   21   35:iconst_0        
	//   22   36:ireturn         
		if(bundle1 == null)
	//*  23   37:aload_1         
	//*  24   38:ifnonnull       67
			return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1;
	//   25   41:aload_0         
	//   26   42:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   27   44:iconst_m1       
	//   28   45:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   29   48:iconst_m1       
	//   30   49:icmpne          65
	//   31   52:aload_0         
	//   32   53:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   33   55:iconst_m1       
	//   34   56:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   35   59:iconst_m1       
	//   36   60:icmpne          65
	//   37   63:iconst_1        
	//   38   64:ireturn         
	//   39   65:iconst_0        
	//   40   66:ireturn         
		return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle1.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   41   67:aload_0         
	//   42   68:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   43   70:iconst_m1       
	//   44   71:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   45   74:aload_1         
	//   46   75:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   47   77:iconst_m1       
	//   48   78:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   49   81:icmpne          103
	//   50   84:aload_0         
	//   51   85:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   52   87:iconst_m1       
	//   53   88:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   54   91:aload_1         
	//   55   92:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   56   94:iconst_m1       
	//   57   95:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   58   98:icmpne          103
	//   59  101:iconst_1        
	//   60  102:ireturn         
	//   61  103:iconst_0        
	//   62  104:ireturn         
	}

	public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle1)
	{
		int k;
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       10
			k = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          4
		else
	//*   4    7:goto            19
			k = bundle.getInt("android.media.browse.extra.PAGE", -1);
	//    5   10:aload_0         
	//    6   11:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//    7   13:iconst_m1       
	//    8   14:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//    9   17:istore          4
		int i;
		if(bundle1 == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       28
			i = -1;
	//   12   23:iconst_m1       
	//   13   24:istore_2        
		else
	//*  14   25:goto            36
			i = bundle1.getInt("android.media.browse.extra.PAGE", -1);
	//   15   28:aload_1         
	//   16   29:ldc1            #17  <String "android.media.browse.extra.PAGE">
	//   17   31:iconst_m1       
	//   18   32:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   19   35:istore_2        
		int l;
		if(bundle == null)
	//*  20   36:aload_0         
	//*  21   37:ifnonnull       46
			l = -1;
	//   22   40:iconst_m1       
	//   23   41:istore          5
		else
	//*  24   43:goto            55
			l = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   25   46:aload_0         
	//   26   47:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   27   49:iconst_m1       
	//   28   50:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   29   53:istore          5
		int j;
		if(bundle1 == null)
	//*  30   55:aload_1         
	//*  31   56:ifnonnull       64
			j = -1;
	//   32   59:iconst_m1       
	//   33   60:istore_3        
		else
	//*  34   61:goto            72
			j = bundle1.getInt("android.media.browse.extra.PAGE_SIZE", -1);
	//   35   64:aload_1         
	//   36   65:ldc1            #25  <String "android.media.browse.extra.PAGE_SIZE">
	//   37   67:iconst_m1       
	//   38   68:invokevirtual   #23  <Method int Bundle.getInt(String, int)>
	//   39   71:istore_3        
		if(k == -1 || l == -1)
	//*  40   72:iload           4
	//*  41   74:iconst_m1       
	//*  42   75:icmpeq          84
	//*  43   78:iload           5
	//*  44   80:iconst_m1       
	//*  45   81:icmpne          94
		{
			k = 0;
	//   46   84:iconst_0        
	//   47   85:istore          4
			l = 0x7fffffff;
	//   48   87:ldc1            #27  <Int 0x7fffffff>
	//   49   89:istore          5
		} else
	//*  50   91:goto            110
		{
			k = l * k;
	//   51   94:iload           5
	//   52   96:iload           4
	//   53   98:imul            
	//   54   99:istore          4
			l = (k + l) - 1;
	//   55  101:iload           4
	//   56  103:iload           5
	//   57  105:iadd            
	//   58  106:iconst_1        
	//   59  107:isub            
	//   60  108:istore          5
		}
		if(i == -1 || j == -1)
	//*  61  110:iload_2         
	//*  62  111:iconst_m1       
	//*  63  112:icmpeq          120
	//*  64  115:iload_3         
	//*  65  116:iconst_m1       
	//*  66  117:icmpne          128
		{
			i = 0;
	//   67  120:iconst_0        
	//   68  121:istore_2        
			j = 0x7fffffff;
	//   69  122:ldc1            #27  <Int 0x7fffffff>
	//   70  124:istore_3        
		} else
	//*  71  125:goto            138
		{
			i = j * i;
	//   72  128:iload_3         
	//   73  129:iload_2         
	//   74  130:imul            
	//   75  131:istore_2        
			j = (i + j) - 1;
	//   76  132:iload_2         
	//   77  133:iload_3         
	//   78  134:iadd            
	//   79  135:iconst_1        
	//   80  136:isub            
	//   81  137:istore_3        
		}
		if(k <= i && i <= l)
	//*  82  138:iload           4
	//*  83  140:iload_2         
	//*  84  141:icmpgt          152
	//*  85  144:iload_2         
	//*  86  145:iload           5
	//*  87  147:icmpgt          152
			return true;
	//   88  150:iconst_1        
	//   89  151:ireturn         
		return k <= j && j <= l;
	//   90  152:iload           4
	//   91  154:iload_3         
	//   92  155:icmpgt          166
	//   93  158:iload_3         
	//   94  159:iload           5
	//   95  161:icmpgt          166
	//   96  164:iconst_1        
	//   97  165:ireturn         
	//   98  166:iconst_0        
	//   99  167:ireturn         
	}
}
