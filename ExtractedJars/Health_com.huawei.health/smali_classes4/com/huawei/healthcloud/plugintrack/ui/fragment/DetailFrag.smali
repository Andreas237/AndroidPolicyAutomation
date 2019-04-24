.class public Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final r:I

.field private static final s:I

.field private static final t:I

.field private static final v:I

.field private static final w:I

.field private static final x:I

.field private static final y:I


# instance fields
.field private A:Landroid/widget/LinearLayout;

.field private B:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private C:Lo/che;

.field private D:Lo/egb;

.field private E:Landroid/widget/LinearLayout;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/widget/LinearLayout;

.field private H:Landroid/widget/LinearLayout;

.field private I:Ljava/lang/String;

.field private J:Z

.field private K:Lo/end;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/widget/LinearLayout;

.field private N:Landroid/widget/LinearLayout;

.field private a:Lo/chk;

.field private b:Landroid/view/View;

.field private c:Landroid/content/Context;

.field private d:Lo/egb;

.field private e:Lo/egb;

.field private f:Lo/chk;

.field private g:Lo/chk;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;>;"
        }
    .end annotation
.end field

.field private k:Lo/egb;

.field private l:Lo/egb;

.field private m:Lo/egb;

.field private n:Lo/egb;

.field private o:Lo/egb;

.field private p:Lcom/huawei/up/model/UserInfomation;

.field private q:Landroid/content/res/Resources;

.field private u:J

.field private z:Lo/cgt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 83
    const-string v0, "#ff3320"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->s:I

    .line 84
    const-string v0, "#fb6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->t:I

    .line 85
    const-string v0, "#f5a623"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->r:I

    .line 86
    const-string v0, "#e6d420"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->w:I

    .line 87
    const-string v0, "#75df3e"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->x:I

    .line 88
    const-string v0, "#01c1f2"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->y:I

    .line 89
    const-string v0, "#1f8dff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->v:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->C:Lo/che;

    .line 100
    const-string v0, "--"

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->I:Ljava/lang/String;

    return-void
.end method

.method private a()Z
    .locals 6

    .line 266
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "swim_avg_swolf"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_swolf_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 269
    const/4 v0, 0x0

    return v0

    .line 272
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "swim_avg_swolf"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 274
    if-gtz v4, :cond_2

    .line 275
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_swolf_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 277
    const/4 v0, 0x0

    return v0

    .line 280
    :cond_2
    int-to-double v0, v4

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 282
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_swolf:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 283
    const/4 v0, 0x1

    return v0
.end method

.method private b()V
    .locals 8

    .line 193
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " showSwim"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 195
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-ne v0, v1, :cond_3

    .line 196
    :cond_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->e()Z

    move-result v4

    .line 197
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c()Z

    move-result v5

    .line 198
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->a()Z

    move-result v6

    .line 199
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    if-eqz v6, :cond_2

    .line 200
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_swim_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 202
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$3;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$3;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)V

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    goto :goto_0

    .line 211
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->L:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 213
    :goto_0
    goto :goto_1

    .line 214
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->L:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 216
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)Landroid/content/Context;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    return-object v0
.end method

