.class Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;
.super Lokio/ForwardingSink;
.source "DiskLruCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/DiskLruCache$Editor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "FaultHidingSink"
.end annotation


# instance fields
.field final synthetic this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Lokio/Sink;)V
    .locals 0

    .line 874
    iput-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    .line 875
    invoke-direct {p0, p2}, Lokio/ForwardingSink;-><init>(Lokio/Sink;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 900
    :try_start_0
    invoke-super {p0}, Lokio/ForwardingSink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 902
    :catch_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    monitor-enter v0

    .line 903
    :try_start_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1802(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)Z

    .line 904
    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public flush()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 890
    :try_start_0
    invoke-super {p0}, Lokio/ForwardingSink;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 892
    :catch_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    monitor-enter v0

    .line 893
    :try_start_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1802(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)Z

    .line 894
    monitor-exit v0

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public write(Lokio/Buffer;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 880
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lokio/ForwardingSink;->write(Lokio/Buffer;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 882
    :catch_0
    iget-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    iget-object p1, p1, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    monitor-enter p1

    .line 883
    :try_start_1
    iget-object p2, p0, Lcom/squareup/okhttp/internal/DiskLruCache$Editor$FaultHidingSink;->this$1:Lcom/squareup/okhttp/internal/DiskLruCache$Editor;

    const/4 p3, 0x1

    invoke-static {p2, p3}, Lcom/squareup/okhttp/internal/DiskLruCache$Editor;->access$1802(Lcom/squareup/okhttp/internal/DiskLruCache$Editor;Z)Z

    .line 884
    monitor-exit p1

    :goto_0
    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
