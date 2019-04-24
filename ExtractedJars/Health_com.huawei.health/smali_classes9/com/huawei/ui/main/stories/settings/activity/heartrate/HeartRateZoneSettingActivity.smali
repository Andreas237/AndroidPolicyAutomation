.class public Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:Landroid/widget/ImageView;

.field private Q:Landroid/widget/ImageView;

.field private R:I

.field private S:I

.field private T:Landroid/widget/RelativeLayout;

.field private U:Lo/egw;

.field private V:Landroid/os/Handler;

.field private W:Landroid/widget/RelativeLayout;

.field private X:Lo/emc$c;

.field private a:Landroid/widget/TextView;

.field b:Landroid/view/View$OnClickListener;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Lo/emu;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:I

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Lo/emc;

.field private r:Landroid/widget/TextView;

.field private s:Lo/emp;

.field private t:Landroid/widget/TextView;

.field private u:Lo/emp;

.field private v:Z

.field private w:Landroid/widget/RelativeLayout;

.field private x:I

.field private y:I

.field private z:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 121
    const/16 v0, 0x3c

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    .line 123
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    .line 124
    const/16 v0, 0xc3

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    .line 126
    const/16 v0, 0xc3

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 127
    const/16 v0, 0xb0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 128
    const/16 v0, 0x5a

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    .line 129
    const/16 v0, 0x9c

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 130
    const/16 v0, 0x50

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    .line 131
    const/16 v0, 0x89

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 132
    const/16 v0, 0x46

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    .line 133
    const/16 v0, 0x75

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 134
    const/16 v0, 0x3c

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    .line 135
    const/16 v0, 0x62

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 136
    const/16 v0, 0x32

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    .line 139
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->M:I

    .line 141
    const/16 v0, 0x5f

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    .line 142
    const/16 v0, 0x58

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    .line 143
    const/16 v0, 0x54

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    .line 144
    const/16 v0, 0x4a

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    .line 145
    const/16 v0, 0x3b

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    .line 147
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    .line 154
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$3;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    .line 204
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b:Landroid/view/View$OnClickListener;

    .line 244
    new-instance v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->X:Lo/emc$c;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    return v0
.end method

.method private a()V
    .locals 12

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 583
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_unusual_stopped_message_more_new:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 584
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->w:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_max_heart_rate_percentage:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_description_string:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0xdc

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 589
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_runlesson_hrr_heart_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 590
    const-string v7, "InstructionOfMaxHeartRateActivity"

    .line 591
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->w:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->f:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_hrr_heart_rate_percentage:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 601
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_hrr_heart_rate_description_string:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 602
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_runlesson_hrr_heart_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 603
    const-string v7, "InstructionOfHrrHeartRateActivity"

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_anaerobicAdvance_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_anaerobicBase_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_lacticAcid_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_aerobicAdvance_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_aerobicBase_threshold:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 611
    :goto_0
    new-instance v9, Landroid/text/SpannableString;

    invoke-direct {v9, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 612
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v10

    .line 613
    new-instance v11, Lo/fhh;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    invoke-direct {v11, p0, v0}, Lo/fhh;-><init>(Landroid/content/Context;Z)V

    .line 614
    add-int/lit8 v0, v10, -0x4

    const/16 v1, 0x11

    invoke-virtual {v9, v11, v0, v10, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->r:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff5e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff5e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 620
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff5e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff5e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff5e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    add-int/lit8 v2, v2, -0x1

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 624
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 806
    const/4 v0, 0x4

    if-gt p1, v0, :cond_1

    .line 807
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========updateKRangSeekBar===index"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "=======getHigherValue(index-1)=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, p1, -0x1

    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->q:Lo/emc;

    add-int/lit8 v1, p1, -0x1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, p1, v1}, Lo/emc;->d(IF)V

    goto :goto_0

    .line 811
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->q:Lo/emc;

    add-int/lit8 v1, p1, -0x1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(I)I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x64

    int-to-float v1, v1

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, p1, v1}, Lo/emc;->d(IF)V

    .line 814
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    return p1
.end method

