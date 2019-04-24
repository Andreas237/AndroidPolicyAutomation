.class public interface abstract Lcom/microblink/internal/services/store/StoreApiService;
.super Ljava/lang/Object;


# virtual methods
.method public abstract lookUpStoreByPhoneNumber(Ljava/lang/String;I)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "store[store_phone_number]"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "store[banner_id]"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lretrofit2/Call<",
            "Lcom/microblink/internal/services/store/StoreLookUpResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/stores/lookup"
    .end annotation
.end method

.method public abstract lookupStoreByStoreNumber(Ljava/lang/String;I)Lretrofit2/Call;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lretrofit2/http/Query;
            value = "store[store_number]"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "store[banner_id]"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lretrofit2/Call<",
            "Lcom/microblink/internal/services/store/StoreLookUpResponse;",
            ">;"
        }
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/api/stores/lookup"
    .end annotation
.end method
