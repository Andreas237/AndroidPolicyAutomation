.class public final Lexocr/bankcard/EXBankCardInfo;
.super Lexocr/base/ExBaseCardInfo;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lexocr/bankcard/EXBankCardInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lexocr/bankcard/EXBankCardInfo$1;

    invoke-direct {v0}, Lexocr/bankcard/EXBankCardInfo$1;-><init>()V

    sput-object v0, Lexocr/bankcard/EXBankCardInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lexocr/base/ExBaseCardInfo;-><init>()V

    .line 21
    const/16 v0, 0x20

    new-array v0, v0, [C

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->numbers:[C

    .line 22
    const/16 v0, 0x20

    new-array v0, v0, [Landroid/graphics/Rect;

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 28
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 7

    .line 32
    invoke-direct {p0}, Lexocr/base/ExBaseCardInfo;-><init>()V

    .line 33
    const/16 v0, 0x20

    new-array v0, v0, [C

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->numbers:[C

    .line 34
    const/16 v0, 0x20

    new-array v0, v0, [Landroid/graphics/Rect;

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->bitmap:Landroid/graphics/Bitmap;

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    .line 39
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->numbers:[C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readCharArray([C)V

    .line 40
    const/4 v2, 0x0

    :goto_0
    iget v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    if-ge v2, v0, :cond_0

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v5

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v6

    .line 47
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    aput-object v1, v0, v2

    .line 40
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->strNumbers:Ljava/lang/String;

    .line 50
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lexocr/bankcard/EXBankCardInfo$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lexocr/bankcard/EXBankCardInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 61
    iget v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->numbers:[C

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeCharArray([C)V

    .line 63
    const/4 v1, 0x0

    :goto_0
    iget v0, p0, Lexocr/bankcard/EXBankCardInfo;->charCount:I

    if-ge v1, v0, :cond_0

    .line 65
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->rects:[Landroid/graphics/Rect;

    aget-object v0, v0, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Lexocr/bankcard/EXBankCardInfo;->strNumbers:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 71
    return-void
.end method
