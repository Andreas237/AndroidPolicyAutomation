.class public Lo/ecj;
.super Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 10
    const-string v0, "com.huawei.wallet.nfc"

    new-instance v1, Lo/ech;

    invoke-direct {v1}, Lo/ech;-><init>()V

    invoke-virtual {p0, v0, v1}, Lo/ecj;->c(Ljava/lang/String;Lcom/huawei/wallet/commonbase/router/WalletProvider;)V

    .line 11
    return-void
.end method
