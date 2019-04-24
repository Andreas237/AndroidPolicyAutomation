.class abstract enum Lcom/google/c/a/j$b;
.super Ljava/lang/Enum;
.source "IMASDK"

# interfaces
.implements Lcom/google/c/a/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/c/a/j$b;",
        ">;",
        "Lcom/google/c/a/i<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/c/a/j$b;

.field public static final enum b:Lcom/google/c/a/j$b;

.field public static final enum c:Lcom/google/c/a/j$b;

.field public static final enum d:Lcom/google/c/a/j$b;

.field private static final synthetic e:[Lcom/google/c/a/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 281
    new-instance v0, Lcom/google/c/a/j$b$1;

    const-string v1, "ALWAYS_TRUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/c/a/j$b$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/c/a/j$b;->a:Lcom/google/c/a/j$b;

    .line 293
    new-instance v0, Lcom/google/c/a/j$b$2;

    const-string v1, "ALWAYS_FALSE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/c/a/j$b$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/c/a/j$b;->b:Lcom/google/c/a/j$b;

    .line 305
    new-instance v0, Lcom/google/c/a/j$b$3;

    const-string v1, "IS_NULL"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/google/c/a/j$b$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/c/a/j$b;->c:Lcom/google/c/a/j$b;

    .line 317
    new-instance v0, Lcom/google/c/a/j$b$4;

    const-string v1, "NOT_NULL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/google/c/a/j$b$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/c/a/j$b;->d:Lcom/google/c/a/j$b;

    const/4 v0, 0x4

    .line 279
    new-array v0, v0, [Lcom/google/c/a/j$b;

    sget-object v1, Lcom/google/c/a/j$b;->a:Lcom/google/c/a/j$b;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/c/a/j$b;->b:Lcom/google/c/a/j$b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/c/a/j$b;->c:Lcom/google/c/a/j$b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/c/a/j$b;->d:Lcom/google/c/a/j$b;

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/c/a/j$b;->e:[Lcom/google/c/a/j$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 279
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/c/a/j$1;)V
    .locals 0

    .line 279
    invoke-direct {p0, p1, p2}, Lcom/google/c/a/j$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/c/a/j$b;
    .locals 1

    .line 279
    const-class v0, Lcom/google/c/a/j$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/c/a/j$b;

    return-object p0
.end method

.method public static values()[Lcom/google/c/a/j$b;
    .locals 1

    .line 279
    sget-object v0, Lcom/google/c/a/j$b;->e:[Lcom/google/c/a/j$b;

    invoke-virtual {v0}, [Lcom/google/c/a/j$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/c/a/j$b;

    return-object v0
.end method


# virtual methods
.method a()Lcom/google/c/a/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/c/a/i<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method
