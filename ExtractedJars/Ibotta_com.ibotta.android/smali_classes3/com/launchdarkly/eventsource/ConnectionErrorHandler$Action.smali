.class public final enum Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
.super Ljava/lang/Enum;
.source "ConnectionErrorHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/eventsource/ConnectionErrorHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

.field public static final enum PROCEED:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

.field public static final enum SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 13
    new-instance v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    const-string v1, "PROCEED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->PROCEED:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    .line 18
    new-instance v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    const-string v1, "SHUTDOWN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    const/4 v0, 0x2

    .line 8
    new-array v0, v0, [Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    sget-object v1, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->PROCEED:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    aput-object v1, v0, v2

    sget-object v1, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->SHUTDOWN:Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    aput-object v1, v0, v3

    sput-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->$VALUES:[Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
    .locals 1

    .line 8
    const-class v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    return-object p0
.end method

.method public static values()[Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;
    .locals 1

    .line 8
    sget-object v0, Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->$VALUES:[Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    invoke-virtual {v0}, [Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/launchdarkly/eventsource/ConnectionErrorHandler$Action;

    return-object v0
.end method
