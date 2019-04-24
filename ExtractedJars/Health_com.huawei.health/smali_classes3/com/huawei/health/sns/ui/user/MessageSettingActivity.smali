.class public Lcom/huawei/health/sns/ui/user/MessageSettingActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;,
        Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;
    }
.end annotation


# instance fields
.field private A:Lo/auz;

.field private B:Lo/ava;

.field private C:Landroid/view/View;

.field private D:Landroid/view/View;

.field private f:Z

.field private g:Z

.field private h:Lo/emu;

.field private j:Landroid/os/Handler;

.field private k:Z

.field private l:Lo/emu;

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:Landroid/view/View;

.field private p:Lo/emu;

.field private q:Landroid/widget/TextView;

.field private r:Lo/emu;

.field private s:Landroid/widget/TextView;

.field private t:Lo/emu;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/view/View;

.field private w:Landroid/view/View;

.field private x:Landroid/view/View;

.field private y:Landroid/view/View;

.field private z:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->f:Z

    .line 90
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g:Z

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->B:Lo/ava;

    .line 210
    new-instance v0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$e;-><init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->j:Landroid/os/Handler;

    .line 317
    new-instance v0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$2;-><init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->A:Lo/auz;

    return-void
.end method

.method private a()V
    .locals 2

    .line 276
    sget v0, Lcom/huawei/android/sns/R$id;->layout_follow_system:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->m:Landroid/view/View;

    .line 277
    sget v0, Lcom/huawei/android/sns/R$id;->layout_start_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->o:Landroid/view/View;

    .line 278
    sget v0, Lcom/huawei/android/sns/R$id;->layout_end_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->n:Landroid/view/View;

    .line 279
    sget v0, Lcom/huawei/android/sns/R$id;->layout_notification_set_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->w:Landroid/view/View;

    .line 280
    sget v0, Lcom/huawei/android/sns/R$id;->layout_time_set_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->z:Landroid/view/View;

    .line 281
    sget v0, Lcom/huawei/android/sns/R$id;->switch_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    .line 282
    sget v0, Lcom/huawei/android/sns/R$id;->switch_show_msg_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l:Lo/emu;

    .line 283
    sget v0, Lcom/huawei/android/sns/R$id;->switch_sound:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p:Lo/emu;

    .line 284
    sget v0, Lcom/huawei/android/sns/R$id;->switch_shake:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    .line 285
    sget v0, Lcom/huawei/android/sns/R$id;->switch_no_disturb:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    .line 286
    sget v0, Lcom/huawei/android/sns/R$id;->text_ring_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    .line 287
    sget v0, Lcom/huawei/android/sns/R$id;->text_start_time_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->s:Landroid/widget/TextView;

    .line 288
    sget v0, Lcom/huawei/android/sns/R$id;->text_end_time_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->q:Landroid/widget/TextView;

    .line 289
    sget v0, Lcom/huawei/android/sns/R$id;->layout_receive_new_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->v:Landroid/view/View;

    .line 290
    sget v0, Lcom/huawei/android/sns/R$id;->layout_show_message_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->x:Landroid/view/View;

    .line 291
    sget v0, Lcom/huawei/android/sns/R$id;->layout_sound:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->y:Landroid/view/View;

    .line 292
    sget v0, Lcom/huawei/android/sns/R$id;->layout_shake:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->D:Landroid/view/View;

    .line 293
    sget v0, Lcom/huawei/android/sns/R$id;->layout_no_disturb:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->C:Landroid/view/View;

    .line 295
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 296
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 300
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e()V

    .line 301
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g()V

    .line 303
    return-void
.end method

