.class public abstract enum Lcom/google/dexmaker/Comparison;
.super Ljava/lang/Enum;
.source "Comparison.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/Comparison;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/Comparison;

.field public static final enum EQ:Lcom/google/dexmaker/Comparison;

.field public static final enum GE:Lcom/google/dexmaker/Comparison;

.field public static final enum GT:Lcom/google/dexmaker/Comparison;

.field public static final enum LE:Lcom/google/dexmaker/Comparison;

.field public static final enum LT:Lcom/google/dexmaker/Comparison;

.field public static final enum NE:Lcom/google/dexmaker/Comparison;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 29
    new-instance v0, Lcom/google/dexmaker/Comparison$1;

    const-string v1, "LT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/dexmaker/Comparison$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->LT:Lcom/google/dexmaker/Comparison;

    .line 36
    new-instance v0, Lcom/google/dexmaker/Comparison$2;

    const-string v1, "LE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/dexmaker/Comparison$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->LE:Lcom/google/dexmaker/Comparison;

    .line 43
    new-instance v0, Lcom/google/dexmaker/Comparison$3;

    const-string v1, "EQ"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/dexmaker/Comparison$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->EQ:Lcom/google/dexmaker/Comparison;

    .line 50
    new-instance v0, Lcom/google/dexmaker/Comparison$4;

    const-string v1, "GE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/google/dexmaker/Comparison$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->GE:Lcom/google/dexmaker/Comparison;

    .line 57
    new-instance v0, Lcom/google/dexmaker/Comparison$5;

    const-string v1, "GT"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/google/dexmaker/Comparison$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->GT:Lcom/google/dexmaker/Comparison;

    .line 64
    new-instance v0, Lcom/google/dexmaker/Comparison$6;

    const-string v1, "NE"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/google/dexmaker/Comparison$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/dexmaker/Comparison;->NE:Lcom/google/dexmaker/Comparison;

    const/4 v0, 0x6

    .line 26
    new-array v0, v0, [Lcom/google/dexmaker/Comparison;

    sget-object v1, Lcom/google/dexmaker/Comparison;->LT:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/Comparison;->LE:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/Comparison;->EQ:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/Comparison;->GE:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/Comparison;->GT:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/dexmaker/Comparison;->NE:Lcom/google/dexmaker/Comparison;

    aput-object v1, v0, v7

    sput-object v0, Lcom/google/dexmaker/Comparison;->$VALUES:[Lcom/google/dexmaker/Comparison;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/dexmaker/Comparison$1;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/Comparison;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/Comparison;
    .locals 1

    .line 26
    const-class v0, Lcom/google/dexmaker/Comparison;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/Comparison;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/Comparison;
    .locals 1

    .line 26
    sget-object v0, Lcom/google/dexmaker/Comparison;->$VALUES:[Lcom/google/dexmaker/Comparison;

    invoke-virtual {v0}, [Lcom/google/dexmaker/Comparison;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/Comparison;

    return-object v0
.end method


# virtual methods
.method abstract rop(Lcom/google/dexmaker/dx/rop/type/TypeList;)Lcom/google/dexmaker/dx/rop/code/Rop;
.end method
