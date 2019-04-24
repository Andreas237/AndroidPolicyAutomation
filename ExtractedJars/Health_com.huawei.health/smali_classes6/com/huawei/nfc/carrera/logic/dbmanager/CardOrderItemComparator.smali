.class Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderItemComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x83d4b6ad97909cL


# direct methods
.method constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;)I
    .locals 4

    .line 26
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 28
    const/4 v0, 0x1

    return v0

    .line 30
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->getTimestamp()J

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

    .line 16
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    move-object v1, p2

    check-cast v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderItemComparator;->compare(Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;)I

    move-result v0

    return v0
.end method
