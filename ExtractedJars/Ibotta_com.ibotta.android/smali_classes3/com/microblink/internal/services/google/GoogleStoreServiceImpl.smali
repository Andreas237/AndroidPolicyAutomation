.class public Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/google/GoogleStoreService;


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

.field private static final LOOKUP_STORE_HOST_API:Ljava/lang/String; = "https://maps.googleapis.com/maps/api/place/textsearch/json"

.field private static final TAG:Ljava/lang/String; = "GoogleStoreServiceImpl"


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

.field private final formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/google/GoogleLookupResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GoogleLookupResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/google/GooglePhoneNumberFormatter;

    invoke-direct {v0}, Lcom/microblink/internal/services/google/GooglePhoneNumberFormatter;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;-><init>(Lcom/microblink/internal/phone/PhoneNumberFormatter;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/internal/phone/PhoneNumberFormatter;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/phone/PhoneNumberFormatter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 5
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
            "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v2, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result p1

    invoke-static {v4, p1}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, v2, v0, v3, p1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$2;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$2;-><init>(Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public enqueueQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/services/google/GoogleQueryRequest;
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
            "Lcom/microblink/internal/services/google/GoogleQueryRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->radius()I

    move-result v2

    invoke-static {v1, v2}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object v1

    const-class v2, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v2}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v3, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, v0, p1, v1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$3;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$3;-><init>(Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public enqueueStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 4
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
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
            "Lcom/microblink/internal/merchant/AddressSearchRequest;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/google/GoogleLookupResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->street()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->city()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->state()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->concatAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->radius()I

    move-result v2

    invoke-static {v1, v2}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object v1

    const-class v2, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v2}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v3, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->apiKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, v0, p1, v1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl$1;-><init>(Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 6
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v3}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v4, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->radius()I

    move-result p1

    invoke-static {v5, p1}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v3, v4, v2, v1, p1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/GoogleLookupResponse;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1

    :cond_1
    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1
.end method

.method public bridge synthetic execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;

    move-result-object p1

    return-object p1
.end method

.method public executeLookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 5
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->street()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->city()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->state()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->concatAddress(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->radius()I

    move-result v3

    invoke-static {v2, v3}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object v2

    const-class v3, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v3}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v4, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/AddressSearchRequest;->apiKey()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, v4, v1, p1, v2}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/GoogleLookupResponse;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1

    :cond_1
    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1
.end method

.method public executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 6
    .param p1    # Lcom/microblink/internal/services/google/GoogleQueryRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->apiKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->query()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lcom/microblink/internal/services/google/GoogleApiService;

    invoke-static {v3}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/google/GoogleApiService;

    const-string v4, "https://maps.googleapis.com/maps/api/place/textsearch/json"

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->location()Lcom/microblink/internal/Location;

    move-result-object v5

    invoke-virtual {p1}, Lcom/microblink/internal/services/google/GoogleQueryRequest;->radius()I

    move-result p1

    invoke-static {v5, p1}, Lcom/microblink/internal/services/google/GoogleServiceUtils;->createQueryMap(Lcom/microblink/internal/Location;I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {v3, v4, v2, v1, p1}, Lcom/microblink/internal/services/google/GoogleApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/google/GoogleLookupResponse;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1

    :cond_1
    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "GoogleStoreServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/google/GoogleStoreServiceImpl;->EMPTY:Lcom/microblink/internal/services/google/GoogleLookupResponse;

    return-object p1
.end method
