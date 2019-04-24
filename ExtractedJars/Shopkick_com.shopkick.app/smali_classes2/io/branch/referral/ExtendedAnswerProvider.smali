.class Lio/branch/referral/ExtendedAnswerProvider;
.super Ljava/lang/Object;
.source "ExtendedAnswerProvider.java"


# static fields
.field private static final CTRL_PARAM_NOTATION:Ljava/lang/String; = "~"

.field private static final EXTRA_PARAM_NOTATION:Ljava/lang/String; = "+"

.field private static final INNER_PARAM_NOTATION:Ljava/lang/String; = "."

.field public static final KIT_EVENT_INSTALL:Ljava/lang/String; = "Branch Install"

.field public static final KIT_EVENT_OPEN:Ljava/lang/String; = "Branch Open"

.field public static final KIT_EVENT_SHARE:Ljava/lang/String; = "Branch Share"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private addBranchAttributes(Lcom/crashlytics/android/answers/shim/KitEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 99
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string/jumbo v0, "~"

    .line 100
    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "~"

    const-string v2, ""

    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo p2, "~"

    const-string v1, ""

    invoke-virtual {p3, p2, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 102
    invoke-virtual {p1, p2, p4}, Lcom/crashlytics/android/answers/shim/KitEvent;->putAttribute(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/answers/shim/KitEvent;

    goto :goto_0

    .line 103
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "$"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->IdentityID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 104
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->ReferringBranchIdentity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Lcom/crashlytics/android/answers/shim/KitEvent;->putAttribute(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/answers/shim/KitEvent;

    :cond_1
    :goto_0
    return-void
.end method

.method private addJsonArrayToKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;Lorg/json/JSONArray;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 93
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "~"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, p3, v1, v2}, Lio/branch/referral/ExtendedAnswerProvider;->addBranchAttributes(Lcom/crashlytics/android/answers/shim/KitEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private addJsonObjectToKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 65
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 66
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 68
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "+"

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 71
    instance-of v3, v2, Lorg/json/JSONObject;

    if-eqz v3, :cond_1

    .line 72
    check-cast v2, Lorg/json/JSONObject;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v2, v1}, Lio/branch/referral/ExtendedAnswerProvider;->addJsonObjectToKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;Lorg/json/JSONObject;Ljava/lang/String;)V

    goto :goto_0

    .line 73
    :cond_1
    instance-of v3, v2, Lorg/json/JSONArray;

    if-eqz v3, :cond_2

    .line 74
    check-cast v2, Lorg/json/JSONArray;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v2, v1}, Lio/branch/referral/ExtendedAnswerProvider;->addJsonArrayToKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;Lorg/json/JSONArray;Ljava/lang/String;)V

    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, p1, p3, v1, v2}, Lio/branch/referral/ExtendedAnswerProvider;->addBranchAttributes(Lcom/crashlytics/android/answers/shim/KitEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public provideData(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 1

    .line 44
    :try_start_0
    new-instance v0, Lcom/crashlytics/android/answers/shim/KitEvent;

    invoke-direct {v0, p1}, Lcom/crashlytics/android/answers/shim/KitEvent;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string p1, ""

    .line 46
    invoke-direct {p0, v0, p2, p1}, Lio/branch/referral/ExtendedAnswerProvider;->addJsonObjectToKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 47
    sget-object p1, Lio/branch/referral/Defines$Jsonkey;->BranchIdentity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p1}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Lcom/crashlytics/android/answers/shim/KitEvent;->putAttribute(Ljava/lang/String;Ljava/lang/String;)Lcom/crashlytics/android/answers/shim/KitEvent;

    .line 48
    invoke-static {}, Lcom/crashlytics/android/answers/shim/AnswersOptionalLogger;->get()Lcom/crashlytics/android/answers/shim/KitEventLogger;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/crashlytics/android/answers/shim/KitEventLogger;->logKitEvent(Lcom/crashlytics/android/answers/shim/KitEvent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
