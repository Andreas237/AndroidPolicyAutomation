.class public final enum Lcom/microblink/internal/amazon/AmazonPage;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/internal/amazon/AmazonPage;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum ENTER_CODE:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum LOGIN:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum ORDER_DETAILS:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum UNKNOWN:Lcom/microblink/internal/amazon/AmazonPage;

.field public static final enum VERIFICATION_NEEDED:Lcom/microblink/internal/amazon/AmazonPage;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->UNKNOWN:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "ORDER_HISTORY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "PRODUCT"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "LOGIN"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->LOGIN:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "VERIFICATION_NEEDED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->VERIFICATION_NEEDED:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "ENTER_CODE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ENTER_CODE:Lcom/microblink/internal/amazon/AmazonPage;

    new-instance v0, Lcom/microblink/internal/amazon/AmazonPage;

    const-string v1, "ORDER_DETAILS"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/microblink/internal/amazon/AmazonPage;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_DETAILS:Lcom/microblink/internal/amazon/AmazonPage;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/microblink/internal/amazon/AmazonPage;

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->UNKNOWN:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->LOGIN:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->VERIFICATION_NEEDED:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->ENTER_CODE:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v7

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_DETAILS:Lcom/microblink/internal/amazon/AmazonPage;

    aput-object v1, v0, v8

    sput-object v0, Lcom/microblink/internal/amazon/AmazonPage;->$VALUES:[Lcom/microblink/internal/amazon/AmazonPage;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/internal/amazon/AmazonPage;
    .locals 1

    const-class v0, Lcom/microblink/internal/amazon/AmazonPage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/internal/amazon/AmazonPage;

    return-object p0
.end method

.method public static values()[Lcom/microblink/internal/amazon/AmazonPage;
    .locals 1

    sget-object v0, Lcom/microblink/internal/amazon/AmazonPage;->$VALUES:[Lcom/microblink/internal/amazon/AmazonPage;

    invoke-virtual {v0}, [Lcom/microblink/internal/amazon/AmazonPage;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/internal/amazon/AmazonPage;

    return-object v0
.end method
