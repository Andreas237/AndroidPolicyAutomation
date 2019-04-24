.class public Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "EmailVerificationHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "email_verify"

.field private static final EMAIL_VERIFICATION_HANDLER_PARAM_CODE:Ljava/lang/String; = "code"

.field private static final EMAIL_VERIFICATION_HANDLER_PARAM_ID:Ljava/lang/String; = "email_verification_id"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 18
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->isAsync:Z

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 5

    .line 27
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->params:Ljava/util/Map;

    const-string v1, "email_verification_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->params:Ljava/util/Map;

    const-string v2, "code"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 33
    new-instance v2, Lcom/shopkick/app/account/EmailVerificationController;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/EmailVerificationHandler;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/account/EmailVerificationController;-><init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/fetchers/api/APIManager;)V

    .line 35
    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/account/EmailVerificationController;->validateEmailVerification(Ljava/lang/Long;Ljava/lang/String;)V

    return-void
.end method
