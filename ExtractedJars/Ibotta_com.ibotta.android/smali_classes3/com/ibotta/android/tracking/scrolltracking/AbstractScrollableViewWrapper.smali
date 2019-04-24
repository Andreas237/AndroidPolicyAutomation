.class public abstract Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;
.super Ljava/lang/Object;
.source "AbstractScrollableViewWrapper.java"

# interfaces
.implements Lcom/ibotta/android/tracking/scrolltracking/ScrollableViewWrapper;


# instance fields
.field protected dataSetListener:Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field protected scrollListener:Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final viewGroup:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->viewGroup:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public getChildAt(I)Landroid/view/View;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->viewGroup:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->viewGroup:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->viewGroup:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->viewGroup:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    return v0
.end method

.method public registerDataSetListener(Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->dataSetListener:Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;

    return-void
.end method

.method public registerScrollListener(Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/ScrollListener;

    return-void
.end method

.method public unregisterDataSetListener(Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;)V
    .locals 0

    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/tracking/scrolltracking/AbstractScrollableViewWrapper;->dataSetListener:Lcom/ibotta/android/tracking/scrolltracking/DataSetListener;

    return-void
.end method
