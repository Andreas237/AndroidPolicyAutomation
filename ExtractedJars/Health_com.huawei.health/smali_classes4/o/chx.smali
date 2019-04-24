.class public Lo/chx;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/chx$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:I

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Lo/chx$b;

.field private g:F

.field private h:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/chx;->b:I

    .line 47
    invoke-direct {p0, p1}, Lo/chx;->a(Landroid/content/Context;)V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/chx;->b:I

    .line 53
    invoke-direct {p0, p1}, Lo/chx;->a(Landroid/content/Context;)V

    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/chx;->b:I

    .line 59
    invoke-direct {p0, p1}, Lo/chx;->a(Landroid/content/Context;)V

    .line 60
    return-void
.end method

.method static synthetic a(Lo/chx;)F
    .locals 1

    .line 21
    iget v0, p0, Lo/chx;->g:F

    return v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 8

    .line 64
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chx;->a:Landroid/widget/ImageView;

    .line 65
    iget-object v0, p0, Lo/chx;->a:Landroid/widget/ImageView;

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setMinimumWidth(I)V

    .line 66
    iget-object v0, p0, Lo/chx;->a:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lo/chx;->addView(Landroid/view/View;)V

    .line 69
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 71
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    .line 72
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/chx;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_sporti_slider_unlock:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/chx;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->hw_device_black_50_persent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 75
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41800000    # 16.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 78
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    .line 80
    invoke-direct {p0}, Lo/chx;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    const v0, 0x800015

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 82
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {p1, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_0

    .line 84
    :cond_0
    const v0, 0x800013

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 85
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {p1, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 88
    :goto_0
    iget-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_right_3:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 89
    iget-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lo/chx;->b:I

    .line 92
    new-instance v0, Lo/chx$2;

    invoke-direct {v0, p0}, Lo/chx$2;-><init>(Lo/chx;)V

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 126
    invoke-virtual {p0}, Lo/chx;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 127
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v7

    .line 129
    const/16 v0, 0x11

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 130
    iget-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 131
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 132
    const/16 v0, 0x258

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setMinimumHeight(I)V

    .line 133
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setMinimumWidth(I)V

    .line 134
    invoke-virtual {p0, v5}, Lo/chx;->addView(Landroid/view/View;)V

    .line 136
    return-void
.end method

.method static synthetic b(Lo/chx;F)F
    .locals 0

    .line 21
    iput p1, p0, Lo/chx;->h:F

    return p1
.end method

.method static synthetic b(Lo/chx;)I
    .locals 1

    .line 21
    iget v0, p0, Lo/chx;->b:I

    return v0
.end method

.method static synthetic c(Lo/chx;)Lo/chx$b;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/chx;->e:Lo/chx$b;

    return-object v0
.end method

.method static synthetic d(Lo/chx;F)F
    .locals 0

    .line 21
    iput p1, p0, Lo/chx;->g:F

    return p1
.end method

.method static synthetic d(Lo/chx;)Landroid/widget/ImageView;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/chx;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lo/chx;)F
    .locals 1

    .line 21
    iget v0, p0, Lo/chx;->h:F

    return v0
.end method

.method private e()Z
    .locals 4

    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-virtual {p0}, Lo/chx;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 141
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 142
    const-string v0, "iw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ar"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "fa"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ur"

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    :cond_0
    const/4 v1, 0x1

    .line 145
    :cond_1
    return v1
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 149
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lo/chx;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/chx;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->common_white_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 152
    :cond_0
    iget-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 153
    iget-object v0, p0, Lo/chx;->c:Landroid/widget/ImageView;

    const-string v1, "#B1B1B1"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 155
    :cond_1
    return-void
.end method

.method public setSliderListener(Lo/chx$b;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/chx;->e:Lo/chx$b;

    .line 42
    return-void
.end method
