.class public Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private curTime:Ljava/lang/String;

.field private deviceLevel:Ljava/lang/String;

.field private expireTime:Ljava/lang/String;

.field private intentGrowth:I

.field private intentLevel:I

.field private intentLevelName:Ljava/lang/String;

.field private levelIconUrl:Ljava/lang/String;

.field private levelName:Ljava/lang/String;

.field private memAdDesc:Ljava/lang/String;

.field private memAdLevel:Ljava/lang/String;

.field private memAdTitle:Ljava/lang/String;

.field private memLevel:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memLevel:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getCurTime()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->curTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceLevel()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->deviceLevel:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireTime()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->expireTime:Ljava/lang/String;

    return-object v0
.end method

.method public getIntentGrowth()I
    .locals 1

    .line 151
    iget v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentGrowth:I

    return v0
.end method

.method public getIntentLevel()I
    .locals 1

    .line 143
    iget v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevel:I

    return v0
.end method

.method public getIntentLevelName()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevelName:Ljava/lang/String;

    return-object v0
.end method

.method public getLevelIconUrl()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLevelName()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelName:Ljava/lang/String;

    return-object v0
.end method

.method public getMemAdDesc()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getMemAdLevel()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdLevel:Ljava/lang/String;

    return-object v0
.end method

.method public getMemAdTitle()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getMemLevel()I
    .locals 3

    .line 67
    :try_start_0
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memLevel:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 70
    goto :goto_0

    .line 68
    :catch_0
    move-exception v2

    .line 69
    const/4 v1, 0x0

    .line 71
    :goto_0
    return v1
.end method

.method public setCurTime(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->curTime:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public setDeviceLevel(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->deviceLevel:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setExpireTime(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->expireTime:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setIntentGrowth(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentGrowth:I

    .line 156
    return-void
.end method

.method public setIntentLevel(I)V
    .locals 0

    .line 147
    iput p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevel:I

    .line 148
    return-void
.end method

.method public setIntentLevelName(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevelName:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setLevelIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelIconUrl:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setLevelName(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelName:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setMemAdDesc(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdDesc:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setMemAdLevel(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdLevel:Ljava/lang/String;

    .line 62
    return-void
.end method

.method public setMemAdTitle(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdTitle:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setMemLevel(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memLevel:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MemberStatus{memLevel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memLevel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", memAdDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "memAdTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", memAdLevel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->memAdLevel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->expireTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", curTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->curTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceLevel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->deviceLevel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "levelName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", levelIconUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->levelIconUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intentLevelName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevelName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intentLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intentGrowth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/api/model/MemberStatus;->intentGrowth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
