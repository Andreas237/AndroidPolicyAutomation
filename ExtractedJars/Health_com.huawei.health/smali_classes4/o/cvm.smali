.class public Lo/cvm;
.super Ljava/lang/Object;

# interfaces
.implements Lo/cvt$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cvm$b;,
        Lo/cvm$d;
    }
.end annotation


# static fields
.field private static final a:[B

.field private static e:Lo/cvm;


# instance fields
.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/cvm$d;>;"
        }
    .end annotation
.end field

.field private c:Lo/cvt;

.field private d:Lo/cvn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/cvm;->a:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-static {p1, p0}, Lo/cvt;->e(Landroid/content/Context;Lo/cvt$d;)Lo/cvt;

    move-result-object v0

    iput-object v0, p0, Lo/cvm;->c:Lo/cvt;

    iget-object v0, p0, Lo/cvm;->c:Lo/cvt;

    invoke-virtual {v0}, Lo/cvt;->e()V

    return-void
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cvm$d;

    iget-object v0, v2, Lo/cvm$d;->e:Lo/cvm$b;

    invoke-direct {p0, v0}, Lo/cvm;->c(Lo/cvm$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method static synthetic b(Lo/cvm;Lo/cvm$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lo/cvm;->c(Lo/cvm$b;)V

    return-void
.end method

.method private c(Lo/cvm$b;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cvm$b;->c()V

    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/cvm;
    .locals 3

    sget-object v1, Lo/cvm;->a:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lo/cvm;->e:Lo/cvm;

    if-nez v0, :cond_0

    new-instance v0, Lo/cvm;

    invoke-direct {v0, p0}, Lo/cvm;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cvm;->e:Lo/cvm;

    :cond_0
    sget-object v0, Lo/cvm;->e:Lo/cvm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Lo/cvm$b;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/cvm$b;->b()V

    :cond_0
    return-void
.end method

.method static synthetic d(Lo/cvm;Lo/cvm$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lo/cvm;->d(Lo/cvm$b;)V

    return-void
.end method

.method private e()Lo/cvn;
    .locals 6

    iget-object v0, p0, Lo/cvm;->c:Lo/cvt;

    const-string v1, "com.huawei.hsf.pm.service.IPackageManager"

    invoke-virtual {v0, v1}, Lo/cvt;->e(Ljava/lang/String;)Lcom/huawei/hsf/internal/PPSHsfService;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hsf/internal/PPSHsfService;->b()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/cvn$e;->c(Landroid/os/IBinder;)Lo/cvn;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "HsfPackageInstaller"

    const-string v1, "cannot find package manager, hsf isConnected: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/cvm;->c:Lo/cvt;

    invoke-virtual {v3}, Lo/cvt;->d()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V
    .locals 7

    iget-object v6, p0, Lo/cvm;->d:Lo/cvn;

    if-eqz v6, :cond_0

    new-instance v0, Lo/cvm$1;

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cvm$1;-><init>(Lo/cvm;Lo/cvn;Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    invoke-direct {p0}, Lo/cvm;->e()Lo/cvn;

    move-result-object v0

    iput-object v0, p0, Lo/cvm;->d:Lo/cvn;

    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cvm$d;

    iget-object v0, p0, Lo/cvm;->d:Lo/cvn;

    if-nez v0, :cond_0

    iget-object v0, v4, Lo/cvm$d;->e:Lo/cvm$b;

    invoke-direct {p0, v0}, Lo/cvm;->c(Lo/cvm$b;)V

    goto :goto_1

    :cond_0
    iget-object v0, v4, Lo/cvm$d;->a:Ljava/lang/String;

    iget-object v1, v4, Lo/cvm$d;->b:Ljava/lang/String;

    iget-object v2, v4, Lo/cvm$d;->e:Lo/cvm$b;

    invoke-direct {p0, v0, v1, v2}, Lo/cvm;->e(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V

    :goto_1
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public b(I)V
    .locals 7

    const-string v0, "HsfPackageInstaller"

    const-string v1, "onConnectionFailed result: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvm;->d:Lo/cvn;

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    :cond_0
    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cvm$d;

    iget-object v0, v6, Lo/cvm$d;->e:Lo/cvm$b;

    if-eqz v0, :cond_1

    iget-object v0, v6, Lo/cvm$d;->e:Lo/cvm$b;

    invoke-interface {v0}, Lo/cvm$b;->a()V

    :cond_1
    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lo/cvm;->a()V

    :goto_1
    return-void
.end method

.method public c(I)V
    .locals 5

    const-string v0, "HsfPackageInstaller"

    const-string v1, "onConnectionSuspended cause: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvm;->d:Lo/cvn;

    invoke-direct {p0}, Lo/cvm;->a()V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V
    .locals 2

    iget-object v0, p0, Lo/cvm;->d:Lo/cvn;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/cvm;->c:Lo/cvt;

    invoke-virtual {v0}, Lo/cvt;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/cvm;->e()Lo/cvn;

    move-result-object v0

    iput-object v0, p0, Lo/cvm;->d:Lo/cvn;

    iget-object v0, p0, Lo/cvm;->d:Lo/cvn;

    if-nez v0, :cond_1

    invoke-direct {p0, p3}, Lo/cvm;->c(Lo/cvm$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cvm;->b:Ljava/util/List;

    new-instance v1, Lo/cvm$d;

    invoke-direct {v1, p1, p2, p3}, Lo/cvm$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lo/cvm;->c:Lo/cvt;

    invoke-virtual {v0}, Lo/cvt;->e()V

    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2, p3}, Lo/cvm;->e(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V

    return-void
.end method
