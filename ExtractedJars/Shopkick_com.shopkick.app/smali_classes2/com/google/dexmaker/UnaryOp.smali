.class public abstract enum Lcom/google/dexmaker/UnaryOp;
.super Ljava/lang/Enum;
.source "UnaryOp.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/UnaryOp;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/UnaryOp;

.field public static final enum NEGATE:Lcom/google/dexmaker/UnaryOp;

.field public static final enum NOT:Lcom/google/dexmaker/UnaryOp;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 28
    new-instance v0, Lcom/google/dexmaker/UnaryOp$1;

    const-string v1, "NOT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/UnaryOp$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/UnaryOp;->NOT:Lcom/google/dexmaker/UnaryOp;

    .line 35
    new-instance v0, Lcom/google/dexmaker/UnaryOp$2;

    const-string v1, "NEGATE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/UnaryOp$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/UnaryOp;->NEGATE:Lcom/google/dexmaker/UnaryOp;

    const/4 v0, 0x2

    .line 25
    new-array v0, v0, [Lcom/google/dexmaker/UnaryOp;

    sget-object v1, Lcom/google/dexmaker/UnaryOp;->NOT:Lcom/google/dexmaker/UnaryOp;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/UnaryOp;->NEGATE:Lcom/google/dexmaker/UnaryOp;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/dexmaker/UnaryOp;->$VALUES:[Lcom/google/dexmaker/UnaryOp;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/dexmaker/UnaryOp$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/UnaryOp;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/UnaryOp;
    .locals 1

    .line 25
    const-class v0, Lcom/google/dexmaker/UnaryOp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/UnaryOp;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/UnaryOp;
    .locals 1

    .line 25
    sget-object v0, Lcom/google/dexmaker/UnaryOp;->$VALUES:[Lcom/google/dexmaker/UnaryOp;

    invoke-virtual {v0}, [Lcom/google/dexmaker/UnaryOp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/UnaryOp;

    return-object v0
.end method


# virtual methods
.method abstract rop(Lcom/google/dexmaker/TypeId;)Lcom/google/dexmaker/dx/rop/code/Rop;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "*>;)",
            "Lcom/google/dexmaker/dx/rop/code/Rop;"
        }
    .end annotation
.end method
