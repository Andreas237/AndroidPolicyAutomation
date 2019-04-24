.class final Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;
    .locals 1

    .line 89
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 81
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp$2;->e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;
    .locals 2

    .line 84
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp$2;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 81
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp$2;->c(I)[Lcom/huawei/sns/sdk/modelmsg/UnreadMsgResp;

    move-result-object v0

    return-object v0
.end method
