.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$b;,
        Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;
    }
.end annotation


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Landroid/widget/LinearLayout;

.field private C:Lo/egr;

.field private D:Lo/egv;

.field private F:Landroid/widget/Button;

.field private G:Landroid/os/Handler;

.field private H:Lo/emu;

.field private I:Landroid/widget/EditText;

.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Ljava/lang/String;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Lo/emu;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Lo/emu;

.field private r:Z

.field private s:Lo/cmj;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/widget/TextView;

.field private v:Ljava/util/concurrent/ExecutorService;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/content/Context;

.field private y:Landroid/hardware/Sensor;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->r:Z

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->y:Landroid/hardware/Sensor;

    .line 91
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->z:I

    .line 376
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->G:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/cmj;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/emu;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    return-object v0
.end method

.method private b()V
    .locals 8

    .line 203
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_stepcounter_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a:Landroid/widget/RelativeLayout;

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_track_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->c:Landroid/widget/RelativeLayout;

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_phone_step_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e:Landroid/widget/RelativeLayout;

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_ad_splash_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->b:Landroid/widget/RelativeLayout;

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 217
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_setting_flowstatistics_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g:Landroid/widget/RelativeLayout;

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 220
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_bulk_data_insertion_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->k:Landroid/widget/RelativeLayout;

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_log_transfer_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f:Landroid/widget/RelativeLayout;

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_refresh_service_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i:Landroid/widget/RelativeLayout;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_query_suggestions:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->t:Landroid/widget/RelativeLayout;

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_label_option_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->p:Landroid/widget/RelativeLayout;

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_upload_label_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->l:Landroid/widget/RelativeLayout;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    invoke-static {}, Lo/dhu;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 245
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a()V

    .line 248
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_logout_developer_option_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->n:Landroid/widget/RelativeLayout;

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->n:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_device_auto_test:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h:Landroid/widget/RelativeLayout;

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 258
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 263
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->hw_service_auth_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->B:Landroid/widget/LinearLayout;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->B:Landroid/widget/LinearLayout;

    invoke-static {}, Lo/dbf;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->B:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    sget v0, Lcom/huawei/ui/main/R$id;->hw_service_auth_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->H:Lo/emu;

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const/16 v1, 0x7537

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "open_service_auth_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->H:Lo/emu;

    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->H:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 272
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_ad_splash_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_ad_splash_switch"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v5}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 278
    sget v0, Lcom/huawei/ui/main/R$id;->service_url_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->I:Landroid/widget/EditText;

    .line 279
    sget v0, Lcom/huawei/ui/main/R$id;->service_input_url_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->F:Landroid/widget/Button;

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->F:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 282
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_phone_step_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 286
    sget v0, Lcom/huawei/ui/main/R$id;->tv_app_setting_phone_counter_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->u:Landroid/widget/TextView;

    .line 287
    sget v0, Lcom/huawei/ui/main/R$id;->tv_app_setting_phone_counter_switch_prompt:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->w:Landroid/widget/TextView;

    .line 288
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_phone_step_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->m:Landroid/widget/ImageView;

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "apk_build_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 318
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "apkBuildTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    sget v0, Lcom/huawei/ui/main/R$id;->tv_time_make:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 320
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 321
    return-void
.end method

.method private c()V
    .locals 4

    .line 170
    new-instance v0, Lo/cmj;

    invoke-direct {v0}, Lo/cmj;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;)V

    const-string v3, "HuaweiHealth"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 172
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->r:Z

    return v0
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 62
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Landroid/content/Context;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;Z)Z
    .locals 0

    .line 62
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->r:Z

    return p1
.end method

