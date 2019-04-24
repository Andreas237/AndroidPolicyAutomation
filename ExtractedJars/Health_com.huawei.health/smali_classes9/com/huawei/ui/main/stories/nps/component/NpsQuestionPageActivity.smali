.class public Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;
    }
.end annotation


# static fields
.field private static final HTTPS_OK:I = 0xc8

.field private static final ONE_BATCHS:I = 0x1

.field private static final RESCODE:Ljava/lang/String; = "resCode"

.field private static final TAG:Ljava/lang/String; = "NpsUserShowController"

.field private static final THREE_BATCHS:I = 0x3

.field private static final TWO_BATCHS:I = 0x2


# instance fields
.field private adapter:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

.field private commitButton:Landroid/widget/Button;

.field private dialogRunnable:Ljava/lang/Runnable;

.field private handler:Landroid/os/Handler;

.field private isCommitClicked:Z

.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;>;"
        }
    .end annotation
.end field

.field private listview:Landroid/widget/ListView;

.field private mContext:Landroid/content/Context;

.field private noTitleDialog:Lo/egy;

.field private progressFirst:I

.field private progressSecond:I

.field private scoreComment:Ljava/lang/String;

.field private showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

.field private surveyID:Ljava/lang/String;

.field private surveyTime:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->list:Ljava/util/List;

    .line 53
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressFirst:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressSecond:I

    .line 55
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->scoreComment:Ljava/lang/String;

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    .line 62
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyID:Ljava/lang/String;

    .line 73
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->handler:Landroid/os/Handler;

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->isCommitClicked:Z

    .line 254
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$5;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->dialogRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressFirst:I

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressSecond:I

    return v0
.end method

.method static synthetic access$1000(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/os/Handler;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showCommitOKDialog()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/content/Context;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->isCommitClicked:Z

    return v0
.end method

.method static synthetic access$302(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;Z)Z
    .locals 0

    .line 45
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->isCommitClicked:Z

    return p1
.end method

.method static synthetic access$400(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Landroid/widget/Button;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->commitButton:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    return v0
.end method

.method static synthetic access$700(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showTheAlertDialog()V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Lo/egy;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)Ljava/lang/Runnable;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->dialogRunnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method private getTheAnswerString(IILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 292
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 293
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 295
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0xdbc05

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 296
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0xdbc69

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;

    const v1, 0xdbcd0

    invoke-direct {v0, v1, p3}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$AnswerEntity;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 299
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTheSurveyContent(I)Ljava/lang/String;
    .locals 7

    .line 146
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 147
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " getTheSurveyContent huidStr: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v4, ""

    .line 149
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const-string v0, ""

    return-object v0

    .line 152
    :cond_0
    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 153
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getNewUserConfigInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 154
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    .line 155
    if-nez v6, :cond_2

    .line 156
    const-string v0, ""

    return-object v0

    .line 158
    :cond_2
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v4

    .line 159
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getTheSurveyContent new user content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    return-object v4

    .line 162
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->readNpsConfig()Lcom/huawei/ui/main/stories/nps/component/NPSConfig;

    move-result-object v5

    .line 163
    if-nez v5, :cond_4

    .line 164
    const-string v0, ""

    return-object v0

    .line 165
    :cond_4
    const/4 v0, 0x3

    if-ne p1, v0, :cond_6

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/component/NPSConfig;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getOldUserConfigInfo(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;

    move-result-object v6

    .line 167
    if-nez v6, :cond_5

    .line 168
    const-string v0, ""

    return-object v0

    .line 170
    :cond_5
    invoke-virtual {v6}, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->getQuestionContent()Ljava/lang/String;

    move-result-object v4

    .line 171
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getTheSurveyContent old user content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    :cond_6
    return-object v4
.end method

.method private initQueryData(Ljava/lang/String;)V
    .locals 9

    .line 178
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    return-void

    .line 180
    :cond_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->objectFromData(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/component/QuestionContent;

    move-result-object v4

    .line 181
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->getSurveyID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyID:Ljava/lang/String;

    .line 182
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent;->getSurveyContent()Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean;->getQuestions()Ljava/util/List;

    move-result-object v5

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 184
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 185
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;

    .line 186
    new-instance v8, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->getQuestion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/ui/main/stories/nps/component/QuestionContent$SurveyContentBean$QuestionsBean;->getPictureUrl()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v8, v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestion;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->list:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 189
    :cond_1
    return-void
.end method

.method private showCommitOKDialog()V
    .locals 3

    .line 263
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_grade_sure:I

    new-instance v2, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$6;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    .line 264
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_commit_ok:I

    .line 272
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 274
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 277
    :cond_0
    return-void
.end method

.method private showTheAlertDialog()V
    .locals 3

    .line 121
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_net_setting:I

    new-instance v2, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$3;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    .line 122
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_grade_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$2;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    .line 130
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->nps_user_survey_no_net:I

    .line 137
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 139
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->noTitleDialog:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 142
    :cond_0
    return-void
.end method


# virtual methods
.method public commitSurvey(Ljava/lang/String;I)V
    .locals 7

    .line 194
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 195
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 197
    const-string v0, "sn"

    invoke-virtual {v5, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    const-string v0, "appID"

    const-string v1, "20"

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const-string v0, "times"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    const-string v0, "surveyID"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyID:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->adapter:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->adapter:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->getTheScoreComment()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->scoreComment:Ljava/lang/String;

    .line 205
    :cond_0
    const-string v0, "emuiVersion"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getEMUIVerion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    const-string v0, "countryCode"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    const-string v0, "firmware"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getFirmRomVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    const-string v0, "cVer"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getClientVersionCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    const-string v0, "model"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getInternalModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    const-string v0, "os"

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/component/NpsCommonUtil;->getAndroidVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    invoke-static {}, Lo/dbf;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    const-string v6, "http://ccpc.test.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

    goto :goto_0

    .line 217
    :cond_1
    const-string v6, "https://ccpce-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

    .line 219
    :goto_0
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "commitSurvey url string: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const-string v0, "answers"

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressFirst:I

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressSecond:I

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->scoreComment:Ljava/lang/String;

    invoke-direct {p0, v1, v2, v3}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->getTheAnswerString(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "commitSurvey params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$4;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    invoke-static {p0, v6, v5, v4, v0}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I

    .line 252
    return-void
.end method

.method public getProgress(II)V
    .locals 3

    .line 282
    const-string v0, "-----"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--progress--"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "--position"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    if-nez p2, :cond_0

    .line 284
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressFirst:I

    goto :goto_0

    .line 285
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 286
    iput p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->progressSecond:I

    .line 288
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 80
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_nps_question_page:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->setContentView(I)V

    .line 82
    iput-object p0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->mContext:Landroid/content/Context;

    .line 84
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getSurveyTime()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    .line 86
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NpsQuestionPageActivity onCreate() surveyTime: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    if-nez v0, :cond_0

    .line 88
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->showController:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->setTheSurveyUnNeeded(I)V

    .line 90
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->surveyTime:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->getTheSurveyContent(I)Ljava/lang/String;

    move-result-object v3

    .line 91
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->initQueryData(Ljava/lang/String;)V

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->nps_question_lv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->listview:Landroid/widget/ListView;

    .line 93
    new-instance v0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->list:Ljava/util/List;

    invoke-direct {v0, v1, p0, p0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->adapter:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->listview:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->adapter:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 95
    sget v0, Lcom/huawei/ui/main/R$id;->nps_question_next_bt:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->commitButton:Landroid/widget/Button;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;->commitButton:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity$1;-><init>(Lcom/huawei/ui/main/stories/nps/component/NpsQuestionPageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    return-void
.end method
