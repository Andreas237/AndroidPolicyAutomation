.class public final enum Lo/fue;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fue;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fue;

.field public static final enum b:Lo/fue;

.field public static final enum c:Lo/fue;

.field public static final enum d:Lo/fue;

.field public static final enum e:Lo/fue;

.field private static final synthetic i:[Lo/fue;


# instance fields
.field private f:I

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 16
    new-instance v0, Lo/fue;

    const-string v1, "ERROR"

    const-string v2, "ERROR"

    const/4 v3, 0x0

    const/16 v4, 0x28

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fue;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fue;->c:Lo/fue;

    new-instance v0, Lo/fue;

    const-string v1, "WARN"

    const-string v2, "WARN"

    const/4 v3, 0x1

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fue;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fue;->a:Lo/fue;

    new-instance v0, Lo/fue;

    const-string v1, "INFO"

    const-string v2, "INFO"

    const/4 v3, 0x2

    const/16 v4, 0x14

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fue;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fue;->e:Lo/fue;

    new-instance v0, Lo/fue;

    const-string v1, "DEBUG"

    const-string v2, "DEBUG"

    const/4 v3, 0x3

    const/16 v4, 0xa

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fue;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fue;->b:Lo/fue;

    new-instance v0, Lo/fue;

    const-string v1, "TRACE"

    const-string v2, "TRACE"

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Lo/fue;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lo/fue;->d:Lo/fue;

    .line 14
    const/4 v0, 0x5

    new-array v0, v0, [Lo/fue;

    sget-object v1, Lo/fue;->c:Lo/fue;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fue;->a:Lo/fue;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fue;->e:Lo/fue;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fue;->b:Lo/fue;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fue;->d:Lo/fue;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/fue;->i:[Lo/fue;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 22
    iput p3, p0, Lo/fue;->f:I

    .line 23
    iput-object p4, p0, Lo/fue;->g:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fue;
    .locals 1

    .line 14
    const-class v0, Lo/fue;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fue;

    return-object v0
.end method

.method public static values()[Lo/fue;
    .locals 1

    .line 14
    sget-object v0, Lo/fue;->i:[Lo/fue;

    invoke-virtual {v0}, [Lo/fue;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fue;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/fue;->g:Ljava/lang/String;

    return-object v0
.end method
