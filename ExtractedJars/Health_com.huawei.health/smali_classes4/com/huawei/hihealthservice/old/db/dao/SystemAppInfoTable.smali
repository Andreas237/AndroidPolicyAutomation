.class public Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appId:I

.field private authority:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private createTime:J

.field private defaultAuthority:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private iconUrl:Ljava/lang/String;

.field private lastModifyVersion:J

.field private nameBundle:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private packageName:Ljava/lang/String;

.field private systemRating:I

.field private type:I

.field private verifyCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppId()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->appId:I

    return v0
.end method

.method public getAuthority()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->authority:Ljava/util/HashMap;

    return-object v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->createTime:J

    return-wide v0
.end method

.method public getDefaultAuthority()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->defaultAuthority:Ljava/util/HashMap;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 109
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getNameBundle()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->nameBundle:Ljava/util/HashMap;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemRating()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->systemRating:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->type:I

    return v0
.end method

.method public getVerifyCode()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->verifyCode:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAa()V
    .locals 0

    .line 151
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 155
    return-void
.end method

.method public initFunctionCc()V
    .locals 0

    .line 159
    return-void
.end method

.method public setAppId(I)V
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->appId:I

    .line 65
    return-void
.end method

.method public setAuthority(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->authority:Ljava/util/HashMap;

    .line 85
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 104
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->createTime:J

    .line 105
    return-void
.end method

.method public setDefaultAuthority(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 124
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->defaultAuthority:Ljava/util/HashMap;

    .line 125
    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->iconUrl:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 114
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->lastModifyVersion:J

    .line 115
    return-void
.end method

.method public setNameBundle(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 40
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->nameBundle:Ljava/util/HashMap;

    .line 41
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->packageName:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setSystemRating(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->systemRating:I

    .line 95
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->type:I

    .line 75
    return-void
.end method

.method public setVerifyCode(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->verifyCode:Ljava/lang/String;

    .line 135
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SystemAppInfoTable [appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->appId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->authority:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systemRating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->systemRating:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastModifyVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->lastModifyVersion:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->iconUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nameBundle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->nameBundle:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultAuthority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->defaultAuthority:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", verifyCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/SystemAppInfoTable;->verifyCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
