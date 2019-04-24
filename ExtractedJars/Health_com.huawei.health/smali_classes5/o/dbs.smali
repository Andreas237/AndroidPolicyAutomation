.class public abstract Lo/dbs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mLooper:Landroid/os/Looper;

.field private final mPermissions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    const-class v0, Lo/dbs;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dbs;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 2
    .param p1    # Landroid/os/Looper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    .line 41
    iput-object p1, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    .line 42
    return-void
.end method


# virtual methods
.method public abstract onDenied(Ljava/lang/String;)V
.end method

.method public onForeverDenied(Lo/dbr$b;)V
    .locals 0

    .line 61
    return-void
.end method

.method public abstract onGranted()V
.end method

.method protected final declared-synchronized onResult(Ljava/lang/String;I)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    monitor-enter p0

    .line 79
    if-nez p2, :cond_0

    .line 80
    :try_start_0
    sget-object v0, Lo/dbl;->e:Lo/dbl;

    invoke-virtual {p0, p1, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 82
    :cond_0
    sget-object v0, Lo/dbl;->b:Lo/dbl;

    invoke-virtual {p0, p1, v0}, Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final declared-synchronized onResult(Ljava/lang/String;Lo/dbl;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    monitor-enter p0

    .line 97
    :try_start_0
    iget-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 98
    sget-object v0, Lo/dbl;->e:Lo/dbl;

    if-ne p2, v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/dbs$3;

    invoke-direct {v1, p0}, Lo/dbs$3;-><init>(Lo/dbs;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 106
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 108
    :cond_0
    sget-object v0, Lo/dbl;->b:Lo/dbl;

    if-ne p2, v0, :cond_1

    .line 109
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/dbs$2;

    invoke-direct {v1, p0, p1}, Lo/dbs$2;-><init>(Lo/dbs;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 115
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 116
    :cond_1
    sget-object v0, Lo/dbl;->c:Lo/dbl;

    if-ne p2, v0, :cond_3

    .line 117
    invoke-virtual {p0, p1}, Lo/dbs;->shouldIgnorePermissionNotFound(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    iget-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 119
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/dbs$1;

    invoke-direct {v1, p0}, Lo/dbs$1;-><init>(Lo/dbs;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 125
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 128
    :cond_2
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/dbs;->mLooper:Landroid/os/Looper;

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lo/dbs$5;

    invoke-direct {v1, p0, p1}, Lo/dbs$5;-><init>(Lo/dbs;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 137
    :cond_3
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final declared-synchronized registerPermissions([Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    monitor-enter p0

    .line 148
    :try_start_0
    iget-object v0, p0, Lo/dbs;->mPermissions:Ljava/util/Set;

    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized shouldIgnorePermissionNotFound(Ljava/lang/String;)Z
    .locals 3

    monitor-enter p0

    .line 72
    :try_start_0
    sget-object v0, Lo/dbs;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Permission not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
