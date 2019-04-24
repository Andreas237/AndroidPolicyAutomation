.class public Lo/enq;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/enq$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 26
    iput-object p1, p0, Lo/enq;->b:Landroid/content/Context;

    .line 27
    iput p2, p0, Lo/enq;->a:I

    .line 28
    return-void
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 32
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 37
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->hwsubhearder_alarm:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 38
    new-instance v5, Lo/enq$c;

    invoke-direct {v5, v4}, Lo/enq$c;-><init>(Landroid/view/View;)V

    .line 39
    invoke-virtual {p0, v5, p1}, Lo/enq;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 40
    return-object v4
.end method

.method public getItemCount()I
    .locals 1

    .line 65
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 55
    instance-of v0, p1, Lo/enq$c;

    if-eqz v0, :cond_0

    .line 56
    iget v0, p0, Lo/enq;->a:I

    if-nez v0, :cond_0

    .line 57
    move-object v0, p1

    check-cast v0, Lo/enq$c;

    iget-object v0, v0, Lo/enq$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/enq;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_setting_disturb_desc_can_disturb_content:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    :cond_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 46
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 47
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->hwsubhearder_alarm:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 48
    new-instance v0, Lo/enq$c;

    invoke-direct {v0, v3}, Lo/enq$c;-><init>(Landroid/view/View;)V

    return-object v0

    .line 50
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
