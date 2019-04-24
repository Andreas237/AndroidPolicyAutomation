.class final enum Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;
.super Ljava/lang/Enum;
.source "EmailVerificationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EmailVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "EmailVerifyStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

.field public static final enum DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

.field public static final enum RESEND:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

.field public static final enum SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 44
    new-instance v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    .line 45
    new-instance v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    const-string v1, "DISMISS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    .line 46
    new-instance v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    const-string v1, "RESEND"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->RESEND:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    const/4 v0, 0x3

    .line 43
    new-array v0, v0, [Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->RESEND:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->$VALUES:[Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;
    .locals 1

    .line 43
    const-class v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;
    .locals 1

    .line 43
    sget-object v0, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->$VALUES:[Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    return-object v0
.end method
