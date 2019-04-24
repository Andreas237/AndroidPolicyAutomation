.class public abstract Lcom/google/protobuf/GeneratedMessageV3;
.super Lcom/google/protobuf/AbstractMessage;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;,
        Lcom/google/protobuf/GeneratedMessageV3$ExtensionDescriptorRetriever;,
        Lcom/google/protobuf/GeneratedMessageV3$ExtendableBuilder;,
        Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage;,
        Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessageOrBuilder;,
        Lcom/google/protobuf/GeneratedMessageV3$Builder;,
        Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;
    }
.end annotation


# static fields
.field public static alwaysUseFieldBuilders:Z = false

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public unknownFields:Lcom/google/protobuf/UnknownFieldSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 83
    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .line 88
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage;-><init>()V

    .line 89
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 90
    return-void
.end method

.method protected constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/google/protobuf/GeneratedMessageV3$Builder<*>;)V"
        }
    .end annotation

    .line 92
    invoke-direct {p0}, Lcom/google/protobuf/AbstractMessage;-><init>()V

    .line 93
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    move-result-object v0

    iput-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 94
    return-void
.end method

.method static synthetic access$1000(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 1

    .line 74
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3;->getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1100(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 74
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3;->invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;
    .locals 1

    .line 74
    invoke-static {p0}, Lcom/google/protobuf/GeneratedMessageV3;->checkNotLite(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$800(Lcom/google/protobuf/GeneratedMessageV3;Z)Ljava/util/Map;
    .locals 1

    .line 74
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->getAllFieldsMutable(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected static canUseUnsafe()Z
    .locals 1

    .line 363
    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->hasUnsafeArrayOperations()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/UnsafeUtil;->hasUnsafeByteBufferOperations()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static checkNotLite(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/Extension;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:Lcom/google/protobuf/GeneratedMessageV3$ExtendableMessage<TMessageType;>;T:Ljava/lang/Object;>(Lcom/google/protobuf/ExtensionLite<TMessageType;TT;>;)Lcom/google/protobuf/Extension<TMessageType;TT;>;"
        }
    .end annotation

    .line 2693
    invoke-virtual {p0}, Lcom/google/protobuf/ExtensionLite;->isLite()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2694
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Expected non-lite extension."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2697
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/Extension;

    return-object v0
.end method

.method protected static computeStringSize(ILjava/lang/Object;)I
    .locals 1

    .line 2701
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2702
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/google/protobuf/CodedOutputStream;->computeStringSize(ILjava/lang/String;)I

    move-result v0

    return v0

    .line 2704
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {p0, v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSize(ILcom/google/protobuf/ByteString;)I

    move-result v0

    return v0
.end method

.method protected static computeStringSizeNoTag(Ljava/lang/Object;)I
    .locals 1

    .line 2709
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2710
    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeStringSizeNoTag(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 2712
    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-static {v0}, Lcom/google/protobuf/CodedOutputStream;->computeBytesSizeNoTag(Lcom/google/protobuf/ByteString;)I

    move-result v0

    return v0
.end method

.method static enableAlwaysUseFieldBuildersForTesting()V
    .locals 1

    .line 109
    const/4 v0, 0x1

    sput-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 110
    return-void
.end method

.method private getAllFieldsMutable(Z)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 133
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 135
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$000(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;)Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v3

    .line 136
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$Descriptor;->getFields()Ljava/util/List;

    move-result-object v4

    .line 138
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_6

    .line 139
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 140
    invoke-virtual {v6}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getContainingOneof()Lcom/google/protobuf/Descriptors$OneofDescriptor;

    move-result-object v7

    .line 146
    if-eqz v7, :cond_1

    .line 148
    invoke-virtual {v7}, Lcom/google/protobuf/Descriptors$OneofDescriptor;->getFieldCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int/2addr v5, v0

    .line 149
    invoke-virtual {p0, v7}, Lcom/google/protobuf/GeneratedMessageV3;->hasOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    goto :goto_2

    .line 154
    :cond_0
    invoke-virtual {p0, v7}, Lcom/google/protobuf/GeneratedMessageV3;->getOneofFieldDescriptor(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v6

    goto :goto_1

    .line 157
    :cond_1
    invoke-virtual {v6}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 158
    invoke-virtual {p0, v6}, Lcom/google/protobuf/GeneratedMessageV3;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 159
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 160
    invoke-virtual {v2, v6, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 164
    :cond_2
    invoke-virtual {p0, v6}, Lcom/google/protobuf/GeneratedMessageV3;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 165
    goto :goto_2

    .line 169
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {v6}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->STRING:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_4

    .line 170
    invoke-virtual {p0, v6}, Lcom/google/protobuf/GeneratedMessageV3;->getFieldRaw(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 172
    :cond_4
    invoke-virtual {p0, v6}, Lcom/google/protobuf/GeneratedMessageV3;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    :cond_5
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 175
    :cond_6
    return-object v2
.end method

.method private static varargs getMethodOrDie(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1643
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1644
    :catch_0
    move-exception v3

    .line 1645
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Generated message class \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1646
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" missing method \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\"."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static varargs invokeOrDie(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1655
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 1656
    :catch_0
    move-exception v2

    .line 1657
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {v0, v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 1660
    :catch_1
    move-exception v2

    .line 1661
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    .line 1662
    instance-of v0, v3, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    .line 1663
    move-object v0, v3

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 1664
    :cond_0
    instance-of v0, v3, Ljava/lang/Error;

    if-eqz v0, :cond_1

    .line 1665
    move-object v0, v3

    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 1667
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected exception thrown by generated accessor method."

    invoke-direct {v0, v1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static maybeSerializeBooleanEntryTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;IZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map<Ljava/lang/Boolean;TV;>;Lcom/google/protobuf/MapEntry<Ljava/lang/Boolean;TV;>;IZ)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2836
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2837
    .line 2838
    invoke-virtual {p2}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2839
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2840
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2841
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    .line 2837
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 2843
    :cond_0
    return-void
.end method

.method public static parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Ljava/io/InputStream;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 347
    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 348
    :catch_0
    move-exception v1

    .line 349
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public static parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 356
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/Parser;->parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 357
    :catch_0
    move-exception v1

    .line 358
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Lcom/google/protobuf/CodedInputStream;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 329
    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 330
    :catch_0
    move-exception v1

    .line 331
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 338
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 339
    :catch_0
    move-exception v1

    .line 340
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Ljava/io/InputStream;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 311
    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 312
    :catch_0
    move-exception v1

    .line 313
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public static parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M::Lcom/google/protobuf/Message;>(Lcom/google/protobuf/Parser<TM;>;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)TM;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 320
    :try_start_0
    invoke-interface {p0, p1, p2}, Lcom/google/protobuf/Parser;->parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 321
    :catch_0
    move-exception v1

    .line 322
    invoke-virtual {v1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method protected static serializeBooleanMapTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField;Lcom/google/protobuf/MapEntry;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField<Ljava/lang/Boolean;TV;>;Lcom/google/protobuf/MapEntry<Ljava/lang/Boolean;TV;>;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2820
    invoke-virtual {p1}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v1

    .line 2821
    invoke-virtual {p0}, Lcom/google/protobuf/CodedOutputStream;->isSerializationDeterministic()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2822
    invoke-static {p0, v1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3;->serializeMapTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;I)V

    .line 2823
    return-void

    .line 2825
    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, v1, p2, p3, v0}, Lcom/google/protobuf/GeneratedMessageV3;->maybeSerializeBooleanEntryTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;IZ)V

    .line 2826
    const/4 v0, 0x1

    invoke-static {p0, v1, p2, p3, v0}, Lcom/google/protobuf/GeneratedMessageV3;->maybeSerializeBooleanEntryTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;IZ)V

    .line 2827
    return-void
.end method

.method protected static serializeIntegerMapTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField;Lcom/google/protobuf/MapEntry;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField<Ljava/lang/Integer;TV;>;Lcom/google/protobuf/MapEntry<Ljava/lang/Integer;TV;>;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2739
    invoke-virtual {p1}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v2

    .line 2740
    invoke-virtual {p0}, Lcom/google/protobuf/CodedOutputStream;->isSerializationDeterministic()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2741
    invoke-static {p0, v2, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3;->serializeMapTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;I)V

    .line 2742
    return-void

    .line 2746
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v3, v0, [I

    .line 2747
    const/4 v4, 0x0

    .line 2748
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 2749
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    aput v6, v3, v0

    .line 2750
    goto :goto_0

    .line 2751
    :cond_1
    invoke-static {v3}, Ljava/util/Arrays;->sort([I)V

    .line 2752
    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    aget v8, v5, v7

    .line 2753
    .line 2754
    invoke-virtual {p2}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2755
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2756
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2757
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    .line 2753
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 2752
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 2759
    :cond_2
    return-void
.end method

.method protected static serializeLongMapTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField;Lcom/google/protobuf/MapEntry;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField<Ljava/lang/Long;TV;>;Lcom/google/protobuf/MapEntry<Ljava/lang/Long;TV;>;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2767
    invoke-virtual {p1}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v2

    .line 2768
    invoke-virtual {p0}, Lcom/google/protobuf/CodedOutputStream;->isSerializationDeterministic()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2769
    invoke-static {p0, v2, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3;->serializeMapTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;I)V

    .line 2770
    return-void

    .line 2773
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v3, v0, [J

    .line 2774
    const/4 v4, 0x0

    .line 2775
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 2776
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    aput-wide v6, v3, v0

    .line 2777
    goto :goto_0

    .line 2778
    :cond_1
    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    .line 2779
    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_2

    aget-wide v8, v5, v7

    .line 2780
    .line 2781
    invoke-virtual {p2}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2782
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2783
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2784
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    .line 2780
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 2779
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 2786
    :cond_2
    return-void
.end method

.method private static serializeMapTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map<TK;TV;>;Lcom/google/protobuf/MapEntry<TK;TV;>;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2852
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 2853
    .line 2854
    invoke-virtual {p2}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2855
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2856
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2857
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    .line 2853
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 2858
    goto :goto_0

    .line 2859
    :cond_0
    return-void
.end method

.method protected static serializeStringMapTo(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField;Lcom/google/protobuf/MapEntry;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:Ljava/lang/Object;>(Lcom/google/protobuf/CodedOutputStream;Lcom/google/protobuf/MapField<Ljava/lang/String;TV;>;Lcom/google/protobuf/MapEntry<Ljava/lang/String;TV;>;I)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2794
    invoke-virtual {p1}, Lcom/google/protobuf/MapField;->getMap()Ljava/util/Map;

    move-result-object v2

    .line 2795
    invoke-virtual {p0}, Lcom/google/protobuf/CodedOutputStream;->isSerializationDeterministic()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2796
    invoke-static {p0, v2, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3;->serializeMapTo(Lcom/google/protobuf/CodedOutputStream;Ljava/util/Map;Lcom/google/protobuf/MapEntry;I)V

    .line 2797
    return-void

    .line 2802
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 2803
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    .line 2804
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 2805
    move-object v4, v3

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    .line 2806
    .line 2807
    invoke-virtual {p2}, Lcom/google/protobuf/MapEntry;->newBuilderForType()Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2808
    invoke-virtual {v0, v7}, Lcom/google/protobuf/MapEntry$Builder;->setKey(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2809
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/MapEntry$Builder;->setValue(Ljava/lang/Object;)Lcom/google/protobuf/MapEntry$Builder;

    move-result-object v0

    .line 2810
    invoke-virtual {v0}, Lcom/google/protobuf/MapEntry$Builder;->build()Lcom/google/protobuf/MapEntry;

    move-result-object v0

    .line 2806
    invoke-virtual {p0, p3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 2805
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2812
    :cond_1
    return-void
.end method

.method protected static writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2718
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2719
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeString(ILjava/lang/String;)V

    goto :goto_0

    .line 2721
    :cond_0
    move-object v0, p2

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytes(ILcom/google/protobuf/ByteString;)V

    .line 2723
    :goto_0
    return-void
.end method

.method protected static writeStringNoTag(Lcom/google/protobuf/CodedOutputStream;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2727
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2728
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/CodedOutputStream;->writeStringNoTag(Ljava/lang/String;)V

    goto :goto_0

    .line 2730
    :cond_0
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/ByteString;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBytesNoTag(Lcom/google/protobuf/ByteString;)V

    .line 2732
    :goto_0
    return-void
.end method


# virtual methods
.method public getAllFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 210
    .line 211
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageV3;->getAllFieldsMutable(Z)Ljava/util/Map;

    move-result-object v0

    .line 210
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method getAllFieldsRaw()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 225
    .line 226
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/protobuf/GeneratedMessageV3;->getAllFieldsMutable(Z)Ljava/util/Map;

    move-result-object v0

    .line 225
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 121
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$000(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;)Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    return-object v0
.end method

.method public getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 1

    .line 246
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$200(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;->get(Lcom/google/protobuf/GeneratedMessageV3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method getFieldRaw(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;
    .locals 1

    .line 258
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$200(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;->getRaw(Lcom/google/protobuf/GeneratedMessageV3;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getOneofFieldDescriptor(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Descriptors$FieldDescriptor;
    .locals 1

    .line 236
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$100(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$OneofAccessor;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$OneofAccessor;->get(Lcom/google/protobuf/GeneratedMessageV3;)Lcom/google/protobuf/Descriptors$FieldDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/google/protobuf/Parser<+Lcom/google/protobuf/GeneratedMessageV3;>;"
        }
    .end annotation

    .line 98
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;I)Ljava/lang/Object;
    .locals 1

    .line 269
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$200(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    .line 270
    invoke-interface {v0, p0, p2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;->getRepeated(Lcom/google/protobuf/GeneratedMessageV3;I)Ljava/lang/Object;

    move-result-object v0

    .line 269
    return-object v0
.end method

.method public getRepeatedFieldCount(Lcom/google/protobuf/Descriptors$FieldDescriptor;)I
    .locals 1

    .line 263
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$200(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    .line 264
    invoke-interface {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;->getRepeatedCount(Lcom/google/protobuf/GeneratedMessageV3;)I

    move-result v0

    .line 263
    return v0
.end method

.method public getSerializedSize()I
    .locals 2

    .line 373
    iget v1, p0, Lcom/google/protobuf/GeneratedMessageV3;->memoizedSize:I

    .line 374
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 375
    return v1

    .line 378
    .line 379
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getAllFieldsRaw()Ljava/util/Map;

    move-result-object v0

    .line 378
    invoke-static {p0, v0}, Lcom/google/protobuf/MessageReflection;->getSerializedSize(Lcom/google/protobuf/Message;Ljava/util/Map;)I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->memoizedSize:I

    .line 380
    iget v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->memoizedSize:I

    return v0
.end method

.method public getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 2

    .line 275
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z
    .locals 1

    .line 241
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$200(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$FieldAccessor;->has(Lcom/google/protobuf/GeneratedMessageV3;)Z

    move-result v0

    return v0
.end method

.method public hasOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Z
    .locals 1

    .line 231
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->access$100(Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$OneofAccessor;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable$OneofAccessor;->has(Lcom/google/protobuf/GeneratedMessageV3;)Z

    move-result v0

    return v0
.end method

.method protected abstract internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
.end method

.method protected internalGetMapField(I)Lcom/google/protobuf/MapField;
    .locals 3

    .line 1688
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No map fields found in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1689
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isInitialized()Z
    .locals 7

    .line 180
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/Descriptors$Descriptor;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/protobuf/Descriptors$FieldDescriptor;

    .line 182
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRequired()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessageV3;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    const/4 v0, 0x0

    return v0

    .line 188
    :cond_0
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->getJavaType()Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;->MESSAGE:Lcom/google/protobuf/Descriptors$FieldDescriptor$JavaType;

    if-ne v0, v1, :cond_4

    .line 189
    invoke-virtual {v3}, Lcom/google/protobuf/Descriptors$FieldDescriptor;->isRepeated()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessageV3;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 192
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/google/protobuf/Message;

    .line 193
    invoke-interface {v6}, Lcom/google/protobuf/Message;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_1
    goto :goto_1

    .line 197
    :cond_2
    goto :goto_2

    .line 198
    :cond_3
    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessageV3;->hasField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, v3}, Lcom/google/protobuf/GeneratedMessageV3;->getField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/Message;

    invoke-interface {v0}, Lcom/google/protobuf/Message;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_4

    .line 199
    const/4 v0, 0x0

    return v0

    .line 203
    :cond_4
    :goto_2
    goto/16 :goto_0

    .line 205
    :cond_5
    const/4 v0, 0x1

    return v0
.end method

.method protected makeExtensionsImmutable()V
    .locals 0

    .line 390
    return-void
.end method

.method protected newBuilderForType(Lcom/google/protobuf/AbstractMessage$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 407
    new-instance v0, Lcom/google/protobuf/GeneratedMessageV3$1;

    invoke-direct {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$1;-><init>(Lcom/google/protobuf/GeneratedMessageV3;Lcom/google/protobuf/AbstractMessage$BuilderParent;)V

    invoke-virtual {p0, v0}, Lcom/google/protobuf/GeneratedMessageV3;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;

    move-result-object v0

    return-object v0
.end method

.method protected abstract newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
.end method

.method protected parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 290
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->shouldDiscardUnknownFields()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    invoke-virtual {p1, p4}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v0

    return v0

    .line 293
    :cond_0
    invoke-virtual {p2, p4, p1}, Lcom/google/protobuf/UnknownFieldSet$Builder;->mergeFieldFrom(ILcom/google/protobuf/CodedInputStream;)Z

    move-result v0

    return v0
.end method

.method protected parseUnknownFieldProto3(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/UnknownFieldSet$Builder;Lcom/google/protobuf/ExtensionRegistryLite;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 302
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->shouldDiscardUnknownFieldsProto3()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    invoke-virtual {p1, p4}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v0

    return v0

    .line 305
    :cond_0
    invoke-virtual {p2, p4, p1}, Lcom/google/protobuf/UnknownFieldSet$Builder;->mergeFieldFrom(ILcom/google/protobuf/CodedInputStream;)Z

    move-result v0

    return v0
.end method

.method protected writeReplace()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/ObjectStreamException;
        }
    .end annotation

    .line 2683
    new-instance v0, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;

    invoke-direct {v0, p0}, Lcom/google/protobuf/GeneratedMessageLite$SerializedForm;-><init>(Lcom/google/protobuf/MessageLite;)V

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 368
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getAllFieldsRaw()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, p1, v1}, Lcom/google/protobuf/MessageReflection;->writeMessageTo(Lcom/google/protobuf/Message;Ljava/util/Map;Lcom/google/protobuf/CodedOutputStream;Z)V

    .line 369
    return-void
.end method
