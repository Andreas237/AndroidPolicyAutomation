// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzqt, zzpb, zzakk, zzou, 
//			zzane, zzoz, zzpw, zzot, 
//			zzoj, zzlo

public final class zzos extends zzqt
	implements zzpb
{

	public zzos(String s, SimpleArrayMap simplearraymap, SimpleArrayMap simplearraymap1, zzoj zzoj, zzlo zzlo, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void zzqt()>
	//    2    4:aload_0         
	//    3    5:new             #32  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object mLock>
		zzbio = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field String zzbio>
		zzbip = simplearraymap;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #39  <Field SimpleArrayMap zzbip>
		zzbiq = simplearraymap1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #41  <Field SimpleArrayMap zzbiq>
		zzbie = zzoj;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #43  <Field zzoj zzbie>
		zzbif = zzlo;
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:putfield        #45  <Field zzlo zzbif>
		zzbig = view;
	//   22   42:aload_0         
	//   23   43:aload           6
	//   24   45:putfield        #47  <Field View zzbig>
	//   25   48:return          
	}

	static zzoz zza(zzos zzos1)
	{
		return zzos1.zzbij;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field zzoz zzbij>
	//    2    4:areturn         
	}

	static zzoz zza(zzos zzos1, zzoz zzoz1)
	{
		zzos1.zzbij = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #54  <Field zzoz zzbij>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	public final void destroy()
	{
		zzakk.zzcrm.post(((Runnable) (new zzou(this))));
	//    0    0:getstatic       #62  <Field Handler zzakk.zzcrm>
	//    1    3:new             #64  <Class zzou>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #67  <Method void zzou(zzos)>
	//    5   11:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
		zzbif = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #45  <Field zzlo zzbif>
		zzbig = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #47  <Field View zzbig>
	//   13   25:return          
	}

	public final List getAvailableAssetNames()
	{
		String as[] = new String[zzbip.size() + zzbiq.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SimpleArrayMap zzbip>
	//    2    4:invokevirtual   #81  <Method int SimpleArrayMap.size()>
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field SimpleArrayMap zzbiq>
	//    5   11:invokevirtual   #81  <Method int SimpleArrayMap.size()>
	//    6   14:iadd            
	//    7   15:anewarray       String[]
	//    8   18:astore          6
		boolean flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          5
		int j = 0;
	//   11   23:iconst_0        
	//   12   24:istore_2        
		int i = j;
	//   13   25:iload_2         
	//   14   26:istore_1        
		int k;
		int l;
		do
		{
			k = ((int) (flag));
	//   15   27:iload           5
	//   16   29:istore_3        
			l = i;
	//   17   30:iload_1         
	//   18   31:istore          4
			if(j >= zzbip.size())
				break;
	//   19   33:iload_2         
	//   20   34:aload_0         
	//   21   35:getfield        #39  <Field SimpleArrayMap zzbip>
	//   22   38:invokevirtual   #81  <Method int SimpleArrayMap.size()>
	//   23   41:icmpge          70
			as[i] = (String)zzbip.keyAt(j);
	//   24   44:aload           6
	//   25   46:iload_1         
	//   26   47:aload_0         
	//   27   48:getfield        #39  <Field SimpleArrayMap zzbip>
	//   28   51:iload_2         
	//   29   52:invokevirtual   #87  <Method Object SimpleArrayMap.keyAt(int)>
	//   30   55:checkcast       #83  <Class String>
	//   31   58:aastore         
			j++;
	//   32   59:iload_2         
	//   33   60:iconst_1        
	//   34   61:iadd            
	//   35   62:istore_2        
			i++;
	//   36   63:iload_1         
	//   37   64:iconst_1        
	//   38   65:iadd            
	//   39   66:istore_1        
		} while(true);
	//   40   67:goto            27
		while(k < zzbiq.size()) 
	//*  41   70:iload_3         
	//*  42   71:aload_0         
	//*  43   72:getfield        #41  <Field SimpleArrayMap zzbiq>
	//*  44   75:invokevirtual   #81  <Method int SimpleArrayMap.size()>
	//*  45   78:icmpge          110
		{
			as[l] = (String)zzbiq.keyAt(k);
	//   46   81:aload           6
	//   47   83:iload           4
	//   48   85:aload_0         
	//   49   86:getfield        #41  <Field SimpleArrayMap zzbiq>
	//   50   89:iload_3         
	//   51   90:invokevirtual   #87  <Method Object SimpleArrayMap.keyAt(int)>
	//   52   93:checkcast       #83  <Class String>
	//   53   96:aastore         
			k++;
	//   54   97:iload_3         
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore_3        
			l++;
	//   58  101:iload           4
	//   59  103:iconst_1        
	//   60  104:iadd            
	//   61  105:istore          4
		}
	//*  62  107:goto            70
		return Arrays.asList(((Object []) (as)));
	//   63  110:aload           6
	//   64  112:invokestatic    #93  <Method List Arrays.asList(Object[])>
	//   65  115:areturn         
	}

	public final String getCustomTemplateId()
	{
		return zzbio;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzbio>
	//    2    4:areturn         
	}

	public final zzlo getVideoController()
	{
		return zzbif;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field zzlo zzbif>
	//    2    4:areturn         
	}

	public final void performClick(String s)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field zzoz zzbij>
	//    7   11:ifnonnull       22
				zzane.e("#001 Attempt to perform click before app native ad initialized.");
	//    8   14:ldc1            #102 <String "#001 Attempt to perform click before app native ad initialized.">
	//    9   16:invokestatic    #107 <Method void zzane.e(String)>
			}
	//   10   19:aload_2         
	//   11   20:monitorexit     
			return;
	//   12   21:return          
		}
		zzbij.zza(((View) (null)), s, ((android.os.Bundle) (null)), ((java.util.Map) (null)), ((View) (null)));
	//   13   22:aload_0         
	//   14   23:getfield        #54  <Field zzoz zzbij>
	//   15   26:aconst_null     
	//   16   27:aload_1         
	//   17   28:aconst_null     
	//   18   29:aconst_null     
	//   19   30:aconst_null     
	//   20   31:invokeinterface #112 <Method void zzoz.zza(View, String, android.os.Bundle, java.util.Map, View)>
		obj;
	//   21   36:aload_2         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		return;
	//   23   38:return          
		s;
	//   24   39:astore_1        
		obj;
	//   25   40:aload_2         
		JVM INSTR monitorexit ;
	//   26   41:monitorexit     
		throw s;
	//   27   42:aload_1         
	//   28   43:athrow          
	}

	public final void recordImpression()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzbij != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #54  <Field zzoz zzbij>
	//    7   11:ifnonnull       22
				zzane.e("#002 Attempt to record impression before native ad initialized.");
	//    8   14:ldc1            #115 <String "#002 Attempt to record impression before native ad initialized.">
	//    9   16:invokestatic    #107 <Method void zzane.e(String)>
			}
	//   10   19:aload_1         
	//   11   20:monitorexit     
			return;
	//   12   21:return          
		}
		zzbij.zza(((View) (null)), ((java.util.Map) (null)));
	//   13   22:aload_0         
	//   14   23:getfield        #54  <Field zzoz zzbij>
	//   15   26:aconst_null     
	//   16   27:aconst_null     
	//   17   28:invokeinterface #118 <Method void zzoz.zza(View, java.util.Map)>
		obj;
	//   18   33:aload_1         
		JVM INSTR monitorexit ;
	//   19   34:monitorexit     
		return;
	//   20   35:return          
		exception;
	//   21   36:astore_2        
		obj;
	//   22   37:aload_1         
		JVM INSTR monitorexit ;
	//   23   38:monitorexit     
		throw exception;
	//   24   39:aload_2         
	//   25   40:athrow          
	}

	public final String zzao(String s)
	{
		return (String)zzbiq.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field SimpleArrayMap zzbiq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #83  <Class String>
	//    5   11:areturn         
	}

	public final zzpw zzap(String s)
	{
		return (zzpw)zzbip.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SimpleArrayMap zzbip>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #124 <Method Object SimpleArrayMap.get(Object)>
	//    4    8:checkcast       #128 <Class zzpw>
	//    5   11:areturn         
	}

	public final void zzb(zzoz zzoz1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzbij = zzoz1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #54  <Field zzoz zzbij>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzoz1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzoz1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final boolean zzh(IObjectWrapper iobjectwrapper)
	{
		if(zzbij == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field zzoz zzbij>
	//*   2    4:ifnonnull       14
		{
			zzane.e("Attempt to call renderVideoInMediaView before ad initialized.");
	//    3    7:ldc1            #134 <String "Attempt to call renderVideoInMediaView before ad initialized.">
	//    4    9:invokestatic    #107 <Method void zzane.e(String)>
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		}
		if(zzbig == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #47  <Field View zzbig>
	//*   9   18:ifnonnull       23
		{
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
		} else
		{
			zzot zzot1 = new zzot(this);
	//   12   23:new             #136 <Class zzot>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:invokespecial   #137 <Method void zzot(zzos)>
	//   16   31:astore_2        
			iobjectwrapper = ((IObjectWrapper) ((FrameLayout)ObjectWrapper.unwrap(iobjectwrapper)));
	//   17   32:aload_1         
	//   18   33:invokestatic    #143 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   19   36:checkcast       #145 <Class FrameLayout>
	//   20   39:astore_1        
			zzbij.zza(((View) (iobjectwrapper)), ((zzox) (zzot1)));
	//   21   40:aload_0         
	//   22   41:getfield        #54  <Field zzoz zzbij>
	//   23   44:aload_1         
	//   24   45:aload_2         
	//   25   46:invokeinterface #148 <Method void zzoz.zza(View, zzox)>
			return true;
	//   26   51:iconst_1        
	//   27   52:ireturn         
		}
	}

	public final IObjectWrapper zzka()
	{
		return ObjectWrapper.wrap(((Object) (zzbij)));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field zzoz zzbij>
	//    2    4:invokestatic    #154 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    3    7:areturn         
	}

	public final String zzkb()
	{
		return "3";
	//    0    0:ldc1            #157 <String "3">
	//    1    2:areturn         
	}

	public final zzoj zzkc()
	{
		return zzbie;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field zzoj zzbie>
	//    2    4:areturn         
	}

	public final View zzkd()
	{
		return zzbig;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field View zzbig>
	//    2    4:areturn         
	}

	public final IObjectWrapper zzkh()
	{
		return ObjectWrapper.wrap(((Object) (zzbij.getContext().getApplicationContext())));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field zzoz zzbij>
	//    2    4:invokeinterface #166 <Method Context zzoz.getContext()>
	//    3    9:invokevirtual   #171 <Method Context Context.getApplicationContext()>
	//    4   12:invokestatic    #154 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    5   15:areturn         
	}

	private final Object mLock = new Object();
	private final zzoj zzbie;
	private zzlo zzbif;
	private View zzbig;
	private zzoz zzbij;
	private final String zzbio;
	private final SimpleArrayMap zzbip;
	private final SimpleArrayMap zzbiq;
}
