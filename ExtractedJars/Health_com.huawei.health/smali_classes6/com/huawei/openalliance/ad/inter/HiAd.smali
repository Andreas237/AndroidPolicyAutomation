.class public final Lcom/huawei/openalliance/ad/inter/HiAd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/IHiAd;
.implements Lcom/huawei/openalliance/ad/inter/a;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/huawei/openalliance/ad/inter/HiAd;

.field private static final c:[B


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lcom/huawei/openalliance/ad/e/a/e;

.field private f:Lcom/huawei/openalliance/ad/e/a/c;

.field private g:Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;

.field private h:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;>;"
        }
    .end annotation
.end field

.field private j:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->a:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->i:Ljava/util/Map;

    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAd$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/HiAd$3;-><init>(Lcom/huawei/openalliance/ad/inter/HiAd;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->c()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->f:Lcom/huawei/openalliance/ad/e/a/c;

    new-instance v0, Lcom/huawei/openalliance/ad/d/b;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ah;->a(Lcom/huawei/openalliance/ad/d/a/a;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->g()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->e:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/HiAd;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/inter/HiAd;)Lcom/huawei/openalliance/ad/e/a/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->f:Lcom/huawei/openalliance/ad/e/a/c;

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/HiAd;
    .locals 4

    sget-object v2, Lcom/huawei/openalliance/ad/inter/HiAd;->c:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/HiAd;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->b:Lcom/huawei/openalliance/ad/inter/HiAd;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->b:Lcom/huawei/openalliance/ad/inter/HiAd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/inter/HiAd;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 3

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->j:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private d()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->e()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->f()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/inter/HiAd;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->d()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/inter/HiAd;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->i:Ljava/util/Map;

    return-object v0
.end method

.method private e()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ab;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ab;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/IHiAd;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-static {p0}, Lcom/huawei/openalliance/ad/inter/HiAd;->b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/HiAd;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->g:Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;

    return-object v0
.end method

.method public a(Landroid/content/BroadcastReceiver;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->i:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/inter/HiAd;->a:Ljava/lang/String;

    const-string v1, "adId is empty, please check it!"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAd$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/inter/HiAd$1;-><init>(Lcom/huawei/openalliance/ad/inter/HiAd;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;
    .locals 2

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->h:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/media/a;

    move-result-object v0

    return-object v0
.end method

.method public enableSharePd(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/e;->b(Z)V

    return-void
.end method

.method public enableUserInfo(Z)V
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/e;->a(Z)V

    if-nez p1, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAd$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/HiAd$2;-><init>(Lcom/huawei/openalliance/ad/inter/HiAd;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public initLog(ZI)V
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->d:Landroid/content/Context;

    invoke-static {v0, p2}, Lcom/huawei/openalliance/ad/utils/r;->a(Landroid/content/Context;I)V

    :cond_1
    return-void
.end method

.method public isEnableUserInfo()Z
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    return v0
.end method

.method public requestConfig(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public setCustomSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V
    .locals 0

    invoke-static {p1}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a(Ljavax/net/ssl/SSLSocketFactory;)V

    invoke-static {p2}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a(Ljavax/net/ssl/X509TrustManager;)V

    return-void
.end method

.method public setLandingPageAction(Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->g:Lcom/huawei/openalliance/ad/inter/listeners/LandingPageAction;

    return-void
.end method

.method public setMultiMediaPlayingManager(Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAd;->h:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    return-void
.end method
