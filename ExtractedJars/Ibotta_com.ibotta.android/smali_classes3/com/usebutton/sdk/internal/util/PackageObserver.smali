.class public Lcom/usebutton/sdk/internal/util/PackageObserver;
.super Landroid/content/BroadcastReceiver;
.source "PackageObserver.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "PackageObserver"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mIsRegistered:Z

.field private final mObservers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashSet<",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Landroid/content/pm/PackageInfo;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final mPackageManager:Landroid/content/pm/PackageManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mIsRegistered:Z

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mContext:Landroid/content/Context;

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mPackageManager:Landroid/content/pm/PackageManager;

    .line 32
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/PackageObserver;->registerReceiver()V

    return-void
.end method

.method private registerReceiver()V
    .locals 2

    .line 36
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    .line 37
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.PACKAGE_CHANGED"

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "package"

    .line 39
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 40
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mContext:Landroid/content/Context;

    invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mIsRegistered:Z

    return-void
.end method


# virtual methods
.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/PackageObserver;->stop()V

    .line 59
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getPackageManager()Landroid/content/pm/PackageManager;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mPackageManager:Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method public isInstalled(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 97
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mPackageManager:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v0
.end method

.method public observePackage(Ljava/lang/String;Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Landroid/content/pm/PackageInfo;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    if-nez v1, :cond_1

    .line 49
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 50
    iget-object v2, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    :cond_1
    invoke-virtual {v1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    const-string p1, "android.intent.extra.UID"

    const/4 v0, 0x0

    .line 64
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    .line 65
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mPackageManager:Landroid/content/pm/PackageManager;

    invoke-virtual {v1, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object p1

    const-string v1, "PackageObserver"

    const-string v2, "%s package manager update for packages: %s"

    const/4 v3, 0x2

    .line 66
    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v3, v0

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-static {v1, v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/Arrays;->isEmpty([Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 71
    :cond_0
    aget-object p1, p1, v0

    .line 73
    :try_start_0
    iget-object p2, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mPackageManager:Landroid/content/pm/PackageManager;

    const/16 v0, 0x80

    invoke-virtual {p2, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p2

    .line 76
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    monitor-enter v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :try_start_1
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    if-nez v1, :cond_1

    .line 78
    monitor-exit v0

    return-void

    .line 79
    :cond_1
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 80
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :try_start_2
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/util/Receiver;

    .line 82
    invoke-interface {v1, p2}, Lcom/usebutton/sdk/internal/util/Receiver;->receive(Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 80
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p2
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p2

    const-string v0, "PackageObserver"

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not find package info for: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public removeObserver(Lcom/usebutton/sdk/internal/util/Receiver;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Landroid/content/pm/PackageInfo;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    monitor-enter v0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 108
    iget-object v3, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mObservers:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/HashSet;

    if-nez v2, :cond_1

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 113
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public stop()V
    .locals 1

    .line 90
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mIsRegistered:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 91
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mIsRegistered:Z

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/PackageObserver;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
