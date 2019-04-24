.class public Lo/fcl;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcl$c;
    }
.end annotation


# instance fields
.field private a:I

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 29
    iput-object p1, p0, Lo/fcl;->e:Landroid/content/Context;

    .line 30
    iput p2, p0, Lo/fcl;->a:I

    .line 31
    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 34
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 38
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 39
    new-instance v5, Lo/fcl$c;

    invoke-direct {v5, v4}, Lo/fcl$c;-><init>(Landroid/view/View;)V

    .line 40
    invoke-virtual {p0, v5, p1}, Lo/fcl;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 41
    return-object v4
.end method

.method public getItemCount()I
    .locals 1

    .line 78
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 56
    instance-of v0, p1, Lo/fcl$c;

    if-eqz v0, :cond_4

    .line 57
    iget v0, p0, Lo/fcl;->a:I

    if-nez v0, :cond_0

    .line 58
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcl;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 59
    :cond_0
    iget v0, p0, Lo/fcl;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 60
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcl;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_home_page_bloodpressure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 61
    :cond_1
    iget v0, p0, Lo/fcl;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 62
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcl;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_warning_limit_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 63
    :cond_2
    iget v0, p0, Lo/fcl;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 64
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcl;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_set_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 67
    :cond_3
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcl;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_result:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    :goto_0
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 70
    move-object v0, p1

    check-cast v0, Lo/fcl$c;

    iget-object v0, v0, Lo/fcl$c;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 72
    :cond_4
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 47
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 48
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 49
    new-instance v0, Lo/fcl$c;

    invoke-direct {v0, v3}, Lo/fcl$c;-><init>(Landroid/view/View;)V

    return-object v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
