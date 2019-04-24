.class public final enum Lorg/c/c/i$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/c/c/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/c/c/i$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/c/c/i$a;

.field public static final enum CLIENT_ERROR:Lorg/c/c/i$a;

.field public static final enum INFORMATIONAL:Lorg/c/c/i$a;

.field public static final enum REDIRECTION:Lorg/c/c/i$a;

.field public static final enum SERVER_ERROR:Lorg/c/c/i$a;

.field public static final enum SUCCESSFUL:Lorg/c/c/i$a;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lorg/c/c/i$a;

    const-string v1, "INFORMATIONAL"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/c/c/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/c/c/i$a;->INFORMATIONAL:Lorg/c/c/i$a;

    new-instance v0, Lorg/c/c/i$a;

    const-string v1, "SUCCESSFUL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v4}, Lorg/c/c/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/c/c/i$a;->SUCCESSFUL:Lorg/c/c/i$a;

    new-instance v0, Lorg/c/c/i$a;

    const-string v1, "REDIRECTION"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v4, v5}, Lorg/c/c/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/c/c/i$a;->REDIRECTION:Lorg/c/c/i$a;

    new-instance v0, Lorg/c/c/i$a;

    const-string v1, "CLIENT_ERROR"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v5, v6}, Lorg/c/c/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/c/c/i$a;->CLIENT_ERROR:Lorg/c/c/i$a;

    new-instance v0, Lorg/c/c/i$a;

    const-string v1, "SERVER_ERROR"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v6, v7}, Lorg/c/c/i$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/c/c/i$a;->SERVER_ERROR:Lorg/c/c/i$a;

    new-array v0, v7, [Lorg/c/c/i$a;

    sget-object v1, Lorg/c/c/i$a;->INFORMATIONAL:Lorg/c/c/i$a;

    aput-object v1, v0, v2

    sget-object v1, Lorg/c/c/i$a;->SUCCESSFUL:Lorg/c/c/i$a;

    aput-object v1, v0, v3

    sget-object v1, Lorg/c/c/i$a;->REDIRECTION:Lorg/c/c/i$a;

    aput-object v1, v0, v4

    sget-object v1, Lorg/c/c/i$a;->CLIENT_ERROR:Lorg/c/c/i$a;

    aput-object v1, v0, v5

    sget-object v1, Lorg/c/c/i$a;->SERVER_ERROR:Lorg/c/c/i$a;

    aput-object v1, v0, v6

    sput-object v0, Lorg/c/c/i$a;->$VALUES:[Lorg/c/c/i$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lorg/c/c/i$a;->value:I

    return-void
.end method

.method static synthetic access$000(Lorg/c/c/i;)Lorg/c/c/i$a;
    .locals 0

    invoke-static {p0}, Lorg/c/c/i$a;->valueOf(Lorg/c/c/i;)Lorg/c/c/i$a;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/c/c/i$a;
    .locals 1

    const-class v0, Lorg/c/c/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/c/c/i$a;

    return-object p0
.end method

.method private static valueOf(Lorg/c/c/i;)Lorg/c/c/i$a;
    .locals 6

    invoke-virtual {p0}, Lorg/c/c/i;->value()I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    invoke-static {}, Lorg/c/c/i$a;->values()[Lorg/c/c/i$a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    iget v5, v4, Lorg/c/c/i$a;->value:I

    if-ne v5, v0, :cond_0

    return-object v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No matching constant for ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static values()[Lorg/c/c/i$a;
    .locals 1

    sget-object v0, Lorg/c/c/i$a;->$VALUES:[Lorg/c/c/i$a;

    invoke-virtual {v0}, [Lorg/c/c/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/c/c/i$a;

    return-object v0
.end method


# virtual methods
.method public value()I
    .locals 1

    iget v0, p0, Lorg/c/c/i$a;->value:I

    return v0
.end method
