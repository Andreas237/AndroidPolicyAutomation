.class public Lo/ye;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/yb;>;"
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation
.end field

.field private e:Lcom/huawei/bone/social/ui/RankingFragment;

.field private f:J

.field private g:I

.field private h:J

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:I

.field private n:Landroid/view/LayoutInflater;

.field private o:Ljava/lang/String;

.field private p:I

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private u:Lo/yb;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const-class v0, Lo/ye;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/ye;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;Ljava/util/ArrayList;Lcom/huawei/bone/social/manager/db/SocialRankingTable;II)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/bone/social/ui/RankingFragment;Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;Lcom/huawei/bone/social/manager/db/SocialRankingTable;II)V"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/ye;->m:I

    .line 72
    iput-object p1, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    .line 73
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 75
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 76
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    new-instance v1, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    invoke-direct {v1}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    iput p5, p0, Lo/ye;->b:I

    .line 87
    invoke-virtual {p3}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ye;->h:J

    .line 91
    invoke-virtual {p1}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/ye;->n:Landroid/view/LayoutInflater;

    .line 94
    sget v0, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_normal:I

    iput v0, p0, Lo/ye;->q:I

    .line 102
    return-void
.end method

.method private a(Lo/yb;I)V
    .locals 13

    .line 125
    move-object v6, p1

    .line 126
    move v7, p2

    .line 128
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v7, v0, :cond_0

    .line 129
    iget-object v0, p1, Lo/yb;->e:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 130
    iget-object v0, p1, Lo/yb;->d:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 131
    iget-object v0, p1, Lo/yb;->a:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 132
    iget-object v0, p1, Lo/yb;->c:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 133
    iget-object v0, p1, Lo/yb;->m:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    iget-object v0, p1, Lo/yb;->g:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_6

    .line 137
    :cond_0
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/bone/social/manager/db/SocialRankingTable;

    .line 138
    sget-object v0, Lo/ye;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter configureView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    if-eqz v8, :cond_3

    .line 141
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ye;->k:Ljava/lang/String;

    .line 143
    iget-object v0, p0, Lo/ye;->k:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    iget-object v1, p0, Lo/ye;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/ye;->k:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_2

    .line 144
    :cond_1
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_no_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ye;->k:Ljava/lang/String;

    .line 146
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getUserType()I

    move-result v0

    iput v0, p0, Lo/ye;->g:I

    .line 147
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getHuId()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ye;->f:J

    .line 148
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ye;->o:Ljava/lang/String;

    .line 151
    :try_start_0
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v0

    iput v0, p0, Lo/ye;->p:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v0

    iput v0, p0, Lo/ye;->p:I

    .line 157
    goto :goto_0

    .line 152
    :catch_0
    move-exception v9

    .line 153
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v8, v0}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->setSteps(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v0

    iput v0, p0, Lo/ye;->p:I

    .line 157
    goto :goto_0

    .line 156
    :catchall_0
    move-exception v10

    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v0

    iput v0, p0, Lo/ye;->p:I

    .line 157
    throw v10

    .line 158
    :goto_0
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getLikes()I

    move-result v0

    iput v0, p0, Lo/ye;->l:I

    .line 159
    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getIsLiked()I

    move-result v0

    iput v0, p0, Lo/ye;->m:I

    .line 162
    :cond_3
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v9, v0

    .line 166
    iget-object v0, v6, Lo/yb;->e:Landroid/widget/TextView;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    iget v1, p0, Lo/ye;->g:I

    if-eq v0, v1, :cond_4

    iget-wide v0, p0, Lo/ye;->f:J

    iget-wide v2, p0, Lo/ye;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_9

    .line 171
    :cond_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v10

    .line 172
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/xy;->d(Landroid/content/Context;)Lo/xv;

    move-result-object v11

    .line 175
    iget-object v0, v11, Lo/xv;->n:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v11, Lo/xv;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_6

    .line 176
    :cond_5
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_no_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ye;->i:Ljava/lang/String;

    goto :goto_1

    .line 178
    :cond_6
    iget-object v0, v11, Lo/xv;->n:Ljava/lang/String;

    iput-object v0, p0, Lo/ye;->i:Ljava/lang/String;

    .line 181
    :goto_1
    iget-object v0, v11, Lo/xv;->m:Ljava/lang/String;

    iput-object v0, p0, Lo/ye;->r:Ljava/lang/String;

    .line 182
    sget-object v0, Lo/ye;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "imagePath "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ye;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/4 v12, 0x0

    .line 184
    const/4 v0, 0x0

    if-ne v0, v8, :cond_7

    .line 185
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$plurals;->IDS_plugin_social_achieve_step:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_2

    .line 187
    :cond_7
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$plurals;->IDS_plugin_social_achieve_step:I

    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/huawei/bone/social/manager/db/SocialRankingTable;->getSteps()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 190
    :goto_2
    iget-object v0, v6, Lo/yb;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    iget-object v0, v6, Lo/yb;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ye;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    iget v0, p0, Lo/ye;->l:I

    iput v0, p0, Lo/ye;->a:I

    .line 193
    iget v0, p0, Lo/ye;->a:I

    if-lez v0, :cond_8

    .line 194
    iget-object v0, v6, Lo/yb;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_selected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 196
    :cond_8
    iget-object v0, v6, Lo/yb;->c:Landroid/widget/ImageView;

    iget v1, p0, Lo/ye;->q:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 197
    :goto_3
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, v6, Lo/yb;->g:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/xp;->c(Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 199
    goto/16 :goto_5

    .line 200
    :cond_9
    iget-object v0, p0, Lo/ye;->o:Ljava/lang/String;

    iput-object v0, p0, Lo/ye;->s:Ljava/lang/String;

    .line 201
    const/4 v10, 0x0

    .line 202
    iget-object v0, p0, Lo/ye;->s:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    iget-object v0, p0, Lo/ye;->s:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_a

    .line 203
    const-string v0, "Testing"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "http image:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ye;->s:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/ye;->f:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lo/ye;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    const-string v1, "LOAD"

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->tag(Ljava/lang/Object;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/xm;

    invoke-direct {v1}, Lo/xm;-><init>()V

    .line 205
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->centerCrop()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->noFade()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    invoke-virtual {v0, v9, v9}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p1, Lo/yb;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    goto :goto_4

    .line 208
    :cond_a
    const-string v0, "Testing"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "empty image/null reference of image "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    const-string v1, "LOAD"

    .line 216
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->tag(Ljava/lang/Object;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    new-instance v1, Lo/xm;

    invoke-direct {v1}, Lo/xm;-><init>()V

    .line 217
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    .line 218
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->error(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$mipmap;->ic_personal_head:I

    .line 219
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->placeholder(I)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lcom/squareup/picasso/RequestCreator;->centerCrop()Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    .line 221
    invoke-virtual {v0, v9, v9}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p1, Lo/yb;->g:Landroid/widget/ImageView;

    .line 222
    invoke-virtual {v0, v1}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;)V

    .line 225
    :goto_4
    iget-object v0, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/bone/social/R$plurals;->IDS_plugin_social_achieve_step:I

    iget v2, p0, Lo/ye;->p:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lo/ye;->p:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 226
    iget-object v0, v6, Lo/yb;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    iget-object v0, v6, Lo/yb;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ye;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    iget v0, p0, Lo/ye;->m:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    .line 230
    iget-object v0, v6, Lo/yb;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_selected:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 231
    iget-object v0, v6, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v1}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->like_rank_count_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    .line 235
    :cond_b
    iget-object v0, v6, Lo/yb;->c:Landroid/widget/ImageView;

    iget v1, p0, Lo/ye;->q:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 236
    iget-object v0, v6, Lo/yb;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-virtual {v1}, Lcom/huawei/bone/social/ui/RankingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$color;->black_50alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 243
    :goto_5
    iget-object v0, v6, Lo/yb;->b:Landroid/widget/TextView;

    iget v1, p0, Lo/ye;->l:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    iget-object v0, v6, Lo/yb;->g:Landroid/widget/ImageView;

    new-instance v1, Lo/ye$3;

    invoke-direct {v1, p0, v7}, Lo/ye$3;-><init>(Lo/ye;I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    iget-object v0, v6, Lo/yb;->d:Landroid/widget/TextView;

    new-instance v1, Lo/ye$5;

    invoke-direct {v1, p0, v7}, Lo/ye$5;-><init>(Lo/ye;I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    iget-object v0, v6, Lo/yb;->a:Landroid/widget/TextView;

    new-instance v1, Lo/ye$1;

    invoke-direct {v1, p0, v7}, Lo/ye$1;-><init>(Lo/ye;I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    :goto_6
    return-void
.end method

.method static synthetic b(Lo/ye;J)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lo/ye;->c(J)V

    return-void
.end method

.method static synthetic c(Lo/ye;)Ljava/util/ArrayList;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c(J)V
    .locals 2

    .line 306
    iget-wide v0, p0, Lo/ye;->h:J

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 307
    return-void

    .line 312
    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 5

    .line 314
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 315
    const/4 v0, 0x0

    return v0

    .line 318
    :cond_0
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 319
    const/16 v0, 0x64

    return v0

    .line 322
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lo/ye;->b:I

    sub-int/2addr v0, v1

    int-to-float v2, v0

    .line 323
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    int-to-float v3, v0

    .line 324
    div-float v0, v2, v3

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 325
    return v4

    .line 326
    :catch_0
    move-exception v2

    .line 327
    const/4 v0, 0x0

    return v0
.end method

.method public b(Lo/yb;I)V
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2}, Lo/ye;->a(Lo/yb;I)V

    .line 121
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/yb;
    .locals 7

    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 108
    iget-object v0, p0, Lo/ye;->n:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/bone/social/R$layout;->ranking_data_top_one:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lo/ye;->n:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/bone/social/R$layout;->ranking_data:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 113
    :goto_0
    new-instance v0, Lo/yb;

    iget-object v2, p0, Lo/ye;->c:Ljava/util/ArrayList;

    iget-object v5, p0, Lo/ye;->e:Lcom/huawei/bone/social/ui/RankingFragment;

    move-object v1, v6

    move-object v3, p0

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lo/yb;-><init>(Landroid/view/View;Ljava/util/ArrayList;Lo/ye;ILcom/huawei/bone/social/ui/RankingFragment;)V

    iput-object v0, p0, Lo/ye;->u:Lo/yb;

    .line 114
    iget-object v0, p0, Lo/ye;->u:Lo/yb;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 300
    iget-object v0, p0, Lo/ye;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 271
    move v0, p1

    .line 295
    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/yb;

    invoke-virtual {p0, v0, p2}, Lo/ye;->b(Lo/yb;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lo/ye;->d(Landroid/view/ViewGroup;I)Lo/yb;

    move-result-object v0

    return-object v0
.end method
