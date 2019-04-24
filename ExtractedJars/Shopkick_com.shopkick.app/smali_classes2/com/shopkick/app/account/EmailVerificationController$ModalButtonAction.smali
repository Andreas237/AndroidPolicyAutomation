.class final enum Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;
.super Ljava/lang/Enum;
.source "EmailVerificationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EmailVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ModalButtonAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

.field public static final enum DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

.field public static final enum SEND_EMAIL:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 50
    new-instance v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    const-string v1, "DISMISS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    .line 51
    new-instance v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    const-string v1, "SEND_EMAIL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->SEND_EMAIL:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    const/4 v0, 0x2

    .line 49
    new-array v0, v0, [Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->SEND_EMAIL:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->$VALUES:[Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;
    .locals 1

    .line 49
    const-class v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;
    .locals 1

    .line 49
    sget-object v0, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->$VALUES:[Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    return-object v0
.end method
