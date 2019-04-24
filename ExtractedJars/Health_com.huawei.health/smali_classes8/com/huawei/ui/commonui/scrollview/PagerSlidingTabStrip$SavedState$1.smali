.class final Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 872
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Parcel;)Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;
    .locals 2

    .line 880
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;-><init>(Landroid/os/Parcel;Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$3;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;
    .locals 1

    .line 875
    new-array v0, p1, [Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 872
    invoke-virtual {p0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState$1;->b(Landroid/os/Parcel;)Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 872
    invoke-virtual {p0, p1}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState$1;->c(I)[Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$SavedState;

    move-result-object v0

    return-object v0
.end method
