.class Lo/chx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/chx;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/chx;


# direct methods
.method constructor <init>(Lo/chx;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/chx$2;->d:Lo/chx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 97
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 99
    :pswitch_0
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-static {v0, v1}, Lo/chx;->b(Lo/chx;F)F

    .line 100
    goto/16 :goto_0

    .line 103
    :pswitch_1
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lo/chx;->d(Lo/chx;F)F

    .line 104
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v0}, Lo/chx;->a(Lo/chx;)F

    move-result v0

    iget-object v1, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v1}, Lo/chx;->e(Lo/chx;)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double v0, v0, v2

    if-lez v0, :cond_1

    .line 105
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget-object v1, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v1}, Lo/chx;->d(Lo/chx;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getScrollX()I

    move-result v1

    iget-object v2, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v2}, Lo/chx;->d(Lo/chx;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    .line 106
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 107
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    goto :goto_0

    .line 113
    :pswitch_2
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v0}, Lo/chx;->a(Lo/chx;)F

    move-result v0

    iget-object v1, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v1}, Lo/chx;->e(Lo/chx;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x43480000    # 200.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 114
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v0}, Lo/chx;->c(Lo/chx;)Lo/chx$b;

    move-result-object v0

    invoke-interface {v0}, Lo/chx$b;->b()V

    .line 116
    :cond_0
    iget-object v0, p0, Lo/chx$2;->d:Lo/chx;

    invoke-static {v0}, Lo/chx;->b(Lo/chx;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setX(F)V

    .line 117
    .line 122
    :cond_1
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
