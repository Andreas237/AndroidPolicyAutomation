.class Lo/eii$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eii;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private c:Z

.field private d:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eii$e;->c:Z

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/eii$e;->d:I

    return-void
.end method

.method synthetic constructor <init>(Lo/eii$1;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Lo/eii$e;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Z
    .locals 2

    monitor-enter p0

    .line 68
    :try_start_0
    iget-boolean v0, p0, Lo/eii$e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized a(I)Z
    .locals 1

    monitor-enter p0

    .line 60
    :try_start_0
    iget v0, p0, Lo/eii$e;->d:I

    if-ne p1, v0, :cond_0

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eii$e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 64
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e()I
    .locals 3

    monitor-enter p0

    .line 55
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lo/eii$e;->c:Z

    .line 56
    iget v0, p0, Lo/eii$e;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/eii$e;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method
