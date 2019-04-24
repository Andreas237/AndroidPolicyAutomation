.class public Lo/fco;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fco$d;
    }
.end annotation


# instance fields
.field private d:I

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 30
    iput-object p1, p0, Lo/fco;->e:Landroid/content/Context;

    .line 31
    iput p2, p0, Lo/fco;->d:I

    .line 32
    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 36
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 41
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubhearder_data:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 42
    new-instance v5, Lo/fco$d;

    invoke-direct {v5, v4}, Lo/fco$d;-><init>(Landroid/view/View;)V

    .line 43
    invoke-virtual {p0, v5, p1}, Lo/fco;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 44
    return-object v4
.end method

.method public getItemCount()I
    .locals 1

    .line 81
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 4

    .line 59
    instance-of v0, p1, Lo/fco$d;

    if-eqz v0, :cond_5

    .line 60
    iget v0, p0, Lo/fco;->d:I

    if-nez v0, :cond_0

    .line 61
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_active_statistic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 62
    :cond_0
    iget v0, p0, Lo/fco;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 63
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_health_condition:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 64
    :cond_1
    iget v0, p0, Lo/fco;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 65
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_health_power:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 66
    :cond_2
    iget v0, p0, Lo/fco;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 67
    iget-object v0, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_data_manage:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 68
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    goto :goto_0

    :cond_3
    iget v0, p0, Lo/fco;->d:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 70
    iget-object v0, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_recommend_auth_manage:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 71
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move-object v0, p1

    check-cast v0, Lo/fco$d;

    iget-object v0, v0, Lo/fco$d;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fco;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_active_statistic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    :cond_5
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 50
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 51
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubhearder_data:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 52
    new-instance v0, Lo/fco$d;

    invoke-direct {v0, v3}, Lo/fco$d;-><init>(Landroid/view/View;)V

    return-object v0

    .line 54
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
