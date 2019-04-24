.class public Lcom/huawei/hwcommonmodel/datatypes/MsgImage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/MsgImage;>;"
        }
    .end annotation
.end field


# instance fields
.field private imageBitmap:Landroid/graphics/Bitmap;

.field private imageType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage$5;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/MsgImage$5;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageBitmap:Landroid/graphics/Bitmap;

    .line 38
    iput p2, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageType:I

    .line 39
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageBitmap:Landroid/graphics/Bitmap;

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageType:I

    .line 55
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 43
    const/4 v0, 0x0

    return v0
.end method

.method public getImageBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getImageType()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageType:I

    return v0
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageBitmap:Landroid/graphics/Bitmap;

    .line 31
    return-void
.end method

.method public setImageType(I)V
    .locals 0

    .line 22
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageType:I

    .line 23
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageBitmap:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 49
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/MsgImage;->imageType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    return-void
.end method
