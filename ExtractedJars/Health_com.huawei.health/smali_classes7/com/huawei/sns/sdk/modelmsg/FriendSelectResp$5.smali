.class final Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;
    .locals 1

    .line 67
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 59
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp$5;->d(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;
    .locals 2

    .line 62
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp$5;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 59
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp$5;->c(I)[Lcom/huawei/sns/sdk/modelmsg/FriendSelectResp;

    move-result-object v0

    return-object v0
.end method
