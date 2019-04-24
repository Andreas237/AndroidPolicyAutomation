.class public final enum Lcom/google/protobuf/Field$Kind;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/ProtocolMessageEnum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/Field;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Kind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/google/protobuf/Field$Kind;>;Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/Field$Kind;

.field public static final enum TYPE_BOOL:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_BOOL_VALUE:I = 0x8

.field public static final enum TYPE_BYTES:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_BYTES_VALUE:I = 0xc

.field public static final enum TYPE_DOUBLE:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_DOUBLE_VALUE:I = 0x1

.field public static final enum TYPE_ENUM:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_ENUM_VALUE:I = 0xe

.field public static final enum TYPE_FIXED32:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_FIXED32_VALUE:I = 0x7

.field public static final enum TYPE_FIXED64:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_FIXED64_VALUE:I = 0x6

.field public static final enum TYPE_FLOAT:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_FLOAT_VALUE:I = 0x2

.field public static final enum TYPE_GROUP:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_GROUP_VALUE:I = 0xa

.field public static final enum TYPE_INT32:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_INT32_VALUE:I = 0x5

.field public static final enum TYPE_INT64:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_INT64_VALUE:I = 0x3

.field public static final enum TYPE_MESSAGE:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_MESSAGE_VALUE:I = 0xb

.field public static final enum TYPE_SFIXED32:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_SFIXED32_VALUE:I = 0xf

.field public static final enum TYPE_SFIXED64:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_SFIXED64_VALUE:I = 0x10

.field public static final enum TYPE_SINT32:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_SINT32_VALUE:I = 0x11

.field public static final enum TYPE_SINT64:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_SINT64_VALUE:I = 0x12

.field public static final enum TYPE_STRING:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_STRING_VALUE:I = 0x9

.field public static final enum TYPE_UINT32:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_UINT32_VALUE:I = 0xd

.field public static final enum TYPE_UINT64:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_UINT64_VALUE:I = 0x4

.field public static final enum TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

.field public static final TYPE_UNKNOWN_VALUE:I = 0x0

.field public static final enum UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

