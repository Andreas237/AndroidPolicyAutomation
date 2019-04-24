.class final Lcom/huawei/phoneserviceuni/common/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/phoneserviceuni/common/c/c;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/phoneserviceuni/common/c/d;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 5

    .line 155
    iget-object v1, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    monitor-enter v1

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/phoneserviceuni/common/c/d;

    .line 157
    invoke-interface {v3, p1}, Lcom/huawei/phoneserviceuni/common/c/d;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    goto :goto_0

    .line 159
    :cond_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    .line 160
    :goto_1
    return-void
.end method

.method public declared-synchronized a(Lcom/huawei/phoneserviceuni/common/c/d;)V
    .locals 3

    monitor-enter p0

    .line 134
    :try_start_0
    iget-object v1, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 136
    monitor-exit v1

    monitor-exit p0

    return-void

    .line 138
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lcom/huawei/phoneserviceuni/common/c/d;)V
    .locals 3

    .line 147
    iget-object v1, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    monitor-enter v1

    .line 148
    :try_start_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/c/b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 150
    :goto_0
    return-void
.end method
