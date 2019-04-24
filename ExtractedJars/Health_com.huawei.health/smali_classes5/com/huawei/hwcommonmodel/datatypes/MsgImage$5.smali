.class final Lcom/huawei/hwcommonmodel/datatypes/MsgImage$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/MsgImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/hwcommonmodel/datatypes/MsgImage;
    .locals 1

    .line 63
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/MsgImage;

    return-object v0
.end method

.method public b(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MsgImage;
    .locals 1

    .line 59
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;

    invoke-direct {v0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 57
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage$5;->b(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MsgImage;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 57
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage$5;->a(I)[Lcom/huawei/hwcommonmodel/datatypes/MsgImage;

    move-result-object v0

    return-object v0
.end method
