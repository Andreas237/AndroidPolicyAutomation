.class public Lcom/huawei/hihealthservice/old/model/MotionTimeLine;
.super Lcom/huawei/hihealthservice/old/model/TimeLine;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = -0x4e81da550895b36bL


# instance fields
.field private heartRateTimeLine:Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

.field private motionPath:Lcom/huawei/hihealthservice/old/model/MotionPath;

.field private sportTimeLine:Lcom/huawei/hihealthservice/old/model/SportTimeLine;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;-><init>()V

    .line 44
    return-void
.end method

.method public constructor <init>(Lcom/huawei/hihealthservice/old/model/SportTimeLine;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->sportTimeLine:Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    .line 49
    return-void
.end method


# virtual methods
.method public getHeartRateTimeLine()Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->heartRateTimeLine:Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

    return-object v0
.end method

.method public getMotionPath()Lcom/huawei/hihealthservice/old/model/MotionPath;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->motionPath:Lcom/huawei/hihealthservice/old/model/MotionPath;

    return-object v0
.end method

.method public getSportTimeLine()Lcom/huawei/hihealthservice/old/model/SportTimeLine;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->sportTimeLine:Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 97
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 101
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 105
    return-void
.end method

.method public setHeartRateTimeLine(Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->heartRateTimeLine:Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

    .line 73
    return-void
.end method

.method public setMotionPath(Lcom/huawei/hihealthservice/old/model/MotionPath;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->motionPath:Lcom/huawei/hihealthservice/old/model/MotionPath;

    .line 83
    return-void
.end method

.method public setSportTimeLine(Lcom/huawei/hihealthservice/old/model/SportTimeLine;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->sportTimeLine:Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MotionTimeLine [sportTimeLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->sportTimeLine:Lcom/huawei/hihealthservice/old/model/SportTimeLine;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", heartRateTimeLine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->heartRateTimeLine:Lcom/huawei/hihealthservice/old/model/HeartRateTimeLine;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", motionPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/MotionTimeLine;->motionPath:Lcom/huawei/hihealthservice/old/model/MotionPath;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 89
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/TimeLine;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 88
    return-object v0
.end method
