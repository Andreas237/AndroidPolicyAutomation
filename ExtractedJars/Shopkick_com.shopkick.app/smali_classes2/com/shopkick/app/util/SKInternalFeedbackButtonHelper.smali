.class public Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;
.super Ljava/lang/Object;
.source "SKInternalFeedbackButtonHelper.java"


# static fields
.field private static final feedbackUrlTemplate:Ljava/lang/String; = "sk://email?to=productfeedback@shopkick.com&subject=[Android] Found a bug&text_body=App version: %s \nDevice info: %s running Android SDK Version %s\nDate: %s\nUser ID: %s - %s\n\nSteps to reproduce:\n1.\n2.\n3.\n\nExpected Result:\n\nActual Result:\n\nAdditional Notes:\n"


# instance fields
.field private appVersion:Ljava/lang/String;

.field private deviceModel:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/DeviceInfo;Ljava/lang/String;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 24
    iput-object p3, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->appVersion:Ljava/lang/String;

    .line 25
    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->deviceModel:Ljava/lang/String;

    .line 26
    iput-object p4, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method


# virtual methods
.method public giveFeedback()V
    .locals 5

    .line 30
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 31
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "MMM d, yyyy, h:mm:ss a"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "sk://email?to=productfeedback@shopkick.com&subject=[Android] Found a bug&text_body=App version: %s \nDevice info: %s running Android SDK Version %s\nDate: %s\nUser ID: %s - %s\n\nSteps to reproduce:\n1.\n2.\n3.\n\nExpected Result:\n\nActual Result:\n\nAdditional Notes:\n"

    const/4 v2, 0x6

    .line 34
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->appVersion:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->deviceModel:Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object v0, v2, v3

    iget-object v0, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x4

    aput-object v0, v2, v3

    iget-object v0, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x5

    aput-object v0, v2, v3

    .line 34
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lcom/shopkick/app/util/SKInternalFeedbackButtonHelper;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
