.class public final enum Lcom/launchdarkly/eventsource/ReadyState;
.super Ljava/lang/Enum;
.source "ReadyState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/launchdarkly/eventsource/ReadyState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/launchdarkly/eventsource/ReadyState;

.field public static final enum CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

.field public static final enum CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

.field public static final enum OPEN:Lcom/launchdarkly/eventsource/ReadyState;

.field public static final enum RAW:Lcom/launchdarkly/eventsource/ReadyState;

.field public static final enum SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 4
    new-instance v0, Lcom/launchdarkly/eventsource/ReadyState;

    const-string v1, "RAW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/launchdarkly/eventsource/ReadyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->RAW:Lcom/launchdarkly/eventsource/ReadyState;

    .line 5
    new-instance v0, Lcom/launchdarkly/eventsource/ReadyState;

    const-string v1, "CONNECTING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/launchdarkly/eventsource/ReadyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    .line 6
    new-instance v0, Lcom/launchdarkly/eventsource/ReadyState;

    const-string v1, "OPEN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/launchdarkly/eventsource/ReadyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    .line 7
    new-instance v0, Lcom/launchdarkly/eventsource/ReadyState;

    const-string v1, "CLOSED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/launchdarkly/eventsource/ReadyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    .line 8
    new-instance v0, Lcom/launchdarkly/eventsource/ReadyState;

    const-string v1, "SHUTDOWN"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/launchdarkly/eventsource/ReadyState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    const/4 v0, 0x5

    .line 3
    new-array v0, v0, [Lcom/launchdarkly/eventsource/ReadyState;

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->RAW:Lcom/launchdarkly/eventsource/ReadyState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->CONNECTING:Lcom/launchdarkly/eventsource/ReadyState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->OPEN:Lcom/launchdarkly/eventsource/ReadyState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->CLOSED:Lcom/launchdarkly/eventsource/ReadyState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/launchdarkly/eventsource/ReadyState;->SHUTDOWN:Lcom/launchdarkly/eventsource/ReadyState;

    aput-object v1, v0, v6

    sput-object v0, Lcom/launchdarkly/eventsource/ReadyState;->$VALUES:[Lcom/launchdarkly/eventsource/ReadyState;

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

.method public static valueOf(Ljava/lang/String;)Lcom/launchdarkly/eventsource/ReadyState;
    .locals 1

    .line 3
    const-class v0, Lcom/launchdarkly/eventsource/ReadyState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/eventsource/ReadyState;

    return-object p0
.end method

.method public static values()[Lcom/launchdarkly/eventsource/ReadyState;
    .locals 1

    .line 3
    sget-object v0, Lcom/launchdarkly/eventsource/ReadyState;->$VALUES:[Lcom/launchdarkly/eventsource/ReadyState;

    invoke-virtual {v0}, [Lcom/launchdarkly/eventsource/ReadyState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/launchdarkly/eventsource/ReadyState;

    return-object v0
.end method
