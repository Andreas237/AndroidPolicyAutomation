.class public Lo/bwt;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwt$a;,
        Lo/bwt$d;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Lo/bwl;

.field private b:Lo/efy;

.field private d:Lo/efy;

.field private e:F

.field private f:Lo/bwt$d;

.field private g:Lo/bwt$a;

.field private h:Lo/efy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/bwt;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/bwt;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 62
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 27
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwt;->e:F

    .line 34
    new-instance v0, Lo/bwt$d;

    invoke-direct {v0, p0}, Lo/bwt$d;-><init>(Lo/bwt;)V

    iput-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    .line 63
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 66
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwt;->e:F

    .line 34
    new-instance v0, Lo/bwt$d;

    invoke-direct {v0, p0}, Lo/bwt$d;-><init>(Lo/bwt;)V

    iput-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    .line 67
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 70
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lo/bwt;->e:F

    .line 34
    new-instance v0, Lo/bwt$d;

    invoke-direct {v0, p0}, Lo/bwt$d;-><init>(Lo/bwt;)V

    iput-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    .line 71
    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 24
    sget-object v0, Lo/bwt;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lo/bwt;)Lo/bwt$a;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/bwt;->g:Lo/bwt$a;

    return-object v0
.end method

.method static synthetic b(Lo/bwt;)F
    .locals 2

    .line 24
    iget v0, p0, Lo/bwt;->e:F

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v1, v0, v1

    iput v1, p0, Lo/bwt;->e:F

    return v0
.end method

.method static synthetic b(Lo/bwt;F)F
    .locals 0

    .line 24
    iput p1, p0, Lo/bwt;->e:F

    return p1
.end method

.method static synthetic c(Lo/bwt;)F
    .locals 1

    .line 24
    iget v0, p0, Lo/bwt;->e:F

    return v0
.end method

.method private c()V
    .locals 1

    .line 83
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_fg_:I

    invoke-virtual {p0, v0}, Lo/bwt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwt;->b:Lo/efy;

    .line 84
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_round_tp:I

    invoke-virtual {p0, v0}, Lo/bwt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwl;

    iput-object v0, p0, Lo/bwt;->a:Lo/bwl;

    .line 85
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_motionc:I

    invoke-virtual {p0, v0}, Lo/bwt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwt;->d:Lo/efy;

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_coach_motion_totle:I

    invoke-virtual {p0, v0}, Lo/bwt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwt;->h:Lo/efy;

    .line 87
    return-void
.end method

.method private e(F)V
    .locals 3

    .line 226
    iget-object v0, p0, Lo/bwt;->d:Lo/efy;

    const/high16 v1, 0x41900000    # 18.0f

    mul-float/2addr v1, p1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/efy;->setTextSize(IF)V

    .line 227
    iget-object v0, p0, Lo/bwt;->h:Lo/efy;

    const/high16 v1, 0x41500000    # 13.0f

    mul-float/2addr v1, p1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/efy;->setTextSize(IF)V

    .line 228
    return-void
.end method

.method private h()V
    .locals 2

    .line 97
    iget-object v0, p0, Lo/bwt;->b:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lo/bwt;->h:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 99
    return-void
.end method

.method private k()V
    .locals 2

    .line 90
    iget-object v0, p0, Lo/bwt;->b:Lo/efy;

    invoke-virtual {v0}, Lo/efy;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/bwt;->b:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 92
    iget-object v0, p0, Lo/bwt;->h:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 94
    :cond_0
    return-void
.end method


# virtual methods
.method public a(F)Lo/bwt;
    .locals 2

    .line 203
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    invoke-virtual {v0}, Lo/bwl;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 204
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bwl;->setVisibility(I)V

    .line 206
    :cond_0
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    invoke-virtual {v0, p1}, Lo/bwl;->b(F)Lo/bwl;

    .line 207
    return-object p0
.end method

.method public a(I)Lo/bwt;
    .locals 4

    .line 123
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwl;->setVisibility(I)V

    .line 124
    invoke-direct {p0}, Lo/bwt;->k()V

    .line 125
    int-to-float v0, p1

    iput v0, p0, Lo/bwt;->e:F

    .line 126
    iget-object v0, p0, Lo/bwt;->d:Lo/efy;

    int-to-double v1, p1

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/bwl;->c(F)Lo/bwl;

    .line 128
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/bwl;->b(F)Lo/bwl;

    .line 129
    iget-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/bwt$d;->sendEmptyMessageDelayed(IJ)Z

    .line 130
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lo/bwt;->e(F)V

    .line 131
    return-object p0
