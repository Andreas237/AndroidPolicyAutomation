.class public Lcom/yandex/metrica/impl/ob/lh;
.super Lcom/yandex/metrica/impl/ob/kx;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static volatile b:Lcom/yandex/metrica/impl/ob/lh;


# instance fields
.field private c:I

.field private d:Lcom/yandex/metrica/impl/ob/kx;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/lh;->a:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kx;-><init>()V

    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.telephony"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Lcom/yandex/metrica/impl/ob/lb;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/lb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    return-void

    .line 39
    :cond_0
    new-instance p1, Lcom/yandex/metrica/impl/ob/lc;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/lc;-><init>()V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;
    .locals 2

    .line 22
    sget-object v0, Lcom/yandex/metrica/impl/ob/lh;->b:Lcom/yandex/metrica/impl/ob/lh;

    if-nez v0, :cond_1

    .line 23
    sget-object v0, Lcom/yandex/metrica/impl/ob/lh;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 24
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/ob/lh;->b:Lcom/yandex/metrica/impl/ob/lh;

    if-nez v1, :cond_0

    .line 25
    new-instance v1, Lcom/yandex/metrica/impl/ob/lh;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ob/lh;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/ob/lh;->b:Lcom/yandex/metrica/impl/ob/lh;

    .line 27
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 29
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/ob/lh;->b:Lcom/yandex/metrica/impl/ob/lh;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 44
    :try_start_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    .line 45
    iget v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    if-ne v0, v1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kx;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 43
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/kz;)V
    .locals 1

    monitor-enter p0

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kx;->a(Lcom/yandex/metrica/impl/ob/kz;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/lk;)V
    .locals 1

    monitor-enter p0

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kx;->a(Lcom/yandex/metrica/impl/ob/lk;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 58
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    .line 51
    :try_start_0
    iget v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    .line 52
    iget v0, p0, Lcom/yandex/metrica/impl/ob/lh;->c:I

    if-nez v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lh;->d:Lcom/yandex/metrica/impl/ob/kx;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kx;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 50
    monitor-exit p0

    throw v0
.end method
