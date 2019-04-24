.class public final enum Lcom/newrelic/agent/android/connectivity/UserActionType;
.super Ljava/lang/Enum;
.source "UserActionType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/connectivity/UserActionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/connectivity/UserActionType;

.field public static final enum AppBackground:Lcom/newrelic/agent/android/connectivity/UserActionType;

.field public static final enum AppLaunch:Lcom/newrelic/agent/android/connectivity/UserActionType;

.field public static final enum DoubleTap:Lcom/newrelic/agent/android/connectivity/UserActionType;

.field public static final enum Swipe:Lcom/newrelic/agent/android/connectivity/UserActionType;

.field public static final enum Tap:Lcom/newrelic/agent/android/connectivity/UserActionType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 4
    new-instance v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    const-string v1, "AppLaunch"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/connectivity/UserActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppLaunch:Lcom/newrelic/agent/android/connectivity/UserActionType;

    .line 5
    new-instance v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    const-string v1, "AppBackground"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/connectivity/UserActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppBackground:Lcom/newrelic/agent/android/connectivity/UserActionType;

    .line 6
    new-instance v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    const-string v1, "Tap"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/connectivity/UserActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->Tap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    const-string v1, "Swipe"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/connectivity/UserActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->Swipe:Lcom/newrelic/agent/android/connectivity/UserActionType;

    .line 8
    new-instance v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    const-string v1, "DoubleTap"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/newrelic/agent/android/connectivity/UserActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->DoubleTap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    const/4 v0, 0x5

    .line 3
    new-array v0, v0, [Lcom/newrelic/agent/android/connectivity/UserActionType;

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppLaunch:Lcom/newrelic/agent/android/connectivity/UserActionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->AppBackground:Lcom/newrelic/agent/android/connectivity/UserActionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->Tap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->Swipe:Lcom/newrelic/agent/android/connectivity/UserActionType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/newrelic/agent/android/connectivity/UserActionType;->DoubleTap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->$VALUES:[Lcom/newrelic/agent/android/connectivity/UserActionType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/connectivity/UserActionType;
    .locals 1

    .line 3
    const-class v0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/connectivity/UserActionType;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/connectivity/UserActionType;
    .locals 1

    .line 3
    sget-object v0, Lcom/newrelic/agent/android/connectivity/UserActionType;->$VALUES:[Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/connectivity/UserActionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/connectivity/UserActionType;

    return-object v0
.end method
