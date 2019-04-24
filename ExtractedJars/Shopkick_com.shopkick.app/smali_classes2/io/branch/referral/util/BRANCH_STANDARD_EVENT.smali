.class public final enum Lio/branch/referral/util/BRANCH_STANDARD_EVENT;
.super Ljava/lang/Enum;
.source "BRANCH_STANDARD_EVENT.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/util/BRANCH_STANDARD_EVENT;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum ACHIEVE_LEVEL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum ADD_PAYMENT_INFO:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum ADD_TO_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum ADD_TO_WISHLIST:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum COMPLETE_REGISTRATION:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum COMPLETE_TUTORIAL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum INITIATE_PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum RATE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum SEARCH:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum SHARE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum SPEND_CREDITS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum UNLOCK_ACHIEVEMENT:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum VIEW_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum VIEW_ITEM:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

.field public static final enum VIEW_ITEMS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 11
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "ADD_TO_CART"

    const-string v2, "ADD_TO_CART"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_TO_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 12
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "ADD_TO_WISHLIST"

    const-string v2, "ADD_TO_WISHLIST"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_TO_WISHLIST:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 13
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "VIEW_CART"

    const-string v2, "VIEW_CART"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 14
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "INITIATE_PURCHASE"

    const-string v2, "INITIATE_PURCHASE"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->INITIATE_PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 15
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "ADD_PAYMENT_INFO"

    const-string v2, "ADD_PAYMENT_INFO"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_PAYMENT_INFO:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 16
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "PURCHASE"

    const-string v2, "PURCHASE"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 17
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "SPEND_CREDITS"

    const-string v2, "SPEND_CREDITS"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SPEND_CREDITS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 20
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "SEARCH"

    const-string v2, "SEARCH"

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SEARCH:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 21
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "VIEW_ITEM"

    const-string v2, "VIEW_ITEM"

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_ITEM:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 22
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "VIEW_ITEMS"

    const-string v2, "VIEW_ITEMS"

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_ITEMS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 23
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "RATE"

    const-string v2, "RATE"

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->RATE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 24
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "SHARE"

    const-string v2, "SHARE"

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SHARE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 27
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "COMPLETE_REGISTRATION"

    const-string v2, "COMPLETE_REGISTRATION"

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->COMPLETE_REGISTRATION:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 28
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "COMPLETE_TUTORIAL"

    const-string v2, "COMPLETE_TUTORIAL"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->COMPLETE_TUTORIAL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 29
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "ACHIEVE_LEVEL"

    const-string v2, "ACHIEVE_LEVEL"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ACHIEVE_LEVEL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    .line 30
    new-instance v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const-string v1, "UNLOCK_ACHIEVEMENT"

    const-string v2, "UNLOCK_ACHIEVEMENT"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->UNLOCK_ACHIEVEMENT:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const/16 v0, 0x10

    .line 9
    new-array v0, v0, [Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_TO_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_TO_WISHLIST:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v4

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_CART:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v5

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->INITIATE_PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v6

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ADD_PAYMENT_INFO:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v7

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->PURCHASE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v8

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SPEND_CREDITS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v9

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SEARCH:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v10

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_ITEM:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v11

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->VIEW_ITEMS:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v12

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->RATE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v13

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->SHARE:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    aput-object v1, v0, v14

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->COMPLETE_REGISTRATION:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->COMPLETE_TUTORIAL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->ACHIEVE_LEVEL:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->UNLOCK_ACHIEVEMENT:Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sput-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->$VALUES:[Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

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

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 35
    iput-object p3, p0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->name:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/util/BRANCH_STANDARD_EVENT;
    .locals 1

    .line 9
    const-class v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/util/BRANCH_STANDARD_EVENT;
    .locals 1

    .line 9
    sget-object v0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->$VALUES:[Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    invoke-virtual {v0}, [Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/util/BRANCH_STANDARD_EVENT;

    return-object v0
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lio/branch/referral/util/BRANCH_STANDARD_EVENT;->name:Ljava/lang/String;

    return-object v0
.end method
