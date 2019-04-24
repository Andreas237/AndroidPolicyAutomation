.class public Lo/erc;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/eqv;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private k:Z

.field protected u:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 5

    .line 42
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/erc;->a:Lo/eqv;

    .line 43
    iput-object p2, p0, Lo/erc;->u:Landroid/content/Context;

    .line 44
    iput-boolean p3, p0, Lo/erc;->k:Z

    .line 45
    instance-of v0, p1, Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 46
    const-string v0, "CardViewHolder"

    const-string v1, "ERROR itemView!"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    return-void

    .line 50
    :cond_0
    iget-boolean v0, p0, Lo/erc;->k:Z

    if-eqz v0, :cond_1

    .line 51
    move-object v0, p1

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/erc;->b:Landroid/widget/LinearLayout;

    .line 52
    new-instance v2, Lo/epc;

    iget-object v0, p0, Lo/erc;->u:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/epc;-><init>(Landroid/content/Context;)V

    .line 53
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    .line 55
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    const/high16 v0, 0x42860000    # 67.0f

    mul-float/2addr v0, v3

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    const/4 v1, -0x1

    invoke-direct {v4, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 56
    iget-object v0, p0, Lo/erc;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    sget v0, Lcom/huawei/ui/homehealth/R$id;->card_top_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/ui/homehealth/R$id;->card_cancel_top_tv:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/erc;->d:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/ui/homehealth/R$id;->cardsedit_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/erc;->c:Landroid/widget/RelativeLayout;

    .line 61
    iget-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v0, p0, Lo/erc;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object v0, p0, Lo/erc;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lo/eqv;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lo/eqv;>(TT;)V"
        }
    .end annotation

    .line 76
    iput-object p1, p0, Lo/erc;->a:Lo/eqv;

    .line 79
    iget-boolean v0, p0, Lo/erc;->k:Z

    if-eqz v0, :cond_1

    .line 80
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    invoke-virtual {v0}, Lo/eqv;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lo/erc;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 85
    iget-object v0, p0, Lo/erc;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 88
    :cond_1
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 93
    sget v0, Lcom/huawei/ui/homehealth/R$id;->cardsedit_layout:I

    if-ne v4, v0, :cond_2

    .line 94
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cardsedit_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    if-nez v0, :cond_0

    .line 96
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======onClick ERROR=====cardsedit_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 100
    iget-object v0, p0, Lo/erc;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->performClick()Z

    goto :goto_0

    .line 102
    :cond_1
    iget-object v0, p0, Lo/erc;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->performClick()Z

    goto :goto_0

    .line 106
    :cond_2
    sget v0, Lcom/huawei/ui/homehealth/R$id;->card_top_tv:I

    if-ne v4, v0, :cond_4

    .line 107
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "card_top_tv"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    if-nez v0, :cond_3

    .line 109
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======onClick ERROR=====card_top_tv"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_3
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    invoke-virtual {p0}, Lo/erc;->getLayoutPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eqv;->b(I)V

    goto :goto_0

    .line 115
    :cond_4
    sget v0, Lcom/huawei/ui/homehealth/R$id;->card_cancel_top_tv:I

    if-ne v4, v0, :cond_6

    .line 116
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "card_cancel_top_tv"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    if-nez v0, :cond_5

    .line 118
    const-string v0, "CardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======onClick ERROR=====card_cancel_top_tv"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void

    .line 121
    :cond_5
    iget-object v0, p0, Lo/erc;->a:Lo/eqv;

    invoke-virtual {v0}, Lo/eqv;->o()V

    .line 126
    :cond_6
    :goto_0
    return-void
.end method
