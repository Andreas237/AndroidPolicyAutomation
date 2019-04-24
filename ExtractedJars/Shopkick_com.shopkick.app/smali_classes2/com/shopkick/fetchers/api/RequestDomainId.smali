.class public final enum Lcom/shopkick/fetchers/api/RequestDomainId;
.super Ljava/lang/Enum;
.source "RequestDomainId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/fetchers/api/RequestDomainId;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/fetchers/api/RequestDomainId;

.field public static final enum SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

.field public static final enum SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;


# instance fields
.field public final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 8
    new-instance v0, Lcom/shopkick/fetchers/api/RequestDomainId;

    const-string v1, "SHOPKICK_APP"

    const-string/jumbo v2, "shopkick_app"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/shopkick/fetchers/api/RequestDomainId;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    .line 9
    new-instance v0, Lcom/shopkick/fetchers/api/RequestDomainId;

    const-string v1, "SHOPKICK_SDK"

    const-string/jumbo v2, "shopkick_sdk"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/shopkick/fetchers/api/RequestDomainId;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    aput-object v1, v0, v4

    sput-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->$VALUES:[Lcom/shopkick/fetchers/api/RequestDomainId;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 13
    iput-object p3, p0, Lcom/shopkick/fetchers/api/RequestDomainId;->name:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/fetchers/api/RequestDomainId;
    .locals 1

    .line 7
    const-class v0, Lcom/shopkick/fetchers/api/RequestDomainId;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/fetchers/api/RequestDomainId;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/fetchers/api/RequestDomainId;
    .locals 1

    .line 7
    sget-object v0, Lcom/shopkick/fetchers/api/RequestDomainId;->$VALUES:[Lcom/shopkick/fetchers/api/RequestDomainId;

    invoke-virtual {v0}, [Lcom/shopkick/fetchers/api/RequestDomainId;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/fetchers/api/RequestDomainId;

    return-object v0
.end method
