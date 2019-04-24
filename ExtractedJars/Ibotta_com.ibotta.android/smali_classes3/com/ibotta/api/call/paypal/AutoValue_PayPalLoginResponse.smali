.class final Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;
.super Lcom/ibotta/api/call/paypal/PayPalLoginResponse;
.source "AutoValue_PayPalLoginResponse.java"


# instance fields
.field private final payPalUrl:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/call/paypal/PayPalLoginResponse;-><init>()V

    if-eqz p1, :cond_0

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;->payPalUrl:Ljava/lang/String;

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null payPalUrl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 37
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/call/paypal/PayPalLoginResponse;

    if-eqz v0, :cond_1

    .line 38
    check-cast p1, Lcom/ibotta/api/call/paypal/PayPalLoginResponse;

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;->payPalUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/call/paypal/PayPalLoginResponse;->getPayPalUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getPayPalUrl()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;->payPalUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;->payPalUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PayPalLoginResponse{payPalUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/paypal/AutoValue_PayPalLoginResponse;->payPalUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
