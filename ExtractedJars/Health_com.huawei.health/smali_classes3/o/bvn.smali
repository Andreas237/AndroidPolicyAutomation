.class public abstract Lo/bvn;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvn$b;,
        Lo/bvn$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bvr;>;Landroid/view/View$OnClickListener;"
    }
.end annotation


# instance fields
.field private a:Lo/bvn$e;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<TT;>;"
        }
    .end annotation
.end field

.field private c:Lo/bvr;

.field private d:I

.field private e:Landroid/content/Context;

.field private i:I

.field private k:Lo/bvn$b;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/support/v7/widget/RecyclerView;I)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/support/v7/widget/RecyclerView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;Landroid/support/v7/widget/RecyclerView;I)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 32
    const/4 v0, 0x1

    iput v0, p0, Lo/bvn;->i:I

    .line 35
    iput p3, p0, Lo/bvn;->d:I

    .line 36
    iput-object p1, p0, Lo/bvn;->b:Ljava/util/List;

    .line 37
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bvn;->e:Landroid/content/Context;

    .line 38
    new-instance v0, Lo/bvn$4;

    invoke-direct {v0, p0, p2}, Lo/bvn$4;-><init>(Lo/bvn;Landroid/support/v7/widget/RecyclerView;)V

    invoke-virtual {p2, v0}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 50
    return-void
.end method

.method static synthetic a(Lo/bvn;)Lo/bvn$e;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bvn;->a:Lo/bvn$e;

    return-object v0
.end method

.method static synthetic b(Lo/bvn;)Ljava/util/List;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/bvn;)I
    .locals 1

    .line 22
    iget v0, p0, Lo/bvn;->i:I

    return v0
.end method

.method static synthetic e(Lo/bvn;)Lo/bvn$b;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/bvn;->k:Lo/bvn$b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)Lo/bvn;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)Lo/bvn;"
        }
    .end annotation

    .line 168
    const/4 v0, 0x1

    iput v0, p0, Lo/bvn;->i:I

    .line 169
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 170
    :cond_0
    return-object p0

    .line 172
    :cond_1
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 173
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 174
    invoke-virtual {p0}, Lo/bvn;->getItemCount()I

    move-result v2

    .line 175
    sub-int v3, v2, v1

    .line 176
    invoke-virtual {p0, v1, v3}, Lo/bvn;->notifyItemRangeChanged(II)V

    .line 177
    return-object p0
.end method

.method public a(Landroid/view/ViewGroup;I)Lo/bvr;
    .locals 5

    .line 73
    iget-object v0, p0, Lo/bvn;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 75
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 76
    iget v0, p0, Lo/bvn;->d:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 77
    new-instance v0, Lo/bvr;

    invoke-direct {v0, v4}, Lo/bvr;-><init>(Landroid/view/View;)V

    return-object v0

    .line 79
    :cond_0
    new-instance v0, Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_his_loading_more:I

    const/4 v2, 0x0

    invoke-virtual {v3, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bvr;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lo/bvn;->c:Lo/bvr;

    .line 80
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_load_more:I

    invoke-virtual {v0, v1, p0}, Lo/bvr;->b(ILandroid/view/View$OnClickListener;)Lo/bvr;

    .line 81
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    return-object v0
.end method

.method public a()V
    .locals 4

    .line 66
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bvn;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget v0, p0, Lo/bvn;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 67
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_load_more:I

    iget-object v2, p0, Lo/bvn;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_his_load_retry:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 69
    :cond_0
    return-void
.end method

.method public a(Lo/bvr;I)V
    .locals 2

    .line 87
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lo/bvn;->b(Lo/bvr;ILjava/lang/Object;)V

    .line 89
    iget-object v0, p1, Lo/bvr;->itemView:Landroid/view/View;

    new-instance v1, Lo/bvn$5;

    invoke-direct {v1, p0, p1, p2}, Lo/bvn$5;-><init>(Lo/bvn;Lo/bvr;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    :cond_0
    return-void
.end method

.method public b(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bvn$b;)Lo/bvn;
    .locals 0

    .line 185
    iput-object p1, p0, Lo/bvn;->k:Lo/bvn$b;

    .line 186
    return-object p0
.end method

.method public b(Lo/bvn$e;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/bvn;->a:Lo/bvn$e;

    .line 135
    return-void
.end method

.method public abstract b(Lo/bvr;ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bvr;ITT;)V"
        }
    .end annotation
.end method

.method public b()Z
    .locals 2

    .line 117
    iget v0, p0, Lo/bvn;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()I
    .locals 1

    .line 108
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public c(Ljava/util/List;)Lo/bvn;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)Lo/bvn;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 146
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 149
    :cond_0
    invoke-virtual {p0}, Lo/bvn;->getItemCount()I

    move-result v2

    .line 151
    const/4 v0, 0x0

    iput v0, p0, Lo/bvn;->i:I

    .line 152
    sub-int v3, v2, v1

    .line 153
    if-lez v3, :cond_1

    .line 154
    invoke-virtual {p0, v1, v3}, Lo/bvn;->notifyItemRangeChanged(II)V

    .line 156
    :cond_1
    return-object p0
.end method

.method public d()V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 126
    invoke-virtual {p0}, Lo/bvn;->notifyDataSetChanged()V

    .line 127
    return-void
.end method

.method public e()Lo/bvn;
    .locals 1

    .line 138
    const/4 v0, 0x0

    iput v0, p0, Lo/bvn;->i:I

    .line 139
    invoke-virtual {p0}, Lo/bvn;->notifyDataSetChanged()V

    .line 140
    return-object p0
.end method

.method public e(I)V
    .locals 1

    .line 121
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 122
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)V"
        }
    .end annotation

    .line 190
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 191
    invoke-virtual {p0}, Lo/bvn;->notifyDataSetChanged()V

    .line 192
    return-void
.end method

.method public g()Lo/bvn;
    .locals 1

    .line 162
    const/4 v0, 0x1

    iput v0, p0, Lo/bvn;->i:I

    .line 163
    invoke-virtual {p0}, Lo/bvn;->notifyDataSetChanged()V

    .line 164
    return-object p0
.end method

.method public getItemCount()I
    .locals 2

    .line 104
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/bvn;->i:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 113
    iget-object v0, p0, Lo/bvn;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lo/bvr;

    invoke-virtual {p0, v0, p2}, Lo/bvn;->a(Lo/bvr;I)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_load_more:I

    if-ne v0, v1, :cond_0

    .line 55
    iget-object v0, p0, Lo/bvn;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_his_load_retry:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 56
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_load_more:I

    invoke-virtual {v0, v1}, Lo/bvr;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0}, Lo/efy;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lo/bvn;->c:Lo/bvr;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_tv_his_load_more:I

    iget-object v2, p0, Lo/bvn;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_his_loading_more:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bvr;->c(ILjava/lang/String;)Lo/bvr;

    .line 58
    iget-object v0, p0, Lo/bvn;->k:Lo/bvn$b;

    if-eqz v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/bvn;->k:Lo/bvn$b;

    invoke-interface {v0}, Lo/bvn$b;->d()V

    .line 63
    :cond_0
    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 22
    invoke-virtual {p0, p1, p2}, Lo/bvn;->a(Landroid/view/ViewGroup;I)Lo/bvr;

    move-result-object v0

    return-object v0
.end method
