.class Lcom/usebutton/sdk/internal/util/DiskLruCache$1;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 268
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 271
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    monitor-enter v0

    .line 272
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$000(Lcom/usebutton/sdk/internal/util/DiskLruCache;)Ljava/io/Writer;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 273
    monitor-exit v0

    return-object v2

    .line 275
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$100(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V

    .line 276
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$200(Lcom/usebutton/sdk/internal/util/DiskLruCache;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 277
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$300(Lcom/usebutton/sdk/internal/util/DiskLruCache;)V

    .line 278
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/DiskLruCache$1;->this$0:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->access$402(Lcom/usebutton/sdk/internal/util/DiskLruCache;I)I

    .line 280
    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
