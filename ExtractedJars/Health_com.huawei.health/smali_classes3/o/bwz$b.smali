.class Lo/bwz$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field b:Landroid/view/View;

.field c:Lo/efy;

.field d:Landroid/widget/ImageView;

.field e:Lo/efy;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 59
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 60
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_pkg_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bwz$b;->d:Landroid/widget/ImageView;

    .line 61
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwz$b;->e:Lo/efy;

    .line 62
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bwz$b;->c:Lo/efy;

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$id;->fitness_pkg_interval:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bwz$b;->b:Landroid/view/View;

    .line 64
    return-void
.end method
