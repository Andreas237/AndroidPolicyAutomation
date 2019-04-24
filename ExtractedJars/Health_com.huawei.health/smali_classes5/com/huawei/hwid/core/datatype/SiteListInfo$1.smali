.class final Lcom/huawei/hwid/core/datatype/SiteListInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/SiteListInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/SiteListInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SiteListInfo;
    .locals 2

    .line 170
    new-instance v1, Lcom/huawei/hwid/core/datatype/SiteListInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/SiteListInfo;-><init>()V

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->a(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->a(Lcom/huawei/hwid/core/datatype/SiteListInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->b(Lcom/huawei/hwid/core/datatype/SiteListInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->b(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->c(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->d(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->e(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->f(Lcom/huawei/hwid/core/datatype/SiteListInfo;I)I

    .line 179
    invoke-static {v1}, Lcom/huawei/hwid/core/datatype/SiteListInfo;->a(Lcom/huawei/hwid/core/datatype/SiteListInfo;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 180
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/SiteListInfo;
    .locals 1

    .line 184
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/SiteListInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 167
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SiteListInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SiteListInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 167
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SiteListInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/SiteListInfo;

    move-result-object v0

    return-object v0
.end method
