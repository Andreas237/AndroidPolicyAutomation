.class Lcom/huawei/feedback/ui/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 479
    iput-object p1, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 483
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 484
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 485
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 486
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_no_network_connection_prompt"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 485
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 484
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 487
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 488
    return-void

    .line 491
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 492
    :cond_1
    return-void

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->e(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 497
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 498
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->f(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    .line 499
    iget-object v0, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/webkit/WebView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/w;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 501
    return-void
.end method
