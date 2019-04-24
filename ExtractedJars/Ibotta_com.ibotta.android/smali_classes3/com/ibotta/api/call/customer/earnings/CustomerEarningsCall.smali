.class public Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "CustomerEarningsCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;,
        Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final CONNECTION_TIMEOUT:J

.field private static final SOCKET_TIMEOUT:J


# instance fields
.field private before:Ljava/lang/Long;

.field private customerId:I

.field private filters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;"
        }
    .end annotation
.end field

.field private limit:I

.field private typeBitFlag:Ljava/lang/Integer;

.field private types:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 16
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v3

    sput-wide v3, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->CONNECTION_TIMEOUT:J

    .line 17
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->SOCKET_TIMEOUT:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 57
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public constructor <init>(ILjava/util/Set;Ljava/util/Set;ILjava/lang/Long;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;",
            ">;I",
            "Ljava/lang/Long;",
            ")V"
        }
    .end annotation

    .line 61
    invoke-direct {p0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;-><init>()V

    .line 62
    iput p1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->customerId:I

    if-nez p2, :cond_0

    .line 64
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->filters:Ljava/util/Set;

    goto :goto_0

    .line 66
    :cond_0
    iput-object p2, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->filters:Ljava/util/Set;

    .line 68
    :goto_0
    iput-object p3, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->types:Ljava/util/Set;

    .line 69
    iput p4, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->limit:I

    .line 70
    iput-object p5, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->before:Ljava/lang/Long;

    return-void
.end method

.method private buildTypeBitFlag()V
    .locals 3

    const/4 v0, 0x0

    .line 125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->typeBitFlag:Ljava/lang/Integer;

    .line 127
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->types:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;

    .line 128
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->getValue()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    iget-object v2, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->typeBitFlag:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$Type;->getValue()I

    move-result v1

    or-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->typeBitFlag:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 100
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->filters:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    .line 105
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->getMask()I

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 109
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->params:Ljava/util/Map;

    const-string v2, "filter"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->types:Ljava/util/Set;

    if-eqz v0, :cond_2

    .line 113
    invoke-direct {p0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->buildTypeBitFlag()V

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->params:Ljava/util/Map;

    const-string v1, "type"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->typeBitFlag:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->before:Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->params:Ljava/util/Map;

    const-string v1, "before"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->before:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    :cond_3
    iget-object v0, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->params:Ljava/util/Map;

    const-string v1, "limit"

    iget v2, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->limit:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 137
    const-class v0, Lcom/ibotta/api/model/earnings/Earning;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    .line 139
    new-instance p2, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;-><init>()V

    .line 140
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;->setEarnings(Ljava/util/List;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/earnings.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->customerId:I

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

    const-string v0, "earnings"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 4

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    iget v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    iget-object v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->filters:Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 169
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;

    .line 170
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;->getMask()I

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->typeBitFlag:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    :cond_2
    iget-object v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->before:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    :cond_3
    iget v1, p0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 186
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectionTimeout()Ljava/lang/Long;
    .locals 2

    .line 85
    sget-wide v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->CONNECTION_TIMEOUT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 80
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;",
            ">;"
        }
    .end annotation

    .line 75
    const-class v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsResponse;

    return-object v0
.end method

.method public getSocketTimeout()Ljava/lang/Long;
    .locals 2

    .line 90
    sget-wide v0, Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall;->SOCKET_TIMEOUT:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isInvalidatesCacheFamilyOnWrite()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
