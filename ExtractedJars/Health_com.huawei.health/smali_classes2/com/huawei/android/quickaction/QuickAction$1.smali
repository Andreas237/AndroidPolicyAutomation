.class Lcom/huawei/android/quickaction/QuickAction$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/quickaction/QuickAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/android/quickaction/QuickAction;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/android/quickaction/QuickAction;
    .locals 1

    .line 189
    new-array v0, p1, [Lcom/huawei/android/quickaction/QuickAction;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/quickaction/QuickAction$1;->e(Landroid/os/Parcel;)Lcom/huawei/android/quickaction/QuickAction;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/android/quickaction/QuickAction;
    .locals 1

    .line 184
    new-instance v0, Lcom/huawei/android/quickaction/QuickAction;

    invoke-direct {v0, p1}, Lcom/huawei/android/quickaction/QuickAction;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/huawei/android/quickaction/QuickAction$1;->a(I)[Lcom/huawei/android/quickaction/QuickAction;

    move-result-object v0

    return-object v0
.end method
