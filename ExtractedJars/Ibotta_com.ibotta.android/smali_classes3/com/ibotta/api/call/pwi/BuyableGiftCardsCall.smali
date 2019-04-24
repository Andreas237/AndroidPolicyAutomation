.class public Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BuyableGiftCardsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "customers/%1s/giftcards.json"

.field private static final CACHE_FAMILY:Ljava/lang/String; = "bgc_gift_cards"

.field public static final COMPLETED_STATUS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final customerId:I

.field private final isProduction:Z

.field private limit:Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerId:Ljava/lang/Integer;

.field private final statusFilters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    sget-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->CAPTURED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->COMPLETE:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    invoke-static {v0, v1}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->COMPLETED_STATUS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(IZLjava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 39
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->setRequiresAuthToken(Z)V

    .line 40
    iput p1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->customerId:I

    .line 41
    iput-boolean p2, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->isProduction:Z

    .line 42
    iput-object p3, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->statusFilters:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public buildApiExecution()V
    .locals 1

    .line 100
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/execution/ApiExecutionFactory;->newIbottaPwiInstance()Lcom/ibotta/api/execution/ApiExecution;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->apiExecution:Lcom/ibotta/api/execution/ApiExecution;

    return-void
.end method

.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 70
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->statusFilters:Ljava/util/Set;

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/call/pwi/-$$Lambda$RwyjeZgkp-_PInC0bXqjT36Ale8;->INSTANCE:Lcom/ibotta/api/call/pwi/-$$Lambda$RwyjeZgkp-_PInC0bXqjT36Ale8;

    .line 73
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    const-string v1, ","

    .line 74
    invoke-static {v1}, Ljava9/util/stream/Collectors;->joining(Ljava/lang/CharSequence;)Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 76
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->params:Ljava/util/Map;

    const-string v2, "status"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->retailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->params:Ljava/util/Map;

    const-string v1, "retailerId"

    iget-object v2, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->retailerId:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->limit:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->params:Ljava/util/Map;

    const-string v1, "limit"

    iget-object v2, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->limit:Ljava/lang/Integer;

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

    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 89
    const-class v0, Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->fromJsonToArrayList(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    if-nez p1, :cond_0

    .line 92
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 95
    :cond_0
    invoke-static {}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;->builder()Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;->bgcTransactions(Ljava/util/List;)Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse$Builder;->build()Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1s/giftcards.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->customerId:I

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

    const-string v0, "bgc_gift_cards"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    iget v1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    iget-boolean v1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->isProduction:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->retailerId:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    :cond_0
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 60
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;",
            ">;"
        }
    .end annotation

    .line 55
    const-class v0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 50
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BuyableGiftCardsCall;->retailerId:Ljava/lang/Integer;

    return-void
.end method
