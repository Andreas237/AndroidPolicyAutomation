.class Lo/ezm$d;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 403
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 404
    invoke-direct {p0}, Lo/ezm$d;->d()V

    .line 405
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 408
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 409
    invoke-direct {p0}, Lo/ezm$d;->d()V

    .line 410
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 413
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 414
    invoke-direct {p0}, Lo/ezm$d;->d()V

    .line 415
    return-void
.end method

.method private final d()V
    .locals 3

    .line 418
    invoke-virtual {p0}, Lo/ezm$d;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->focus_view_detail_warning_hr:I

    invoke-static {v0, v1, p0}, Lo/ezm$d;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 420
    sget v0, Lcom/huawei/ui/main/R$id;->text_warning_heartrate_content:I

    invoke-virtual {p0, v0}, Lo/ezm$d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/ezm$d;->c:Landroid/widget/LinearLayout;

    .line 421
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_detail:I

    invoke-virtual {p0, v0}, Lo/ezm$d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/ezm$d;->d:Landroid/widget/TextView;

    .line 422
    sget v0, Lcom/huawei/ui/main/R$id;->image_view_detail:I

    invoke-virtual {p0, v0}, Lo/ezm$d;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/ezm$d;->b:Landroid/widget/ImageView;

    .line 424
    invoke-virtual {p0}, Lo/ezm$d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 425
    iget-object v0, p0, Lo/ezm$d;->b:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/ezm$d;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 427
    :cond_0
    iget-object v0, p0, Lo/ezm$d;->b:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lo/ezm$d;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 430
    :goto_0
    iget-object v0, p0, Lo/ezm$d;->d:Landroid/widget/TextView;

    new-instance v1, Lo/ezm$d$3;

    invoke-direct {v1, p0}, Lo/ezm$d$3;-><init>(Lo/ezm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 439
    iget-object v0, p0, Lo/ezm$d;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/ezm$d$5;

    invoke-direct {v1, p0}, Lo/ezm$d$5;-><init>(Lo/ezm$d;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 468
    return-void
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fbb$e;>;)V"
        }
    .end annotation

    .line 471
    iget-object v0, p0, Lo/ezm$d;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 473
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 474
    :cond_0
    invoke-virtual {p0}, Lo/ezm$d;->invalidate()V

    .line 475
    return-void

    .line 478
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fbb$e;

    .line 479
    new-instance v5, Lo/fbb;

    invoke-virtual {p0}, Lo/ezm$d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/fbb;-><init>(Landroid/content/Context;)V

    .line 480
    invoke-virtual {v5, v4}, Lo/fbb;->a(Lo/fbm;)V

    .line 481
    iget-object v0, p0, Lo/ezm$d;->c:Landroid/widget/LinearLayout;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v5, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;II)V

    .line 482
    goto :goto_0

    .line 484
    :cond_2
    invoke-virtual {p0}, Lo/ezm$d;->invalidate()V

    .line 485
    return-void
.end method
