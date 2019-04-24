.class public final Lcom/google/protobuf/UInt64Value$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/UInt64ValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/UInt64Value;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/UInt64Value$Builder;>;Lcom/google/protobuf/UInt64ValueOrBuilder;"
    }
.end annotation


# instance fields
.field private value_:J


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 277
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 278
    invoke-direct {p0}, Lcom/google/protobuf/UInt64Value$Builder;->maybeForceBuilderInitialization()V

    .line 279
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 283
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 284
    invoke-direct {p0}, Lcom/google/protobuf/UInt64Value$Builder;->maybeForceBuilderInitialization()V

    .line 285
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/UInt64Value$1;)V
    .locals 0

    .line 260
    invoke-direct {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/UInt64Value$1;)V
    .locals 0

    .line 260
    invoke-direct {p0}, Lcom/google/protobuf/UInt64Value$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 266
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt64Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 287
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 290
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 346
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->build()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->build()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/UInt64Value;
    .locals 2

    .line 308
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->buildPartial()Lcom/google/protobuf/UInt64Value;

    move-result-object v1

    .line 309
    invoke-virtual {v1}, Lcom/google/protobuf/UInt64Value;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 310
    invoke-static {v1}, Lcom/google/protobuf/UInt64Value$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 312
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->buildPartial()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->buildPartial()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/UInt64Value;
    .locals 3

    .line 316
    new-instance v2, Lcom/google/protobuf/UInt64Value;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Lcom/google/protobuf/UInt64Value;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/UInt64Value$1;)V

    .line 317
    iget-wide v0, p0, Lcom/google/protobuf/UInt64Value$Builder;->value_:J

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/UInt64Value;->access$302(Lcom/google/protobuf/UInt64Value;J)J

    .line 318
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->onBuilt()V

    .line 319
    return-object v2
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clear()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clear()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clear()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clear()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/UInt64Value$Builder;
    .locals 2

    .line 292
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 293
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/protobuf/UInt64Value$Builder;->value_:J

    .line 295
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 332
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 336
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public clearValue()Lcom/google/protobuf/UInt64Value$Builder;
    .locals 2

    .line 422
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/protobuf/UInt64Value$Builder;->value_:J

    .line 423
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->onChanged()V

    .line 424
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 323
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->clone()Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 260
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/UInt64Value;
    .locals 1

    .line 304
    invoke-static {}, Lcom/google/protobuf/UInt64Value;->getDefaultInstance()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 300
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt64Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getValue()J
    .locals 2

    .line 398
    iget-wide v0, p0, Lcom/google/protobuf/UInt64Value$Builder;->value_:J

    return-wide v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 271
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt64Value_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/UInt64Value;

    const-class v2, Lcom/google/protobuf/UInt64Value$Builder;

    .line 272
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 271
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 368
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

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt64Value$Builder;

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

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt64Value$Builder;

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

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt64Value$Builder;

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

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 375
    const/4 v1, 0x0

    .line 377
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/UInt64Value;->access$400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 382
    if-eqz v1, :cond_1

    .line 383
    invoke-virtual {p0, v1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt64Value;)Lcom/google/protobuf/UInt64Value$Builder;

    goto :goto_0

    .line 378
    :catch_0
    move-exception v2

    .line 379
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value;

    move-object v1, v0

    .line 380
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 382
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 383
    invoke-virtual {p0, v1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt64Value;)Lcom/google/protobuf/UInt64Value$Builder;

    :cond_0
    throw v3

    .line 386
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 349
    instance-of v0, p1, Lcom/google/protobuf/UInt64Value;

    if-eqz v0, :cond_0

    .line 350
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/UInt64Value;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/UInt64Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt64Value;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0

    .line 352
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 353
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/UInt64Value;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 4

    .line 358
    invoke-static {}, Lcom/google/protobuf/UInt64Value;->getDefaultInstance()Lcom/google/protobuf/UInt64Value;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 359
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/UInt64Value;->getValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 360
    invoke-virtual {p1}, Lcom/google/protobuf/UInt64Value;->getValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/UInt64Value$Builder;->setValue(J)Lcom/google/protobuf/UInt64Value$Builder;

    .line 362
    :cond_1
    iget-object v0, p1, Lcom/google/protobuf/UInt64Value;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/UInt64Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    .line 363
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->onChanged()V

    .line 364
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 433
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt64Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 328
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/UInt64Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/UInt64Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 341
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 260
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt64Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 1

    .line 428
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt64Value$Builder;

    return-object v0
.end method

.method public setValue(J)Lcom/google/protobuf/UInt64Value$Builder;
    .locals 0

    .line 409
    iput-wide p1, p0, Lcom/google/protobuf/UInt64Value$Builder;->value_:J

    .line 410
    invoke-virtual {p0}, Lcom/google/protobuf/UInt64Value$Builder;->onChanged()V

    .line 411
    return-object p0
.end method
