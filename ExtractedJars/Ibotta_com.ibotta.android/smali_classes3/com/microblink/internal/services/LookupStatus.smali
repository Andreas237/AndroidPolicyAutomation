.class public final enum Lcom/microblink/internal/services/LookupStatus;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/internal/services/LookupStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/internal/services/LookupStatus;

.field public static final enum COMPLETED:Lcom/microblink/internal/services/LookupStatus;

.field public static final enum FOUND:Lcom/microblink/internal/services/LookupStatus;

.field public static final enum NOT_FOUND:Lcom/microblink/internal/services/LookupStatus;

.field public static final enum PENDING:Lcom/microblink/internal/services/LookupStatus;

.field public static final enum UNKNOWN:Lcom/microblink/internal/services/LookupStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/microblink/internal/services/LookupStatus;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/LookupStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    new-instance v0, Lcom/microblink/internal/services/LookupStatus;

    const-string v1, "PENDING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/internal/services/LookupStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->PENDING:Lcom/microblink/internal/services/LookupStatus;

    new-instance v0, Lcom/microblink/internal/services/LookupStatus;

    const-string v1, "FOUND"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/internal/services/LookupStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->FOUND:Lcom/microblink/internal/services/LookupStatus;

    new-instance v0, Lcom/microblink/internal/services/LookupStatus;

    const-string v1, "NOT_FOUND"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/internal/services/LookupStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->NOT_FOUND:Lcom/microblink/internal/services/LookupStatus;

    new-instance v0, Lcom/microblink/internal/services/LookupStatus;

    const-string v1, "COMPLETED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/microblink/internal/services/LookupStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->COMPLETED:Lcom/microblink/internal/services/LookupStatus;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/microblink/internal/services/LookupStatus;

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->UNKNOWN:Lcom/microblink/internal/services/LookupStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->PENDING:Lcom/microblink/internal/services/LookupStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->FOUND:Lcom/microblink/internal/services/LookupStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->NOT_FOUND:Lcom/microblink/internal/services/LookupStatus;

    aput-object v1, v0, v5

    sget-object v1, Lcom/microblink/internal/services/LookupStatus;->COMPLETED:Lcom/microblink/internal/services/LookupStatus;

    aput-object v1, v0, v6

    sput-object v0, Lcom/microblink/internal/services/LookupStatus;->$VALUES:[Lcom/microblink/internal/services/LookupStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/internal/services/LookupStatus;
    .locals 1

    const-class v0, Lcom/microblink/internal/services/LookupStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/internal/services/LookupStatus;

    return-object p0
.end method

.method public static values()[Lcom/microblink/internal/services/LookupStatus;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/LookupStatus;->$VALUES:[Lcom/microblink/internal/services/LookupStatus;

    invoke-virtual {v0}, [Lcom/microblink/internal/services/LookupStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/internal/services/LookupStatus;

    return-object v0
.end method
