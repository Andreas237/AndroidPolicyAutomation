.class Lo/eto;
.super Lo/erc;
.source "SourceFile"


# static fields
.field private static final s:I


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Lo/emt;

.field public c:Landroid/widget/TextView;

.field public d:Landroid/widget/TextView;

.field public e:Landroid/widget/TextView;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/TextView;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/view/View;

.field public k:Landroid/widget/TextView;

.field public l:Lo/che;

.field public m:Lo/etk;

.field public n:Lo/etk;

.field public o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/etk;>;"
        }
    .end annotation
.end field

.field protected p:Landroid/content/res/Resources;

.field private q:I

.field private r:Ljava/lang/String;

.field private t:I

.field private x:I

.field private y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-string v0, "#000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    sput v0, Lo/eto;->s:I

    return-void
.end method

.method constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 1

    .line 70
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eto;->o:Ljava/util/List;

    .line 66
    const/16 v0, 0x102

    iput v0, p0, Lo/eto;->x:I

    .line 71
    return-void
.end method

.method private a(FI)F
    .locals 3

    .line 372
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-static {v0, p2}, Lo/elu;->a(II)I

    move-result v2

    .line 374
    add-int/lit8 v0, p2, -0x1

    mul-int/lit8 v0, v0, 0x2

    div-int v0, v2, v0

    sub-int v0, v2, v0

    int-to-float v0, v0

    return v0
.end method

.method private c(Lo/etk$d;)Lo/etk;
    .locals 3

    .line 263
    new-instance v2, Lo/etk;

    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/etk;-><init>(Landroid/content/Context;)V

    .line 264
    iget v0, p0, Lo/eto;->q:I

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lo/eto;->t:I

    invoke-virtual {v2, v0, v1}, Lo/etk;->setGroupSize(II)V

    .line 265
    invoke-virtual {v2, p1}, Lo/etk;->setItemView(Lo/etk$d;)V

    .line 266
    sget v0, Lo/eto;->s:I

    invoke-virtual {v2, v0}, Lo/etk;->setTextColor(I)V

    .line 267
    invoke-virtual {v2}, Lo/etk;->b()V

    .line 268
    return-object v2
.end method

.method private c()V
    .locals 4

    .line 204
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 205
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    .line 207
    :cond_0
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    .line 208
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/eto;->y:Z

    .line 210
    iget-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_invalid_data:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->r:Ljava/lang/String;

    .line 211
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 212
    iget-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_48dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lo/eto;->t:I

    .line 214
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    .line 215
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v3, 0x2

    sub-int/2addr v0, v1

    iput v0, p0, Lo/eto;->q:I

    .line 217
    return-void
.end method

