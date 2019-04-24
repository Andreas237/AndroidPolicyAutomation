.class final Lcom/huawei/hwid/core/datatype/HwAccount$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/HwAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 279
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 2

    .line 282
    new-instance v1, Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;-><init>()V

    .line 283
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->b(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->c(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->a(Lcom/huawei/hwid/core/datatype/HwAccount;I)I

    .line 288
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->e(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 289
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->f(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->g(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->h(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->i(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->j(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->k(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->l(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 296
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->m(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/HwAccount;->n(Lcom/huawei/hwid/core/datatype/HwAccount;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 1

    .line 302
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/HwAccount;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 279
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/HwAccount$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 279
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/HwAccount$1;->a(I)[Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v0

    return-object v0
.end method
