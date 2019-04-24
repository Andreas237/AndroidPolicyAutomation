.class final Lcom/huawei/account/aidl/AccountAidlInfo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/account/aidl/AccountAidlInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/account/aidl/AccountAidlInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/account/aidl/AccountAidlInfo;
    .locals 1

    .line 168
    new-instance v0, Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-direct {v0, p1}, Lcom/huawei/account/aidl/AccountAidlInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 165
    invoke-virtual {p0, p1}, Lcom/huawei/account/aidl/AccountAidlInfo$2;->b(Landroid/os/Parcel;)Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    return-object v0
.end method

.method public e(I)[Lcom/huawei/account/aidl/AccountAidlInfo;
    .locals 1

    .line 173
    new-array v0, p1, [Lcom/huawei/account/aidl/AccountAidlInfo;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 165
    invoke-virtual {p0, p1}, Lcom/huawei/account/aidl/AccountAidlInfo$2;->e(I)[Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    return-object v0
.end method
