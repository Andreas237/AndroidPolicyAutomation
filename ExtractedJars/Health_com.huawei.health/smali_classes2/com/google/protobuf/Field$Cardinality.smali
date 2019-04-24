.class public final enum Lcom/google/protobuf/Field$Cardinality;
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
    name = "Cardinality"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/google/protobuf/Field$Cardinality;>;Lcom/google/protobuf/ProtocolMessageEnum;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/protobuf/Field$Cardinality;

.field public static final enum CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_OPTIONAL_VALUE:I = 0x1

.field public static final enum CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_REPEATED_VALUE:I = 0x3

.field public static final enum CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_REQUIRED_VALUE:I = 0x2

.field public static final enum CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

.field public static final CARDINALITY_UNKNOWN_VALUE:I = 0x0

.field public static final enum UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

.field private static final VALUES:[Lcom/google/protobuf/Field$Cardinality;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<Lcom/google/protobuf/Field$Cardinality;>;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 576
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    const-string v1, "CARDINALITY_UNKNOWN"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    .line 584
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    const-string v1, "CARDINALITY_OPTIONAL"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    .line 592
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    const-string v1, "CARDINALITY_REQUIRED"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    .line 600
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    const-string v1, "CARDINALITY_REPEATED"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    .line 601
    new-instance v0, Lcom/google/protobuf/Field$Cardinality;

    const-string v1, "UNRECOGNIZED"

    const/4 v2, 0x4

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/Field$Cardinality;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    .line 567
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/protobuf/Field$Cardinality;

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->$VALUES:[Lcom/google/protobuf/Field$Cardinality;

    .line 669
    new-instance v0, Lcom/google/protobuf/Field$Cardinality$1;

    invoke-direct {v0}, Lcom/google/protobuf/Field$Cardinality$1;-><init>()V

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    .line 689
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->values()[Lcom/google/protobuf/Field$Cardinality;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/Field$Cardinality;->VALUES:[Lcom/google/protobuf/Field$Cardinality;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 705
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 706
    iput p3, p0, Lcom/google/protobuf/Field$Cardinality;->value:I

    .line 707
    return-void
.end method

.method public static forNumber(I)Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 655
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 656
    :pswitch_0
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_UNKNOWN:Lcom/google/protobuf/Field$Cardinality;

    return-object v0

    .line 657
    :pswitch_1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_OPTIONAL:Lcom/google/protobuf/Field$Cardinality;

    return-object v0

    .line 658
    :pswitch_2
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REQUIRED:Lcom/google/protobuf/Field$Cardinality;

    return-object v0

    .line 659
    :pswitch_3
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->CARDINALITY_REPEATED:Lcom/google/protobuf/Field$Cardinality;

    return-object v0

    .line 660
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 2

    .line 686
    invoke-static {}, Lcom/google/protobuf/Field;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getEnumTypes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Descriptors$EnumDescriptor;

    return-object v0
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Internal$EnumLiteMap<Lcom/google/protobuf/Field$Cardinality;>;"
        }
    .end annotation

    .line 666
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-object v0
.end method

.method public static valueOf(I)Lcom/google/protobuf/Field$Cardinality;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 651
    invoke-static {p0}, Lcom/google/protobuf/Field$Cardinality;->forNumber(I)Lcom/google/protobuf/Field$Cardinality;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Lcom/google/protobuf/Descriptors$EnumValueDescriptor;)Lcom/google/protobuf/Field$Cardinality;
    .locals 2

    .line 693
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 694
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "EnumValueDescriptor is not for this type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 697
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 698
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    return-object v0

    .line 700
    :cond_1
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->VALUES:[Lcom/google/protobuf/Field$Cardinality;

    invoke-virtual {p0}, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 567
    const-class v0, Lcom/google/protobuf/Field$Cardinality;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Field$Cardinality;

    return-object v0
.end method

.method public static values()[Lcom/google/protobuf/Field$Cardinality;
    .locals 1

    .line 567
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->$VALUES:[Lcom/google/protobuf/Field$Cardinality;

    invoke-virtual {v0}, [Lcom/google/protobuf/Field$Cardinality;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/Field$Cardinality;

    return-object v0
.end method


# virtual methods
.method public final getDescriptorForType()Lcom/google/protobuf/Descriptors$EnumDescriptor;
    .locals 1

    .line 682
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final getNumber()I
    .locals 2

    .line 639
    sget-object v0, Lcom/google/protobuf/Field$Cardinality;->UNRECOGNIZED:Lcom/google/protobuf/Field$Cardinality;

    if-ne p0, v0, :cond_0

    .line 640
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 643
    :cond_0
    iget v0, p0, Lcom/google/protobuf/Field$Cardinality;->value:I

    return v0
.end method

.method public final getValueDescriptor()Lcom/google/protobuf/Descriptors$EnumValueDescriptor;
    .locals 2

    .line 678
    invoke-static {}, Lcom/google/protobuf/Field$Cardinality;->getDescriptor()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->getValues()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/protobuf/Field$Cardinality;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    return-object v0
.end method
