.class Lo/bxc$a;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bxc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Lo/efy;

.field b:Lo/efy;

.field c:Lo/efy;

.field d:Landroid/widget/ImageView;

.field e:Lo/efy;

.field f:Landroid/widget/ProgressBar;

.field g:Landroid/widget/RelativeLayout;

.field h:Landroid/view/View;

.field i:Landroid/view/View;

.field k:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 74
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 75
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bxc$a;->d:Landroid/widget/ImageView;

    .line 76
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_name_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxc$a;->a:Lo/efy;

    .line 77
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_complete_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxc$a;->c:Lo/efy;

    .line 78
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_finishrate_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxc$a;->e:Lo/efy;

    .line 80
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_button:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lo/bxc$a;->k:Landroid/widget/Button;

    .line 81
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_my_plans_item_interval:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxc$a;->h:Landroid/view/View;

    .line 82
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_describe_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lo/bxc$a;->b:Lo/efy;

    .line 83
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_ryt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/bxc$a;->g:Landroid/widget/RelativeLayout;

    .line 84
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mylans_item_horizontal:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lo/bxc$a;->f:Landroid/widget/ProgressBar;

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_my_plans_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bxc$a;->i:Landroid/view/View;

    .line 87
    return-void
.end method
