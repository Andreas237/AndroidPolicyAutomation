.class public final enum Lo/uk;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/uk;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/uk;

.field public static final enum b:Lo/uk;

.field public static final enum c:Lo/uk;

.field public static final enum d:Lo/uk;

.field public static final enum e:Lo/uk;

.field public static final enum f:Lo/uk;

.field public static final enum g:Lo/uk;

.field public static final enum h:Lo/uk;

.field public static final enum i:Lo/uk;

.field public static final enum k:Lo/uk;

.field private static final synthetic p:[Lo/uk;


# instance fields
.field private final m:I

.field private final n:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 27
    new-instance v0, Lo/uk;

    const-string v1, "TERMINATOR"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->b:Lo/uk;

    .line 28
    new-instance v0, Lo/uk;

    const-string v1, "NUMERIC"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->a:Lo/uk;

    .line 29
    new-instance v0, Lo/uk;

    const-string v1, "ALPHANUMERIC"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_2

    const/4 v3, 0x2

    const/4 v4, 0x2

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->d:Lo/uk;

    .line 30
    new-instance v0, Lo/uk;

    const-string v1, "STRUCTURED_APPEND"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    const/4 v3, 0x3

    const/4 v4, 0x3

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->e:Lo/uk;

    .line 31
    new-instance v0, Lo/uk;

    const-string v1, "BYTE"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_4

    const/4 v3, 0x4

    const/4 v4, 0x4

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->c:Lo/uk;

    .line 32
    new-instance v0, Lo/uk;

    const-string v1, "ECI"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_5

    const/4 v3, 0x5

    const/4 v4, 0x7

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->f:Lo/uk;

    .line 33
    new-instance v0, Lo/uk;

    const-string v1, "KANJI"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_6

    const/4 v3, 0x6

    const/16 v4, 0x8

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->i:Lo/uk;

    .line 34
    new-instance v0, Lo/uk;

    const-string v1, "FNC1_FIRST_POSITION"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_7

    const/4 v3, 0x7

    const/4 v4, 0x5

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->k:Lo/uk;

    .line 35
    new-instance v0, Lo/uk;

    const-string v1, "FNC1_SECOND_POSITION"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_8

    const/16 v3, 0x8

    const/16 v4, 0x9

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->g:Lo/uk;

    .line 37
    new-instance v0, Lo/uk;

    const-string v1, "HANZI"

    const/4 v2, 0x3

    new-array v2, v2, [I

    fill-array-data v2, :array_9

    const/16 v3, 0x9

    const/16 v4, 0xd

    invoke-direct {v0, v1, v3, v2, v4}, Lo/uk;-><init>(Ljava/lang/String;I[II)V

    sput-object v0, Lo/uk;->h:Lo/uk;

    .line 25
    const/16 v0, 0xa

    new-array v0, v0, [Lo/uk;

    sget-object v1, Lo/uk;->b:Lo/uk;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->a:Lo/uk;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->d:Lo/uk;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->e:Lo/uk;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->c:Lo/uk;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->f:Lo/uk;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->i:Lo/uk;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->k:Lo/uk;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->g:Lo/uk;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lo/uk;->h:Lo/uk;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lo/uk;->p:[Lo/uk;

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0xa
        0xc
        0xe
    .end array-data

    :array_2
    .array-data 4
        0x9
        0xb
        0xd
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x8
        0x10
        0x10
    .end array-data

    :array_5
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_6
    .array-data 4
        0x8
        0xa
        0xc
    .end array-data

    :array_7
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_8
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data

    :array_9
    .array-data 4
        0x8
        0xa
        0xc
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;I[II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([II)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    iput-object p3, p0, Lo/uk;->n:[I

    .line 44
    iput p4, p0, Lo/uk;->m:I

    .line 45
    return-void
.end method

.method public static d(I)Lo/uk;
    .locals 1

    .line 53
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 55
    :pswitch_0
    sget-object v0, Lo/uk;->b:Lo/uk;

    return-object v0

    .line 57
    :pswitch_1
    sget-object v0, Lo/uk;->a:Lo/uk;

    return-object v0

    .line 59
    :pswitch_2
    sget-object v0, Lo/uk;->d:Lo/uk;

    return-object v0

    .line 61
    :pswitch_3
    sget-object v0, Lo/uk;->e:Lo/uk;

    return-object v0

    .line 63
    :pswitch_4
    sget-object v0, Lo/uk;->c:Lo/uk;

    return-object v0

    .line 65
    :pswitch_5
    sget-object v0, Lo/uk;->k:Lo/uk;

    return-object v0

    .line 67
    :pswitch_6
    sget-object v0, Lo/uk;->f:Lo/uk;

    return-object v0

    .line 69
    :pswitch_7
    sget-object v0, Lo/uk;->i:Lo/uk;

    return-object v0

    .line 71
    :pswitch_8
    sget-object v0, Lo/uk;->g:Lo/uk;

    return-object v0

    .line 74
    :pswitch_9
    sget-object v0, Lo/uk;->h:Lo/uk;

    return-object v0

    .line 76
    :goto_0
    :pswitch_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_a
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lo/uk;
    .locals 1

    .line 25
    const-class v0, Lo/uk;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/uk;

    return-object v0
.end method

.method public static values()[Lo/uk;
    .locals 1

    .line 25
    sget-object v0, Lo/uk;->p:[Lo/uk;

    invoke-virtual {v0}, [Lo/uk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/uk;

    return-object v0
.end method


# virtual methods
.method public b(Lo/un;)I
    .locals 3

    .line 86
    invoke-virtual {p1}, Lo/un;->a()I

    move-result v1

    .line 88
    const/16 v0, 0x9

    if-gt v1, v0, :cond_0

    .line 89
    const/4 v2, 0x0

    goto :goto_0

    .line 90
    :cond_0
    const/16 v0, 0x1a

    if-gt v1, v0, :cond_1

    .line 91
    const/4 v2, 0x1

    goto :goto_0

    .line 93
    :cond_1
    const/4 v2, 0x2

    .line 95
    :goto_0
    iget-object v0, p0, Lo/uk;->n:[I

    aget v0, v0, v2

    return v0
.end method

.method public d()I
    .locals 1

    .line 99
    iget v0, p0, Lo/uk;->m:I

    return v0
.end method
