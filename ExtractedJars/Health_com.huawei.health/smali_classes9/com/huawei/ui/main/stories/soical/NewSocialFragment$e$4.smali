.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;I)V
    .locals 0

    .line 786
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iput p2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 790
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter gotoNotifyCard"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 792
    const-string v4, ""

    .line 793
    const-string v5, ""

    .line 794
    const-string v6, ""

    .line 795
    const-string v7, ""

    .line 796
    iget v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v4

    .line 798
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v6

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v5

    .line 800
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->a:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getModule()Ljava/lang/String;

    move-result-object v7

    .line 802
    :cond_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 803
    :cond_1
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageId||detailUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    return-void

    .line 807
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4, v6, v7}, Lo/fid;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 810
    const-string v0, "url"

    invoke-virtual {v8, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 813
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {v8, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 814
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {v8, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 815
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "SOCIALBANNER"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 816
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 820
    goto :goto_0

    .line 822
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "0"

    const-string v2, "0"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3}, Lo/fid;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 824
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4$1;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 839
    :goto_0
    return-void
.end method
