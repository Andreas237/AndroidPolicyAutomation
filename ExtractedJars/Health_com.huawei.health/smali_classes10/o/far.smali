.class public Lo/far;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Ljava/lang/String;

.field private g:F

.field private h:Ljava/lang/String;

.field private i:I

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/far;->i:I

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 75
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/far;->i:I

    .line 76
    iput-object p1, p0, Lo/far;->l:Landroid/content/Context;

    .line 78
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->sleep_round_corner_progress_bar:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 79
    invoke-direct {p0, v3}, Lo/far;->b(Landroid/view/View;)V

    .line 80
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 1

    .line 84
    sget v0, Lcom/huawei/ui/main/R$id;->tv_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/far;->b:Landroid/widget/TextView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->standard_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/far;->e:Landroid/widget/ImageView;

    .line 88
    sget v0, Lcom/huawei/ui/main/R$id;->standard_progressTv1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/far;->d:Landroid/widget/TextView;

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->standard_progressTv2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/far;->a:Landroid/widget/TextView;

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->standard_progress_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/far;->c:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/ui/main/R$id;->layout_progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/far;->k:Landroid/widget/LinearLayout;

    .line 94
    return-void
.end method


# virtual methods
.method public setProgress(F)V
    .locals 1

    .line 185
    iput p1, p0, Lo/far;->g:F

    .line 186
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/far;->h:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public setStandardTextProgressValue(Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lo/far;->f:Ljava/lang/String;

    .line 195
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 102
    iput p1, p0, Lo/far;->i:I

    .line 103
    return-void
.end method
