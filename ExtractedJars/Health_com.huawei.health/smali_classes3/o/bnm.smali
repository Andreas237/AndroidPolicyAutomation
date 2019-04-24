.class public Lo/bnm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/PopupWindow;

.field private b:Landroid/view/View$OnClickListener;

.field private c:I

.field private d:Landroid/view/View;

.field private e:I

.field private g:Landroid/graphics/Bitmap;

.field private h:Landroid/app/Activity;

.field private i:Lo/bej;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/bnm;->c:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/bnm;->e:I

    .line 77
    iput-object p1, p0, Lo/bnm;->h:Landroid/app/Activity;

    .line 78
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_recent_pic_pop:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    .line 79
    iget-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    iget-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->rencent_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bej;

    iput-object v0, p0, Lo/bnm;->i:Lo/bej;

    .line 81
    return-void
.end method

.method private d()V
    .locals 1

    .line 191
    iget-object v0, p0, Lo/bnm;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bnm;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    iget-object v0, p0, Lo/bnm;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 194
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bnm;->g:Landroid/graphics/Bitmap;

    .line 196
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 169
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 171
    return-void

    .line 173
    :cond_0
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 178
    :cond_1
    invoke-direct {p0}, Lo/bnm;->d()V

    .line 179
    return-void
.end method

.method public b()Lo/bnm;
    .locals 4

    .line 102
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/bnm;->d:Landroid/view/View;

    const/4 v2, -0x2

    const/4 v3, -0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    .line 103
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 104
    return-object p0
.end method

.method public b(II)Lo/bnm;
    .locals 0

    .line 128
    iput p1, p0, Lo/bnm;->c:I

    .line 129
    iput p2, p0, Lo/bnm;->e:I

    .line 130
    return-object p0
.end method

.method public b(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/bnm;->b:Landroid/view/View$OnClickListener;

    .line 92
    return-void
.end method

.method public e(Landroid/graphics/Bitmap;)Lo/bnm;
    .locals 1

    .line 114
    iput-object p1, p0, Lo/bnm;->g:Landroid/graphics/Bitmap;

    .line 115
    iget-object v0, p0, Lo/bnm;->i:Lo/bej;

    invoke-virtual {v0, p1}, Lo/bej;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 116
    return-object p0
.end method

.method public e()V
    .locals 11

    .line 138
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 140
    return-void

    .line 144
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 145
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 146
    iget-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    invoke-virtual {v0, v5, v6}, Landroid/view/View;->measure(II)V

    .line 147
    iget-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 148
    iget-object v0, p0, Lo/bnm;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    .line 151
    iget-object v0, p0, Lo/bnm;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->c(Landroid/app/Activity;)I

    move-result v9

    .line 152
    iget-object v0, p0, Lo/bnm;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v10

    .line 154
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/bnm;->d:Landroid/view/View;

    sub-int v2, v9, v7

    iget v3, p0, Lo/bnm;->c:I

    sub-int/2addr v2, v3

    sub-int v3, v10, v8

    iget v4, p0, Lo/bnm;->e:I

    sub-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 157
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 159
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 161
    iget-object v0, p0, Lo/bnm;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->update()V

    .line 162
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 201
    iget-object v0, p0, Lo/bnm;->b:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {p0}, Lo/bnm;->a()V

    .line 204
    iget-object v0, p0, Lo/bnm;->b:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 206
    :cond_0
    return-void
.end method
