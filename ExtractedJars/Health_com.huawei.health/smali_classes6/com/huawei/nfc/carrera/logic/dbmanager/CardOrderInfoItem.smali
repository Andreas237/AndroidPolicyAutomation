.class public Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private reference_id:Ljava/lang/String;

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->reference_id:Ljava/lang/String;

    .line 29
    iput-wide p2, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->timestamp:J

    .line 31
    return-void
.end method


# virtual methods
.method public getReference_id()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->reference_id:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 63
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->timestamp:J

    return-wide v0
.end method

.method public setReference_id(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->reference_id:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setTimestamp(J)V
    .locals 0

    .line 54
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->timestamp:J

    .line 55
    return-void
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 4

    .line 44
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 45
    const-string v0, "reference_id"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->reference_id:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    const-string v0, "timestamp"

    iget-wide v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;->timestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 47
    return-object v3
.end method
