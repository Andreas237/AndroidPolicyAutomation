.class public Lo/cic;
.super Lo/dam;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private g:Landroid/graphics/drawable/GradientDrawable;

.field private h:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 29
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 30
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_watermark_2:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cic;->b:Landroid/view/View;

    .line 31
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cic;->a:Landroid/widget/TextView;

    .line 32
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cic;->e:Landroid/widget/TextView;

    .line 33
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cic;->d:Landroid/widget/TextView;

    .line 34
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cic;->c:Landroid/widget/ImageView;

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_data_watermark_layout_2:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/cic;->h:Landroid/graphics/Bitmap;

    .line 36
    invoke-static {p1}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Lo/cic;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 38
    const/16 v0, 0x10

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 39
    iget-object v0, p0, Lo/cic;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    :cond_0
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/cic;->g:Landroid/graphics/drawable/GradientDrawable;

    .line 42
    const v0, -0xffcce1

    const v1, -0x272728

    invoke-virtual {p0, v0, v1}, Lo/cic;->d(II)V

    .line 43
    return-void
.end method

.method private d(I)V
    .locals 7

    .line 70
    const v3, 0xffffff

    .line 71
    const/high16 v4, 0x7f000000

    .line 72
    and-int v5, v3, p1

    .line 73
    xor-int v6, v4, v5

    .line 74
    iget-object v0, p0, Lo/cic;->g:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 75
    return-void
.end method


# virtual methods
.method public c()Landroid/view/View;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/cic;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 47
    iget-object v0, p0, Lo/cic;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    iget-object v0, p0, Lo/cic;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    iget-object v0, p0, Lo/cic;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 50
    iget-object v0, p0, Lo/cic;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 51
    invoke-direct {p0, p2}, Lo/cic;->d(I)V

    .line 52
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lo/cic;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lo/cic;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/cic;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method
