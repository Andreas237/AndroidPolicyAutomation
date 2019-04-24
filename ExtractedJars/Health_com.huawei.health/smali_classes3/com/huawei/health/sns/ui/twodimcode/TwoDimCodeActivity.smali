.class public Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Z

.field private b:Lo/bka;

.field private d:Lo/bgp;

.field private e:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 51
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 108
    new-instance v0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$c;-><init>(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a:Z

    return-void
.end method

.method private a(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 5

    .line 265
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 266
    if-eqz v3, :cond_0

    .line 268
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/Group;

    .line 269
    if-eqz v4, :cond_0

    .line 271
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getQrExpireTime()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v0, v1, v2}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)Z
    .locals 1

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)Z

    move-result v0

    return v0
.end method

.method private b(I)V
    .locals 1

    .line 604
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_0

    .line 606
    sget v0, Lcom/huawei/android/sns/R$string;->sns_group_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    goto :goto_0

    .line 610
    :cond_0
    const/16 v0, 0x3f8

    if-eq p1, v0, :cond_1

    .line 612
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_groupinfo_error:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 615
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 4

    .line 247
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 248
    if-eqz v1, :cond_0

    .line 250
    const-string v0, "bundleKeyName"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 251
    const-string v0, "bundleKeyQrCode"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 252
    const/4 v0, 0x0

    invoke-direct {p2, v2, v3, v0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->f()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    return-void
.end method

.method private c()V
    .locals 1

    .line 455
    invoke-static {}, Lo/bmo;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    invoke-static {p0}, Lo/bmo;->d(Landroid/app/Activity;)V

    .line 460
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->g()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)Z
    .locals 3

    .line 207
    const/4 v1, 0x0

    .line 208
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 213
    :sswitch_0
    iget v2, p1, Landroid/os/Message;->arg2:I

    .line 214
    const/16 v0, 0x3f8

    if-eq v2, v0, :cond_0

    .line 216
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e(I)V

    .line 218
    :cond_0
    const/4 v1, 0x1

    .line 219
    goto :goto_0

    .line 223
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b(I)V

    .line 224
    const/4 v1, 0x1

    .line 225
    goto :goto_0

    .line 229
    :sswitch_2
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->k()V

    .line 230
    const/4 v1, 0x1

    .line 231
    .line 236
    :goto_0
    return v1

    :sswitch_data_0
    .sparse-switch
        0xc1 -> :sswitch_1
        0x108 -> :sswitch_0
        0x122 -> :sswitch_2
        0xaaa -> :sswitch_0
    .end sparse-switch
.end method

.method private d()V
    .locals 4

    .line 320
    invoke-static {}, Lo/bch;->a()Lo/bch;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bch;->b(Landroid/content/Context;)V

    .line 322
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 324
    const-string v0, "SNSActivityUtil"

    const-string v1, "checkSNSAvailable not login HuaWei Account"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    return-void

    .line 328
    :cond_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v2

    .line 329
    const/4 v3, 0x0

    .line 330
    if-eqz v2, :cond_1

    .line 332
    invoke-virtual {v2}, Lo/axr;->c()I

    move-result v3

    .line 334
    :cond_1
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity$2;-><init>(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V

    invoke-virtual {v0, v3, v1}, Lo/awn;->c(ILo/awn$e;)V

    .line 395
    return-void
.end method

.method private e()V
    .locals 3

    .line 304
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 305
    if-eqz v1, :cond_0

    .line 307
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 308
    if-eqz v2, :cond_0

    .line 310
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 312
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a:Z

    .line 316
    :cond_0
    return-void
.end method

.method private e(I)V
    .locals 1

    .line 593
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_0

    .line 595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0, p1}, Lo/bka;->d(I)V

    .line 597
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->i()V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_0

    .line 533
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0, p1, p2, p3}, Lo/bka;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    :cond_0
    return-void
.end method

.method private f()V
    .locals 2

    .line 467
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0, p0}, Lo/bka;->e(Landroid/content/Intent;Landroid/app/Activity;)Lo/bka;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    .line 468
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/bka;->c(Landroid/os/Handler;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a:Z

    invoke-virtual {v0, v1}, Lo/bka;->a(Z)V

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->c()V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->a()V

    .line 472
    return-void
.end method

.method private g()V
    .locals 1

    .line 490
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_0

    .line 492
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->d()V

    .line 494
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 542
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->d:Lo/bgp;

    .line 543
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->d:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 544
    return-void
.end method

.method private i()V
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_0

    .line 481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->c()V

    .line 483
    :cond_0
    return-void
.end method

.method private k()V
    .locals 0

    .line 519
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->finish()V

    .line 520
    return-void
.end method

.method private l()V
    .locals 2

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->d:Lo/bgp;

    if-eqz v0, :cond_0

    .line 584
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->d:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 586
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 652
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 654
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    const/16 v1, 0x122

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 656
    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 643
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e:Landroid/os/Handler;

    const/16 v1, 0x121

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 647
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 620
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 622
    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_1

    .line 624
    sget-object v0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c:Ljava/lang/String;

    const-string v1, "bindThirdAccount success"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 625
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b()V

    goto :goto_0

    .line 630
    :cond_0
    const/16 v0, 0x7d5

    if-ne p1, v0, :cond_1

    .line 632
    sget-object v0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c:Ljava/lang/String;

    const-string v1, "bindThirdAccount onError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a()V

    .line 637
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 638
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 661
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 663
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_0

    .line 665
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->k()V

    .line 667
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 279
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 282
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->requestWindowFeature(I)Z

    .line 283
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->c()V

    .line 285
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->e()V

    .line 288
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a:Z

    if-eqz v0, :cond_0

    .line 290
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->f()V

    .line 291
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->h()V

    goto :goto_0

    .line 295
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->d()V

    .line 297
    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 564
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->a:Z

    if-eqz v0, :cond_0

    .line 566
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->l()V

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    if-eqz v0, :cond_1

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/twodimcode/TwoDimCodeActivity;->b:Lo/bka;

    invoke-virtual {v0}, Lo/bka;->e()V

    .line 572
    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 574
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bis;->b(Landroid/app/Activity;)V

    .line 575
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 557
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 558
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lo/bis;->e(Landroid/app/Activity;I)V

    .line 559
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 549
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 551
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lo/bis;->e(Landroid/app/Activity;I)V

    .line 552
    return-void
.end method
