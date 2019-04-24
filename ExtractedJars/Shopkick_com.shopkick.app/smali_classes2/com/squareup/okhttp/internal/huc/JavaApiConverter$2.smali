.class final Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;
.super Ljava/net/CacheResponse;
.source "JavaApiConverter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/squareup/okhttp/internal/huc/JavaApiConverter;->createJavaCacheResponse(Lcom/squareup/okhttp/Response;)Ljava/net/CacheResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$body:Lcom/squareup/okhttp/ResponseBody;

.field final synthetic val$headers:Lcom/squareup/okhttp/Headers;

.field final synthetic val$response:Lcom/squareup/okhttp/Response;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/Headers;Lcom/squareup/okhttp/Response;Lcom/squareup/okhttp/ResponseBody;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$headers:Lcom/squareup/okhttp/Headers;

    iput-object p2, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$response:Lcom/squareup/okhttp/Response;

    iput-object p3, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$body:Lcom/squareup/okhttp/ResponseBody;

    invoke-direct {p0}, Ljava/net/CacheResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBody()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$body:Lcom/squareup/okhttp/ResponseBody;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 242
    :cond_0
    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$headers:Lcom/squareup/okhttp/Headers;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/huc/JavaApiConverter$2;->val$response:Lcom/squareup/okhttp/Response;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/http/StatusLine;->get(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/http/StatusLine;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/http/OkHeaders;->toMultimap(Lcom/squareup/okhttp/Headers;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
