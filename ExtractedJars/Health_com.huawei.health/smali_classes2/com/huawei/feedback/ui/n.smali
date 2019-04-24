.class Lcom/huawei/feedback/ui/n;
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

    .line 445
    iput-object p1, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 450
    const-string v4, "com.tencent.mobileqq"

    .line 451
    iget-object v0, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0, v4}, Lcom/huawei/feedback/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    .line 453
    if-eqz v5, :cond_1

    .line 454
    iget-object v0, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v0

    if-nez v0, :cond_0

    .line 455
    return-void

    .line 459
    :cond_0
    const-string v0, "FeedbackEditActivity"

    const-string v1, "isQqInstalled -----------"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mqqwpa://im/chat?chat_type=crm&uin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&version=1&src_type=web&web_src=http:://wpa.b.qq.com"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 461
    const/4 v7, 0x0

    .line 463
    :try_start_0
    invoke-static {v6}, Landroid/content/Intent;->getIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v7

    .line 464
    iget-object v0, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0, v7}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 467
    goto :goto_0

    .line 465
    :catch_0
    move-exception v8

    .line 466
    const-string v0, "FeedbackEditActivity"

    const-string v1, "qqEnterListener Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    :goto_0
    goto :goto_1

    .line 469
    :cond_1
    const-string v0, "FeedbackEditActivity"

    const-string v1, "unQqInstalled -----------"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 472
    invoke-virtual {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/n;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 473
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_qq_install"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 472
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 471
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 474
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 476
    :goto_1
    return-void
.end method
