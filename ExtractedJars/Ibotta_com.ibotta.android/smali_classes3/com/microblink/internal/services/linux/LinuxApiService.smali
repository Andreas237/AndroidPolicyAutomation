.class public interface abstract Lcom/microblink/internal/services/linux/LinuxApiService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract recognize(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Url;
        .end annotation
    .end param
    .param p2    # Lokhttp3/MultipartBody$Part;
        .annotation runtime Lretrofit2/http/Part;
        .end annotation
    .end param
    .param p3    # Lokhttp3/RequestBody;
        .annotation runtime Lretrofit2/http/Part;
            value = "blink_receipt_id"
        .end annotation
    .end param
    .param p4    # Lokhttp3/RequestBody;
        .annotation runtime Lretrofit2/http/Part;
            value = "frame_idx"
        .end annotation
    .end param
    .param p5    # Lokhttp3/RequestBody;
        .annotation runtime Lretrofit2/http/Part;
            value = "sdk_version"
        .end annotation
    .end param
    .param p6    # Lokhttp3/RequestBody;
        .annotation runtime Lretrofit2/http/Part;
            value = "token"
        .end annotation
    .end param
    .param p7    # Lokhttp3/RequestBody;
        .annotation runtime Lretrofit2/http/Part;
            value = "country"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lokhttp3/MultipartBody$Part;",
            "Lokhttp3/RequestBody;",
            "Lokhttp3/RequestBody;",
            "Lokhttp3/RequestBody;",
            "Lokhttp3/RequestBody;",
            "Lokhttp3/RequestBody;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/microblink/internal/services/linux/LinuxResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/Multipart;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
    .end annotation
.end method
