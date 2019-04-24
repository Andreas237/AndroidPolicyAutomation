.class Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->onResponse(Ljava/lang/String;)V
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
.field final synthetic this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

.field final synthetic val$response:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;Ljava/lang/String;)V
    .locals 0

    .line 472
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->val$response:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 475
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 477
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->val$response:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$500(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$402(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;)Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 480
    goto :goto_0

    .line 478
    :catch_0
    move-exception v5

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======nps json error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .line 486
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 487
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->clearAllResult()V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$400(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$400(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;->getResCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps upload answers successful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$600(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    .line 491
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$700(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    goto :goto_0

    .line 493
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3$1;->this$1:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps upload answers fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    :goto_0
    return-void
.end method
