.class Lcom/tencent/connect/avatar/ImageActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/avatar/ImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/avatar/ImageActivity;


# direct methods
.method constructor <init>(Lcom/tencent/connect/avatar/ImageActivity;)V
    .locals 0

    .line 639
    iput-object p1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    .line 703
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 12

    .line 658
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 659
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 660
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 661
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 662
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 663
    move-object v7, p1

    check-cast v7, Lorg/json/JSONObject;

    .line 664
    const/4 v8, -0x1

    .line 666
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 669
    goto :goto_0

    .line 667
    :catch_0
    move-exception v9

    .line 668
    invoke-virtual {v9}, Lorg/json/JSONException;->printStackTrace()V

    .line 670
    :goto_0
    if-nez v8, :cond_1

    .line 671
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "\u8bbe\u7f6e\u6210\u529f"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V

    .line 672
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "10658"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V

    .line 675
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v1}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v2}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SETAVATAR.SUCCEED"

    const-string v4, "12"

    const-string v5, "3"

    const-string v6, "0"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    iget-object v9, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    .line 680
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->l(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v1}, Lcom/tencent/connect/avatar/ImageActivity;->l(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 682
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 683
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->l(Lcom/tencent/connect/avatar/ImageActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v9, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 684
    invoke-virtual {v9}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v10, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v11

    .line 686
    if-eqz v11, :cond_0

    .line 687
    invoke-virtual {v9, v10}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 691
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->j(Lcom/tencent/connect/avatar/ImageActivity;)V

    .line 693
    goto :goto_1

    .line 694
    :cond_1
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "\u8bbe\u7f6e\u51fa\u9519\u4e86\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55\u518d\u5c1d\u8bd5\u4e0b\u5462\uff1a\uff09"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V

    .line 695
    invoke-static {}, Lcom/tencent/open/b/d;->a()Lcom/tencent/open/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v1}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getOpenId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v2}, Lcom/tencent/connect/avatar/ImageActivity;->k(Lcom/tencent/connect/avatar/ImageActivity;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v2

    invoke-virtual {v2}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ANDROIDSDK.SETAVATAR.SUCCEED"

    const-string v4, "12"

    const-string v5, "19"

    const-string v6, "1"

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/open/b/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    :goto_1
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 4

    .line 642
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 643
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->e(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 644
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 645
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 646
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->f(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/Button;

    move-result-object v0

    const-string v1, "\u91cd\u8bd5"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 647
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    invoke-static {v0}, Lcom/tencent/connect/avatar/ImageActivity;->d(Lcom/tencent/connect/avatar/ImageActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 648
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/tencent/connect/avatar/ImageActivity;->a(Lcom/tencent/connect/avatar/ImageActivity;Z)Z

    .line 652
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    iget-object v1, p1, Lcom/tencent/tauth/UiError;->errorMessage:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/tencent/connect/avatar/ImageActivity;->b(Lcom/tencent/connect/avatar/ImageActivity;Ljava/lang/String;I)V

    .line 653
    iget-object v0, p0, Lcom/tencent/connect/avatar/ImageActivity$5;->a:Lcom/tencent/connect/avatar/ImageActivity;

    const-string v1, "10660"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/tencent/connect/avatar/ImageActivity;->a(Ljava/lang/String;J)V

    .line 654
    return-void
.end method
