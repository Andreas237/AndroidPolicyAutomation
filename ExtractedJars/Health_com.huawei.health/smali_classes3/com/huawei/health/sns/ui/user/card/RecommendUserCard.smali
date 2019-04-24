.class public Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;
.super Lo/bfl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;
    }
.end annotation


# instance fields
.field private g:Landroid/widget/TextView;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private i:Landroid/widget/LinearLayout;

.field private k:Lo/bmq;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->g:Landroid/widget/TextView;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->i:Landroid/widget/LinearLayout;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->k:Lo/bmq;

    .line 61
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;)Landroid/widget/LinearLayout;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->i:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;)Landroid/content/Context;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->d:Landroid/content/Context;

    return-object v0
.end method

.method private d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)V"
        }
    .end annotation

    .line 158
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 160
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    goto :goto_0

    .line 162
    :cond_0
    return-void
.end method

.method private e(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;)Z"
        }
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 174
    const/4 v0, 0x1

    return v0

    .line 177
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 179
    const/4 v0, 0x1

    return v0

    .line 182
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    const/4 v0, 0x1

    return v0

    .line 188
    :cond_2
    goto :goto_0

    .line 189
    :cond_3
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 66
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->g:Landroid/widget/TextView;

    .line 67
    sget v0, Lcom/huawei/android/sns/R$id;->recommend_head_icon_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->i:Landroid/widget/LinearLayout;

    .line 68
    sget v0, Lcom/huawei/android/sns/R$id;->count_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bmq;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->k:Lo/bmq;

    .line 69
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->a(Landroid/view/View;)V

    .line 70
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 8

    .line 76
    if-eqz p1, :cond_2

    instance-of v0, p1, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

    if-eqz v0, :cond_2

    .line 78
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;

    .line 79
    const-string v3, ""

    .line 81
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 82
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->e(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 86
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->d(Ljava/util/List;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 89
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 90
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_recommon_friend_remind:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 92
    const-string v0, "\uff1a"

    invoke-virtual {v3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 93
    if-lez v5, :cond_0

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    const/4 v0, 0x5

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->i:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;

    invoke-direct {v1, p0, v6, v2, v7}, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard$4;-><init>(Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;ILcom/huawei/health/sns/ui/user/card/RecommendUserCard$RecommendUserCardBean;Landroid/view/LayoutInflater;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    .line 138
    if-lez v4, :cond_1

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->k:Lo/bmq;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmq;->setText(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->k:Lo/bmq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bmq;->setVisibility(I)V

    goto :goto_0

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/RecommendUserCard;->k:Lo/bmq;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bmq;->setVisibility(I)V

    .line 149
    :cond_2
    :goto_0
    return-void
.end method
