.class final Lcom/huawei/hihealth/HiUserPreference$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealth/HiUserPreference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiUserPreference;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/hihealth/HiUserPreference;
    .locals 1

    .line 73
    new-array v0, p1, [Lcom/huawei/hihealth/HiUserPreference;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 1

    .line 68
    new-instance v0, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v0, p1}, Lcom/huawei/hihealth/HiUserPreference;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiUserPreference$2;->c(Landroid/os/Parcel;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lcom/huawei/hihealth/HiUserPreference$2;->a(I)[Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    return-object v0
.end method
