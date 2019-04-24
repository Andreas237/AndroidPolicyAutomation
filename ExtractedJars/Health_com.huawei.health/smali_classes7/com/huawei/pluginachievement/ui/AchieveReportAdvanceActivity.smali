.class public Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final K:Ljava/lang/Object;

.field private static L:I


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Ljava/lang/String;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/ImageView;

.field private I:Landroid/widget/ImageView;

.field private J:Landroid/os/Handler;

.field private N:J

.field private a:I

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/util/ArrayList;

.field private g:J

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private i:Lo/emr;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/content/Context;

.field private l:Landroid/widget/LinearLayout;

.field private m:Lo/dti;

.field private n:Z

.field private o:Lo/dyp;

.field private p:I

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 113
    const/16 v0, 0x7d0

    sput v0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->L:I

    .line 115
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->K:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 67
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 77
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b:Ljava/util/Map;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    .line 79
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g:J

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n:Z

    .line 90
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    .line 114
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->N:J

    .line 133
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->J:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)I
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    return p1
.end method

.method private a(IFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)Lcom/github/mikephil/charting/data/Entry;
    .locals 2

    .line 519
    new-instance v1, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v0, p1

    invoke-direct {v1, v0, p2}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    .line 520
    invoke-virtual {v1, p3}, Lcom/github/mikephil/charting/data/Entry;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 521
    invoke-virtual {v1, p4}, Lcom/github/mikephil/charting/data/Entry;->setData(Ljava/lang/Object;)V

    .line 522
    return-object v1
.end method

