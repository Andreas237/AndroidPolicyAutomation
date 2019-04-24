.class public final enum Lcom/microblink/internal/Priority;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/internal/Priority;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/internal/Priority;

.field public static final enum HIGH:Lcom/microblink/internal/Priority;

.field public static final enum IMMEDIATE:Lcom/microblink/internal/Priority;

.field public static final enum LOW:Lcom/microblink/internal/Priority;

.field public static final enum MEDIUM:Lcom/microblink/internal/Priority;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/microblink/internal/Priority;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Priority;->LOW:Lcom/microblink/internal/Priority;

    new-instance v0, Lcom/microblink/internal/Priority;

    const-string v1, "MEDIUM"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/internal/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Priority;->MEDIUM:Lcom/microblink/internal/Priority;

    new-instance v0, Lcom/microblink/internal/Priority;

    const-string v1, "HIGH"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/internal/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Priority;->HIGH:Lcom/microblink/internal/Priority;

    new-instance v0, Lcom/microblink/internal/Priority;

    const-string v1, "IMMEDIATE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/internal/Priority;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Priority;->IMMEDIATE:Lcom/microblink/internal/Priority;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/microblink/internal/Priority;

    sget-object v1, Lcom/microblink/internal/Priority;->LOW:Lcom/microblink/internal/Priority;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/internal/Priority;->MEDIUM:Lcom/microblink/internal/Priority;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/internal/Priority;->HIGH:Lcom/microblink/internal/Priority;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/internal/Priority;->IMMEDIATE:Lcom/microblink/internal/Priority;

    aput-object v1, v0, v5

    sput-object v0, Lcom/microblink/internal/Priority;->$VALUES:[Lcom/microblink/internal/Priority;

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

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/internal/Priority;
    .locals 1

    const-class v0, Lcom/microblink/internal/Priority;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/internal/Priority;

    return-object p0
.end method

.method public static values()[Lcom/microblink/internal/Priority;
    .locals 1

    sget-object v0, Lcom/microblink/internal/Priority;->$VALUES:[Lcom/microblink/internal/Priority;

    invoke-virtual {v0}, [Lcom/microblink/internal/Priority;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/internal/Priority;

    return-object v0
.end method
