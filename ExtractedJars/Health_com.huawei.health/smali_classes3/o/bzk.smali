.class public Lo/bzk;
.super Lo/dam;
.source "SourceFile"


# static fields
.field private static final a:I


# instance fields
.field private b:Lo/efy;

.field private c:Lo/efy;

.field private d:Landroid/view/View;

.field private e:Lo/efy;

.field private f:Landroid/graphics/drawable/GradientDrawable;

.field private g:Lo/efy;

.field private h:Landroid/graphics/Bitmap;

.field private i:Lo/efy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/bzk;->a:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 29
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_share_watermark2:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    .line 30
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_workoutname:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzk;->b:Lo/efy;

    .line 31
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_cal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzk;->e:Lo/efy;

    .line 32
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzk;->c:Lo/efy;

    .line 33
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzk;->g:Lo/efy;

    .line 34
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->fitness_share_watermark_time_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bzk;->i:Lo/efy;

    .line 36
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/bzk;->f:Landroid/graphics/drawable/GradientDrawable;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->jianshen_shuju_2:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/bzk;->h:Landroid/graphics/Bitmap;

    .line 39
    sget v0, Lo/bzk;->a:I

    sget v1, Lo/bzk;->a:I

    invoke-virtual {p0, v0, v1}, Lo/bzk;->d(II)V

    .line 40
    return-void
.end method

.method private b(I)V
    .locals 7

    .line 69
    const v3, 0xffffff

    .line 70
    const/high16 v4, 0x7f000000

    .line 71
    and-int v5, v3, p1

    .line 72
    xor-int v6, v4, v5

    .line 73
    iget-object v0, p0, Lo/bzk;->f:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 74
    return-void
.end method


# virtual methods
.method public c()Landroid/view/View;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/bzk;->d:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bzk;->b:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 51
    iget-object v0, p0, Lo/bzk;->e:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 52
    iget-object v0, p0, Lo/bzk;->c:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 53
    iget-object v0, p0, Lo/bzk;->g:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 54
    iget-object v0, p0, Lo/bzk;->i:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setTextColor(I)V

    .line 55
    invoke-direct {p0, p2}, Lo/bzk;->b(I)V

    .line 56
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lo/bzk;->b:Lo/efy;

    invoke-virtual {v0, p1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Lo/bzk;->c:Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 45
    iget-object v0, p0, Lo/bzk;->e:Lo/efy;

    invoke-virtual {v0, p3}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 46
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/bzk;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method
