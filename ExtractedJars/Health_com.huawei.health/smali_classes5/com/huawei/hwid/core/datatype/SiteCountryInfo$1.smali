.class final Lcom/huawei/hwid/core/datatype/SiteCountryInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/SiteCountryInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/SiteCountryInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SiteCountryInfo;
    .locals 2

    .line 289
    new-instance v1, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;-><init>()V

    .line 290
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->a(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->b(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->c(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->d(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 294
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->e(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->a(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 296
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->b(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 297
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->c(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 298
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->d(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 299
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->e(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 300
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->f(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 301
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->g(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;I)I

    .line 302
    invoke-static {v1}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo;->a(Lcom/huawei/hwid/core/datatype/SiteCountryInfo;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 303
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/SiteCountryInfo;
    .locals 1

    .line 307
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 286
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 286
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SiteCountryInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/SiteCountryInfo;

    move-result-object v0

    return-object v0
.end method
