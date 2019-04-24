.class final enum Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;
.super Ljava/lang/Enum;
.source "BrowserStateMachineImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

.field public static final enum COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

.field public static final enum PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

.field public static final enum STARTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

.field public static final enum VERIFIED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 28
    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const-string v1, "STARTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->STARTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 29
    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const-string v1, "COMMITTED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 30
    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const-string v1, "VERIFIED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->VERIFIED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    .line 31
    new-instance v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const-string v1, "PURCHASED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    const/4 v0, 0x4

    .line 27
    new-array v0, v0, [Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->STARTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->COMMITTED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->VERIFIED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->PURCHASED:Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    aput-object v1, v0, v5

    sput-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->$VALUES:[Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;
    .locals 1

    .line 27
    const-class v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;
    .locals 1

    .line 27
    sget-object v0, Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->$VALUES:[Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/internal/browser/BrowserStateMachineImpl$State;

    return-object v0
.end method
