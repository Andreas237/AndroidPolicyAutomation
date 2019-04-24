.class Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->querySurveyByHuidFromCloud(Ljava/lang/String;IZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

.field final synthetic val$huidStr:Ljava/lang/String;

.field final synthetic val$newOrOld:Z

.field final synthetic val$times:I

.field final synthetic val$version:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;IZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    iput p2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    iput-boolean p3, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$newOrOld:Z

    iput-object p4, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$version:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 8

    .line 107
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " httpsCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    const/4 v4, 0x0

    .line 109
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_4

    .line 111
    :try_start_0
    invoke-static {p2}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent;

    move-result-object v5

    .line 112
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->getResCode()Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v4, v0

    .line 117
    goto :goto_0

    .line 113
    :catch_0
    move-exception v5

    .line 114
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readNpsConfig JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    goto :goto_0

    .line 115
    :catch_1
    move-exception v5

    .line 116
    const-string v0, "NpsUserShowController"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readNpsConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    :goto_0
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    if-nez v4, :cond_0

    return-void

    .line 120
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$newOrOld:Z

    if-eqz v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setHuidStr(Ljava/lang/String;)V

    .line 123
    move-object v6, v4

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    :sswitch_1
    const-string v0, "100002"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v7, 0x1

    :cond_1
    :goto_1
    sparse-switch v7, :sswitch_data_1

    goto :goto_2

    .line 125
    :sswitch_2
    invoke-virtual {v5, p2}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setQuestionContent(Ljava/lang/String;)V

    .line 126
    const-string v0, "NpsUserShowController"

    const-string v1, "set the Questuon"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    invoke-virtual {v0, v1, v2, v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveNewUserConfigInfo(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 129
    goto :goto_3

    .line 131
    :sswitch_3
    goto :goto_3

    .line 133
    :goto_2
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "times: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " default result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 135
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setQuestionContent(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$times:I

    invoke-virtual {v0, v1, v2, v5}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveNewUserConfigInfo(Ljava/lang/String;ILcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;)V

    .line 139
    :goto_3
    goto/16 :goto_6

    .line 141
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$version:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v5

    .line 142
    move-object v6, v4

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto :goto_4

    :sswitch_4
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v7, 0x0

    goto :goto_4

    :sswitch_5
    const-string v0, "100002"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v7, 0x1

    :cond_3
    :goto_4
    sparse-switch v7, :sswitch_data_3

    goto :goto_5

    .line 144
    :sswitch_6
    invoke-virtual {v5, p2}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setQuestionContent(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$version:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveOldUserConfigInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    goto :goto_6

    .line 148
    :sswitch_7
    goto :goto_6

    .line 150
    :goto_5
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setNeedSurvey(Z)V

    .line 151
    const-string v0, ""

    invoke-virtual {v5, v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->setQuestionContent(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->this$0:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$version:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController$1;->val$huidStr:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->saveOldUserConfigInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    :cond_4
    :goto_6
    return-void

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

    :sswitch_data_2
    .sparse-switch
        0x30 -> :sswitch_4
        0x56586aa1 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x0 -> :sswitch_6
        0x1 -> :sswitch_7
    .end sparse-switch
.end method
