.class public final enum Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;
.super Ljava/lang/Enum;
.source "AddRebatesState.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

.field public static final enum ALL_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

.field public static final enum NONE_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

.field public static final enum SOME_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    const-string v1, "NONE_VERIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->NONE_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    const-string v1, "SOME_VERIFIED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->SOME_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    const-string v1, "ALL_VERIFIED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->ALL_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->NONE_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->SOME_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->ALL_VERIFIED:Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->$VALUES:[Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/view/redeem/AddRebatesState;

    return-object v0
.end method