.method private a(I)V
    .locals 10

    .line 802
    const/4 v6, 0x0

    .line 803
    const/4 v7, 0x0

    .line 804
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 806
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_start_time"

    const-wide/16 v2, 0x564

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v8

    .line 808
    long-to-int v0, v8

    div-int/lit8 v6, v0, 0x3c

    .line 809
    long-to-int v0, v8

    rem-int/lit8 v7, v0, 0x3c

    .line 810
    goto :goto_0

    .line 811
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 813
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_end_time"

    const-wide/16 v2, 0x21c

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v8

    .line 815
    long-to-int v0, v8

    div-int/lit8 v6, v0, 0x3c

    .line 816
    long-to-int v0, v8

    rem-int/lit8 v7, v0, 0x3c

    .line 819
    :cond_1
    :goto_0
    new-instance v0, Landroid/app/TimePickerDialog;

    move-object v1, p0

    new-instance v2, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->j:Landroid/os/Handler;

    invoke-direct {v2, v3, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$a;-><init>(Landroid/os/Handler;I)V

    move v3, v6

    move v4, v7

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;Landroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    move-object v8, v0

    .line 821
    invoke-virtual {v8}, Landroid/app/TimePickerDialog;->show()V

    .line 822
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .line 500
    if-eqz p1, :cond_0

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->z:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 506
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->z:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 508
    :goto_0
    return-void
.end method

.method private b()V
    .locals 2

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->B:Lo/ava;

    if-eqz v0, :cond_0

    .line 333
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->B:Lo/ava;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 335
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 747
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->j:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, p1, v2}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Landroid/os/Handler;Landroid/content/Intent;Landroid/content/Context;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 748
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 536
    if-eqz p1, :cond_0

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->w:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 542
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 544
    :goto_0
    return-void
.end method

