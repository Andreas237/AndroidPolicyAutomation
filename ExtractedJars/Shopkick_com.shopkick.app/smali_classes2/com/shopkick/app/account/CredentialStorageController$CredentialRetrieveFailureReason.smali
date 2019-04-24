.class public final enum Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;
.super Ljava/lang/Enum;
.source "CredentialStorageController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/CredentialStorageController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CredentialRetrieveFailureReason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

.field public static final enum ERROR_RETRIEVING:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

.field public static final enum NO_CREDENTIAL:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

.field public static final enum SYSTEM_CANCELLED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

.field public static final enum USER_DECLINED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 27
    new-instance v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    const-string v1, "NO_CREDENTIAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 28
    new-instance v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    const-string v1, "ERROR_RETRIEVING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 29
    new-instance v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    const-string v1, "USER_DECLINED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    .line 30
    new-instance v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    const-string v1, "SYSTEM_CANCELLED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    const/4 v0, 0x4

    .line 26
    new-array v0, v0, [Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    sget-object v1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->$VALUES:[Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;
    .locals 1

    .line 26
    const-class v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;
    .locals 1

    .line 26
    sget-object v0, Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->$VALUES:[Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/CredentialStorageController$CredentialRetrieveFailureReason;

    return-object v0
.end method
