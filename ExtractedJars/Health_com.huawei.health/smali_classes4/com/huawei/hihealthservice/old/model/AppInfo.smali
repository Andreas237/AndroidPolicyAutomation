.class public Lcom/huawei/hihealthservice/old/model/AppInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private appId:I

.field private authorization:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private cloudUserAppCode:J

.field private defaultAuthority:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private huid:J

.field private iconUrl:Ljava/lang/String;

.field private localUserAppCode:I

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

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Lcom/huawei/hihealthservice/old/model/AppInfo;
    .locals 2

    .line 241
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/model/AppInfo;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 243
    :catch_0
    move-exception v1

    .line 245
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/model/AppInfo;->clone()Lcom/huawei/hihealthservice/old/model/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public getAppId()I
    .locals 1

    .line 146
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->appId:I

    return v0
.end method

.method public getAuthorization()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->authorization:Ljava/util/HashMap;

    return-object v0
.end method

.method public getCloudUserAppCode()J
    .locals 2

    .line 210
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->cloudUserAppCode:J

    return-wide v0
.end method

.method public getDefaultAuthority()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->defaultAuthority:Ljava/util/HashMap;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 226
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->huid:J

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalUserAppCode()I
    .locals 1

    .line 194
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->localUserAppCode:I

    return v0
.end method

.method public getNameBundle()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->nameBundle:Ljava/util/HashMap;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getSystemRating()I
    .locals 1

    .line 123
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->systemRating:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->type:I

    return v0
.end method

.method public getVerifyCode()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->verifyCode:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAa()V
    .locals 0

    .line 264
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 268
    return-void
.end method

.method public initFunctionCc()V
    .locals 0

    .line 272
    return-void
.end method

.method public setAppId(I)V
    .locals 0

    .line 154
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->appId:I

    .line 155
    return-void
.end method

.method public setAuthorization(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 118
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->authorization:Ljava/util/HashMap;

    .line 119
    return-void
.end method

.method public setCloudUserAppCode(J)V
    .locals 0

    .line 218
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->cloudUserAppCode:J

    .line 219
    return-void
.end method

.method public setDefaultAuthority(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 78
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->defaultAuthority:Ljava/util/HashMap;

    .line 79
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 234
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->huid:J

    .line 235
    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->iconUrl:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setLocalUserAppCode(I)V
    .locals 0

    .line 202
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->localUserAppCode:I

    .line 203
    return-void
.end method

.method public setNameBundle(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 98
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->nameBundle:Ljava/util/HashMap;

    .line 99
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->packageName:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setSystemRating(I)V
    .locals 0

    .line 128
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->systemRating:I

    .line 129
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->type:I

    .line 109
    return-void
.end method

.method public setVerifyCode(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->verifyCode:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->version:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppInfo [appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->appId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", packageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", localUserAppCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->localUserAppCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cloudUserAppCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->cloudUserAppCode:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authorization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->authorization:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systemRating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->systemRating:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->iconUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nameBundle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->nameBundle:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultAuthority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->defaultAuthority:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", verifyCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/model/AppInfo;->verifyCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
