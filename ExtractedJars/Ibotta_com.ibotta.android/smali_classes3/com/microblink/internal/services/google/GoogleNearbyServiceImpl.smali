.class public final Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/google/GoogleNearbyService;


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

.field private static final LOOKUP_NEARBY_HOST_API:Ljava/lang/String; = "https://maps.googleapis.com/maps/api/place/nearbysearch/json"

.field private static final TAG:Ljava/lang/String; = "GoogleNearbyServiceImpl"


# instance fields
.field private calls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lretrofit2/Call;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/google/NearbySearchResults;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/NearbySearchResults;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->calls:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/google/NearbySearchResults;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public final enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 7
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/NearbySearchResults;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->flattenLocationResultCoordinates(Lcom/microblink/internal/Location;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v5, v0

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "rankby"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "type"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v6, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-class p1, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {p1}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v2, "https://maps.googleapis.com/maps/api/place/nearbysearch/json"

    invoke-interface/range {v1 .. v6}, Lcom/microblink/internal/services/google/GoogleApiService;->lookupByLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl$1;-><init>(Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/NearbySearchResults;
    .locals 8
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->flattenLocationResultCoordinates(Lcom/microblink/internal/Location;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move-object v6, v1

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "rankby"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->rank()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "type"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->type()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-class p1, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {p1}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v3, "https://maps.googleapis.com/maps/api/place/nearbysearch/json"

    invoke-interface/range {v2 .. v7}, Lcom/microblink/internal/services/google/GoogleApiService;->lookupByLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/NearbySearchResults;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

    return-object p1

    :cond_4
    const-string v1, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleNearbyServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/NearbySearchResults;

    return-object p1
.end method
