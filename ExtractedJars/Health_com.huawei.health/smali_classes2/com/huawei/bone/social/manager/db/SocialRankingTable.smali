.class public Lcom/huawei/bone/social/manager/db/SocialRankingTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation
.end field


# instance fields
.field private bgImgUrl:Ljava/lang/String;

.field private huId:J

.field private image:[B

.field private imgUrl:Ljava/lang/String;

.field private likes:I

.field private name:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private steps:I

.field private userIsLiked:I

.field private userType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable$4;

    invoke-direct {v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable$4;-><init>()V

    sput-object v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    .line 37
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    .line 41
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    .line 42
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->name:Ljava/lang/String;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->steps:I

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->likes:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userType:I

    .line 49
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 156
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 180
    instance-of v0, p1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 181
    :cond_0
    move-object v4, p1

    check-cast v4, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 182
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    iget-wide v2, v4, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getBgImgUrl()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->bgImgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getHuId()J
    .locals 2

    .line 64
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    return-wide v0
.end method

.method public getImage()[B
    .locals 5

    .line 72
    const/4 v4, 0x0

    .line 73
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    array-length v0, v0

    new-array v4, v0, [B

    .line 75
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    :cond_0
    return-object v4
.end method

.method public getImgUrl()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIsLiked()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    return v0
.end method

.method public getLikes()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->likes:I

    return v0
.end method

.method public getMyStatus()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSteps()I
    .locals 1

    .line 97
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->steps:I

    return v0
.end method

.method public getUserType()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userType:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 187
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    iget-wide v2, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public init1()V
    .locals 0

    .line 207
    return-void
.end method

.method public init2()V
    .locals 0

    .line 208
    return-void
.end method

.method public init3()V
    .locals 0

    .line 209
    return-void
.end method

.method public init4()V
    .locals 0

    .line 210
    return-void
.end method

.method public init5()V
    .locals 0

    .line 211
    return-void
.end method

.method public init6()V
    .locals 0

    .line 212
    return-void
.end method

.method public init7()V
    .locals 0

    .line 213
    return-void
.end method

.method public init8()V
    .locals 0

    .line 214
    return-void
.end method

.method public isLiked()I
    .locals 1

    .line 113
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    return v0
.end method

.method public setBgImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->bgImgUrl:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public setHuId(J)V
    .locals 0

    .line 68
    iput-wide p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    .line 69
    return-void
.end method

.method public setImage([B)V
    .locals 4

    .line 81
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 82
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    .line 83
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 86
    :cond_0
    return-void
.end method

.method public setImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setIsLiked(I)V
    .locals 0

    .line 117
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    .line 118
    return-void
.end method

.method public setLikes(I)V
    .locals 0

    .line 109
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->likes:I

    .line 110
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->name:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public setSteps(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->steps:I

    .line 102
    return-void
.end method

.method public setUserType(I)V
    .locals 0

    .line 145
    iput p1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userType:I

    .line 146
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SocialRankingTable{huId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    .line 194
    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->steps:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bgImgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->bgImgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", likes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->likes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userIsLiked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 192
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 161
    iget-wide v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->huId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 162
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->image:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 163
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 164
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->steps:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->likes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->imgUrl:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 167
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userIsLiked:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget-object v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->status:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 169
    iget v0, p0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->userType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 170
    return-void
.end method
