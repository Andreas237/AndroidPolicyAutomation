.class public Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2c34d976afdbc44cL


# instance fields
.field private birthday:Ljava/lang/String;

.field private clientSet:Ljava/lang/Integer;

.field private createTime:Ljava/lang/String;

.field private descroption:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private favorite:Ljava/lang/String;

.field private gender:Ljava/lang/Integer;

.field private height:Ljava/lang/Integer;

.field private huid:Ljava/lang/Long;

.field private languageCode:Ljava/lang/String;

.field private lastUpdateVersion:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

.field private phoneNum:Ljava/lang/String;

.field private portraitData:Ljava/lang/String;

.field private portraitFileName:Ljava/lang/String;

.field private portraitUrl:Ljava/lang/String;

.field private privacy:Ljava/lang/Integer;

.field private sleepEndTime:Ljava/lang/String;

.field private sleepStartTime:Ljava/lang/String;

.field private updateTime:Ljava/lang/String;

.field private weight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->gender:Ljava/lang/Integer;

    .line 27
    const/16 v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->weight:Ljava/lang/Integer;

    .line 29
    const/16 v0, 0xaa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->height:Ljava/lang/Integer;

    .line 33
    const-string v0, "zh"

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->languageCode:Ljava/lang/String;

    .line 63
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->lastUpdateVersion:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getBirthday()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->birthday:Ljava/lang/String;

    return-object v0
.end method

.method public getClientSet()Ljava/lang/Integer;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->clientSet:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCreateTime()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDescroption()Ljava/lang/String;
    .locals 1

    .line 258
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->descroption:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 369
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getFavorite()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->favorite:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()Ljava/lang/Integer;
    .locals 1

    .line 292
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->gender:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHeight()Ljava/lang/Integer;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->height:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHuid()Ljava/lang/Long;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->huid:Ljava/lang/Long;

    return-object v0
.end method

.method public getLanguageCode()Ljava/lang/String;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->languageCode:Ljava/lang/String;

    return-object v0
.end method

.method public getLastUpdateVersion()Ljava/lang/Integer;
    .locals 1

    .line 386
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->lastUpdateVersion:Ljava/lang/Integer;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNum()Ljava/lang/String;
    .locals 1

    .line 352
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->phoneNum:Ljava/lang/String;

    return-object v0
.end method

.method public getPortraitData()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitData:Ljava/lang/String;

    return-object v0
.end method

.method public getPortraitFileName()Ljava/lang/String;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitFileName:Ljava/lang/String;

    return-object v0
.end method

.method public getPortraitUrl()Ljava/lang/String;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPrivacy()Ljava/lang/Integer;
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->privacy:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSleepEndTime()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepEndTime:Ljava/lang/String;

    return-object v0
.end method

.method public getSleepStartTime()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepStartTime:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdateTime()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->updateTime:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()Ljava/lang/Integer;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->weight:Ljava/lang/Integer;

    return-object v0
.end method

.method public setBirthday(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->birthday:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public setClientSet(Ljava/lang/Integer;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->clientSet:Ljava/lang/Integer;

    .line 251
    return-void
.end method

.method public setCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->createTime:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setDescroption(Ljava/lang/String;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->descroption:Ljava/lang/String;

    .line 268
    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->email:Ljava/lang/String;

    .line 379
    return-void
.end method

.method public setFavorite(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->favorite:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public setGender(Ljava/lang/Integer;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->gender:Ljava/lang/Integer;

    .line 302
    return-void
.end method

.method public setHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->height:Ljava/lang/Integer;

    .line 134
    return-void
.end method

.method public setHuid(Ljava/lang/Long;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->huid:Ljava/lang/Long;

    .line 80
    return-void
.end method

.method public setLanguageCode(Ljava/lang/String;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->languageCode:Ljava/lang/String;

    .line 214
    return-void
.end method

.method public setLastUpdateVersion(Ljava/lang/Integer;)V
    .locals 0

    .line 395
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->lastUpdateVersion:Ljava/lang/Integer;

    .line 396
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->name:Ljava/lang/String;

    .line 151
    return-void
.end method

.method public setPhoneNum(Ljava/lang/String;)V
    .locals 0

    .line 361
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->phoneNum:Ljava/lang/String;

    .line 362
    return-void
.end method

.method public setPortraitData(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitData:Ljava/lang/String;

    .line 160
    return-void
.end method

.method public setPortraitFileName(Ljava/lang/String;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitFileName:Ljava/lang/String;

    .line 204
    return-void
.end method

.method public setPortraitUrl(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitUrl:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setPrivacy(Ljava/lang/Integer;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->privacy:Ljava/lang/Integer;

    .line 285
    return-void
.end method

.method public setSleepEndTime(Ljava/lang/String;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepEndTime:Ljava/lang/String;

    .line 234
    return-void
.end method

.method public setSleepStartTime(Ljava/lang/String;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepStartTime:Ljava/lang/String;

    .line 224
    return-void
.end method

.method public setUpdateTime(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->updateTime:Ljava/lang/String;

    .line 176
    return-void
.end method

.method public setWeight(Ljava/lang/Integer;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->weight:Ljava/lang/Integer;

    .line 117
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 309
    const-string v0, "UserProfile [huid="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->huid:Ljava/lang/Long;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 311
    const-string v0, ", birthday="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->birthday:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    const-string v0, ", gender="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->gender:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    const-string v0, ", weight="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->weight:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    const-string v0, ", height="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->height:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 319
    const-string v0, ", name="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    const-string v0, ", languageCode="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->languageCode:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    const-string v0, ", portraitFileName="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitFileName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    const-string v0, ", portraitUrl="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->portraitUrl:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    const-string v0, ", favorite="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->favorite:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    const-string v0, ", sleepStartTime="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepStartTime:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    const-string v0, ", sleepEndTime="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->sleepEndTime:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    const-string v0, ", createTime="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->createTime:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    const-string v0, ", updateTime="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->updateTime:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    const-string v0, ", clientSet="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->clientSet:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 339
    const-string v0, ", descroption="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->descroption:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    const-string v0, ", privacy="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserProfile;->privacy:Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
