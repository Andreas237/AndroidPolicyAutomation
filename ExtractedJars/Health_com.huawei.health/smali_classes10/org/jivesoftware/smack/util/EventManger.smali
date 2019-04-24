.class public Lorg/jivesoftware/smack/util/EventManger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/util/EventManger$Callback;,
        Lorg/jivesoftware/smack/util/EventManger$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;R:Ljava/lang/Object;E:Ljava/lang/Exception;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final events:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<TK;Lorg/jivesoftware/smack/util/EventManger$b<TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/jivesoftware/smack/util/EventManger;->events:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public performActionAndWaitForEvent(Ljava/lang/Object;JLorg/jivesoftware/smack/util/EventManger$Callback;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;JLorg/jivesoftware/smack/util/EventManger$Callback<TE;>;)TR;^Ljava/lang/InterruptedException;^TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/lang/Exception;
        }
    .end annotation

    .line 53
    new-instance v1, Lorg/jivesoftware/smack/util/EventManger$b;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lorg/jivesoftware/smack/util/EventManger$b;-><init>(Lorg/jivesoftware/smack/util/EventManger$3;)V

    .line 54
    iget-object v0, p0, Lorg/jivesoftware/smack/util/EventManger;->events:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-object v2, v1

    :try_start_0
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 57
    :try_start_1
    invoke-interface {p4}, Lorg/jivesoftware/smack/util/EventManger$Callback;->action()V

    .line 58
    invoke-virtual {v1, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    :try_start_2
    throw v3

    .line 60
    :goto_0
    iget-object v2, v1, Lorg/jivesoftware/smack/util/EventManger$b;->a:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    iget-object v0, p0, Lorg/jivesoftware/smack/util/EventManger;->events:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    return-object v2

    .line 63
    :catchall_1
    move-exception v4

    iget-object v0, p0, Lorg/jivesoftware/smack/util/EventManger;->events:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    throw v4
.end method

.method public signalEvent(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TR;)Z"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lorg/jivesoftware/smack/util/EventManger;->events:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lorg/jivesoftware/smack/util/EventManger$b;

    .line 80
    if-nez v1, :cond_0

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_0
    iput-object p2, v1, Lorg/jivesoftware/smack/util/EventManger$b;->a:Ljava/lang/Object;

    .line 84
    move-object v2, v1

    monitor-enter v2

    .line 85
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 87
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
