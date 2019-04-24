.class public Lo/dor;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dod$e$b;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dor;->c:Ljava/util/List;

    return-void
.end method

.method private b(ILcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 24
    move-object v1, p0

    monitor-enter v1

    .line 25
    :try_start_0
    iget-object v0, p0, Lo/dor;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dod$e$b;

    .line 26
    if-nez p1, :cond_0

    .line 27
    invoke-interface {v3, p2}, Lo/dod$e$b;->b(Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_1

    .line 29
    :cond_0
    invoke-interface {v3, p1}, Lo/dod$e$b;->d(I)V

    .line 31
    :goto_1
    goto :goto_0

    .line 32
    :cond_1
    iget-object v0, p0, Lo/dor;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit v1

    goto :goto_2

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 34
    :goto_2
    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 37
    move-object v1, p0

    monitor-enter v1

    .line 38
    :try_start_0
    iget-object v0, p0, Lo/dor;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dod$e$b;

    .line 39
    const/4 v0, -0x1

    invoke-interface {v3, v0}, Lo/dod$e$b;->d(I)V

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p0, Lo/dor;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 43
    :goto_1
    return-void
.end method

.method public b(Lo/dod$e$b;)V
    .locals 3

    .line 18
    move-object v1, p0

    monitor-enter v1

    .line 19
    :try_start_0
    iget-object v0, p0, Lo/dor;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 21
    :goto_0
    return-void
.end method

.method public c(ILcom/huawei/up/model/UserInfomation;)V
    .locals 2

    .line 46
    move-object v0, p0

    monitor-enter v0

    .line 47
    :try_start_0
    invoke-direct {p0, p1, p2}, Lo/dor;->b(ILcom/huawei/up/model/UserInfomation;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 49
    :goto_0
    return-void
.end method
