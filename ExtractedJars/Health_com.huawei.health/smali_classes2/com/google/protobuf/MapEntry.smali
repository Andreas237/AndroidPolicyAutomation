.class public final Lcom/google/protobuf/MapEntry;
.super Lcom/google/protobuf/AbstractMessage;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/MapEntry$Builder;,
        Lcom/google/protobuf/MapEntry$Metadata;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lcom/google/protobuf/AbstractMessage;"
    }
.end annotation


# instance fields
.field private volatile cachedSerializedSize:I

.field private final key:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field private final metadata:Lcom/google/protobuf/MapEntry$Metadata;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/MapEntry$Metadata<TK;TV;>;"
        }
    .end annotation
.end field

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/WireFormat$FieldType;TK;Lcom/google/protobuf/WireFormat$FieldType;TV;)V"
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage;-><init>()V

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    .line 85
    iput-object p3, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    .line 86
    iput-object p5, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    .line 87
    new-instance v0, Lcom/google/protobuf/MapEntry$Metadata;

    invoke-direct {v0, p1, p0, p2, p4}, Lcom/google/protobuf/MapEntry$Metadata;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/MapEntry;Lcom/google/protobuf/WireFormat$FieldType;Lcom/google/protobuf/WireFormat$FieldType;)V

    iput-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    .line 88
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapEntry$Metadata<TK;TV;>;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 103
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage;-><init>()V

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    .line 105
    :try_start_0
    iput-object p1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    .line 106
    invoke-static {p2, p1, p3}, Lcom/google/protobuf/MapEntryLite;->parseEntry(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/MapEntryLite$Metadata;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/util/Map$Entry;

    move-result-object v1

    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    .line 108
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 113
    goto :goto_0

    .line 109
    :catch_0
    move-exception v1

    .line 110
    invoke-virtual {v1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 111
    :catch_1
    move-exception v1

    .line 112
    new-instance v0, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {v0, v1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    invoke-virtual {v0, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    .line 114
    :goto_0
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/google/protobuf/MapEntry$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/MapEntry$Metadata;TK;TV;)V"
        }
    .end annotation

    .line 92
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage;-><init>()V

    .line 138
    const/4 v0, -0x1

    iput v0, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    .line 93
    iput-object p2, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    .line 94
    iput-object p3, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    .line 95
    iput-object p1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    .line 96
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;Lcom/google/protobuf/MapEntry$1;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/google/protobuf/MapEntry;)Ljava/lang/Object;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$100(Lcom/google/protobuf/MapEntry;)Ljava/lang/Object;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$600(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;)Z
    .locals 1

    .line 50
    invoke-static {p0, p1}, Lcom/google/protobuf/MapEntry;->isInitialized(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V
    .locals 3

    .line 198
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, v1, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    if-eq v0, v1, :cond_0

    .line 199
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong FieldDescriptor \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 200
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" used in message \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, v2, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    .line 201
    invoke-virtual {v2}, Lcom/google/protobuf/Descriptors$Descriptor;->getFullName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_0
    return-void
.end method

.method private static isInitialized(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/MapEntry$Metadata;TV;)Z"
        }
    .end annotation

    .line 453
    iget-object v0, p0, Lcom/google/protobuf/MapEntry$Metadata;->valueType:Lcom/google/protobuf/WireFormat$FieldType;

    invoke-virtual {v0}, Lcom/google/protobuf/WireFormat$FieldType;->getJavaType()Lcom/google/protobuf/WireFormat$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/WireFormat$JavaType;->MESSAGE:Lcom/google/protobuf/WireFormat$JavaType;

    if-ne v0, v1, :cond_0

    .line 454
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/MessageLite;

    invoke-interface {v0}, Lcom/google/protobuf/MessageLite;->isInitialized()Z

    move-result v0

    return v0

    .line 456
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static newDefaultInstance(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)Lcom/google/protobuf/MapEntry;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/WireFormat$FieldType;TK;Lcom/google/protobuf/WireFormat$FieldType;TV;)Lcom/google/protobuf/MapEntry<TK;TV;>;"
        }
    .end annotation

    .line 126
    new-instance v0, Lcom/google/protobuf/MapEntry;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/Descriptors$Descriptor;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;Lcom/google/protobuf/WireFormat$FieldType;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public getAllFields()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 188
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 189
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 190
    invoke-virtual {p0, v3}, Lcom/google/protobuf/MapEntry;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    invoke-virtual {p0, v3}, Lcom/google/protobuf/MapEntry;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    :cond_0
    goto :goto_0

    .line 194
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry<TK;TV;>;"
        }
    .end annotation

    .line 178
    new-instance v0, Lcom/google/protobuf/MapEntry;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, v2, Lcom/google/protobuf/MapEntry$Metadata;->defaultKey:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v3, v3, Lcom/google/protobuf/MapEntry$Metadata;->defaultValue:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/MapEntry;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->getDefaultInstanceForType()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 3

    .line 214
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 215
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getNumber()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->getKey()Ljava/lang/Object;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 217
    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getType()Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;->ENUM:Lcom/google/protobuf/Descriptors$FieldDescriptor$Type;

    if-ne v0, v1, :cond_1

    .line 218
    invoke-virtual {p1}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getEnumType()Lcom/google/protobuf/Descriptors$EnumDescriptor;

    move-result-object v0

    move-object v1, v2

    check-cast v1, Ljava/lang/Integer;

    .line 219
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 218
    invoke-virtual {v0, v1}, Lcom/google/protobuf/Descriptors$EnumDescriptor;->findValueByNumberCreatingIfUnknown(I)Lcom/google/protobuf/Descriptors$EnumValueDescriptor;

    move-result-object v2

    .line 221
    :cond_1
    return-object v2
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    return-object v0
.end method

