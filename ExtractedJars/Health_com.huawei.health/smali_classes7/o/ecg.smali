.class public Lo/ecg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/commonbase/router/WalletAction;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;)Lcom/huawei/wallet/commonbase/router/WalletActionResult;
    .locals 3

    .line 15
    new-instance v2, Lcom/huawei/wallet/commonbase/router/WalletActionResult;

    invoke-direct {v2}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;-><init>()V

    .line 16
    const-string v0, "CardAndIssuerInfoCache"

    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCache;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    return-object v2
.end method

.method public e(Landroid/content/Context;Lcom/huawei/wallet/commonbase/router/WalletActionRequest;)Z
    .locals 1

    .line 23
    const/4 v0, 0x0

    return v0
.end method
