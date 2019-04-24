.class public interface abstract Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;
.super Ljava/lang/Object;
.source "TiffDirectoryConstants.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;
    }
.end annotation


# static fields
.field public static final DIRECTORY_TYPE_DIR_0:I = 0x0

.field public static final DIRECTORY_TYPE_DIR_1:I = 0x1

.field public static final DIRECTORY_TYPE_DIR_2:I = 0x2

.field public static final DIRECTORY_TYPE_DIR_3:I = 0x3

.field public static final DIRECTORY_TYPE_DIR_4:I = 0x4

.field public static final DIRECTORY_TYPE_EXIF:I = -0x2

.field public static final DIRECTORY_TYPE_GPS:I = -0x3

.field public static final DIRECTORY_TYPE_INTEROPERABILITY:I = -0x4

.field public static final DIRECTORY_TYPE_MAKER_NOTES:I = -0x5

.field public static final DIRECTORY_TYPE_ROOT:I = 0x0

.field public static final DIRECTORY_TYPE_SUB:I = 0x1

.field public static final DIRECTORY_TYPE_SUB0:I = 0x1

.field public static final DIRECTORY_TYPE_SUB1:I = 0x2

.field public static final DIRECTORY_TYPE_SUB2:I = 0x3

.field public static final DIRECTORY_TYPE_THUMBNAIL:I = 0x2

.field public static final DIRECTORY_TYPE_UNKNOWN:I = -0x1

.field public static final EXIF_DIRECTORIES:[Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_EXIF_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_GPS:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_INTEROP_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_MAKER_NOTES:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_SUB_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_SUB_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_SUB_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final TIFF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final TIFF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

.field public static final TIFF_DIRECTORY_ROOT:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 81
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;

    const-string v1, "IFD0"

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 83
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 84
    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_ROOT:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 86
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;

    const-string v1, "IFD1"

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 88
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 90
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;

    const-string v1, "IFD2"

    const/4 v4, 0x2

    invoke-direct {v0, v4, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 92
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 94
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;

    const-string v1, "IFD3"

    const/4 v5, 0x3

    invoke-direct {v0, v5, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Image;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 96
    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD3:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 98
    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 99
    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sput-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 100
    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 102
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;

    const-string v1, "Interop IFD"

    const/4 v6, -0x4

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_INTEROP_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 104
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;

    const-string v1, "Maker Notes"

    const/4 v6, -0x5

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_MAKER_NOTES:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 106
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;

    const-string v1, "Exif IFD"

    const/4 v6, -0x2

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_EXIF_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    .line 108
    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;

    const-string v1, "GPS IFD"

    const/4 v6, -0x3

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType$Special;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_GPS:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/4 v0, 0x0

    .line 111
    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_UNKNOWN:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v0, 0xe

    .line 113
    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_ROOT:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_EXIF_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD0:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    aput-object v1, v0, v5

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->TIFF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_INTEROP_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_MAKER_NOTES:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD1:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_SUB_IFD2:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORY_GPS:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;->EXIF_DIRECTORIES:[Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    return-void
.end method
