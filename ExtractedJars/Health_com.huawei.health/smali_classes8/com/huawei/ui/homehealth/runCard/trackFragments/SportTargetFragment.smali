.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Lo/esi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private C:Z

.field private D:I

.field private E:Landroid/os/Handler;

.field private F:F

.field private G:F

.field private H:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

.field a:Z

.field protected b:Landroid/view/View;

.field protected c:Landroid/widget/RadioButton;

.field protected d:Landroid/widget/RadioButton;

.field protected e:Landroid/widget/RadioGroup;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:Z

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/LinearLayout;

.field private q:I

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/LinearLayout;

.field private t:I

.field private u:Z

.field private v:Landroid/content/Context;

.field private w:F

.field private x:Z

.field private y:I

.field private z:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 83
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 112
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    .line 115
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->u:Z

    .line 127
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    .line 128
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    .line 130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->x:Z

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->C:Z

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->j:Z

    .line 139
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->A:Ljava/lang/String;

    .line 150
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a:Z

    .line 718
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$6;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->E:Landroid/os/Handler;

    .line 968
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->H:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->F:F

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;I)I
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/content/Context;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 8

    .line 1035
    const-wide/16 v4, 0x0

    .line 1036
    if-eqz p1, :cond_0

    .line 1037
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1039
    :pswitch_0
    const-string v0, "Track_Run_Distance_Sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 1040
    goto :goto_0

    .line 1042
    :pswitch_1
    const-string v0, "Track_Walk_Distance_Sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 1043
    goto :goto_0

    .line 1045
    :pswitch_2
    const-string v0, "Track_Ride_Distance_Sum"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 1046
    .line 1051
    :cond_0
    :goto_0
    move-wide v6, v4

    .line 1052
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "distance "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1054
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1055
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v6, v0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(DZ)V

    goto :goto_1

    .line 1057
    :cond_1
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, v6, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(DZ)V

    .line 1061
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;IFZ)V
    .locals 0

    .line 83
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(IFZ)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Landroid/view/View;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 3

    .line 436
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getUserVisibleHint()Z

    move-result v0

    if-nez v0, :cond_0

    .line 437
    return-void

    .line 439
    :cond_0
    if-eqz p1, :cond_1

    .line 441
    new-instance v2, Landroid/content/Intent;

    const-string v0, "track_entrance_map_visibility_action"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 442
    const-string v0, "MapVisibility"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 443
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 444
    goto :goto_0

    .line 446
    :cond_1
    new-instance v2, Landroid/content/Intent;

    const-string v0, "track_entrance_map_visibility_action"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 447
    const-string v0, "MapVisibility"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 448
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 450
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    return v0
.end method

.method public static b(D)Ljava/lang/String;
    .locals 3

    .line 1114
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v0, "###0.00"

    invoke-direct {v1, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1115
    invoke-virtual {v1, p0, p1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    .line 1116
    return-object v2
.end method

.method private b(Landroid/view/View;)V
    .locals 3

    .line 217
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_outdoor_sport_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    .line 218
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radio_indoor_sport_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    .line 219
    sget v0, Lcom/huawei/ui/homehealth/R$id;->radiogroup_sport_type:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e:Landroid/widget/RadioGroup;

    .line 220
    sget v0, Lcom/huawei/ui/homehealth/R$id;->view_div:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b:Landroid/view/View;

    .line 221
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_indoor_tip:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    .line 222
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i()V

    .line 224
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_music:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    .line 225
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_warmup:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    .line 226
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_begin:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    .line 228
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_target_set:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p:Landroid/widget/LinearLayout;

    .line 229
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_target_value:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    .line 230
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_target_unit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    .line 232
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_set_target:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->n:Landroid/widget/TextView;

    .line 234
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_target_detail:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->m:Landroid/widget/LinearLayout;

    .line 236
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_type_of_sum:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->o:Landroid/widget/TextView;

    .line 237
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_sum_distance:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->l:Landroid/widget/TextView;

    .line 239
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_sum:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->s:Landroid/widget/LinearLayout;

    .line 241
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 246
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f()V

    .line 249
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_sport_entrance_begin_lt_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 251
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_sum_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 255
    :cond_2
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(IFZ)V

    .line 258
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->F:F

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->G:F

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/hihealth/HiHealthData;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Z)V
    .locals 0

    .line 83
    invoke-direct {p0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Z)V

    return-void
.end method

.method private c(II)Z
    .locals 3

    .line 900
    const/4 v2, 0x0

    .line 901
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 903
    :pswitch_0
    if-nez p1, :cond_5

    .line 904
    if-nez p2, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_2

    .line 906
    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    .line 908
    :cond_2
    const/4 v2, 0x0

    goto :goto_0

    .line 913
    :pswitch_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_3

    .line 914
    const/4 v2, 0x1

    goto :goto_0

    .line 916
    :cond_3
    const/4 v2, 0x0

    .line 918
    goto :goto_0

    .line 920
    :pswitch_2
    const/4 v0, 0x2

    if-ne p1, v0, :cond_4

    if-nez p2, :cond_4

    .line 921
    const/4 v2, 0x1

    goto :goto_0

    .line 923
    :cond_4
    const/4 v2, 0x0

    .line 925
    .line 929
    :cond_5
    :goto_0
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;I)I
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    return p1
.end method