.method private f()V
    .locals 4

    .line 548
    invoke-static {}, Lo/dhu;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    .line 549
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destDir = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->G:Landroid/os/Handler;

    const/16 v1, 0x3ea

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 551
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private g()V
    .locals 6

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->D:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 594
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->D:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    goto :goto_0

    .line 598
    :cond_0
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_developer_options_log_transfer:I

    .line 599
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    .line 600
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_developer_options_log_transfer_dialog_msg_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm_ios_btn:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    .line 601
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal_ios_btn:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    .line 616
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 624
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->D:Lo/egv;

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->D:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 627
    :cond_1
    :goto_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 568
    new-instance v0, Lo/egr$b;

    invoke-direct {v0, p0}, Lo/egr$b;-><init>(Landroid/content/Context;)V

    .line 569
    invoke-virtual {v0}, Lo/egr$b;->c()Lo/egr$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sns_waiting:I

    .line 570
    invoke-virtual {v0, v1}, Lo/egr$b;->b(I)Lo/egr$b;

    move-result-object v0

    .line 571
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egr$b;->c(Z)Lo/egr$b;

    move-result-object v0

    .line 572
    invoke-virtual {v0}, Lo/egr$b;->a()Lo/egr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    .line 575
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 576
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog... mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    invoke-virtual {v0}, Lo/egr;->show()V

    .line 579
    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)Lo/egv;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->D:Lo/egv;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 523
    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    .line 554
    invoke-static {}, Lo/dhu;->k()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    .line 555
    invoke-static {}, Lo/dhu;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->j:Ljava/lang/String;

    .line 556
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "srcDir = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->j:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    new-instance v4, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 558
    invoke-static {v4}, Lo/dbf;->b(Ljava/io/File;)Z

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->j:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->A:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dbf;->e(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->G:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 561
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->k()V

    return-void
.end method

.method private n()V
    .locals 4

    .line 631
    new-instance v3, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 633
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_setting_logout_developer_option_alert:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 634
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm_ios_btn:I

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 643
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal_ios_btn:I

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$8;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 650
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 651
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 652
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 653
    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    sub-long v4, v0, v2

    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 153
    invoke-static {p0}, Lo/dnj;->d(Landroid/content/Context;)V

    .line 154
    invoke-static {p0}, Lo/dnj;->c(Landroid/content/Context;)V

    .line 155
    invoke-static {p0}, Lo/dnj;->a(Landroid/content/Context;)V

    .line 156
    invoke-static {p0}, Lo/dnj;->e(Landroid/content/Context;)V

    .line 157
    invoke-static {p0}, Lo/dnj;->b(Landroid/content/Context;)V

    .line 158
    invoke-static {p0}, Lo/dnj;->g(Landroid/content/Context;)V

    .line 159
    invoke-static {p0}, Lo/dnj;->k(Landroid/content/Context;)V

    .line 160
    invoke-virtual {p0, v4, v5, v6, v7}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e(JJ)V

    .line 162
    invoke-static {p0}, Lo/dnj;->i(Landroid/content/Context;)V

    .line 163
    invoke-static {p0}, Lo/dnj;->f(Landroid/content/Context;)V

    .line 164
    invoke-static {p0}, Lo/dnj;->h(Landroid/content/Context;)V

    .line 165
    invoke-static {p0}, Lo/dnj;->n(Landroid/content/Context;)V

    .line 166
    invoke-static {p0}, Lo/dnj;->o(Landroid/content/Context;)V

    .line 167
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 374
    return-void
.end method

.method public e()V
    .locals 4

    .line 585
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 586
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    invoke-virtual {v0}, Lo/egr;->cancel()V

    .line 588
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->C:Lo/egr;

    .line 590
    :cond_0
    return-void
.end method

.method public e(JJ)V
    .locals 6

    .line 134
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    new-instance v5, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;

    invoke-direct {v5, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;)V

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 148
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 5

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    if-ne p1, v0, :cond_0

    .line 413
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCheckedChanged mPhoneStepSwitch  isChecked = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    invoke-virtual {v0, p2}, Lo/cmj;->d(Z)V

    goto :goto_0

    .line 421
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->H:Lo/emu;

    if-ne p1, v0, :cond_1

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const/16 v1, 0x7537

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "open_service_auth_key"

    .line 423
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 422
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 424
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    if-ne p1, v0, :cond_2

    .line 425
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_ad_splash_switch"

    .line 426
    invoke-static {p2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    .line 425
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 428
    :cond_2
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 447
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 449
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 450
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 451
    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto/16 :goto_4

    .line 453
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_4

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->q:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto/16 :goto_4

    .line 455
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_5

    .line 456
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperTrackSettingActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 457
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 458
    goto/16 :goto_4

    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->g:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 459
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 460
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 461
    goto/16 :goto_4

    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->k:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_7

    .line 462
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 463
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 464
    goto/16 :goto_4

    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->p:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_8

    .line 465
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 466
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 467
    goto/16 :goto_4

    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->l:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_9

    .line 468
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperLabelUploadActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 469
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 470
    goto/16 :goto_4

    .line 471
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_e

    .line 472
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "log transfer enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_d

    .line 475
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_c

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 479
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    const/4 v4, 0x1

    goto :goto_2

    :cond_b
    const/4 v4, 0x0

    .line 480
    :goto_2
    if-nez v4, :cond_c

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_app_setting_offline_map_no_permissions:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 482
    return-void

    .line 485
    :cond_c
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->z:I

    invoke-static {p0, v0, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 487
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 489
    :cond_d
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f()V

    goto/16 :goto_4

    .line 492
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_f

    .line 493
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->i()V

    goto/16 :goto_4

    .line 494
    :cond_f
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->n:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_10

    .line 495
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLogoutDeveloperLayout enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->n()V

    goto :goto_4

    .line 497
    :cond_10
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->h:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_11

    .line 498
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDeviceAutoTestActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 499
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 500
    goto :goto_4

    .line 501
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->B:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_13

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->o:Lo/emu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->H:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_12

    const/4 v1, 0x1

    goto :goto_3

    :cond_12
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_4

    .line 503
    :cond_13
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->F:Landroid/widget/Button;

    if-ne p1, v0, :cond_15

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->I:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 505
    if-eqz v4, :cond_14

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 508
    :cond_14
    goto :goto_4

    :cond_15
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->t:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_16

    .line 509
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 510
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->startActivity(Landroid/content/Intent;)V

    .line 512
    :cond_16
    :goto_4
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 117
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 118
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_developer_options:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->setContentView(I)V

    .line 119
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    .line 120
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->x:Landroid/content/Context;

    .line 122
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->b()V

    .line 123
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->c()V

    .line 130
    invoke-static {p0}, Lo/dnn;->e(Landroid/content/Context;)V

    .line 131
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 352
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 353
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->s:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->d()V

    .line 361
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 363
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->v:Ljava/util/concurrent/ExecutorService;

    .line 365
    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 346
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 347
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4
    .param p2    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 527
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 528
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->z:I

    if-ne p1, v0, :cond_2

    .line 529
    array-length v0, p3

    if-nez v0, :cond_0

    .line 530
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "grantResults length 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    return-void

    .line 533
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_1

    .line 536
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\ufffd\u0279\ufffd\ufffd\ufffd\u0221\u0228\ufffd\ufffd"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->f()V

    goto :goto_0

    .line 541
    :cond_1
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult rejected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    :cond_2
    :goto_0
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 331
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 332
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 337
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    .line 341
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 325
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 326
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return-void
.end method
