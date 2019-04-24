.class Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showTheAlertDialog()V
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

    .line 122
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$800(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Lo/egy;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$800(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 128
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 129
    return-void
.end method