.method private d()I
    .locals 1

    .line 277
    iget v0, p0, Lo/eto;->x:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 279
    :pswitch_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_ride:I

    return v0

    .line 281
    :pswitch_1
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_walk:I

    return v0

    .line 284
    :goto_0
    :pswitch_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->track_ic_exerciserecords_run:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private e()V
    .locals 6

    .line 220
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->home_item_layout_trend:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    .line 221
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->home_item_trend_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eto;->e:Landroid/widget/TextView;

    .line 223
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->trend_card_report_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eto;->f:Landroid/widget/ImageView;

    .line 224
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->trend_card_report_nodata:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eto;->h:Landroid/widget/ImageView;

    .line 225
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->report_run_title_bar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eto;->d:Landroid/widget/TextView;

    .line 226
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->trend_line_chart_description:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eto;->c:Landroid/widget/TextView;

    .line 227
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->trend_card_report_bar_chart:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->i:Landroid/view/View;

    .line 230
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->hw_health_report_barchart_run:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emt;

    iput-object v0, p0, Lo/eto;->b:Lo/emt;

    .line 231
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->care_card_report_avg_run_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eto;->k:Landroid/widget/TextView;

    .line 232
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->care_card_report_avg_run:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eto;->g:Landroid/widget/TextView;

    .line 233
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emt;->setData(Lo/ma;)V

    .line 234
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emt;->setNoDataText(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x42000000    # 32.0f

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/emt;->setExtraOffsets(FFFF)V

    goto :goto_0

    .line 238
    :cond_0
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const/high16 v1, 0x42000000    # 32.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/emt;->setExtraOffsets(FFFF)V

    .line 240
    :goto_0
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->report_bar_chart_dash_line_view_run:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 241
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 242
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emt;->setLayerType(ILandroid/graphics/Paint;)V

    .line 244
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    invoke-virtual {v0}, Lo/emt;->getYAxis()Lo/lp;

    move-result-object v0

    new-instance v1, Lo/eto$3;

    invoke-direct {v1, p0}, Lo/eto$3;-><init>(Lo/eto;)V

    invoke-virtual {v0, v1}, Lo/lp;->b(Lo/mf;)V

    .line 256
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    iget-object v0, p0, Lo/eto;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/homehealth/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 259
    :cond_1
    iget-object v0, p0, Lo/eto;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/ui/homehealth/R$id;->sport_data_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/che;

    iput-object v0, p0, Lo/eto;->l:Lo/che;

    .line 260
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    .line 111
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/eto;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lo/eto;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lo/eto;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 118
    :goto_0
    return-void
.end method

.method private f()V
    .locals 7

    .line 340
    iget v0, p0, Lo/eto;->x:I

    if-nez v0, :cond_0

    .line 341
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_steps_achievementtarget:I

    .line 342
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-object v4, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/commonui/R$plurals;->IDS_user_profile_achieve_day:I

    const/4 v6, 0x1

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->n:Lo/etk;

    .line 343
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_sport_trend_steps_daily_average:I

    .line 344
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->m:Lo/etk;

    goto/16 :goto_1

    .line 345
    :cond_0
    iget v0, p0, Lo/eto;->x:I

    const/16 v1, 0x2711

    if-ne v0, v1, :cond_1

    .line 346
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_time:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_total_duration:I

    .line 347
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_detail_fm_heart_min:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->n:Lo/etk;

    .line 348
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/eto;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 349
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->m:Lo/etk;

    goto :goto_1

    .line 351
    :cond_1
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_sportdetail_pace2:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_fitness_total_distance_data_title:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-boolean v4, p0, Lo/eto;->y:Z

    if-eqz v4, :cond_2

    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    .line 352
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_2
    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->n:Lo/etk;

    .line 354
    new-instance v0, Lo/etk$d;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    invoke-direct {p0}, Lo/eto;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_times:I

    .line 355
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/eto;->r:Ljava/lang/String;

    iget-object v4, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v5, Lcom/huawei/ui/main/R$plurals;->IDS_hwh_motiontrack_sport_data_time:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo/etk$d;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    invoke-direct {p0, v0}, Lo/eto;->c(Lo/etk$d;)Lo/etk;

    move-result-object v0

    iput-object v0, p0, Lo/eto;->m:Lo/etk;

    .line 358
    :goto_1
    iget-object v0, p0, Lo/eto;->n:Lo/etk;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/etk;->d(ZLandroid/content/Context;Z)V

    .line 359
    iget-object v0, p0, Lo/eto;->m:Lo/etk;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/etk;->d(ZLandroid/content/Context;Z)V

    .line 361
    invoke-direct {p0}, Lo/eto;->i()V

    .line 362
    return-void
.end method

.method private i()V
    .locals 5

    .line 289
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 290
    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    iget-object v1, p0, Lo/eto;->m:Lo/etk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    iget-object v1, p0, Lo/eto;->n:Lo/etk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 294
    :cond_0
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    iget-object v1, p0, Lo/eto;->n:Lo/etk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    iget-object v1, p0, Lo/eto;->m:Lo/etk;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    :goto_0
    iget-object v0, p0, Lo/eto;->l:Lo/che;

    invoke-virtual {v0}, Lo/che;->removeAllViews()V

    .line 298
    iget-object v0, p0, Lo/eto;->l:Lo/che;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/che;->e(I)V

    .line 299
    const/4 v2, 0x0

    :goto_1
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 300
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/etk;

    .line 301
    invoke-virtual {v3}, Lo/etk;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    .line 302
    if-eqz v4, :cond_1

    .line 303
    move-object v0, v4

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 305
    :cond_1
    iget-object v0, p0, Lo/eto;->l:Lo/che;

    invoke-virtual {v0, v3}, Lo/che;->addView(Landroid/view/View;)V

    .line 306
    and-int/lit8 v0, v2, 0x1

    if-nez v0, :cond_2

    .line 307
    iget-object v0, p0, Lo/eto;->l:Lo/che;

    invoke-direct {p0}, Lo/eto;->k()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/che;->addView(Landroid/view/View;)V

    .line 299
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 310
    :cond_3
    return-void
.end method

.method private k()Landroid/view/View;
    .locals 8

    .line 313
    new-instance v4, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 314
    new-instance v5, Landroid/view/View;

    iget-object v0, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 315
    sget v0, Lo/eto;->s:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 316
    const v0, 0x3e99999a    # 0.3f

    invoke-virtual {v5, v0}, Landroid/view/View;->setAlpha(F)V

    .line 317
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$dimen;->sport_data_cut_line_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iget-object v2, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v3, Lcom/huawei/ui/main/R$dimen;->hw_show_public_margin_26dp:I

    .line 318
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 317
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 320
    iget-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_size_6_dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 321
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/homehealth/R$dimen;->hw_show_service_icon_margin_top:I

    .line 322
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, -0x2

    invoke-direct {v7, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 323
    const/16 v0, 0x11

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 325
    iget-object v0, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v1, Lcom/huawei/ui/main/R$dimen;->hw_show_size_4_dp:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v6, v2, v0}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 326
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 327
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 329
    return-object v4
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 81
    iget-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    .line 86
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->b:Lo/emt;

    .line 87
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->i:Landroid/view/View;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->e:Landroid/widget/TextView;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->c:Landroid/widget/TextView;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->d:Landroid/widget/TextView;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->k:Landroid/widget/TextView;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->g:Landroid/widget/TextView;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->i:Landroid/view/View;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->h:Landroid/widget/ImageView;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->f:Landroid/widget/ImageView;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->n:Lo/etk;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->m:Lo/etk;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eto;->l:Lo/che;

    .line 100
    iget-object v0, p0, Lo/eto;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 101
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/ArrayList;IFLjava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/github/mikephil/charting/data/BarEntry;>;Ljava/util/ArrayList<Ljava/lang/String;>;IFLjava/lang/String;)V"
        }
    .end annotation

    .line 128
    const-string v0, "TrendCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBarChart"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    :cond_0
    invoke-virtual {p0}, Lo/eto;->b()V

    .line 131
    return-void

    .line 134
    :cond_1
    new-instance v8, Lo/eti;

    const-string v0, ""

    invoke-direct {v8, p1, v0}, Lo/eti;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 136
    iget v0, p0, Lo/eto;->x:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_2

    .line 137
    sget v0, Lo/dzk;->c:I

    invoke-virtual {v8, v0}, Lo/eti;->c(I)V

    goto :goto_0

    .line 139
    :cond_2
    sget v0, Lo/dzk;->b:I

    invoke-virtual {v8, v0}, Lo/eti;->c(I)V

    .line 143
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/eti;->c(Z)V

    .line 144
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v8, v0}, Lo/eti;->c(F)V

    .line 146
    iget v0, p0, Lo/eto;->x:I

    if-nez v0, :cond_4

    .line 147
    int-to-float v0, p3

    cmpl-float v0, v0, p4

    if-lez v0, :cond_3

    int-to-float v0, p3

    goto :goto_1

    :cond_3
    move v0, p4

    :goto_1
    const/4 v1, 0x5

    invoke-direct {p0, v0, v1}, Lo/eto;->a(FI)F

    move-result v0

    invoke-virtual {v8, v0}, Lo/eti;->k(F)V

    .line 149
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/eti;->f(F)V

    .line 152
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 153
    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    new-instance v10, Lo/lo;

    invoke-direct {v10, v9}, Lo/lo;-><init>(Ljava/util/List;)V

    .line 155
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    invoke-virtual {v0, v10}, Lo/emt;->setData(Lo/ma;)V

    .line 157
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    invoke-virtual {v0}, Lo/emt;->getXAxis()Lo/ln;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->c(I)V

    .line 158
    iget v0, p0, Lo/eto;->x:I

    if-nez v0, :cond_5

    .line 159
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    move-object v2, p2

    sget v3, Lo/dzk;->e:I

    int-to-float v4, p3

    move v5, p4

    const/high16 v6, 0x40800000    # 4.0f

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/emt;->setCustomValue(Landroid/content/Context;Ljava/util/ArrayList;IFFFZ)V

    .line 160
    iget-object v0, p0, Lo/eto;->k:Landroid/widget/TextView;

    int-to-double v1, p3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    iget-object v0, p0, Lo/eto;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_plugin_achievement_report_step_target:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    iget-object v0, p0, Lo/eto;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_steps:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 163
    iget-object v0, p0, Lo/eto;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_plugin_achievement_chart_step_unit:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 164
    :cond_5
    iget v0, p0, Lo/eto;->x:I

    const/16 v1, 0x102

    if-ne v0, v1, :cond_7

    .line 165
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    move-object v2, p2

    sget v3, Lo/dzk;->d:I

    move v5, p4

    const/4 v4, 0x0

    const/high16 v6, 0x40800000    # 4.0f

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/emt;->setCustomValue(Landroid/content/Context;Ljava/util/ArrayList;IFFFZ)V

    .line 166
    iget-object v0, p0, Lo/eto;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 168
    iget-object v0, p0, Lo/eto;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_sport_data_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 170
    :cond_6
    iget-object v0, p0, Lo/eto;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_sport_data_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    :cond_7
    :goto_2
    move-object/from16 v0, p5

    invoke-direct {p0, v0}, Lo/eto;->e(Ljava/lang/String;)V

    .line 174
    iget-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lo/eto;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    iget-object v0, p0, Lo/eto;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    invoke-virtual {v0}, Lo/emt;->invalidate()V

    .line 179
    return-void
