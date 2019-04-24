.class final Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)[Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;
    .locals 1

    .line 78
    new-array v0, p1, [Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 70
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;->d(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;
    .locals 2

    .line 73
    new-instance v0, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;-><init>(Landroid/os/Parcel;Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 70
    invoke-virtual {p0, p1}, Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp$2;->c(I)[Lcom/huawei/sns/sdk/modelmsg/DownloadImageResp;

    move-result-object v0

    return-object v0
.end method
