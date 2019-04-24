.class final Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;
.super Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
.source "AutoValue_BgcPaymentAccountsResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;
    }
.end annotation


# instance fields
.field private final bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

.field private final response404:Z


# direct methods
.method private constructor <init>(ZLcom/ibotta/api/model/pwi/BgcPaymentAccount;)V
    .locals 0
    .param p2    # Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;-><init>()V

    .line 18
    iput-boolean p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->response404:Z

    .line 19
    iput-object p2, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    return-void
.end method

.method synthetic constructor <init>(ZLcom/ibotta/api/model/pwi/BgcPaymentAccount;Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;-><init>(ZLcom/ibotta/api/model/pwi/BgcPaymentAccount;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 46
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 47
    check-cast p1, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;

    .line 48
    iget-boolean v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->response404:Z

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->isResponse404()Z

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    if-nez v1, :cond_1

    .line 49
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;->getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public getBgcPaymentAccount()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 58
    iget-boolean v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->response404:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 60
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public isResponse404()Z
    .locals 1

    .line 24
    iget-boolean v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->response404:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BgcPaymentAccountsResponse{response404="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->response404:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bgcPaymentAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