.end method

.method public b()V
    .locals 2

    .line 104
    iget-object v0, p0, Lo/eto;->b:Lo/emt;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 105
    iget-object v0, p0, Lo/eto;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 107
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 188
    iget-object v0, p0, Lo/eto;->n:Lo/etk;

    invoke-virtual {v0, p1}, Lo/etk;->e(Ljava/lang/String;)V

    .line 189
    iget-object v0, p0, Lo/eto;->m:Lo/etk;

    invoke-virtual {v0, p2}, Lo/etk;->e(Ljava/lang/String;)V

    .line 190
    iget v0, p0, Lo/eto;->x:I

    if-nez v0, :cond_0

    .line 192
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 193
    iget-object v0, p0, Lo/eto;->n:Lo/etk;

    iget-object v1, p0, Lo/eto;->u:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$plurals;->IDS_user_profile_achieve_day:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etk;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    goto :goto_1

    .line 194
    :catch_0
    move-exception v4

    .line 195
    const-string v0, "TrendCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse reach goal day num fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    goto :goto_1

    .line 198
    :cond_0
    iget-object v0, p0, Lo/eto;->n:Lo/etk;

    invoke-static {}, Lo/cxh;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_mi:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lo/eto;->p:Landroid/content/res/Resources;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_motiontrack_show_sport_unit_km:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lo/etk;->b(Ljava/lang/String;)V

    .line 200
    :goto_1
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 74
    iput p1, p0, Lo/eto;->x:I

    .line 75
    invoke-direct {p0}, Lo/eto;->c()V

    .line 76
    invoke-direct {p0}, Lo/eto;->e()V

    .line 77
    invoke-direct {p0}, Lo/eto;->f()V

    .line 78
    return-void
.end method
