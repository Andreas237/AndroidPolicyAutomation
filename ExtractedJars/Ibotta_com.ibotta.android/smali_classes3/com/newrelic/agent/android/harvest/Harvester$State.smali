.class public final enum Lcom/newrelic/agent/android/harvest/Harvester$State;
.super Ljava/lang/Enum;
.source "Harvester.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/harvest/Harvester;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401c
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/harvest/Harvester$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/harvest/Harvester$State;

.field public static final enum CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

.field public static final enum DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

.field public static final enum DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

.field public static final enum UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 45
    new-instance v0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/Harvester$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    .line 46
    new-instance v0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    const-string v1, "DISCONNECTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/harvest/Harvester$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    .line 47
    new-instance v0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    const-string v1, "CONNECTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/harvest/Harvester$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    .line 48
    new-instance v0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    const-string v1, "DISABLED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/harvest/Harvester$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    const/4 v0, 0x4

    .line 44
    new-array v0, v0, [Lcom/newrelic/agent/android/harvest/Harvester$State;

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    aput-object v1, v0, v5

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->$VALUES:[Lcom/newrelic/agent/android/harvest/Harvester$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/harvest/Harvester$State;
    .locals 1

    .line 44
    const-class v0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/harvest/Harvester$State;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/harvest/Harvester$State;
    .locals 1

    .line 44
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$State;->$VALUES:[Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/harvest/Harvester$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/harvest/Harvester$State;

    return-object v0
.end method
