.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(Lcom/huawei/health/sns/model/user/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Void;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

.field final synthetic e:Lcom/huawei/health/sns/model/user/User;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 2505
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->e:Lcom/huawei/health/sns/model/user/User;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected b([Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 2509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/awm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/String;)V
    .locals 7

    .line 2515
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2516
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v4, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->e:Lcom/huawei/health/sns/model/user/User;

    move-object v6, p1

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v6}, Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lo/aws;Lo/bfh;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 2517
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2505
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 2505
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$7;->b(Ljava/lang/String;)V

    return-void
.end method
