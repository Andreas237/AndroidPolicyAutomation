.class public Lo/ell;
.super Landroid/widget/ExpandableListView;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

.field private final e:Lo/ell;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0, p1}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;)V

    .line 14
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/ell;->c:Ljava/lang/String;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ell;->b:Z

    .line 21
    iput-object p0, p0, Lo/ell;->e:Lo/ell;

    .line 25
    iput-object p1, p0, Lo/ell;->a:Landroid/content/Context;

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/ell;->c:Ljava/lang/String;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ell;->b:Z

    .line 21
    iput-object p0, p0, Lo/ell;->e:Lo/ell;

    .line 30
    iput-object p1, p0, Lo/ell;->a:Landroid/content/Context;

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 34
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/ell;->c:Ljava/lang/String;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ell;->b:Z

    .line 21
    iput-object p0, p0, Lo/ell;->e:Lo/ell;

    .line 35
    iput-object p1, p0, Lo/ell;->a:Landroid/content/Context;

    .line 36
    return-void
.end method

.method static synthetic d(Lo/ell;)Lo/ell;
    .locals 1

    .line 13
    iget-object v0, p0, Lo/ell;->e:Lo/ell;

    return-object v0
.end method


# virtual methods
.method public dispatchWindowFocusChanged(Z)V
    .locals 0

    .line 67
    invoke-super {p0, p1}, Landroid/widget/ExpandableListView;->dispatchWindowFocusChanged(Z)V

    .line 68
    invoke-virtual {p0, p1}, Lo/ell;->setScrollTopEnable(Z)V

    .line 69
    return-void
.end method

.method public e()V
    .locals 4

    .line 42
    iget-boolean v0, p0, Lo/ell;->b:Z

    if-eqz v0, :cond_0

    .line 43
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ell;->smoothScrollToPosition(I)V

    .line 44
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 45
    new-instance v0, Lo/ell$2;

    invoke-direct {v0, p0}, Lo/ell$2;-><init>(Lo/ell;)V

    const-wide/16 v1, 0x64

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 73
    invoke-super {p0}, Landroid/widget/ExpandableListView;->onAttachedToWindow()V

    .line 74
    iget-object v0, p0, Lo/ell;->c:Ljava/lang/String;

    const-string v1, "onAttachedToWindow"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    iget-object v0, p0, Lo/ell;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 78
    new-instance v0, Lo/ell$4;

    iget-object v1, p0, Lo/ell;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lo/ell$4;-><init>(Lo/ell;Landroid/content/Context;)V

    iput-object v0, p0, Lo/ell;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 87
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 91
    invoke-super {p0}, Landroid/widget/ExpandableListView;->onDetachedFromWindow()V

    .line 92
    iget-object v0, p0, Lo/ell;->c:Ljava/lang/String;

    const-string v1, "onDetachedFromWindow"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    iget-object v0, p0, Lo/ell;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    iget-object v0, p0, Lo/ell;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->c()V

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ell;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 97
    :cond_0
    return-void
.end method

.method public setScrollTopEnable(Z)V
    .locals 0

    .line 61
    iput-boolean p1, p0, Lo/ell;->b:Z

    .line 62
    return-void
.end method
