.class public Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private resultCode:Ljava/lang/Integer;

.field private resultDesc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getResultCode()Ljava/lang/Integer;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setResultCode(Ljava/lang/Integer;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultCode:Ljava/lang/Integer;

    .line 18
    return-void
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultDesc:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CloudCommonReponse{resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultCode:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", resultDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;->resultDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
