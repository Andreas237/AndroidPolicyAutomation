.class public final enum Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;
.super Ljava/lang/Enum;
.source "GoogleSmartLockController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/GoogleSmartLockController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "GoogleSmartLockRetrieveCredentialFailureReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

.field public static final enum CONNECTION_TIMED_OUT:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

.field public static final enum ERROR_RETRIEVING:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

.field public static final enum NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

.field public static final enum SYSTEM_CANCELLED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

.field public static final enum USER_DECLINED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 60
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const-string v1, "CONNECTION_TIMED_OUT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->CONNECTION_TIMED_OUT:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    .line 61
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const-string v1, "NO_CREDENTIAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    .line 62
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const-string v1, "ERROR_RETRIEVING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    .line 63
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const-string v1, "USER_DECLINED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    .line 64
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const-string v1, "SYSTEM_CANCELLED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    const/4 v0, 0x5

    .line 59
    new-array v0, v0, [Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->CONNECTION_TIMED_OUT:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->$VALUES:[Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;
    .locals 1

    .line 59
    const-class v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;
    .locals 1

    .line 59
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->$VALUES:[Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    return-object v0
.end method
