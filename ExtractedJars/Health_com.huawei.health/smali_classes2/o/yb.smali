.class public Lo/yb;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/TextView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/ImageView;

.field d:Landroid/widget/TextView;

.field e:Landroid/widget/TextView;

.field f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;"
        }
    .end annotation
.end field

.field g:Landroid/widget/ImageView;

.field h:J

.field i:I

.field k:Landroid/content/Context;

.field l:Lo/ye;

.field m:Landroid/view/View;

.field private n:J

.field o:Lcom/huawei/bone/social/ui/RankingFragment;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/util/ArrayList;Lo/ye;ILcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/view/View;Ljava/util/ArrayList<Lcom/huawei/bone/social/manager/db/SocialRankingTable;>;Lo/ye;ILcom/huawei/bone/social/ui/RankingFragment;)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 49
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/yb;->n:J

    .line 53
    iput-object p2, p0, Lo/yb;->f:Ljava/util/ArrayList;

    .line 54
    iput-object p3, p0, Lo/yb;->l:Lo/ye;

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/yb;->k:Landroid/content/Context;

    .line 56
    iput-object p5, p0, Lo/yb;->o:Lcom/huawei/bone/social/ui/RankingFragment;

    .line 60
    invoke-direct {p0, p1, p4}, Lo/yb;->a(Landroid/view/View;I)V

    .line 61
    iget-object v0, p0, Lo/yb;->c:Landroid/widget/ImageView;

    new-instance v1, Lo/yb$5;

    invoke-direct {v1, p0}, Lo/yb$5;-><init>(Lo/yb;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    return-void
.end method

.method private a(JIILandroid/content/Context;)V
    .locals 7

    .line 115
    const/4 v0, 0x1

    if-ne v0, p3, :cond_0

    .line 117
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 118
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->q:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 122
    :cond_0
    new-instance v6, Lo/wq;

    invoke-direct {v6, p5}, Lo/wq;-><init>(Landroid/content/Context;)V

    .line 123
    move-object v0, v6

    move-wide v1, p1

    move v3, p3

    move v4, p4

    new-instance v5, Lo/yb$4;

    invoke-direct {v5, p0}, Lo/yb$4;-><init>(Lo/yb;)V

    invoke-virtual/range {v0 .. v5}, Lo/wq;->b(JIILo/wo;)V

    .line 145
    return-void
.end method

.method private a(Landroid/view/View;I)V
    .locals 4

    .line 148
    const-string v0, "PluginSocial_NormalRankViewHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initRankView rankPosition:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    sget v0, Lcom/huawei/bone/social/R$id;->ranking_no:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yb;->e:Landroid/widget/TextView;

    .line 150
    sget v0, Lcom/huawei/bone/social/R$id;->profile_ranking_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/yb;->g:Landroid/widget/ImageView;

    .line 151
    sget v0, Lcom/huawei/bone/social/R$id;->ranking_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yb;->d:Landroid/widget/TextView;

    .line 152
    sget v0, Lcom/huawei/bone/social/R$id;->step_count:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yb;->a:Landroid/widget/TextView;

    .line 154
    sget v0, Lcom/huawei/bone/social/R$id;->like_image:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/yb;->c:Landroid/widget/ImageView;

    .line 155
    sget v0, Lcom/huawei/bone/social/R$id;->like_count:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/yb;->b:Landroid/widget/TextView;

    .line 156
    iget-object v0, p0, Lo/yb;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/bone/social/R$drawable;->ranking_icon_praise_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 159
    sget v0, Lcom/huawei/bone/social/R$id;->ranking_normal_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/yb;->m:Landroid/view/View;

    .line 161
    return-void
.end method

.method static synthetic b(Lo/yb;J)J
    .locals 0

    .line 29
    iput-wide p1, p0, Lo/yb;->n:J

    return-wide p1
.end method

.method static synthetic c(Lo/yb;)J
    .locals 2

    .line 29
    iget-wide v0, p0, Lo/yb;->n:J

    return-wide v0
.end method

.method static synthetic e(Lo/yb;JIILandroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct/range {p0 .. p5}, Lo/yb;->a(JIILandroid/content/Context;)V

    return-void
.end method
