.class public Lo/bxo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field private a:Landroid/view/View;

.field private final b:Lo/efy;

.field private final c:Lo/efy;

.field private final d:Landroid/widget/ImageButton;

.field private e:Lo/bxt;

.field private f:F

.field private g:I

.field private i:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 32
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_run_item_show_week:I

    new-instance v1, Landroid/widget/ListView;

    invoke-direct {v1, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    .line 33
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ibtn_desc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lo/bxo;->d:Landroid/widget/ImageButton;

    .line 34
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_week_index:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxo;->c:Lo/efy;

    .line 35
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_txt_week_phrase:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxo;->b:Lo/efy;

    .line 36
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 37
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lo/bxo;->g:I

    .line 38
    return-void
.end method

.method private a()V
    .locals 3

    .line 71
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lo/bxo;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_notify:I

    .line 72
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_dialog_yes:I

    new-instance v2, Lo/bxo$2;

    invoke-direct {v2, p0}, Lo/bxo$2;-><init>(Lo/bxo;)V

    .line 73
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/bxo;->e:Lo/bxt;

    .line 79
    invoke-virtual {v1}, Lo/bxt;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WeekInfo;->getSentence()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lo/egv;->show()V

    .line 82
    return-void
.end method

.method private b(Lo/bxt;)Ljava/lang/String;
    .locals 2

    .line 93
    invoke-virtual {p1}, Lo/bxt;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->getWeekName()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-static {v1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/bxt;)Ljava/lang/String;
    .locals 8

    .line 85
    invoke-virtual {p1}, Lo/bxt;->d()Lcom/huawei/health/suggestion/model/WeekInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->acquireOrder()I

    move-result v4

    .line 86
    invoke-virtual {p1}, Lo/bxt;->b()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getWeekCount()I

    move-result v5

    .line 87
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 88
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 89
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_Week:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Lo/bxt;)V
    .locals 2

    .line 45
    iput-object p1, p0, Lo/bxo;->e:Lo/bxt;

    .line 46
    iget-object v0, p0, Lo/bxo;->c:Lo/efy;

    iget-object v1, p0, Lo/bxo;->e:Lo/bxt;

    invoke-direct {p0, v1}, Lo/bxo;->d(Lo/bxt;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v0, p0, Lo/bxo;->b:Lo/efy;

    iget-object v1, p0, Lo/bxo;->e:Lo/bxt;

    invoke-direct {p0, v1}, Lo/bxo;->b(Lo/bxt;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Lo/bxo;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 49
    return-void
.end method

.method public d()Landroid/view/View;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/bxo;->a:Landroid/view/View;

    return-object v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 57
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 58
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lo/bxo;->f:F

    .line 59
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lo/bxo;->i:F

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 61
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v1, p0, Lo/bxo;->f:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 62
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iget v1, p0, Lo/bxo;->i:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v3

    .line 63
    iget v0, p0, Lo/bxo;->g:I

    int-to-float v0, v0

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_1

    iget v0, p0, Lo/bxo;->g:I

    int-to-float v0, v0

    cmpg-float v0, v3, v0

    if-gtz v0, :cond_1

    .line 64
    invoke-direct {p0}, Lo/bxo;->a()V

    .line 67
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
