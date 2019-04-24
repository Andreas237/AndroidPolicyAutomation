.class public final enum Lcom/squareup/haha/perflib/Type;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/haha/perflib/Type$1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/squareup/haha/perflib/Type;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/squareup/haha/perflib/Type;

.field public static final enum BOOLEAN:Lcom/squareup/haha/perflib/Type;

.field public static final enum BYTE:Lcom/squareup/haha/perflib/Type;

.field public static final enum CHAR:Lcom/squareup/haha/perflib/Type;

.field public static final enum DOUBLE:Lcom/squareup/haha/perflib/Type;

.field public static final enum FLOAT:Lcom/squareup/haha/perflib/Type;

.field public static final enum INT:Lcom/squareup/haha/perflib/Type;

.field public static final enum LONG:Lcom/squareup/haha/perflib/Type;

.field public static final enum OBJECT:Lcom/squareup/haha/perflib/Type;

.field public static final enum SHORT:Lcom/squareup/haha/perflib/Type;

.field private static sTypeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Lcom/squareup/haha/perflib/Type;>;"
        }
    .end annotation
.end field


# instance fields
.field private mId:I

.field private mSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 24
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "OBJECT"

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    .line 25
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x1

    const/4 v3, 0x4

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->BOOLEAN:Lcom/squareup/haha/perflib/Type;

    .line 26
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "CHAR"

    const/4 v2, 0x2

    const/4 v3, 0x5

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->CHAR:Lcom/squareup/haha/perflib/Type;

    .line 27
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "FLOAT"

    const/4 v2, 0x3

    const/4 v3, 0x6

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->FLOAT:Lcom/squareup/haha/perflib/Type;

    .line 28
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "DOUBLE"

    const/4 v2, 0x4

    const/4 v3, 0x7

    const/16 v4, 0x8

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->DOUBLE:Lcom/squareup/haha/perflib/Type;

    .line 29
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "BYTE"

    const/4 v2, 0x5

    const/16 v3, 0x8

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->BYTE:Lcom/squareup/haha/perflib/Type;

    .line 30
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "SHORT"

    const/4 v2, 0x6

    const/16 v3, 0x9

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->SHORT:Lcom/squareup/haha/perflib/Type;

    .line 31
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "INT"

    const/4 v2, 0x7

    const/16 v3, 0xa

    const/4 v4, 0x4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->INT:Lcom/squareup/haha/perflib/Type;

    .line 32
    new-instance v0, Lcom/squareup/haha/perflib/Type;

    const-string v1, "LONG"

    const/16 v2, 0x8

    const/16 v3, 0xb

    const/16 v4, 0x8

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/squareup/haha/perflib/Type;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/squareup/haha/perflib/Type;->LONG:Lcom/squareup/haha/perflib/Type;

    .line 23
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/squareup/haha/perflib/Type;

    sget-object v1, Lcom/squareup/haha/perflib/Type;->OBJECT:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->BOOLEAN:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->CHAR:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->FLOAT:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->DOUBLE:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->BYTE:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->SHORT:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->INT:Lcom/squareup/haha/perflib/Type;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/squareup/haha/perflib/Type;->LONG:Lcom/squareup/haha/perflib/Type;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lcom/squareup/haha/perflib/Type;->$VALUES:[Lcom/squareup/haha/perflib/Type;

    .line 34
    invoke-static {}, Lcom/squareup/haha/guava/collect/Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/squareup/haha/perflib/Type;->sTypeMap:Ljava/util/Map;

    .line 41
    invoke-static {}, Lcom/squareup/haha/perflib/Type;->values()[Lcom/squareup/haha/perflib/Type;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    .line 42
    sget-object v0, Lcom/squareup/haha/perflib/Type;->sTypeMap:Ljava/util/Map;

    iget v1, v8, Lcom/squareup/haha/perflib/Type;->mId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 44
    :cond_0
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    iput p3, p0, Lcom/squareup/haha/perflib/Type;->mId:I

    .line 48
    iput p4, p0, Lcom/squareup/haha/perflib/Type;->mSize:I

    .line 49
    return-void
.end method

.method public static getClassNameOfPrimitiveArray(Lcom/squareup/haha/perflib/Type;)Ljava/lang/String;
    .locals 2

    .line 64
    sget-object v0, Lcom/squareup/haha/perflib/Type$1;->$SwitchMap$com$android$tools$perflib$heap$Type:[I

    invoke-virtual {p0}, Lcom/squareup/haha/perflib/Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 65
    :pswitch_0
    const-string v0, "boolean[]"

    return-object v0

    .line 66
    :pswitch_1
    const-string v0, "char[]"

    return-object v0

    .line 67
    :pswitch_2
    const-string v0, "float[]"

    return-object v0

    .line 68
    :pswitch_3
    const-string v0, "double[]"

    return-object v0

    .line 69
    :pswitch_4
    const-string v0, "byte[]"

    return-object v0

    .line 70
    :pswitch_5
    const-string v0, "short[]"

    return-object v0

    .line 71
    :pswitch_6
    const-string v0, "int[]"

    return-object v0

    .line 72
    :pswitch_7
    const-string v0, "long[]"

    return-object v0

    .line 73
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "OBJECT type is not a primitive type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method public static getType(I)Lcom/squareup/haha/perflib/Type;
    .locals 2

    .line 52
    sget-object v0, Lcom/squareup/haha/perflib/Type;->sTypeMap:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Type;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/squareup/haha/perflib/Type;
    .locals 1

    .line 23
    const-class v0, Lcom/squareup/haha/perflib/Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/squareup/haha/perflib/Type;

    return-object v0
.end method

.method public static values()[Lcom/squareup/haha/perflib/Type;
    .locals 1

    .line 23
    sget-object v0, Lcom/squareup/haha/perflib/Type;->$VALUES:[Lcom/squareup/haha/perflib/Type;

    invoke-virtual {v0}, [Lcom/squareup/haha/perflib/Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/squareup/haha/perflib/Type;

    return-object v0
.end method


# virtual methods
.method public final getSize()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/squareup/haha/perflib/Type;->mSize:I

    return v0
.end method

.method public final getTypeId()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/squareup/haha/perflib/Type;->mId:I

    return v0
.end method
