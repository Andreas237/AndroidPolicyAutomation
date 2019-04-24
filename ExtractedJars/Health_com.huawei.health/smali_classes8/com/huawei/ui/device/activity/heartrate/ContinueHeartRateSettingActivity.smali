.class public Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/dqi;

.field private b:Lo/enz;

.field private c:Lo/emu;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:I

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private n:Landroid/widget/TextView;

.field private o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Landroid/widget/RelativeLayout;>;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private r:Landroid/view/View$OnClickListener;

.field private s:Ljava/util/concurrent/Semaphore;

.field private u:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    .line 79
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->s:Ljava/util/concurrent/Semaphore;

    .line 288
    new-instance v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$5;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 311
    new-instance v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$2;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->r:Landroid/view/View$OnClickListener;

    .line 362
    new-instance v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$7;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->q:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-object v0
.end method

.method private a(Landroid/widget/TextView;I)V
    .locals 5

    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "%1$d "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_watch_heart_rate_unit_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 358
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 359
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->c(I)V

    return-void
.end method

.method private a(ZZZ)V
    .locals 12

    .line 227
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mHeartReateRaiseNumber : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    iput v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->l:I

    .line 229
    if-eqz p2, :cond_0

    iget v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    if-eqz v0, :cond_0

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->n:Landroid/widget/TextView;

    .line 231
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_heartrate_raise_remind_explain:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 232
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    .line 233
    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v7, v8, v9, v10}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    .line 232
    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget v4, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    int-to-double v4, v4

    .line 234
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 231
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 240
    if-eqz p1, :cond_2

    .line 241
    iget v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(IIZ)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->n:Landroid/widget/TextView;

    .line 245
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_heartrate_raise_remind_explain_disable:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 246
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/device/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    .line 247
    const-wide/high16 v7, 0x4024000000000000L    # 10.0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static {v7, v8, v9, v10}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    .line 246
    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 245
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_about_huawei_cloud_service_action_turn_off:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 253
    if-eqz p1, :cond_1

    .line 254
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p3}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(IIZ)V

    goto :goto_0

    .line 256
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a:Lo/dqi;

    iget v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    new-instance v2, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$4;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 269
    :cond_2
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 271
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_health_sleep_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    goto :goto_1

    .line 274
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_health_sleep_arrow_right:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    .line 276
    :goto_1
    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v11, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v11, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 278
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)I
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->l:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->s:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method private b(I)V
    .locals 6

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    .line 381
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 382
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 383
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 384
    if-ne p1, v4, :cond_0

    .line 385
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 387
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 389
    :goto_1
    goto :goto_0

    .line 390
    :cond_1
    return-void
.end method

