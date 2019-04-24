.class Lo/yb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yb;-><init>(Landroid/view/View;Ljava/util/ArrayList;Lo/ye;ILcom/huawei/bone/social/ui/RankingFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/yb;


# direct methods
.method constructor <init>(Lo/yb;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/yb$5;->c:Lo/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 64
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    invoke-virtual {v0}, Lo/yb;->getAdapterPosition()I

    move-result v6

    .line 65
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v1

    iput-wide v1, v0, Lo/yb;->h:J

    .line 66
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toHuId1:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/yb$5;->c:Lo/yb;

    iget-wide v3, v3, Lo/yb;->h:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "toHuId2:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v3, v3, Lo/yb;->k:Landroid/content/Context;

    invoke-static {v3}, Lo/wf;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-wide v0, v0, Lo/yb;->h:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->k:Landroid/content/Context;

    invoke-static {v1}, Lo/wf;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    new-instance v7, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 71
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->o:Lcom/huawei/bone/social/ui/RankingFragment;

    const/4 v1, 0x2

    invoke-virtual {v0, v7, v1}, Lcom/huawei/bone/social/ui/RankingFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 72
    goto/16 :goto_1

    .line 73
    :cond_0
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/xu;->a(Landroid/content/Context;)Lo/xu;

    move-result-object v0

    invoke-virtual {v0}, Lo/xu;->e()Z

    move-result v7

    .line 74
    if-nez v7, :cond_2

    .line 75
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendSelectedHobbies() network disconnect..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 77
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    invoke-static {v0}, Lo/yb;->c(Lo/yb;)J

    move-result-wide v0

    sub-long v0, v8, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 78
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    invoke-static {v0, v8, v9}, Lo/yb;->b(Lo/yb;J)J

    .line 79
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->k:Landroid/content/Context;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_login_no_network:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 82
    :cond_1
    return-void

    .line 84
    :cond_2
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v1

    iput v1, v0, Lo/yb;->i:I

    .line 85
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v1

    iput-wide v1, v0, Lo/yb;->h:J

    .line 86
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->isLiked()I

    move-result v0

    if-nez v0, :cond_3

    .line 87
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_selected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget v1, v0, Lo/yb;->i:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/yb;->i:I

    .line 89
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget v1, v1, Lo/yb;->i:I

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setLikes(I)V

    .line 90
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->like_rank_count_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 91
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setIsLiked(I)V

    .line 94
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->l:Lo/ye;

    invoke-virtual {v0, v6}, Lo/ye;->notifyItemChanged(I)V

    goto/16 :goto_0

    .line 96
    :cond_3
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 97
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget v0, v0, Lo/yb;->i:I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget v1, v0, Lo/yb;->i:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lo/yb;->i:I

    .line 98
    :cond_4
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget v1, v1, Lo/yb;->i:I

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setLikes(I)V

    .line 99
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 100
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, v1, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setIsLiked(I)V

    .line 103
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v0, v0, Lo/yb;->l:Lo/ye;

    invoke-virtual {v0, v6}, Lo/ye;->notifyItemChanged(I)V

    .line 105
    :goto_0
    iget-object v0, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v1, p0, Lo/yb$5;->c:Lo/yb;

    iget-wide v1, v1, Lo/yb;->h:J

    iget-object v3, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v3, v3, Lo/yb;->f:Ljava/util/ArrayList;

    .line 106
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v3}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->isLiked()I

    move-result v3

    iget-object v4, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v4, v4, Lo/yb;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-virtual {v4}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v4

    iget-object v5, p0, Lo/yb$5;->c:Lo/yb;

    iget-object v5, v5, Lo/yb;->k:Landroid/content/Context;

    .line 105
    invoke-static/range {v0 .. v5}, Lo/yb;->e(Lo/yb;JIILandroid/content/Context;)V

    .line 109
    :goto_1
    return-void
.end method
