.class public final enum Lo/fse$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fse$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fse$b;

.field public static final enum b:Lo/fse$b;

.field public static final enum c:Lo/fse$b;

.field public static final enum d:Lo/fse$b;

.field public static final enum e:Lo/fse$b;

.field private static final synthetic f:[Lo/fse$b;

.field public static final enum g:Lo/fse$b;

.field public static final enum i:Lo/fse$b;


# instance fields
.field private h:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 33
    new-instance v0, Lo/fse$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->e:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "MD5"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->c:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "SHA1"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->d:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "SHA224"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->b:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "SHA256"

    const/4 v2, 0x4

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->a:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "SHA384"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->i:Lo/fse$b;

    new-instance v0, Lo/fse$b;

    const-string v1, "SHA512"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lo/fse$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/fse$b;->g:Lo/fse$b;

    .line 31
    const/4 v0, 0x7

    new-array v0, v0, [Lo/fse$b;

    sget-object v1, Lo/fse$b;->e:Lo/fse$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->c:Lo/fse$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->d:Lo/fse$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->b:Lo/fse$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->a:Lo/fse$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->i:Lo/fse$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/fse$b;->g:Lo/fse$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/fse$b;->f:[Lo/fse$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    iput p3, p0, Lo/fse$b;->h:I

    .line 39
    return-void
.end method

.method public static d(I)Lo/fse$b;
    .locals 5

    .line 49
    invoke-static {}, Lo/fse$b;->values()[Lo/fse$b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 50
    iget v0, v4, Lo/fse$b;->h:I

    if-ne v0, p0, :cond_0

    .line 51
    return-object v4

    .line 49
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fse$b;
    .locals 1

    .line 31
    const-class v0, Lo/fse$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fse$b;

    return-object v0
.end method

.method public static values()[Lo/fse$b;
    .locals 1

    .line 31
    sget-object v0, Lo/fse$b;->f:[Lo/fse$b;

    invoke-virtual {v0}, [Lo/fse$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fse$b;

    return-object v0
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 64
    iget v0, p0, Lo/fse$b;->h:I

    return v0
.end method
