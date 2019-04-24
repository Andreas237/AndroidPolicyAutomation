.class final Lcom/huawei/hwcommonmodel/datatypes/MsgText$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/MsgText;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MsgText;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MsgText;
    .locals 1

    .line 60
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    invoke-direct {v0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgText;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/hwcommonmodel/datatypes/MsgText;
    .locals 1

    .line 64
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 58
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgText$4;->c(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 58
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/MsgText$4;->c(I)[Lcom/huawei/hwcommonmodel/datatypes/MsgText;

    move-result-object v0

    return-object v0
.end method
