// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.android;


// Referenced classes of package ch.qos.logback.classic.android:
//			ASaxEventRecorder

static class ASaxEventRecorder$StatePassFilter
{

	public boolean checkEnd(String s)
	{
		int i = _depth;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int _depth>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(i > 0 && s.equals(((Object) (_states[_depth - 1]))))
	//*   5    7:iload_2         
	//*   6    8:ifle            41
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #22  <Field String[] _states>
	//*  10   16:aload_0         
	//*  11   17:getfield        #18  <Field int _depth>
	//*  12   20:iconst_1        
	//*  13   21:isub            
	//*  14   22:aaload          
	//*  15   23:invokevirtual   #29  <Method boolean String.equals(Object)>
	//*  16   26:ifeq            41
		{
			_depth = _depth - 1;
	//   17   29:aload_0         
	//   18   30:aload_0         
	//   19   31:getfield        #18  <Field int _depth>
	//   20   34:iconst_1        
	//   21   35:isub            
	//   22   36:putfield        #18  <Field int _depth>
			return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
		}
		if(_depth == _states.length)
	//*  25   41:aload_0         
	//*  26   42:getfield        #18  <Field int _depth>
	//*  27   45:aload_0         
	//*  28   46:getfield        #22  <Field String[] _states>
	//*  29   49:arraylength     
	//*  30   50:icmpne          55
			flag = true;
	//   31   53:iconst_1        
	//   32   54:istore_3        
		return flag;
	//   33   55:iload_3         
	//   34   56:ireturn         
	}

	public boolean checkStart(String s)
	{
		if(_depth == _states.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field int _depth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field String[] _states>
	//*   4    8:arraylength     
	//*   5    9:icmpne          14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
		if(s.equals(((Object) (_states[_depth]))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #22  <Field String[] _states>
	//*  11   19:aload_0         
	//*  12   20:getfield        #18  <Field int _depth>
	//*  13   23:aaload          
	//*  14   24:invokevirtual   #29  <Method boolean String.equals(Object)>
	//*  15   27:ifeq            40
			_depth = _depth + 1;
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #18  <Field int _depth>
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:putfield        #18  <Field int _depth>
		return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	public int depth()
	{
		return _depth;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int _depth>
	//    2    4:ireturn         
	}

	public boolean passed()
	{
		return _depth == _states.length;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int _depth>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String[] _states>
	//    4    8:arraylength     
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public void reset()
	{
		_depth = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field int _depth>
	//    3    5:return          
	}

	public int size()
	{
		return _states.length;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field String[] _states>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	private int _depth;
	private final String _states[];

	public transient ASaxEventRecorder$StatePassFilter(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		_depth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field int _depth>
		String as1[] = as;
	//    5    9:aload_1         
	//    6   10:astore_2        
		if(as == null)
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       20
			as1 = new String[0];
	//    9   15:iconst_0        
	//   10   16:anewarray       String[]
	//   11   19:astore_2        
		_states = as1;
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:putfield        #22  <Field String[] _states>
	//   15   25:return          
	}
}
