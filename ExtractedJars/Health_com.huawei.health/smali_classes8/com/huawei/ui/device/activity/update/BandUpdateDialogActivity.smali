.class public Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private B:Ljava/lang/String;

.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Z

.field private k:Landroid/widget/TextView;

.field private l:Lo/egd;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Lo/egd;

.field private p:Lo/egd;

.field private q:Z

.field private r:Landroid/widget/LinearLayout;

.field private s:Lo/egd;

.field private t:Ljava/lang/String;

.field private u:Lo/eob;

.field private v:Lo/dqi;

.field private w:Z

.field private x:Landroid/widget/CheckBox;

.field private y:Ljava/lang/String;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    .line 58
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->w:Z

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->y:Ljava/lang/String;

    return-void
.end method

.method private b()V
    .locals 4

    .line 171
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_show_changelog:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->d:Landroid/widget/LinearLayout;

    .line 174
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b:Landroid/widget/TextView;

    .line 175
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->a:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_version_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->i:Landroid/widget/TextView;

    .line 177
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->k:Landroid/widget/TextView;

    .line 178
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_size_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->f:Landroid/widget/TextView;

    .line 179
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_detail:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->h:Landroid/widget/TextView;

    .line 180
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_changelog_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->g:Landroid/widget/TextView;

    .line 181
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_show_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->l:Lo/egd;

    .line 182
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_show_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->o:Lo/egd;

    .line 184
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c:Landroid/widget/LinearLayout;

    .line 185
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->m:Landroid/widget/TextView;

    .line 186
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->n:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->p:Lo/egd;

    .line 188
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->s:Lo/egd;

    .line 190
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_ota_auto_update:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->r:Landroid/widget/LinearLayout;

    .line 191
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_checkbox:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->x:Landroid/widget/CheckBox;

    .line 192
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->p:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_later:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->s:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_now:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_band_update:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_force_alert_tip_new:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->s:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_update_new_version_ok:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_force_alert_tip:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 264
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showErrorMsg : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->p:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->s:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    return-void
.end method

.method private c()V
    .locals 3

    .line 290
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->j:Z

    if-eqz v0, :cond_0

    .line 291
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/WeightUpdateVersionActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 293
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->B:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 294
    const-string v0, "isUpdateDialog"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 296
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    .line 297
    goto :goto_0

    .line 298
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 300
    const-string v0, "device_id"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->y:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 302
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    .line 305
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 245
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_ota_update_state_check_new_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_size:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_detail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->l:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_later:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->o:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_app_update_now:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->l:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->o:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 259
    return-void
.end method

.method private e()V
    .locals 5

    .line 87
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 88
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 89
    const-string v0, "isScale"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->j:Z

    .line 90
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->B:Ljava/lang/String;

    .line 91
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    .line 92
    const-string v0, "isAW70"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->w:Z

    .line 93
    const-string v0, "mac"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->y:Ljava/lang/String;

    .line 94
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    if-eqz v0, :cond_0

    .line 95
    const-string v0, "deviceName"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->t:Ljava/lang/String;

    .line 96
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->t:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->t:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    const-string v1, "name"

    invoke-virtual {v4, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->d:Ljava/lang/String;

    .line 100
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    const-string v2, "size"

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->a:Ljava/lang/String;

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    const-string v2, "message"

    invoke-virtual {v4, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/eob;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->c:Ljava/lang/String;

    .line 103
    const-string v0, "show"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    .line 104
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initUpdateMode, mIsShowBox = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->x:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->r:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->r:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 112
    :goto_0
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bandNewVersion:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v2, v2, Lo/eob;->d:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "size:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v2, v2, Lo/eob;->a:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "detail:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v2, v2, Lo/eob;->c:Ljava/lang/String;

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v0, v0, Lo/eob;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v1, v1, Lo/eob;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    iget-object v2, v2, Lo/eob;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 5

    .line 145
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 146
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    if-eqz v0, :cond_0

    .line 148
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 149
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 154
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    .line 155
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 196
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 197
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onclick :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_show_left:I

    if-ne v4, v0, :cond_0

    .line 199
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose not update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpk;->a(Landroid/content/Context;)V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    goto/16 :goto_1

    .line 202
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_show_right:I

    if-ne v4, v0, :cond_3

    .line 203
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WLAN update show is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->z:Z

    if-eqz v0, :cond_2

    .line 208
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose update mCheckAutoUpdate isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->x:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->x:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->v:Lo/dqi;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lo/dqi;->h(Ljava/lang/String;)V

    .line 212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->v()V

    goto :goto_0

    .line 214
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->v:Lo/dqi;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lo/dqi;->h(Ljava/lang/String;)V

    .line 215
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->z()V

    .line 217
    :goto_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.ACTION_BAND_UPDATE_DIALOG"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    const-string v0, "band_update_dialog"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->x:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 220
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 223
    :cond_2
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c()V

    goto :goto_1

    .line 224
    :cond_3
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_left:I

    if-ne v4, v0, :cond_4

    .line 225
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification user choose cancel  isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    .line 235
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    goto :goto_1

    .line 236
    :cond_4
    sget v0, Lcom/huawei/ui/device/R$id;->AppUpdateDialog_notification_right:I

    if-ne v4, v0, :cond_5

    .line 237
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose update--forced"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->c()V

    .line 240
    :cond_5
    :goto_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 66
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 67
    iput-object p0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    .line 68
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->v:Lo/dqi;

    .line 73
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_app_update_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->setContentView(I)V

    .line 75
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 76
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 77
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 78
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 79
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 80
    invoke-virtual {p0, v5}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 82
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->b()V

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e()V

    .line 84
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 161
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    .line 163
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 164
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ondestroy updateInteractor release"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->u:Lo/eob;

    .line 167
    :cond_0
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 120
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 121
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResume(),isforced:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->q:Z

    if-nez v0, :cond_2

    .line 123
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->w:Z

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpg;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() getaw70BandCheckNewVersion is Not empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    goto :goto_0

    .line 128
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->j:Z

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpl;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() getScaleCheckNewVersion is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    goto :goto_0

    .line 135
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dpk;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 136
    const-string v0, "BandUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() getBandCheckNewVersion is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/update/BandUpdateDialogActivity;->finish()V

    .line 141
    :cond_2
    :goto_0
    return-void
.end method
