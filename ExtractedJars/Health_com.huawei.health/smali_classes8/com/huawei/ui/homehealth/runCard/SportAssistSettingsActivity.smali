.class public Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$d;,
        Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;,
        Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;
    }
.end annotation


# instance fields
.field private A:Lo/egw;

.field public a:Landroid/os/Handler;

.field private b:Lo/emr;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:I

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/ImageView;

.field private m:Lo/emu;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/widget/ImageView;

.field private u:Lo/emu;

.field private v:I

.field private w:Z

.field private x:Landroid/widget/ImageView;

.field private y:Z

.field private z:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e:I

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c:Landroid/widget/LinearLayout;

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->d:Landroid/widget/RelativeLayout;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->k:Landroid/widget/ImageView;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h:Landroid/widget/RelativeLayout;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f:Landroid/widget/ImageView;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->l:Landroid/widget/ImageView;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->p:Landroid/widget/ImageView;

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->o:Landroid/widget/ImageView;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->n:Landroid/widget/RelativeLayout;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->m:Lo/emu;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->q:Landroid/widget/RelativeLayout;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->u:Lo/emu;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->s:Landroid/widget/RelativeLayout;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->t:Landroid/widget/ImageView;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->r:Landroid/widget/RelativeLayout;

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    .line 100
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->v:I

    .line 352
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$e;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 3

    .line 333
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 334
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    goto :goto_0

    .line 337
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    .line 339
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->u:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_1

    .line 341
    :cond_1
    sget v0, Lcom/huawei/ui/homehealth/R$id;->whole_stretch_after_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 342
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 345
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->k()V

    return-void
.end method

.method private a(Ljava/util/Map;)V
    .locals 3

    .line 347
    if-eqz p1, :cond_0

    .line 348
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->hM:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, p1, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 350
    :cond_0
    return-void
.end method

.method private b()V
    .locals 5

    .line 239
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 247
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "huaweisport"

    const-string v2, "q3@!DF5*&$9MrhCS"

    const-string v3, "tingshu"

    new-instance v4, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$3;

    invoke-direct {v4, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/fkl;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fkk;)V

    goto :goto_0

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->l:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 287
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Z)Z
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->w:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)I
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e:I

    return p1
.end method

.method private c()V
    .locals 3

    .line 202
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->t:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->x:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 215
    :goto_0
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 219
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->d()V

    .line 220
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a()V

    .line 221
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b()V

    .line 225
    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    :cond_4
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 230
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_heart_setting_line:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 231
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    :cond_5
    return-void
.end method

