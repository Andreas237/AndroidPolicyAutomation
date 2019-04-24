.class public Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

.field private B:Z

.field private C:Z

.field private D:I

.field private E:I

.field private F:I

.field private G:Landroid/app/Dialog;

.field private H:I

.field private I:I

.field private J:Lo/emr;

.field private K:Landroid/os/Handler;

.field private N:Landroid/widget/Toast;

.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/content/Context;

.field private f:Lo/egb;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lo/egb;

.field private i:Landroid/widget/RelativeLayout;

.field private j:I

.field private k:Lo/egb;

.field private l:Landroid/widget/ImageView;

.field private m:Lo/egb;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Lo/egb;

.field private q:Landroid/widget/ImageButton;

.field private r:Landroid/widget/ImageView;

.field private s:Ljava/lang/Runnable;

.field private t:Landroid/widget/ImageButton;

.field private u:Landroid/widget/ImageView;

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->q:Landroid/widget/ImageButton;

    .line 109
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->t:Landroid/widget/ImageButton;

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->s:Ljava/lang/Runnable;

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->w:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->x:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->y:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    .line 119
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->B:Z

    .line 120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    .line 129
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 266
    new-instance v0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$5;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$5;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->x:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Landroid/os/Handler;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 623
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .line 624
    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 153
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_input_sport_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->setContentView(I)V

    .line 154
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_data_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    .line 157
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a:Landroid/widget/RelativeLayout;

    .line 158
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_type_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h:Lo/egb;

    .line 159
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_type_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n:Landroid/widget/ImageView;

    .line 161
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i:Landroid/widget/RelativeLayout;

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_duration_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->p:Lo/egb;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_duration_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->r:Landroid/widget/ImageView;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_distance:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g:Landroid/widget/RelativeLayout;

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_distance_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->m:Lo/egb;

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_distance_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->u:Landroid/widget/ImageView;

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c:Landroid/widget/RelativeLayout;

    .line 170
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_time_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k:Lo/egb;

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_time_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->l:Landroid/widget/ImageView;

    .line 173
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_start_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d:Landroid/widget/RelativeLayout;

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_start_time_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f:Lo/egb;

    .line 175
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_start_time_right_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->o:Landroid/widget/ImageView;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->o:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->input_sport_history_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->J:Lo/emr;

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->J:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->J:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$3;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->p(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 211
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_sport_type_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 212
    sget v0, Lcom/huawei/ui/main/R$id;->navigation_left_my_health_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_10:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_size_15_sp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 218
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 219
    sget v0, Lcom/huawei/ui/main/R$id;->hw_add_sport_data_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/egb;

    .line 220
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 221
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_oversea_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 223
    :cond_3
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lo/egb;->setVisibility(I)V

    .line 226
    :cond_4
    :goto_0
    return-void
.end method

.method private b(IFJ)F
    .locals 6

    .line 492
    const/high16 v0, 0x447a0000    # 1000.0f

    div-float v4, p2, v0

    .line 494
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 496
    :pswitch_0
    float-to-double v0, v4

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v0, v1, v2}, Lo/dgp;->b(DF)D

    move-result-wide v0

    double-to-float v5, v0

    .line 497
    goto :goto_1

    .line 499
    :pswitch_1
    float-to-double v0, v4

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v0, v1, v2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    double-to-float v5, v0

    .line 500
    goto :goto_1

    .line 502
    :pswitch_2
    float-to-double v0, v4

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v0, v1, v2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    double-to-float v5, v0

    .line 503
    goto :goto_1

    .line 506
    :pswitch_3
    long-to-double v0, p3

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x40ed4c0000000000L    # 60000.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    iget v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    const/16 v2, 0x103

    invoke-static {p2, v0, v1, v2}, Lo/dgp;->d(FFFI)F

    move-result v5

    .line 508
    goto :goto_1

    .line 510
    :pswitch_4
    float-to-double v0, v4

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v0, v1, v2}, Lo/dgp;->a(DF)D

    move-result-wide v0

    double-to-float v5, v0

    .line 511
    goto :goto_1

    .line 513
    :goto_0
    :pswitch_5
    float-to-double v0, v4

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v0, v1, v2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    double-to-float v5, v0

    .line 515
    :goto_1
    const/4 v0, 0x0

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 516
    const/4 v0, 0x0

    return v0

    .line 518
    :cond_0
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->x:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    return p1
.end method

