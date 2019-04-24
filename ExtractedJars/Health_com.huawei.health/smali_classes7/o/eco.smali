.class public Lo/eco;
.super Lcom/huawei/wallet/commonbase/router/WalletProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/huawei/wallet/commonbase/router/WalletProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 10
    const-string v0, "NFCOpenApiProvider"

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 16
    const-string v0, "NFCOpenApiCreateAction"

    new-instance v1, Lo/ecp;

    invoke-direct {v1}, Lo/ecp;-><init>()V

    invoke-virtual {p0, v0, v1}, Lo/eco;->b(Ljava/lang/String;Lcom/huawei/wallet/commonbase/router/WalletAction;)V

    .line 17
    return-void
.end method
