.class public Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;
    }
.end annotation


# instance fields
.field private TAG:Ljava/lang/String;

.field private commitSuccessDialog:Lo/egv;

.field private isPosting:Z

.field private mCommitAnswerGsonStr:Ljava/lang/String;

.field private mCommitResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

.field private mCommitResponseType:Ljava/lang/reflect/Type;

.field private mContext:Landroid/content/Context;

.field private mDeviceName:Ljava/lang/String;

.field private mFirmware:Ljava/lang/String;

.field private mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

.field private mLanguage:Ljava/lang/String;

.field private mLastFragment:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

.field private mNextButton:Landroid/widget/Button;

.field private mOs:Ljava/lang/String;

.field private mPagerAdapter:Landroid/support/v4/view/PagerAdapter;

.field private mQstnDetailtype:Ljava/lang/reflect/Type;

.field private mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

.field private mQuestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;>;"
        }
    .end annotation
.end field

.field private mUUID:Ljava/util/UUID;

.field private mViewPager:Landroid/support/v4/view/ViewPager;

.field private mViewPagerIndex:I

.field private maxPosition:I

.field private titleTextView:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 61
    const-string v0, "QuestionMainActivity"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    .line 62
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$1;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnDetailtype:Ljava/lang/reflect/Type;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    .line 77
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPagerIndex:I

    .line 78
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->maxPosition:I

    .line 81
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$2;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitResponseType:Ljava/lang/reflect/Type;

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isPosting:Z

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/util/List;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mLastFragment:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    return-object v0
.end method

.method static synthetic access$102(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mLastFragment:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    return-object p1
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Z)Z
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isPosting:Z

    return p1
.end method

