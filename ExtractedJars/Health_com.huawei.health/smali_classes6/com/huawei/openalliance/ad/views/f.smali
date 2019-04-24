.class public Lcom/huawei/openalliance/ad/views/f;
.super Landroid/widget/LinearLayout;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private final g:Ljava/lang/String;

.field private h:Lcom/huawei/openalliance/ad/h/a/a;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/f;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Z)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    iput p3, p0, Lcom/huawei/openalliance/ad/views/f;->d:I

    iput p4, p0, Lcom/huawei/openalliance/ad/views/f;->e:I

    iput p5, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    if-eqz p6, :cond_0

    move-object v0, p6

    goto :goto_0

    :cond_0
    const-string v0, "tr"

    :goto_0
    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/views/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->c:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/huawei/openalliance/ad/views/f;->i:Z

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->d()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/f;)Lcom/huawei/openalliance/ad/h/a/a;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->h:Lcom/huawei/openalliance/ad/h/a/a;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/views/f;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_default_skip_text:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "utf-8"

    :try_start_0
    invoke-static {p1, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/views/f;->a:Ljava/lang/String;

    const-string v1, "decode skip text failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object v2
.end method

.method private b()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    new-instance v4, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->c:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, -0x32000001    # -5.3687088E8f

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x1

    const/high16 v1, 0x41300000    # 11.0f

    invoke-virtual {v4, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setSingleLine(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getBackgroundGd()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    const/high16 v1, 0x41b00000    # 22.0f

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setMinHeight(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    const/high16 v1, 0x42580000    # 54.0f

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setMinWidth(I)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/f;->setOrientation(I)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdLeftPaddingPx()I

    move-result v0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdTopPaddingPx()I

    move-result v1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdRightPaddingPx()I

    move-result v2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdBottomPaddingPx()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/views/f;->setPadding(IIII)V

    invoke-virtual {p0, v4, v5}, Lcom/huawei/openalliance/ad/views/f;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/f;->setClickable(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdLayoutParams()Landroid/widget/RelativeLayout$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/f;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private c()Z
    .locals 6

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v0, Lcom/huawei/openalliance/ad/views/f;->a:Ljava/lang/String;

    const-string v1, "current api level is: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v0, 0x10

    if-lt v5, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/f$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/f$1;-><init>(Lcom/huawei/openalliance/ad/views/f;)V

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/f;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method private getBackgroundGd()Landroid/graphics/drawable/GradientDrawable;
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v2

    const-string v0, "#33000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    int-to-float v0, v2

    invoke-virtual {v4, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const-string v0, "#80FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    return-object v4
.end method

.method private getHorizontalSideGapDpSize()I
    .locals 3

    const/16 v2, 0xc

    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->e:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_0

    const/16 v2, 0x10

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->d:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const/16 v2, 0x38

    :cond_1
    return v2
.end method

.method private getHorizontalSideMarginDp()I
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSideGapDpSize()I

    move-result v1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    if-ge v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    sub-int v0, v1, v0

    :goto_0
    return v0
.end method

.method private getHorizontalSidePaddingDp()I
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSideGapDpSize()I

    move-result v0

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method private getSkipAdBottomMarginPx()I
    .locals 6

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lr"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/f;->i:Z

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ag;->e(Landroid/content/Context;)I

    move-result v5

    :goto_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/f;->i:Z

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/views/f;->a:Ljava/lang/String;

    const-string v1, "navigation bar h: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSideMarginDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    add-int/2addr v0, v5

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private getSkipAdBottomPaddingPx()I
    .locals 2

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lr"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSidePaddingDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getSkipAdLayoutParams()Landroid/widget/RelativeLayout$LayoutParams;
    .locals 7

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lr"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_0
    const-string v0, "tl"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    goto :goto_1

    :cond_3
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    :goto_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdLeftMarginPx()I

    move-result v3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdTopMarginPx()I

    move-result v4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdRightMarginPx()I

    move-result v5

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getSkipAdBottomMarginPx()I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    return-object v2
.end method

.method private getSkipAdLeftMarginPx()I
    .locals 2

    const-string v0, "tl"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSideMarginDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private getSkipAdLeftPaddingPx()I
    .locals 2

    const-string v0, "tl"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSidePaddingDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getSkipAdRightMarginPx()I
    .locals 2

    const-string v0, "tl"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSideMarginDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getSkipAdRightPaddingPx()I
    .locals 2

    const-string v0, "tl"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getHorizontalSidePaddingDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getSkipAdTopMarginPx()I
    .locals 2

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lr"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSideMarginDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getSkipAdTopPaddingPx()I
    .locals 2

    const-string v0, "ll"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "lr"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/f;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/f;->b:Landroid/content/Context;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSidePaddingDp()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private getVerticalSideGapDpSize()I
    .locals 3

    const/16 v2, 0xc

    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->e:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_0

    const/16 v2, 0x10

    :cond_0
    return v2
.end method

.method private getVerticalSideMarginDp()I
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSideGapDpSize()I

    move-result v1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    if-ge v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    sub-int v0, v1, v0

    :goto_0
    return v0
.end method

.method private getVerticalSidePaddingDp()I
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/f;->getVerticalSideGapDpSize()I

    move-result v0

    iget v1, p0, Lcom/huawei/openalliance/ad/views/f;->f:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method


# virtual methods
.method public setAdMediator(Lcom/huawei/openalliance/ad/h/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/f;->h:Lcom/huawei/openalliance/ad/h/a/a;

    return-void
.end method
