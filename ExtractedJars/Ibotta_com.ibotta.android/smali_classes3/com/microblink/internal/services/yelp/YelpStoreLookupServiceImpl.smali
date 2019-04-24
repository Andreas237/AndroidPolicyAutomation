.class public Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/lookup/StoreLookUpService;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/services/lookup/StoreLookUpService<",
        "Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

.field private static final LOOKUP_STORE_API_HOST:Ljava/lang/String; = "https://api.yelp.com/v3/businesses/search/phone"

.field private static final TAG:Ljava/lang/String; = "YelpStoreLookupServiceImpl"


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

    new-instance v0, Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/yelp/YelpPhoneFormatter;

    invoke-direct {v0}, Lcom/microblink/internal/services/yelp/YelpPhoneFormatter;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;-><init>(Lcom/microblink/internal/phone/PhoneNumberFormatter;)V

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

    iput-object v0, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->calls:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 4
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
            "Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/yelp/YelpApiService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/yelp/YelpApiService;

    const-string v1, "https://api.yelp.com/v3/businesses/search/phone"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->bearer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object p1

    invoke-interface {v3, p1}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Lcom/microblink/internal/services/yelp/YelpApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    iget-object v0, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl$1;-><init>(Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "YelpStoreLookupServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Lcom/microblink/internal/services/yelp/YelpApiService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/yelp/YelpApiService;

    const-string v2, "https://api.yelp.com/v3/businesses/search/phone"

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/ServiceUtils;->bearer(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object p1

    invoke-interface {v4, p1}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, v3, p1}, Lcom/microblink/internal/services/yelp/YelpApiService;->lookUpStore(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    return-object p1

    :cond_1
    const-string v1, "YelpStoreLookupServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "YelpStoreLookupServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->EMPTY:Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    return-object p1
.end method

.method public bridge synthetic execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/yelp/YelpStoreLookupServiceImpl;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/yelp/YelpBusinessLookupResponse;

    move-result-object p1

    return-object p1
.end method
