.class Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->showComitSureDialog()V
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

    .line 572
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 576
    return-void

    .line 578
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$900(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lo/egv;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$900(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps close commitSuccessDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$900(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->cancel()V

    .line 581
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->access$902(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lo/egv;)Lo/egv;

    .line 583
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;->this$0:Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->finish()V

    .line 584
    return-void
.end method
