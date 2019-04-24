.class public final enum Lcom/ibotta/android/fragment/game/question/Mode;
.super Ljava/lang/Enum;
.source "Mode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/fragment/game/question/Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/fragment/game/question/Mode;

.field public static final enum ANSWER_MULTI:Lcom/ibotta/android/fragment/game/question/Mode;

.field public static final enum ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 7
    new-instance v0, Lcom/ibotta/android/fragment/game/question/Mode;

    const-string v1, "ANSWER_SINGLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/fragment/game/question/Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;

    .line 8
    new-instance v0, Lcom/ibotta/android/fragment/game/question/Mode;

    const-string v1, "ANSWER_MULTI"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/fragment/game/question/Mode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_MULTI:Lcom/ibotta/android/fragment/game/question/Mode;

    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [Lcom/ibotta/android/fragment/game/question/Mode;

    sget-object v1, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_MULTI:Lcom/ibotta/android/fragment/game/question/Mode;

    aput-object v1, v0, v3

    sput-object v0, Lcom/ibotta/android/fragment/game/question/Mode;->$VALUES:[Lcom/ibotta/android/fragment/game/question/Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/fragment/game/question/Mode;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/android/fragment/game/question/Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/game/question/Mode;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/fragment/game/question/Mode;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/android/fragment/game/question/Mode;->$VALUES:[Lcom/ibotta/android/fragment/game/question/Mode;

    invoke-virtual {v0}, [Lcom/ibotta/android/fragment/game/question/Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/fragment/game/question/Mode;

    return-object v0
.end method
