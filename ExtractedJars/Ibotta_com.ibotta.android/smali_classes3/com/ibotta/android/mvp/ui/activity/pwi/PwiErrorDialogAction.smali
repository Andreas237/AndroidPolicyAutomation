.class public final enum Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;
.super Ljava/lang/Enum;
.source "PwiErrorDialogAction.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

.field public static final enum DECLINED_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

.field public static final enum GENERIC_ERROR:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

.field public static final enum INSUFFICIENT_BALANCE:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

.field public static final enum TRY_AGAIN:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

.field public static final enum TRY_NEW_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const-string v1, "INSUFFICIENT_BALANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->INSUFFICIENT_BALANCE:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const-string v1, "DECLINED_CARD"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->DECLINED_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const-string v1, "GENERIC_ERROR"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->GENERIC_ERROR:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    .line 13
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const-string v1, "TRY_AGAIN"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->TRY_AGAIN:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    .line 14
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const-string v1, "TRY_NEW_CARD"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->TRY_NEW_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    const/4 v0, 0x5

    .line 9
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->INSUFFICIENT_BALANCE:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->DECLINED_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->GENERIC_ERROR:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->TRY_AGAIN:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->TRY_NEW_CARD:Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;
    .locals 1

    .line 9
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;
    .locals 1

    .line 9
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorDialogAction;

    return-object v0
.end method
