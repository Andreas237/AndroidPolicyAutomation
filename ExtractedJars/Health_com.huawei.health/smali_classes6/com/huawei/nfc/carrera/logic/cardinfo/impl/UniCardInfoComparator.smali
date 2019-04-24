.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/UniCardInfoComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/wallet/model/unicard/UniCardInfo;>;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5264f22c7eba607L


# direct methods
.method constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/wallet/model/unicard/UniCardInfo;Lcom/huawei/wallet/model/unicard/UniCardInfo;)I
    .locals 4

    .line 37
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 39
    const/4 v0, 0x1

    return v0

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->l()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 27
    move-object v0, p1

    check-cast v0, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    move-object v1, p2

    check-cast v1, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/UniCardInfoComparator;->compare(Lcom/huawei/wallet/model/unicard/UniCardInfo;Lcom/huawei/wallet/model/unicard/UniCardInfo;)I

    move-result v0

    return v0
.end method
