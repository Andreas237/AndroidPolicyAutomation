.class final Lcom/huawei/hihealth/HiUserInfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiUserInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiUserInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 198
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiUserInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 203
    new-array v0, p1, [Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 195
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiUserInfo$5;->b(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 195
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiUserInfo$5;->c(I)[Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method
