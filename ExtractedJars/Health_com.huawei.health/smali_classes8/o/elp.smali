.class public Lo/elp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Landroid/widget/PopupWindow;

.field private d:Lo/eli;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 4

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lo/elp;->a:Landroid/content/Context;

    .line 48
    new-instance v0, Landroid/widget/PopupWindow;

    const/4 v1, -0x2

    const/4 v2, -0x2

    const/4 v3, 0x1

    invoke-direct {v0, p2, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    .line 50
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 52
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/elp;->b:I

    .line 53
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/elp;->e:I

    .line 54
    return-void
.end method

.method private d()V
    .locals 1

    .line 178
    iget-object v0, p0, Lo/elp;->d:Lo/eli;

    if-eqz v0, :cond_0

    .line 179
    iget-object v0, p0, Lo/elp;->d:Lo/eli;

    invoke-interface {v0}, Lo/eli;->d()V

    .line 181
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 167
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 168
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 9

    .line 65
    invoke-direct {p0}, Lo/elp;->d()V

    .line 66
    const/4 v0, 0x2

    new-array v5, v0, [I

    .line 67
    invoke-virtual {p1, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 68
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 70
    :pswitch_0
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40e00000    # 7.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 70
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 72
    goto/16 :goto_0

    .line 74
    :pswitch_1
    iget-object v0, p0, Lo/elp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x42400000    # 48.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 75
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto/16 :goto_0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x42400000    # 48.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 78
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 81
    goto/16 :goto_0

    .line 83
    :pswitch_2
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 84
    const/high16 v4, 0x41880000    # 17.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    iget v3, p0, Lo/elp;->e:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    .line 83
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 85
    goto/16 :goto_0

    .line 87
    :pswitch_3
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget v2, p0, Lo/elp;->b:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x42280000    # 42.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 88
    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lo/elp;->e:I

    sub-int/2addr v2, v3

    .line 87
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 89
    goto/16 :goto_0

    .line 91
    :pswitch_4
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x43340000    # 180.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 92
    const/high16 v4, 0x42e60000    # 115.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 91
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 93
    goto/16 :goto_0

    .line 95
    :pswitch_5
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 96
    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    .line 95
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 97
    goto/16 :goto_0

    .line 99
    :pswitch_6
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41f00000    # 30.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 100
    goto/16 :goto_0

    .line 102
    :pswitch_7
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x8

    mul-int/lit8 v2, v2, 0x5

    add-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x41200000    # 10.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 103
    goto/16 :goto_0

    .line 105
    :pswitch_8
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 106
    const/high16 v4, 0x41880000    # 17.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 105
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 107
    goto/16 :goto_0

    .line 109
    :pswitch_9
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40800000    # 4.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 111
    goto/16 :goto_0

    .line 113
    :pswitch_a
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    .line 113
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 115
    goto/16 :goto_0

    .line 117
    :pswitch_b
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 118
    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lo/elp;->e:I

    sub-int/2addr v2, v3

    .line 117
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 119
    goto/16 :goto_0

    .line 121
    :pswitch_c
    iget-object v0, p0, Lo/elp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x1

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto/16 :goto_0

    .line 124
    :cond_1
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40800000    # 4.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 124
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 127
    goto/16 :goto_0

    .line 129
    :pswitch_d
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x40e00000    # 7.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x41880000    # 17.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 129
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 131
    goto/16 :goto_0

    .line 133
    :pswitch_e
    iget-object v0, p0, Lo/elp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 134
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lo/elp;->e:I

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto/16 :goto_0

    .line 136
    :cond_2
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    iget v2, p0, Lo/elp;->b:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    .line 137
    const/high16 v4, 0x40400000    # 3.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lo/elp;->e:I

    sub-int/2addr v2, v3

    .line 136
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 139
    goto/16 :goto_0

    .line 141
    :pswitch_f
    const/4 v0, 0x1

    aget v0, v5, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int v6, v0, v1

    .line 143
    iget-object v0, p0, Lo/elp;->a:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v7

    .line 145
    iget-object v0, p0, Lo/elp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 146
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1, v6}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto :goto_0

    .line 148
    :cond_3
    iget v0, p0, Lo/elp;->b:I

    sub-int v0, v7, v0

    iget-object v1, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    sub-int v8, v0, v1

    .line 150
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v8, v6}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 152
    goto :goto_0

    .line 154
    :pswitch_10
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    const/4 v1, 0x0

    aget v1, v5, v1

    iget-object v2, p0, Lo/elp;->a:Landroid/content/Context;

    .line 155
    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x1

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 154
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 156
    goto :goto_0

    .line 158
    :pswitch_11
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/elp;->a:Landroid/content/Context;

    .line 159
    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x1

    aget v2, v5, v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    iget-object v3, p0, Lo/elp;->a:Landroid/content/Context;

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    add-int/2addr v2, v3

    .line 158
    const/4 v3, 0x0

    invoke-virtual {v0, p1, v3, v1, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 160
    .line 164
    :goto_0
    :pswitch_12
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_12
        :pswitch_12
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
    .end packed-switch
.end method

.method public c()Z
    .locals 1

    .line 61
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public e(Landroid/view/View;)V
    .locals 2

    .line 185
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->measure(II)V

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iput v0, p0, Lo/elp;->b:I

    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iput v0, p0, Lo/elp;->e:I

    .line 188
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 57
    iget-object v0, p0, Lo/elp;->c:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 58
    return-void
.end method
