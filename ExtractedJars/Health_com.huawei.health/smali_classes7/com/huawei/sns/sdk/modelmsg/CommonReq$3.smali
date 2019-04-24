.class final Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/CommonReq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/CommonReq;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;->e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/sns/sdk/modelmsg/CommonReq;
    .locals 1

    .line 82
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/CommonReq;
    .locals 2

    .line 77
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/CommonReq$3;->d(I)[Lcom/huawei/sns/sdk/modelmsg/CommonReq;

    move-result-object v0

    return-object v0
.end method
