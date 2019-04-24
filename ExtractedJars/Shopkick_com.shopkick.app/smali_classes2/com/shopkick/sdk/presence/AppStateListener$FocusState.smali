.class public final enum Lcom/shopkick/sdk/presence/AppStateListener$FocusState;
.super Ljava/lang/Enum;
.source "AppStateListener.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/presence/AppStateListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FocusState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/presence/AppStateListener$FocusState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

.field public static final enum BACKGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

.field public static final enum FOREGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 10
    new-instance v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    const-string v1, "BACKGROUND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->BACKGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    new-instance v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    const-string v1, "FOREGROUND"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->FOREGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    const/4 v0, 0x2

    .line 9
    new-array v0, v0, [Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    sget-object v1, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->BACKGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->FOREGROUND:Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->$VALUES:[Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/presence/AppStateListener$FocusState;
    .locals 1

    .line 9
    const-class v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/presence/AppStateListener$FocusState;
    .locals 1

    .line 9
    sget-object v0, Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->$VALUES:[Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/presence/AppStateListener$FocusState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/presence/AppStateListener$FocusState;

    return-object v0
.end method
