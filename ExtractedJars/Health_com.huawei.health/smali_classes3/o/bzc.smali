.class public Lo/bzc;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bzc$e;,
        Lo/bzc$b;,
        Lo/bzc$c;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field private A:Lo/cah;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/cah<Lo/bzc;>;"
        }
    .end annotation
.end field

.field private B:Landroid/content/Context;

.field private C:Lo/bzc$c;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:Ljava/lang/Runnable;

.field g:I

.field h:Landroid/graphics/Paint;

.field i:I

.field private j:Lo/bzc$b;

.field k:I

.field private l:I

.field private m:I

.field private n:I

.field o:I

.field private p:I

.field private q:Z

.field private r:I

.field private s:Landroid/text/TextPaint;

.field private t:I

.field private u:I

.field private v:Landroid/text/TextPaint;

.field private w:I

.field private x:I

.field private y:Lo/efy;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const-class v0, Lo/bzc;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bzc;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 34
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->p:I

    .line 35
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->m:I

    .line 36
    const-string v0, "#33000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->n:I

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bzc;->q:Z

    .line 79
    const/4 v0, 0x2

    iput v0, p0, Lo/bzc;->b:I

    .line 91
    const/4 v0, 0x1

    iput v0, p0, Lo/bzc;->e:I

    .line 241
    const/16 v0, 0x32

    iput v0, p0, Lo/bzc;->k:I

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lo/bzc;->i:I

    .line 65
    invoke-direct {p0, p1}, Lo/bzc;->d(Landroid/content/Context;)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 69
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->p:I

    .line 35
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->m:I

    .line 36
    const-string v0, "#33000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->n:I

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bzc;->q:Z

    .line 79
    const/4 v0, 0x2

    iput v0, p0, Lo/bzc;->b:I

    .line 91
    const/4 v0, 0x1

    iput v0, p0, Lo/bzc;->e:I

    .line 241
    const/16 v0, 0x32

    iput v0, p0, Lo/bzc;->k:I

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lo/bzc;->i:I

    .line 70
    invoke-direct {p0, p1}, Lo/bzc;->d(Landroid/content/Context;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 74
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->p:I

    .line 35
    const-string v0, "#80000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->m:I

    .line 36
    const-string v0, "#33000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bzc;->n:I

    .line 42
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bzc;->q:Z

    .line 79
    const/4 v0, 0x2

    iput v0, p0, Lo/bzc;->b:I

    .line 91
    const/4 v0, 0x1

    iput v0, p0, Lo/bzc;->e:I

    .line 241
    const/16 v0, 0x32

    iput v0, p0, Lo/bzc;->k:I

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lo/bzc;->i:I

    .line 75
    invoke-direct {p0, p1}, Lo/bzc;->d(Landroid/content/Context;)V

    .line 76
    return-void
.end method

.method private a(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 3

    .line 441
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 442
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 443
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/bzc;)Lo/cah;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/bzc;->A:Lo/cah;

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 7

    .line 140
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 142
    if-eqz v4, :cond_0

    .line 143
    const/4 v0, 0x1

    new-array v0, v0, [I

    sget v1, Lcom/huawei/health/suggestion/R$attr;->sugCustomThemeColor:I

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {v4, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 144
    if-eqz v5, :cond_0

    .line 145
    const/4 v0, 0x0

    const/high16 v1, -0x1000000

    invoke-virtual {v5, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lo/bzc;->p:I

    .line 146
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 150
    :cond_0
    new-instance v0, Lo/bzc$e;

    invoke-direct {v0, p0}, Lo/bzc$e;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bzc;->A:Lo/cah;

    .line 152
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_wheel_view_select_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bzc;->l:I

    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_wheel_view_unselect_text_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bzc;->t:I

    .line 154
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_wheel_view_interval:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bzc;->u:I

    .line 155
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_wheel_view_select_h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bzc;->r:I

    .line 157
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/bzc;->s:Landroid/text/TextPaint;

    .line 158
    iget-object v0, p0, Lo/bzc;->s:Landroid/text/TextPaint;

    iget v1, p0, Lo/bzc;->t:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 159
    iget-object v0, p0, Lo/bzc;->s:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 160
    iget-object v0, p0, Lo/bzc;->s:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 162
    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    .line 163
    iget-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    iget v1, p0, Lo/bzc;->l:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 164
    iget-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    iget v1, p0, Lo/bzc;->p:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 165
    iget-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 166
    iget-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    .line 167
    iget-object v0, p0, Lo/bzc;->v:Landroid/text/TextPaint;

    const-string v1, "HwChinese-medium"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 169
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 170
    iget-object v0, p0, Lo/bzc;->s:Landroid/text/TextPaint;

    const-string v1, "1234567890"

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 172
    iget v0, p0, Lo/bzc;->u:I

    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/bzc;->i:I

    .line 173
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lo/bzc;->z:I

    .line 174
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v0

    iput v0, p0, Lo/bzc;->w:I

    .line 176
    iget v0, p0, Lo/bzc;->b:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bzc;->d:I

    .line 178
    new-instance v6, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lo/bzc;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 179
    new-instance v0, Lo/efy;

    invoke-virtual {p0}, Lo/bzc;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/efy;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bzc;->y:Lo/efy;

    .line 181
    iget-object v0, p0, Lo/bzc;->y:Lo/efy;

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 182
    iget v0, p0, Lo/bzc;->i:I

    iget v1, p0, Lo/bzc;->d:I

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v0, v1

    iget v1, p0, Lo/bzc;->r:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/bzc;->x:I

    .line 183
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p0, Lo/bzc;->x:I

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    invoke-virtual {p0, v6}, Lo/bzc;->addView(Landroid/view/View;)V

    .line 185
    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 3

    .line 455
    invoke-direct {p0}, Lo/bzc;->getSize()I

    move-result v2

    .line 456
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    if-eqz v0, :cond_0

    if-ge v2, p1, :cond_1

    .line 457
    :cond_0
    const-string v0, ""

    return-object v0

    .line 460
    :cond_1
    iget v0, p0, Lo/bzc;->b:I

    if-lt p1, v0, :cond_2

    invoke-direct {p0}, Lo/bzc;->getSize()I

    move-result v0

    iget v1, p0, Lo/bzc;->b:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_3

    .line 461
    :cond_2
    const-string v0, ""

    return-object v0

    .line 464
    :cond_3
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    iget v1, p0, Lo/bzc;->b:I

    sub-int v1, p1, v1

    invoke-interface {v0, v1}, Lo/bzc$b;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 251
    iget-object v0, p0, Lo/bzc;->y:Lo/efy;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lo/bzc;->i:I

    invoke-direct {p0}, Lo/bzc;->getSize()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    mul-int/2addr v2, v3

    iget v3, p0, Lo/bzc;->r:I

    add-int/2addr v2, v3

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lo/efy;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 252
    return-void
.end method

.method private d(F)I
    .locals 3

    .line 416
    iget-object v0, p0, Lo/bzc;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 417
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private d(Landroid/graphics/Paint;Ljava/lang/String;)I
    .locals 3

    .line 448
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 449
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 450
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method private d()V
    .locals 3

    .line 350
    iget-object v0, p0, Lo/bzc;->C:Lo/bzc$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 351
    iget-object v0, p0, Lo/bzc;->C:Lo/bzc$c;

    invoke-virtual {p0}, Lo/bzc;->getSeletedIndex()I

    move-result v1

    iget v2, p0, Lo/bzc;->e:I

    invoke-direct {p0, v2}, Lo/bzc;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bzc$c;->d(ILjava/lang/String;)V

    .line 353
    :cond_0
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 4

    .line 96
    iput-object p1, p0, Lo/bzc;->B:Landroid/content/Context;

    .line 97
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/bzc;->setOverScrollMode(I)V

    .line 99
    sget-object v0, Lo/bzc;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parent: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/bzc;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bzc;->setVerticalScrollBarEnabled(Z)V

    .line 102
    new-instance v0, Lo/bzc$2;

    invoke-direct {v0, p0}, Lo/bzc$2;-><init>(Lo/bzc;)V

    iput-object v0, p0, Lo/bzc;->f:Ljava/lang/Runnable;

    .line 134
    invoke-direct {p0, p1}, Lo/bzc;->b(Landroid/content/Context;)V

    .line 135
    return-void
.end method

.method private getSize()I
    .locals 3

    .line 468
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    if-nez v0, :cond_0

    .line 469
    const/4 v0, 0x0

    return v0

    .line 471
    :cond_0
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    invoke-interface {v0}, Lo/bzc$b;->d()I

    move-result v0

    iget v1, p0, Lo/bzc;->b:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 245
    invoke-virtual {p0}, Lo/bzc;->getScrollY()I

    move-result v0

    iput v0, p0, Lo/bzc;->g:I

    .line 246
    iget-object v0, p0, Lo/bzc;->A:Lo/cah;

    iget-object v1, p0, Lo/bzc;->f:Ljava/lang/Runnable;

    iget v2, p0, Lo/bzc;->k:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lo/cah;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 247
    return-void
.end method

.method public fling(I)V
    .locals 1

    .line 386
    div-int/lit8 v0, p1, 0x3

    invoke-super {p0, v0}, Landroid/widget/ScrollView;->fling(I)V

    .line 387
    return-void
.end method

.method public getOffset()I
    .locals 1

    .line 82
    iget v0, p0, Lo/bzc;->b:I

    return v0
.end method

.method public getOnWheelViewListener()Lo/bzc$c;
    .locals 1

    .line 408
    iget-object v0, p0, Lo/bzc;->C:Lo/bzc$c;

    return-object v0
.end method

.method public getSelectItemHeight()I
    .locals 1

    .line 503
    iget v0, p0, Lo/bzc;->r:I

    return v0
.end method

.method public getSelectedTextHeight()I
    .locals 4

    .line 490
    invoke-direct {p0}, Lo/bzc;->getSize()I

    move-result v0

    iget v1, p0, Lo/bzc;->b:I

    mul-int/lit8 v1, v1, 0x2

    if-gt v0, v1, :cond_0

    .line 491
    const/4 v0, 0x0

    return v0

    .line 494
    :cond_0
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 495
    iget v0, p0, Lo/bzc;->l:I

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 496
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 497
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 499
    invoke-virtual {p0}, Lo/bzc;->getSeletedItem()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lo/bzc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getSelectedTextWidth()I
    .locals 4

    .line 476
    invoke-direct {p0}, Lo/bzc;->getSize()I

    move-result v0

    iget v1, p0, Lo/bzc;->b:I

    mul-int/lit8 v1, v1, 0x2

    if-gt v0, v1, :cond_0

    .line 477
    const/4 v0, 0x0

    return v0

    .line 480
    :cond_0
    new-instance v3, Landroid/text/TextPaint;

    invoke-direct {v3}, Landroid/text/TextPaint;-><init>()V

    .line 481
    iget v0, p0, Lo/bzc;->l:I

    int-to-float v0, v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 482
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 483
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 485
    invoke-virtual {p0}, Lo/bzc;->getSeletedItem()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lo/bzc;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getSeletedIndex()I
    .locals 2

    .line 380
    iget v0, p0, Lo/bzc;->e:I

    iget v1, p0, Lo/bzc;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getSeletedItem()Ljava/lang/String;
    .locals 1

    .line 376
    iget v0, p0, Lo/bzc;->e:I

    invoke-direct {p0, v0}, Lo/bzc;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWvHeight()I
    .locals 1

    .line 507
    iget v0, p0, Lo/bzc;->x:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 194
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Landroid/widget/ScrollView;->onDraw(Landroid/graphics/Canvas;)V

    .line 196
    invoke-virtual/range {p0 .. p0}, Lo/bzc;->getScrollY()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->i:I

    int-to-float v1, v1

    div-float v5, v0, v1

    .line 197
    float-to-int v6, v5

    .line 198
    invoke-virtual/range {p0 .. p0}, Lo/bzc;->getScrollY()I

    move-result v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->d:I

    move-object/from16 v2, p0

    iget v2, v2, Lo/bzc;->i:I

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->i:I

    div-int/2addr v0, v1

    add-int/lit8 v7, v0, 0x1

    .line 199
    move v8, v6

    :goto_0
    if-eq v8, v7, :cond_6

    .line 200
    int-to-float v0, v8

    sub-float/2addr v0, v5

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->b:I

    int-to-float v1, v1

    sub-float v9, v0, v1

    .line 202
    new-instance v10, Landroid/animation/ArgbEvaluator;

    invoke-direct {v10}, Landroid/animation/ArgbEvaluator;-><init>()V

    .line 204
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v12, v0

    .line 205
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v12, v0

    if-gez v0, :cond_0

    .line 206
    move-object/from16 v0, p0

    iget v0, v0, Lo/bzc;->p:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v10, v12, v0, v1}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_1

    .line 208
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/bzc;->b:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 209
    move-object/from16 v0, p0

    iget v11, v0, Lo/bzc;->n:I

    goto :goto_1

    .line 211
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v0, v12, v0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->b:I

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p0

    iget v2, v2, Lo/bzc;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v10, v0, v1, v2}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 214
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bzc;->s:Landroid/text/TextPaint;

    invoke-virtual {v0, v11}, Landroid/text/TextPaint;->setColor(I)V

    .line 215
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bzc;->s:Landroid/text/TextPaint;

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->l:I

    int-to-float v1, v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpg-float v2, v12, v2

    if-gez v2, :cond_2

    move v2, v12

    goto :goto_2

    :cond_2
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_2
    move-object/from16 v3, p0

    iget v3, v3, Lo/bzc;->l:I

    move-object/from16 v4, p0

    iget v4, v4, Lo/bzc;->t:I

    sub-int/2addr v3, v4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    sub-float/2addr v1, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 218
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v12, v0

    if-gez v0, :cond_3

    .line 219
    move-object/from16 v0, p0

    iget-object v13, v0, Lo/bzc;->v:Landroid/text/TextPaint;

    goto :goto_3

    .line 221
    :cond_3
    move-object/from16 v0, p0

    iget-object v13, v0, Lo/bzc;->s:Landroid/text/TextPaint;

    .line 224
    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    add-float v14, v9, v0

    .line 225
    const/4 v0, 0x0

    cmpg-float v0, v14, v0

    if-gez v0, :cond_4

    .line 226
    const/4 v14, 0x0

    goto :goto_4

    .line 227
    :cond_4
    const/high16 v0, 0x40000000    # 2.0f

    cmpl-float v0, v14, v0

    if-lez v0, :cond_5

    .line 228
    const/high16 v14, 0x40000000    # 2.0f

    .line 230
    :cond_5
    :goto_4
    move-object/from16 v0, p0

    iget v0, v0, Lo/bzc;->r:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->w:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, v14

    const/high16 v1, 0x40000000    # 2.0f

    div-float v15, v0, v1

    .line 232
    move-object/from16 v0, p0

    iget v0, v0, Lo/bzc;->i:I

    mul-int/2addr v0, v8

    int-to-float v0, v0

    add-float/2addr v0, v15

    move-object/from16 v1, p0

    iget v1, v1, Lo/bzc;->w:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    move-object/from16 v1, p0

    invoke-direct {v1, v8}, Lo/bzc;->c(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v13, v1}, Lo/bzc;->d(Landroid/graphics/Paint;Ljava/lang/String;)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    add-float v16, v0, v1

    .line 233
    invoke-virtual/range {p0 .. p0}, Lo/bzc;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v17, v0, v1

    .line 234
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/bzc;->c(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move/from16 v3, v16

    invoke-virtual {v1, v0, v2, v3, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 199
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 236
    :cond_6
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .line 342
    invoke-super/range {p0 .. p5}, Landroid/widget/ScrollView;->onLayout(ZIIII)V

    .line 343
    iget v0, p0, Lo/bzc;->c:I

    invoke-virtual {p0, v0}, Lo/bzc;->setSeletion(I)V

    .line 344
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 189
    iget v0, p0, Lo/bzc;->x:I

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, p1, v0}, Landroid/widget/ScrollView;->onMeasure(II)V

    .line 190
    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 5

    .line 259
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onScrollChanged(IIII)V

    .line 261
    iget v0, p0, Lo/bzc;->i:I

    rem-int v2, p2, v0

    .line 262
    iget v0, p0, Lo/bzc;->i:I

    div-int v3, p2, v0

    .line 265
    iget v0, p0, Lo/bzc;->i:I

    div-int/lit8 v0, v0, 0x2

    if-le v2, v0, :cond_0

    .line 266
    iget v0, p0, Lo/bzc;->b:I

    add-int/2addr v0, v3

    add-int/lit8 v4, v0, 0x1

    goto :goto_0

    .line 268
    :cond_0
    iget v0, p0, Lo/bzc;->b:I

    add-int v4, v3, v0

    .line 271
    :goto_0
    iget v0, p0, Lo/bzc;->e:I

    if-eq v0, v4, :cond_1

    .line 272
    iput v4, p0, Lo/bzc;->e:I

    .line 273
    invoke-direct {p0}, Lo/bzc;->d()V

    .line 276
    :cond_1
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 277
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 1

    .line 335
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onSizeChanged(IIII)V

    .line 336
    iput p1, p0, Lo/bzc;->o:I

    .line 337
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bzc;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 338
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 392
    const/4 v0, 0x0

    iput v0, p0, Lo/bzc;->c:I

    .line 394
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 395
    invoke-virtual {p0}, Lo/bzc;->a()V

    .line 398
    :cond_0
    iget-object v0, p0, Lo/bzc;->C:Lo/bzc$c;

    if-eqz v0, :cond_1

    .line 399
    iget-object v0, p0, Lo/bzc;->C:Lo/bzc$c;

    invoke-virtual {v0}, Lo/bzc$c;->e()V

    .line 402
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 285
    iget v0, p0, Lo/bzc;->o:I

    if-nez v0, :cond_0

    .line 286
    iget-object v0, p0, Lo/bzc;->B:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    iput v0, p0, Lo/bzc;->o:I

    .line 287
    sget-object v0, Lo/bzc;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "viewWidth: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/bzc;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    :cond_0
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 291
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    .line 293
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 294
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 295
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, v1}, Lo/bzc;->d(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 298
    :cond_1
    iget-boolean v0, p0, Lo/bzc;->q:Z

    if-eqz v0, :cond_2

    .line 299
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    iget v1, p0, Lo/bzc;->p:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 301
    :cond_2
    iget-object v0, p0, Lo/bzc;->h:Landroid/graphics/Paint;

    iget v1, p0, Lo/bzc;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 304
    :goto_0
    new-instance p1, Lo/bzc$5;

    invoke-direct {p1, p0}, Lo/bzc$5;-><init>(Lo/bzc;)V

    .line 329
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 331
    return-void
.end method

.method public setColorSelected(I)V
    .locals 0

    .line 511
    iput p1, p0, Lo/bzc;->p:I

    .line 512
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 513
    return-void
.end method

.method public setColorUnselected(I)V
    .locals 0

    .line 516
    iput p1, p0, Lo/bzc;->m:I

    .line 517
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 518
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 429
    iput-boolean p1, p0, Lo/bzc;->q:Z

    .line 431
    iget v0, p0, Lo/bzc;->i:I

    if-eqz v0, :cond_0

    .line 433
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 436
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bzc;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 437
    return-void
.end method

.method public setOffset(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/bzc;->b:I

    .line 87
    return-void
.end method

.method public setOnWheelViewListener(Lo/bzc$c;)V
    .locals 0

    .line 412
    iput-object p1, p0, Lo/bzc;->C:Lo/bzc$c;

    .line 413
    return-void
.end method

.method public setSeletion(I)V
    .locals 3

    .line 356
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    if-nez v0, :cond_0

    .line 357
    return-void

    .line 359
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 360
    iget-object v0, p0, Lo/bzc;->j:Lo/bzc$b;

    invoke-interface {v0}, Lo/bzc$b;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 361
    move v2, p1

    .line 363
    iget v0, p0, Lo/bzc;->b:I

    add-int/2addr v0, v2

    iput v0, p0, Lo/bzc;->e:I

    .line 364
    iput v2, p0, Lo/bzc;->c:I

    .line 369
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 370
    iget v0, p0, Lo/bzc;->i:I

    mul-int/2addr v0, v2

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lo/bzc;->scrollTo(II)V

    .line 373
    return-void
.end method

.method public setWheelViewAdapter(Lo/bzc$b;)V
    .locals 0

    .line 523
    iput-object p1, p0, Lo/bzc;->j:Lo/bzc$b;

    .line 524
    invoke-direct {p0}, Lo/bzc;->c()V

    .line 525
    invoke-virtual {p0}, Lo/bzc;->invalidate()V

    .line 526
    return-void
.end method
