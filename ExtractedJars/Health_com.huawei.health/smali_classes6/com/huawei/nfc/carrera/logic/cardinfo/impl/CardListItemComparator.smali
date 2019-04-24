.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListItemComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;>;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x5264f22c7eba607L


# direct methods
.method constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;)I
    .locals 4

    .line 35
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->getStatusUpdateTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->getStatusUpdateTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 37
    const/4 v0, 0x1

    return v0

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->getStatusUpdateTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->getStatusUpdateTime()J

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

    .line 25
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;

    move-object v1, p2

    check-cast v1, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListItemComparator;->compare(Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;)I

    move-result v0

    return v0
.end method
