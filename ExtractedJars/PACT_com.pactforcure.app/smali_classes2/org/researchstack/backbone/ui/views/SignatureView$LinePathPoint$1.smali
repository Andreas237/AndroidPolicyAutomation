.class final Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint$1;
.super Ljava/lang/Object;
.source "SignatureView.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 374
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint$1;->createFromParcel(Landroid/os/Parcel;)Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    move-result-object v0

    return-object v0
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 380
    new-instance v0, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    invoke-direct {v0}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;-><init>()V

    .line 381
    .local v0, "r":Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    invoke-virtual {v0, p1}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;->readFromParcel(Landroid/os/Parcel;)V

    .line 382
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 374
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint$1;->newArray(I)[Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 390
    new-array v0, p1, [Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    return-object v0
.end method
