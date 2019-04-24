.class public Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Lo/etv;

.field private D:J

.field private E:Z

.field private H:J

.field private I:Landroid/content/BroadcastReceiver;

.field private a:Landroid/content/Context;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/graphics/drawable/AnimationDrawable;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Z

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
    .locals 2

    .line 44
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    .line 59
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    .line 61
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->D:J

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    .line 69
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->H:J

    .line 293
    new-instance v0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity$2;-><init>(Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->I:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method private a()V
    .locals 4

    .line 186
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b:Landroid/widget/LinearLayout;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_textView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->g:Landroid/widget/TextView;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_check_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->c:Landroid/widget/ImageView;

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_changelog:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h:Landroid/widget/LinearLayout;

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->f:Landroid/widget/TextView;

    .line 194
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_version:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->p:Landroid/widget/TextView;

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_version_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->m:Landroid/widget/TextView;

    .line 196
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_size:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->o:Landroid/widget/TextView;

    .line 197
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_size_value:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->l:Landroid/widget/TextView;

    .line 198
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_detail:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->n:Landroid/widget/TextView;

    .line 199
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_changelog_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->u:Landroid/widget/TextView;

    .line 200
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->x:Lo/egd;

    .line 201
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->z:Lo/egd;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->i(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->v(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 208
    invoke-static {v0}, Lo/cxa;->w(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->y(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 209
    invoke-static {v0}, Lo/cxa;->z(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 210
    invoke-static {v0}, Lo/cxa;->B(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->C(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 211
    invoke-static {v0}, Lo/cxa;->D(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->A(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 212
    invoke-static {v0}, Lo/cxa;->F(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->G(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 213
    invoke-static {v0}, Lo/cxa;->L(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->I(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 214
    invoke-static {v0}, Lo/cxa;->H(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->E(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 215
    invoke-static {v0}, Lo/cxa;->N(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->M(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 216
    invoke-static {v0}, Lo/cxa;->k(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->x(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 217
    invoke-static {v0}, Lo/cxa;->J(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->u(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 218
    invoke-static {v0}, Lo/cxa;->K(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->R(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 219
    invoke-static {v0}, Lo/cxa;->m(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->P(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 220
    invoke-static {v0}, Lo/cxa;->O(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->z:Lo/egd;

    const/high16 v1, 0x41100000    # 9.0f

    invoke-virtual {v0, v1}, Lo/egd;->setTextSize(F)V

    .line 226
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i:Landroid/widget/LinearLayout;

    .line 227
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress_text:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->r:Landroid/widget/TextView;

    .line 228
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progress:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->t:Landroid/widget/TextView;

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_progressbar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->w:Landroid/widget/ProgressBar;

    .line 230
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_cancel:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->e:Landroid/widget/ImageView;

    .line 232
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k:Landroid/widget/LinearLayout;

    .line 233
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_context:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->s:Landroid/widget/TextView;

    .line 234
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->q:Landroid/widget/TextView;

    .line 235
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_left:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    .line 236
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_right:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    .line 237
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;Landroid/content/Intent;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->e(Landroid/content/Intent;)V

    return-void
.end method

.method private b()V
    .locals 10

    .line 98
    const/4 v6, 0x0

    .line 99
    const/4 v7, 0x0

    .line 100
    const/4 v8, 0x0

    .line 101
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v9

    .line 102
    const-string v0, "name"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 103
    const-string v0, "size"

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 104
    int-to-long v0, v6

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->D:J

    .line 105
    const-string v0, "message"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 106
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "appname:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const-string v2, "appsize"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "message"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 108
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->c()V

    .line 109
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k()V

    goto/16 :goto_0

    .line 111
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iput-object v7, v0, Lo/etv;->d:Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    int-to-long v2, v6

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->b:Ljava/lang/String;

    .line 114
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initUpdateMode: Utils.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->D:J

    invoke-static {v3, v4, v5}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initUpdateMode: Formatter.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    iget-wide v4, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->D:J

    invoke-static {v3, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v1, v8}, Lo/etv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->e:Ljava/lang/String;

    .line 117
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->e()V

    .line 119
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_talk_band_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etv;->d(Ljava/lang/Boolean;)V

    .line 483
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 485
    const-string v0, "AppUpdateDialogActivity"

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

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 494
    return-void
.end method

.method private c()V
    .locals 3

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_check:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->c:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->hw_health_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 155
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 467
    const-string v0, "AppUpdateDialogActivity"

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

    .line 468
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->w:Landroid/widget/ProgressBar;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->custom_progressbar_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 471
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->t:Landroid/widget/TextView;

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

    .line 472
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->w:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 473
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    return-void
.end method

.method private d()Z
    .locals 4

    .line 161
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 162
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5305\u540d\u4e3acom.huawei.health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_0
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5305\u540d\u4e3acom.huawei.bone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x1

    return v0
.end method

.method private e()V
    .locals 4

    .line 443
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 449
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_state_check_new_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_version:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, v1, Lo/etv;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_size:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, v1, Lo/etv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_detail:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->u:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, v1, Lo/etv;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->x:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_later:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->z:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_now:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->x:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 459
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->z:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 10

    .line 305
    const-string v0, "state"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 306
    const-string v0, "result"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 307
    int-to-long v0, v7

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->H:J

    .line 308
    const-string v0, "content"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 309
    const-string v0, "AppUpdateDialogActivity"

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

    .line 310
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    .line 312
    :pswitch_0
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    goto/16 :goto_3

    .line 315
    :pswitch_1
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 319
    :cond_0
    const-string v9, ""

    .line 320
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 321
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "No New Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_me_settings_app_update:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 324
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->finish()V

    .line 325
    goto/16 :goto_3

    .line 327
    :cond_1
    const/4 v0, 0x1

    if-ne v0, v7, :cond_2

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 330
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 331
    return-void

    .line 332
    :cond_2
    const/4 v0, 0x2

    if-ne v0, v7, :cond_3

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_server_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 337
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_unknown_error:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 340
    :goto_0
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 342
    goto/16 :goto_3

    .line 344
    :pswitch_2
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_CHECK_NEW_VERSION_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iput v7, v0, Lo/etv;->c:I

    .line 347
    int-to-long v0, v7

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->H:J

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    int-to-long v2, v7

    invoke-static {v1, v2, v3}, Lo/ene;->e(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->b:Ljava/lang/String;

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iput-object v8, v0, Lo/etv;->d:Ljava/lang/String;

    .line 350
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v3, v3, Lo/etv;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Utils.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

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

    .line 352
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: Formatter.formatFileSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

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

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/etv;->a(Landroid/content/Context;Ljava/lang/Boolean;)V

    .line 354
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    .line 355
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "check success!  isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    goto/16 :goto_3

    .line 358
    :pswitch_3
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    goto/16 :goto_3

    .line 361
    :pswitch_4
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_4

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 366
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_get_changelog_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 367
    goto/16 :goto_3

    .line 369
    :pswitch_5
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_FETCH_CHANGELOG_SUCCESS:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v1, v8}, Lo/etv;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/etv;->e:Ljava/lang/String;

    .line 371
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "STATE_CHECK_NEW_VERSION_SUCCESS: mAppNewFeatureContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v3, v3, Lo/etv;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_5

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 375
    :cond_5
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->e()V

    .line 376
    goto/16 :goto_3

    .line 378
    :pswitch_6
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_START"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d(I)V

    .line 380
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    .line 381
    goto/16 :goto_3

    .line 383
    :pswitch_7
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_PROGRESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    invoke-direct {p0, v7}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d(I)V

    .line 385
    goto/16 :goto_3

    .line 387
    :pswitch_8
    const-string v0, "AppUpdateDialogActivity"

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

    .line 388
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    .line 389
    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_1

    .line 391
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_download_check_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 392
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 393
    goto/16 :goto_2

    .line 395
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_network_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 396
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 397
    goto :goto_2

    .line 399
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_phone_low_battery:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 400
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->d(Ljava/lang/String;)V

    .line 401
    goto :goto_2

    .line 404
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_apphelp_pwindows_continue_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_is_roaming:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    .line 408
    goto :goto_2

    .line 410
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_download_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 411
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    .line 414
    :goto_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    .line 415
    goto :goto_3

    .line 417
    :pswitch_9
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STATE_DOWNLOAD_APP_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    .line 419
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    .line 420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->e()V

    .line 422
    goto :goto_3

    .line 424
    :pswitch_a
    const-string v0, "AppUpdateDialogActivity"

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

    .line 425
    const/16 v0, 0x2f

    if-ne v0, v7, :cond_6

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_install_failed:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    goto :goto_3

    .line 431
    :pswitch_b
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "app package isSameApkSignatures "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 432
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/etv;->d(Ljava/lang/Boolean;)V

    .line 433
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->finish()V

    .line 434
    .line 438
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

.method private f()V
    .locals 4

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->k()V

    .line 549
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doDownloadAppFile  isDownloading: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->r:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_app_update_updating:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 557
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    if-nez v0, :cond_0

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->d()V

    .line 560
    :cond_0
    return-void
.end method

.method private g()V
    .locals 5

    .line 509
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAppNewVersionOK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    const/4 v4, 0x0

    .line 511
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleAppNewVersionOK: mAppUpdateInteractor.appNewVersionNumSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget v3, v3, Lo/etv;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    iget v1, v1, Lo/etv;->c:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lo/etv;->d(J)Z

    move-result v4

    .line 513
    const-string v0, "AppUpdateDialogActivity"

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

    .line 514
    if-nez v4, :cond_0

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_update_low_memory:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 517
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h()V

    .line 519
    :goto_0
    return-void
.end method

.method private h()V
    .locals 5

    .line 525
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->f()Z

    move-result v4

    .line 526
    const-string v0, "AppUpdateDialogActivity"

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

    .line 527
    if-nez v4, :cond_1

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->m(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_apphelp_pwindows_continue_button:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_is_roaming:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    goto :goto_0

    .line 536
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->f()V

    goto :goto_0

    .line 539
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->f()V

    .line 541
    :goto_0
    return-void
.end method

.method private i()V
    .locals 3

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_firmware_upgrade_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_new_version_ok:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_force_alert_tip_app:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    return-void
.end method

.method private k()V
    .locals 4

    .line 500
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doCheckAppNewVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->b()V

    .line 503
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 4

    .line 129
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onBackPressed() isForcedUpdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    if-eqz v0, :cond_0

    .line 131
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i()V

    goto :goto_0

    .line 133
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    if-eqz v0, :cond_1

    .line 134
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_app_updating_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->finish()V

    .line 141
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 241
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 242
    const-string v0, "AppUpdateDialogActivity"

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

    .line 243
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_left:I

    if-ne v4, v0, :cond_1

    .line 244
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose not update   isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    if-eqz v0, :cond_0

    .line 246
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i()V

    goto/16 :goto_0

    .line 248
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->finish()V

    goto/16 :goto_0

    .line 250
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_show_right:I

    if-ne v4, v0, :cond_2

    .line 251
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->g()V

    .line 254
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 255
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->aB:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 257
    goto/16 :goto_0

    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_cancel:I

    if-ne v4, v0, :cond_4

    .line 258
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose cancel update   isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    if-eqz v0, :cond_3

    .line 260
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->i()V

    goto/16 :goto_0

    .line 262
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->y:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->v:Lo/egd;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_contact_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ota_update_app_updating_exit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 266
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_left:I

    if-ne v4, v0, :cond_7

    .line 267
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification user choose cancel  isForced"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    if-eqz v0, :cond_5

    .line 269
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 270
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 273
    :cond_5
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->B:Z

    if-eqz v0, :cond_6

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->c()V

    .line 276
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->finish()V

    goto :goto_0

    .line 277
    :cond_7
    sget v0, Lcom/huawei/ui/main/R$id;->AppUpdateDialog_notification_right:I

    if-ne v4, v0, :cond_a

    .line 278
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification user choose continue :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->j:Z

    if-eqz v0, :cond_9

    .line 281
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->E:Z

    if-eqz v0, :cond_8

    .line 282
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->f()V

    goto :goto_0

    .line 284
    :cond_8
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->h()V

    goto :goto_0

    .line 288
    :cond_9
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->c()V

    .line 289
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->k()V

    .line 292
    :cond_a
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 73
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 74
    iput-object p0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 75
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isForced"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    .line 77
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isForced :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->A:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/etv;->b(Landroid/content/Context;)Lo/etv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->C:Lo/etv;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_app_update_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->setContentView(I)V

    .line 81
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 82
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 83
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 84
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 85
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 86
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 88
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a()V

    .line 89
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->b()V

    .line 92
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 93
    const-string v0, "action_app_check_new_version_state"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->I:Landroid/content/BroadcastReceiver;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v6, v1, v2}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 95
    return-void
.end method

.method protected onDestroy()V
    .locals 5

    .line 172
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 174
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->I:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->I:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    :cond_0
    goto :goto_0

    .line 178
    :catch_0
    move-exception v4

    .line 179
    const-string v0, "AppUpdateDialogActivity"

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

    .line 181
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;->a:Landroid/content/Context;

    .line 182
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 123
    const-string v0, "AppUpdateDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 125
    return-void
.end method
