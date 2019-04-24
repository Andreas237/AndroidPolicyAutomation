.class public final enum Lcom/ibotta/api/model/search/SearchType;
.super Ljava/lang/Enum;
.source "SearchType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/model/search/SearchType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/model/search/SearchType;

.field public static final enum MARKETING:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum MISSPELLING_EXACT:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum MISSPELLING_MEDIUM:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum MISSPELLING_STRONG:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum MISSPELLING_WEAK:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum OFFER_TAG:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum RECENT:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum SCANNED:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum SUGGESTED:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum TYPED:Lcom/ibotta/api/model/search/SearchType;

.field public static final enum TYPE_AHEAD:Lcom/ibotta/api/model/search/SearchType;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 7
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "TYPED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->TYPED:Lcom/ibotta/api/model/search/SearchType;

    .line 8
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "SCANNED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->SCANNED:Lcom/ibotta/api/model/search/SearchType;

    .line 9
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "RECENT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->RECENT:Lcom/ibotta/api/model/search/SearchType;

    .line 10
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "TYPE_AHEAD"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->TYPE_AHEAD:Lcom/ibotta/api/model/search/SearchType;

    .line 11
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "MARKETING"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->MARKETING:Lcom/ibotta/api/model/search/SearchType;

    .line 12
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "OFFER_TAG"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->OFFER_TAG:Lcom/ibotta/api/model/search/SearchType;

    .line 13
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "SUGGESTED"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->SUGGESTED:Lcom/ibotta/api/model/search/SearchType;

    .line 14
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "MISSPELLING_EXACT"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_EXACT:Lcom/ibotta/api/model/search/SearchType;

    .line 15
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "MISSPELLING_STRONG"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_STRONG:Lcom/ibotta/api/model/search/SearchType;

    .line 16
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "MISSPELLING_MEDIUM"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_MEDIUM:Lcom/ibotta/api/model/search/SearchType;

    .line 17
    new-instance v0, Lcom/ibotta/api/model/search/SearchType;

    const-string v1, "MISSPELLING_WEAK"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/ibotta/api/model/search/SearchType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_WEAK:Lcom/ibotta/api/model/search/SearchType;

    const/16 v0, 0xb

    .line 6
    new-array v0, v0, [Lcom/ibotta/api/model/search/SearchType;

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->TYPED:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->SCANNED:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->RECENT:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->TYPE_AHEAD:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->MARKETING:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->OFFER_TAG:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->SUGGESTED:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_EXACT:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_STRONG:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_MEDIUM:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_WEAK:Lcom/ibotta/api/model/search/SearchType;

    aput-object v1, v0, v12

    sput-object v0, Lcom/ibotta/api/model/search/SearchType;->$VALUES:[Lcom/ibotta/api/model/search/SearchType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchType;
    .locals 1

    .line 6
    const-class v0, Lcom/ibotta/api/model/search/SearchType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/model/search/SearchType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/model/search/SearchType;
    .locals 1

    .line 6
    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->$VALUES:[Lcom/ibotta/api/model/search/SearchType;

    invoke-virtual {v0}, [Lcom/ibotta/api/model/search/SearchType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/model/search/SearchType;

    return-object v0
.end method
