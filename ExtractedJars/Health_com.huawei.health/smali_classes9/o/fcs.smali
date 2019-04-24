.class public Lo/fcs;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcs$d;,
        Lo/fcs$c;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/List<Lo/acn;>;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Handler;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/List<Ljava/lang/Boolean;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    .line 47
    iput-object p1, p0, Lo/fcs;->c:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lo/fcs;->e:Landroid/os/Handler;

    .line 49
    return-void
.end method

.method private a(Lo/fcs$d;II)V
    .locals 4

    .line 200
    iget-boolean v0, p0, Lo/fcs;->a:Z

    if-eqz v0, :cond_2

    .line 201
    iget-object v0, p1, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 202
    iget-object v0, p1, Lo/fcs$d;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 203
    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p3, v0, :cond_1

    .line 204
    :cond_0
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition or childPosition param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    return-void

    .line 207
    :cond_1
    iget-object v0, p1, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 209
    :cond_2
    iget-object v0, p1, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 210
    iget-object v0, p1, Lo/fcs$d;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 212
    :goto_0
    return-void
.end method

.method static synthetic c(Lo/fcs;)Landroid/os/Handler;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/fcs;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private c(ZIILandroid/view/View;)V
    .locals 1

    .line 230
    if-eqz p1, :cond_0

    .line 231
    const/16 v0, 0x8

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 233
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 235
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/fcs;)Ljava/util/ArrayList;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method private e(Landroid/widget/ImageView;)V
    .locals 1

    .line 219
    iget-object v0, p0, Lo/fcs;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    sget v0, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 222
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 224
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 320
    iget-boolean v0, p0, Lo/fcs;->a:Z

    return v0
.end method

.method public b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/util/List<Lo/acn;>;>;)V"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 53
    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 54
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 55
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 56
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    .line 57
    invoke-virtual {p2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    .line 59
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 60
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 62
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 64
    :cond_0
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_1
    invoke-virtual {p0}, Lo/fcs;->notifyDataSetChanged()V

    .line 69
    return-void
.end method

.method public c()I
    .locals 5

    .line 83
    const/4 v2, 0x0

    .line 84
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 86
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 87
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 88
    add-int/lit8 v2, v2, 0x1

    .line 86
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 85
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 93
    :cond_2
    return v2
.end method

.method public d()I
    .locals 3

    .line 72
    const/4 v1, 0x0

    .line 73
    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v1, v0

    .line 74
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 78
    :cond_0
    return v1
.end method

.method public d(II)Lo/acn;
    .locals 4

    .line 99
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p2, v0, :cond_1

    .line 100
    :cond_0
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition or childPosition param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_1
    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    return-object v0
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/util/List<Ljava/lang/Boolean;>;>;"
        }
    .end annotation

    .line 328
    iget-object v0, p0, Lo/fcs;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e(Z)V
    .locals 0

    .line 324
    iput-boolean p1, p0, Lo/fcs;->a:Z

    .line 325
    return-void
.end method

