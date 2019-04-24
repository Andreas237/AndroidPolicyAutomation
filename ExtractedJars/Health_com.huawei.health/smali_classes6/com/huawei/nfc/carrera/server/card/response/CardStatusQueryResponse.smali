.class public Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final DEV_STATUS_LOCK:Ljava/lang/String; = "9"

.field public static final DEV_STATUS_LOST:Ljava/lang/String; = "2"

.field public static final DEV_STATUS_REPAIR:Ljava/lang/String; = "4"


# instance fields
.field private cardCount:J

.field private devStatus:Ljava/lang/String;

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCardCount()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->cardCount:J

    return-wide v0
.end method

.method public getDevStatus()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->devStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;>;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public setCardCount(J)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->cardCount:J

    .line 78
    return-void
.end method

.method public setDevStatus(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->devStatus:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/response/CardStatusItem;>;)V"
        }
    .end annotation

    .line 87
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;->items:Ljava/util/List;

    .line 88
    return-void
.end method
