.class public Lcom/huawei/feedback/ui/FeedbackEditActivity$i;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;)V
    .locals 0

    .line 2431
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2432
    iput-object p2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->b:Landroid/content/Context;

    .line 2433
    return-void
.end method

.method private b()V
    .locals 5

    .line 2456
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Log pack packageName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->J(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " versionName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2459
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->J(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->b(Ljava/lang/String;)V

    .line 2460
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->c(Ljava/lang/String;)V

    .line 2462
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2463
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/io/File;)Ljava/io/File;

    .line 2464
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "waitUploadZipfile = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2468
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2472
    :cond_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 2473
    const/4 v0, 0x4

    iput v0, v3, Landroid/os/Message;->what:I

    .line 2474
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2475
    goto/16 :goto_2

    .line 2477
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2478
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    goto :goto_1

    .line 2480
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 2482
    const-wide/16 v0, 0x1388

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2486
    goto :goto_0

    .line 2483
    :catch_0
    move-exception v3

    .line 2485
    const-string v0, "FeedbackEditActivity"

    const-string v1, "thirdAppPackage InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2487
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2488
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z

    .line 2492
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 2493
    const-string v0, "FeedbackEditActivity"

    const-string v1, "LogFile not Exist"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2495
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v3

    .line 2496
    const/4 v0, 0x4

    iput v0, v3, Landroid/os/Message;->what:I

    .line 2497
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2498
    goto :goto_2

    .line 2499
    :cond_5
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a/a/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 2501
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/feedback/bean/d;->a(Ljava/lang/String;)V

    .line 2502
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 2503
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 2504
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2507
    :goto_2
    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .line 2436
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->b:Landroid/content/Context;

    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    .line 2440
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->b:Landroid/content/Context;

    .line 2441
    return-void
.end method

.method public run()V
    .locals 3

    .line 2446
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FeedbackConstData.isFromOutside()run()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2447
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->b()V

    .line 2449
    return-void
.end method
