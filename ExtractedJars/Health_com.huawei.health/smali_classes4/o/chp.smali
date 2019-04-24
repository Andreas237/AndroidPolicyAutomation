.class public Lo/chp;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private g:Landroid/view/View;

.field private i:Landroid/content/Context;

.field private k:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    .line 76
    invoke-direct {p0, p1}, Lo/chp;->a(Landroid/content/Context;)V

    .line 78
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 81
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    .line 82
    invoke-direct {p0, p1}, Lo/chp;->a(Landroid/content/Context;)V

    .line 83
    return-void
.end method

.method static synthetic a(Lo/chp;)Landroid/content/Context;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chp;->i:Landroid/content/Context;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 34
    iput-object p1, p0, Lo/chp;->i:Landroid/content/Context;

    .line 35
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_detail_title_custom_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 36
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_chief_data:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    .line 37
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_chief_unit:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    .line 38
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_sport_type:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    .line 39
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_start_time:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    .line 40
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_detail_title_usrname:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    .line 41
    invoke-static {p1}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 43
    const/16 v0, 0x11

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 44
    iget-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_title_sport:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/chp;->k:Landroid/view/View;

    .line 47
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_title_right:I

    invoke-virtual {p0, v0}, Lo/chp;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/chp;->g:Landroid/view/View;

    .line 49
    iget-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lo/chp$3;

    invoke-direct {v1, p0}, Lo/chp$3;-><init>(Lo/chp;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 72
    return-void
.end method

.method static synthetic b(Lo/chp;)Landroid/view/View;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chp;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lo/chp;)Landroid/view/View;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chp;->k:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lo/chp;)Landroid/widget/TextView;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lo/chp;)Landroid/widget/TextView;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public setSportStartTime(Ljava/lang/String;)V
    .locals 1

    .line 91
    iget-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    return-void
.end method

.method public setTextChiefData(Ljava/lang/String;)V
    .locals 1

    .line 95
    iget-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    return-void
.end method

.method public setTextChiefUnit(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    return-void
.end method

.method public setTextColor(I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 108
    iget-object v0, p0, Lo/chp;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    iget-object v0, p0, Lo/chp;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    iget-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 111
    iget-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 112
    iget-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    iget-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 115
    iget-object v0, p0, Lo/chp;->e:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 116
    iget-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 117
    return-void
.end method

.method public setTextSportType(Ljava/lang/String;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lo/chp;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lo/chp;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    return-void
.end method
