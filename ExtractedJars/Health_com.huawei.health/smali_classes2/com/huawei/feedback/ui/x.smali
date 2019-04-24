.class Lcom/huawei/feedback/ui/x;
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

    .line 504
    iput-object p1, p0, Lcom/huawei/feedback/ui/x;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 508
    iget-object v0, p0, Lcom/huawei/feedback/ui/x;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 509
    return-void

    .line 511
    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/x;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/feedback/bean/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 513
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/x;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 516
    goto :goto_0

    .line 514
    :catch_0
    move-exception v4

    .line 515
    const-string v0, "FeedbackEditActivity"

    const-string v1, "Fail to DialView."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    :goto_0
    return-void
.end method
