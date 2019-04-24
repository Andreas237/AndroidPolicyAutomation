.class public final Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/google/GooglePlacesService;


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

.field private static final LOOKUP_PLACE_HOST_API:Ljava/lang/String; = "https://maps.googleapis.com/maps/api/place/details/json"

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

    new-instance v0, Lcom/microblink/internal/services/google/GooglePlaceResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GooglePlaceResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->calls:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/google/GooglePlaceResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public final enqueue(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GooglePlaceResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v1, "https://maps.googleapis.com/maps/api/place/details/json"

    invoke-interface {v0, v1, p2, p1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookupByPlaceId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->calls:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p2, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl$1;

    invoke-direct {p2, p0, p3}, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl$1;-><init>(Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(Ljava/lang/String;Ljava/lang/String;)Lcom/microblink/internal/services/google/GooglePlaceResponse;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v2, "https://maps.googleapis.com/maps/api/place/details/json"

    invoke-interface {v1, v2, p2, p1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookupByPlaceId(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    iget-object p2, p0, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->calls:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/GooglePlaceResponse;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

    return-object p1

    :cond_1
    const-string p2, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "GoogleNearbyServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GooglePlacesServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GooglePlaceResponse;

    return-object p1
.end method
