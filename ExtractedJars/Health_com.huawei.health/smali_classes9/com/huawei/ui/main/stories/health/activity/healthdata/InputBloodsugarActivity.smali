.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$e;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;
    }
.end annotation


# instance fields
.field private C:Lo/ego;

.field private D:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;

.field private a:Lo/emr;

.field b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;

.field private c:Landroid/widget/LinearLayout;

.field private d:Lo/egb;

.field private e:Landroid/content/Context;

.field private f:Lo/egd;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/fdj;

.field private k:Lo/egb;

.field private l:Ljava/lang/String;

.field private m:J

.field private n:D

.field private o:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;

.field private p:I

.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:Landroid/os/Handler;

.field private w:Ljava/text/SimpleDateFormat;

.field private x:Z

.field private y:Lo/fes;

.field private z:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 87
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    .line 97
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->v:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;D)D
    .locals 0

    .line 69
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    return-wide p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 323
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_input_bloodsugar_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 325
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_left_normal:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 327
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 329
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    return v0
.end method

.method private b()V
    .locals 10

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->i:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    iget v6, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    iget-wide v7, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    iget-object v9, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;

    invoke-virtual/range {v0 .. v9}, Lo/fdj;->d(Landroid/content/Context;JJIDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 365
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Z)Z
    .locals 0

    .line 69
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->x:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->q:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/os/Handler;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->v:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 9

    .line 241
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 242
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    invoke-virtual {v3, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 244
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/fgi;

    .line 247
    new-instance v8, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 248
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_string_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 249
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;

    invoke-direct {v2, p0, v6, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Lo/fgi;Ljava/util/Calendar;)V

    .line 250
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    .line 266
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 272
    invoke-virtual {v8}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 273
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->r:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedYear(I)V

    .line 274
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->q:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedMonth(I)V

    .line 275
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->t:I

    invoke-virtual {v6, v0}, Lo/fgi;->setSelectedDay(I)V

    .line 276
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 277
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->r:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)J
    .locals 2

    .line 69
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    return-wide v0
.end method

.method private d()V
    .locals 6

    .line 280
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_inputbloodsugar_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a:Lo/emr;

    .line 281
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodsugar_top_datelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c:Landroid/widget/LinearLayout;

    .line 282
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodsugar_top_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d:Lo/egb;

    .line 283
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodsugar_mid_bloodsugar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->g:Lo/egb;

    .line 284
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodsugar_bind_device:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->h:Lo/egb;

    .line 285
    sget v0, Lcom/huawei/ui/main/R$id;->hw_inputbloodsugare_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->k:Lo/egb;

    .line 286
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_inputbloodsugar_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->f:Lo/egd;

    .line 287
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a()V

    .line 289
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 290
    const/4 v5, 0x1

    :goto_0
    const/16 v0, 0x22

    if-ge v5, v0, :cond_0

    .line 291
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 290
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 293
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_inputbloodsugar_bloodsugar_scale:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fes;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->y:Lo/fes;

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->y:Lo/fes;

    const/16 v1, 0xa

    const/16 v2, 0x28

    invoke-virtual {v0, v4, v1, v2}, Lo/fes;->setData(Ljava/util/List;II)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->y:Lo/fes;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    invoke-virtual {v0, v1}, Lo/fes;->setOnSelectedListener(Lo/fes$a;)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->h:Lo/egb;

    invoke-virtual {v0, p0}, Lo/egb;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->t:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;J)J
    .locals 0

    .line 69
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->z:Ljava/util/Date;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/fdj;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->i:Lo/fdj;

    return-object v0
.end method

.method private e()V
    .locals 9

    .line 133
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 134
    if-nez v5, :cond_0

    .line 135
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void

    .line 138
    :cond_0
    const-string v0, "bloodsugar_timeperiod_key"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    .line 139
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timePeriod="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    invoke-static {v0}, Lo/fdd;->d(I)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->p:I

    invoke-static {v0, v1}, Lo/fdd;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->l:Ljava/lang/String;

    .line 142
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v2

    double-to-int v6, v0

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->y:Lo/fes;

    invoke-virtual {v0, v6}, Lo/fes;->setSelectedPosition(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->y:Lo/fes;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fes;->setNoScroll(Z)V

    .line 145
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    .line 146
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 147
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->m:J

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->r:I

    .line 149
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->q:I

    .line 150
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->t:I

    .line 151
    const/16 v0, 0xb

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->u:I

    .line 152
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->s:I

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->i:Lo/fdj;

    invoke-virtual {v0}, Lo/fdj;->c()V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->a:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->z:Ljava/util/Date;

    .line 156
    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->z:Ljava/util/Date;

    invoke-virtual {v8, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->g:Lo/egb;

    iget-wide v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->n:D

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 159
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->t:I

    return v0
.end method

.method private f()V
    .locals 2

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->C:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->isFinishing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fej;->d(Lo/ego;Ljava/lang/Boolean;)V

    .line 374
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->u:I

    return v0
.end method

.method private g()V
    .locals 3

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->C:Lo/ego;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->isFinishing()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fej;->a(Landroid/content/Context;Lo/ego;Ljava/lang/Boolean;)V

    .line 369
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->s:I

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->r:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->q:I

    return v0
.end method

.method private k()V
    .locals 3

    .line 409
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 410
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 411
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 413
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_SUGAR"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 415
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 417
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->startActivity(Landroid/content/Intent;)V

    .line 418
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/egb;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d:Lo/egb;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->g()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Z
    .locals 1

    .line 69
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->x:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Lo/egb;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->g:Lo/egb;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Ljava/util/Date;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->z:Ljava/util/Date;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->f()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->b()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 164
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c()V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->h:Lo/egb;

    if-ne p1, v0, :cond_1

    .line 166
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->k()V

    goto :goto_0

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->f:Lo/egd;

    if-ne p1, v0, :cond_2

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->D:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;

    invoke-static {v0, v1}, Lo/fjb;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 170
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 108
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 109
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_inputbloodsugar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->setContentView(I)V

    .line 110
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    .line 111
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->i:Lo/fdj;

    .line 112
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->o:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$d;

    .line 113
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;

    .line 114
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->D:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$c;

    .line 115
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyyMd"

    invoke-static {v1, v2}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->w:Ljava/text/SimpleDateFormat;

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->d()V

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e()V

    .line 118
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 122
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    .line 125
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v6, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 127
    invoke-virtual {v6, v2, v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->k:Lo/egb;

    invoke-virtual {v0, v6}, Lo/egb;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    :cond_0
    return-void
.end method
