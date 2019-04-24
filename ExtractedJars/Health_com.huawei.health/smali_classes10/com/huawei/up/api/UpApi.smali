.class public Lcom/huawei/up/api/UpApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TAG:Ljava/lang/String; = "PLGLOGIN_UpApi"

.field public static final UNKNOWN_ERROR:I = -0x1


# instance fields
.field private mContext:Landroid/content/Context;

.field private mExecutorService:Ljava/util/concurrent/ExecutorService;

.field private mUserInfoManager:Lcom/huawei/up/manager/UserInfoManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const-string v0, "https://setting.hicloud.com/AccountServer"

    invoke-static {v0}, Lcom/huawei/up/request/HttpRequestBase;->setBaseURL(Ljava/lang/String;)V

    .line 74
    iput-object p1, p0, Lcom/huawei/up/api/UpApi;->mContext:Landroid/content/Context;

    .line 75
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/up/api/UpApi;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 76
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/up/api/UpApi;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/up/api/UpApi;)Lcom/huawei/up/manager/UserInfoManager;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mUserInfoManager:Lcom/huawei/up/manager/UserInfoManager;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/up/api/UpApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/up/api/UpApi;->getUserInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/huawei/up/api/UpApi;->updateUserInfoBySdk(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V

    return-void
.end method

.method private generateString(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 454
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 455
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_0

    .line 456
    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 455
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 458
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getIsValidAllPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 432
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 433
    return-object p1

    .line 435
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    .line 436
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*"

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-direct {p0, v1, v2}, Lcom/huawei/up/api/UpApi;->generateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 438
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "****"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getIsValidEmail(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 404
    const-string v0, "@"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 405
    array-length v0, v4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 406
    const/4 v0, 0x0

    aget-object v5, v4, v0

    .line 407
    const/4 v0, 0x1

    aget-object v6, v4, v0

    .line 408
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_1

    const-string v0, "[0-9]+"

    invoke-direct {p0, v5, v0}, Lcom/huawei/up/api/UpApi;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 409
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    .line 410
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "****"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 412
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*"

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-direct {p0, v1, v2}, Lcom/huawei/up/api/UpApi;->generateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 415
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-le v0, v1, :cond_2

    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "****@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 419
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/4 v2, 0x0

    invoke-virtual {v5, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "**@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 422
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*"

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/huawei/up/api/UpApi;->generateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 427
    :cond_4
    return-object p1
.end method

.method private getOtherPhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 444
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    .line 445
    return-object p1

    .line 447
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    .line 448
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "*"

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-direct {p0, v1, v2}, Lcom/huawei/up/api/UpApi;->generateString(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 450
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x8

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "****"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getUserInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 7

    .line 87
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mUserInfoManager:Lcom/huawei/up/manager/UserInfoManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 88
    new-instance v0, Lcom/huawei/up/manager/UserInfoManager;

    invoke-direct {v0}, Lcom/huawei/up/manager/UserInfoManager;-><init>()V

    iput-object v0, p0, Lcom/huawei/up/api/UpApi;->mUserInfoManager:Lcom/huawei/up/manager/UserInfoManager;

    .line 90
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/up/api/UpApi$1;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/huawei/up/api/UpApi$1;-><init>(Lcom/huawei/up/api/UpApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/callback/CommonCallback;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 95
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 96
    return-void
.end method

.method private getUserInfoByUP(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 2

    .line 160
    invoke-static {p1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    .line 161
    new-instance v0, Lcom/huawei/up/api/UpApi$3;

    invoke-direct {v0, p0, p2, p1, v1}, Lcom/huawei/up/api/UpApi$3;-><init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;Lcom/huawei/login/ui/login/LoginInit;)V

    invoke-virtual {v1, v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken(Lo/dcx;)V

    .line 196
    return-void
.end method

.method private handleUserAccount(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 390
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleUserAccount: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    const-string v0, ""

    return-object v0

    .line 394
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/up/api/UpApi;->isValidEmail(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 395
    invoke-direct {p0, p1}, Lcom/huawei/up/api/UpApi;->getIsValidEmail(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 396
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/up/api/UpApi;->isValidAllPhoneNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 397
    invoke-direct {p0, p1}, Lcom/huawei/up/api/UpApi;->getIsValidAllPhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 399
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/up/api/UpApi;->getOtherPhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isValid(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 478
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 479
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 482
    :cond_1
    invoke-static {p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 483
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 484
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 485
    const/4 v0, 0x1

    return v0

    .line 487
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private isValidAllPhoneNumber(Ljava/lang/String;)Z
    .locals 4

    .line 493
    const-string v1, "^1[0-9]{10}$"

    .line 494
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 495
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 497
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 498
    const/4 v0, 0x1

    return v0

    .line 500
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private isValidEmail(Ljava/lang/String;)Z
    .locals 2

    .line 468
    const-string v0, "@inner.up.huawei"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 471
    const/4 v0, 0x0

    return v0

    .line 473
    :cond_0
    const-string v1, "^\\s*([A-Za-z0-9_-]+(\\.\\w+)*@(\\w+\\.)+\\w+)\\s*$"

    .line 474
    invoke-direct {p0, p1, v1}, Lcom/huawei/up/api/UpApi;->isValid(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private updateUserInfoBySdk(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 6

    .line 318
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateUserInfoBySdk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 321
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk Account is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 323
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const/16 v0, -0x64

    invoke-interface {p2, v0}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 326
    :cond_0
    return-void

    .line 329
    :cond_1
    const/4 v4, 0x0

    .line 331
    new-instance v5, Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-direct {v5}, Lcom/huawei/hwid/core/datatype/UserInfo;-><init>()V

    .line 332
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk begin name is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    .line 334
    invoke-static {v5, p1}, Lcom/huawei/up/utils/Utils;->getUserInfo(Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/hwid/core/datatype/UserInfo;

    move-result-object v2

    new-instance v3, Lcom/huawei/up/api/UpApi$5;

    invoke-direct {v3, p0, p2}, Lcom/huawei/up/api/UpApi$5;-><init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/callback/CommonCallback;)V

    .line 333
    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/cloudservice/CloudAccount;->updateUserInfo(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)Z

    move-result v4

    .line 356
    if-nez v4, :cond_2

    .line 357
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 358
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfoBySdk is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const/16 v0, -0x64

    invoke-interface {p2, v0}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 362
    :cond_2
    return-void
.end method


# virtual methods
.method public getAccountName()Ljava/lang/String;
    .locals 6

    .line 368
    const-string v4, ""

    .line 369
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 370
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountInfo()Landroid/os/Bundle;

    move-result-object v5

    .line 371
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 372
    const-string v0, "accountName"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 375
    :cond_0
    invoke-direct {p0, v4}, Lcom/huawei/up/api/UpApi;->handleUserAccount(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 376
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAccountName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    return-object v4
.end method

.method public getUserInfo(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 6

    .line 107
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getUserInfo():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginType()I

    move-result v4

    .line 110
    if-eqz v4, :cond_0

    const/4 v0, -0x1

    if-ne v4, v0, :cond_1

    :cond_0
    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    .line 111
    :goto_0
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isThirdLogin:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v5, :cond_2

    .line 113
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " 1.5login ,get userinfo from up server directly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/huawei/up/api/UpApi;->getUserInfoByUP(Landroid/content/Context;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 115
    return-void

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 119
    :cond_3
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo mExecutorService not available"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-void

    .line 122
    :cond_4
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/up/api/UpApi$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/up/api/UpApi$2;-><init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/cloudservice/CloudRequestHandler;Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 151
    return-void
.end method

.method public jumpToHwIdAccountCenter(Landroid/app/Activity;I)I
    .locals 4

    .line 207
    const/4 v2, -0x1

    .line 208
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 209
    return v2

    .line 212
    :cond_0
    invoke-static {p1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 213
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 214
    const-string v0, "com.huawei.hwid.ACTION_MAIN_SETTINGS"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 215
    const/high16 v0, 0x4000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 216
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    const-string v0, "channel"

    const v1, 0x280de80

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 220
    const-string v0, "showLogout"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 221
    invoke-virtual {p1, v3, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 222
    const/4 v2, 0x0

    .line 223
    return v2

    .line 226
    :cond_1
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 227
    const-string v0, "com.huawei.hwid.ACTION_MAIN_SETTINGS"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    const/high16 v0, 0x4000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 229
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 231
    const-string v0, "channel"

    const v1, 0x280de80

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 233
    const-string v0, "showLogout"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 234
    invoke-virtual {p1, v3, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 235
    const/4 v2, 0x0

    .line 236
    return v2
.end method

.method public jumpToHwIdAccountCenter(Landroid/support/v4/app/Fragment;I)I
    .locals 4

    .line 250
    const/4 v2, -0x1

    .line 251
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 252
    return v2

    .line 254
    :cond_0
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 255
    const-string v0, "com.huawei.hwid.ACTION_MAIN_SETTINGS"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    const/high16 v0, 0x4000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 257
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    const-string v0, "channel"

    const v1, 0x280de80

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 261
    const-string v0, "showLogout"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 262
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 263
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 265
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    :goto_0
    invoke-virtual {p1, v3, p2}, Landroid/support/v4/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 268
    const/4 v2, 0x0

    .line 269
    return v2
.end method

.method public updateUserInfo(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 5

    .line 280
    const-string v0, "PLGLOGIN_UpApi"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter updateUserInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    invoke-static {p2}, Lcom/huawei/up/utils/Utils;->isUserInfoChanged(Lcom/huawei/up/model/UserInfomation;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 283
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 284
    const-string v0, "method"

    const-string v1, "updateUserInfo"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    invoke-interface {p3, v4}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V

    .line 286
    return-void

    .line 289
    :cond_0
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 291
    iget-object v0, p0, Lcom/huawei/up/api/UpApi;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    new-instance v1, Lcom/huawei/up/api/UpApi$4;

    invoke-direct {v1, p0, p2, p3}, Lcom/huawei/up/api/UpApi$4;-><init>(Lcom/huawei/up/api/UpApi;Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V

    invoke-virtual {v0, p1, v1}, Lcom/huawei/login/ui/login/LoginInit;->login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    goto :goto_0

    .line 308
    :cond_1
    invoke-direct {p0, p2, p3}, Lcom/huawei/up/api/UpApi;->updateUserInfoBySdk(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/callback/CommonCallback;)V

    .line 310
    :goto_0
    return-void
.end method
