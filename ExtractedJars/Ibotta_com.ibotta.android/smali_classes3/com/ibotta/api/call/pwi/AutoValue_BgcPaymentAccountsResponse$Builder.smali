.class final Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;
.super Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
.source "AutoValue_BgcPaymentAccountsResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

.field private response404:Ljava/lang/Boolean;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public bgcPaymentAccount(Lcom/ibotta/api/model/pwi/BgcPaymentAccount;)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    return-object p0
.end method

.method public build()Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse;
    .locals 4

    const-string v0, ""

    .line 82
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;->response404:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " response404"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 85
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 88
    new-instance v0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;->response404:Ljava/lang/Boolean;

    .line 89
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;->bgcPaymentAccount:Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse;-><init>(ZLcom/ibotta/api/model/pwi/BgcPaymentAccount;Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$1;)V

    return-object v0

    .line 86
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public response404(Z)Lcom/ibotta/api/call/pwi/BgcPaymentAccountsResponse$Builder;
    .locals 0

    .line 71
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_BgcPaymentAccountsResponse$Builder;->response404:Ljava/lang/Boolean;

    return-object p0
.end method
