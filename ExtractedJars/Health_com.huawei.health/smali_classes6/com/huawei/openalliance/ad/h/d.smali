.class public Lcom/huawei/openalliance/ad/h/d;
.super Lcom/huawei/openalliance/ad/h/a;


# instance fields
.field f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/h/a;-><init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->j:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->k:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/h/d;->m()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/h/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/h/d;->l()V

    return-void
.end method

.method private l()V
    .locals 5

    const-string v0, "RealtimeAdMediator"

    const-string v1, "doOnShowSloganEnd gif: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->j:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->k:Z

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "RealtimeAdMediator"

    const-string v1, "Ad fails to display or loading timeout, ad dismiss"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->c()V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->f:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const-string v0, "RealtimeAdMediator"

    const-string v1, "Ad has been loaded, but not shown yet"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/d;->c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private m()V
    .locals 6

    const-string v0, "RealtimeAdMediator"

    const-string v1, "doOnReachMinSloganShowTime"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->g:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/d;->c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->D()Z

    move-result v5

    const-string v0, "RealtimeAdMediator"

    const-string v1, "doOnReachMinSloganShowTime finish splash: %s adFailToDisplay: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->j:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v5, :cond_1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->j:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->c()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getPremulticontent__()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v2

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/beans/metadata/Precontent;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getNoReportAdTypeEventList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/Precontent;->setNoReportEventList(Ljava/util/List;I)V

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/Precontent;->getSlotid__()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v5, v1}, Lcom/huawei/openalliance/ad/k/g;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Precontent;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public b(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getMultiad__()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v2

    :cond_1
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getSlotid__()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/Ad30;->getContent__()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v2

    :cond_2
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/openalliance/ad/beans/metadata/Content;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getNoReportAdTypeEventList()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->setNoReportEventList(Ljava/util/List;I)V

    const/4 v0, 0x1

    invoke-static {v5, v7, v0}, Lcom/huawei/openalliance/ad/k/g;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method protected c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 5

    const-string v0, "RealtimeAdMediator"

    const-string v1, "on content loaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/d;->l:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->e:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    if-nez p1, :cond_0

    const/4 v0, -0x4

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/d;->a(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->k()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v2

    if-nez v2, :cond_1

    const/16 v0, 0x1f3

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/d;->a(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->k()V

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->g:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    if-eqz v0, :cond_5

    :cond_2
    invoke-interface {v2}, Lcom/huawei/openalliance/ad/views/interfaces/c;->getContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/huawei/openalliance/ad/b/c;

    invoke-direct {v4, v3}, Lcom/huawei/openalliance/ad/b/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/b/b;->a()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/h/d;->b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/16 v0, 0x1f3

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/d;->a(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->k()V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->f:Z

    :goto_0
    goto :goto_1

    :cond_5
    const-string v0, "RealtimeAdMediator"

    const-string v1, "slogan hasn\'t reach min show time or end, show ad later"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method protected h()V
    .locals 5

    const-string v0, "RealtimeAdMediator"

    const-string v1, "on ad load timeout gifSlogan: %s sloganShowEnd: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->k:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0}, Lcom/huawei/openalliance/ad/h/a;->h()V

    :cond_1
    return-void
.end method

.method public j()V
    .locals 3

    const-string v0, "RealtimeAdMediator"

    const-string v1, "start"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->c()V

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/h/d$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/d$1;-><init>(Lcom/huawei/openalliance/ad/h/d;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    new-instance v0, Lcom/huawei/openalliance/ad/h/d$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/d$2;-><init>(Lcom/huawei/openalliance/ad/h/d;)V

    invoke-interface {v2, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(Lcom/huawei/openalliance/ad/f/a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->i:Z

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->f()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->g()V

    return-void
.end method

.method public k()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/d;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->D()Z

    move-result v5

    const-string v0, "RealtimeAdMediator"

    const-string v1, "onAdFailToDisplay - finishSplashOnMinSlogan: %s reachMinSloganShowTime: %s sloganShowEnd: %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->g:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->j:Z

    if-eqz v5, :cond_0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->g:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/d;->h:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/d;->c()V

    :cond_2
    return-void
.end method
