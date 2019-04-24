.class public Lcom/huawei/wallet/commonbase/router/WalletActionResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->c:Z

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->c:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    return-void
.end method

.method public e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/WalletActionResult;->d:Ljava/util/Map;

    return-object v0
.end method
