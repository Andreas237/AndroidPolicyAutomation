.class public interface abstract Lcom/microblink/internal/services/license/LicenseApiService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract create(Lcom/microblink/internal/services/license/License;)Lretrofit2/Call;
    .param p1    # Lcom/microblink/internal/services/license/License;
        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/license/License;",
            ")",
            "Lretrofit2/Call<",
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Accept: application/vnd.windfall+json;version=1",
            "Content-Type: application/json"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/api/licensees"
    .end annotation
.end method
