.class public final enum Lo/fbh;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fbh;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fbh;

.field public static final enum b:Lo/fbh;

.field public static final enum c:Lo/fbh;

.field public static final enum d:Lo/fbh;

.field public static final enum e:Lo/fbh;

.field private static final synthetic i:[Lo/fbh;


# instance fields
.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 4
    new-instance v0, Lo/fbh;

    const-string v1, "UNKNOWN_DATAS"

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fbh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fbh;->c:Lo/fbh;

    new-instance v0, Lo/fbh;

    const-string v1, "DETAIL_DATAS"

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fbh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fbh;->b:Lo/fbh;

    new-instance v0, Lo/fbh;

    const-string v1, "MONTH_DATAS"

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fbh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fbh;->d:Lo/fbh;

    new-instance v0, Lo/fbh;

    const-string v1, "YEAR_DATAS"

    const/4 v2, 0x3

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fbh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fbh;->a:Lo/fbh;

    new-instance v0, Lo/fbh;

    const-string v1, "ALL_DATAS"

    const/4 v2, 0x4

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/fbh;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fbh;->e:Lo/fbh;

    .line 3
    const/4 v0, 0x5

    new-array v0, v0, [Lo/fbh;

    sget-object v1, Lo/fbh;->c:Lo/fbh;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fbh;->b:Lo/fbh;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fbh;->d:Lo/fbh;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fbh;->a:Lo/fbh;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fbh;->e:Lo/fbh;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/fbh;->i:[Lo/fbh;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 6
    const/4 v0, -0x1

    iput v0, p0, Lo/fbh;->f:I

    .line 9
    iput p3, p0, Lo/fbh;->f:I

    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fbh;
    .locals 1

    .line 3
    const-class v0, Lo/fbh;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fbh;

    return-object v0
.end method

.method public static values()[Lo/fbh;
    .locals 1

    .line 3
    sget-object v0, Lo/fbh;->i:[Lo/fbh;

    invoke-virtual {v0}, [Lo/fbh;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fbh;

    return-object v0
.end method


# virtual methods
.method public a()Lo/fbh;
    .locals 7

    .line 13
    iget v0, p0, Lo/fbh;->f:I

    add-int/lit8 v2, v0, 0x1

    .line 14
    invoke-static {}, Lo/fbh;->values()[Lo/fbh;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 15
    iget v0, v6, Lo/fbh;->f:I

    if-ne v0, v2, :cond_0

    .line 16
    return-object v6

    .line 14
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 19
    :cond_1
    sget-object v0, Lo/fbh;->c:Lo/fbh;

    return-object v0
.end method

.method public e()Lo/fbh;
    .locals 7

    .line 23
    iget v0, p0, Lo/fbh;->f:I

    add-int/lit8 v2, v0, -0x1

    .line 24
    invoke-static {}, Lo/fbh;->values()[Lo/fbh;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 25
    iget v0, v6, Lo/fbh;->f:I

    if-ne v0, v2, :cond_0

    .line 26
    return-object v6

    .line 24
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 29
    :cond_1
    sget-object v0, Lo/fbh;->c:Lo/fbh;

    return-object v0
.end method
