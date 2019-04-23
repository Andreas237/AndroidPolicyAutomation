// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.Bundle;

public class MediaBrowserCompatUtils
{

	private MediaBrowserCompatUtils()
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
		int i1 = 0x7fffffff;
	//   40   72:ldc1            #27  <Int 0x7fffffff>
	//   41   74:istore          6
		if(k != -1 && l != -1)
	//*  42   76:iload           4
	//*  43   78:iconst_m1       
	//*  44   79:icmpeq          110
	//*  45   82:iload           5
	//*  46   84:iconst_m1       
	//*  47   85:icmpne          91
	//*  48   88:goto            110
		{
			k *= l;
	//   49   91:iload           4
	//   50   93:iload           5
	//   51   95:imul            
	//   52   96:istore          4
			l = (l + k) - 1;
	//   53   98:iload           5
	//   54  100:iload           4
	//   55  102:iadd            
	//   56  103:iconst_1        
	//   57  104:isub            
	//   58  105:istore          5
		} else
	//*  59  107:goto            117
		{
			l = 0x7fffffff;
	//   60  110:ldc1            #27  <Int 0x7fffffff>
	//   61  112:istore          5
			k = 0;
	//   62  114:iconst_0        
	//   63  115:istore          4
		}
		if(i != -1 && j != -1)
	//*  64  117:iload_2         
	//*  65  118:iconst_m1       
	//*  66  119:icmpeq          143
	//*  67  122:iload_3         
	//*  68  123:iconst_m1       
	//*  69  124:icmpne          130
	//*  70  127:goto            143
		{
			i = j * i;
	//   71  130:iload_3         
	//   72  131:iload_2         
	//   73  132:imul            
	//   74  133:istore_2        
			j = (j + i) - 1;
	//   75  134:iload_3         
	//   76  135:iload_2         
	//   77  136:iadd            
	//   78  137:iconst_1        
	//   79  138:isub            
	//   80  139:istore_3        
		} else
	//*  81  140:goto            148
		{
			i = 0;
	//   82  143:iconst_0        
	//   83  144:istore_2        
			j = i1;
	//   84  145:iload           6
	//   85  147:istore_3        
		}
		return l >= i && j >= k;
	//   86  148:iload           5
	//   87  150:iload_2         
	//   88  151:icmplt          162
	//   89  154:iload_3         
	//   90  155:iload           4
	//   91  157:icmplt          162
	//   92  160:iconst_1        
	//   93  161:ireturn         
	//   94  162:iconst_0        
	//   95  163:ireturn         
	}
}
