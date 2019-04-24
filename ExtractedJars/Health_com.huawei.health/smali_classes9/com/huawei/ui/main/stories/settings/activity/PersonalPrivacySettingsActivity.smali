.class public Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$c;
    }
.end annotation


# instance fields
.field private B:Z

.field private C:Landroid/widget/RelativeLayout;

.field private D:Landroid/widget/RelativeLayout;

.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Lo/emr;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Lo/emu;

.field private g:Lo/emu;

.field private h:Lo/emu;

.field private i:Lo/emu;

.field private k:Lo/emu;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Lo/emu;

.field private o:Lo/egr;

.field private p:Lo/egv;

.field private q:Z

.field private r:Z

.field private s:Lo/fhq;

.field private t:I

.field private u:Landroid/content/Context;

.field private v:Ljava/lang/String;

.field private w:Ljava/util/concurrent/ExecutorService;

.field private x:Z

.field private y:Landroid/os/Handler;

.field private z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 85
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 109
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    .line 113
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->r:Z

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 120
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$c;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->y:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/content/Context;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 7

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "privacy_last_clear_cloud_data_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 290
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 295
    :cond_0
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 296
    invoke-direct {p0, v5, v6}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    goto :goto_0

    .line 297
    :catch_0
    move-exception v5

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 300
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastClearCloudTimeFromLocal "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 831
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 832
    invoke-virtual {v0, p1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 833
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$7;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 841
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$10;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 848
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 849
    return-void
.end method

.method private a(Z)V
    .locals 6

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_agreement_china_seven:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 807
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_smartcard_product_recommendations:I

    .line 808
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 809
    invoke-virtual {v0, v3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V

    .line 810
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$9;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 818
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 825
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 826
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 827
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 828
    return-void
.end method

.method private a(Landroid/content/Context;I)Z
    .locals 5

    .line 555
    invoke-static {}, Lo/ahu;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 556
    const/4 v0, 0x0

    return v0

    .line 558
    :cond_0
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    .line 559
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 560
    invoke-virtual {v0, p2}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_wifi_outh_dialog_unbind_buttom:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$4;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Landroid/content/Context;)V

    .line 561
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 569
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 577
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 578
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 579
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 580
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;J)V
    .locals 0

    .line 85
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(J)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Z)V

    return-void
.end method

.method private b(Ljava/lang/Boolean;)V
    .locals 4

    .line 342
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save weight switch status "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->w:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$11;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Ljava/lang/Boolean;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 355
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 449
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    .line 450
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 451
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$20;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$20;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 452
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$13;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 460
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 468
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 473
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 863
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 864
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 866
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 869
    return-void
.end method

.method private c()V
    .locals 3

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_auto_update"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->v:Ljava/lang/String;

    .line 321
    const-string v0, "0"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 327
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->w:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$14;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 339
    :cond_1
    return-void
.end method

.method private c(J)V
    .locals 10

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 308
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    const/16 v1, 0x14

    invoke-static {v0, v1}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v4

    .line 310
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 311
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 312
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 313
    new-instance v8, Landroid/text/SpannableString;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_privacy_last_clear_time:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 314
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_profile_time:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 315
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 4

    .line 358
    if-eqz p1, :cond_2

    .line 359
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weight switch status hiUserPreference.getValue "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " weightAutoUpdate "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->v:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    return-void

    .line 363
    :cond_0
    const-string v0, "0"

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 366
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 369
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Ljava/lang/String;)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 5

    .line 511
    const/4 v4, -0x1

    .line 517
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_profile_to_cloud_switch_button:I

    if-ne v0, v1, :cond_0

    .line 518
    const/4 v4, 0x2

    goto :goto_0

    .line 519
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_fitness_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_1

    .line 520
    const/4 v4, 0x3

    goto :goto_0

    .line 522
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_health_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_2

    .line 523
    const/4 v4, 0x7

    goto :goto_0

    .line 524
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout:I

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout_1:I

    if-ne v0, v1, :cond_4

    .line 526
    :cond_3
    sget-object v0, Lo/dae;->eh:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d()V

    .line 528
    return-void

    .line 529
    :cond_4
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->goods_switch:I

    if-ne v0, v1, :cond_5

    .line 530
    const/16 v4, 0xa

    .line 533
    :cond_5
    :goto_0
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "privacyId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    invoke-virtual {v0, v4, p1}, Lo/fhq;->d(IZ)V

    .line 535
    return-void
