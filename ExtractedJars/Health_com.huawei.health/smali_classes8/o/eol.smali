.class public Lo/eol;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private b:Landroid/view/LayoutInflater;

.field private c:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eoo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lo/eoo;>;)V"
        }
    .end annotation

    .line 39
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eol;->c:Landroid/content/Context;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eol;->e:Ljava/util/List;

    .line 40
    iput-object p1, p0, Lo/eol;->c:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lo/eol;->c:Landroid/content/Context;

    .line 44
    invoke-direct {p0, p2}, Lo/eol;->a(Ljava/util/List;)V

    .line 45
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/eol;->b:Landroid/view/LayoutInflater;

    .line 46
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eoo;>;)V"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 50
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 51
    return-void
.end method

.method private e(ILandroid/view/View;Lo/eoo;)V
    .locals 6

    .line 120
    sget v0, Lcom/huawei/ui/device/R$id;->alarm_time:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 121
    sget v0, Lcom/huawei/ui/device/R$id;->alarm_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/ui/device/R$id;->alarm_repeat:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 123
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_switch_btn:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/Switch;

    .line 125
    invoke-virtual {p3}, Lo/eoo;->c()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 126
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/Switch;->setChecked(Z)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-virtual {p3}, Lo/eoo;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 130
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/Switch;->setTag(Ljava/lang/Object;)V

    .line 132
    invoke-virtual {p3}, Lo/eoo;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 133
    invoke-virtual {p3}, Lo/eoo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 136
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 139
    :goto_1
    invoke-virtual {p3}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 140
    invoke-virtual {p3}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 143
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    :goto_2
    invoke-virtual {p3}, Lo/eoo;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 147
    invoke-virtual {p3}, Lo/eoo;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 150
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    :goto_3
    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eoo;>;)V"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 55
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 56
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 60
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 65
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 66
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_1
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 73
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 79
    invoke-virtual {p0, p1}, Lo/eol;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eoo;

    .line 80
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 81
    invoke-virtual {v1}, Lo/eoo;->h()I

    move-result v0

    return v0

    .line 83
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 95
    const/4 v4, 0x0

    .line 97
    :try_start_0
    iget-object v0, p0, Lo/eol;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eoo;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 98
    :catch_0
    move-exception v5

    .line 99
    const/4 v0, 0x0

    return-object v0

    .line 101
    :goto_0
    invoke-virtual {v4}, Lo/eoo;->h()I

    move-result v5

    .line 103
    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    .line 105
    :sswitch_0
    goto :goto_1

    .line 107
    :sswitch_1
    const-string v0, "AlarmListAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    if-nez p2, :cond_0

    .line 109
    iget-object v0, p0, Lo/eol;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_alarm_list_item_black:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 111
    :cond_0
    invoke-direct {p0, p1, p2, v4}, Lo/eol;->e(ILandroid/view/View;Lo/eoo;)V

    .line 112
    .line 116
    :goto_1
    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 90
    const/4 v0, 0x2

    return v0
.end method
