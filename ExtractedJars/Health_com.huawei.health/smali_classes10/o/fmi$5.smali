.class synthetic Lo/fmi$5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 120
    invoke-static {}, Lo/fmi$a;->values()[Lo/fmi$a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/fmi$5;->d:[I

    :try_start_0
    sget-object v0, Lo/fmi$5;->d:[I

    sget-object v1, Lo/fmi$a;->a:Lo/fmi$a;

    invoke-virtual {v1}, Lo/fmi$a;->ordinal()I

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
    sget-object v0, Lo/fmi$5;->d:[I

    sget-object v1, Lo/fmi$a;->b:Lo/fmi$a;

    invoke-virtual {v1}, Lo/fmi$a;->ordinal()I

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
    sget-object v0, Lo/fmi$5;->d:[I

    sget-object v1, Lo/fmi$a;->e:Lo/fmi$a;

    invoke-virtual {v1}, Lo/fmi$a;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    :goto_2
    return-void
.end method
