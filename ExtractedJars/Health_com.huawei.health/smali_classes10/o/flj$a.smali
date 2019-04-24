.class public final enum Lo/flj$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/flj$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/flj$a;

.field public static final enum b:Lo/flj$a;

.field public static final enum c:Lo/flj$a;

.field public static final enum d:Lo/flj$a;

.field public static final enum e:Lo/flj$a;

.field private static final synthetic k:[Lo/flj$a;


# instance fields
.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 310
    new-instance v0, Lo/flj$a;

    const-string v1, "REQUEST"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/flj$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$a;->e:Lo/flj$a;

    .line 313
    new-instance v0, Lo/flj$a;

    const-string v1, "SUCCESS_RESPONSE"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/flj$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$a;->a:Lo/flj$a;

    .line 316
    new-instance v0, Lo/flj$a;

    const-string v1, "ERROR_RESPONSE"

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/flj$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$a;->d:Lo/flj$a;

    .line 319
    new-instance v0, Lo/flj$a;

    const-string v1, "SERVER_ERROR_RESPONSE"

    const/4 v2, 0x3

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lo/flj$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$a;->b:Lo/flj$a;

    .line 322
    new-instance v0, Lo/flj$a;

    const-string v1, "SIGNAL"

    const/4 v2, 0x4

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lo/flj$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$a;->c:Lo/flj$a;

    .line 307
    const/4 v0, 0x5

    new-array v0, v0, [Lo/flj$a;

    sget-object v1, Lo/flj$a;->e:Lo/flj$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$a;->a:Lo/flj$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$a;->d:Lo/flj$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$a;->b:Lo/flj$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$a;->c:Lo/flj$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lo/flj$a;->k:[Lo/flj$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 332
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 333
    iput p3, p0, Lo/flj$a;->i:I

    .line 334
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/flj$a;
    .locals 1

    .line 307
    const-class v0, Lo/flj$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/flj$a;

    return-object v0
.end method

.method public static values()[Lo/flj$a;
    .locals 1

    .line 307
    sget-object v0, Lo/flj$a;->k:[Lo/flj$a;

    invoke-virtual {v0}, [Lo/flj$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/flj$a;

    return-object v0
.end method
