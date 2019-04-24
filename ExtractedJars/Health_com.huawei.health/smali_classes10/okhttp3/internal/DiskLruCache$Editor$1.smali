.class Lokhttp3/internal/DiskLruCache$Editor$1;
.super Lokhttp3/internal/FaultHidingSink;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/DiskLruCache$Editor;->newSink(I)Lokio/Sink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lokhttp3/internal/DiskLruCache$Editor;


# direct methods
.method constructor <init>(Lokhttp3/internal/DiskLruCache$Editor;Lokio/Sink;)V
    .locals 0

    .line 882
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$Editor$1;->this$1:Lokhttp3/internal/DiskLruCache$Editor;

    invoke-direct {p0, p2}, Lokhttp3/internal/FaultHidingSink;-><init>(Lokio/Sink;)V

    return-void
.end method


# virtual methods
.method protected onException(Ljava/io/IOException;)V
    .locals 4

    .line 884
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor$1;->this$1:Lokhttp3/internal/DiskLruCache$Editor;

    iget-object v2, v0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 885
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor$1;->this$1:Lokhttp3/internal/DiskLruCache$Editor;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache$Editor;->access$2002(Lokhttp3/internal/DiskLruCache$Editor;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 886
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 887
    :goto_0
    return-void
.end method
