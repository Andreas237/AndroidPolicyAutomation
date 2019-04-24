.class public Lo/enl;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/enl$d;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 25
    iput-object p1, p0, Lo/enl;->b:Landroid/content/Context;

    .line 26
    iput p2, p0, Lo/enl;->a:I

    .line 27
    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 31
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 36
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->hwsubhearder_alarm:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 37
    new-instance v5, Lo/enl$d;

    invoke-direct {v5, v4}, Lo/enl$d;-><init>(Landroid/view/View;)V

    .line 38
    invoke-virtual {p0, v5, p1}, Lo/enl;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 39
    return-object v4
.end method

.method public getItemCount()I
    .locals 1

    .line 67
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 54
    instance-of v0, p1, Lo/enl$d;

    if-eqz v0, :cond_1

    .line 55
    iget v0, p0, Lo/enl;->a:I

    if-nez v0, :cond_0

    .line 56
    move-object v0, p1

    check-cast v0, Lo/enl$d;

    iget-object v0, v0, Lo/enl$d;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/enl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_smart_alarm_clock:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 57
    :cond_0
    iget v0, p0, Lo/enl;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 58
    move-object v0, p1

    check-cast v0, Lo/enl$d;

    iget-object v0, v0, Lo/enl$d;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/enl;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_list_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    move-object v0, p1

    check-cast v0, Lo/enl$d;

    iget-object v0, v0, Lo/enl$d;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 45
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 46
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->hwsubhearder_alarm:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 47
    new-instance v0, Lo/enl$d;

    invoke-direct {v0, v3}, Lo/enl$d;-><init>(Landroid/view/View;)V

    return-object v0

    .line 49
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