.method private b(I)Landroid/widget/TextView;
    .locals 2

    .line 997
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 999
    :pswitch_0
    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->l:Landroid/widget/TextView;

    .line 1000
    goto :goto_1

    .line 1002
    :pswitch_1
    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g:Landroid/widget/TextView;

    .line 1003
    goto :goto_1

    .line 1005
    :pswitch_2
    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h:Landroid/widget/TextView;

    .line 1006
    goto :goto_1

    .line 1008
    :pswitch_3
    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i:Landroid/widget/TextView;

    .line 1009
    goto :goto_1

    .line 1011
    :pswitch_4
    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k:Landroid/widget/TextView;

    .line 1012
    goto :goto_1

    .line 1014
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 1017
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private b()V
    .locals 1

    .line 797
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 798
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 799
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 800
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 801
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 803
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1161
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1162
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1164
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1166
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1167
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Z)Z
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    return p1
.end method

.method private b(II)[Ljava/lang/String;
    .locals 7

    .line 982
    if-le p1, p2, :cond_0

    .line 983
    const/4 v0, 0x0

    return-object v0

    .line 985
    :cond_0
    sub-int v0, p2, p1

    add-int/lit8 v0, v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    .line 986
    move v6, p1

    :goto_0
    if-gt v6, p2, :cond_1

    .line 987
    sub-int v0, v6, p1

    int-to-double v1, v6

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v5, v0

    .line 986
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 989
    :cond_1
    return-object v5
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)Landroid/widget/TextView;
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(I)Landroid/widget/TextView;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 16

    .line 433
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_heart_rate_zone_setting:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->setContentView(I)V

    .line 436
    sget v0, Lcom/huawei/ui/main/R$id;->max_heart_alarm_switch_button:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e:Lo/emu;

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e:Lo/emu;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;

    move-object/from16 v2, p0

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 458
    sget v0, Lcom/huawei/ui/main/R$id;->kRangeSeekBarView:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emc;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->q:Lo/emc;

    .line 459
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->q:Lo/emc;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->X:Lo/emc$c;

    invoke-virtual {v0, v1}, Lo/emc;->a(Lo/emc$c;)V

    .line 463
    sget v0, Lcom/huawei/ui/main/R$id;->upper_limit_layout:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 464
    sget v0, Lcom/huawei/ui/main/R$id;->upper_limit_textview:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c:Landroid/widget/TextView;

    .line 471
    sget v0, Lcom/huawei/ui/main/R$id;->classify_method_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 472
    sget v0, Lcom/huawei/ui/main/R$id;->classify_method_textview:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a:Landroid/widget/TextView;

    .line 475
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_describe:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 476
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_describe:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->r:Landroid/widget/TextView;

    .line 479
    sget v0, Lcom/huawei/ui/main/R$id;->max_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 480
    sget v0, Lcom/huawei/ui/main/R$id;->max_textview:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d:Landroid/widget/TextView;

    .line 483
    sget v0, Lcom/huawei/ui/main/R$id;->rest_heart_rate_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->w:Landroid/widget/RelativeLayout;

    .line 484
    sget v0, Lcom/huawei/ui/main/R$id;->rest_heart_rate_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 485
    sget v0, Lcom/huawei/ui/main/R$id;->rest_heart_rate_textview:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->f:Landroid/widget/TextView;

    .line 487
    sget v0, Lcom/huawei/ui/main/R$id;->zone_name1:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->o:Landroid/widget/TextView;

    .line 489
    sget v0, Lcom/huawei/ui/main/R$id;->zone_name2:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m:Landroid/widget/TextView;

    .line 491
    sget v0, Lcom/huawei/ui/main/R$id;->zone_name3:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->p:Landroid/widget/TextView;

    .line 493
    sget v0, Lcom/huawei/ui/main/R$id;->zone_name4:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->n:Landroid/widget/TextView;

    .line 495
    sget v0, Lcom/huawei/ui/main/R$id;->zone_name5:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->t:Landroid/widget/TextView;

    .line 497
    sget v0, Lcom/huawei/ui/main/R$id;->limit_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 498
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_limit:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k:Landroid/widget/TextView;

    .line 500
    sget v0, Lcom/huawei/ui/main/R$id;->anaerobic_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 501
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_anaerobic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i:Landroid/widget/TextView;

    .line 503
    sget v0, Lcom/huawei/ui/main/R$id;->aerobic_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_aerobic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h:Landroid/widget/TextView;

    .line 506
    sget v0, Lcom/huawei/ui/main/R$id;->reduce_fat_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 507
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_reduce_fat:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g:Landroid/widget/TextView;

    .line 509
    sget v0, Lcom/huawei/ui/main/R$id;->warm_up_layout:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 510
    sget v0, Lcom/huawei/ui/main/R$id;->text_view_warm_up:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->l:Landroid/widget/TextView;

    .line 513
    sget v0, Lcom/huawei/ui/main/R$id;->heanth_rate_subheader:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->u:Lo/emp;

    .line 515
    sget v0, Lcom/huawei/ui/main/R$id;->heanth_rate_subheader_seting:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emp;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->s:Lo/emp;

    .line 516
    new-instance v3, Lo/fcl;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    const/4 v1, 0x2

    invoke-direct {v3, v0, v1}, Lo/fcl;-><init>(Landroid/content/Context;I)V

    .line 517
    new-instance v4, Lo/fcp;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b:Landroid/view/View$OnClickListener;

    invoke-direct {v4, v0, v1}, Lo/fcp;-><init>(Landroid/content/Context;Landroid/view/View$OnClickListener;)V

    .line 518
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/fcp;->c(I)V

    .line 519
    new-instance v5, Landroid/support/v7/widget/LinearLayoutManager;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 520
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 521
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->u:Lo/emp;

    invoke-virtual {v0, v5}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 522
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->u:Lo/emp;

    invoke-virtual {v0, v3}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 523
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->s:Lo/emp;

    invoke-virtual {v0, v6}, Lo/emp;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->s:Lo/emp;

    invoke-virtual {v0, v4}, Lo/emp;->setAdapter(Lo/flg$a;)V

    .line 525
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 527
    sget v0, Lcom/huawei/ui/main/R$id;->upper_limit_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    .line 528
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 530
    sget v0, Lcom/huawei/ui/main/R$id;->max_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 531
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 533
    sget v0, Lcom/huawei/ui/main/R$id;->image_limit_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 534
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 537
    sget v0, Lcom/huawei/ui/main/R$id;->image_anaerobic_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    .line 538
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v10, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 540
    sget v0, Lcom/huawei/ui/main/R$id;->image_aerobic_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    .line 541
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 544
    sget v0, Lcom/huawei/ui/main/R$id;->image_reduce_fat_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/ImageView;

    .line 545
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v12, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 547
    sget v0, Lcom/huawei/ui/main/R$id;->image_warm_up_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/ImageView;

    .line 548
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v13, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 550
    sget v0, Lcom/huawei/ui/main/R$id;->rest_heart_rate_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/ImageView;

    .line 551
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 553
    sget v0, Lcom/huawei/ui/main/R$id;->classify_method_enter_ic:I

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 554
    sget v0, Lcom/huawei/ui/main/R$mipmap;->ic_goal_arrow_left:I

    invoke-virtual {v15, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 556
    :cond_0
    return-void
.end method

.method private c(I)V
    .locals 10

    .line 395
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->o()I

    move-result v4

    .line 396
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->l()I

    move-result v5

    .line 397
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->n()I

    move-result v6

    .line 398
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->p()I

    move-result v7

    .line 399
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->g()I

    move-result v8

    .line 400
    mul-int/lit8 v0, v4, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    .line 401
    mul-int/lit8 v0, v5, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    .line 402
    mul-int/lit8 v0, v6, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    .line 403
    mul-int/lit8 v0, v7, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    .line 404
    mul-int/lit8 v0, v8, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    .line 405
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    .line 406
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    .line 408
    :cond_0
    const-string v0, "HeartRateZoneSettingActivity"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====setHeartRateZonePercent maxHeartRate=====LimitPercent=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " AnaerobicPercent = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " AerobicPercent = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    .line 409
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " ReduceFatPercent = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " WarmUpPercent = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 408
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->z()I

    move-result v4

    .line 414
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->y()I

    move-result v5

    .line 415
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->u()I

    move-result v6

    .line 416
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->q()I

    move-result v7

    .line 417
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->r()I

    move-result v8

    .line 418
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v9, p1, v0

    .line 419
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v0, v4, v0

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v9

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    .line 420
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v0, v5, v0

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v9

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    .line 421
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v0, v6, v0

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v9

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    .line 422
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v0, v7, v0

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v9

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    .line 423
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v0, v8, v0

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v9

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    .line 424
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_1

    .line 425
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    .line 427
    :cond_1
    const-string v0, "HeartRateZoneSettingActivity"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====setHeartRateZonePercent hrrHeartRate=====LimitPercent=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " AnaerobicPercent = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " AerobicPercent = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    .line 428
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " ReduceFatPercent = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " WarmUpPercent = "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 427
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    return-void
.end method

.method private c(II)V
    .locals 0

    .line 1056
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1058
    :pswitch_0
    iput p2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 1059
    goto :goto_0

    .line 1061
    :pswitch_1
    iput p2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 1062
    goto :goto_0

    .line 1064
    :pswitch_2
    iput p2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 1065
    goto :goto_0

    .line 1067
    :pswitch_3
    iput p2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 1068
    goto :goto_0

    .line 1070
    :pswitch_4
    iput p2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 1071
    .line 1076
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    return p1
.end method

.method private d()V
    .locals 4

    .line 366
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    .line 368
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->h()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    .line 369
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->f()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 370
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->o()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 371
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->l()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 372
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->n()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 373
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->p()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 374
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    goto :goto_0

    .line 376
    :cond_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    .line 377
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->s()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    .line 378
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->t()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 379
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->z()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 380
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->y()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 381
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->u()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 382
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->q()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 383
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->r()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 386
    :goto_0
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======initData====bMaxAlarm:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iUpLimit"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iMax"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iLimit"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iAnaerobic"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iAerobic"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iReduceFat"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " iWarmUp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 627
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 628
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    .line 629
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    .line 630
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    .line 631
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    .line 632
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, p1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    .line 633
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_1

    .line 634
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    goto/16 :goto_0

    .line 637
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v4, p1, v0

    .line 638
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    .line 639
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    .line 640
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    .line 641
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    .line 642
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    int-to-float v1, v4

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    .line 643
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_1

    .line 644
    const/16 v0, 0x1e

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    .line 648
    :cond_1
    :goto_0
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====updateUIPercent=====LimitPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====updateUIPercent=====AnaerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====updateUIPercent=====AerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====updateUIPercent=====ReduceFatPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====updateUIPercent=====WarmUpPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z
    .locals 1

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    return v0
.end method

.method private e(I)I
    .locals 2

    .line 1023
    const/4 v1, 0x0

    .line 1024
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1026
    :pswitch_0
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 1027
    goto :goto_0

    .line 1029
    :pswitch_1
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 1030
    goto :goto_0

    .line 1032
    :pswitch_2
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 1033
    goto :goto_0

    .line 1035
    :pswitch_3
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 1036
    goto :goto_0

    .line 1038
    :pswitch_4
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 1039
    goto :goto_0

    .line 1042
    :pswitch_5
    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 1046
    .line 1050
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    return p1
.end method

.method private e()V
    .locals 8

    .line 311
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v4

    .line 313
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v5

    .line 314
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 316
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    .line 317
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 320
    goto :goto_0

    .line 318
    :catch_0
    move-exception v6

    .line 319
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreference value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    :cond_0
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_Rest_HeartRate"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 323
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 325
    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    .line 326
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setRestHeartRate(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 329
    goto :goto_1

    .line 327
    :catch_1
    move-exception v7

    .line 328
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse restHeartRate value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    :cond_1
    :goto_1
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "iClassifyMethed = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "iRestHeartRate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 363
    :cond_2
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;II)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(II)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    return v0
.end method

.method private f()V
    .locals 4

    .line 1107
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=======LimitPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===iMax=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1108
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 1109
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=====iLimit=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1111
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=======AnaerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===iMax=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1112
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 1113
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=====iAnaerobic=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1115
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=======AerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===iMax=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 1117
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=====fAerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=======ReduceFatPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===iMax=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1120
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 1121
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=====iReduceFat=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=======WarmUpPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===iMax=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 1125
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processAllValue=====iWarmUp=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->f()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I
    .locals 1

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(I)I

    move-result v0

    return v0
.end method

.method private g()V
    .locals 15

    .line 1082
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->j:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 1083
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->A:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v10

    .line 1084
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->F:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 1085
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->G:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v12

    .line 1086
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->K:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v13

    .line 1087
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    move v4, v9

    move v5, v10

    move v6, v11

    move v7, v12

    move v8, v13

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->c(ZIIIIIII)V

    .line 1089
    const-string v0, "HeartRateZoneSettingActivity"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======updateHeartZoneDataForConf maxheartRate====bMaxAlarm:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " iUpLimit"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " iMax"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 1090
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " iLimit"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " iAnaerobic"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " iAerobic"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " iReduceFat"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " iWarmUp"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 1089
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v14, v0, v1

    .line 1095
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    mul-int/2addr v0, v14

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int v9, v0, v1

    .line 1096
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    mul-int/2addr v0, v14

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int v10, v0, v1

    .line 1097
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    mul-int/2addr v0, v14

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int v11, v0, v1

    .line 1098
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    mul-int/2addr v0, v14

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int v12, v0, v1

    .line 1099
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    mul-int/2addr v0, v14

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int v13, v0, v1

    .line 1100
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    move v4, v9

    move v5, v10

    move v6, v11

    move v7, v12

    move v8, v13

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->d(ZIIIIIII)V

    .line 1102
    const-string v0, "HeartRateZoneSettingActivity"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======updateHeartZoneDataForConf hrrheartRate====bMaxAlarm:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " iUpLimit"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " iMax"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    .line 1103
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " iLimit"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " iAnaerobic"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " iAerobic"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, " iReduceFat"

    const/16 v3, 0xc

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " iWarmUp"

    const/16 v3, 0xe

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 1102
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1104
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)I
    .locals 0

    .line 57
    iput p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    return p1
