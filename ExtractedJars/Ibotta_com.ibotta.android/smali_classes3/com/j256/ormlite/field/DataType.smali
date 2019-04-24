.class public final enum Lcom/j256/ormlite/field/DataType;
.super Ljava/lang/Enum;
.source "DataType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/j256/ormlite/field/DataType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/j256/ormlite/field/DataType;

.field public static final enum BIG_DECIMAL:Lcom/j256/ormlite/field/DataType;

.field public static final enum BIG_DECIMAL_NUMERIC:Lcom/j256/ormlite/field/DataType;

.field public static final enum BIG_INTEGER:Lcom/j256/ormlite/field/DataType;

.field public static final enum BOOLEAN:Lcom/j256/ormlite/field/DataType;

.field public static final enum BOOLEAN_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum BYTE:Lcom/j256/ormlite/field/DataType;

.field public static final enum BYTE_ARRAY:Lcom/j256/ormlite/field/DataType;

.field public static final enum BYTE_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum CHAR:Lcom/j256/ormlite/field/DataType;

.field public static final enum CHAR_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum DATE:Lcom/j256/ormlite/field/DataType;

.field public static final enum DATE_LONG:Lcom/j256/ormlite/field/DataType;

.field public static final enum DATE_STRING:Lcom/j256/ormlite/field/DataType;

.field public static final enum DATE_TIME:Lcom/j256/ormlite/field/DataType;

.field public static final enum DOUBLE:Lcom/j256/ormlite/field/DataType;

.field public static final enum DOUBLE_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum ENUM_INTEGER:Lcom/j256/ormlite/field/DataType;

.field public static final enum ENUM_STRING:Lcom/j256/ormlite/field/DataType;

.field public static final enum FLOAT:Lcom/j256/ormlite/field/DataType;

.field public static final enum FLOAT_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum INTEGER:Lcom/j256/ormlite/field/DataType;

.field public static final enum INTEGER_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum LONG:Lcom/j256/ormlite/field/DataType;

.field public static final enum LONG_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum LONG_STRING:Lcom/j256/ormlite/field/DataType;

.field public static final enum SERIALIZABLE:Lcom/j256/ormlite/field/DataType;

.field public static final enum SHORT:Lcom/j256/ormlite/field/DataType;

.field public static final enum SHORT_OBJ:Lcom/j256/ormlite/field/DataType;

.field public static final enum SQL_DATE:Lcom/j256/ormlite/field/DataType;

.field public static final enum STRING:Lcom/j256/ormlite/field/DataType;

.field public static final enum STRING_BYTES:Lcom/j256/ormlite/field/DataType;

.field public static final enum TIME_STAMP:Lcom/j256/ormlite/field/DataType;

.field public static final enum UNKNOWN:Lcom/j256/ormlite/field/DataType;

.field public static final enum UUID:Lcom/j256/ormlite/field/DataType;


