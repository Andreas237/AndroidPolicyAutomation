.class final Lcom/huawei/hwid/core/datatype/UserLoginInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/UserLoginInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/UserLoginInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/UserLoginInfo;
    .locals 2

    .line 139
    new-instance v1, Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;-><init>()V

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->a(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->b(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->c(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->d(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->e(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->f(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->g(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/UserLoginInfo;->h(Lcom/huawei/hwid/core/datatype/UserLoginInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/UserLoginInfo;
    .locals 1

    .line 152
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 137
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/UserLoginInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 137
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/UserLoginInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/UserLoginInfo;

    move-result-object v0

    return-object v0
.end method
