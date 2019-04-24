.class public final Lcom/google/protobuf/UInt32Value$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/UInt32ValueOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/UInt32Value;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<Lcom/google/protobuf/UInt32Value$Builder;>;Lcom/google/protobuf/UInt32ValueOrBuilder;"
    }
.end annotation


# instance fields
.field private value_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 276
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 277
    invoke-direct {p0}, Lcom/google/protobuf/UInt32Value$Builder;->maybeForceBuilderInitialization()V

    .line 278
    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 282
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 283
    invoke-direct {p0}, Lcom/google/protobuf/UInt32Value$Builder;->maybeForceBuilderInitialization()V

    .line 284
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/google/protobuf/UInt32Value$1;)V
    .locals 0

    .line 259
    invoke-direct {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/UInt32Value$1;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Lcom/google/protobuf/UInt32Value$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 265
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt32Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 286
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 289
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 345
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->build()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->build()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/protobuf/UInt32Value;
    .locals 2

    .line 307
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->buildPartial()Lcom/google/protobuf/UInt32Value;

    move-result-object v1

    .line 308
    invoke-virtual {v1}, Lcom/google/protobuf/UInt32Value;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    .line 309
    invoke-static {v1}, Lcom/google/protobuf/UInt32Value$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0

    .line 311
    :cond_0
    return-object v1
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->buildPartial()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->buildPartial()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/google/protobuf/UInt32Value;
    .locals 2

    .line 315
    new-instance v1, Lcom/google/protobuf/UInt32Value;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/google/protobuf/UInt32Value;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/google/protobuf/UInt32Value$1;)V

    .line 316
    iget v0, p0, Lcom/google/protobuf/UInt32Value$Builder;->value_:I

    invoke-static {v1, v0}, Lcom/google/protobuf/UInt32Value;->access$302(Lcom/google/protobuf/UInt32Value;I)I

    .line 317
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->onBuilt()V

    .line 318
    return-object v1
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clear()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clear()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clear()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clear()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 291
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 292
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/UInt32Value$Builder;->value_:I

    .line 294
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 331
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 335
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public clearValue()Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 421
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/UInt32Value$Builder;->value_:I

    .line 422
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->onChanged()V

    .line 423
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 322
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->clone()Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 259
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->getDefaultInstanceForType()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/google/protobuf/UInt32Value;
    .locals 1

    .line 303
    invoke-static {}, Lcom/google/protobuf/UInt32Value;->getDefaultInstance()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 299
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt32Value_descriptor:Lcom/google/protobuf/Descriptors$Descriptor;

    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 397
    iget v0, p0, Lcom/google/protobuf/UInt32Value$Builder;->value_:I

    return v0
.end method

.method protected internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 270
    sget-object v0, Lcom/google/protobuf/WrappersProto;->internal_static_google_protobuf_UInt32Value_fieldAccessorTable:Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    const-class v1, Lcom/google/protobuf/UInt32Value;

    const-class v2, Lcom/google/protobuf/UInt32Value$Builder;

    .line 271
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    move-result-object v0

    .line 270
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 367
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

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt32Value$Builder;

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

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt32Value$Builder;

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

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt32Value$Builder;

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

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 374
    const/4 v1, 0x0

    .line 376
    :try_start_0
    invoke-static {}, Lcom/google/protobuf/UInt32Value;->access$400()Lcom/google/protobuf/Parser;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 381
    if-eqz v1, :cond_1

    .line 382
    invoke-virtual {p0, v1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt32Value;)Lcom/google/protobuf/UInt32Value$Builder;

    goto :goto_0

    .line 377
    :catch_0
    move-exception v2

    .line 378
    :try_start_1
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value;

    move-object v1, v0

    .line 379
    invoke-virtual {v2}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 381
    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    .line 382
    invoke-virtual {p0, v1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt32Value;)Lcom/google/protobuf/UInt32Value$Builder;

    :cond_0
    throw v3

    .line 385
    :cond_1
    :goto_0
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 348
    instance-of v0, p1, Lcom/google/protobuf/UInt32Value;

    if-eqz v0, :cond_0

    .line 349
    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/UInt32Value;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/UInt32Value$Builder;->mergeFrom(Lcom/google/protobuf/UInt32Value;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0

    .line 351
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 352
    return-object p0
.end method

.method public mergeFrom(Lcom/google/protobuf/UInt32Value;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 357
    invoke-static {}, Lcom/google/protobuf/UInt32Value;->getDefaultInstance()Lcom/google/protobuf/UInt32Value;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 358
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/UInt32Value;->getValue()I

    move-result v0

    if-eqz v0, :cond_1

    .line 359
    invoke-virtual {p1}, Lcom/google/protobuf/UInt32Value;->getValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/UInt32Value$Builder;->setValue(I)Lcom/google/protobuf/UInt32Value$Builder;

    .line 361
    :cond_1
    iget-object v0, p1, Lcom/google/protobuf/UInt32Value;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    invoke-virtual {p0, v0}, Lcom/google/protobuf/UInt32Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    .line 362
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->onChanged()V

    .line 363
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 432
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/UInt32Value$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 327
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/UInt32Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/UInt32Value$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 340
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 259
    invoke-virtual {p0, p1}, Lcom/google/protobuf/UInt32Value$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;

    move-result-object v0

    return-object v0
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 1

    .line 427
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFieldsProto3(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/UInt32Value$Builder;

    return-object v0
.end method

.method public setValue(I)Lcom/google/protobuf/UInt32Value$Builder;
    .locals 0

    .line 408
    iput p1, p0, Lcom/google/protobuf/UInt32Value$Builder;->value_:I

    .line 409
    invoke-virtual {p0}, Lcom/google/protobuf/UInt32Value$Builder;->onChanged()V

    .line 410
    return-object p0
.end method
