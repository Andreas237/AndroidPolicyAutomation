.class public Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field TAG:Ljava/lang/String;

.field private beans:[Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private handler:Landroid/os/Handler;

.field states:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;Ljava/util/HashMap;Landroid/os/Handler;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;[Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;Landroid/os/Handler;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 18
    const-string v0, "NpsAdapter"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->TAG:Ljava/lang/String;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    .line 33
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    array-length v0, p2

    if-lez v0, :cond_0

    .line 34
    array-length v0, p2

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    .line 35
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    :cond_0
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->context:Landroid/content/Context;

    .line 38
    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    .line 39
    iput-object p4, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->handler:Landroid/os/Handler;

    .line 40
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;)Landroid/os/Handler;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->handler:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    array-length v0, v0

    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0

    .line 59
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 67
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=======position:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->beans:[Ljava/lang/String;

    aget-object v5, v0, p1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    .line 78
    if-nez p2, :cond_0

    .line 79
    sget v0, Lcom/huawei/ui/main/R$layout;->nps_single:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 81
    new-instance v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;-><init>()V

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->tv_device_name:I

    .line 83
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;->tvName:Landroid/widget/TextView;

    .line 84
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;

    .line 89
    :goto_0
    iget-object v0, v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;->tvName:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->rb_light:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/CheckBox;

    .line 91
    iput-object v7, v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;->rb_state:Landroid/widget/CheckBox;

    .line 92
    iget-object v0, v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;->rb_state:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;-><init>(Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    const/4 v8, 0x0

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    .line 110
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 111
    :cond_1
    const/4 v8, 0x0

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 114
    :cond_2
    const/4 v8, 0x1

    .line 118
    :goto_1
    iget-object v0, v4, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$ViewHolder;->rb_state:Landroid/widget/CheckBox;

    invoke-virtual {v0, v8}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 119
    return-object p2
.end method
