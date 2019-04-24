.class final Lcom/huawei/hihealth/HiAuthorizationOption$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiAuthorizationOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAuthorizationOption;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiAuthorizationOption;
    .locals 1

    .line 58
    new-instance v0, Lcom/huawei/hihealth/HiAuthorizationOption;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiAuthorizationOption;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 55
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiAuthorizationOption$3;->a(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiAuthorizationOption;

    move-result-object v0

    return-object v0
.end method

.method public e(I)[Lcom/huawei/hihealth/HiAuthorizationOption;
    .locals 1

    .line 63
    new-array v0, p1, [Lcom/huawei/hihealth/HiAuthorizationOption;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 55
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiAuthorizationOption$3;->e(I)[Lcom/huawei/hihealth/HiAuthorizationOption;

    move-result-object v0

    return-object v0
.end method
