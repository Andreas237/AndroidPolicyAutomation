.class Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;>;"
        }
    .end annotation
.end field


# instance fields
.field currentPosition:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 399
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState$4;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState$4;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 389
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 390
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->currentPosition:I

    .line 391
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$4;)V
    .locals 0

    .line 381
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .line 385
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 386
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 395
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 396
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/view/PagerSlidingTabStrip$SavedState;->currentPosition:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 397
    return-void
.end method
