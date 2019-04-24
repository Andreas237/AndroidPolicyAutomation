.class public abstract Lcom/huawei/openalliance/ad/h/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/h/a/a;
.implements Lcom/huawei/openalliance/ad/k/b/g;


# instance fields
.field protected a:Lcom/huawei/openalliance/ad/views/interfaces/e;

.field protected b:Lcom/huawei/openalliance/ad/constant/AdLoadState;

.field protected c:Lcom/huawei/openalliance/ad/e/a/e;

.field protected d:Lcom/huawei/openalliance/ad/e/a/a;

.field protected e:Lcom/huawei/openalliance/ad/k/b/d;

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/views/interfaces/c;>;"
        }
    .end annotation
.end field

.field private g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

.field private h:Lcom/huawei/openalliance/ad/k/b/b;

.field private i:Z

.field private j:Z

.field private final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/views/interfaces/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/a;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/a;->j:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "load_timeout_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->k:Ljava/lang/String;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->f:Ljava/lang/ref/WeakReference;

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/c;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/e/b;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->d:Lcom/huawei/openalliance/ad/e/a/a;

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Lcom/huawei/openalliance/ad/m/a/f;

    invoke-direct {v1, v2}, Lcom/huawei/openalliance/ad/m/a/f;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v2, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->e:Lcom/huawei/openalliance/ad/k/b/d;

    new-instance v0, Lcom/huawei/openalliance/ad/k/a;

    invoke-direct {v0, v2}, Lcom/huawei/openalliance/ad/k/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->h:Lcom/huawei/openalliance/ad/k/b/b;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/a;)Lcom/huawei/openalliance/ad/k/b/b;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->h:Lcom/huawei/openalliance/ad/k/b/b;

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/h/a$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/h/a$3;-><init>(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    sget-object v1, Lcom/huawei/openalliance/ad/utils/d$a;->h:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V
    .locals 2

    invoke-static {p2}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/openalliance/ad/h/a$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/openalliance/ad/h/a$2;-><init>(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V
    .locals 8

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->d()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v7

    if-nez v7, :cond_0

    const-string v0, "AdMediator"

    const-string v1, "onPostAdRequest adSlotParam is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->h:Lcom/huawei/openalliance/ad/k/b/b;

    move-object v1, p1

    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v2

    move-object v3, p0

    new-instance v4, Lcom/huawei/openalliance/ad/h/a$4;

    invoke-direct {v4, p0}, Lcom/huawei/openalliance/ad/h/a$4;-><init>(Lcom/huawei/openalliance/ad/h/a;)V

    move-wide v5, p2

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/k/b/b;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;ILcom/huawei/openalliance/ad/k/b/g;Lcom/huawei/openalliance/ad/k/b/a;J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/h/a;->d(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/h/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/h/a;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/h/a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/a;->i:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/h/a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->k:Ljava/lang/String;

    return-object v0
.end method

.method private d(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 5

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->updateOnAdLoad()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "priority"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "lastShowTime"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "displayCount"

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->d:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v4, v1}, Lcom/huawei/openalliance/ad/e/a/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->d:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getTaskId_()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/constant/AdLoadState;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->b:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    return-object v0
.end method

.method protected a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Lcom/huawei/openalliance/ad/views/interfaces/c;)Lcom/huawei/openalliance/ad/views/interfaces/e;
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCreativeType_()I

    move-result v0

    invoke-interface {p2, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(I)Lcom/huawei/openalliance/ad/views/interfaces/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/interfaces/e;->setAdContent(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0, p0}, Lcom/huawei/openalliance/ad/views/interfaces/e;->setAdMediator(Lcom/huawei/openalliance/ad/h/a/a;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCreativeType_()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->b()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/e;->setDisplayDuration(I)V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->n()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/interfaces/e;->setDisplayDuration(I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/inter/listeners/AdListener;->onAdFailedToLoad(I)V

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/interfaces/e;->a(II)V

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->c()V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 4

    new-instance v0, Lcom/huawei/openalliance/ad/h/a$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/h/a$1;-><init>(Lcom/huawei/openalliance/ad/h/a;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->E()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->e:Lcom/huawei/openalliance/ad/k/b/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowAppLogoFlag_()I

    move-result v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->setLogoVisibility(I)V

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->d()I

    move-result v0

    invoke-interface {v3, p1, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;I)V

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadState;->LOADED:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->b:Lcom/huawei/openalliance/ad/constant/AdLoadState;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/listeners/AdListener;->onAdLoaded()V

    :cond_2
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/listeners/AdListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    return-void
.end method

.method protected b()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->d:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/a;->b()V

    return-void
.end method

.method protected b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)Z
    .locals 3

    const-string v0, "AdMediator"

    const-string v1, "showAdContent"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0, p1, v2}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Lcom/huawei/openalliance/ad/views/interfaces/c;)Lcom/huawei/openalliance/ad/views/interfaces/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v2, v0}, Lcom/huawei/openalliance/ad/views/interfaces/c;->a(Lcom/huawei/openalliance/ad/views/interfaces/e;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->a:Lcom/huawei/openalliance/ad/views/interfaces/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/e;->b()V

    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 2

    const-string v0, "AdMediator"

    const-string v1, "notifyAdDismissed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/h/a;->j:Z

    if-eqz v0, :cond_0

    const-string v0, "AdMediator"

    const-string v1, "ad already dismissed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/h/a;->j:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->g:Lcom/huawei/openalliance/ad/inter/listeners/AdListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/listeners/AdListener;->onAdDismissed()V

    :cond_1
    return-void
.end method

.method protected abstract c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
.end method

.method protected d()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v1}, Lcom/huawei/openalliance/ad/views/interfaces/c;->getAdSlotParam()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v2

    return-object v2
.end method

.method protected e()Landroid/content/Context;
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->i()Lcom/huawei/openalliance/ad/views/interfaces/c;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v1}, Lcom/huawei/openalliance/ad/views/interfaces/c;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method protected f()V
    .locals 6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->d()Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    move-result-object v4

    if-nez v4, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/h/a;->c(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->e()Landroid/content/Context;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v5, :cond_1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AdMediator"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start to request oaid "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, v4}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    :goto_0
    return-void
.end method

.method protected g()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->g()I

    move-result v5

    const-string v0, "AdMediator"

    const-string v1, "startAdLoadTimeoutTask - max load time: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/h/a$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/h/a$5;-><init>(Lcom/huawei/openalliance/ad/h/a;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/h/a;->k:Ljava/lang/String;

    int-to-long v2, v5

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method protected h()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/h/a;->c()V

    return-void
.end method

.method protected i()Lcom/huawei/openalliance/ad/views/interfaces/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/c;

    return-object v0
.end method
