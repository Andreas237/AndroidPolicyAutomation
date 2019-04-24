.class public Lo/egv$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egv$b$b;,
        Lo/egv$b$c;
    }
.end annotation


# instance fields
.field a:Lo/egd;

.field b:Landroid/widget/RelativeLayout;

.field c:Landroid/widget/LinearLayout;

.field d:Lo/egv;

.field e:Landroid/widget/LinearLayout;

.field private f:Ljava/lang/String;

.field g:Lo/egd;

.field private h:Landroid/content/Context;

.field i:Lo/egd;

.field private k:Ljava/lang/String;

.field private l:Landroid/text/SpannableString;

.field private m:Ljava/lang/String;

.field private n:F

.field private o:Ljava/lang/String;

.field private p:F

.field private s:Landroid/view/View$OnClickListener;

.field private t:Z

.field private u:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/egv$b;->p:F

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lo/egv$b;->n:F

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/egv$b;->t:Z

    .line 260
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->d:Lo/egv;

    .line 262
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    .line 263
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->c:Landroid/widget/LinearLayout;

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->a:Lo/egd;

    .line 268
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->i:Lo/egd;

    .line 269
    const/4 v0, 0x0

    iput-object v0, p0, Lo/egv$b;->g:Lo/egd;

    .line 69
    iput-object p1, p0, Lo/egv$b;->h:Landroid/content/Context;

    .line 70
    return-void
.end method

