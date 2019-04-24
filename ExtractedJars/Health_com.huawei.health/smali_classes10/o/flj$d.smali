.class public final enum Lo/flj$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/flj$d;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/flj$d;

.field public static final enum c:Lo/flj$d;

.field public static final enum d:Lo/flj$d;

.field public static final enum e:Lo/flj$d;

.field private static final synthetic k:[Lo/flj$d;


# instance fields
.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 361
    new-instance v0, Lo/flj$d;

    const-string v1, "GET"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/flj$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$d;->d:Lo/flj$d;

    .line 364
    new-instance v0, Lo/flj$d;

    const-string v1, "POST"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/flj$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$d;->c:Lo/flj$d;

    .line 367
    new-instance v0, Lo/flj$d;

    const-string v1, "PUT"

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/flj$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$d;->a:Lo/flj$d;

    .line 370
    new-instance v0, Lo/flj$d;

    const-string v1, "DELETE"

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lo/flj$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$d;->e:Lo/flj$d;

    .line 358
    const/4 v0, 0x4

    new-array v0, v0, [Lo/flj$d;

    sget-object v1, Lo/flj$d;->d:Lo/flj$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$d;->c:Lo/flj$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$d;->a:Lo/flj$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$d;->e:Lo/flj$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/flj$d;->k:[Lo/flj$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 380
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 381
    iput p3, p0, Lo/flj$d;->b:I

    .line 382
    return-void
.end method

.method public static c(I)Lo/flj$d;
    .locals 7

    .line 392
    invoke-static {p0}, Lo/flj;->e(I)I

    move-result v5

    .line 393
    invoke-static {p0}, Lo/flj;->d(I)I

    move-result v6

    .line 394
    if-lez v5, :cond_0

    .line 395
    new-instance v0, Lo/flm;

    const-string v1, "Not a CoAP request code: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lo/flj;->c(II)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flm;-><init>(Ljava/lang/String;)V

    throw v0

    .line 397
    :cond_0
    packed-switch v6, :pswitch_data_0

    goto :goto_0

    .line 398
    :pswitch_0
    sget-object v0, Lo/flj$d;->d:Lo/flj$d;

    return-object v0

    .line 399
    :pswitch_1
    sget-object v0, Lo/flj$d;->c:Lo/flj$d;

    return-object v0

    .line 400
    :pswitch_2
    sget-object v0, Lo/flj$d;->a:Lo/flj$d;

    return-object v0

    .line 401
    :pswitch_3
    sget-object v0, Lo/flj$d;->e:Lo/flj$d;

    return-object v0

    .line 402
    :goto_0
    new-instance v0, Lo/flm;

    const-string v1, "Unknown CoAP request code: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lo/flj;->c(II)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/flm;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/flj$d;
    .locals 1

    .line 358
    const-class v0, Lo/flj$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/flj$d;

    return-object v0
.end method

.method public static values()[Lo/flj$d;
    .locals 1

    .line 358
    sget-object v0, Lo/flj$d;->k:[Lo/flj$d;

    invoke-virtual {v0}, [Lo/flj$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/flj$d;

    return-object v0
.end method