.method private a()V
    .locals 3

    .line 179
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n:Z

    .line 181
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dzr;->a(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    goto :goto_0

    .line 183
    :cond_0
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/dzr;->e(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    .line 185
    :goto_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e()V

    .line 186
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_report_linechart:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/dyp;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    .line 188
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_total_pace:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    .line 189
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_date:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->r:Landroid/widget/TextView;

    .line 190
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_total_sport_time:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->q:Landroid/widget/TextView;

    .line 191
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_average_speed:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->u:Landroid/widget/TextView;

    .line 192
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_average_speed_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    .line 193
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_value_desc:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->y:Landroid/widget/TextView;

    .line 195
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_total_heat:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->x:Landroid/widget/TextView;

    .line 196
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_total_pace_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->w:Landroid/widget/TextView;

    .line 199
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_report_middle:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->I:Landroid/widget/ImageView;

    .line 200
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_report_share_middle:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->H:Landroid/widget/ImageView;

    .line 202
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_value_desc:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->F:Landroid/widget/TextView;

    .line 203
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_pace_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->G:Landroid/widget/TextView;

    .line 204
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_total_pace:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    .line 205
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_total_sport_time:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->v:Landroid/widget/TextView;

    .line 206
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_average_speed:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->j:Landroid/widget/TextView;

    .line 207
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_value_desc:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->B:Landroid/widget/TextView;

    .line 208
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_average_speed_unit:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    .line 209
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_total_heat:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->A:Landroid/widget/TextView;

    .line 210
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_date:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->D:Landroid/widget/TextView;

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->w:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 214
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->G:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    :goto_1
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->g(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_3

    .line 221
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->B:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_averagespeed:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->H:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_speed:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 226
    :cond_3
    sget v0, Lcom/huawei/pluginachievement/R$id;->title_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    .line 227
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->F:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/dzr;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 230
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 231
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 232
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-static {v1, v2}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 234
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_health_nav_share_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 237
    :goto_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b()V

    .line 250
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k()V

    .line 251
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 1

    .line 615
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 617
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;J)J
    .locals 0

    .line 67
    iput-wide p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->N:J

    return-wide p1
.end method

.method private b()V
    .locals 3

    .line 311
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/dzr;->b(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    goto :goto_0

    .line 313
    :cond_0
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/dzr;->a(Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    .line 316
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 317
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->finish()V

    .line 318
    return-void

    .line 320
    :cond_3
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h()V

    .line 321
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    .line 322
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g()V

    .line 323
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCurrentPosition="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f()V

    .line 325
    return-void
.end method

.method private b(I)V
    .locals 6

    .line 299
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 300
    sget-object v0, Lo/dae;->ad:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 301
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 303
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v5

    .line 304
    const/4 v0, 0x0

    invoke-virtual {v5, v4, v3, v2, v0}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 305
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e:I

    return v0
.end method

.method private c()V
    .locals 4

    .line 158
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 159
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 160
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "intent is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->finish()V

    .line 162
    return-void

    .line 164
    :cond_0
    const-string v0, "dialogType"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    .line 165
    const-string v0, "value"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d:Ljava/lang/String;

    .line 167
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 168
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "mType or mJson is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->finish()V

    .line 170
    return-void

    .line 172
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-void
.end method

.method static synthetic d()I
    .locals 1

    .line 67
    sget v0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->L:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)V
    .locals 0

    .line 67
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->N:J

    return-wide v0
.end method

.method private e()V
    .locals 2

    .line 258
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_report_history_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->l:Landroid/widget/LinearLayout;

    .line 259
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->l:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    return-void
.end method

.method private e(I)V
    .locals 7

    .line 411
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 412
    return-void

    .line 414
    :cond_0
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dyx;

    .line 416
    invoke-virtual {v4}, Lo/dyx;->e()J

    move-result-wide v5

    .line 417
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-nez v0, :cond_1

    .line 418
    invoke-virtual {v4}, Lo/dyx;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long v5, v0, v2

    .line 420
    :cond_1
    invoke-virtual {v4}, Lo/dyx;->a()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, v5, v6}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(JJ)V

    .line 421
    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 422
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dyv;

    .line 423
    invoke-virtual {v4}, Lo/dyv;->e()J

    move-result-wide v5

    .line 424
    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-nez v0, :cond_3

    .line 425
    invoke-virtual {v4}, Lo/dyv;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long v5, v0, v2

    .line 427
    :cond_3
    invoke-virtual {v4}, Lo/dyv;->d()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, v5, v6}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(JJ)V

    .line 429
    :cond_4
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    return v0
.end method

.method private f()V
    .locals 3

    .line 394
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->m:Lo/dti;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 395
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "pluginAchieveAdapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    return-void

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 399
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a:I

    .line 400
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "size is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a:I

    if-lez v0, :cond_1

    .line 403
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e:I

    .line 404
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->J:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 408
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    return v0
.end method

.method private g()V
    .locals 8

    .line 367
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 368
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 370
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dyx;

    .line 371
    invoke-virtual {v5}, Lo/dyx;->a()J

    move-result-wide v6

    .line 372
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b:Ljava/util/Map;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 374
    iput-wide v6, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g:J

    .line 369
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    goto :goto_2

    .line 376
    :cond_1
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 377
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 378
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dyv;

    .line 379
    invoke-virtual {v5}, Lo/dyv;->d()J

    move-result-wide v6

    .line 380
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b:Ljava/util/Map;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 382
    iput-wide v6, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g:J

    .line 377
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 386
    :cond_2
    :goto_2
    return-void
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a:I

    return v0
.end method

.method private h()V
    .locals 2

    .line 331
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0

    .line 353
    :cond_0
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 364
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method private i()V
    .locals 12

    .line 530
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "enter refreshView"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    sget-object v6, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->K:Ljava/lang/Object;

    monitor-enter v6

    .line 532
    :try_start_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 533
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mStartTimeList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_7

    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    if-ltz v0, :cond_7

    .line 535
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 536
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b:Ljava/util/Map;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 537
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 538
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "motionPathSimplify is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 540
    monitor-exit v6

    return-void

    .line 542
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/dzk;->c(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 543
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 544
    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Ljava/lang/String;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->x:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 546
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dzr;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 548
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->A:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v2, v4

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 552
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    int-to-double v1, v1

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lo/dzp;->b(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 553
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    int-to-double v1, v1

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v1, v2, v3}, Lo/dzp;->b(DLandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 554
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_5

    .line 555
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_average_speed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 556
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n:Z

    if-eqz v0, :cond_1

    .line 557
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_motiontrack_show_detail_average_speed_imp:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 559
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 560
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 561
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 562
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 563
    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Ljava/lang/String;)V

    .line 564
    goto/16 :goto_1

    .line 565
    :cond_2
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 566
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 567
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->p:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyv;

    .line 568
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 569
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 570
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    invoke-static {v1, v2}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 574
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 575
    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dzr;->b(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 577
    :cond_3
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_4

    .line 578
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 581
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-static {v1}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v1

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    add-double/2addr v1, v3

    double-to-int v1, v1

    invoke-static {v1}, Lo/dzr;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 584
    :goto_0
    invoke-virtual {v9}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v0

    invoke-static {v0}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Ljava/lang/String;)V

    .line 589
    :cond_5
    :goto_1
    goto :goto_2

    .line 591
    :cond_6
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 593
    :cond_7
    :goto_2
    monitor-exit v6

    goto :goto_3

    :catchall_0
    move-exception v11

    monitor-exit v6

    throw v11

    .line 594
    :goto_3
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I
    .locals 2

    .line 67
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e:I

    return v0
.end method

.method private k()V
    .locals 11

    .line 464
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 465
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 466
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 467
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 468
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_4

    .line 469
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 470
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyx;

    .line 471
    invoke-virtual {v10}, Lo/dyx;->a()J

    move-result-wide v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->n:Z

    if-eqz v0, :cond_0

    .line 473
    invoke-virtual {v10}, Lo/dyx;->c()J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    .line 474
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_hollow_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "LINE_PATH"

    .line 473
    invoke-direct {p0, v9, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(IFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 477
    :cond_0
    invoke-virtual {v10}, Lo/dyx;->c()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/dzr;->d(D)D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    .line 478
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_hollow_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "LINE_PATH"

    .line 477
    invoke-direct {p0, v9, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(IFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    :goto_1
    goto :goto_2

    :cond_1
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 482
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyv;

    .line 483
    invoke-virtual {v10}, Lo/dyv;->d()J

    move-result-wide v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 485
    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/dzr;->e(D)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    .line 486
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_hollow_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "LINE_PATH"

    .line 485
    invoke-direct {p0, v9, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(IFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 488
    :cond_2
    invoke-virtual {v10}, Lo/dyv;->c()D

    move-result-wide v0

    double-to-float v0, v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    .line 489
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_hollow_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "LINE_PATH"

    .line 488
    invoke-direct {p0, v9, v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(IFLandroid/graphics/drawable/Drawable;Ljava/lang/Object;)Lcom/github/mikephil/charting/data/Entry;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    :cond_3
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 494
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    const/high16 v3, 0x41300000    # 11.0f

    invoke-static {v2, v3}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v3, v4}, Lo/dzn;->b(Landroid/content/Context;F)I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/dyp;->setExtraOffsets(FFFF)V

    .line 495
    new-instance v8, Lo/dys;

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_report_markview:I

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    invoke-direct {v8, v0, v1, v2}, Lo/dys;-><init>(Landroid/content/Context;ILo/dyp;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    invoke-virtual {v0, v8}, Lo/dyp;->setMyMarkView(Lo/dys;)V

    .line 498
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    sget v1, Lo/dzk;->c:I

    sget v2, Lo/dzk;->d:I

    sget v3, Lo/dzk;->d:I

    sget v4, Lcom/huawei/pluginachievement/R$drawable;->report_line_chart_shadow_run:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dyp;->a(IIII)V

    .line 500
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v0}, Lo/dzr;->g(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 501
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    move-object v2, v6

    move-object v3, v7

    iget v4, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v4}, Lo/dzr;->d(I)Z

    move-result v4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/dyp;->setChartData(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V

    goto :goto_3

    .line 503
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    move-object v2, v6

    move-object v3, v7

    iget v4, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c:I

    invoke-static {v4}, Lo/dzr;->d(I)Z

    move-result v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/dyp;->setChartData(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/ArrayList;ZZ)V

    .line 505
    :goto_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-virtual {v0, v1}, Lo/dyp;->setOnSingleTapListener(Lo/dyp$b;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o:Lo/dyp;

    invoke-virtual {v0}, Lo/dyp;->invalidate()V

    .line 516
    return-void
.end method

.method static synthetic m(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/Map;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b:Ljava/util/Map;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 597
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->s:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->r:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->q:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 600
    const-string v0, "--"

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Ljava/lang/String;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->x:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 602
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 603
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->C:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 605
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->z:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 606
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->v:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 607
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->A:Landroid/widget/TextView;

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 608
    return-void
.end method

.method static synthetic o(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g:J

    return-wide v0
.end method

.method private o()V
    .locals 11

    .line 641
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "share enter"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 643
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "isNetworkAvailable error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->J:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 645
    return-void

    .line 649
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_share_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 650
    invoke-static {v9}, Lo/dxh;->a(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 651
    if-nez v10, :cond_1

    .line 652
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "share bmpShare == null "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 654
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    move-object v4, v10

    sget-object v1, Lo/dae;->ac:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v8}, Lo/dtm;->d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V

    .line 656
    :goto_0
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "share end"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 657
    return-void
.end method

.method static synthetic p(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/os/Handler;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->J:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(JJ)V
    .locals 7

    .line 434
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->m:Lo/dti;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    new-instance v6, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;

    invoke-direct {v6, p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$6;-><init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    invoke-interface/range {v0 .. v6}, Lo/dti;->c(Landroid/content/Context;JJLo/duh;)V

    .line 458
    return-void
.end method

.method public c(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 3

    .line 666
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "checkGalleryPermission"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 668
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o()V

    .line 669
    return-void

    .line 671
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 672
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 673
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "checkGalleryPermission isnotHasPermissions"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 675
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 676
    :goto_0
    if-nez v2, :cond_3

    .line 677
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 678
    return-void

    .line 681
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 682
    goto :goto_1

    .line 683
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "checkGalleryPermission choosePic"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 684
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o()V

    .line 687
    :cond_5
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 119
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 120
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achievement_record_history_page:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->setContentView(I)V

    .line 121
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->m:Lo/dti;

    .line 123
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c()V

    .line 124
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a()V

    .line 127
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 632
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "enter onDestroy"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 634
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 627
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 628
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .line 691
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestCode=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 693
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 694
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "choosePicWrite Permission success"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 695
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->o()V

    goto :goto_0

    .line 697
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "choosePicWrite Permission Failed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 700
    :cond_1
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 622
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 623
    return-void
.end method
