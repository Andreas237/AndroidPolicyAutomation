.class public Lo/egy$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egy$b$d;,
        Lo/egy$b$b;
    }
.end annotation


# instance fields
.field a:Lo/egd;

.field b:Landroid/widget/RelativeLayout;

.field c:Lo/egd;

.field d:Landroid/widget/LinearLayout;

.field e:Lo/egy;

.field private f:Z

.field g:I

.field h:Lo/egd;

.field private i:Ljava/lang/String;

.field private k:Landroid/content/Context;

.field private l:Landroid/view/View$OnClickListener;

.field private m:I

.field private n:Ljava/lang/String;

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egy$b;->f:Z

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/egy$b;->o:I

    .line 56
    const/4 v0, 0x0

    iput v0, p0, Lo/egy$b;->m:I

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->e:Lo/egy;

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    .line 222
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->c:Lo/egd;

    .line 223
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->a:Lo/egd;

    .line 224
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egy$b;->h:Lo/egd;

    .line 63
    iput-object p1, p0, Lo/egy$b;->k:Landroid/content/Context;

    .line 64
    return-void
.end method

.method static synthetic a(Lo/egy$b;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 302
    iget-object v0, p0, Lo/egy$b;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/egy$b;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 303
    invoke-direct {p0}, Lo/egy$b;->d()V

    goto :goto_0

    .line 304
    :cond_0
    iget-object v0, p0, Lo/egy$b;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/egy$b;->n:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 305
    invoke-direct {p0}, Lo/egy$b;->e()V

    goto :goto_0

    .line 306
    :cond_1
    iget-object v0, p0, Lo/egy$b;->p:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/egy$b;->n:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 307
    invoke-direct {p0}, Lo/egy$b;->c()V

    goto :goto_0

    .line 309
    :cond_2
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 312
    :goto_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 348
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 349
    iget-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 351
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 352
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 354
    iget v0, p0, Lo/egy$b;->o:I

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/egy$b;->o:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    goto :goto_0

    .line 357
    :cond_0
    iget v0, p0, Lo/egy$b;->g:I

    if-eqz v0, :cond_1

    .line 358
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    iget v1, p0, Lo/egy$b;->g:I

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 361
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 362
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    new-instance v1, Lo/egy$b$b;

    invoke-direct {v1, p0}, Lo/egy$b$b;-><init>(Lo/egy$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 364
    :cond_2
    return-void
.end method

.method static synthetic d(Lo/egy$b;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 315
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 319
    iget v0, p0, Lo/egy$b;->o:I

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/egy$b;->o:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    goto :goto_0

    .line 322
    :cond_0
    iget v0, p0, Lo/egy$b;->g:I

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    iget v1, p0, Lo/egy$b;->g:I

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 326
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 327
    iget-object v0, p0, Lo/egy$b;->a:Lo/egd;

    new-instance v1, Lo/egy$b$b;

    invoke-direct {v1, p0}, Lo/egy$b$b;-><init>(Lo/egy$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 329
    :cond_2
    const-string v0, "NoTitleCustomAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positiveButtonClickListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :goto_1
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 333
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->a:Lo/egd;

    invoke-static {v0, v1}, Lo/ene;->c(Lo/egd;Lo/egd;)V

    .line 335
    iget v0, p0, Lo/egy$b;->m:I

    if-eqz v0, :cond_3

    .line 336
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/egy$b;->m:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    goto :goto_2

    .line 338
    :cond_3
    iget v0, p0, Lo/egy$b;->g:I

    if-eqz v0, :cond_4

    .line 339
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget v1, p0, Lo/egy$b;->g:I

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 342
    :cond_4
    :goto_2
    iget-object v0, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_5

    .line 343
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    new-instance v1, Lo/egy$b$d;

    invoke-direct {v1, p0}, Lo/egy$b$d;-><init>(Lo/egy$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    :cond_5
    return-void
.end method

.method private e()V
    .locals 3

    .line 367
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 368
    iget-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 370
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 371
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 373
    iget v0, p0, Lo/egy$b;->m:I

    if-eqz v0, :cond_0

    .line 374
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Lo/egy$b;->m:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    goto :goto_0

    .line 376
    :cond_0
    iget v0, p0, Lo/egy$b;->g:I

    if-eqz v0, :cond_1

    .line 377
    iget-object v0, p0, Lo/egy$b;->c:Lo/egd;

    iget v1, p0, Lo/egy$b;->g:I

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 380
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    .line 381
    iget-object v0, p0, Lo/egy$b;->h:Lo/egd;

    new-instance v1, Lo/egy$b$d;

    invoke-direct {v1, p0}, Lo/egy$b$d;-><init>(Lo/egy$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    :cond_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lo/egy$b;
    .locals 0

    .line 92
    iput-object p1, p0, Lo/egy$b;->i:Ljava/lang/String;

    .line 93
    return-object p0
.end method

.method public a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 0

    .line 183
    iput-object p1, p0, Lo/egy$b;->n:Ljava/lang/String;

    .line 184
    iput-object p2, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    .line 185
    return-object p0
.end method

.method public a()Lo/egy;
    .locals 11

    .line 234
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 237
    new-instance v0, Lo/egy;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/egy;-><init>(Landroid/content/Context;ILo/egy$2;)V

    iput-object v0, p0, Lo/egy$b;->e:Lo/egy;

    .line 240
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_no_title_custom_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 241
    iget-object v0, p0, Lo/egy$b;->e:Lo/egy;

    invoke-virtual {v0, v5}, Lo/egy;->setContentView(Landroid/view/View;)V

    .line 244
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 245
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 249
    iget v0, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v6, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 251
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v9, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 252
    new-instance v10, Landroid/util/TypedValue;

    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    .line 253
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_contentTextSize:I

    invoke-virtual {v9, v0, v10}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 254
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_buttonTextColor:I

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_colorAccent:I

    invoke-virtual {v9, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/egy$b;->g:I

    .line 255
    iget v0, v10, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v7, v0

    .line 256
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    int-to-float v1, v7

    invoke-static {v0, v1}, Lo/egy;->c(Landroid/content/Context;F)I

    move-result v7

    .line 258
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 259
    goto :goto_0

    .line 260
    :cond_0
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 261
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_colorAccent:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lo/egy$b;->g:I

    .line 262
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$dimen;->default_text_font_size_large2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 266
    :goto_0
    invoke-virtual {v5, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 269
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_no_title_tv_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 270
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_no_title_llyt_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 271
    iget-boolean v0, p0, Lo/egy$b;->f:Z

    if-eqz v0, :cond_1

    .line 272
    const/16 v0, 0x11

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 274
    :cond_1
    int-to-float v0, v7

    const/high16 v1, -0x40800000    # -1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 275
    int-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v9, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 277
    :cond_2
    iget-object v0, p0, Lo/egy$b;->i:Ljava/lang/String;

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    .line 280
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    .line 282
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_no_title_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egy$b;->c:Lo/egd;

    .line 283
    iget-object v0, p0, Lo/egy$b;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_no_title_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egy$b;->a:Lo/egd;

    .line 284
    iget-object v0, p0, Lo/egy$b;->d:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_one_no_title_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egy$b;->h:Lo/egd;

    .line 286
    const-string v0, "NoTitleCustomAlertDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "negativeButtonText = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/egy$b;->n:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-direct {p0}, Lo/egy$b;->b()V

    .line 292
    iget-object v0, p0, Lo/egy$b;->e:Lo/egy;

    iget-object v1, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-static {v0, v5, v1}, Lo/egv;->a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V

    .line 298
    iget-object v0, p0, Lo/egy$b;->e:Lo/egy;

    return-object v0
.end method

.method public b(I)Lo/egy$b;
    .locals 1

    .line 82
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egy$b;->i:Ljava/lang/String;

    .line 83
    return-object p0
.end method

.method public c(IILandroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 1

    .line 146
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egy$b;->p:Ljava/lang/String;

    .line 147
    iput p2, p0, Lo/egy$b;->o:I

    .line 148
    iput-object p3, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    .line 149
    return-object p0
.end method

.method public c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 0

    .line 133
    iput-object p1, p0, Lo/egy$b;->p:Ljava/lang/String;

    .line 134
    iput-object p2, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    .line 135
    return-object p0
.end method

.method public d(IILandroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 1

    .line 196
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egy$b;->n:Ljava/lang/String;

    .line 197
    iput p2, p0, Lo/egy$b;->m:I

    .line 198
    iput-object p3, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    .line 199
    return-object p0
.end method

.method public d(ILandroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 1

    .line 122
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egy$b;->p:Ljava/lang/String;

    .line 123
    iput-object p2, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    .line 124
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/egy$b;
    .locals 0

    .line 113
    return-object p0
.end method

.method public d(Ljava/lang/String;ILandroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 0

    .line 160
    iput-object p1, p0, Lo/egy$b;->p:Ljava/lang/String;

    .line 161
    iput p2, p0, Lo/egy$b;->o:I

    .line 162
    iput-object p3, p0, Lo/egy$b;->l:Landroid/view/View$OnClickListener;

    .line 163
    return-object p0
.end method

.method public e(ILandroid/view/View$OnClickListener;)Lo/egy$b;
    .locals 1

    .line 172
    iget-object v0, p0, Lo/egy$b;->k:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egy$b;->n:Ljava/lang/String;

    .line 173
    iput-object p2, p0, Lo/egy$b;->q:Landroid/view/View$OnClickListener;

    .line 174
    return-object p0
.end method

.method public e(Z)Lo/egy$b;
    .locals 0

    .line 72
    iput-boolean p1, p0, Lo/egy$b;->f:Z

    .line 73
    return-object p0
.end method
