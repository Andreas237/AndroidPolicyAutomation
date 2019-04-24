.class public final enum Lcom/shopkick/logging/Level;
.super Ljava/lang/Enum;
.source "Level.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/logging/Level;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/logging/Level;

.field public static final enum DEBUG:Lcom/shopkick/logging/Level;

.field public static final enum ERROR:Lcom/shopkick/logging/Level;

.field public static final enum INFO:Lcom/shopkick/logging/Level;

.field public static final enum VERBOSE:Lcom/shopkick/logging/Level;

.field public static final enum WARN:Lcom/shopkick/logging/Level;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 7
    new-instance v0, Lcom/shopkick/logging/Level;

    const-string v1, "ERROR"

    const/4 v2, 0x0

    const/16 v3, 0x64

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/logging/Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    .line 9
    new-instance v0, Lcom/shopkick/logging/Level;

    const-string v1, "WARN"

    const/4 v3, 0x1

    const/16 v4, 0xc8

    invoke-direct {v0, v1, v3, v4}, Lcom/shopkick/logging/Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    .line 11
    new-instance v0, Lcom/shopkick/logging/Level;

    const-string v1, "INFO"

    const/4 v4, 0x2

    const/16 v5, 0x12c

    invoke-direct {v0, v1, v4, v5}, Lcom/shopkick/logging/Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    .line 13
    new-instance v0, Lcom/shopkick/logging/Level;

    const-string v1, "DEBUG"

    const/4 v5, 0x3

    const/16 v6, 0x190

    invoke-direct {v0, v1, v5, v6}, Lcom/shopkick/logging/Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    .line 15
    new-instance v0, Lcom/shopkick/logging/Level;

    const-string v1, "VERBOSE"

    const/4 v6, 0x4

    const/16 v7, 0x1f4

    invoke-direct {v0, v1, v6, v7}, Lcom/shopkick/logging/Level;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    const/4 v0, 0x5

    .line 4
    new-array v0, v0, [Lcom/shopkick/logging/Level;

    sget-object v1, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    aput-object v1, v0, v6

    sput-object v0, Lcom/shopkick/logging/Level;->$VALUES:[Lcom/shopkick/logging/Level;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/shopkick/logging/Level;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/logging/Level;
    .locals 1

    .line 4
    const-class v0, Lcom/shopkick/logging/Level;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/logging/Level;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/logging/Level;
    .locals 1

    .line 4
    sget-object v0, Lcom/shopkick/logging/Level;->$VALUES:[Lcom/shopkick/logging/Level;

    invoke-virtual {v0}, [Lcom/shopkick/logging/Level;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/logging/Level;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/shopkick/logging/Level;->value:I

    return v0
.end method