.method private b()V
    .locals 4

    .line 299
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$4;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    iput-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->s:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 312
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;II)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(II)V

    return-void
.end method

.method private b(IIIII)Z
    .locals 7

    .line 404
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 405
    iget p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    .line 407
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 408
    iget p2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    .line 410
    :cond_1
    const/4 v0, -0x1

    if-ne p3, v0, :cond_2

    .line 411
    iget p3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    .line 413
    :cond_2
    const/4 v0, -0x1

    if-ne p4, v0, :cond_3

    .line 414
    iget p4, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    .line 416
    :cond_3
    const/4 v0, -0x1

    if-ne p5, v0, :cond_4

    .line 417
    iget p5, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    .line 419
    :cond_4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 420
    const/4 v0, 0x1

    invoke-virtual {v4, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 421
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x2

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 422
    const/4 v0, 0x5

    invoke-virtual {v4, v0, p3}, Ljava/util/Calendar;->set(II)V

    .line 423
    const/16 v0, 0xb

    invoke-virtual {v4, v0, p4}, Ljava/util/Calendar;->set(II)V

    .line 424
    const/16 v0, 0xc

    invoke-virtual {v4, v0, p5}, Ljava/util/Calendar;->set(II)V

    .line 425
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 426
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 427
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gtz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 428
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_start_time_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Ljava/lang/String;)V

    .line 429
    const/4 v0, 0x1

    return v0

    .line 431
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->y:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(J)V
    .locals 6

    .line 523
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    rem-long v4, v0, v2

    .line 524
    add-long/2addr p1, v4

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveStartTime(J)V

    .line 526
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->B:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->w:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->w:I

    return p1
.end method

.method private d(Landroid/content/Context;Landroid/os/Handler;)Lo/ffp;
    .locals 2

    .line 316
    new-instance v0, Lo/ffp$e;

    invoke-direct {v0, p1, p2}, Lo/ffp$e;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 317
    invoke-virtual {v0}, Lo/ffp$e;->a()Lo/ffp;

    move-result-object v1

    .line 318
    invoke-virtual {v1}, Lo/ffp;->show()V

    .line 319
    iput-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    .line 320
    return-object v1
.end method

.method private d()V
    .locals 11

    .line 326
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "creatorSportDistanceDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    new-instance v4, Lo/ffm$d;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    invoke-direct {v4, v0, v1}, Lo/ffm$d;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 328
    invoke-virtual {v4}, Lo/ffm$d;->b()Lo/ffm;

    move-result-object v5

    .line 329
    invoke-virtual {v5}, Lo/ffm;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 330
    const/16 v0, 0x50

    invoke-virtual {v6, v0}, Landroid/view/Window;->setGravity(I)V

    .line 331
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v6, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 332
    invoke-virtual {v6}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v7

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/WindowManager;

    .line 334
    invoke-interface {v8}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v9

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v10

    .line 336
    invoke-virtual {v9}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v10, 0x2

    sub-int/2addr v0, v1

    iput v0, v7, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 337
    iput v10, v7, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 338
    invoke-virtual {v6, v7}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 339
    invoke-virtual {v6, v7}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 340
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v6, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 341
    invoke-virtual {v5}, Lo/ffm;->show()V

    .line 342
    iput-object v5, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    .line 346
    return-void
.end method

.method private d(II)V
    .locals 6

    .line 450
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 451
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 452
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 453
    sub-int v0, v3, p1

    const/16 v1, 0xb

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 454
    add-int/lit8 v0, p2, 0x1

    sub-int v0, v4, v0

    const/16 v1, 0xc

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 455
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    .line 456
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    .line 457
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    .line 458
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    .line 459
    const/16 v0, 0xb

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    .line 460
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    .line 461
    const/16 v0, 0xc

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    .line 462
    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    .line 463
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(J)V

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k:Lo/egb;

    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f:Lo/egb;

    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 466
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 467
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;J)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(J)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Landroid/os/Message;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    if-nez v0, :cond_0

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    goto :goto_0

    .line 632
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 633
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 635
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 636
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;IIIII)Z
    .locals 1

    .line 89
    invoke-direct/range {p0 .. p5}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(IIIII)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    return p1
