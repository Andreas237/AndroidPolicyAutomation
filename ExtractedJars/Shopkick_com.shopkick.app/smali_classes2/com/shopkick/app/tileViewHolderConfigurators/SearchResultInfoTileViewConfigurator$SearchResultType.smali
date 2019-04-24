.class public final enum Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;
.super Ljava/lang/Enum;
.source "SearchResultInfoTileViewConfigurator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SearchResultType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;",
        "",
        "(Ljava/lang/String;I)V",
        "PARTIAL_SEARCH_RESULTS",
        "NO_SEARCH_RESULTS",
        "NO_LOCATION_PERMISSION",
        "SUGGESTED_TILES",
        "SEARCHING",
        "SUCCESS",
        "UNKNOWN",
        "Shopkick_defaultFlavorRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum NO_LOCATION_PERMISSION:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum NO_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum PARTIAL_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum SEARCHING:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum SUCCESS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum SUGGESTED_TILES:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

.field public static final enum UNKNOWN:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "PARTIAL_SEARCH_RESULTS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->PARTIAL_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "NO_SEARCH_RESULTS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->NO_SEARCH_RESULTS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "NO_LOCATION_PERMISSION"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->NO_LOCATION_PERMISSION:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "SUGGESTED_TILES"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SUGGESTED_TILES:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "SEARCHING"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SEARCHING:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "SUCCESS"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->SUCCESS:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    const-string v2, "UNKNOWN"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->UNKNOWN:Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;
    .locals 1

    const-class v0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;
    .locals 1

    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->$VALUES:[Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    invoke-virtual {v0}, [Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/app/tileViewHolderConfigurators/SearchResultInfoTileViewConfigurator$SearchResultType;

    return-object v0
.end method
