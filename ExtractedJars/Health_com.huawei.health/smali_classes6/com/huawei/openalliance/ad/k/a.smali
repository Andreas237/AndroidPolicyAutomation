.class public Lcom/huawei/openalliance/ad/k/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/b;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/huawei/openalliance/ad/e/a/a;

.field private d:Lcom/huawei/openalliance/ad/e/a/d;

.field private e:Lcom/huawei/openalliance/ad/e/a/c;

.field private f:Lcom/huawei/openalliance/ad/e/a/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/b;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->c:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/e;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->f:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getAdIds()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/inter/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/k/a;->a:Ljava/lang/String;

    const-string v1, "refreshConfig RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/k/a;->a:Ljava/lang/String;

    const-string v1, "refreshConfig Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;II)V
    .locals 2

    new-instance v1, Lcom/huawei/openalliance/ad/d/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/k/a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, p1, p3}, Lcom/huawei/openalliance/ad/d/b;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p3}, Lcom/huawei/openalliance/ad/d/b;->b(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;IJ)V
    .locals 2

    new-instance v1, Lcom/huawei/openalliance/ad/d/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/d/b;->a(Ljava/lang/String;IJ)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/k/a$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/k/a$1;-><init>(Lcom/huawei/openalliance/ad/k/a;Ljava/util/List;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-lt p1, v0, :cond_0

    const/16 v0, 0x12c

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;
    .locals 11

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/k/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->c:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/a;->d()Ljava/util/List;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->d:Lcom/huawei/openalliance/ad/e/a/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/d;->b()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->e:Lcom/huawei/openalliance/ad/e/a/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/huawei/openalliance/ad/e/a/c;->a(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List;Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v7

    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    const/4 v8, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getRetcode__()I

    move-result v8

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    sub-long v9, v0, v5

    const/4 v0, 0x1

    invoke-static {p1, v7, v0}, Lcom/huawei/openalliance/ad/k/a/a;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/openalliance/ad/k/h;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/util/List;)V

    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v4, v8, v0}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/lang/String;II)V

    const/4 v0, 0x1

    invoke-direct {p0, v4, v0, v9, v10}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/lang/String;IJ)V

    return-object v7
.end method

.method public a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;ILcom/huawei/openalliance/ad/k/b/g;Lcom/huawei/openalliance/ad/k/b/a;J)V
    .locals 8

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/a;->a:Ljava/lang/String;

    const-string v1, "dealResponse adContentRsp is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/a;->a:Ljava/lang/String;

    const-string v1, "dealResponse"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Lcom/huawei/openalliance/ad/k/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-interface {p3, p1}, Lcom/huawei/openalliance/ad/k/b/g;->b(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getInvalidcontentid__()Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/k/b/c;->a(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getTodayNoShowContentid__()Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/k/b/c;->b(Ljava/util/List;)V

    invoke-interface {v3, p5, p6}, Lcom/huawei/openalliance/ad/k/b/c;->a(J)Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->c:Lcom/huawei/openalliance/ad/e/a/a;

    invoke-interface {v0, v4, p2}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eq v0, p4, :cond_2

    invoke-interface {p4, v5}, Lcom/huawei/openalliance/ad/k/b/a;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    :cond_2
    invoke-interface {v3}, Lcom/huawei/openalliance/ad/k/b/c;->a()V

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/k/b/c;->b()V

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/k/b/c;->c()V

    new-instance v6, Lcom/huawei/openalliance/ad/k/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-interface {p3, p1}, Lcom/huawei/openalliance/ad/k/b/g;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v6, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b;-><init>(Landroid/content/Context;Ljava/util/List;Z)V

    invoke-interface {v6, p5, p6}, Lcom/huawei/openalliance/ad/k/b/c;->a(J)Ljava/lang/String;

    new-instance v7, Lcom/huawei/openalliance/ad/k/i;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/k/h;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getInvalidSloganId__()Ljava/util/List;

    move-result-object v2

    invoke-direct {v7, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/i;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v7, p5, p6}, Lcom/huawei/openalliance/ad/k/b/f;->a(J)V

    invoke-interface {v7}, Lcom/huawei/openalliance/ad/k/b/f;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->f:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->a()I

    move-result v0

    const/4 v1, 0x1

    const/16 v2, 0x28

    invoke-interface {v3, v1, v0, v2}, Lcom/huawei/openalliance/ad/k/b/c;->a(III)V

    return-void
.end method

.method public b(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;
    .locals 11

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/k/a;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/a;->e:Lcom/huawei/openalliance/ad/e/a/c;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, p2, v2, v3}, Lcom/huawei/openalliance/ad/e/a/c;->a(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List;Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v7

    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    const/4 v8, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getRetcode__()I

    move-result v8

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    sub-long v9, v0, v5

    const/4 v0, 0x3

    invoke-static {p1, v7, v0}, Lcom/huawei/openalliance/ad/k/a/a;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const/4 v0, 0x3

    invoke-static {v7, v0}, Lcom/huawei/openalliance/ad/k/h;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;I)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/util/List;)V

    :cond_1
    const/4 v0, 0x3

    invoke-direct {p0, v4, v8, v0}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/lang/String;II)V

    const/4 v0, 0x3

    invoke-direct {p0, v4, v0, v9, v10}, Lcom/huawei/openalliance/ad/k/a;->a(Ljava/lang/String;IJ)V

    return-object v7
.end method