.end method

.method private e(Ljava/util/Date;)Ljava/lang/String;
    .locals 3

    .line 618
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 619
    invoke-virtual {v2, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportDataSource(I)V

    .line 230
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-string v1, "input_history_data_tracking_sport_type"

    invoke-static {v0, v5, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 233
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    if-eqz v6, :cond_0

    const-string v0, ""

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-1"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x108

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v7

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 237
    goto :goto_1

    .line 240
    :cond_1
    :try_start_0
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 244
    goto :goto_0

    .line 241
    :catch_0
    move-exception v8

    .line 242
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/4 v7, 0x0

    .line 245
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v7, v2, v3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v8

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 249
    :goto_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 251
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    .line 252
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    .line 253
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    .line 254
    const/16 v0, 0xb

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    .line 255
    const/16 v0, 0xa

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    .line 256
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    .line 257
    const/16 v0, 0x9

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    .line 258
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k:Lo/egb;

    invoke-direct {p0, v8}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f:Lo/egb;

    invoke-direct {p0, v8}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {v7}, Ljava/util/Calendar;->clear()V

    .line 264
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 9

    .line 350
    iget v4, p1, Landroid/os/Message;->what:I

    .line 351
    const/16 v0, 0x2711

    if-ne v4, v0, :cond_0

    .line 354
    iget v0, p1, Landroid/os/Message;->arg1:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 356
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_run:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_sport_type_outdoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 358
    goto/16 :goto_1

    .line 360
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_walk:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_sport_type_outdoor_walk:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 362
    goto :goto_1

    .line 364
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_ride:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_sport_type_outdoor_ride:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 366
    goto :goto_1

    .line 368
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_treadmill:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_start_track_sport_type_indoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 370
    goto :goto_1

    .line 372
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_swim:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_pool_swim:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 374
    goto :goto_1

    .line 376
    :goto_0
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_treadmill:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_start_track_sport_type_indoor_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 380
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportType(I)V

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h:Lo/egb;

    invoke-virtual {v0, v5}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 382
    goto :goto_4

    :cond_0
    const/16 v0, 0x2712

    if-ne v4, v0, :cond_3

    .line 383
    iget v0, p1, Landroid/os/Message;->arg1:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v5, v0, v1

    .line 385
    const/high16 v0, 0x42c80000    # 100.0f

    rem-float v0, v5, v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 386
    float-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 388
    :cond_1
    float-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 391
    :goto_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 392
    float-to-double v0, v5

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v7, v0

    goto :goto_3

    .line 394
    :cond_2
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v5

    float-to-int v7, v0

    .line 396
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v7}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalDistance(I)V

    .line 397
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->m:Lo/egb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 401
    :cond_3
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->y:I

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    return p1
.end method

.method private f()J
    .locals 5

    .line 436
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 437
    const-wide/16 v3, 0x0

    .line 438
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    const/4 v1, 0x1

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 439
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 440
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 441
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    const/16 v1, 0xb

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 442
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    const/16 v1, 0xc

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 443
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    .line 444
    invoke-virtual {v2}, Ljava/util/Calendar;->clear()V

    .line 445
    return-wide v3
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    return p1
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    return-object v0
.end method

.method private g()V
    .locals 14

    .line 531
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    if-eqz v0, :cond_0

    .line 532
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close window(), onClick()  mClickCheck is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void

    .line 536
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->p:Lo/egb;

    invoke-virtual {v0}, Lo/egb;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 537
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_fill_complete_information_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Ljava/lang/String;)V

    .line 538
    return-void

    .line 540
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    .line 541
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 542
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_start_time_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Ljava/lang/String;)V

    .line 543
    return-void

    .line 546
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveHasTrackPoint(Z)V

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 548
    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v2

    .line 547
    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b(IFJ)F

    move-result v5

    .line 549
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    float-to-double v1, v5

    const-wide v3, 0x408f400000000000L    # 1000.0

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveTotalCalories(I)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v3}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveEndTime(J)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    long-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    .line 552
    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f800000    # 1.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v2, v3

    div-float/2addr v1, v2

    .line 551
    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveAvgPace(F)V

    .line 553
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmssSSS"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gps_maptracking_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportId(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveDeviceType(I)V

    .line 558
    new-instance v8, Lo/cex;

    invoke-direct {v8}, Lo/cex;-><init>()V

    .line 559
    new-instance v9, Ljava/util/TreeMap;

    invoke-direct {v9}, Ljava/util/TreeMap;-><init>()V

    .line 560
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [D

    const-wide v2, 0x4056800000000000L    # 90.0

    const/4 v4, 0x0

    aput-wide v2, v1, v4

    const-wide/high16 v2, -0x3fac000000000000L    # -80.0

    const/4 v4, 0x1

    aput-wide v2, v1, v4

    const-wide/16 v2, 0x0

    const/4 v4, 0x2

    aput-wide v2, v1, v4

    const-wide/16 v2, 0x0

    const/4 v4, 0x3

    aput-wide v2, v1, v4

    .line 561
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-double v2, v2

    const/4 v4, 0x4

    aput-wide v2, v1, v4

    .line 560
    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    invoke-virtual {v8, v9}, Lo/cex;->d(Ljava/util/Map;)V

    .line 563
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->a(Ljava/util/Map;)V

    .line 564
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->b(Ljava/util/Map;)V

    .line 565
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->e(Ljava/util/Map;)V

    .line 566
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->c(Ljava/util/Map;)V

    .line 567
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->e(Ljava/util/ArrayList;)V

    .line 568
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v8, v0}, Lo/cex;->a(Ljava/util/ArrayList;)V

    .line 570
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v1, v8}, Lo/cbl;->d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;)I

    move-result v10

    .line 571
    if-nez v10, :cond_5

    .line 572
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackToDb success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 574
    :cond_5
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackToDb failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    :goto_0
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackToDb() StartTime: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", EndTime: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v2}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 578
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v0, v8, v1}, Lo/cbl;->b(Lo/cex;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V

    .line 581
    sget-object v0, Lo/dae;->hA:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v11

    .line 582
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 583
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    const-string v0, "sportId"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 586
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    const-string v0, "endTime"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    const-string v0, "distances"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    const-string v0, "calories"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 591
    :cond_6
    const-string v0, "sportType"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    const-string v0, "trackType"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    const-string v0, "sportDataSource"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportDataSource()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v11, v12, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 598
    new-instance v13, Landroid/content/Intent;

    const-string v0, "input_sport_history_start_time"

    invoke-direct {v13, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 601
    const-string v0, "startTime"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 602
    const-string v0, "endTime"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 603
    const-string v0, "distance"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 604
    const-string v0, "pace"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 605
    const-string v0, "trackType"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTrackType()I

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 606
    const-string v0, "sportType"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 607
    const-string v0, "duration"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    invoke-virtual {v13, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 608
    const-string v0, "calorie"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->A:Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;

    invoke-virtual {v1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-virtual {v13, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-static {v0, v13}, Lo/dbg;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 612
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->setResult(I)V

    .line 613
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->finish()V

    .line 615
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    return p1
.end method

.method private h()V
    .locals 9

    .line 727
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showInputSportDateChooseDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 728
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 729
    sget v0, Lcom/huawei/ui/main/R$layout;->track_data_date_dialog_datepicker_emui9:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 731
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    .line 732
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ffo;

    .line 734
    const/16 v0, 0x7de

    invoke-virtual {v6, v0}, Lo/ffo;->setStartYear(I)V

    .line 735
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->j:I

    invoke-virtual {v6, v0}, Lo/ffo;->setSelectedYear(I)V

    .line 736
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    invoke-virtual {v6, v0}, Lo/ffo;->setSelectedMonth(I)V

    .line 737
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    invoke-virtual {v6, v0}, Lo/ffo;->setSelectedDay(I)V

    .line 740
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 741
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_workout_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 742
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$9;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    .line 743
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$6;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffo;)V

    .line 749
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 776
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 777
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 778
    iput-object v7, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    .line 780
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    return p1
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->p:Lo/egb;

    return-object v0
.end method

.method private i()V
    .locals 5

    .line 471
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/djl;->c(Landroid/content/Context;)Lo/dao;

    move-result-object v4

    .line 473
    if-eqz v4, :cond_0

    .line 474
    invoke-virtual {v4}, Lo/dao;->a()F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    goto :goto_0

    .line 476
    :cond_0
    const/high16 v0, 0x42700000    # 60.0f

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    .line 477
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    :goto_0
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The weight is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->z:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;I)I
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    return p1
.end method

.method private k()V
    .locals 9

    .line 668
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "creatorSportDurationDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 670
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_input_data_sport_time_duration_picker_layout_emui9:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 671
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_duration_picker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ffn;

    .line 672
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->w:I

    invoke-virtual {v6, v0}, Lo/ffn;->setSelectedHour(I)V

    .line 673
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->x:I

    invoke-virtual {v6, v0}, Lo/ffn;->setSelectedMinute(I)V

    .line 674
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->y:I

    invoke-virtual {v6, v0}, Lo/ffn;->setSelectedsecond(I)V

    .line 676
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 677
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_duration:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 678
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$7;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    .line 679
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$10;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffn;)V

    .line 685
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 716
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 718
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 719
    iput-object v7, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    .line 721
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->B:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k:Lo/egb;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->E:I

    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)J
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method private n()V
    .locals 10

    .line 785
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showInputSportStartTimeChooseDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 786
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 787
    sget v0, Lcom/huawei/ui/main/R$layout;->track_dialog_timepicker_emui9:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 789
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_timepicker:I

    .line 790
    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ffq;

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v7

    .line 792
    if-eqz v7, :cond_0

    .line 793
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lo/ffq;->setTimeMode(I)V

    .line 794
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 795
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    add-int/lit8 v0, v0, 0xc

    iput v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    goto :goto_0

    .line 798
    :cond_0
    const/4 v0, 0x6

    invoke-virtual {v6, v0}, Lo/ffq;->setTimeMode(I)V

    .line 800
    :cond_1
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->I:I

    invoke-virtual {v6, v0}, Lo/ffq;->setSelectedHour(I)V

    .line 801
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    invoke-virtual {v6, v0}, Lo/ffq;->setSelectedMinute(I)V

    .line 802
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->v:I

    invoke-virtual {v6, v0}, Lo/ffq;->setSelectedApm(I)V

    .line 805
    new-instance v9, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 806
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_settings_seat_long_starttime:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 807
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$2;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V

    .line 808
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$8;-><init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;Lo/ffq;)V

    .line 814
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 838
    invoke-virtual {v9}, Lo/egw$c;->e()Lo/egw;

    move-result-object v8

    .line 839
    invoke-virtual {v8}, Lo/egw;->show()V

    .line 840
    iput-object v8, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    .line 842
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->D:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->H:I

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->F:I

    return v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Lo/egb;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->f:Lo/egb;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    if-eqz v0, :cond_0

    .line 640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->N:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    .line 642
    :cond_0
    return-void
.end method

.method public finish()V
    .locals 1

    .line 657
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->finish()V

    .line 658
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 661
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c()V

    .line 662
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 647
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    if-eqz v0, :cond_0

    .line 648
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed() ,close window(), onClick()  mClickCheck is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    return-void

    .line 651
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c()V

    .line 652
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 653
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 277
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->C:Z

    if-eqz v0, :cond_0

    .line 278
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick()  mClickCheck is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    return-void

    .line 281
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b()V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->b:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Landroid/content/Context;Landroid/os/Handler;)Lo/ffp;

    goto :goto_0

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->K:Landroid/os/Handler;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d(Landroid/content/Context;Landroid/os/Handler;)Lo/ffp;

    goto :goto_0

    .line 286
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_3

    .line 287
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->k()V

    goto :goto_0

    .line 288
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->g:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 289
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d()V

    goto :goto_0

    .line 290
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_5

    .line 291
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->h()V

    goto :goto_0

    .line 292
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->d:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 293
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->n()V

    .line 295
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 145
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 146
    iput-object p0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e:Landroid/content/Context;

    .line 147
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a()V

    .line 148
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->e()V

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->i()V

    .line 150
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 930
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 931
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 932
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->G:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 934
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c()V

    .line 935
    return-void
.end method
