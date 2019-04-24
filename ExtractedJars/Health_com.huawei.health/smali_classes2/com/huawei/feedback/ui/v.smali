.class Lcom/huawei/feedback/ui/v;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


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

    .line 2709
    iput-object p1, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 2

    .line 2712
    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2713
    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 2714
    const/16 v0, 0x64

    if-ne v0, p2, :cond_0

    .line 2715
    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 2717
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 2720
    :cond_1
    :goto_0
    return-void
.end method

.method public onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 2724
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ActionBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2725
    iget-object v0, p0, Lcom/huawei/feedback/ui/v;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 2727
    :cond_0
    return-void
.end method
