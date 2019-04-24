.class synthetic Lcom/shopkick/app/account/EmailVerificationController$1;
.super Ljava/lang/Object;
.source "EmailVerificationController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/EmailVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

.field static final synthetic $SwitchMap$com$shopkick$app$account$EmailVerificationController$ModalButtonAction:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 218
    invoke-static {}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->values()[Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$ModalButtonAction:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$ModalButtonAction:[I

    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    invoke-virtual {v2}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v1, 0x2

    :try_start_1
    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$ModalButtonAction:[I

    sget-object v3, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->SEND_EMAIL:Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;

    invoke-virtual {v3}, Lcom/shopkick/app/account/EmailVerificationController$ModalButtonAction;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 156
    :catch_1
    invoke-static {}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->values()[Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

    :try_start_2
    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

    sget-object v3, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->SUCCESS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-virtual {v3}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

    sget-object v2, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->DISMISS:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-virtual {v2}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/shopkick/app/account/EmailVerificationController$1;->$SwitchMap$com$shopkick$app$account$EmailVerificationController$EmailVerifyStatus:[I

    sget-object v1, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->RESEND:Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;

    invoke-virtual {v1}, Lcom/shopkick/app/account/EmailVerificationController$EmailVerifyStatus;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-void
.end method
