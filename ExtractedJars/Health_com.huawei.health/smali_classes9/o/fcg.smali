.class public Lo/fcg;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcg$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/fcg$c;>;"
    }
.end annotation


# instance fields
.field private a:Lo/fdk;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aht;>;"
        }
    .end annotation
.end field

.field private c:I

.field d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/fdk;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    .line 37
    iput-object p2, p0, Lo/fcg;->a:Lo/fdk;

    .line 38
    iput-object p1, p0, Lo/fcg;->d:Landroid/content/Context;

    .line 39
    return-void
.end method

.method static synthetic a(Lo/fcg;)Lo/fdk;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/fcg;->a:Lo/fdk;

    return-object v0
.end method

.method static synthetic b(Lo/fcg;)I
    .locals 2

    .line 23
    iget v0, p0, Lo/fcg;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/fcg;->c:I

    return v0
.end method

.method static synthetic c(Lo/fcg;)I
    .locals 1

    .line 23
    iget v0, p0, Lo/fcg;->c:I

    return v0
.end method

.method static synthetic e(Lo/fcg;)I
    .locals 2

    .line 23
    iget v0, p0, Lo/fcg;->c:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lo/fcg;->c:I

    return v0
.end method


# virtual methods
.method public b(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/aht;>;)Ljava/util/List<Lo/aht;>;"
        }
    .end annotation

    .line 42
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 43
    :cond_0
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    return-object v0

    .line 45
    :cond_1
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 46
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    .line 49
    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 50
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 51
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lo/fcg;->notifyDataSetChanged()V

    .line 57
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    return-object v0
.end method

.method public b(Lo/fcg$c;I)V
    .locals 8

    .line 69
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aht;

    .line 70
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    iget-object v0, v4, Lo/aht;->a:Lcom/huawei/hihealth/HiHealthData;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 71
    :cond_0
    return-void

    .line 74
    :cond_1
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_2

    .line 75
    iget-object v0, p1, Lo/fcg$c;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 77
    :cond_2
    iget-object v0, p1, Lo/fcg$c;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 80
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    invoke-virtual {v4}, Lo/aht;->b()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 82
    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 83
    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_need_claim_weight_data:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 84
    iget-object v0, p1, Lo/fcg$c;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v4}, Lo/aht;->b()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 87
    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 88
    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_need_claim_weight_data:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 89
    iget-object v0, p1, Lo/fcg$c;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    :goto_1
    invoke-virtual {v4}, Lo/aht;->e()Ljava/lang/String;

    move-result-object v5

    .line 92
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 93
    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_measure_time:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 94
    iget-object v0, p1, Lo/fcg$c;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :cond_4
    iget-boolean v0, v4, Lo/aht;->e:Z

    if-eqz v0, :cond_5

    .line 98
    iget-object v0, p1, Lo/fcg$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_checkbox_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 100
    :cond_5
    iget-object v0, p1, Lo/fcg$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_checkbox_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 103
    :goto_2
    iget-object v0, p1, Lo/fcg$c;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/fcg$4;

    invoke-direct {v1, p0, v4, p1}, Lo/fcg$4;-><init>(Lo/fcg;Lo/aht;Lo/fcg$c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object v0, p0, Lo/fcg;->a:Lo/fdk;

    iget-object v1, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/fcg;->c:I

    invoke-interface {v0, v1, v2}, Lo/fdk;->d(II)V

    .line 120
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/fcg$c;
    .locals 4

    .line 62
    new-instance v3, Lo/fcg$c;

    iget-object v0, p0, Lo/fcg;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->item_claim_measure_data:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lo/fcg$c;-><init>(Lo/fcg;Landroid/view/View;)V

    .line 63
    return-object v3
.end method

.method public d()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/aht;>;"
        }
    .end annotation

    .line 138
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 139
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/aht;

    .line 140
    iget-boolean v0, v6, Lo/aht;->e:Z

    if-eqz v0, :cond_0

    .line 141
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_0
    goto :goto_0

    .line 144
    :cond_1
    const-string v0, "PluginDevice_ClaimMeasureDataAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getChooseData data size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-object v4
.end method

.method public d(I)V
    .locals 0

    .line 32
    iput p1, p0, Lo/fcg;->c:I

    .line 33
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/aht;>;"
        }
    .end annotation

    .line 155
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 156
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 157
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/aht;

    iget-boolean v0, v0, Lo/aht;->e:Z

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 161
    :cond_1
    iput-object v3, p0, Lo/fcg;->b:Ljava/util/List;

    .line 162
    const/4 v0, 0x0

    iput v0, p0, Lo/fcg;->c:I

    .line 163
    iget-object v0, p0, Lo/fcg;->a:Lo/fdk;

    iget-object v1, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/fcg;->c:I

    invoke-interface {v0, v1, v2}, Lo/fdk;->d(II)V

    .line 164
    return-object v3
.end method

.method public e(Z)V
    .locals 5

    .line 124
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aht;

    .line 125
    iput-boolean p1, v4, Lo/aht;->e:Z

    .line 126
    if-eqz p1, :cond_0

    .line 127
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/fcg;->c:I

    goto :goto_1

    .line 129
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/fcg;->c:I

    .line 131
    :goto_1
    invoke-virtual {p0}, Lo/fcg;->notifyDataSetChanged()V

    .line 132
    iget-object v0, p0, Lo/fcg;->a:Lo/fdk;

    iget-object v1, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/fcg;->c:I

    invoke-interface {v0, v1, v2}, Lo/fdk;->d(II)V

    .line 133
    goto :goto_0

    .line 135
    :cond_1
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 150
    iget-object v0, p0, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Lo/fcg$c;

    invoke-virtual {p0, v0, p2}, Lo/fcg;->b(Lo/fcg$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 23
    invoke-virtual {p0, p1, p2}, Lo/fcg;->c(Landroid/view/ViewGroup;I)Lo/fcg$c;

    move-result-object v0

    return-object v0
.end method
