.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->onResponse(Ljava/lang/String;)V
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
.field final synthetic this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

.field final synthetic val$response:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;Ljava/lang/String;)V
    .locals 0

    .line 793
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->val$response:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 796
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 797
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======nps executeAsyncTask responseListener -> response:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->val$response:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->val$response:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$1000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$902(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    .line 800
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->val$response:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setQuestionDetail(Ljava/lang/String;)V

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======nps executeAsyncTask mDetailResponse:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$900(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$900(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 803
    :catch_0
    move-exception v5

    .line 804
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======nps executeAsyncTask json error!!!"

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

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-direct {v1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$902(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    .line 807
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 812
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;->this$1:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$1100(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    .line 815
    return-void
.end method
