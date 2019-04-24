.class final Lcom/huawei/hwcommonmodel/datatypes/MusicInfo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 1

    .line 40
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;
    .locals 1

    .line 35
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    invoke-direct {v0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo$3;->c(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 32
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MusicInfo$3;->a(I)[Lcom/huawei/hwcommonmodel/datatypes/MusicInfo;

    move-result-object v0

    return-object v0
.end method