.method static synthetic access$400(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

    return-object v0
.end method

.method static synthetic access$402(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;)Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/CommitResponse;

    return-object p1
.end method

.method static synthetic access$500(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Ljava/lang/reflect/Type;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitResponseType:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->updateQstnSurveyTable()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->showComitSureDialog()V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Landroid/content/Context;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)Lo/egv;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$902(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    return-object p1
.end method

.method private commitListener()Lcom/android/volley/Response$Listener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
        }
    .end annotation

    .line 462
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$3;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    return-object v0
.end method

.method private handlerIntent()V
    .locals 4

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter handlerIntent "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 307
    return-void

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getQuestionSurveyTable()Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps mQstnSurveyTable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    :cond_1
    return-void
.end method

.method private initPostData()V
    .locals 12

    .line 402
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter initPostData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v4, 0x0

    .line 404
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 405
    const/4 v6, 0x0

    .line 406
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 407
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_3

    .line 408
    new-instance v8, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;

    invoke-direct {v8}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;-><init>()V

    .line 410
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 411
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getId()Ljava/lang/Integer;

    move-result-object v5

    .line 412
    invoke-virtual {v9}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestionType()Ljava/lang/String;

    move-result-object v6

    .line 413
    invoke-virtual {v8, v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->setQuestionId(Ljava/lang/Integer;)V

    .line 414
    invoke-virtual {v8, v6}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->setQuestionType(Ljava/lang/String;)V

    .line 416
    const-string v0, "essay"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 417
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 418
    new-instance v10, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;

    invoke-direct {v10}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;-><init>()V

    .line 419
    invoke-virtual {v10, v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->setQuestionId(Ljava/lang/Integer;)V

    .line 420
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 421
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========nps answer to commit:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    invoke-virtual {v10, v11}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->setAnswer(Ljava/lang/String;)V

    .line 423
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 424
    goto :goto_1

    .line 425
    :cond_0
    const-string v0, "option"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 426
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getOptionResult()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 427
    new-instance v10, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;

    invoke-direct {v10}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;-><init>()V

    .line 428
    invoke-virtual {v10, v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->setQuestionId(Ljava/lang/Integer;)V

    .line 429
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getOptionResult()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========nps answer to commit:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    invoke-virtual {v10, v11}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateCommitAnswer;->setAnswer(Ljava/lang/String;)V

    .line 432
    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 433
    goto :goto_1

    .line 436
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps unsupport type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    :cond_2
    :goto_1
    invoke-virtual {v8, v7}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->setAnswers(Ljava/util/List;)V

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========initPostData questionAnswer.questionId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/ui/main/stories/nps/interactors/mode/CreateQuestionAnswer;->getQuestionId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 407
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 442
    :cond_3
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitAnswerGsonStr:Ljava/lang/String;

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps upload answer core data--->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitAnswerGsonStr:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    return-void
.end method

.method private initQuestionsCache()V
    .locals 9

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 175
    return-void

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getQuestionDetail()Ljava/lang/String;

    move-result-object v4

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======nps initQuestionsCache getQuestionDetail response:  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    new-instance v5, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-direct {v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;-><init>()V

    .line 186
    :try_start_0
    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnDetailtype:Ljava/lang/reflect/Type;

    invoke-virtual {v6, v4, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    move-object v5, v0

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "======nps initQuestionsCache detailResponse !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    goto :goto_0

    .line 189
    :catch_0
    move-exception v6

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "======nps initQuestionsCache json error!!!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    :goto_0
    const/4 v6, 0x0

    .line 194
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getSurveyContent()Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 195
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getSurveyContent()Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;->getQuestions()Ljava/util/List;

    move-result-object v6

    .line 198
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps initQuestionsCache null == questionList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void

    .line 203
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    goto :goto_1

    .line 206
    :cond_4
    return-void
.end method

.method private postData()V
    .locals 4

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps Enter postData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isPosting:Z

    if-eqz v0, :cond_0

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps isPosting is true ,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    return-void

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps \u63d0\u4ea4\u95ee\u5377 RUL\uff1asecured/CCPC/EN/ccpcnps/submitSurveyV2/1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isPosting:Z

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mCommitAnswerGsonStr:Ljava/lang/String;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitListener()Lcom/android/volley/Response$Listener;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->errorCommitListener()Lcom/android/volley/Response$ErrorListener;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitSurveyQuestion(Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V

    .line 459
    :cond_1
    return-void
.end method

.method private showComitSureDialog()V
    .locals 6

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter showComitSureDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    if-eqz v0, :cond_0

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps commitSuccessDialog is showing, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    return-void

    .line 568
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_settings_button_nps_ok:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 569
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_success_title:I

    .line 570
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_success_message_1:I

    .line 571
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    .line 572
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$5;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 586
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 589
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 590
    return-void

    .line 593
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitSuccessDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 594
    return-void
.end method

.method private updateQstnSurveyTable()V
    .locals 4

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter updateQstnSurveyTable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    if-nez v0, :cond_0

    .line 599
    return-void

    .line 602
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->setLastSurveyTime(J)V

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQstnSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->updateQstnSurveyTable(Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)V

    .line 607
    :cond_1
    return-void
.end method


# virtual methods
.method public changePage(I)V
    .locals 5

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=======nps Enter changePage  index:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 367
    const-string v4, ""

    .line 368
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->maxPosition:I

    if-ge p1, v0, :cond_0

    .line 369
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_nps_question_survey_next:I

    .line 370
    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    .line 371
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 369
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 372
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->maxPosition:I

    if-ne p1, v0, :cond_1

    .line 373
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_nps_submit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 374
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->maxPosition:I

    add-int/lit8 v0, v0, 0x1

    if-ne p1, v0, :cond_2

    .line 375
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitCenterData()V

    .line 376
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_nps_submit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 378
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_nps_submit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 379
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->commitCenterData()V

    .line 381
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mNextButton:Landroid/widget/Button;

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->titleTextView:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 387
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPagerIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPagerIndex:I

    .line 388
    return-void
.end method

.method public commitCenterData()V
    .locals 4

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter commitCenterData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    invoke-static {p0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps ready commit..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->initPostData()V

    .line 395
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->postData()V

    goto :goto_0

    .line 397
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_network_connect_error:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 399
    :goto_0
    return-void
.end method

.method protected errorCommitListener()Lcom/android/volley/Response$ErrorListener;
    .locals 1

    .line 503
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$4;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;)V

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 352
    sget v0, Lcom/huawei/ui/main/R$id;->question_next:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 353
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPagerIndex:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->changePage(I)V

    .line 355
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 95
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 96
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_nps_question_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->setContentView(I)V

    .line 97
    iput-object p0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mHWNpsMgr:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter QuestionMainActivity onCreate !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const-string v0, "true"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v1

    const-string v2, "KEY_NPS_SHOW"

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v0

    const-string v1, "KEY_NPS_SHOW"

    const-string v2, "false"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_NPS_SHOW result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v0

    const-string v1, "MESSAGE_NPSID"

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v1

    const-string v2, "MESSAGE_NPSID"

    invoke-virtual {v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaa;->c(Ljava/lang/String;)Z

    .line 128
    :cond_0
    const-string v0, ""

    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter QuestionMainActivity wearmac is null finish !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->finish()V

    .line 131
    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter QuestionMainActivity onCreate init!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->handlerIntent()V

    .line 138
    sget v0, Lcom/huawei/ui/main/R$id;->pager:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 139
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity$ScreenSlidePagerAdapter;-><init>(Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mPagerAdapter:Landroid/support/v4/view/PagerAdapter;

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mPagerAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 141
    sget v0, Lcom/huawei/ui/main/R$id;->question_next:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mNextButton:Landroid/widget/Button;

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mNextButton:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mNextButton:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    sget v0, Lcom/huawei/ui/main/R$id;->question_main_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->titleTextView:Lo/emr;

    .line 146
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mLanguage:Ljava/lang/String;

    .line 148
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mUUID:Ljava/util/UUID;

    .line 149
    invoke-static {}, Lo/dak;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mDeviceName:Ljava/lang/String;

    .line 150
    invoke-static {}, Lo/dak;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mFirmware:Ljava/lang/String;

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mFirmware:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mFirmware:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 152
    :cond_2
    const-string v0, "firmware"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mFirmware:Ljava/lang/String;

    .line 154
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Android:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mOs:Ljava/lang/String;

    .line 155
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->getQuestions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    .line 156
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_4

    .line 157
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->initQuestionsCache()V

    .line 160
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_5

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps QuestionMainActivity mQuestions is null finish !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->finish()V

    .line 163
    return-void

    .line 167
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mQuestions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->maxPosition:I

    .line 168
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mPagerAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 169
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->mViewPagerIndex:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->changePage(I)V

    .line 170
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;->updateQstnSurveyTable()V

    .line 171
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 621
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 622
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 616
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 617
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 611
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 612
    return-void
.end method
