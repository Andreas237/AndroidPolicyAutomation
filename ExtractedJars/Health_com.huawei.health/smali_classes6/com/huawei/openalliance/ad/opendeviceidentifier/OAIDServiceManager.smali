.class public Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;,
        Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

.field private static final b:[B


# instance fields
.field private c:Lo/bc;

.field private d:Landroid/content/Context;

.field private e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;>;"
        }
    .end annotation
.end field

.field private f:Z

.field private final g:[B

.field private final h:Ljava/lang/String;

.field private i:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->b:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->f:Z

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->g:[B

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "oaid_timeout_task"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->h:Ljava/lang/String;

    new-instance v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;-><init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->i:Landroid/content/ServiceConnection;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d:Landroid/content/Context;

    return-void
.end method

.method private a(J)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->h:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Z)V

    new-instance v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;-><init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->h:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;Lo/bc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lo/bc;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Z)V

    return-void
.end method

.method private declared-synchronized a(Lo/bc;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->c:Lo/bc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->g:[B

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_0
    return-void
.end method

.method private a()Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->g:[B

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->h:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized b()Lo/bc;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->c:Lo/bc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private c()Z
    .locals 7

    const-string v0, "OAIDServiceManager"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.uodis.opendevice.OPENIDS_SERVICE"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.huawei.hwid"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->i:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v6

    const-string v0, "OAIDServiceManager"

    const-string v1, "bind service result: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v6, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    return v6

    :catch_0
    move-exception v5

    const-string v0, "OAIDServiceManager"

    const-string v1, "bindService SecurityException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d()V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "OAIDServiceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d()V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Z
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Lo/bc;
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->b()Lo/bc;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

    invoke-interface {v4}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;->onOaidAcquireFailed()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "OAIDServiceManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyOaidAcquireFail RuntimeException "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "OAIDServiceManager"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyOaidAcquireFail "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catchall_0
    move-exception v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    throw v5

    :goto_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    sget-object v1, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->b:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const-wide/16 v0, 0x190

    invoke-virtual {p0, p1, v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;J)V

    return-void
.end method

.method public requireOaid(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;J)V
    .locals 5
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->b()Lo/bc;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, p2, p3}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(J)V

    :cond_1
    goto :goto_0

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;

    invoke-direct {v0, p1, v3}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;-><init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;Lo/bc;)V

    sget-object v1, Lcom/huawei/openalliance/ad/utils/d$a;->c:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    :goto_0
    return-void
.end method
