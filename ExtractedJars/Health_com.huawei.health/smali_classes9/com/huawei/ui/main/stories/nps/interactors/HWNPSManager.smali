.class public Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field public static final DEVICE_NPS:Ljava/lang/String; = "DEVICE_NPS"

.field public static final IS_SHOW:Ljava/lang/String; = "IS_SHOW"

.field public static final KEY_NPS_SHOW:Ljava/lang/String; = "KEY_NPS_SHOW"

.field public static final MESSAGE_NPSID:Ljava/lang/String; = "MESSAGE_NPSID"

.field public static final MNP_SHOW_TIME:Ljava/lang/String; = "MNP_SHOW_TIME"

.field private static final MOBLE_COUNTRY_CODE_CHINA:Ljava/lang/String; = "460"

.field public static final NPS_QUESTION_CONTENT_KEY:Ljava/lang/String; = "nps_question_content_info"

.field private static destSitetype:Ljava/lang/reflect/Type; = null

.field private static hwNpsManager:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager; = null

.field private static sIsBusy:Z = false


# instance fields
.field private TAG:Ljava/lang/String;

.field private deviceMac:Ljava/lang/String;

.field private errorSubmitListener:Lcom/android/volley/Response$ErrorListener;

.field private goSubmitSurveyState:Z

.field private mClondMgr:Lo/czg;

.field private mContext:Landroid/content/Context;

.field private mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

.field private mDeviceName:Ljava/lang/String;

.field private mFirmware:Ljava/lang/String;

.field private mLanguage:Ljava/lang/String;

.field private mMessageCenter:Lo/eaa;

.field private mOs:Ljava/lang/String;

.field private mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

.field private mSn:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private questionId:I

.field private questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

.field private questionSurveyID:Ljava/lang/String;

.field private questions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;>;"
        }
    .end annotation
.end field

.field private requsetTime:I

.field private submitAnswers:Ljava/lang/String;

.field private submitListener:Lcom/android/volley/Response$Listener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private type:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 101
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$2;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$2;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$2;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->destSitetype:Ljava/lang/reflect/Type;

    .line 103
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    .line 123
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hwNpsManager:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 136
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 77
    const-string v0, "HWNPSManager"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 99
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$1;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->type:Ljava/lang/reflect/Type;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deviceMac:Ljava/lang/String;

    .line 107
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    .line 109
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    .line 111
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    .line 113
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->goSubmitSurveyState:Z

    .line 115
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitListener:Lcom/android/volley/Response$Listener;

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorSubmitListener:Lcom/android/volley/Response$ErrorListener;

    .line 119
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitAnswers:Ljava/lang/String;

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mClondMgr:Lo/czg;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mMessageCenter:Lo/eaa;

    .line 137
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    .line 138
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========HWNPSManager nps 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mClondMgr:Lo/czg;

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mMessageCenter:Lo/eaa;

    .line 143
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->goSubmitSurveyState:Z

    .line 145
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    .line 147
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->initQstnSurveyDB()V

    .line 150
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/reflect/Type;
    .locals 1

    .line 76
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->destSitetype:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/reflect/Type;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->type:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->processGetSurveyResponse()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Z
    .locals 1

    .line 76
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->goSubmitSurveyState:Z

    return v0
.end method

