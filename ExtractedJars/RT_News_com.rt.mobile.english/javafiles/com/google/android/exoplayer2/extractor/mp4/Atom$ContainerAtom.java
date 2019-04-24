// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.extractor.mp4:
//			Atom

static final class Atom$ContainerAtom extends Atom
{

	public void add(Atom$ContainerAtom atom$containeratom)
	{
		containerChildren.add(((Object) (atom$containeratom)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List containerChildren>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void add(Atom.LeafAtom leafatom)
	{
		leafChildren.add(((Object) (leafatom)));
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List leafChildren>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public int getChildAtomOfTypeCount(int i)
	{
		int k1 = leafChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List leafChildren>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore          6
		boolean flag = false;
	//    4   11:iconst_0        
	//    5   12:istore          5
		int l = 0;
	//    6   14:iconst_0        
	//    7   15:istore_3        
		int j;
		int i1;
		for(j = l; l < k1; j = i1)
	//*   8   16:iload_3         
	//*   9   17:istore_2        
	//*  10   18:iload_3         
	//*  11   19:iload           6
	//*  12   21:icmpge          62
		{
			i1 = j;
	//   13   24:iload_2         
	//   14   25:istore          4
			if(((Atom.LeafAtom)leafChildren.get(l)).type == i)
	//*  15   27:aload_0         
	//*  16   28:getfield        #26  <Field List leafChildren>
	//*  17   31:iload_3         
	//*  18   32:invokeinterface #47  <Method Object List.get(int)>
	//*  19   37:checkcast       #49  <Class Atom$LeafAtom>
	//*  20   40:getfield        #53  <Field int Atom$LeafAtom.type>
	//*  21   43:iload_1         
	//*  22   44:icmpne          52
				i1 = j + 1;
	//   23   47:iload_2         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore          4
			l++;
	//   27   52:iload_3         
	//   28   53:iconst_1        
	//   29   54:iadd            
	//   30   55:istore_3        
		}

	//   31   56:iload           4
	//   32   58:istore_2        
	//*  33   59:goto            18
		k1 = containerChildren.size();
	//   34   62:aload_0         
	//   35   63:getfield        #28  <Field List containerChildren>
	//   36   66:invokeinterface #43  <Method int List.size()>
	//   37   71:istore          6
		l = j;
	//   38   73:iload_2         
	//   39   74:istore_3        
		for(int k = ((int) (flag)); k < k1;)
	//*  40   75:iload           5
	//*  41   77:istore_2        
	//*  42   78:iload_2         
	//*  43   79:iload           6
	//*  44   81:icmpge          122
		{
			int j1 = l;
	//   45   84:iload_3         
	//   46   85:istore          4
			if(((Atom$ContainerAtom)containerChildren.get(k)).type == i)
	//*  47   87:aload_0         
	//*  48   88:getfield        #28  <Field List containerChildren>
	//*  49   91:iload_2         
	//*  50   92:invokeinterface #47  <Method Object List.get(int)>
	//*  51   97:checkcast       #2   <Class Atom$ContainerAtom>
	//*  52  100:getfield        #54  <Field int type>
	//*  53  103:iload_1         
	//*  54  104:icmpne          112
				j1 = l + 1;
	//   55  107:iload_3         
	//   56  108:iconst_1        
	//   57  109:iadd            
	//   58  110:istore          4
			k++;
	//   59  112:iload_2         
	//   60  113:iconst_1        
	//   61  114:iadd            
	//   62  115:istore_2        
			l = j1;
	//   63  116:iload           4
	//   64  118:istore_3        
		}

	//*  65  119:goto            78
		return l;
	//   66  122:iload_3         
	//   67  123:ireturn         
	}

	public Atom$ContainerAtom getContainerAtomOfType(int i)
	{
		int k = containerChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field List containerChildren>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			Atom$ContainerAtom atom$containeratom = (Atom$ContainerAtom)containerChildren.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #28  <Field List containerChildren>
	//   11   21:iload_2         
	//   12   22:invokeinterface #47  <Method Object List.get(int)>
	//   13   27:checkcast       #2   <Class Atom$ContainerAtom>
	//   14   30:astore          4
			if(atom$containeratom.type == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #54  <Field int type>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return atom$containeratom;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public Atom.LeafAtom getLeafAtomOfType(int i)
	{
		int k = leafChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field List leafChildren>
	//    2    4:invokeinterface #43  <Method int List.size()>
	//    3    9:istore_3        
		for(int j = 0; j < k; j++)
	//*   4   10:iconst_0        
	//*   5   11:istore_2        
	//*   6   12:iload_2         
	//*   7   13:iload_3         
	//*   8   14:icmpge          51
		{
			Atom.LeafAtom leafatom = (Atom.LeafAtom)leafChildren.get(j);
	//    9   17:aload_0         
	//   10   18:getfield        #26  <Field List leafChildren>
	//   11   21:iload_2         
	//   12   22:invokeinterface #47  <Method Object List.get(int)>
	//   13   27:checkcast       #49  <Class Atom$LeafAtom>
	//   14   30:astore          4
			if(leafatom.type == i)
	//*  15   32:aload           4
	//*  16   34:getfield        #53  <Field int Atom$LeafAtom.type>
	//*  17   37:iload_1         
	//*  18   38:icmpne          44
				return leafatom;
	//   19   41:aload           4
	//   20   43:areturn         
		}

	//   21   44:iload_2         
	//   22   45:iconst_1        
	//   23   46:iadd            
	//   24   47:istore_2        
	//*  25   48:goto            12
		return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #62  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getAtomTypeString(type));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field int type>
	//    7   13:invokestatic    #67  <Method String getAtomTypeString(int)>
	//    8   16:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(" leaves: ");
	//   10   20:aload_1         
	//   11   21:ldc1            #73  <String " leaves: ">
	//   12   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(Arrays.toString(leafChildren.toArray()));
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:getfield        #26  <Field List leafChildren>
	//   17   32:invokeinterface #77  <Method Object[] List.toArray()>
	//   18   37:invokestatic    #82  <Method String Arrays.toString(Object[])>
	//   19   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
		stringbuilder.append(" containers: ");
	//   21   44:aload_1         
	//   22   45:ldc1            #84  <String " containers: ">
	//   23   47:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
		stringbuilder.append(Arrays.toString(containerChildren.toArray()));
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #28  <Field List containerChildren>
	//   28   56:invokeinterface #77  <Method Object[] List.toArray()>
	//   29   61:invokestatic    #82  <Method String Arrays.toString(Object[])>
	//   30   64:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   31   67:pop             
		return stringbuilder.toString();
	//   32   68:aload_1         
	//   33   69:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   34   72:areturn         
	}

	public final List containerChildren = new ArrayList();
	public final long endPosition;
	public final List leafChildren = new ArrayList();

	public Atom$ContainerAtom(int i, long l)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #17  <Method void Atom(int)>
		endPosition = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #19  <Field long endPosition>
	//    6   10:aload_0         
	//    7   11:new             #21  <Class ArrayList>
	//    8   14:dup             
	//    9   15:invokespecial   #24  <Method void ArrayList()>
	//   10   18:putfield        #26  <Field List leafChildren>
	//   11   21:aload_0         
	//   12   22:new             #21  <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #24  <Method void ArrayList()>
	//   15   29:putfield        #28  <Field List containerChildren>
	//   16   32:return          
	}
}
