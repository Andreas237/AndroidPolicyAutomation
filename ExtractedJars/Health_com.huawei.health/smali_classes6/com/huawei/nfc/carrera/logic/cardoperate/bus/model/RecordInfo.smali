.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo$RecordInfoSSAI4;,
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo$RecordInfoSSAI3;,
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo$RecordInfoSSAI2;,
        Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo$RecordInfoSSAI1;
    }
.end annotation


# static fields
.field public static final STATUS_OTHER:I = 0x3

.field public static final STATUS_REFUND:I = 0x2

.field public static final STATUS_REFUNDING:I = 0x1

.field public static final STATUS_SUCCESS:I = 0x0

.field public static final TYPE_CONSUME:I = 0xb

.field public static final TYPE_RECHARGE:I = 0xa


# instance fields
.field private recordAmount:Ljava/lang/String;

.field private recordStatus:I

.field private recordTime:Ljava/lang/String;

.field private recordType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordType:I

    .line 55
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordStatus:I

    .line 56
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordTime:Ljava/lang/String;

    .line 57
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordAmount:Ljava/lang/String;

    .line 58
    return-void
.end method


# virtual methods
.method public getRecordAmount()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordStatus()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordStatus:I

    return v0
.end method

.method public getRecordTime()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordType()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordType:I

    return v0
.end method

.method public setRecordAmount(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordAmount:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setRecordStatus(I)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordStatus:I

    .line 88
    return-void
.end method

.method public setRecordTime(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordTime:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setRecordType(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;->recordType:I

    .line 83
    return-void
.end method
