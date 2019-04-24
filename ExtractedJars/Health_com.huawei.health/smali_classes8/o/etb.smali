.class public Lo/etb;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 50
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 51
    iput-object p1, p0, Lo/etb;->i:Landroid/content/Context;

    .line 52
    sget v0, Lcom/huawei/ui/homehealth/R$id;->root_view:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/etb;->g:Landroid/widget/LinearLayout;

    .line 53
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_today_todo:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/etb;->e:Landroid/widget/TextView;

    .line 54
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_today_todoIv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/etb;->d:Landroid/widget/ImageView;

    .line 56
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tv_allday_todo_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/etb;->a:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/ui/homehealth/R$id;->linview:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/etb;->c:Landroid/view/View;

    .line 58
    sget v0, Lcom/huawei/ui/homehealth/R$id;->activity_container_ll_top:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    .line 59
    sget v0, Lcom/huawei/ui/homehealth/R$id;->activity_container_ll_bottom:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    .line 61
    return-void
.end method

.method private b(Lo/fil;)V
    .locals 6

    .line 124
    if-eqz p1, :cond_6

    .line 125
    invoke-virtual {p1}, Lo/fil;->u()I

    move-result v2

    .line 127
    invoke-virtual {p1}, Lo/fil;->q()I

    move-result v3

    .line 129
    sub-int v4, v3, v2

    .line 130
    if-lez v3, :cond_2

    const/16 v0, 0xc

    if-gt v3, v0, :cond_2

    .line 131
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 132
    if-ge v5, v4, :cond_0

    .line 133
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    goto :goto_1

    .line 135
    :cond_0
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity_un:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    .line 131
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    goto :goto_6

    .line 138
    :cond_2
    const/16 v0, 0xc

    if-le v3, v0, :cond_6

    .line 139
    const/4 v5, 0x0

    :goto_2
    const/16 v0, 0xc

    if-ge v5, v0, :cond_4

    .line 140
    if-ge v5, v4, :cond_3

    .line 141
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    goto :goto_3

    .line 143
    :cond_3
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity_un:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    .line 139
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 146
    :cond_4
    const/4 v5, 0x0

    :goto_4
    add-int/lit8 v0, v3, -0xc

    if-ge v5, v0, :cond_6

    .line 147
    add-int/lit8 v0, v4, -0xc

    if-ge v5, v0, :cond_5

    .line 148
    iget-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    goto :goto_5

    .line 150
    :cond_5
    iget-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->shape_todo_card_activity_un:I

    invoke-direct {p0, v0, v1}, Lo/etb;->e(Landroid/widget/LinearLayout;I)V

    .line 146
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 155
    :cond_6
    :goto_6
    return-void
.end method

.method private c(Lo/fil;Lo/etg;)V
    .locals 2

    .line 111
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 112
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 113
    iget-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 115
    invoke-virtual {p1}, Lo/fil;->p()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 116
    invoke-virtual {p1}, Lo/fil;->t()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 118
    invoke-direct {p0, p1}, Lo/etb;->b(Lo/fil;)V

    .line 121
    :cond_0
    return-void
.end method

.method private d(I)I
    .locals 1

    .line 86
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 88
    :pswitch_0
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->ic_activity:I

    .line 89
    goto :goto_1

    .line 91
    :pswitch_1
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->ic_fitness_plan:I

    .line 92
    goto :goto_1

    .line 94
    :pswitch_2
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->ic_run_plan:I

    .line 95
    goto :goto_1

    .line 97
    :pswitch_3
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->ic_nps:I

    .line 98
    goto :goto_1

    .line 100
    :goto_0
    sget v0, Lcom/huawei/ui/homehealth/R$drawable;->ic_nps:I

    .line 103
    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private e(Landroid/widget/LinearLayout;I)V
    .locals 5

    .line 163
    new-instance v3, Landroid/view/View;

    iget-object v0, p0, Lo/etb;->i:Landroid/content/Context;

    invoke-direct {v3, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 164
    invoke-virtual {v3, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 165
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lo/etb;->i:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/etb;->i:Landroid/content/Context;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 166
    iget-object v0, p0, Lo/etb;->i:Landroid/content/Context;

    const/high16 v1, 0x41a80000    # 21.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMarginEnd(I)V

    .line 167
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 168
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 169
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 159
    iget-object v0, p0, Lo/etb;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 160
    return-void
.end method

.method public c(Lo/etg;)V
    .locals 5

    .line 65
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 66
    const-string v0, "TodoCardInnerViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    return-void

    .line 69
    :cond_0
    const-string v0, "TodoCardInnerViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshTodoCardViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/etb;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lo/etb;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/etg;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, p0, Lo/etb;->d:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lo/etg;->b()I

    move-result v1

    invoke-direct {p0, v1}, Lo/etb;->d(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    iget-object v0, p0, Lo/etb;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/etg;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    iget-object v0, p0, Lo/etb;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lo/etb;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 76
    invoke-virtual {p1}, Lo/etg;->b()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 77
    invoke-virtual {p1}, Lo/etg;->e()Lo/fil;

    move-result-object v4

    .line 78
    if-eqz v4, :cond_1

    .line 79
    invoke-direct {p0, v4, p1}, Lo/etb;->c(Lo/fil;Lo/etg;)V

    .line 82
    :cond_1
    return-void
.end method
