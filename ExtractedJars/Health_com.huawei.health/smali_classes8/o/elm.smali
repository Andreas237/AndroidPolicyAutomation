.class public Lo/elm;
.super Landroid/widget/ListView;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

.field private final e:Lo/elm;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 16
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/elm;->c:Ljava/lang/String;

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elm;->b:Z

    .line 23
    iput-object p0, p0, Lo/elm;->e:Lo/elm;

    .line 27
    iput-object p1, p0, Lo/elm;->a:Landroid/content/Context;

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 16
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/elm;->c:Ljava/lang/String;

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elm;->b:Z

    .line 23
    iput-object p0, p0, Lo/elm;->e:Lo/elm;

    .line 32
    iput-object p1, p0, Lo/elm;->a:Landroid/content/Context;

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    const-string v0, "StatusbarListeningListView"

    iput-object v0, p0, Lo/elm;->c:Ljava/lang/String;

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elm;->b:Z

    .line 23
    iput-object p0, p0, Lo/elm;->e:Lo/elm;

    .line 37
    iput-object p1, p0, Lo/elm;->a:Landroid/content/Context;

    .line 38
    return-void
.end method

.method static synthetic a(Lo/elm;)Lo/elm;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/elm;->e:Lo/elm;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 44
    iget-boolean v0, p0, Lo/elm;->b:Z

    if-eqz v0, :cond_0

    .line 45
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elm;->smoothScrollToPosition(I)V

    .line 46
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 47
    new-instance v0, Lo/elm$1;

    invoke-direct {v0, p0}, Lo/elm$1;-><init>(Lo/elm;)V

    const-wide/16 v1, 0x64

    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 56
    :cond_0
    return-void
.end method

.method public dispatchWindowFocusChanged(Z)V
    .locals 0

    .line 69
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchWindowFocusChanged(Z)V

    .line 70
    invoke-virtual {p0, p1}, Lo/elm;->setScrollTopEnable(Z)V

    .line 71
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .line 75
    invoke-super {p0}, Landroid/widget/ListView;->onAttachedToWindow()V

    .line 76
    iget-object v0, p0, Lo/elm;->c:Ljava/lang/String;

    const-string v1, "onAttachedToWindow"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    iget-object v0, p0, Lo/elm;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lo/elm$2;

    iget-object v1, p0, Lo/elm;->a:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lo/elm$2;-><init>(Lo/elm;Landroid/content/Context;)V

    iput-object v0, p0, Lo/elm;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 89
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 93
    invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V

    .line 94
    iget-object v0, p0, Lo/elm;->c:Ljava/lang/String;

    const-string v1, "onDetachedFromWindow"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    iget-object v0, p0, Lo/elm;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 96
    iget-object v0, p0, Lo/elm;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;->c()V

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elm;->d:Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;

    .line 99
    :cond_0
    return-void
.end method

.method public setScrollTopEnable(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/elm;->b:Z

    .line 64
    return-void
.end method
