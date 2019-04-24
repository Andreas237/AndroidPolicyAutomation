.class public Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "CustomerGiftCardPostCall.java"

# interfaces
.implements Lcom/ibotta/api/PasswordContainer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;",
        ">;",
        "Lcom/ibotta/api/PasswordContainer;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->setRequiresAuthToken(Z)V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

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

    .line 39
    invoke-super {p0}, Lcom/ibotta/api/BaseApiCall;->buildParams()V

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "gift_card_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getGiftCardId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "gift_card_template_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getGiftCardTemplateId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "amount"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getAmount()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "password"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getExistingCardId()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "existing_card_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getExistingCardId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getReferenceId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->params:Ljava/util/Map;

    const-string v1, "reference_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getReferenceId()Ljava/lang/String;

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
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 58
    const-class v0, Lcom/ibotta/api/model/customer/CustomerGiftCard;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerGiftCard;

    .line 59
    new-instance p2, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;-><init>()V

    .line 60
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;->setCustomerGiftCard(Lcom/ibotta/api/model/customer/CustomerGiftCard;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/gift_cards.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;->callParams:Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 29
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;

    return-object v0
.end method
