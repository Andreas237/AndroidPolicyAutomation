.class public Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "CustomerInvitesPostCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/invites.json"


# instance fields
.field private customerId:I

.field private filter:Ljava/lang/String;

.field private start:Ljava/lang/Long;


# direct methods
.method public constructor <init>(I[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;-><init>(I[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;Ljava/lang/Long;)V

    return-void
.end method

.method public constructor <init>(I[Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;Ljava/lang/Long;)V
    .locals 2

    .line 22
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->setRequiresAuthToken(Z)V

    .line 25
    iput p1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->customerId:I

    .line 26
    iput-object p3, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->start:Ljava/lang/Long;

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->filter:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 29
    array-length p1, p2

    if-lez p1, :cond_2

    .line 30
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p3, 0x0

    .line 31
    :goto_0
    array-length v1, p2

    if-ge p3, v1, :cond_1

    .line 32
    aget-object v1, p2, p3

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/CustomerInvites$AddressType;->toApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    array-length v1, p2

    sub-int/2addr v1, v0

    if-ge p3, v1, :cond_0

    const-string v1, ","

    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->filter:Ljava/lang/String;

    :cond_2
    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 59
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->filter:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->params:Ljava/util/Map;

    const-string v1, "filter"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->filter:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->start:Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->params:Ljava/util/Map;

    const-string v1, "start"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->start:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 71
    const-class v0, Lcom/ibotta/api/model/customer/CustomerInvites;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerInvites;

    .line 73
    new-instance p2, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;-><init>()V

    .line 74
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;->setCustomerInvites(Lcom/ibotta/api/model/customer/CustomerInvites;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/invites.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "customer_invites"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    iget v1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    iget-object v1, p0, Lcom/ibotta/api/call/customer/CustomerInvitesPostCall;->filter:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 49
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;",
            ">;"
        }
    .end annotation

    .line 44
    const-class v0, Lcom/ibotta/api/call/customer/CustomerInvitesPostResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
