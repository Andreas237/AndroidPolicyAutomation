.class final enum Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;
.super Ljava/lang/Enum;
.source "GoogleSignInController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/registration/GoogleSignInController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "GoogleSignInStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

.field public static final enum CANCELED:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

.field public static final enum FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

.field public static final enum SUCCESS:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 53
    new-instance v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->SUCCESS:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    .line 54
    new-instance v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const-string v1, "FAILURE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    .line 55
    new-instance v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const-string v1, "CANCELED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->CANCELED:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const/4 v0, 0x3

    .line 52
    new-array v0, v0, [Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    sget-object v1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->SUCCESS:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->CANCELED:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->$VALUES:[Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 52
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;
    .locals 1

    .line 52
    const-class v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;
    .locals 1

    .line 52
    sget-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->$VALUES:[Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-virtual {v0}, [Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    return-object v0
.end method
