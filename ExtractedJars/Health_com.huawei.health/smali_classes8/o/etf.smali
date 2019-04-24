.class public Lo/etf;
.super Lo/erc;
.source "SourceFile"

# interfaces
.implements Lo/eth$b;


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Lo/eth;

.field private h:Z

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/etg;>;"
        }
    .end annotation
.end field

.field private k:Z


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 4

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 58
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etf;->k:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etf;->h:Z

    .line 64
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TodoCardViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    sget v0, Lcom/huawei/ui/homehealth/R$id;->recyclerview_todo:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lo/etf;->d:Landroid/support/v7/widget/RecyclerView;

    .line 66
    iget-object v0, p0, Lo/etf;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setFocusableInTouchMode(Z)V

    .line 67
    sget v0, Lcom/huawei/ui/homehealth/R$id;->ll_cardname:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/etf;->b:Landroid/widget/LinearLayout;

    .line 69
    sget v0, Lcom/huawei/ui/homehealth/R$id;->card_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/etf;->a:Landroid/view/View;

    .line 70
    sget v0, Lcom/huawei/ui/homehealth/R$id;->iv_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    .line 72
    return-void
.end method

.method static synthetic a(Lo/etf;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    return-object v0
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 103
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Lo/etf;->a(Ljava/util/List;I)V

    .line 104
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_list_deploy:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    return-void
.end method

.method private a(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;I)V"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 121
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mTodoCardRecyAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lo/etf;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lo/etf;->u:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 123
    new-instance v0, Lo/eth;

    iget-object v1, p0, Lo/etf;->u:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lo/eth;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/etf;->e:Lo/eth;

    .line 124
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0, p2}, Lo/eth;->d(I)V

    .line 125
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0, p0}, Lo/eth;->a(Lo/eth$b;)V

    .line 126
    iget-object v0, p0, Lo/etf;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    goto :goto_0

    .line 128
    :cond_0
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null != mTodoCardRecyAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0, p2}, Lo/eth;->d(I)V

    .line 130
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0, p1}, Lo/eth;->b(Ljava/util/List;)V

    .line 131
    iget-object v0, p0, Lo/etf;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getRecycledViewPool()Landroid/support/v7/widget/RecyclerView$RecycledViewPool;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$RecycledViewPool;->clear()V

    .line 132
    iget-object v0, p0, Lo/etf;->e:Lo/eth;

    invoke-virtual {v0}, Lo/eth;->notifyDataSetChanged()V

    .line 134
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/etf;Lo/fil;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/etf;->c(Lo/fil;)V

    return-void
.end method

.method static synthetic b(Lo/etf;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/etf;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    return-object v0
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 109
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lo/etf;->a(Ljava/util/List;I)V

    .line 110
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->ic_list_takeup:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 117
    :goto_0
    return-void
.end method

.method private c(Lo/fil;)V
    .locals 5

    .line 210
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 211
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    const-string v0, "activityName"

    invoke-virtual {p1}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    const-string v0, "activityId"

    invoke-virtual {p1}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/etf;->u:Landroid/content/Context;

    sget-object v2, Lo/dae;->bV:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 215
    return-void
.end method

.method static synthetic c(Lo/etf;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lo/etf;->h:Z

    return p1
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lo/etf;->h:Z

    return v0
.end method

.method public b()V
    .locals 5

    .line 94
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshNotHasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/etf;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 97
    iget-object v0, p0, Lo/etf;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 98
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v0, 0x0

    invoke-direct {p0, v4, v0}, Lo/etf;->a(Ljava/util/List;I)V

    .line 100
    return-void
.end method

.method public b(Lo/fil;)V
    .locals 3

    .line 188
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lo/etf$3;

    invoke-direct {v2, p0, p1}, Lo/etf$3;-><init>(Lo/etf;Lo/fil;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 206
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 222
    iput-boolean p1, p0, Lo/etf;->h:Z

    .line 223
    return-void
.end method

.method public d(I)V
    .locals 6

    .line 155
    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, p1, :cond_2

    .line 156
    :cond_0
    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 157
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mTodoCardRecyModels"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 159
    :cond_1
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " mTodoCardRecyModels.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/etf;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "<=position:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 162
    :cond_2
    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/etg;

    .line 163
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "toDoModel.getType:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v0

    if-nez v0, :cond_3

    .line 165
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->p()V

    .line 166
    sget-object v0, Lo/dae;->cb:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bzm;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 167
    :cond_3
    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 168
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->o()V

    .line 169
    sget-object v0, Lo/dae;->ca:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bzm;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 170
    :cond_4
    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 171
    invoke-virtual {v4}, Lo/etg;->e()Lo/fil;

    move-result-object v5

    .line 172
    if-eqz v5, :cond_5

    .line 173
    invoke-virtual {p0, v5}, Lo/etf;->b(Lo/fil;)V

    .line 175
    :cond_5
    goto :goto_0

    :cond_6
    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 176
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 177
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 178
    goto :goto_0

    :cond_7
    invoke-virtual {v4}, Lo/etg;->b()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    .line 179
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 180
    iget-object v0, p0, Lo/etf;->u:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 184
    :cond_8
    :goto_0
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lo/etf;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 77
    iget-object v0, p0, Lo/etf;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 78
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 79
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshHasData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iput-object p1, p0, Lo/etf;->i:Ljava/util/List;

    .line 81
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 82
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    invoke-direct {p0, p1}, Lo/etf;->c(Ljava/util/List;)V

    goto :goto_0

    .line 85
    :cond_0
    iget-object v0, p0, Lo/etf;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    invoke-direct {p0, p1}, Lo/etf;->a(Ljava/util/List;)V

    goto :goto_0

    .line 89
    :cond_1
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoCardRecyModels == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 139
    invoke-super {p0, p1}, Lo/erc;->onClick(Landroid/view/View;)V

    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 141
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    sget v0, Lcom/huawei/ui/homehealth/R$id;->iv_arrow:I

    if-ne v0, v4, :cond_2

    .line 143
    const-string v0, "Suggestion_TodoCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onclick end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-boolean v0, p0, Lo/etf;->k:Z

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/etf;->c(Ljava/util/List;)V

    goto :goto_0

    .line 147
    :cond_0
    iget-object v0, p0, Lo/etf;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/etf;->a(Ljava/util/List;)V

    .line 149
    :goto_0
    iget-boolean v0, p0, Lo/etf;->k:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lo/etf;->k:Z

    .line 151
    :cond_2
    return-void
.end method
