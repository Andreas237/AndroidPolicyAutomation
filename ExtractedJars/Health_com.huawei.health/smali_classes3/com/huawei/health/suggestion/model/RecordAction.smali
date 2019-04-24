.class public Lcom/huawei/health/suggestion/model/RecordAction;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actType:Ljava/lang/String;

.field private actionName:Ljava/lang/String;

.field private finishedAct:I

.field private theoryAct:F


# direct methods
.method public constructor <init>(Ljava/lang/String;IFLjava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actionName:Ljava/lang/String;

    .line 20
    iput p2, p0, Lcom/huawei/health/suggestion/model/RecordAction;->finishedAct:I

    .line 21
    iput p3, p0, Lcom/huawei/health/suggestion/model/RecordAction;->theoryAct:F

    .line 22
    iput-object p4, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actType:Ljava/lang/String;

    .line 23
    return-void
.end method


# virtual methods
.method public getActType()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actType:Ljava/lang/String;

    return-object v0
.end method

.method public getActionName()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actionName:Ljava/lang/String;

    return-object v0
.end method

.method public getFinishedAct()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/health/suggestion/model/RecordAction;->finishedAct:I

    return v0
.end method

.method public getTheoryAct()F
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/health/suggestion/model/RecordAction;->theoryAct:F

    return v0
.end method

.method public setActType(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actType:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setActionName(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RecordAction;->actionName:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public setFinishedAct(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/health/suggestion/model/RecordAction;->finishedAct:I

    .line 39
    return-void
.end method

.method public setTheoryAct(F)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/health/suggestion/model/RecordAction;->theoryAct:F

    .line 47
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 51
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 64
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 68
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 72
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 76
    return-void
.end method