.end method

.method public b()Lo/bwt;
    .locals 2

    .line 173
    iget-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwt$d;->removeMessages(I)V

    .line 174
    return-object p0
.end method

.method public b(Lo/bwt$a;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lo/bwt;->g:Lo/bwt$a;

    .line 109
    return-void
.end method

.method public c(IZ)Lo/bwt;
    .locals 5

    .line 214
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lo/bwt;->e(F)V

    .line 215
    invoke-direct {p0}, Lo/bwt;->h()V

    .line 216
    invoke-virtual {p0}, Lo/bwt;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    iget-object v0, p0, Lo/bwt;->h:Lo/efy;

    const-string v1, "%s%d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz p2, :cond_0

    const-string v3, "\'\'"

    goto :goto_0

    :cond_0
    const-string v3, ""

    :goto_0
    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 219
    :cond_1
    iget-object v0, p0, Lo/bwt;->h:Lo/efy;

    const-string v1, "%d%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    if-eqz p2, :cond_2

    const-string v3, "\'\'"

    goto :goto_1

    :cond_2
    const-string v3, ""

    :goto_1
    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 222
    :goto_2
    return-object p0
.end method

.method public d()Lo/bwt;
    .locals 4

    .line 178
    iget-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    const/4 v1, 0x1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/bwt$d;->sendEmptyMessageDelayed(IJ)Z

    .line 179
    return-object p0
.end method

.method public d(IZ)Lo/bwt;
    .locals 5

    .line 186
    const/16 v0, 0x63

    if-le p1, v0, :cond_0

    .line 187
    const v0, 0x3f3d70a4    # 0.74f

    invoke-direct {p0, v0}, Lo/bwt;->e(F)V

    goto :goto_0

    .line 189
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lo/bwt;->e(F)V

    .line 191
    :goto_0
    invoke-virtual {p0}, Lo/bwt;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 192
    iget-object v0, p0, Lo/bwt;->d:Lo/efy;

    const-string v1, "%s%d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string v3, "\'\'"

    goto :goto_1

    :cond_1
    const-string v3, ""

    :goto_1
    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 194
    :cond_2
    iget-object v0, p0, Lo/bwt;->d:Lo/efy;

    const-string v1, "%d%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    if-eqz p2, :cond_3

    const-string v3, "\'\'"

    goto :goto_2

    :cond_3
    const-string v3, ""

    :goto_2
    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 196
    :goto_3
    return-object p0
.end method

.method public e()Lo/bwt;
    .locals 2

    .line 168
    iget-object v0, p0, Lo/bwt;->f:Lo/bwt$d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwt$d;->removeMessages(I)V

    .line 169
    return-object p0
.end method

.method public getCurrProgress()I
    .locals 1

    .line 112
    iget v0, p0, Lo/bwt;->e:F

    float-to-int v0, v0

    return v0
.end method

.method public getRoundProgressMax()F
    .locals 1

    .line 164
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    invoke-virtual {v0}, Lo/bwl;->getMax()F

    move-result v0

    return v0
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 75
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 76
    invoke-virtual {p0}, Lo/bwt;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 77
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lo/bwt;->setGravity(I)V

    .line 78
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_coach_time_progress:I

    invoke-virtual {v1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 79
    invoke-direct {p0}, Lo/bwt;->c()V

    .line 80
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    .line 103
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 105
    return-void
.end method

.method public setAutoProgress(I)V
    .locals 3

    .line 138
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lo/bwt;->e(F)V

    .line 139
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwl;->setVisibility(I)V

    .line 140
    int-to-float v0, p1

    iput v0, p0, Lo/bwt;->e:F

    .line 141
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/bwl;->b(F)Lo/bwl;

    .line 142
    iget-object v0, p0, Lo/bwt;->d:Lo/efy;

    int-to-double v1, p1

    invoke-static {v1, v2}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 143
    return-void
.end method

.method public setCountMax(I)V
    .locals 2

    .line 149
    invoke-direct {p0}, Lo/bwt;->k()V

    .line 150
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lo/bwl;->c(F)Lo/bwl;

    .line 151
    return-void
.end method

.method public setRoundProgressMax(F)V
    .locals 1

    .line 157
    iget-object v0, p0, Lo/bwt;->a:Lo/bwl;

    invoke-virtual {v0, p1}, Lo/bwl;->c(F)Lo/bwl;

    .line 158
    return-void
.end method