.method final getMetadata()Lcom/google/protobuf/MapEntry$Metadata;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Metadata<TK;TV;>;"
        }
    .end annotation

    .line 461
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<Lcom/google/protobuf/MapEntry<TK;TV;>;>;"
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v0, v0, Lcom/google/protobuf/MapEntry$Metadata;->parser:Lcom/google/protobuf/Parser;

    return-object v0
.end method

.method public getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;
    .locals 2

    .line 232
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I
    .locals 2

    .line 226
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "There is no repeated field in a map entry message."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 142
    iget v0, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 143
    iget v0, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    return v0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/google/protobuf/MapEntryLite;->computeSerializedSize(Lcom/google/protobuf/MapEntryLite$Metadata;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    .line 147
    iput v3, p0, Lcom/google/protobuf/MapEntry;->cachedSerializedSize:I

    .line 148
    return v3
.end method

.method public getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 238
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 135
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 1

    .line 207
    invoke-direct {p0, p1}, Lcom/google/protobuf/MapEntry;->checkFieldDescriptor(Lcom/google/protobuf/Descriptors$FieldDescriptor;)V

    .line 209
    const/4 v0, 0x1

    return v0
.end method

.method public isInitialized()Z
    .locals 2

    .line 158
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/google/protobuf/MapEntry;->isInitialized(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 168
    new-instance v0, Lcom/google/protobuf/MapEntry$Builder;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Lcom/google/protobuf/MapEntry$1;)V

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/google/protobuf/MapEntry$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/MapEntry$Builder<TK;TV;>;"
        }
    .end annotation

    .line 173
    new-instance v0, Lcom/google/protobuf/MapEntry$Builder;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/google/protobuf/MapEntry$Builder;-><init>(Lcom/google/protobuf/MapEntry$Metadata;Ljava/lang/Object;Ljava/lang/Object;ZZLcom/google/protobuf/MapEntry$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->toBuilder()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/google/protobuf/MapEntry;->toBuilder()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/google/protobuf/MapEntry;->metadata:Lcom/google/protobuf/MapEntry$Metadata;

    iget-object v1, p0, Lcom/google/protobuf/MapEntry;->key:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/protobuf/MapEntry;->value:Ljava/lang/Object;

    invoke-static {p1, v0, v1, v2}, Lcom/google/protobuf/MapEntryLite;->writeTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapEntryLite$Metadata;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    return-void
.end method
