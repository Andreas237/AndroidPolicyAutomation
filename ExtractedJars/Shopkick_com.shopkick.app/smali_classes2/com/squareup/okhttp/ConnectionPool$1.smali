.class Lcom/squareup/okhttp/ConnectionPool$1;
.super Ljava/lang/Object;
.source "ConnectionPool.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/ConnectionPool;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/ConnectionPool;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/ConnectionPool;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    iget-object v2, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    monitor-enter v2

    .line 90
    :try_start_0
    iget-object v3, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v3}, Lcom/squareup/okhttp/ConnectionPool;->access$000(Lcom/squareup/okhttp/ConnectionPool;)Ljava/util/LinkedList;

    move-result-object v3

    iget-object v4, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v4}, Lcom/squareup/okhttp/ConnectionPool;->access$000(Lcom/squareup/okhttp/ConnectionPool;)Ljava/util/LinkedList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v3

    const/4 v4, 0x0

    .line 91
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 92
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/squareup/okhttp/Connection;

    .line 93
    invoke-virtual {v5}, Lcom/squareup/okhttp/Connection;->isAlive()Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v6}, Lcom/squareup/okhttp/ConnectionPool;->access$100(Lcom/squareup/okhttp/ConnectionPool;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/squareup/okhttp/Connection;->isExpired(J)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v5}, Lcom/squareup/okhttp/Connection;->isIdle()Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 94
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/ListIterator;->remove()V

    .line 95
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v1, :cond_0

    .line 102
    :cond_3
    iget-object v1, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v1}, Lcom/squareup/okhttp/ConnectionPool;->access$000(Lcom/squareup/okhttp/ConnectionPool;)Ljava/util/LinkedList;

    move-result-object v1

    iget-object v3, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v3}, Lcom/squareup/okhttp/ConnectionPool;->access$000(Lcom/squareup/okhttp/ConnectionPool;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    .line 103
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/squareup/okhttp/ConnectionPool$1;->this$0:Lcom/squareup/okhttp/ConnectionPool;

    invoke-static {v3}, Lcom/squareup/okhttp/ConnectionPool;->access$200(Lcom/squareup/okhttp/ConnectionPool;)I

    move-result v3

    if-le v4, v3, :cond_5

    .line 104
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/Connection;

    .line 105
    invoke-virtual {v3}, Lcom/squareup/okhttp/Connection;->isIdle()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 106
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    invoke-interface {v1}, Ljava/util/ListIterator;->remove()V

    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    .line 111
    :cond_5
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/squareup/okhttp/Connection;

    .line 113
    invoke-virtual {v1}, Lcom/squareup/okhttp/Connection;->getSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->closeQuietly(Ljava/net/Socket;)V

    goto :goto_3

    :cond_6
    return-void

    :catchall_0
    move-exception v0

    .line 111
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
