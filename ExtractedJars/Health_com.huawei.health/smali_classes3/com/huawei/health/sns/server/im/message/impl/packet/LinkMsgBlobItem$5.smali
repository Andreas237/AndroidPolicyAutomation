.class final Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 1

    .line 214
    new-array v0, p1, [Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 203
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem$5;->e(Landroid/os/Parcel;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 1

    .line 208
    new-instance v0, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 203
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem$5;->c(I)[Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    return-object v0
.end method
