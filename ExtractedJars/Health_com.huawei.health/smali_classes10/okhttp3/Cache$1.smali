.class Lokhttp3/Cache$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/InternalCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/Cache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lokhttp3/Cache;


# direct methods
.method constructor <init>(Lokhttp3/Cache;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Lokhttp3/Request;)Lokhttp3/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-virtual {v0, p1}, Lokhttp3/Cache;->get(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v0

    return-object v0
.end method

.method public put(Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-static {v0, p1}, Lokhttp3/Cache;->access$000(Lokhttp3/Cache;Lokhttp3/Response;)Lokhttp3/internal/http/CacheRequest;

    move-result-object v0

    return-object v0
.end method

.method public remove(Lokhttp3/Request;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-static {v0, p1}, Lokhttp3/Cache;->access$100(Lokhttp3/Cache;Lokhttp3/Request;)V

    .line 152
    return-void
.end method

.method public trackConditionalCacheHit()V
    .locals 1

    .line 159
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-static {v0}, Lokhttp3/Cache;->access$300(Lokhttp3/Cache;)V

    .line 160
    return-void
.end method

.method public trackResponse(Lokhttp3/internal/http/CacheStrategy;)V
    .locals 1

    .line 163
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-static {v0, p1}, Lokhttp3/Cache;->access$400(Lokhttp3/Cache;Lokhttp3/internal/http/CacheStrategy;)V

    .line 164
    return-void
.end method

.method public update(Lokhttp3/Response;Lokhttp3/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lokhttp3/Cache$1;->this$0:Lokhttp3/Cache;

    invoke-static {v0, p1, p2}, Lokhttp3/Cache;->access$200(Lokhttp3/Cache;Lokhttp3/Response;Lokhttp3/Response;)V

    .line 156
    return-void
.end method
