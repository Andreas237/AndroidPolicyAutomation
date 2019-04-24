.class public Lo/dfb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dfb$d;,
        Lo/dfb$a;
    }
.end annotation


# static fields
.field private static a:Lo/dfb;

.field private static final b:Ljava/lang/Object;


# instance fields
.field private c:Z

.field private d:Lo/dfb$d;

.field private e:Lo/vl;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dfb$a;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dfb;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfb;->c:Z

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfb;->k:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Lo/dfb$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dfb$d;-><init>(Lo/dfb;Lo/dfb$5;)V

    iput-object v0, p0, Lo/dfb;->d:Lo/dfb$d;

    .line 28
    return-void
.end method

.method public static declared-synchronized a()Lo/dfb;
    .locals 4

    const-class v2, Lo/dfb;

    monitor-enter v2

    .line 31
    :try_start_0
    sget-object v0, Lo/dfb;->a:Lo/dfb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 32
    new-instance v0, Lo/dfb;

    invoke-direct {v0}, Lo/dfb;-><init>()V

    sput-object v0, Lo/dfb;->a:Lo/dfb;

    .line 34
    :cond_0
    sget-object v0, Lo/dfb;->a:Lo/dfb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic a(Lo/dfb;)Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lo/dfb;->c:Z

    return v0
.end method

.method static synthetic a(Lo/dfb;Z)Z
    .locals 0

    .line 16
    iput-boolean p1, p0, Lo/dfb;->c:Z

    return p1
.end method

.method static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 16
    sget-object v0, Lo/dfb;->b:Ljava/lang/Object;

    return-object v0
.end method

.method private b(Z)V
    .locals 7

    .line 96
    if-eqz p1, :cond_0

    .line 97
    :try_start_0
    iget-object v0, p0, Lo/dfb;->e:Lo/vl;

    const-string v1, "com.huawei.health"

    const-string v5, "NETWORK"

    const/16 v2, 0x200

    const-wide/32 v3, 0x2bf20

    invoke-virtual/range {v0 .. v5}, Lo/vl;->d(Ljava/lang/String;IJLjava/lang/String;)Z

    move-result v6

    .line 98
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PowerKit isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lo/dfb;->e:Lo/vl;

    const-string v1, "com.huawei.health"

    const/16 v2, 0x200

    invoke-virtual {v0, v1, v2}, Lo/vl;->e(Ljava/lang/String;I)Z

    move-result v6

    .line 101
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PowerKit isclose = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 107
    :goto_0
    goto :goto_1

    .line 103
    :catch_0
    move-exception v6

    .line 104
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    goto :goto_1

    .line 105
    :catch_1
    move-exception v6

    .line 106
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/dfb;)Lo/vl;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/dfb;->e:Lo/vl;

    return-object v0
.end method

.method static synthetic d(Lo/dfb;Z)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/dfb;->b(Z)V

    return-void
.end method

.method static synthetic e(Lo/dfb;)Ljava/util/ArrayList;
    .locals 1

    .line 16
    iget-object v0, p0, Lo/dfb;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private e(Z)V
    .locals 5

    .line 78
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PowerKit mIsPowerKitConnected = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dfb;->c:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-boolean v0, p0, Lo/dfb;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dfb;->e:Lo/vl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 80
    invoke-direct {p0, p1}, Lo/dfb;->b(Z)V

    goto :goto_0

    .line 82
    :cond_0
    new-instance v4, Lo/dfb$5;

    invoke-direct {v4, p0, p1}, Lo/dfb$5;-><init>(Lo/dfb;Z)V

    .line 90
    iget-object v0, p0, Lo/dfb;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    :goto_0
    return-void
.end method


# virtual methods
.method public c()V
    .locals 7

    .line 61
    sget-object v4, Lo/dfb;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 64
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dfb;->d:Lo/dfb$d;

    invoke-static {v0, v1}, Lo/vl;->e(Landroid/content/Context;Lo/vq;)Lo/vl;

    move-result-object v0

    iput-object v0, p0, Lo/dfb;->e:Lo/vl;

    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dfb;->e(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_0

    .line 66
    :catch_0
    move-exception v5

    .line 67
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 71
    :goto_1
    return-void
.end method

.method public e()V
    .locals 7

    .line 45
    sget-object v4, Lo/dfb;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 48
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dfb;->d:Lo/dfb$d;

    invoke-static {v0, v1}, Lo/vl;->e(Landroid/content/Context;Lo/vq;)Lo/vl;

    move-result-object v0

    iput-object v0, p0, Lo/dfb;->e:Lo/vl;

    .line 49
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dfb;->e(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    goto :goto_0

    .line 50
    :catch_0
    move-exception v5

    .line 51
    const-string v0, "PowerKitManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 55
    :goto_1
    return-void
.end method
