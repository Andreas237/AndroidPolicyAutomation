.class final enum Lcom/newrelic/agent/android/stats/TicToc$State;
.super Ljava/lang/Enum;
.source "TicToc.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/stats/TicToc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/stats/TicToc$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/stats/TicToc$State;

.field public static final enum STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

.field public static final enum STOPPED:Lcom/newrelic/agent/android/stats/TicToc$State;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 5
    new-instance v0, Lcom/newrelic/agent/android/stats/TicToc$State;

    const-string v1, "STOPPED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/stats/TicToc$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->STOPPED:Lcom/newrelic/agent/android/stats/TicToc$State;

    .line 6
    new-instance v0, Lcom/newrelic/agent/android/stats/TicToc$State;

    const-string v1, "STARTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/stats/TicToc$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Lcom/newrelic/agent/android/stats/TicToc$State;

    sget-object v1, Lcom/newrelic/agent/android/stats/TicToc$State;->STOPPED:Lcom/newrelic/agent/android/stats/TicToc$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/stats/TicToc$State;->STARTED:Lcom/newrelic/agent/android/stats/TicToc$State;

    aput-object v1, v0, v3

    sput-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->$VALUES:[Lcom/newrelic/agent/android/stats/TicToc$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/stats/TicToc$State;
    .locals 1

    .line 4
    const-class v0, Lcom/newrelic/agent/android/stats/TicToc$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/stats/TicToc$State;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/stats/TicToc$State;
    .locals 1

    .line 4
    sget-object v0, Lcom/newrelic/agent/android/stats/TicToc$State;->$VALUES:[Lcom/newrelic/agent/android/stats/TicToc$State;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/stats/TicToc$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/stats/TicToc$State;

    return-object v0
.end method
