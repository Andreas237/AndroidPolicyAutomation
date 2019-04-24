.class public Lo/emr;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/emr$a;
    }
.end annotation


# instance fields
.field private A:J

.field private B:Lo/emr$a;

.field private D:J

.field private a:Ljava/lang/String;

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/content/Context;

.field private e:I

.field private f:Landroid/widget/TextView;

.field private g:I

.field private h:I

.field private i:Landroid/graphics/drawable/Drawable;

.field private k:I

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/view/View;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/RelativeLayout;

.field private w:Landroid/widget/RelativeLayout;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Landroid/widget/ImageView;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 83
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/emr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 84
    iput-object p1, p0, Lo/emr;->d:Landroid/content/Context;

    .line 85
    invoke-direct {p0}, Lo/emr;->a()V

    .line 86
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 89
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    const/4 v0, -0x1

    iput v0, p0, Lo/emr;->e:I

    .line 56
    const/4 v0, -0x1

    iput v0, p0, Lo/emr;->g:I

    .line 57
    const/4 v0, -0x1

    iput v0, p0, Lo/emr;->k:I

    .line 291
    const/4 v0, 0x0

    iput-object v0, p0, Lo/emr;->B:Lo/emr$a;

    .line 91
    if-nez p2, :cond_0

    .line 92
    return-void

    .line 95
    :cond_0
    iput-object p1, p0, Lo/emr;->d:Landroid/content/Context;

    .line 97
    sget-object v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 98
    if-eqz v2, :cond_1

    .line 99
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_custom_type:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/emr;->e:I

    .line 100
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_titleBarText:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/emr;->a:Ljava/lang/String;

    .line 101
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_titleBarBg:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lo/emr;->b:Landroid/graphics/drawable/Drawable;

    .line 102
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_leftSoftkey_visibility:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/emr;->g:I

    .line 103
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_rightSoftkey_visibility:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lo/emr;->k:I

    .line 104
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_leftIcon:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    .line 105
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_rightIcon:I

    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lo/emr;->i:Landroid/graphics/drawable/Drawable;

    .line 106
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->custom_title_bar_titleBarTextColor:I

    const v1, -0xe5e5e6

    invoke-virtual {v2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/emr;->h:I

    .line 107
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    :cond_1
    invoke-direct {p0}, Lo/emr;->a()V

    .line 111
    return-void
.end method

.method static synthetic a(Lo/emr;J)J
    .locals 0

    .line 36
    iput-wide p1, p0, Lo/emr;->D:J

    return-wide p1
.end method

.method static synthetic a(Lo/emr;)Landroid/widget/TextView;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 136
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 137
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_titlebar:I

    invoke-virtual {v3, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 138
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_titlebar:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->n:Landroid/widget/RelativeLayout;

    .line 139
    sget v0, Lcom/huawei/ui/commonui/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->o:Landroid/widget/RelativeLayout;

    .line 140
    sget v0, Lcom/huawei/ui/commonui/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/emr;->s:Landroid/view/View;

    .line 141
    sget v0, Lcom/huawei/ui/commonui/R$id;->view_title:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    .line 142
    sget v0, Lcom/huawei/ui/commonui/R$id;->view_title_num:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    .line 143
    sget v0, Lcom/huawei/ui/commonui/R$id;->detail_title_text:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    .line 144
    sget v0, Lcom/huawei/ui/commonui/R$id;->normal_title_text:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    .line 145
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_left:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    .line 146
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_right:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    .line 147
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_left_position:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    .line 148
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_right_position:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    .line 149
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_left_layout:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    .line 150
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_right_layout:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    .line 151
    sget v0, Lcom/huawei/ui/commonui/R$id;->position_right_layout:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    .line 152
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_right_text_layout:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    .line 153
    sget v0, Lcom/huawei/ui/commonui/R$id;->btn_right_text_position:I

    invoke-virtual {p0, v0}, Lo/emr;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/emr;->y:Landroid/widget/ImageView;

    .line 157
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/emr$3;

    invoke-direct {v1, p0}, Lo/emr$3;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 169
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/emr$4;

    invoke-direct {v1, p0}, Lo/emr$4;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 182
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v4

    .line 183
    new-instance v5, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v5, v0, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 184
    iget-object v0, p0, Lo/emr;->s:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    .line 203
    iget-object v0, p0, Lo/emr;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lo/emr;->n:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/emr;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 206
    :cond_0
    if-eqz v6, :cond_1

    .line 207
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarBgColor:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v6, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v7

    .line 208
    if-eqz v7, :cond_1

    .line 209
    iget-object v0, p0, Lo/emr;->n:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lo/emr;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$color;->common_health_titlebar_backgraound:I

    .line 210
    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    .line 209
    const/4 v2, 0x0

    invoke-virtual {v7, v2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 211
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 217
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    iget v1, p0, Lo/emr;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    iget v1, p0, Lo/emr;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 219
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    iget v1, p0, Lo/emr;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 222
    iget v0, p0, Lo/emr;->e:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 224
    :pswitch_0
    invoke-direct {p0}, Lo/emr;->d()V

    .line 225
    goto :goto_2

    .line 228
    :pswitch_1
    invoke-direct {p0}, Lo/emr;->h()V

    .line 229
    goto :goto_2

    .line 232
    :pswitch_2
    invoke-direct {p0}, Lo/emr;->c()V

    .line 233
    goto :goto_2

    .line 236
    :goto_1
    :pswitch_3
    invoke-direct {p0}, Lo/emr;->g()V

    .line 239
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic b(Lo/emr;)J
    .locals 2

    .line 36
    iget-wide v0, p0, Lo/emr;->A:J

    return-wide v0
.end method

.method private b()V
    .locals 7

    .line 378
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 379
    if-eqz v4, :cond_1

    .line 380
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (t != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarCrossIcon:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 383
    if-eqz v5, :cond_1

    .line 384
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (arrayLeft != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 386
    if-eqz v6, :cond_0

    .line 387
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (drawableLeft != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 391
    :cond_0
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 394
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/emr;J)J
    .locals 0

    .line 36
    iput-wide p1, p0, Lo/emr;->A:J

    return-wide p1
.end method

.method static synthetic c(Lo/emr;)Landroid/widget/TextView;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 304
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 305
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 306
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 308
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lo/emr;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lo/emr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 318
    :cond_0
    invoke-direct {p0}, Lo/emr;->e()V

    .line 322
    iget-object v0, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 326
    :cond_1
    invoke-direct {p0}, Lo/emr;->k()V

    .line 329
    :goto_0
    iget-object v0, p0, Lo/emr;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 330
    iget-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 334
    :cond_2
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/emr$2;

    invoke-direct {v1, p0}, Lo/emr$2;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 346
    return-void
.end method

.method static synthetic d(Lo/emr;)Lo/emr$a;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/emr;->B:Lo/emr$a;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 249
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 251
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 255
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 259
    iget-object v0, p0, Lo/emr;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lo/emr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    :cond_0
    iget-object v0, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 269
    :cond_1
    invoke-direct {p0}, Lo/emr;->k()V

    .line 273
    :goto_0
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/emr$5;

    invoke-direct {v1, p0}, Lo/emr$5;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    return-void
.end method

.method static synthetic e(Lo/emr;)J
    .locals 2

    .line 36
    iget-wide v0, p0, Lo/emr;->D:J

    return-wide v0
.end method

.method private e()V
    .locals 2

    .line 350
    iget v0, p0, Lo/emr;->g:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 352
    :sswitch_0
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 354
    goto :goto_0

    .line 357
    :sswitch_1
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 358
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 359
    goto :goto_0

    .line 362
    :sswitch_2
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 363
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 364
    .line 369
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x4 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method private g()V
    .locals 2

    .line 494
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 495
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 496
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 500
    iget-object v0, p0, Lo/emr;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 501
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lo/emr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    :cond_0
    invoke-direct {p0}, Lo/emr;->e()V

    .line 507
    iget v0, p0, Lo/emr;->k:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 510
    :sswitch_0
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 511
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 512
    goto :goto_0

    .line 515
    :sswitch_1
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 516
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 517
    goto :goto_0

    .line 520
    :sswitch_2
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 521
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 522
    .line 530
    :goto_0
    iget-object v0, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 531
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 534
    :cond_1
    invoke-direct {p0}, Lo/emr;->b()V

    .line 537
    :goto_1
    iget-object v0, p0, Lo/emr;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 538
    iget-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 541
    :cond_2
    invoke-direct {p0}, Lo/emr;->i()V

    .line 545
    :goto_2
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    new-instance v1, Lo/emr$8;

    invoke-direct {v1, p0}, Lo/emr$8;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 557
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x4 -> :sswitch_0
        0x8 -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic h(Lo/emr;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 470
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadNormalTypeView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 474
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 476
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 477
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 478
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lo/emr;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 482
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lo/emr;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 484
    :cond_0
    return-void
.end method

.method private i()V
    .locals 7

    .line 444
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 445
    if-eqz v4, :cond_1

    .line 446
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadRightIconByThemeSet() if (t != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarTickIcon:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 449
    if-eqz v5, :cond_1

    .line 450
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadRightIconByThemeSet() if (arrayRight != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 452
    if-eqz v6, :cond_0

    .line 453
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadRightIconByThemeSet() if (drawableRight == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 456
    :cond_0
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 459
    :cond_1
    return-void
.end method

.method private k()V
    .locals 7

    .line 403
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 404
    const/4 v5, 0x0

    .line 405
    if-eqz v4, :cond_3

    .line 406
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (t != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (LanguageUtil.isRTLLanguage)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 412
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarRTLLanguageBackIcon:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    goto :goto_0

    .line 414
    :cond_0
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (LanguageUtil.isRTLLanguage) ELSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/commonui/R$attr;->titleBarBackIcon:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 418
    :goto_0
    if-eqz v5, :cond_3

    .line 419
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (arrayLeft != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 421
    if-eqz v6, :cond_1

    .line 422
    const-string v0, "CustomTitleBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadLeftCrossIconByThemeSet() if (drawableLeft != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 425
    :cond_1
    iget-object v0, p0, Lo/emr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 426
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$drawable;->health_navbar_rtl_back_selector:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 428
    :cond_2
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/emr;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$drawable;->health_navbar_back_selector:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 432
    :goto_1
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 435
    :cond_3
    return-void
.end method


# virtual methods
.method public getmViewTitle()Landroid/widget/TextView;
    .locals 1

    .line 865
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method public setBackToTopListener(Lo/emr$a;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lo/emr;->B:Lo/emr$a;

    .line 295
    return-void
.end method

.method public setCountNumVisibility(I)V
    .locals 2

    .line 813
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 814
    return-void

    .line 816
    :cond_0
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 817
    return-void
.end method

.method public setDoubleClickEnable(Z)V
    .locals 2

    .line 119
    if-eqz p1, :cond_0

    .line 120
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    new-instance v1, Lo/emr$1;

    invoke-direct {v1, p0}, Lo/emr$1;-><init>(Lo/emr;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    :cond_0
    return-void
.end method

.method public setLeftButtonClickable(Z)V
    .locals 2

    .line 698
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 699
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 701
    :cond_0
    return-void
.end method

.method public setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 646
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 647
    iget-object v0, p0, Lo/emr;->r:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 649
    :cond_0
    return-void
.end method

.method public setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 619
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 620
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 622
    :cond_0
    return-void
.end method

.method public setLeftButtonVisibility(I)V
    .locals 2

    .line 710
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 711
    return-void

    .line 713
    :cond_0
    iget-object v0, p0, Lo/emr;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 714
    iget-object v0, p0, Lo/emr;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 715
    return-void
.end method

.method public setRightButtonClickable(Z)V
    .locals 2

    .line 672
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 673
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 675
    :cond_0
    return-void
.end method

.method public setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 659
    iget-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 660
    iget-object v0, p0, Lo/emr;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 662
    :cond_0
    return-void
.end method

.method public setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 633
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 634
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 636
    :cond_0
    return-void
.end method

.method public setRightButtonVisibility(I)V
    .locals 2

    .line 755
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 756
    return-void

    .line 758
    :cond_0
    iget-object v0, p0, Lo/emr;->z:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 759
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 760
    iget-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 761
    return-void
.end method

.method public setRightPositionClickable(Z)V
    .locals 2

    .line 685
    iget-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 686
    iget-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 688
    :cond_0
    return-void
.end method

.method public setRightSoftkeyBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 722
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 723
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 725
    :cond_0
    return-void
.end method

.method public setRightSoftkeyOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 744
    iget-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 745
    iget-object v0, p0, Lo/emr;->w:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 747
    :cond_0
    return-void
.end method

.method public setRightSoftkeyVisibility(I)V
    .locals 2

    .line 732
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 733
    iget-object v0, p0, Lo/emr;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 735
    :cond_0
    return-void
.end method

.method public setRightTextButtonBackBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 778
    iget-object v0, p0, Lo/emr;->y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 779
    iget-object v0, p0, Lo/emr;->y:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 781
    :cond_0
    return-void
.end method

.method public setRightTextButtonClickable(Z)V
    .locals 2

    .line 790
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 791
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 793
    :cond_0
    return-void
.end method

.method public setRightTextButtonOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .line 802
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 803
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 805
    :cond_0
    return-void
.end method

.method public setRightTextButtonVisibility(I)V
    .locals 2

    .line 768
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 769
    iget-object v0, p0, Lo/emr;->v:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 771
    :cond_0
    return-void
.end method

.method public setTitleBarBackgroundColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 115
    iget-object v0, p0, Lo/emr;->n:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 116
    return-void
.end method

.method public setTitleCountBg(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 847
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 848
    return-void

    .line 850
    :cond_0
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 851
    return-void
.end method

.method public setTitleCountColor(I)V
    .locals 2

    .line 836
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 837
    return-void

    .line 839
    :cond_0
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 840
    return-void
.end method

.method public setTitleCountNum(I)V
    .locals 5

    .line 825
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 826
    return-void

    .line 828
    :cond_0
    iget-object v0, p0, Lo/emr;->m:Landroid/widget/TextView;

    int-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 829
    return-void
.end method

.method public setTitleSize(F)V
    .locals 1

    .line 592
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 593
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 594
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 595
    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 3

    .line 568
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 570
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 574
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    .line 576
    :cond_0
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 579
    :goto_0
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 580
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_1

    .line 582
    :cond_1
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 584
    :goto_1
    return-void
.end method

.method public setTitleTextColor(I)V
    .locals 1

    .line 606
    iget-object v0, p0, Lo/emr;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 607
    iget-object v0, p0, Lo/emr;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 608
    iget-object v0, p0, Lo/emr;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 609
    return-void
.end method

.method public setTitleVisibility(I)V
    .locals 2

    .line 857
    iget-object v0, p0, Lo/emr;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 858
    iget-object v0, p0, Lo/emr;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 860
    :cond_0
    return-void
.end method
