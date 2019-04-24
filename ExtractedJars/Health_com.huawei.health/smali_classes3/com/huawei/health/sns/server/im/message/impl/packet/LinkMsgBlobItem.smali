.class public final Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final APP_POSITION:Ljava/lang/String; = "app"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
        }
    .end annotation
.end field

.field public static final LINK_APPICON_MAX_SIZE:I = 0x4

.field public static final LINK_ICON_HEIGHT:I = 0xc

.field public static final LINK_ICON_WIDTH:I = 0xc

.field public static final LINK_IMAGE_HEIGHT:I = 0x2d

.field public static final LINK_IMAGE_MAX_SIZE:I = 0x1e

.field public static final LINK_IMAGE_WIDTH:I = 0x2d

.field public static final LINK_POSITION:Ljava/lang/String; = "link"


# instance fields
.field private blobData:Ljava/lang/String;

.field private blobLength:I

.field private blobPosition:Ljava/lang/String;

.field private blobType:Ljava/lang/String;

.field private blobWitdh:I

.field private localBlobDataPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 202
    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem$5;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    .line 180
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobWitdh:I

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobLength:I

    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobPosition:Ljava/lang/String;

    .line 184
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobData:Ljava/lang/String;

    .line 186
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->localBlobDataPath:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public static createIconBlobItem()Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3

    .line 102
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;-><init>()V

    .line 103
    const-string v0, "app"

    const-string v1, "image/png"

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobTypeInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const/16 v0, 0xc

    const/16 v1, 0xc

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobSize(II)V

    .line 105
    return-object v2
.end method

.method public static createLinkBlobItem()Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3

    .line 94
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;-><init>()V

    .line 95
    const-string v0, "link"

    const-string v1, "image/jpg"

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobTypeInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const/16 v0, 0x2d

    const/16 v1, 0x2d

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobSize(II)V

    .line 97
    return-object v2
.end method

.method public static getImageBlobItem(Ljava/lang/String;Ljava/util/List;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;"
        }
    .end annotation

    .line 227
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 229
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    return-object v2

    .line 233
    :cond_0
    goto :goto_0

    .line 234
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 169
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 240
    if-nez p1, :cond_0

    .line 242
    const/4 v0, 0x0

    return v0

    .line 245
    :cond_0
    if-ne p0, p1, :cond_1

    .line 247
    const/4 v0, 0x1

    return v0

    .line 250
    :cond_1
    instance-of v0, p1, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    if-nez v0, :cond_2

    .line 252
    const/4 v0, 0x0

    return v0

    .line 255
    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 257
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    if-nez v0, :cond_3

    .line 259
    const/4 v0, 0x0

    return v0

    .line 261
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getBlobData()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobData:Ljava/lang/String;

    .line 147
    return-object v0
.end method

.method public getBlobLength()I
    .locals 1

    .line 122
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobLength:I

    .line 123
    return v0
.end method

.method public getBlobPosition()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobPosition:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public getBlobType()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    .line 111
    return-object v0
.end method

.method public getBlobWitdh()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobWitdh:I

    .line 117
    return v0
.end method

.method public getLocalBlobDataPath()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->localBlobDataPath:Ljava/lang/String;

    .line 158
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 269
    const/4 v0, 0x0

    return v0

    .line 271
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public setBlobData(Ljava/lang/String;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobData:Ljava/lang/String;

    .line 153
    return-void
.end method

.method public setBlobSize(II)V
    .locals 0

    .line 128
    iput p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobLength:I

    .line 129
    iput p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobWitdh:I

    .line 130
    return-void
.end method

.method public setBlobTypeInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobPosition:Ljava/lang/String;

    .line 135
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setLocalBlobDataPath(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->localBlobDataPath:Ljava/lang/String;

    .line 164
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 193
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobWitdh:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 194
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobLength:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobPosition:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->blobData:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->localBlobDataPath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 200
    return-void
.end method
