.class synthetic Lo/cgj$7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 293
    invoke-static {}, Lo/ekm$c;->values()[Lo/ekm$c;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/cgj$7;->b:[I

    :try_start_0
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->a:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->b:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->d:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->c:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->i:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->k:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

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
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->e:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v3

    :goto_6
    :try_start_7
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->f:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v3

    :goto_7
    :try_start_8
    sget-object v0, Lo/cgj$7;->b:[I

    sget-object v1, Lo/ekm$c;->g:Lo/ekm$c;

    invoke-virtual {v1}, Lo/ekm$c;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v3

    :goto_8
    return-void
.end method