.method private b(IIZ)V
    .locals 4

    .line 282
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "opendOrCloseHeartRateRaiseRemindEnable opendOrClose : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  number : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b:Lo/enz;

    invoke-virtual {v0, p1, p2, p3}, Lo/enz;->d(IIZ)V

    .line 285
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 23

    .line 401
    sget v0, Lcom/huawei/ui/device/R$id;->rl_close:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 402
    sget v0, Lcom/huawei/ui/device/R$id;->iv_close:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 403
    sget v0, Lcom/huawei/ui/device/R$id;->rl_100:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 404
    sget v0, Lcom/huawei/ui/device/R$id;->iv_100:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 405
    sget v0, Lcom/huawei/ui/device/R$id;->tv_100:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 406
    sget v0, Lcom/huawei/ui/device/R$id;->rl_110:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 407
    sget v0, Lcom/huawei/ui/device/R$id;->iv_110:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 408
    sget v0, Lcom/huawei/ui/device/R$id;->tv_110:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 409
    sget v0, Lcom/huawei/ui/device/R$id;->rl_120:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RelativeLayout;

    .line 410
    sget v0, Lcom/huawei/ui/device/R$id;->iv_120:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    .line 411
    sget v0, Lcom/huawei/ui/device/R$id;->tv_120:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    .line 412
    sget v0, Lcom/huawei/ui/device/R$id;->rl_130:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/RelativeLayout;

    .line 413
    sget v0, Lcom/huawei/ui/device/R$id;->iv_130:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 414
    sget v0, Lcom/huawei/ui/device/R$id;->tv_130:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Landroid/widget/TextView;

    .line 415
    sget v0, Lcom/huawei/ui/device/R$id;->rl_140:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/RelativeLayout;

    .line 416
    sget v0, Lcom/huawei/ui/device/R$id;->iv_140:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/ImageView;

    .line 417
    sget v0, Lcom/huawei/ui/device/R$id;->tv_140:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/TextView;

    .line 418
    sget v0, Lcom/huawei/ui/device/R$id;->rl_150:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Landroid/widget/RelativeLayout;

    .line 419
    sget v0, Lcom/huawei/ui/device/R$id;->iv_150:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Landroid/widget/ImageView;

    .line 420
    sget v0, Lcom/huawei/ui/device/R$id;->tv_150:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Landroid/widget/TextView;

    .line 422
    move-object/from16 v0, p0

    const/16 v1, 0x64

    invoke-direct {v0, v7, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 423
    move-object/from16 v0, p0

    const/16 v1, 0x6e

    invoke-direct {v0, v10, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 424
    move-object/from16 v0, p0

    const/16 v1, 0x78

    invoke-direct {v0, v13, v1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 425
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    const/16 v2, 0x82

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 426
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    const/16 v2, 0x8c

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 427
    move-object/from16 v0, p0

    move-object/from16 v1, v22

    const/16 v2, 0x96

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(Landroid/widget/TextView;I)V

    .line 429
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x6e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x6e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x78

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x78

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x82

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x82

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x8c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x8c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    const/16 v1, 0x96

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    const/16 v1, 0x96

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 445
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 447
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v11, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 448
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v14, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 449
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 450
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->u:Landroid/view/View$OnClickListener;

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(I)V

    .line 453
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)I
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->p:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Lo/enz;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b:Lo/enz;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    .line 207
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateViewBySwitchStatus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_801a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_401a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_401a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    goto :goto_0

    .line 214
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p1, :cond_1

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_ff1a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_801a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$color;->text_color_801a1a1a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 221
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Lo/emu;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->c:Lo/emu;

    return-object v0
.end method

.method private d()V
    .locals 9

    .line 92
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->c:Lo/emu;

    .line 94
    sget v0, Lcom/huawei/ui/device/R$id;->settings_heart_rate_raise_remind_explain_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d:Landroid/widget/RelativeLayout;

    .line 95
    sget v0, Lcom/huawei/ui/device/R$id;->raise_remind_number:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->k:Landroid/widget/TextView;

    .line 96
    sget v0, Lcom/huawei/ui/device/R$id;->settings_heart_rate_imageView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e:Landroid/widget/ImageView;

    .line 97
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_content_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->i:Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_tip1_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->f:Landroid/widget/TextView;

    .line 99
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_tip2_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->g:Landroid/widget/TextView;

    .line 100
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_up_remind_explain:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->h:Landroid/widget/TextView;

    .line 102
    sget v0, Lcom/huawei/ui/device/R$id;->heart_rate_up_remind_content_explain:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->n:Landroid/widget/TextView;

    .line 104
    const-string v4, ""

    .line 105
    const-string v5, ""

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b:Lo/enz;

    invoke-virtual {v0}, Lo/enz;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 108
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 109
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh dialog Support deviceInfo is null , return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 114
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_1

    .line 115
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-eq v1, v0, :cond_1

    .line 116
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x8

    if-eq v1, v0, :cond_1

    .line 117
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x14

    if-eq v1, v0, :cond_1

    .line 118
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x15

    if-ne v1, v0, :cond_2

    .line 120
    :cond_1
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WATCH PRODUCT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_continue_HeartRate_explain_watch:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 122
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_watch_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->pic_heartrate_wear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 133
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_continue_HeartRate_explain_wristband:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 134
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_heart_rate_band_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->pic_heartrate_wear:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 140
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_Settings_continue_heart_rate_watch_or_band_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->i:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v8

    .line 146
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    .line 147
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm()Z

    move-result v0

    if-nez v0, :cond_3

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 151
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->r:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a:Lo/dqi;

    const-string v1, "continue_heart_rate"

    new-instance v2, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$1;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$3;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 199
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(I)V

    return-void
.end method

.method private e()V
    .locals 8

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 322
    const-string v0, "ContinueHeartRateSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingUnitPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 324
    sget v0, Lcom/huawei/ui/device/R$layout;->hw_show_setting_heart_reate_rasise_remind:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 326
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 327
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_heartrate_raise_remind:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 328
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$8;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    .line 329
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity$9;-><init>(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V

    .line 337
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 343
    invoke-direct {p0, v5}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b(Landroid/view/View;)V

    .line 344
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 345
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egw;->setCancelable(Z)V

    .line 346
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 347
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->e()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;ZZZ)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a(ZZZ)V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->l:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;)Ljava/util/Map;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 83
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 84
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_continue_measure_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->setContentView(I)V

    .line 85
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->a:Lo/dqi;

    .line 86
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->b:Lo/enz;

    .line 88
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->d()V

    .line 89
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 394
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 395
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->m:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/ContinueHeartRateSettingActivity;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 397
    invoke-static {p0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 398
    return-void
.end method
