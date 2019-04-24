.class public final enum Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;
.super Ljava/lang/Enum;
.source "SKDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/dialog/SKDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SKDialogType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field public static final enum ACKNOWLEDGE:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field public static final enum BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field public static final enum COMPLEX:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field public static final enum CONFIRM_OR_DENY:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

.field public static final enum ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 71
    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const-string v1, "ERROR_DEVSETUP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    .line 72
    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const-string v1, "BUTTONLESS"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    .line 73
    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const-string v1, "ACKNOWLEDGE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ACKNOWLEDGE:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    .line 74
    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const-string v1, "CONFIRM_OR_DENY"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->CONFIRM_OR_DENY:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    .line 75
    new-instance v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const-string v1, "COMPLEX"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->COMPLEX:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    const/4 v0, 0x5

    .line 70
    new-array v0, v0, [Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ERROR_DEVSETUP:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->BUTTONLESS:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->ACKNOWLEDGE:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->CONFIRM_OR_DENY:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->COMPLEX:Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->$VALUES:[Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 70
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;
    .locals 1

    .line 70
    const-class v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;
    .locals 1

    .line 70
    sget-object v0, Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->$VALUES:[Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    invoke-virtual {v0}, [Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogType;

    return-object v0
.end method
