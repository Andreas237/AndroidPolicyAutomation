.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerLoyaltiesDeleteCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final customerId:I

.field private final entryType:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final loyaltyId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;-><init>(IILcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    return-void
.end method

.method private constructor <init>(IILcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V
    .locals 1
    .param p3    # Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 20
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->setRequiresAuthToken(Z)V

    .line 21
    iput p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->customerId:I

    .line 22
    iput p2, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->loyaltyId:I

    .line 23
    iput-object p3, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->entryType:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-void
.end method

.method public static createImDeleteCall(II)Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;
    .locals 2

    .line 32
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->AUXILIARY:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-direct {v0, p0, p1, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;-><init>(IILcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    return-object v0
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 52
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->entryType:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->params:Ljava/util/Map;

    const-string v1, "entry_type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->entryType:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->toApiName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 61
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/loyalties/%2$s.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;->loyaltyId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 42
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->DELETE:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 37
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
