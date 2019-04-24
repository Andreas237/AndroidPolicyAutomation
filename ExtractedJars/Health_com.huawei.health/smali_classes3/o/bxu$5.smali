.class Lo/bxu$5;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bxu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bxu$d;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bxu;


# direct methods
.method constructor <init>(Lo/bxu;)V
    .locals 0

    .line 915
    iput-object p1, p0, Lo/bxu$5;->a:Lo/bxu;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/view/ViewGroup;I)Lo/bxu$d;
    .locals 5

    .line 918
    new-instance v0, Lo/bxu$d;

    iget-object v1, p0, Lo/bxu$5;->a:Lo/bxu;

    iget-object v2, p0, Lo/bxu$5;->a:Lo/bxu;

    invoke-static {v2}, Lo/bxu;->b(Lo/bxu;)Lo/byr;

    move-result-object v2

    invoke-virtual {v2}, Lo/byr;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/huawei/health/suggestion/R$layout;->sug_item_day_workouts:I

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo/bxu$d;-><init>(Lo/bxu;Landroid/view/View;)V

    return-object v0
.end method

.method public d(Lo/bxu$d;I)V
    .locals 0

    .line 923
    invoke-virtual {p1, p2}, Lo/bxu$d;->c(I)V

    .line 924
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 928
    iget-object v0, p0, Lo/bxu$5;->a:Lo/bxu;

    invoke-static {v0}, Lo/bxu;->e(Lo/bxu;)I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 915
    move-object v0, p1

    check-cast v0, Lo/bxu$d;

    invoke-virtual {p0, v0, p2}, Lo/bxu$5;->d(Lo/bxu$d;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 915
    invoke-virtual {p0, p1, p2}, Lo/bxu$5;->d(Landroid/view/ViewGroup;I)Lo/bxu$d;

    move-result-object v0

    return-object v0
.end method
