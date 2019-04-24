// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.trackselection:
//			TrackSelectionArray, TrackSelection

public final class TrackSelectorResult
{

	public TrackSelectorResult(RendererConfiguration arendererconfiguration[], TrackSelection atrackselection[], Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		rendererConfigurations = arendererconfiguration;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field RendererConfiguration[] rendererConfigurations>
		selections = new TrackSelectionArray(atrackselection);
	//    5    9:aload_0         
	//    6   10:new             #21  <Class TrackSelectionArray>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokespecial   #24  <Method void TrackSelectionArray(TrackSelection[])>
	//   10   18:putfield        #26  <Field TrackSelectionArray selections>
		info = obj;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #28  <Field Object info>
		length = arendererconfiguration.length;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:arraylength     
	//   17   29:putfield        #30  <Field int length>
	//   18   32:return          
	}

	public boolean isEquivalent(TrackSelectorResult trackselectorresult)
	{
		if(trackselectorresult != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          56
		{
			if(trackselectorresult.selections.length != selections.length)
	//*   2    4:aload_1         
	//*   3    5:getfield        #26  <Field TrackSelectionArray selections>
	//*   4    8:getfield        #34  <Field int TrackSelectionArray.length>
	//*   5   11:aload_0         
	//*   6   12:getfield        #26  <Field TrackSelectionArray selections>
	//*   7   15:getfield        #34  <Field int TrackSelectionArray.length>
	//*   8   18:icmpeq          23
				return false;
	//    9   21:iconst_0        
	//   10   22:ireturn         
			for(int i = 0; i < selections.length; i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_2        
	//*  13   25:iload_2         
	//*  14   26:aload_0         
	//*  15   27:getfield        #26  <Field TrackSelectionArray selections>
	//*  16   30:getfield        #34  <Field int TrackSelectionArray.length>
	//*  17   33:icmpge          54
				if(!isEquivalent(trackselectorresult, i))
	//*  18   36:aload_0         
	//*  19   37:aload_1         
	//*  20   38:iload_2         
	//*  21   39:invokevirtual   #37  <Method boolean isEquivalent(TrackSelectorResult, int)>
	//*  22   42:ifne            47
					return false;
	//   23   45:iconst_0        
	//   24   46:ireturn         

	//   25   47:iload_2         
	//   26   48:iconst_1        
	//   27   49:iadd            
	//   28   50:istore_2        
	//*  29   51:goto            25
			return true;
	//   30   54:iconst_1        
	//   31   55:ireturn         
		} else
		{
			return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
		}
	}

	public boolean isEquivalent(TrackSelectorResult trackselectorresult, int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(trackselectorresult == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		boolean flag = flag1;
	//    6    9:iload           4
	//    7   11:istore_3        
		if(Util.areEqual(((Object) (rendererConfigurations[i])), ((Object) (trackselectorresult.rendererConfigurations[i]))))
	//*   8   12:aload_0         
	//*   9   13:getfield        #19  <Field RendererConfiguration[] rendererConfigurations>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:aload_1         
	//*  13   19:getfield        #19  <Field RendererConfiguration[] rendererConfigurations>
	//*  14   22:iload_2         
	//*  15   23:aaload          
	//*  16   24:invokestatic    #43  <Method boolean Util.areEqual(Object, Object)>
	//*  17   27:ifeq            57
		{
			flag = flag1;
	//   18   30:iload           4
	//   19   32:istore_3        
			if(Util.areEqual(((Object) (selections.get(i))), ((Object) (trackselectorresult.selections.get(i)))))
	//*  20   33:aload_0         
	//*  21   34:getfield        #26  <Field TrackSelectionArray selections>
	//*  22   37:iload_2         
	//*  23   38:invokevirtual   #47  <Method TrackSelection TrackSelectionArray.get(int)>
	//*  24   41:aload_1         
	//*  25   42:getfield        #26  <Field TrackSelectionArray selections>
	//*  26   45:iload_2         
	//*  27   46:invokevirtual   #47  <Method TrackSelection TrackSelectionArray.get(int)>
	//*  28   49:invokestatic    #43  <Method boolean Util.areEqual(Object, Object)>
	//*  29   52:ifeq            57
				flag = true;
	//   30   55:iconst_1        
	//   31   56:istore_3        
		}
		return flag;
	//   32   57:iload_3         
	//   33   58:ireturn         
	}

	public boolean isRendererEnabled(int i)
	{
		return rendererConfigurations[i] != null;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RendererConfiguration[] rendererConfigurations>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:ifnull          11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public final Object info;
	public final int length;
	public final RendererConfiguration rendererConfigurations[];
	public final TrackSelectionArray selections;
}
