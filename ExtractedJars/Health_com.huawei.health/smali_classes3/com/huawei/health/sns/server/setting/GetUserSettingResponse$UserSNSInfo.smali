.class public Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UserSNSInfo"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private gender_:I

.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private nickName_:Ljava/lang/String;

.field private phoneDigest_:Ljava/lang/String;

.field private privacySetFlags_:Ljava/lang/String;

.field private qrCode_:Ljava/lang/String;

.field private region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

.field private signature_:Ljava/lang/String;

.field private userAccount_:Ljava/lang/String;

.field private userID_:J

.field private userType_:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 120
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 100
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    .line 102
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    .line 77
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userID_:J

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userAccount_:Ljava/lang/String;

    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    .line 109
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->qrCode_:Ljava/lang/String;

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURL_:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURLDownload_:Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->nickName_:Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    .line 114
    const-class v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->signature_:Ljava/lang/String;

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->phoneDigest_:Ljava/lang/String;

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userType_:I

    .line 118
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 269
    const/4 v0, 0x0

    return v0
.end method

.method public getGender_()I
    .locals 1

    .line 239
    iget v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    .line 240
    return v0
.end method

.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURLDownload_:Ljava/lang/String;

    .line 228
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURL_:Ljava/lang/String;

    .line 222
    return-object v0
.end method

.method public getNickName_()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->nickName_:Ljava/lang/String;

    .line 234
    return-object v0
.end method

.method public getPhoneDigest_()Ljava/lang/String;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->phoneDigest_:Ljava/lang/String;

    .line 257
    return-object v0
.end method

.method public getPrivacySetFlags_()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    .line 205
    return-object v0
.end method

.method public getQrCode_()Ljava/lang/String;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->qrCode_:Ljava/lang/String;

    .line 216
    return-object v0
.end method

.method public getRegion_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    return-object v0
.end method

.method public getSignature_()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->signature_:Ljava/lang/String;

    .line 251
    return-object v0
.end method

.method public getUserAccount_()Ljava/lang/String;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userAccount_:Ljava/lang/String;

    .line 194
    return-object v0
.end method

.method public getUserID_()J
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userID_:J

    .line 183
    return-wide v0
.end method

.method public getUserType_()I
    .locals 1

    .line 262
    iget v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userType_:I

    .line 263
    return v0
.end method

.method public setGender_(I)V
    .locals 0

    .line 157
    iput p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    .line 158
    return-void
.end method

.method public setImageURLDownload_(Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURLDownload_:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public setImageURL_(Ljava/lang/String;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURL_:Ljava/lang/String;

    .line 143
    return-void
.end method

.method public setNickName_(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->nickName_:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setPhoneDigest_(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->phoneDigest_:Ljava/lang/String;

    .line 173
    return-void
.end method

.method public setPrivacySetFlags_(Ljava/lang/String;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    .line 211
    return-void
.end method

.method public setQrCode_(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->qrCode_:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setRegion_(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    .line 163
    return-void
.end method

.method public setSignature_(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->signature_:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setUserAccount_(Ljava/lang/String;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userAccount_:Ljava/lang/String;

    .line 200
    return-void
.end method

.method public setUserID_(J)V
    .locals 0

    .line 188
    iput-wide p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userID_:J

    .line 189
    return-void
.end method

.method public setUserType_(I)V
    .locals 0

    .line 177
    iput p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userType_:I

    .line 178
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 275
    iget-wide v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userID_:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 276
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userAccount_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->privacySetFlags_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->qrCode_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURL_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->imageURLDownload_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->nickName_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 282
    iget v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->gender_:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->region_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->signature_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->phoneDigest_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 286
    iget v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->userType_:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 287
    return-void
.end method
