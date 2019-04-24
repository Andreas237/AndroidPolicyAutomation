.class public Lo/cia;
.super Lo/dam;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/view/View;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/graphics/Bitmap;

.field private o:Landroid/graphics/drawable/GradientDrawable;

.field private p:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 34
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_watermark_1:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cia;->b:Landroid/view/View;

    .line 35
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->c:Landroid/widget/TextView;

    .line 36
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_pace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->e:Landroid/widget/TextView;

    .line 37
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_pace_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->a:Landroid/widget/TextView;

    .line 39
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->d:Landroid/widget/TextView;

    .line 40
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_cal_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->k:Landroid/widget/TextView;

    .line 41
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_pace_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cia;->g:Landroid/widget/ImageView;

    .line 42
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cia;->f:Landroid/widget/ImageView;

    .line 43
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_time_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cia;->m:Landroid/widget/ImageView;

    .line 44
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cia;->h:Landroid/widget/TextView;

    .line 45
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_center:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/cia;->p:Landroid/widget/LinearLayout;

    .line 46
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_right:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/cia;->r:Landroid/widget/RelativeLayout;

    .line 47
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_left:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/cia;->l:Landroid/widget/LinearLayout;

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_data_watermark_layout_1:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/cia;->n:Landroid/graphics/Bitmap;

    .line 49
    invoke-static {p1}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/cia;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 51
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 52
    const/16 v0, 0xf

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 53
    iget-object v0, p0, Lo/cia;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    :cond_0
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/cia;->o:Landroid/graphics/drawable/GradientDrawable;

    .line 56
    const v0, -0xffcce1

    const v1, -0x272728

    invoke-virtual {p0, v0, v1}, Lo/cia;->d(II)V

    .line 57
    return-void
.end method

.method private b()V
    .locals 6

    .line 100
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x40600000    # 3.5f

    invoke-direct {v3, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 101
    iget-object v0, p0, Lo/cia;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x40600000    # 3.5f

    invoke-direct {v4, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 103
    iget-object v0, p0, Lo/cia;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 104
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, -0x2

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-direct {v5, v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 105
    iget-object v0, p0, Lo/cia;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    return-void
.end method

.method private b(FLandroid/widget/ImageView;)V
    .locals 5

    .line 130
    invoke-virtual {p2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 131
    iget v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 132
    iget v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 133
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

    .line 134
    invoke-virtual {p2, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    return-void
.end method

.method private e(I)V
    .locals 7

    .line 109
    const v3, 0xffffff

    .line 110
    const/high16 v4, 0x7f000000

    .line 111
    and-int v5, v3, p1

    .line 112
    xor-int v6, v4, v5

    .line 113
    iget-object v0, p0, Lo/cia;->o:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 114
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/cia;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    iget-object v0, p0, Lo/cia;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Lo/cia;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lo/cia;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lo/cia;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    if-eqz p7, :cond_0

    .line 91
    iget-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    invoke-direct {p0}, Lo/cia;->b()V

    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 97
    :goto_0
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 76
    iget-object v0, p0, Lo/cia;->b:Landroid/view/View;

    return-object v0
.end method

.method public c(F)V
    .locals 4

    .line 117
    iget-object v0, p0, Lo/cia;->m:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/cia;->b(FLandroid/widget/ImageView;)V

    .line 118
    iget-object v0, p0, Lo/cia;->f:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/cia;->b(FLandroid/widget/ImageView;)V

    .line 119
    iget-object v0, p0, Lo/cia;->g:Landroid/widget/ImageView;

    invoke-direct {p0, p1, v0}, Lo/cia;->b(FLandroid/widget/ImageView;)V

    .line 120
    const/high16 v0, 0x41900000    # 18.0f

    mul-float v2, v0, p1

    .line 121
    const/high16 v0, 0x41800000    # 16.0f

    mul-float v3, v0, p1

    .line 122
    iget-object v0, p0, Lo/cia;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 123
    iget-object v0, p0, Lo/cia;->a:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 124
    iget-object v0, p0, Lo/cia;->h:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 125
    iget-object v0, p0, Lo/cia;->e:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 126
    iget-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 127
    return-void
.end method

.method public final d(II)V
    .locals 1

    .line 61
    iget-object v0, p0, Lo/cia;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    iget-object v0, p0, Lo/cia;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    iget-object v0, p0, Lo/cia;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    iget-object v0, p0, Lo/cia;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    iget-object v0, p0, Lo/cia;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    iget-object v0, p0, Lo/cia;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 67
    iget-object v0, p0, Lo/cia;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 68
    iget-object v0, p0, Lo/cia;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 69
    iget-object v0, p0, Lo/cia;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    iget-object v0, p0, Lo/cia;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    invoke-direct {p0, p2}, Lo/cia;->e(I)V

    .line 72
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/cia;->n:Landroid/graphics/Bitmap;

    return-object v0
.end method
