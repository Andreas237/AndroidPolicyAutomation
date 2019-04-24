.class public final enum Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;
.super Ljava/lang/Enum;
.source "OAuthFlow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

.field public static final enum accessCode:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

.field public static final enum application:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

.field public static final enum implicit:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

.field public static final enum password:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 17
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    const-string v1, "accessCode"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->accessCode:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    new-instance v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    const-string v1, "implicit"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->implicit:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    new-instance v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    const-string v1, "password"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->password:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    new-instance v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    const-string v1, "application"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->application:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    const/4 v0, 0x4

    .line 16
    new-array v0, v0, [Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    sget-object v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->accessCode:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->implicit:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->password:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->application:Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    aput-object v1, v0, v5

    sput-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->$VALUES:[Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;
    .locals 1

    .line 16
    const-class v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->$VALUES:[Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    invoke-virtual {v0}, [Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/tracking/generated/invoker/auth/OAuthFlow;

    return-object v0
.end method
