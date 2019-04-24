.class Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 143
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xu;->a(Landroid/content/Context;)Lo/xu;

    move-result-object v0

    invoke-virtual {v0}, Lo/xu;->e()Z

    move-result v4

    .line 144
    if-nez v4, :cond_0

    .line 145
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e()V

    .line 147
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 148
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)J

    move-result-wide v0

    sub-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0, v5, v6}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;J)J

    .line 150
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v1}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_login_no_network:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 151
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/wh;->b(Landroid/content/Context;)Lo/wj;

    move-result-object v0

    new-instance v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;

    iget-object v2, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;->a:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {v1, v2}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V

    invoke-interface {v0, v1}, Lo/wj;->e(Lo/wo;)V

    .line 155
    return-void
.end method
