.class Lcom/huawei/logupload/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/logupload/LogUpload;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 761
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/logupload/LogUpload;
    .locals 2

    .line 765
    new-instance v0, Lcom/huawei/logupload/LogUpload;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/logupload/LogUpload;-><init>(Landroid/os/Parcel;Lcom/huawei/logupload/LogUpload;)V

    return-object v0
.end method

.method public a(I)[Lcom/huawei/logupload/LogUpload;
    .locals 1

    .line 770
    new-array v0, p1, [Lcom/huawei/logupload/LogUpload;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/logupload/c;->a(Landroid/os/Parcel;)Lcom/huawei/logupload/LogUpload;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/logupload/c;->a(I)[Lcom/huawei/logupload/LogUpload;

    move-result-object v0

    return-object v0
.end method
