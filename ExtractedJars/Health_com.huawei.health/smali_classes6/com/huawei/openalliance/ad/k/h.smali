.class public abstract Lcom/huawei/openalliance/ad/k/h;
.super Ljava/lang/Object;


# direct methods
.method public static a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/SloganRecord;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getSloganList__()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/k/g;->a(Lcom/huawei/openalliance/ad/beans/metadata/Slogan;)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public static a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getMultiad__()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getSlotid__()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getContent__()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/openalliance/ad/beans/metadata/Content;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getNoReportAdTypeEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0, p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->setNoReportEventList(Ljava/util/List;I)V

    invoke-static {v5, v8, p1}, Lcom/huawei/openalliance/ad/k/g;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    goto :goto_0

    :cond_3
    return-object v2
.end method
