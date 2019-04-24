.class public Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Lo/bcp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/base/SNSBaseActivity$c;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String;


# instance fields
.field protected a:Landroid/widget/RelativeLayout;

.field protected b:I

.field public c:Landroid/widget/LinearLayout;

.field protected d:Landroid/view/View;

.field protected e:Landroid/widget/ImageView;

.field private f:Z

.field protected i:I

.field private k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 63
    const-class v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 66
    sget v0, Lcom/huawei/android/sns/R$color;->sns_background:I

    iput v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->b:I

    .line 91
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->i:I

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->f:Z

    return-void
.end method

.method private static a()Lo/aoo;
    .locals 1

    .line 127
    new-instance v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$2;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$2;-><init>()V

    .line 147
    return-object v0
.end method

.method private static b(Lo/bcp;)Lo/awn$e;
    .locals 1

    .line 454
    new-instance v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$1;-><init>(Lo/bcp;)V

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->k:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 185
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 186
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    goto :goto_0

    .line 188
    :catch_0
    move-exception v2

    .line 190
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    const-string v1, "unRegisterBroadcast() Exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :cond_0
    :goto_0
    return-void
.end method

.method private c()V
    .locals 3

    .line 122
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->a()Lo/aoo;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lo/aor;->d(Landroid/app/Activity;Lo/aoo;Z)V

    .line 123
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->c()V

    return-void
.end method

.method private e()V
    .locals 3

    .line 156
    new-instance v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$4;-><init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->k:Landroid/content/BroadcastReceiver;

    .line 171
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 172
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.android.sns.action.login.account"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 174
    return-void
.end method

.method private e(Landroid/view/MenuItem;)Z
    .locals 2

    .line 443
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    .line 445
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onBackPressed()V

    .line 446
    const/4 v0, 0x1

    return v0

    .line 449
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private g()Z
    .locals 4

    .line 475
    const/4 v2, 0x0

    .line 479
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$bool;->sns_config_land_capable:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 484
    goto :goto_0

    .line 481
    :catch_0
    move-exception v3

    .line 483
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    const-string v1, "isSupportOrientationChange\uff0cget configLandCapable error!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 486
    :goto_0
    return v2
.end method

.method private h()V
    .locals 2

    .line 410
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bch;->b(Landroid/content/Context;)V

    .line 413
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->setRequestedOrientation(I)V

    .line 418
    :cond_0
    invoke-static {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->b(Lo/bcp;)Lo/awn$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d(Lo/awn$e;)V

    .line 420
    return-void
.end method

.method private k()Z
    .locals 4

    .line 392
    const/4 v2, 0x0

    .line 395
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 396
    if-eqz v3, :cond_0

    const-string v0, "sns_sdk_update"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 398
    const/4 v2, 0x1

    .line 404
    :cond_0
    goto :goto_0

    .line 401
    :catch_0
    move-exception v3

    .line 403
    const-string v0, ""

    const-string v1, "Base Activity wrapper get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    :goto_0
    return v2
.end method


# virtual methods
.method protected d()V
    .locals 0

    .line 342
    return-void
.end method

.method protected d(Landroid/view/View;)V
    .locals 1

    .line 331
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 333
    invoke-static {p0, p1}, Lo/bph;->b(Landroid/app/Activity;Landroid/view/View;)V

    .line 335
    :cond_0
    return-void
.end method

.method protected d(Lo/awn$e;)V
    .locals 3

    .line 427
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 429
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v1

    .line 430
    const/4 v2, 0x0

    .line 431
    if-eqz v1, :cond_0

    .line 433
    invoke-virtual {v1}, Lo/axr;->c()I

    move-result v2

    .line 437
    :cond_0
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Lo/awn;->c(ILo/awn$e;)V

    .line 439
    :cond_1
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 210
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSiteLoadSuccess."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_service:I

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_not_in_service:I

    .line 214
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_close:I

    .line 215
    invoke-static {p0}, Lo/bcq;->a(Landroid/app/Activity;)Landroid/content/DialogInterface$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 216
    invoke-static {p0}, Lo/bcq;->c(Landroid/app/Activity;)Landroid/content/DialogInterface$OnKeyListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v3

    .line 217
    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    .line 220
    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 224
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->k()Z

    move-result v3

    .line 227
    invoke-static {p0}, Lo/aoq;->a(Landroid/app/Activity;)V

    .line 228
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, Lo/aoq;->b(Landroid/content/Context;Z)V

    .line 229
    if-eqz v3, :cond_1

    .line 232
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    const-string v1, "Call HwID check update type:true"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :cond_1
    instance-of v0, p0, Lcom/huawei/health/sns/ui/HomeActivity;

    if-nez v0, :cond_2

    instance-of v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;

    if-nez v0, :cond_2

    .line 240
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/aoq;->d(Landroid/app/Activity;)V

    .line 243
    :cond_2
    return-void
.end method

.method protected f()V
    .locals 0

    .line 383
    return-void
.end method

.method protected i()I
    .locals 3

    .line 350
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 352
    const/4 v0, -0x1

    return v0

    .line 355
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "navigationbar_is_min"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 283
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 284
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 286
    const/16 v0, 0x7d2

    if-ne p1, v0, :cond_1

    .line 288
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    const-string v1, "SimCard change callback onSuccess"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 293
    :cond_0
    const/16 v0, 0x7d2

    if-ne p1, v0, :cond_1

    .line 295
    sget-object v0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->g:Ljava/lang/String;

    const-string v1, "SimCard change callback onCancel"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->c()V

    .line 299
    :cond_1
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 311
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 312
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d()V

    .line 313
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d(Landroid/view/View;)V

    .line 314
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 113
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->b:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 115
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->h()V

    .line 117
    invoke-static {p0}, Lo/bhq;->e(Landroid/app/Activity;)V

    .line 118
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 304
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 305
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bis;->b(Landroid/app/Activity;)V

    .line 306
    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 248
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->e(Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 248
    :goto_0
    return v0
.end method

.method public onPause()V
    .locals 1

    .line 267
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 268
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->b()V

    .line 269
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->f:Z

    .line 270
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 322
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 323
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->finish()V

    .line 324
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 255
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 256
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->f:Z

    if-nez v0, :cond_0

    .line 258
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->e()V

    .line 259
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->f:Z

    .line 261
    :cond_0
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lo/bis;->e(Landroid/app/Activity;I)V

    .line 262
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 275
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 276
    invoke-static {}, Lo/aoq;->f()V

    .line 277
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lo/bis;->e(Landroid/app/Activity;I)V

    .line 278
    return-void
.end method

.method public setContentView(I)V
    .locals 1

    .line 202
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->setContentView(I)V

    .line 203
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d()V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->d(Landroid/view/View;)V

    .line 205
    return-void
.end method
