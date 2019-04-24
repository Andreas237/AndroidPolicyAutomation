.class final Lcom/huawei/hwid/core/datatype/UserAccountInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/UserAccountInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/UserAccountInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/UserAccountInfo;
    .locals 2

    .line 221
    new-instance v1, Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;-><init>()V

    .line 222
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->a(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->b(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->c(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->d(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->e(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->f(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->g(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->h(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserAccountInfo;->i(Lcom/huawei/hwid/core/datatype/UserAccountInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/UserAccountInfo;
    .locals 1

    .line 235
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 219
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 219
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/UserAccountInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/UserAccountInfo;

    move-result-object v0

    return-object v0
.end method
