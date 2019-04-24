.class Lo/epy$b;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ImageView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 694
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 697
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->c:Landroid/widget/TextView;

    .line 698
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->b:Landroid/widget/TextView;

    .line 699
    iget-object v0, p0, Lo/epy$b;->b:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 700
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->a:Landroid/widget/TextView;

    .line 701
    iget-object v0, p0, Lo/epy$b;->a:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 702
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->d:Landroid/widget/TextView;

    .line 703
    iget-object v0, p0, Lo/epy$b;->d:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 704
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epy$b;->p:Landroid/widget/ImageView;

    .line 705
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_empty_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epy$b;->n:Landroid/widget/ImageView;

    .line 707
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_empty_items_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->e:Landroid/widget/TextView;

    .line 708
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_empty_items_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->f:Landroid/widget/TextView;

    .line 709
    iget-object v0, p0, Lo/epy$b;->f:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 712
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->h:Landroid/widget/TextView;

    .line 713
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_time:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->i:Landroid/widget/TextView;

    .line 714
    iget-object v0, p0, Lo/epy$b;->i:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 715
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_data:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->g:Landroid/widget/TextView;

    .line 716
    iget-object v0, p0, Lo/epy$b;->g:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 717
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_items_blood_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->k:Landroid/widget/TextView;

    .line 718
    iget-object v0, p0, Lo/epy$b;->k:Landroid/widget/TextView;

    const-string v1, "regular"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 719
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_blood_red_dot:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/epy$b;->l:Landroid/widget/ImageView;

    .line 722
    sget v0, Lcom/huawei/ui/homehealth/R$id;->function_set_management_description:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/epy$b;->o:Landroid/widget/TextView;

    .line 723
    return-void
.end method

.method static synthetic a(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic c(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/epy$b;)Landroid/widget/ImageView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->n:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic e(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic f(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lo/epy$b;)Landroid/widget/ImageView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->p:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic h(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->i:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic i(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic l(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic m(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->g:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic n(Lo/epy$b;)Landroid/widget/ImageView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->l:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic o(Lo/epy$b;)Landroid/widget/TextView;
    .locals 1

    .line 686
    iget-object v0, p0, Lo/epy$b;->k:Landroid/widget/TextView;

    return-object v0
.end method
