.class synthetic Lo/fqi$5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fqi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic c:[I

.field static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 210
    invoke-static {}, Lo/fqn;->values()[Lo/fqn;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/fqi$5;->c:[I

    :try_start_0
    sget-object v0, Lo/fqi$5;->c:[I

    sget-object v1, Lo/fqn;->e:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

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
    sget-object v0, Lo/fqi$5;->c:[I

    sget-object v1, Lo/fqn;->b:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

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
    sget-object v0, Lo/fqi$5;->c:[I

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    .line 225
    :goto_2
    invoke-static {}, Lo/fra;->values()[Lo/fra;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/fqi$5;->a:[I

    :try_start_3
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->b:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v3

    :goto_3
    :try_start_4
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->a:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v3

    :goto_4
    :try_start_5
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->d:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v3

    :goto_5
    :try_start_6
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->e:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v3

    :goto_6
    :try_start_7
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->i:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v3

    :goto_7
    :try_start_8
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->k:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v3

    :goto_8
    :try_start_9
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->g:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception v3

    :goto_9
    :try_start_a
    sget-object v0, Lo/fqi$5;->a:[I

    sget-object v1, Lo/fra;->o:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_a

    :catch_a
    move-exception v3

    .line 244
    :goto_a
    invoke-static {}, Lo/fsf$a;->values()[Lo/fsf$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/fqi$5;->d:[I

    :try_start_b
    sget-object v0, Lo/fqi$5;->d:[I

    sget-object v1, Lo/fsf$a;->f:Lo/fsf$a;

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_b

    :catch_b
    move-exception v3

    :goto_b
    :try_start_c
    sget-object v0, Lo/fqi$5;->d:[I

    sget-object v1, Lo/fsf$a;->g:Lo/fsf$a;

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_c

    :catch_c
    move-exception v3

    :goto_c
    :try_start_d
    sget-object v0, Lo/fqi$5;->d:[I

    sget-object v1, Lo/fsf$a;->c:Lo/fsf$a;

    invoke-virtual {v1}, Lo/fsf$a;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_d

    :catch_d
    move-exception v3

    :goto_d
    return-void
.end method
