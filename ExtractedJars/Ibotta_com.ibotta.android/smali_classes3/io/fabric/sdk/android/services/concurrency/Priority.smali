.class public final enum Lio/fabric/sdk/android/services/concurrency/Priority;
.super Ljava/lang/Enum;
.source "Priority.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/fabric/sdk/android/services/concurrency/Priority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/fabric/sdk/android/services/concurrency/Priority;

.field public static final enum HIGH:Lio/fabric/sdk/android/services/concurrency/Priority;

.field public static final enum IMMEDIATE:Lio/fabric/sdk/android/services/concurrency/Priority;

.field public static final enum LOW:Lio/fabric/sdk/android/services/concurrency/Priority;

.field public static final enum NORMAL:Lio/fabric/sdk/android/services/concurrency/Priority;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 24
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/Priority;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/concurrency/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->LOW:Lio/fabric/sdk/android/services/concurrency/Priority;

    .line 25
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/Priority;

    const-string v1, "NORMAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/fabric/sdk/android/services/concurrency/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->NORMAL:Lio/fabric/sdk/android/services/concurrency/Priority;

    .line 26
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/Priority;

    const-string v1, "HIGH"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/fabric/sdk/android/services/concurrency/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->HIGH:Lio/fabric/sdk/android/services/concurrency/Priority;

    .line 27
    new-instance v0, Lio/fabric/sdk/android/services/concurrency/Priority;

    const-string v1, "IMMEDIATE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/fabric/sdk/android/services/concurrency/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->IMMEDIATE:Lio/fabric/sdk/android/services/concurrency/Priority;

    const/4 v0, 0x4

    .line 23
    new-array v0, v0, [Lio/fabric/sdk/android/services/concurrency/Priority;

    sget-object v1, Lio/fabric/sdk/android/services/concurrency/Priority;->LOW:Lio/fabric/sdk/android/services/concurrency/Priority;

    aput-object v1, v0, v2

    sget-object v1, Lio/fabric/sdk/android/services/concurrency/Priority;->NORMAL:Lio/fabric/sdk/android/services/concurrency/Priority;

    aput-object v1, v0, v3

    sget-object v1, Lio/fabric/sdk/android/services/concurrency/Priority;->HIGH:Lio/fabric/sdk/android/services/concurrency/Priority;

    aput-object v1, v0, v4

    sget-object v1, Lio/fabric/sdk/android/services/concurrency/Priority;->IMMEDIATE:Lio/fabric/sdk/android/services/concurrency/Priority;

    aput-object v1, v0, v5

    sput-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->$VALUES:[Lio/fabric/sdk/android/services/concurrency/Priority;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static compareTo(Lio/fabric/sdk/android/services/concurrency/PriorityProvider;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/fabric/sdk/android/services/concurrency/PriorityProvider;",
            "TY;)I"
        }
    .end annotation

    .line 38
    instance-of v0, p1, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    if-eqz v0, :cond_0

    .line 39
    check-cast p1, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;

    invoke-interface {p1}, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;->getPriority()Lio/fabric/sdk/android/services/concurrency/Priority;

    move-result-object p1

    goto :goto_0

    .line 41
    :cond_0
    sget-object p1, Lio/fabric/sdk/android/services/concurrency/Priority;->NORMAL:Lio/fabric/sdk/android/services/concurrency/Priority;

    .line 44
    :goto_0
    invoke-virtual {p1}, Lio/fabric/sdk/android/services/concurrency/Priority;->ordinal()I

    move-result p1

    invoke-interface {p0}, Lio/fabric/sdk/android/services/concurrency/PriorityProvider;->getPriority()Lio/fabric/sdk/android/services/concurrency/Priority;

    move-result-object p0

    invoke-virtual {p0}, Lio/fabric/sdk/android/services/concurrency/Priority;->ordinal()I

    move-result p0

    sub-int/2addr p1, p0

    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lio/fabric/sdk/android/services/concurrency/Priority;
    .locals 1

    .line 23
    const-class v0, Lio/fabric/sdk/android/services/concurrency/Priority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/fabric/sdk/android/services/concurrency/Priority;

    return-object p0
.end method

.method public static values()[Lio/fabric/sdk/android/services/concurrency/Priority;
    .locals 1

    .line 23
    sget-object v0, Lio/fabric/sdk/android/services/concurrency/Priority;->$VALUES:[Lio/fabric/sdk/android/services/concurrency/Priority;

    invoke-virtual {v0}, [Lio/fabric/sdk/android/services/concurrency/Priority;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fabric/sdk/android/services/concurrency/Priority;

    return-object v0
.end method
