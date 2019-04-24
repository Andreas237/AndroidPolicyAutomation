.class public final Lcom/huawei/openalliance/ad/inter/HiAdSplash;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/IHiAdSplash;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/inter/HiAdSplash$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

.field private static final c:[B


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lcom/huawei/openalliance/ad/e/a/e;

.field private f:Lcom/huawei/openalliance/ad/e/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/b;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->f:Lcom/huawei/openalliance/ad/e/a/a;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->e:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method private static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAdSplash;
    .locals 4

    sget-object v2, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->c:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    new-instance v9, Lcom/huawei/openalliance/ad/k/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-direct {v9, v0}, Lcom/huawei/openalliance/ad/k/a;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-interface {v9, v0, p1}, Lcom/huawei/openalliance/ad/k/b/b;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v10

    move-object v0, v9

    move-object v1, v10

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v2

    new-instance v3, Lcom/huawei/openalliance/ad/inter/HiAdSplash$a;

    invoke-direct {v3}, Lcom/huawei/openalliance/ad/inter/HiAdSplash$a;-><init>()V

    move-wide v5, v7

    const/4 v4, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/openalliance/ad/k/b/b;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;ILcom/huawei/openalliance/ad/k/b/g;Lcom/huawei/openalliance/ad/k/b/a;J)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V
    .locals 2

    invoke-static {p2}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash$2;-><init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V

    return-void
.end method

.method private b()Z
    .locals 3

    new-instance v1, Lcom/huawei/openalliance/ad/b/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/openalliance/ad/b/a;-><init>(Landroid/content/Context;)V

    new-instance v2, Lcom/huawei/openalliance/ad/b/c;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/openalliance/ad/b/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lcom/huawei/openalliance/ad/b/b;->a(Lcom/huawei/openalliance/ad/b/b;)V

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/b/b;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Z
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->f:Lcom/huawei/openalliance/ad/e/a/a;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAdSplash;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAdSplash;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public isAvailable(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Z
    .locals 5

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/a;->a(Landroid/content/Context;I)I

    move-result v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/a;->b(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setWidth(I)V

    invoke-virtual {p1, v3}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->setHeight(I)V

    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;-><init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    return v4
.end method

.method public setSloganDefTime(I)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-ltz p1, :cond_1

    const/16 v0, 0x1388

    if-le p1, v0, :cond_2

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a:Ljava/lang/String;

    const-string v1, "time is out limit"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/e;->a(I)V

    return-void
.end method
