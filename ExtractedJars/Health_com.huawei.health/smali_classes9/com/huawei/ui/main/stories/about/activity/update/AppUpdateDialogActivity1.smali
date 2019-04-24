.class public Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:I

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Ljava/lang/String;

.field private G:Z

.field private H:Ljava/lang/String;

.field private I:Landroid/content/BroadcastReceiver;

.field private a:Landroid/widget/LinearLayout;

.field private b:Landroid/content/Context;

.field private c:Landroid/graphics/drawable/AnimationDrawable;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Lo/etv;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Lo/egd;

.field private w:Landroid/widget/ProgressBar;

.field private x:Lo/egd;

.field private y:Lo/egd;

.field private z:Lo/egd;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->H:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->F:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->E:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    .line 324
    new-instance v0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1$2;-><init>(Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->I:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 4

    .line 473
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_state_check_new_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, v1, Lo/etv;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_size:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, v1, Lo/etv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_detail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 485
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, v1, Lo/etv;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_later:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->z:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_now:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->v:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->z:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 490
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 516
    const-string v0, "AppUpdateDialogActivity1"

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

    .line 517
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 521
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 522
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 524
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 525
    return-void
.end method

.method private b()V
    .locals 4

    .line 216
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a:Landroid/widget/LinearLayout;

    .line 219
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_textView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->h:Landroid/widget/TextView;

    .line 220
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->d:Landroid/widget/ImageView;

    .line 222
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_changelog:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g:Landroid/widget/LinearLayout;

    .line 223
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->i:Landroid/widget/TextView;

    .line 224
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->p:Landroid/widget/TextView;

    .line 225
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_version_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->n:Landroid/widget/TextView;

    .line 226
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->m:Landroid/widget/TextView;

    .line 227
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_size_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->l:Landroid/widget/TextView;

    .line 228
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_detail:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->o:Landroid/widget/TextView;

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->u:Landroid/widget/TextView;

    .line 230
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->v:Lo/egd;

    .line 231
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->z:Lo/egd;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->v(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 238
    invoke-static {v0}, Lo/cxa;->w(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->y(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 239
    invoke-static {v0}, Lo/cxa;->z(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 240
    invoke-static {v0}, Lo/cxa;->B(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->C(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 241
    invoke-static {v0}, Lo/cxa;->D(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->A(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 242
    invoke-static {v0}, Lo/cxa;->F(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->G(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 243
    invoke-static {v0}, Lo/cxa;->L(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->I(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 244
    invoke-static {v0}, Lo/cxa;->H(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->E(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 245
    invoke-static {v0}, Lo/cxa;->N(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->M(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 246
    invoke-static {v0}, Lo/cxa;->k(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->x(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 247
    invoke-static {v0}, Lo/cxa;->J(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->u(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 248
    invoke-static {v0}, Lo/cxa;->K(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->R(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 249
    invoke-static {v0}, Lo/cxa;->m(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->P(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 250
    invoke-static {v0}, Lo/cxa;->O(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->z:Lo/egd;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/egd;->setTextSize(F)V

    .line 256
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f:Landroid/widget/LinearLayout;

    .line 257
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->q:Landroid/widget/TextView;

    .line 258
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->s:Landroid/widget/TextView;

    .line 259
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progressbar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->w:Landroid/widget/ProgressBar;

    .line 260
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_cancel:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e:Landroid/widget/ImageView;

    .line 262
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k:Landroid/widget/LinearLayout;

    .line 263
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->r:Landroid/widget/TextView;

    .line 264
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->t:Landroid/widget/TextView;

    .line 265
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    .line 266
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    .line 267
    return-void
.end method

.method private b(I)V
    .locals 4

    .line 497
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter showAppDownloadProgress progress = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->w:Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->custom_progressbar_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->w:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 503
    return-void
.end method

.method private c()V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_check:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->d:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_health_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 185
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 607
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 608
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;Landroid/content/Intent;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Landroid/content/Intent;)V

    return-void
.end method

.method private d()Z
    .locals 4

    .line 191
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 192
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5305\u540d\u4e3acom.huawei.health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v0, 0x0

    return v0

    .line 195
    :cond_0
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5305\u540d\u4e3acom.huawei.bone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    const/4 v0, 0x1

    return v0
.end method

.method private e()V
    .locals 6

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isForced"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    .line 109
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    .line 111
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isCheck :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "appNewVersionNumSize"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    .line 113
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mAppNewVersion"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->H:Ljava/lang/String;

    .line 114
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mAppNewFeatureContent"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->F:Ljava/lang/String;

    .line 115
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "mChangeLog"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->E:Ljava/lang/String;

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    iput v1, v0, Lo/etv;->c:I

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    iget v2, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    int-to-long v2, v2

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->b:Ljava/lang/String;

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->H:Ljava/lang/String;

    iput-object v1, v0, Lo/etv;->d:Ljava/lang/String;

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->F:Ljava/lang/String;

    iput-object v1, v0, Lo/etv;->e:Ljava/lang/String;

    .line 120
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v3, v3, Lo/etv;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v3, v3, Lo/etv;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Utils.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    iget v4, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Formatter.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    iget v4, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->A:I

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/etv;->a(Landroid/content/Context;Ljava/lang/Boolean;)V

    .line 125
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 10

    .line 336
    const-string v0, "state"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 337
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 339
    const-string v0, "content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 340
    const-string v9, ""

    .line 341
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateAppState: state = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    .line 344
    :pswitch_0
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    goto/16 :goto_3

    .line 347
    :pswitch_1
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 352
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 353
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No New Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_settings_app_update:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 355
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->finish()V

    .line 356
    goto/16 :goto_3

    .line 358
    :cond_1
    const/4 v0, 0x1

    if-ne v0, v7, :cond_2

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 361
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 362
    return-void

    .line 363
    :cond_2
    const/4 v0, 0x2

    if-ne v0, v7, :cond_3

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 367
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_unknown_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 370
    :goto_0
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 372
    goto/16 :goto_3

    .line 374
    :pswitch_2
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iput v7, v0, Lo/etv;->c:I

    .line 377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    int-to-long v2, v7

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->b:Ljava/lang/String;

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iput-object v8, v0, Lo/etv;->d:Ljava/lang/String;

    .line 379
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v3, v3, Lo/etv;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Utils.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    int-to-long v4, v7

    invoke-static {v3, v4, v5}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Formatter.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    int-to-long v4, v7

    invoke-static {v3, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/etv;->a(Landroid/content/Context;Ljava/lang/Boolean;)V

    .line 383
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    .line 384
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check success!  isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    goto/16 :goto_3

    .line 387
    :pswitch_3
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    goto/16 :goto_3

    .line 390
    :pswitch_4
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_4

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 395
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 396
    goto/16 :goto_3

    .line 398
    :pswitch_5
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_SUCCESS:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v1, v8}, Lo/etv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->e:Ljava/lang/String;

    .line 400
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v3, v3, Lo/etv;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_5

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 404
    :cond_5
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a()V

    .line 405
    goto/16 :goto_3

    .line 407
    :pswitch_6
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b(I)V

    .line 409
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    .line 410
    goto/16 :goto_3

    .line 412
    :pswitch_7
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_PROGRESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-direct {p0, v7}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b(I)V

    .line 414
    goto/16 :goto_3

    .line 416
    :pswitch_8
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_DOWNLOAD_APP_FAILED: result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    .line 418
    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_1

    .line 420
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_download_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 421
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 422
    goto/16 :goto_2

    .line 424
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 425
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 426
    goto :goto_2

    .line 428
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 429
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c(Ljava/lang/String;)V

    .line 430
    goto :goto_2

    .line 433
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_apphelp_pwindows_continue_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_is_roaming:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    .line 437
    goto :goto_2

    .line 439
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 440
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    .line 443
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    .line 444
    goto :goto_3

    .line 446
    :pswitch_9
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    .line 448
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->e()V

    .line 451
    goto :goto_3

    .line 453
    :pswitch_a
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_INSTALL_APP_FAILED: result="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/16 v0, 0x2f

    if-ne v0, v7, :cond_6

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_install_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    goto :goto_3

    .line 460
    :pswitch_b
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "app package isSameApkSignatures "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etv;->d(Ljava/lang/Boolean;)V

    .line 462
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->finish()V

    .line 463
    .line 467
    :cond_6
    :goto_3
    :pswitch_c
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_1
        0x4 -> :sswitch_2
        0xb -> :sswitch_3
    .end sparse-switch
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etv;->d(Ljava/lang/Boolean;)V

    .line 513
    return-void
.end method

.method private f()V
    .locals 3

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_new_version_ok:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_force_alert_tip_app:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    return-void
.end method

.method private g()V
    .locals 4

    .line 531
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doCheckAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->b()V

    .line 534
    return-void
.end method

.method private h()V
    .locals 5

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->f()Z

    move-result v4

    .line 557
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: wifiConnected = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    if-nez v4, :cond_1

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_apphelp_pwindows_continue_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_is_roaming:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 564
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    goto :goto_0

    .line 567
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k()V

    goto :goto_0

    .line 570
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k()V

    .line 572
    :goto_0
    return-void
.end method

.method private i()V
    .locals 5

    .line 540
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAppNewVersionOK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    const/4 v4, 0x0

    .line 542
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: mAppUpdateInteractor.appNewVersionNumSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget v3, v3, Lo/etv;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    iget v1, v1, Lo/etv;->c:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/etv;->d(J)Z

    move-result v4

    .line 544
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: checkMemory = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    if-nez v4, :cond_0

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_low_memory:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 548
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->h()V

    .line 550
    :goto_0
    return-void
.end method

.method private k()V
    .locals 4

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->k()V

    .line 580
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadAppFile  isDownloading: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_updating:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 588
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    if-nez v0, :cond_0

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->d()V

    .line 591
    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 4

    .line 159
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    if-eqz v0, :cond_0

    .line 161
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f()V

    goto :goto_0

    .line 163
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    if-eqz v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_app_updating_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 168
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->finish()V

    .line 171
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 272
    const-string v0, "AppUpdateDialogActivity1"

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

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_left:I

    if-ne v4, v0, :cond_1

    .line 274
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose not update   isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    if-eqz v0, :cond_0

    .line 276
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f()V

    goto/16 :goto_0

    .line 278
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->finish()V

    goto/16 :goto_0

    .line 280
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_right:I

    if-ne v4, v0, :cond_2

    .line 281
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->i()V

    .line 284
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 285
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->aB:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 287
    goto/16 :goto_0

    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_cancel:I

    if-ne v4, v0, :cond_4

    .line 288
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose cancel update   isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    if-eqz v0, :cond_3

    .line 290
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->f()V

    goto/16 :goto_0

    .line 292
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_app_updating_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 296
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_left:I

    if-ne v4, v0, :cond_7

    .line 297
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification user choose cancel  isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->D:Z

    if-eqz v0, :cond_5

    .line 299
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 300
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 303
    :cond_5
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->C:Z

    if-eqz v0, :cond_6

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->c()V

    .line 306
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->finish()V

    goto :goto_0

    .line 307
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_right:I

    if-ne v4, v0, :cond_a

    .line 308
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification user choose continue :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    if-eqz v0, :cond_9

    .line 311
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->G:Z

    if-eqz v0, :cond_8

    .line 312
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->k()V

    goto :goto_0

    .line 314
    :cond_8
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->h()V

    goto :goto_0

    .line 318
    :cond_9
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->c()V

    .line 319
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->g()V

    .line 322
    :cond_a
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 78
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    iput-object p0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 80
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/etv;->b(Landroid/content/Context;)Lo/etv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->j:Lo/etv;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_app_update_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->setContentView(I)V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 84
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 85
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 86
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 87
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 88
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 90
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b()V

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e()V

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->E:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->E:Ljava/lang/String;

    const-string v1, "fail"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->B:Z

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->a()V

    .line 102
    :goto_0
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 103
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->I:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v6, v1, v2}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 105
    return-void
.end method

.method protected onDestroy()V
    .locals 5

    .line 202
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->I:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :cond_0
    goto :goto_0

    .line 208
    :catch_0
    move-exception v4

    .line 209
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity1;->b:Landroid/content/Context;

    .line 212
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 153
    const-string v0, "AppUpdateDialogActivity1"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 155
    return-void
.end method
