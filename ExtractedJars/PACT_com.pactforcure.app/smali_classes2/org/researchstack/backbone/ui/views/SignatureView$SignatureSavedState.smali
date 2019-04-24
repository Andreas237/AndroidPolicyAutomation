.class Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;
.super Landroid/view/View$BaseSavedState;
.source "SignatureView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/ui/views/SignatureView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SignatureSavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field points:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 331
    new-instance v0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState$1;

    invoke-direct {v0}, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState$1;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 352
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 353
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->points:Ljava/util/List;

    .line 354
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->points:Ljava/util/List;

    const-class v1, Lorg/researchstack/backbone/ui/views/SignatureView$LinePathPoint;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 355
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lorg/researchstack/backbone/ui/views/SignatureView$1;)V
    .locals 0
    .param p1, "x0"    # Landroid/os/Parcel;
    .param p2, "x1"    # Lorg/researchstack/backbone/ui/views/SignatureView$1;

    .prologue
    .line 327
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0
    .param p1, "superState"    # Landroid/os/Parcelable;

    .prologue
    .line 347
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 348
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 360
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 361
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/SignatureView$SignatureSavedState;->points:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 362
    return-void
.end method
