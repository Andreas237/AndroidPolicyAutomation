.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->showSelectQstnDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 606
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 609
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps press PositiveButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 611
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$500(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$700(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 614
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$700(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$800(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)I

    move-result v1

    iput v1, v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    .line 616
    :cond_0
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 617
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$500(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps press mContext.startActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    return-void
.end method
