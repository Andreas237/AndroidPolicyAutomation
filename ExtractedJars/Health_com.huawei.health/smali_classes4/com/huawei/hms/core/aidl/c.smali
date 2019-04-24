.class final Lcom/huawei/hms/core/aidl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hms/core/aidl/b;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hms/core/aidl/b;
    .locals 2

    .line 54
    new-instance v0, Lcom/huawei/hms/core/aidl/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/hms/core/aidl/b;-><init>(Landroid/os/Parcel;Lcom/huawei/hms/core/aidl/c;)V

    return-object v0
.end method

.method public a(I)[Lcom/huawei/hms/core/aidl/b;
    .locals 1

    .line 64
    new-array v0, p1, [Lcom/huawei/hms/core/aidl/b;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0, p1}, Lcom/huawei/hms/core/aidl/c;->a(Landroid/os/Parcel;)Lcom/huawei/hms/core/aidl/b;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 46
    invoke-virtual {p0, p1}, Lcom/huawei/hms/core/aidl/c;->a(I)[Lcom/huawei/hms/core/aidl/b;

    move-result-object v0

    return-object v0
.end method
