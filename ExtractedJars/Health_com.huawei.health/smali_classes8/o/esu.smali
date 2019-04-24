.class public Lo/esu;
.super Lo/eqv;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 18
    iput-object p1, p0, Lo/esu;->a:Landroid/content/Context;

    .line 19
    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 25
    iget-object v0, p0, Lo/esu;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    new-instance v3, Lo/esx;

    sget v0, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_step_card_cd:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lo/esu;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2}, Lo/esx;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, Lo/esx;

    sget v0, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_step_card:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lo/esu;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2}, Lo/esx;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 31
    :goto_0
    return-object v3
.end method

.method public e()V
    .locals 0

    .line 37
    return-void
.end method
