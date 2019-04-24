.class Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$000(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$100(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$200(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$200(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->nps_user_survey_input_score_toast:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 101
    return-void

    .line 103
    :cond_1
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "progressFirst: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$000(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  progressSecond:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$100(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$300(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$302(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;Z)Z

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$400(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->nps_commit_btn_unenable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$500(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getHuidStr()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$600(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->commitSurvey(Ljava/lang/String;I)V

    goto :goto_0

    .line 111
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$700(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    .line 113
    :cond_3
    :goto_0
    return-void
.end method
