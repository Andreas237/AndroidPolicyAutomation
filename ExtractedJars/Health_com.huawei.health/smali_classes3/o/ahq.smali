.class public Lo/ahq;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahq$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/ahq$e;>;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Lo/ajl;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ahp;>;"
        }
    .end annotation
.end field

.field e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;Lo/ajl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ahp;>;Landroid/content/Context;Lo/ajl;)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 42
    iput-object p1, p0, Lo/ahq;->c:Ljava/util/List;

    .line 43
    iput-object p2, p0, Lo/ahq;->e:Landroid/content/Context;

    .line 44
    iput-object p3, p0, Lo/ahq;->b:Lo/ajl;

    .line 45
    return-void
.end method

.method static synthetic a(Lo/ahq;)I
    .locals 1

    .line 29
    iget v0, p0, Lo/ahq;->a:I

    return v0
.end method

.method static synthetic c(Lo/ahq;)I
    .locals 2

    .line 29
    iget v0, p0, Lo/ahq;->a:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lo/ahq;->a:I

    return v0
.end method

.method static synthetic d(Lo/ahq;)Lo/ajl;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/ahq;->b:Lo/ajl;

    return-object v0
.end method

.method static synthetic e(Lo/ahq;)I
    .locals 2

    .line 29
    iget v0, p0, Lo/ahq;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lo/ahq;->a:I

    return v0
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 126
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ahp;

    .line 127
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/ahp;->b(Z)V

    .line 128
    const/4 v0, 0x0

    iput v0, p0, Lo/ahq;->a:I

    .line 129
    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {p0}, Lo/ahq;->notifyDataSetChanged()V

    .line 131
    iget-object v0, p0, Lo/ahq;->b:Lo/ajl;

    iget-object v1, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/ahq;->a:I

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    .line 132
    return-void
.end method

.method public c()V
    .locals 5

    .line 117
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ahp;

    .line 118
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/ahp;->b(Z)V

    .line 119
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/ahq;->a:I

    .line 120
    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p0}, Lo/ahq;->notifyDataSetChanged()V

    .line 122
    iget-object v0, p0, Lo/ahq;->b:Lo/ajl;

    iget-object v1, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/ahq;->a:I

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    .line 123
    return-void
.end method

.method public d()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/ahp;>;"
        }
    .end annotation

    .line 155
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 156
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 157
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ahp;

    iget-boolean v0, v0, Lo/ahp;->a:Z

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 161
    :cond_1
    iput-object v3, p0, Lo/ahq;->c:Ljava/util/List;

    .line 162
    const/4 v0, 0x0

    iput v0, p0, Lo/ahq;->a:I

    .line 163
    iget-object v0, p0, Lo/ahq;->b:Lo/ajl;

    iget-object v1, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/ahq;->a:I

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    .line 164
    return-object v3
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/ahq$e;
    .locals 4

    .line 49
    new-instance v3, Lo/ahq$e;

    iget-object v0, p0, Lo/ahq;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->item_wifi_user_clear:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lo/ahq$e;-><init>(Lo/ahq;Landroid/view/View;)V

    .line 50
    return-object v3
.end method

.method public e()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/ahp;>;"
        }
    .end annotation

    .line 137
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 138
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ahp;

    .line 139
    invoke-virtual {v6}, Lo/ahp;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    :cond_0
    goto :goto_0

    .line 143
    :cond_1
    const-string v0, "PluginDevice_UserClearAdapter"

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

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-object v4
.end method

.method public e(Lo/ahq$e;I)V
    .locals 9

    .line 57
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ahp;

    .line 58
    if-eqz v4, :cond_0

    iget-object v0, v4, Lo/ahp;->e:Lo/acu;

    if-nez v0, :cond_1

    .line 59
    :cond_0
    const-string v0, "PluginDevice_UserClearAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bean is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-void

    .line 63
    :cond_1
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_2

    .line 64
    iget-object v0, p1, Lo/ahq$e;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p1, Lo/ahq$e;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    :goto_0
    invoke-virtual {v4}, Lo/ahp;->d()Lo/acu;

    move-result-object v5

    .line 70
    iget-object v0, p0, Lo/ahq;->e:Landroid/content/Context;

    iget-object v1, p1, Lo/ahq$e;->a:Landroid/widget/TextView;

    iget-object v2, p1, Lo/ahq$e;->d:Landroid/widget/ImageView;

    invoke-static {v0, v5, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiBodyFatScaleDataManagerFragment;->setUserNameAndPhoto(Landroid/content/Context;Lo/acu;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 72
    iget-boolean v0, v4, Lo/ahp;->a:Z

    if-eqz v0, :cond_3

    .line 73
    iget-object v0, p1, Lo/ahq$e;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_checkbox_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 75
    :cond_3
    iget-object v0, p1, Lo/ahq$e;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_checkbox_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 78
    :goto_1
    iget-object v0, p1, Lo/ahq$e;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/ahq$1;

    invoke-direct {v1, p0, v4, p1}, Lo/ahq$1;-><init>(Lo/ahq;Lo/ahp;Lo/ahq$e;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    invoke-virtual {v4}, Lo/ahp;->b()Ljava/lang/Double;

    move-result-object v6

    .line 97
    if-nez v6, :cond_4

    .line 98
    iget-object v0, p1, Lo/ahq$e;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/ahq;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_no_record:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 100
    :cond_4
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 101
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 102
    iget-object v0, p0, Lo/ahq;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 103
    iget-object v0, p1, Lo/ahq$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 106
    iget-object v0, p0, Lo/ahq;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 107
    iget-object v0, p1, Lo/ahq$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    :goto_2
    iget-object v0, p0, Lo/ahq;->b:Lo/ajl;

    iget-object v1, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lo/ahq;->a:I

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    .line 113
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 150
    iget-object v0, p0, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/ahq$e;

    invoke-virtual {p0, v0, p2}, Lo/ahq;->e(Lo/ahq$e;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lo/ahq;->d(Landroid/view/ViewGroup;I)Lo/ahq$e;

    move-result-object v0

    return-object v0
.end method
