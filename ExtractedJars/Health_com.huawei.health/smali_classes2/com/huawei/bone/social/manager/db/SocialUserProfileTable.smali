.class public Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;>;"
        }
    .end annotation
.end field


# instance fields
.field private age:I

.field private bgImgUrl:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private gender:I

.field private height:I

.field private hobbies:I

.field private huId:J

.field private imgUrl:Ljava/lang/String;

.field private mobile:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private needVerify:Ljava/lang/String;

.field private note:Ljava/lang/String;

.field private notifiedSide:I

.field private relationShipStatus:I

.field private setPrivacyFlag:Ljava/lang/String;

.field private settings:I

.field private status:Ljava/lang/String;

.field private userType:I

.field private weight:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable$5;

    invoke-direct {v0}, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable$5;-><init>()V

    sput-object v0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->mobile:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    .line 23
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    .line 25
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    .line 26
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    .line 27
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    .line 28
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->mobile:Ljava/lang/String;

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->huId:J

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->height:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->weight:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->age:I

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->hobbies:I

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->settings:I

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->gender:I

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->userType:I

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->relationShipStatus:I

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    .line 103
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    .line 110
    return-void
.end method


# virtual methods
.method public acquireNote()Ljava/lang/String;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    return-object v0
.end method

.method public acquireNotifiedSide()I
    .locals 1

    .line 264
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->notifiedSide:I

    return v0
.end method

.method public acquireRelationShipStatus()I
    .locals 1

    .line 225
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->relationShipStatus:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public getAge()I
    .locals 1

    .line 164
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->age:I

    return v0
.end method

.method public getBgImgUrl()Ljava/lang/String;
    .locals 1

    .line 273
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 274
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    .line 276
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getGender()I
    .locals 1

    .line 209
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->gender:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->height:I

    return v0
.end method

.method public getHobbies()I
    .locals 1

    .line 180
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->hobbies:I

    return v0
.end method

.method public getHuId()J
    .locals 2

    .line 135
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->huId:J

    return-wide v0
.end method

.method public getImgUrl()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getNeedVerify()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    return-object v0
.end method

.method public getSetPrivacyFlag()Ljava/lang/String;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getSettings()I
    .locals 1

    .line 192
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->settings:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getUserType()I
    .locals 1

    .line 217
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->userType:I

    return v0
.end method

.method public getWeight()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->weight:I

    return v0
.end method

.method public init1()V
    .locals 0

    .line 284
    return-void
.end method

.method public init2()V
    .locals 0

    .line 285
    return-void
.end method

.method public init3()V
    .locals 0

    .line 286
    return-void
.end method

.method public init4()V
    .locals 0

    .line 287
    return-void
.end method

.method public init5()V
    .locals 0

    .line 288
    return-void
.end method

.method public init6()V
    .locals 0

    .line 289
    return-void
.end method

.method public init7()V
    .locals 0

    .line 290
    return-void
.end method

.method public init8()V
    .locals 0

    .line 291
    return-void
.end method

.method public setAge(I)V
    .locals 0

    .line 168
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->age:I

    .line 169
    return-void
.end method

.method public setBgImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    .line 281
    return-void
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    .line 246
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 213
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->gender:I

    .line 214
    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 152
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->height:I

    .line 153
    return-void
.end method

.method public setHobbies(I)V
    .locals 0

    .line 184
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->hobbies:I

    .line 185
    return-void
.end method

.method public setHuId(J)V
    .locals 0

    .line 139
    iput-wide p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->huId:J

    .line 140
    return-void
.end method

.method public setImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    .line 238
    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->mobile:Ljava/lang/String;

    .line 254
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    .line 189
    return-void
.end method

.method public setNeedVerify(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setNote(Ljava/lang/String;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    .line 258
    return-void
.end method

.method public setNotifiedSide(I)V
    .locals 0

    .line 269
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->notifiedSide:I

    .line 270
    return-void
.end method

.method public setRelationShipStatus(I)V
    .locals 0

    .line 229
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->relationShipStatus:I

    .line 230
    return-void
.end method

.method public setSetPrivacyFlag(Ljava/lang/String;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    .line 205
    return-void
.end method

.method public setSettings(I)V
    .locals 0

    .line 196
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->settings:I

    .line 197
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setUserType(I)V
    .locals 0

    .line 221
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->userType:I

    .line 222
    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 160
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->weight:I

    .line 161
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocialUserProfileTable{huId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->huId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", age="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->age:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hobbies="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->hobbies:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", settings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->settings:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setPrivacyFlag=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->gender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->userType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", relationShipStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->relationShipStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", notifiedSide="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->notifiedSide:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", needVerify=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", note=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bgImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", email=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mobile=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->mobile:Ljava/lang/String;

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

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 114
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->huId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 115
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 116
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->height:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 117
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->weight:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 118
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->age:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->status:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 120
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->hobbies:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->settings:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->setPrivacyFlag:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 123
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->gender:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 124
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->userType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->relationShipStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->email:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->bgImgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->note:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialUserProfileTable;->needVerify:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 132
    return-void
.end method
