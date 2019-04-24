.class public Lcom/huawei/openalliance/ad/inter/NativeAdLoader;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/INativeAdLoader;
.implements Lcom/huawei/openalliance/ad/k/f$a;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

.field private c:Landroid/content/Context;

.field private final d:[Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/Boolean;

.field private g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

.field private h:Lcom/huawei/openalliance/ad/k/b/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;->a:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c:Landroid/content/Context;

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    array-length v0, p2

    if-lez v0, :cond_1

    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    :goto_0
    new-instance v0, Lcom/huawei/openalliance/ad/k/f;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/k/f;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/k/f$a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->h:Lcom/huawei/openalliance/ad/k/b/e;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;)Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->f:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(ILjava/lang/String;Z)V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$2;-><init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V

    sget-object v1, Lcom/huawei/openalliance/ad/utils/d$a;->b:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(ILjava/lang/String;Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->f:Ljava/lang/Boolean;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->e:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Lcom/huawei/openalliance/ad/k/b/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->h:Lcom/huawei/openalliance/ad/k/b/e;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;)Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdFailed, errorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$4;-><init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/INativeAd;>;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onAdsLoaded, size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", listener:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$3;-><init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;Ljava/util/Map;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public loadAds(ILjava/lang/String;Z)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3e9

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(I)V

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    const-string v1, "waiting for request finish"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x2bd

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->d:[Ljava/lang/String;

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

    const-string v1, "empty ad ids"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x2be

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(I)V

    return-void

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->b:Lcom/huawei/openalliance/ad/inter/NativeAdLoader$a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->G()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/a;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader$1;-><init>(Lcom/huawei/openalliance/ad/inter/NativeAdLoader;ILjava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->a(ILjava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method public loadAds(IZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->loadAds(ILjava/lang/String;Z)V

    return-void
.end method

.method public setListener(Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/NativeAdLoader;->g:Lcom/huawei/openalliance/ad/inter/listeners/NativeAdListener;

    return-void
.end method
