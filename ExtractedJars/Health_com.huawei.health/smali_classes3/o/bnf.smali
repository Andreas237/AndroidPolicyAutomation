.class public Lo/bnf;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private c:Landroid/widget/ImageView;

.field private e:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    invoke-direct {p0, p1}, Lo/bnf;->d(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method private c(Landroid/content/Context;)V
    .locals 2

    .line 51
    sget v0, Lcom/huawei/android/sns/R$anim;->sns_listview_footer_loading_anim:I

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    .line 52
    if-eqz v1, :cond_0

    .line 54
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 55
    iget-object v0, p0, Lo/bnf;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 57
    :cond_0
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 35
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 36
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_listview_footer_loading:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    .line 37
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/android/sns/R$id;->listview_footer_loading_img:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bnf;->c:Landroid/widget/ImageView;

    .line 39
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lo/bnf;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    invoke-direct {p0, p1}, Lo/bnf;->c(Landroid/content/Context;)V

    .line 42
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 75
    const/4 v0, -0x2

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 76
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    return-void
.end method

.method public c()V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    const/4 v0, 0x0

    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 66
    iget-object v0, p0, Lo/bnf;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    return-void
.end method
