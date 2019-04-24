.class final Lcom/huawei/hwid/core/datatype/SMSCountryInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/SMSCountryInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/SMSCountryInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SMSCountryInfo;
    .locals 2

    .line 53
    new-instance v1, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;-><init>()V

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->a(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->b(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo;->c(Lcom/huawei/hwid/core/datatype/SMSCountryInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/SMSCountryInfo;
    .locals 1

    .line 62
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/SMSCountryInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/SMSCountryInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 50
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/SMSCountryInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/SMSCountryInfo;

    move-result-object v0

    return-object v0
.end method
