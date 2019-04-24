.class public Lcom/newrelic/agent/android/agentdata/HexAttributes;
.super Ljava/lang/Object;
.source "HexAttributes.java"


# static fields
.field public static final HEX_ATTR_APP_BUILD_ID:Ljava/lang/String; = "appBuild"

.field public static final HEX_ATTR_APP_UUID_HI:Ljava/lang/String; = "appUuidHigh"

.field public static final HEX_ATTR_APP_UUID_LO:Ljava/lang/String; = "appUuidLow"

.field public static final HEX_ATTR_APP_VERSION:Ljava/lang/String; = "appVersion"

.field public static final HEX_ATTR_CAUSE:Ljava/lang/String; = "cause"

.field public static final HEX_ATTR_CLASS_NAME:Ljava/lang/String; = "className"

.field public static final HEX_ATTR_FILENAME:Ljava/lang/String; = "fileName"

.field public static final HEX_ATTR_LINE_NUMBER:Ljava/lang/String; = "lineNumber"

.field public static final HEX_ATTR_MESSAGE:Ljava/lang/String; = "message"

.field public static final HEX_ATTR_METHOD_NAME:Ljava/lang/String; = "methodName"

.field public static final HEX_ATTR_NAME:Ljava/lang/String; = "name"

.field public static final HEX_ATTR_SESSION_ID:Ljava/lang/String; = "sessionId"

.field public static final HEX_ATTR_THREAD:Ljava/lang/String; = "thread"

.field public static final HEX_ATTR_THREAD_CRASHED:Ljava/lang/String; = "crashed"

.field public static final HEX_ATTR_THREAD_ID:Ljava/lang/String; = "threadId"

.field public static final HEX_ATTR_THREAD_NUMBER:Ljava/lang/String; = "threadNumber"

.field public static final HEX_ATTR_THREAD_PRI:Ljava/lang/String; = "priority"

.field public static final HEX_ATTR_THREAD_STATE:Ljava/lang/String; = "state"

.field public static final HEX_ATTR_TIMESTAMP_MS:Ljava/lang/String; = "timestampMs"

.field public static final HEX_REQUIRED_ATTRIBUTES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final HEX_SESSION_ATTR_WHITELIST:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 34
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "osName"

    const-string v2, "osVersion"

    const-string v3, "osBuild"

    const-string v4, "osMajorVersion"

    const-string v5, "deviceManufacturer"

    const-string v6, "deviceModel"

    const-string v7, "uuid"

    const-string v8, "carrier"

    const-string v9, "newRelicVersion"

    const-string v10, "memUsageMb"

    const-string v11, "sessionId"

    const-string v12, "platform"

    const-string v13, "platformVersion"

    const-string v14, "runTime"

    const-string v15, "architecture"

    const-string v16, "appBuild"

    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/newrelic/agent/android/agentdata/HexAttributes;->HEX_SESSION_ATTR_WHITELIST:Ljava/util/Set;

    .line 53
    new-instance v0, Ljava/util/HashSet;

    const-string v1, "appBuild"

    const-string v2, "appUuidHigh"

    const-string v3, "appUuidLow"

    const-string v4, "sessionId"

    const-string v5, "message"

    const-string v6, "cause"

    const-string v7, "name"

    const-string v8, "timestampMs"

    const-string v9, "timeSinceLoad"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/newrelic/agent/android/agentdata/HexAttributes;->HEX_REQUIRED_ATTRIBUTES:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
