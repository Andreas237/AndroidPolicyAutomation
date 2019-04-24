.class public Lcom/shopkick/app/ftue/DragConstraintLayout;
.super Landroid/support/constraint/ConstraintLayout;
.source "DragConstraintLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;,
        Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;
    }
.end annotation


# static fields
.field private static final AUTO_OPEN_SPEED_LIMIT:D = 800.0


# instance fields
.field private closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

.field private closeStarted:Z

.field private mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

.field private mDraggingBorder:I

.field private mDraggingCloseThreshold:I

.field private mDraggingState:I

.field private mVerticalRange:I

.field private mainLayout:Landroid/view/View;

.field private mainLayoutInitialY:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 115
    invoke-direct {p0, p1, p2}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingState:I

    const/16 p2, 0x32

    .line 20
    iput p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingCloseThreshold:I

    .line 22
    iput p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayoutInitialY:I

    .line 23
    iput-boolean p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->closeStarted:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/ftue/DragConstraintLayout;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingState:I

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/ftue/DragConstraintLayout;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingState:I

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/ftue/DragConstraintLayout;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingBorder:I

    return p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/ftue/DragConstraintLayout;I)I
    .locals 0

    .line 13
    iput p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingBorder:I

    return p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/ftue/DragConstraintLayout;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayoutInitialY:I

    return p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/ftue/DragConstraintLayout;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingCloseThreshold:I

    return p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/ftue/DragConstraintLayout;)Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/ftue/DragConstraintLayout;)Z
    .locals 0

    .line 13
    iget-boolean p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->closeStarted:Z

    return p0
.end method

.method static synthetic access$502(Lcom/shopkick/app/ftue/DragConstraintLayout;Z)Z
    .locals 0

    .line 13
    iput-boolean p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->closeStarted:Z

    return p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/ftue/DragConstraintLayout;)I
    .locals 0

    .line 13
    iget p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mVerticalRange:I

    return p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/ftue/DragConstraintLayout;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    return-object p0
.end method


# virtual methods
.method public calculateMainLayoutInitialY()V
    .locals 2

    const v0, 0x7f09045f

    .line 192
    invoke-virtual {p0, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayout:Landroid/view/View;

    .line 193
    iget v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mVerticalRange:I

    iget-object v1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayout:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayoutInitialY:I

    return-void
.end method

.method public computeScroll()V
    .locals 2

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public isMoving()Z
    .locals 3

    .line 183
    iget v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingState:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method protected onFinishInflate()V
    .locals 2

    const v0, 0x7f09045f

    .line 127
    invoke-virtual {p0, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mainLayout:Landroid/view/View;

    .line 128
    new-instance v0, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/DragConstraintLayout$DragHelperCallback;-><init>(Lcom/shopkick/app/ftue/DragConstraintLayout;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1, v0}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    .line 129
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->onFinishInflate()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 137
    iput p2, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mVerticalRange:I

    .line 138
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->calculateMainLayoutInitialY()V

    .line 139
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/constraint/ConstraintLayout;->onSizeChanged(IIII)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 163
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->isMoving()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    const/4 p1, 0x1

    return p1

    .line 167
    :cond_0
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->performClick()Z

    .line 168
    invoke-super {p0, p1}, Landroid/support/constraint/ConstraintLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 155
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->performClick()Z

    move-result v0

    return v0
.end method

.method public setCloseListener(Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    return-void
.end method

.method public setDraggingCloseThreshold(I)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/shopkick/app/ftue/DragConstraintLayout;->mDraggingCloseThreshold:I

    return-void
.end method