.method private a()V
    .locals 2

    .line 410
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 411
    iget-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 413
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    iget-object v1, p0, Lo/egv$b;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 414
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 416
    iget-object v0, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 417
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    new-instance v1, Lo/egv$b$c;

    invoke-direct {v1, p0}, Lo/egv$b$c;-><init>(Lo/egv$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 419
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/egv$b;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/egv$b;->s:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 393
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 394
    iget-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 396
    iget-object v0, p0, Lo/egv$b;->i:Lo/egd;

    iget-object v1, p0, Lo/egv$b;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 398
    iget-object v0, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 399
    iget-object v0, p0, Lo/egv$b;->i:Lo/egd;

    new-instance v1, Lo/egv$b$c;

    invoke-direct {v1, p0}, Lo/egv$b$c;-><init>(Lo/egv$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 402
    :cond_0
    iget-object v0, p0, Lo/egv$b;->a:Lo/egd;

    iget-object v1, p0, Lo/egv$b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 403
    iget-object v0, p0, Lo/egv$b;->a:Lo/egd;

    iget-object v1, p0, Lo/egv$b;->i:Lo/egd;

    invoke-static {v0, v1}, Lo/ene;->c(Lo/egd;Lo/egd;)V

    .line 404
    iget-object v0, p0, Lo/egv$b;->s:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    .line 405
    iget-object v0, p0, Lo/egv$b;->a:Lo/egd;

    new-instance v1, Lo/egv$b$b;

    invoke-direct {v1, p0}, Lo/egv$b$b;-><init>(Lo/egv$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 407
    :cond_1
    return-void
.end method

.method private d()V
    .locals 2

    .line 367
    iget-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/egv$b;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 368
    invoke-direct {p0}, Lo/egv$b;->c()V

    goto :goto_0

    .line 369
    :cond_0
    iget-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/egv$b;->m:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 370
    invoke-direct {p0}, Lo/egv$b;->e()V

    goto :goto_0

    .line 371
    :cond_1
    iget-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/egv$b;->m:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 372
    invoke-direct {p0}, Lo/egv$b;->a()V

    goto :goto_0

    .line 374
    :cond_2
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 375
    iget-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 377
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/egv$b;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 422
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 423
    iget-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 425
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    iget-object v1, p0, Lo/egv$b;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 426
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    invoke-static {v0}, Lo/ene;->d(Lo/egd;)V

    .line 428
    iget-object v0, p0, Lo/egv$b;->s:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 429
    iget-object v0, p0, Lo/egv$b;->g:Lo/egd;

    new-instance v1, Lo/egv$b$b;

    invoke-direct {v1, p0}, Lo/egv$b$b;-><init>(Lo/egv$b;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 431
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;FLandroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 191
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    .line 192
    iput p2, p0, Lo/egv$b;->p:F

    .line 193
    iput-object p3, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    .line 194
    return-object p0
.end method

.method public b(I)Lo/egv$b;
    .locals 4

    .line 78
    const-string v0, "CustomTextAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTitle --- int --- called "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egv$b;->k:Ljava/lang/String;

    .line 80
    return-object p0
.end method

.method public b(ILandroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 203
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->m:Ljava/lang/String;

    .line 204
    iput-object p2, p0, Lo/egv$b;->s:Landroid/view/View$OnClickListener;

    .line 205
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/egv$b;
    .locals 0

    .line 120
    iput-object p1, p0, Lo/egv$b;->f:Ljava/lang/String;

    .line 121
    return-object p0
.end method

.method public b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 151
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    .line 152
    iput-object p2, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    .line 153
    return-object p0
.end method

.method public b()Lo/egv;
    .locals 13

    .line 276
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 278
    new-instance v0, Lo/egv;

    iget-object v1, p0, Lo/egv$b;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/commonui/R$style;->CustomDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/egv;-><init>(Landroid/content/Context;ILo/egv$5;)V

    iput-object v0, p0, Lo/egv$b;->d:Lo/egv;

    .line 279
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_custom_text_alert_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 282
    new-instance v6, Landroid/util/TypedValue;

    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 283
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$attr;->customDialogStyleRefer:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v6, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 288
    iget v0, v6, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    iget v1, v6, Landroid/util/TypedValue;->resourceId:I

    sget-object v2, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition:[I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v10

    .line 290
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_dialogBackground:I

    invoke-virtual {v10, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 291
    new-instance v11, Landroid/util/TypedValue;

    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 292
    new-instance v12, Landroid/util/TypedValue;

    invoke-direct {v12}, Landroid/util/TypedValue;-><init>()V

    .line 293
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_titleTextSize:I

    invoke-virtual {v10, v0, v11}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 294
    sget v0, Lcom/huawei/ui/commonui/R$styleable;->customDialogDefinition_contentTextSize:I

    invoke-virtual {v10, v0, v12}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 295
    iget v0, v11, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v7, v0

    .line 296
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    int-to-float v1, v7

    invoke-static {v0, v1}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v7

    .line 297
    iget v0, v12, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v0

    float-to-int v8, v0

    .line 298
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    int-to-float v1, v8

    invoke-static {v0, v1}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v8

    .line 300
    invoke-virtual {v10}, Landroid/content/res/TypedArray;->recycle()V

    .line 301
    goto :goto_0

    .line 302
    :cond_0
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/commonui/R$drawable;->activity_dialog_bg:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 303
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$dimen;->custom_normal_titlebar_title_textsize:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 304
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$dimen;->default_text_font_size_large2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 308
    :goto_0
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 311
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_text_alert_dailog_title:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 312
    int-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 313
    iget-object v0, p0, Lo/egv$b;->k:Ljava/lang/String;

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    sget v0, Lcom/huawei/ui/commonui/R$id;->custom_text_alert_dialog_title_simple:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 317
    int-to-float v0, v7

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 318
    iget-object v0, p0, Lo/egv$b;->k:Ljava/lang/String;

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    const-string v0, "CustomTextAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/egv$b;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    const-string v0, "CustomTextAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contentTextSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_message:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 327
    int-to-float v0, v8

    const/4 v1, 0x0

    invoke-virtual {v12, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 328
    iget-object v0, p0, Lo/egv$b;->l:Landroid/text/SpannableString;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 329
    iget-object v0, p0, Lo/egv$b;->l:Landroid/text/SpannableString;

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto :goto_1

    .line 332
    :cond_1
    iget-object v0, p0, Lo/egv$b;->f:Ljava/lang/String;

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    iget-object v0, p0, Lo/egv$b;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    const/16 v0, 0x8

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 337
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 338
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 342
    :cond_2
    :goto_1
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout1:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    .line 343
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_linearlayout2:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    .line 344
    sget v0, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_message_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egv$b;->c:Landroid/widget/LinearLayout;

    .line 345
    iget-boolean v0, p0, Lo/egv$b;->t:Z

    if-eqz v0, :cond_3

    .line 346
    iget-object v0, p0, Lo/egv$b;->c:Landroid/widget/LinearLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 349
    :cond_3
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_btn_negative:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egv$b;->a:Lo/egd;

    .line 350
    iget-object v0, p0, Lo/egv$b;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_text_alert_btn_positive:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egv$b;->i:Lo/egd;

    .line 351
    iget-object v0, p0, Lo/egv$b;->e:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_one_text_alert_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/egv$b;->g:Lo/egd;

    .line 354
    invoke-direct {p0}, Lo/egv$b;->d()V

    .line 356
    iget-object v0, p0, Lo/egv$b;->d:Lo/egv;

    iget-object v1, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-static {v0, v5, v1}, Lo/egv;->a(Landroid/app/Dialog;Landroid/view/View;Landroid/content/Context;)V

    .line 362
    iget-object v0, p0, Lo/egv$b;->d:Lo/egv;

    return-object v0
.end method

.method public c(Ljava/lang/Boolean;)Lo/egv$b;
    .locals 1

    .line 89
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/egv$b;->t:Z

    .line 90
    return-object p0
.end method

.method public d(IILandroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 164
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    .line 165
    iput-object p3, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    .line 166
    return-object p0
.end method

.method public e(I)Lo/egv$b;
    .locals 1

    .line 110
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/egv$b;->f:Ljava/lang/String;

    .line 111
    return-object p0
.end method

.method public e(ILandroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/egv$b;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->o:Ljava/lang/String;

    .line 141
    iput-object p2, p0, Lo/egv$b;->u:Landroid/view/View$OnClickListener;

    .line 142
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lo/egv$b;
    .locals 4

    .line 99
    const-string v0, "CustomTextAlertDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setTitle --- String --- called "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    iput-object p1, p0, Lo/egv$b;->k:Ljava/lang/String;

    .line 101
    return-object p0
.end method

.method public e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;
    .locals 1

    .line 214
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/egv$b;->m:Ljava/lang/String;

    .line 215
    iput-object p2, p0, Lo/egv$b;->s:Landroid/view/View$OnClickListener;

    .line 216
    return-object p0
.end method
