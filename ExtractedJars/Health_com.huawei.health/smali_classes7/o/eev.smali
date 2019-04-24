.class public abstract Lo/eev;
.super Lo/eew;
.source "SourceFile"


# instance fields
.field protected n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eew;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 14
    invoke-direct {p0, p1}, Lo/eew;-><init>(Landroid/content/Context;)V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eev;->n:Ljava/util/List;

    .line 15
    return-void
.end method


# virtual methods
.method protected abstract a(Lo/eew;)V
.end method

.method public varargs b([Lo/eew;)V
    .locals 9

    .line 20
    move-object v3, p0

    monitor-enter v3

    .line 21
    move-object v4, p1

    :try_start_0
    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 22
    if-nez v7, :cond_0

    .line 23
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Lo/eev;->n:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    const-string v0, "Group"

    const-string v1, "The actor is already in the group"

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    goto :goto_1

    .line 30
    :cond_1
    iget-object v0, p0, Lo/eev;->n:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    invoke-virtual {p0, v7}, Lo/eev;->a(Lo/eew;)V

    .line 32
    invoke-virtual {v7, p0}, Lo/eew;->e(Lo/eew;)V

    .line 33
    const-string v0, "Group"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/eez;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mContext="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/eev;->d:Landroid/content/Context;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eez;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 35
    :cond_2
    monitor-exit v3

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v3

    throw v8

    .line 36
    :goto_2
    return-void
.end method
