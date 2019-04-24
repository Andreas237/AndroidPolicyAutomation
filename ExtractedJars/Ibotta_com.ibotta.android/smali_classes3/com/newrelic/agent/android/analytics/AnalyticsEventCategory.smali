.class public final enum Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;
.super Ljava/lang/Enum;
.source "AnalyticsEventCategory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum Breadcrumb:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum Crash:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum Interaction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum Session:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

.field public static final enum UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 4
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Session"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Session:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 5
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Interaction"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Interaction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 6
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Crash"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Crash:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Custom"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 8
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "NetworkRequest"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 9
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "RequestError"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 10
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "Breadcrumb"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Breadcrumb:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    .line 11
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const-string v1, "UserAction"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    const/16 v0, 0x8

    .line 3
    new-array v0, v0, [Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Session:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Interaction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Crash:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v5

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v6

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v7

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Breadcrumb:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v8

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    aput-object v1, v0, v9

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->$VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;
    .locals 2

    .line 14
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Custom:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    if-eqz p0, :cond_6

    const-string v1, "session"

    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 17
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Session:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_0
    const-string v1, "interaction"

    .line 18
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 19
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Interaction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_1
    const-string v1, "crash"

    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 21
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Crash:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_2
    const-string v1, "requesterror"

    .line 22
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 23
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->RequestError:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_3
    const-string v1, "breadcrumb"

    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 25
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->Breadcrumb:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_4
    const-string v1, "networkrequest"

    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 27
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->NetworkRequest:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    goto :goto_0

    :cond_5
    const-string v1, "useraction"

    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_6

    .line 29
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->UserAction:Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    :cond_6
    :goto_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;
    .locals 1

    .line 3
    const-class v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;
    .locals 1

    .line 3
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->$VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/analytics/AnalyticsEventCategory;

    return-object v0
.end method
