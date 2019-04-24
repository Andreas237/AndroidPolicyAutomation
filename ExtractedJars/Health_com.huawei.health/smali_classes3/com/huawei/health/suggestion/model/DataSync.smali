.class public Lcom/huawei/health/suggestion/model/DataSync;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private recordId:J

.field private status:I

.field private type:I

.field private userId:Ljava/lang/String;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRecordId()J
    .locals 2

    .line 23
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/DataSync;->recordId:J

    return-wide v0
.end method

.method public getStatus()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/health/suggestion/model/DataSync;->status:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/DataSync;->type:I

    return v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DataSync;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/DataSync;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setRecordId(J)V
    .locals 0

    .line 27
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/DataSync;->recordId:J

    .line 28
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/health/suggestion/model/DataSync;->status:I

    .line 60
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/suggestion/model/DataSync;->type:I

    .line 44
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DataSync;->userId:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/DataSync;->value:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 64
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
