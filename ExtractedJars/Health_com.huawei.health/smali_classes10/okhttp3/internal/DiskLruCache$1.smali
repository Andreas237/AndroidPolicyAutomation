.class Lokhttp3/internal/DiskLruCache$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/internal/DiskLruCache;


# direct methods
.method constructor <init>(Lokhttp3/internal/DiskLruCache;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 167
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 168
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$000(Lokhttp3/internal/DiskLruCache;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v1}, Lokhttp3/internal/DiskLruCache;->access$100(Lokhttp3/internal/DiskLruCache;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    or-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 169
    monitor-exit v2

    return-void

    .line 173
    :cond_1
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$200(Lokhttp3/internal/DiskLruCache;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    goto :goto_1

    .line 174
    :catch_0
    move-exception v3

    .line 175
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache;->access$302(Lokhttp3/internal/DiskLruCache;Z)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    :goto_1
    :try_start_3
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$400(Lokhttp3/internal/DiskLruCache;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 180
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$500(Lokhttp3/internal/DiskLruCache;)V

    .line 181
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$1;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache;->access$602(Lokhttp3/internal/DiskLruCache;I)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :cond_2
    goto :goto_2

    .line 183
    :catch_1
    move-exception v3

    .line 184
    :try_start_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 186
    :goto_2
    monitor-exit v2

    goto :goto_3

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 187
    :goto_3
    return-void
.end method
