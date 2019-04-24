.class public Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/lookup/BlinkStoreLookupService;


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

.field private static final TAG:Ljava/lang/String; = "StoreLookUpServiceImpl"


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

    new-instance v0, Lcom/microblink/internal/services/store/StoreLookUpResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/store/StoreLookUpResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/lookup/BlinkPhoneNumberFormatter;

    invoke-direct {v0}, Lcom/microblink/internal/services/lookup/BlinkPhoneNumberFormatter;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;-><init>(Lcom/microblink/internal/phone/PhoneNumberFormatter;)V

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

    iput-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->calls:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/store/StoreLookUpResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->calls:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Ljava/util/List;)V

    return-void
.end method

.method public enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V
    .locals 3
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
            "Lcom/microblink/internal/services/store/StoreLookUpResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId()I

    move-result v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    const-class p1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-static {p1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-interface {p1, v0, v1}, Lcom/microblink/internal/services/store/StoreApiService;->lookUpStoreByPhoneNumber(Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/store/StoreApiService;->lookupStoreByStoreNumber(Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl$1;-><init>(Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void

    :cond_1
    sget-object p1, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "StoreLookUpServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/store/StoreLookUpResponse;
    .locals 4
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->formatter:Lcom/microblink/internal/phone/PhoneNumberFormatter;

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/microblink/internal/phone/PhoneNumberFormatter;->format(Lcom/microblink/internal/phone/PhoneNumber;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->bannerId()I

    move-result v2

    invoke-virtual {p1}, Lcom/microblink/internal/services/lookup/StoreLookupRequest;->storeNumber()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-class p1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-static {p1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-interface {p1, v1, v2}, Lcom/microblink/internal/services/store/StoreApiService;->lookUpStoreByPhoneNumber(Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-class v1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createShortService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/store/StoreApiService;

    invoke-interface {v1, p1, v2}, Lcom/microblink/internal/services/store/StoreApiService;->lookupStoreByStoreNumber(Ljava/lang/String;I)Lretrofit2/Call;

    move-result-object p1

    :goto_0
    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->calls:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object p1

    invoke-virtual {p1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/microblink/internal/services/store/StoreLookUpResponse;

    return-object p1

    :cond_1
    const-string v1, "StoreLookUpServiceImpl"

    invoke-virtual {p1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    return-object p1

    :cond_2
    sget-object p1, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "StoreLookUpServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->EMPTY:Lcom/microblink/internal/services/store/StoreLookUpResponse;

    return-object p1
.end method

.method public bridge synthetic execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/lookup/StoreLookUpServiceImpl;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/services/store/StoreLookUpResponse;

    move-result-object p1

    return-object p1
.end method
