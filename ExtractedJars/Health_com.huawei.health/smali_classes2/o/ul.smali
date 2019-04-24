.class public final enum Lo/ul;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ul;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ul;

.field private static final b:[Lo/ul;

.field public static final enum c:Lo/ul;

.field public static final enum d:Lo/ul;

.field public static final enum e:Lo/ul;

.field private static final synthetic k:[Lo/ul;


# instance fields
.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 28
    new-instance v0, Lo/ul;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/ul;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/ul;->e:Lo/ul;

    .line 30
    new-instance v0, Lo/ul;

    const-string v1, "M"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/ul;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/ul;->d:Lo/ul;

    .line 32
    new-instance v0, Lo/ul;

    const-string v1, "Q"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/ul;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/ul;->c:Lo/ul;

    .line 34
    new-instance v0, Lo/ul;

    const-string v1, "H"

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/ul;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/ul;->a:Lo/ul;

    .line 25
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ul;

    sget-object v1, Lo/ul;->e:Lo/ul;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->d:Lo/ul;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->c:Lo/ul;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->a:Lo/ul;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ul;->k:[Lo/ul;

    .line 36
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ul;

    sget-object v1, Lo/ul;->d:Lo/ul;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->e:Lo/ul;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->a:Lo/ul;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ul;->c:Lo/ul;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ul;->b:[Lo/ul;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 41
    iput p3, p0, Lo/ul;->h:I

    .line 42
    return-void
.end method

.method public static e(I)Lo/ul;
    .locals 1

    .line 53
    if-ltz p0, :cond_0

    sget-object v0, Lo/ul;->b:[Lo/ul;

    array-length v0, v0

    if-lt p0, v0, :cond_1

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 56
    :cond_1
    sget-object v0, Lo/ul;->b:[Lo/ul;

    aget-object v0, v0, p0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ul;
    .locals 1

    .line 25
    const-class v0, Lo/ul;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ul;

    return-object v0
.end method

.method public static values()[Lo/ul;
    .locals 1

    .line 25
    sget-object v0, Lo/ul;->k:[Lo/ul;

    invoke-virtual {v0}, [Lo/ul;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ul;

    return-object v0
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 45
    iget v0, p0, Lo/ul;->h:I

    return v0
.end method