.method private c()Z
    .locals 7

    .line 243
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "swim_pull_freq"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 245
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_pace_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 246
    const/4 v0, 0x0

    return v0

    .line 249
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "swim_pull_freq"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 251
    if-gtz v5, :cond_2

    .line 252
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_pace_line:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 254
    const/4 v0, 0x0

    return v0

    .line 256
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_stroke_rate_unit:I

    invoke-virtual {v0, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v6

    .line 258
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    int-to-double v1, v5

    .line 259
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_stroke_rate_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 261
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->f()V

    return-void
.end method

.method private e(Ljava/lang/Integer;)V
    .locals 8

    .line 342
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    .line 343
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_recotime_hour_formart:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 344
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->i:Lo/egb;

    const-string v1, "\\d"

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$style;->track_detail_time_b:I

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$style;->track_detail_time_s:I

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v1, v5, v2, v3, v4}, Lo/cgl;->e(Ljava/lang/String;Ljava/lang/String;IILandroid/content/Context;)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 345
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 346
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 347
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    invoke-virtual {v6, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 349
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 350
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "MEdHH"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 352
    :cond_0
    new-instance v7, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "MEdhh"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 354
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->n:Lo/egb;

    invoke-virtual {v6}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 355
    goto :goto_1

    .line 356
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_recover_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 358
    :goto_1
    return-void
.end method

.method private e()Z
    .locals 8

    .line 219
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v5

    .line 222
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-lez v0, :cond_0

    .line 223
    invoke-static {v5}, Lo/cgl;->g(F)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_pace_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 226
    const/4 v0, 0x0

    return v0

    .line 229
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit_mi:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_swim_pace_unit:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x64

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x64

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 235
    :goto_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_pace:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_swim_avg_pace_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 238
    const/4 v0, 0x1

    return v0
.end method

.method private f()V
    .locals 7

    .line 392
    new-instance v4, Landroid/content/ComponentName;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity"

    invoke-direct {v4, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 394
    invoke-virtual {v5, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 395
    invoke-virtual {p0, v5}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->startActivity(Landroid/content/Intent;)V

    .line 396
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 397
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    const-string v0, "dataType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->hX:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 400
    return-void
.end method

.method private g()V
    .locals 3

    .line 303
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_wear_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 304
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_excise_effect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_vo2max:I

    .line 305
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_recover_time:I

    .line 306
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_aerobic_excise_effect:I

    .line 307
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 308
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 311
    :cond_0
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$1;

    invoke-direct {v0, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$1;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)V

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    :goto_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 287
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 289
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->p()V

    .line 293
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->n()V

    .line 294
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->i()V

    .line 295
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->k()V

    .line 296
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->g()V

    goto :goto_0

    .line 298
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->A:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 300
    :goto_0
    return-void
.end method

.method private i()V
    .locals 7

    .line 361
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "max_met"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 366
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "max_met"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/high16 v1, 0x10000

    div-int v5, v0, v1

    .line 367
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->p:Lcom/huawei/up/model/UserInfomation;

    invoke-static {v0}, Lo/cgl;->b(Lcom/huawei/up/model/UserInfomation;)[Ljava/lang/Integer;

    move-result-object v6

    .line 368
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->f:Lo/chk;

    int-to-float v1, v5

    invoke-virtual {v0, v1}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    invoke-static {v6}, Lo/cgl;->e([Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lo/chk;->e(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x7

    new-array v1, v1, [I

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->s:I

    const/4 v3, 0x0

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->t:I

    const/4 v3, 0x1

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->r:I

    const/4 v3, 0x2

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->w:I

    const/4 v3, 0x3

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->x:I

    const/4 v3, 0x4

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->y:I

    const/4 v3, 0x5

    aput v2, v1, v3

    sget v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->v:I

    const/4 v3, 0x6

    aput v2, v1, v3

    .line 369
    invoke-virtual {v0, v1}, Lo/chk;->c([I)Lo/chk;

    move-result-object v0

    .line 370
    invoke-virtual {v0, v6}, Lo/chk;->c([Ljava/lang/Integer;)Lo/chk;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->J:Z

    invoke-virtual {v0, v1}, Lo/chk;->a(Z)Lo/chk;

    .line 371
    if-lez v5, :cond_0

    .line 373
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->k:Lo/egb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egb;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->h:Lo/egb;

    int-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->D:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_detail_ox_level:I

    invoke-virtual {p0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v3, v6, v5}, Lo/cgl;->c(Landroid/content/Context;[Ljava/lang/Integer;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_vo2max:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$2;

    invoke-direct {v1, p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag$2;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_vo2max:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 386
    :goto_0
    goto :goto_1

    .line 387
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_vo2max:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 389
    :goto_1
    return-void
.end method

.method private k()V
    .locals 3

    .line 326
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x104

    if-ne v0, v1, :cond_0

    .line 327
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_recover_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 328
    return-void

    .line 331
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "recovery_time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "recovery_time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 334
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    div-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 335
    invoke-direct {p0, v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->e(Ljava/lang/Integer;)V

    .line 336
    goto :goto_0

    .line 337
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_recover_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 339
    :goto_0
    return-void
.end method

.method private l()V
    .locals 7

    .line 491
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 492
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 494
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m()V

    .line 495
    return-void

    .line 498
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-static {v0}, Lo/cds;->b(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 499
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 500
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 501
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 503
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 504
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$dimen;->hw_show_public_margin_30dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 505
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m:Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 507
    goto :goto_1

    .line 510
    :cond_1
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 511
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v4

    .line 512
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_hwh_motiontrack_unit_yd:I

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v6

    .line 513
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 514
    goto :goto_0

    .line 515
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_fitness_data_list_activity_meter_unit:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 518
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    if-nez v0, :cond_3

    .line 519
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 520
    return-void

    .line 522
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Lo/cgl;->h(F)Ljava/lang/String;

    move-result-object v6

    .line 523
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 527
    :goto_1
    return-void
.end method

.method private m()V
    .locals 5

    .line 476
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    goto :goto_0

    .line 479
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 481
    :goto_0
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    if-nez v0, :cond_2

    .line 482
    :cond_1
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDefaultDistance() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 484
    return-void

    .line 486
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Lo/cgl;->e(D)Ljava/lang/String;

    move-result-object v4

    .line 487
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    invoke-virtual {v0, v4}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 488
    return-void
.end method

.method private n()V
    .locals 9

    .line 427
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "anaerobic_exercise_etraining_effect"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 428
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "anaerobic_exercise_etraining_effect"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 429
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 431
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->d:Lo/egb;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 434
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_aerobic_excise_effect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 437
    :goto_0
    const/4 v6, 0x6

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    .line 439
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->e(F)F

    move-result v7

    .line 440
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cgl;->e(Landroid/content/Context;F)Ljava/lang/String;

    move-result-object v8

    .line 441
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->g:Lo/chk;

    invoke-virtual {v0, v7}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->e(F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/chk;->e([F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/chk;->c(Ljava/lang/String;)Lo/chk;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->J:Z

    invoke-virtual {v0, v1}, Lo/chk;->a(Z)Lo/chk;

    .line 442
    goto :goto_1

    .line 443
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_aerobic_excise_effect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 445
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private o()V
    .locals 2

    .line 454
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x10a

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 455
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    const/16 v1, 0x106

    if-ne v0, v1, :cond_3

    .line 456
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 457
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 458
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->d()V

    goto :goto_0

    .line 460
    :cond_2
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l()V

    goto :goto_0

    .line 463
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 464
    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 465
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->d()V

    goto :goto_0

    .line 467
    :cond_5
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m()V

    .line 473
    :goto_0
    return-void
.end method

.method private p()V
    .locals 9

    .line 405
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "etraining_effect"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 406
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    const-string v1, "etraining_effect"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x41200000    # 10.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 407
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->e:Lo/egb;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 412
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_excise_effect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 415
    :goto_0
    const/4 v6, 0x6

    new-array v6, v6, [F

    fill-array-data v6, :array_0

    .line 417
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Lo/cgl;->e(F)F

    move-result v7

    .line 418
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/cgl;->e(Landroid/content/Context;F)Ljava/lang/String;

    move-result-object v8

    .line 419
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->a:Lo/chk;

    invoke-virtual {v0, v7}, Lo/chk;->c(F)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->d(Z)Lo/chk;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/chk;->e(F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/chk;->e([F)Lo/chk;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/chk;->c(Ljava/lang/String;)Lo/chk;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->J:Z

    invoke-virtual {v0, v1}, Lo/chk;->a(Z)Lo/chk;

    .line 420
    goto :goto_1

    .line 421
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->layout_excise_effect:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 423
    :goto_1
    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x40000000    # 2.0f
        0x40400000    # 3.0f
        0x40800000    # 4.0f
        0x40a00000    # 5.0f
        0x40c00000    # 6.0f
    .end array-data
.end method

.method private t()V
    .locals 30

    .line 546
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 547
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 548
    invoke-virtual {v0}, Lo/cgt;->a()Lo/cex;

    move-result-object v0

    invoke-virtual {v0}, Lo/cex;->h()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 550
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 552
    new-instance v8, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundContactTime()I

    move-result v0

    invoke-direct {v8, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;-><init>(I)V

    .line 553
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_name:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_ground_contact_time:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 554
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 555
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_level:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/egb;

    .line 556
    invoke-virtual {v8}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->acquireLevelShortTip()I

    move-result v0

    invoke-virtual {v9, v0}, Lo/egb;->setText(I)V

    .line 557
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->acquireLevel()I

    move-result v1

    invoke-static {v1}, Lo/cdl;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v9, v0}, Lo/egb;->setTextColor(I)V

    .line 558
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_msec_unit:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 559
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    new-instance v10, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    invoke-direct {v10, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;-><init>(I)V

    .line 562
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgGroundImpactAcceleration()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 564
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_name:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_ground_impact_acceleration:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 565
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual {v0, v11}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 566
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_level:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/egb;

    .line 567
    invoke-virtual {v10}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->acquireLevelShortTip()I

    move-result v0

    invoke-virtual {v12, v0}, Lo/egb;->setText(I)V

    .line 568
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->acquireLevel()I

    move-result v1

    invoke-static {v1}, Lo/cdl;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v12, v0}, Lo/egb;->setTextColor(I)V

    .line 569
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_unit:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_gravity_unit:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 570
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 573
    new-instance v13, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v0

    invoke-direct {v13, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;-><init>(I)V

    .line 576
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_name:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_eversion_excursion:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 577
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_degree_unit_with_value:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v3}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v5}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgEversionExcursion()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 578
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_level:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/egb;

    .line 579
    invoke-virtual {v13}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->acquireLevelShortTip()I

    move-result v0

    invoke-virtual {v14, v0}, Lo/egb;->setText(I)V

    .line 580
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->acquireLevel()I

    move-result v1

    invoke-static {v1}, Lo/cdl;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v14, v0}, Lo/egb;->setTextColor(I)V

    .line 581
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v15

    .line 586
    const/16 v16, 0x0

    .line 587
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 588
    const/high16 v0, 0x45610000    # 3600.0f

    div-float v16, v0, v15

    .line 591
    :cond_0
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v1

    move/from16 v2, v16

    invoke-direct {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;-><init>(IF)V

    move-object/from16 v17, v0

    .line 594
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_name:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_running_posture_avg_swing_angle:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 595
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$plurals;->IDS_degree_unit_with_value:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v3}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v5}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgSwingAngle()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 596
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_level:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/egb;

    .line 597
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->acquireLevelShortTip()I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/egb;->setText(I)V

    .line 598
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->acquireLevel()I

    move-result v1

    invoke-static {v1}, Lo/cdl;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/egb;->setTextColor(I)V

    .line 599
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->proportion_bar:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/end;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->K:Lo/end;

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgForeFootStrikePattern()I

    move-result v19

    .line 603
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgWholeFootStrikePattern()I

    move-result v20

    .line 604
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHindFootStrikePattern()I

    move-result v21

    .line 605
    add-int v0, v19, v20

    add-int v0, v0, v21

    int-to-double v1, v0

    move-wide/from16 v22, v1

    .line 606
    move/from16 v0, v19

    int-to-double v0, v0

    div-double v0, v0, v22

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v2, v0

    move/from16 v24, v2

    .line 607
    move/from16 v0, v21

    int-to-double v0, v0

    div-double v0, v0, v22

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v2, v0

    move/from16 v25, v2

    .line 608
    rsub-int/lit8 v0, v24, 0x64

    sub-int v26, v0, v25

    .line 609
    if-gez v26, :cond_1

    .line 610
    const/16 v26, 0x0

    .line 612
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    new-instance v1, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;

    move/from16 v2, v24

    move/from16 v3, v26

    move/from16 v4, v25

    invoke-direct {v1, v2, v3, v4}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;-><init>(III)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    move/from16 v0, v24

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v27

    .line 614
    move/from16 v0, v26

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v28

    .line 615
    move/from16 v0, v25

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v29

    .line 617
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->K:Lo/end;

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_one:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_two:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$color;->track_detail_running_posture_color_three:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lo/end;->setColors(III)V

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->K:Lo/end;

    move/from16 v1, v24

    int-to-float v1, v1

    move/from16 v2, v26

    int-to-float v2, v2

    move/from16 v3, v25

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, Lo/end;->setViewData(FFF)V

    .line 619
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->K:Lo/end;

    invoke-virtual {v0}, Lo/end;->postInvalidate()V

    .line 621
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->running_posture_avg_foot_strike_pattern_fore_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_n:I

    move-object/from16 v5, v27

    invoke-static {v1, v2, v5, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 622
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->running_posture_avg_foot_strike_pattern_whole_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_n:I

    move-object/from16 v5, v28

    invoke-static {v1, v2, v5, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 623
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->running_posture_avg_foot_strike_pattern_hind_value:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    const-string v2, "\\d+.\\d+|\\d+"

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_k:I

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$style;->strike_pattern_text_result_n:I

    move-object/from16 v5, v29

    invoke-static {v1, v2, v5, v3, v4}, Lo/cxh;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 625
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 626
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 627
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 628
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 629
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 630
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_posture_item_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 632
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    .line 633
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_surpport:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 635
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->H:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_surpport:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 638
    :goto_0
    goto :goto_1

    .line 639
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->H:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 643
    :goto_1
    return-void
.end method

.method private u()Z
    .locals 1

    .line 542
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 530
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_kcal:I

    invoke-virtual {v0, v1}, Lo/egb;->setText(I)V

    .line 532
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    if-nez v0, :cond_1

    .line 533
    :cond_0
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDefaultDistance() mTrackDetailDataManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->I:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 535
    return-void

    .line 537
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    invoke-static {v0}, Lo/cgl;->b(I)Ljava/lang/String;

    move-result-object v4

    .line 538
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    invoke-virtual {v0, v4}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 539
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 647
    const/4 v4, 0x0

    .line 648
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_ground_contact_time:I

    if-ne v0, v1, :cond_0

    .line 649
    const/4 v4, 0x0

    goto :goto_0

    .line 650
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_ground_impact_acceleration:I

    if-ne v0, v1, :cond_1

    .line 651
    const/4 v4, 0x1

    goto :goto_0

    .line 652
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_eversion_excursion:I

    if-ne v0, v1, :cond_2

    .line 653
    const/4 v4, 0x2

    goto :goto_0

    .line 654
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_swing_angle:I

    if-ne v0, v1, :cond_3

    .line 655
    const/4 v4, 0x3

    goto :goto_0

    .line 656
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_strike_pattern:I

    if-ne v0, v1, :cond_4

    .line 657
    const/4 v4, 0x4

    goto :goto_0

    .line 659
    :cond_4
    return-void

    .line 661
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_5

    .line 662
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRunningPostureAdvices size is error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    return-void

    .line 665
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_6

    .line 666
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "double click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    return-void

    .line 669
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u:J

    .line 671
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 672
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 673
    const-string v0, "runningPostureFlag"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 674
    const-string v0, "runningPostureAdvices"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->j:Ljava/util/ArrayList;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 675
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 676
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.suggestion.ui.runningposture.RuningPostureSuggestActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 678
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 679
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    const-string v0, "postureId"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    sget-object v2, Lo/dae;->if:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 682
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 684
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 113
    const-string v0, "Track_DetailFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->J:Z

    .line 115
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;

    .line 116
    invoke-virtual {v4}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity;->d()Lo/cgt;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    .line 117
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const-string v2, "#ffffff"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 122
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    .line 123
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    .line 124
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_show_detail_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    .line 126
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->C:Lo/che;

    .line 128
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_showtime:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m:Lo/egb;

    .line 132
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_xg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->e:Lo/egb;

    .line 133
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_xg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->a:Lo/chk;

    .line 135
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_anaerobic_xg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->d:Lo/egb;

    .line 136
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_anaerobic_xg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->g:Lo/chk;

    .line 137
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->h:Lo/egb;

    .line 138
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->sug_detail_ox_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->k:Lo/egb;

    .line 139
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_sp_ox:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chk;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->f:Lo/chk;

    .line 140
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire_duration:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->i:Lo/egb;

    .line 141
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_ritire_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->n:Lo/egb;

    .line 142
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_speed:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->l:Lo/egb;

    .line 143
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_speed_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    .line 144
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_ox_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->D:Lo/egb;

    .line 147
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_showtime:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/healthcloud/plugintrack/R$string;->track_detail_timeformat:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 148
    invoke-static {}, Lo/cgm;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->p:Lcom/huawei/up/model/UserInfomation;

    .line 149
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_wear:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->A:Landroid/widget/LinearLayout;

    .line 150
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_swim:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->L:Landroid/widget/LinearLayout;

    .line 153
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_show_running_posture:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->H:Landroid/widget/LinearLayout;

    .line 154
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_ground_contact_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    .line 155
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->E:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_ground_impact_acceleration:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    .line 157
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_eversion_excursion:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    .line 159
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_swing_angle:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    .line 161
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->M:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_running_posture_strike_pattern:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    .line 163
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->N:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->q:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->I:Ljava/lang/String;

    .line 167
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->B:Ljava/util/Map;

    .line 169
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->m:Lo/egb;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cgl;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 170
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o()V

    .line 171
    new-instance v5, Lo/cgp;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v0}, Lo/cgt;->c()Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->z:Lo/cgt;

    invoke-virtual {v1}, Lo/cgt;->a()Lo/cex;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    const/16 v3, 0x64

    invoke-direct {v5, v0, v1, v2, v3}, Lo/cgp;-><init>(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;Landroid/content/Context;I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->C:Lo/che;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v2, v1}, Lo/cgp;->d(Lo/che;ZI)V

    .line 175
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b()V

    .line 176
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->h()V

    .line 177
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->t()V

    .line 180
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 182
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->removeRule(I)V

    .line 183
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_speed:I

    const/16 v1, 0x8

    invoke-virtual {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 184
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->track_detail_show_speed:I

    const/4 v1, 0x6

    invoke-virtual {v5, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 185
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->o:Lo/egb;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lo/egb;->setGravity(I)V

    .line 189
    :cond_2
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/DetailFrag;->b:Landroid/view/View;

    return-object v0
.end method
