.class public final Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
.super Lcom/google/protobuf/GeneratedMessage$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessage$Builder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;>;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntryOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private doubleValue_:D

.field private floatValue_:F

.field private intValue_:I

.field private integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;>;"
        }
    .end annotation
.end field

.field private integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

.field private key_:Ljava/lang/Object;

.field private longValue_:J

.field private mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;>;"
        }
    .end annotation
.end field

.field private mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

.field private stringValue_:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 19823
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>()V

    .line 20007
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20179
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20255
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20403
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19824
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->maybeForceBuilderInitialization()V

    .line 19825
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V
    .locals 1

    .line 19829
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    .line 20007
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20179
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20255
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20403
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19830
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->maybeForceBuilderInitialization()V

    .line 19831
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V
    .locals 0

    .line 19806
    invoke-direct {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;-><init>(Lcom/google/protobuf/GeneratedMessage$BuilderParent;)V

    return-void
.end method

.method static synthetic access$27000()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19806
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method private static create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19839
    new-instance v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    invoke-direct {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;-><init>()V

    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 19812
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$26700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method private getIntegerMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;>;"
        }
    .end annotation

    .line 20508
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20509
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 20511
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v1

    .line 20512
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 20513
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 20514
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20516
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private getMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/SingleFieldBuilder<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;>;"
        }
    .end annotation

    .line 20360
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20361
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilder;

    .line 20363
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v1

    .line 20364
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessage$BuilderParent;

    move-result-object v2

    .line 20365
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->isClean()Z

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilder;-><init>(Lcom/google/protobuf/GeneratedMessage;Lcom/google/protobuf/GeneratedMessage$BuilderParent;Z)V

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    .line 20366
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20368
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 19833
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27200()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19834
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 19835
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getIntegerMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    .line 19837
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 2

    .line 19885
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    .line 19886
    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 19887
    invoke-static {v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 19889
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 5

    .line 19893
    new-instance v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;-><init>(Lcom/google/protobuf/GeneratedMessage$Builder;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$1;)V

    .line 19894
    iget v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19895
    const/4 v4, 0x0

    .line 19896
    and-int/lit8 v0, v3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 19897
    const/4 v4, 0x1

    .line 19899
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27402(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19900
    and-int/lit8 v0, v3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 19901
    or-int/lit8 v4, v4, 0x2

    .line 19903
    :cond_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->intValue_:I

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27502(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;I)I

    .line 19904
    and-int/lit8 v0, v3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 19905
    or-int/lit8 v4, v4, 0x4

    .line 19907
    :cond_2
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->longValue_:J

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27602(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;J)J

    .line 19908
    and-int/lit8 v0, v3, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 19909
    or-int/lit8 v4, v4, 0x8

    .line 19911
    :cond_3
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->doubleValue_:D

    invoke-static {v2, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27702(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;D)D

    .line 19912
    and-int/lit8 v0, v3, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_4

    .line 19913
    or-int/lit8 v4, v4, 0x10

    .line 19915
    :cond_4
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27802(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19916
    and-int/lit8 v0, v3, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 19917
    or-int/lit8 v4, v4, 0x20

    .line 19919
    :cond_5
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_6

    .line 19920
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    goto :goto_0

    .line 19922
    :cond_6
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27902(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 19924
    :goto_0
    and-int/lit8 v0, v3, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_7

    .line 19925
    or-int/lit8 v4, v4, 0x40

    .line 19927
    :cond_7
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->floatValue_:F

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28002(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;F)F

    .line 19928
    and-int/lit16 v0, v3, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_8

    .line 19929
    or-int/lit16 v4, v4, 0x80

    .line 19931
    :cond_8
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_9

    .line 19932
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    goto :goto_1

    .line 19934
    :cond_9
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->build()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28102(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 19936
    :goto_1
    invoke-static {v2, v4}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28202(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;I)I

    .line 19937
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onBuilt()V

    .line 19938
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 19843
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->clear()Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 19844
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19845
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19846
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->intValue_:I

    .line 19847
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19848
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->longValue_:J

    .line 19849
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19850
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->doubleValue_:D

    .line 19851
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19852
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 19853
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19854
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 19855
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    goto :goto_0

    .line 19857
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 19859
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19860
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->floatValue_:F

    .line 19861
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19862
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 19863
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    goto :goto_1

    .line 19865
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 19867
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19868
    return-object p0
.end method

.method public clearDoubleValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20173
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20174
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->doubleValue_:D

    .line 20175
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20176
    return-object p0
.end method

.method public clearFloatValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20397
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20398
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->floatValue_:F

    .line 20399
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20400
    return-object p0
.end method

.method public clearIntValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20109
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20110
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->intValue_:I

    .line 20111
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20112
    return-object p0
.end method

.method public clearIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20475
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20476
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20477
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20479
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 20481
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20482
    return-object p0
.end method

.method public clearKey()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20064
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20065
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getKey()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20066
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20067
    return-object p0
.end method

.method public clearLongValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20141
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20142
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->longValue_:J

    .line 20143
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20144
    return-object p0
.end method

.method public clearMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20327
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20328
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20329
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20331
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->clear()Lcom/google/protobuf/SingleFieldBuilder;

    .line 20333
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20334
    return-object p0
.end method

.method public clearStringValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20236
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20237
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getStringValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20238
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20239
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessage$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 19872
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->create()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->clone()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 19806
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    .locals 1

    .line 19881
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 19877
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$26700()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getDoubleValue()D
    .locals 2

    .line 20158
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->doubleValue_:D

    return-wide v0
.end method

.method public getFloatValue()F
    .locals 1

    .line 20382
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->floatValue_:F

    return v0
.end method

.method public getIntValue()I
    .locals 1

    .line 20094
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->intValue_:I

    return v0
.end method

.method public getIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;
    .locals 1

    .line 20416
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20417
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0

    .line 20419
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public getIntegerMapValueBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;
    .locals 2

    .line 20488
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20489
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20490
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getIntegerMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    return-object v0
.end method

.method public getIntegerMapValueOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;
    .locals 1

    .line 20496
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 20497
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMapOrBuilder;

    return-object v0

    .line 20499
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 4

    .line 20018
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20019
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 20020
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 20022
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 20023
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20024
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20026
    :cond_0
    return-object v3

    .line 20028
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getKeyBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 20036
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20037
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 20038
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 20039
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 20041
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20042
    return-object v2

    .line 20044
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public getLongValue()J
    .locals 2

    .line 20126
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->longValue_:J

    return-wide v0
.end method

.method public getMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;
    .locals 1

    .line 20268
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20269
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0

    .line 20271
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessage()Lcom/google/protobuf/GeneratedMessage;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public getMapValueBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;
    .locals 2

    .line 20340
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20341
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20342
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->getMapValueFieldBuilder()Lcom/google/protobuf/SingleFieldBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getBuilder()Lcom/google/protobuf/GeneratedMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    return-object v0
.end method

.method public getMapValueOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;
    .locals 1

    .line 20348
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-eqz v0, :cond_0

    .line 20349
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilder;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMapOrBuilder;

    return-object v0

    .line 20351
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    return-object v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 4

    .line 20190
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20191
    instance-of v0, v1, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 20192
    move-object v2, v1

    check-cast v2, Lcom/google/protobuf/ByteString;

    .line 20194
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    move-result-object v3

    .line 20195
    invoke-virtual {v2}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20196
    iput-object v3, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20198
    :cond_0
    return-object v3

    .line 20200
    :cond_1
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getStringValueBytes()Lcom/google/protobuf/ByteString;
    .locals 3

    .line 20208
    iget-object v1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20209
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 20210
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    .line 20211
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    move-result-object v2

    .line 20213
    iput-object v2, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20214
    return-object v2

    .line 20216
    :cond_0
    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/ByteString;

    return-object v0
.end method

.method public hasDoubleValue()Z
    .locals 2

    .line 20152
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasFloatValue()Z
    .locals 2

    .line 20376
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasIntValue()Z
    .locals 2

    .line 20088
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasIntegerMapValue()Z
    .locals 2

    .line 20410
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasKey()Z
    .locals 2

    .line 20012
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasLongValue()Z
    .locals 2

    .line 20120
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasMapValue()Z
    .locals 2

    .line 20262
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasStringValue()Z
    .locals 2

    .line 20184
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;
    .locals 3

    .line 19817
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;->access$26800()Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    const-class v1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    const-class v2, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19818
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessage$FieldAccessorTable;

    move-result-object v0

    .line 19817
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 19985
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19806
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19806
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19806
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 19806
    invoke-virtual {p0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19806
    invoke-virtual {p0, p1, p2}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 19992
    const/4 v1, 0x0

    .line 19994
    :try_start_0
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$28300()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 19999
    if-eqz v1, :cond_1

    .line 20000
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    goto :goto_0

    .line 19995
    :catch_0
    move-exception v2

    .line 19996
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-object v1, v0

    .line 19997
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19999
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 20000
    invoke-virtual {p0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 20002
    :cond_0
    throw v3

    .line 20003
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 1

    .line 19942
    instance-of v0, p1, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    if-eqz v0, :cond_0

    .line 19943
    move-object v0, p1

    check-cast v0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    move-result-object v0

    return-object v0

    .line 19945
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 19946
    return-object p0
.end method

.method public mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 19951
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 19952
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasKey()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19953
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19954
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27400(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 19955
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 19957
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasIntValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 19958
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getIntValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->setIntValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19960
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasLongValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19961
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getLongValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->setLongValue(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19963
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasDoubleValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 19964
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getDoubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->setDoubleValue(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19966
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasStringValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 19967
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 19968
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->access$27800(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 19969
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 19971
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasMapValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 19972
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19974
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasFloatValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 19975
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getFloatValue()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->setFloatValue(F)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19977
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->hasIntegerMapValue()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19978
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getIntegerMapValue()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeIntegerMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;

    .line 19980
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessage$Builder;

    .line 19981
    return-object p0
.end method

.method public mergeIntegerMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20456
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 20457
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20458
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 20459
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20460
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    goto :goto_0

    .line 20462
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20464
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_1

    .line 20466
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20468
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20469
    return-object p0
.end method

.method public mergeMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20308
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 20309
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20310
    invoke-static {}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->getDefaultInstance()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 20311
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20312
    invoke-static {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;->newBuilder(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->mergeFrom(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->buildPartial()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    goto :goto_0

    .line 20314
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20316
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_1

    .line 20318
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->mergeFrom(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20320
    :goto_1
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20321
    return-object p0
.end method

.method public setDoubleValue(D)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20164
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20165
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->doubleValue_:D

    .line 20166
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20167
    return-object p0
.end method

.method public setFloatValue(F)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20388
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20389
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->floatValue_:F

    .line 20390
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20391
    return-object p0
.end method

.method public setIntValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20100
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20101
    iput p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->intValue_:I

    .line 20102
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20103
    return-object p0
.end method

.method public setIntegerMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20443
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20444
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20445
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20447
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20449
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20450
    return-object p0
.end method

.method public setIntegerMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20426
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 20427
    if-nez p1, :cond_0

    .line 20428
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20430
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$IntegerMapMap;

    .line 20431
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20433
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->integerMapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20435
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20436
    return-object p0
.end method

.method public setKey(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20052
    if-nez p1, :cond_0

    .line 20053
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20055
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20056
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20057
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20058
    return-object p0
.end method

.method public setKeyBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20074
    if-nez p1, :cond_0

    .line 20075
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20077
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20078
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->key_:Ljava/lang/Object;

    .line 20079
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20080
    return-object p0
.end method

.method public setLongValue(J)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20132
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20133
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->longValue_:J

    .line 20134
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20135
    return-object p0
.end method

.method public setMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20295
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_0

    .line 20296
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20297
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20299
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap$Builder;->build()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20301
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20302
    return-object p0
.end method

.method public setMapValue(Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20278
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    if-nez v0, :cond_1

    .line 20279
    if-nez p1, :cond_0

    .line 20280
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20282
    :cond_0
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValue_:Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapMap;

    .line 20283
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    goto :goto_0

    .line 20285
    :cond_1
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->mapValueBuilder_:Lcom/google/protobuf/SingleFieldBuilder;

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilder;->setMessage(Lcom/google/protobuf/GeneratedMessage;)Lcom/google/protobuf/SingleFieldBuilder;

    .line 20287
    :goto_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20288
    return-object p0
.end method

.method public setStringValue(Ljava/lang/String;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20224
    if-nez p1, :cond_0

    .line 20225
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20227
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20228
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20229
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20230
    return-object p0
.end method

.method public setStringValueBytes(Lcom/google/protobuf/ByteString;)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;
    .locals 2

    .line 20246
    if-nez p1, :cond_0

    .line 20247
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 20249
    :cond_0
    iget v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->bitField0_:I

    .line 20250
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->stringValue_:Ljava/lang/Object;

    .line 20251
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$StringMapEntry$Builder;->onChanged()V

    .line 20252
    return-object p0
.end method
