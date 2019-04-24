.class Lcom/huawei/health/sns/ui/HomeActivity$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/HomeActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/HomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/HomeActivity;)V
    .locals 0

    .line 513
    iput-object p1, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 1

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->g(Lcom/huawei/health/sns/ui/HomeActivity;)Lo/aos;

    move-result-object v0

    invoke-virtual {v0}, Lo/aos;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 2

    .line 524
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->b(Lcom/huawei/health/sns/ui/HomeActivity;)V

    goto :goto_0

    .line 534
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->g(Lcom/huawei/health/sns/ui/HomeActivity;)Lo/aos;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/HomeActivity;->k(Lcom/huawei/health/sns/ui/HomeActivity;)Lo/bcl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aos;->d(Lo/aos$e;)V

    .line 536
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/HomeActivity$1;->d:Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/HomeActivity;->f(Lcom/huawei/health/sns/ui/HomeActivity;)V

    .line 537
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 513
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity$1;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 513
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/HomeActivity$1;->b(Ljava/lang/Boolean;)V

    return-void
.end method
