.class final Lcom/huawei/hwid/core/datatype/ChildrenInfo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/datatype/ChildrenInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/datatype/ChildrenInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/ChildrenInfo;
    .locals 2

    .line 172
    new-instance v1, Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    invoke-direct {v1}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;-><init>()V

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->a(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->b(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->c(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->d(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->e(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->f(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/hwid/core/datatype/ChildrenInfo;->g(Lcom/huawei/hwid/core/datatype/ChildrenInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    return-object v1
.end method

.method public a(I)[Lcom/huawei/hwid/core/datatype/ChildrenInfo;
    .locals 1

    .line 185
    new-array v0, p1, [Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 170
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/ChildrenInfo$1;->a(Landroid/os/Parcel;)Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 170
    invoke-virtual {p0, p1}, Lcom/huawei/hwid/core/datatype/ChildrenInfo$1;->a(I)[Lcom/huawei/hwid/core/datatype/ChildrenInfo;

    move-result-object v0

    return-object v0
.end method
