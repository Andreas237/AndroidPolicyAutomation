.class Lcom/huawei/health/wxapi/WXEntryActivity$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/wxapi/WXEntryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/wxapi/WXEntryActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/wxapi/WXEntryActivity;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/huawei/health/wxapi/WXEntryActivity$a;->a:Lcom/huawei/health/wxapi/WXEntryActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/wxapi/WXEntryActivity;Lcom/huawei/health/wxapi/WXEntryActivity$1;)V
    .locals 0

    .line 369
    invoke-direct {p0, p1}, Lcom/huawei/health/wxapi/WXEntryActivity$a;-><init>(Lcom/huawei/health/wxapi/WXEntryActivity;)V

    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 374
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " doInBackground() params[0]="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    aget-object v2, p1, v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity$a;->a:Lcom/huawei/health/wxapi/WXEntryActivity;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 376
    return-object v4
.end method

.method protected c(Ljava/lang/String;)V
    .locals 5

    .line 382
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 383
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onPostExecute() result="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity$a;->a:Lcom/huawei/health/wxapi/WXEntryActivity;

    invoke-static {v0}, Lcom/huawei/health/wxapi/WXEntryActivity;->a(Lcom/huawei/health/wxapi/WXEntryActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 398
    new-instance v4, Landroid/content/Intent;

    sget-object v0, Lo/etz;->c:Ljava/lang/String;

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 399
    const-string v0, "RESULT_ACCESS_TOKEN"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 400
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity$a;->a:Lcom/huawei/health/wxapi/WXEntryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/wxapi/WXEntryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/dbg;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity$a;->a:Lcom/huawei/health/wxapi/WXEntryActivity;

    invoke-virtual {v0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    goto :goto_0

    .line 409
    :catch_0
    move-exception v4

    .line 411
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPostExecute MyAsynctask->onPostExecute() Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    :goto_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 369
    move-object v0, p1

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/wxapi/WXEntryActivity$a;->b([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 369
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/wxapi/WXEntryActivity$a;->c(Ljava/lang/String;)V

    return-void
.end method
