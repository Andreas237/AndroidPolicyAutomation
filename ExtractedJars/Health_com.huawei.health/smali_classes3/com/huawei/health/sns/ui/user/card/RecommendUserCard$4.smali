.class Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->e(Lo/bfh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

.field final synthetic c:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

.field final synthetic d:Landroid/view/LayoutInflater;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;ILcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;Landroid/view/LayoutInflater;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->b:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

    iput p2, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->a:I

    iput-object p3, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->c:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

    iput-object p4, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->d:Landroid/view/LayoutInflater;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->b:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->a(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v6

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->b:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->c(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42000000    # 32.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    div-int v7, v6, v0

    .line 114
    iget v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->a:I

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 115
    const/4 v8, 0x0

    .line 116
    const/4 v9, 0x0

    .line 117
    const/4 v10, 0x0

    .line 118
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v7, :cond_1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->c:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_recommond_item_head:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v9

    .line 122
    sget v0, Lcom/huawei/android/sns/R$id;->recommend_image_head:I

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 123
    if-eqz v8, :cond_0

    .line 125
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    move-object v2, v10

    .line 126
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 127
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v5

    .line 125
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 131
    :cond_0
    invoke-static {}, Lo/bbq;->d()I

    move-result v0

    invoke-static {v10, v0}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 133
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;->b:Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->a(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 118
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 135
    :cond_1
    return-void
.end method
