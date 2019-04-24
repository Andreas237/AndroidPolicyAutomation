.class public Lo/caa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/buh;


# static fields
.field private static c:Ljava/lang/String;

.field private static d:Lo/caa;

.field private static e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/buh;>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    const-string v0, "FitListenerUtil"

    sput-object v0, Lo/caa;->c:Ljava/lang/String;

    .line 17
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lo/caa;->e:Ljava/util/List;

    .line 19
    new-instance v0, Lo/caa;

    invoke-direct {v0}, Lo/caa;-><init>()V

    sput-object v0, Lo/caa;->d:Lo/caa;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, -0x1

    iput v0, p0, Lo/caa;->b:I

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/caa;->a:Ljava/lang/Object;

    .line 26
    return-void
.end method

.method public static a()Lo/caa;
    .locals 1

    .line 29
    sget-object v0, Lo/caa;->d:Lo/caa;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 9

    .line 56
    iget-object v4, p0, Lo/caa;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 57
    :try_start_0
    sget-object v0, Lo/caa;->c:Ljava/lang/String;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onChange workoutid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", type ="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    iput p2, p0, Lo/caa;->b:I

    .line 59
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v5

    .line 60
    if-eqz v5, :cond_0

    .line 61
    invoke-interface {v5}, Lo/brr;->b()Lo/brq;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/brq;->a(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 64
    :cond_0
    sget-object v0, Lo/caa;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/buh;

    .line 65
    invoke-interface {v7, p1, p2, p3}, Lo/buh;->c(Ljava/lang/String;ILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 68
    :goto_1
    return-void
.end method

.method public d()I
    .locals 1

    .line 33
    iget v0, p0, Lo/caa;->b:I

    return v0
.end method

.method public d(Lo/buh;)V
    .locals 6

    .line 37
    iget-object v4, p0, Lo/caa;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 38
    :try_start_0
    sget-object v0, Lo/caa;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addListener = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 40
    sget-object v0, Lo/caa;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 43
    :goto_0
    return-void
.end method

.method public e(Lo/buh;)V
    .locals 6

    .line 46
    iget-object v4, p0, Lo/caa;->a:Ljava/lang/Object;

    monitor-enter v4

    .line 47
    :try_start_0
    sget-object v0, Lo/caa;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeListener = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 49
    sget-object v0, Lo/caa;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 52
    :goto_0
    return-void
.end method
