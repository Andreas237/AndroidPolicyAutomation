.class public Lo/fcp;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcp$b;
    }
.end annotation


# instance fields
.field private c:I

.field private d:Landroid/view/View$OnClickListener;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/fcp;->c:I

    .line 24
    iput-object p1, p0, Lo/fcp;->e:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lo/fcp;->d:Landroid/view/View$OnClickListener;

    .line 26
    return-void
.end method

.method static synthetic e(Lo/fcp;)Landroid/view/View$OnClickListener;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/fcp;->d:Landroid/view/View$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 29
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 33
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_b01_list:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 34
    new-instance v5, Lo/fcp$b;

    invoke-direct {v5, v4}, Lo/fcp$b;-><init>(Landroid/view/View;)V

    .line 35
    invoke-virtual {p0, v5, p1}, Lo/fcp;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 36
    return-object v4
.end method

.method public c(I)V
    .locals 0

    .line 21
    iput p1, p0, Lo/fcp;->c:I

    .line 22
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 74
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 51
    instance-of v0, p1, Lo/fcp$b;

    if-eqz v0, :cond_1

    .line 52
    iget v0, p0, Lo/fcp;->c:I

    if-nez v0, :cond_0

    .line 53
    move-object v0, p1

    check-cast v0, Lo/fcp$b;

    iget-object v0, v0, Lo/fcp$b;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcp;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    move-object v0, p1

    check-cast v0, Lo/fcp$b;

    iget-object v0, v0, Lo/fcp$b;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 56
    :cond_0
    iget v0, p0, Lo/fcp;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 57
    move-object v0, p1

    check-cast v0, Lo/fcp$b;

    iget-object v0, v0, Lo/fcp$b;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcp;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_base_health_before_one_more_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 58
    move-object v0, p1

    check-cast v0, Lo/fcp$b;

    iget-object v0, v0, Lo/fcp$b;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcp;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_set_text:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    move-object v0, p1

    check-cast v0, Lo/fcp$b;

    iget-object v0, v0, Lo/fcp$b;->d:Landroid/widget/ImageView;

    new-instance v1, Lo/fcp$3;

    invoke-direct {v1, p0}, Lo/fcp$3;-><init>(Lo/fcp;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 42
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 43
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_b01_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 44
    new-instance v0, Lo/fcp$b;

    invoke-direct {v0, v3}, Lo/fcp$b;-><init>(Landroid/view/View;)V

    return-object v0

    .line 46
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
