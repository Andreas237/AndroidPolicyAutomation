.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->onResponse(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

.field final synthetic val$response:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;Ljava/lang/String;)V
    .locals 0

    .line 407
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->val$response:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps responseDestSiteListener executeAsyncTask doInBackground response:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->val$response:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    const/4 v4, 0x0

    .line 413
    :try_start_0
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->val$response:Ljava/lang/String;

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$100()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    goto :goto_0

    .line 415
    :catch_0
    move-exception v5

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps responseDestSiteListener executeAsyncTask doInBackground ======json error!!!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const/4 v0, 0x0

    return-object v0

    .line 420
    :goto_0
    return-object v4
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 5

    .line 425
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 426
    return-void

    .line 428
    :cond_0
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps responseDestSiteListener executeAsyncTask onPostExecute !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    move-object v4, p1

    check-cast v4, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$200(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$300(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V

    goto :goto_0

    .line 437
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$400(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V

    .line 440
    :goto_0
    return-void
.end method
