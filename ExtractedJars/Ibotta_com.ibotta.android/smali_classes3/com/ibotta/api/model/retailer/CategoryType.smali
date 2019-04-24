.class public final enum Lcom/ibotta/api/model/retailer/CategoryType;
.super Ljava/lang/Enum;
.source "CategoryType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/retailer/CategoryType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/retailer/CategoryType;

.field public static final enum HOT:Lcom/ibotta/api/model/retailer/CategoryType;

.field public static final enum NORMAL:Lcom/ibotta/api/model/retailer/CategoryType;

.field public static final enum SEASONAL:Lcom/ibotta/api/model/retailer/CategoryType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 7
    new-instance v0, Lcom/ibotta/api/model/retailer/CategoryType;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/retailer/CategoryType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->NORMAL:Lcom/ibotta/api/model/retailer/CategoryType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/retailer/CategoryType;

    const-string v1, "HOT"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/retailer/CategoryType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->HOT:Lcom/ibotta/api/model/retailer/CategoryType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/retailer/CategoryType;

    const-string v1, "SEASONAL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/retailer/CategoryType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->SEASONAL:Lcom/ibotta/api/model/retailer/CategoryType;

    const/4 v0, 0x3

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/retailer/CategoryType;

    sget-object v1, Lcom/ibotta/api/model/retailer/CategoryType;->NORMAL:Lcom/ibotta/api/model/retailer/CategoryType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/retailer/CategoryType;->HOT:Lcom/ibotta/api/model/retailer/CategoryType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/retailer/CategoryType;->SEASONAL:Lcom/ibotta/api/model/retailer/CategoryType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->$VALUES:[Lcom/ibotta/api/model/retailer/CategoryType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;
    .locals 0

    .line 14
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/model/retailer/CategoryType;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_0

    .line 20
    sget-object p0, Lcom/ibotta/api/model/retailer/CategoryType;->NORMAL:Lcom/ibotta/api/model/retailer/CategoryType;

    :cond_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/retailer/CategoryType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/retailer/CategoryType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/retailer/CategoryType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/retailer/CategoryType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/retailer/CategoryType;->$VALUES:[Lcom/ibotta/api/model/retailer/CategoryType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/retailer/CategoryType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/retailer/CategoryType;

    return-object v0
.end method
