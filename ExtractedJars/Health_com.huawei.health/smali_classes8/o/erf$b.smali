.class public Lo/erf$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 216
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 217
    sget v0, Lcom/huawei/ui/homehealth/R$id;->root_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/erf$b;->c:Landroid/widget/RelativeLayout;

    .line 218
    sget v0, Lcom/huawei/ui/homehealth/R$id;->title_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erf$b;->b:Landroid/widget/TextView;

    .line 219
    sget v0, Lcom/huawei/ui/homehealth/R$id;->date_num_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erf$b;->e:Landroid/widget/TextView;

    .line 220
    sget v0, Lcom/huawei/ui/homehealth/R$id;->line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/erf$b;->a:Landroid/view/View;

    .line 221
    sget v0, Lcom/huawei/ui/homehealth/R$id;->date_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erf$b;->d:Landroid/widget/TextView;

    .line 222
    return-void
.end method

.method static synthetic a(Lo/erf$b;)Landroid/widget/TextView;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/erf$b;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/erf$b;)Landroid/view/View;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/erf$b;->a:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lo/erf$b;)Landroid/widget/TextView;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/erf$b;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/erf$b;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/erf$b;->c:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lo/erf$b;)Landroid/widget/TextView;
    .locals 1

    .line 207
    iget-object v0, p0, Lo/erf$b;->b:Landroid/widget/TextView;

    return-object v0
.end method
