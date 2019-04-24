.class public Lexocr/exocrengine/EXOCardInfo;
.super Lexocr/base/ExBaseCardInfo;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lexocr/exocrengine/EXOCardInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Lexocr/exocrengine/EXOCardInfo$4;

    invoke-direct {v0}, Lexocr/exocrengine/EXOCardInfo$4;-><init>()V

    sput-object v0, Lexocr/exocrengine/EXOCardInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lexocr/base/ExBaseCardInfo;-><init>()V

    .line 13
    const/16 v0, 0x40

    new-array v0, v0, [C

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->numbers:[C

    .line 14
    const/16 v0, 0x40

    new-array v0, v0, [Landroid/graphics/Rect;

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->rects:[Landroid/graphics/Rect;

    .line 15
    const/4 v0, 0x0

    iput v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 17
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 7

    .line 22
    invoke-direct {p0}, Lexocr/base/ExBaseCardInfo;-><init>()V

    .line 23
    const/16 v0, 0x40

    new-array v0, v0, [C

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->numbers:[C

    .line 24
    const/16 v0, 0x40

    new-array v0, v0, [Landroid/graphics/Rect;

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->rects:[Landroid/graphics/Rect;

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 28
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    .line 29
    iget-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->numbers:[C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readCharArray([C)V

    .line 30
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    if-ge v2, v0, :cond_0

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 34
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 35
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 37
    iget-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->rects:[Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    aput-object v1, v0, v2

    .line 30
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->strNumbers:Ljava/lang/String;

    .line 40
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lexocr/exocrengine/EXOCardInfo$4;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lexocr/exocrengine/EXOCardInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 45
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 51
    iget v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 52
    iget-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->numbers:[C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeCharArray([C)V

    .line 53
    iget-object v1, p0, Lexocr/exocrengine/EXOCardInfo;->rects:[Landroid/graphics/Rect;

    .line 54
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lexocr/exocrengine/EXOCardInfo;->charCount:I

    if-ge v2, v0, :cond_0

    .line 56
    aget-object v0, v1, v2

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    aget-object v0, v1, v2

    iget v0, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    aget-object v0, v1, v2

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    aget-object v0, v1, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p0, Lexocr/exocrengine/EXOCardInfo;->strNumbers:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 62
    return-void
.end method
