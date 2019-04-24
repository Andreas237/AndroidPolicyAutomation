.class public final enum Lo/flj$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/flj$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/flj$b;

.field public static final enum b:Lo/flj$b;

.field public static final enum c:Lo/flj$b;

.field public static final enum d:Lo/flj$b;

.field public static final enum e:Lo/flj$b;

.field public static final enum f:Lo/flj$b;

.field public static final enum g:Lo/flj$b;

.field public static final enum h:Lo/flj$b;

.field public static final enum i:Lo/flj$b;

.field private static final synthetic j:[Lo/flj$b;

.field public static final enum k:Lo/flj$b;

.field public static final enum l:Lo/flj$b;

.field public static final enum m:Lo/flj$b;

.field public static final enum n:Lo/flj$b;

.field public static final enum o:Lo/flj$b;

.field public static final enum p:Lo/flj$b;

.field public static final enum q:Lo/flj$b;

.field public static final enum r:Lo/flj$b;

.field public static final enum s:Lo/flj$b;

.field public static final enum t:Lo/flj$b;

.field public static final enum u:Lo/flj$b;

.field public static final enum v:Lo/flj$b;

.field public static final enum w:Lo/flj$b;

.field public static final enum x:Lo/flj$b;

.field public static final enum y:Lo/flj$b;


# instance fields
.field public final A:I

.field public final D:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 413
    new-instance v0, Lo/flj$b;

    const-string v1, "_UNKNOWN_SUCCESS_CODE"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->c:Lo/flj$b;

    .line 414
    new-instance v0, Lo/flj$b;

    const-string v1, "CREATED"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->b:Lo/flj$b;

    .line 415
    new-instance v0, Lo/flj$b;

    const-string v1, "DELETED"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->e:Lo/flj$b;

    .line 416
    new-instance v0, Lo/flj$b;

    const-string v1, "VALID"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x3

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->d:Lo/flj$b;

    .line 417
    new-instance v0, Lo/flj$b;

    const-string v1, "CHANGED"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x4

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->a:Lo/flj$b;

    .line 418
    new-instance v0, Lo/flj$b;

    const-string v1, "CONTENT"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x5

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->f:Lo/flj$b;

    .line 419
    new-instance v0, Lo/flj$b;

    const-string v1, "CONTINUE"

    sget-object v2, Lo/flj$a;->a:Lo/flj$a;

    const/4 v3, 0x6

    const/16 v4, 0x1f

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->i:Lo/flj$b;

    .line 422
    new-instance v0, Lo/flj$b;

    const-string v1, "BAD_REQUEST"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/4 v3, 0x7

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->h:Lo/flj$b;

    .line 423
    new-instance v0, Lo/flj$b;

    const-string v1, "UNAUTHORIZED"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0x8

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->g:Lo/flj$b;

    .line 424
    new-instance v0, Lo/flj$b;

    const-string v1, "BAD_OPTION"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0x9

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->k:Lo/flj$b;

    .line 425
    new-instance v0, Lo/flj$b;

    const-string v1, "FORBIDDEN"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xa

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->m:Lo/flj$b;

    .line 426
    new-instance v0, Lo/flj$b;

    const-string v1, "NOT_FOUND"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xb

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->n:Lo/flj$b;

    .line 427
    new-instance v0, Lo/flj$b;

    const-string v1, "METHOD_NOT_ALLOWED"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xc

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->l:Lo/flj$b;

    .line 428
    new-instance v0, Lo/flj$b;

    const-string v1, "NOT_ACCEPTABLE"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xd

    const/4 v4, 0x6

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->p:Lo/flj$b;

    .line 429
    new-instance v0, Lo/flj$b;

    const-string v1, "REQUEST_ENTITY_INCOMPLETE"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xe

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->o:Lo/flj$b;

    .line 430
    new-instance v0, Lo/flj$b;

    const-string v1, "PRECONDITION_FAILED"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0xf

    const/16 v4, 0xc

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->r:Lo/flj$b;

    .line 431
    new-instance v0, Lo/flj$b;

    const-string v1, "REQUEST_ENTITY_TOO_LARGE"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0x10

    const/16 v4, 0xd

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->s:Lo/flj$b;

    .line 432
    new-instance v0, Lo/flj$b;

    const-string v1, "UNSUPPORTED_CONTENT_FORMAT"

    sget-object v2, Lo/flj$a;->d:Lo/flj$a;

    const/16 v3, 0x11

    const/16 v4, 0xf

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->u:Lo/flj$b;

    .line 435
    new-instance v0, Lo/flj$b;

    const-string v1, "INTERNAL_SERVER_ERROR"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x12

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->t:Lo/flj$b;

    .line 436
    new-instance v0, Lo/flj$b;

    const-string v1, "NOT_IMPLEMENTED"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x13

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->q:Lo/flj$b;

    .line 437
    new-instance v0, Lo/flj$b;

    const-string v1, "BAD_GATEWAY"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x14

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->y:Lo/flj$b;

    .line 438
    new-instance v0, Lo/flj$b;

    const-string v1, "SERVICE_UNAVAILABLE"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x15

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->x:Lo/flj$b;

    .line 439
    new-instance v0, Lo/flj$b;

    const-string v1, "GATEWAY_TIMEOUT"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x16

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->w:Lo/flj$b;

    .line 440
    new-instance v0, Lo/flj$b;

    const-string v1, "PROXY_NOT_SUPPORTED"

    sget-object v2, Lo/flj$a;->b:Lo/flj$a;

    const/16 v3, 0x17

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lo/flj$b;-><init>(Ljava/lang/String;ILo/flj$a;I)V

    sput-object v0, Lo/flj$b;->v:Lo/flj$b;

    .line 410
    const/16 v0, 0x18

    new-array v0, v0, [Lo/flj$b;

    sget-object v1, Lo/flj$b;->c:Lo/flj$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->b:Lo/flj$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->e:Lo/flj$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->d:Lo/flj$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->a:Lo/flj$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->f:Lo/flj$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->i:Lo/flj$b;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->h:Lo/flj$b;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->g:Lo/flj$b;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->k:Lo/flj$b;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->m:Lo/flj$b;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->n:Lo/flj$b;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->l:Lo/flj$b;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->p:Lo/flj$b;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->o:Lo/flj$b;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->r:Lo/flj$b;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->s:Lo/flj$b;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->u:Lo/flj$b;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->t:Lo/flj$b;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->q:Lo/flj$b;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->y:Lo/flj$b;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->x:Lo/flj$b;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->w:Lo/flj$b;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$b;->v:Lo/flj$b;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sput-object v0, Lo/flj$b;->j:[Lo/flj$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILo/flj$a;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/flj$a;I)V"
        }
    .end annotation

    .line 452
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 453
    iget v0, p3, Lo/flj$a;->i:I

    iput v0, p0, Lo/flj$b;->D:I

    .line 454
    iput p4, p0, Lo/flj$b;->A:I

    .line 455
    iget v0, p3, Lo/flj$a;->i:I

    shl-int/lit8 v0, v0, 0x5

    or-int/2addr v0, p4

    iput v0, p0, Lo/flj$b;->z:I

    .line 456
    return-void
.end method

.method public static a(Lo/flj$b;)Z
    .locals 2

    .line 537
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 538
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ResponseCode must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 540
    :cond_0
    iget v0, p0, Lo/flj$b;->D:I

    sget-object v1, Lo/flj$a;->a:Lo/flj$a;

    iget v1, v1, Lo/flj$a;->i:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(I)Lo/flj$b;
    .locals 1

    .line 512
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 513
    :pswitch_0
    sget-object v0, Lo/flj$b;->t:Lo/flj$b;

    return-object v0

    .line 514
    :pswitch_1
    sget-object v0, Lo/flj$b;->q:Lo/flj$b;

    return-object v0

    .line 515
    :pswitch_2
    sget-object v0, Lo/flj$b;->y:Lo/flj$b;

    return-object v0

    .line 516
    :pswitch_3
    sget-object v0, Lo/flj$b;->x:Lo/flj$b;

    return-object v0

    .line 517
    :pswitch_4
    sget-object v0, Lo/flj$b;->w:Lo/flj$b;

    return-object v0

    .line 518
    :pswitch_5
    sget-object v0, Lo/flj$b;->v:Lo/flj$b;

    return-object v0

    .line 520
    :goto_0
    sget-object v0, Lo/flj$b;->t:Lo/flj$b;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static c(I)Lo/flj$b;
    .locals 1

    .line 481
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 482
    :sswitch_0
    sget-object v0, Lo/flj$b;->b:Lo/flj$b;

    return-object v0

    .line 483
    :sswitch_1
    sget-object v0, Lo/flj$b;->e:Lo/flj$b;

    return-object v0

    .line 484
    :sswitch_2
    sget-object v0, Lo/flj$b;->d:Lo/flj$b;

    return-object v0

    .line 485
    :sswitch_3
    sget-object v0, Lo/flj$b;->a:Lo/flj$b;

    return-object v0

    .line 486
    :sswitch_4
    sget-object v0, Lo/flj$b;->f:Lo/flj$b;

    return-object v0

    .line 487
    :sswitch_5
    sget-object v0, Lo/flj$b;->i:Lo/flj$b;

    return-object v0

    .line 489
    :goto_0
    sget-object v0, Lo/flj$b;->c:Lo/flj$b;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x1f -> :sswitch_5
    .end sparse-switch
.end method

.method public static c(Lo/flj$b;)Z
    .locals 2

    .line 565
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 566
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ResponseCode must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 568
    :cond_0
    iget v0, p0, Lo/flj$b;->D:I

    sget-object v1, Lo/flj$a;->b:Lo/flj$a;

    iget v1, v1, Lo/flj$a;->i:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d(I)Lo/flj$b;
    .locals 7

    .line 466
    invoke-static {p0}, Lo/flj;->e(I)I

    move-result v5

    .line 467
    invoke-static {p0}, Lo/flj;->d(I)I

    move-result v6

    .line 468
    packed-switch v5, :pswitch_data_0

    goto :goto_0

    .line 470
    :pswitch_0
    invoke-static {v6}, Lo/flj$b;->c(I)Lo/flj$b;

    move-result-object v0

    return-object v0

    .line 472
    :pswitch_1
    invoke-static {v6}, Lo/flj$b;->e(I)Lo/flj$b;

    move-result-object v0

    return-object v0

    .line 474
    :pswitch_2
    invoke-static {v6}, Lo/flj$b;->b(I)Lo/flj$b;

    move-result-object v0

    return-object v0

    .line 476
    :goto_0
    :pswitch_3
    new-instance v0, Lo/flm;

    const-string v1, "Not a CoAP response code: %s"

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

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static d(Lo/flj$b;)Z
    .locals 2

    .line 551
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 552
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "ResponseCode must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 554
    :cond_0
    iget v0, p0, Lo/flj$b;->D:I

    sget-object v1, Lo/flj$a;->d:Lo/flj$a;

    iget v1, v1, Lo/flj$a;->i:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static e(I)Lo/flj$b;
    .locals 1

    .line 494
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 495
    :pswitch_0
    sget-object v0, Lo/flj$b;->h:Lo/flj$b;

    return-object v0

    .line 496
    :pswitch_1
    sget-object v0, Lo/flj$b;->g:Lo/flj$b;

    return-object v0

    .line 497
    :pswitch_2
    sget-object v0, Lo/flj$b;->k:Lo/flj$b;

    return-object v0

    .line 498
    :pswitch_3
    sget-object v0, Lo/flj$b;->m:Lo/flj$b;

    return-object v0

    .line 499
    :pswitch_4
    sget-object v0, Lo/flj$b;->n:Lo/flj$b;

    return-object v0

    .line 500
    :pswitch_5
    sget-object v0, Lo/flj$b;->l:Lo/flj$b;

    return-object v0

    .line 501
    :pswitch_6
    sget-object v0, Lo/flj$b;->p:Lo/flj$b;

    return-object v0

    .line 502
    :pswitch_7
    sget-object v0, Lo/flj$b;->o:Lo/flj$b;

    return-object v0

    .line 503
    :pswitch_8
    sget-object v0, Lo/flj$b;->r:Lo/flj$b;

    return-object v0

    .line 504
    :pswitch_9
    sget-object v0, Lo/flj$b;->s:Lo/flj$b;

    return-object v0

    .line 505
    :pswitch_a
    sget-object v0, Lo/flj$b;->u:Lo/flj$b;

    return-object v0

    .line 507
    :goto_0
    :pswitch_b
    sget-object v0, Lo/flj$b;->h:Lo/flj$b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_b
        :pswitch_7
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_8
        :pswitch_9
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/flj$b;
    .locals 1

    .line 410
    const-class v0, Lo/flj$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/flj$b;

    return-object v0
.end method

.method public static values()[Lo/flj$b;
    .locals 1

    .line 410
    sget-object v0, Lo/flj$b;->j:[Lo/flj$b;

    invoke-virtual {v0}, [Lo/flj$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/flj$b;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 526
    iget v0, p0, Lo/flj$b;->D:I

    iget v1, p0, Lo/flj$b;->A:I

    invoke-static {v0, v1}, Lo/flj;->c(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
