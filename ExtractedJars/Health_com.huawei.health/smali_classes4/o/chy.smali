.class public Lo/chy;
.super Lo/dam;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/graphics/Bitmap;

.field private m:Landroid/graphics/drawable/GradientDrawable;

.field private p:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 30
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 31
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_watermark_3:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/chy;->b:Landroid/view/View;

    .line 32
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->c:Landroid/widget/TextView;

    .line 33
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->d:Landroid/widget/TextView;

    .line 34
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_step:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->a:Landroid/widget/TextView;

    .line 35
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->e:Landroid/widget/TextView;

    .line 36
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->f:Landroid/widget/TextView;

    .line 37
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_step_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->g:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chy;->k:Landroid/widget/ImageView;

    .line 39
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chy;->h:Landroid/widget/ImageView;

    .line 40
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/chy;->p:Landroid/widget/ImageView;

    .line 41
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chy;->i:Landroid/widget/TextView;

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_data_watermark_layout_3:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/chy;->l:Landroid/graphics/Bitmap;

    .line 43
    invoke-static {p1}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lo/chy;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 45
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 46
    const/16 v0, 0xf

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 47
    iget-object v0, p0, Lo/chy;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    :cond_0
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/chy;->m:Landroid/graphics/drawable/GradientDrawable;

    .line 50
    const v0, -0xffcce1

    const v1, -0x272728

    invoke-virtual {p0, v0, v1}, Lo/chy;->d(II)V

    .line 51
    return-void
.end method

.method private d(FLandroid/widget/ImageView;)V
    .locals 5

    .line 108
    invoke-virtual {p2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 109
    iget v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 110
    iget v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 111
    iget v0, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v0, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 112
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    return-void
.end method

.method private d(I)V
    .locals 7

    .line 87
    const v3, 0xffffff

    .line 88
    const/high16 v4, 0x7f000000

    .line 89
    and-int v5, v3, p1

    .line 90
    xor-int v6, v4, v5

    .line 91
    iget-object v0, p0, Lo/chy;->m:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 92
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 4

    .line 95
    iget-object v0, p0, Lo/chy;->p:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/chy;->d(FLandroid/widget/ImageView;)V

    .line 96
    iget-object v0, p0, Lo/chy;->h:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/chy;->d(FLandroid/widget/ImageView;)V

    .line 97
    iget-object v0, p0, Lo/chy;->k:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/chy;->d(FLandroid/widget/ImageView;)V

    .line 98
    const/high16 v0, 0x41900000    # 18.0f

    mul-float v2, v0, p1

    .line 99
    const/high16 v0, 0x41800000    # 16.0f

    mul-float v3, v0, p1

    .line 100
    iget-object v0, p0, Lo/chy;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 101
    iget-object v0, p0, Lo/chy;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 102
    iget-object v0, p0, Lo/chy;->i:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 103
    iget-object v0, p0, Lo/chy;->c:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 104
    iget-object v0, p0, Lo/chy;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 105
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 79
    iget-object v0, p0, Lo/chy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lo/chy;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object v0, p0, Lo/chy;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p0, Lo/chy;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lo/chy;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/chy;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 55
    iget-object v0, p0, Lo/chy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 56
    iget-object v0, p0, Lo/chy;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    iget-object v0, p0, Lo/chy;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    iget-object v0, p0, Lo/chy;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 59
    iget-object v0, p0, Lo/chy;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 60
    iget-object v0, p0, Lo/chy;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 61
    iget-object v0, p0, Lo/chy;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 62
    iget-object v0, p0, Lo/chy;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 63
    iget-object v0, p0, Lo/chy;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    iget-object v0, p0, Lo/chy;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    invoke-direct {p0, p2}, Lo/chy;->d(I)V

    .line 66
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/chy;->l:Landroid/graphics/Bitmap;

    return-object v0
.end method
