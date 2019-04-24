.class public Lo/bvg;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvg$d;,
        Lo/bvg$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private i:Landroid/widget/ImageView;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bvj;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lo/bvg;->a:I

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/bvg;->b:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/bvg;->d:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/bvg;->c:I

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvg;->i:Landroid/widget/ImageView;

    .line 47
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    .line 48
    :cond_0
    const-string v0, "FitnessHistoryExpandableAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "records is null, empty or context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    return-void

    .line 52
    :cond_1
    invoke-direct {p0, p1}, Lo/bvg;->e(Ljava/util/List;)V

    .line 54
    iput-object p2, p0, Lo/bvg;->e:Landroid/content/Context;

    .line 55
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_dimen_size_56:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bvg;->a:I

    .line 56
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_dimen_size_48:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bvg;->b:I

    .line 57
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_dimen_size_64:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bvg;->d:I

    .line 58
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$dimen;->sug_dimen_size_65:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/bvg;->c:I

    .line 59
    return-void
.end method

.method private c(J)Ljava/lang/String;
    .locals 3

    .line 301
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "Md"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 302
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 6

    .line 117
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 118
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 120
    new-instance v4, Ljava/util/Date;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 121
    new-instance v5, Ljava/util/Date;

    invoke-virtual {p2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 122
    invoke-virtual {v2, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 123
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 124
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 125
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 124
    :goto_0
    return v0
.end method

.method private e(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 63
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 67
    new-instance v5, Lo/bvj;

    invoke-direct {v5}, Lo/bvj;-><init>()V

    .line 68
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/bvj;->a(J)V

    .line 69
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-virtual {v5, v0}, Lo/bvj;->b(F)V

    .line 70
    invoke-virtual {v5, p1}, Lo/bvj;->a(Ljava/util/List;)V

    .line 71
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    return-void

    .line 75
    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v5, v0, :cond_3

    .line 76
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    add-int/lit8 v1, v5, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0, v0, v1}, Lo/bvg;->c(Lcom/huawei/health/suggestion/model/WorkoutRecord;Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 80
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 83
    :cond_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 85
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 86
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 90
    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_5

    .line 94
    new-instance v6, Lo/bvj;

    invoke-direct {v6}, Lo/bvj;-><init>()V

    .line 96
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lo/bvj;->a(J)V

    .line 97
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v6, v0}, Lo/bvj;->a(Ljava/util/List;)V

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    :goto_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 101
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    add-float/2addr v7, v0

    .line 100
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 104
    :cond_4
    invoke-virtual {v6, v7}, Lo/bvj;->b(F)V

    .line 106
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 110
    :cond_5
    return-void
.end method


# virtual methods
.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bvj;>;"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    return-object v0
.end method

.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .line 214
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 220
    int-to-long v0, p2

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 227
    if-nez p4, :cond_1

    .line 228
    new-instance v3, Lo/bvg$d;

    invoke-direct {v3}, Lo/bvg$d;-><init>()V

    .line 229
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fit_history_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p4

    .line 231
    new-instance v4, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/bvg;->d:I

    const/4 v1, -0x1

    invoke-direct {v4, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 233
    invoke-virtual {p4, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_child_item_chief_fit_data_text:I

    .line 235
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    .line 234
    invoke-static {v3, v0}, Lo/bvg$d;->b(Lo/bvg$d;Lo/efy;)Lo/efy;

    .line 236
    sget v0, Lcom/huawei/health/suggestion/R$id;->wear_type_imageView:I

    .line 237
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 236
    invoke-static {v3, v0}, Lo/bvg$d;->b(Lo/bvg$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 238
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_child_item_left_date_text:I

    .line 239
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    .line 238
    invoke-static {v3, v0}, Lo/bvg$d;->d(Lo/bvg$d;Lo/efy;)Lo/efy;

    .line 240
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_item_center_text:I

    .line 241
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    .line 240
    invoke-static {v3, v0}, Lo/bvg$d;->c(Lo/bvg$d;Lo/efy;)Lo/efy;

    .line 242
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fit_history_child_item_right_text:I

    .line 243
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    .line 242
    invoke-static {v3, v0}, Lo/bvg$d;->e(Lo/bvg$d;Lo/efy;)Lo/efy;

    .line 244
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_main_layout_fit_history_bottom_image_interval:I

    .line 245
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 244
    invoke-static {v3, v0}, Lo/bvg$d;->c(Lo/bvg$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 246
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_history_child_top_line:I

    .line 247
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 246
    invoke-static {v3, v0}, Lo/bvg$d;->d(Lo/bvg$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 248
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fit_history_child_right_button:I

    .line 250
    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bvg;->i:Landroid/widget/ImageView;

    .line 251
    iget-object v0, p0, Lo/bvg;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 253
    :cond_0
    invoke-virtual {p4, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 254
    goto :goto_0

    .line 255
    :cond_1
    invoke-virtual {p4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bvg$d;

    .line 258
    :goto_0
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 259
    invoke-static {v3}, Lo/bvg$d;->e(Lo/bvg$d;)Lo/efy;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWearType()I

    move-result v5

    .line 262
    const/4 v0, 0x2

    if-ne v0, v5, :cond_2

    .line 263
    invoke-static {v3}, Lo/bvg$d;->b(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_2:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 264
    invoke-static {v3}, Lo/bvg$d;->b(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 265
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v5, :cond_3

    .line 266
    invoke-static {v3}, Lo/bvg$d;->b(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->ic_watchwear_gray_1:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 267
    invoke-static {v3}, Lo/bvg$d;->b(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 269
    :cond_3
    invoke-static {v3}, Lo/bvg$d;->b(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 273
    :goto_1
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v6

    .line 274
    invoke-static {v3}, Lo/bvg$d;->d(Lo/bvg$d;)Lo/efy;

    move-result-object v0

    invoke-direct {p0, v6, v7}, Lo/bvg;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 276
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v8

    .line 279
    invoke-static {v3}, Lo/bvg$d;->c(Lo/bvg$d;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 281
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v9

    .line 282
    invoke-static {v3}, Lo/bvg$d;->a(Lo/bvg$d;)Lo/efy;

    move-result-object v0

    div-int/lit16 v1, v9, 0x3e8

    invoke-static {v1}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 284
    if-eqz p3, :cond_4

    .line 285
    invoke-static {v3}, Lo/bvg$d;->h(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 287
    :cond_4
    invoke-static {v3}, Lo/bvg$d;->h(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 289
    :goto_2
    if-nez p2, :cond_5

    .line 290
    new-instance v10, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/bvg;->c:I

    const/4 v1, -0x1

    invoke-direct {v10, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 292
    invoke-virtual {p4, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 293
    invoke-static {v3}, Lo/bvg$d;->g(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 294
    goto :goto_3

    .line 295
    :cond_5
    invoke-static {v3}, Lo/bvg$d;->g(Lo/bvg$d;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 297
    :goto_3
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 1

    .line 308
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 131
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 1

    .line 137
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getGroupId(I)J
    .locals 2

    .line 143
    int-to-long v0, p1

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 150
    if-nez p3, :cond_0

    .line 151
    new-instance v4, Lo/bvg$b;

    invoke-direct {v4}, Lo/bvg$b;-><init>()V

    .line 152
    iget-object v0, p0, Lo/bvg;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fit_history_father_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    .line 153
    new-instance v5, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/bvg;->a:I

    const/4 v1, -0x1

    invoke-direct {v5, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 155
    invoke-virtual {p3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 156
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_history_father_date:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-static {v4, v0}, Lo/bvg$b;->c(Lo/bvg$b;Lo/efy;)Lo/efy;

    .line 157
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_history_father_kcal:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-static {v4, v0}, Lo/bvg$b;->e(Lo/bvg$b;Lo/efy;)Lo/efy;

    .line 158
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_history_father_arrow:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/bvg$b;->e(Lo/bvg$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 159
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_show_fit_history_father_line:I

    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/bvg$b;->a(Lo/bvg$b;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 161
    invoke-virtual {p3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 162
    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bvg$b;

    .line 165
    :goto_0
    if-nez p1, :cond_1

    .line 166
    new-instance v5, Landroid/widget/AbsListView$LayoutParams;

    iget v0, p0, Lo/bvg;->b:I

    const/4 v1, -0x1

    invoke-direct {v5, v1, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 168
    invoke-virtual {p3, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    invoke-static {v4}, Lo/bvg$b;->a(Lo/bvg$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 171
    goto :goto_1

    .line 172
    :cond_1
    invoke-static {v4}, Lo/bvg$b;->a(Lo/bvg$b;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 174
    :goto_1
    const/4 v5, 0x0

    .line 175
    const-wide/16 v6, 0x0

    .line 178
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->c()J

    move-result-wide v6

    .line 181
    iget-object v0, p0, Lo/bvg;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bvj;

    invoke-virtual {v0}, Lo/bvj;->b()Ljava/util/List;

    move-result-object v8

    .line 182
    const/4 v9, 0x0

    :goto_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 183
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    invoke-static {v0}, Lo/bzr;->d(F)F

    move-result v0

    invoke-static {v0}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v10

    .line 184
    const-string v0, "[^\\d]"

    const-string v1, ""

    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/2addr v5, v0

    .line 182
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 186
    :cond_2
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 187
    const-string v0, "FitnessHistoryExpandableAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "monthCalStr is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x34

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v10

    .line 189
    invoke-static {v4}, Lo/bvg$b;->b(Lo/bvg$b;)Lo/efy;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 190
    invoke-static {v4}, Lo/bvg$b;->d(Lo/bvg$b;)Lo/efy;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bvg;->e:Landroid/content/Context;

    sget v3, Lcom/huawei/health/suggestion/R$string;->sug_finess_kcal1:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 191
    if-eqz p2, :cond_3

    .line 192
    invoke-static {v4}, Lo/bvg$b;->c(Lo/bvg$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_3

    .line 194
    :cond_3
    invoke-static {v4}, Lo/bvg$b;->c(Lo/bvg$b;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_ic_up:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 198
    :goto_3
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 203
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 208
    const/4 v0, 0x1

    return v0
.end method
