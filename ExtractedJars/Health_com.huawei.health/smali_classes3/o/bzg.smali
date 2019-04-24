.class public Lo/bzg;
.super Lo/dam;
.source "SourceFile"


# static fields
.field private static final d:I


# instance fields
.field private a:Lo/efy;

.field private b:Landroid/view/View;

.field private c:Lo/efy;

.field private e:Lo/efy;

.field private f:Lo/efy;

.field private g:Lo/efy;

.field private h:Lo/efy;

.field private i:Lo/efy;

.field private k:Lo/efy;

.field private l:Landroid/graphics/drawable/GradientDrawable;

.field private m:Lo/efy;

.field private p:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/bzg;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 29
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_share_watermark1:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    .line 30
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_workoutname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->e:Lo/efy;

    .line 31
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_cal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->c:Lo/efy;

    .line 32
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_levels:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->a:Lo/efy;

    .line 33
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->h:Lo/efy;

    .line 34
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_rate:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->f:Lo/efy;

    .line 35
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->k:Lo/efy;

    .line 36
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_time_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->i:Lo/efy;

    .line 37
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_levels_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->g:Lo/efy;

    .line 38
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_rate_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzg;->m:Lo/efy;

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->jianshen_shuju_1:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bzg;->p:Landroid/graphics/Bitmap;

    .line 41
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/bzg;->l:Landroid/graphics/drawable/GradientDrawable;

    .line 42
    sget v0, Lo/bzg;->d:I

    sget v1, Lo/bzg;->d:I

    invoke-virtual {p0, v0, v1}, Lo/bzg;->d(II)V

    .line 43
    return-void
.end method

.method private a(I)V
    .locals 7

    .line 78
    const v3, 0xffffff

    .line 79
    const/high16 v4, 0x7f000000

    .line 80
    and-int v5, v3, p1

    .line 81
    xor-int v6, v4, v5

    .line 82
    iget-object v0, p0, Lo/bzg;->l:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 83
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bzg;->e:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v0, p0, Lo/bzg;->h:Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Lo/bzg;->c:Lo/efy;

    invoke-virtual {v0, p3}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, p0, Lo/bzg;->a:Lo/efy;

    invoke-virtual {v0, p4}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object v0, p0, Lo/bzg;->f:Lo/efy;

    invoke-virtual {v0, p5}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 51
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 69
    iget-object v0, p0, Lo/bzg;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bzg;->e:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 56
    iget-object v0, p0, Lo/bzg;->c:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 57
    iget-object v0, p0, Lo/bzg;->a:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 58
    iget-object v0, p0, Lo/bzg;->f:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 59
    iget-object v0, p0, Lo/bzg;->h:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 60
    iget-object v0, p0, Lo/bzg;->k:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 61
    iget-object v0, p0, Lo/bzg;->i:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 62
    iget-object v0, p0, Lo/bzg;->g:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 63
    iget-object v0, p0, Lo/bzg;->m:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 64
    invoke-direct {p0, p2}, Lo/bzg;->a(I)V

    .line 65
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/bzg;->p:Landroid/graphics/Bitmap;

    return-object v0
.end method
