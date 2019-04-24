.class Lo/dkw$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/dkw;


# direct methods
.method private constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1873
    iput-object p1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dkw;Lo/dkw$3;)V
    .locals 0

    .line 1873
    invoke-direct {p0, p1}, Lo/dkw$d;-><init>(Lo/dkw;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 1876
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1880
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_8

    .line 1882
    :sswitch_0
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1883
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1884
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 1886
    :cond_0
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;Ljava/lang/String;)Ljava/lang/String;

    .line 1888
    :goto_0
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->b()I

    move-result v1

    invoke-static {v0, v1}, Lo/dkw;->b(Lo/dkw;I)I

    .line 1889
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GPSHandle start queryFileInformation fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " fileType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->p(Lo/dkw;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1890
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1891
    :cond_1
    invoke-virtual {p0}, Lo/dkw$d;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 1892
    const/16 v0, 0xa

    iput v0, v5, Landroid/os/Message;->what:I

    .line 1893
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dkj;

    invoke-virtual {v0}, Lo/dkj;->c()I

    move-result v0

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 1894
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1895
    const/16 v0, 0x2713

    iput v0, v5, Landroid/os/Message;->arg2:I

    .line 1896
    invoke-virtual {p0, v5}, Lo/dkw$d;->sendMessage(Landroid/os/Message;)Z

    .line 1898
    goto/16 :goto_8

    .line 1899
    :cond_2
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkw;->c(Lo/dkw;Ljava/lang/String;)V

    goto/16 :goto_8

    .line 1902
    :cond_3
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v5

    .line 1904
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->d()V

    .line 1905
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1906
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1907
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 1908
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 1909
    const/4 v0, 0x3

    new-array v9, v0, [Ljava/lang/Object;

    .line 1910
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->e(Lo/dkw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 1911
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1913
    goto :goto_1

    .line 1914
    :cond_4
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->l(Lo/dkw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 1915
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1917
    goto :goto_2

    .line 1918
    :cond_5
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->m(Lo/dkw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Map$Entry;

    .line 1919
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1920
    goto :goto_3

    .line 1921
    :cond_6
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/16 v1, 0x2713

    if-ne v1, v0, :cond_7

    .line 1922
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no gps data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1923
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1924
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1925
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1927
    :cond_7
    const/4 v0, 0x0

    aput-object v6, v9, v0

    .line 1928
    const/4 v0, 0x1

    aput-object v7, v9, v0

    .line 1929
    const/4 v0, 0x2

    aput-object v8, v9, v0

    .line 1930
    const/16 v0, 0x2710

    invoke-interface {v5, v0, v9}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1931
    goto :goto_4

    .line 1932
    :cond_8
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1934
    :goto_4
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle maintenance success  ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1936
    goto/16 :goto_8

    .line 1938
    :sswitch_1
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PROCESS_NEXT_TASK "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1939
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v5

    .line 1940
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->d()V

    .line 1941
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 1942
    const/4 v0, 0x3

    new-array v6, v0, [Ljava/lang/Object;

    .line 1943
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 1944
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 1945
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x2

    aput-object v0, v6, v1

    .line 1946
    const/16 v0, 0x2710

    invoke-interface {v5, v0, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1947
    goto/16 :goto_8

    .line 1948
    :cond_9
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1951
    goto/16 :goto_8

    .line 1953
    :sswitch_2
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->n(Lo/dkw;)I

    .line 1955
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->o(Lo/dkw;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_a

    .line 1956
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle \u5927\u4e8e3\u6b21\u5931\u8d25 reTransforTime = 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1959
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->r(Lo/dkw;)V

    .line 1960
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->q(Lo/dkw;)V

    .line 1961
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 1962
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_8

    .line 1966
    :cond_a
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->s(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1967
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle \u4e22\u5305\u5199\u5165"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1969
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->u(Lo/dkw;)I

    move-result v0

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->t(Lo/dkw;)I

    move-result v1

    sub-int/2addr v0, v1

    if-ltz v0, :cond_b

    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->t(Lo/dkw;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1970
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->u(Lo/dkw;)I

    move-result v1

    iget-object v2, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v2}, Lo/dkw;->t(Lo/dkw;)I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/dkw;->e(Lo/dkw;I)I

    .line 1971
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;I)I

    .line 1973
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkw;->a(Lo/dkw;I)I

    .line 1974
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->s(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1977
    :cond_b
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 1978
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle \u4e22\u5305\u91cd\u53d1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1979
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->a()V

    .line 1980
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->v(Lo/dkw;)I

    move-result v1

    int-to-long v1, v1

    const/4 v3, 0x7

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_8

    .line 1985
    :sswitch_3
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle data transfer time out ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1988
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->r(Lo/dkw;)V

    .line 1989
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->q(Lo/dkw;)V

    .line 1990
    goto/16 :goto_8

    .line 1992
    :sswitch_4
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getErrorCode([B)[I

    move-result-object v4

    .line 1994
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v4}, Lo/dkw;->c(Lo/dkw;Ljava/lang/Object;)V

    .line 1995
    goto/16 :goto_8

    .line 1997
    :sswitch_5
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 1998
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2000
    :cond_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v6, v0

    check-cast v6, [B

    .line 2001
    array-length v0, v6

    const/16 v1, 0x8

    if-ne v1, v0, :cond_d

    const/4 v0, 0x2

    aget-byte v0, v6, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_d

    .line 2003
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->a(Lo/dkw;[B)V

    goto/16 :goto_8

    .line 2005
    :cond_d
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetGPSFileName([B)Ljava/util/List;

    move-result-object v4

    .line 2006
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v4}, Lo/dkw;->e(Lo/dkw;Ljava/lang/Object;)V

    .line 2008
    goto/16 :goto_8

    .line 2010
    :sswitch_6
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 2011
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2013
    :cond_e
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetMaintParameters([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    move-result-object v4

    .line 2014
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v4}, Lo/dkw;->d(Lo/dkw;Ljava/lang/Object;)V

    .line 2015
    goto/16 :goto_8

    .line 2017
    :sswitch_7
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 2018
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2020
    :cond_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v7, v0

    check-cast v7, [B

    .line 2021
    array-length v0, v7

    const/16 v1, 0x8

    if-ne v1, v0, :cond_10

    const/4 v0, 0x2

    aget-byte v0, v7, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_10

    .line 2022
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->q(Lo/dkw;)V

    goto/16 :goto_8

    .line 2024
    :cond_10
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unQueryFileInformation([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    move-result-object v4

    .line 2025
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v4}, Lo/dkw;->a(Lo/dkw;Ljava/lang/Object;)V

    .line 2027
    goto/16 :goto_8

    .line 2029
    :sswitch_8
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 2030
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2032
    :cond_11
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getAckCode([B)[I

    move-result-object v4

    .line 2033
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    check-cast v0, [B

    invoke-static {v0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v8

    .line 2034
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v8

    .line 2036
    :try_start_1
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v9

    .line 2037
    invoke-virtual {v9}, Lo/dba;->a()Ljava/util/List;

    move-result-object v10

    .line 2038
    const/4 v11, 0x0

    :goto_5
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_14

    .line 2039
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/daw;

    .line 2040
    const/4 v13, 0x0

    .line 2041
    invoke-virtual {v12}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_13

    .line 2042
    invoke-virtual {v12}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 2046
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "---5.10.4 response--currentApplyDataSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->y(Lo/dkw;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";donePackatgeSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->t(Lo/dkw;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2047
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->y(Lo/dkw;)I

    move-result v0

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->t(Lo/dkw;)I

    move-result v1

    if-eq v0, v1, :cond_12

    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->t(Lo/dkw;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 2048
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->z(Lo/dkw;)V

    .line 2050
    :cond_12
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0, v13}, Lo/dkw;->h(Lo/dkw;I)I
    :try_end_1
    .catch Lo/day; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 2051
    goto :goto_6

    .line 2038
    :cond_13
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_5

    .line 2057
    :cond_14
    :goto_6
    goto :goto_7

    .line 2055
    :catch_0
    move-exception v9

    .line 2056
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.10.4 exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2059
    :goto_7
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->w(Lo/dkw;)I

    move-result v1

    invoke-static {v0, v4, v1}, Lo/dkw;->d(Lo/dkw;Ljava/lang/Object;I)V

    .line 2060
    goto :goto_8

    .line 2062
    :sswitch_9
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGPSApplyDataFromDevice([B)Lo/dkh;

    move-result-object v4

    .line 2064
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->C(Lo/dkw;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 2065
    iget-object v0, p0, Lo/dkw$d;->c:Lo/dkw;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/dkw;->e(Lo/dkw;Ljava/lang/Object;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    nop

    .line 2071
    .line 2077
    :cond_15
    :goto_8
    :sswitch_a
    goto :goto_9

    .line 2075
    :catch_1
    move-exception v5

    .line 2076
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPSHandle handleMessage() Exception e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2078
    :goto_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_5
        0x2 -> :sswitch_6
        0x3 -> :sswitch_7
        0x4 -> :sswitch_8
        0x5 -> :sswitch_9
        0x6 -> :sswitch_a
        0x7 -> :sswitch_2
        0xa -> :sswitch_0
        0xf -> :sswitch_3
        0x10 -> :sswitch_1
        0x7f -> :sswitch_4
    .end sparse-switch
.end method
