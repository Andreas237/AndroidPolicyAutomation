.class public Lcom/unionpay/tsmservice/data/NinePatchInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/NinePatchInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private mBitmap:Landroid/graphics/Bitmap;

.field private mChunk:[B

.field private mPadding:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/unionpay/tsmservice/data/NinePatchInfo$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/NinePatchInfo$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mBitmap:Landroid/graphics/Bitmap;

    .line 34
    const-class v0, Landroid/graphics/Rect;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mPadding:Landroid/graphics/Rect;

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 36
    const/4 v0, 0x0

    if-ge v0, v1, :cond_0

    .line 37
    new-array v0, v1, [B

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    .line 38
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readByteArray([B)V

    goto :goto_0

    .line 40
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    .line 42
    :goto_0
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 46
    const/4 v0, 0x0

    return v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getChunk()[B
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    return-object v0
.end method

.method public getPadding()Landroid/graphics/Rect;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mPadding:Landroid/graphics/Rect;

    return-object v0
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mBitmap:Landroid/graphics/Bitmap;

    .line 61
    return-void
.end method

.method public setChunk([B)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    .line 77
    return-void
.end method

.method public setPadding(Landroid/graphics/Rect;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mPadding:Landroid/graphics/Rect;

    .line 69
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 52
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mPadding:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 53
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 55
    iget-object v0, p0, Lcom/unionpay/tsmservice/data/NinePatchInfo;->mChunk:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 57
    :cond_0
    return-void
.end method
