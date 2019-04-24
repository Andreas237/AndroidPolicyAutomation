.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$a;
    }
.end annotation


# instance fields
.field private A:Lo/fex;

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private C:Landroid/widget/LinearLayout;

.field private D:Ljava/lang/String;

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private G:Lo/ems;

.field private H:Lo/few;

.field private I:Landroid/widget/ListView;

.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/content/res/Resources;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/view/View;

.field private g:Lo/egb;

.field private h:Lo/egb;

.field private i:Lo/egb;

.field private j:Landroid/widget/ImageView;

.field private k:Lo/egb;

.field private l:Landroid/widget/SeekBar;

.field private m:Landroid/graphics/drawable/AnimationDrawable;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/LinearLayout;

.field private q:I

.field private r:Landroid/os/Handler;

.field private s:Lo/fdj;

.field private t:Landroid/widget/ImageView;

.field private u:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;

.field private v:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field private w:Z

.field private x:Lo/emr;

.field private y:Ljava/lang/String;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/ArrayList<Lo/fdf;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    .line 110
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$a;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->r:Landroid/os/Handler;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->y:Ljava/lang/String;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    .line 266
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;I)I
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/os/Handler;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->r:Landroid/os/Handler;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 194
    sget v0, Lcom/huawei/ui/main/R$id;->health_healthdata_bloodsugar_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->x:Lo/emr;

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->G:Lo/ems;

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_bloodsugar_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->G:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->e(Landroid/view/View;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->G:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 199
    sget v0, Lcom/huawei/ui/main/R$id;->hw_bloodsugar_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o:Landroid/widget/RelativeLayout;

    .line 200
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_boodsugar_noempty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->n:Landroid/widget/LinearLayout;

    .line 201
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_empty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->p:Landroid/widget/LinearLayout;

    .line 203
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_input:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a:Landroid/widget/LinearLayout;

    .line 204
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_mesure:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e:Landroid/widget/LinearLayout;

    .line 205
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_service:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c:Landroid/widget/LinearLayout;

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_mid_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->k:Lo/egb;

    .line 207
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_mid_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->g:Lo/egb;

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_bloodsugardetail_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->i:Lo/egb;

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_mid_desc:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->h:Lo/egb;

    .line 210
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_mid_progressbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->l:Landroid/widget/SeekBar;

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_bloodsugar_progressbar_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v5

    .line 216
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 218
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 221
    :cond_0
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 223
    :goto_0
    goto :goto_1

    .line 225
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_equipment_progressbar:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 228
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->f:Landroid/view/View;

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->id_pl_root:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fex;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->A:Lo/fex;

    .line 230
    sget v0, Lcom/huawei/ui/main/R$id;->id_lv_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->I:Landroid/widget/ListView;

    .line 231
    sget v0, Lcom/huawei/ui/main/R$id;->blood_sugar_server_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->C:Landroid/widget/LinearLayout;

    .line 232
    sget v0, Lcom/huawei/ui/main/R$id;->blood_sugar_server_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->j:Landroid/widget/ImageView;

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v5

    .line 235
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v6, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->f:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    sget v0, Lcom/huawei/ui/main/R$id;->id_contentend_bg:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 238
    invoke-static {p0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 239
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 241
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_health_bloodsugar_lv_bg:I

    invoke-static {v0, v1}, Lo/enf;->b(Landroid/content/Context;I)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 246
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o:Landroid/widget/RelativeLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_device_weight_loading_img:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->t:Landroid/widget/ImageView;

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->t:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->l:Landroid/widget/SeekBar;

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->x:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 660
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 661
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 663
    return-void
.end method

.method private b()V
    .locals 3

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_breakfast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_breakfast:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_lunch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_lunch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_dinner:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_after_dinner:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_before_sleep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_early_morning:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c()V

    return-void
.end method

.method private b(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 4

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->v:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->D:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v3

    .line 492
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 493
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    goto :goto_0

    .line 495
    :cond_0
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 498
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 644
    sget-object v0, Lo/dae;->db:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Ljava/lang/String;)V

    .line 645
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 646
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 647
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 649
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_SUGAR"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 651
    const-string v0, "view"

    const-string v1, "MeasureDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 653
    const-string v0, "bloodsugar_timeperiod_key"

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 654
    const-string v0, "bloodsugar_timeperiod_key_string"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 655
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->startActivity(Landroid/content/Intent;)V

    .line 656
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/content/Context;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->y:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->y:Ljava/lang/String;

    const-string v1, "MyHealthData"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onKeyDown jumpToDeviceActivity is Success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 184
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 185
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 187
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 189
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->startActivity(Landroid/content/Intent;)V

    .line 191
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 10

    .line 523
    const/16 v0, 0x7dc

    iput v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    .line 525
    new-instance v4, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 527
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->blood_sugar_time_picker_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 528
    sget v0, Lcom/huawei/ui/main/R$id;->blood_sugar_time_picker:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/elk;

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$array;->IDS_hw_show_healthdata_bloodsugar_timeperiod_array:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    .line 531
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 532
    const/4 v9, 0x0

    :goto_0
    array-length v0, v7

    if-ge v9, v0, :cond_0

    .line 533
    aget-object v0, v7, v9

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 532
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 535
    :cond_0
    invoke-virtual {v6, v7}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 536
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/elk;->setMinValue(I)V

    .line 537
    array-length v0, v7

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v6, v0}, Lo/elk;->setMaxValue(I)V

    .line 538
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lo/elk;->setValue(I)V

    .line 539
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/elk;->setWrapSelectorWheel(Z)V

    .line 540
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_timeperiod:I

    invoke-virtual {v4, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 541
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;

    invoke-direct {v2, p0, v6, v8, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Lo/elk;Ljava/util/ArrayList;I)V

    .line 542
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    .line 559
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 565
    invoke-virtual {v4}, Lo/egw$c;->e()Lo/egw;

    move-result-object v3

    .line 566
    invoke-virtual {v3}, Lo/egw;->show()V

    .line 568
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Ljava/lang/String;)V
    .locals 0

    .line 78
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private d()V
    .locals 10

    .line 272
    const/16 v4, 0x3e

    .line 273
    invoke-static {p0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 274
    const-string v0, "window"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 275
    new-instance v6, Landroid/util/DisplayMetrics;

    invoke-direct {v6}, Landroid/util/DisplayMetrics;-><init>()V

    .line 276
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 278
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 280
    iget v8, v6, Landroid/util/DisplayMetrics;->density:F

    .line 283
    int-to-float v0, v7

    div-float/2addr v0, v8

    float-to-int v9, v0

    .line 285
    add-int/lit8 v0, v9, -0x64

    div-int/lit8 v4, v0, 0x8

    .line 286
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initItemWidthList width is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initItemWidthList screenWidth is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->i()V

    return-void
.end method

.method private d(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 3

    .line 501
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 502
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 503
    const-string v0, "title"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 504
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 505
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 506
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 507
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 509
    sget-object v0, Lo/dae;->cX:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Ljava/lang/String;)V

    .line 510
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Ljava/util/List;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 302
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b()V

    .line 303
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d()V

    .line 304
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$5;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->A:Lo/fex;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->I:Landroid/widget/ListView;

    invoke-direct {v0, p0, p0, v1, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;Landroid/content/Context;Lo/fex;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/few;->d(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/few;->b(Z)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->F:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/few;->c(Ljava/util/List;)V

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_date:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/few;->d(Ljava/lang/String;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/few;->e(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/few;->a(Ljava/util/List;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->E:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/few;->e(Ljava/util/List;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    const/16 v1, 0x30

    invoke-virtual {v0, v1}, Lo/few;->a(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->A:Lo/fex;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    invoke-virtual {v0, v1}, Lo/fex;->setAdapter(Lo/few;)V

    .line 319
    return-void
.end method

.method private f()V
    .locals 2

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 390
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    return v0
.end method

.method private g()V
    .locals 10

    .line 350
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 351
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->f()V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->s:Lo/fdj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    move-wide v4, v8

    iget-object v7, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;

    const-wide/16 v2, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/fdj;->e(Landroid/content/Context;JJILo/egg;)V

    .line 353
    return-void
.end method

.method private h()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->v:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->v:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    const-string v1, "BLOOD_SUGAR"

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByLocation(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 376
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshListview, mBloodsugarlist.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshListview, mBloodsugarlist.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 379
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->k()V

    goto :goto_0

    .line 381
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->l()V

    .line 383
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->p()V

    return-void
.end method

.method private k()V
    .locals 11

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    if-nez v0, :cond_0

    .line 394
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e()V

    goto :goto_0

    .line 396
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->H:Lo/few;

    invoke-virtual {v0}, Lo/few;->e()V

    .line 398
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v5, v0, Lo/fdf;->a:J

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v0, v0, Lo/fdf;->e:D

    double-to-int v7, v0

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->z:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fdf;

    iget-wide v8, v0, Lo/fdf;->d:D

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v10

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->k:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_healthdata_bloodsugar_lasttime_format:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 403
    invoke-static {v5, v6}, Lo/fee;->e(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 404
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    .line 405
    invoke-static {v3, v7}, Lo/fdd;->d(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 402
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->g:Lo/egb;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v8, v9, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->h:Lo/egb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    double-to-float v2, v8

    invoke-static {v1, v7, v2}, Lo/fdd;->a(Landroid/content/Context;IF)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->l:Landroid/widget/SeekBar;

    double-to-float v1, v8

    invoke-static {v7, v1}, Lo/fdd;->c(IF)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 413
    return-void
.end method

.method private l()V
    .locals 2

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 420
    return-void
.end method

.method private m()I
    .locals 16

    .line 590
    const/4 v9, 0x0

    .line 591
    const/4 v10, 0x0

    .line 592
    const/4 v11, 0x0

    .line 593
    const/4 v0, 0x1

    new-array v12, v0, [Ljava/lang/String;

    const-string v0, "HDK_BLOOD_SUGAR"

    const/4 v1, 0x0

    aput-object v0, v12, v1

    .line 594
    const-string v13, "kind =?"

    .line 596
    const-string v0, "device.db"

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->openOrCreateDatabase(Ljava/lang/String;ILandroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v10, v0

    .line 597
    move-object v0, v10

    const-string v1, "device"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "productId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object v3, v13

    move-object v4, v12

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v11, v0

    .line 598
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 599
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 608
    :cond_0
    if-eqz v11, :cond_1

    .line 609
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 611
    :cond_1
    if-eqz v10, :cond_6

    .line 612
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto/16 :goto_1

    .line 602
    :catch_0
    move-exception v14

    .line 603
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SQLException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 608
    if-eqz v11, :cond_2

    .line 609
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 611
    :cond_2
    if-eqz v10, :cond_6

    .line 612
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 604
    :catch_1
    move-exception v14

    .line 605
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 608
    if-eqz v11, :cond_3

    .line 609
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 611
    :cond_3
    if-eqz v10, :cond_6

    .line 612
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 608
    :catchall_0
    move-exception v15

    if-eqz v11, :cond_4

    .line 609
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 611
    :cond_4
    if-eqz v10, :cond_5

    .line 612
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 614
    :cond_5
    throw v15

    .line 615
    :cond_6
    :goto_1
    return v9
.end method

.method private n()V
    .locals 5

    .line 572
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_plugin_device_selection_click_bind_my_device_select:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 574
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$8;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_cancle_button:I

    .line 580
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$7;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 585
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 586
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 587
    return-void
.end method

.method private o()V
    .locals 5

    .line 621
    sget-object v0, Lo/dae;->cU:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Ljava/lang/String;)V

    .line 622
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 623
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timePeriod="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    const-string v0, "bloodsugar_timeperiod_key"

    iget v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->q:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 625
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->startActivity(Landroid/content/Intent;)V

    .line 626
    return-void
.end method

.method private p()V
    .locals 3

    .line 630
    sget-object v0, Lo/dae;->cY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Ljava/lang/String;)V

    .line 631
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 632
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 633
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 635
    const-string v0, "kind"

    const-string v1, "HDK_BLOOD_SUGAR"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 637
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 639
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->startActivity(Landroid/content/Intent;)V

    .line 640
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 2

    .line 513
    new-instance v1, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 514
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->D:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 515
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 516
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->v:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 518
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 519
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 473
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 474
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(I)V

    goto :goto_0

    .line 475
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->e:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_2

    .line 476
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->m()I

    move-result v0

    if-lez v0, :cond_1

    .line 477
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c(I)V

    goto :goto_0

    .line 480
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->n()V

    goto :goto_0

    .line 482
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    goto :goto_0

    .line 484
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->j:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_4

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->B:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/ChildService;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 487
    :cond_4
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 130
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 131
    sget v0, Lcom/huawei/ui/main/R$layout;->health_data_bloodsugar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->setContentView(I)V

    .line 132
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 133
    if-nez v4, :cond_0

    .line 134
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 137
    :cond_0
    const-string v0, "healthdata"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->y:Ljava/lang/String;

    .line 138
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->b:Landroid/content/res/Resources;

    .line 140
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->s:Lo/fdj;

    .line 141
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->u:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;

    .line 142
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a()V

    .line 143
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "refreshCard"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->w:Z

    .line 144
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->w:Z

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->D:Ljava/lang/String;

    .line 148
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->h()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->B:Ljava/util/List;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->B:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 150
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->B:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/openservice/db/model/ChildService;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/huawei/ui/openservice/db/model/ChildService;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 157
    if-eqz v6, :cond_4

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 161
    :cond_4
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "icon is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_0
    invoke-static {}, Lo/dlx;->c()Lo/dlx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->r:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/dlx;->e(Landroid/os/Handler;)V

    .line 165
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 169
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 170
    const-string v0, "UIHLH_BloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "keyCode == KeyEvent.KEYCODE_BACK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->c()V

    .line 172
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->finish()V

    .line 173
    const/4 v0, 0x1

    return v0

    .line 175
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/ui/commonui/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onResume()V
    .locals 2

    .line 357
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->d:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V

    invoke-static {v0, v1}, Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->i:Lo/egb;

    invoke-static {v0}, Lo/fiu;->d(Landroid/widget/TextView;)V

    .line 366
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->g()V

    .line 367
    return-void
.end method
