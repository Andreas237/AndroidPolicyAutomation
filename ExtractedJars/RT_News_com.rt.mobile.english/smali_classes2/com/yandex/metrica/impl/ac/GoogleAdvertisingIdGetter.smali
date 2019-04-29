.class public Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$b;,
        Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$GoogleAdvertisingInfo;,
        Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d;,
        Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$c;,
        Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
    }
.end annotation


# instance fields
.field private volatile a:Ljava/lang/String;

.field private volatile b:Ljava/lang/Boolean;

.field private final c:Ljava/lang/Object;

.field private volatile d:Ljava/util/concurrent/FutureTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/FutureTask<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private e:Lcom/yandex/metrica/impl/ob/ks;


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a:Ljava/lang/String;

    .line 64
    iput-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;

    .line 66
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->c:Ljava/lang/Object;

    .line 76
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    const-class v1, Lcom/yandex/metrica/impl/ob/r;

    new-instance v2, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$1;

    invoke-direct {v2, p0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$1;-><init>(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;)V

    .line 78
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v2

    .line 84
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v2

    .line 76
    invoke-virtual {v0, p0, v1, v2}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;-><init>()V

    return-void
.end method

.method public static a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;
    .locals 1

    .line 89
    sget-object v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$c;->a:Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    return-object v0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/ks;
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->e:Lcom/yandex/metrica/impl/ob/ks;

    return-object p1
.end method

.method private a(Landroid/content/Context;Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 136
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Landroid/content/Context;)V

    .line 138
    :try_start_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d:Ljava/util/concurrent/FutureTask;

    invoke-interface {p2, p1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;)Ljava/lang/Object;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->c:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;Landroid/content/Context;)V
    .locals 6

    :try_start_0
    const-string v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    .line 1190
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getAdvertisingIdInfo"

    const/4 v2, 0x1

    .line 1191
    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    .line 1192
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v5

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info"

    .line 1194
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getId"

    .line 1195
    new-array v2, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 1196
    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "isLimitAdTrackingEnabled"

    .line 1199
    new-array v3, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 1200
    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    .line 1201
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1202
    :try_start_1
    invoke-direct {p0, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Ljava/lang/String;)V

    .line 2128
    iput-object p1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;

    .line 1204
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 123
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/m;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    .line 124
    iput-object p1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;)Ljava/lang/String;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;Landroid/content/Context;)V
    .locals 4

    .line 2213
    new-instance v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$b;-><init>(B)V

    .line 2214
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.google.android.gms.ads.identifier.service.START"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.google.android.gms"

    .line 2215
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2216
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 2217
    invoke-virtual {p1, v2, v0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2220
    :try_start_0
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$b;->a()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$GoogleAdvertisingInfo$GoogleAdvertisingInfoBinder;->create(Landroid/os/IBinder;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$GoogleAdvertisingInfo;

    move-result-object v2

    .line 2221
    invoke-interface {v2}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$GoogleAdvertisingInfo;->getId()Ljava/lang/String;

    move-result-object v3

    .line 2223
    invoke-interface {v2, v1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$GoogleAdvertisingInfo;->getEnabled(Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 2225
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2226
    :try_start_1
    invoke-direct {p0, v3}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Ljava/lang/String;)V

    .line 3128
    iput-object v1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;

    .line 2228
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2231
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void

    :catchall_0
    move-exception v1

    .line 2228
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    .line 2231
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 2232
    throw p0

    .line 2231
    :catch_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-void

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;)Ljava/lang/Boolean;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic c(Landroid/content/Context;)Z
    .locals 0

    .line 45
    invoke-static {p0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.google.android.gms.common.GooglePlayServicesUtil"

    .line 177
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "isGooglePlayServicesAvailable"

    const/4 v3, 0x1

    .line 178
    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v0

    .line 179
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    .line 180
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p0, v3, v0

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method private e()Z
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->e:Lcom/yandex/metrica/impl/ob/ks;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->e:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d:Ljava/util/concurrent/FutureTask;

    if-nez v0, :cond_1

    .line 94
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 95
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d:Ljava/util/concurrent/FutureTask;

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 96
    new-instance v1, Ljava/util/concurrent/FutureTask;

    new-instance v2, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$2;

    invoke-direct {v2, p0, p1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$2;-><init>(Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;Landroid/content/Context;)V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d:Ljava/util/concurrent/FutureTask;

    const-string p1, "YMM-UT1"

    .line 110
    iget-object v1, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->d:Ljava/util/concurrent/FutureTask;

    .line 111
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 114
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public b(Landroid/content/Context;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
    .locals 1

    .line 148
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    new-instance v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$3;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$3;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Landroid/content/Context;Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;

    return-object v0
.end method

.method public declared-synchronized d()Z
    .locals 1

    monitor-enter p0

    .line 171
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
