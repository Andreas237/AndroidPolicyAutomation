.class public Lo/fcj;
.super Lo/flg$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcj$e;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:I

.field private e:Lo/fdt;


# direct methods
.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 4

    .line 26
    invoke-direct {p0}, Lo/flg$a;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcj;->c:Z

    .line 27
    iput-object p1, p0, Lo/fcj;->b:Landroid/content/Context;

    .line 28
    iput p2, p0, Lo/fcj;->d:I

    .line 29
    iput-boolean p3, p0, Lo/fcj;->a:Z

    .line 30
    const-string v0, "HealthDataStyleA02Adapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowFat = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    return-void
.end method

.method static synthetic b(Lo/fcj;)Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lo/fcj;->c:Z

    return v0
.end method

.method static synthetic c(Lo/fcj;Z)Z
    .locals 0

    .line 17
    iput-boolean p1, p0, Lo/fcj;->c:Z

    return p1
.end method

.method static synthetic e(Lo/fcj;)Lo/fdt;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/fcj;->e:Lo/fdt;

    return-object v0
.end method


# virtual methods
.method public b(I)I
    .locals 1

    .line 39
    const/4 v0, 0x1

    return v0
.end method

.method public b(ILandroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 43
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 44
    new-instance v5, Lo/fcj$e;

    invoke-direct {v5, v4}, Lo/fcj$e;-><init>(Landroid/view/View;)V

    .line 45
    invoke-virtual {p0, v5, p1}, Lo/fcj;->onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V

    .line 46
    return-object v4
.end method

.method public b(Lo/fdt;)V
    .locals 1

    .line 33
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 34
    iput-object p1, p0, Lo/fcj;->e:Lo/fdt;

    .line 36
    :cond_0
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 107
    const/4 v0, 0x1

    return v0
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 3

    .line 61
    instance-of v0, p1, Lo/fcj$e;

    if-eqz v0, :cond_3

    .line 62
    iget v0, p0, Lo/fcj;->d:I

    if-nez v0, :cond_1

    .line 63
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcj;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-boolean v0, p0, Lo/fcj;->a:Z

    if-eqz v0, :cond_0

    .line 65
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_cancel_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcj;->c:Z

    goto :goto_0

    .line 68
    :cond_0
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_public_add:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fcj;->c:Z

    .line 71
    :goto_0
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    new-instance v1, Lo/fcj$1;

    invoke-direct {v1, p0, p1}, Lo/fcj$1;-><init>(Lo/fcj;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 83
    :cond_1
    iget v0, p0, Lo/fcj;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 84
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcj;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_pulse_heart_bmp:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->c:Landroid/widget/ImageView;

    new-instance v1, Lo/fcj$4;

    invoke-direct {v1, p0, p1}, Lo/fcj$4;-><init>(Lo/fcj;Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    :cond_2
    :goto_1
    move-object v0, p1

    check-cast v0, Lo/fcj$e;

    iget-object v0, v0, Lo/fcj$e;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 101
    :cond_3
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 52
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 53
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->hwsubheader_title_more_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 54
    new-instance v0, Lo/fcj$e;

    invoke-direct {v0, v3}, Lo/fcj$e;-><init>(Landroid/view/View;)V

    return-object v0

    .line 56
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