.method public synthetic getChild(II)Ljava/lang/Object;
    .locals 1

    .line 34
    invoke-virtual {p0, p1, p2}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 108
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13

    .line 120
    if-nez p4, :cond_0

    .line 121
    new-instance v5, Lo/fcs$d;

    invoke-direct {v5}, Lo/fcs$d;-><init>()V

    .line 122
    iget-object v0, p0, Lo/fcs;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_weight_expandlistview_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 124
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_date:I

    .line 125
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcs$d;->b:Landroid/widget/TextView;

    .line 126
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_highpress:I

    .line 127
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcs$d;->c:Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_lowpress:I

    .line 129
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcs$d;->a:Landroid/widget/TextView;

    .line 130
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_highpress_unit:I

    .line 131
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcs$d;->d:Landroid/widget/TextView;

    .line 132
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_divider:I

    .line 133
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v5, Lo/fcs$d;->e:Landroid/widget/TextView;

    .line 134
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_arrow:I

    .line 135
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v5, Lo/fcs$d;->g:Landroid/widget/ImageView;

    .line 136
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_child_checkbox:I

    .line 137
    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v5, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    .line 138
    sget v0, Lcom/huawei/ui/main/R$id;->weight_history_img:I

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v5, Lo/fcs$d;->k:Landroid/widget/ImageView;

    .line 139
    move-object/from16 v0, p4

    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fcs$d;

    .line 144
    :goto_0
    iget-object v0, v5, Lo/fcs$d;->g:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Lo/fcs;->e(Landroid/widget/ImageView;)V

    .line 146
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    if-ltz p2, :cond_1

    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p2, v0, :cond_2

    .line 147
    :cond_1
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition or childPosition param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    return-object p4

    .line 150
    :cond_2
    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/acn;

    .line 151
    iget-object v0, p0, Lo/fcs;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v7

    .line 152
    iget-object v0, v5, Lo/fcs$d;->b:Landroid/widget/TextView;

    invoke-virtual {v6}, Lo/acn;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    invoke-virtual {v6}, Lo/acn;->d()D

    move-result-wide v8

    .line 154
    invoke-virtual {v6}, Lo/acn;->b()D

    move-result-wide v10

    .line 155
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v12

    .line 156
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 157
    iget-object v0, v5, Lo/fcs$d;->c:Landroid/widget/TextView;

    invoke-static {v8, v9}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, v5, Lo/fcs$d;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 160
    :cond_3
    iget-object v0, v5, Lo/fcs$d;->c:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v8, v9, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    iget-object v0, v5, Lo/fcs$d;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    :goto_1
    const-wide/16 v0, 0x0

    cmpl-double v0, v10, v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x12

    if-lt v12, v0, :cond_4

    const/16 v0, 0x41

    if-le v12, v0, :cond_5

    .line 165
    :cond_4
    iget-object v0, v5, Lo/fcs$d;->a:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 167
    :cond_5
    iget-object v0, v5, Lo/fcs$d;->a:Landroid/widget/TextView;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-static {v10, v11, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    :goto_2
    iget-object v0, v5, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    new-instance v1, Lo/fcs$4;

    invoke-direct {v1, p0, v5, p1, p2}, Lo/fcs$4;-><init>(Lo/fcs;Lo/fcs$d;II)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 185
    iget-object v0, v5, Lo/fcs$d;->e:Landroid/widget/TextView;

    move/from16 v1, p3

    invoke-direct {p0, v1, p1, p2, v0}, Lo/fcs;->c(ZIILandroid/view/View;)V

    .line 187
    invoke-direct {p0, v5, p1, p2}, Lo/fcs;->a(Lo/fcs$d;II)V

    .line 189
    iget-object v0, v5, Lo/fcs$d;->k:Landroid/widget/ImageView;

    invoke-static {v6, v0}, Lo/fej;->e(Lo/acn;Landroid/widget/ImageView;)V

    .line 191
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 4

    .line 244
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 245
    :cond_0
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/4 v0, -0x1

    return v0

    .line 248
    :cond_1
    iget-object v0, p0, Lo/fcs;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 4

    .line 253
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_1

    .line 254
    :cond_0
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition param exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_1
    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .line 262
    iget-object v0, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 267
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 274
    if-nez p3, :cond_0

    .line 275
    new-instance v6, Lo/fcs$c;

    invoke-direct {v6}, Lo/fcs$c;-><init>()V

    .line 276
    iget-object v0, p0, Lo/fcs;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_weight_expandlistview_father_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 278
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_father_textview1:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/fcs$c;->d:Landroid/widget/TextView;

    .line 279
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_father_avg_textview:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/fcs$c;->b:Landroid/widget/TextView;

    .line 280
    iget-object v0, v6, Lo/fcs$c;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_average:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_father_textview2:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/fcs$c;->e:Landroid/widget/TextView;

    .line 282
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_history_listview_father_textview2_unit:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lo/fcs$c;->a:Landroid/widget/TextView;

    .line 283
    sget v0, Lcom/huawei/ui/main/R$id;->father_img_arrow:I

    invoke-static {p3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lo/fcs$c;->c:Landroid/widget/ImageView;

    .line 284
    sget v0, Lcom/huawei/ui/main/R$id;->weight_father_divider:I

    invoke-static {p3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v6, Lo/fcs$c;->g:Landroid/view/View;

    .line 285
    invoke-virtual {p3, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 287
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fcs$c;

    .line 289
    :goto_0
    iget-object v0, v6, Lo/fcs$c;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 292
    :try_start_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    iget-object v0, v6, Lo/fcs$c;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 294
    iget-object v0, v6, Lo/fcs$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_lbs:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 296
    :cond_1
    iget-object v0, v6, Lo/fcs$c;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/fcs;->d:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    float-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    iget-object v0, v6, Lo/fcs$c;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/fcs;->c:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    :goto_1
    goto :goto_2

    .line 299
    :catch_0
    move-exception v7

    .line 300
    const-string v0, "UIHLH_WeightExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_2
    if-eqz p2, :cond_2

    .line 304
    iget-object v0, v6, Lo/fcs$c;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    .line 306
    :cond_2
    iget-object v0, v6, Lo/fcs$c;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 309
    :goto_3
    if-nez p1, :cond_3

    .line 310
    iget-object v0, v6, Lo/fcs$c;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 312
    :cond_3
    iget-object v0, v6, Lo/fcs$c;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 316
    :goto_4
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 113
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 239
    const/4 v0, 0x1

    return v0
.end method
