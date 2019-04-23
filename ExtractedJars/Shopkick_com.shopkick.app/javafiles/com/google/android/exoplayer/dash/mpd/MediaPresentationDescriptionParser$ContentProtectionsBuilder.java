// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Assertions;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			MediaPresentationDescriptionParser, ContentProtection

protected static final class MediaPresentationDescriptionParser$ContentProtectionsBuilder
	implements Comparator
{

	private void maybeAddContentProtection(List list, ContentProtection contentprotection)
	{
		if(!list.contains(((Object) (contentprotection))))
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokeinterface #30  <Method boolean List.contains(Object)>
	//*   3    7:ifne            62
		{
			for(int i = 0; i < list.size(); i++)
	//*   4   10:iconst_0        
	//*   5   11:istore_3        
	//*   6   12:iload_3         
	//*   7   13:aload_1         
	//*   8   14:invokeinterface #34  <Method int List.size()>
	//*   9   19:icmpge          54
				Assertions.checkState(((ContentProtection)list.get(i)).schemeUriId.equals(((Object) (contentprotection.schemeUriId))) ^ true);
	//   10   22:aload_1         
	//   11   23:iload_3         
	//   12   24:invokeinterface #38  <Method Object List.get(int)>
	//   13   29:checkcast       #40  <Class ContentProtection>
	//   14   32:getfield        #44  <Field String ContentProtection.schemeUriId>
	//   15   35:aload_2         
	//   16   36:getfield        #44  <Field String ContentProtection.schemeUriId>
	//   17   39:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   18   42:iconst_1        
	//   19   43:ixor            
	//   20   44:invokestatic    #55  <Method void Assertions.checkState(boolean)>

	//   21   47:iload_3         
	//   22   48:iconst_1        
	//   23   49:iadd            
	//   24   50:istore_3        
	//*  25   51:goto            12
			list.add(((Object) (contentprotection)));
	//   26   54:aload_1         
	//   27   55:aload_2         
	//   28   56:invokeinterface #58  <Method boolean List.add(Object)>
	//   29   61:pop             
		}
	//   30   62:return          
	}

	public void addAdaptationSetProtection(ContentProtection contentprotection)
	{
		if(adaptationSetProtections == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field ArrayList adaptationSetProtections>
	//*   2    4:ifnonnull       18
			adaptationSetProtections = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #66  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void ArrayList()>
	//    7   15:putfield        #64  <Field ArrayList adaptationSetProtections>
		maybeAddContentProtection(((List) (adaptationSetProtections)), contentprotection);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #64  <Field ArrayList adaptationSetProtections>
	//   11   23:aload_1         
	//   12   24:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>
	//   13   27:return          
	}

	public void addRepresentationProtection(ContentProtection contentprotection)
	{
		if(currentRepresentationProtections == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//*   2    4:ifnonnull       18
			currentRepresentationProtections = new ArrayList();
	//    3    7:aload_0         
	//    4    8:new             #66  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #67  <Method void ArrayList()>
	//    7   15:putfield        #72  <Field ArrayList currentRepresentationProtections>
		maybeAddContentProtection(((List) (currentRepresentationProtections)), contentprotection);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//   11   23:aload_1         
	//   12   24:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>
	//   13   27:return          
	}

	public ArrayList build()
	{
		ArrayList arraylist = adaptationSetProtections;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ArrayList adaptationSetProtections>
	//    2    4:astore_2        
		if(arraylist == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       14
			return representationProtections;
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field ArrayList representationProtections>
	//    7   13:areturn         
		if(representationProtections == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #76  <Field ArrayList representationProtections>
	//*  10   18:ifnonnull       23
			return arraylist;
	//   11   21:aload_2         
	//   12   22:areturn         
		for(int i = 0; i < representationProtections.size(); i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:aload_0         
	//*  17   27:getfield        #76  <Field ArrayList representationProtections>
	//*  18   30:invokevirtual   #77  <Method int ArrayList.size()>
	//*  19   33:icmpge          62
			maybeAddContentProtection(((List) (adaptationSetProtections)), (ContentProtection)representationProtections.get(i));
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #64  <Field ArrayList adaptationSetProtections>
	//   23   41:aload_0         
	//   24   42:getfield        #76  <Field ArrayList representationProtections>
	//   25   45:iload_1         
	//   26   46:invokevirtual   #78  <Method Object ArrayList.get(int)>
	//   27   49:checkcast       #40  <Class ContentProtection>
	//   28   52:invokespecial   #69  <Method void maybeAddContentProtection(List, ContentProtection)>

	//   29   55:iload_1         
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_1        
	//*  33   59:goto            25
		return adaptationSetProtections;
	//   34   62:aload_0         
	//   35   63:getfield        #64  <Field ArrayList adaptationSetProtections>
	//   36   66:areturn         
	}

	public int compare(ContentProtection contentprotection, ContentProtection contentprotection1)
	{
		return contentprotection.schemeUriId.compareTo(contentprotection1.schemeUriId);
	//    0    0:aload_1         
	//    1    1:getfield        #44  <Field String ContentProtection.schemeUriId>
	//    2    4:aload_2         
	//    3    5:getfield        #44  <Field String ContentProtection.schemeUriId>
	//    4    8:invokevirtual   #85  <Method int String.compareTo(String)>
	//    5   11:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ContentProtection)obj, (ContentProtection)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class ContentProtection>
	//    3    5:aload_2         
	//    4    6:checkcast       #40  <Class ContentProtection>
	//    5    9:invokevirtual   #88  <Method int compare(ContentProtection, ContentProtection)>
	//    6   12:ireturn         
	}

	public void endRepresentation()
	{
		boolean flag1 = representationProtectionsSet;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field boolean representationProtectionsSet>
	//    2    4:istore_2        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_1        
		if(!flag1)
	//*   5    7:iload_2         
	//*   6    8:ifne            41
		{
			ArrayList arraylist = currentRepresentationProtections;
	//    7   11:aload_0         
	//    8   12:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//    9   15:astore_3        
			if(arraylist != null)
	//*  10   16:aload_3         
	//*  11   17:ifnull          25
				Collections.sort(((List) (arraylist)), ((Comparator) (this)));
	//   12   20:aload_3         
	//   13   21:aload_0         
	//   14   22:invokestatic    #97  <Method void Collections.sort(List, Comparator)>
			representationProtections = currentRepresentationProtections;
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//   18   30:putfield        #76  <Field ArrayList representationProtections>
			representationProtectionsSet = true;
	//   19   33:aload_0         
	//   20   34:iconst_1        
	//   21   35:putfield        #91  <Field boolean representationProtectionsSet>
		} else
	//*  22   38:goto            88
		{
			ArrayList arraylist1 = currentRepresentationProtections;
	//   23   41:aload_0         
	//   24   42:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//   25   45:astore_3        
			if(arraylist1 == null)
	//*  26   46:aload_3         
	//*  27   47:ifnonnull       69
			{
				if(representationProtections != null)
	//*  28   50:aload_0         
	//*  29   51:getfield        #76  <Field ArrayList representationProtections>
	//*  30   54:ifnonnull       60
	//*  31   57:goto            62
					flag = false;
	//   32   60:iconst_0        
	//   33   61:istore_1        
				Assertions.checkState(flag);
	//   34   62:iload_1         
	//   35   63:invokestatic    #55  <Method void Assertions.checkState(boolean)>
			} else
	//*  36   66:goto            88
			{
				Collections.sort(((List) (arraylist1)), ((Comparator) (this)));
	//   37   69:aload_3         
	//   38   70:aload_0         
	//   39   71:invokestatic    #97  <Method void Collections.sort(List, Comparator)>
				Assertions.checkState(currentRepresentationProtections.equals(((Object) (representationProtections))));
	//   40   74:aload_0         
	//   41   75:getfield        #72  <Field ArrayList currentRepresentationProtections>
	//   42   78:aload_0         
	//   43   79:getfield        #76  <Field ArrayList representationProtections>
	//   44   82:invokevirtual   #98  <Method boolean ArrayList.equals(Object)>
	//   45   85:invokestatic    #55  <Method void Assertions.checkState(boolean)>
			}
		}
		currentRepresentationProtections = null;
	//   46   88:aload_0         
	//   47   89:aconst_null     
	//   48   90:putfield        #72  <Field ArrayList currentRepresentationProtections>
	//   49   93:return          
	}

	private ArrayList adaptationSetProtections;
	private ArrayList currentRepresentationProtections;
	private ArrayList representationProtections;
	private boolean representationProtectionsSet;

	protected MediaPresentationDescriptionParser$ContentProtectionsBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