.field private static final VALUES:[Lcom/google/protobuf/Field$Kind;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<Lcom/google/protobuf/Field$Kind;>;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 169
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    .line 177
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_DOUBLE"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_DOUBLE:Lcom/google/protobuf/Field$Kind;

    .line 185
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_FLOAT"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FLOAT:Lcom/google/protobuf/Field$Kind;

    .line 193
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_INT64"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_INT64:Lcom/google/protobuf/Field$Kind;

    .line 201
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_UINT64"

    const/4 v2, 0x4

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UINT64:Lcom/google/protobuf/Field$Kind;

    .line 209
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_INT32"

    const/4 v2, 0x5

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_INT32:Lcom/google/protobuf/Field$Kind;

    .line 217
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_FIXED64"

    const/4 v2, 0x6

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED64:Lcom/google/protobuf/Field$Kind;

    .line 225
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_FIXED32"

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED32:Lcom/google/protobuf/Field$Kind;

    .line 233
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_BOOL"

    const/16 v2, 0x8

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_BOOL:Lcom/google/protobuf/Field$Kind;

    .line 241
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_STRING"

    const/16 v2, 0x9

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_STRING:Lcom/google/protobuf/Field$Kind;

    .line 249
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_GROUP"

    const/16 v2, 0xa

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_GROUP:Lcom/google/protobuf/Field$Kind;

    .line 257
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_MESSAGE"

    const/16 v2, 0xb

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_MESSAGE:Lcom/google/protobuf/Field$Kind;

    .line 265
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_BYTES"

    const/16 v2, 0xc

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_BYTES:Lcom/google/protobuf/Field$Kind;

    .line 273
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_UINT32"

    const/16 v2, 0xd

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UINT32:Lcom/google/protobuf/Field$Kind;

    .line 281
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_ENUM"

    const/16 v2, 0xe

    const/16 v3, 0xe

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_ENUM:Lcom/google/protobuf/Field$Kind;

    .line 289
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_SFIXED32"

    const/16 v2, 0xf

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED32:Lcom/google/protobuf/Field$Kind;

    .line 297
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_SFIXED64"

    const/16 v2, 0x10

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED64:Lcom/google/protobuf/Field$Kind;

    .line 305
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_SINT32"

    const/16 v2, 0x11

    const/16 v3, 0x11

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SINT32:Lcom/google/protobuf/Field$Kind;

    .line 313
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "TYPE_SINT64"

    const/16 v2, 0x12

    const/16 v3, 0x12

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SINT64:Lcom/google/protobuf/Field$Kind;

    .line 314
    new-instance v0, Lcom/google/protobuf/Field$Kind;

    const-string v1, "UNRECOGNIZED"

    const/16 v2, 0x13

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    .line 160
    const/16 v0, 0x14

    new-array v0, v0, [Lcom/google/protobuf/Field$Kind;

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_DOUBLE:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_FLOAT:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_INT64:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UINT64:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_INT32:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED64:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED32:Lcom/google/protobuf/Field$Kind;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_BOOL:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_STRING:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_GROUP:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_MESSAGE:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_BYTES:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_UINT32:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_ENUM:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED32:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED64:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_SINT32:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->TYPE_SINT64:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/protobuf/Field$Kind;->$VALUES:[Lcom/google/protobuf/Field$Kind;

    .line 517
    new-instance v0, Lcom/google/protobuf/Field$Kind$1;

    invoke-direct {v0}, Lcom/google/protobuf/Field$Kind$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Field$Kind;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 537
    invoke-static {}, Lcom/google/protobuf/Field$Kind;->values()[Lcom/google/protobuf/Field$Kind;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/Field$Kind;->VALUES:[Lcom/google/protobuf/Field$Kind;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 553
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 554
    iput p3, p0, Lcom/google/protobuf/Field$Kind;->value:I

    .line 555
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/Field$Kind;
    .locals 1

    .line 488
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 489
    :pswitch_0
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UNKNOWN:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 490
    :pswitch_1
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_DOUBLE:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 491
    :pswitch_2
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FLOAT:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 492
    :pswitch_3
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_INT64:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 493
    :pswitch_4
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UINT64:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 494
    :pswitch_5
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_INT32:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 495
    :pswitch_6
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED64:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 496
    :pswitch_7
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_FIXED32:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 497
    :pswitch_8
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_BOOL:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 498
    :pswitch_9
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_STRING:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 499
    :pswitch_a
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_GROUP:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 500
    :pswitch_b
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_MESSAGE:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 501
    :pswitch_c
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_BYTES:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 502
    :pswitch_d
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_UINT32:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 503
    :pswitch_e
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_ENUM:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 504
    :pswitch_f
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED32:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 505
    :pswitch_10
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SFIXED64:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 506
    :pswitch_11
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SINT32:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 507
    :pswitch_12
    sget-object v0, Lcom/google/protobuf/Field$Kind;->TYPE_SINT64:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 508
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
    .end packed-switch
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 2

    .line 534
    invoke-static {}, Lcom/google/protobuf/Field;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getEnumTypes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Descriptors$EnumDescriptor;

    return-object v0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Internal$EnumLiteMap<Lcom/google/protobuf/Field$Kind;>;"
        }
    .end annotation

    .line 514
    sget-object v0, Lcom/google/protobuf/Field$Kind;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/Field$Kind;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 484
    invoke-static {p0}, Lcom/google/protobuf/Field$Kind;->forNumber(I)Lcom/google/protobuf/Field$Kind;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/google/protobuf/Field$Kind;
    .locals 2

    .line 541
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/google/protobuf/Field$Kind;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 542
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "EnumValueDescriptor is not for this type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 545
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 546
    sget-object v0, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    return-object v0

    .line 548
    :cond_1
    sget-object v0, Lcom/google/protobuf/Field$Kind;->VALUES:[Lcom/google/protobuf/Field$Kind;

    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/Field$Kind;
    .locals 1

    .line 160
    const-class v0, Lcom/google/protobuf/Field$Kind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field$Kind;

    return-object v0
.end method

.method public static values()[Lcom/google/protobuf/Field$Kind;
    .locals 1

    .line 160
    sget-object v0, Lcom/google/protobuf/Field$Kind;->$VALUES:[Lcom/google/protobuf/Field$Kind;

    invoke-virtual {v0}, [Lcom/google/protobuf/Field$Kind;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/Field$Kind;

    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 530
    invoke-static {}, Lcom/google/protobuf/Field$Kind;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final getNumber()I
    .locals 2

    .line 472
    sget-object v0, Lcom/google/protobuf/Field$Kind;->UNRECOGNIZED:Lcom/google/protobuf/Field$Kind;

    if-ne p0, v0, :cond_0

    .line 473
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 476
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Field$Kind;->value:I

    return v0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/Descriptors$EnumValueDescriptor;
    .locals 2

    .line 526
    invoke-static {}, Lcom/google/protobuf/Field$Kind;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/Field$Kind;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    return-object v0
.end method
