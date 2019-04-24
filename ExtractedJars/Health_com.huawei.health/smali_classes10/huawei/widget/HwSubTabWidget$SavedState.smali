.class Lhuawei/widget/HwSubTabWidget$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwSubTabWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lhuawei/widget/HwSubTabWidget$SavedState;>;"
        }
    .end annotation
.end field


# instance fields
.field public mSavedPosition:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 536
    new-instance v0, Lhuawei/widget/HwSubTabWidget$SavedState$1;

    invoke-direct {v0}, Lhuawei/widget/HwSubTabWidget$SavedState$1;-><init>()V

    sput-object v0, Lhuawei/widget/HwSubTabWidget$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 526
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 527
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwSubTabWidget$SavedState;->mSavedPosition:I

    .line 528
    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 522
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 523
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 532
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 533
    iget v0, p0, Lhuawei/widget/HwSubTabWidget$SavedState;->mSavedPosition:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 534
    return-void
.end method