.end method

.method private h()V
    .locals 5

    .line 1130
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int v4, v0, v1

    .line 1132
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=======iHRRAnaerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===HRR=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->L:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    .line 1134
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=====iLimit=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=======iHRRAnaerobicBasePercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===HRR=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1137
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->N:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    .line 1138
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=====iAnaerobic=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1140
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=======iHRRLacticAcidPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===HRR=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->J:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    .line 1142
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=====iAerobic=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1144
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=======iHRRAerobicPercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===HRR=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1145
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->O:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    .line 1146
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=====iReduceFat=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1148
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=======iHRRAerobicBasePercent=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "===HRR=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->R:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    .line 1150
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====processHRRReleativeValue=====iWarmUp=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1152
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    return v0
.end method

.method private i()V
    .locals 2

    .line 967
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->U:Lo/egw;

    if-eqz v0, :cond_0

    .line 968
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->U:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 970
    :cond_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    invoke-virtual {v0, v1}, Lo/dgu;->a(I)V

    .line 971
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 972
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    return v0
.end method

.method private k()V
    .locals 7

    .line 902
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showClassifyMethodDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 904
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_heart_rate_classify_method:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 906
    new-instance v6, Lo/egw$c;

    invoke-direct {v6, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 907
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_main_heart_rate_classify_method:I

    invoke-virtual {v6, v0}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 908
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$9;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 916
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 921
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->U:Lo/egw;

    .line 922
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 923
    sget v0, Lcom/huawei/ui/main/R$id;->max_heart_rate_imgview:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->P:Landroid/widget/ImageView;

    .line 924
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_reserve_imgview:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->Q:Landroid/widget/ImageView;

    .line 925
    sget v0, Lcom/huawei/ui/main/R$id;->max_heart_rate_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->T:Landroid/widget/RelativeLayout;

    .line 926
    sget v0, Lcom/huawei/ui/main/R$id;->heart_rate_reserve_layout:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->W:Landroid/widget/RelativeLayout;

    .line 928
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 929
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->Q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 932
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 933
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->Q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 936
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->T:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$10;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 946
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->W:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$8;-><init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 958
    :cond_1
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingMapTypeDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->U:Lo/egw;

    .line 960
    return-void

    .line 962
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->U:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 964
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(I)V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h()V

    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a()V

    return-void
.end method

.method private m()Z
    .locals 2

    .line 1155
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->S:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I
    .locals 1

    .line 57
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->P:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->Q:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i()V

    return-void
.end method


# virtual methods
.method public d(Landroid/content/Context;Landroid/os/Handler;IIIILjava/lang/String;)V
    .locals 10

    .line 869
    if-le p3, p4, :cond_0

    .line 870
    return-void

    .line 872
    :cond_0
    new-instance v2, Lo/fhg$a;

    invoke-direct {v2, p1, p2, p5}, Lo/fhg$a;-><init>(Landroid/content/Context;Landroid/os/Handler;I)V

    .line 873
    invoke-direct {p0, p3, p4}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(II)[Ljava/lang/String;

    move-result-object v3

    .line 875
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lo/fhg$a;->c([Ljava/lang/String;Ljava/lang/Integer;)Lo/fhg;

    move-result-object v4

    .line 877
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 878
    move-object/from16 v0, p7

    invoke-virtual {v2, v0}, Lo/fhg$a;->c(Ljava/lang/String;)V

    .line 880
    invoke-virtual {v4}, Lo/fhg;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 881
    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {v5, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 882
    const/16 v0, 0x50

    invoke-virtual {v5, v0}, Landroid/view/Window;->setGravity(I)V

    .line 883
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v6

    .line 884
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/view/WindowManager;

    .line 885
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 886
    const/4 v9, 0x0

    .line 887
    invoke-static {p1}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 888
    const/high16 v0, 0x433f0000    # 191.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v9

    goto :goto_0

    .line 890
    :cond_1
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v9

    .line 892
    :goto_0
    invoke-virtual {v8}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v9, 0x2

    sub-int/2addr v0, v1

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 893
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p1, v0}, Lo/egv;->d(Landroid/content/Context;F)I

    move-result v0

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 894
    invoke-virtual {v5, v6}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 895
    sget v0, Lcom/huawei/ui/main/R$style;->track_dialog_anim:I

    invoke-virtual {v5, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 896
    invoke-virtual {v4}, Lo/fhg;->show()V

    .line 899
    :cond_2
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 11

    .line 819
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 821
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========onActivityResult===="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    const/4 v0, 0x3

    if-ne p2, v0, :cond_2

    .line 824
    const-string v0, "upperValue"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 825
    const-string v0, "lowerValue"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 826
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 827
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(II)V

    .line 828
    add-int/lit8 v0, p1, 0x1

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(II)V

    .line 830
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(I)V

    .line 831
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a()V

    .line 832
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 833
    add-int/lit8 v0, p1, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(I)V

    .line 834
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 835
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    iget v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    iget v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    iget v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    iget v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->c(ZIIIIIII)V

    goto :goto_0

    .line 838
    :cond_1
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->v:Z

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->y:I

    iget v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    iget v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    iget v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    iget v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    iget v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->d(ZIIIIIII)V

    .line 844
    :cond_2
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 13

    .line 666
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    mul-int/lit8 v0, v0, 0x5

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 667
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    mul-int/lit8 v0, v0, 0x1

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v9

    .line 669
    sget v0, Lcom/huawei/ui/main/R$id;->upper_limit_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 671
    sget-object v0, Lo/dae;->gt:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 673
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 675
    move-object v0, p0

    move-object v1, p0

    :try_start_0
    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    move v6, v11

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_rate_max_limit:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/16 v3, 0x64

    const/16 v4, 0xdc

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Landroid/content/Context;Landroid/os/Handler;IIIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 678
    goto :goto_0

    .line 676
    :catch_0
    move-exception v12

    .line 677
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    :goto_0
    goto :goto_1

    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->classify_method_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 682
    sget-object v0, Lo/dae;->gy:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 683
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k()V

    .line 685
    :cond_1
    :goto_1
    sget v0, Lcom/huawei/ui/main/R$id;->max_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 687
    sget-object v0, Lo/dae;->gs:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 689
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 690
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/lit8 v0, v0, 0xf

    const/16 v1, 0x64

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 691
    move-object v0, p0

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    move v3, v12

    move v6, v11

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_string:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/16 v4, 0xdc

    const/4 v5, 0x4

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Landroid/content/Context;Landroid/os/Handler;IIIILjava/lang/String;)V

    .line 693
    goto/16 :goto_7

    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->rest_heart_rate_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 695
    sget-object v0, Lo/dae;->gv:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 697
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 698
    iget v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    add-int/lit8 v0, v0, -0xf

    const/16 v1, 0x6e

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 699
    move-object v0, p0

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->V:Landroid/os/Handler;

    move v4, v12

    move v6, v11

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lcom/huawei/ui/main/R$string;->IDS_resting_heart_rate_string:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/16 v3, 0x1e

    const/4 v5, 0x6

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Landroid/content/Context;Landroid/os/Handler;IIIILjava/lang/String;)V

    .line 701
    goto/16 :goto_7

    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->limit_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_5

    .line 703
    sget-object v0, Lo/dae;->gq:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {v10, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 706
    const-string v0, "intent_extra_is_enable_upper_change"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 707
    const-string v0, "intent_extra_use_upper_span"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 708
    const-string v0, "upperValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 709
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 710
    const-string v0, "upperSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 711
    const-string v0, "lowerSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 712
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 713
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_maximum_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    .line 715
    :cond_4
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_anaerobicAdvance_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 717
    :goto_2
    const-string v0, "intent_extra_upper_span_value"

    invoke-virtual {v10, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 718
    const-string v0, "intent_extra_span_value"

    invoke-virtual {v10, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 719
    const/4 v0, 0x4

    invoke-virtual {p0, v10, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 721
    goto/16 :goto_7

    :cond_5
    sget v0, Lcom/huawei/ui/main/R$id;->anaerobic_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 723
    sget-object v0, Lo/dae;->gr:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {v10, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 725
    const-string v0, "intent_extra_use_upper_span"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 726
    const-string v0, "upperValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 727
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 728
    const-string v0, "upperSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 729
    const-string v0, "lowerSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 730
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 731
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_anaerobic_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_3

    .line 733
    :cond_6
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_anaerobicBase_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 735
    :goto_3
    const-string v0, "intent_extra_upper_span_value"

    invoke-virtual {v10, v0, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 736
    const-string v0, "intent_extra_span_value"

    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 737
    const/4 v0, 0x3

    invoke-virtual {p0, v10, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 739
    goto/16 :goto_7

    :cond_7
    sget v0, Lcom/huawei/ui/main/R$id;->aerobic_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_9

    .line 741
    sget-object v0, Lo/dae;->gz:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 742
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {v10, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 743
    const-string v0, "upperValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->C:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 744
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 745
    const-string v0, "upperSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 746
    const-string v0, "lowerSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 747
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 748
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_aerobic_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_4

    .line 750
    :cond_8
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_lacticAcid_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 753
    :goto_4
    const-string v0, "intent_extra_span_value"

    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 754
    const/4 v0, 0x2

    invoke-virtual {p0, v10, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 756
    goto/16 :goto_7

    :cond_9
    sget v0, Lcom/huawei/ui/main/R$id;->reduce_fat_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_b

    .line 758
    sget-object v0, Lo/dae;->gw:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {v10, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 760
    const-string v0, "upperValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->D:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 761
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 762
    const-string v0, "upperSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 763
    const-string v0, "lowerSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 764
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 765
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_fatburn_threshold_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_5

    .line 767
    :cond_a
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_aerobicAdvance_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 769
    :goto_5
    const-string v0, "intent_extra_span_value"

    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 770
    const/4 v0, 0x1

    invoke-virtual {p0, v10, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 772
    goto/16 :goto_7

    :cond_b
    sget v0, Lcom/huawei/ui/main/R$id;->warm_up_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_d

    .line 774
    sget-object v0, Lo/dae;->gx:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 775
    new-instance v10, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateSectionActivity;

    invoke-direct {v10, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 776
    const-string v0, "upperValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->H:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 777
    const-string v0, "upperSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->E:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 778
    const-string v0, "lowerSelected"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->I:I

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 779
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 780
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_warmup_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 781
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    mul-int/lit8 v1, v1, 0x1e

    div-int/lit8 v1, v1, 0x64

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_6

    .line 783
    :cond_c
    const-string v0, "intent_extra_default_title"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_aerobicBase_threshold:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 784
    const-string v0, "lowerValue"

    iget v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->B:I

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    sub-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1e

    div-int/lit8 v1, v1, 0x64

    iget v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->x:I

    add-int/2addr v1, v2

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 786
    :goto_6
    const-string v0, "intent_extra_upper_span_value"

    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 787
    const-string v0, "intent_extra_span_value"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 788
    const/4 v0, 0x0

    invoke-virtual {p0, v10, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 793
    :cond_d
    :goto_7
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 301
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 303
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->z:Landroid/content/Context;

    .line 304
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c()V

    .line 305
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e()V

    .line 307
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 848
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 851
    const-string v0, "HeartRateZoneSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==== mHrzSettinginteractors setHeartRateZoneSettingInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 853
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->e()V

    .line 854
    return-void
.end method
