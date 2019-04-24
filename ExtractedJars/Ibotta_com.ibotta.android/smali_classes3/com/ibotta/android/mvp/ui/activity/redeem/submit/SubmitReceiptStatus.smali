.class public final enum Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;
.super Ljava/lang/Enum;
.source "SubmitReceiptStatus.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

.field public static final enum FAILED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

.field public static final enum SUBMITTED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

.field public static final enum SUBMITTING:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

.field public static final enum SUCCESS:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

.field public static final enum UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 8
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    .line 9
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const-string v1, "SUBMITTING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTING:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    .line 10
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const-string v1, "SUBMITTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    .line 11
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const-string v1, "SUCCESS"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUCCESS:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    .line 12
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const-string v1, "FAILED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->FAILED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    const/4 v0, 0x5

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTING:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUCCESS:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->FAILED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

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

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;
    .locals 1

    .line 15
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    .line 18
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->$VALUES:[Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {v0}, [Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    return-object v0
.end method
