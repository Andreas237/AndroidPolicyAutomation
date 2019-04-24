.class public final enum Lo/fst$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fst;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fst$d;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/fst$d;

.field public static final enum c:Lo/fst$d;

.field public static final enum e:Lo/fst$d;


# instance fields
.field private b:B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 134
    new-instance v0, Lo/fst$d;

    const-string v1, "HOST_NAME"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fst$d;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lo/fst$d;->e:Lo/fst$d;

    .line 138
    new-instance v0, Lo/fst$d;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fst$d;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lo/fst$d;->c:Lo/fst$d;

    .line 129
    const/4 v0, 0x2

    new-array v0, v0, [Lo/fst$d;

    sget-object v1, Lo/fst$d;->e:Lo/fst$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fst$d;->c:Lo/fst$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fst$d;->a:[Lo/fst$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    .line 142
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 143
    iput-byte p3, p0, Lo/fst$d;->b:B

    .line 144
    return-void
.end method

.method public static b(B)Lo/fst$d;
    .locals 5

    .line 162
    invoke-static {}, Lo/fst$d;->values()[Lo/fst$d;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 163
    iget-byte v0, v4, Lo/fst$d;->b:B

    if-ne v0, p0, :cond_0

    .line 164
    return-object v4

    .line 162
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 167
    :cond_1
    sget-object v0, Lo/fst$d;->c:Lo/fst$d;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fst$d;
    .locals 1

    .line 129
    const-class v0, Lo/fst$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fst$d;

    return-object v0
.end method

.method public static values()[Lo/fst$d;
    .locals 1

    .line 129
    sget-object v0, Lo/fst$d;->a:[Lo/fst$d;

    invoke-virtual {v0}, [Lo/fst$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fst$d;

    return-object v0
.end method


# virtual methods
.method public a()B
    .locals 1

    .line 152
    iget-byte v0, p0, Lo/fst$d;->b:B

    return v0
.end method
