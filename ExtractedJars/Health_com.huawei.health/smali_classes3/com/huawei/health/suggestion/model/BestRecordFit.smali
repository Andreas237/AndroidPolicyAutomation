.class public Lcom/huawei/health/suggestion/model/BestRecordFit;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actionId:Ljava/lang/String;

.field private completeTime:J

.field private type:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireActionId()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->actionId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireCompleteTime()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->completeTime:J

    return-wide v0
.end method

.method public acquireType()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->type:I

    return v0
.end method

.method public acquireValue()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->value:Ljava/lang/String;

    return-object v0
.end method

.method public saveActionId(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->actionId:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public saveCompleteTime(J)V
    .locals 0

    .line 48
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->completeTime:J

    .line 49
    return-void
.end method

.method public saveType(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->type:I

    .line 33
    return-void
.end method

.method public saveValue(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->value:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 54
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "BestRecordFit{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 55
    const-string v0, "actionId=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->actionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 56
    const-string v0, ", type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 57
    const-string v0, ", value=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 58
    const-string v0, ", completeTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/suggestion/model/BestRecordFit;->completeTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 59
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