.method private d()V
    .locals 2

    .line 318
    invoke-static {}, Lo/dbf;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 319
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    goto :goto_0

    .line 322
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    .line 325
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->m:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_1

    .line 327
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 329
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Z)Z
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->y:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)Landroid/content/Context;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 301
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ets;->m(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e:I

    .line 302
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e:I

    if-nez v0, :cond_0

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_music:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_listen_book:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 307
    :goto_0
    return-void
.end method

.method private e(I)V
    .locals 2

    .line 289
    const/16 v0, 0x70

    if-ne p1, v0, :cond_0

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->l:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e()V

    goto :goto_0

    .line 294
    :cond_0
    const/16 v0, 0x71

    if-ne p1, v0, :cond_1

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->l:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 298
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Ljava/util/Map;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a(Ljava/util/Map;)V

    return-void
.end method

.method private f()I
    .locals 2

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->m(Landroid/content/Context;)I

    move-result v1

    .line 517
    return v1
.end method

.method private g()V
    .locals 11

    .line 397
    const-string v0, "Track_SportSettingsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSportListenTypeDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 400
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->hw_show_muisc_type_view:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 402
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 403
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_sport_music:I

    invoke-virtual {v6, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 404
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    .line 405
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 415
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    .line 416
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 417
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_music:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    .line 418
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_listen_book:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 420
    sget v0, Lcom/huawei/ui/homehealth/R$id;->custom_listview_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ListView;

    .line 421
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f()I

    move-result v9

    .line 422
    new-instance v10, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    invoke-direct {v10, p0, v7, v0, v9}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;[Ljava/lang/String;Landroid/content/Context;I)V

    .line 423
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 424
    invoke-virtual {v8, v10}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 425
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    .line 426
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 427
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$6;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 439
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;

    invoke-direct {v0, p0, v10}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$7;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$a;)V

    invoke-virtual {v8, v0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 456
    goto :goto_0

    .line 457
    :cond_0
    const-string v0, "Track_SportSettingsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingListenTypeDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 458
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    .line 459
    return-void

    .line 461
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 464
    :cond_1
    return-void
.end method

.method private h()V
    .locals 2

    .line 469
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->cancel()V

    .line 471
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->A:Lo/egw;

    .line 473
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h()V

    return-void
.end method

.method private k()V
    .locals 5

    .line 504
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f()I

    move-result v3

    .line 505
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 506
    if-nez v3, :cond_0

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_music:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 508
    const-string v0, "type"

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 510
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_listen_book:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 511
    const-string v0, "type"

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    sget-object v1, Lo/dae;->hM:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 514
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 356
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 357
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_heart_setting:I

    if-ne v0, v1, :cond_0

    .line 375
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 376
    invoke-virtual {p0, v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 377
    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_stretch_after_running_vedio:I

    if-ne v0, v1, :cond_1

    .line 378
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->k()V

    goto :goto_0

    .line 380
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_track_listenType_setting:I

    if-ne v0, v1, :cond_2

    .line 381
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g()V

    goto :goto_0

    .line 382
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_sport_noun_explain:I

    if-ne v0, v1, :cond_3

    .line 383
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 384
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 385
    invoke-virtual {p0, v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 386
    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_setting:I

    if-ne v0, v1, :cond_4

    .line 387
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/homehealth/runCard/SportAssistVoiceSettingsActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 388
    const-string v0, "currentFrag"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->v:I

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 389
    invoke-virtual {p0, v3}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->startActivity(Landroid/content/Intent;)V

    .line 391
    :cond_4
    :goto_0
    invoke-direct {p0, v2}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->a(Ljava/util/Map;)V

    .line 393
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 108
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 109
    const-string v0, "Track_SportSettingsFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->track_sport_settings_frag:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->setContentView(I)V

    .line 111
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 112
    if-eqz v4, :cond_0

    .line 113
    const-string v0, "currentFrag"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->v:I

    .line 115
    :cond_0
    iput-object p0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->z:Landroid/content/Context;

    .line 116
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_listenType_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->f:Landroid/widget/ImageView;

    .line 117
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_listenType_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->i:Landroid/widget/RelativeLayout;

    .line 118
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_listen_type_bottom_line:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->l:Landroid/widget/ImageView;

    .line 119
    sget v0, Lcom/huawei/ui/homehealth/R$id;->txt_track_sport_type_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->g:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/ui/homehealth/R$id;->titlebar_track_sport_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b:Lo/emr;

    .line 126
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_voice_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->k:Landroid/widget/ImageView;

    .line 127
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->d:Landroid/widget/RelativeLayout;

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_heart_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h:Landroid/widget/RelativeLayout;

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_heart_interval_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->p:Landroid/widget/ImageView;

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$2;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 145
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_track_voice_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c:Landroid/widget/LinearLayout;

    .line 146
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_voice_bottom_line:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->o:Landroid/widget/ImageView;

    .line 147
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_track_autopause:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->m:Lo/emu;

    .line 148
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_auto_pause:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->n:Landroid/widget/RelativeLayout;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->m:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$5;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 167
    sget v0, Lcom/huawei/ui/homehealth/R$id;->switch_stretch_after_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->u:Lo/emu;

    .line 168
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_stretch_after_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->q:Landroid/widget/RelativeLayout;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->u:Lo/emu;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity$1;-><init>(Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 187
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_stretch_after_running_vedio:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->s:Landroid/widget/RelativeLayout;

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_after_running:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->t:Landroid/widget/ImageView;

    .line 191
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_sport_noun_explain:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->r:Landroid/widget/RelativeLayout;

    .line 192
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_sport_noun_explain:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->x:Landroid/widget/ImageView;

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportAssistSettingsActivity;->c()V

    .line 197
    return-void
.end method