# instance fields
.field private final dataPersister:Lcom/j256/ormlite/field/DataPersister;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 50
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "STRING"

    invoke-static {}, Lcom/j256/ormlite/field/types/StringType;->getSingleton()Lcom/j256/ormlite/field/types/StringType;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->STRING:Lcom/j256/ormlite/field/DataType;

    .line 54
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "LONG_STRING"

    invoke-static {}, Lcom/j256/ormlite/field/types/LongStringType;->getSingleton()Lcom/j256/ormlite/field/types/LongStringType;

    move-result-object v2

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->LONG_STRING:Lcom/j256/ormlite/field/DataType;

    .line 59
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "STRING_BYTES"

    invoke-static {}, Lcom/j256/ormlite/field/types/StringBytesType;->getSingleton()Lcom/j256/ormlite/field/types/StringBytesType;

    move-result-object v2

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->STRING_BYTES:Lcom/j256/ormlite/field/DataType;

    .line 63
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BOOLEAN"

    invoke-static {}, Lcom/j256/ormlite/field/types/BooleanType;->getSingleton()Lcom/j256/ormlite/field/types/BooleanType;

    move-result-object v2

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BOOLEAN:Lcom/j256/ormlite/field/DataType;

    .line 67
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BOOLEAN_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/BooleanObjectType;->getSingleton()Lcom/j256/ormlite/field/types/BooleanObjectType;

    move-result-object v2

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BOOLEAN_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 75
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DATE"

    invoke-static {}, Lcom/j256/ormlite/field/types/DateType;->getSingleton()Lcom/j256/ormlite/field/types/DateType;

    move-result-object v2

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DATE:Lcom/j256/ormlite/field/DataType;

    .line 85
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DATE_LONG"

    invoke-static {}, Lcom/j256/ormlite/field/types/DateLongType;->getSingleton()Lcom/j256/ormlite/field/types/DateLongType;

    move-result-object v2

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DATE_LONG:Lcom/j256/ormlite/field/DataType;

    .line 99
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DATE_STRING"

    invoke-static {}, Lcom/j256/ormlite/field/types/DateStringType;->getSingleton()Lcom/j256/ormlite/field/types/DateStringType;

    move-result-object v2

    const/4 v10, 0x7

    invoke-direct {v0, v1, v10, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DATE_STRING:Lcom/j256/ormlite/field/DataType;

    .line 103
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "CHAR"

    invoke-static {}, Lcom/j256/ormlite/field/types/CharType;->getSingleton()Lcom/j256/ormlite/field/types/CharType;

    move-result-object v2

    const/16 v11, 0x8

    invoke-direct {v0, v1, v11, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->CHAR:Lcom/j256/ormlite/field/DataType;

    .line 107
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "CHAR_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/CharacterObjectType;->getSingleton()Lcom/j256/ormlite/field/types/CharacterObjectType;

    move-result-object v2

    const/16 v12, 0x9

    invoke-direct {v0, v1, v12, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->CHAR_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 111
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BYTE"

    invoke-static {}, Lcom/j256/ormlite/field/types/ByteType;->getSingleton()Lcom/j256/ormlite/field/types/ByteType;

    move-result-object v2

    const/16 v13, 0xa

    invoke-direct {v0, v1, v13, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BYTE:Lcom/j256/ormlite/field/DataType;

    .line 116
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BYTE_ARRAY"

    invoke-static {}, Lcom/j256/ormlite/field/types/ByteArrayType;->getSingleton()Lcom/j256/ormlite/field/types/ByteArrayType;

    move-result-object v2

    const/16 v14, 0xb

    invoke-direct {v0, v1, v14, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BYTE_ARRAY:Lcom/j256/ormlite/field/DataType;

    .line 120
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BYTE_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/ByteObjectType;->getSingleton()Lcom/j256/ormlite/field/types/ByteObjectType;

    move-result-object v2

    const/16 v15, 0xc

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BYTE_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 124
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "SHORT"

    invoke-static {}, Lcom/j256/ormlite/field/types/ShortType;->getSingleton()Lcom/j256/ormlite/field/types/ShortType;

    move-result-object v2

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->SHORT:Lcom/j256/ormlite/field/DataType;

    .line 128
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "SHORT_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/ShortObjectType;->getSingleton()Lcom/j256/ormlite/field/types/ShortObjectType;

    move-result-object v2

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->SHORT_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 132
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "INTEGER"

    invoke-static {}, Lcom/j256/ormlite/field/types/IntType;->getSingleton()Lcom/j256/ormlite/field/types/IntType;

    move-result-object v2

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->INTEGER:Lcom/j256/ormlite/field/DataType;

    .line 136
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "INTEGER_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/IntegerObjectType;->getSingleton()Lcom/j256/ormlite/field/types/IntegerObjectType;

    move-result-object v2

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->INTEGER_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 140
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "LONG"

    invoke-static {}, Lcom/j256/ormlite/field/types/LongType;->getSingleton()Lcom/j256/ormlite/field/types/LongType;

    move-result-object v2

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->LONG:Lcom/j256/ormlite/field/DataType;

    .line 144
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "LONG_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/LongObjectType;->getSingleton()Lcom/j256/ormlite/field/types/LongObjectType;

    move-result-object v2

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->LONG_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 148
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "FLOAT"

    invoke-static {}, Lcom/j256/ormlite/field/types/FloatType;->getSingleton()Lcom/j256/ormlite/field/types/FloatType;

    move-result-object v2

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->FLOAT:Lcom/j256/ormlite/field/DataType;

    .line 152
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "FLOAT_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/FloatObjectType;->getSingleton()Lcom/j256/ormlite/field/types/FloatObjectType;

    move-result-object v2

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->FLOAT_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 156
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DOUBLE"

    invoke-static {}, Lcom/j256/ormlite/field/types/DoubleType;->getSingleton()Lcom/j256/ormlite/field/types/DoubleType;

    move-result-object v2

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DOUBLE:Lcom/j256/ormlite/field/DataType;

    .line 160
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DOUBLE_OBJ"

    invoke-static {}, Lcom/j256/ormlite/field/types/DoubleObjectType;->getSingleton()Lcom/j256/ormlite/field/types/DoubleObjectType;

    move-result-object v2

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DOUBLE_OBJ:Lcom/j256/ormlite/field/DataType;

    .line 166
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "SERIALIZABLE"

    invoke-static {}, Lcom/j256/ormlite/field/types/SerializableType;->getSingleton()Lcom/j256/ormlite/field/types/SerializableType;

    move-result-object v2

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->SERIALIZABLE:Lcom/j256/ormlite/field/DataType;

    .line 170
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "ENUM_STRING"

    invoke-static {}, Lcom/j256/ormlite/field/types/EnumStringType;->getSingleton()Lcom/j256/ormlite/field/types/EnumStringType;

    move-result-object v2

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->ENUM_STRING:Lcom/j256/ormlite/field/DataType;

    .line 175
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "ENUM_INTEGER"

    invoke-static {}, Lcom/j256/ormlite/field/types/EnumIntegerType;->getSingleton()Lcom/j256/ormlite/field/types/EnumIntegerType;

    move-result-object v2

    const/16 v15, 0x19

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->ENUM_INTEGER:Lcom/j256/ormlite/field/DataType;

    .line 179
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "UUID"

    invoke-static {}, Lcom/j256/ormlite/field/types/UuidType;->getSingleton()Lcom/j256/ormlite/field/types/UuidType;

    move-result-object v2

    const/16 v15, 0x1a

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->UUID:Lcom/j256/ormlite/field/DataType;

    .line 183
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BIG_INTEGER"

    invoke-static {}, Lcom/j256/ormlite/field/types/BigIntegerType;->getSingleton()Lcom/j256/ormlite/field/types/BigIntegerType;

    move-result-object v2

    const/16 v15, 0x1b

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BIG_INTEGER:Lcom/j256/ormlite/field/DataType;

    .line 187
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BIG_DECIMAL"

    invoke-static {}, Lcom/j256/ormlite/field/types/BigDecimalStringType;->getSingleton()Lcom/j256/ormlite/field/types/BigDecimalStringType;

    move-result-object v2

    const/16 v15, 0x1c

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BIG_DECIMAL:Lcom/j256/ormlite/field/DataType;

    .line 191
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "BIG_DECIMAL_NUMERIC"

    invoke-static {}, Lcom/j256/ormlite/field/types/BigDecimalNumericType;->getSingleton()Lcom/j256/ormlite/field/types/BigDecimalNumericType;

    move-result-object v2

    const/16 v15, 0x1d

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->BIG_DECIMAL_NUMERIC:Lcom/j256/ormlite/field/DataType;

    .line 197
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "DATE_TIME"

    invoke-static {}, Lcom/j256/ormlite/field/types/DateTimeType;->getSingleton()Lcom/j256/ormlite/field/types/DateTimeType;

    move-result-object v2

    const/16 v15, 0x1e

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->DATE_TIME:Lcom/j256/ormlite/field/DataType;

    .line 205
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "SQL_DATE"

    invoke-static {}, Lcom/j256/ormlite/field/types/SqlDateType;->getSingleton()Lcom/j256/ormlite/field/types/SqlDateType;

    move-result-object v2

    const/16 v15, 0x1f

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->SQL_DATE:Lcom/j256/ormlite/field/DataType;

    .line 209
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "TIME_STAMP"

    invoke-static {}, Lcom/j256/ormlite/field/types/TimeStampType;->getSingleton()Lcom/j256/ormlite/field/types/TimeStampType;

    move-result-object v2

    const/16 v15, 0x20

    invoke-direct {v0, v1, v15, v2}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->TIME_STAMP:Lcom/j256/ormlite/field/DataType;

    .line 213
    new-instance v0, Lcom/j256/ormlite/field/DataType;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x21

    const/4 v15, 0x0

    invoke-direct {v0, v1, v2, v15}, Lcom/j256/ormlite/field/DataType;-><init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V

    sput-object v0, Lcom/j256/ormlite/field/DataType;->UNKNOWN:Lcom/j256/ormlite/field/DataType;

    const/16 v0, 0x22

    .line 45
    new-array v0, v0, [Lcom/j256/ormlite/field/DataType;

    sget-object v1, Lcom/j256/ormlite/field/DataType;->STRING:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/j256/ormlite/field/DataType;->LONG_STRING:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/j256/ormlite/field/DataType;->STRING_BYTES:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BOOLEAN:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BOOLEAN_OBJ:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DATE:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DATE_LONG:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DATE_STRING:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/j256/ormlite/field/DataType;->CHAR:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/j256/ormlite/field/DataType;->CHAR_OBJ:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BYTE:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BYTE_ARRAY:Lcom/j256/ormlite/field/DataType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BYTE_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->SHORT:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->SHORT_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->INTEGER:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->INTEGER_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->LONG:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->LONG_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->FLOAT:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->FLOAT_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DOUBLE:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DOUBLE_OBJ:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->SERIALIZABLE:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->ENUM_STRING:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->ENUM_INTEGER:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->UUID:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BIG_INTEGER:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BIG_DECIMAL:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->BIG_DECIMAL_NUMERIC:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->DATE_TIME:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->SQL_DATE:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->TIME_STAMP:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/j256/ormlite/field/DataType;->UNKNOWN:Lcom/j256/ormlite/field/DataType;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sput-object v0, Lcom/j256/ormlite/field/DataType;->$VALUES:[Lcom/j256/ormlite/field/DataType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/j256/ormlite/field/DataPersister;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/field/DataPersister;",
            ")V"
        }
    .end annotation

    .line 219
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 220
    iput-object p3, p0, Lcom/j256/ormlite/field/DataType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/j256/ormlite/field/DataType;
    .locals 1

    .line 45
    const-class v0, Lcom/j256/ormlite/field/DataType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/j256/ormlite/field/DataType;

    return-object p0
.end method

.method public static values()[Lcom/j256/ormlite/field/DataType;
    .locals 1

    .line 45
    sget-object v0, Lcom/j256/ormlite/field/DataType;->$VALUES:[Lcom/j256/ormlite/field/DataType;

    invoke-virtual {v0}, [Lcom/j256/ormlite/field/DataType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/j256/ormlite/field/DataType;

    return-object v0
.end method


# virtual methods
.method public getDataPersister()Lcom/j256/ormlite/field/DataPersister;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/j256/ormlite/field/DataType;->dataPersister:Lcom/j256/ormlite/field/DataPersister;

    return-object v0
.end method
