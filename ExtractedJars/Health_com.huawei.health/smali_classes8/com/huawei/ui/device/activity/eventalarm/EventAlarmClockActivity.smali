.class public Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static g:Ljava/lang/String;


# instance fields
.field private A:Lo/egy;

.field private B:Lo/enz;

.field private D:Ljava/lang/String;

.field private a:J

.field b:Ljava/lang/String;

.field private c:J

.field d:Z

.field private e:J

.field private f:Lo/egd;

.field private h:Lo/emr;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Lo/fez;

.field private k:Landroid/widget/TextView;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/EventAlarmInfo;>;"
        }
    .end annotation
.end field

.field private o:Lo/enz;

.field private p:Lo/eno;

.field private q:Landroid/widget/TextView;

.field private r:Lo/egw;

.field private s:Lo/eoo;

.field private t:Landroid/content/Context;

.field private u:Lcom/huawei/datatype/EventAlarmInfo;

.field private v:Lo/eoh;

.field private w:[Ljava/lang/String;

.field private x:Lo/egy;

.field private y:Lo/dqi;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 87
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 80
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a:J

    .line 81
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e:J

    .line 82
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c:J

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f:Lo/egd;

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p:Lo/eno;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->u:Lcom/huawei/datatype/EventAlarmInfo;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    .line 106
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    .line 107
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->w:[Ljava/lang/String;

    .line 112
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b:Ljava/lang/String;

    .line 117
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->D:Ljava/lang/String;

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d:Z

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoh;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->v:Lo/eoh;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 401
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 402
    const/16 v0, 0xb

    invoke-virtual {p0, v0, v4}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->setResult(ILandroid/content/Intent;)V

    .line 403
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setResultData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return-void
.end method

.method private a(Lo/eoo;)V
    .locals 8

    .line 252
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initUIData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    .line 255
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 256
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == clock"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/16 v0, 0xb

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 258
    const/16 v0, 0xc

    invoke-virtual {v6, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 259
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c(II)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_add_clock:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->v:Lo/eoh;

    iget v2, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    invoke-virtual {v1, v2}, Lo/eoh;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 266
    :cond_0
    invoke-virtual {p1}, Lo/eoo;->b()I

    move-result v7

    .line 267
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7f16\u8f91\u95f9\u949f time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    div-int/lit8 v4, v7, 0x64

    .line 269
    rem-int/lit8 v5, v7, 0x64

    .line 270
    invoke-direct {p0, v4, v5}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c(II)V

    .line 272
    invoke-virtual {p1}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    goto :goto_0

    .line 276
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {p1}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    invoke-virtual {p1}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    .line 280
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_edit_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 283
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->q:Landroid/widget/TextView;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 166
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    sget v0, Lcom/huawei/ui/device/R$id;->setting_event_alarm_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h:Lo/emr;

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$4;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$15;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    sget v0, Lcom/huawei/ui/device/R$id;->clock_btn_delete:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f:Lo/egd;

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f:Lo/egd;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_delete_title:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_info:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    .line 193
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_clock_ll:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i:Landroid/widget/RelativeLayout;

    .line 194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_repeat:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->q:Landroid/widget/TextView;

    .line 198
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_repeat_ll:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 199
    invoke-virtual {v4, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    sget v0, Lcom/huawei/ui/device/R$id;->settings_switch:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 206
    sget v0, Lcom/huawei/ui/device/R$id;->settings_alarm_name:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 212
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;I)I
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    return p1
.end method

.method static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 75
    sput-object p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    return-object p0
.end method

.method private c(II)V
    .locals 5

    .line 293
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initAlarmPicker====="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    sget v0, Lcom/huawei/ui/device/R$id;->hw_health_timepicker:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fez;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    .line 295
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/fez;->setTimeMode(I)V

    goto :goto_0

    .line 299
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/fez;->setTimeMode(I)V

    .line 301
    :goto_0
    const/16 v0, 0xb

    invoke-virtual {v4, v0, p1}, Ljava/util/Calendar;->set(II)V

    .line 302
    const/16 v0, 0xc

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->set(II)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    const/16 v1, 0x9

    invoke-virtual {v4, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fez;->setSelectedApm(I)V

    .line 306
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xc

    if-le p1, v0, :cond_2

    .line 307
    add-int/lit8 p1, p1, -0xc

    .line 309
    :cond_2
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "afterinitAlarmPicker====="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0, p1}, Lo/fez;->setSelectedHour(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0, p2}, Lo/fez;->setSelectedMinute(I)V

    .line 313
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h()V

    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 75
    sget-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    return-object p1
.end method

.method private d(Landroid/content/Context;)V
    .locals 5

    .line 792
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPromptSaveDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 794
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 796
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_alarm_settings_save_changes:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    .line 797
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_save:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$5;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 810
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_btn_discard:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$3;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 819
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/egy$b;->e(Z)Lo/egy$b;

    .line 820
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->x:Lo/egy;

    .line 821
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->x:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->x:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 823
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/eoo;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 357
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->v:Lo/eoh;

    const/4 v1, 0x7

    invoke-virtual {v0, v3, v1}, Lo/eoh;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 359
    const/4 v0, 0x7

    new-array v5, v0, [Z

    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    aput-boolean v0, v5, v1

    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/4 v1, 0x1

    aput-boolean v0, v5, v1

    .line 360
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const/4 v1, 0x2

    aput-boolean v0, v5, v1

    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    const/4 v1, 0x3

    aput-boolean v0, v5, v1

    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    const/4 v1, 0x4

    aput-boolean v0, v5, v1

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    const/4 v1, 0x5

    aput-boolean v0, v5, v1

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    const/4 v1, 0x6

    aput-boolean v0, v5, v1

    .line 361
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_monday:I

    .line 362
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_tuesday:I

    .line 363
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_wednesday:I

    .line 364
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_thursday:I

    .line 365
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_friday:I

    .line 366
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_saturday:I

    .line 367
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_sunday:I

    .line 368
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->w:[Ljava/lang/String;

    .line 371
    new-instance v6, Lo/egh;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->w:[Ljava/lang/String;

    invoke-direct {v6, v0, v1, v5}, Lo/egh;-><init>(Landroid/content/Context;[Ljava/lang/String;[Z)V

    .line 372
    new-instance v7, Landroid/widget/ListView;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-direct {v7, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 373
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 374
    invoke-virtual {v7, v6}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 375
    new-instance v0, Lo/egh$b;

    invoke-direct {v0}, Lo/egh$b;-><init>()V

    invoke-virtual {v7, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 376
    new-instance v8, Lo/egw$c;

    invoke-direct {v8, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 378
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_repeat:I

    invoke-virtual {v8, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 379
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    .line 380
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$13;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 385
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$12;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Lo/egh;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 393
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->r:Lo/egw;

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->r:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 395
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/enz;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->o:Lo/enz;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->y:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$14;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 457
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    return-object v0
.end method

.method private g()V
    .locals 7

    .line 463
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 464
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 465
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$11;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$11;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 466
    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$11;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 465
    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    .line 468
    :cond_0
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteDeviceClock() mEventAlarmList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",mEventAlarmList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_2

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 473
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/EventAlarmInfo;

    .line 475
    add-int/lit8 v0, v5, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 476
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteDeviceClock mEventAlarmList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 479
    :cond_2
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDeviceClock() error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->B:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 483
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    .line 484
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 485
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 536
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clickCancelBtn()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 538
    invoke-direct {p0, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d(Landroid/content/Context;)V

    goto :goto_0

    .line 540
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    .line 541
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 543
    :goto_0
    return-void
.end method

.method private i()V
    .locals 3

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v2

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->D:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lo/env;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 494
    new-instance v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$19;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$19;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 502
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i()V

    return-void
.end method

.method private k()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 510
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveClock()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 512
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 513
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    .line 516
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->m:Z

    if-eqz v0, :cond_2

    .line 517
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d:Z

    if-eqz v0, :cond_1

    .line 518
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p()V

    goto :goto_0

    .line 520
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->m()V

    goto :goto_0

    .line 523
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->o()Z

    move-result v0

    if-nez v0, :cond_4

    .line 524
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d:Z

    if-eqz v0, :cond_3

    .line 525
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l()V

    goto :goto_0

    .line 527
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n()V

    goto :goto_0

    .line 530
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 533
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/fez;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    return-object v0
.end method

.method private l()V
    .locals 8

    .line 746
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 748
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v4, v0, v1

    .line 750
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 751
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 752
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$2;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 753
    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 752
    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    .line 757
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_1

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 760
    :cond_1
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarm() error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    :goto_0
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 763
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addAlarm() ++ i  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/datatype/EventAlarmInfo;

    .line 766
    add-int/lit8 v0, v6, 0x2

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 762
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 769
    :cond_2
    new-instance v6, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-direct {v6}, Lcom/huawei/datatype/EventAlarmInfo;-><init>()V

    .line 770
    div-int/lit8 v0, v4, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_hour(I)V

    .line 771
    rem-int/lit8 v0, v4, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_mins(I)V

    .line 772
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmRepeat(I)V

    .line 773
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 774
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 776
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 778
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 779
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateEventAlarm() mNewEventAlarmList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 780
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->B:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 782
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    .line 783
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 784
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/egy;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->x:Lo/egy;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 566
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 568
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->y:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$17;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 637
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    return v0
.end method

.method private n()V
    .locals 5

    .line 686
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateEventAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v4, v0, v1

    .line 689
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->y:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$1;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;I)V

    invoke-virtual {v0, v1}, Lo/dqi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 740
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Landroid/widget/TextView;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()Z
    .locals 7

    .line 546
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isEqualDB()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 547
    const/4 v4, 0x0

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->p:Lo/eno;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->u:Lcom/huawei/datatype/EventAlarmInfo;

    if-nez v0, :cond_1

    .line 549
    :cond_0
    return v4

    .line 551
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v5, v0, v1

    .line 552
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " isEqualDB() ---AlarmListItem"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v3}, Lo/eoo;->k()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    .line 554
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v1}, Lo/eoo;->g()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    .line 555
    invoke-virtual {v0}, Lo/eoo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ne v5, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    .line 556
    invoke-virtual {v0}, Lo/eoo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 557
    const/4 v4, 0x1

    .line 559
    :cond_2
    return v4
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Ljava/util/List;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 642
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDeviceAlarm()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 645
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DEVICE_EVENT_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 646
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 647
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$20;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$20;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    .line 648
    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$20;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 647
    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    .line 650
    :cond_0
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addDeviceAlarm() + mEventAlarmList.size()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 652
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addDeviceAlarm() ++ i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/datatype/EventAlarmInfo;

    .line 654
    add-int/lit8 v0, v5, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 655
    invoke-virtual {v6}, Lcom/huawei/datatype/EventAlarmInfo;->getEventAlarmName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 658
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 651
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 660
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v0}, Lo/fez;->getSelectedHour()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->j:Lo/fez;

    invoke-virtual {v1}, Lo/fez;->getSelectedMinute()I

    move-result v1

    add-int v5, v0, v1

    .line 661
    new-instance v6, Lcom/huawei/datatype/EventAlarmInfo;

    invoke-direct {v6}, Lcom/huawei/datatype/EventAlarmInfo;-><init>()V

    .line 662
    div-int/lit8 v0, v5, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_hour(I)V

    .line 663
    rem-int/lit8 v0, v5, 0x64

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmStartTime_mins(I)V

    .line 664
    iget v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmRepeat(I)V

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmName(Ljava/lang/String;)V

    .line 666
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addDeviceAlarm() mTvInfo.getText().toString() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 667
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmEnable(I)V

    .line 669
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/EventAlarmInfo;->setEventAlarmIndex(I)V

    .line 670
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x5

    if-gt v0, v1, :cond_3

    .line 671
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 673
    :cond_3
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->i()V

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->B:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/enz;->d(Ljava/util/List;)V

    .line 676
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    .line 677
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 678
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addDeviceAlarm() mNewEventAlarmList"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->n:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->f()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)Lo/egy;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->A:Lo/egy;

    return-object v0
.end method

.method private t()V
    .locals 5

    .line 830
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showPromptSaveDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 834
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_alarm_settings_delete:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    .line 835
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_music_management_delete:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$10;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 847
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$7;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 854
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/egy$b;->e(Z)Lo/egy$b;

    .line 855
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->A:Lo/egy;

    .line 856
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->A:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->A:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 858
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 9

    .line 864
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter editName():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 866
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_eventalarm_edit_name_layout:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 867
    sget v0, Lcom/huawei/ui/device/R$id;->event_alarm_layout_name:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/eha;

    .line 868
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter editName() nameStr.length() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    invoke-virtual {v6}, Lo/eha;->requestFocus()Z

    .line 870
    sget-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 871
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_prompt:I

    invoke-virtual {v6, v0}, Lo/eha;->setHint(I)V

    .line 872
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/eha;->setTextColor(I)V

    .line 873
    sget-object v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/eha;->setSelection(I)V

    .line 874
    new-instance v0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;

    invoke-direct {v0, p0, v6}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$9;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Lo/eha;)V

    invoke-virtual {v6, v0}, Lo/eha;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 894
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 895
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_name:I

    invoke-virtual {v7, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 896
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    .line 897
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$8;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 903
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_button_ok:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$6;

    invoke-direct {v2, p0, v6}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity$6;-><init>(Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;Lo/eha;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 912
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v8

    .line 913
    invoke-virtual {v8}, Lo/egw;->show()V

    .line 914
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 239
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 240
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->m:Z

    if-eqz v0, :cond_0

    .line 241
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a()V

    .line 243
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->finish()V

    .line 244
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 323
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 325
    sget v0, Lcom/huawei/ui/device/R$id;->clock_btn_delete:I

    if-ne v4, v0, :cond_1

    .line 326
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 327
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a:J

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 328
    iput-wide v5, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a:J

    .line 329
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id = clock_btn_delete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t()V

    .line 333
    :cond_0
    goto/16 :goto_0

    :cond_1
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_repeat_ll:I

    if-ne v4, v0, :cond_3

    .line 334
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 335
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e:J

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 336
    iput-wide v5, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e:J

    .line 337
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id = smart_alarm_repeat_ll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->e()V

    .line 340
    :cond_2
    goto :goto_0

    :cond_3
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_clock_ll:I

    if-ne v4, v0, :cond_5

    .line 341
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 342
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c:J

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 343
    iput-wide v5, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c:J

    .line 344
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() id = smart_alarm_clock_ll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->c()V

    .line 347
    :cond_4
    goto :goto_0

    .line 348
    :cond_5
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onClick() id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 144
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 145
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    .line 146
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_event_alarm_clock:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->setContentView(I)V

    .line 148
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 149
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 150
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->D:Ljava/lang/String;

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->y:Lo/dqi;

    .line 153
    const/4 v0, 0x0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->o:Lo/enz;

    .line 154
    const/4 v0, 0x0

    invoke-static {v0}, Lo/eoh;->a(Landroid/content/Context;)Lo/eoh;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->v:Lo/eoh;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->B:Lo/enz;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isChange_alarm()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->d:Z

    .line 162
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->b()V

    .line 163
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->t:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 318
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 319
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 919
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 920
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->h()V

    .line 921
    const/4 v0, 0x0

    return v0

    .line 923
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 5

    .line 216
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 217
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 218
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 219
    return-void

    .line 221
    :cond_0
    const-string v0, "from_add_button"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->m:Z

    .line 222
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->m:Z

    if-eqz v0, :cond_1

    .line 223
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a(Lo/eoo;)V

    goto :goto_0

    .line 225
    :cond_1
    const-string v0, "from_list_item"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/eoo;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-virtual {v0}, Lo/eoo;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->z:I

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->s:Lo/eoo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/eventalarm/EventAlarmClockActivity;->a(Lo/eoo;)V

    goto :goto_0

    .line 230
    :cond_2
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mEventAlarmItem is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    :goto_0
    const-string v0, "EventAlarmClockActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void
.end method
