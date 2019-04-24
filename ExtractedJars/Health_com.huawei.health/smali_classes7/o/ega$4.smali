.class synthetic Lo/ega$4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ega;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic b:[I

.field static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 123
    invoke-static {}, Lo/egc$b;->values()[Lo/egc$b;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/ega$4;->d:[I

    :try_start_0
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->b:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

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
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->a:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

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
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->e:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

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
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->i:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

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
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->d:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

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
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->h:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v3

    :goto_5
    :try_start_6
    sget-object v0, Lo/ega$4;->d:[I

    sget-object v1, Lo/egc$b;->c:Lo/egc$b;

    invoke-virtual {v1}, Lo/egc$b;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v3

    .line 127
    :goto_6
    invoke-static {}, Lo/egc$a;->values()[Lo/egc$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/ega$4;->b:[I

    :try_start_7
    sget-object v0, Lo/ega$4;->b:[I

    sget-object v1, Lo/egc$a;->c:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v3

    :goto_7
    :try_start_8
    sget-object v0, Lo/ega$4;->b:[I

    sget-object v1, Lo/egc$a;->d:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v3

    :goto_8
    :try_start_9
    sget-object v0, Lo/ega$4;->b:[I

    sget-object v1, Lo/egc$a;->e:Lo/egc$a;

    invoke-virtual {v1}, Lo/egc$a;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception v3

    :goto_9
    return-void
.end method
