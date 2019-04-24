.class public final enum Lcom/microblink/AmazonException;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/AmazonException;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/AmazonException;

.field public static final enum INVALID_EMAIL:Lcom/microblink/AmazonException;

.field public static final enum INVALID_PASSWORD:Lcom/microblink/AmazonException;

.field public static final enum LOGIN_TIMEOUT:Lcom/microblink/AmazonException;

.field public static final enum NONE:Lcom/microblink/AmazonException;

.field public static final enum NO_CREDENTIALS:Lcom/microblink/AmazonException;

.field public static final enum PARSING:Lcom/microblink/AmazonException;

.field public static final enum VERIFICATION_NEEDED:Lcom/microblink/AmazonException;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->NONE:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "VERIFICATION_NEEDED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->VERIFICATION_NEEDED:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "PARSING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->PARSING:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "INVALID_PASSWORD"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->INVALID_PASSWORD:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "INVALID_EMAIL"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->INVALID_EMAIL:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "NO_CREDENTIALS"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->NO_CREDENTIALS:Lcom/microblink/AmazonException;

    new-instance v0, Lcom/microblink/AmazonException;

    const-string v1, "LOGIN_TIMEOUT"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/microblink/AmazonException;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/AmazonException;->LOGIN_TIMEOUT:Lcom/microblink/AmazonException;

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/microblink/AmazonException;

    sget-object v1, Lcom/microblink/AmazonException;->NONE:Lcom/microblink/AmazonException;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/AmazonException;->VERIFICATION_NEEDED:Lcom/microblink/AmazonException;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/AmazonException;->PARSING:Lcom/microblink/AmazonException;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/AmazonException;->INVALID_PASSWORD:Lcom/microblink/AmazonException;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/AmazonException;->INVALID_EMAIL:Lcom/microblink/AmazonException;

    aput-object v1, v0, v6

    sget-object v1, Lcom/microblink/AmazonException;->NO_CREDENTIALS:Lcom/microblink/AmazonException;

    aput-object v1, v0, v7

    sget-object v1, Lcom/microblink/AmazonException;->LOGIN_TIMEOUT:Lcom/microblink/AmazonException;

    aput-object v1, v0, v8

    sput-object v0, Lcom/microblink/AmazonException;->$VALUES:[Lcom/microblink/AmazonException;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/AmazonException;
    .locals 1

    const-class v0, Lcom/microblink/AmazonException;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/AmazonException;

    return-object p0
.end method

.method public static values()[Lcom/microblink/AmazonException;
    .locals 1

    sget-object v0, Lcom/microblink/AmazonException;->$VALUES:[Lcom/microblink/AmazonException;

    invoke-virtual {v0}, [Lcom/microblink/AmazonException;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/AmazonException;

    return-object v0
.end method
