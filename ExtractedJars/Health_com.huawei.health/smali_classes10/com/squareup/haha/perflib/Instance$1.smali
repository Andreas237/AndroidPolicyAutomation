.class synthetic Lcom/squareup/haha/perflib/Instance$1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/perflib/Instance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$android$tools$perflib$heap$Type:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 222
    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    :try_start_0
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    nop

    :catch_0
    :try_start_1
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->BOOLEAN:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    nop

    :catch_1
    :try_start_2
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->CHAR:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    nop

    :catch_2
    :try_start_3
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->FLOAT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    nop

    :catch_3
    :try_start_4
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->DOUBLE:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    nop

    :catch_4
    :try_start_5
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->BYTE:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    nop

    :catch_5
    :try_start_6
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->SHORT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    nop

    :catch_6
    :try_start_7
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->INT:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    nop

    :catch_7
    :try_start_8
    sget-object v0, Lcom/squareup/haha/perflib/Instance$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    sget-object v1, Lcom/squareup/haha/perflib/Type;->LONG:Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v1}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    return-void

    :catch_8
    return-void
.end method
