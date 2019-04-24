.class public Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Lo/emu;

.field private g:Lo/emu;

.field private h:Landroid/widget/ImageView;

.field private i:Lo/emu;

.field private k:Lo/emu;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Lo/emu;

.field private p:Lo/emu;

.field private q:Lo/cmj;

.field private r:Z

.field private s:Landroid/content/Context;

.field private t:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->m:Z

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->n:Z

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->l:Z

    .line 65
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->t:Z

    .line 66
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->r:Z

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 4

    .line 358
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 359
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    if-eqz p2, :cond_0

    .line 361
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 363
    :cond_0
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 366
    return-void
.end method

.method private b()V
    .locals 6

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_step_note_keep_alive:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 278
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_step_note_settings_dialog_title:I

    .line 279
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 280
    invoke-virtual {v0, v3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_close:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V

    .line 281
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V

    .line 287
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 293
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 294
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 295
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 298
    :cond_0
    return-void
.end method

.method private b(Z)V
    .locals 5

    .line 238
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->t:Z

    if-nez v0, :cond_4

    .line 239
    sget-object v0, Lo/dae;->dO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->a(Ljava/lang/String;Z)V

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 241
    const-string v0, "NotificationMessageSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChecked : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    if-nez p1, :cond_3

    .line 243
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cmj;->e(ZLo/cmo;)V

    .line 245
    return-void

    .line 248
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->b()V

    .line 252
    :cond_1
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 253
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d()V

    goto :goto_0

    .line 255
    :cond_2
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.unbindNotification"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 256
    sget-object v0, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cmj;->e(ZLo/cmo;)V

    .line 258
    goto :goto_0

    .line 260
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cmj;->e(ZLo/cmo;)V

    goto :goto_0

    .line 264
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->t:Z

    .line 266
    :cond_5
    :goto_0
    return-void
.end method

.method private c()V
    .locals 7

    .line 96
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_noticebar_main_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->b:Landroid/widget/LinearLayout;

    .line 97
    sget v0, Lcom/huawei/ui/main/R$id;->settings_message_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->a:Landroid/widget/LinearLayout;

    .line 98
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_real_time_push_steps_main_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d:Landroid/widget/LinearLayout;

    .line 99
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_steps_target_complete_remind_main_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e:Landroid/widget/LinearLayout;

    .line 100
    sget v0, Lcom/huawei/ui/main/R$id;->divider2:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->c:Landroid/widget/ImageView;

    .line 101
    sget v0, Lcom/huawei/ui/main/R$id;->divider3:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->h:Landroid/widget/ImageView;

    .line 102
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 105
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->real_time_push_steps_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->k:Lo/emu;

    .line 106
    sget v0, Lcom/huawei/ui/main/R$id;->steps_target_complete_remind_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->f:Lo/emu;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->k:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->f:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->k:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->n:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->f:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->m:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 112
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->n:Z

    if-nez v0, :cond_1

    .line 113
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->t:Z

    .line 115
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->m:Z

    if-nez v0, :cond_2

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->r:Z

    .line 119
    :cond_2
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 122
    :cond_3
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->l:Z

    if-nez v0, :cond_4

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->c:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->promotion_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->i:Lo/emu;

    .line 131
    sget v0, Lcom/huawei/ui/main/R$id;->notification_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->g:Lo/emu;

    .line 132
    sget v0, Lcom/huawei/ui/main/R$id;->smartcard_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->o:Lo/emu;

    .line 134
    sget v0, Lcom/huawei/ui/main/R$id;->noticebar_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->p:Lo/emu;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_promotion"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_notification"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_smartcard"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_noticebar"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->i:Lo/emu;

    const-string v1, "0"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x1

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->g:Lo/emu;

    const-string v1, "0"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const/4 v1, 0x1

    goto :goto_1

    :cond_6
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->o:Lo/emu;

    const-string v1, "0"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->p:Lo/emu;

    const-string v1, "0"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    const/4 v1, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->i:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->g:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->o:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->p:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 158
    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 327
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->r:Z

    if-nez v0, :cond_0

    .line 328
    sget-object v0, Lo/dae;->dP:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->a(Ljava/lang/String;Z)V

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 330
    const-string v0, "NotificationMessageSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChecked : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cmj;->c(ZLo/cmo;)V

    goto :goto_0

    .line 334
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->r:Z

    .line 336
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/cmj;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_wear_note_keep_alive:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 302
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_restore_factory_settings_dialog_title:I

    .line 303
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 304
    invoke-virtual {v0, v3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_close:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V

    .line 305
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)V

    .line 315
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 321
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 322
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 323
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 324
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;)Lo/emu;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->k:Lo/emu;

    return-object v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 344
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 345
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 347
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 350
    return-void
