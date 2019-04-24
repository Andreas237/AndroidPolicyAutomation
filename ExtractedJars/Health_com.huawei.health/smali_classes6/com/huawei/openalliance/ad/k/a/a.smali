.class public Lcom/huawei/openalliance/ad/k/a/a;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;
    .locals 9

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getMultiad__()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getContent__()Ljava/util/List;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/openalliance/ad/beans/metadata/Content;

    if-eqz v7, :cond_2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getNoReportAdTypeEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0, p2}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->setNoReportEventList(Ljava/util/List;I)V

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getFilterList()Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/k/a/a;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getSlotid__()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v7, p2}, Lcom/huawei/openalliance/ad/k/a/a;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    goto :goto_1

    :cond_3
    invoke-virtual {v3, v5}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->setContent__(Ljava/util/List;)V

    goto/16 :goto_0

    :cond_4
    return-object p1
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/openalliance/ad/k/a/g;>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-nez p0, :cond_3

    :cond_0
    if-nez p1, :cond_1

    const-string v0, "AdFilterManager"

    const-string v1, "createFilters filterList is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-nez p0, :cond_2

    const-string v0, "AdFilterManager"

    const-string v1, "createFilters context is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    return-object v0

    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/b;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/a/b;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_1
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/c;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/a/c;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_2
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/h;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/a/h;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_3
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/d;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/a/d;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :sswitch_4
    new-instance v0, Lcom/huawei/openalliance/ad/k/a/f;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/a/f;-><init>(Landroid/content/Context;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    goto/16 :goto_0

    :cond_5
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x63 -> :sswitch_4
    .end sparse-switch
.end method

.method private static a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/openalliance/ad/k/a/g;>;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/k/a/g;

    invoke-interface {v3, p0, p3, p2}, Lcom/huawei/openalliance/ad/k/a/g;->a(Ljava/lang/String;ILcom/huawei/openalliance/ad/beans/metadata/Content;)Z

    move-result v0

    or-int/2addr v1, v0

    goto :goto_0

    :cond_1
    return v1
.end method
