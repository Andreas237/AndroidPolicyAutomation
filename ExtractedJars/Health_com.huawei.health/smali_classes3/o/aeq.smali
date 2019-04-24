.class public Lo/aeq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private b:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<TE;>;"
        }
    .end annotation
.end field

.field private d:I

.field private final e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/aeq;->b:Ljava/util/LinkedList;

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lo/aeq;->d:I

    .line 12
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/aeq;->e:[B

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 38
    iget-object v1, p0, Lo/aeq;->e:[B

    monitor-enter v1

    .line 39
    :try_start_0
    iget v0, p0, Lo/aeq;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 40
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public b()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .line 22
    iget-object v2, p0, Lo/aeq;->e:[B

    monitor-enter v2

    .line 23
    :try_start_0
    iget v0, p0, Lo/aeq;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/aeq;->d:I

    .line 24
    iget-object v0, p0, Lo/aeq;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 25
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 15
    iget-object v2, p0, Lo/aeq;->e:[B

    monitor-enter v2

    .line 16
    :try_start_0
    iget v0, p0, Lo/aeq;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/aeq;->d:I

    .line 17
    iget-object v0, p0, Lo/aeq;->b:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 19
    :goto_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 43
    iget-object v1, p0, Lo/aeq;->e:[B

    monitor-enter v1

    .line 44
    :try_start_0
    iget-object v0, p0, Lo/aeq;->b:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/aeq;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 47
    :goto_0
    return-void
.end method
