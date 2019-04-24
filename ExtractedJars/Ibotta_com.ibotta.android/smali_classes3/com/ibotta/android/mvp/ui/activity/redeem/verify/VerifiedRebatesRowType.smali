.class public final enum Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;
.super Ljava/lang/Enum;
.source "VerifiedRebatesRowType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

.field public static final enum ADD_REBATES:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

.field public static final enum REBATE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

.field public static final enum TITLE_BAR:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    const-string v1, "ADD_REBATES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->ADD_REBATES:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    const-string v1, "TITLE_BAR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    const-string v1, "REBATE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->REBATE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    const/4 v0, 0x3

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->ADD_REBATES:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->TITLE_BAR:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->REBATE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    return-object v0
.end method
