.class final Lcom/huawei/sns/sdk/modelmsg/FriendInfo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/FriendInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/FriendInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;
    .locals 2

    .line 57
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/FriendInfo$4;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/sns/sdk/modelmsg/FriendInfo;
    .locals 1

    .line 62
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo$4;->c(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/FriendInfo$4;->c(I)[Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v0

    return-object v0
.end method
