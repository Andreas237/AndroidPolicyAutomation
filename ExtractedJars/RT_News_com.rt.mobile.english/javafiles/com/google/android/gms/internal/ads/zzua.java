// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzua
{

	public zzua()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static zzua zzlk()
	{
		return zzbox;
	//    0    0:getstatic       #20  <Field zzua zzbox>
	//    1    3:areturn         
	}

	final void zzll()
	{
		zzboz = zzboz + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field int zzboz>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #27  <Field int zzboz>
	//    6   10:return          
	}

	final void zzlm()
	{
		zzbpa = zzbpa + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field int zzbpa>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #30  <Field int zzbpa>
	//    6   10:return          
	}

	final void zzln()
	{
		zzbpb = zzbpb + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field int zzbpb>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #33  <Field int zzbpb>
	//    6   10:return          
	}

	final void zzlo()
	{
		zzbpc = zzbpc + 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #36  <Field int zzbpc>
	//    3    5:iconst_1        
	//    4    6:iadd            
	//    5    7:putfield        #36  <Field int zzbpc>
	//    6   10:return          
	}

	public final int zzlp()
	{
		return zzboz;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int zzboz>
	//    2    4:ireturn         
	}

	public final int zzlq()
	{
		return zzbpa;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int zzbpa>
	//    2    4:ireturn         
	}

	public final int zzlr()
	{
		return zzbpb;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int zzbpb>
	//    2    4:ireturn         
	}

	public final int zzls()
	{
		return zzbpc;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int zzbpc>
	//    2    4:ireturn         
	}

	public final Bundle zzlt()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #45  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putInt("ipl", zzboy);
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "ipl">
	//    6   11:aload_0         
	//    7   12:getfield        #50  <Field int zzboy>
	//    8   15:invokevirtual   #54  <Method void Bundle.putInt(String, int)>
		bundle.putInt("ipds", zzboz);
	//    9   18:aload_1         
	//   10   19:ldc1            #56  <String "ipds">
	//   11   21:aload_0         
	//   12   22:getfield        #27  <Field int zzboz>
	//   13   25:invokevirtual   #54  <Method void Bundle.putInt(String, int)>
		bundle.putInt("ipde", zzbpa);
	//   14   28:aload_1         
	//   15   29:ldc1            #58  <String "ipde">
	//   16   31:aload_0         
	//   17   32:getfield        #30  <Field int zzbpa>
	//   18   35:invokevirtual   #54  <Method void Bundle.putInt(String, int)>
		bundle.putInt("iph", zzbpb);
	//   19   38:aload_1         
	//   20   39:ldc1            #60  <String "iph">
	//   21   41:aload_0         
	//   22   42:getfield        #33  <Field int zzbpb>
	//   23   45:invokevirtual   #54  <Method void Bundle.putInt(String, int)>
		bundle.putInt("ipm", zzbpc);
	//   24   48:aload_1         
	//   25   49:ldc1            #62  <String "ipm">
	//   26   51:aload_0         
	//   27   52:getfield        #36  <Field int zzbpc>
	//   28   55:invokevirtual   #54  <Method void Bundle.putInt(String, int)>
		return bundle;
	//   29   58:aload_1         
	//   30   59:areturn         
	}

	final void zzw(int i)
	{
		zzboy = zzboy + i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field int zzboy>
	//    3    5:iload_1         
	//    4    6:iadd            
	//    5    7:putfield        #50  <Field int zzboy>
	//    6   10:return          
	}

	private static zzua zzbox = new zzua();
	private int zzboy;
	private int zzboz;
	private int zzbpa;
	private int zzbpb;
	private int zzbpc;

	static 
	{
	//    0    0:new             #2   <Class zzua>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzua()>
	//    3    7:putstatic       #20  <Field zzua zzbox>
	//*   4   10:return          
	}
}
