.class public Lo/bur;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bur$d;
    }
.end annotation


# instance fields
.field private a:I

.field private final b:Ljava/lang/Object;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;"
        }
    .end annotation
.end field

.field private f:Lo/bur$d;

.field private g:J

.field private h:Lo/buj;

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/support/v7/widget/RecyclerView;Landroid/content/Context;)V
    .locals 2

    .line 54
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/bur;->b:Ljava/lang/Object;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bur;->e:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bur;->c:Ljava/util/List;

    .line 38
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bur;->d:Z

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/bur;->a:I

    .line 42
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/bur;->g:J

    .line 55
    iput-object p2, p0, Lo/bur;->k:Landroid/content/Context;

    .line 56
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/suggestion/model/OperationPage;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/OperationPage;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v0, Lo/bur$1;

    invoke-direct {v0, p0}, Lo/bur$1;-><init>(Lo/bur;)V

    invoke-virtual {p1, v0}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 69
    return-void
.end method

.method static synthetic a(Lo/bur;)Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lo/bur;->d:Z

    return v0
.end method

.method static synthetic c(Lo/bur;)Lo/bur$d;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bur;->f:Lo/bur$d;

    return-object v0
.end method

.method static synthetic d(Lo/bur;)Ljava/util/List;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Topic;>;)V"
        }
    .end annotation

    .line 158
    iget-object v4, p0, Lo/bur;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 159
    const-string v0, "FitnessCourseRecyAdapter"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyAddAll enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 161
    monitor-exit v4

    return-void

    .line 163
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    const/4 v1, 0x2

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    add-int v5, v0, v1

    .line 164
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bur;->d:Z

    .line 167
    :cond_2
    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 181
    invoke-virtual {p0}, Lo/bur;->getItemCount()I

    move-result v6

    .line 182
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    .line 183
    :goto_1
    invoke-virtual {p0, v7}, Lo/bur;->notifyItemChanged(I)V

    .line 185
    sub-int v8, v6, v5

    .line 186
    const/4 v0, 0x1

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 187
    invoke-virtual {p0, v5, v8}, Lo/bur;->notifyItemRangeChanged(II)V

    .line 188
    const-string v0, "FitnessCourseRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyAddAll end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 191
    :goto_2
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 195
    iput-boolean p1, p0, Lo/bur;->d:Z

    .line 196
    invoke-virtual {p0}, Lo/bur;->notifyDataSetChanged()V

    .line 197
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 144
    iget-object v4, p0, Lo/bur;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 145
    const-string v0, "FitnessCourseRecyAdapter"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyClearAndAddALl enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 147
    monitor-exit v4

    return-void

    .line 149
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 150
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 151
    invoke-virtual {p0}, Lo/bur;->notifyDataSetChanged()V

    .line 152
    const-string v0, "FitnessCourseRecyAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyClearAndAddALl end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 155
    :goto_0
    return-void
.end method

.method public c(Lo/bur$d;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lo/bur;->f:Lo/bur$d;

    .line 207
    return-void
.end method

.method public e()V
    .locals 2

    .line 210
    iget-object v0, p0, Lo/bur;->h:Lo/buj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 211
    return-void

    .line 213
    :cond_0
    iget-object v0, p0, Lo/bur;->h:Lo/buj;

    invoke-virtual {v0}, Lo/buj;->b()V

    .line 214
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 107
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bur;->a:I

    goto :goto_0

    .line 110
    :cond_0
    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bur;->a:I

    .line 112
    :goto_0
    iget-boolean v0, p0, Lo/bur;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    .line 113
    iget v0, p0, Lo/bur;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bur;->a:I

    .line 115
    :cond_1
    iget v0, p0, Lo/bur;->a:I

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 120
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    .line 121
    if-nez p1, :cond_0

    .line 122
    const/4 v0, 0x0

    return v0

    .line 123
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 124
    const/4 v0, 0x1

    return v0

    .line 126
    :cond_1
    iget-boolean v0, p0, Lo/bur;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_2

    iget v0, p0, Lo/bur;->a:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 127
    const/4 v0, 0x3

    return v0

    .line 129
    :cond_2
    const/4 v0, 0x2

    return v0

    .line 132
    :cond_3
    if-nez p1, :cond_4

    .line 133
    const/4 v0, 0x1

    return v0

    .line 135
    :cond_4
    iget-boolean v0, p0, Lo/bur;->d:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_5

    iget v0, p0, Lo/bur;->a:I

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_5

    .line 136
    const/4 v0, 0x3

    return v0

    .line 138
    :cond_5
    const/4 v0, 0x2

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 88
    invoke-virtual {p0, p2}, Lo/bur;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 89
    move-object v0, p1

    check-cast v0, Lo/buj;

    iget-object v1, p0, Lo/bur;->c:Ljava/util/List;

    iget-wide v2, p0, Lo/bur;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lo/buj;->d(Ljava/util/List;J)V

    goto :goto_2

    .line 91
    :cond_0
    invoke-virtual {p0, p2}, Lo/bur;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 92
    move-object v0, p1

    check-cast v0, Lo/bul;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bul;->a(Lcom/huawei/health/suggestion/model/Topic;)V

    goto :goto_2

    .line 93
    :cond_1
    invoke-virtual {p0, p2}, Lo/bur;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 97
    :cond_2
    iget-object v0, p0, Lo/bur;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 98
    move-object v0, p1

    check-cast v0, Lo/bup;

    iget-object v1, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lo/bur;->e:Ljava/util/List;

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/Topic;

    :goto_0
    invoke-virtual {v0, v1}, Lo/bup;->a(Lcom/huawei/health/suggestion/model/Topic;)V

    goto :goto_2

    .line 100
    :cond_4
    move-object v0, p1

    check-cast v0, Lo/bup;

    iget-object v1, p0, Lo/bur;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x0

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lo/bur;->e:Ljava/util/List;

    add-int/lit8 v2, p2, -0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/Topic;

    :goto_1
    invoke-virtual {v0, v1}, Lo/bup;->a(Lcom/huawei/health/suggestion/model/Topic;)V

    .line 103
    :goto_2
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 73
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 75
    :pswitch_0
    new-instance v0, Lo/buj;

    invoke-direct {v0, p1}, Lo/buj;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lo/bur;->h:Lo/buj;

    .line 76
    iget-object v0, p0, Lo/bur;->h:Lo/buj;

    return-object v0

    .line 78
    :pswitch_1
    new-instance v0, Lo/bul;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_item_fitness_head:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bul;-><init>(Landroid/view/View;)V

    return-object v0

    .line 80
    :pswitch_2
    new-instance v0, Lo/bun;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_his_loading_more:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bun;-><init>(Landroid/view/View;)V

    return-object v0

    .line 82
    :goto_0
    :pswitch_3
    new-instance v0, Lo/bup;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$layout;->sug_item_fitness_nomal:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/bur;->k:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bup;-><init>(Landroid/view/View;Landroid/content/Context;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
