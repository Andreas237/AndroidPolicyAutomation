.class Lcom/huawei/feedback/ui/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 296
    iput-object p1, p0, Lcom/huawei/feedback/ui/f;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 313
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .line 301
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 302
    iget-object v0, p0, Lcom/huawei/feedback/ui/f;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    .line 303
    if-eqz v1, :cond_0

    .line 304
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    .line 307
    :cond_0
    return-void
.end method
