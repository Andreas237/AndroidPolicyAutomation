.class public Lcom/huawei/account/aidl/AccountAidlInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/account/aidl/AccountAidlInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private accessToken:Ljava/lang/String;

.field private countyeCode:Ljava/lang/String;

.field private headPicByts:[B

.field private huid:Ljava/lang/String;

.field private photoPath:Ljava/lang/String;

.field private serveToken:Ljava/lang/String;

.field private sitId:Ljava/lang/String;

.field private stType:Ljava/lang/String;

.field private userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 165
    new-instance v0, Lcom/huawei/account/aidl/AccountAidlInfo$2;

    invoke-direct {v0}, Lcom/huawei/account/aidl/AccountAidlInfo$2;-><init>()V

    sput-object v0, Lcom/huawei/account/aidl/AccountAidlInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    .line 137
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    .line 139
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    .line 145
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 4

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    .line 41
    iput-object p5, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    .line 42
    iput-object p6, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    .line 43
    iput-object p7, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    .line 44
    iput-object p8, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    if-eq v0, p9, :cond_0

    array-length v0, p9

    if-lez v0, :cond_0

    .line 46
    array-length v0, p9

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    .line 47
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    array-length v1, p9

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p9, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    :cond_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 162
    const/4 v0, 0x0

    return v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getCountyeCode()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    return-object v0
.end method

.method public getHeadPicByts()[B
    .locals 5

    .line 117
    const/4 v4, 0x0

    .line 118
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    array-length v0, v0

    if-lez v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    array-length v0, v0

    new-array v4, v0, [B

    .line 120
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    :cond_0
    return-object v4
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getPhotoPath()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    return-object v0
.end method

.method public getServeToken()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    return-object v0
.end method

.method public getSitId()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    return-object v0
.end method

.method public getStType()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setCountyeCode(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setHeadPicByts([B)V
    .locals 4

    .line 127
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 128
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    .line 129
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    :cond_0
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    .line 74
    return-void
.end method

.method public setPhotoPath(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setServeToken(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setSitId(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    .line 114
    return-void
.end method

.method public setStType(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AccountAidlInfo{userName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serveToken=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accessToken=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", photoPath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sitId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", countyeCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

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
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->userName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->huid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->serveToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->photoPath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->sitId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->countyeCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->stType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/account/aidl/AccountAidlInfo;->headPicByts:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 158
    return-void
.end method
