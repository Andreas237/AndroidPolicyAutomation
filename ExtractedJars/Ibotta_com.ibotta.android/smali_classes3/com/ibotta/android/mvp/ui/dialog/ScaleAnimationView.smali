.class public Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;
.super Ljava/lang/Object;
.source "ScaleAnimationView.java"


# instance fields
.field private endHeight:I

.field private endWidth:I

.field private startHeight:I

.field private startWidth:I

.field private view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;IIII)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->view:Landroid/view/View;

    .line 22
    iput p2, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startWidth:I

    .line 23
    iput p3, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startHeight:I

    .line 24
    iput p4, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endWidth:I

    .line 25
    iput p5, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endHeight:I

    return-void
.end method


# virtual methods
.method public getEndHeight()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endHeight:I

    return v0
.end method

.method public getEndWidth()I
    .locals 1

    .line 53
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endWidth:I

    return v0
.end method

.method public getStartHeight()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startHeight:I

    return v0
.end method

.method public getStartWidth()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startWidth:I

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->view:Landroid/view/View;

    return-object v0
.end method

.method public setEndHeight(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endHeight:I

    return-void
.end method

.method public setEndWidth(I)V
    .locals 0

    .line 57
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->endWidth:I

    return-void
.end method

.method public setLayoutParams(III)V
    .locals 1

    .line 73
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 74
    iput p3, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setStartGravity(I)V
    .locals 2

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->getStartWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->getStartHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->setLayoutParams(III)V

    return-void
.end method

.method public setStartHeight(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startHeight:I

    return-void
.end method

.method public setStartWidth(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->startWidth:I

    return-void
.end method

.method public setView(Landroid/view/View;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/ScaleAnimationView;->view:Landroid/view/View;

    return-void
.end method
