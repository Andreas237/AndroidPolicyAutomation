.class synthetic Lo/frp$5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/frp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 126
    invoke-static {}, Lo/fqn;->values()[Lo/fqn;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/frp$5;->a:[I

    :try_start_0
    sget-object v0, Lo/frp$5;->a:[I

    sget-object v1, Lo/fqn;->b:Lo/fqn;

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
    sget-object v0, Lo/frp$5;->a:[I

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    .line 138
    :goto_1
    invoke-static {}, Lo/fra;->values()[Lo/fra;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lo/frp$5;->d:[I

    :try_start_2
    sget-object v0, Lo/frp$5;->d:[I

    sget-object v1, Lo/fra;->a:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    :goto_2
    :try_start_3
    sget-object v0, Lo/frp$5;->d:[I

    sget-object v1, Lo/fra;->d:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v3

    :goto_3
    :try_start_4
    sget-object v0, Lo/frp$5;->d:[I

    sget-object v1, Lo/fra;->o:Lo/fra;

    invoke-virtual {v1}, Lo/fra;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v3

    :goto_4
    return-void
.end method
