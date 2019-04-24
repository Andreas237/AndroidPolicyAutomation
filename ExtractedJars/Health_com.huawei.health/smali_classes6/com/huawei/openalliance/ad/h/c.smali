.class public Lcom/huawei/openalliance/ad/h/c;
.super Lcom/huawei/openalliance/ad/h/a;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/h/a;-><init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/c;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/h/c;->l()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    return-object v0
.end method

.method private l()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 7

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c;->d()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/c;->d:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getAdIds()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/h/c;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/e/a/e;->h()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;IJ)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    return-object v6

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method

.method public b(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/openalliance/ad/k/h;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    return-void
.end method

.method public j()V
    .locals 8

    const-string v0, "CacheAdMediator"

    const-string v1, "start"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c;->c()V

    return-void

    :cond_0
    invoke-interface {v3}, Lcom/huawei/openalliance/ad/views/interfaces/c;->getContext()Landroid/content/Context;

    move-result-object v4

    new-instance v5, Lcom/huawei/openalliance/ad/b/a;

    invoke-direct {v5, v4}, Lcom/huawei/openalliance/ad/b/a;-><init>(Landroid/content/Context;)V

    new-instance v6, Lcom/huawei/openalliance/ad/b/c;

    invoke-direct {v6, v4}, Lcom/huawei/openalliance/ad/b/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v6}, Lcom/huawei/openalliance/ad/b/b;->a(Lcom/huawei/openalliance/ad/b/b;)V

    const/4 v7, 0x0

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/b/b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/h/c$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/c$1;-><init>(Lcom/huawei/openalliance/ad/h/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    :cond_1
    if-eqz v7, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/c;->e:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, v7}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-virtual {p0, v7}, Lcom/huawei/openalliance/ad/h/c;->b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)Z

    move-result v0

    if-nez v0, :cond_3

    const/16 v0, 0x1f3

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/c;->a(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c;->k()V

    goto :goto_0

    :cond_2
    const-string v0, "CacheAdMediator"

    const-string v1, "show sloganView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/h/c$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/c$2;-><init>(Lcom/huawei/openalliance/ad/h/c;)V

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(Lcom/huawei/openalliance/ad/f/a;)Z

    :cond_3
    :goto_0
    new-instance v0, Lcom/huawei/openalliance/ad/h/c$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/c$3;-><init>(Lcom/huawei/openalliance/ad/h/c;)V

    const-wide/16 v1, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public k()V
    .locals 2

    const-string v0, "CacheAdMediator"

    const-string v1, "onAdFailToDisplay"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/c;->c()V

    return-void
.end method
