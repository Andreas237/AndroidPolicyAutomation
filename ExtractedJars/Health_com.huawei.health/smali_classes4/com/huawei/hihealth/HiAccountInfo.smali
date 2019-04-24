.class public Lcom/huawei/hihealth/HiAccountInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAccountInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private accessToken:Ljava/lang/String;

.field private appId:I

.field private expiresIn:J

.field private huid:Ljava/lang/String;

.field private isLogin:I

.field private serviceToken:Ljava/lang/String;

.field private siteId:I

.field private thirdOpenId:Ljava/lang/String;

.field private thirdToken:Ljava/lang/String;

.field private type:I

.field private userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 208
    new-instance v0, Lcom/huawei/hihealth/HiAccountInfo$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAccountInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiAccountInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    .line 85
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    .line 196
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->huid:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->userName:Ljava/lang/String;

    .line 198
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->accessToken:Ljava/lang/String;

    .line 199
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->serviceToken:Ljava/lang/String;

    .line 200
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdOpenId:Ljava/lang/String;

    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdToken:Ljava/lang/String;

    .line 202
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->siteId:I

    .line 203
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->expiresIn:J

    .line 204
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->type:I

    .line 206
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->appId:I

    .line 207
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 222
    const/4 v0, 0x0

    return v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->appId:I

    return v0
.end method

.method public getExpiresIn()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->expiresIn:J

    return-wide v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getIsLogin()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    return v0
.end method

.method public getServiceToken()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->serviceToken:Ljava/lang/String;

    return-object v0
.end method

.method public getSiteId()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->siteId:I

    return v0
.end method

.method public getThirdOpenId()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdOpenId:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdToken()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdToken:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->type:I

    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public initFucntion4()V
    .locals 0

    .line 254
    return-void
.end method

.method public initFuncion8()V
    .locals 0

    .line 266
    return-void
.end method

.method public initFunction1()V
    .locals 0

    .line 245
    return-void
.end method

.method public initFunction2()V
    .locals 0

    .line 248
    return-void
.end method

.method public initFunction3()V
    .locals 0

    .line 251
    return-void
.end method

.method public initFunction5()V
    .locals 0

    .line 257
    return-void
.end method

.method public initFunction6()V
    .locals 0

    .line 260
    return-void
.end method

.method public initFunction7()V
    .locals 0

    .line 263
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->accessToken:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setAppId(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->appId:I

    .line 89
    return-void
.end method

.method public setExpiresIn(J)V
    .locals 0

    .line 162
    iput-wide p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->expiresIn:J

    .line 163
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->huid:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public setLogin(I)V
    .locals 0

    .line 170
    iput p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    .line 171
    return-void
.end method

.method public setServiceToken(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->serviceToken:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setSiteId(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->siteId:I

    .line 117
    return-void
.end method

.method public setThirdOpenId(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdOpenId:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setThirdToken(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdToken:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->type:I

    .line 133
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/huawei/hihealth/HiAccountInfo;->userName:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 183
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiAccountInfo{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 184
    const-string v0, "huid=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAccountInfo;->huid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 185
    const-string v0, ", isLogin="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 186
    const-string v0, ", appId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAccountInfo;->appId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 187
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 188
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->huid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->userName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->serviceToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 231
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdOpenId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->thirdToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 233
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->siteId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 234
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->expiresIn:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 235
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->isLogin:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 237
    iget v0, p0, Lcom/huawei/hihealth/HiAccountInfo;->appId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 238
    return-void
.end method