.end method

.method private e()Z
    .locals 2

    .line 268
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->a()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 269
    const/4 v0, 0x1

    return v0

    .line 271
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .line 163
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->real_time_push_steps_switch:I

    if-ne v0, v1, :cond_0

    .line 164
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->b(Z)V

    goto/16 :goto_8

    .line 165
    :cond_0
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->steps_target_complete_remind_switch:I

    if-ne v0, v1, :cond_1

    .line 166
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->c(Z)V

    goto/16 :goto_8

    .line 167
    :cond_1
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->promotion_switch:I

    if-ne v0, v1, :cond_4

    .line 168
    if-eqz p2, :cond_2

    const-string v5, "1"

    goto :goto_0

    :cond_2
    const-string v5, "0"

    .line 169
    :goto_0
    sget-object v0, Lo/dae;->eo:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->i:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_promotion"

    if-eqz p2, :cond_3

    const-string v3, "1"

    goto :goto_1

    :cond_3
    const-string v3, "0"

    :goto_1
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 173
    goto/16 :goto_8

    :cond_4
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->notification_switch:I

    if-ne v0, v1, :cond_7

    .line 174
    if-eqz p2, :cond_5

    const-string v5, "1"

    goto :goto_2

    :cond_5
    const-string v5, "0"

    .line 175
    :goto_2
    sget-object v0, Lo/dae;->ek:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->g:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_notification"

    if-eqz p2, :cond_6

    const-string v3, "1"

    goto :goto_3

    :cond_6
    const-string v3, "0"

    :goto_3
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 179
    goto/16 :goto_8

    :cond_7
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->smartcard_switch:I

    if-ne v0, v1, :cond_a

    .line 180
    if-eqz p2, :cond_8

    const-string v5, "1"

    goto :goto_4

    :cond_8
    const-string v5, "0"

    .line 181
    :goto_4
    sget-object v0, Lo/dae;->el:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->o:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_smartcard"

    if-eqz p2, :cond_9

    const-string v3, "1"

    goto :goto_5

    :cond_9
    const-string v3, "0"

    :goto_5
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 200
    goto :goto_8

    :cond_a
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->noticebar_switch:I

    if-ne v0, v1, :cond_d

    .line 201
    if-eqz p2, :cond_b

    const-string v5, "1"

    goto :goto_6

    :cond_b
    const-string v5, "0"

    .line 202
    :goto_6
    sget-object v0, Lo/dae;->et:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->p:Lo/emu;

    invoke-virtual {v0, p2}, Lo/emu;->setChecked(Z)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_noticebar"

    if-eqz p2, :cond_c

    const-string v3, "1"

    goto :goto_7

    :cond_c
    const-string v3, "0"

    :goto_7
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 207
    :cond_d
    :goto_8
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 73
    const-string v0, "NotificationMessageSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_notification_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->setContentView(I)V

    .line 76
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->s:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->q:Lo/cmj;

    .line 78
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 79
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 80
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 81
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 82
    const-string v0, "isOpenRealTimeStep"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->n:Z

    .line 83
    const-string v0, "isOpenCompleteGoal"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->m:Z

    .line 84
    const-string v0, "isOpenNotification"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->l:Z

    .line 87
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;->c()V

    .line 88
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 92
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 93
    return-void
.end method
