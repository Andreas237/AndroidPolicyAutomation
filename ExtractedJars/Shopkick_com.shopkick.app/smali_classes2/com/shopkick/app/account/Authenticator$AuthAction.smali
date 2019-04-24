.class public final enum Lcom/shopkick/app/account/Authenticator$AuthAction;
.super Ljava/lang/Enum;
.source "Authenticator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/Authenticator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AuthAction"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/account/Authenticator$AuthAction;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/account/Authenticator$AuthAction;

.field public static final enum CONNECT:Lcom/shopkick/app/account/Authenticator$AuthAction;

.field public static final enum LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

.field public static final enum REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 60
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthAction;

    const-string v1, "REGISTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/account/Authenticator$AuthAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 61
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthAction;

    const-string v1, "LOGIN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/account/Authenticator$AuthAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 62
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthAction;

    const-string v1, "CONNECT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/app/account/Authenticator$AuthAction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->CONNECT:Lcom/shopkick/app/account/Authenticator$AuthAction;

    const/4 v0, 0x3

    .line 59
    new-array v0, v0, [Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->REGISTER:Lcom/shopkick/app/account/Authenticator$AuthAction;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthAction;->CONNECT:Lcom/shopkick/app/account/Authenticator$AuthAction;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->$VALUES:[Lcom/shopkick/app/account/Authenticator$AuthAction;

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

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/account/Authenticator$AuthAction;
    .locals 1

    .line 59
    const-class v0, Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/account/Authenticator$AuthAction;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/account/Authenticator$AuthAction;
    .locals 1

    .line 59
    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->$VALUES:[Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0}, [Lcom/shopkick/app/account/Authenticator$AuthAction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/account/Authenticator$AuthAction;

    return-object v0
.end method
