.class public Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b()V
    .locals 1

    .line 46
    sget v0, Lcom/huawei/ui/main/R$id;->rate_zone_calculation_des:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->a:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/huawei/ui/main/R$id;->des_title0:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->c:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/ui/main/R$id;->des_title1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->e:Landroid/widget/TextView;

    .line 50
    sget v0, Lcom/huawei/ui/main/R$id;->des_title2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->b:Landroid/widget/TextView;

    .line 51
    sget v0, Lcom/huawei/ui/main/R$id;->des_title3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->h:Landroid/widget/TextView;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->des_title4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->k:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->des_title5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->i:Landroid/widget/TextView;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->des_context0:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->f:Landroid/widget/TextView;

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->des_context1:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->g:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->des_context2:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->n:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/main/R$id;->des_context3:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->m:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->des_context4:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->l:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->des_context5:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->p:Landroid/widget/TextView;

    .line 61
    return-void
.end method

.method private c()V
    .locals 14

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_des_hrr_heart_rate_sample:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x1e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0xbe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/16 v2, 0x9c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/16 v2, 0xa9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_des_context5:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-wide v2, 0x404d800000000000L    # 59.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff5e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 68
    const-wide v3, 0x4052800000000000L    # 74.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 67
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_des_context4:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-wide v2, 0x4052800000000000L    # 74.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff5e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 70
    const-wide/high16 v3, 0x4055000000000000L    # 84.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 69
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_des_context3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-wide/high16 v2, 0x4055000000000000L    # 84.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff5e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 72
    const-wide/high16 v3, 0x4056000000000000L    # 88.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 71
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_des_context2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-wide/high16 v2, 0x4056000000000000L    # 88.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff5e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 74
    const-wide v3, 0x4057c00000000000L    # 95.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 73
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_rate_zone_hrr_des_context1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-wide v2, 0x4057c00000000000L    # 95.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff5e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 76
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 75
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_unsport_interval:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_sport_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_sport_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_sport_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_sport_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_sport_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_main_watch_detail_max_heart_rate_unsport_context:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-wide v2, 0x404d800000000000L    # 59.0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 37
    const-string v0, "InstructionOfHrrHeartRateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_instruction_hrr_heart_rate:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->setContentView(I)V

    .line 40
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->d:Landroid/content/Context;

    .line 41
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->b()V

    .line 42
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/InstructionOfHrrHeartRateActivity;->c()V

    .line 43
    return-void
.end method
