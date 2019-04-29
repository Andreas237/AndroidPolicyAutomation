.class public Lio/sentry/context/Context;
.super Ljava/lang/Object;
.source "Context.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final DEFAULT_BREADCRUMB_LIMIT:I = 0x64


# instance fields
.field private final breadcrumbLimit:I

.field private volatile breadcrumbs:Lio/sentry/util/CircularFifoQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/sentry/util/CircularFifoQueue<",
            "Lio/sentry/event/Breadcrumb;",
            ">;"
        }
    .end annotation
.end field

.field private volatile extra:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile lastEventId:Ljava/util/UUID;

.field private volatile tags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile user:Lio/sentry/event/User;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x64

    .line 49
    invoke-direct {p0, v0}, Lio/sentry/context/Context;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput p1, p0, Lio/sentry/context/Context;->breadcrumbLimit:I

    return-void
.end method


# virtual methods
.method public declared-synchronized addExtra(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    monitor-enter p0

    .line 154
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    .line 158
    :cond_0
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 153
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized addTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 120
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    .line 124
    :cond_0
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 119
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized clear()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 65
    :try_start_0
    invoke-virtual {p0, v0}, Lio/sentry/context/Context;->setLastEventId(Ljava/util/UUID;)V

    .line 66
    invoke-virtual {p0}, Lio/sentry/context/Context;->clearBreadcrumbs()V

    .line 67
    invoke-virtual {p0}, Lio/sentry/context/Context;->clearUser()V

    .line 68
    invoke-virtual {p0}, Lio/sentry/context/Context;->clearTags()V

    .line 69
    invoke-virtual {p0}, Lio/sentry/context/Context;->clearExtra()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 64
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized clearBreadcrumbs()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 198
    :try_start_0
    iput-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 197
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized clearExtra()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 178
    :try_start_0
    iput-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 177
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized clearTags()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 144
    :try_start_0
    iput-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 143
    monitor-exit p0

    throw v0
.end method

.method public clearUser()V
    .locals 1

    const/4 v0, 0x0

    .line 236
    invoke-virtual {p0, v0}, Lio/sentry/context/Context;->setUser(Lio/sentry/event/User;)V

    return-void
.end method

.method public declared-synchronized getBreadcrumbs()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/sentry/event/Breadcrumb;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 78
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    invoke-virtual {v0}, Lio/sentry/util/CircularFifoQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    invoke-virtual {v1}, Lio/sentry/util/CircularFifoQueue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    iget-object v1, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    monitor-exit p0

    return-object v0

    .line 79
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 77
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getExtra()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 106
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 107
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 105
    monitor-exit p0

    throw v0
.end method

.method public getLastEventId()Ljava/util/UUID;
    .locals 1

    .line 220
    iget-object v0, p0, Lio/sentry/context/Context;->lastEventId:Ljava/util/UUID;

    return-object v0
.end method

.method public declared-synchronized getTags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 93
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 94
    :cond_1
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 92
    monitor-exit p0

    throw v0
.end method

.method public getUser()Lio/sentry/event/User;
    .locals 1

    .line 245
    iget-object v0, p0, Lio/sentry/context/Context;->user:Lio/sentry/event/User;

    return-object v0
.end method

.method public declared-synchronized recordBreadcrumb(Lio/sentry/event/Breadcrumb;)V
    .locals 2

    monitor-enter p0

    .line 187
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    if-nez v0, :cond_0

    .line 188
    new-instance v0, Lio/sentry/util/CircularFifoQueue;

    iget v1, p0, Lio/sentry/context/Context;->breadcrumbLimit:I

    invoke-direct {v0, v1}, Lio/sentry/util/CircularFifoQueue;-><init>(I)V

    iput-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    .line 191
    :cond_0
    iget-object v0, p0, Lio/sentry/context/Context;->breadcrumbs:Lio/sentry/util/CircularFifoQueue;

    invoke-virtual {v0, p1}, Lio/sentry/util/CircularFifoQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 186
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized removeExtra(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 167
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 168
    monitor-exit p0

    return-void

    .line 171
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/sentry/context/Context;->extra:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 166
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized removeTag(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 133
    :try_start_0
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 134
    monitor-exit p0

    return-void

    .line 137
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/sentry/context/Context;->tags:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 132
    monitor-exit p0

    throw p1
.end method

.method public setLastEventId(Ljava/util/UUID;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lio/sentry/context/Context;->lastEventId:Ljava/util/UUID;

    return-void
.end method

.method public setUser(Lio/sentry/event/User;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lio/sentry/context/Context;->user:Lio/sentry/event/User;

    return-void
.end method
