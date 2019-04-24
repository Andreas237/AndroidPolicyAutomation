.class Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;
.super Ljava/lang/Object;
.source "CacheAdapter.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/CacheRequest;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/internal/huc/CacheAdapter;->put(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/CacheRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/squareup/okhttp/internal/huc/CacheAdapter;

.field final synthetic val$request:Ljava/net/CacheRequest;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/huc/CacheAdapter;Ljava/net/CacheRequest;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;->this$0:Lcom/squareup/okhttp/internal/huc/CacheAdapter;

    iput-object p2, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;->val$request:Ljava/net/CacheRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;->val$request:Ljava/net/CacheRequest;

    invoke-virtual {v0}, Ljava/net/CacheRequest;->abort()V

    return-void
.end method

.method public body()Lokio/Sink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/CacheAdapter$1;->val$request:Ljava/net/CacheRequest;

    invoke-virtual {v0}, Ljava/net/CacheRequest;->getBody()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    invoke-static {v0}, Lokio/Okio;->sink(Ljava/io/OutputStream;)Lokio/Sink;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
