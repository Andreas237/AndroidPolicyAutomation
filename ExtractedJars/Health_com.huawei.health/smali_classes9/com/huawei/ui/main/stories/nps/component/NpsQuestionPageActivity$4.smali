.class Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->commitSurvey(Ljava/lang/String;I)V
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

    .line 225
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 7

    .line 228
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "commitSurvey() result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 231
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 232
    const-string v0, "resCode"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "0"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "100002"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x1

    :cond_0
    :goto_0
    sparse-switch v6, :sswitch_data_1

    goto :goto_1

    .line 234
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$1000(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$900(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 235
    goto :goto_2

    .line 237
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$302(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;Z)Z

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$400(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->nps_commit_btn:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 239
    goto :goto_2

    .line 241
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$302(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;Z)Z

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->access$400(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->nps_commit_btn:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :goto_2
    goto :goto_3

    .line 245
    :catch_0
    move-exception v4

    .line 246
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "commitSurvey JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :cond_1
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_0
        0x56586aa1 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_2
        0x1 -> :sswitch_3
    .end sparse-switch
.end method
