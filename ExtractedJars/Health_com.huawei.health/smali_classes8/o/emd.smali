.class public Lo/emd;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field private a:Z

.field private final b:Lo/emd;

.field private c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 14
    const-string v0, "StatusbarListeningScrollView"

    iput-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emd;->a:Z

    .line 18
    iput-object p0, p0, Lo/emd;->b:Lo/emd;

    .line 26
    invoke-direct {p0, p1}, Lo/emd;->c(Landroid/content/Context;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    const-string v0, "StatusbarListeningScrollView"

    iput-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emd;->a:Z

    .line 18
    iput-object p0, p0, Lo/emd;->b:Lo/emd;

    .line 31
    invoke-direct {p0, p1}, Lo/emd;->c(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    const-string v0, "StatusbarListeningScrollView"

    iput-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    .line 15
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/emd;->a:Z

    .line 18
    iput-object p0, p0, Lo/emd;->b:Lo/emd;

    .line 36
    invoke-direct {p0, p1}, Lo/emd;->c(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method static synthetic a(Lo/emd;)Lo/emd;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/emd;->b:Lo/emd;

    return-object v0
.end method

.method private c(Landroid/content/Context;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/emd;->e:Landroid/content/Context;

    .line 59
    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 66
    iget-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter::scrollToTop, isScrollTopEnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/emd;->a:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-boolean v0, p0, Lo/emd;->a:Z

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {p0}, Lo/emd;->getScrollY()I

    move-result v4

    .line 69
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 70
    iget-object v0, p0, Lo/emd;->b:Lo/emd;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emd;->smoothScrollTo(II)V

    .line 73
    :cond_0
    return-void
.end method

.method public dispatchWindowFocusChanged(Z)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->dispatchWindowFocusChanged(Z)V

    .line 42
    invoke-virtual {p0, p1}, Lo/emd;->setScrollTopEnable(Z)V

    .line 43
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 78
    invoke-super {p0}, Landroid/widget/ScrollView;->onAttachedToWindow()V

    .line 79
    iget-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAttachedToWindow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/emd;->c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 83
    new-instance v0, Lo/emd$5;

    iget-object v1, p0, Lo/emd;->e:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lo/emd$5;-><init>(Lo/emd;Landroid/content/Context;)V

    iput-object v0, p0, Lo/emd;->c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 90
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 4

    .line 94
    invoke-super {p0}, Landroid/widget/ScrollView;->onDetachedFromWindow()V

    .line 95
    iget-object v0, p0, Lo/emd;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDetachedFromWindow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/emd;->c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/emd;->c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->c()V

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/emd;->c:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 100
    :cond_0
    return-void
.end method

.method public setScrollTopEnable(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lo/emd;->a:Z

    .line 51
    return-void
.end method