.end method

.method private d()V
    .locals 2

    .line 538
    invoke-static {}, Lcom/huawei/cloudservice/CloudAccountManager;->getPwdVerifyIntent()Landroid/content/Intent;

    move-result-object v1

    .line 539
    const/16 v0, 0x65

    invoke-virtual {p0, v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 540
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h()V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 2

    .line 852
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_profile_to_cloud_switch_button:I

    if-ne v0, v1, :cond_0

    .line 853
    sget-object v0, Lo/dae;->ey:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 854
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_fitness_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_1

    .line 855
    sget-object v0, Lo/dae;->ex:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 856
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_health_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_2

    .line 857
    sget-object v0, Lo/dae;->eu:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 860
    :cond_2
    :goto_0
    return-void
.end method

.method private d(Z)V
    .locals 6

    .line 872
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 873
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    if-eqz p1, :cond_0

    .line 876
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 878
    :cond_0
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 881
    :goto_0
    sget-object v0, Lo/dae;->dM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 882
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 883
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 886
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)Z
    .locals 0

    .line 85
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->r:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)Landroid/os/Handler;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->y:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 14

    .line 149
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initView()..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_user_profile_privacy_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->setContentView(I)V

    .line 153
    sget v0, Lcom/huawei/ui/main/R$id;->personal_privacy_set_titlebar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c:Lo/emr;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$3;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    sget v0, Lcom/huawei/ui/main/R$id;->sync_profile_to_cloud_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h:Lo/emu;

    .line 163
    sget v0, Lcom/huawei/ui/main/R$id;->sync_fitness_data_to_cloud_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->g:Lo/emu;

    .line 164
    sget v0, Lcom/huawei/ui/main/R$id;->sync_health_data_to_cloud_switch_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i:Lo/emu;

    .line 165
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e:Landroid/widget/RelativeLayout;

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_auto_update_weight_switchbutton:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->hw_cancel_auth_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->cancel_auth_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->z:Landroid/widget/ImageView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_privacy_notice:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b:Landroid/widget/RelativeLayout;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->hw_vmall_privacy_notice:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d:Landroid/widget/RelativeLayout;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->weight_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->D:Landroid/widget/RelativeLayout;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_share_switchbutton:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->k:Lo/emu;

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_goods_main_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->C:Landroid/widget/RelativeLayout;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->goods_switch:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->n:Lo/emu;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout_1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->m:Landroid/widget/RelativeLayout;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->l:Landroid/widget/RelativeLayout;

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 194
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a()V

    .line 196
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 204
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-eqz v0, :cond_1

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->D:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->C:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 210
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v6

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/fhq;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 216
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initView... privacyBluetooth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", privacyBaseInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", privacySportData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", privacySleepData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", privacyHealthData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "privacyGoodsData = ,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 220
    move-object v7, v6

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const-string v1, "true"

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Lo/fhq;->d(IZ)V

    .line 223
    :cond_2
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    move-object v8, v6

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const-string v1, "true"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/fhq;->d(IZ)V

    .line 227
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h:Lo/emu;

    const-string v1, "true"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->g:Lo/emu;

    const-string v1, "true"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i:Lo/emu;

    const-string v1, "true"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->k:Lo/emu;

    invoke-static {}, Lo/dgk;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->n:Lo/emu;

    const-string v1, "1"

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->g:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->k:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->n:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_privacy_sync_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_privacy_cloud_data_manager_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout;

    .line 248
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->B:Z

    if-nez v0, :cond_4

    .line 251
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 252
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 256
    :cond_4
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->isSupportAuthAPPList()Z

    move-result v0

    if-nez v0, :cond_5

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 261
    :cond_5
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-eqz v0, :cond_6

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 266
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_profile_view1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    .line 268
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 269
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cloud_profile_view2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ImageView;

    .line 270
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_arrow_previous:I

    invoke-virtual {v13, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 273
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->z:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 276
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->z:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 278
    :goto_1
    return-void
.end method

.method private e(II)V
    .locals 4

    .line 418
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    .line 419
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 420
    invoke-virtual {v0, p1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$12;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 421
    invoke-virtual {v0, p2, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$15;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    .line 429
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 437
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    .line 438
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->p:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 442
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 0

    .line 85
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(Lcom/huawei/hihealth/HiUserPreference;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 85
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e(Z)V
    .locals 2

    .line 484
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_profile_to_cloud_switch_button:I

    if-ne v0, v1, :cond_0

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 487
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_fitness_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_1

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->g:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 490
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_health_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_2

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 492
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_health_share_switchbutton:I

    if-ne v0, v1, :cond_3

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->k:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 495
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->goods_switch:I

    if-ne v0, v1, :cond_4

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->n:Lo/emu;

    invoke-virtual {v0, p1}, Lo/emu;->setChecked(Z)V

    .line 499
    :cond_4
    :goto_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout:I

    if-eq v0, v1, :cond_5

    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout_1:I

    if-ne v0, v1, :cond_6

    .line 501
    :cond_5
    sget-object v0, Lo/dae;->eh:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 503
    :cond_6
    return-void
.end method

.method private f()V
    .locals 4

    .line 605
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->k()V

    .line 606
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearAllPersonalData... privacyId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/fhq;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 623
    return-void
.end method

.method private h()V
    .locals 5

    .line 587
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->h:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 589
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->g:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 591
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 592
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 602
    return-void
.end method

.method private i()V
    .locals 4

    .line 626
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastClearCloudDataTime enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$1;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v0, v1}, Lo/fhq;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 645
    return-void
.end method

.method private k()V
    .locals 4

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 695
    new-instance v0, Lo/egr$b;

    invoke-direct {v0, p0}, Lo/egr$b;-><init>(Landroid/content/Context;)V

    .line 696
    invoke-virtual {v0}, Lo/egr$b;->c()Lo/egr$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_sns_waiting:I

    .line 697
    invoke-virtual {v0, v1}, Lo/egr$b;->b(I)Lo/egr$b;

    move-result-object v0

    .line 698
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egr$b;->c(Z)Lo/egr$b;

    move-result-object v0

    .line 699
    invoke-virtual {v0}, Lo/egr$b;->a()Lo/egr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    .line 701
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    invoke-virtual {v0}, Lo/egr;->show()V

    .line 703
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog... mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 711
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 712
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    invoke-virtual {v0}, Lo/egr;->cancel()V

    .line 713
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->o:Lo/egr;

    .line 714
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 544
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 545
    const/16 v0, 0x65

    if-ne v0, p1, :cond_0

    .line 546
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 547
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f()V

    .line 552
    :cond_0
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .line 720
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    .line 721
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_health_share_switchbutton:I

    if-ne v0, v1, :cond_1

    .line 722
    if-eqz p2, :cond_0

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_share_app_enable_one:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 724
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_share_app_enable_two:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 725
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Ljava/lang/String;)V

    .line 726
    goto :goto_0

    .line 727
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->d(Z)V

    .line 728
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dgk;->b(Z)V

    .line 732
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->r:Z

    if-nez v0, :cond_2

    .line 733
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->r:Z

    .line 734
    return-void

    .line 736
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    if-nez v0, :cond_3

    .line 737
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->q:Z

    .line 738
    return-void

    .line 741
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_profile_to_cloud_switch_button:I

    if-ne v0, v1, :cond_6

    .line 743
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncProfileBtn.isChecked() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    if-nez p2, :cond_5

    .line 745
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_wifi_userinfo_outh_dialog_msg:I

    invoke-direct {p0, p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 746
    return-void

    .line 748
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_personal_profile_info_privacy_switch_close:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(II)V

    goto/16 :goto_2

    .line 750
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_personal_profile_info_privacy_switch_open:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 753
    :cond_6
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_fitness_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_8

    .line 755
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncFitnessBtn.isChecked() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    if-nez p2, :cond_7

    .line 757
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_fitness_privacy_switch_close:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(II)V

    goto/16 :goto_2

    .line 759
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_fitness_privacy_switch_open:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 764
    :cond_8
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->sync_health_data_to_cloud_switch_button:I

    if-ne v0, v1, :cond_d

    .line 765
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syncHealthBtn.isChecked() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    if-nez p2, :cond_b

    .line 767
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_wifi_outh_dialog_msg:I

    invoke-direct {p0, p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 768
    return-void

    .line 770
    :cond_9
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-nez v0, :cond_a

    .line 771
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_data_health_privacy_switch_close_china:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(II)V

    goto/16 :goto_2

    .line 773
    :cond_a
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_data_health_privacy_switch_close_oversea:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_ok:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(II)V

    goto/16 :goto_2

    .line 776
    :cond_b
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-nez v0, :cond_c

    .line 777
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_data_health_privacy_switch_open_china:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 780
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_data_health_privacy_switch_open_oversea:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 785
    :cond_d
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_health_auto_update_weight_switchbutton:I

    if-ne v0, v1, :cond_10

    .line 786
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->f:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 787
    if-eqz p2, :cond_e

    const-string v4, "1"

    goto :goto_1

    :cond_e
    const-string v4, "0"

    .line 788
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_weight_auto_update"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 790
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 791
    sget-object v0, Lo/dae;->em:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/Boolean;)V

    .line 794
    :cond_f
    goto :goto_2

    :cond_10
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->goods_switch:I

    if-ne v0, v1, :cond_12

    .line 795
    if-eqz p2, :cond_11

    .line 796
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Z)V

    goto :goto_2

    .line 798
    :cond_11
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Z)V

    .line 799
    sget-object v0, Lo/dae;->en:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 800
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(Z)V

    .line 803
    :cond_12
    :goto_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 650
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    .line 651
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout:I

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->clear_cloud_fitness_data_linear_layout_1:I

    if-ne v0, v1, :cond_1

    .line 654
    :cond_0
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear_cloud_fitness_data_linear_layout ... "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 655
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_delete_all_data_content:I

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_privacy_clear:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(II)V

    goto/16 :goto_1

    .line 659
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_cancel_auth_layout:I

    if-ne v0, v1, :cond_3

    .line 660
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v4

    .line 661
    if-eqz v4, :cond_2

    .line 662
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$6;-><init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/cloudservice/CloudAccount;->getAuthAppListIntent(Landroid/content/Context;Lcom/huawei/cloudservice/IntentResultHandler;)V

    goto :goto_0

    .line 674
    :cond_2
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "account is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    :goto_0
    goto :goto_1

    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_health_privacy_notice:I

    if-ne v0, v1, :cond_5

    .line 677
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    if-eqz v0, :cond_4

    .line 678
    new-instance v0, Lo/fht$a;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lo/fht$a;-><init>(Landroid/content/Context;Landroid/app/Activity;)V

    invoke-virtual {v0}, Lo/fht$a;->e()Lo/fht;

    move-result-object v0

    invoke-virtual {v0}, Lo/fht;->show()V

    goto :goto_1

    .line 680
    :cond_4
    new-instance v4, Lo/fhz;

    invoke-direct {v4, p0}, Lo/fhz;-><init>(Landroid/app/Activity;)V

    .line 681
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-virtual {v4, v0}, Lo/fhz;->a(Landroid/content/Context;)V

    .line 682
    goto :goto_1

    .line 684
    :cond_5
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->t:I

    sget v1, Lcom/huawei/ui/main/R$id;->hw_vmall_privacy_notice:I

    if-ne v0, v1, :cond_6

    .line 685
    new-instance v4, Lo/fhy;

    invoke-direct {v4}, Lo/fhy;-><init>()V

    .line 686
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    invoke-virtual {v4, v0}, Lo/fhy;->b(Landroid/content/Context;)V

    .line 688
    :cond_6
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 133
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter onCreate():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    sget-object v0, Lo/dae;->ea:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    iput-object p0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->u:Landroid/content/Context;

    .line 136
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->w:Ljava/util/concurrent/ExecutorService;

    .line 137
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/fhq;->d(Landroid/content/Context;)Lo/fhq;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->s:Lo/fhq;

    .line 138
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->x:Z

    .line 139
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->B:Z

    .line 140
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e()V

    .line 141
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c()V

    .line 142
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 282
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 284
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->i()V

    .line 285
    return-void
.end method
