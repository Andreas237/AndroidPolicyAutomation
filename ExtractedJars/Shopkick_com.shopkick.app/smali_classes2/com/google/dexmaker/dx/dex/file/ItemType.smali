.class public final enum Lcom/google/dexmaker/dx/dex/file/ItemType;
.super Ljava/lang/Enum;
.source "ItemType.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ToHuman;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/dexmaker/dx/dex/file/ItemType;",
        ">;",
        "Lcom/google/dexmaker/dx/util/ToHuman;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_REF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ANNOTATION_SET_REF_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_CLASS_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_CLASS_DEF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_CODE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_DEBUG_INFO_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_ENCODED_ARRAY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_EXCEPTION_HANDLER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_FIELD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_HEADER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_MAP_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_MAP_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_METHOD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_PROTO_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_STRING_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_STRING_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

.field public static final enum TYPE_TYPE_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;


# instance fields
.field private final humanName:Ljava/lang/String;

.field private final mapValue:I

.field private final typeName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 25
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_HEADER_ITEM"

    const-string v2, "header_item"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v3, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_HEADER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 26
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_STRING_ID_ITEM"

    const-string/jumbo v2, "string_id_item"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v4, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_STRING_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 27
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_TYPE_ID_ITEM"

    const-string/jumbo v2, "type_id_item"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v5, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 28
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_PROTO_ID_ITEM"

    const-string v2, "proto_id_item"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v6, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_PROTO_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 29
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_FIELD_ID_ITEM"

    const-string v2, "field_id_item"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v7, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_FIELD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 30
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_METHOD_ID_ITEM"

    const-string v2, "method_id_item"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v8, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_METHOD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 31
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_CLASS_DEF_ITEM"

    const-string v2, "class_def_item"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v9, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CLASS_DEF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 32
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_MAP_LIST"

    const-string v2, "map_list"

    const/4 v10, 0x7

    const/16 v11, 0x1000

    invoke-direct {v0, v1, v10, v11, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 33
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_TYPE_LIST"

    const-string/jumbo v2, "type_list"

    const/16 v11, 0x8

    const/16 v12, 0x1001

    invoke-direct {v0, v1, v11, v12, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 34
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ANNOTATION_SET_REF_LIST"

    const-string v2, "annotation_set_ref_list"

    const/16 v12, 0x9

    const/16 v13, 0x1002

    invoke-direct {v0, v1, v12, v13, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 35
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ANNOTATION_SET_ITEM"

    const-string v2, "annotation_set_item"

    const/16 v13, 0xa

    const/16 v14, 0x1003

    invoke-direct {v0, v1, v13, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 36
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_CLASS_DATA_ITEM"

    const-string v2, "class_data_item"

    const/16 v14, 0xb

    const/16 v15, 0x2000

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CLASS_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 37
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_CODE_ITEM"

    const-string v2, "code_item"

    const/16 v15, 0xc

    const/16 v14, 0x2001

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 38
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_STRING_DATA_ITEM"

    const-string/jumbo v2, "string_data_item"

    const/16 v14, 0xd

    const/16 v15, 0x2002

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_STRING_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 39
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_DEBUG_INFO_ITEM"

    const-string v2, "debug_info_item"

    const/16 v15, 0xe

    const/16 v14, 0x2003

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_DEBUG_INFO_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 40
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ANNOTATION_ITEM"

    const-string v2, "annotation_item"

    const/16 v14, 0xf

    const/16 v15, 0x2004

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 41
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ENCODED_ARRAY_ITEM"

    const-string v2, "encoded_array_item"

    const/16 v14, 0x10

    const/16 v15, 0x2005

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ENCODED_ARRAY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 42
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ANNOTATIONS_DIRECTORY_ITEM"

    const-string v2, "annotations_directory_item"

    const/16 v14, 0x11

    const/16 v15, 0x2006

    invoke-direct {v0, v1, v14, v15, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 43
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_MAP_ITEM"

    const-string v2, "map_item"

    const/4 v14, -0x1

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_MAP_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 44
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_TYPE_ITEM"

    const-string/jumbo v2, "type_item"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 45
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_EXCEPTION_HANDLER_ITEM"

    const-string v2, "exception_handler_item"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_EXCEPTION_HANDLER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    .line 46
    new-instance v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    const-string v1, "TYPE_ANNOTATION_SET_REF_ITEM"

    const-string v2, "annotation_set_ref_item"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15, v14, v2}, Lcom/google/dexmaker/dx/dex/file/ItemType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v0, 0x16

    .line 24
    new-array v0, v0, [Lcom/google/dexmaker/dx/dex/file/ItemType;

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_HEADER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_STRING_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_PROTO_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_FIELD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_METHOD_ID_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CLASS_DEF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_MAP_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_LIST:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CLASS_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_CODE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_STRING_DATA_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_DEBUG_INFO_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ENCODED_ARRAY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATIONS_DIRECTORY_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_MAP_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_TYPE_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_EXCEPTION_HANDLER_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/dexmaker/dx/dex/file/ItemType;->TYPE_ANNOTATION_SET_REF_ITEM:Lcom/google/dexmaker/dx/dex/file/ItemType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->$VALUES:[Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 64
    iput p3, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->mapValue:I

    .line 65
    iput-object p4, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->typeName:Ljava/lang/String;

    const-string p1, "_item"

    .line 69
    invoke-virtual {p4, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 70
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, -0x5

    invoke-virtual {p4, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p4

    :cond_0
    const/16 p1, 0x5f

    const/16 p2, 0x20

    .line 72
    invoke-virtual {p4, p1, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->humanName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 24
    const-class v0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object p0
.end method

.method public static values()[Lcom/google/dexmaker/dx/dex/file/ItemType;
    .locals 1

    .line 24
    sget-object v0, Lcom/google/dexmaker/dx/dex/file/ItemType;->$VALUES:[Lcom/google/dexmaker/dx/dex/file/ItemType;

    invoke-virtual {v0}, [Lcom/google/dexmaker/dx/dex/file/ItemType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/dexmaker/dx/dex/file/ItemType;

    return-object v0
.end method


# virtual methods
.method public getMapValue()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->mapValue:I

    return v0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/file/ItemType;->humanName:Ljava/lang/String;

    return-object v0
.end method
