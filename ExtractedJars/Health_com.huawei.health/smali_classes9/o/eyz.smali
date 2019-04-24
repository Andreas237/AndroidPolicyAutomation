.class public Lo/eyz;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eyz$e;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Z

.field private c:Landroid/widget/TextView;

.field private d:I

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/view/View$OnClickListener;

.field private i:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->e:Landroid/widget/RelativeLayout;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/eyz;->d:I

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyz;->b:Z

    .line 50
    invoke-direct {p0}, Lo/eyz;->d()V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->e:Landroid/widget/RelativeLayout;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/eyz;->d:I

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyz;->b:Z

    .line 55
    invoke-direct {p0}, Lo/eyz;->d()V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyz;->e:Landroid/widget/RelativeLayout;

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/eyz;->d:I

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyz;->b:Z

    .line 60
    invoke-direct {p0}, Lo/eyz;->d()V

    .line 61
    return-void
.end method

.method static synthetic b(Lo/eyz;)Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lo/eyz;->b:Z

    return v0
.end method

.method static synthetic d(Lo/eyz;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eyz;->g:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 70
    invoke-virtual {p0}, Lo/eyz;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_jumpable_marker_textview:I

    invoke-static {v0, v1, p0}, Lo/eyz;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 71
    new-instance v0, Lo/eyz$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/eyz$e;-><init>(Lo/eyz;Lo/eyz$5;)V

    iput-object v0, p0, Lo/eyz;->i:Landroid/view/View$OnClickListener;

    .line 73
    sget v0, Lcom/huawei/ui/main/R$id;->detail_markview_data:I

    invoke-virtual {p0, v0}, Lo/eyz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eyz;->c:Landroid/widget/TextView;

    .line 74
    sget v0, Lcom/huawei/ui/main/R$id;->detail_markview_data_unit:I

    invoke-virtual {p0, v0}, Lo/eyz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    .line 76
    sget v0, Lcom/huawei/ui/main/R$id;->detail_markview_data_head:I

    invoke-virtual {p0, v0}, Lo/eyz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eyz;->f:Landroid/widget/TextView;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->jumpable_click_area:I

    invoke-virtual {p0, v0}, Lo/eyz;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/eyz;->e:Landroid/widget/RelativeLayout;

    .line 83
    iget-object v0, p0, Lo/eyz;->e:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/eyz;->i:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 90
    iget v0, p0, Lo/eyz;->d:I

    if-ne v0, p1, :cond_0

    .line 91
    return-void

    .line 95
    :cond_0
    iget-object v0, p0, Lo/eyz;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 96
    iget-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    iget-object v0, p0, Lo/eyz;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 100
    invoke-virtual {p0}, Lo/eyz;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    invoke-virtual {p0}, Lo/eyz;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_arrow_purple:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {p0}, Lo/eyz;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_arrow_purple_left:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 106
    :goto_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 108
    return-void
.end method

.method public setContentOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/eyz;->g:Landroid/view/View$OnClickListener;

    .line 130
    return-void
.end method

.method public setHost(Lo/ezh;)V
    .locals 2

    .line 133
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->p()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v0}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 136
    :cond_0
    iget-object v0, p0, Lo/eyz;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 139
    :cond_1
    iget-object v0, p0, Lo/eyz;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 141
    :cond_2
    :goto_0
    return-void
.end method

.method public setMarkerText(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lo/eyz;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Lo/eyz;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    :cond_0
    iget-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 124
    iget-object v0, p0, Lo/eyz;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    :cond_1
    return-void
.end method

.method public setTextJumpable(Z)V
    .locals 0

    .line 154
    iput-boolean p1, p0, Lo/eyz;->b:Z

    .line 160
    return-void
.end method
