.class public final enum Lo/flj$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/flj$e;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/flj$e;

.field public static final enum c:Lo/flj$e;

.field public static final enum d:Lo/flj$e;

.field public static final enum e:Lo/flj$e;

.field private static final synthetic k:[Lo/flj$e;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 263
    new-instance v0, Lo/flj$e;

    const-string v1, "CON"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/flj$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$e;->c:Lo/flj$e;

    .line 266
    new-instance v0, Lo/flj$e;

    const-string v1, "NON"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/flj$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$e;->e:Lo/flj$e;

    .line 269
    new-instance v0, Lo/flj$e;

    const-string v1, "ACK"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/flj$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$e;->d:Lo/flj$e;

    .line 272
    new-instance v0, Lo/flj$e;

    const-string v1, "RST"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/flj$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/flj$e;->b:Lo/flj$e;

    .line 260
    const/4 v0, 0x4

    new-array v0, v0, [Lo/flj$e;

    sget-object v1, Lo/flj$e;->c:Lo/flj$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$e;->e:Lo/flj$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$e;->d:Lo/flj$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/flj$e;->b:Lo/flj$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/flj$e;->k:[Lo/flj$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 282
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 283
    iput p3, p0, Lo/flj$e;->a:I

    .line 284
    return-void
.end method

.method public static b(I)Lo/flj$e;
    .locals 3

    .line 294
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 295
    :pswitch_0
    sget-object v0, Lo/flj$e;->c:Lo/flj$e;

    return-object v0

    .line 296
    :pswitch_1
    sget-object v0, Lo/flj$e;->e:Lo/flj$e;

    return-object v0

    .line 297
    :pswitch_2
    sget-object v0, Lo/flj$e;->d:Lo/flj$e;

    return-object v0

    .line 298
    :pswitch_3
    sget-object v0, Lo/flj$e;->b:Lo/flj$e;

    return-object v0

    .line 299
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown CoAP type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/flj$e;
    .locals 1

    .line 260
    const-class v0, Lo/flj$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/flj$e;

    return-object v0
.end method

.method public static values()[Lo/flj$e;
    .locals 1

    .line 260
    sget-object v0, Lo/flj$e;->k:[Lo/flj$e;

    invoke-virtual {v0}, [Lo/flj$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/flj$e;

    return-object v0
.end method
