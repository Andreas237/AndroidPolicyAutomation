.class Lcom/huawei/health/StartHealthActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/StartHealthActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/StartHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/StartHealthActivity;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lcom/huawei/health/StartHealthActivity$4;->c:Lcom/huawei/health/StartHealthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 370
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWizardRunnable run"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity$4;->c:Lcom/huawei/health/StartHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/StartHealthActivity;->b(Lcom/huawei/health/StartHealthActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.health.MainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 374
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 375
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity$4;->c:Lcom/huawei/health/StartHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/StartHealthActivity;->b(Lcom/huawei/health/StartHealthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 378
    goto :goto_0

    .line 376
    :catch_0
    move-exception v4

    .line 377
    const-string v0, "Login_StartHealthActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startActivity catch e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/StartHealthActivity$4;->c:Lcom/huawei/health/StartHealthActivity;

    invoke-virtual {v0}, Lcom/huawei/health/StartHealthActivity;->finish()V

    .line 380
    return-void
.end method
