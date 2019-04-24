// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package co.touchlab.squeaky.dao;

import java.sql.SQLException;
import java.util.List;

// Referenced classes of package co.touchlab.squeaky.dao:
//			ModelDao

class ModelDao$QueryModifiersImpl
	implements Dao.QueryModifiers
{

	public Dao.QueryModifiers foreignRefreshMap(Dao.ForeignRefresh aforeignrefresh[])
	{
		foreignRefreshMap = aforeignrefresh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
		return ((Dao.QueryModifiers) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Dao.QueryModifiers limit(Integer integer)
	{
		limit = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Integer limit>
		return ((Dao.QueryModifiers) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public List list()
		throws SQLException
	{
		ModelDao modeldao = ModelDao.this;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ModelDao this$0>
	//    2    4:astore_2        
		String s = from;
	//    3    5:aload_0         
	//    4    6:getfield        #32  <Field String from>
	//    5    9:astore_3        
		String s1 = where;
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field String where>
	//    8   14:astore          4
		String as[] = args;
	//    9   16:aload_0         
	//   10   17:getfield        #36  <Field String[] args>
	//   11   20:astore          5
		String s2 = orderBy;
	//   12   22:aload_0         
	//   13   23:getfield        #52  <Field String orderBy>
	//   14   26:astore          6
		Integer integer = limit;
	//   15   28:aload_0         
	//   16   29:getfield        #45  <Field Integer limit>
	//   17   32:astore          7
		Integer integer1 = offset;
	//   18   34:aload_0         
	//   19   35:getfield        #54  <Field Integer offset>
	//   20   38:astore          8
		Dao.ForeignRefresh aforeignrefresh[];
		if(foreignRefreshMap == null)
	//*  21   40:aload_0         
	//*  22   41:getfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
	//*  23   44:ifnonnull       72
			aforeignrefresh = ModelDao.access$300(ModelDao.this);
	//   24   47:aload_0         
	//   25   48:getfield        #27  <Field ModelDao this$0>
	//   26   51:invokestatic    #58  <Method Dao$ForeignRefresh[] ModelDao.access$300(ModelDao)>
	//   27   54:astore_1        
		else
	//*  28   55:aload_2         
	//*  29   56:aload_3         
	//*  30   57:aload           4
	//*  31   59:aload           5
	//*  32   61:aload           6
	//*  33   63:aload           7
	//*  34   65:aload           8
	//*  35   67:aload_1         
	//*  36   68:invokestatic    #62  <Method List ModelDao.access$400(ModelDao, String, String, String[], String, Integer, Integer, Dao$ForeignRefresh[])>
	//*  37   71:areturn         
			aforeignrefresh = foreignRefreshMap;
	//   38   72:aload_0         
	//   39   73:getfield        #40  <Field Dao$ForeignRefresh[] foreignRefreshMap>
	//   40   76:astore_1        
		return ModelDao.access$400(modeldao, s, s1, as, s2, integer, integer1, aforeignrefresh);
	//*  41   77:goto            55
	}

	public Dao.QueryModifiers offset(Integer integer)
	{
		offset = integer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field Integer offset>
		return ((Dao.QueryModifiers) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Dao.QueryModifiers orderBy(String s)
	{
		orderBy = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field String orderBy>
		return ((Dao.QueryModifiers) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final String args[];
	private Dao.ForeignRefresh foreignRefreshMap[];
	private final String from;
	private Integer limit;
	private Integer offset;
	private String orderBy;
	final ModelDao this$0;
	private final String where;

	public ModelDao$QueryModifiersImpl(String s, String s1, String as[])
	{
		this$0 = ModelDao.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field ModelDao this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #30  <Method void Object()>
		from = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String from>
		where = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field String where>
		args = as;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field String[] args>
	//   14   25:return          
	}
}
