.class public Lo/fcd;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcd$d;
    }
.end annotation


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fdf;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Z

.field e:Ljava/text/DateFormat;

.field private k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fdf;>;Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fcd;->c:Z

    .line 44
    iput-object p1, p0, Lo/fcd;->b:Ljava/util/List;

    .line 45
    iput-object p2, p0, Lo/fcd;->k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    .line 46
    invoke-virtual {p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v0

    iput-object v0, p0, Lo/fcd;->e:Ljava/text/DateFormat;

    .line 47
    invoke-virtual {p0}, Lo/fcd;->notifyDataSetChanged()V

    .line 48
    return-void
.end method

.method private a(ILo/fcd$d;)V
    .locals 2

    .line 102
    invoke-static {p2}, Lo/fcd$d;->b(Lo/fcd$d;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lo/fcd$4;

    invoke-direct {v1, p0, p2, p1}, Lo/fcd$4;-><init>(Lo/fcd;Lo/fcd$d;I)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 126
    return-void
.end method

.method static synthetic c(Lo/fcd;)Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/fcd;->k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 83
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 4

    .line 88
    const/4 v2, 0x0

    .line 89
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 90
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 90
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 96
    :cond_1
    return v2
.end method

.method public b(Z)V
    .locals 1

    .line 63
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/fcd;->c:Z

    .line 64
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fdf;>;)V"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 72
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 73
    if-eqz p1, :cond_0

    .line 74
    iput-object p1, p0, Lo/fcd;->b:Ljava/util/List;

    .line 75
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p0}, Lo/fcd;->notifyDataSetChanged()V

    .line 80
    return-void
.end method

.method public c()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Lo/fcd;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public d(Z)V
    .locals 1

    .line 55
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lo/fcd;->d:Z

    .line 56
    return-void
.end method

.method public e(Ljava/lang/Long;)Ljava/lang/String;
    .locals 3

    .line 222
    iget-object v1, p0, Lo/fcd;->e:Ljava/text/DateFormat;

    monitor-enter v1

    .line 223
    :try_start_0
    iget-object v0, p0, Lo/fcd;->e:Ljava/text/DateFormat;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    .line 224
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public e()Z
    .locals 1

    .line 51
    iget-boolean v0, p0, Lo/fcd;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 129
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 139
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 14

    .line 150
    if-nez p2, :cond_0

    .line 152
    new-instance v4, Lo/fcd$d;

    invoke-direct {v4}, Lo/fcd$d;-><init>()V

    .line 153
    iget-object v0, p0, Lo/fcd;->k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_bloodpresure_expandlistview_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 155
    sget v0, Lcom/huawei/ui/main/R$id;->text_bloodpresure_high_low:I

    .line 156
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 155
    invoke-static {v4, v0}, Lo/fcd$d;->a(Lo/fcd$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->text_bloodpresure_date:I

    .line 158
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 157
    invoke-static {v4, v0}, Lo/fcd$d;->b(Lo/fcd$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_history_listview_child_divider:I

    .line 160
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 159
    invoke-static {v4, v0}, Lo/fcd$d;->c(Lo/fcd$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_history_listview_child_arrow:I

    .line 162
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 161
    invoke-static {v4, v0}, Lo/fcd$d;->a(Lo/fcd$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodpresure_history_listview_child_checkbox:I

    .line 164
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 163
    invoke-static {v4, v0}, Lo/fcd$d;->d(Lo/fcd$d;Landroid/widget/CheckBox;)Landroid/widget/CheckBox;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->text_bloodpresure_time:I

    .line 166
    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 165
    invoke-static {v4, v0}, Lo/fcd$d;->e(Lo/fcd$d;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 167
    move-object/from16 v0, p2

    invoke-virtual {v0, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fcd$d;

    .line 171
    :goto_0
    iget-object v0, p0, Lo/fcd;->k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    invoke-static {v4}, Lo/fcd$d;->c(Lo/fcd$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 174
    :cond_1
    invoke-static {v4}, Lo/fcd$d;->c(Lo/fcd$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 177
    :goto_1
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 178
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->b()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Ljava/util/Date;->setTime(J)V

    .line 179
    new-instance v6, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 181
    invoke-static {v4}, Lo/fcd$d;->e(Lo/fcd$d;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/fdf;

    invoke-virtual {v1}, Lo/fdf;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lo/fcd;->e(Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    invoke-static {v4}, Lo/fcd$d;->a(Lo/fcd$d;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v8

    .line 185
    :try_start_0
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->c()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 186
    invoke-virtual {v8, v9}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 187
    iget-object v0, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    invoke-virtual {v0}, Lo/fdf;->d()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 188
    invoke-virtual {v8, v11}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 189
    iget-object v0, p0, Lo/fcd;->k:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_mmhg_str:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 190
    invoke-static {v4}, Lo/fcd$d;->d(Lo/fcd$d;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    goto :goto_2

    .line 191
    :catch_0
    move-exception v9

    .line 192
    const-string v0, "UIHLH_BloodpresureExpandablelistviewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    :goto_2
    invoke-direct {p0, p1, v4}, Lo/fcd;->a(ILo/fcd$d;)V

    .line 195
    add-int/lit8 v0, p1, 0x1

    iget-object v1, p0, Lo/fcd;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 196
    invoke-static {v4}, Lo/fcd$d;->h(Lo/fcd$d;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 198
    :cond_2
    invoke-static {v4}, Lo/fcd$d;->h(Lo/fcd$d;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 200
    :goto_3
    iget-boolean v0, p0, Lo/fcd;->d:Z

    if-eqz v0, :cond_3

    .line 201
    invoke-static {v4}, Lo/fcd$d;->b(Lo/fcd$d;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 202
    invoke-static {v4}, Lo/fcd$d;->c(Lo/fcd$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 203
    invoke-static {v4}, Lo/fcd$d;->b(Lo/fcd$d;)Landroid/widget/CheckBox;

    move-result-object v0

    iget-object v1, p0, Lo/fcd;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_4

    .line 205
    :cond_3
    invoke-static {v4}, Lo/fcd$d;->b(Lo/fcd$d;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 206
    invoke-static {v4}, Lo/fcd$d;->c(Lo/fcd$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 208
    :goto_4
    return-object p2
.end method

.method public hasStableIds()Z
    .locals 1

    .line 144
    const/4 v0, 0x1

    return v0
.end method