.method static synthetic access$300(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getDestSiteSubmitSurvey(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V
    .locals 0

    .line 76
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->processGetDestSiteResponse(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Landroid/content/Context;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lo/eaa;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mMessageCenter:Lo/eaa;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    return v0
.end method

.method static synthetic access$900(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    return-object v0
.end method

.method static synthetic access$902(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;)Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    return-object p1
.end method

.method private errorListener()Lcom/android/volley/Response$ErrorListener;
    .locals 1

    .line 887
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$9;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$9;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    return-object v0
.end method

.method private generateNpsMessage()V
    .locals 4

    .line 541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter generateNpsMessage !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mMessageCenter:Lo/eaa;

    const-string v1, "nps"

    const-string v2, "nps_type_message"

    new-instance v3, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eaa;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 596
    return-void
.end method

.method private getDestSiteSubmitSurvey(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V
    .locals 7

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps getDestSiteSubmitSurvey!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->getResCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps getDestSiteSubmitSurvey ======\u53bb\u63d0\u4ea4\u95ee\u5377"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->getCountryInfo()Ljava/util/ArrayList;

    move-result-object v4

    .line 471
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;

    .line 472
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;->getServerAddress()Ljava/lang/String;

    move-result-object v6

    .line 473
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getQuestionSurveyTable()Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 474
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitSurvey(Ljava/lang/String;)V

    .line 476
    :cond_0
    return-void
.end method

.method private getDeviceID(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 974
    const-string v4, ""

    .line 975
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 976
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID npsDeviceId is null return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    return-object v4

    .line 980
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getMobileCountryCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 981
    const-string v0, "460"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 982
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID in China!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 983
    move-object v4, p1

    goto :goto_0

    .line 985
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceID in Overseas!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 986
    const-string v6, ""

    .line 987
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v7

    .line 988
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 989
    const-string v8, "09F98935DF23B3E011F5638614670662IrzLoccccR72B/H4EI3GKB6ny7lTZGH7IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0"

    .line 990
    invoke-virtual {v7, v8}, Lo/dec;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 993
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 994
    invoke-direct {p0, p1, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hmacsha256(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 998
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====123===getDeviceID npsDeviceId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    return-object v4
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;
    .locals 2

    .line 128
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hwNpsManager:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 129
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hwNpsManager:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    .line 132
    :cond_0
    sget-object v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hwNpsManager:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    return-object v0
.end method

.method private getRequestInfo()V
    .locals 3

    .line 747
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 748
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mLanguage:Ljava/lang/String;

    .line 750
    invoke-static {}, Lo/dak;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    .line 751
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 752
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 753
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->getDeviceType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    .line 757
    :cond_1
    invoke-static {}, Lo/dak;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    .line 758
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 759
    :cond_2
    const-string v0, "firmware"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    .line 762
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mOs:Ljava/lang/String;

    .line 764
    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 768
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 769
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->getDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    .line 773
    :cond_5
    invoke-static {}, Lo/dak;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->model:Ljava/lang/String;

    .line 774
    return-void
.end method

.method private getSurveyTableByDevice(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;
    .locals 5

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps Enter getSurveyTableByDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    const/4 v4, 0x0

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->selectSurveyTableByDeviceId(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v4

    goto :goto_0

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps getSurveyTableByDevice  enter else null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps Leave getSurveyTableByDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    return-object v4
.end method

.method private hmacsha256(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=======nps Enter hmacsha256  macData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  macKey:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1010
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v4

    .line 1011
    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 1012
    new-instance v6, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "HMACSHA256"

    invoke-direct {v6, v4, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 1013
    const-string v0, "HmacSHA256"

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v7

    .line 1014
    invoke-virtual {v7, v6}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 1015
    invoke-virtual {v7, v5}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v8

    .line 1016
    const/4 v0, 0x2

    invoke-static {v8, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v9

    .line 1017
    return-object v9

    .line 1018
    :catch_0
    move-exception v4

    .line 1019
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UnsupportedEncodingException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    const-string v0, ""

    return-object v0

    .line 1021
    :catch_1
    move-exception v4

    .line 1022
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NoSuchAlgorithmException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1023
    const-string v0, ""

    return-object v0

    .line 1024
    :catch_2
    move-exception v4

    .line 1025
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InvalidKeyException e"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1026
    const-string v0, ""

    return-object v0
.end method

.method private initQstnSurveyDB()V
    .locals 6

    .line 161
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    .line 163
    const/16 v4, 0x6d

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    invoke-static {}, Lo/dcl;->d()I

    move-result v5

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps initQstnSurveyDB newDBVersion ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", oldDBVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    if-le v4, v5, :cond_0

    const/4 v0, 0x0

    if-ge v0, v5, :cond_0

    const/16 v0, 0x66

    if-gt v5, v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps initQstnSurveyDB upgradeQstnSurveyDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    const/16 v1, 0x2714

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upgradeQstnSurveyDB(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/Integer;Landroid/content/Context;)V

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps initQstnSurveyDB createDBTable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    invoke-virtual {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->createDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    .line 177
    :goto_0
    return-void
.end method

.method private insertDeviceToDB()V
    .locals 5

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter insertDeviceToDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    new-instance v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-direct {v4}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;-><init>()V

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deviceMac:Ljava/lang/String;

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceID:Ljava/lang/String;

    .line 373
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    .line 374
    invoke-static {}, Lo/dak;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->deviceType:Ljava/lang/String;

    .line 375
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    .line 376
    const/4 v0, 0x0

    iput v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    .line 377
    const-string v0, "0"

    iput-object v0, v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->surveyID:Ljava/lang/String;

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====nps insertDeviceToDB-->questionSurveyTable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    invoke-virtual {v0, p0, v4}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->insertDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)J

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Leave insertDeviceToDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 381
    return-void
.end method

.method private isDeviceIDInDB(Ljava/lang/String;)Z
    .locals 2

    .line 261
    new-instance v1, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;-><init>(Landroid/content/Context;)V

    .line 262
    invoke-virtual {v1, p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->isDeviceIDInDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isIsBusy()Z
    .locals 1

    .line 938
    sget-boolean v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    return v0
.end method

.method private judgeGetSurveyTimeArrive(ILcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)Z
    .locals 6

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps Enter judgeGetSurveyTimeArrive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    const/4 v4, 0x0

    .line 287
    add-int/lit8 v5, p1, 0x1

    .line 289
    const/4 v0, 0x1

    if-lt v5, v0, :cond_0

    const/4 v0, 0x2

    if-le v5, v0, :cond_1

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps judgeGetSurveyTimeArrive GetSurvey times is off limits!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    return v4

    .line 294
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 295
    return v4

    .line 298
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====nps judgeGetSurveyTimeArrive GetSurvey times = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const/4 v0, 0x1

    if-ne v0, v5, :cond_3

    .line 301
    iget-wide v0, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->timeDayThen15(J)Z

    move-result v4

    goto :goto_0

    .line 304
    :cond_3
    iget-wide v0, p2, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->lastSurveyTime:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->timeDayThen90(J)Z

    move-result v4

    .line 307
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps Leave judgeGetSurveyTimeArrive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    return v4
.end method

.method private loadInitialData(Ljava/lang/String;)V
    .locals 12

    .line 690
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps Enter loadInitialData paraNpsUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    add-int/lit8 v6, v0, 0x1

    .line 692
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps loadInitialData times = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    const/4 v0, 0x1

    if-lt v6, v0, :cond_0

    const/4 v0, 0x2

    if-le v6, v0, :cond_1

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps loadInitialData (times < 1 || times > 2) return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 696
    return-void

    .line 699
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 701
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getRequestInfo()V

    .line 703
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 705
    const-string v0, "model"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    const-string v0, "firmware"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 707
    const-string v0, "sn"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, "sn"

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    :goto_0
    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    const-string v0, "language"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mLanguage:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    const-string v0, "os"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mOs:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    const-string v0, "appID"

    const-string v1, "3"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    const-string v0, "band"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->model:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    const-string v0, "times"

    invoke-interface {v8, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps loadInitialData map:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    const-string v9, ""

    .line 719
    const-string v10, "?cVer=21319"

    .line 725
    const-string v11, "&channel=100001"

    .line 727
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 728
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "secured/CCPC/EN/ccpcnps/getSurveyV2/1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 731
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "secured/CCPC/EN/ccpcnps/getSurveyV2/1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 734
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps loadInitialData requestNpsUrl: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 737
    move-object v0, p0

    move-object v2, v9

    .line 738
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->responseListener()Lcom/android/volley/Response$Listener;

    move-result-object v3

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorListener()Lcom/android/volley/Response$ErrorListener;

    move-result-object v4

    move-object v5, v8

    .line 737
    const/4 v1, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->executeRequest(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V

    goto :goto_2

    .line 741
    :cond_4
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    .line 743
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Leave loadInitialData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    return-void
.end method

.method private processGetDestSiteResponse(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;)V
    .locals 7

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps Enter processGetDestSiteResponse! requsetTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->getResCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 449
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    if-ltz v0, :cond_0

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps processGetDestSiteResponse ======\u53bb\u83b7\u53d6\u95ee\u5377"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse;->getCountryInfo()Ljava/util/ArrayList;

    move-result-object v4

    .line 453
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;

    .line 454
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnDestSiteResponse$CountryInfo;->getServerAddress()Ljava/lang/String;

    move-result-object v6

    .line 455
    invoke-direct {p0, v6}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->loadInitialData(Ljava/lang/String;)V

    .line 456
    goto :goto_0

    .line 458
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps processGetDestSiteResponse ======\u6fc0\u6d3b\u6210\u529f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->insertDeviceToDB()V

    .line 463
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Leave processGetDestSiteResponse!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    return-void
.end method

.method private processGetSurveyResponse()V
    .locals 9

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    if-eqz v0, :cond_a

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps processGetSurveyResponse resCode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getResCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getResCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=====nps processGetSurveyResponse \u83b7\u53d6\u65b0\u7684\u95ee\u5377"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->getQuestions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 829
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    .line 831
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 833
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getSurveyContent()Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QuestionnaireInfo;->getQuestions()Ljava/util/List;

    move-result-object v5

    .line 834
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 835
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps processGetSurveyResponse null == questionList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    return-void

    .line 838
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 839
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 840
    goto :goto_0

    .line 841
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 842
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps processGetSurveyResponse questions.size()<1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    return-void

    .line 846
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questions:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/cache/QuestionCache;->setQuestions(Ljava/util/List;)V

    .line 847
    const-string v0, "K1"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "K2"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 848
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->showSelectQstnDialog()V

    goto :goto_1

    .line 850
    :cond_5
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->generateNpsMessage()V

    .line 853
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getSurveyID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    .line 854
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dbf;->c(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    .line 858
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========nps processGetSurveyResponse questionId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   questionSurveyID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getFirstTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->d(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 860
    const-wide/16 v7, 0x0

    .line 861
    const/4 v0, 0x0

    if-eq v0, v6, :cond_7

    .line 862
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========nps processGetSurveyResponse firstDate: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " firstTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 863
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 865
    :cond_7
    invoke-direct {p0, v7, v8}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setQstnSurveyTable(J)V

    .line 866
    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getResCode()I

    move-result v0

    const v1, 0x4a76b

    if-ne v1, v0, :cond_a

    .line 867
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========nps processGetSurveyResponse errorCode 305003 getFirstTime :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getFirstTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 868
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDetailResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyDetailResponse;->getFirstTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->d(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 870
    const-wide/16 v6, 0x0

    .line 871
    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 872
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========nps processGetSurveyResponse errorCode 305003, update table firstDate: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " firstTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 873
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 872
    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    .line 876
    :cond_9
    invoke-direct {p0, v6, v7}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setQstnSurveyTable(J)V

    .line 879
    :cond_a
    :goto_2
    return-void
.end method

.method private requestGetDestSite()V
    .locals 8

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter requestGetDestSite "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v6

    .line 350
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 352
    const-string v0, "countryCode"

    invoke-interface {v7, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestGetDestSite getDestSite map = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGetDestSite NPS_HOST_HTTPS_URL = https://ccpc-cn.consumer.huawei.com/ccpcmd/services/dispatch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 359
    move-object v0, p0

    const-string v2, "https://ccpc-cn.consumer.huawei.com/ccpcmd/services/dispatch/secured/CCPC/EN/ccpcnps/getCountryInfo/1"

    .line 360
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->responseDestSiteListener()Lcom/android/volley/Response$Listener;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorDestSiteListener()Lcom/android/volley/Response$ErrorListener;

    move-result-object v4

    move-object v5, v7

    .line 359
    const/4 v1, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->executeRequest(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V

    .line 363
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Leave requestGetDestSite "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    return-void
.end method

.method private responseDestSiteListener()Lcom/android/volley/Response$Listener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
        }
    .end annotation

    .line 398
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$3;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    return-object v0
.end method

.method private responseListener()Lcom/android/volley/Response$Listener;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
        }
    .end annotation

    .line 783
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    return-object v0
.end method

.method public static setIsBusy(Z)V
    .locals 0

    .line 942
    sput-boolean p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    .line 943
    return-void
.end method

.method private setQstnSurveyTable(J)V
    .locals 7

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter setQstnSurveyTable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 645
    invoke-direct {p0, v4}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSurveyTableByDevice(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 647
    return-void

    .line 650
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 651
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    iput v1, v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->id:I

    .line 654
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->setSurveyID(Ljava/lang/String;)V

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->setTimes(Ljava/lang/Integer;)V

    .line 658
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    .line 659
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_2

    .line 660
    move-wide v5, p1

    .line 662
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v0, v5, v6}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->setLastSurveyTime(J)V

    .line 664
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->updateQstnSurveyTable(Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)V

    .line 665
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave setQstnSurveyTable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    return-void
.end method

.method private submitSurvey(Ljava/lang/String;)V
    .locals 10

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter submitSurvey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 480
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getRequestInfo()V

    .line 482
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 484
    const-string v0, "surveyID"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->getSurveyID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->getTimes()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 486
    const-string v0, "times"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    goto :goto_0

    .line 488
    :cond_0
    const-string v0, "surveyID"

    const-string v1, "0"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    const-string v0, "times"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    :goto_0
    const-string v0, "model"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, "deviceName"

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mDeviceName:Ljava/lang/String;

    :goto_1
    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    const-string v0, "firmware"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, "firmware"

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mFirmware:Ljava/lang/String;

    :goto_2
    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    const-string v0, "language"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mLanguage:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    const-string v0, "os"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mOs:Ljava/lang/String;

    if-nez v1, :cond_3

    const-string v1, "os"

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mOs:Ljava/lang/String;

    :goto_3
    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    const-string v0, "appID"

    const-string v1, "3"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    const-string v0, "sn"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mSn:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    const-string v0, "answers"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitAnswers:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    const-string v0, "band"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->model:Ljava/lang/String;

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps submitSurvey map: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    const-string v7, ""

    .line 506
    const-string v8, "?cVer=21319"

    .line 507
    const-string v9, "&channel=100001"

    .line 509
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 510
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 513
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "secured/CCPC/EN/ccpcnps/submitSurveyV2/1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 516
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps submitSurvey requestNpsUrl: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 519
    move-object v0, p0

    move-object v2, v7

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitListener:Lcom/android/volley/Response$Listener;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorSubmitListener:Lcom/android/volley/Response$ErrorListener;

    move-object v5, v6

    const/4 v1, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->executeRequest(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V

    .line 523
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Leave submitSurvey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    return-void
.end method

.method private timeDayThen15(J)Z
    .locals 9

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter timeDayThen15"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 314
    const-wide/32 v6, 0x13c680

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps timeDayThen15 spanTimeSec: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  span15DaySec = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    const/4 v8, 0x0

    .line 318
    cmp-long v0, v4, v6

    if-lez v0, :cond_0

    .line 319
    const/4 v8, 0x1

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps Leave timeDayThen15 res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    return v8
.end method

.method private timeDayThen90(J)Z
    .locals 10

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps Enter timeDayThen90 currTimemil = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  lastSurveyTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/16 v2, 0x3e8

    div-long v5, v0, v2

    .line 330
    const-wide/32 v7, 0x76a700

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps timeDayThen90 spanTimeSec:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   span90DaySec: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/4 v9, 0x0

    .line 333
    cmp-long v0, v5, v7

    if-lez v0, :cond_0

    .line 334
    const/4 v9, 0x1

    .line 337
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps Leave timeDayThen90 res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    return v9
.end method


# virtual methods
.method public activatedQstnSurvey()V
    .locals 5

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter activatedQstnSurvey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->isIsBusy()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey sIsBusy is true return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    return-void

    .line 205
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->goSubmitSurveyState:Z

    if-eqz v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey now submitSurvey return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void

    .line 210
    :cond_1
    const-string v0, ""

    invoke-static {}, Lo/dak;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "W1"

    invoke-static {}, Lo/dak;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 211
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey DeviceNPSInfoCache.getHuaweiWearName is not support return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    return-void

    .line 215
    :cond_3
    const-string v0, ""

    invoke-static {}, Lo/dak;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey fiemware (sysVersion) is null return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 220
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps isBusy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mac:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const-string v0, ""

    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey mac is null return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 226
    :cond_5
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setIsBusy(Z)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps setIsBusy(true) ========isBusy:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->sIsBusy:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deviceMac:Ljava/lang/String;

    .line 231
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionId:I

    .line 232
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyID:Ljava/lang/String;

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deviceMac:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->isDeviceIDInDB(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey 0000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->deviceMac:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSurveyTableByDevice(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey -->mQuestionSurveyTable is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    return-void

    .line 242
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========nps mQuestionSurveyTable.times:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-virtual {v3}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->times:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    .line 246
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_8

    .line 247
    iget v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->judgeGetSurveyTimeArrive(ILcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps open Select Qstn"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requestGetDestSite()V

    goto :goto_0

    .line 253
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps activatedQstnSurvey aaaa"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requsetTime:I

    .line 255
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requestGetDestSite()V

    .line 257
    :cond_8
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Leave activatedQstnSurvey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    return-void
.end method

.method protected errorDestSiteListener()Lcom/android/volley/Response$ErrorListener;
    .locals 1

    .line 532
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$4;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    return-object v0
.end method

.method public executeRequest(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 900
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mClondMgr:Lo/czg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps executeRequest mClondMgr.executeStringRequest !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mClondMgr:Lo/czg;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/czg;->e(ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Ljava/util/Map;)V

    .line 904
    :cond_0
    return-void
.end method

.method public getMobileCountryCode(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .line 949
    const-string v4, ""

    .line 950
    const-string v5, ""

    .line 951
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 952
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$array;->CountryCodes:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v6

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMobileCountryCode strCountryID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 956
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 957
    return-object v5

    .line 960
    :cond_0
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_2

    .line 961
    aget-object v0, v6, v7

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 962
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    const/4 v0, 0x1

    aget-object v0, v8, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 963
    const/4 v0, 0x0

    aget-object v5, v8, v0

    .line 964
    goto :goto_1

    .line 960
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 968
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMobileCountryCode resCountryCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 969
    return-object v5
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 154
    const/16 v0, 0x2714

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getQuestionDetail()Ljava/lang/String;
    .locals 5

    .line 917
    const-string v4, ""

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    const/16 v1, 0x2714

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "nps_question_content_info"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps getQuestionDetail question = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    return-object v4
.end method

.method public getQuestionSurveyTable()Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;
    .locals 1

    .line 636
    invoke-static {}, Lo/dak;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSurveyTableByDevice(Ljava/lang/String;)Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    .line 638
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mQuestionSurveyTable:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;

    return-object v0
.end method

.method public getSecDeviceIDsha256(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1036
    const-string v4, ""

    .line 1037
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1038
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "secDeviceID is null return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    return-object v4

    .line 1041
    :cond_1
    const-string v5, ""

    .line 1042
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v6

    .line 1043
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 1044
    const-string v7, "09F98935DF23B3E011F5638614670662IrzLoccccR72B/H4EI3GKB6ny7lTZGH7IB4hQWa2qra9LliDA6e9/qgL/9yUjVL0"

    .line 1045
    invoke-virtual {v6, v7}, Lo/dec;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1048
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 1049
    invoke-direct {p0, p1, v5}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->hmacsha256(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1052
    :cond_3
    return-object v4
.end method

.method public getSharedPreference(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1072
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isShowToDo()Z
    .locals 6

    .line 1076
    const-wide/32 v4, 0x4d3f6400

    .line 1077
    const-string v0, "true"

    const-string v1, "KEY_NPS_SHOW"

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1078
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string v3, "MNP_SHOW_TIME"

    invoke-virtual {p0, v3}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo/dbf;->k(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-gez v0, :cond_0

    .line 1079
    const/4 v0, 0x1

    return v0

    .line 1082
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public migrateToDB(Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)V
    .locals 6

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter migrateToDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========nps Enter migrateToDB questionSurveyTable is null ,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    return-void

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====nps migrateToDB-->questionSurveyTable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    invoke-virtual {v0, p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->insertDBTable(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)J

    move-result-wide v4

    .line 394
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==========nps Leave migrateToDB count:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    return-void
.end method

.method public setQuestionDetail(Ljava/lang/String;)V
    .locals 5

    .line 908
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 911
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    const/16 v1, 0x2714

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "nps_question_content_info"

    invoke-static {v0, v1, v2, p1, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 913
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps setQuestionDetail question = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    return-void
.end method

.method public setSharedPreference(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    .line 1063
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    .line 1064
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1063
    const/4 v2, 0x0

    invoke-static {v0, v1, p1, p2, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method

.method public showSelectQstnDialog()V
    .locals 6

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter showSelectQstnDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getInstance()Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    move-result-object v4

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_nps_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->setTitle(Ljava/lang/String;)V

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_success_message_2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->setMessage(Ljava/lang/String;)V

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_participate_sure:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$6;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->setPositiveButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 622
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_participate_cancel:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$7;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->setNegativeButton(Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    .line 628
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 630
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 631
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Leave showSelectQstnDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    return-void
.end method

.method public submitSurveyQuestion(Ljava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;Lcom/android/volley/Response$ErrorListener;)V"
        }
    .end annotation

    .line 926
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter submitSurveyQuestion!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 928
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->goSubmitSurveyState:Z

    .line 929
    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitListener:Lcom/android/volley/Response$Listener;

    .line 930
    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->errorSubmitListener:Lcom/android/volley/Response$ErrorListener;

    .line 931
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->submitAnswers:Ljava/lang/String;

    .line 932
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->requestGetDestSite()V

    .line 934
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Leave submitSurveyQuestion!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 935
    return-void
.end method

.method public updateQstnSurveyTable(Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)V
    .locals 5

    .line 672
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Enter updateQstnSurveyTable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    if-nez p1, :cond_0

    .line 674
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps mQuestionSurveyTable is null return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    return-void

    .line 678
    :cond_0
    new-instance v4, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;-><init>(Landroid/content/Context;)V

    .line 680
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "========nps mQuestionSurveyTable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    invoke-virtual {v4, p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upDateSurveyTableByDeviceId(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyTable;)I

    .line 682
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "========nps Leave updateQstnSurveyTable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 683
    return-void
.end method

.method public upgradeSurveyDB()V
    .locals 6

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Enter upgradeSurveyDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const/16 v4, 0x6d

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dcl;->e(Landroid/content/Context;Ljava/lang/String;)Lo/dcl;

    invoke-static {}, Lo/dcl;->d()I

    move-result v5

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps upgradeSurveyDB newDBVersion ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", oldDBVersion="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    if-le v4, v5, :cond_0

    const/16 v0, 0x66

    if-gt v5, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->getDBUpgreadFlag()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps upgradeSurveyDB upgradeQstnSurveyDB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->questionSurveyDB:Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;

    const/16 v1, 0x2714

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/db/QstnSurveyDB;->upgradeQstnSurveyDB(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;Ljava/lang/Integer;Landroid/content/Context;)V

    .line 191
    :cond_0
    return-void
.end method