.method private c()V
    .locals 4

    .line 310
    new-instance v0, Lo/ava;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->j:Landroid/os/Handler;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->A:Lo/auz;

    invoke-direct {v0, v1, v2}, Lo/ava;-><init>(Landroid/os/Handler;Lo/auz;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->B:Lo/ava;

    .line 311
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->B:Lo/ava;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 312
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->c(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 3

    .line 566
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g:Z

    if-eqz v0, :cond_0

    .line 568
    return-void

    .line 571
    :cond_0
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    .line 573
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    iget-boolean v2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 574
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l()V

    return-void
.end method

.method private static e(Ljava/lang/String;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 518
    new-instance v0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private static e(Landroid/os/Handler;Landroid/content/Context;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;Landroid/content/Context;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 725
    new-instance v0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;

    invoke-direct {v0, p1, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$7;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    return-object v0
.end method

.method private static e(Landroid/os/Handler;Landroid/content/Intent;Landroid/content/Context;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;Landroid/content/Intent;Landroid/content/Context;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 759
    new-instance v0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;

    invoke-direct {v0, p1, p2, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$9;-><init>(Landroid/content/Intent;Landroid/content/Context;Landroid/os/Handler;)V

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p:Lo/emu;

    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v1

    const-string v2, "ring_setting"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v1

    const-string v2, "shake_setting"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 344
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l:Lo/emu;

    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v1

    const-string v2, "isShowMsgDetail"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v1

    const-string v2, "no_disturb_setting"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a(Z)V

    .line 348
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->s()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;Z)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b(Z)V

    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 548
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g:Z

    if-eqz v0, :cond_0

    .line 550
    return-void

    .line 553
    :cond_0
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->f:Z

    .line 555
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowMsgDetail"

    iget-boolean v2, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->f:Z

    invoke-virtual {v0, v1, v2}, Lo/bcb;->e(Ljava/lang/String;Z)Z

    .line 557
    return-void
.end method

.method private g()V
    .locals 0

    .line 355
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h()V

    .line 356
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->o()V

    .line 357
    return-void
.end method

.method private h()V
    .locals 5

    .line 364
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 367
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    return-void

    .line 374
    :cond_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 376
    if-eqz v4, :cond_1

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_follow_system_notification:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 379
    return-void

    .line 381
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_silent:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 387
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 389
    :goto_0
    return-void
.end method

.method private k()V
    .locals 5

    .line 396
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_start_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->s:Landroid/widget/TextView;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bog;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    return-void
.end method

.method private l()V
    .locals 5

    .line 405
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_end_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->q:Landroid/widget/TextView;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bog;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    return-void
.end method

.method private m()Z
    .locals 6

    .line 640
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    invoke-virtual {v0, v1}, Lo/bcb;->c(Ljava/lang/String;)Z

    move-result v3

    .line 641
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_follow_system:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 642
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_file_name"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 644
    if-nez v3, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 646
    const/4 v0, 0x1

    return v0

    .line 648
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private n()V
    .locals 2

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->m:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->o:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->n:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->y:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->D:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->C:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$3;-><init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$4;-><init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p:Lo/emu;

    const-string v1, "ring_setting"

    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Ljava/lang/String;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    const-string v1, "shake_setting"

    invoke-static {v1}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Ljava/lang/String;)Landroid/widget/CompoundButton$OnCheckedChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    new-instance v1, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity$5;-><init>(Lcom/huawei/health/sns/ui/user/MessageSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 491
    return-void
.end method

.method private o()V
    .locals 6

    .line 414
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_start_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 416
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-1"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 418
    :cond_0
    const/16 v0, 0x564

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 420
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->s:Landroid/widget/TextView;

    invoke-static {v4}, Lo/bog;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 422
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "no_disturb_end_time"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/bcb;->e(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 423
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "-1"

    invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 425
    :cond_2
    const/16 v0, 0x21c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 427
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->q:Landroid/widget/TextView;

    invoke-static {v5}, Lo/bog;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 428
    return-void
.end method

.method private p()V
    .locals 3

    .line 581
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g:Z

    .line 583
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    .line 585
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    if-eqz v0, :cond_0

    .line 587
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 589
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->g:Z

    .line 590
    return-void
.end method

.method private s()V
    .locals 3

    .line 713
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->j:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->e(Landroid/os/Handler;Landroid/content/Context;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 714
    return-void
.end method

.method private u()V
    .locals 8

    .line 656
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.RINGTONE_PICKER"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 657
    const-string v0, "android.intent.extra.ringtone.TYPE"

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 660
    invoke-static {}, Lo/bom;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 662
    const-string v0, "com.huawei.android.thememanager"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 665
    :cond_0
    const-string v0, "android.intent.extra.ringtone.SHOW_DEFAULT"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 666
    const-string v0, "android.intent.extra.ringtone.SHOW_SILENT"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 669
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isFollowNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v4

    .line 672
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 674
    const/4 v4, 0x0

    .line 679
    :cond_1
    const-string v0, "is_follow_notification"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 682
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "ring_uri"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lo/bcb;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 683
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v6, 0x0

    goto :goto_0

    :cond_2
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 685
    :goto_0
    const-string v0, "android.intent.extra.ringtone.EXISTING_URI"

    invoke-virtual {v3, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 688
    const/16 v0, 0x3ea

    :try_start_0
    invoke-virtual {p0, v3, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 693
    goto :goto_1

    .line 690
    :catch_0
    move-exception v7

    .line 692
    const-string v0, "MessageSettingActivity"

    const-string v1, "showNotificationTone ActivityNotFoundException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    :goto_1
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 433
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->d:Landroid/view/View;

    .line 434
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 699
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 700
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 702
    return-void

    .line 704
    :cond_0
    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_1

    .line 707
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b(Landroid/content/Intent;)V

    .line 709
    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 595
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_receive_new_message:I

    if-ne v0, v1, :cond_1

    .line 597
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto/16 :goto_6

    .line 599
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_follow_system:I

    if-ne v0, v1, :cond_2

    .line 601
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->u()V

    goto/16 :goto_6

    .line 603
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_start_time:I

    if-ne v0, v1, :cond_3

    .line 605
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a(I)V

    goto/16 :goto_6

    .line 607
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_end_time:I

    if-ne v0, v1, :cond_4

    .line 609
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a(I)V

    goto/16 :goto_6

    .line 611
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_receive_new_message:I

    if-ne v0, v1, :cond_6

    .line 613
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->h:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto/16 :goto_6

    .line 615
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_show_message_detail:I

    if-ne v0, v1, :cond_8

    .line 617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->l:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_6

    .line 619
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_sound:I

    if-ne v0, v1, :cond_a

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_6

    .line 623
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_shake:I

    if-ne v0, v1, :cond_c

    .line 625
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->r:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v1, 0x1

    goto :goto_4

    :cond_b
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_6

    .line 627
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->layout_no_disturb:I

    if-ne v0, v1, :cond_e

    .line 629
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->t:Lo/emu;

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x1

    goto :goto_5

    :cond_d
    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 631
    :cond_e
    :goto_6
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 262
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 263
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_push_message_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->setContentView(I)V

    .line 264
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->a()V

    .line 265
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->p()V

    .line 266
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->n()V

    .line 267
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->k:Z

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b(Z)V

    .line 268
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->c()V

    .line 269
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 860
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->b()V

    .line 861
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 862
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 439
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 440
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/MessageSettingActivity;->o()V

    .line 441
    return-void
.end method
