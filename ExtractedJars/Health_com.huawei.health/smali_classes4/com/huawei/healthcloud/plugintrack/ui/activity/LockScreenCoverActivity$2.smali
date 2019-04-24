.class Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->e(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 197
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->d(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->e(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->a(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)I

    move-result v0

    const/16 v1, 0x103

    if-ne v0, v1, :cond_0

    .line 202
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->k(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->h(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->i(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 207
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->f(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->g(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 212
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->b(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 213
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->o(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->m(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->p(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Lo/egb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;->l(Lcom/huawei/healthcloud/plugintrack/ui/activity/LockScreenCoverActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 217
    return-void
.end method
