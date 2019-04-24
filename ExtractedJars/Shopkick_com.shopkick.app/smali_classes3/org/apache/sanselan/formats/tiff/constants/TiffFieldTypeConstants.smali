.class public interface abstract Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;
.super Ljava/lang/Object;
.source "TiffFieldTypeConstants.java"

# interfaces
.implements Lorg/apache/sanselan/SanselanConstants;


# static fields
.field public static final FIELD_TYPES:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_ANY:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

.field public static final FIELD_TYPE_BYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

.field public static final FIELD_TYPE_DESCRIPTION_ANY:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_ASCII:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_BYTE:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_BYTE_OR_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_LONG:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_LONG_OR_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_RATIONAL:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DESCRIPTION_UNKNOWN:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_DOUBLE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_FLOAT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

.field public static final FIELD_TYPE_RATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

.field public static final FIELD_TYPE_SBYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_SHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

.field public static final FIELD_TYPE_SLONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_SRATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_SSHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_UNDEFINED:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final FIELD_TYPE_UNKNOWN:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 33
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const-string v1, "Byte"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_BYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    .line 36
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    const-string v1, "ASCII"

    const/4 v3, 0x2

    invoke-direct {v0, v3, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    .line 39
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    const-string v1, "Short"

    const/4 v4, 0x3

    invoke-direct {v0, v4, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    .line 42
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const-string v1, "Long"

    const/4 v5, 0x4

    invoke-direct {v0, v5, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    .line 45
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    const-string v1, "Rational"

    const/4 v6, 0x5

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_RATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    .line 48
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const-string v1, "SByte"

    const/4 v7, 0x6

    invoke-direct {v0, v7, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SBYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 50
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const-string v1, "Undefined"

    const/4 v8, 0x7

    invoke-direct {v0, v8, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_UNDEFINED:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 52
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    const-string v1, "SShort"

    const/16 v9, 0x8

    invoke-direct {v0, v9, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SSHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 55
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const-string v1, "SLong"

    const/16 v10, 0x9

    invoke-direct {v0, v10, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SLONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 58
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    const-string v1, "SRational"

    const/16 v11, 0xa

    invoke-direct {v0, v11, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SRATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 61
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_FLOAT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 63
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DOUBLE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 65
    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_UNKNOWN:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/16 v0, 0xc

    .line 67
    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_BYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const/4 v12, 0x0

    aput-object v1, v0, v12

    sget-object v13, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    aput-object v13, v0, v2

    sget-object v14, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v14, v0, v3

    sget-object v15, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    aput-object v15, v0, v4

    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_RATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    aput-object v4, v0, v5

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SBYTE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v6

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_UNDEFINED:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v7

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SSHORT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v8

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SLONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v9

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_SRATIONAL:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v10

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_FLOAT:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v5, v0, v11

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DOUBLE:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/16 v6, 0xb

    aput-object v5, v0, v6

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPES:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 74
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPES:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_ANY:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 76
    new-array v0, v2, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v15, v0, v12

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_LONG:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 79
    new-array v0, v2, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v14, v0, v12

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 82
    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v14, v0, v12

    aput-object v15, v0, v2

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_SHORT_OR_LONG:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 85
    new-array v0, v2, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v13, v0, v12

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_ASCII:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 88
    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v14, v0, v12

    aput-object v15, v0, v2

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_LONG_OR_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 91
    new-array v0, v2, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v4, v0, v12

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_RATIONAL:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 94
    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v14, v0, v12

    aput-object v1, v0, v2

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_BYTE_OR_SHORT:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 97
    new-array v0, v2, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v1, v0, v12

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_BYTE:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 100
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_ANY:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_ANY:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v0, 0x0

    .line 101
    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->FIELD_TYPE_DESCRIPTION_UNKNOWN:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    return-void
.end method
