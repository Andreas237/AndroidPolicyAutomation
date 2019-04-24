.class Lokhttp3/Cache$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/Cache;->urls()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Iterator<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field canRemove:Z

.field final delegate:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<Lokhttp3/internal/DiskLruCache$Snapshot;>;"
        }
    .end annotation
.end field

.field nextUrl:Ljava/lang/String;

.field final synthetic this$0:Lokhttp3/Cache;


# direct methods
.method constructor <init>(Lokhttp3/Cache;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 326
    iput-object p1, p0, Lokhttp3/Cache$2;->this$0:Lokhttp3/Cache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    iget-object v0, p0, Lokhttp3/Cache$2;->this$0:Lokhttp3/Cache;

    invoke-static {v0}, Lokhttp3/Cache;->access$600(Lokhttp3/Cache;)Lokhttp3/internal/DiskLruCache;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/DiskLruCache;->snapshots()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$2;->delegate:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 5

    .line 333
    iget-object v0, p0, Lokhttp3/Cache$2;->nextUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 335
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lokhttp3/Cache$2;->canRemove:Z

    .line 336
    :goto_0
    iget-object v0, p0, Lokhttp3/Cache$2;->delegate:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    iget-object v0, p0, Lokhttp3/Cache$2;->delegate:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lokhttp3/internal/DiskLruCache$Snapshot;

    .line 339
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v1, v0}, Lokhttp3/internal/DiskLruCache$Snapshot;->getSource(I)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v2

    .line 340
    invoke-interface {v2}, Lokio/BufferedSource;->readUtf8LineStrict()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Cache$2;->nextUrl:Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 341
    const/4 v3, 0x1

    .line 346
    invoke-virtual {v1}, Lokhttp3/internal/DiskLruCache$Snapshot;->close()V

    return v3

    .line 342
    :catch_0
    move-exception v2

    .line 346
    invoke-virtual {v1}, Lokhttp3/internal/DiskLruCache$Snapshot;->close()V

    .line 347
    goto :goto_1

    .line 346
    :catchall_0
    move-exception v4

    invoke-virtual {v1}, Lokhttp3/internal/DiskLruCache$Snapshot;->close()V

    throw v4

    .line 348
    :goto_1
    goto :goto_0

    .line 350
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 326
    invoke-virtual {p0}, Lokhttp3/Cache$2;->next()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public next()Ljava/lang/String;
    .locals 2

    .line 354
    invoke-virtual {p0}, Lokhttp3/Cache$2;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 355
    :cond_0
    iget-object v1, p0, Lokhttp3/Cache$2;->nextUrl:Ljava/lang/String;

    .line 356
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/Cache$2;->nextUrl:Ljava/lang/String;

    .line 357
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/Cache$2;->canRemove:Z

    .line 358
    return-object v1
.end method

.method public remove()V
    .locals 2

    .line 362
    iget-boolean v0, p0, Lokhttp3/Cache$2;->canRemove:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 363
    :cond_0
    iget-object v0, p0, Lokhttp3/Cache$2;->delegate:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 364
    return-void
.end method
