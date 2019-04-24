.class public abstract Lcom/huawei/wallet/commonbase/router/WalletProviderRegister;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b()V
.end method

.method protected c(Ljava/lang/String;Lcom/huawei/wallet/commonbase/router/WalletProvider;)V
    .locals 1

    .line 13
    invoke-virtual {p2, p1}, Lcom/huawei/wallet/commonbase/router/WalletProvider;->b(Ljava/lang/String;)V

    .line 14
    invoke-static {}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b()Lcom/huawei/wallet/commonbase/router/LocalRouter;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/wallet/commonbase/router/LocalRouter;->b(Lcom/huawei/wallet/commonbase/router/WalletProvider;)V

    .line 16
    invoke-virtual {p2}, Lcom/huawei/wallet/commonbase/router/WalletProvider;->c()V

    .line 17
    return-void
.end method
