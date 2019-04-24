.class public final enum Lcom/ibotta/android/appcache/CacheMask;
.super Ljava/lang/Enum;
.source "CacheMask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/appcache/CacheMask;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum BONUSES:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum BUYABLE_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_ACCOUNTS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_EARNINGS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_FRIENDS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_INVITES:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_LOYALTIES:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum CUSTOMER_SETTINGS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum HOME:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum MODULES:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum OFFERS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum PENDING_NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum RETAILERS_PENDING:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum SOCIAL_OFFERS:Lcom/ibotta/android/appcache/CacheMask;

.field public static final enum STORES:Lcom/ibotta/android/appcache/CacheMask;


# instance fields
.field private final mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 4
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "HOME"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->HOME:Lcom/ibotta/android/appcache/CacheMask;

    .line 5
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "OFFERS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->OFFERS:Lcom/ibotta/android/appcache/CacheMask;

    .line 6
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "STORES"

    const/4 v5, 0x4

    invoke-direct {v0, v1, v4, v5}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->STORES:Lcom/ibotta/android/appcache/CacheMask;

    .line 7
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "RETAILERS_PENDING"

    const/4 v6, 0x3

    const/16 v7, 0x8

    invoke-direct {v0, v1, v6, v7}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->RETAILERS_PENDING:Lcom/ibotta/android/appcache/CacheMask;

    .line 8
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_ACCOUNTS"

    const/16 v8, 0x10

    invoke-direct {v0, v1, v5, v8}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_ACCOUNTS:Lcom/ibotta/android/appcache/CacheMask;

    .line 9
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_LOYALTIES"

    const/4 v9, 0x5

    const/16 v10, 0x20

    invoke-direct {v0, v1, v9, v10}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_LOYALTIES:Lcom/ibotta/android/appcache/CacheMask;

    .line 10
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_SETTINGS"

    const/4 v10, 0x6

    const/16 v11, 0x40

    invoke-direct {v0, v1, v10, v11}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_SETTINGS:Lcom/ibotta/android/appcache/CacheMask;

    .line 11
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "BONUSES"

    const/4 v11, 0x7

    const/16 v12, 0x80

    invoke-direct {v0, v1, v11, v12}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->BONUSES:Lcom/ibotta/android/appcache/CacheMask;

    .line 12
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_INVITES"

    const/16 v12, 0x100

    invoke-direct {v0, v1, v7, v12}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_INVITES:Lcom/ibotta/android/appcache/CacheMask;

    .line 13
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "GIFT_CARDS"

    const/16 v12, 0x9

    const/16 v13, 0x200

    invoke-direct {v0, v1, v12, v13}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    .line 14
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_GIFT_CARDS"

    const/16 v13, 0xa

    const/16 v14, 0x400

    invoke-direct {v0, v1, v13, v14}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    .line 15
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "NOTIFICATIONS"

    const/16 v14, 0xb

    const/16 v15, 0x800

    invoke-direct {v0, v1, v14, v15}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

    .line 16
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "PENDING_NOTIFICATIONS"

    const/16 v15, 0xc

    const/16 v14, 0x1000

    invoke-direct {v0, v1, v15, v14}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->PENDING_NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

    .line 17
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "SOCIAL_OFFERS"

    const/16 v14, 0xd

    const/16 v15, 0x2000

    invoke-direct {v0, v1, v14, v15}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->SOCIAL_OFFERS:Lcom/ibotta/android/appcache/CacheMask;

    .line 18
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER"

    const/16 v15, 0xe

    const/16 v14, 0x4000

    invoke-direct {v0, v1, v15, v14}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER:Lcom/ibotta/android/appcache/CacheMask;

    .line 19
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_FRIENDS"

    const/16 v14, 0xf

    const v15, 0x8000

    invoke-direct {v0, v1, v14, v15}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_FRIENDS:Lcom/ibotta/android/appcache/CacheMask;

    .line 20
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "CUSTOMER_EARNINGS"

    const/high16 v14, 0x10000

    invoke-direct {v0, v1, v8, v14}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_EARNINGS:Lcom/ibotta/android/appcache/CacheMask;

    .line 21
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "MODULES"

    const/16 v14, 0x11

    const/high16 v15, 0x20000

    invoke-direct {v0, v1, v14, v15}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->MODULES:Lcom/ibotta/android/appcache/CacheMask;

    .line 22
    new-instance v0, Lcom/ibotta/android/appcache/CacheMask;

    const-string v1, "BUYABLE_GIFT_CARDS"

    const/16 v14, 0x12

    const/high16 v15, 0x40000

    invoke-direct {v0, v1, v14, v15}, Lcom/ibotta/android/appcache/CacheMask;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->BUYABLE_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v0, 0x13

    .line 3
    new-array v0, v0, [Lcom/ibotta/android/appcache/CacheMask;

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->HOME:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->OFFERS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->STORES:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->RETAILERS_PENDING:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_ACCOUNTS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_LOYALTIES:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_SETTINGS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->BONUSES:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_INVITES:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->PENDING_NOTIFICATIONS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->SOCIAL_OFFERS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_FRIENDS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->CUSTOMER_EARNINGS:Lcom/ibotta/android/appcache/CacheMask;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->MODULES:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/appcache/CacheMask;->BUYABLE_GIFT_CARDS:Lcom/ibotta/android/appcache/CacheMask;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/appcache/CacheMask;->$VALUES:[Lcom/ibotta/android/appcache/CacheMask;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    iput p3, p0, Lcom/ibotta/android/appcache/CacheMask;->mask:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/appcache/CacheMask;
    .locals 1

    .line 3
    const-class v0, Lcom/ibotta/android/appcache/CacheMask;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/appcache/CacheMask;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/appcache/CacheMask;
    .locals 1

    .line 3
    sget-object v0, Lcom/ibotta/android/appcache/CacheMask;->$VALUES:[Lcom/ibotta/android/appcache/CacheMask;

    invoke-virtual {v0}, [Lcom/ibotta/android/appcache/CacheMask;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/appcache/CacheMask;

    return-object v0
.end method


# virtual methods
.method public isFlagOn(I)Z
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/appcache/CacheMask;->mask:I

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
