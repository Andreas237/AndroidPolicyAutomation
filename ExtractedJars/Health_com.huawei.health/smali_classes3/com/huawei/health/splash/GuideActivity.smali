.class public Lcom/huawei/health/splash/GuideActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/splash/GuideActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Lo/abj;

.field private c:Lo/brn;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private e:Landroid/support/v4/view/ViewPager;

.field private f:Landroid/widget/Button;

.field private g:I

.field private h:Landroid/content/Context;

.field private i:I

.field private k:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/splash/GuideActivity;)I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    return v0
.end method

.method private a()V
    .locals 6

    .line 63
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 64
    const v0, 0x7f070276

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 65
    const v0, 0x7f070278

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 66
    const v0, 0x7f070279

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 67
    const v0, 0x7f1210ea

    invoke-virtual {p0, v0}, Lcom/huawei/health/splash/GuideActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->a:Landroid/widget/LinearLayout;

    .line 68
    const v0, 0x7f1210eb

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->f:Landroid/widget/Button;

    .line 69
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->f:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    .line 73
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    new-instance v0, Lo/abj;

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Lo/abj;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->b:Lo/abj;

    .line 77
    const v0, 0x7f1210e9

    invoke-virtual {p0, v0}, Lcom/huawei/health/splash/GuideActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->e:Landroid/support/v4/view/ViewPager;

    .line 78
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->e:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity;->b:Lo/abj;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 81
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/splash/GuideActivity;)I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/health/splash/GuideActivity;->i:I

    return v0
.end method

.method private d()V
    .locals 3

    .line 84
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    .line 85
    new-instance v0, Lo/brn;

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    invoke-direct {v0, p0, v1, v2}, Lo/brn;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->c:Lo/brn;

    .line 86
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->a:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/splash/GuideActivity;->c:Lo/brn;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 87
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->k:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 136
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->f:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 114
    const/16 v0, 0x67

    invoke-virtual {p0, v0}, Lcom/huawei/health/splash/GuideActivity;->setResult(I)V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/health/splash/GuideActivity;->finish()V

    .line 117
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 44
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 45
    iput-object p0, p0, Lcom/huawei/health/splash/GuideActivity;->h:Landroid/content/Context;

    .line 46
    invoke-virtual {p0}, Lcom/huawei/health/splash/GuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 48
    invoke-virtual {p0}, Lcom/huawei/health/splash/GuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 49
    invoke-virtual {p0}, Lcom/huawei/health/splash/GuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 51
    :cond_0
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/huawei/health/splash/GuideActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/splash/GuideActivity$d;-><init>(Lcom/huawei/health/splash/GuideActivity;Lcom/huawei/health/splash/GuideActivity$1;)V

    invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->k:Landroid/view/GestureDetector;

    .line 52
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->h:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/splash/GuideActivity;->i:I

    .line 53
    const v0, 0x7f070277

    invoke-virtual {p0, v0}, Lcom/huawei/health/splash/GuideActivity;->setContentView(I)V

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/splash/GuideActivity;->a()V

    .line 55
    invoke-direct {p0}, Lcom/huawei/health/splash/GuideActivity;->d()V

    .line 56
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 121
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 122
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 124
    const/16 v0, 0x66

    invoke-virtual {p0, v0}, Lcom/huawei/health/splash/GuideActivity;->setResult(I)V

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/splash/GuideActivity;->finish()V

    .line 126
    const/4 v0, 0x1

    return v0

    .line 128
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 92
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 98
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 103
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    iget v0, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    if-ne v0, p1, :cond_1

    .line 105
    :cond_0
    return-void

    .line 107
    :cond_1
    iput p1, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    .line 108
    iget-object v0, p0, Lcom/huawei/health/splash/GuideActivity;->c:Lo/brn;

    iget v1, p0, Lcom/huawei/health/splash/GuideActivity;->g:I

    invoke-virtual {v0, v1}, Lo/brn;->setmSelected(I)V

    .line 109
    return-void
.end method
