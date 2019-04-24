.class public Lo/ebu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Landroid/widget/ScrollView;

.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/widget/ScrollView;II)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lo/ebu;->a:Landroid/widget/ScrollView;

    .line 14
    iput p2, p0, Lo/ebu;->b:I

    .line 15
    iput p3, p0, Lo/ebu;->e:I

    .line 16
    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 20
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 22
    :pswitch_0
    iget-object v0, p0, Lo/ebu;->a:Landroid/widget/ScrollView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebu;->d:I

    .line 24
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebu;->c:I

    .line 25
    goto/16 :goto_0

    .line 27
    :pswitch_1
    iget-object v0, p0, Lo/ebu;->a:Landroid/widget/ScrollView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->requestDisallowInterceptTouchEvent(Z)V

    .line 28
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lo/ebu;->d:I

    sub-int v2, v0, v1

    .line 29
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-int v0, v0

    iget v1, p0, Lo/ebu;->c:I

    sub-int v3, v0, v1

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int v4, v0, v2

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    add-int v5, v0, v3

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    add-int v6, v0, v2

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    add-int v7, v0, v3

    .line 36
    if-gez v4, :cond_0

    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/lit8 v6, v0, 0x0

    .line 41
    :cond_0
    iget v0, p0, Lo/ebu;->b:I

    if-le v6, v0, :cond_1

    .line 42
    iget v6, p0, Lo/ebu;->b:I

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    sub-int v4, v6, v0

    .line 46
    :cond_1
    if-gez v5, :cond_2

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/lit8 v7, v0, 0x0

    .line 51
    :cond_2
    iget v0, p0, Lo/ebu;->e:I

    if-le v7, v0, :cond_3

    .line 52
    iget v7, p0, Lo/ebu;->e:I

    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int v5, v7, v0

    .line 56
    :cond_3
    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/view/View;->layout(IIII)V

    .line 58
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebu;->d:I

    .line 59
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/ebu;->c:I

    .line 61
    goto :goto_0

    .line 63
    :pswitch_2
    iget-object v0, p0, Lo/ebu;->a:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->requestDisallowInterceptTouchEvent(Z)V

    .line 64
    .line 68
    :goto_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
