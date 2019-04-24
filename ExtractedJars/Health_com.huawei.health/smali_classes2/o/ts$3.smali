.class synthetic Lo/ts$3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ts;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 300
    invoke-static {}, Lo/ts$a;->values()[Lo/ts$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/ts$3;->e:[I

    :try_start_0
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->e:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    :goto_0
    :try_start_1
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->b:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    :try_start_2
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->d:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    :goto_2
    :try_start_3
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->c:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v3

    :goto_3
    :try_start_4
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->a:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v3

    :goto_4
    :try_start_5
    sget-object v0, Lo/ts$3;->e:[I

    sget-object v1, Lo/ts$a;->f:Lo/ts$a;

    invoke-virtual {v1}, Lo/ts$a;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v3

    :goto_5
    return-void
.end method
