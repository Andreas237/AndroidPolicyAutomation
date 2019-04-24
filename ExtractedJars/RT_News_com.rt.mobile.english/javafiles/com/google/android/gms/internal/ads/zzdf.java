// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbh

public final class zzdf extends zzbh
{

	public zzdf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzbh()>
	//    2    4:return          
	}

	public zzdf(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zzbh()>
		((zzbh)this).zzj(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #26  <Method void zzbh.zzj(String)>
	//    5    9:return          
	}

	protected final void zzj(String s)
	{
		s = ((String) (zzk(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method HashMap zzk(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          179
		{
			zzsp = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(0))));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//    9   15:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   10   18:checkcast       #44  <Class Long>
	//   11   21:putfield        #46  <Field Long zzsp>
			zzsq = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(1))));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   16   30:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   17   33:checkcast       #44  <Class Long>
	//   18   36:putfield        #48  <Field Long zzsq>
			zzsr = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(2))));
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_2        
	//   22   42:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   23   45:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   24   48:checkcast       #44  <Class Long>
	//   25   51:putfield        #50  <Field Long zzsr>
			zzfr = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(3))));
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:iconst_3        
	//   29   57:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   30   60:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   31   63:checkcast       #44  <Class Long>
	//   32   66:putfield        #52  <Field Long zzfr>
			zzfp = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(4))));
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:iconst_4        
	//   36   72:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   37   75:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   38   78:checkcast       #44  <Class Long>
	//   39   81:putfield        #54  <Field Long zzfp>
			zzss = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(5))));
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:iconst_5        
	//   43   87:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   44   90:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   45   93:checkcast       #44  <Class Long>
	//   46   96:putfield        #56  <Field Long zzss>
			zzst = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(6))));
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:bipush          6
	//   50  103:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   51  106:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   52  109:checkcast       #44  <Class Long>
	//   53  112:putfield        #58  <Field Long zzst>
			zzsu = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(7))));
	//   54  115:aload_0         
	//   55  116:aload_1         
	//   56  117:bipush          7
	//   57  119:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   58  122:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   59  125:checkcast       #44  <Class Long>
	//   60  128:putfield        #60  <Field Long zzsu>
			zzfw = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(8))));
	//   61  131:aload_0         
	//   62  132:aload_1         
	//   63  133:bipush          8
	//   64  135:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   65  138:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   66  141:checkcast       #44  <Class Long>
	//   67  144:putfield        #62  <Field Long zzfw>
			zzfv = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(9))));
	//   68  147:aload_0         
	//   69  148:aload_1         
	//   70  149:bipush          9
	//   71  151:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   72  154:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   73  157:checkcast       #44  <Class Long>
	//   74  160:putfield        #64  <Field Long zzfv>
			zzsv = (Long)((HashMap) (s)).get(((Object) (Integer.valueOf(10))));
	//   75  163:aload_0         
	//   76  164:aload_1         
	//   77  165:bipush          10
	//   78  167:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   79  170:invokevirtual   #42  <Method Object HashMap.get(Object)>
	//   80  173:checkcast       #44  <Class Long>
	//   81  176:putfield        #66  <Field Long zzsv>
		}
	//   82  179:return          
	}

	protected final HashMap zzu()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #38  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void HashMap()>
	//    3    7:astore_1        
		hashmap.put(((Object) (Integer.valueOf(0))), ((Object) (zzsp)));
	//    4    8:aload_1         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//    7   13:aload_0         
	//    8   14:getfield        #46  <Field Long zzsp>
	//    9   17:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   10   20:pop             
		hashmap.put(((Object) (Integer.valueOf(1))), ((Object) (zzsq)));
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   14   26:aload_0         
	//   15   27:getfield        #48  <Field Long zzsq>
	//   16   30:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   17   33:pop             
		hashmap.put(((Object) (Integer.valueOf(2))), ((Object) (zzsr)));
	//   18   34:aload_1         
	//   19   35:iconst_2        
	//   20   36:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   21   39:aload_0         
	//   22   40:getfield        #50  <Field Long zzsr>
	//   23   43:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   24   46:pop             
		hashmap.put(((Object) (Integer.valueOf(3))), ((Object) (zzfr)));
	//   25   47:aload_1         
	//   26   48:iconst_3        
	//   27   49:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   28   52:aload_0         
	//   29   53:getfield        #52  <Field Long zzfr>
	//   30   56:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   31   59:pop             
		hashmap.put(((Object) (Integer.valueOf(4))), ((Object) (zzfp)));
	//   32   60:aload_1         
	//   33   61:iconst_4        
	//   34   62:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   35   65:aload_0         
	//   36   66:getfield        #54  <Field Long zzfp>
	//   37   69:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   38   72:pop             
		hashmap.put(((Object) (Integer.valueOf(5))), ((Object) (zzss)));
	//   39   73:aload_1         
	//   40   74:iconst_5        
	//   41   75:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   42   78:aload_0         
	//   43   79:getfield        #56  <Field Long zzss>
	//   44   82:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   45   85:pop             
		hashmap.put(((Object) (Integer.valueOf(6))), ((Object) (zzst)));
	//   46   86:aload_1         
	//   47   87:bipush          6
	//   48   89:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   49   92:aload_0         
	//   50   93:getfield        #58  <Field Long zzst>
	//   51   96:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   52   99:pop             
		hashmap.put(((Object) (Integer.valueOf(7))), ((Object) (zzsu)));
	//   53  100:aload_1         
	//   54  101:bipush          7
	//   55  103:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   56  106:aload_0         
	//   57  107:getfield        #60  <Field Long zzsu>
	//   58  110:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   59  113:pop             
		hashmap.put(((Object) (Integer.valueOf(8))), ((Object) (zzfw)));
	//   60  114:aload_1         
	//   61  115:bipush          8
	//   62  117:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   63  120:aload_0         
	//   64  121:getfield        #62  <Field Long zzfw>
	//   65  124:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   66  127:pop             
		hashmap.put(((Object) (Integer.valueOf(9))), ((Object) (zzfv)));
	//   67  128:aload_1         
	//   68  129:bipush          9
	//   69  131:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   70  134:aload_0         
	//   71  135:getfield        #64  <Field Long zzfv>
	//   72  138:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   73  141:pop             
		hashmap.put(((Object) (Integer.valueOf(10))), ((Object) (zzsv)));
	//   74  142:aload_1         
	//   75  143:bipush          10
	//   76  145:invokestatic    #36  <Method Integer Integer.valueOf(int)>
	//   77  148:aload_0         
	//   78  149:getfield        #66  <Field Long zzsv>
	//   79  152:invokevirtual   #73  <Method Object HashMap.put(Object, Object)>
	//   80  155:pop             
		return hashmap;
	//   81  156:aload_1         
	//   82  157:areturn         
	}

	public Long zzfp;
	public Long zzfr;
	public Long zzfv;
	public Long zzfw;
	public Long zzsp;
	public Long zzsq;
	public Long zzsr;
	public Long zzss;
	public Long zzst;
	public Long zzsu;
	public Long zzsv;
}