.method private d(F)V
    .locals 7

    .line 774
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 776
    float-to-double v0, p1

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cxh;->a(DI)D

    move-result-wide v5

    .line 777
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 781
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 782
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_band_data_sport_distance_unit_en:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 783
    goto :goto_0

    .line 784
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 785
    float-to-double v0, p1

    const-wide v2, 0x404518f5c28f5c29L    # 42.195

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x3

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 789
    :cond_1
    float-to-double v0, p1

    const-wide v2, 0x403518f5c28f5c29L    # 21.0975

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3ee4f8b588e368f1L    # 1.0E-5

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x4

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 794
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 796
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    float-to-double v1, p1

    const/4 v3, 0x1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 800
    :goto_0
    return-void
.end method

.method private d(IFZ)V
    .locals 6

    .line 731
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 733
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v1, p2, v1

    float-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hw_health_show_calorie_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 736
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h()V

    .line 737
    goto :goto_0

    .line 739
    :pswitch_1
    const/high16 v0, 0x42700000    # 60.0f

    div-float v5, p2, v0

    .line 740
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    float-to-double v1, v5

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$plurals;->IDS_hwh_motiontrack_start_track_sport_min:I

    float-to-int v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 742
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 743
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h()V

    .line 744
    goto :goto_0

    .line 746
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(F)V

    .line 747
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h()V

    .line 748
    goto :goto_0

    .line 750
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->o()V

    .line 751
    .line 756
    :goto_0
    if-eqz p3, :cond_0

    .line 757
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v0, v1, p1}, Lo/ets;->c(Landroid/content/Context;II)V

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v0, p2, v1}, Lo/ets;->d(Landroid/content/Context;FI)V

    .line 760
    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private d(Landroid/view/View;)V
    .locals 8

    .line 303
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_music:I

    if-ne v0, v1, :cond_0

    .line 304
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c()Ljava/util/Map;

    move-result-object v4

    .line 305
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    sget-object v2, Lo/dae;->hz:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 306
    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_begin:I

    if-ne v0, v1, :cond_2

    .line 307
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 308
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const-string v1, "map_tracking_sport_type_sportting"

    invoke-static {v0, v5, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 311
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const-string v1, "map_tracking_sport_type_sportting"

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    .line 313
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 312
    invoke-static {v0, v5, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const-string v1, "sport_target_type_sportting"

    .line 316
    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 315
    invoke-static {v0, v5, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 317
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(IFZ)V

    .line 319
    :cond_1
    new-instance v7, Landroid/content/Intent;

    const-string v0, "track_receiver_goto_sport"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 320
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 321
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->e(Landroid/content/Context;)V

    .line 322
    goto/16 :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->img_sport_entrance_warmup:I

    if-ne v0, v1, :cond_3

    .line 323
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d()V

    .line 324
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 325
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    sget-object v2, Lo/dae;->hI:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 328
    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_target_set:I

    if-ne v0, v1, :cond_4

    .line 329
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a()V

    goto :goto_0

    .line 330
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->layout_sum:I

    if-ne v0, v1, :cond_5

    .line 331
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 332
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    sget-object v0, Lo/dae;->aP:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 334
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 335
    new-instance v6, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 336
    const-string v0, "sportType"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 337
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    .line 339
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e()V

    return-void
.end method

.method private d(Landroid/content/Context;)Z
    .locals 3

    .line 1128
    if-nez p1, :cond_0

    .line 1129
    const/4 v0, 0x0

    return v0

    .line 1131
    .line 1132
    :cond_0
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ihealthlabs"

    .line 1131
    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1133
    if-eqz v2, :cond_1

    const-string v0, "true"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1134
    const/4 v0, 0x1

    return v0

    .line 1136
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->G:F

    return v0
.end method

.method private e()V
    .locals 6

    .line 292
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startViewMoreActivtiy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 296
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {v5, v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 297
    const/16 v0, 0x3e9

    invoke-virtual {p0, v5, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 298
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open:I

    sget v2, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_open_stay:I

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->overridePendingTransition(II)V

    .line 300
    :cond_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 1

    .line 262
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 289
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 417
    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    .line 418
    if-eqz p1, :cond_0

    .line 419
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 420
    invoke-virtual {v2}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$3;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 431
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 433
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    return v0
.end method

.method private f()V
    .locals 2

    .line 454
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 455
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->m(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_2

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->track_sport_entrance_music_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 460
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ets;->k(Landroid/content/Context;I)V

    goto :goto_0

    .line 462
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k()V

    .line 465
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    return v0
.end method

.method private g()V
    .locals 8

    .line 612
    const-string v4, "hwmediacenter://com.android.mediacenter/showrunplaylist?pver=80002300&portal=qq&from=com.huawei.health&needback=1"

    .line 613
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 614
    new-instance v6, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v6, v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 616
    const/high16 v0, 0x14000000

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 617
    const-string v0, "tag"

    const-string v1, "com.huawei.health"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 619
    :try_start_0
    invoke-virtual {p0, v6}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 622
    goto :goto_0

    .line 620
    :catch_0
    move-exception v7

    .line 621
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "music running list activity  not found, check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 763
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->n:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 764
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 765
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    return v0
.end method

.method private i()V
    .locals 4

    .line 342
    const/4 v3, 0x0

    .line 343
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->B:I

    if-nez v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    goto :goto_0

    .line 347
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->B:I

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 349
    add-int/lit8 v3, v3, 0x1

    .line 352
    :goto_0
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->D:I

    if-nez v0, :cond_1

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    goto :goto_1

    .line 357
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->D:I

    invoke-static {v1, v2}, Lo/cds;->c(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 359
    add-int/lit8 v3, v3, 0x1

    .line 362
    :goto_1
    const/4 v0, 0x1

    if-gt v3, v0, :cond_2

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->sport_entrance_single_color_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->sport_entrance_single_color_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_2

    .line 366
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->sport_entrance_color_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$color;->sport_entrance_color_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 370
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$5;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 410
    return-void
.end method

.method private k()V
    .locals 5

    .line 476
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "huaweisport"

    const-string v2, "q3@!DF5*&$9MrhCS"

    const-string v3, "tingshu"

    new-instance v4, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;

    invoke-direct {v4, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$1;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/fkl;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/fkk;)V

    .line 524
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->x:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/TextView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 936
    invoke-static {}, Lo/cxh;->a()Z

    move-result v3

    .line 937
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->j:Z

    if-eq v3, v0, :cond_0

    .line 938
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(IFZ)V

    .line 940
    :cond_0
    iput-boolean v3, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->j:Z

    .line 941
    return-void
.end method

.method private m()Ljava/lang/String;
    .locals 2

    .line 1094
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    .line 1095
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1097
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_plugin_achievement_report_run:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1099
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_total_cycling_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1101
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_total_walking_distance:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1104
    :cond_0
    :goto_0
    const-string v0, ""

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private n()V
    .locals 4

    .line 816
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->j:Z

    .line 818
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mTargetType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " mTargetValue = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 820
    return-void
.end method

.method private o()V
    .locals 2

    .line 768
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 769
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 770
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)Landroid/widget/TextView;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->o:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()V
    .locals 8

    .line 971
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportStatData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 972
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_0

    .line 973
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    .line 975
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v7, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->H:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

    .line 973
    const-wide/16 v1, 0x0

    const/4 v5, 0x7

    const/16 v6, 0x102

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 978
    :cond_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    .line 980
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget v6, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    iget-object v7, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->H:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

    .line 978
    const-wide/16 v1, 0x0

    const/4 v5, 0x7

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->d(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 983
    :goto_0
    return-void
.end method

.method private u()V
    .locals 3

    .line 1119
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_indoor_tip_2_free_indoor_running:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1122
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_indoor_tip_2:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1124
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 640
    new-instance v0, Lo/epj$b;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/epj$b;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$9;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    .line 641
    invoke-virtual {v0, v1}, Lo/epj$b;->c(Lo/epj$a;)Lo/epj$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$10;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    .line 667
    invoke-virtual {v0, v1}, Lo/epj$b;->e(Lo/epj$a;)Lo/epj$b;

    move-result-object v2

    .line 674
    invoke-virtual {v2}, Lo/epj$b;->b()Lo/epj;

    move-result-object v3

    .line 675
    invoke-virtual {v3}, Lo/epj;->show()V

    .line 676
    return-void
.end method

.method public b()I
    .locals 1

    .line 542
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 544
    :pswitch_0
    const/16 v0, 0x103

    return v0

    .line 546
    :pswitch_1
    const/16 v0, 0x101

    return v0

    .line 548
    :pswitch_2
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a:Z

    if-eqz v0, :cond_0

    .line 549
    const/16 v0, 0x102

    return v0

    .line 551
    :cond_0
    const/16 v0, 0x108

    return v0

    .line 554
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroid/content/Context;I)Lo/ery;
    .locals 10

    .line 682
    new-instance v2, Lo/ery$e;

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->E:Landroid/os/Handler;

    invoke-direct {v2, p1, v0}, Lo/ery$e;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    .line 683
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-virtual {v2, p2, v0}, Lo/ery$e;->e(II)Lo/ery;

    move-result-object v3

    .line 684
    invoke-virtual {v3}, Lo/ery;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 685
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 686
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v4, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 687
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 688
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/WindowManager;

    .line 689
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    .line 690
    const/high16 v0, 0x41a00000    # 20.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v8

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 693
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const/high16 v1, 0x43430000    # 195.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v9

    goto :goto_0

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v9

    .line 697
    :goto_0
    invoke-virtual {v7}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v9, 0x2

    sub-int/2addr v0, v1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 698
    iput v8, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 699
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 700
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 701
    sget v0, Lcom/huawei/ui/homehealth/R$style;->track_dialog_anim:I

    invoke-virtual {v4, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 702
    invoke-virtual {v3}, Lo/ery;->show()V

    .line 703
    return-object v3
.end method

.method public c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 560
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoSportMusic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 561
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/ets;->m(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 565
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.MUSIC_PLAYER"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 566
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 567
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 568
    const-string v0, "com.android.mediacenter"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 571
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->u:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 573
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g()V

    .line 574
    const-string v0, "sportMusicType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    const-string v0, "pageType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    const-string v0, "musicType"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v1}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 578
    return-object v4

    .line 580
    :cond_1
    :try_start_1
    invoke-virtual {p0, v5}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 586
    :cond_2
    goto :goto_1

    .line 582
    :catch_0
    move-exception v5

    .line 583
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No this activity MUSIC_PLAYER "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    goto :goto_1

    .line 584
    :catch_1
    move-exception v5

    .line 585
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    :goto_1
    const-string v0, "sportMusicType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 592
    :cond_3
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    invoke-static {v0}, Lo/fkl;->d(Lo/fkk;)V

    .line 603
    const-string v0, "sportMusicType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    :goto_2
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    const-string v0, "pageType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    const-string v0, "musicType"

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v1}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    return-object v4
.end method

.method public d()V
    .locals 5

    .line 627
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWarmUp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 630
    const-string v0, "track_type"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 634
    const-string v0, "track_target"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 635
    const-string v0, "track_targetvalue"

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 636
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/brt;->a(Landroid/os/Bundle;)V

    .line 637
    return-void
.end method

.method public d(II)V
    .locals 5

    .line 871
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(II)Z

    move-result v4

    .line 872
    if-eqz v4, :cond_0

    .line 873
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->C:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p()V

    .line 876
    :cond_0
    if-eqz v4, :cond_1

    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->C:Z

    if-nez v0, :cond_1

    .line 877
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->x:Z

    if-eqz v0, :cond_1

    .line 879
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v0, v1}, Lo/ets;->e(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    .line 880
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->t:I

    invoke-static {v0, v1}, Lo/ets;->a(Landroid/content/Context;I)F

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    .line 881
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->w:F

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(IFZ)V

    .line 885
    :cond_1
    if-eqz v4, :cond_2

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->y:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 886
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->l()V

    .line 888
    :cond_2
    iput-boolean v4, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->C:Z

    .line 889
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->u()V

    .line 891
    return-void
.end method

.method public e(DZ)V
    .locals 6

    .line 1066
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1067
    invoke-static {p1, p2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b(D)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 1069
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 1074
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    if-eqz v0, :cond_2

    .line 1076
    if-eqz p3, :cond_1

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_brackets:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->A:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    .line 1079
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 1077
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 1081
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_brackets:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->A:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_show_sport_unit_km:I

    .line 1083
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 1081
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1086
    :goto_1
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    invoke-virtual {p0, v4, v5}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1090
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 949
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 950
    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 951
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$8;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 966
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 162
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 163
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 169
    const-string v0, "TimeEat_SportTargetFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v5

    .line 171
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    .line 175
    if-eqz v5, :cond_0

    .line 176
    const-string v0, "KEY_FRAGMENT_BASE_TYPE"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    .line 177
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->m()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->A:Ljava/lang/String;

    .line 178
    const-string v0, "KEY_INDOOR"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->B:I

    .line 179
    const-string v0, "KEY_OUTDOOR"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->D:I

    .line 181
    :cond_0
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/cds;->e(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->u:Z

    .line 183
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->layout_frag_sport_target:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 185
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->n()V

    .line 187
    invoke-direct {p0, v6}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b(Landroid/view/View;)V

    .line 189
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p()V

    .line 191
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->x:Z

    .line 193
    invoke-static {}, Lo/esg;->b()Lo/esg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/esg;->b(Lo/esi;)Z

    .line 194
    const-string v0, "TimeEat_SportTargetFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    sget v0, Lcom/huawei/ui/homehealth/R$id;->tab_frag_layout:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_pop_target_bigcd:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 197
    sget v0, Lcom/huawei/ui/homehealth/R$id;->wramup_and_listen_layout:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const/high16 v2, 0x42f80000    # 124.0f

    invoke-static {v1, v2}, Lo/dtc;->e(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    const/high16 v3, 0x42f80000    # 124.0f

    invoke-static {v2, v3}, Lo/dtc;->e(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 200
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->q:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 201
    invoke-direct {p0, v6}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 204
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 207
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->s:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p:Landroid/widget/LinearLayout;

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V

    .line 212
    return-object v6
.end method

.method public onDestroy()V
    .locals 4

    .line 824
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 825
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    invoke-static {}, Lo/esg;->b()Lo/esg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/esg;->d(Lo/esi;)Z

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e:Landroid/widget/RadioGroup;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e:Landroid/widget/RadioGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 830
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e:Landroid/widget/RadioGroup;

    .line 833
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 834
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 835
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->h:Landroid/widget/ImageView;

    .line 838
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 839
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 840
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f:Landroid/widget/ImageView;

    .line 843
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 845
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->p:Landroid/widget/LinearLayout;

    .line 848
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 849
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 850
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->k:Landroid/widget/ImageView;

    .line 853
    :cond_4
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->v:Landroid/content/Context;

    .line 854
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->z:Landroid/content/res/Resources;

    .line 855
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->m:Landroid/widget/LinearLayout;

    .line 856
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c:Landroid/widget/RadioButton;

    .line 857
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d:Landroid/widget/RadioButton;

    .line 858
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->l:Landroid/widget/TextView;

    .line 859
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->o:Landroid/widget/TextView;

    .line 860
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->n:Landroid/widget/TextView;

    .line 861
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->r:Landroid/widget/TextView;

    .line 862
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->i:Landroid/widget/TextView;

    .line 863
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->g:Landroid/widget/TextView;

    .line 864
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b:Landroid/view/View;

    .line 865
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->H:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;

    .line 866
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->E:Landroid/os/Handler;

    .line 867
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 537
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 538
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 529
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 530
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f()V

    .line 533
    return-void
.end method
