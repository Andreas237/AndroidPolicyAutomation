.class public Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;
.super Ljava/lang/Object;
.source "ScrollPosition.java"


# instance fields
.field private scrollIndex:I

.field private scrollOffset:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getScrollIndex()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->scrollIndex:I

    return v0
.end method

.method public getScrollOffset()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->scrollOffset:I

    return v0
.end method

.method public setScrollIndex(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->scrollIndex:I

    return-void
.end method

.method public setScrollOffset(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/ibotta/android/view/common/scrollposition/ScrollPosition;->scrollOffset:I

    return-void
.end method
