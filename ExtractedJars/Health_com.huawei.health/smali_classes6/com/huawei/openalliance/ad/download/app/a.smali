.class public Lcom/huawei/openalliance/ad/download/app/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/download/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/openalliance/ad/download/a<Lcom/huawei/openalliance/ad/download/app/c;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/openalliance/ad/k/d;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/Set<Lcom/huawei/openalliance/ad/download/h;>;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/a$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/a$5;-><init>(Lcom/huawei/openalliance/ad/download/app/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    :try_start_0
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "com.huawei.hifolder.action.app.INSTALL_STATUS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "package"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/a;->d:Landroid/content/BroadcastReceiver;

    const-string v2, "com.huawei.hifolder.permission.ACCESS_HIFOLDER_BROADCAST"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/k/d;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->b:Lcom/huawei/openalliance/ad/k/d;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "AppDownloadDelegate"

    const-string v1, "registerReceiver IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "AppDownloadDelegate"

    const-string v1, "registerReceiver Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/a;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method private declared-synchronized a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/util/Set<Lcom/huawei/openalliance/ad/download/h;>;"
        }
    .end annotation

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Ljava/lang/String;)Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized a(Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Set<Lcom/huawei/openalliance/ad/download/h;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private a(Landroid/content/Intent;)V
    .locals 12

    const-string v0, "install_result"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    const-string v0, "package_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "AppDownloadDelegate"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFolderInstallResult, result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v8

    if-eqz v8, :cond_2

    const/4 v0, 0x1

    if-eq v6, v0, :cond_1

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/download/app/c;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Lcom/huawei/openalliance/ad/k/b/d;->h(Ljava/lang/Integer;)V

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {v8, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->b:Lcom/huawei/openalliance/ad/k/d;

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v1

    invoke-virtual {v8}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v2

    move-object v4, v8

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;ZLcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    :cond_1
    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/download/app/a;->a(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-interface {v9}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/openalliance/ad/download/h;

    invoke-interface {v11, v8}, Lcom/huawei/openalliance/ad/download/h;->b(Lcom/huawei/openalliance/ad/download/app/c;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/a;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/download/app/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/download/app/a;->a(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_2

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/download/h;

    invoke-interface {v3, p2}, Lcom/huawei/openalliance/ad/download/h;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    goto :goto_2

    :cond_1
    const-string v0, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/download/h;

    invoke-interface {v3, p2}, Lcom/huawei/openalliance/ad/download/h;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/download/app/c;->v()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/k/b/d;->f(Ljava/lang/Integer;)V

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/huawei/openalliance/ad/download/app/b;->c(Lcom/huawei/openalliance/ad/download/app/c;)Z

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v4

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPopUpAfterInstall()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x1

    if-ne v0, v5, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/k/b/d;->a()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->a:Landroid/content/Context;

    invoke-static {v0, v4, v6, v5}, Lcom/huawei/openalliance/ad/a/a;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;I)Z

    :cond_1
    return-void
.end method

.method private g(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/download/h;

    invoke-interface {v3, p1}, Lcom/huawei/openalliance/ad/download/h;->a(Lcom/huawei/openalliance/ad/download/app/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private h(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/download/h;

    invoke-interface {v3, p1}, Lcom/huawei/openalliance/ad/download/h;->b(Lcom/huawei/openalliance/ad/download/app/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/app/c;Z)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->h()Lcom/huawei/openalliance/ad/download/d;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/huawei/openalliance/ad/k/b/d;->b(Ljava/lang/Integer;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/app/c;->b(I)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->b(J)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->e:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/openalliance/ad/download/app/a;->a(Lcom/huawei/openalliance/ad/download/app/c;Z)V

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/huawei/openalliance/ad/download/h;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/huawei/openalliance/ad/k/b/d;->a(Ljava/lang/Integer;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public b(Lcom/huawei/openalliance/ad/download/app/c;Z)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->c(Ljava/lang/Integer;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->b(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic b(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/openalliance/ad/download/app/a;->b(Lcom/huawei/openalliance/ad/download/app/c;Z)V

    return-void
.end method

.method public declared-synchronized b(Ljava/lang/String;Lcom/huawei/openalliance/ad/download/h;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Set;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {v1, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->g(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public c(Lcom/huawei/openalliance/ad/download/app/c;Z)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->d(Ljava/lang/Integer;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic c(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->c(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public bridge synthetic c(Lcom/huawei/openalliance/ad/download/e;Z)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/openalliance/ad/download/app/a;->c(Lcom/huawei/openalliance/ad/download/app/c;Z)V

    return-void
.end method

.method public d(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 5

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->w()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Lcom/huawei/openalliance/ad/k/b/d;->e(Ljava/lang/Integer;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/a;->b:Lcom/huawei/openalliance/ad/k/d;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/openalliance/ad/download/app/a$1;

    invoke-direct {v3, p0, p1}, Lcom/huawei/openalliance/ad/download/app/a$1;-><init>(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method

.method public bridge synthetic d(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->d(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public e(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/a$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/download/app/a$2;-><init>(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->e(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method

.method public f(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/a;->h(Lcom/huawei/openalliance/ad/download/app/c;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->i()Lcom/huawei/openalliance/ad/download/e$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$a;->c:Lcom/huawei/openalliance/ad/download/e$a;

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/a$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/a$3;-><init>(Lcom/huawei/openalliance/ad/download/app/a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->i()Lcom/huawei/openalliance/ad/download/e$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$a;->d:Lcom/huawei/openalliance/ad/download/e$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->i()Lcom/huawei/openalliance/ad/download/e$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$a;->e:Lcom/huawei/openalliance/ad/download/e$a;

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/download/app/a$4;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/download/app/a$4;-><init>(Lcom/huawei/openalliance/ad/download/app/a;Lcom/huawei/openalliance/ad/download/app/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic f(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/a;->f(Lcom/huawei/openalliance/ad/download/app/c;)V

    return-void
.end method
