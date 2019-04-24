.class public Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private basic:Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

.field private customDefine:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private goals:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;"
        }
    .end annotation
.end field

.field private sleepCycle:Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBasic()Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->basic:Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    return-object v0
.end method

.method public getCustomDefine()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->customDefine:Ljava/util/Map;

    return-object v0
.end method

.method public getGoals()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->goals:Ljava/util/List;

    return-object v0
.end method

.method public getSleepCycle()Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->sleepCycle:Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;

    return-object v0
.end method

.method public setBasic(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->basic:Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    .line 35
    return-void
.end method

.method public setCustomDefine(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->customDefine:Ljava/util/Map;

    .line 43
    return-void
.end method

.method public setGoals(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;)V"
        }
    .end annotation

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->goals:Ljava/util/List;

    .line 27
    return-void
.end method

.method public setSleepCycle(Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->sleepCycle:Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;

    .line 51
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetUserProfileRsp{basic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->basic:Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", goals="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->goals:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sleepCycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->sleepCycle:Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customDefine="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->customDefine:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
