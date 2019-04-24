.class Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V
    .locals 0

    .line 467
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 471
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 472
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->c(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v6

    .line 473
    if-eqz v6, :cond_1

    const/16 v0, 0x9

    if-lt v5, v0, :cond_1

    .line 475
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->c(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 476
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->h(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_select_pic_counts_over_notice:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 477
    const/16 v3, 0x9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 476
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0, v7}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 483
    :cond_0
    return-void

    .line 485
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->g(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)I

    move-result v7

    .line 486
    const/4 v0, -0x1

    if-le v7, v0, :cond_3

    .line 488
    if-eqz v6, :cond_2

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->d(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 494
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-virtual {v0, v7}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->e(I)V

    .line 496
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity$5;->c:Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;->k(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoPagerActivity;)V

    .line 498
    :cond_3
    return-void
.end method
