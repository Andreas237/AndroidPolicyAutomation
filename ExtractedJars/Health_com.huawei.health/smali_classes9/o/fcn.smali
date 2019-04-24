.class public Lo/fcn;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcn$e;,
        Lo/fcn$b;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/fdw;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    .line 35
    iput-object p1, p0, Lo/fcn;->b:Landroid/content/Context;

    .line 36
    return-void
.end method

.method static synthetic a(Lo/fcn;)Lo/fdw;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/fcn;->c:Lo/fdw;

    return-object v0
.end method

.method private b(Lo/fcn$e;Lo/acn;)V
    .locals 5

    .line 125
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p1, Lo/fcn$e;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lo/acn;->d()D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object v0, p1, Lo/fcn$e;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcn;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p1, Lo/fcn$e;->c:Landroid/widget/TextView;

    invoke-virtual {p2}, Lo/acn;->d()D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v0, p1, Lo/fcn$e;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcn;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :goto_0
    invoke-virtual {p2}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_1

    .line 133
    iget-object v0, p1, Lo/fcn$e;->b:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 135
    :cond_1
    iget-object v0, p1, Lo/fcn$e;->b:Landroid/widget/TextView;

    invoke-virtual {p2}, Lo/acn;->b()D

    move-result-wide v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/fcn;)Landroid/content/Context;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/fcn;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 44
    if-nez p1, :cond_0

    .line 45
    const/4 v0, 0x1

    return v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 56
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 57
    new-instance v5, Lo/fcn$b;

    invoke-direct {v5, v4}, Lo/fcn$b;-><init>(Landroid/view/View;)V

    .line 58
    invoke-virtual {p0, v5, p1}, Lo/fcn;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 59
    return-object v4
.end method

.method public d(Lo/fdw;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 39
    iput-object p1, p0, Lo/fcn;->c:Lo/fdw;

    .line 41
    :cond_0
    return-void
.end method

.method public e(I)Ljava/lang/Object;
    .locals 1

    .line 145
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 146
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_1
    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 51
    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 52
    invoke-virtual {p0}, Lo/fcn;->notifyDataSetChanged()V

    .line 53
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 141
    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 6

    .line 77
    instance-of v0, p1, Lo/fcn$b;

    if-eqz v0, :cond_0

    .line 78
    move-object v0, p1

    check-cast v0, Lo/fcn$b;

    iget-object v0, v0, Lo/fcn$b;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcn;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_input:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    move-object v0, p1

    check-cast v0, Lo/fcn$b;

    iget-object v0, v0, Lo/fcn$b;->b:Landroid/widget/LinearLayout;

    new-instance v1, Lo/fcn$1;

    invoke-direct {v1, p0}, Lo/fcn$1;-><init>(Lo/fcn;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3

    .line 87
    :cond_0
    instance-of v0, p1, Lo/fcn$e;

    if-eqz v0, :cond_4

    .line 88
    iget-object v0, p0, Lo/fcn;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 91
    :cond_1
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    :goto_0
    iget-object v0, p0, Lo/fcn;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    .line 94
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcn;->e:Ljava/util/List;

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v1, p0, Lo/fcn;->e:Ljava/util/List;

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-direct {p0, v0, v1}, Lo/fcn;->b(Lo/fcn$e;Lo/acn;)V

    .line 97
    iget-object v0, p0, Lo/fcn;->e:Ljava/util/List;

    add-int/lit8 v1, p2, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    move-object v1, p1

    check-cast v1, Lo/fcn$e;

    iget-object v1, v1, Lo/fcn$e;->e:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lo/fej;->e(Lo/acn;Landroid/widget/ImageView;)V

    .line 99
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v4

    .line 100
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iget-object v1, p0, Lo/fcn;->e:Ljava/util/List;

    add-int/lit8 v2, p2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v5

    .line 102
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 105
    :cond_2
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 106
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    :goto_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    .line 110
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 112
    :cond_3
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    :goto_2
    move-object v0, p1

    check-cast v0, Lo/fcn$e;

    iget-object v0, v0, Lo/fcn$e;->f:Landroid/widget/LinearLayout;

    new-instance v1, Lo/fcn$2;

    invoke-direct {v1, p0, p2}, Lo/fcn$2;-><init>(Lo/fcn;I)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    :cond_4
    :goto_3
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 65
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 66
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 67
    new-instance v0, Lo/fcn$b;

    invoke-direct {v0, v3}, Lo/fcn$b;-><init>(Landroid/view/View;)V

    return-object v0

    .line 68
    :cond_0
    if-nez p2, :cond_1

    .line 69
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_weight_title_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 70
    new-instance v0, Lo/fcn$e;

    invoke-direct {v0, v3}, Lo/fcn$e;-><init>(Landroid/view/View;)V

    return-object v0

    .line 72
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
