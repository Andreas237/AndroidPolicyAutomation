.class Lcom/huawei/android/quickaction/ActionIcon$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/quickaction/ActionIcon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/quickaction/ActionIcon;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 433
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/android/quickaction/ActionIcon;
    .locals 1

    .line 439
    new-array v0, p1, [Lcom/huawei/android/quickaction/ActionIcon;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/quickaction/ActionIcon$4;->e(Landroid/os/Parcel;)Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/android/quickaction/ActionIcon;
    .locals 1

    .line 435
    new-instance v0, Lcom/huawei/android/quickaction/ActionIcon;

    invoke-direct {v0, p1}, Lcom/huawei/android/quickaction/ActionIcon;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/quickaction/ActionIcon$4;->b(I)[Lcom/huawei/android/quickaction/ActionIcon;

    move-result-object v0

    return-object v0
.end method
