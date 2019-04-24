.class Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/Response$ErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->errorCommitListener()Lcom/android/volley/Response$ErrorListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V
    .locals 0

    .line 503
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorResponse(Lcom/android/volley/VolleyError;)V
    .locals 4

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$302(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Z)Z

    .line 507
    if-eqz p1, :cond_0

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps upload answers error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/android/volley/VolleyError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$800(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    .line 515
    :cond_0
    return-void
.end method
