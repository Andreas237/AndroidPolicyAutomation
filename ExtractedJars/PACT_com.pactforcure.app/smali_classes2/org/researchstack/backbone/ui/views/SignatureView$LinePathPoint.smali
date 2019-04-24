.class public Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
.super Landroid/graphics/Point;
.source "SignatureView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/ui/views/SignatureView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LinePathPoint"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;",
            ">;"
        }
    .end annotation
.end field

.field public static final TYPE_LINE_POINT:I = 0x1

.field public static final TYPE_LINE_START:I


# instance fields
.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 373
    new-instance v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint$1;

    invoke-direct {v0}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint$1;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 395
    invoke-direct {p0}, Landroid/graphics/Point;-><init>()V

    .line 396
    return-void
.end method

.method public constructor <init>(III)V
    .locals 0
    .param p1, "x"    # I
    .param p2, "y"    # I
    .param p3, "type"    # I

    .prologue
    .line 399
    invoke-direct {p0}, Landroid/graphics/Point;-><init>()V

    .line 400
    iput p1, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    .line 401
    iput p2, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    .line 402
    iput p3, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    .line 403
    return-void
.end method

.method public constructor <init>(Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;)V
    .locals 1
    .param p1, "src"    # Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    .prologue
    .line 406
    invoke-direct {p0}, Landroid/graphics/Point;-><init>()V

    .line 407
    iget v0, p1, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    iput v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->x:I

    .line 408
    iget v0, p1, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    iput v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->y:I

    .line 409
    iget v0, p1, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    iput v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    .line 410
    return-void
.end method


# virtual methods
.method public isStartPoint()Z
    .locals 1

    .prologue
    .line 414
    iget v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 427
    invoke-super {p0, p1}, Landroid/graphics/Point;->readFromParcel(Landroid/os/Parcel;)V

    .line 428
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    .line 429
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 420
    invoke-super {p0, p1, p2}, Landroid/graphics/Point;->writeToParcel(Landroid/os/Parcel;I)V

    .line 421
    iget v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 422
    return-void
.end method
