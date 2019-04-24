.class Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 0

    .line 445
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 450
    const/4 v3, 0x0

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Lo/bfo;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bfo;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;

    if-eqz v0, :cond_0

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->d(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Lo/bfo;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bfo;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;

    .line 455
    :cond_0
    if-eqz v3, :cond_2

    .line 458
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)I

    move-result v0

    if-nez v0, :cond_1

    .line 460
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 461
    const-string v0, "complain_url_title"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->f(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 462
    const-string v0, "complain_url"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->h(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 466
    :cond_1
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    const-class v1, Lcom/huawei/health/sns/ui/complain/ComplainUploadActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 467
    const-string v0, "complain_target"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->i(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 468
    const-string v0, "complain_target_info"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->k(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 470
    :goto_0
    const-string v0, "chat_type"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->g(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 471
    const-string v0, "chat_category"

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->getValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 472
    const-string v0, "user_id"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->p(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 473
    const-string v0, "user_name"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->n(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$4;->e:Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    const/16 v1, 0x103

    invoke-virtual {v0, v4, v1}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 475
    goto :goto_1

    .line 478
    :cond_2
    const-string v0, "ComplainCategoryActivity"

    const-string v1, "complainCategoryBean == null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    :goto_1
    return-void
.end method
